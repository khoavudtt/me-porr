<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhCongTrinhTerms"%>
<%@page import="com.liferay.util.portlet.PortletProps"%>
<%@page import="vn.dtt.sol.ns.util.MessageSuccess"%>
<%@page import="vn.dtt.sol.ns.util.MessageErrors"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.search.VeSinhMoiTruongSearch"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.search.VeSinhMoiTruongSearchTerms"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.search.VeSinhMoiTruongDisplayTerms"%>
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
	
	String maTinh = (String)request.getAttribute(VeSinhCongTrinhTerms.MA_TINH);
	String maHuyen = (String)request.getAttribute(VeSinhCongTrinhTerms.MA_HUYEN);
	String maXa = (String)request.getAttribute(VeSinhCongTrinhTerms.MA_XA);
	String loaiNhaTieu = (String)request.getAttribute(VeSinhCongTrinhTerms.LOAI_NHA_TIEU);
	String loaiCongTrinh = (String)request.getAttribute(VeSinhCongTrinhTerms.LOAI_CONG_TRINH);
	String trangThai = (String)request.getAttribute(VeSinhCongTrinhTerms.TRANG_THAI);
	String namBaoCao = (String)request.getAttribute(VeSinhCongTrinhTerms.NAM_BAO_CAO);
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
	List<DATAITEM> listHuyen = (List<DATAITEM>)request.getAttribute("listHuyen"); 
	List<DATAITEM> listXa = (List<DATAITEM>)request.getAttribute("listXa");
%>

<liferay-ui:error key="<%= MessageErrors.XOA_DAU_NOI_MESSAGE %>" message="<%= MessageErrors.XOA_DAU_NOI_MESSAGE %>" />
<liferay-ui:success key="<%= MessageSuccess.XOA_DAU_NOI_MESSAGE %>" message="<%= MessageSuccess.XOA_DAU_NOI_MESSAGE %>" />
<liferay-portlet:renderURL varImpl="searchURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/view.jsp" />
</liferay-portlet:renderURL>
<aui:form action="<%= searchURL %>" method="get" name="fm2">
	<liferay-portlet:renderURLParams varImpl="searchURL" />
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<liferay-portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/view.jsp" />
		<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.LOAI_NHA_TIEU %>" value="<%=loaiNhaTieu %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
	</liferay-portlet:renderURL>
	<aui:fieldset>
		<liferay-ui:search-container searchContainer="<%=new VeSinhMoiTruongSearch(renderRequest, SearchContainer.DEFAULT_DELTA, SearchContainer.DEFAULT_ORDER_BY_COL_PARAM, SearchContainer.DEFAULT_ORDER_BY_TYPE_PARAM, iteratorURL) %>" >
			<%@ include file="/html/portlet/vesinhcongtrinh/include_congtrinh_form.jspf"%>
			<liferay-ui:search-container-results>
				<%@ include file="/html/portlet/vesinhcongtrinh/search_congtrinh_database_result.jspf"%>
			</liferay-ui:search-container-results>
			<liferay-ui:search-container-row className="vn.dtt.sol.ns.reporting.CongTrinhReportModel" keyProperty="id" modelVar="dauNoi">
				<liferay-ui:search-container-column-text cssClass="textRight" name="STT" orderable="<%= false %>" value="<%= String.valueOf(searchContainer.getDelta()*(searchContainer.getCur()-1) +index + 1) %>" />
				<liferay-ui:search-container-column-text cssClass="textLeft" name="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") %>" value="<%= dauNoi.getTinhThanh() %>" />
				<liferay-ui:search-container-column-text cssClass="textLeft" name="<%= LanguageUtil.get(pageContext, \"quan-huyen\") %>" value="<%= dauNoi.getQuanHuyen() %>" />
				<liferay-ui:search-container-column-text cssClass="textLeft" name="<%= LanguageUtil.get(pageContext, \"phuong-xa\") %>" value="<%= dauNoi.getPhuongXa() %>" />
				<liferay-ui:search-container-column-text cssClass="textLeft" name="<%= LanguageUtil.get(pageContext, \"dia-chi\") %>" value="<%= dauNoi.getDiaChi() %>" />
				<liferay-ui:search-container-column-text cssClass="textLeft" name="<%= LanguageUtil.get(pageContext, \"ten-cong-trinh\") %>" value="<%= dauNoi.getTenCongTrinh() %>" />
				<liferay-ui:search-container-column-text cssClass="textLeft" name="<%= LanguageUtil.get(pageContext, \"thang-thai\") %>" value="<%= LanguageUtil.get(pageContext, dauNoi.getTrangThai()) %>" />
				<liferay-ui:search-container-column-text cssClass="textRight" name="<%= LanguageUtil.get(pageContext, \"nam-bao-cao\") %>" value="<%= LanguageUtil.get(pageContext, (dauNoi.getNamBaoCao().equals(\"0\"))?\"nam-bao-cao-0\":dauNoi.getNamBaoCao()) %>" />
				<liferay-ui:search-container-column-jsp name="<%= LanguageUtil.get(pageContext, \"thao-tac\") %>" path="/html/portlet/vesinhcongtrinh/entry_action.jsp" align="left"/>
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