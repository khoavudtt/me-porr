<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.maungaunhien.utils.MauKiemKemUtils"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM"%>
<%
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

<%@include file="/init.jsp" %>

<%
	MAUKIEMDEM mauKiemDem = (MAUKIEMDEM) request.getAttribute("mauKiemDem");
		 
	UserMapping um = UserMappingBusiness.getUserMapping(user);
		 
	Calendar cal = Calendar.getInstance();
		 
	String maTinh = ParamUtil.getString(request, "maTinh");
	
	if (Validator.isNull(maTinh) && Validator.isNotNull(um)) {
		 maTinh = um.getOrgCode1();
	}

	String maHuyen = ParamUtil.getString(request, "maHuyen", "0");
	
	String maXa = ParamUtil.getString(request, "maXa", "0");
		 
	int currYear = cal.get(Calendar.YEAR);
	
	List<DATAITEM> listTinh = NuocSachUtils.getListTinh(user);
	String redirectURL = ParamUtil.getString(request, "backURL", currentURL);

%>

<liferay-ui:header
	backURL="<%= redirectURL %>"
	title="add-mau-ngau-nhien"
/>

<portlet:actionURL name="addMauNgauNhien" var="addMauNgauNhienURL"/>

<portlet:renderURL var="filterURL">
	<portlet:param name="mvcPath" value="/html/portlet/maungaunhien/add_maungaunhien.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="selectTinh" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/maungaunhien/_select_huyen.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/maungaunhien/_select_xa.jsp"/>
</portlet:renderURL>


<portlet:renderURL var="selectInfo" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/maungaunhien/_select_info.jsp"/>
</portlet:renderURL>

<liferay-ui:error key="vshgd-da-ton-tai-trong-ke-hoach" message="vshgd-da-ton-tai-trong-ke-hoach" />

<aui:form action="<%= addMauNgauNhienURL %>" method="post" name="fm">
	
	<aui:model-context bean="<%= mauKiemDem %>" model="<%= MAUKIEMDEM.class %>" />
	<aui:input name="pageSuccessURL" type="hidden" value="<%= redirectURL %>"/>
	<aui:input name="pageErrorURL" type="hidden" value="<%= currentURL %>"/>
	
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(mauKiemDem) ? Constants.UPDATE : Constants.ADD %>"/>
	<aui:input name="mauKiemDemId" type="hidden" value="<%= Validator.isNotNull(mauKiemDem) ? Long.toString(mauKiemDem.getId()) : StringPool.BLANK %>"/>
	
	<div id="optTinh">
		<aui:select name="maTinh" showEmptyOption="true">
			<%
				for (DATAITEM tinh : listTinh) {
			%>
				<aui:option value="<%= tinh.getNode1() %>" selected="<%= tinh.getNode1().contentEquals(maTinh) %>"><%= tinh.getName() %></aui:option>
			<%
				}
			%>
		</aui:select>
	</div>

	<aui:row>
		<aui:col width="30">
			<div id="optHuyen">
				<aui:select name="maHuyen" >
					
				</aui:select>
			</div>
		</aui:col>
		<aui:col width="30">
			<div id="optXa">
				<aui:select name="maXa" >
				
				</aui:select>
			</div>
		</aui:col>
		<aui:col width="30">
			<aui:select name="nam">
				<aui:option value="<%= currYear %>"><%= currYear %></aui:option>
			</aui:select>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col width="30">
			<aui:input name="seedNumber" inlineField="<%= true %>" type="text" cssClass="input-1" helpMessage="seed-number-desc"></aui:input>
		</aui:col>
		<aui:col width="30">
			<aui:input name="tyLeSaiSo" inlineField="<%= true %>" disabled="<%= true %>" type="text" value="5" cssClass="input-1"></aui:input>
		</aui:col>
		<aui:col width="30">
		</aui:col>
	</aui:row>
	
	
	<div id="optInfo">
		<aui:row>
			<aui:col width="30">
				<aui:input name="soMau" disabled="<%= true %>" inlineField="<%= true %>" type="text" cssClass="input-1"></aui:input>
			</aui:col>
			<aui:col width="30">
				<aui:input name="soMauChon" disabled="<%= true %>" inlineField="<%= true %>" type="text" cssClass="input-1"></aui:input>
			</aui:col>
			<aui:col width="30">
				<aui:input name="soMauDuPhong" disabled="<%= true %>" inlineField="<%= true %>"  type="text" cssClass="input-1"></aui:input>
			</aui:col>
		</aui:row>
	</div>
	
	<aui:button-row>
		<aui:button type="submit" value="save"></aui:button>
		<aui:button type="cancel" value="cancel" href="<%= redirect %>"></aui:button>
	</aui:button-row>
	
</aui:form>

<style>
<!--
.input-1 {
	width: 150px !important;
}
-->
</style>

<script type="text/javascript">
	AUI().ready(function(A){
		
		var capTinhInput = A.one("#<portlet:namespace/>maTinh");
		var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");
		var capXaInput = A.one("#<portlet:namespace/>maXa");
		
		selectTinh();
		
		capTinhInput.on('change', function(){
			selectTinh();
		});
		
		capXaInput.on('change', function(){
			selectInfo();
		});
	});
	

	function selectTinh(){
		AUI().use('aui-base','aui-io-request', function(A){
			var capTinhInput = A.one("#<portlet:namespace/>maTinh");

			//aui ajax call to get updated content
			A.io.request('<%= selectTinh %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />capTinhId": capTinhInput.val()
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
	
	function selectHuyen(){
		AUI().use('aui-base','aui-io-request', function(A){
			var capTinhInput = A.one("#<portlet:namespace/>maTinh");
			var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");

			//aui ajax call to get updated content
			A.io.request('<%= selectHuyen %>',
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
		
	function selectInfo(){
		AUI().use('aui-base','aui-io-request', function(A){
			//aui ajax call to get updated content
			var capTinhInput = A.one("#<portlet:namespace/>maTinh");
			var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");
			var capXaInput = A.one("#<portlet:namespace/>maXa");

			A.io.request('<%= selectInfo %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />capTinhId": capTinhInput.val(),
					"<portlet:namespace />capHuyenId": capHuyenInput.val(),
					"<portlet:namespace />capXaId": capXaInput.val()
				},
				on: {
					success: function() {
						var optInfo = A.one("#optInfo");
						optInfo.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
	
</script>

<%!
	private static double HE_SO_DU_PHONG = 0.05;
%>
