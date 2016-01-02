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

<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@ include file="/init.jsp" %>

<%
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

KeHoachDauNam entry = (KeHoachDauNam)row.getObject();
int userType = 0;

UserMapping userMapping = UserMappingBusiness.getUserMapping(user);
if(userMapping!=null){
	userType = userMapping.getUserType();
}

%>

<liferay-portlet:renderURL var="viewEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachdaunam/view_detail.jsp" />
	<portlet:param name="id" value="<%= String.valueOf(entry.getId()) %>" />
	<portlet:param name="backURL" value="<%= PortalUtil.getCurrentURL(request).toString() %>"/>
</liferay-portlet:renderURL>

<liferay-ui:icon
	image="view"
	label="xem-chi-tiet-ke-hoach-dau-nam"
	url="<%= viewEntryURL %>"
	message="xem-chi-tiet-ke-hoach-dau-nam"
/>
<c:if test="<%=((userType == 1) || (userType == 2))? true:false%>">
	<liferay-portlet:renderURL var="editEntryURL">
		<portlet:param name="mvcPath" value="/html/portlet/kehoachdaunam/edit_kehoachdaunam.jsp" />
		<portlet:param name="id" value="<%= String.valueOf(entry.getId()) %>" />
		<portlet:param name="userId" value="<%= String.valueOf(PortalUtil.getUserId(request)) %>" />
		<portlet:param name="backURL" value="<%= PortalUtil.getCurrentURL(request).toString() %>"/>
	</liferay-portlet:renderURL>
	
	<liferay-ui:icon
		image="edit"
		message="sua-ke-hoach-dau-nam"
		label="sua-ke-hoach"
		url="<%= editEntryURL %>"
	/>
	
	<liferay-portlet:actionURL name="deleteKeHoach" var="deleteKeHoachURL">
		<portlet:param name="lastURL" value="<%= PortalUtil.getCurrentURL(request) %>" />
		<portlet:param name="id" value="<%= String.valueOf(entry.getId()) %>" />
	</liferay-portlet:actionURL>
	
	<liferay-ui:icon-delete
		message="xoa-ke-hoach-dau-nam"
		confirmation="ban-co-chac-chan-muon-xoa-ke-hoach-nay"
		image="delete"
		url="<%= deleteKeHoachURL %>"
	/>
</c:if>