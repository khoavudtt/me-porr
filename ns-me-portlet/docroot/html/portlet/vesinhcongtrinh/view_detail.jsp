<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhCongTrinhTerms"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
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
	String maTinh = (String)request.getAttribute(VeSinhCongTrinhTerms.MA_TINH);
	String maHuyen = (String)request.getAttribute(VeSinhCongTrinhTerms.MA_HUYEN);
	String maXa = (String)request.getAttribute(VeSinhCongTrinhTerms.MA_XA);
	String trangThai = (String)request.getAttribute(VeSinhCongTrinhTerms.TRANG_THAI);
	String namBaoCao = (String)request.getAttribute(VeSinhCongTrinhTerms.NAM_BAO_CAO);
	String loaiNhaTieu = (String)request.getAttribute(VeSinhCongTrinhTerms.LOAI_NHA_TIEU);
	String loaiCongTrinh = (String)request.getAttribute(VeSinhCongTrinhTerms.LOAI_CONG_TRINH);
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
	List<DATAITEM> listHuyen = (List<DATAITEM>)request.getAttribute("listHuyen"); 
	List<DATAITEM> listXa = (List<DATAITEM>)request.getAttribute("listXa");
	VeSinhCongTrinh veSinhCongTrinh = (VeSinhCongTrinh)request.getAttribute("veSinhCongTrinh");
	List<DATAITEM> listLoaiNhaTieu = (List<DATAITEM>)request.getAttribute("listLoaiNhaTieu");
	List<DATAITEM> listLoaiNguonNuoc = (List<DATAITEM>)request.getAttribute("listLoaiNguonNuoc");
	String requiredLabel="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
%>
<liferay-portlet:renderURL varImpl="redirectDauNoiURL">
	<liferay-portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/view.jsp"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.MA_TINH %>" value="<%=veSinhCongTrinh.getMaTinh() %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.MA_HUYEN %>" value="<%=veSinhCongTrinh.getMaHuyen() %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.MA_XA %>" value="<%=veSinhCongTrinh.getMaXa() %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.LOAI_NHA_TIEU %>" value="<%=loaiNhaTieu %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.LOAI_CONG_TRINH %>" value="<%=loaiCongTrinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.TRANG_THAI %>" value="<%=String.valueOf(veSinhCongTrinh.getTrangThai()) %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.NAM_BAO_CAO %>" value="<%=String.valueOf(veSinhCongTrinh.getNamBaoCao()) %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<liferay-ui:header
	backURL="<%= redirectDauNoiURL.toString() %>"
	title='<%= (veSinhCongTrinh == null) ? "vs-cong-trinh" : "vs-cong-trinh" %>'
/>
<liferay-util:include page='<%= "/html/portlet/vesinhcongtrinh/top_tabs.jsp" %>' servletContext="<%= application %>" />
<c:choose>
	<c:when test="<%= Validator.isNotNull(veSinhCongTrinh) %>">
		<%
			String tenTinh = NuocSachUtils.getNameTinh(veSinhCongTrinh.getMaTinh());
			String tenHuyen = NuocSachUtils.getNameHuyen(veSinhCongTrinh.getMaTinh(), veSinhCongTrinh.getMaHuyen());
			String tenXa = NuocSachUtils.getNameXa(veSinhCongTrinh.getMaXa());
		%>
		<aui:row>
			<aui:col width="50">
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ten-cong-trinh\") + dotLabel %>" inlineLabel="true">
					<%=veSinhCongTrinh.getTenCongTrinh() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"loai-cong-trinh\") + dotLabel %>" inlineLabel="true">
					<%=LanguageUtil.get(pageContext, "loai-cong-trinh-" + veSinhCongTrinh.getLoaiCongTrinh()) %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"dc-cong-trinh\") + dotLabel %>" inlineLabel="true">
					<%=veSinhCongTrinh.getDiaChi() %><%=dot %>
				</aui:field-wrapper>
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") + dotLabel %>" inlineLabel="true">
					<%=NuocSachUtils.getNameTinh(veSinhCongTrinh.getMaTinh()) %><%=dot %>
				</aui:field-wrapper>
				
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") + dotLabel %>" inlineLabel="true">
							<%=tenHuyen %><%=dot %>
						</aui:field-wrapper>
						<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"phuong-xa\") + dotLabel %>" inlineLabel="true">
							<%=tenXa %><%=dot %>
						</aui:field-wrapper>
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tinh-trang-bao-cao\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=LanguageUtil.get(pageContext, \"nam-bao-cao-\"+ veSinhCongTrinh.getNamBaoCao()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
			<aui:col width="50">
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"kinh-do\") + dotLabel %>" inlineLabel="true" >
						<%=veSinhCongTrinh.getKinhDo() %><%=dot %>
					</aui:field-wrapper>
				</aui:col>
				<aui:col width="50">
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"vi-do\") + dotLabel %>" inlineLabel="true" >
						<%=veSinhCongTrinh.getViDo() %><%=dot %>
					</aui:field-wrapper>
				</aui:col>
				
				<aui:field-wrapper name=" " label=" " inlineLabel="true">
				<div id="locationpicker">
					<div id="us2" style="width: 100%; height: 300px;"></div>
					<script>$('#us2').locationpicker({
							location: {latitude: <%=Validator.isNotNull(veSinhCongTrinh.getViDo())?veSinhCongTrinh.getViDo():"21.023277896055212" %>, longitude: <%= Validator.isNotNull(veSinhCongTrinh.getKinhDo())?veSinhCongTrinh.getKinhDo():"105.83364481586909" %>},	
							radius: 300
						});
					</script>
				</div>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ghi-chu\") + dotLabel %>" inlineLabel="true">
					<%=veSinhCongTrinh.getGhiChu() %><%=dot %>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		<div class="dau-noi-header">
			<liferay-ui:message key="thong-tin-danh-gia-dieu-tra"></liferay-ui:message>
		</div>
		<aui:row>
			<aui:col width="50">
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-kiem-dem\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(veSinhCongTrinh.getNgayKiemDem())?dateFormatDate.format(veSinhCongTrinh.getNgayKiemDem()):StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguoi-kiem-dem\") + dotLabel %>" inlineLabel="true">
					<%=StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ket-qua-danh-gia\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=LanguageUtil.get(pageContext, \"tinh-trang-ve-sinh-\"+ veSinhCongTrinh.getTrangThai()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
				
				<aui:field-wrapper name=" " inlineLabel="true" label=" " >
					<%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-danh-gia\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(veSinhCongTrinh.getNgayDanhGia())?dateFormatDate.format(veSinhCongTrinh.getNgayDanhGia()):StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguoi-danh-gia\") + dotLabel %>" inlineLabel="true">
					<%=veSinhCongTrinh.getIdNguoiDanhGia()>0?UserMappingBusiness.getByUserId(veSinhCongTrinh.getIdNguoiDanhGia()).getName():StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:button-row>
				<liferay-portlet:renderURL varImpl="danhGiaLaiUrl">
					<liferay-portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/edit_danh_gia_lai.jsp"/>
					<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"/>
					<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.ID %>" value="<%=String.valueOf(veSinhCongTrinh.getId()) %>"/>
				</liferay-portlet:renderURL>
				<aui:button cssClass="btn-primary" href="<%= danhGiaLaiUrl.toString() %>" name="danh-gia-lai" value="danh-gia-lai" type="button" />
			</aui:button-row>
		</aui:row>
	</c:when>	
	<c:otherwise>
		<liferay-ui:message key="thong-tin-cong-trinh-khong-ton-tai"/>
	</c:otherwise>
</c:choose>
<style>
.control-label{
width:200px !important;
}
</style>