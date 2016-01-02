<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="vn.dtt.cmon.user.permission.UserNSPermission"%>
<%@page import="com.sun.corba.se.spi.servicecontext.UEInfoServiceContext"%>
<%@page import="vn.dtt.sol.ns.util.ActionKeys"%>
<%@page import="vn.dtt.cmon.user.permission.UserMappingPermission"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.tramcap.search.TramCapNuocSearch"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.LSTORE"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.DauNoiNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
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

<%@include file="/init.jsp" %>

<%
	String keyword = ParamUtil.getString(request, "keyword");
	String maTinh = ParamUtil.getString(request, "maTinh", StringPool.BLANK);
	String orderByCol = ParamUtil.getString(request, "orderByCol", StringPool.BLANK);
	String orderByType = ParamUtil.getString(request, "orderByType", StringPool.BLANK);

	String initTinh = NuocSachUtils.getInitLevel(user, 2);
	
	if (Validator.isNull(maTinh)) {
		maTinh = initTinh;
	}

	PortletURL iteratorURL = renderResponse.createRenderURL();
	
	List<DATAITEM> listTinh = NuocSachUtils.getListTinh(user);
	
	SearchContainer<TramCapNuoc> scTramCap = new TramCapNuocSearch(renderRequest, DEFAULT_DELTA, orderByCol, orderByType, iteratorURL);
		 
	int cur = ParamUtil.getInteger(request, scTramCap.getCurParam(), 1);
	
	UserMapping userMapping = UserMappingBusiness.getUserMapping(user);

	
	if(Validator.isNull(maTinh) && Validator.isNotNull(userMapping)) {
		maTinh = userMapping.getOrgCode1();
	}

	NuocSachUtils nuocSachUtil = new NuocSachUtils();
	

%>

<liferay-portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/edit_tramcap.jsp" />
	<portlet:param name="redirect" value="<%= currentURL %>"/>
</liferay-portlet:renderURL>



<portlet:renderURL var="searchTramCapURL"/>

<aui:form action="<%= searchTramCapURL %>" method="post" name="fm">
	<aui:row>
		<aui:col width="20">
			<aui:select name="maTinh"
				onChange=''
				label="tinh" showEmptyOption="true" inlineField="<%= true %>" 
				disabled="<%= (Validator.isNotNull(userMapping) && userMapping.getUserType() != 1) ? true : false %>">
				<%
					for (DATAITEM tinh : listTinh)
					{
				%>
						<aui:option selected="<%= Validator.isNotNull(userMapping) && userMapping.getOrgCode1().contentEquals(tinh.getNode1()) ? true : false %>" value="<%= tinh.getNode1() %>">
							<%= tinh.getName() %>
						</aui:option>
				<%
					}
				%>
			</aui:select>
		</aui:col>
		<aui:col width="20">
			<div class="filter-bnt">
				<aui:button onClick='<%= renderResponse.getNamespace() + "fitterTramCap()" %>' value="filter"></aui:button>
			</div>
		</aui:col>
	</aui:row>
</aui:form>

<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId, ActionKeys.ADMIN_TRAM_CAP) %>">
	<div class="bnt-add-entry">
		<aui:button cssClass="btn-primary" href="<%= editEntryURL.toString() %>" value="them-tram-cap"/>
	</div>
</c:if>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/view.jsp" />
</liferay-portlet:renderURL>

<liferay-ui:error key="tram-cap-da-chua-dau-noi" message="tram-cap-da-chua-dau-noi" />
<liferay-ui:error key="khong-xoa-duoc-tram-cap-vui-long-thu-lai" message="khong-xoa-duoc-tram-cap-vui-long-thu-lai" />

<aui:form action="<%= searchURL %>" method="get" name="fm2">
	
	<liferay-portlet:renderURLParams varImpl="searchURL" />
		
	<aui:fieldset>
		<liferay-ui:search-container delta="<%= DEFAULT_DELTA %>" emptyResultsMessage="no-result-were-found">
			
			<liferay-ui:search-container-results results="<%= DiaBanQuanLyUtils.getTramCap(user, maTinh, permissionChecker.isOmniadmin() , searchContainer.getStart(), searchContainer.getEnd()) %>"
								 total="<%= DiaBanQuanLyUtils.getTramCap(user, maTinh, permissionChecker.isOmniadmin() , searchContainer.getStart(), searchContainer.getEnd()).size() %>">

			</liferay-ui:search-container-results>

			<liferay-ui:search-container-row
	 			className="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"
				keyProperty="id"
				modelVar="tramCap"
			>
				<liferay-portlet:renderURL var="rowURL">
					<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/view_detail.jsp" />
					<portlet:param name="tramCapId" value="<%=String.valueOf(tramCap.getId()) %>"/>
					<portlet:param name="currentURL" value="<%= currentURL %>"/>
				</liferay-portlet:renderURL>
				
				<liferay-ui:search-container-column-text
					name="stt"
					orderable="<%= false %>"
					value="<%= Long.toString((index + 1) + (cur-1)*DEFAULT_DELTA) %>"
					valign="center"
				/>

				<liferay-ui:search-container-column-text
					name="tinh"
					href="<%= rowURL %>"
					align="left"
				>

					<%= nuocSachUtil.getNameTinh(tramCap.getMaTinh()) %>
				</liferay-ui:search-container-column-text>
				
				<liferay-ui:search-container-column-text
					name="huyen"
					href="<%= rowURL %>"
					align="left"
				>
					<%= nuocSachUtil.getNameHuyen(tramCap.getMaTinh(), tramCap.getMaHuyen()) %>
				</liferay-ui:search-container-column-text>
				
				<liferay-ui:search-container-column-text
					name="name"
					href="<%= rowURL %>"
					property="tenTram"
					align="left"
				/>
				
				<liferay-ui:search-container-column-text
					name="trang-thai-cap-nuoc"
					href="<%= rowURL %>"
					align="left"
				>
					<liferay-ui:message key='<%= "tinh-trang-du-an-" + tramCap.getTinhTrangDuAn() %>'></liferay-ui:message>
				</liferay-ui:search-container-column-text>

				<liferay-ui:search-container-column-text
					name="tong-so-dau-noi"
					href="<%= rowURL %>"
					cssClass="col-right"
				>
					<%= NuocSachUtils.formatNumber(DauNoiNuocBusiness.countDauNoiByTram(tramCap.getId())) %>
				</liferay-ui:search-container-column-text>
				
				<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId, ActionKeys.ADMIN_TRAM_CAP) %>">
				
					<liferay-ui:search-container-column-text name="hanh-dong" cssClass="act-btn">
						
						<liferay-portlet:renderURL var="viewEntryURL">
							<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/view_detail.jsp" />
							<portlet:param name="tramCapId" value="<%= String.valueOf(tramCap.getId()) %>" />
						</liferay-portlet:renderURL>
						
						<liferay-ui:icon
							image="view"
							label="xem-chi-tiet-tram-cap"
							url="<%= viewEntryURL %>"
							message="xem-chi-tiet-tram-cap"
						/>
						
						<liferay-portlet:actionURL var="editTramCapURL" name="editTramCap" >
							<portlet:param name="tramCapId" value="<%= String.valueOf(tramCap.getId()) %>" />
						</liferay-portlet:actionURL>
						
						<liferay-ui:icon
							image="edit"
							message="xua-tram-cap-nuoc"
							label="xua-tram-cap-nuoc"
							url="<%= editTramCapURL %>"
						/>
						
						<liferay-portlet:actionURL var="deleteTramCapURL" name="deleteTramCap">
							<portlet:param name="<%= WebKeys.CURRENT_URL %>" value="<%= currentURL %>" />
							<portlet:param name="tramCapId" value="<%= String.valueOf(tramCap.getId()) %>" />
						</liferay-portlet:actionURL>
						
						<liferay-ui:icon-delete
							message="xoa-tram-cap-nuoc"
							confirmation="ban-co-chac-chan-muon-xoa-tram-cap-nuoc-nay"
							image="delete"
							url="<%= deleteTramCapURL %>"
						/>
					</liferay-ui:search-container-column-text>
						
				</c:if>
				
			</liferay-ui:search-container-row>
	
			<liferay-ui:search-iterator />

		</liferay-ui:search-container>
	</aui:fieldset>
</aui:form>

<style>
<!--
.col-right {
	text-align: right !important;
}
-->
</style>

<script type="text/javascript">
	function <portlet:namespace />fitterTramCap() {
		
		var A = AUI();
		
		var url = '<%= searchTramCapURL.toString() %>';
		
		if(A.one('#<portlet:namespace />maTinh')) {
			url += '&<portlet:namespace />maTinh=' + A.one('#<portlet:namespace />maTinh').get('value');
		}
		
		location.href = url;
	}
</script>

<%! private static int DEFAULT_DELTA = 20; %>

