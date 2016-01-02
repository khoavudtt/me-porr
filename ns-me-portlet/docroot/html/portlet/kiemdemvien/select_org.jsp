<%@page import="vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien"%>
<%@page import="vn.dtt.cmon.user.action.UserMappingAction"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.security.membershippolicy.RoleMembershipPolicyUtil"%>
<%@page import="vn.dtt.sol.ns.util.PortletKeys"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="vn.dtt.sol.ns.util.PortletPropsValues"%>
<%@page import="vn.dtt.sol.ns.util.MessageErrors"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
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

<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kiemdemvien/_select_huyen.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="selectTram" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kiemdemvien/_select_tramcap.jsp"/>
</portlet:renderURL>

<%
	KiemDemVien kiemDemVien = null;
	
	long id = ParamUtil.getLong(request, UserMappingAction.ID);

	User selUser = null;
	
	List<Role> roles = new ArrayList<Role>();
	
	long capHoatDong = 0;
	
	if (Validator.isNotNull(kiemDemVien)) {
		capHoatDong = kiemDemVien.getCapHoatDong();
		
		try {
			selUser = UserLocalServiceUtil.getUser(kiemDemVien.getId());
			roles = RoleLocalServiceUtil.getUserRoles(selUser.getUserId());
		} catch (Exception e) {
		}
	}
	
	List<DATAITEM> listTinh = DATAITEMLocalServiceUtil.getByDataGroupLevel1(1);
	
	List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
	
	List<TramCapNuoc> listTramCap = new ArrayList<TramCapNuoc>();
	
%>
<aui:row>
	<aui:col width="50">
		<aui:select name="capHoatDong" label="cap-hoat-dong" id="capHoatDong" showEmptyOption="<%= true %>" required="true">
			<aui:option value="1" selected='<%= capHoatDong == 1 %>'><liferay-ui:message key="toan-tinh"/></aui:option>
			<aui:option value="2" selected='<%= capHoatDong == 2 %>'><liferay-ui:message key="ve-sinh-huyen"/></aui:option>
			<aui:option value="3" selected='<%= capHoatDong == 3 %>'><liferay-ui:message key="tram-cap-nuoc"/></aui:option>
		</aui:select>
	</aui:col>
</aui:row>
<aui:row id="optToanTinh">
	<aui:col width="50">
		<aui:select name="maTinh" id="maTinh" showEmptyOption="<%= true %>" required="true">
			<%
				for (DATAITEM tinh : listTinh) {
			%>
				<aui:option value="<%= tinh.getNode1() %>"><%= tinh.getName() %></aui:option>
			<%
				}
			%>
		</aui:select>
	</aui:col>

	<aui:col id="optVeSinhHuyen" width="50">
		<div id="optHuyen">
			<aui:select name="maHuyen" id="maHuyen" showEmptyOption="<%= false %>">
				
			</aui:select>
		</div>
	</aui:col>
	
	<aui:col id="optTramCapNuoc" width="50">
		<div id="optTram">
			<aui:select name="maTram" id="maTram" showEmptyOption="<%= false %>">
	
			</aui:select>
		</div>
	</aui:col>
</aui:row>
<script type="text/javascript">

	AUI().ready(function(A){
		var capHoatDong = '<%= capHoatDong %>';
		var capHoatDongInput = A.one("#<portlet:namespace/>capHoatDong");
		
		var capTinhInput = A.one("#<portlet:namespace/>maTinh");
		var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");
		var capTramInput = A.one("#<portlet:namespace/>maTram");
		
		<portlet:namespace/>loadingDialogState(capHoatDong);
		
		capHoatDongInput.on('change', function(){
			var value = capHoatDongInput.val();
			<portlet:namespace />loadingDialogState(value);
		});
	
			capTinhInput.on('change', function(){
			var capTinhId = capTinhInput.val();
			var capHuyenId = capHuyenInput.val();
			var capTramId = capTramInput.val();
			selectHuyen(capTinhId, capHuyenId);
			selectTram(capTinhId, capTramId);
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
	
	function selectTram(capTinhId, capTramId){
		AUI().use('aui-base','aui-io-request', function(A){
	
			//aui ajax call to get updated content
			A.io.request('<%= selectTram %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />capTinhId": capTinhId,
					"<portlet:namespace />capTramId": capTramId
				},
				on: {
					success: function() {
						var optHuyen = A.one("#optTram");
						optHuyen.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});
	}

	Liferay.provide(window, '<portlet:namespace/>loadingDialogState',

	function(value) {
		var A = AUI();

		var capTinh = A.one('#<portlet:namespace/>optToanTinh');
		var capHuyen = A.one('#<portlet:namespace/>optVeSinhHuyen');
		var capTramCap = A.one('#<portlet:namespace/>optTramCapNuoc');

		if (value == '1') {
			capTinh.show();
			capHuyen.hide();
			capTramCap.hide();
		} else if (value == '2') {
			capTinh.show();
			capHuyen.show();
			capTramCap.hide();
		} else if (value == '3') {
			capTinh.show();
			capHuyen.hide();
			capTramCap.show();
		} else {
			capTinh.hide();
			capHuyen.hide();
			capTramCap.hide();
		}
	});
</script>