<%--
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
--%>

<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.DanhGiaVeSinhXaTerm"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.util.ActionKeys"%>
<%@page import="vn.dtt.cmon.user.permission.UserMappingPermission"%>

<%@ include file="/init.jsp" %>

<%
String maTinh = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_TINH);
String maHuyen = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_HUYEN);
String maXa = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_XA);
String namBaoCao = (String)request.getAttribute(DanhGiaVeSinhXaTerm.NAM);
UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
DanhGiaVeSinhXaNewFake entry = (DanhGiaVeSinhXaNewFake)row.getObject();
%>
<liferay-portlet:renderURL var="viewEntryURL">
	<liferay-portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/edit_danhgiavesinh.jsp"></liferay-portlet:param>
	<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_TINH %>" value="<%=entry.getMaTinh() %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_HUYEN %>" value="<%=entry.getMaHuyen() %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.NAM %>" value="<%=String.valueOf(entry.getNam()) %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/view.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/view.jsp"/>
</portlet:renderURL>
<liferay-portlet:actionURL var="deleteDanhGiaVeSinhURL" name="deleteDanhGiaVeSinh">
	<liferay-portlet:param name="currentURL" value="<%= currentURL %>" />
	<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.ID%>" value="<%= String.valueOf(entry.getId()) %>" />
<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_TINH %>" value="<%=entry.getMaTinh() %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_HUYEN %>" value="<%=entry.getMaHuyen() %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.NAM %>" value="<%=String.valueOf(entry.getNam()) %>"></liferay-portlet:param>
	<liferay-portlet:param name="onpageError" value="<%= onpageError%>"></liferay-portlet:param>
	<liferay-portlet:param name="onpageSuccess" value="<%=onpageSuccess %>"></liferay-portlet:param>
</liferay-portlet:actionURL>
<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId, ActionKeys.ADMIN_VESINH) %>">
	<liferay-ui:icon image="edit" message="edit-dau-noi-nuoc" label="edit-dau-noi-nuoc" url="<%= viewEntryURL %>" />
</c:if>
<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId, ActionKeys.ADMIN_VESINH) %>">
	<liferay-ui:icon-delete image="delete" message="xoa-dau-noi-nuoc" confirmation="ban-co-chac-chan-muon-xoa-dau-noi-nuoc-nay" url="<%= deleteDanhGiaVeSinhURL %>" />
</c:if>

