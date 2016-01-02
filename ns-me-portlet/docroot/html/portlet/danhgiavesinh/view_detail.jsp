<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.user.dao.service.UserMappingLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.persistence.DauNoiNuocUtil"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms"%>
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
	String maTinh = (String)request.getAttribute(DauNoiNuocTerms.MA_TINH);
	String maHuyen = (String)request.getAttribute(DauNoiNuocTerms.MA_HUYEN);
	String maXa = (String)request.getAttribute(DauNoiNuocTerms.MA_XA);
	String tramCapNuocId = (String)request.getAttribute(DauNoiNuocTerms.TRAM_CAP_NUOC_ID);
	String trangThai = (String)request.getAttribute(DauNoiNuocTerms.TRANG_THAI);
	String namBaoCao = (String)request.getAttribute(DauNoiNuocTerms.NAM_BAO_CAO);
	DauNoiNuoc dauNoiNuoc = (DauNoiNuoc)request.getAttribute("dauNoiNuoc");
	String requiredLabel="";
	requiredLabel ="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
%>
<liferay-portlet:renderURL varImpl="redirectDauNoiURL">
	<liferay-portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/view.jsp"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>" value="<%=tramCapNuocId %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<liferay-ui:header
	backURL="<%= redirectDauNoiURL.toString() %>"
	title='<%= (dauNoiNuoc == null) ? "dau-noi-nuoc" : "dau-noi-nuoc" %>'
/>
<liferay-util:include page='<%= "/html/portlet/daunoinuoc/top_tabs.jsp" %>' servletContext="<%= application %>" />
<c:choose>
	<c:when test="<%= Validator.isNotNull(dauNoiNuoc) %>">
		<%
			String tenTinh = NuocSachUtils.getNameTinh(dauNoiNuoc.getMaTinh());
			String tenHuyen = NuocSachUtils.getNameHuyen(dauNoiNuoc.getMaTinh(), dauNoiNuoc.getMaHuyen());
			String tenXa = NuocSachUtils.getNameXa(dauNoiNuoc.getMaXa());
			String tenTramCap = TramCapBusiness.getTramCap(dauNoiNuoc.getTramCapNuocId()).getTenTram();
		%>
		<aui:row>
			<aui:col width="50">
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ten-chu-ho\") + dotLabel %>" inlineLabel="true">
					<%=dauNoiNuoc.getTenChuHo() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"dc-thon-xom\") + dotLabel %>" inlineLabel="true">
					<%=dauNoiNuoc.getThonXom() %><%=dot %>
				</aui:field-wrapper>
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") + dotLabel %>" inlineLabel="true">
					<%=NuocSachUtils.getNameTinh(dauNoiNuoc.getMaTinh()) %><%=dot %>
				</aui:field-wrapper>
				
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") + dotLabel %>" inlineLabel="true">
							<%=tenHuyen %><%=dot %>
						</aui:field-wrapper>
						<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"phuong-xa\") + dotLabel %>" inlineLabel="true">
							<%=tenXa %><%=dot %>
						</aui:field-wrapper>
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"gioi-tinh\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=DauNoiNuocBusiness.getGioiTinh(dauNoiNuoc.getGioiTinh()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-nguoi-trong-ho\") + dotLabel %>" inlineLabel="true">
					<%=dauNoiNuoc.getSoNguoiTrongHo() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"thanh-phan-ho-ngheo\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=LanguageUtil.get(pageContext, \"thanh-phan-ho-gia-dinh-\"+ dauNoiNuoc.getThanhPhanHoGiaDinh()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tram-cap-nuoc\") + dotLabel %>" inlineLabel="true">
					<%=TramCapBusiness.getTramCap(dauNoiNuoc.getTramCapNuocId()).getTenTram() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-dau-noi-tren-hop-dong\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(dauNoiNuoc.getNgayDauNoiHopDong())?dateFormatDate.format(dauNoiNuoc.getNgayDauNoiHopDong()):StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-dau-noi-thuc-te\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(dauNoiNuoc.getNgayDauNoiThucTe())?dateFormatDate.format(dauNoiNuoc.getNgayDauNoiThucTe()):StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-sery-dong-ho-nuoc\") + dotLabel %>" inlineLabel="true">
					<%=dauNoiNuoc.getSoSeryDongHo() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tinh-trang-bao-cao\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=LanguageUtil.get(pageContext, \"nam-bao-cao-\"+ dauNoiNuoc.getNamBaoCao()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
			<aui:col width="50">
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"kinh-do\") + dotLabel %>" inlineLabel="true" >
						<%=dauNoiNuoc.getKinhDo() %><%=dot %>
					</aui:field-wrapper>
				</aui:col>
				<aui:col width="50">
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"vi-do\") + dotLabel %>" inlineLabel="true" >
						<%=dauNoiNuoc.getViDo() %><%=dot %>
					</aui:field-wrapper>
				</aui:col>
				
				<aui:field-wrapper name=" " label=" " inlineLabel="true">
				<div id="locationpicker">
					<div id="us2" style="width: 100%; height: 300px;"></div>
					<script>$('#us2').locationpicker({
							location: {latitude: <%=Validator.isNotNull(dauNoiNuoc.getViDo())?dauNoiNuoc.getViDo():"21.023277896055212" %>, longitude: <%= Validator.isNotNull(dauNoiNuoc.getKinhDo())?dauNoiNuoc.getKinhDo():"105.83364481586909" %>},	
							radius: 300
						});
					</script>
				</div>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ghi-chu\") + dotLabel %>" inlineLabel="true">
					<%=dauNoiNuoc.getGhiChu() %><%=dot %>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		<div class="dau-noi-header">
			<liferay-ui:message key="thong-tin-danh-gia-dieu-tra"></liferay-ui:message>
		</div>
		<aui:row>
			<aui:col width="50">
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguon-nuoc-hop-vs\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=LanguageUtil.get(pageContext, \"nguon-nuoc-\"+ dauNoiNuoc.getDanhGiaNuocHVS()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-kiem-dem\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(dauNoiNuoc.getNgayKiemDem())?dateFormatDate.format(dauNoiNuoc.getNgayKiemDem()):StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguoi-kiem-dem\") + dotLabel %>" inlineLabel="true">
					<%=StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ket-qua-danh-gia\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=LanguageUtil.get(pageContext, \"tinh-trang-dau-noi-\"+ dauNoiNuoc.getTrangThai()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
				
				<aui:field-wrapper name=" " inlineLabel="true" label=" " >
					<%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-danh-gia\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(dauNoiNuoc.getNgayDanhGia())?dateFormatDate.format(dauNoiNuoc.getNgayDanhGia()):StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguoi-danh-gia\") + dotLabel %>" inlineLabel="true">
					<%=dauNoiNuoc.getIdNguoiDanhGia()>0?UserMappingBusiness.getByUserId(dauNoiNuoc.getIdNguoiDanhGia()).getName():StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:button-row>
				<liferay-portlet:renderURL varImpl="danhGiaLaiUrl">
					<liferay-portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/edit_danh_gia_lai.jsp"/>
					<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"/>
					<liferay-portlet:param name="<%=DauNoiNuocTerms.ID %>" value="<%=String.valueOf(dauNoiNuoc.getId()) %>"/>
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