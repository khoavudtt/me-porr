<%@page import="vn.dtt.sol.ns.kehoachkiemdemnuoc.terms.KeHoachKiemDemNuocTerms"%>
<%@page import="vn.dtt.sol.ns.business.KiemDemVienBussiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC"%>
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
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
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

	THONGTINKIEMDEMNUOC thongTin = null;
	long idThongTin = ParamUtil.getLong(request, "idThongTin");
	if(idThongTin>0){
		thongTin = THONGTINKIEMDEMNUOCLocalServiceUtil.fetchTHONGTINKIEMDEMNUOC(idThongTin);
	}
	 String requiredLabel="";
	 requiredLabel ="(*)";
	 String dotLabel=":";
	 String dot="<font style=\"color:#ffffff\">.</font>";
	 String styleAnh1="padding-left: 0px !important;color: #0af !important;";
	 String styleAnh2="padding-left: 0px !important;color: #0af !important;";
	 String styleAnh3="padding-left: 0px !important;color: #0af !important;";
	 if(thongTin.getAnhDauNoi().length() < 5){
		 styleAnh1="padding-left: 0px !important;color: #0af !important;display: none !important;";
	 }
	if(thongTin.getAnhBeChua().length() < 5){
		styleAnh2="padding-left: 0px !important;color: #0af !important;display: none !important;";
	}
	if(thongTin.getAnhDongHo().length() < 5){
		styleAnh3="padding-left: 0px !important;color: #0af !important;display: none !important;";
	}
%>
<liferay-portlet:renderURL var="viewEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view_detail_tab1.jsp" />
	<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
	<portlet:param name="<%=KeHoachKiemDemNuocTerms.ID%>" value="<%= String.valueOf(thongTin.getKeHoachKiemDemNuocId()) %>" />
</liferay-portlet:renderURL>
<liferay-ui:header backURL="<%= viewEntryURL.toString() %>" title='<%="kiem-dem-dau-noi-nuoc" %>' />
	<portlet:renderURL var="viewImageDialog" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
		<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/dialog_image.jsp"/>
		<portlet:param name="imgUrl" value="<%=thongTin.getAnhDauNoi() %>"/>
	</portlet:renderURL>
	<portlet:renderURL var="viewImageBeChuaDialog" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
		<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/dialog_image.jsp"/>
		<portlet:param name="imgUrl" value="<%=thongTin.getAnhBeChua() %>"/>
	</portlet:renderURL>
	<portlet:renderURL var="viewImageBeDongHoDialog" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
		<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/dialog_image.jsp"/>
		<portlet:param name="imgUrl" value="<%=thongTin.getAnhDongHo()%>"/>
	</portlet:renderURL>
			
<c:choose>
	<c:when test="<%= Validator.isNotNull(thongTin) %>">
		<div class="dau-noi-header">
			<liferay-ui:message key="thong-tin-dia-diem-kiem-dem"></liferay-ui:message>
		</div>
		<aui:row>
			<aui:col width="50">
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"dc-thon-xom\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getThonXom() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") + dotLabel %>" inlineLabel="true">
					<%=NuocSachUtils.getNameTinh(thongTin.getMaTinh()) %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") + dotLabel %>" inlineLabel="true">
					<%=NuocSachUtils.getNameHuyen(thongTin.getMaTinh(),thongTin.getMaHuyen()) %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"phuong-xa\") + dotLabel %>" inlineLabel="true">
					<%=NuocSachUtils.getNameXa(thongTin.getMaXa()) %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguoi-kiem-dem\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(KiemDemVienBussiness.findByTaiKhoan(thongTin.getTaiKhoan()))?KiemDemVienBussiness.findByTaiKhoan(thongTin.getTaiKhoan()).getHoVaTen():StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-kiem-dem\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(thongTin.getNgayKiemDem())?dateFormatDate.format(thongTin.getNgayKiemDem()):StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
				<aui:col width="50">
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"kinh-do\") + dotLabel %>" inlineLabel="true" >
						<%=thongTin.getKinhDo() %><%=dot %>
					</aui:field-wrapper>
				</aui:col>
				<aui:col width="50">
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"vi-do\") + dotLabel %>" inlineLabel="true" >
						<%=thongTin.getViDo() %><%=dot %>
					</aui:field-wrapper>
				</aui:col>
				
				<aui:field-wrapper name=" " label=" " inlineLabel="true">
				<div id="locationpicker">
					<div id="us2" style="width: 100%; height: 300px;"></div>
					<script>$('#us2').locationpicker({
							location: {latitude: <%=Validator.isNotNull(thongTin.getViDo())?thongTin.getViDo():"21.023277896055212" %>, longitude: <%= Validator.isNotNull(thongTin.getKinhDo())?thongTin.getKinhDo():"105.83364481586909" %>},	
							radius: 300
						});
					</script>
				</div>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		
		<div class="dau-noi-header">
			<liferay-ui:message key="thong-tin-ho-gia-dinh-kiem-dem"></liferay-ui:message>
		</div>
		<aui:row>
			<aui:col width="50">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ten-chu-ho\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getTenChuHo() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ho-ten-nguoi-tra-loi\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getHoTenNguoiTraLoi() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"gioi-tinh-nguoi-tra-loi\") + dotLabel %>" inlineLabel="true">
				<%String gioiTinhTL = Validator.isNotNull(thongTin.getGioiTinhNguoiTraLoi())?thongTin.getGioiTinhNguoiTraLoi():"0"; %>
					<liferay-ui:message key="<%= LanguageUtil.get(pageContext,\"gioi-tinh-\" +gioiTinhTL)%>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-nguoi-trong-ho\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getSoNguoiTrongHo()>0?thongTin.getSoNguoiTrongHo():StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ten-chu-ho-dung-voi-ds-kiem-dem\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%= LanguageUtil.get(pageContext, \"ten-chu-ho-dung-voi-ds-kiem-dem-\" + thongTin.getChuHoDungDs()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ten-chu-ho-hien-tai\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getTenChuHoHienTai() %><%=dot %>
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"gioi-tinh-chu-ho\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%= LanguageUtil.get(pageContext,DauNoiNuocBusiness.getGioiTinh(thongTin.getGioiTinhChuHo())) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"la-chu-ho-khong\") + dotLabel %>" inlineLabel="true">
					<%=LanguageUtil.get(pageContext, "la-chu-ho-khong-"+thongTin.getLaChuHoKhong()) %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"dan-toc-nguoi-tra-loi\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getTenDanToc() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"thanh-phan-ho-gia-dinh\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%=LanguageUtil.get(pageContext, \"thanh-phan-ho-gia-dinh-\"+thongTin.getThanhPhanHoGd()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ly-do-khong-dung\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getLyDoKhongDungDs()%><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"gioi-tinh\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%= LanguageUtil.get(pageContext,DauNoiNuocBusiness.getGioiTinh(thongTin.getGioiTinhChuHoHienTai())) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		<div class="dau-noi-header">
			<liferay-ui:message key="thong-tin-dieu-tra-dau-noi-nuoc"></liferay-ui:message>
		</div>
		<aui:row>
			<aui:col width="50">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"da-duoc-dau-noi-chua\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%= LanguageUtil.get(pageContext,\"da-duoc-dau-noi-chua-\"+thongTin.getDauNoiChua()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-dau-noi-tren-hop-dong\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(thongTin.getThoiGianDauHopDong())?dateFormatDate.format(thongTin.getThoiGianDauHopDong()):StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"voi-nuoc-co-chay-khong\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%= LanguageUtil.get(pageContext,\"voi-nuoc-co-chay-khong-\"+thongTin.getVoiNuocChayKhong()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguon-nuoc-hien-tai\")%>" inlineLabel="true" >
				 <%=LanguageUtil.get(pageContext, "nguon-nuoc-hien-tai-trong-"+thongTin.getNuocTrongKhong()) %><font color="#ffffff">.</font>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"mau-nuoc\") + dotLabel %>" inlineLabel="true">
						<%=thongTin.getMauNuoc() %><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"vi-nuoc\") + dotLabel %>" inlineLabel="true">
						<%=thongTin.getViNuoc() %><%=dot %>
					</aui:field-wrapper>
<%-- 				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguon-nuoc-truoc-day\") %>" inlineLabel="true"> --%>
<!-- 					<font color="#ffffff">.</font> -->
<%-- 				</aui:field-wrapper> --%>
<%-- 				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"mau-nuoc\") + dotLabel %>" inlineLabel="true"> --%>
<%-- 						<%=thongTin.getMauNuocTungCo() %><%=dot %> --%>
<%-- 					</aui:field-wrapper> --%>
<%-- 					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"vi-nuoc\") + dotLabel %>" inlineLabel="true"> --%>
<%-- 						<%=thongTin.getViNuocTungCo() %><%=dot %> --%>
<%-- 					</aui:field-wrapper> --%>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"co-be-chua-nuoc-khong\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "co-be-chua-nuoc-khong-"+thongTin.getCoBeChuaNuoc()) %><%=dot %> &nbsp; 
						<a id="idImage2" style="<%=styleAnh2%>" onclick="javascript:viewDetail('<%=viewImageBeChuaDialog.toString()%>','<%= LanguageUtil.get(pageContext, "anh-be-chua-nuoc") %>',0.5)" href="#b2" ><liferay-ui:message key="anh-be-chua-nuoc"></liferay-ui:message></a>
						<a name="b2"></a>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-gio-trung-binh-mot-lan-mat-nuoc\") + dotLabel %>" inlineLabel="true">
						<%=thongTin.getSoGioTrungBinh() %><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-se-ry-dong-ho-nuoc\") + dotLabel %>" inlineLabel="true">
						<%=thongTin.getSoSeRyDongHo()%><%=dot %> &nbsp;
						<a id="idImage3" style="<%=styleAnh3%>" onclick="javascript:viewDetail('<%=viewImageBeDongHoDialog.toString()%>','<%= LanguageUtil.get(pageContext, "anh-be-dong-ho") %>',0.5)" href="#b3"><liferay-ui:message key="anh-be-dong-ho"></liferay-ui:message></a>
						<a name="b3"></a>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ghi-chu\") + dotLabel %>" inlineLabel="true">
						<%=thongTin.getGhiChu()%><%=dot %>
					</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
				<aui:field-wrapper label=" " inlineLabel="true">
					<a id="idImage" style="<%=styleAnh1%>" onclick="javascript:viewDetail('<%=viewImageDialog.toString()%>','<%= LanguageUtil.get(pageContext, "anh-dau-noi-nuoc") %>',0.5)" href="#b1" ><liferay-ui:message key="anh-dau-noi-nuoc"></liferay-ui:message></a>
					<a name="b1"></a>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-dau-noi-thuc-te\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(thongTin.getThoiGianDauNoiThucTe())?dateFormatDate.format(thongTin.getThoiGianDauNoiThucTe()):StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label=" " inlineLabel="true">
					 <font color="#ffffff">.</font>
				</aui:field-wrapper>
				<aui:field-wrapper label=" " inlineLabel="true">
					<font color="#ffffff">.</font>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"mui-nuoc\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getMuiNuoc()%><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"khac\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getLoaiKhac() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label=" " inlineLabel="true">
					<font color="#ffffff">.</font>
				</aui:field-wrapper>
<%-- 				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"mui-nuoc\") + dotLabel %>" inlineLabel="true"> --%>
<%-- 					<%=thongTin.getMuiNuocTungCo() %><%=dot %> --%>
<%-- 				</aui:field-wrapper> --%>
<%-- 				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"khac\") + dotLabel %>" inlineLabel="true"> --%>
<%-- 					<%=thongTin.getLoaiKhacTungCo() %><%=dot %> --%>
<%-- 				</aui:field-wrapper> --%>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tinh-trang-be-chua\") + dotLabel + \" \" + LanguageUtil.get(pageContext, \"tinh-trang-be-chua-\"+thongTin.getTinhTrangBe()) %>" inlineLabel="true">
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"bi-mat-nuoc\") + dotLabel %>" inlineLabel="true">
					<%=LanguageUtil.get(pageContext, "bi-mat-nuoc-"+thongTin.getBiMatNuoc()) %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-lan-mat-nuoc\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getSoLanMatNuoc() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"chi-so-dong-ho\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(thongTin.getChiSoDongHo())?thongTin.getChiSoDongHo():StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		<div class="dau-noi-header">
			<liferay-ui:message key="ket-qua-dieu-tra"></liferay-ui:message>
		</div>
		<aui:row>
			<aui:col width="100">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"trang-thai-dieu-tra\") + dotLabel %>" inlineLabel="true">
					<%=LanguageUtil.get(pageContext, "danh-gia-kiem-dem-"+thongTin.getDanhGiaKiemDem()) %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ly-do-khong-hoan-thanh\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getLyDoKhongHoanThanh() %><%=dot %>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
	</c:when>	
	
	<c:otherwise>
		<liferay-ui:message key="thong-tin-kiem-dem-nuoc-khong-ton-tai"/>
	</c:otherwise>
</c:choose>
<style>
.control-label{
width:250px !important;
}
</style>
