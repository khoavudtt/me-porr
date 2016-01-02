<%@page import="vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhCongTrinhTerms"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhCongTrinhTerms"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
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
	String maTinh = (String)request.getAttribute(VeSinhCongTrinhTerms.MA_TINH);
	String maHuyen = (String)request.getAttribute(VeSinhCongTrinhTerms.MA_HUYEN);
	String maXa = (String)request.getAttribute(VeSinhCongTrinhTerms.MA_XA);
	String trangThai = (String)request.getAttribute(VeSinhCongTrinhTerms.TRANG_THAI);
	String namBaoCao = (String)request.getAttribute(VeSinhCongTrinhTerms.NAM_BAO_CAO);
	
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
	List<DATAITEM> listHuyen = (List<DATAITEM>)request.getAttribute("listHuyen"); 
	List<DATAITEM> listXa = (List<DATAITEM>)request.getAttribute("listXa");
	VeSinhCongTrinh veSinhCongTrinh = (VeSinhCongTrinh)request.getAttribute("veSinhCongTrinh");
	List<DATAITEM> listLoaiNhaTieu = (List<DATAITEM>)request.getAttribute("listLoaiNhaTieu");
	List<DATAITEM> listLoaiNguonNuoc = (List<DATAITEM>)request.getAttribute("listLoaiNguonNuoc");
	List<DATAITEM> listLoaiCongTrinh = (List<DATAITEM>)request.getAttribute("listLoaiCongTrinh");
	String requiredLabel="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
%>
<liferay-portlet:renderURL varImpl="redirectDauNoiURL">
	<liferay-portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/view.jsp"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhCongTrinhTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<liferay-ui:header
	backURL="<%= redirectDauNoiURL.toString() %>"
	title='<%= (veSinhCongTrinh == null) ? "add-vs-cong-trinh" : "edit-vs-cong-trinh" %>'
/>
<liferay-ui:error key="<%= Validator.isNotNull(veSinhCongTrinh)?MessageErrors.EDIT_CONG_TRINH_MESSAGE:MessageErrors.ADD_CONG_TRINH_MESSAGE %>" message="<%= Validator.isNotNull(veSinhCongTrinh)?MessageErrors.EDIT_CONG_TRINH_MESSAGE:MessageErrors.ADD_CONG_TRINH_MESSAGE %>" />
<liferay-ui:success key="<%= Validator.isNotNull(veSinhCongTrinh)?MessageSuccess.EDIT_CONG_TRINH_MESSAGE:MessageSuccess.ADD_CONG_TRINH_MESSAGE %>" message="<%= Validator.isNotNull(veSinhCongTrinh)?MessageSuccess.EDIT_CONG_TRINH_MESSAGE:MessageSuccess.ADD_CONG_TRINH_MESSAGE %>" />

<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/edit_congtrinh.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/view.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/_select_huyen_form.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="selectXa" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhcongtrinh/_select_xa_form.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addCongTrinh" var="addCongTrinhURL"/>
<aui:model-context bean="<%= Validator.isNotNull(veSinhCongTrinh)?veSinhCongTrinh.toEscapedModel():veSinhCongTrinh %>" model="<%= VeSinhCongTrinh.class %>" />
<aui:form action="<%= addCongTrinhURL %>" method="post" name="fm">
	<aui:input cssClass="input-col1"  name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(veSinhCongTrinh) ? Constants.UPDATE : Constants.ADD %>"/>
	<aui:input cssClass="input-col1"  name="onpageError" type="hidden" value="<%= onpageError%>" />
	<aui:input cssClass="input-col1"  name="onpageSuccess" type="hidden" value="<%= onpageSuccess %>" />
	<aui:input cssClass="input-col1"  name="<%=VeSinhCongTrinhTerms.ID %>" type="hidden" value="<%= Validator.isNotNull(veSinhCongTrinh) ? String.valueOf(veSinhCongTrinh.getId()) : StringPool.BLANK %>" />
	
	<aui:field-wrapper>
	<aui:row>
		<aui:col width="66">
		<aui:col width="50">
		
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ten-cong-trinh\") +\" \"+requiredLabel+dotLabel %>" >
					<aui:input cssClass="input-col1"  type="text"  name="<%=VeSinhCongTrinhTerms.TEN_CONG_TRINH %>" label="" >
						<aui:validator  name="required"  errorMessage="<%=LanguageUtil.get(pageContext, \"ten-cong-trinh\") + \" \"+LanguageUtil.get(pageContext, \"cus-required\") %>" />
					</aui:input>
				</aui:field-wrapper>
				<aui:select cssClass="select-col1" required="true"  showRequiredLabel="<%=false %>" name="<%=VeSinhCongTrinhTerms.LOAI_CONG_TRINH %>" label="<%= LanguageUtil.get(pageContext, \"loai-cong-trinh\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false  %>">
						<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
						<%
							for(int i = 0; i < listLoaiCongTrinh.size(); i++){
						%>
							<aui:option value="<%=String.valueOf(Integer.valueOf(listLoaiCongTrinh.get(i).getNode1())) %>"><%=listLoaiCongTrinh.get(i).getName() %></aui:option>
						<%} %>
				</aui:select>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"dia-chi\") +\" \"+requiredLabel+dotLabel %>" >
					<aui:input cssClass="input-col1"  type="text"  name="<%=VeSinhCongTrinhTerms.DIA_CHI %>" label="">
					<aui:validator  name="required"  errorMessage="<%=LanguageUtil.get(pageContext, \"dia-chi\") + \" \"+LanguageUtil.get(pageContext, \"cus-required\") %>" />
					</aui:input>
				</aui:field-wrapper>
				
<%-- 				<aui:select cssClass="select-col1"   showRequiredLabel="<%=false %>" name="<%=VeSinhCongTrinhTerms.NHA_TIEU_HVS %>" label="<%= LanguageUtil.get(pageContext, \"nha-tieu-hvs\") +dotLabel %>" showEmptyOption="<%= false  %>"> --%>
<%-- 						<aui:option value="0"><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option> --%>
<%-- 						<aui:option value="1"><liferay-ui:message key="nha-tieu-hvs-1"></liferay-ui:message></aui:option> --%>
<%-- 						<aui:option value="2"><liferay-ui:message key="nha-tieu-hvs-2"></liferay-ui:message></aui:option> --%>
<%-- 				</aui:select> --%>
				
		</aui:col>
		<aui:col width="50">
				<aui:select cssClass="input-col1"   required="true" showRequiredLabel="<%=false %>" name="<%=VeSinhCongTrinhTerms.MA_TINH %>" id="<%=VeSinhCongTrinhTerms.MA_TINH %>" label="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
					<c:if test="<%=userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU %>">
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
					<aui:select cssClass="input-col1"  required="true" showRequiredLabel="<%=false %>"  name="<%=VeSinhCongTrinhTerms.MA_HUYEN %>"  id="<%=VeSinhCongTrinhTerms.MA_HUYEN %>" label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
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
				<div id="optXa">
				
					<aui:select cssClass="input-col1"   required="true" showRequiredLabel="<%=false %>"  name="<%=VeSinhCongTrinhTerms.MA_XA %>"  id="<%=VeSinhCongTrinhTerms.MA_XA %>" label="<%= LanguageUtil.get(pageContext, \"phuong-xa\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
						<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
						<%
						for (DATAITEM xa : listXa) {
					%>
						<aui:option value="<%= xa.getNode3() %>"><%= xa.getName() %></aui:option>
					<%
						}
					%>
					</aui:select>
				
				</div>
				
<%-- 				<aui:select cssClass="input-col1"   showRequiredLabel="<%=false %>" name="<%=VeSinhCongTrinhTerms.LOAI_NHA_TIEU %>" label="<%= LanguageUtil.get(pageContext, \"loai-nha-tieu\") +dotLabel %>" showEmptyOption="<%= false  %>"> --%>
<%-- 						<aui:option value="0"><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option> --%>
<%-- 						<%for(DATAITEM loaiNhaTieu: listLoaiNhaTieu){ %> --%>
<%-- 						<aui:option value="<%=String.valueOf(loaiNhaTieu.getId()) %>"><%=String.valueOf(loaiNhaTieu.getName()) %></aui:option> --%>
<%-- 						<%} %> --%>
<%-- 				</aui:select> --%>
<%-- 				<aui:select cssClass="input-col1"   showRequiredLabel="<%=false %>" name="<%=VeSinhCongTrinhTerms.LOAI_NGUON_NUOC %>" label="<%= LanguageUtil.get(pageContext, \"loai-nguon-nuoc\") +dotLabel %>" showEmptyOption="<%= false  %>"> --%>
<%-- 						<aui:option value="0"><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option> --%>
<%-- 						<%for(DATAITEM loaiNguonNuoc: listLoaiNguonNuoc){ %> --%>
<%-- 						<aui:option value="<%=String.valueOf(loaiNguonNuoc.getId()) %>"><%=String.valueOf(loaiNguonNuoc.getName()) %></aui:option> --%>
<%-- 						<%} %> --%>
<%-- 				</aui:select> --%>
<%-- 				<aui:select cssClass="input-col1"   name="<%=VeSinhCongTrinhTerms.NGUON_NUOC_HVS %>" label="<%= LanguageUtil.get(pageContext, \"nguon-nuoc-hvs\") +dotLabel %>" showEmptyOption="<%= false %>"> --%>
<%-- 						<aui:option value="0"><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option> --%>
<%-- 						<aui:option value="1"><liferay-ui:message key="nguon-nuoc-hvs-1"></liferay-ui:message></aui:option> --%>
<%-- 						<aui:option value="2"><liferay-ui:message key="nguon-nuoc-hvs-2"></liferay-ui:message></aui:option> --%>
<%-- 				</aui:select> --%>
<%-- 				<aui:select cssClass="input-col1"   name="<%=VeSinhCongTrinhTerms.NAM_BAO_CAO %>" label="<%= LanguageUtil.get(pageContext, \"tinh-trang-bao-cao\") +dotLabel %>" showEmptyOption="<%= false %>"> --%>
<%-- 						<aui:option value="0"><liferay-ui:message key="nam-bao-cao-0"></liferay-ui:message></aui:option> --%>
<%-- 						<aui:option value="2013"><liferay-ui:message key="nam-bao-cao-2013"></liferay-ui:message></aui:option> --%>
<%-- 						<aui:option value="2014"><liferay-ui:message key="nam-bao-cao-2014"></liferay-ui:message></aui:option> --%>
<%-- 						<aui:option value="2015"><liferay-ui:message key="nam-bao-cao-2015"></liferay-ui:message></aui:option> --%>
<%-- 				</aui:select> --%>
		</aui:col>
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ghi-chu\") +\" \"+dotLabel %>" >
					<aui:input cssClass="area-col1"  type="textarea"  name="<%=VeSinhCongTrinhTerms.GHI_CHU %>" label="">
					</aui:input>
				</aui:field-wrapper>
		</aui:col>
		
		<aui:col width="31">
		<div id="locationpicker">
						<div id="us2" style="width: 100%; height: 300px;"></div>
		
						<script>$('#us2').locationpicker({
							location: {latitude: <%="21.023277896055212" %>, longitude: <%= "105.83364481586909" %>},	
							radius: 300,
								inputBinding: {
									latitudeInput: $('#<portlet:namespace/>kinhDo'),
									longitudeInput: $('#<portlet:namespace/>viDo'),
								}
							});
						</script>
					</div>
		
		</aui:col>
	</aui:row>
		<aui:row >	
			<aui:col width="100">
				<aui:button-row>
					<aui:button type="submit" value="luu"/>
				</aui:button-row>
			</aui:col>
		</aui:row>
	</aui:field-wrapper>
</aui:form>


<script type="text/javascript">
AUI().ready(function(A){
	var capTinhInput = A.one("#<portlet:namespace/><%=VeSinhCongTrinhTerms.MA_TINH %>");
	var capHuyenInput = A.one("#<portlet:namespace/><%=VeSinhCongTrinhTerms.MA_HUYEN %>");
	
	selectHuyen(capTinhInput.val(), capHuyenInput.val());

	capTinhInput.on('change', function(){
		var capTinhId = capTinhInput.val();
		var capHuyenId = capHuyenInput.val();
		selectHuyen(capTinhId, capHuyenId);
		selectXa();
	});
	
	capHuyenInput.on('change', function(){
		var capTinhId = capTinhInput.val();
		var capHuyenId = capHuyenInput.val();
		selectXa(capTinhId, capHuyenId);
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
		//aui ajax call to get updated content
		var capTinhInput = A.one("#<portlet:namespace/><%=VeSinhCongTrinhTerms.MA_TINH %>");
		var capHuyenInput = A.one("#<portlet:namespace/><%=VeSinhCongTrinhTerms.MA_HUYEN %>");

		A.io.request('<%= selectXa %>',
		{
			dataType: 'text/html',
			method: 'GET',
			data: { 
				"<portlet:namespace />capTinhId": capTinhInput.val(),
				"<portlet:namespace />capHuyenId": capHuyenInput.val()
			},
			on: {
				success: function() {
					var optXa = A.one("#optXa");
					optXa.set("innerHTML", this.get('responseData'));
				} 
			}
		});
	});	
}
</script>
<style>
.aui .control-group{
	margin-bottom:10px  !important;
height: 55px !important;
}
.aui select {
	width: 94% !important;
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
.area-col1{
width: 100% !important;
height: 70px !important;
}
</style>