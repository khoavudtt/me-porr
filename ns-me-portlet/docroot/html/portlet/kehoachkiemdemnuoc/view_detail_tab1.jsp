<%@page import="vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.util.MessageErrors"%>
<%@page import="vn.dtt.sol.ns.util.MessageSuccess"%>
<%@page import="vn.dtt.sol.ns.business.KiemDemVienBussiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.KeHoachKiemDemNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.kehoachkiemdemnuoc.terms.KeHoachKiemDemNuocTerms"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc"%>
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
<%@page import="vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocSearch"%>
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
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.10.1.min.js"></script>
<%
	String idTrangThaiChk = ParamUtil.getString(request, "idTrangThaiChk");
	long idTrangThaiChkLong = 0;
	if(Validator.isNotNull(idTrangThaiChk) && Validator.isNumber(idTrangThaiChk)){
		idTrangThaiChkLong = Long.valueOf(idTrangThaiChk);
	}else{
		idTrangThaiChkLong = 0;
	}
	String maHuyen = (String)request.getAttribute(DauNoiNuocTerms.MA_HUYEN);
	String maXa = (String)request.getAttribute(DauNoiNuocTerms.MA_XA);
	String trangThai = (String)request.getAttribute("trangThai");
	String daKetThucDieuTra = (String)request.getAttribute("daKetThucDieuTra");
	String danhGiaKiemDem = (String)request.getAttribute("danhGiaKiemDem");
	String nguonDL = (String)request.getAttribute("nguonDL");
	String advText = (String)request.getAttribute("advText");
	KeHoachKiemDemNuoc keHoachKiemDem = (KeHoachKiemDemNuoc)request.getAttribute("keHoachKiemDem");
	TramCapNuoc tramCapNuoc = (TramCapNuoc)request.getAttribute("tramCapNuoc");
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<UserMapping> listUserBySearch = (List<UserMapping>)request.getAttribute("listUserBySearch");
	List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();	 
	List<DATAITEM> listXa = new ArrayList<DATAITEM>();	 
	List<String> listStr = new ArrayList<String>();
	listStr = THONGTINKIEMDEMNUOCLocalServiceUtil.getHuyenXaKeHoachKiemDemNuocSearch(String.valueOf(keHoachKiemDem.getId()), trangThai, tramCapNuoc.getMaTinh(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	if(listStr.size()> 0 &&Validator.isNotNull(KeHoachKiemDemNuocBusiness.getHuyenKeHoachKiemDemNuocSearch(String.valueOf(keHoachKiemDem.getId()), trangThai, tramCapNuoc.getMaTinh(), QueryUtil.ALL_POS, QueryUtil.ALL_POS).get(0))){
		listHuyen.addAll(KeHoachKiemDemNuocBusiness.getHuyenKeHoachKiemDemNuocSearch(String.valueOf(keHoachKiemDem.getId()), trangThai, tramCapNuoc.getMaTinh(), QueryUtil.ALL_POS, QueryUtil.ALL_POS) );
	}
	if(listStr.size()>0&&Validator.isNotNull(KeHoachKiemDemNuocBusiness.getXaKeHoachKiemDemNuocSearch(String.valueOf(keHoachKiemDem.getId()), trangThai, tramCapNuoc.getMaTinh(), QueryUtil.ALL_POS, QueryUtil.ALL_POS).get(0))){
		listXa.addAll(KeHoachKiemDemNuocBusiness.getXaKeHoachKiemDemNuocSearch(String.valueOf(keHoachKiemDem.getId()), trangThai, tramCapNuoc.getMaTinh(), QueryUtil.ALL_POS, QueryUtil.ALL_POS));
	}
	String requiredLabel="";
	requiredLabel ="(*)";
	String dotLabel=":";
	int chuaKiemDem = KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocId(keHoachKiemDem.getId(), WebKeys.CHUA_KET_THUC);
	int daHoanThanh = KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocId(keHoachKiemDem.getId(), WebKeys.DA_HOAN_THANH_DAY_DU);
	int hoanThanhMotPhan = KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocId(keHoachKiemDem.getId(), WebKeys.DA_HOAN_THANH_MOT_PHAN);
	int tongDauNoi=chuaKiemDem + daHoanThanh + hoanThanhMotPhan;
	int kiemDemDat= KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem(keHoachKiemDem.getId(), WebKeys.DANH_GIA_KIEM_DEM_DAT);
	int kiemDemKhongDat= KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem(keHoachKiemDem.getId(), WebKeys.DANH_GIA_KIEM_DEM_KHONG_DAT);
	
	//chk kd đã phân công rồi
	String lsId = ParamUtil.getString(request, "lsId");
	String[] idChk = lsId.split(",");
	List<Long> listKD = new ArrayList<Long>();
	int ik = 0;
	for(String str: idChk){
		if(Validator.isNotNull(str) && Validator.isNumber(str)){
			listKD.add(ik, Long.valueOf(str));
			ik++;
		}
	}
	String errorKD = "";
	DauNoiNuoc ett = null;
	for(long id : listKD){
		ett = DauNoiNuocBusiness.getDauNoiNuocById(id);
		if(Validator.isNotNull(ett)){
			errorKD+=","+ett.getTenChuHo()+" ";
		}
	}
	errorKD = errorKD.replaceFirst(",", "");
%>
<liferay-portlet:renderURL varImpl="redirectKeHoachURL">
	<liferay-portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view.jsp"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_TINH %>" value="<%=tramCapNuoc.getMaTinh() %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID %>" value="<%=String.valueOf(tramCapNuoc.getId()) %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=KeHoachKiemDemNuocTerms.KIEM_DEM_VIEN_ID %>" value="<%=String.valueOf(keHoachKiemDem.getKiemDemVienId()) %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=KeHoachKiemDemNuocTerms.NAM %>" value="<%=String.valueOf(keHoachKiemDem.getNam()) %>"></liferay-portlet:param>
	<liferay-portlet:param name="trangThai" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="idNguoiTao" value="<%=String.valueOf(keHoachKiemDem.getIdNguoiTao()) %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<c:if test="<%=listKD.size()>0 %>">
	<aui:row cssClass="importWan">	
		<%= LanguageUtil.get(pageContext, "kiem-dem-no-avaiable") + dotLabel %> <%=errorKD %>
	</aui:row>
</c:if>
<liferay-ui:header backURL="<%= redirectKeHoachURL.toString() %>" title="<%=tramCapNuoc.getTenTram() + \" \" +LanguageUtil.get(pageContext, \"trang-thai-ke-hoach-\"+KeHoachKiemDemNuocBusiness.getStatusKeHoachKiemDem(keHoachKiemDem.getNgayXuatBan(), keHoachKiemDem.getNgayDong())) %>" />

<%-- <liferay-ui:error key="<%=MessageErrors.EDIT_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%=MessageErrors.EDIT_KE_HOACH_KIEM_DEM_MESSAGE %>" /> --%>
<%-- <liferay-ui:error key="<%=MessageErrors.ADD_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%=MessageErrors.ADD_KE_HOACH_KIEM_DEM_MESSAGE %>" /> --%>
<%-- <liferay-ui:success key="<%=MessageSuccess.EDIT_KE_HOACH_KIEM_DEM_MESSAGE%>" message="<%=MessageSuccess.EDIT_KE_HOACH_KIEM_DEM_MESSAGE %>" /> --%>
<%-- <liferay-ui:success key="<%=MessageSuccess.ADD_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%=MessageSuccess.ADD_KE_HOACH_KIEM_DEM_MESSAGE %>" /> --%>
<%-- <liferay-ui:error key="<%= MessageErrors.PHAN_CONG_LAI_DAU_NOI_MESSAGE %>" message="<%= MessageErrors.PHAN_CONG_LAI_DAU_NOI_MESSAGE %>" /> --%>
<%-- <liferay-ui:success key="<%= MessageSuccess.PHAN_CONG_LAI_DAU_NOI_MESSAGE %>" message="<%= MessageSuccess.PHAN_CONG_LAI_DAU_NOI_MESSAGE%>" /> --%>
<%-- <liferay-ui:error key="<%= MessageErrors.THEM_DAU_NOI_VAO_KE_HOACH_MESSAGE %>" message="<%= MessageErrors.THEM_DAU_NOI_VAO_KE_HOACH_MESSAGE %>" /> --%>
<%-- <liferay-ui:success key="<%= MessageSuccess.THEM_DAU_NOI_VAO_KE_HOACH_MESSAGE %>" message="<%= MessageSuccess.THEM_DAU_NOI_VAO_KE_HOACH_MESSAGE%>" /> --%>
<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view_detail_tab1.jsp"/>
	<liferay-portlet:param name="idTrangThaiChk" value="<%=idTrangThaiChk %>"></liferay-portlet:param>
</portlet:renderURL>
<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view_detail_tab1.jsp"/>
	<liferay-portlet:param name="idTrangThaiChk" value="<%=idTrangThaiChk %>"></liferay-portlet:param>
</portlet:renderURL>
<portlet:renderURL var="imPortThongTinKiemDem" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/_thong_tin_kiem_dem.jsp"/>
</portlet:renderURL>
	<aui:input name="onpageError" type="hidden" value="<%= onpageError %>" />
	<aui:input name="onpageSuccess" type="hidden" value="<%= onpageSuccess %>" />
	<aui:input id="<%=KeHoachKiemDemNuocTerms.ID %>" name="<%=KeHoachKiemDemNuocTerms.ID %>" type="hidden" value="<%=String.valueOf(keHoachKiemDem.getId()) %>" />
<c:choose>
	<c:when test="<%= Validator.isNotNull(keHoachKiemDem) %>">
		<aui:row>
			<aui:col width="50">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"kiem-dem-vien\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(KiemDemVienBussiness.getKiemDemVien(keHoachKiemDem.getKiemDemVienId()))?KiemDemVienBussiness.getKiemDemVien(keHoachKiemDem.getKiemDemVienId()).getHoVaTen():StringPool.BLANK %>
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"thoi-gian-du-kien\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(keHoachKiemDem.getNgayBatDau())?dateFormatDate.format(keHoachKiemDem.getNgayBatDau()):StringPool.BLANK %> đến <%=Validator.isNotNull(keHoachKiemDem.getNgayKetThuc())?dateFormatDate.format(keHoachKiemDem.getNgayKetThuc()):StringPool.BLANK %>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="100">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"mo-ta\") +dotLabel %>" inlineLabel="true"  >
					<%=keHoachKiemDem.getMoTa() %>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="16">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tong-dau-noi\") + dotLabel + \" \" + tongDauNoi %>" inlineLabel="true">
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="16">
				<aui:field-wrapper cssClass="smallLabel" label="<%= LanguageUtil.get(pageContext, \"chua-kiem-dem\") + dotLabel +\" \"+chuaKiemDem %>" inlineLabel="true">
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="16">
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"da-hoan-thanh\") + dotLabel+\" \"+daHoanThanh %>" inlineLabel="true">
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="16">
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"da-ket-thuc-dieu-tra-label-2\") + dotLabel+\" \"+hoanThanhMotPhan %>" inlineLabel="true">
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="16">
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"danh-gia-kiem-dem-1\") + dotLabel+\" \"+kiemDemDat %>" inlineLabel="true">
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="16">
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"danh-gia-kiem-dem-2\") + dotLabel+\" \"+kiemDemKhongDat %>" inlineLabel="true">
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
 		
<liferay-util:include page='<%= "/html/portlet/kehoachkiemdemnuoc/top_tabs_detail.jsp" %>' servletContext="<%= application %>" />
<aui:fieldset>
		<liferay-portlet:renderURL varImpl="searchURL" >
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view_detail_tab1.jsp" />
	<portlet:param name="<%=KeHoachKiemDemNuocTerms.ID %>" value="<%=String.valueOf(keHoachKiemDem.getId()) %>" />
</liferay-portlet:renderURL>
<liferay-portlet:actionURL var="phanCongLaiKeHoachKieDemNuocURL" name="phanCongLaiKeHoachKieDemNuoc" />
<liferay-portlet:actionURL var="phanCongLaiKeHoachKieDemNuocHuyBoURL" name="phanCongLaiKeHoachKieDemNuocHuyBo" />
<aui:form action="<%= searchURL %>" method="post" name="fm">
<aui:script>
Liferay.provide(
window,
'<portlet:namespace />revertDauNoi',
 function() {
                    var checkBoxValue = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
                    if(checkBoxValue==""||checkBoxValue==null){
                            alert('<%= UnicodeLanguageUtil.get(pageContext, "Chưa có đấu nối nào đc chọn!") %>');
                            return false;
                    }
                    if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "Có phân công lại các đấu nối được chọn không? ") %>')) {
                    document.<portlet:namespace />fm.<portlet:namespace />orgIds.value=checkBoxValue;
                    submitForm(document.<portlet:namespace />fm, "<%=phanCongLaiKeHoachKieDemNuocURL.toString()%>");
                
            }
        },
['liferay-util-list-fields']
);

Liferay.provide(
window,
'<portlet:namespace />huyDauNoiTrongKeHoach',
 function() {
                    var checkBoxValue = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
                    if(checkBoxValue==""||checkBoxValue==null){
                            alert('<%= UnicodeLanguageUtil.get(pageContext, "Chưa có đấu nối nào đc chọn!") %>');
                            return false;
                    }
                    if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "Có huỷ bỏ các đấu nối được chọn không? ") %>')) {
                    document.<portlet:namespace />fm.<portlet:namespace />orgIds.value=checkBoxValue;
                    submitForm(document.<portlet:namespace />fm, "<%=phanCongLaiKeHoachKieDemNuocHuyBoURL.toString()%>");
                
            }
        },
['liferay-util-list-fields']
);
</aui:script>
<aui:input name="onpageError" type="hidden" value="<%= onpageError%>" />
<aui:input name="onpageSuccess" type="hidden" value="<%= onpageSuccess %>" />
<aui:input name="<%=KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID %>" type="hidden" value="<%= keHoachKiemDem.getTramCapNuocId() %>" />
<aui:input name="orgIds" type="hidden" />
<aui:input name="maKeHoachKiemDem" value="<%=Validator.isNotNull(keHoachKiemDem)?String.valueOf(keHoachKiemDem.getId()):StringPool.BLANK %>" type="hidden" />
<liferay-portlet:renderURLParams varImpl="searchURL" />
		<liferay-portlet:renderURL varImpl="iteratorURL">
			<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view_detail_tab1.jsp" />
			<portlet:param name="<%=KeHoachKiemDemNuocTerms.ID %>" value="<%=String.valueOf(keHoachKiemDem.getId()) %>" />
			<portlet:param name="trangThai" value="<%=trangThai %>" />
			<portlet:param name="<%=DauNoiNuocTerms.MA_HUYEN %>" value="<%=maHuyen %>" />
			<portlet:param name="<%=DauNoiNuocTerms.MA_XA %>" value="<%=maXa %>" />
			<portlet:param name="<%=KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID %>" value="<%=String.valueOf(tramCapNuoc.getId()) %>" />
			<portlet:param name="<%=KeHoachKiemDemNuocTerms.KIEM_DEM_VIEN_ID %>" value="<%=String.valueOf(keHoachKiemDem.getKiemDemVienId()) %>" />
			<portlet:param name="daKetThucDieuTra" value="<%=daKetThucDieuTra %>" />
			<portlet:param name="danhGiaKiemDem" value="<%=danhGiaKiemDem %>" />
			<portlet:param name="nguonDL" value="<%=nguonDL %>" />
		</liferay-portlet:renderURL>
		<liferay-ui:search-container  rowChecker="<%= new RowChecker(renderResponse) %>" searchContainer="<%=new DauNoiNuocSearch(renderRequest, SearchContainer.DEFAULT_DELTA, SearchContainer.DEFAULT_ORDER_BY_COL_PARAM, SearchContainer.DEFAULT_ORDER_BY_TYPE_PARAM, iteratorURL) %>" >
		<%@ include file="/html/portlet/kehoachkiemdemnuoc/include_kehoachkiemdemnuoc_detail_form.jspf"%>
			<liferay-ui:search-container-results>
				<%@ include file="/html/portlet/kehoachkiemdemnuoc/search_daunoinuoc_database_result.jspf"%>
			</liferay-ui:search-container-results>
			<liferay-ui:search-container-row className="vn.dtt.sol.ns.reporting.ThongTinKiemDemNuocModel" keyProperty="id" modelVar="kiemDemNuoc" >
				<liferay-portlet:renderURL varImpl="viewDetailThongTinUrl" >
					<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view_detail_thong_tin_kiem_dem.jsp" />
					<portlet:param name="<%=KeHoachKiemDemNuocTerms.ID %>" value="<%=String.valueOf(keHoachKiemDem.getId()) %>" />
					<portlet:param name="idThongTin" value="<%=String.valueOf(kiemDemNuoc.getId()) %>" />
				</liferay-portlet:renderURL>
				<liferay-ui:search-container-column-text href="<%=viewDetailThongTinUrl.toString() %>" name="<%= LanguageUtil.get(pageContext, \"quan-huyen\") %>" value="<%= kiemDemNuoc.getQuanHuyen() %>" />
				<liferay-ui:search-container-column-text href="<%=viewDetailThongTinUrl.toString() %>" name="<%= LanguageUtil.get(pageContext, \"phuong-xa\") %>" value="<%= kiemDemNuoc.getPhuongXa() %>" />
				<liferay-ui:search-container-column-text href="<%=viewDetailThongTinUrl.toString() %>" name="<%= LanguageUtil.get(pageContext, \"thon-xom\") %>" value="<%= kiemDemNuoc.getThonXom() %>" />
				<liferay-ui:search-container-column-text href="<%=viewDetailThongTinUrl.toString() %>" name="<%= LanguageUtil.get(pageContext, \"ten-chu-ho\") %>" value="<%= kiemDemNuoc.getTenChuHo() %>" />
				<liferay-ui:search-container-column-text name="<%= LanguageUtil.get(pageContext, \"tinh-trang\") %>">
					<div class="status-bm-<%=kiemDemNuoc.getTrangThai()%>">
						<a href="<%=viewDetailThongTinUrl.toString() %>"><%= LanguageUtil.get(pageContext, kiemDemNuoc.getTrangThai())%></a>
					</div>
				</liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-text href="<%=viewDetailThongTinUrl.toString() %>" name="<%= LanguageUtil.get(pageContext, \"ngay-kiem-dem\") %>" value="<%= kiemDemNuoc.getNgayKiemDem()%>" />
				<liferay-ui:search-container-column-text href="<%=viewDetailThongTinUrl.toString() %>" name="<%= LanguageUtil.get(pageContext, \"ket-qua-kiem-dem\") %>" value="<%= LanguageUtil.get(pageContext, kiemDemNuoc.getKetQuaKiemDem())%>" />
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
		</liferay-ui:search-container>
		</aui:form>
	</aui:fieldset>
	</c:when>	
	
	<c:otherwise>
		<liferay-ui:message key="thong-tin-ke-hoach-khong-ton-tai"/>
	</c:otherwise>

</c:choose>

<aui:script>
function showDongKeHoachDialog(dongKeHoachURL)
{
    var r=confirm("B\u1EA1n c\u00F3 mu\u1ED1n \u0111\u00F3ng k\u1EBF ho\u1EA1ch ki\u1EC3m \u0111\u1EBFm n\u00E0y?");
    if (r==true)
    {
         window.location.href = dongKeHoachURL;
    }else{
    	return;
    }
}
</aui:script>
<%if(idTrangThaiChk.equals("0")){ %>
<style>
.lfr-search-container{
margin-top: -28px !important;
}
</style>
<%} %>
<style>
.smallLabel{

}
.btn.leftButon{
float: right !important;
margin-left: 20px !important;
}
.control-label{
width:155px !important;
}
.aui select{
width:120px !important;
}
.column-content{
width: 120px !important;
}
.importWan{
background-color: #fffbdc !important;
color: #b18424 !important;
padding: 8px 0px 8px 14px !important;
margin-bottom: 20px !important;
text-shadow: 0 1px 0 rgba(255,255,255,0.5) !important;
border: 1px solid #f1d875 !important;
border-radius: 2px !important;
width: 98.5% !important;
}
</style>