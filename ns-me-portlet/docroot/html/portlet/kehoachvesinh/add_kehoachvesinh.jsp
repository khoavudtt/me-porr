<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.user.dao.service.UserMappingLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>
<%@include file="/init.jsp"%>

<%
	String maTinhInit = StringPool.BLANK;
	String maHuyenInit = StringPool.BLANK;
 	String maXaInit = StringPool.BLANK;	
 	long dangKyVSTX = 0;
	long userMappingId = ParamUtil.getLong(request, "userMappingId");
	boolean veSinhToanXa = true;
	
	List<DATAITEM> listTinh = DATAITEMLocalServiceUtil.getByDataGroupLevel1(1);
	
	List<DATAITEM> listHuyen = new ArrayList<DATAITEM>(); 
	
	List<DATAITEM> listXa = new ArrayList<DATAITEM>(); 
	
	UserMapping userMapping = UserMappingLocalServiceUtil.getUserMapping(userMappingId);
	
	int userType = userMapping.getUserType();
	
	maTinhInit = userMapping.getOrgCode1();
	
	if(userType==2){
		listHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinhInit);
	}

%>

<liferay-ui:header
	backURL="<%= redirect %>"
	title="them-ke-hoach-dau-nam"
/>

<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachvesinh/_select_huyen.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="selectXa" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachvesinh/_select_xa.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addKeHoachVeSinh" var="addKeHoachVeSinhURL"/>
<aui:form action="<%=addKeHoachVeSinhURL %>" method="POST" name="fm">
	<aui:input name="redirect" type="hidden" value="<%=StringPool.BLANK %>"></aui:input>
	<aui:input name="userId" type="hidden" value="<%=PortalUtil.getUserId(request) %>"></aui:input>
	<c:if test="<%=!(maTinhInit.equals(StringPool.BLANK))&&(userType==2) %>">
	<aui:input name="maTinh" type="hidden" value="<%=maTinhInit %>"></aui:input>
	</c:if>
	<aui:field-wrapper>
		<aui:row>
			<aui:select 
				name="nam" 
				label="nam-label" 
				id="nam" 
				showEmptyOption="<%= false %>" 
				required="true"
			>
				<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
				<aui:option value="<%=2013 %>">2013</aui:option>
				<aui:option value="<%=2014 %>">2014</aui:option>
				<aui:option value="<%=2015 %>">2015</aui:option>
			</aui:select>
		</aui:row>
		
		<aui:row>
			<aui:select 
				name="maTinh" 
				label="tinh-tp-label"
				id="maTinh" 
				showEmptyOption="<%= false %>"
				required="true"
				disabled="<%=(userType==1)? false:true%>"
			>
				<c:if test="<%=!(maTinhInit.equals(StringPool.BLANK))&&(userType==2) %>">
				<aui:option value="<%=maTinhInit %>" selected="true"><%=NuocSachUtils.getNameTinh(maTinhInit) %></aui:option>
				</c:if>
				<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
				<%
					for (DATAITEM tinh : listTinh) {
				%>
					<aui:option value="<%= tinh.getNode1() %>"><%= tinh.getName() %></aui:option>
				<%
					}
				%>
			</aui:select>
		</aui:row>
		
		<aui:row>
			<div id="optHuyen">
				<aui:select 
					name="maHuyen" 
					label="huyen-label"
					id="maHuyen" 
					onChange="javascript:selectXa();"
					showEmptyOption="<%= false %>"
					required="true"
				>
					<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
					<%
						for (DATAITEM huyen : listHuyen) {
					%>
						<aui:option value="<%= huyen.getNode2() %>" selected="<%=(maHuyenInit.equals(huyen.getNode2())) %>"><%= huyen.getName() %></aui:option>
					<%
						}
					%>
				</aui:select>
			</div>
		</aui:row>
		
		<aui:row>
			<div id="optXa">
				<aui:select 
					name="maXa" 
					label="xa-label"
					id="maXa" 
					showEmptyOption="<%= false %>"
					required="true"
				>
					<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
					<%
						for (DATAITEM xa : listXa) {
					%>
						<aui:option value="<%= xa.getNode3() %>" selected="<%=(maXaInit.equals(xa.getNode3())) %>"><%= xa.getName() %></aui:option>
					<%
						}
					%>
				</aui:select>
			</div>
		</aui:row>
		
		<aui:row id="vsHoGiaDinh">
			<aui:input 
				name="soNhaTieuHVSMoi" 
				label="so-nha-tieu-hvs-moi" 
				cssClass="lfr-input-text"
			>
			<aui:validator name="digits"></aui:validator>
			</aui:input>
		</aui:row>
		
		<aui:row id="vsToanXa">
		
			<aui:input 
				name="VSTX" 
				label="ve-sinh-toan-xa" 
				id="VSTX" 
				type="checkbox"
				value="<%=veSinhToanXa %>"
			></aui:input>
			<div id="soDanVSTX">
				<aui:input 
					name="soDan"
					id="SDVSTX"
					label="so-nguoi-huong-loi"
					cssClass="lfr-input-text"
				>
				<aui:validator name="digits"></aui:validator>
				</aui:input>
			</div>
		</aui:row>
		
		<aui:row>
			<aui:input 
				name="ghiChu" 
				label="ghi-chu-label" 
				cssClass="lfr-input-text"
			>
			</aui:input>
		</aui:row>
		
		<aui:row>
			<aui:button-row>
				<aui:button type="submit" value="save"/>
				<aui:button href="<%=redirect %>" name="cancel" type="cancel" />
			</aui:button-row>
		</aui:row>
	</aui:field-wrapper>
</aui:form>

<script type="text/javascript">
	AUI().ready(function(A){
		var capTinhInput = A.one("#<portlet:namespace/>maTinh");
		var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");
		
		capTinhInput.on('change', function(){
			var capTinhId = capTinhInput.val();
			var capHuyenId = capHuyenInput.val();
			selectHuyen(capTinhId, capHuyenId);
		});
			
	});
	
	function selectHuyen(capTinhId, capHuyenId){
		AUI().use('aui-base','aui-io-request', function(A){
	
			//aui ajax call to get updated content
			A.io.request('<%= selectHuyen %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />capTinhId": capTinhId,
					"<portlet:namespace />capHuyenId": capHuyenId
				},
				on: {
					success: function() {
						var optHuyen = A.one("#optHuyen");
						optHuyen.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
	
	function selectXa(){
		AUI().use('aui-base','aui-io-request', function(A){
			//aui ajax call to get updated content
			var capTinhInput = A.one("#<portlet:namespace/>maTinh");
			var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");
	
			A.io.request('<%= selectXa %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />capTinhId": capTinhInput.val(),
					"<portlet:namespace />capHuyenId": capHuyenInput.val()
				},
				on: {
					success: function() {
						var optXa = A.one("#optXa");
						optXa.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
</script>