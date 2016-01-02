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

<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhCongTrinhTerms"%>
<%@page import="vn.dtt.sol.ns.reporting.CongTrinhReportModel"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhCongTrinhTerms"%>
<%@page import="vn.dtt.sol.ns.reporting.CongTrinhReportModel"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.util.ActionKeys"%>
<%@page import="vn.dtt.cmon.user.permission.UserMappingPermission"%>
<%@page import="vn.dtt.sol.ns.reporting.DauNoiNuocReportModel"%>

<%@ include file="/init.jsp" %>

<%
String maTinh = (String)request.getAttribute(VeSinhCongTrinhTerms.MA_TINH);
String maHuyen = (String)request.getAttribute(VeSinhCongTrinhTerms.MA_HUYEN);
String maXa = (String)request.getAttribute(VeSinhCongTrinhTerms.MA_XA);
String loaiNhaTieu = (String)request.getAttribute(VeSinhCongTrinhTerms.LOAI_NHA_TIEU);
String loaiCongTrinh = (String)request.getAttribute(VeSinhCongTrinhTerms.LOAI_CONG_TRINH);
String trangThai = (String)request.getAttribute(VeSinhCongTrinhTerms.TRANG_THAI);
String namBaoCao = (String)request.getAttribute(VeSinhCongTrinhTerms.NAM_BAO_CAO);
UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
CongTrinhReportModel entry = (CongTrinhReportModel)row.getObject();

%>
<liferay-portlet:renderURL var="viewEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/view_detail.jsp" />
	<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
	<portlet:param name="<%=VeSinhCongTrinhTerms.ID%>" value="<%= String.valueOf(entry.getId()) %>" />
</liferay-portlet:renderURL>
<liferay-portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/edit_congtrinh.jsp" />
	<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
	<portlet:param name="<%=VeSinhCongTrinhTerms.ID%>" value="<%= String.valueOf(entry.getId()) %>" />
</liferay-portlet:renderURL>
<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/view.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/view.jsp"/>
</portlet:renderURL>
<liferay-portlet:actionURL var="deleteDauNoiNuoc" name="deleteCongTrinh">
	<liferay-portlet:param name="currentURL" value="<%= currentURL %>" />
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.ID%>" value="<%= String.valueOf(entry.getId()) %>" />
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.LOAI_CONG_TRINH %>" value="<%=loaiCongTrinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.LOAI_NHA_TIEU %>" value="<%=loaiNhaTieu %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
	<liferay-portlet:param name="onpageError" value="<%= onpageError%>"></liferay-portlet:param>
	<liferay-portlet:param name="onpageSuccess" value="<%=onpageSuccess %>"></liferay-portlet:param>
</liferay-portlet:actionURL>

<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId, ActionKeys.VIEW_VESINH) %>">
	<liferay-ui:icon image="view" message="xem-vs-cong-trinh" label="xem-chi-tiet-vs-cong-trinh" url="<%= viewEntryURL %>" />
</c:if>
<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId,\"me_vesinhcongtrinh\",user.getUserId(),entry.getUserIdData(), 0, ActionKeys.ADMIN_VESINH) %>">
	<liferay-ui:icon image="edit" message="edit-vs-cong-trinh" label="edit-vs-cong-trinh" url="<%= editEntryURL %>" />
</c:if>
<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId,\"me_vesinhcongtrinh\",user.getUserId(),entry.getUserIdData(), 0, ActionKeys.ADMIN_VESINH) %>">
	<liferay-ui:icon-delete image="delete" message="xoa-vs-cong-trinh" confirmation="ban-co-chac-chan-muon-xoa-vs-cong-trinh-nay" url="<%= deleteDauNoiNuoc %>" />
</c:if>

