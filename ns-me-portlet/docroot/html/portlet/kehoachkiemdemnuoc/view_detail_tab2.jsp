<%@page import="vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC"%>
<%@page import="vn.dtt.sol.ns.reporting.ThongTinKiemDemNuocModel"%>
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
	String trangThai = (String)request.getAttribute("trangThai");
	String maXa = (String)request.getAttribute(DauNoiNuocTerms.MA_XA);
	String daKetThucDieuTra = (String)request.getAttribute("daKetThucDieuTra");
	KeHoachKiemDemNuoc keHoachKiemDem = (KeHoachKiemDemNuoc)request.getAttribute("keHoachKiemDem");
	TramCapNuoc tramCapNuoc = (TramCapNuoc)request.getAttribute("tramCapNuoc");
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	String requiredLabel="";
	requiredLabel ="(*)";
	String dotLabel=":";
	int chuaKiemDem = KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocId(keHoachKiemDem.getId(), WebKeys.CHUA_KET_THUC);
	int daHoanThanh = KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocId(keHoachKiemDem.getId(), WebKeys.DA_HOAN_THANH_DAY_DU);
	int hoanThanhMotPhan = KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocId(keHoachKiemDem.getId(), WebKeys.DA_HOAN_THANH_MOT_PHAN);
	int tongDauNoi=chuaKiemDem + daHoanThanh + hoanThanhMotPhan;
	int kiemDemDat= KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem(keHoachKiemDem.getId(), WebKeys.DANH_GIA_KIEM_DEM_DAT);
	int kiemDemKhongDat= KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem(keHoachKiemDem.getId(), WebKeys.DANH_GIA_KIEM_DEM_KHONG_DAT);
	List<ThongTinKiemDemNuocModel> resultBase = new ArrayList<ThongTinKiemDemNuocModel>(
			KeHoachKiemDemNuocBusiness.getListThongTinKiemDemNuocModelViewDetail(keHoachKiemDem.getId(),daKetThucDieuTra,tramCapNuoc.getMaTinh(),maHuyen,maXa,"","","",
														QueryUtil.ALL_POS, QueryUtil.ALL_POS));
	String host = PortalUtil.getPortalURL(request);
	String latiloto = "";
	THONGTINKIEMDEMNUOC thongTin = null;
// 	int i=0;
// 	for(ThongTinKiemDemNuocModel ett: resultBase){
// 		thongTin = THONGTINKIEMDEMNUOCLocalServiceUtil.fetchTHONGTINKIEMDEMNUOC(ett.getId());
// 		latiloto+="[" +"<div style=\"float:left;\">"+thongTin.getTenChuHo()+"<br/><img src=\""+host+thongTin.getAnhDauNoi()+"\" width=\"200\"/></div><div style=\"float:left;padding-left: 10px;\"><br/>"+StringPool.BLANK+"<br/>"+StringPool.BLANK+"<br/>"+thongTin.getTaiKhoan()+"<br/>"+StringPool.BLANK+"</div>"+","+thongTin.getViDo()+","+thongTin.getKinhDo()+","+i+1+ "]";
// 	}
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
<liferay-ui:header backURL="<%= redirectKeHoachURL.toString() %>" title="<%=tramCapNuoc.getTenTram() + \" \" +LanguageUtil.get(pageContext, \"trang-thai-ke-hoach-\"+KeHoachKiemDemNuocBusiness.getStatusKeHoachKiemDem(keHoachKiemDem.getNgayXuatBan(), keHoachKiemDem.getNgayDong())) %>" />

<liferay-ui:error key="<%= MessageErrors.PHAN_CONG_LAI_DAU_NOI_MESSAGE %>" message="<%= MessageErrors.PHAN_CONG_LAI_DAU_NOI_MESSAGE %>" />
<liferay-ui:success key="<%= MessageSuccess.PHAN_CONG_LAI_DAU_NOI_MESSAGE %>" message="<%= MessageSuccess.PHAN_CONG_LAI_DAU_NOI_MESSAGE%>" />
<liferay-ui:error key="<%= MessageErrors.DONG_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%= MessageErrors.DONG_KE_HOACH_KIEM_DEM_MESSAGE %>" />
<liferay-ui:success key="<%= MessageSuccess.DONG_KE_HOACH_KIEM_DEM_MESSAGE %>" message="<%= MessageSuccess.DONG_KE_HOACH_KIEM_DEM_MESSAGE%>" />
<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view_detail_tab1.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view_detail_tab1.jsp"/>
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
					<%=dateFormatDate.format(keHoachKiemDem.getNgayBatDau()) %> đến <%=dateFormatDate.format(keHoachKiemDem.getNgayKetThuc()) %>
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
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tong-dau-noi\") + dotLabel+\" \"+tongDauNoi %>" inlineLabel="true">
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
				<div id="map" style="width: 100%; height: 400px;"></div>

  <script type="text/javascript">
    var locations = [
      <%for(int i=0; i < resultBase.size(); i++){
    	  thongTin = THONGTINKIEMDEMNUOCLocalServiceUtil.fetchTHONGTINKIEMDEMNUOC(resultBase.get(i).getId());
    		if(Validator.isNotNull(thongTin.getKinhDo()) && Validator.isNotNull(thongTin.getViDo())){
    	  String dkj = "'"+"<div style=\"float:left;\">"+thongTin.getTenChuHo()+"<br/><img src=\""+host+thongTin.getAnhDauNoi()+"\" width=\"200\"/></div><div style=\"float:left;padding-left: 10px;\"><br/>"+StringPool.BLANK+"<br/>"+StringPool.BLANK+"<br/>"+thongTin.getTaiKhoan()+"<br/>"+StringPool.BLANK+"</div>"+"'";
    	  %>
      [<%=dkj%>, 
       <%=thongTin.getViDo()%>, 
       	<%=thongTin.getKinhDo()%>, 
       	<%=i+1%>],
     <%}}%>
    ];
    <%
    	String defViDo="21.023277896055212";
    	String defKinhDo="105.83364481586909";
    for(int i=0; i < resultBase.size(); i++){
    	thongTin = THONGTINKIEMDEMNUOCLocalServiceUtil.fetchTHONGTINKIEMDEMNUOC(resultBase.get(i).getId());
    	if(Validator.isNotNull(thongTin.getViDo()) && Validator.isNotNull(thongTin.getKinhDo())){
    		defViDo = thongTin.getViDo();
        	defKinhDo = thongTin.getKinhDo();
        	continue;
    	}
    	
    }
  	  %>
    var map = new google.maps.Map(document.getElementById('map'), {
      zoom: 10,
      center: new google.maps.LatLng(<%=defViDo%>, <%=defKinhDo%>),
      mapTypeId: google.maps.MapTypeId.ROADMAP
    });

    var infowindow = new google.maps.InfoWindow();

    var marker, i;
    var markers = new Array();

    for (i = 0; i < locations.length; i++) {  
      marker = new google.maps.Marker({
        position: new google.maps.LatLng(locations[i][1], locations[i][2]),
        map: map
      });

      markers.push(marker);

      google.maps.event.addListener(marker, 'click', (function(marker, i) {
        return function() {
          infowindow.setContent(locations[i][0]);
          infowindow.open(map, marker);
        }
      })(marker, i));
    }

    function AutoCenter() {
      //  Create a new viewpoint bound
      var bounds = new google.maps.LatLngBounds();
      //  Go through each...
      $.each(markers, function (index, marker) {
      bounds.extend(marker.position);
      });
      //  Fit these bounds to the map
      map.fitBounds(bounds);
    }
    AutoCenter();

  </script>
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
<style>
.btn.leftButon{
float: right !important;
margin-left: 20px !important;
}
.control-label{
width:155px !important;
}
</style>