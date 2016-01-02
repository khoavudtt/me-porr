<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.cmon.user.dao.service.UserHuyenLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
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
	UserMapping userMapping = UserMappingBusiness.getUserMapping(user);
	
	String maTinh = userMapping.getOrgCode1();
%>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath" value='<%= templatePath + "view_type/3.jsp" %>'/>
</liferay-portlet:renderURL>

<div class="header-kdv">
	<liferay-ui:message key="danh-sach-kiem-dem-vien-ve-sinh"/>
</div>

<aui:form action="<%= searchURL %>" method="get" name="fm2">
	
	<liferay-portlet:renderURLParams varImpl="searchURL" />
		
	<aui:fieldset>
		<liferay-ui:search-container delta="<%= 20 %>" emptyResultsMessage="no-result-were-found">
			
			<liferay-ui:search-container-results results="<%= DiaBanQuanLyUtils.getListHuyenGS(user, maTinh, searchContainer.getStart(), searchContainer.getEnd()) %>"
								 total="<%= DiaBanQuanLyUtils.countHuyenByUser(user, maTinh) %>">

			</liferay-ui:search-container-results>

			<liferay-ui:search-container-row
	 			className="vn.dtt.cmon.dm.dao.model.DATAITEM"
				keyProperty="id"
				modelVar="huyen"
			>
				<liferay-portlet:renderURL var="rowURL">
					<portlet:param name="mvcPath" value='<%= templatePath + "view_kdv_nuoc_by_huyen.jsp" %>'/>
					<portlet:param name="maTinh" value="<%=maTinh %>"/>
					<portlet:param name="maHuyen" value="<%=huyen.getNode2() %>"/>
					<portlet:param name="tenHuyen" value="<%= huyen.getName() %>"/>
					<portlet:param name="currentURL" value="<%= currentURL %>"/>
					<portlet:param name="capHoatDong" value="2"/>
				</liferay-portlet:renderURL>
				

				<liferay-ui:search-container-column-text
					name="ten-huyen"
					href="<%= rowURL %>"
				>

					<%= huyen.getName() %>
				</liferay-ui:search-container-column-text>
				
				<liferay-ui:search-container-column-text
					name="so-kdv"
					href="<%= rowURL %>"
					align="left"
					cssClass="col-small"
				>
					<%= KiemDemVienLocalServiceUtil.countCTHTT("2", maTinh, huyen.getNode2(), -1l) %>
				</liferay-ui:search-container-column-text>
				
				<liferay-ui:search-container-column-text
					name="so-gsv"
					href="<%= rowURL %>"
					align="left"
					cssClass="col-small"
				>
					<%= UserHuyenLocalServiceUtil.getGSVInHuyen(maTinh, huyen.getNode2(), QueryUtil.ALL_POS, QueryUtil.ALL_POS).size() %>
				</liferay-ui:search-container-column-text>
				
			</liferay-ui:search-container-row>
	
			<liferay-ui:search-iterator />

		</liferay-ui:search-container>
	</aui:fieldset>
</aui:form>
