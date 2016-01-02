<%@page import="vn.dtt.sol.ns.business.KiemDemVienBussiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.KeHoachKiemDemNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.kehoachkiemdemnuoc.terms.KeHoachKiemDemNuocTerms"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/init.jsp"%>
<%
	int id = ParamUtil.getInteger(request, KeHoachKiemDemNuocTerms.ID);
	KeHoachKiemDemNuoc keHoachKiemDem = KeHoachKiemDemNuocBusiness.getKeHoachKiemDemNuocById(id);
	TramCapNuoc tramCapNuoc = null;
	if(Validator.isNotNull(keHoachKiemDem)){
		tramCapNuoc = TramCapBusiness.getTramCap(keHoachKiemDem.getTramCapNuocId());
	}
	int chuaKiemDem = KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocId(keHoachKiemDem.getId(), WebKeys.CHUA_KET_THUC);
	int daHoanThanh = KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocId(keHoachKiemDem.getId(), WebKeys.DA_HOAN_THANH_DAY_DU);
	int hoanThanhMotPhan = KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocId(keHoachKiemDem.getId(), WebKeys.DA_HOAN_THANH_MOT_PHAN);
	int tongDauNoi=chuaKiemDem + daHoanThanh + hoanThanhMotPhan;
	int kiemDemDat= KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem(keHoachKiemDem.getId(), WebKeys.DANH_GIA_KIEM_DEM_DAT);
	int kiemDemKhongDat= KeHoachKiemDemNuocBusiness.getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem(keHoachKiemDem.getId(), WebKeys.DANH_GIA_KIEM_DEM_KHONG_DAT);
	String requiredLabel="";
	requiredLabel ="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
%>
<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view.jsp"/>
</portlet:renderURL>
<aui:model-context bean="<%= Validator.isNotNull(keHoachKiemDem)?keHoachKiemDem.toEscapedModel():keHoachKiemDem %>" model="<%= KeHoachKiemDemNuoc.class %>" />
<portlet:actionURL name="dongkeHoachKiemDem" var="dongkeHoachKiemDemURL" windowState="<%=LiferayWindowState.NORMAL.toString() %>">
	<portlet:param name="<%=KeHoachKiemDemNuocTerms.ID%>" value="<%= String.valueOf(keHoachKiemDem.getId()) %>" />
	<liferay-portlet:param name="onpageError" value="<%= onpageError%>"></liferay-portlet:param>
	<liferay-portlet:param name="onpageSuccess" value="<%=onpageSuccess %>"></liferay-portlet:param>
</portlet:actionURL>
<aui:form action="<%= dongkeHoachKiemDemURL %>" method="post" name="fm">
	<aui:row>
			<aui:col width="100">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"kiem-dem-vien\") + dotLabel %>" inlineLabel="true">
					<%=tramCapNuoc.getTenTram() %> ( <%=LanguageUtil.get(pageContext,"trang-thai-ke-hoach-"+KeHoachKiemDemNuocBusiness.getStatusKeHoachKiemDem(keHoachKiemDem.getNgayXuatBan(), keHoachKiemDem.getNgayDong())) %> )
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"kiem-dem-vien\") + dotLabel %>" inlineLabel="true">
					<%=Validator.isNotNull(KiemDemVienBussiness.getKiemDemVien(keHoachKiemDem.getKiemDemVienId()))?KiemDemVienBussiness.getKiemDemVien(keHoachKiemDem.getKiemDemVienId()).getHoVaTen():StringPool.BLANK %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"thoi-gian-du-kien\") + dotLabel %>" inlineLabel="true">
					<%=dateFormatDate.format(keHoachKiemDem.getNgayBatDau()) %> đến <%=dateFormatDate.format(keHoachKiemDem.getNgayKetThuc()) %>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tong-dau-noi\") + dotLabel %>" inlineLabel="true">
					<%=tongDauNoi %>
				</aui:field-wrapper>
			
				<aui:field-wrapper cssClass="smallLabel" label="<%= LanguageUtil.get(pageContext, \"chua-kiem-dem\") + dotLabel%>" inlineLabel="true">
				<%=chuaKiemDem %>
				</aui:field-wrapper>
			
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"da-hoan-thanh\") + dotLabel %>" inlineLabel="true">
			<%=daHoanThanh %>
				</aui:field-wrapper>
			
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"da-ket-thuc-dieu-tra-label-2\") + dotLabel %>" inlineLabel="true">
			<%=hoanThanhMotPhan %>
				</aui:field-wrapper>
			
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"danh-gia-kiem-dem-1\") + dotLabel %>" inlineLabel="true">
			<%=kiemDemDat %>
				</aui:field-wrapper>
			
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"danh-gia-kiem-dem-2\") + dotLabel %>" inlineLabel="true">
			<%=kiemDemKhongDat %>
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