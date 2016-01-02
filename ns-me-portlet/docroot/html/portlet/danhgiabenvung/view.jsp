<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="vn.dtt.sol.ns.reporting.utils.ReportConstant"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.search.DanhGiaBenVungSearch"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.DanhGiaBenVungBussiness"%>
<%@page import="vn.dtt.sol.ns.util.ActionKeys"%>
<%@page import="vn.dtt.cmon.user.permission.UserMappingPermission"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.tramcap.search.TramCapNuocSearch"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
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
	String maTinh = ParamUtil.getString(request, "maTinh");
	int maTramCap = ParamUtil.getInteger(request, "tramCap");
	
	String strMaTinh = ParamUtil.getString(request, "selTinh");
	
	List<DATAITEM> listTinh = NuocSachUtils.getListTinh(user);
	
	String initTinh = NuocSachUtils.getInitLevel(user, 2);
	
	if (Validator.isNull(maTinh)) {
		maTinh = initTinh;
	}

	String orderByCol = ParamUtil.getString(request, "orderByCol", StringPool.BLANK);
	String orderByType = ParamUtil.getString(request, "orderByType", StringPool.BLANK);
	PortletURL iteratorURL = renderResponse.createRenderURL();
	SearchContainer<DanhGiaBenVung> scTramCap = new DanhGiaBenVungSearch(renderRequest, DEFAULT_DELTA, orderByCol, orderByType, iteratorURL);
	
	int cur = ParamUtil.getInteger(request, scTramCap.getCurParam(), 1);
	
	UserMapping userMapping = UserMappingBusiness.getUserMapping(user);
	

	List<TramCapNuoc> lisTramCap = DiaBanQuanLyUtils.getTramCap(user, maTinh, renderRequest.isUserInRole("Administrator"), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

	NuocSachUtils nuocSachUtil = new NuocSachUtils();
	
	Calendar cal = Calendar.getInstance();
	
	int currYear = cal.get(Calendar.YEAR);
%>

<div class="title">
	<liferay-ui:message key="danh-gia-ben-vung"/>
</div>

<liferay-portlet:renderURL var="editEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/danhgiabenvung/danhgia_benvung.jsp" />
	<portlet:param name="selTramCap" value="0"/>
	<portlet:param name="selYear" value="<%= Integer.toString(currYear) %>"/>
	<portlet:param name="redirect" value="<%= currentURL %>"/>
</liferay-portlet:renderURL>

<portlet:renderURL var="searchTramCapURL"/>

<aui:row>
	<aui:col width="20">
		<aui:select name="maTinh" showEmptyOption="<%= true %>">
			<%
				for (DATAITEM tinh : listTinh) {
			%>
				<aui:option selected="<%= initTinh.contentEquals(tinh.getNode1()) %>" value="<%= tinh.getNode1() %>"><%= tinh.getName() %></aui:option>
			<%
				}
			%>
		</aui:select>
		
	</aui:col> 
	
	<aui:col width="20">
		<div id="optTram">
			<aui:select name="tramCap">
				<%
					for (TramCapNuoc tramCap : lisTramCap) {
				%>
					<aui:option value="<%= tramCap.getId() %>"><%= tramCap.getTenTram() %></aui:option>
				<%
					}
				%>
			</aui:select>
		</div>
	</aui:col> 
	
	<aui:col width="20">
		<div class="filter-bnt">
			<aui:button  onClick='<%= renderResponse.getNamespace() + "filterDanhGia()" %>' value="search"></aui:button>
		</div>
	</aui:col>
</aui:row>

<div class="bnt-add-entry">
	<aui:button cssClass="btn-primary" href="<%= editEntryURL %>" value="add-danh-gia-ben-vung"></aui:button>
</div>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath" value="/html/portlet/danhgiabenvung/view.jsp" />
</liferay-portlet:renderURL>

<aui:form action="<%= searchURL %>" method="get" name="fm2">
	
	<liferay-portlet:renderURLParams varImpl="searchURL" />
		
	<aui:fieldset>
		<liferay-ui:search-container delta="<%= DEFAULT_DELTA %>" emptyResultsMessage="no-result-were-found">
			
			<liferay-ui:search-container-results results="<%= DanhGiaBenVungBussiness.findDanhGiaBenVung(maTinh, maTramCap, searchContainer.getStart(), searchContainer.getEnd()) %>"
								 total="<%= DanhGiaBenVungBussiness.countDanhGiaBenVung(maTinh, maTramCap) %>">

			</liferay-ui:search-container-results>

			<liferay-ui:search-container-row
	 			className="vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung"
				keyProperty="id"
				modelVar="danhGia"
			>
				<liferay-portlet:renderURL var="rowURL">
					<portlet:param name="mvcPath" value="/html/portlet/danhgiabenvung/edit_danhgia_benvung.jsp" />
					<portlet:param name="danhGiaId" value="<%=String.valueOf(danhGia.getId()) %>"/>
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
					<%= NuocSachUtils.getTinhByTram(Integer.toString(danhGia.getTramCapNuocId())) %>
				</liferay-ui:search-container-column-text>
				
				<liferay-ui:search-container-column-text
					name="tram-cap"
					href="<%= rowURL %>"
					align="left"
				>
					<%= NuocSachUtils.getTenTramByTramId(Integer.toString(danhGia.getTramCapNuocId())) %>
				</liferay-ui:search-container-column-text>
				
				<liferay-ui:search-container-column-text
					name="nam-danh-gia"
					href="<%= rowURL %>"
					property="nam"
					align="center"
				/>
				
				<liferay-ui:search-container-column-text
					name="ngay-danh-gia"
					href="<%= rowURL %>"
					align="left"
				>
					<%= dateFormatDate.format(danhGia.getNgayTao()) %>
				</liferay-ui:search-container-column-text>

				<liferay-ui:search-container-column-text
					name="ket-qua-danh-gia"
					href="<%= rowURL %>"
					align="left"
				>
					<c:choose>
						<c:when test="<%= danhGia.getKetQuaDanhGia() == 1 %>">
							<liferay-ui:message key="dat"/>
						</c:when>
						<c:otherwise>
							<liferay-ui:message key="khong-dat"/>
						</c:otherwise>
					</c:choose>
				</liferay-ui:search-container-column-text>
				
				
				<liferay-ui:search-container-column-text name="hanh-dong" cssClass="act-btn">

					<liferay-portlet:renderURL var="editDanhGiaBenVungURL">
						<portlet:param name="danhGiaId" value="<%= String.valueOf(danhGia.getId()) %>" />
						<portlet:param name="mvcPath" value="/html/portlet/danhgiabenvung/edit_danhgia_benvung.jsp"/>						
					</liferay-portlet:renderURL>

					<liferay-ui:icon
						image="edit"
						message="xua-tram-cap-nuoc"
						label="sua-danh-gia-nuoc"
						url="<%= editDanhGiaBenVungURL %>"
					/>
					
					<liferay-portlet:actionURL var="deleteDanhGiaURL" name="deleteDanhGia">
						<portlet:param name="<%= WebKeys.CURRENT_URL %>" value="<%= currentURL %>" />
						<portlet:param name="danhGiaId" value="<%= String.valueOf(danhGia.getId()) %>" />
					</liferay-portlet:actionURL>
					
					<liferay-ui:icon-delete
						message="xoa-danh-gia-ben-vung"
						confirmation="ban-co-chac-chan-muon-xoa-danh-gia-ben-vung"
						image="delete"
						url="<%= deleteDanhGiaURL %>"
					/>
				</liferay-ui:search-container-column-text>
						
				
			</liferay-ui:search-container-row>
	
			<liferay-ui:search-iterator />

		</liferay-ui:search-container>
	</aui:fieldset>
</aui:form>

<portlet:renderURL var="selectTramCapURL" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/danhgiabenvung/_select_tramcap.jsp"/>
</portlet:renderURL>

<script type="text/javascript">

	AUI().ready(function(A){
		var capTinhInput = A.one("#<portlet:namespace/>maTinh");
		var tramCapInput = A.one("#<portlet:namespace/>tramCap");
		
		var capTinhId = capTinhInput.val();
		var tramCapId = tramCapInput.val();
		
		selectTramCap(capTinhId, tramCapId);

		capTinhInput.on('change', function(){
			var capTinhId = capTinhInput.val();
			selectTramCap(capTinhId, tramCapId);
		});

	});

	
	function <portlet:namespace />filterDanhGia() {
		
		var A = AUI();
		
		var url = '<%= searchTramCapURL.toString() %>';
		
		if(A.one('#<portlet:namespace />maTinh')) {
			url += '&<portlet:namespace />maTinh=' + A.one('#<portlet:namespace />maTinh').get('value');
		}
		
		if(A.one('#<portlet:namespace/>tramCap')) {
			url += '&<portlet:namespace/>tramCap=' + A.one('#<portlet:namespace/>tramCap').get('value');
		}

		location.href = url;

	}
	
	function selectTramCap(maTinh, selTramCap){
		AUI().use('aui-base','aui-io-request', function(A){

			//aui ajax call to get updated content
			A.io.request('<%= selectTramCapURL %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />maTinh": maTinh,
					"<portlet:namespace />selTramCap": selTramCap
				},
				on: {
					success: function() {
						var optTram = A.one("#optTram");
						optTram.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
</script>

<%! private static int DEFAULT_DELTA = 20; %>