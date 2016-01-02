<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.DauNoiNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDImpl"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemHoGDLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhGiaDinhTerms"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCImpl"%>
<%@page import="vn.dtt.sol.ns.business.KiemDemVienBussiness"%>
<%@page import="vn.dtt.sol.ns.kehoachkiemdemnuoc.terms.KeHoachKiemDemNuocTerms"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocSearch"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocDisplayTerms"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.util.ActionKeys"%>
<%@page import="vn.dtt.cmon.user.permission.UserMappingPermission"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.cmon.user.action.UserMappingAction"%>
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="com.liferay.portal.model.Contact"%>
<%@page import="org.apache.commons.beanutils.BeanComparator" %>
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
	List<ThongTinKiemDemHoGD> resultThongTin = new ArrayList<ThongTinKiemDemHoGD>();
	int idThongTinKeHoach = ParamUtil.getInteger(request, "idThongTinKeHoach");
	long idGet = 0;
	if(idThongTinKeHoach>0){
		if(Validator.isNotNull(ThongTinKiemDemHoGDLocalServiceUtil.fetchThongTinKiemDemHoGD(idThongTinKeHoach))){
			idGet = ThongTinKiemDemHoGDLocalServiceUtil.fetchThongTinKiemDemHoGD(idThongTinKeHoach).getVeSinhGiaDinhId();
			veSinhGiaDinh = VeSinhGiaDinhLocalServiceUtil.fetchVeSinhGiaDinh(Integer.valueOf(idGet+""));
		}else{
		idGet = veSinhGiaDinh.getId();
		}
	}
	
	ThongTinKiemDemHoGD thongTin = new ThongTinKiemDemHoGDImpl();
		try{
			resultThongTin = new ArrayList<ThongTinKiemDemHoGD>(ThongTinKiemDemHoGDLocalServiceUtil.getListThongTinKiemDemHoGiaDinhByGDID(veSinhGiaDinh.getId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS));
		}catch(Exception e){
			resultThongTin = null;
		}
		
		if(idThongTinKeHoach>0){
			thongTin = ThongTinKiemDemHoGDLocalServiceUtil.fetchThongTinKiemDemHoGD(idThongTinKeHoach);
		}else{
			if(resultThongTin.size()>0){
				thongTin = new ThongTinKiemDemHoGDImpl();
				thongTin = resultThongTin.get(0);
			}else{
				thongTin = new ThongTinKiemDemHoGDImpl();
			}
		}
		 String styleAnh1="padding-left: 0px !important;color: #0af !important;";
		 String styleAnh2="padding-left: 0px !important;color: #0af !important;";
		 String styleAnh3="padding-left: 0px !important;color: #0af !important;";
		 if(thongTin.getAnhToanCanh().length() < 5){
			 styleAnh1="padding-left: 0px !important;color: #0af !important;display: none !important;";
		 }
		if(thongTin.getAnhBeChua().length() < 5){
			styleAnh2="padding-left: 0px !important;color: #0af !important;display: none !important;";
		}
		if(thongTin.getAnhTrongNhaTieu().length() < 5){
			styleAnh3="padding-left: 0px !important;color: #0af !important;display: none !important;";
		}
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
<liferay-ui:header backURL="<%= redirectDauNoiURL.toString() %>" title='<%="vs-ho-gia-dinh" %>' />
	
<liferay-util:include page='<%= "/html/portlet/vesinhhogiadinh/top_tabs.jsp" %>' servletContext="<%= application %>" />
<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/view_thong_tin_kiem_dem.jsp" />
	<portlet:param name="<%=VeSinhGiaDinhTerms.ID %>" value="<%=String.valueOf(veSinhGiaDinh.getId()) %>"/>
</liferay-portlet:renderURL>
<aui:form action="<%= searchURL %>" method="get" name="fm2">
	<liferay-portlet:renderURLParams varImpl="searchURL" />
		<liferay-portlet:renderURL varImpl="iteratorURL">
		<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/view_thong_tin_kiem_dem.jsp" />
		<portlet:param name="<%=VeSinhGiaDinhTerms.ID %>" value="<%=String.valueOf(veSinhGiaDinh.getId()) %>"/>
	</liferay-portlet:renderURL>
	<aui:fieldset>
		<liferay-ui:search-container searchContainer="<%=new DauNoiNuocSearch(renderRequest, SearchContainer.DEFAULT_DELTA, SearchContainer.DEFAULT_ORDER_BY_COL_PARAM, SearchContainer.DEFAULT_ORDER_BY_TYPE_PARAM, iteratorURL) %>" >
			<liferay-ui:search-container-results>
				<%@ include file="/html/portlet/vesinhhogiadinh/search_thongtinkiemdem_database_result.jspf"%>
			</liferay-ui:search-container-results>
			<liferay-ui:search-container-row className="vn.dtt.sol.ns.reporting.ThongTinKiemDemNuocModel" keyProperty="id" modelVar="kiemDemNuoc" >
				<liferay-portlet:renderURL var="viewEntryURL">
					<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/view_thong_tin_kiem_dem.jsp" />
					<liferay-portlet:param name="idThongTinKeHoach" value="<%=String.valueOf(kiemDemNuoc.getId()) %>"></liferay-portlet:param>
					<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
					<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
					<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
					<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
					<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
					<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.ID %>" value="<%=String.valueOf(veSinhGiaDinh.getId()) %>"></liferay-portlet:param>
					<liferay-portlet:param name="tabs" value="kiem_dem"></liferay-portlet:param>
					<liferay-portlet:param name="cur" value="1"></liferay-portlet:param>
					<liferay-portlet:param name="cur2" value="1"></liferay-portlet:param>
				</liferay-portlet:renderURL>
				
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" name="<%= LanguageUtil.get(pageContext, \"nguoi-kiem-dem\") %>" value="<%= kiemDemNuoc.getNguoiKiemDem() %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" name="<%= LanguageUtil.get(pageContext, \"ke-hoach\") %>" value="<%= kiemDemNuoc.getKeHoach() %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" name="<%= LanguageUtil.get(pageContext, \"ten-nguoi-tra-loi\") %>" value="<%= kiemDemNuoc.getNguoiTraLoi() %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" name="<%= LanguageUtil.get(pageContext, \"tinh-trang\") %>" value="<%= LanguageUtil.get(pageContext, kiemDemNuoc.getTrangThai()) %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" name="<%= LanguageUtil.get(pageContext, \"ngay-kiem-dem\") %>" value="<%= kiemDemNuoc.getNgayKiemDem() %>" />
				<liferay-ui:search-container-column-text href="<%=viewEntryURL.toString() %>" name="<%= LanguageUtil.get(pageContext, \"ket-qua-dieu-tra\") %>" value="<%= LanguageUtil.get(pageContext, kiemDemNuoc.getKetQuaDieuTra())  %>" />
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
		</liferay-ui:search-container>
	</aui:fieldset>
<portlet:renderURL var="viewImageDialog" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
		<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/dialog_image.jsp"/>
		<portlet:param name="imgUrl" value="<%=thongTin.getAnhToanCanh() %>"/>
	</portlet:renderURL>
	<portlet:renderURL var="viewImageBeChuaDialog" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
		<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/dialog_image.jsp"/>
		<portlet:param name="imgUrl" value="<%=thongTin.getAnhBeChua() %>"/>
	</portlet:renderURL>
	<portlet:renderURL var="viewImageBeDongHoDialog" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
		<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/dialog_image.jsp"/>
		<portlet:param name="imgUrl" value="<%=thongTin.getAnhTrongNhaTieu()%>"/>
	</portlet:renderURL>
			<aui:script>
				AUI().use('aui-base','aui-io-plugin-deprecated','liferay-util-window',function(A) {
					A.one('#idImage').on('click', function(event){
					var popUpWindow=Liferay.Util.Window.getWindow(
					{
						dialog: {
							centered: true,
							constrain2view: true,
							modal: true,
							resizable: false,
							width: screen.width * 0.8
						}
					}
					).plug(A.Plugin.IO,{autoLoad: false}).render();
					popUpWindow.show();
					popUpWindow.titleNode.html("Ảnh đấu nối");
					popUpWindow.io.set('uri','<%=viewImageDialog.toString()%>');
					popUpWindow.io.start();
					});
					A.one('#idImage2').on('click', function(event){
					var popUpWindow=Liferay.Util.Window.getWindow(
					{
						dialog: {
							centered: true,
							constrain2view: true,
							modal: true,
							resizable: false,
							width: screen.width * 0.8
						}
					}
					).plug(A.Plugin.IO,{autoLoad: false}).render();
					popUpWindow.show();
					popUpWindow.titleNode.html("Ảnh bể chứa");
					popUpWindow.io.set('uri','<%=viewImageBeChuaDialog.toString()%>');
					popUpWindow.io.start();
					});
					A.one('#idImage3').on('click', function(event){
					var popUpWindow=Liferay.Util.Window.getWindow(
					{
						dialog: {
							centered: true,
							constrain2view: true,
							modal: true,
							resizable: false,
							width: screen.width * 0.8
						}
					}
					).plug(A.Plugin.IO,{autoLoad: false}).render();
					popUpWindow.show();
					popUpWindow.titleNode.html("Ảnh đồng hồ");
					popUpWindow.io.set('uri','<%=viewImageBeDongHoDialog.toString()%>');
					popUpWindow.io.start();
					});
				});
			</aui:script>
<c:choose>
	<c:when test="<%= resultThongTin.size()>0 %>">
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
					</aui:field-wrapper>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"kinh-phi-xay-dung\") + dotLabel %>" inlineLabel="true">
						<%=thongTin.getChiTietVonVay()%><%=dot %>
					</aui:field-wrapper>
<%-- 					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"anh-trong-nha-tieu\") + dotLabel %>" inlineLabel="true"> --%>
<%-- 						<a id="idImage3" style="<%=styleAnh3%>" href="#b3"><liferay-ui:message key="anh-trong-nha-tieu"></liferay-ui:message></a> --%>
<!-- 						<a name="b3"></a> -->
<%-- 					</aui:field-wrapper> --%>
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ghi-chu\") + dotLabel %>" inlineLabel="true">
						<%=thongTin.getGhiChu()%><%=dot %>
					</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"nguon-nuoc\") + dotLabel %>" inlineLabel="true">
						<%=Validator.isNotNull(thongTin.getLoaiNguonNuoc())?DataItemBusiness.getByNode1Id(WebKeys.DATAGROUPID_LOAINGUONNUOC,thongTin.getLoaiNguonNuoc()).getName():StringPool.BLANK%><%=dot %>
					</aui:field-wrapper>
					
					<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"loai-nha-tieu\") + dotLabel %>" inlineLabel="true">
						<%=Validator.isNotNull(thongTin.getLoaiNhaTieu())?DataItemBusiness.getByNode1Id(WebKeys.DATAGROUPID_LOAICAUTIEU,thongTin.getLoaiNhaTieu()).getName():StringPool.BLANK%><%=dot %>
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
	</c:otherwise>
</c:choose>
</aui:form>
<style>
.control-label{
width:250px !important;
}
</style>
<%!
	private static Log _log = LogFactoryUtil.getLog("html.portlet.vesinhmoitruong.viewthongtinkiemdem.jsp");
%>