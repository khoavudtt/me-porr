<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryPos"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.service.UserMappingLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="vn.dtt.sol.ns.business.KiemDemVienBussiness"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien"%>
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

<%@include file="/init.jsp"%>

<%
	String maTinh = ParamUtil.getString(request, "maTinh");
	
	String maTramCap = ParamUtil.getString(request, "orgCode2");
		 
	String maHuyen = ParamUtil.getString(request, "orgCode2");
	
	int capHoatDong = ParamUtil.getInteger(request, "capHoatDong", 0);
	
	KiemDemVien kiemDemVien = (KiemDemVien) renderRequest.getAttribute("kiemDemVien");
	
	long kiemDemVienId = 0;
	
	if(Validator.isNull(kiemDemVien)) {
		kiemDemVien = (KiemDemVien) portletSession.getAttribute("kiemDemVien");
	} else {
		kiemDemVienId = kiemDemVien.getId();
	}
	
	
	List<UserMapping> lsGSV = DiaBanQuanLyUtils.getUserInTramCap(maTinh, maTramCap, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	List<UserMapping> lsGSVVS = DiaBanQuanLyUtils.getGSVInHuyen(maTinh, maHuyen, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	List<TramCapNuoc> lsTramCap = NuocSachUtils.getTramCapByUserId(maTinh, null);
	
	redirect = ParamUtil.getString(request, "redirect");
	
	List<DATAITEM> lsHuyen = DiaBanQuanLyUtils.getListHuyenGS(user, maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	
%>

<liferay-ui:header backURL="<%=redirect%>" title='<%= Validator.isNotNull(kiemDemVien) ? "sua-thong-tin-kiem-dem-vien" : "add-kiem-dem-vien" %>' />

<portlet:renderURL var="backURL">
	<portlet:param name="mvcPath" value='<%= templatePath + "view.jsp" %>'/>
</portlet:renderURL>

<liferay-ui:error key="tai-khoan-da-ton-tai" message="tai-khoan-da-ton-tai" />
<liferay-ui:error key="ten-trong-hoac-khong-hop-le" message="ten-trong-hoac-khong-hop-le" />
<liferay-ui:error key="tai-khoan-trong-hoac-khong-hop-le" message="tai-khoan-trong-hoac-khong-hop-le" />
<liferay-ui:error key="mat-khau-nhap-khong-trung" message="mat-khau-nhap-khong-trung" />
<liferay-ui:error key="cap-hoat-dong-khong-dung" message="cap-hoat-dong-khong-dung" />
<liferay-ui:error key="ma-huyen-khong-ton-tai" message="ma-tram-cap-khong-ton-tai" />
<liferay-ui:error key="chua-chon-giam-sat-vien" message="chua-chon-giam-sat-vien" />

<portlet:actionURL name="addKiemDemVien" var="addKiemDemVienURL" />

<aui:form action="<%= addKiemDemVienURL %>" method="POST" name="fm">
	
	<aui:model-context bean="<%=kiemDemVien%>" model="<%=KiemDemVien.class%>" />

	<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
	<aui:input name="userId" type="hidden" value="<%=user.getUserId()%>" />
	<aui:input name="maTinh" type="hidden" value="<%=maTinh%>" />
	<aui:input name="id" type="hidden" value="<%= Validator.isNotNull(kiemDemVien) ? kiemDemVien.getId() : 0l %>"/>
	<aui:input name="capHoatDong" type="hidden" value="<%= capHoatDong %>"/>
	<aui:input name="trangThai" value="1" type="hidden"/>
	<aui:input name="backURL" type="hidden" value="<%= redirect %>"/>
	<aui:input name="currentURL" type="hidden" value="<%= currentURL %>"/>
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(kiemDemVien) ? Constants.UPDATE : Constants.ADD %>"></aui:input>
	
	<aui:field-wrapper cssClass="form-add">
		<table>
			<c:choose>
				<c:when test="<%= capHoatDong == 3 %>">
					<tr>
						<td>
							<aui:select name="orgCode2" label="ma-tram-cap" showEmptyOption="<%= true %>" onChange="javascript:selectTramcap()" cssClass="input-50">
								<%
									for (TramCapNuoc tramCap : lsTramCap) {
								%>
								<aui:option value="<%=Long.toString(tramCap.getId())%>">
									<%= tramCap.getTenTram() %>
								</aui:option>
								<%
									}
								%>
							</aui:select>
						</td>
						<td>
							<aui:select name="idQuanLy" showEmptyOption="<%= true %>" cssClass="input-50">
								<%
									for (UserMapping um : lsGSV) {
								%>
									<aui:option value="<%= Long.toString(um.getUserId()) %>"><%= um.getName() %></aui:option>
								<%
									}
								%>
							</aui:select>
						</td>
					</tr>
				</c:when>

				<c:when test="<%= capHoatDong == 2 %>">
					<tr>
						<td>
							<aui:select name="orgCode2" label="ma-huyen" showEmptyOption="<%= true %>" onChange="javascript:selectHuyen()">
								<%
									for (DATAITEM huyen : lsHuyen) {
								%>
									<aui:option value="<%= huyen.getNode2() %>"><%= huyen.getName() %></aui:option>
								<% 
									}
								%>
								
							</aui:select>
						</td>
						<td>
							<aui:select name="idQuanLy" showEmptyOption="<%= true %>">
								<%
									for (UserMapping quanLy : lsGSVVS) {
								%>
									<aui:option value="<%= quanLy.getUserId() %>"><%= quanLy.getName() %></aui:option>
								<% 
									}
								%>
								
							</aui:select>
						</td>
					</tr>
				</c:when>
			</c:choose>
			<tr>
				<td class="col-50">
					<aui:input name="hoVaTen" inlineField="<%=true%>" cssClass="input-50">
						<aui:validator name="required" />
					</aui:input></td>
				<td class="col-50">
					<aui:input name="taiKhoan" inlineField="<%=true%>" cssClass="input-50">
						<aui:validator name="required" />
					</aui:input>
				</td>
			</tr>
			
			<tr>
				<td>
					<aui:input name="matKhau" label="password" type="password"
						value="<%=StringPool.BLANK%>" cssClass="input-50">
						<c:if test="<%= Validator.isNull(kiemDemVien) %>">
							<aui:validator name="required" />
						</c:if>
					</aui:input>
				</td>
				<td>
					<aui:input name="reTypeMatKhau" label="re-password" type="password" cssClass="input-50">
						<c:if test="<%= Validator.isNull(kiemDemVien) %>">
							<aui:validator name="required" />
						</c:if>
						<aui:validator name="equalTo">'#<portlet:namespace />matKhau'</aui:validator>
					</aui:input>
				</td>
			</tr>
			<tr>
				<td>
					<aui:input name="diaChi" cssClass="input-50"></aui:input>
				</td>
				<td>
					<aui:input name="dienThoai" cssClass="input-50"></aui:input>
				</td>
			</tr>
			
			<tr>
				<td>		
					<aui:input name="chungMinhThu" cssClass="input-50"></aui:input>
				</td>
				<td>
					<aui:input name="imei" cssClass="input-50"></aui:input>
				</td>
			</tr>
		</table>

		<aui:button-row>
			<aui:button type="submit" value="save" />
			<aui:button href="<%= redirect %>" name="cancel" type="cancel" />
		</aui:button-row>

	</aui:field-wrapper>
</aui:form>

<liferay-portlet:renderURL var="currentPage">
	<portlet:param name="maTinh" value="<%= maTinh %>"/>
	<portlet:param name="capHoatDong" value="<%= Integer.toString(capHoatDong) %>"/>
	<portlet:param name="mvcPath" value="/html/portlet/kiemdemvien/add_kiemdemvien.jsp"/>
	<portlet:param name="maKiemDemVien" value="0"/>
</liferay-portlet:renderURL>

<script type="text/javascript">
	function selectTramcap() {
		var A = AUI();
	
		var url = '<%= currentPage.toString() %>';
		
		url += '&<portlet:namespace />orgCode2=' + A.one('#<portlet:namespace />orgCode2').get('value') + '&<portlet:namespace />id=' + '<%= Long.toString(kiemDemVienId) %>';
		
		location.href = url;
	}

	function selectHuyen() {
		var A = AUI();
	
		var url = '<%= currentPage.toString() %>';
		
		url += '&<portlet:namespace />orgCode2=' + A.one('#<portlet:namespace />orgCode2').get('value') + '&<portlet:namespace />id=' + '<%= Long.toString(kiemDemVienId) %>';
		
		location.href = url;
	}
</script>

<%! private static final int CAP_GSV_NUOC = 4; %>