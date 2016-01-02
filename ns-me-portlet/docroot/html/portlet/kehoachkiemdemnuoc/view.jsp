<%@page import="oracle.net.aso.s"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms"%>
<%@page import="vn.dtt.sol.ns.kehoachkiemdemnuoc.search.KeHoachKiemDemNuocSearch"%>
<%@page import="vn.dtt.sol.ns.kehoachkiemdemnuoc.terms.KeHoachKiemDemNuocTerms"%>
<%@page import="vn.dtt.sol.ns.util.MessageSuccess"%>
<%@page import="vn.dtt.sol.ns.util.MessageErrors"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.util.ActionKeys"%>
<%@page import="vn.dtt.cmon.user.permission.UserMappingPermission"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.cmon.user.action.UserMappingAction"%>
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="com.liferay.portal.model.Contact"%>
<%@page import="org.apache.commons.beanutils.BeanComparator" %>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
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
%>

<%@include file="/init.jsp" %>

<%
	String maTinh = (String)request.getAttribute(DauNoiNuocTerms.MA_TINH);
	String tramCapNuocId = (String)request.getAttribute(KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID);
	String kiemDemVienId = (String)request.getAttribute(KeHoachKiemDemNuocTerms.KIEM_DEM_VIEN_ID);
	String trangThai = (String)request.getAttribute("trangThai");
	String nam = ParamUtil.getString(request, KeHoachKiemDemNuocTerms.NAM);
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	String idNguoiTao = (String)request.getAttribute("idNguoiTao");
%>


<liferay-ui:error key="<%= MessageErrors.XUAT_BAN_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%= MessageErrors.XUAT_BAN_KE_HOACH_KIEM_DEM_MESSAGE %>" />
<liferay-ui:success key="<%= MessageSuccess.XUAT_BAN_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%= MessageSuccess.XUAT_BAN_KE_HOACH_KIEM_DEM_MESSAGE%>" />
<liferay-ui:error key="<%= MessageErrors.DONG_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%= MessageErrors.DONG_KE_HOACH_KIEM_DEM_MESSAGE %>" />
<liferay-ui:success key="<%= MessageSuccess.DONG_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%= MessageSuccess.DONG_KE_HOACH_KIEM_DEM_MESSAGE%>" />
<liferay-ui:error key="<%= MessageErrors.XOA_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%= MessageErrors.XOA_KE_HOACH_KIEM_DEM_MESSAGE %>" />
<liferay-ui:success key="<%= MessageSuccess.XOA_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%= MessageSuccess.XOA_KE_HOACH_KIEM_DEM_MESSAGE %>" />
<liferay-ui:error key="<%= MessageErrors.REOPEN_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%= MessageErrors.REOPEN_KE_HOACH_KIEM_DEM_MESSAGE %>" />
<liferay-ui:success key="<%= MessageSuccess.REOPEN_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%= MessageSuccess.REOPEN_KE_HOACH_KIEM_DEM_MESSAGE %>" />
<liferay-portlet:renderURL varImpl="searchURL" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view.jsp" />
</liferay-portlet:renderURL>
<aui:form action="<%= searchURL %>" method="get" name="fm2">

	<liferay-portlet:renderURLParams varImpl="searchURL" />
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<liferay-portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view.jsp" />
		<liferay-portlet:param name="maTinh" value="<%=maTinh %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID %>" value="<%=tramCapNuocId %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=KeHoachKiemDemNuocTerms.KIEM_DEM_VIEN_ID %>" value="<%=kiemDemVienId %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=KeHoachKiemDemNuocTerms.NAM %>" value="<%=nam %>"></liferay-portlet:param>
		<liferay-portlet:param name="trangThai" value="<%=trangThai %>"></liferay-portlet:param>
		<liferay-portlet:param name="idNguoiTao" value="<%=idNguoiTao %>"></liferay-portlet:param>
	</liferay-portlet:renderURL>
	<aui:input name="currentURL" type="hidden" value="<%= currentURL %>" />
	<aui:fieldset>
		<liferay-ui:search-container searchContainer="<%=new KeHoachKiemDemNuocSearch(renderRequest, SearchContainer.DEFAULT_DELTA, SearchContainer.DEFAULT_ORDER_BY_COL_PARAM, SearchContainer.DEFAULT_ORDER_BY_TYPE_PARAM, iteratorURL) %>" >
			<liferay-util:include page="/html/portlet/kehoachkiemdemnuoc/include_kehoachkiemdemnuoc_form.jsp" servletContext="<%=this.getServletContext() %>" />
			<liferay-ui:search-container-results>
				<%@ include file="/html/portlet/kehoachkiemdemnuoc/search_kehoachkiemdemnuoc_database_result.jspf"%>
			</liferay-ui:search-container-results>
			<liferay-ui:search-container-row className="vn.dtt.sol.ns.reporting.KeHoachKiemDemNuocReportModel" keyProperty="id" modelVar="keHoach" >
					<liferay-ui:search-container-column-text cssClass="textRight" name="STT" orderable="<%= false %>" value="<%= String.valueOf(searchContainer.getDelta()*(searchContainer.getCur()-1) +index + 1) %>" />
					<liferay-ui:search-container-column-text name="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") %>" value="<%= keHoach.getTinhThanhPho() %>" />
					<liferay-ui:search-container-column-text name="<%= LanguageUtil.get(pageContext, \"quan-huyen\") %>" value="<%= keHoach.getQuanHuyen() %>" />
					<liferay-ui:search-container-column-text cssClass="textLeft colW30" name="<%= LanguageUtil.get(pageContext, \"tram-cap-nuoc\") %>" value="<%= keHoach.getTramCapNuoc() %>" />
					<liferay-ui:search-container-column-text name="<%= LanguageUtil.get(pageContext, \"kiem-dem-vien\") %>" value="<%= keHoach.getKiemDemVien() %>" />
					<liferay-ui:search-container-column-text name="<%= LanguageUtil.get(pageContext, \"giam-sat-vien\") %>" value="<%= keHoach.getGiamSatVien() %>" />
					<liferay-ui:search-container-column-text cssClass="textRight" name="<%= LanguageUtil.get(pageContext, \"tong-dau-noi\") %>" value="<%= String.valueOf(keHoach.getTongDauNoi()) %>" />
					<liferay-ui:search-container-column-text cssClass="textCenter" name="<%= LanguageUtil.get(pageContext, \"nam-ke-hoach\") %>" value="<%= keHoach.getStt() %>" />
					<liferay-ui:search-container-column-text name="<%= LanguageUtil.get(pageContext, \"thang-thai\") %>" value="<%= LanguageUtil.get(pageContext, keHoach.getTrangThaiKeHoach()) %>" />
					<liferay-ui:search-container-column-jsp name="<%= LanguageUtil.get(pageContext, \"thao-tac\") %>" path="/html/portlet/kehoachkiemdemnuoc/entry_action.jsp" align="left"/>
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
		</liferay-ui:search-container>
	</aui:fieldset>
</aui:form>

<style>
.lfr-search-container{
margin-top: -28px !important;
}
.colW30{
width: 23%; 
}
.textCenter{
text-align: center !important; 
}
.aui select{
width:120px !important;
}
</style>
<%!
	private static Log _log = LogFactoryUtil.getLog("html.portlet.kehoachkiemdemnuoc.view.jsp");
%>