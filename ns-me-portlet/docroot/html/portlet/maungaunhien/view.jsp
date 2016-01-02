<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
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
	UserMapping userMapping = new UserMappingImpl();
		 
	UserMapping usmTmp = UserMappingBusiness.getUserMapping(user);
		 
	if (Validator.isNotNull(usmTmp)) {
		userMapping.setOrgCode1(usmTmp.getOrgCode1());
		userMapping.setOrgCode2(usmTmp.getOrgCode2());
		userMapping.setUserType(usmTmp.getUserType());
	}

	String orderByCol = ParamUtil.getString(request, "orderByCol", StringPool.BLANK);
	String orderByType = ParamUtil.getString(request, "orderByType", StringPool.BLANK);
	PortletURL iteratorURL = renderResponse.createRenderURL();
	SearchContainer<MAUKIEMDEM> scMkd = new MauKiemDemSearch(renderRequest, DEFAULT_DELTA, orderByCol, orderByType, iteratorURL);
	int cur = ParamUtil.getInteger(request, scMkd.getCurParam(), 1);
	
	int nam = ParamUtil.getInteger(request, "nam");
	String tinh = ParamUtil.getString(request, "maTinh", userMapping.getOrgCode1());
	String huyen = ParamUtil.getString(request, "maHuyen", userMapping.getOrgCode2());
	String xa = ParamUtil.getString(request, "maXa");

	Calendar cal = Calendar.getInstance();

	int currYear = cal.get(Calendar.YEAR);
	
	List<DATAITEM> listTinh = DiaBanQuanLyUtils.getTinh(user, permissionChecker.isOmniadmin(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	List<DATAITEM> listHuyen = DiaBanQuanLyUtils.getHuyen(user, tinh, 0l, permissionChecker.isOmniadmin(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	List<DATAITEM> listXa = DiaBanQuanLyUtils.getXa(user, tinh, huyen, 0l, permissionChecker.isOmniadmin(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
%>

<liferay-portlet:renderURL var="addMauNgauNhienURL">
	<portlet:param name="mvcPath" value="/html/portlet/maungaunhien/add_maungaunhien.jsp"/>
	<portlet:param name="backURL" value="<%= currentURL %>"/>
</liferay-portlet:renderURL>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath" value="/html/portlet/maungaunhien/view.jsp" />
</liferay-portlet:renderURL>

<aui:row>
	<aui:col width="20">
		<div id="optTinh">
			<aui:select name="maTinh" showEmptyOption="<%= listTinh.size() > 1 ? true : false %>">
				<%
					for (DATAITEM item : listTinh) {
				%>
					<aui:option selected="<%= usmTmp.getOrgCode1().contentEquals(item.getNode1()) %>" value="<%= item.getNode1() %>"><%= item.getName() %></aui:option>
				<%
					}
				%>
			</aui:select>
		</div>
	</aui:col>
	<aui:col width="20">
		<div id="optHuyen">
			<aui:select name="maHuyen" showEmptyOption="<%= listHuyen.size() > 1 ? true : false %>">
				<%
					for (DATAITEM item : listHuyen) {
				%>
					<aui:option value="<%= item.getNode2() %>"><%= item.getName() %></aui:option>
				<%
					}
				%>
			</aui:select>
		</div>
	</aui:col>
	<aui:col width="20">
		<div id="optXa">
			<aui:select name="maXa" showEmptyOption="<%= listXa.size() > 1 ? true : false %>">
				<%
					for (DATAITEM item : listXa) {
				%>
					<aui:option value="<%= item.getNode3() %>"><%= item.getName() %></aui:option>
				<%
					}
				%>			
			</aui:select>
		</div>
	</aui:col>
	<aui:col width="20">
		<aui:select name="nam" showEmptyOption="true">
			<%
				for (int i = 2013; i <= currYear; i++) {
			%>
				<aui:option value="<%= i %>"><%= i %></aui:option>
			<%
				}
			%>
		</aui:select>
		
	</aui:col>
	
	<aui:col width="20">
		<div class="filter-bnt">
			<aui:button value="filter" onClick="javascript:filterChonMau();"></aui:button>
		</div>	
	</aui:col>
</aui:row>

<div class="bnt-add-entry">
	<aui:button cssClass="btn-primary" href="<%= addMauNgauNhienURL %>" value="add-mau-ngau-nhien"></aui:button>
</div>

<aui:form action="<%= searchURL %>" method="get" name="fm2">
	
	<liferay-portlet:renderURLParams varImpl="searchURL" />
		
	<aui:fieldset>
		<liferay-ui:search-container delta="<%= DEFAULT_DELTA %>" emptyResultsMessage="no-result-were-found">
			
			<liferay-ui:search-container-results results="<%= MauNgauNhienBusiness.findMKD(nam, tinh, huyen, xa, searchContainer.getStart(), searchContainer.getEnd()) %>"
								 total="<%= MauNgauNhienBusiness.countMKD(nam, tinh, huyen, xa) %>">

			</liferay-ui:search-container-results>

			<liferay-ui:search-container-row
	 			className="vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM"
				keyProperty="id"
				modelVar="maukd"
			>
				<liferay-portlet:renderURL varImpl="viewDetailURL">
					<portlet:param name="mvcPath" value="/html/portlet/maungaunhien/view_detail.jsp"/>
					<portlet:param name="nam" value="<%= Integer.toString(maukd.getNam()) %>"/>
					<portlet:param name="maTinh" value="<%= maukd.getMaTinh() %>"/>
					<portlet:param name="maHuyen" value="<%= maukd.getMaHuyen() %>"/>
					<portlet:param name="maXa" value="<%= maukd.getMaXa() %>"/>
					<portlet:param name="redirect" value="<%= currentURL %>"/>
				</liferay-portlet:renderURL>
				
				<liferay-ui:search-container-column-text
					name="stt"
					value="<%= Long.toString((index + 1) + (cur-1)*DEFAULT_DELTA) %>"
					href="<%= viewDetailURL %>"
				/>

				<liferay-ui:search-container-column-text
					name="nam"
					property="nam"
					href="<%= viewDetailURL %>"
				/>

				<liferay-ui:search-container-column-text
					name="ma-tinh"
					value="<%= NuocSachUtils.getNameTinh(maukd.getMaTinh()) %>"
					href="<%= viewDetailURL %>"
				/>

				<liferay-ui:search-container-column-text
					name="ma-huyen"
					value="<%= NuocSachUtils.getNameHuyen(maukd.getMaTinh(), maukd.getMaHuyen()) %>"
					href="<%= viewDetailURL %>"
				/>

				<liferay-ui:search-container-column-text
					name="ma-xa"
					value="<%= NuocSachUtils.getNameXa(maukd.getMaXa()) %>"
					href="<%= viewDetailURL %>"
				/>
				
				<liferay-ui:search-container-column-text
					name="tong-so-mau"
					property="soMauNgauNhien"
					href="<%= viewDetailURL %>"
				/>
				
			</liferay-ui:search-container-row>
	
			<liferay-ui:search-iterator />

		</liferay-ui:search-container>
	</aui:fieldset>
</aui:form>

<portlet:renderURL var="selectTinh" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/maungaunhien/_select_huyen.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/maungaunhien/_select_xa.jsp"/>
</portlet:renderURL>

<style>
<!--
.bnt-add-entry {
	margin-bottom: 10px;
}
-->
</style>

<script type="text/javascript">
	AUI().ready(function(A){
		
		var capTinhInput = A.one("#<portlet:namespace/>maTinh");
		var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");
		
		selectTinh();
		selectHuyen();
		
		capTinhInput.on('change', function(){
			selectTinh();
		});
		
		capHuyenInput.on('change', function(){
			selectHuyen();
		});
	});
	
	function filterChonMau() {
		
		var A = AUI();
		
		var url = '<%= searchURL.toString() %>';
		
		if(A.one('#<portlet:namespace />maTinh')) {
			url += '&<portlet:namespace />maTinh=' + A.one('#<portlet:namespace />maTinh').get('value');
		}
		
		if(A.one('#<portlet:namespace/>maHuyen')) {
			url += '&<portlet:namespace/>maHuyen=' + A.one('#<portlet:namespace/>maHuyen').get('value');
		}
		
		if(A.one('#<portlet:namespace/>maXa')) {
			url += '&<portlet:namespace/>maXa=' + A.one('#<portlet:namespace/>maXa').get('value');
		}

		if(A.one('#<portlet:namespace/>nam')) {
			url += '&<portlet:namespace/>nam=' + A.one('#<portlet:namespace/>nam').get('value');
		}

		location.href = url;
	}

	function selectTinh(){
		AUI().use('aui-base','aui-io-request', function(A){
			var capTinhInput = A.one("#<portlet:namespace/>maTinh");
			var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");
			var capXaInput = A.one("#<portlet:namespace/>maXa");

			//aui ajax call to get updated content
			A.io.request('<%= selectTinh %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />capTinhId": capTinhInput.val(),
					"<portlet:namespace />capHuyenId": capHuyenInput.val(),
					"<portlet:namespace />capXaId": capXaInput.val()
				},
				on: {
					success: function() {
						var optHuyen = A.one("#optHuyen");
						optHuyen.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
	
	function selectHuyen(){
		AUI().use('aui-base','aui-io-request', function(A){
			var capTinhInput = A.one("#<portlet:namespace/>maTinh");
			var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");
			var capXaInput = A.one("#<portlet:namespace/>maXa");

			//aui ajax call to get updated content
			A.io.request('<%= selectHuyen %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />capTinhId": capTinhInput.val(),
					"<portlet:namespace />capHuyenId": capHuyenInput.val(),
					"<portlet:namespace />capXaId": capXaInput.val()
				},
				on: {
					success: function() {
						var optXa = A.one("#optXa");
						optXa.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
</script>

<%!
	private static final int DEFAULT_DELTA = 20;
%>