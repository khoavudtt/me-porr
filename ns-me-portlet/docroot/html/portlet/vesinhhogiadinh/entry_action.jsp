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

<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhGiaDinhTerms"%>
<%@page import="vn.dtt.sol.ns.reporting.HoGiaDinhReportModel"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.util.ActionKeys"%>
<%@page import="vn.dtt.cmon.user.permission.UserMappingPermission"%>
<%@page import="vn.dtt.sol.ns.reporting.DauNoiNuocReportModel"%>

<%@ include file="/init.jsp" %>

<%
String maTinh = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_TINH);
String maHuyen = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_HUYEN);
String maXa = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_XA);
String loaiNhaTieu = (String)request.getAttribute(VeSinhGiaDinhTerms.LOAI_NHA_TIEU);
String trangThai = (String)request.getAttribute(VeSinhGiaDinhTerms.TRANG_THAI);
String namBaoCao = (String)request.getAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO);
String namBaoCaoVstx = (String)request.getAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO+"vstx");
String ngayDauNoi = (String)request.getAttribute("ngayNhap");
String idNguoiTao = (String)request.getAttribute("idNguoiTao");
String advText = (String)request.getAttribute("advText");
UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
HoGiaDinhReportModel entry = (HoGiaDinhReportModel)row.getObject();
%>
<liferay-portlet:renderURL var="viewEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/view_detail.jsp" />
	<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
	<portlet:param name="<%=VeSinhGiaDinhTerms.ID%>" value="<%= String.valueOf(entry.getId()) %>" />
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.NAM_BAO_CAO+\"vstx\" %>" value="<%=namBaoCaoVstx %>"></liferay-portlet:param>
	<liferay-portlet:param name="idNguoiTao" value="<%=String.valueOf(idNguoiTao) %>"></liferay-portlet:param>
	<liferay-portlet:param name="ngayNhap" value="<%=String.valueOf(ngayDauNoi) %>"></liferay-portlet:param>
	<liferay-portlet:param name="advText" value="<%=String.valueOf(advText) %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/edit_hogiadinh.jsp" />
	<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
	<portlet:param name="<%=VeSinhGiaDinhTerms.ID%>" value="<%= String.valueOf(entry.getId()) %>" />
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.NAM_BAO_CAO+\"vstx\" %>" value="<%=namBaoCaoVstx %>"></liferay-portlet:param>
	<liferay-portlet:param name="idNguoiTao" value="<%=String.valueOf(idNguoiTao) %>"></liferay-portlet:param>
	<liferay-portlet:param name="ngayNhap" value="<%=String.valueOf(ngayDauNoi) %>"></liferay-portlet:param>
	<liferay-portlet:param name="advText" value="<%=String.valueOf(advText) %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/view.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/view.jsp"/>
</portlet:renderURL>
<liferay-portlet:actionURL var="deleteDauNoiNuoc" name="deleteHoGiaDinh">
	<liferay-portlet:param name="currentURL" value="<%= currentURL %>" />
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.ID%>" value="<%= String.valueOf(entry.getId()) %>" />
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.LOAI_NHA_TIEU %>" value="<%=loaiNhaTieu %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
	<liferay-portlet:param name="onpageError" value="<%= onpageError%>"></liferay-portlet:param>
	<liferay-portlet:param name="onpageSuccess" value="<%=onpageSuccess %>"></liferay-portlet:param>
</liferay-portlet:actionURL>

<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId, ActionKeys.VIEW_VESINH) %>">
	<liferay-ui:icon image="view" message="xem-vs-ho-gia-dinh" label="xem-chi-tiet-vs-ho-gia-dinh" url="<%= viewEntryURL %>" />
</c:if>
<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId,\"me_vesinhgiadinh\",user.getUserId(),entry.getUserIdData(), 0, ActionKeys.ADMIN_VESINH) %>">
	<liferay-ui:icon image="edit" message="edit-vs-ho-gia-dinh" label="edit-vs-ho-gia-dinh" url="<%= editEntryURL %>" />
</c:if>
<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId,\"me_vesinhgiadinh\",user.getUserId(),entry.getUserIdData(), entry.getTrangThai().equals(\"tinh-trang-ve-sinh-0\")?0:2, ActionKeys.ADMIN_VESINH) %>">
	<liferay-ui:icon-delete image="delete" message="xoa-vs-ho-gia-dinh" confirmation="ban-co-chac-chan-muon-xoa-vs-ho-gia-dinh-nay" url="<%= deleteDauNoiNuoc %>" />
</c:if>

