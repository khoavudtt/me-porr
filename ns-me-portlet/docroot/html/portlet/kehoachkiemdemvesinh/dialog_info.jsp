<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.service.KeHoachKiemDemVeSinhLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.business.KeHoachKiemDemVeSinhBussiness"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.KeHoachKiemDemVeSinhTerms"%>
<%@page import="vn.dtt.sol.ns.business.KiemDemVienBussiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.KeHoachKiemDemNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/init.jsp"%>
<%

	int id = ParamUtil.getInteger(request, KeHoachKiemDemVeSinhTerms.ID);
	KeHoachKiemDemVeSinh keHoachKiemDem = KeHoachKiemDemVeSinhLocalServiceUtil.fetchKeHoachKiemDemVeSinh(id);
	int chuaKiemDemGd = KeHoachKiemDemVeSinhBussiness.getCountGiaDinhBykeHoachId(keHoachKiemDem.getId(), WebKeys.CHUA_KET_THUC);
	int daHoanThanhGd = KeHoachKiemDemVeSinhBussiness.getCountGiaDinhBykeHoachId(keHoachKiemDem.getId(), WebKeys.DA_HOAN_THANH_DAY_DU);
	int tongDauNoiGd= chuaKiemDemGd + daHoanThanhGd+ KeHoachKiemDemVeSinhBussiness.getCountGiaDinhBykeHoachId(keHoachKiemDem.getId(), WebKeys.DA_HOAN_THANH_MOT_PHAN);
	int coNhaVeSinhGd = KeHoachKiemDemVeSinhBussiness.getCountCosNhaVeSinh(keHoachKiemDem.getId());
	int coHVSGd = KeHoachKiemDemVeSinhBussiness.getCountcoHVS(keHoachKiemDem.getId());
	int coHVSXayMoiGd = KeHoachKiemDemVeSinhBussiness.getCountcoHVSXayMoi(keHoachKiemDem.getId());
	
	int chuaKiemDemCt = KeHoachKiemDemVeSinhBussiness.getCountCongTrinhBykeHoachId(keHoachKiemDem.getId(), WebKeys.CHUA_KET_THUC);
	int daHoanThanhCt = KeHoachKiemDemVeSinhBussiness.getCountCongTrinhBykeHoachId(keHoachKiemDem.getId(), WebKeys.DA_HOAN_THANH_DAY_DU);
	int tongDauNoiCt= chuaKiemDemCt + daHoanThanhCt;
	int kiemDemDatCt= KeHoachKiemDemVeSinhBussiness.getCountCongTrinhBykeHoachIdDanhGiaKiemDem(keHoachKiemDem.getId(), WebKeys.DANH_GIA_KIEM_DEM_DAT);
	int kiemDemKhongDatCt= KeHoachKiemDemVeSinhBussiness.getCountCongTrinhBykeHoachIdDanhGiaKiemDem(keHoachKiemDem.getId(), WebKeys.DANH_GIA_KIEM_DEM_KHONG_DAT);
	
	String requiredLabel="";
	requiredLabel ="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
%>
<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/view.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/view.jsp"/>
</portlet:renderURL>
<aui:model-context bean="<%= Validator.isNotNull(keHoachKiemDem)?keHoachKiemDem.toEscapedModel():keHoachKiemDem %>" model="<%= KeHoachKiemDemNuoc.class %>" />
<portlet:actionURL name="dongkeHoachKiemDem" var="dongkeHoachKiemDemURL" windowState="<%=LiferayWindowState.NORMAL.toString() %>">
	<portlet:param name="<%=KeHoachKiemDemVeSinhTerms.ID%>" value="<%= String.valueOf(keHoachKiemDem.getId()) %>" />
	<liferay-portlet:param name="onpageError" value="<%= onpageError%>"></liferay-portlet:param>
	<liferay-portlet:param name="onpageSuccess" value="<%=onpageSuccess %>"></liferay-portlet:param>
</portlet:actionURL>
<aui:form action="<%= dongkeHoachKiemDemURL %>" method="post" name="fm">
	<aui:row>
			<aui:col width="50">
			<%String kiemDemName = Validator.isNotNull(KiemDemVienBussiness.getKiemDemVien(keHoachKiemDem.getKiemDemVienID()))?KiemDemVienBussiness.getKiemDemVien(keHoachKiemDem.getKiemDemVienID()).getHoVaTen():StringPool.BLANK; %>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"kiem-dem-vien\") + dotLabel%>" >
				<%=kiemDemName %>
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"thoi-gian-du-kien\") + dotLabel %>" inlineLabel="true">
					<%=dateFormatDate.format(keHoachKiemDem.getNgayBatDau()) %> đến <%=dateFormatDate.format(keHoachKiemDem.getNgayKetThuc()) %>
				</aui:field-wrapper>
				
			</aui:col>
	</aui:row>
	
	<aui:row>
	<aui:col width="50">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tong-ve-sinh-toan-xa\") + dotLabel+ \" \"+tongDauNoiGd %>" inlineLabel="true">
				</aui:field-wrapper>
			
				<aui:field-wrapper cssClass="smallLabel" label="<%= LanguageUtil.get(pageContext, \"chua-kiem-dem\") + dotLabel+ \" \"+chuaKiemDemGd%>" inlineLabel="true">
				</aui:field-wrapper>
			
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"da-hoan-thanh\") + dotLabel+ \" \"+daHoanThanhGd %>" inlineLabel="true">
				</aui:field-wrapper>
			
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"co-nha-ve-sinh\") + dotLabel+ \" \"+coNhaVeSinhGd %>" inlineLabel="true">
			</aui:field-wrapper>
			
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"hop-ve-sinh\") + dotLabel+ \" \"+coHVSGd %>" inlineLabel="true">
			</aui:field-wrapper>
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"hop-ve-sinh-xay-moi\") + dotLabel+ \" \"+coHVSXayMoiGd %>" inlineLabel="true">
			</aui:field-wrapper>
			
			
			</aui:col>
			<aui:col width="50">
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tong-ve-sinh-cong-trinh\") + dotLabel+ \" \"+tongDauNoiCt %>" inlineLabel="true">
			</aui:field-wrapper>
			
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"chua-kiem-dem\") + dotLabel+ \" \"+chuaKiemDemCt %>" inlineLabel="true">
			</aui:field-wrapper>
			
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"da-hoan-thanh\") + dotLabel+ \" \"+ daHoanThanhCt%>" inlineLabel="true">
			</aui:field-wrapper>
			
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"danh-gia-kiem-dem-1\") + dotLabel+ \" \"+kiemDemDatCt %>" inlineLabel="true">
			</aui:field-wrapper>
			
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"danh-gia-kiem-dem-2\") + dotLabel+ \" \"+kiemDemKhongDatCt %>" inlineLabel="true">
			</aui:field-wrapper>
			</aui:col>
	</aui:row>	
	<aui:button-row>
		<aui:button type="submit" value="dong-ke-hoach"></aui:button>
	</aui:button-row>
</aui:form>
<style>
.control-label{
width:200px !important;
}
</style>