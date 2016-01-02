<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
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

<%@include file="/init.jsp" %>



<script type="text/javascript" src='http://maps.google.com/maps/api/js?sensor=false&libraries=places'></script>

<%
	long tramCapId = ParamUtil.getLong(request, "tramCapId");

	TramCapNuoc tramCap = null;
	
	if (tramCapId > 0) {
		tramCap = TramCapBusiness.getTramCap(tramCapId);
	}
	
%>

<c:choose>
	<c:when test="<%= Validator.isNotNull(tramCap) %>">
		<liferay-util:include page='<%= templatePath + "top_tabs_tramcap.jsp" %>' servletContext="<%= application %>" />
		
		<%
			NuocSachUtils nuocSachUtil = new NuocSachUtils();
			String tenTinh = nuocSachUtil.getNameTinh(tramCap.getMaTinh());
			String tenHuyen = nuocSachUtil.getNameHuyen(tramCap.getMaTinh(), tramCap.getMaHuyen());
			String tenXa = nuocSachUtil.getNameXa(tramCap.getMaXa());
			
			String tenMoHinh = DataItemBusiness.getByNode1Id(WebKeys.DATAGROUPID_MOHINHQUANLY, tramCap.getMaMoHinh()).getName();
		%>
		
		<liferay-portlet:renderURL var="danhGiaURL">
			<portlet:param name="jspPage" value="/html/portlet/tramcapnuoc/danhgia_vanhanhtram.jsp"/>
			<portlet:param name="tramCapId" value="<%= Long.toString(tramCap.getId()) %>"/>
		</liferay-portlet:renderURL>
		
		<aui:fieldset cssClass="detail-tramcap">
			<table>
				<tr>
					<td class="detail-tramcap-label"><liferay-ui:message key="ma-tram-cap"/></td>
					<td class="detail-tramcap-value" colspan="3"><%= tramCap.getMaTram() %></td>
				</tr>
				<tr>
					<td><liferay-ui:message key="ten-tram-cap"/></td>
					<td colspan="3"> <strong> <%= tramCap.getTenTram() %> </strong></td>
				</tr>

				<tr>
					<td><liferay-ui:message key="tinh"/></td>
					<td> <%= tenTinh  %></td>
					
					<td><liferay-ui:message key="huyen"/></td>
					<td><%= tenHuyen %></td>
				</tr>
				
				<tr>
					<td><liferay-ui:message key="xa"/></td>
					<td> <%= tenXa %></td>
					
					<td><liferay-ui:message key="dia-chi"/></td>
					<td><%= tramCap.getDiaChi() %></td>
				</tr>
				<tr>
					<td><liferay-ui:message key="kinh-do"/></td>
					<td><%= tramCap.getKinhDo() %></td>
					<td><liferay-ui:message key="vi-do"/></td>
					<td><%= tramCap.getViDo() %></td>
				</tr>

				
				<tr>
					<td><liferay-ui:message key="loai-hinh"/></td>
					<td><liferay-ui:message key='<%= "loai-hinh-"+tramCap.getLoaiHinh() %>'/></td>

					<td><liferay-ui:message key="mo-hinh-quan-ly"/></td>
					<td><%= tenMoHinh %></td>
				</tr>
				<tr>
					<td><liferay-ui:message key="cong-xuat-thiet-ke"/></td>
					<td><%= NuocSachUtils.formatNumber(tramCap.getCongXuatThietKe()) %></td>

					<td><liferay-ui:message key="tong-dau-noi-thiet-ke"/></td>
					<td><%= NuocSachUtils.formatNumber(tramCap.getTongDauNoiThietKe()) %></td>
				</tr>
				<tr>
					<td><liferay-ui:message key="so-nguoi-cap-thiet-ke"/></td>
					<td><%= NuocSachUtils.formatNumber(tramCap.getSoNguoiCapThietKe()) %></td>

					<td><liferay-ui:message key="tinh-trang-du-an"/></td>
					<td><liferay-ui:message key='<%= "tinh-trang-du-an-"+tramCap.getTinhTrangDuAn() %>'/></td>
				</tr>
				<tr>
					<td><liferay-ui:message key="tien-do-xay-dung"/></td>
					<td><%= tramCap.getTienDoXayDung() %>%</td>
					<td><liferay-ui:message key="bo-may-van-hanh"/></td>
					<td><liferay-ui:message key='<%= "bo-may-van-hanh-"+tramCap.getBoMayVanHanh() %>'/></td>

				</tr>
				<tr>
					<td><liferay-ui:message key="nam-xay-dung"/></td>
					<td><%= tramCap.getNamXayDung() %></td>
					<td><liferay-ui:message key="nam-hoan-thanh"/></td>
					<td><%= tramCap.getNamHoanThanh() %></td>

				</tr>
				<tr>
					<td ><liferay-ui:message key="ghi-chu"/></td>
					<td colspan="3"><%= tramCap.getGhiChu() %></td>
				</tr>
				
				<tr>
					<td colspan="4">
						<div id="locationpicker">
						<div id="us2" style="width: 100%; height: 200px;"></div>
		
						<script>$('#us2').locationpicker({
								location: {latitude: '<%= tramCap.getKinhDo() %>', longitude: '<%= tramCap.getViDo() %>'},	
								radius: 300
							});
						</script>
						</div>
					</td>
				</tr>
				
			</table>
		</aui:fieldset>
		
	</c:when>	
	
	<c:otherwise>
		<liferay-ui:message key="thong-tin-tram-cap-khong-ton-tai"/>
	</c:otherwise>
</c:choose>
