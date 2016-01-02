<%@page import="vn.dtt.sol.ns.vesinhmoitruong.business.KeHoachKiemDemVeSinhBussiness"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemCongTrinhLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh"%>
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

	ThongTinKiemDemCongTrinh thongTin = null;
	int idThongTin = ParamUtil.getInteger(request, "idThongTin");
	if(idThongTin>0){
		thongTin = ThongTinKiemDemCongTrinhLocalServiceUtil.fetchThongTinKiemDemCongTrinh(idThongTin);
	}
	 String requiredLabel="";
	 requiredLabel ="(*)";
	 String dotLabel=":";
	 String dot="<font style=\"color:#ffffff\">.</font>";
	 String styleAnh1="padding-left: 0px !important;color: #0af !important;";
	 String styleAnh2="padding-left: 0px !important;color: #0af !important;";
	 String styleAnh3="padding-left: 0px !important;color: #0af !important;";
	 if(thongTin.getAnhChupChungNhan().length() < 5){
		 styleAnh1="padding-left: 0px !important;color: #0af !important;display: none !important;";
	 }
	List<ChiTietKiemDemCongTrinh> listDetail = null;
	if(Validator.isNotNull(thongTin)){
		listDetail = KeHoachKiemDemVeSinhBussiness.getListDetailCongTrinhByKeHoachId(thongTin.getId());
	}
	
%>
<liferay-portlet:renderURL var="viewEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/view_detail_tab3.jsp" />
	<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
	<portlet:param name="<%=KeHoachKiemDemVeSinhTerms.ID%>" value="<%= String.valueOf(thongTin.getKeHoachKiemDemVeSinhId()) %>" />
	<portlet:param name="tabs" value="view_detail_tab3"/>
</liferay-portlet:renderURL>
<liferay-ui:header backURL="<%= viewEntryURL.toString() %>" title='<%="thong-tin-vs-cong-trinh" %>' />
	
<c:choose>
	<c:when test="<%= Validator.isNotNull(thongTin) %>">
		<div class="dau-noi-header">
			<liferay-ui:message key="thong-tin-dia-diem-kiem-dem"></liferay-ui:message>
		</div>
		<aui:row>
			<aui:col width="50">
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"dc-thon-xom\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getDiaChi() %><%=dot %>
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
			<liferay-ui:message key="thong-tin-cong-trinh-kiem-dem"></liferay-ui:message>
		</div>
		<aui:row>
			<aui:col width="50">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ten-cong-trinh\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getTenCongTrinh() %><%=dot %>
				</aui:field-wrapper>
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"loai-cong-trinh\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getLoaiCongTrinh()>0?DataItemBusiness.getByNode1Id(WebKeys.DATAGROUPID_LOAICONGTRINH, String.valueOf("0"+thongTin.getLoaiCongTrinh())).getName():StringPool.BLANK %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-ca\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getSoCa()%><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ho-ten-nguoi-tra-loi\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getHoTenNguoiTraLoi() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"vai-tro-nguoi-tra-loi\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getVaiTroChucDanh()%><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"dien-thoai-thong-tin-lien-he\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getSoDienThoai()%><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguon-nuoc\") + dotLabel %>" inlineLabel="true">
						<%=Validator.isNotNull(thongTin.getLoaiNguonNuoc())?DataItemBusiness.getByNode1Id(WebKeys.DATAGROUPID_LOAINGUONNUOC,thongTin.getLoaiNguonNuoc()).getName():StringPool.BLANK%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguon-nuoc-rua-tay-co-dat\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%= LanguageUtil.get(pageContext,\"nguon-nuoc-rua-tay-co-dat-\"+thongTin.getDatTieuChuanHVS())%>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-nha-tieu\") + dotLabel %>" inlineLabel="true">
						<%=thongTin.getSoNhaTieu()%><%=dot %>
					</aui:field-wrapper>
					
			</aui:col>
			<aui:col width="50">
			<aui:field-wrapper label=" " inlineLabel="true">
					 <font color="#ffffff">.</font>
				</aui:field-wrapper>
				<aui:field-wrapper label=" " inlineLabel="true">
					 <font color="#ffffff">.</font>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-nguoi-trong-ca\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getSoNguoiTrongCa()%><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"gioi-tinh-nguoi-tra-loi\") + dotLabel %>" inlineLabel="true">
				<%String gioiTinhTL = Validator.isNotNull(thongTin.getGioiTinhNguoiTraLoi())?thongTin.getGioiTinhNguoiTraLoi():"0"; %>
					<liferay-ui:message key="<%= LanguageUtil.get(pageContext,\"gioi-tinh-\" +gioiTinhTL)%>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label=" " inlineLabel="true">
					 <font color="#ffffff">.</font>
				</aui:field-wrapper>
				<aui:field-wrapper label=" " inlineLabel="true">
					 <font color="#ffffff">.</font>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguon-nuoc-uong-co-dat\") + dotLabel %>" inlineLabel="true">
					<liferay-ui:message key="<%= LanguageUtil.get(pageContext,\"nguon-nuoc-uong-co-dat-\"+thongTin.getDaTQCVN())%>"></liferay-ui:message><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-phieu-xet-nghiem\") + dotLabel %>" inlineLabel="true">
					<c:if test="<%=1==1 %>">
					<%
						PortletURL viewImageUrlAnhPhieu = renderResponse.createRenderURL();
						viewImageUrlAnhPhieu.setParameter("mvcPath", "/html/portlet/kehoachkiemdemvesinh/dialog_image.jsp");
						viewImageUrlAnhPhieu.setParameter("imgUrl", thongTin.getAnhChupChungNhan());
						viewImageUrlAnhPhieu.setWindowState(LiferayWindowState.EXCLUSIVE);
					%>
						<a name="b4"></a>
						<a style="<%=styleAnh3 %>" onclick="javascript:viewDetail('<%=viewImageUrlAnhPhieu.toString()%>','<%= LanguageUtil.get(pageContext, "anh-phieu-chung-nhan") %>',0.5)" href="#b4"><liferay-ui:message key="anh-phieu-chung-nhan"></liferay-ui:message></a>
						</c:if>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		<div class="dau-noi-header">
			<liferay-ui:message key="thong-tin-dieu-tra-vs-cong-trinh"></liferay-ui:message>
		</div>
		<aui:row>
			<aui:col width="100">
			<%
				int count = 0;
				for(ChiTietKiemDemCongTrinh ett: listDetail){
					count++;
					PortletURL viewImageUrlAnhToanCanh = renderResponse.createRenderURL();
					viewImageUrlAnhToanCanh.setParameter("mvcPath", "/html/portlet/kehoachkiemdemvesinh/dialog_image.jsp");
					viewImageUrlAnhToanCanh.setParameter("imgUrl", ett.getAnhToanCanh());
					viewImageUrlAnhToanCanh.setWindowState(LiferayWindowState.EXCLUSIVE);
					PortletURL viewImageUrlAnhTrongNhaTieu = renderResponse.createRenderURL();
					viewImageUrlAnhTrongNhaTieu.setParameter("mvcPath", "/html/portlet/kehoachkiemdemvesinh/dialog_image.jsp");
					viewImageUrlAnhTrongNhaTieu.setParameter("imgUrl", ett.getAnhTrongNhaTieu());
					viewImageUrlAnhTrongNhaTieu.setWindowState(LiferayWindowState.EXCLUSIVE);
					PortletURL viewImageUrlAnhBeChua = renderResponse.createRenderURL();
					viewImageUrlAnhBeChua.setParameter("mvcPath", "/html/portlet/kehoachkiemdemvesinh/dialog_image.jsp");
					viewImageUrlAnhBeChua.setParameter("imgUrl", ett.getAnhBeChua());
					viewImageUrlAnhBeChua.setWindowState(LiferayWindowState.EXCLUSIVE);
					String b1 = "b"+count;
			%>
			
				<div class="dau-noi-header">
				<liferay-ui:message key="chi-tiet-nha-tieu"></liferay-ui:message>: <%=Validator.isNotNull(ett.getTenCongTrinh())?ett.getTenCongTrinh():StringPool.BLANK %>
				</div>
				<aui:row>
					<aui:col width="50">
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"loai-nha-tieu\") + dotLabel %>" inlineLabel="true">
						<%=Validator.isNotNull(ett.getLoaiNhaTieu())?DataItemBusiness.getByNode1Id(WebKeys.DATAGROUPID_LOAICAUTIEU,ett.getLoaiNhaTieu()).getName():StringPool.BLANK%><%=dot %> &nbsp;
						<c:if test="<%=ett.getAnhToanCanh().length() > 5 %>">
						<a name="<%=b1%>"></a>
						<a style="<%=styleAnh3 %>" onclick="javascript:viewDetail('<%=viewImageUrlAnhToanCanh.toString()%>','<%= LanguageUtil.get(pageContext, "anh-toan-canh") %>',0.5)" href="#<%=b1%>"><liferay-ui:message key="anh-toan-canh"></liferay-ui:message></a>
						</c:if>
						<c:if test="<%=ett.getAnhTrongNhaTieu().length() > 5 %>">
						<a name="<%=b1%>"></a>
						<a style="<%=styleAnh3 %>" onclick="javascript:viewDetail('<%=viewImageUrlAnhTrongNhaTieu.toString()%>','<%= LanguageUtil.get(pageContext, "anh-trong-nha-tieu") %>',0.5)" href="#<%=b1%>"><liferay-ui:message key="anh-trong-nha-tieu"></liferay-ui:message></a>
						</c:if>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-ho-tieu\") + dotLabel %>" inlineLabel="true">
						<%=ett.getSoHoTieu() %><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"cong-trinh-co-sach-se\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "cong-trinh-co-sach-se-"+ett.getVeSinhSachSe())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tuong-va-san-co-de-lam-ve-sinh\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "tuong-va-san-co-de-lam-ve-sinh-"+ett.getDeLamVeSinh())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"mui-nuoc-tieu-va-phan\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "mui-nuoc-tieu-va-phan-"+ett.getMuiVeSinh())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"phia-tren-co-du-kin-dao\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "phia-tren-co-du-kin-dao-"+ett.getPhiaTrenKinDao())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"phia-tren-co-che-mua-gio\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "phia-tren-co-du-kin-dao-"+ett.getDuCheMuaGio())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"san-bi-xi-co-cao-hon-mat-dat\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "san-bi-xi-co-cao-hon-mat-dat-"+ett.getSanCaoTrenToiThieu())%><%=dot %>
					</aui:field-wrapper>
					</aui:col>
					<aui:col width="50">
					<aui:field-wrapper label=" " inlineLabel="true" >
						<c:if test="<%=ett.getAnhBeChua().length() > 5 %>">
						<a style="<%=styleAnh3 %>" onclick="javascript:viewDetail('<%=viewImageUrlAnhBeChua.toString()%>','<%= LanguageUtil.get(pageContext, "anh-be-chua") %>',0.5)" href="#<%=b1%>"><liferay-ui:message key="anh-be-chua"></liferay-ui:message></a>
						<a name="<%=b1%>"></a>
						</c:if>
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"co-cong-trinh-rua-tay\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "san-bi-xi-co-cao-hon-mat-dat-"+ett.getCoCongTrinhRuaTay() )%><%=dot %>
					</aui:field-wrapper>
					<c:if test="<%=Validator.isNotNull(ett.getCoCongTrinhRuaTay()) %>">
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"chi-tet-cong-trinh-rua-tay\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "chi-tet-cong-trinh-rua-tay-"+ett.getChiTietCongTrinhRuaTay() )%><%=dot %>
					</aui:field-wrapper>
					</c:if>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nap-be-xi-be-phan-con\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "nap-be-xi-be-phan-con-"+ett.getNapBeConTot())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"lo-va-cua-chua-phan-co-duoc-bit-kin\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "lo-va-cua-chua-phan-co-duoc-bit-kin-"+ett.getCuaPhanBitKin())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nuoc-hoac-phan-bun-tran-ra-ngoai\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "nuoc-hoac-phan-bun-tran-ra-ngoai-"+ett.getTranRaNgoai())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nuoc-thai-tu-be-chay-di-dau\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "nuoc-thai-tu-be-chay-di-dau-"+ett.getNuocThaiDiDau())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguon-nuoc-chinh-cach-be-chua-bao-xa\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "nguon-nuoc-chinh-cach-be-chua-bao-xa-"+ett.getKhoangCachNguonNuoc())%><%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nha-tieu-co-bi-ngap-lut-khi-mua-lon\") + dotLabel %>" inlineLabel="true">
						<%=LanguageUtil.get(pageContext, "nha-tieu-co-bi-ngap-lut-khi-mua-lon-"+ett.getNgapKhiMuaLon())%><%=dot %>
					</aui:field-wrapper>
					</aui:col>
				</aui:row>
			<%} %>
			<%if(Validator.isNull(listDetail) || listDetail.size() < 1){ %>
				<div class="dau-noi-header">
				<liferay-ui:message key="chi-tiet-nha-tieu"></liferay-ui:message>:
				</div>
				<aui:row>
					<aui:col width="50">
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"loai-nha-tieu\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-ho-tieu\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"cong-trinh-co-sach-se\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tuong-va-san-co-de-lam-ve-sinh\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"mui-nuoc-tieu-va-phan\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"phia-tren-co-du-kin-dao\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"phia-tren-co-che-mua-gio\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"san-bi-xi-co-cao-hon-mat-dat\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					</aui:col>
					<aui:col width="50">
					<aui:field-wrapper label=" " inlineLabel="true" >
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"co-cong-trinh-rua-tay\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"chi-tet-cong-trinh-rua-tay\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nap-be-xi-be-phan-con\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"lo-va-cua-chua-phan-co-duoc-bit-kin\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nuoc-hoac-phan-bun-tran-ra-ngoai\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nuoc-thai-tu-be-chay-di-dau\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguon-nuoc-chinh-cach-be-chua-bao-xa\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nha-tieu-co-bi-ngap-lut-khi-mua-lon\") + dotLabel %>" inlineLabel="true">
						<%=dot %>
					</aui:field-wrapper>
					</aui:col>
				</aui:row>
			<%} %>
					
			</aui:col>
			
		</aui:row>
		<div class="dau-noi-header">
			<liferay-ui:message key="ket-qua-dieu-tra"></liferay-ui:message>
		</div>
		<aui:row>
			<aui:col width="100">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"trang-thai-dieu-tra\") + dotLabel %>" inlineLabel="true">
					<%=LanguageUtil.get(pageContext, "danh-gia-kiem-dem-cong-trinh-"+thongTin.getDanhGiaKiemDem()) %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ly-do-khong-hoan-thanh\") + dotLabel %>" inlineLabel="true">
					<%=thongTin.getLyDoKhongHoanThanh() %><%=dot %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ghi-chu\") + dotLabel %>" inlineLabel="true">
						<%=thongTin.getGhiChu()%><%=dot %>
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
