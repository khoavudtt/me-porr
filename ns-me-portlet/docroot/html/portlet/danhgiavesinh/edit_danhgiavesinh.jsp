<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewFakeLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.search.VeSinhMoiTruongSearch"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.search.VeSinhMoiTruongSearchTerms"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.search.VeSinhMoiTruongDisplayTerms"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.DanhGiaVeSinhXaTerm"%>
<%@page import="com.liferay.util.portlet.PortletProps"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.util.MessageSuccess"%>
<%@page import="vn.dtt.sol.ns.util.MessageErrors"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString"%>
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
<script type="text/javascript" src='http://maps.google.com/maps/api/js?sensor=false&libraries=places'></script>

<%
	String maTinh = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_TINH);
	String maHuyen = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_HUYEN);
	String maXa = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_XA);
	String namBaoCao = (String)request.getAttribute(DanhGiaVeSinhXaTerm.NAM);
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
	List<DATAITEM> listHuyen = (List<DATAITEM>)request.getAttribute("listHuyen"); 
	List<DATAITEM> listXa = (List<DATAITEM>)request.getAttribute("listXa");
	DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = (DanhGiaVeSinhXaNew)request.getAttribute("danhGiaVeSinhXaNew");
	String requiredLabel="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
	int year = Calendar.getInstance().get(Calendar.YEAR);
	
	List<DanhGiaVeSinhXaNewFake> listInsert = null;
	if(Validator.isNotNull(namBaoCao)){
		DanhGiaVeSinhXaNewLocalServiceUtil.initDanhGiaVeSinh(maTinh, maHuyen, Integer.valueOf(namBaoCao), Integer.valueOf(user.getUserId()+""));
	}
%>
<liferay-portlet:renderURL varImpl="redirectDanhGiaURL">
	<liferay-portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/view.jsp"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.NAM %>" value="<%=namBaoCao %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<liferay-ui:header
	backURL="<%= redirectDanhGiaURL.toString() %>"
	title='<%= (danhGiaVeSinhXaNew == null) ?"add-danh-gia-ve-sinh":"edit-danh-gia-ve-sinh" %>'
/>
<liferay-ui:error key="<%= MessageErrors.EDIT_DANH_GIA_VE_SINH_MESSAGE %>" message="<%= MessageErrors.EDIT_DANH_GIA_VE_SINH_MESSAGE %>" />
<liferay-ui:success key="<%= MessageSuccess.EDIT_DANH_GIA_VE_SINH_MESSAGE %>" message="<%= MessageSuccess.EDIT_DANH_GIA_VE_SINH_MESSAGE %>" />

<liferay-portlet:renderURL varImpl="searchURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>">
	<portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/edit_danhgiavesinh.jsp" />
</liferay-portlet:renderURL>
<aui:form action="<%= searchURL %>" method="get" name="fm2">
	<liferay-portlet:renderURLParams varImpl="searchURL" />
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<liferay-portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/edit_danhgiavesinh.jsp" />
		<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
		<liferay-portlet:param name="<%=DanhGiaVeSinhXaTerm.NAM %>" value="<%=namBaoCao %>"></liferay-portlet:param>
	</liferay-portlet:renderURL>
	<aui:fieldset>
		<liferay-ui:search-container searchContainer="<%=new VeSinhMoiTruongSearch(renderRequest, SearchContainer.DEFAULT_DELTA, SearchContainer.DEFAULT_ORDER_BY_COL_PARAM, SearchContainer.DEFAULT_ORDER_BY_TYPE_PARAM, iteratorURL) %>" >
			<%@ include file="/html/portlet/danhgiavesinh/include_danhgiavesinh_edit_form.jspf"%>
			<liferay-ui:search-container-results>
				<%@ include file="/html/portlet/danhgiavesinh/search_danhgiavesinh_edit_database_result.jspf"%>
			</liferay-ui:search-container-results>
			<liferay-ui:search-container-row className="vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake" keyProperty="id" modelVar="veSinhXa">
				<liferay-portlet:renderURL var="viewEntryURL">
					<c:choose>
						<c:when test="<%= veSinhXa.getDangKyVSTX() == 1 %>">
							<portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/edit_danhgiavesinh_detail.jsp" />
						</c:when>
						<c:otherwise>
							<portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/edit_danhgiavesinh_vstx_detail.jsp" />
						</c:otherwise>
					</c:choose>
					
					<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
					<portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_TINH%>" value="<%= maTinh %>" />
					<portlet:param name="<%=DanhGiaVeSinhXaTerm.MA_HUYEN%>" value="<%= maHuyen %>" />
					<portlet:param name="<%=DanhGiaVeSinhXaTerm.NAM%>" value="<%= namBaoCao %>" />
					<portlet:param name="<%=DanhGiaVeSinhXaTerm.ID%>" value="<%= String.valueOf(veSinhXa.getId()) %>" />
				</liferay-portlet:renderURL>
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" cssClass="textRight" name="STT" orderable="<%= false %>" value="<%= String.valueOf(searchContainer.getDelta()*(searchContainer.getCur()-1) +index + 1) %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" cssClass="textLeft" name="<%= LanguageUtil.get(pageContext, \"phuong-xa\") %>" value="<%= veSinhXa.getMaXaStr() %>" />
				<liferay-ui:search-container-column-text align="center" name="<%= LanguageUtil.get(pageContext, \"ve-sinh-toan-xa\") %>" >
					<center>
					<a href="<%=viewEntryURL.toString() %>">
					<c:choose>
						<c:when test="<%= veSinhXa.getDangKyVSTX() == 1 %>">
							<img alt="da-dang-ky-ve-sinh-toan-xa" src="<%= themeDisplay.getPathThemeImages()%>/common/checked.png">
						</c:when>
						<c:otherwise>
							<img alt="chua-dang-ky-ve-sinh-toan-xa" src="<%= themeDisplay.getPathThemeImages()%>/common/close.png">
						</c:otherwise>
					</c:choose>
					</a>
					</center>
				</liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" cssClass="textRight" name="<%= LanguageUtil.get(pageContext, \"ke-hoach-nha-tieu-xay-moi\") %>" value="<%= veSinhXa.getSoNhaTieuHVSXayMoi()+\"\"  %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" cssClass="textRight" name="<%= LanguageUtil.get(pageContext, \"so-nha-tieu-xay-moi\") %>" value="<%= veSinhXa.getSoHGDCoNhaTieu()+\"\"  %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" cssClass="textRight" name="<%= LanguageUtil.get(pageContext, \"ti-le-hgd\") %>" value="<%= veSinhXa.getTiLeHGDCoNhaTieu()+\"\"  %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" cssClass="textRight" name="<%= LanguageUtil.get(pageContext, \"ti-le-hgd-hvs\") %>" value="<%= veSinhXa.getTiLeHGDCoNhaTieuHVS()+\"\" %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" cssClass="textRight" name="<%= LanguageUtil.get(pageContext, \"ti-le-truong-hoc\") %>" value="<%= veSinhXa.getTiLeTruongHocHVS()+\"\"  %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" cssClass="textRight" name="<%= LanguageUtil.get(pageContext, \"ti-le-tram-y-te\") %>" value="<%= veSinhXa.getTiLeTramYTeHVS()+\"\"  %>" />
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator searchContainer="<%=searchContainer %>"/>
		</liferay-ui:search-container>
	</aui:fieldset>
</aui:form>


<style>
.aui .control-group{
	margin-bottom:10px  !important;
height: 55px !important;
}
.input-medium{
	max-width: 317px;
	width: 100% !important;
	margin-bottom: 0 !important;
}
.radio .form-validator-stack.help-inline{
	position: absolute !important;
	margin-top: -26px !important;
	margin-left: 15% !important;
	float: right;
    text-align: right !important;
}
.required{
display: none !important;
}
</style>