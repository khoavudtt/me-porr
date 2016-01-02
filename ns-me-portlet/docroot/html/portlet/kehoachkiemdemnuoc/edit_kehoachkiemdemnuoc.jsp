<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString"%>
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.KeHoachKiemDemNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc"%>
<%@page import="vn.dtt.sol.ns.kehoachkiemdemnuoc.terms.KeHoachKiemDemNuocTerms"%>
<%@page import="vn.dtt.sol.ns.util.MessageSuccess"%>
<%@page import="vn.dtt.sol.ns.util.MessageErrors"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.DauNoiNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc"%>
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

<%
//param search
	
	String tramCapNuocId = ParamUtil.getString(request, KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID);
	String kiemDemVienId = ParamUtil.getString(request, KeHoachKiemDemNuocTerms.KIEM_DEM_VIEN_ID);
	String trangThai = ParamUtil.getString(request, "trangThai");
	List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
	List<TramCapNuoc>  listTramCapNuoc = (List<TramCapNuoc>)request.getAttribute("listTramCapNuoc");
	KeHoachKiemDemNuoc keHoachKiemDem = (KeHoachKiemDemNuoc)request.getAttribute("keHoachKiemDem");
	TramCapNuoc tramCapNuoc = (TramCapNuoc)request.getAttribute("tramCapNuoc");
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<KiemDemVien> listKiemDemVien = new ArrayList<KiemDemVien>();
	listKiemDemVien = (List<KiemDemVien>)request.getAttribute("listKiemDemVien");
	if(Validator.isNotNull(keHoachKiemDem)){
		listTinh = new ArrayList<DATAITEM>();
		listTinh.add(NuocSachUtils.getDATAITEMTinh(tramCapNuoc.getMaTinh()));
		//listTramCapNuoc = (List<TramCapNuoc>)request.getAttribute("listTramCapNuoc");
		
		listTramCapNuoc = DiaBanQuanLyUtils.getTramCap(user, tramCapNuoc.getMaTinh(), permissionChecker.isOmniadmin(), QueryUtil.ALL_POS,  QueryUtil.ALL_POS);
	}
	String requiredLabel="";
	requiredLabel ="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
%>
	<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= (keHoachKiemDem == null) ? "add-ke-hoach-kiem-dem-nuoc" : "edit-ke-hoach-kiem-dem-nuoc" %>'
/>
<liferay-ui:error key="<%=MessageErrors.ERROR_NGAY_THANG %>" message="<%=MessageErrors.ERROR_NGAY_THANG %>" />
<portlet:renderURL var="selectTramCap" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/_select_tram_cap_form.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="selectKiemDem" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/_select_kiem_dem_vien_form.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/edit_kehoachkiemdemnuoc.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view_detail_tab1.jsp"/>
</portlet:renderURL>
<aui:model-context bean="<%= Validator.isNotNull(keHoachKiemDem)?keHoachKiemDem.toEscapedModel():keHoachKiemDem %>" model="<%= KeHoachKiemDemNuoc.class %>" />
<portlet:actionURL name="addkeHoachKiemDem" var="addkeHoachKiemDemURL"/>
<aui:form action="<%= addkeHoachKiemDemURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(keHoachKiemDem) ? Constants.UPDATE : Constants.ADD %>"/>
	<aui:input name="redirect" type="hidden" value="<%= StringPool.BLANK %>" />
	<aui:input name="currentURL" type="hidden" value="<%= currentURL %>" />
	<aui:input name="onpageError" type="hidden" value="<%= onpageError%>" />
	<aui:input name="onpageSuccess" type="hidden" value="<%= onpageSuccess %>" />
	<aui:input name="<%=KeHoachKiemDemNuocTerms.ID %>" type="hidden" value="<%= Validator.isNotNull(keHoachKiemDem) ? String.valueOf(keHoachKiemDem.getId()) : StringPool.BLANK %>" />
	<aui:field-wrapper>

		<aui:row>
			<aui:col width="30">
				<aui:select required="true" showRequiredLabel="<%=false %>" name="<%=DauNoiNuocTerms.MA_TINH %>" id="<%=DauNoiNuocTerms.MA_TINH %>" label="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
					<c:if test="<%=userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU && Validator.isNull(keHoachKiemDem) %>">
						<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
					</c:if>
					<%
						for (DATAITEM tinh : listTinh) {
					%>
						<aui:option value="<%= tinh.getNode1() %>"><%= tinh.getName() %></aui:option>
					<%
						}
					%>
				</aui:select>
				<div id="tramCapCbx">
				<aui:select required="true"
							name="<%=KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID %>" label="<%= LanguageUtil.get(pageContext, \"tram-cap-nuoc\") + \" \"+requiredLabel+dotLabel %>"  onChange="javascript:selectKiemDemVien();" showEmptyOption="<%= false %>" >
					<c:if test="<%=Validator.isNull(keHoachKiemDem) || userMapping.getUserType() != DauNoiNuocConstantString.UserMapping.CAP_TRAM %>">
					<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
					</c:if>
					<%
						for (TramCapNuoc tramCap : listTramCapNuoc) {
					%>
					<aui:option value="<%= tramCap.getId() %>"><%= tramCap.getTenTram() %></aui:option>
					<%
						}
					%>
				</aui:select>
				</div>
				<div id="kiemDemCbx">
				<aui:select  name="<%=KeHoachKiemDemNuocTerms.KIEM_DEM_VIEN_ID %>"  id="<%=KeHoachKiemDemNuocTerms.KIEM_DEM_VIEN_ID %>" label="<%= LanguageUtil.get(pageContext, \"kiem-dem-vien\") + dotLabel %>" showEmptyOption="<%= false %>">
					<c:if test="<%=Validator.isNull(keHoachKiemDem) %>">
					<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
					</c:if>
					<%
						for (KiemDemVien kiemDemVien : listKiemDemVien) {
					%>
						<aui:option value="<%= kiemDemVien.getId() %>"><%= kiemDemVien.getHoVaTen() %></aui:option>
					<%
						}
					%>
					</aui:select>
				</div>	
			</aui:col>
			</aui:row>
			
			<aui:row>
			<aui:col width="100">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-bat-dau\") +dotLabel %>" inlineField="<%=true %>" >
					<aui:input name="<%=KeHoachKiemDemNuocTerms.NGAY_BAT_DAU %>" label="" inlineField="<%=true %>"></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-ket-thuc\") +dotLabel %>"  >
					<aui:input name="<%=KeHoachKiemDemNuocTerms.NGAY_KET_THUC %>" label="" inlineField="<%=true %>"></aui:input>
				</aui:field-wrapper>
			</aui:col>
			
		</aui:row>
	<aui:row>
			<aui:col width="30">
				<aui:field-wrapper cssClass="control-group-fl" label="<%= LanguageUtil.get(pageContext, \"mo-ta\") +dotLabel %>"  >
					<aui:input type="textarea" cssClass="inputArea1001" name="<%=KeHoachKiemDemNuocTerms.MO_TA %>" label=""></aui:input>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		</aui:field-wrapper>
		<aui:button-row >
					<aui:button type="submit" value="luu-ke-hoach"/>
				</aui:button-row>
	</aui:form>
		

<script type="text/javascript">
//fitter list
function <portlet:namespace />fitterTramCap() {
	var A = AUI();
//		imPortTuExcelURL
	var url = '<%=onpageSuccess.toString() %>';
	if(A.one('#<portlet:namespace /><%=DauNoiNuocTerms.ID %>')) {
		url += '&<portlet:namespace /><%=DauNoiNuocTerms.ID %>=' + A.one('#<portlet:namespace /><%=DauNoiNuocTerms.ID %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=DauNoiNuocTerms.MA_TINH %>')) {
		url += '&<portlet:namespace /><%=DauNoiNuocTerms.MA_TINH %>=' + A.one('#<portlet:namespace /><%=DauNoiNuocTerms.MA_TINH %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=DauNoiNuocTerms.MA_HUYEN %>')) {
		url += '&<portlet:namespace /><%=DauNoiNuocTerms.MA_HUYEN %>=' + A.one('#<portlet:namespace /><%=DauNoiNuocTerms.MA_HUYEN %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=DauNoiNuocTerms.MA_XA %>')) {
		url += '&<portlet:namespace /><%=DauNoiNuocTerms.MA_XA %>=' + A.one('#<portlet:namespace /><%=DauNoiNuocTerms.MA_XA %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID %>')) {
		url += '&<portlet:namespace /><%=KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID %>=' + A.one('#<portlet:namespace /><%=KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=DauNoiNuocTerms.TRANG_THAI %>')) {
		url += '&<portlet:namespace /><%=DauNoiNuocTerms.TRANG_THAI %>=' + A.one('#<portlet:namespace /><%=DauNoiNuocTerms.TRANG_THAI %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=DauNoiNuocTerms.NAM_BAO_CAO %>')) {
		url += '&<portlet:namespace /><%=DauNoiNuocTerms.NAM_BAO_CAO %>=' + A.one('#<portlet:namespace /><%=DauNoiNuocTerms.NAM_BAO_CAO %>').get('value');
	}
	location.href = url;
}
AUI().ready(function(A){
	var capTinhInput = A.one("#<portlet:namespace/><%=DauNoiNuocTerms.MA_TINH %>");
	capTinhInput.on('change', function(){
		var capTinhId = capTinhInput.val();
		selectTram(capTinhId);
		selectKiemDemVien()
	});
});
function selectTram(capTinhId){
	AUI().use('aui-base','aui-io-request', function(A){

		//aui ajax call to get updated content
		A.io.request('<%= selectTramCap %>',
		{
			dataType: 'text/html',
			method: 'GET',
			data: { 
				"<portlet:namespace />capTinhId": capTinhId
			},
			on: {
				success: function() {
					var optHuyen = A.one("#tramCapCbx");
					optHuyen.set("innerHTML", this.get('responseData'));
				} 
			}
		});
	});	
}
function selectKiemDemVien(){
	AUI().use('aui-base','aui-io-request', function(A){
		var capTinhInput = A.one("#<portlet:namespace/><%=DauNoiNuocTerms.MA_TINH %>");
		var tramCapInputsss = A.one("#<portlet:namespace/><%=KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID %>");
		//aui ajax call to get updated content
		
		var idToTramCap = 0;
		var typeKiemDem = 1;
		if(capTinhInput.val()>0){
			idToTramCap = capTinhInput.val();
			typeKiemDem =1;
		}
		if(tramCapInputsss.val()>0){
			idToTramCap = tramCapInputsss.val();
			typeKiemDem = 3;
		}
		
		A.io.request('<%= selectKiemDem %>',
		{
			dataType: 'text/html',
			method: 'GET',
			data: { 
				"<portlet:namespace />tramCapIdAjax": idToTramCap,
				"<portlet:namespace />typeKiemDem": typeKiemDem
			},
			on: {
				success: function() {
					var optHuyen = A.one("#kiemDemCbx");
					optHuyen.set("innerHTML", this.get('responseData'));
				} 
			}
		});
	});	
}
</script>
<style>
.inputArea1001{
	max-width: 320px;
	width: 100% !important;
	height: 80px !important;
	margin-bottom: 0 !important;
}
.aui .control-group{
	margin-bottom:10px  !important;
height: 55px !important;
}
.aui select {
	width: 94% !important;
}
.control-group.field-wrapper.control-group-fl{
	height: 120px !important;
}
.inputCbx1001{
	max-width: 480px;
	width: 100% !important;
	margin-bottom: 0 !important;
}
.input-medium{
	max-width: 317px;
	width: 100% !important;
	margin-bottom: 0 !important;
}
.radio .form-validator-stack.help-inline{
	position: absolute !important;
	margin-top: -26px !important;
	margin-left: 15% !important;
	float: right;
    text-align: right !important;
}
</style>