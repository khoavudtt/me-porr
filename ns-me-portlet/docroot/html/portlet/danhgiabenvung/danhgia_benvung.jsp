<%@page import="vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.DanhGiaBenVungBussiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.DanhGiaBenVungLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungImpl"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.DanhGiaVanHanhLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
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
	
	String maTinh = ParamUtil.getString(request, "selTinh");

	int selMaTramCap = ParamUtil.getInteger(request, "selTramCap");
	
	TramCapNuoc selTramCap = NuocSachUtils.getTramCap(selMaTramCap);
	
	int selYear = ParamUtil.getInteger(request, "selYear");
	
	String initTramCap = NuocSachUtils.getInitLevel(user, 4);
	
	int soNguoiDuocCapNuoc = DauNoiNuocLocalServiceUtil.countSoNguoiHuongLoi(selMaTramCap);
	
	DanhGiaVanHanh danhGiaVanHanh = DanhGiaVanHanhLocalServiceUtil.getLastestByTramCap(selMaTramCap);
	
	int trangThaiCapNuoc = 0;
	int nuocDatTieuChuan = 0;
	int nuocCoAsen = 0;
	int congXuatThucTe = 0;
	
	if (Validator.isNotNull(danhGiaVanHanh)) {
		trangThaiCapNuoc = danhGiaVanHanh.getTrangThaiCapNuoc();
		nuocDatTieuChuan = danhGiaVanHanh.getNuocDatTieuChuan();
		nuocCoAsen = danhGiaVanHanh.getNuocCoAsen();
		congXuatThucTe = danhGiaVanHanh.getCongXuatThucTe();
	}
	
	// tong dau noi moi: trangThai = 2 va Nam = 0
	int tongDauNoiMoi = DauNoiNuocLocalServiceUtil.countDauNoiSearch(StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, Integer.toString(selMaTramCap), "2", StringPool.BLANK);
	int soNguoiCapThucTe = DauNoiNuocLocalServiceUtil.countSoNguoiHuongLoi(selMaTramCap);
	int nuocThatThoat = DanhGiaVanHanhLocalServiceUtil.tongNuocThatThoat(selMaTramCap, selYear);
	int tongChiPhi = DanhGiaVanHanhLocalServiceUtil.tongChiPhiTram(selMaTramCap, selYear);
	int tongDoanhThu = DanhGiaVanHanhLocalServiceUtil.tongDoanhThu(selMaTramCap, selYear);
	
	List<DATAITEM> listTinh = NuocSachUtils.getListTinh(user);
	
	List<TramCapNuoc> lisTramCap = TramCapBusiness.getByTinh(user, maTinh);
	
	DanhGiaBenVung danhGiaBenVung = null;
	
	danhGiaBenVung = DanhGiaBenVungBussiness.getDanhGiaBenVungByNam(selYear, selMaTramCap);
	
	if (Validator.isNull(danhGiaBenVung)) {
		danhGiaBenVung = new DanhGiaBenVungImpl();
		
		danhGiaBenVung.setTrangThaiCapNuoc(trangThaiCapNuoc);
		danhGiaBenVung.setNuocDatTieuChuan(nuocDatTieuChuan);
		danhGiaBenVung.setNuocCoAsen(nuocCoAsen);
		danhGiaBenVung.setCongXuatThucTe(congXuatThucTe);
	}

	danhGiaBenVung.setTongDoanhThu(tongDoanhThu);
	danhGiaBenVung.setTongChiPhi(tongChiPhi);
	danhGiaBenVung.setSoNguoiCapThucTe(soNguoiCapThucTe);

	danhGiaBenVung.setNuocThatThoat(nuocThatThoat);
	danhGiaBenVung.setTongDauNoiMoi(tongDauNoiMoi);

	Calendar cal = Calendar.getInstance();
	
	int currYear = cal.get(Calendar.YEAR);
%>

<portlet:actionURL name="addBenVung" var="addBenVungURL"/>

<portlet:renderURL var="renderURL">
	<portlet:param name="mvcPath" value="/html/portlet/danhgiabenvung/danhgia_benvung.jsp"/>
</portlet:renderURL>

<liferay-ui:header
	backURL="<%= redirect %>"
	title='them-danh-gia-ben-vung'
/>

<aui:form action="<%= addBenVungURL %>" method="post" name="fm">
	<aui:model-context bean="<%= danhGiaBenVung %>" model="<%= DanhGiaBenVung.class %>" />
	
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(danhGiaBenVung) ? Constants.UPDATE : Constants.ADD %>"/>
	
	<aui:input name="id" type="hidden" value="<%= Validator.isNotNull(danhGiaBenVung) ? danhGiaBenVung.getId() : StringPool.BLANK %>" />
	
	<aui:input name="loaiHinh" type="hidden" value="<%= Validator.isNotNull(selTramCap) ? Integer.toString(selTramCap.getLoaiHinh()) : StringPool.BLANK %>"></aui:input>
	
	<aui:field-wrapper cssClass="form-add-ben-vung">
		<aui:select name="selTinh" onChange='<%= renderResponse.getNamespace() + "selectFilter()" %>' cssClass="sel-col-2" >
				<aui:option value=""></aui:option>
			
			<%
				for (DATAITEM tinh : listTinh) {
			%>
				<aui:option value="<%= tinh.getNode1() %>"><%= tinh.getName() %></aui:option>
			<%
				}
			%>
		</aui:select>
		
		<aui:row>
			<aui:col width="20">
				<aui:select name="selTramCap" onChange='<%= renderResponse.getNamespace() + "selectFilter()" %>'
					cssClass="sel-col-2" inlineField="<%= true %>">
						<aui:option value=""></aui:option>
						
					<%
						for (TramCapNuoc tramCap : lisTramCap) {
					%>
						<aui:option selected="<%= tramCap.getMaTram().contentEquals(initTramCap) %>" value="<%= tramCap.getId() %>"><%= tramCap.getTenTram() %></aui:option>
					<%
						}
					%>
				</aui:select>
			</aui:col>
			<aui:col width="20">
				<aui:select name="selYear" onChange='<%= renderResponse.getNamespace() + "selectFilter()" %>'
					inlineField="<%= true %>" cssClass="sel-col-2">
					<%
						for (int j = 2010; j <= currYear ; j++) {
					%>
							<aui:option value="<%= j %>"><%= j %></aui:option>
					<%
						}
					%>
				</aui:select>
			</aui:col>
		</aui:row>
		
		<aui:row>
			<aui:col width="20">
				<aui:select name="trangThaiCapNuoc" showEmptyOption="true" cssClass="sel-col-2" inlineField="<%= false %>">
					<aui:option value="1" selected="<%= Validator.isNotNull(danhGiaVanHanh) ? danhGiaVanHanh.getTramCapNuocId() == 1 ? true : false : false %>">
						<liferay-ui:message key="on-dinh"/>
					</aui:option>
					<aui:option value="2" selected="<%= Validator.isNotNull(danhGiaVanHanh) ? danhGiaVanHanh.getTramCapNuocId() == 2 ? true : false : false %>">
						<liferay-ui:message key="khong-on-dinh"/>
					</aui:option>
					<aui:option value="3" selected="<%= Validator.isNotNull(danhGiaVanHanh) ? danhGiaVanHanh.getTramCapNuocId() == 3 ? true : false : false %>">
						<liferay-ui:message key="khong-cap-nuoc"/>
					</aui:option>
				</aui:select>
			</aui:col>
			<aui:col width="20">
				<aui:select name="nuocDatTieuChuan" showEmptyOption="true" cssClass="sel-col-2">
					<aui:option value="1"><liferay-ui:message key="yes"/></aui:option>
					<aui:option value="2"><liferay-ui:message key="no"/></aui:option>
				</aui:select>
			</aui:col>
			<aui:col width="20">
				<aui:input name="congXuatThucTe" cssClass="input-col-2" inlineField="<%= true %>"></aui:input>
			</aui:col>
			<aui:col width="20">
				<aui:input name="soNguoiCapThucTe" cssClass="input-col-2"></aui:input>
			</aui:col>
		</aui:row>

		<aui:row>
			<aui:col width="20">
				<aui:input name="nuocThatThoat" cssClass="input-col-2"></aui:input>
			</aui:col>
			<aui:col width="20">
				<aui:input name="tongChiPhi" cssClass="input-col-2"></aui:input>
			</aui:col>
			<aui:col width="20">
				<aui:input name="tongDoanhThu" cssClass="input-col-2"></aui:input>
			
			</aui:col>
			<aui:col width="20">
				<aui:input name="tongDauNoiMoi" cssClass="input-col-2"></aui:input>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="100">
				<aui:input name="ghiChu" type="textarea" cssClass="txt-area-col-2"></aui:input>
			</aui:col>
		</aui:row>
		<aui:button-row>
			<aui:button type="submit" value="save"/>
			<aui:button href="<%= redirect %>" name="cancel" type="cancel" />
		</aui:button-row>

	</aui:field-wrapper>
	
</aui:form>

<script type="text/javascript">
	
	function <portlet:namespace />selectFilter() {
		
		var A = AUI();
		
		var url = '<%= renderURL.toString() %>';
		
		if(A.one('#<portlet:namespace/>selTinh')) {
			url += '&<portlet:namespace/>selTinh=' + A.one('#<portlet:namespace/>selTinh').get('value');
		}
		
		if(A.one('#<portlet:namespace/>selTramCap')) {
			url += '&<portlet:namespace/>selTramCap=' + A.one('#<portlet:namespace/>selTramCap').get('value');
		}
		
		if(A.one('#<portlet:namespace/>selYear')) {
			url += '&<portlet:namespace/>selYear=' + A.one('#<portlet:namespace/>selYear').get('value');
		}
		
		location.href = url;
	}
</script>


<%! private Log _log = LogFactoryUtil.getLog("html.portlet.danhgiabenvung.danhgia_benvung.jsp"); %>
