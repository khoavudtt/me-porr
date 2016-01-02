<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.DanhGiaVeSinhXaTerm"%>
<%@page import="com.liferay.util.portlet.PortletProps"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.util.MessageSuccess"%>
<%@page import="vn.dtt.sol.ns.util.MessageErrors"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.search.VeSinhMoiTruongSearch"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.search.VeSinhMoiTruongSearchTerms"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.search.VeSinhMoiTruongDisplayTerms"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocSearch"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocDisplayTerms"%>
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

	String maTinh = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_TINH);
	String maHuyen = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_HUYEN);
	String maXa = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_XA);
	String namBaoCao = (String)request.getAttribute(DanhGiaVeSinhXaTerm.NAM);
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
	List<DATAITEM> listHuyen = (List<DATAITEM>)request.getAttribute("listHuyen"); 
	List<DATAITEM> listXa = (List<DATAITEM>)request.getAttribute("listXa");
	String requiredLabel="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
	int year = Calendar.getInstance().get(Calendar.YEAR);
%>
<liferay-ui:error key="<%= MessageErrors.XOA_DANH_GIA_VE_SINH_MESSAGE %>" message="<%= MessageErrors.XOA_DANH_GIA_VE_SINH_MESSAGE %>" />
<liferay-ui:success key="<%= MessageSuccess.XOA_DANH_GIA_VE_SINH_MESSAGE %>" message="<%= MessageSuccess.XOA_DANH_GIA_VE_SINH_MESSAGE %>" />

<liferay-portlet:renderURL varImpl="searchURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>">
	<portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/view.jsp" />
</liferay-portlet:renderURL>
<aui:form action="<%= searchURL %>" method="get" name="fm2">
	<liferay-portlet:renderURLParams varImpl="searchURL" />
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<liferay-portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/view.jsp" />
		<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.NAM %>" value="<%=namBaoCao %>"></liferay-portlet:param>
	</liferay-portlet:renderURL>
	<aui:fieldset>
		<liferay-ui:search-container searchContainer="<%=new VeSinhMoiTruongSearch(renderRequest, SearchContainer.DEFAULT_DELTA, SearchContainer.DEFAULT_ORDER_BY_COL_PARAM, SearchContainer.DEFAULT_ORDER_BY_TYPE_PARAM, iteratorURL) %>" >
			<%@ include file="/html/portlet/danhgiavesinh/include_danhgiavesinh_form.jspf"%>
			<liferay-ui:search-container-results>
				<%@ include file="/html/portlet/danhgiavesinh/search_danhgiavesinh_database_result.jspf"%>
			</liferay-ui:search-container-results>
			
			<liferay-ui:search-container-row className="vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake" keyProperty="maHuyen" modelVar="veSinhXa">
			<liferay-portlet:renderURL var="viewEntryURL">
				<liferay-portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/edit_danhgiavesinh.jsp"></liferay-portlet:param>
				<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
				<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_TINH %>" value="<%=veSinhXa.getMaTinh() %>"></liferay-portlet:param>
				<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_HUYEN %>" value="<%=veSinhXa.getMaHuyen() %>"></liferay-portlet:param>
				<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.NAM %>" value="<%=String.valueOf(veSinhXa.getNam()) %>"></liferay-portlet:param>
			</liferay-portlet:renderURL>
				<liferay-ui:search-container-column-text href="<%=viewEntryURL %>" cssClass="textRight" name="STT" orderable="<%= false %>" value="<%= String.valueOf(searchContainer.getDelta()*(searchContainer.getCur()-1) +index + 1) %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL %>" cssClass="textLeft" name="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") %>" value="<%= veSinhXa.getMaTinhStr() %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL %>" cssClass="textLeft" name="<%= LanguageUtil.get(pageContext, \"quan-huyen\") %>" value="<%= veSinhXa.getMaHuyenStr()  %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL %>" cssClass="textRight" name="<%= LanguageUtil.get(pageContext, \"nam\") %>" value="<%= String.valueOf(veSinhXa.getNam())  %>" />
				<liferay-ui:search-container-column-jsp name="<%= LanguageUtil.get(pageContext, \"thao-tac\") %>" path="/html/portlet/danhgiavesinh/entry_action.jsp" align="left"/>
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator searchContainer="<%=searchContainer %>"/>
		</liferay-ui:search-container>
	</aui:fieldset>
</aui:form>


<style>
.lfr-search-container{
margin-top: -28px !important;
}
</style>
<%!
	private static Log _log = LogFactoryUtil.getLog("html.portlet.daunoinuoc.view.jsp");
%>