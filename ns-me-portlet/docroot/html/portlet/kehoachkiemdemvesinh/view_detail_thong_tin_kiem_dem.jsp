<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.KeHoachKiemDemVeSinhTerms"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemHoGDLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD"%>
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

	ThongTinKiemDemHoGD thongTin = null;
	int idThongTin = ParamUtil.getInteger(request, "idThongTin");
	if(idThongTin>0){
		thongTin = ThongTinKiemDemHoGDLocalServiceUtil.fetchThongTinKiemDemHoGD(idThongTin);
	}
	 String requiredLabel="";
	 requiredLabel ="(*)";
	 String dotLabel=":";
	 String dot="<font style=\"color:#ffffff\">.</font>";
	 String styleAnh1="padding-left: 0px !important;color: #0af !important;";
	 String styleAnh2="padding-left: 0px !important;color: #0af !important;";
	 String styleAnh3="padding-left: 0px !important;color: #0af !important;";
	 if(thongTin.getAnhBeChua().length() < 5){
		 styleAnh1="padding-left: 0px !important;color: #0af !important;display: none !important;";
	 }
	if(thongTin.getAnhToanCanh().length() < 5){
		styleAnh2="padding-left: 0px !important;color: #0af !important;display: none !important;";
	}
	if(thongTin.getAnhTrongNhaTieu().length() < 5){
		styleAnh3="padding-left: 0px !important;color: #0af !important;display: none !important;";
	}
	
%>
<liferay-portlet:renderURL var="viewEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/view_detail_tab1.jsp" />
	<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
	<portlet:param name="<%=KeHoachKiemDemVeSinhTerms.ID%>" value="<%= String.valueOf(thongTin.getKeHoachKiemDemVeSinhId()) %>" />
</liferay-portlet:renderURL>
<liferay-ui:header backURL="<%= redirect %>" title='<%="thong-tin-vs-ho-gd" %>' />
	<portlet:renderURL var="viewImageDialog" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
		<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/dialog_image.jsp"/>
		<portlet:param name="imgUrl" value="<%=thongTin.getAnhBeChua() %>"/>
	</portlet:renderURL>
	<portlet:renderURL var="viewImageBeChuaDialog" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
		<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/dialog_image.jsp"/>
		<portlet:param name="imgUrl" value="<%=thongTin.getAnhTrongNhaTieu() %>"/>
	</portlet:renderURL>
	<portlet:renderURL var="viewImageBeDongHoDialog" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
		<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/dialog_image.jsp"/>
		<portlet:param name="imgUrl" value="<%=thongTin.getAnhToanCanh()%>"/>
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
					<liferay-ui:message key="<%= LanguageUtil.get(pageContext, \"ten-chu-ho-dung-voi-ds-kiem-dem-\" + thongTin.getChuHoDungDS()) %>"></liferay-ui:message><%=dot %>
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
					<liferay-ui:message key="<%=LanguageUtil.get(pageContext, \"thanh-phan-ho-gia-dinh-\"+thongTin.getThanhPhanHoGD()) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ly-do-khong-dung\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getLyDoKhongDungDS()%><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"gioi-tinh\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%= LanguageUtil.get(pageContext,DauNoiNuocBusiness.getGioiTinh(thongTin.getGioiTinhChuHoHienTai())) %>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		<div class="dau-noi-header">
			<liferay-ui:message key="thong-tin-dieu-tra-vs-ho-gia-dinh"></liferay-ui:message>
		</div>
		<aui:row>
			<aui:col width="50">
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"thoi-gian-hoan-thanh\") + dotLabel %>" inlineLabel="true">
						<c:if test="<%=thongTin.getThangXayDung()> 0 && thongTin.getNamXayDung() > 0 %>">
						<%=thongTin.getThangXayDung()%> / <%=thongTin.getNamXayDung()%>
						</c:if>
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"co-cong-trinh-ve-sinh-khong\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "co-cong-trinh-ve-sinh-khong-"+thongTin.getCoNhaTieu())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"co-phai-cong-trinh-cai-tao\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "co-phai-cong-trinh-cai-tao-"+thongTin.getDuocCaiTao())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"cong-trinh-co-sach-se\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "cong-trinh-co-sach-se-"+thongTin.getVeSinhSachSe())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"mui-nuoc-tieu-va-phan\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "mui-nuoc-tieu-va-phan-"+thongTin.getMuiVeSinh())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"cong-trinh-co-dam-bao-che\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "cong-trinh-co-dam-bao-che-"+thongTin.getPhiaTrenKinDao())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nap-be-xi-be-phan-con\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "nap-be-xi-be-phan-con-"+thongTin.getNapBeConTot())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nuoc-hoac-phan-bun-tran-ra-ngoai\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "nuoc-hoac-phan-bun-tran-ra-ngoai-"+thongTin.getTranRaNgoai())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguon-nuoc-chinh-cach-be-chua-bao-xa\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "nguon-nuoc-chinh-cach-be-chua-bao-xa-"+thongTin.getKhoangCachNguonNuoc())%><%=dot %>
						&nbsp;
						<a id="idImage2" onclick="javascript:viewDetail('<%=viewImageDialog.toString()%>','<%=LanguageUtil.get(pageContext, "anh-be-chua") %>',0.5)" style="<%=styleAnh1%>" href="#b2"><liferay-ui:message key="anh-be-chua"></liferay-ui:message></a>
						<a name="b2"></a>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"kinh-phi-xay-dung\") + dotLabel %>" inlineLabel="true">
						<%=thongTin.getChiTietVonVay()%><%=dot %>
					</aui:field-wrapper>

					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ghi-chu\") + dotLabel %>" inlineLabel="true">
						<%=thongTin.getGhiChu()%><%=dot %>
					</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguon-nuoc\") + dotLabel %>" inlineLabel="true">
						<%=Validator.isNotNull(thongTin.getLoaiNguonNuoc())?DataItemBusiness.getByNode1Id(WebKeys.DATAGROUPID_LOAINGUONNUOC,thongTin.getLoaiNguonNuoc()).getName():StringPool.BLANK%><%=dot %>
					</aui:field-wrapper>
					
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"loai-nha-tieu\") + dotLabel %>" inlineLabel="true">
						<%=Validator.isNotNull(thongTin.getLoaiNhaTieu())?DataItemBusiness.getByNode1Id(WebKeys.DATAGROUPID_LOAICAUTIEU,thongTin.getLoaiNhaTieu()).getName():StringPool.BLANK%><%=dot %> &nbsp;
						<a id="idImage" onclick="javascript:viewDetail('<%=viewImageBeDongHoDialog.toString()%>','<%=LanguageUtil.get(pageContext, "anh-toan-canh") %>',0.5)" style="<%=styleAnh2%>" href="#b1"><liferay-ui:message key="anh-toan-canh"></liferay-ui:message></a>
						<a name="b1"></a>
					&nbsp;
						<a id="idImage3" onclick="javascript:viewDetail('<%=viewImageBeChuaDialog.toString()%>','<%=LanguageUtil.get(pageContext, "anh-trong-nha-tieu") %>',0.5)" style="<%=styleAnh3%>" href="#b3"><liferay-ui:message key="anh-trong-nha-tieu"></liferay-ui:message></a>
						<a name="b3"></a>
					</aui:field-wrapper>
					
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"loai-cong-trinh-cai-tao\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "loai-cong-trinh-cai-tao-"+thongTin.getDuocCaiTao())%><%=dot %>
					</aui:field-wrapper>
					
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tuong-va-san-co-de-lam-ve-sinh\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "tuong-va-san-co-de-lam-ve-sinh-"+thongTin.getDeLamVeSinh())%><%=dot %>
					</aui:field-wrapper>
					
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"phia-tren-co-du-kin-dao\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "phia-tren-co-du-kin-dao-"+thongTin.getPhiaTrenKinDao())%><%=dot %>
					</aui:field-wrapper>
					
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"san-bi-xi-co-cao-hon-mat-dat\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "san-bi-xi-co-cao-hon-mat-dat-"+thongTin.getSanCaoTrenToiThieu())%><%=dot %>
					</aui:field-wrapper>
					
					
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"lo-va-cua-chua-phan-co-duoc-bit-kin\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "lo-va-cua-chua-phan-co-duoc-bit-kin-"+thongTin.getCuaPhanBitKin())%><%=dot %>
					</aui:field-wrapper>
					
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nuoc-thai-tu-be-chay-di-dau\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "nuoc-thai-tu-be-chay-di-dau-"+thongTin.getNuocThaiDiDau())%><%=dot %>
					</aui:field-wrapper>
					
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nha-tieu-co-bi-ngap-lut-khi-mua-lon\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "nha-tieu-co-bi-ngap-lut-khi-mua-lon-"+thongTin.getNgapKhiMuaLon())%><%=dot %>
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
