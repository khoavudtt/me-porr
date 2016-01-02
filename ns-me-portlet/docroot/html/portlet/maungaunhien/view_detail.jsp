<%@page import="vn.dtt.sol.ns.tramcap.search.VeSinhGiaDinhSearch"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="vn.dtt.sol.ns.tramcap.search.MauKiemDemSearch"%>
<%@page import="vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM"%>
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.cmon.user.dao.model.impl.UserMappingImpl"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.MauNgauNhienBusiness"%>
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

	String orderByCol = ParamUtil.getString(request, "orderByCol", StringPool.BLANK);
	String orderByType = ParamUtil.getString(request, "orderByType", StringPool.BLANK);
	PortletURL iteratorURL = renderResponse.createRenderURL();
	
	SearchContainer<VeSinhGiaDinh> scVSGD = new VeSinhGiaDinhSearch(renderRequest, DEFAULT_DELTA, orderByCol, orderByType, iteratorURL);
	
	int cur = ParamUtil.getInteger(request, scVSGD.getCurParam(), 1);
	
	int nam = ParamUtil.getInteger(request, "nam");
	String tinh = ParamUtil.getString(request, "maTinh");
	String huyen = ParamUtil.getString(request, "maHuyen");
	String xa = ParamUtil.getString(request, "maXa");

	Calendar cal = Calendar.getInstance();

	int currYear = cal.get(Calendar.YEAR);
	
	List<DATAITEM> listTinh = DATAITEMLocalServiceUtil.getByDataGroupLevel1(WebKeys.DATAGROUPID_DONVIHANHCHINH);

%>
<liferay-ui:header
	backURL='<%= ParamUtil.getString(request, "redirect") %>'
	title="xem-chi-tiet-ho-chon"
/>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath" value="/html/portlet/maungaunhien/view_detail.jsp" />
	<portlet:param name="nam" value="<%= Integer.toString(nam) %>"/>
	<portlet:param name="maTinh" value="<%= tinh %>"/>
	<portlet:param name="maHuyen" value="<%= huyen %>"/>
	<portlet:param name="maXa" value="<%= xa %>"/>
</liferay-portlet:renderURL>

<aui:form action="<%= searchURL %>" method="get" name="fm3">
	
	<liferay-portlet:renderURLParams varImpl="searchURL" />
		
	<aui:fieldset>
		<liferay-ui:search-container delta="<%= DEFAULT_DELTA %>" iteratorURL="<%= searchURL %>" emptyResultsMessage="no-result-were-found" >
			
			<liferay-ui:search-container-results results="<%= MauNgauNhienBusiness.findVSGD(tinh, huyen, xa, nam,  searchContainer.getStart(), searchContainer.getEnd()) %>"
								 total="<%= MauNgauNhienBusiness.countVSGD(tinh, huyen, xa, nam) %>">

			</liferay-ui:search-container-results>

			<liferay-ui:search-container-row
	 			className="vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh"
				keyProperty="id"
				modelVar="vsgd"
			>
				<liferay-ui:search-container-column-text
					name="stt"
					value="<%= Long.toString((index + 1) + (cur-1)*DEFAULT_DELTA) %>"
				/>

				<liferay-ui:search-container-column-text
					name="nam-chon-mmau"
					property="mauNgauNhien"
				/>

				<liferay-ui:search-container-column-text
					name="ma-tinh"
					value="<%= NuocSachUtils.getNameTinh(vsgd.getMaTinh()) %>"
				/>

				<liferay-ui:search-container-column-text
					name="ma-huyen"
					value="<%= NuocSachUtils.getNameHuyen(vsgd.getMaTinh(), vsgd.getMaHuyen()) %>"
				/>

				<liferay-ui:search-container-column-text
					name="ma-xa"
					value="<%= NuocSachUtils.getNameXa(vsgd.getMaXa()) %>"
				/>
				
				<liferay-ui:search-container-column-text
					name="thon-xom"
					property="thonXom"
				/>
				
								
				<liferay-ui:search-container-column-text
					name="ten-chu-ho"
					property="tenChuHo"
				/>
				
			</liferay-ui:search-container-row>
	
			<liferay-ui:search-iterator />

		</liferay-ui:search-container>
	</aui:fieldset>
</aui:form>

<%!
	private static final int DEFAULT_DELTA = 20;
%>