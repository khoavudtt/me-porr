<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="vn.dtt.sol.ns.business.KiemDemVienBussiness"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.KeHoachKiemDemVeSinhTerms"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString"%>
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.KeHoachKiemDemNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc"%>
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
	
	String kiemDemVienId = (String)request.getAttribute(KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID);
	String trangThai = ParamUtil.getString(request, "trangThai");
	List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
	List<DATAITEM> listHuyen = (List<DATAITEM>)request.getAttribute("listHuyen");
	List<TramCapNuoc>  listTramCapNuoc = new ArrayList<TramCapNuoc>();
	KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = (KeHoachKiemDemVeSinh)request.getAttribute("keHoachKiemDemVeSinh");
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<KiemDemVien> listKiemDemVien = new ArrayList<KiemDemVien>();
	listKiemDemVien = (List<KiemDemVien>)request.getAttribute("listKiemDemVien");
	if(Validator.isNotNull(keHoachKiemDemVeSinh)){
		listTinh = new ArrayList<DATAITEM>();
		listHuyen = new ArrayList<DATAITEM>();
		listTinh.add(NuocSachUtils.getDATAITEMTinh(keHoachKiemDemVeSinh.getMaTinh()));
		//listHuyen.add(NuocSachUtils.getDATAITEMHuyen(keHoachKiemDemVeSinh.getMaTinh(), keHoachKiemDemVeSinh.getMaHuyen()));
		listHuyen = DiaBanQuanLyUtils.getHuyen(user, keHoachKiemDemVeSinh.getMaTinh(), 0, permissionChecker.isOmniadmin(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	String requiredLabel="";
	requiredLabel ="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
%>
	<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= (keHoachKiemDemVeSinh == null) ? "add-ke-hoach-kiem-dem-ve-sinh" : "edit-ke-hoach-kiem-dem-ve-sinh" %>'
/>
<liferay-ui:error key="<%=MessageErrors.ERROR_NGAY_THANG %>" message="<%=MessageErrors.ERROR_NGAY_THANG %>" />
<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/_select_huyen_form.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="selectKiemDem" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/_select_kiem_dem_vien_form.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/edit_kehoachkiemdemvesinh.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemvesinh/view_detail_tab1.jsp"/>
</portlet:renderURL>
<aui:model-context bean="<%= Validator.isNotNull(keHoachKiemDemVeSinh)?keHoachKiemDemVeSinh.toEscapedModel():keHoachKiemDemVeSinh %>" model="<%= KeHoachKiemDemVeSinh.class %>" />
<portlet:actionURL name="addkeHoachKiemDem" var="addkeHoachKiemDemURL"/>
<aui:form action="<%= addkeHoachKiemDemURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(keHoachKiemDemVeSinh) ? Constants.UPDATE : Constants.ADD %>"/>
	<aui:input name="redirect" type="hidden" value="<%= StringPool.BLANK %>" />
	<aui:input name="currentURL" type="hidden" value="<%= currentURL %>" />
	<aui:input name="onpageError" type="hidden" value="<%= onpageError%>" />
	<aui:input name="onpageSuccess" type="hidden" value="<%= onpageSuccess %>" />
	<aui:input name="<%=KeHoachKiemDemVeSinhTerms.ID %>" type="hidden" value="<%= Validator.isNotNull(keHoachKiemDemVeSinh) ? String.valueOf(keHoachKiemDemVeSinh.getId()) : StringPool.BLANK %>" />
	<aui:field-wrapper>

		<aui:row>
			<aui:col width="30">
				<aui:select required="true" showRequiredLabel="<%=false %>" name="<%=KeHoachKiemDemVeSinhTerms.MA_TINH %>" id="<%=KeHoachKiemDemVeSinhTerms.MA_TINH %>" label="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
					<c:if test="<%=userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU  && Validator.isNull(keHoachKiemDemVeSinh) %>">
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
				<div id="optHuyen">
					<aui:select cssClass="input1001" required="true" showRequiredLabel="<%=false %>"  name="<%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>"  id="<%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>" label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>"  onChange="javascript:selectXa();" >
						<c:if test="<%=userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU 
										|| userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TINH %>">
						<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
						</c:if>
						<%
							for (DATAITEM huyen : listHuyen) {
						%>
						<aui:option value="<%= huyen.getNode2() %>"><%= huyen.getName() %></aui:option>
						<%
							}
						%>
					</aui:select>
				</div>
				<div id="kiemDemCbx">
				<aui:select required="true" name="<%=KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID %>"  id="<%=KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID %>" label="<%= LanguageUtil.get(pageContext, \"kiem-dem-vien\") +\" \"+requiredLabel+ dotLabel %>" showEmptyOption="<%= false %>">
					<c:if test="<%=Validator.isNull(keHoachKiemDemVeSinh) %>">
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
					<aui:input name="<%=KeHoachKiemDemVeSinhTerms.NGAY_BAT_DAU %>" label="" inlineField="<%=true %>"></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-ket-thuc\") +dotLabel %>"  >
					<aui:input name="<%=KeHoachKiemDemVeSinhTerms.NGAY_KET_THUC %>" label="" inlineField="<%=true %>"></aui:input>
				</aui:field-wrapper>
			</aui:col>
			
		</aui:row>
	<aui:row>
			<aui:col width="30">
				<aui:field-wrapper cssClass="control-group-fl" label="<%= LanguageUtil.get(pageContext, \"mo-ta\") +dotLabel %>"  >
					<aui:input type="textarea" cssClass="inputArea1001" name="<%=KeHoachKiemDemVeSinhTerms.MO_TA %>" label=""></aui:input>
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
	if(A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.ID %>')) {
		url += '&<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.ID %>=' + A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.ID %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_TINH %>')) {
		url += '&<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_TINH %>=' + A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_TINH %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>')) {
		url += '&<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>=' + A.one('#<portlet:namespace /><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>').get('value');
	}
	if(A.one('#<portlet:namespace />trangThai')) {
		url += '&<portlet:namespace />trangThai=' + A.one('#<portlet:namespace />trangThai').get('value');
	}
	location.href = url;
}
AUI().ready(function(A){
	var capTinhInput = A.one("#<portlet:namespace/><%=KeHoachKiemDemVeSinhTerms.MA_TINH %>");
	var capHuyenInput = A.one("#<portlet:namespace/><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>");
	
	selectHuyen(capTinhInput.val(), capHuyenInput.val());
	
	capTinhInput.on('change', function(){
		var capTinhId = capTinhInput.val();
		var capHuyenId = capHuyenInput.val();
		selectHuyen(capTinhId, capHuyenId);
		selectKiemDemVien()
	});
});

function selectHuyen(capTinhId, capHuyenId){
	AUI().use('aui-base','aui-io-request', function(A){

		//aui ajax call to get updated content
		A.io.request('<%= selectHuyen %>',
		{
			dataType: 'text/html',
			method: 'GET',
			data: { 
				"<portlet:namespace />capTinhId": capTinhId,
				"<portlet:namespace />capHuyenId": capHuyenId
			},
			on: {
				success: function() {
					var optHuyen = A.one("#optHuyen");
					optHuyen.set("innerHTML", this.get('responseData'));
				} 
			}
		});
	});	
}

function selectXa(){
	AUI().use('aui-base','aui-io-request', function(A){
		var capTinhInput = A.one("#<portlet:namespace/><%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>");
		//aui ajax call to get updated content
		var idToTramCap = 0;
		var typeKiemDem = 1;
		if(capTinhInput.val()>0){
			idToTramCap = capTinhInput.val();
			typeKiemDem =2;
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
function selectKiemDemVien(){
	AUI().use('aui-base','aui-io-request', function(A){
		var capTinhInput = A.one("#<portlet:namespace/><%=KeHoachKiemDemVeSinhTerms.MA_TINH %>");
		//aui ajax call to get updated content
		var idToTramCap = 0;
		var typeKiemDem = 1;
		if(capTinhInput.val()>0){
			idToTramCap = capTinhInput.val();
			typeKiemDem =1;
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