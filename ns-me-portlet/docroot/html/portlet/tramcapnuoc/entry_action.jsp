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

<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@ include file="/init.jsp" %>

<%
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

TramCapNuoc entry = (TramCapNuoc)row.getObject();

%>

<liferay-portlet:renderURL var="viewEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/view_detail.jsp" />
	<portlet:param name="tramCapId" value="<%= String.valueOf(entry.getId()) %>" />
</liferay-portlet:renderURL>

<liferay-ui:icon
	image="view"
	label="xem-chi-tiet-tram-cap"
	url="<%= viewEntryURL %>"
	message="xem-chi-tiet-tram-cap"
/>

<liferay-portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/edit_tramcap.jsp" />
	<portlet:param name="redirect" value="<%= redirect %>" />
	<portlet:param name="tramCapId" value="<%= String.valueOf(entry.getId()) %>" />
</liferay-portlet:renderURL>

<liferay-ui:icon
	image="edit"
	message="xua-tram-cap-nuoc"
	label="xua-tram-cap-nuoc"
	url="<%= editEntryURL %>"
/>

<liferay-portlet:actionURL var="deleteTramCap">
	<portlet:param name="redirect" value="<%= redirect %>" />
	<portlet:param name="tramCapId" value="<%= String.valueOf(entry.getId()) %>" />
</liferay-portlet:actionURL>

<liferay-ui:icon-delete
	message="xoa-tram-cap-nuoc"
	confirmation="ban-co-chac-chan-muon-xoa-tram-cap-nuoc-nay"
	image="delete"
	url="<%= deleteTramCap %>"
/>