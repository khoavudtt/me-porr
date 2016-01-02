<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
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

<%@include file="/init.jsp" %>

<%
	long id = ParamUtil.getLong(request, "id");
	
	String lastURL = ParamUtil.getString(request, "currentURL");
		 
	KiemDemVien selKiemDemVien = KiemDemVienLocalServiceUtil.getKiemDemVien(id);
	
	User selUser = UserLocalServiceUtil.getUser(selKiemDemVien.getIdNguoiTao());
	
	UserMapping userMapping = UserMappingBusiness.getByUserId(selKiemDemVien.getIdQuanLy());
	
%>

<liferay-ui:header
	backURL="<%= lastURL %>"
	title="detail-kiem-dem-vien"
/>

<aui:fieldset cssClass="detail-tramcap">
			<table>
				<tr>
					<td class="col-small"><b><liferay-ui:message key="name"/></b></td>
					<td><%=selKiemDemVien.getHoVaTen() %></td>
					
					<td class="col-small"><b><liferay-ui:message key="account"/></b></td>
					<td><%=selKiemDemVien.getTaiKhoan() %></td>
				</tr>
				
				<tr>
					<td><b><liferay-ui:message key="cap-quan-ly"/></b></td>
					<td>
						<liferay-ui:message 
							key='<%=(selKiemDemVien.getCapHoatDong()==1)? "toan-tinh":
								((selKiemDemVien.getCapHoatDong()==2)? "ve-sinh-huyen":"tram-cap-nuoc") %>'
						/>
					</td>
					
					<td><b><liferay-ui:message key="don-vi-quan-ly"/></b></td>
					<td>
						<%=(selKiemDemVien.getCapHoatDong()==1)? 
								NuocSachUtils.getNameTinh(selKiemDemVien.getOrgCode1()):
									((selKiemDemVien.getCapHoatDong()==2)? 
											NuocSachUtils.getNameHuyen(selKiemDemVien.getOrgCode1(), selKiemDemVien.getOrgCode2()):
												NuocSachUtils.getTenTramByTramId(selKiemDemVien.getOrgCode2())) %>
					</td>
				</tr>
				<tr>
					<td class="col-small"><b><liferay-ui:message key="nguoi-quan-ly-gsv"/></b></td>
					<td>
						<%= Validator.isNotNull(userMapping) ? userMapping.getName() : StringPool.BLANK %>
					</td>
					
					<td class="col-small"></td>
					<td>
					</td>
				</tr>
				
				<tr>
					<td><b><liferay-ui:message key="address"/></b></td>
					<td colspan="3"><%=selKiemDemVien.getDiaChi() %></td>
				</tr>
				
				<tr>
					<td><b><liferay-ui:message key="chung-minh-thu"/></b></td>
					<td><%=selKiemDemVien.getChungMinhThu() %></td>
					
					<td><b><liferay-ui:message key="phone"/></b></td>
					<td><%= selKiemDemVien.getDienThoai() %></td>
				</tr>
				
				<tr>
					<td><b><liferay-ui:message key="imei"/></b></td>
					<td colspan="3"><%=selKiemDemVien.getImei() %></td>
				</tr>
				
				<tr>
					<td><b><liferay-ui:message key="nguoi-tao"/></b></td>
					<td><%=selUser.getFullName() %></td>
					
					<td><b><liferay-ui:message key="ngay-tao"/></b></td>
					<td><%=dateFormatDate.format(selKiemDemVien.getNgayTao())%></td>
				</tr>
				
				<tr>
					<td><b><liferay-ui:message key="status"/></b></td>
					<td colspan="3"><liferay-ui:message key='<%=(selKiemDemVien.getTrangThai()==1)? "activated":"deactivated"%>'/></td>
				</tr>
			</table>
</aui:fieldset>