<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhGiaDinhTerms"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.persistence.DauNoiNuocUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.DauNoiNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
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
	String maTinh = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_TINH);
	String maHuyen = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_HUYEN);
	String maXa = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_XA);
	String loaiNhaTieu = (String)request.getAttribute(VeSinhGiaDinhTerms.LOAI_NHA_TIEU);
	String trangThai = (String)request.getAttribute(VeSinhGiaDinhTerms.TRANG_THAI);
	String namBaoCao = (String)request.getAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO);
	String namBaoCaoVstx = (String)request.getAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO+"vstx");
	String ngayDauNoi = (String)request.getAttribute("ngayNhap");
	String idNguoiTao = (String)request.getAttribute("idNguoiTao");
	String advText = (String)request.getAttribute("advText");
	VeSinhGiaDinh veSinhGiaDinh = (VeSinhGiaDinh)request.getAttribute("veSinhGiaDinh");
	String requiredLabel="";
	requiredLabel ="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
%>
<liferay-portlet:renderURL varImpl="redirectDauNoiURL">
	<liferay-portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/view.jsp"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.LOAI_NHA_TIEU %>" value="<%=loaiNhaTieu %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.NAM_BAO_CAO+\"vstx\" %>" value="<%=namBaoCaoVstx %>"></liferay-portlet:param>
	<liferay-portlet:param name="idNguoiTao" value="<%=String.valueOf(idNguoiTao) %>"></liferay-portlet:param>
	<liferay-portlet:param name="ngayNhap" value="<%=String.valueOf(ngayDauNoi) %>"></liferay-portlet:param>
	<liferay-portlet:param name="advText" value="<%=String.valueOf(advText) %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<liferay-ui:header
	backURL="<%= redirectDauNoiURL.toString() %>"
	title='<%= (veSinhGiaDinh == null) ? "vs-ho-gia-dinh" : "vs-ho-gia-dinh" %>'
/>
<liferay-util:include page='<%= "/html/portlet/vesinhhogiadinh/top_tabs.jsp" %>' servletContext="<%= application %>" />
<c:choose>
	<c:when test="<%= Validator.isNotNull(veSinhGiaDinh) %>">
		<%
			String tenTinh = NuocSachUtils.getNameTinh(veSinhGiaDinh.getMaTinh());
			String tenHuyen = NuocSachUtils.getNameHuyen(veSinhGiaDinh.getMaTinh(), veSinhGiaDinh.getMaHuyen());
			String tenXa = NuocSachUtils.getNameXa(veSinhGiaDinh.getMaXa());
		%>
		<aui:row>
			<aui:col width="50">
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ten-chu-ho\") + dotLabel %>" inlineLabel="true">
					<%=veSinhGiaDinh.getTenChuHo() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"dc-thon-xom\") + dotLabel %>" inlineLabel="true">
					<%=veSinhGiaDinh.getThonXom() %><%=dot %>
				</aui:field-wrapper>
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") + dotLabel %>" inlineLabel="true">
					<%=NuocSachUtils.getNameTinh(veSinhGiaDinh.getMaTinh()) %><%=dot %>
				</aui:field-wrapper>
				
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") + dotLabel %>" inlineLabel="true">
							<%=tenHuyen %><%=dot %>
						</aui:field-wrapper>
						<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"phuong-xa\") + dotLabel %>" inlineLabel="true">
							<%=tenXa %><%=dot %>
						</aui:field-wrapper>
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"gioi-tinh\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=DauNoiNuocBusiness.getGioiTinh(veSinhGiaDinh.getGioiTinhChuHo()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-nguoi-trong-ho\") + dotLabel %>" inlineLabel="true">
					<%=veSinhGiaDinh.getSoNguoiTrongHo() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"thanh-phan-ho-gia-dinh\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=LanguageUtil.get(pageContext, \"thanh-phan-ho-gia-dinh-\"+ veSinhGiaDinh.getThanhPhanHoGD()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nam-hoan-thanh\") + dotLabel %>" inlineLabel="true">
					<%=veSinhGiaDinh.getThangXayDung() %> / <%=veSinhGiaDinh.getNamXayDung() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tinh-trang-bao-cao\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=LanguageUtil.get(pageContext, \"nam-bao-cao-\"+ veSinhGiaDinh.getNamBaoCao()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
			<aui:col width="50">
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"kinh-do\") + dotLabel %>" inlineLabel="true" >
						<%=veSinhGiaDinh.getKinhDo() %><%=dot %>
					</aui:field-wrapper>
				</aui:col>
				<aui:col width="50">
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"vi-do\") + dotLabel %>" inlineLabel="true" >
						<%=veSinhGiaDinh.getViDo() %><%=dot %>
					</aui:field-wrapper>
				</aui:col>
				
				<aui:field-wrapper name=" " label=" " inlineLabel="true">
				<div id="locationpicker">
					<div id="us2" style="width: 100%; height: 300px;"></div>
					<script>$('#us2').locationpicker({
							location: {latitude: <%=Validator.isNotNull(veSinhGiaDinh.getViDo())?veSinhGiaDinh.getViDo():"21.023277896055212" %>, longitude: <%= Validator.isNotNull(veSinhGiaDinh.getKinhDo())?veSinhGiaDinh.getKinhDo():"105.83364481586909" %>},	
							radius: 300
						});
					</script>
				</div>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ghi-chu\") + dotLabel %>" inlineLabel="true">
					<%=veSinhGiaDinh.getGhiChu() %><%=dot %>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		<div class="dau-noi-header">
			<liferay-ui:message key="thong-tin-danh-gia-dieu-tra"></liferay-ui:message>
		</div>
		<aui:row>
			<aui:col width="50">
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nha-tieu-hop-vs\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=LanguageUtil.get(pageContext, \"nha-tieu-hop-ve-sinh-\"+ veSinhGiaDinh.getNhaTieuHVS()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-kiem-dem\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(veSinhGiaDinh.getNgayKiemDem())?dateFormatDate.format(veSinhGiaDinh.getNgayKiemDem()):StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguoi-kiem-dem\") + dotLabel %>" inlineLabel="true">
					<%=StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ket-qua-danh-gia\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=LanguageUtil.get(pageContext, \"tinh-trang-ve-sinh-\"+ veSinhGiaDinh.getTrangThai()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
				
				<aui:field-wrapper name=" " inlineLabel="true" label=" " >
					<%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-danh-gia\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(veSinhGiaDinh.getNgayDanhGia())?dateFormatDate.format(veSinhGiaDinh.getNgayDanhGia()):StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguoi-danh-gia\") + dotLabel %>" inlineLabel="true">
					<%=veSinhGiaDinh.getIdNguoiDanhGia()>0?UserMappingBusiness.getByUserId(veSinhGiaDinh.getIdNguoiDanhGia()).getName():StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:button-row>
				<liferay-portlet:renderURL varImpl="danhGiaLaiUrl">
					<liferay-portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/edit_danh_gia_lai.jsp"/>
					<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"/>
					<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.ID %>" value="<%=String.valueOf(veSinhGiaDinh.getId()) %>"/>
				</liferay-portlet:renderURL>
				<aui:button cssClass="btn-primary" href="<%= danhGiaLaiUrl.toString() %>" name="danh-gia-lai" value="danh-gia-lai" type="button" />
			</aui:button-row>
		</aui:row>
	</c:when>	
	<c:otherwise>
		<liferay-ui:message key="thong-tin-dau-noi-khong-ton-tai"/>
	</c:otherwise>
</c:choose>
<style>
.control-label{
width:200px !important;
}
</style>