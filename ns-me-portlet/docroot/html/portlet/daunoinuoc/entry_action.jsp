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

<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.util.ActionKeys"%>
<%@page import="vn.dtt.cmon.user.permission.UserMappingPermission"%>
<%@page import="vn.dtt.sol.ns.reporting.DauNoiNuocReportModel"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms"%>

<%@ include file="/init.jsp" %>

<%
String maTinh = (String)request.getAttribute(DauNoiNuocTerms.MA_TINH);
String maHuyen = (String)request.getAttribute(DauNoiNuocTerms.MA_HUYEN);
String maXa = (String)request.getAttribute(DauNoiNuocTerms.MA_XA);
String tramCapNuocId = (String)request.getAttribute(DauNoiNuocTerms.TRAM_CAP_NUOC_ID);
String trangThai = (String)request.getAttribute(DauNoiNuocTerms.TRANG_THAI);
String namBaoCao = (String)request.getAttribute(DauNoiNuocTerms.NAM_BAO_CAO);
String ngayDauNoi = (String)request.getAttribute("ngayNhap");
String idNguoiTao = (String)request.getAttribute("idNguoiTao");
String advText = (String)request.getAttribute("advText");
UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
DauNoiNuocReportModel entry = (DauNoiNuocReportModel)row.getObject();
%>
<liferay-portlet:renderURL var="viewEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/view_detail.jsp" />
	<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
	<portlet:param name="<%=DauNoiNuocTerms.ID%>" value="<%= String.valueOf(entry.getId()) %>" />
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>" value="<%=tramCapNuocId %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
	<liferay-portlet:param name="ngayNhap" value="<%=ngayDauNoi %>"></liferay-portlet:param>
	<liferay-portlet:param name="idNguoiTao" value="<%=idNguoiTao %>"></liferay-portlet:param>
	<liferay-portlet:param name="advText" value="<%=advText %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/edit_daunoi.jsp" />
	<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
	<portlet:param name="<%=DauNoiNuocTerms.ID%>" value="<%= String.valueOf(entry.getId()) %>" />
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>" value="<%=tramCapNuocId %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
	<liferay-portlet:param name="ngayNhap" value="<%=ngayDauNoi %>"></liferay-portlet:param>
	<liferay-portlet:param name="idNguoiTao" value="<%=idNguoiTao %>"></liferay-portlet:param>
	<liferay-portlet:param name="advText" value="<%=advText %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/view.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/view.jsp"/>
</portlet:renderURL>
<liferay-portlet:actionURL var="deleteDauNoiNuoc" name="deleteDauNoiNuoc">
	<liferay-portlet:param name="currentURL" value="<%= currentURL %>" />
	<liferay-portlet:param name="<%=DauNoiNuocTerms.ID%>" value="<%= String.valueOf(entry.getId()) %>" />
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>" value="<%=tramCapNuocId %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
	<liferay-portlet:param name="onpageError" value="<%= onpageError%>"></liferay-portlet:param>
	<liferay-portlet:param name="onpageSuccess" value="<%=onpageSuccess %>"></liferay-portlet:param>
</liferay-portlet:actionURL>

<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId, ActionKeys.VIEW_DAU_NOI) %>">
	<liferay-ui:icon image="view" message="xem-dau-noi-nuoc" label="xem-chi-tiet-tram-cap" url="<%= viewEntryURL %>" />
</c:if>
<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId,\"me_daunoinuoc\",user.getUserId(),entry.getUserIdData(), 0, ActionKeys.ADMIN_DAUNOI) %>">
	<liferay-ui:icon image="edit" message="edit-dau-noi-nuoc" label="edit-dau-noi-nuoc" url="<%= editEntryURL %>" />
</c:if>
<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId,\"me_daunoinuoc\",user.getUserId(),entry.getUserIdData(), entry.getTrangThai().equals(\"tinh-trang-dau-noi-0\")?0:2, ActionKeys.ADMIN_DAUNOI) %>">
	<liferay-ui:icon-delete image="delete" message="xoa-dau-noi-nuoc" confirmation="ban-co-chac-chan-muon-xoa-dau-noi-nuoc-nay" url="<%= deleteDauNoiNuoc %>" />
</c:if>

