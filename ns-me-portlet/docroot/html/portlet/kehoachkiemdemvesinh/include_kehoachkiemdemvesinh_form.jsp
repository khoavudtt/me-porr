<%@page import="vn.dtt.cmon.user.permission.UserNSPermission"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.KeHoachKiemDemVeSinhTerms"%>
<%@page import="vn.dtt.sol.ns.util.ActionKeys"%>
<%@page import="vn.dtt.cmon.user.permission.UserMappingPermission"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocSearchTerms"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocSearch"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

		String maTinh = (String)request.getAttribute(KeHoachKiemDemVeSinhTerms.MA_TINH);
		String maHuyen = (String)request.getAttribute(KeHoachKiemDemVeSinhTerms.MA_HUYEN);
		String kiemDemVienId = (String)request.getAttribute(KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID);
		String trangThai = (String)request.getAttribute("trangThai");
		 List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
		 List<DATAITEM> listHuyen = (List<DATAITEM>)request.getAttribute("listHuyen");
		 List<KiemDemVien> listKiemDemVien = new ArrayList<KiemDemVien>(); 
		 listKiemDemVien = (List<KiemDemVien>)request.getAttribute("listKiemDemVien");
		 List<UserMapping> listUserBySearch = (List<UserMapping>)request.getAttribute("listUserBySearch");
		 String requiredLabel="";
		 requiredLabel ="*";
		 String dotLabel=":";
%>
<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/_select_huyen.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="selectKiemDem" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/_select_kiem_dem_vien.jsp"/>
</portlet:renderURL>
<liferay-portlet:renderURL varImpl="themDauNoiNuocURL">
	<liferay-portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/edit_kehoachkiemdemvesinh.jsp"></liferay-portlet:param>
	<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/view.jsp" />
</liferay-portlet:renderURL>
<aui:fieldset>
<aui:column>
<aui:select name="maTinh" id="maTinh" label="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") + dotLabel %>" showEmptyOption="<%= false %>">
					<aui:option value=""><liferay-ui:message key="-chon-tat-ca-"></liferay-ui:message></aui:option>
					<%
						for (DATAITEM tinh : listTinh) {
					%>
						<aui:option value="<%= tinh.getNode1() %>"><%= tinh.getName() %></aui:option>
					<%
						}
					%>
				</aui:select>
</aui:column>
<aui:column>
<div id="optHuyen">
					<aui:select cssClass="input1001" showRequiredLabel="<%=false %>"  name="<%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>"  id="<%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>" label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") +\"\"+dotLabel %>" showEmptyOption="<%= false %>"  onChange="javascript:selectXa();" >
						<aui:option value=""><liferay-ui:message key="-chon-tat-ca-"></liferay-ui:message></aui:option>
						<%
							for (DATAITEM huyen : listHuyen) {
						%>
						<aui:option value="<%= huyen.getNode2() %>"><%= huyen.getName() %></aui:option>
						<%
							}
						%>
					</aui:select>
				</div>
</aui:column>
	<aui:column>
	<div id="kiemDemCbx">
	<aui:select name="<%=KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID %>" id="<%=KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID %>" label="<%= LanguageUtil.get(pageContext, \"kiem-dem-vien\") + dotLabel %>" showEmptyOption="<%= false %>">
						<aui:option value=""><liferay-ui:message key="-chon-tat-ca-"></liferay-ui:message></aui:option>
					<%
						for (KiemDemVien kiemDemVien : listKiemDemVien) {
					%>
						<aui:option value="<%= kiemDemVien.getId() %>"><%= kiemDemVien.getHoVaTen() %></aui:option>
					<%
						}
					%>
					</aui:select>
					</div>
	</aui:column>
	<aui:column>
		<aui:select name="idNguoiTao"  label="<%= LanguageUtil.get(pageContext, \"nguoi-tao\") + dotLabel %>" showEmptyOption="<%= false %>">
			<aui:option value=""><liferay-ui:message key="-chon-tat-ca-"></liferay-ui:message></aui:option>
			<%
				User userEtt = null;
				for(int i = 0 ; i < listUserBySearch.size(); i++){
					userEtt = UserLocalServiceUtil.fetchUser(listUserBySearch.get(i).getUserId());
					if(Validator.isNotNull(userEtt)){
			%>
				<aui:option value="<%=listUserBySearch.get(i).getUserId() %>"><%=userEtt.getEmailAddress() %> - <%=listUserBySearch.get(i).getName() %></aui:option>
			<%} } %>
		</aui:select>
	</aui:column>
	<aui:column>
					
					<aui:select name="trangThai"  id="trangThai" label="<%= LanguageUtil.get(pageContext, \"thang-thai\") + dotLabel %>" showEmptyOption="<%= false %>">
						<aui:option value=""><liferay-ui:message key="-chon-tat-ca-"></liferay-ui:message></aui:option>
						<aui:option value="0"><liferay-ui:message key="trang-thai-ke-hoach-0"></liferay-ui:message></aui:option>
						<aui:option value="1"><liferay-ui:message key="trang-thai-ke-hoach-1"></liferay-ui:message></aui:option>
						<aui:option value="2"><liferay-ui:message key="trang-thai-ke-hoach-2"></liferay-ui:message></aui:option>
					</aui:select>
	</aui:column>

	<aui:column>
	<aui:button cssClass="btnTop" type="button" value="tim-kiem"  onClick='<%= renderResponse.getNamespace() + \"fitterALL()\" %>'></aui:button>
	</aui:column>

</aui:fieldset>
<c:if test="<%= UserMappingPermission.contains(permissionChecker, scopeGroupId, ActionKeys.ADMIN_VESINH) %>">
	<aui:button-row>
		<aui:button cssClass="btn-primary" type="button" value="them-moi-ke-hoach"  onClick='<%= renderResponse.getNamespace() + "themKeHoachKiemDemVeSinhOnClick()" %>'></aui:button>
	</aui:button-row>
</c:if>
<script type="text/javascript">
	//fitter list
	function <portlet:namespace />fitterALL() {
		var A = AUI();
// 		imPortTuExcelURL
		var url = '<%=searchURL.toString() %>';
		
		if(A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_TINH%>')) {
			url += '&<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_TINH%>=' + A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_TINH%>').get('value');
		}
		if(A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN%>')) {
			url += '&<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN%>=' + A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN%>').get('value');
		}
		if(A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID %>')) {
			url += '&<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID %>=' + A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID %>').get('value');
		}
		if(A.one('#<portlet:namespace />trangThai')) {
			url += '&<portlet:namespace />trangThai=' + A.one('#<portlet:namespace />trangThai').get('value');
		}
		if(A.one('#<portlet:namespace />idNguoiTao')) {
			url += '&<portlet:namespace />idNguoiTao=' + A.one('#<portlet:namespace />idNguoiTao').get('value');
		}
		location.href = url;
	}

	function <portlet:namespace />themKeHoachKiemDemVeSinhOnClick() {
		var A = AUI();
//	 		imPortTuExcelURL
			var url = '<%=themDauNoiNuocURL.toString() %>';
			
			if(A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_TINH%>')) {
				url += '&<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_TINH%>=' + A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_TINH%>').get('value');
			}
			if(A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN%>')) {
				url += '&<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN%>=' + A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN%>').get('value');
			}
			if(A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID %>')) {
				url += '&<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID %>=' + A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID %>').get('value');
			}
			if(A.one('#<portlet:namespace />trangThai')) {
				url += '&<portlet:namespace />trangThai=' + A.one('#<portlet:namespace />trangThai').get('value');
			}
			
			location.href = url;
	}
	AUI().ready(function(A){
		var capTinhInput = A.one("#<portlet:namespace/><%=KeHoachKiemDemVeSinhTerms.MA_TINH %>");
		var capHuyenInput = A.one("#<portlet:namespace/><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>");
		capTinhInput.on('change', function(){
			var capTinhId = capTinhInput.val();
			var capHuyenId = capHuyenInput.val();
			selectHuyen(capTinhId, capHuyenId);
			selectKiemDemVien();
		});
	});
	function selectHuyen(capTinhId, capHuyenId){
		AUI().use('aui-base','aui-io-request', function(A){

			//aui ajax call to get updated content
			A.io.request('<%= selectHuyen %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />capTinhId": capTinhId,
					"<portlet:namespace />capHuyenId": capHuyenId
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

	function selectXa(){
		AUI().use('aui-base','aui-io-request', function(A){
			var capTinhInput = A.one("#<portlet:namespace/><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>");
			//aui ajax call to get updated content
			var idToTramCap = 0;
			var typeKiemDem = 1;
			if(capTinhInput.val()>0){
				idToTramCap = capTinhInput.val();
				typeKiemDem =2;
			}
			A.io.request('<%= selectKiemDem %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />tramCapIdAjax": idToTramCap,
					"<portlet:namespace />typeKiemDem": typeKiemDem
				},
				on: {
					success: function() {
						var optHuyen = A.one("#kiemDemCbx");
						optHuyen.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
	function selectKiemDemVien(){
		AUI().use('aui-base','aui-io-request', function(A){
			var capTinhInput = A.one("#<portlet:namespace/><%=KeHoachKiemDemVeSinhTerms.MA_TINH %>");
			//aui ajax call to get updated content
			var idToTramCap = 0;
			var typeKiemDem = 1;
			if(capTinhInput.val()>0){
				idToTramCap = capTinhInput.val();
				typeKiemDem =1;
			}
			A.io.request('<%= selectKiemDem %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />tramCapIdAjax": idToTramCap,
					"<portlet:namespace />typeKiemDem": typeKiemDem
				},
				on: {
					success: function() {
						var optHuyen = A.one("#kiemDemCbx");
						optHuyen.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
</script>
