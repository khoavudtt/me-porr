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

<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@ include file="/init.jsp" %>

<%
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

DanhGiaVanHanh entry = (DanhGiaVanHanh)row.getObject();

%>

<liferay-portlet:actionURL var="editVanHanhURL" name="editVanHanh">
	<portlet:param name="tramCapId" value="<%= String.valueOf(entry.getId()) %>" />
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/edit_vanhanh_tramcap.jsp"/>
</liferay-portlet:actionURL>

<liferay-ui:icon
	image="edit"
	label="sua-van-hanh-tram"
	url="<%= editVanHanhURL %>"
	message="sua-van-hanh-tram"
/>

<liferay-portlet:actionURL var="deleteVanHanhURL" name="deleteVanHanh">
	<portlet:param name="tramCapId" value="<%= String.valueOf(entry.getId()) %>" />
</liferay-portlet:actionURL>

<liferay-ui:icon-delete
	message="xoa-van-hanh-tram"
	confirmation="ban-co-chac-chan-muon-xoa-thong-tin-van-hanh-tram-cap-nuoc-nay"
	image="delete"
	url="<%= deleteVanHanhURL %>"
/>