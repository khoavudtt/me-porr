<%@page import="vn.dtt.sol.ns.tramcap.business.DanhGiaVanHanhBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh"%>
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

<%
	long tramCapId = ParamUtil.getLong(request, "tramCapId");
	int nam = ParamUtil.getInteger(request, "namId");
	int thang = ParamUtil.getInteger(request, "thangId");
	
	Calendar cal = Calendar.getInstance();
	
	DanhGiaVanHanh danhGiaVanHanh = DanhGiaVanHanhBusiness.getByThangNamTram(tramCapId, thang, nam);

%>

<c:if test="<%= Validator.isNotNull(danhGiaVanHanh) %>">
	<div class="success-message">
		<liferay-ui:message key="thong-tin-danh-gia-van-hanh-thang"/> <%= thang %>/<%= nam %> <liferay-ui:message key="da-ton-tai-thong-tin-se-duoc-cap-nhat"/>
	</div>
</c:if>

<aui:row>
	<aui:col width="25">
		<aui:select name="trangThaiCapNuoc" showEmptyOption="true">
			<aui:option value="<%= 1 %>" ><liferay-ui:message key="on-dinh"/></aui:option>
			<aui:option value="<%= 2 %>" ><liferay-ui:message key="khong-on-dinh"/></aui:option>
			<aui:option value="<%= 3 %>" ><liferay-ui:message key="khong-cap-nuo"/></aui:option>
		</aui:select>
	</aui:col>
	<aui:col width="25">
		<aui:input name="congXuatThucTe" cssClass="formatPrice"></aui:input>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="25">
		<aui:select name="nuocDatTieuChuan" showEmptyOption="true">
			<aui:option value="<%= 1 %>" ><liferay-ui:message key="nuoc-dat-tieu-chuan"/></aui:option>
			<aui:option value="<%= 2 %>" ><liferay-ui:message key="nuoc-khong-dat-tieu-chuan"/></aui:option>
		</aui:select>
	</aui:col>
	<aui:col width="25">
		<aui:select name="nuocCoAsen" showEmptyOption="true">
			<aui:option value="<%= 1 %>" ><liferay-ui:message key="co-asen"/></aui:option>
			<aui:option value="<%= 0 %>" ><liferay-ui:message key="khong-co-asen"/></aui:option>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="25">
		<aui:input name="sanLuongSanXuat" cssClass="formatPrice"></aui:input>
	</aui:col>
	<aui:col width="25">
		<aui:input name="sanLuongTieuHao" cssClass="formatPrice"></aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="25">
		<aui:input name="doanhThu" cssClass="formatPrice"></aui:input>
		<aui:input name="chiPhiHoaChat" cssClass="formatPrice" ></aui:input>
		<aui:input name="chiPhiDien" cssClass="formatPrice" ></aui:input>
	</aui:col>
	<aui:col width="25">
		<aui:input name="luongNhanVien" cssClass="formatPrice" ></aui:input>
		<aui:input name="chiPhiSuaChua" cssClass="formatPrice" ></aui:input>
		<aui:input name="ghiChu" type="textarea" cssClass="fm-textarea" ></aui:input>
	</aui:col>
</aui:row>

