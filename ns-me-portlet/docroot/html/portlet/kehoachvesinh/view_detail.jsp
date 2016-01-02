<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.kehoachvesinh.dao.service.KeHoachVeSinhLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh"%>
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
<%
	String backURL = ParamUtil.getString(request, "backURL");
	
	long keHoachId = ParamUtil.getLong(request, "id");
	
	KeHoachVeSinh keHoach = KeHoachVeSinhLocalServiceUtil.getKeHoachVeSinh(keHoachId);
	
	User selUser = UserLocalServiceUtil.getUser(keHoach.getIdNguoiTao());
			
%>

<%@include file="/init.jsp"%>

<liferay-ui:header
	backURL="<%= backURL %>"
	title="chi-tiet-ke-hoach"
/>

<aui:fieldset cssClass="detail-tramcap">
<table>
	<tr>
		<td><b><liferay-ui:message key="nam-label"></liferay-ui:message></b></td>
		<td><%=keHoach.getNam() %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="tinh-tp-label"></liferay-ui:message></b></td>
		<td><%=NuocSachUtils.getNameTinh(keHoach.getMaTinh()) %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="huyen-label"></liferay-ui:message></b></td>
		<td><%=NuocSachUtils.getNameHuyen(keHoach.getMaTinh(), keHoach.getMaHuyen())  %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="xa-label"></liferay-ui:message></b></td>
		<td><%=NuocSachUtils.getNameXa(keHoach.getMaXa())  %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="loai-dk-label"></liferay-ui:message></b></td>
		<td><liferay-ui:message key='<%=(keHoach.getDangKyVSTX()==1)? "ve-sinh-toan-xa":"ve-sinh-ho-gia-dinh" %>'/></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key='<%=(keHoach.getDangKyVSTX()==1)? "so-nguoi-huong-loi-label":"so-nha-tieu-hvs-moi-label" %>'></liferay-ui:message></b></td>
		<td><%=(keHoach.getDangKyVSTX()==1)? keHoach.getSoDan():keHoach.getSoNhaTieuHVSMoi() %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="ghi-chu-label"></liferay-ui:message></b></td>
		<td><%=keHoach.getGhiChu() %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="ngay-tao-label"></liferay-ui:message></b></td>
		<td><%= dateFormatDate.format(keHoach.getNgayTao())%></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="nguoi-tao-label"></liferay-ui:message></b></td>
		<td><%=selUser.getFullName() %></td>
	</tr>
</table>

</aui:fieldset>
