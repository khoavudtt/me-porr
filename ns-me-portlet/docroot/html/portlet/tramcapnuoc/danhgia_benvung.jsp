<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="com.liferay.util.PwdGenerator"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.sol.ns.business.DataGroupBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAGROUP"%>
<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Organization"%>
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

<script type="text/javascript" src='http://maps.google.com/maps/api/js?sensor=false&libraries=places'></script>

<%@include file="/init.jsp" %>

<%
	TramCapNuoc tramCap = null;
	String maTram = PwdGenerator.getPassword(10);
		 
	List<DATAITEM> listMoHinhQuanLy = DATAITEMLocalServiceUtil.getByDataGroupLevel1(WebKeys.DATAGROUPID_MOHINHQUANLY);
	List<DATAITEM> listTinh = DATAITEMLocalServiceUtil.getByDataGroupLevel1(WebKeys.DATAGROUPID_DONVIHANHCHINH);

%>



<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/_select_huyen.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="selectXa" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/_select_xa.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/edit_tramcap.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/view.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addTramCap" var="addTramCapURL"/>

<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= (tramCap == null) ? "add-tram-cap" : "edit-tram-cap" %>'
/>
<aui:form action="<%= addTramCapURL %>" method="post" name="fm">
	<aui:model-context bean="<%= tramCap %>" model="<%= TramCapNuoc.class %>" />
	
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(tramCap) ? Constants.UPDATE : Constants.ADD %>"/>
	<aui:input name="redirect" type="hidden" value="<%= StringPool.BLANK %>" />
	<aui:input name="currentURL" type="hidden" value="<%= StringPool.BLANK %>" />
	<aui:input name="id" type="hidden" value="<%= Validator.isNotNull(tramCap) ? tramCap.getId() : StringPool.BLANK %>" />
	<aui:input name="onpageError" type="hidden" value="<%= onpageError%>" />
	<aui:input name="onpageSuccess" type="hidden" value="<%= onpageSuccess %>" />
	
	<aui:field-wrapper cssClass="form-add-tram-cap">
		<aui:row>
			<aui:col width="50">
				<aui:input name="maTram" label="ma-tram-cap" value="<%= Validator.isNotNull(tramCap) ? tramCap.getMaTram() : StringUtil.upperCase(maTram) %>"/>
				
				<aui:input name="tenTram" label="ten-tram-cap" value="<%= Validator.isNotNull(tramCap) ? tramCap.getTenTram() : StringPool.BLANK %>"/>
				<aui:select name="maTinh" id="maTinh" label="tinh" showEmptyOption="<%= true %>">
					<%
						for (DATAITEM tinh : listTinh) {
					%>
						<aui:option value="<%= tinh.getNode1() %>"><%= tinh.getName() %></aui:option>
					<%
						}
					%>
				</aui:select>
				<div id="optHuyen">
					<aui:select name="maHuyen"  id="maHuyen" label="huyen" showEmptyOption="<%= true %>">
						
					</aui:select>
				</div>
				
				<div id="optXa">
				
					<aui:select name="maXa"  id="maXa" label="xa" showEmptyOption="<%= true %>">
						
					</aui:select>
				
				</div>
				
				<aui:input name="diaChi" id="diaChi" label="dia-chi-tram-cap" value="<%= Validator.isNotNull(tramCap) ? tramCap.getDiaChi() : StringPool.BLANK %>"/>
				
				<aui:input name="kinhDo" id="kinhDo" label="kinh-do" value="<%= Validator.isNotNull(tramCap) ? tramCap.getKinhDo() : StringPool.BLANK %>"></aui:input>
				
				<aui:input name="viDo" id="viDo" label="vi-do" value="<%= Validator.isNotNull(tramCap) ? tramCap.getViDo() : StringPool.BLANK %>"></aui:input>				

				<div id="locationpicker">
					<div id="us2" style="width: 100%; height: 300px;"></div>
	
					<script>$('#us2').locationpicker({
						location: {latitude: 21.023277896055212, longitude: 105.83364481586909},	
						radius: 300,
							inputBinding: {
						        latitudeInput: $('#<portlet:namespace/>kinhDo'),
						        longitudeInput: $('#<portlet:namespace/>viDo'),
						        locationNameInput: $('#<portlet:namespace/>diaChi')
						    }
						});
					</script>
				</div>
				
			</aui:col>
			<aui:col width="50">
							
				<aui:select name="loaiHinh" label="loai-hinh" showEmptyOption="<%= true %>">
					<aui:option value="1"><liferay-ui:message key="cap-nuoc-tu-chay"/></aui:option>
					<aui:option value="2"><liferay-ui:message key="su-dung-bom-dan"/></aui:option>
				</aui:select>
				<aui:select name="maMoHinh" label="mo-hinh-quan-ly" showEmptyOption="<%= true %>">
					<%
						for (DATAITEM mohinh : listMoHinhQuanLy) {
					%>
						<aui:option value="<%= mohinh.getId() %>"><%= mohinh.getName() %></aui:option>
					<%
						}
					%>
				</aui:select>
				
				<aui:input name="congXuatThietKe" value="<%= Validator.isNotNull(tramCap) ? tramCap.getCongXuatThietKe() : StringPool.BLANK %>"></aui:input>
				<aui:input name="tongDauNoiThietKe" value="<%= Validator.isNotNull(tramCap) ? tramCap.getTongDauNoiThietKe() : StringPool.BLANK %>"></aui:input>
				<aui:input name="soNguoiCapThietKe" value="<%= Validator.isNotNull(tramCap) ? tramCap.getSoNguoiCapThietKe() : StringPool.BLANK %>"></aui:input>
				<aui:select name="tinhTrangDuAn" label="tinh-trang-du-an" showEmptyOption="true">
					<aui:option value="1"><liferay-ui:message key="tinh-trang-du-an-1"/></aui:option>
					<aui:option value="2"><liferay-ui:message key="tinh-trang-du-an-2"/></aui:option>
					<aui:option value="3"><liferay-ui:message key="tinh-trang-du-an-3"/></aui:option>
					<aui:option value="4"><liferay-ui:message key="tinh-trang-du-an-4"/></aui:option>
				</aui:select>
				
				<aui:input name="tienDoXayDung" value="<%= Validator.isNotNull(tramCap) ? tramCap.getTienDoXayDung() : StringPool.BLANK %>"></aui:input>
				<aui:input name="namXayDung" value="<%= Validator.isNotNull(tramCap) ? tramCap.getNamXayDung() : Integer.toString(Calendar.getInstance().get(Calendar.YEAR)) %>"></aui:input>
				<aui:input name="namHoanThanh" value="<%= Validator.isNotNull(tramCap) ? tramCap.getNamHoanThanh() : Integer.toString(Calendar.getInstance().get(Calendar.YEAR)) %>"></aui:input>
				<aui:input name="ngayVanHanh" value="<%= Validator.isNotNull(tramCap) ? tramCap.getNgayVanHanh() : Calendar.getInstance() %>"></aui:input>

				<aui:select name="boMayVanHanh" label="bo-may-van-hanh" showEmptyOption="true">
					<aui:option value="1"><liferay-ui:message key="bo-may-van-hanh-1"/></aui:option>
					<aui:option value="2"><liferay-ui:message key="bo-may-van-hanh-2"/></aui:option>
					<aui:option value="3"><liferay-ui:message key="bo-may-van-hanh-3"/></aui:option>
					<aui:option value="4"><liferay-ui:message key="bo-may-van-hanh-4"/></aui:option>
				</aui:select>
				
				<aui:input name="ghiChu" type="textarea" cssClass="ghi-chu-fm"></aui:input>
			</aui:col>
		</aui:row>

		<aui:row cssClass="fm-button">	
			<aui:col width="100">
				<aui:button-row>
					<aui:button type="submit" value="save"/>
					<aui:button href="<%= redirect %>" name="cancel" type="cancel" />
				</aui:button-row>
			</aui:col>
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
		
		capHuyenInput.on('change', function(){
			alert(hic);
			var capTinhId = capTinhInput.val();
			var capHuyenId = capHuyenInput.val();
			selectXa(capTinhId, capHuyenId);
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

