
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.kehoachdaunam.dao.service.KeHoachDauNamLocalServiceUtil"%>
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
	
	KeHoachDauNam keHoach = KeHoachDauNamLocalServiceUtil.getKeHoachDauNam(keHoachId);
	
	TramCapNuoc tramCap = TramCapBusiness.getTramCap(keHoach.getTramCapNuocId());
	
	String maTinh = tramCap.getMaTinh();
	
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
		<td><b><liferay-ui:message key="tinh-tp"></liferay-ui:message></b></td>
		<td><%=NuocSachUtils.getNameTinh(maTinh) %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="ma-tram"></liferay-ui:message></b></td>
		<td><%=NuocSachUtils.getTenTramByTramId(String.valueOf(keHoach.getTramCapNuocId()))  %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="so-dau-noi-moi"></liferay-ui:message></b></td>
		<td><%=keHoach.getSoDauNoiMoi() %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="so-ho-cap-nuoc-du-kien"></liferay-ui:message></b></td>
		<td><%=keHoach.getSoHoHuongLoi() %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="so-nguoi-cap-nuoc-du-kien"></liferay-ui:message></b></td>
		<td><%=keHoach.getSoNguoiHuongLoi() %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="ghi-chu"></liferay-ui:message></b></td>
		<td><%=keHoach.getGhiChu() %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="bao-cao-dli"></liferay-ui:message></b></td>
		<td><%=keHoach.getBaoCaoDLI() %></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="ngay-tao"></liferay-ui:message></b></td>
		<td><%= dateFormatDate.format(keHoach.getNgayTao())%></td>
	</tr>
	
	<tr>
		<td><b><liferay-ui:message key="nguoi-tao"></liferay-ui:message></b></td>
		<td><%=selUser.getFullName() %></td>
	</tr>
</table>

</aui:fieldset>
