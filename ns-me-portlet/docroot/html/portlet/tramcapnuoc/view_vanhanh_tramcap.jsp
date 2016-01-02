<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.util.ActionKeys"%>
<%@page import="vn.dtt.cmon.user.permission.UserMappingPermission"%>
<%@page import="vn.dtt.sol.ns.tramcap.search.DanhGiaVanHanhSearch"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.DanhGiaVanHanhBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="com.liferay.util.PwdGenerator"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.sol.ns.business.DataGroupBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAGROUP"%>
<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Organization"%>
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

<script type="text/javascript" src='http://maps.google.com/maps/api/js?sensor=false&libraries=places'></script>

<%@include file="/init.jsp" %>

<%
	long tramCapId = ParamUtil.getLong(request, "tramCapId");
	
	TramCapNuoc tramCap = null;
	
	if (tramCapId > 0) {
		tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(tramCapId);
	}
	
	String orderByCol = ParamUtil.getString(request, "orderByCol", StringPool.BLANK);
	String orderByType = ParamUtil.getString(request, "orderByType", StringPool.BLANK);
		
	PortletURL iteratorURL = renderResponse.createRenderURL();
	
	SearchContainer<DanhGiaVanHanh> searchContainerDGVH = new DanhGiaVanHanhSearch(renderRequest, DEFAULT_DELTA, orderByCol, orderByType, iteratorURL);
	
	Calendar cal = Calendar.getInstance();
	
	int currYear = cal.get(Calendar.YEAR);
	
	int selYear = ParamUtil.getInteger(request, "selYear", currYear);

	int delta = ParamUtil.getInteger(request, searchContainerDGVH.getDeltaParam(), DEFAULT_DELTA);
	int cur = ParamUtil.getInteger(request, searchContainerDGVH.getCurParam(), 1);

%>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/view_vanhanh_tramcap.jsp" />
</liferay-portlet:renderURL>

<liferay-portlet:actionURL var="danhGiaVanHanhURL" name="editVanHanh">
	<portlet:param name="tramCapId" value="<%= Long.toString(tramCapId) %>"/>
</liferay-portlet:actionURL>
	


<c:choose>
	<c:when test="<%= Validator.isNotNull(tramCap) %>">
		<div class="title">
			<%= tramCap.getTenTram() %>
		</div>
		
		<liferay-util:include page='<%= templatePath + "top_tabs_tramcap.jsp" %>' servletContext="<%= application %>" />
		
		<aui:form cssClass="select_form">
			<aui:select name="selYear" label="">
					<%			
						for (int j = 2010; j <= currYear ; j++) {
					%>
							<aui:option selected="<%= j == currYear ? true : false %>" value="<%= j %>"><%= j %></aui:option>
					<%
						}
					%>
			</aui:select>
		</aui:form>
		<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId, ActionKeys.ADMIN_VANHANH) %>">
			<div class="bnt-add-entry">
				<aui:row>
					<aui:button href="<%= danhGiaVanHanhURL %>" cssClass="btn-primary" value="danh-gia-van-hanh"/>
				</aui:row>
			</div>
		</c:if>
		<aui:form action="<%= searchURL %>" method="get" name="fm2">
			<liferay-portlet:renderURLParams varImpl="searchURL" />
				
			<aui:fieldset>
				<liferay-ui:search-container delta="15" emptyResultsMessage="no-result-were-found">
					
					<liferay-ui:search-container-results results="<%=  DanhGiaVanHanhBusiness.findDanhGia((int)tramCapId, selYear, searchContainer.getStart(), searchContainer.getEnd()) %>"
										 total="<%= DanhGiaVanHanhBusiness.countDanhGia((int)tramCapId, selYear) %>">
		
					</liferay-ui:search-container-results>
		
					<liferay-ui:search-container-row
			 			className="vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh"
						keyProperty="id"
						modelVar="danhGia"
					>
						<liferay-portlet:actionURL var="editVanHanhURL" name="editVanHanh">
							<portlet:param name="tramCapId" value="<%= String.valueOf(tramCapId) %>" />
							<portlet:param name="danhGiaId" value="<%= String.valueOf(danhGia.getId()) %>" />
							<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/edit_vanhanh_tramcap.jsp"/>
						</liferay-portlet:actionURL>
						
						<liferay-ui:search-container-column-text
							name="stt"
							orderable="<%= false %>"
							value="<%= Long.toString((index + 1) + (cur-1)*DEFAULT_DELTA) %>"
							href="<%= editVanHanhURL %>"
							align="center"
						/>
						<liferay-ui:search-container-column-text
							name="thang"
							href="<%= editVanHanhURL %>"
							align="center"
						/>

						<liferay-ui:search-container-column-text
							name="nam"
							property="nam"
							href="<%= editVanHanhURL %>"
							align="center"
						/>
						
						
						<liferay-ui:search-container-column-text
							name="cong-xuat"
							href="<%= editVanHanhURL %>"
						>
							<%= NuocSachUtils.formatNumber(danhGia.getCongXuatThucTe()) %>
						</liferay-ui:search-container-column-text>
						
						<liferay-ui:search-container-column-text
							name="ti-le-that-thoat"
							href="<%= editVanHanhURL %>"
						>
								<%= danhGia.getNuocThatThoat() + StringPool.SPACE + StringPool.PERCENT %>
						</liferay-ui:search-container-column-text>
						
						<liferay-ui:search-container-column-text
							name="tong-chi-vnd"
							href="<%= editVanHanhURL %>"
						>
								<%= NuocSachUtils.formatNumber(danhGia.getChiPhiDien() + danhGia.getChiPhiHoaChat() + danhGia.getChiPhiSuaChua() + danhGia.getLuongNhanVien()) %>
						</liferay-ui:search-container-column-text>
						
						<liferay-ui:search-container-column-text
							name="tong-thu-vnd"
							href="<%= editVanHanhURL %>">
								<%= NuocSachUtils.formatNumber(danhGia.getDoanhThu()) %>
						</liferay-ui:search-container-column-text>

						</liferay-ui:search-container-row>
			
					<liferay-ui:search-iterator />
		
				</liferay-ui:search-container>
			</aui:fieldset>
		</aui:form>

	</c:when>	
	
	<c:otherwise>
		<liferay-ui:message key="thong-tin-tram-cap-khong-ton-tai"/>
	</c:otherwise>
</c:choose>

<%!
	private static final int DEFAULT_DELTA = 15;
%>
