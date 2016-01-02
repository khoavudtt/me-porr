<%@page import="vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@ include file="/init.jsp" %>

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

<%
	SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	
	KiemDemVien entry = (KiemDemVien)row.getObject();

%>

<liferay-portlet:renderURL var="viewEntryURL">
	<portlet:param name="mvcPath" value='<%= templatePath + "view_detail.jsp" %>'/>
	<portlet:param name="id" value="<%= String.valueOf(entry.getId()) %>" />
	<portlet:param name="capHoatDong" value="<%= Long.toString(entry.getCapHoatDong()) %>"/>
	<portlet:param name="orgCode2" value="<%= entry.getOrgCode2() %>"/>
	<portlet:param name="maTinh" value="<%= entry.getOrgCode1() %>"/>
	<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>"/>
</liferay-portlet:renderURL>


<liferay-portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcPath" value='<%= templatePath + "add_kiemdemvien.jsp" %>'/>
	<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>"/>
	<portlet:param name="id" value="<%= String.valueOf(entry.getId()) %>" />
	<portlet:param name="currentURL" value="<%= currentURL %>"/>
	<portlet:param name="capHoatDong" value="<%= Long.toString(entry.getCapHoatDong()) %>"/>
	<portlet:param name="orgCode2" value="<%= entry.getOrgCode2() %>"/>
	<portlet:param name="maTinh" value="<%= entry.getOrgCode1() %>"/>
</liferay-portlet:renderURL>



<div class="action-icon">
	<liferay-ui:icon
	image="view"
	label="xem-chi-tiet-kiem-dem-vien"
	url="<%= viewEntryURL %>"
	message="xem-chi-tiet-kiem-dem-vien"
/>
	
</div>

<div class="action-icon">
	<liferay-ui:icon
	image="edit"
	message="sua-kiem-dem-vien"
	label="sua-kiem-dem-vien"
	url="<%= editEntryURL %>"
/>
</div>
