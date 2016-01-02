<%@page import="vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhGiaDinhTerms"%>
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
	String maTinh = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_TINH);
	String maHuyen = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_HUYEN);
	String maXa = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_XA);
	String trangThai = (String)request.getAttribute(VeSinhGiaDinhTerms.TRANG_THAI);
	String namBaoCao = (String)request.getAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO);
	String namBaoCaoVstx = (String)request.getAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO+"vstx");
	String ngayDauNoi = (String)request.getAttribute("ngayNhap");
	String idNguoiTao = (String)request.getAttribute("idNguoiTao");
	String advText = (String)request.getAttribute("advText");
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
	List<DATAITEM> listHuyen = (List<DATAITEM>)request.getAttribute("listHuyen"); 
	List<DATAITEM> listXa = (List<DATAITEM>)request.getAttribute("listXa");
	VeSinhGiaDinh veSinhGiaDinh = (VeSinhGiaDinh)request.getAttribute("veSinhGiaDinh");
	List<DATAITEM> listLoaiNhaTieu = (List<DATAITEM>)request.getAttribute("listLoaiNhaTieu");
	String requiredLabel="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
	int year = Calendar.getInstance().get(Calendar.YEAR);
%>
<liferay-portlet:renderURL varImpl="redirectDauNoiURL">
	<liferay-portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/view.jsp"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.NAM_BAO_CAO+\"vstx\" %>" value="<%=namBaoCaoVstx %>"></liferay-portlet:param>
	<liferay-portlet:param name="idNguoiTao" value="<%=String.valueOf(idNguoiTao) %>"></liferay-portlet:param>
	<liferay-portlet:param name="ngayNhap" value="<%=String.valueOf(ngayDauNoi) %>"></liferay-portlet:param>
	<liferay-portlet:param name="advText" value="<%=String.valueOf(advText) %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<liferay-ui:header
	backURL="<%= redirectDauNoiURL.toString() %>"
	title='<%= (veSinhGiaDinh == null) ? "add-vs-ho-gia-dinh" : "edit-vs-ho-gia-dinh" %>'
/>
<liferay-ui:error key="<%= Validator.isNotNull(veSinhGiaDinh)?MessageErrors.EDIT_DAU_NOI_MESSAGE:MessageErrors.ADD_DAU_NOI_MESSAGE %>" message="<%= Validator.isNotNull(veSinhGiaDinh)?MessageErrors.EDIT_DAU_NOI_MESSAGE:MessageErrors.ADD_DAU_NOI_MESSAGE %>" />
<liferay-ui:success key="<%= Validator.isNotNull(veSinhGiaDinh)?MessageSuccess.EDIT_DAU_NOI_MESSAGE:MessageSuccess.ADD_DAU_NOI_MESSAGE %>" message="<%= Validator.isNotNull(veSinhGiaDinh)?MessageSuccess.EDIT_DAU_NOI_MESSAGE:MessageSuccess.ADD_DAU_NOI_MESSAGE %>" />

<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/edit_hogiadinh.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/view.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/_select_huyen_form.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="selectXa" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/_select_xa_form.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addHoGiaDinh" var="addHoGiaDinhURL"/>
<aui:model-context bean="<%= Validator.isNotNull(veSinhGiaDinh)?veSinhGiaDinh.toEscapedModel():veSinhGiaDinh %>" model="<%= VeSinhGiaDinh.class %>" />
<aui:form action="<%= addHoGiaDinhURL %>" method="post" name="fm">
	<aui:input cssClass="input-col1"  name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(veSinhGiaDinh) ? Constants.UPDATE : Constants.ADD %>"/>
	<aui:input cssClass="input-col1"  name="onpageError" type="hidden" value="<%= onpageError%>" />
	<aui:input cssClass="input-col1"  name="onpageSuccess" type="hidden" value="<%= onpageSuccess %>" />
	<aui:input cssClass="input-col1"  name="<%=VeSinhGiaDinhTerms.ID %>" type="hidden" value="<%= Validator.isNotNull(veSinhGiaDinh) ? String.valueOf(veSinhGiaDinh.getId()) : StringPool.BLANK %>" />
	
	<aui:field-wrapper>
	<aui:row>
		
		<aui:col width="33">
		
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ten-chu-ho\") +\" \"+requiredLabel+dotLabel %>" >
					<aui:input cssClass="input-col1"  type="text"  name="<%=VeSinhGiaDinhTerms.TEN_CHU_HO %>" label="" >
						<aui:validator  name="required"  errorMessage="<%=LanguageUtil.get(pageContext, \"ten-chu-ho\") + \" \"+LanguageUtil.get(pageContext, \"cus-required\") %>" />
					</aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"dc-thon-xom\") +\" \"+requiredLabel+dotLabel %>" >
					<aui:input cssClass="input-col1"  type="text"  name="<%=VeSinhGiaDinhTerms.THON_XOM %>" label="">
					<aui:validator  name="required"  errorMessage="<%=LanguageUtil.get(pageContext, \"thon-xom\") + \" \"+LanguageUtil.get(pageContext, \"cus-required\") %>" />
					</aui:input>
				</aui:field-wrapper>
				<div id="optHuyen">
					<aui:select cssClass="input-col1"  required="true" showRequiredLabel="<%=false %>"  name="<%=VeSinhGiaDinhTerms.MA_HUYEN %>"  id="<%=VeSinhGiaDinhTerms.MA_HUYEN %>" label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
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
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-nguoi-trong-ho\") +dotLabel %>"  >
					<aui:input name="<%=VeSinhGiaDinhTerms.SO_NGUOI_TRONG_HO %>" label=""></aui:input>
				</aui:field-wrapper>
				<aui:select cssClass="select-col1"   showRequiredLabel="<%=false %>" name="<%=VeSinhGiaDinhTerms.CO_NHA_TIEU %>" label="<%= LanguageUtil.get(pageContext, \"hien-trang-truoc-khi-xay\") +dotLabel %>" showEmptyOption="<%= false  %>">
						<aui:option value="0"><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
						<aui:option value="1"><liferay-ui:message key="co-nha-tieu-hvs-1"></liferay-ui:message></aui:option>
						<aui:option value="2"><liferay-ui:message key="co-nha-tieu-hvs-2"></liferay-ui:message></aui:option>
						<aui:option value="3"><liferay-ui:message key="co-nha-tieu-hvs-3"></liferay-ui:message></aui:option>
				</aui:select>
				<aui:select cssClass="input-col1" name="<%=VeSinhGiaDinhTerms.THANG_XAY_DUNG %>" label="<%= LanguageUtil.get(pageContext, \"thang-xay-dung\") +dotLabel %>" showEmptyOption="<%= false %>">
						<aui:option value="0"><liferay-ui:message key="thang-xay-dung-0"></liferay-ui:message></aui:option>
						<%for(int i=1; i<= 12; i++){ %>
						<aui:option value="<%=String.valueOf(i) %>"><liferay-ui:message key="<%=\"thang-xay-dung-\"+String.valueOf(i) %>"></liferay-ui:message></aui:option>
						<%} %>
				</aui:select>
				
				
		</aui:col>
		<aui:col width="33">
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"gioi-tinh\") +\" \"+requiredLabel+dotLabel%>" >
					<aui:input cssClass="input-col1"  name="<%=VeSinhGiaDinhTerms.GIOI_TINH_CHU_HO %>" checked="<%=Validator.isNotNull(veSinhGiaDinh)&&veSinhGiaDinh.getGioiTinhChuHo()==0?true:false %>"  value="0" label="nam" type="radio" inlineLabel="true" inlineField="<%=true %>" ><aui:validator  name="required"   /></aui:input>
					<aui:input cssClass="input-col1"  name="<%=VeSinhGiaDinhTerms.GIOI_TINH_CHU_HO %>" checked="<%=Validator.isNotNull(veSinhGiaDinh)&&veSinhGiaDinh.getGioiTinhChuHo()==1?true:false %>" value="1" label="nu" type="radio" inlineLabel="true" inlineField="<%=true %>" ><aui:validator  name="required"   /></aui:input>
				</aui:field-wrapper>
				<aui:select cssClass="input-col1"   required="true" showRequiredLabel="<%=false %>" name="<%=VeSinhGiaDinhTerms.MA_TINH %>" id="<%=VeSinhGiaDinhTerms.MA_TINH %>" label="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
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
				<div id="optXa">
				
					<aui:select cssClass="input-col1"   required="true" showRequiredLabel="<%=false %>"  name="<%=VeSinhGiaDinhTerms.MA_XA %>"  id="<%=VeSinhGiaDinhTerms.MA_XA %>" label="<%= LanguageUtil.get(pageContext, \"phuong-xa\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
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
				<aui:select cssClass="input-col1"   showRequiredLabel="<%=false %>" name="<%=VeSinhGiaDinhTerms.THANH_PHAN_HO_GD %>" label="<%= LanguageUtil.get(pageContext, \"thanh-phan-ho-gia-dinh\") +dotLabel %>" showEmptyOption="<%= false  %>">
						<aui:option value="0"><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
						<aui:option value="1"><liferay-ui:message key="thanh-phan-ho-gia-dinh-1"></liferay-ui:message></aui:option>
						<aui:option value="2"><liferay-ui:message key="thanh-phan-ho-gia-dinh-2"></liferay-ui:message></aui:option>
						<aui:option value="3"><liferay-ui:message key="thanh-phan-ho-gia-dinh-3"></liferay-ui:message></aui:option>
				</aui:select>
				<aui:select cssClass="input-col1" showRequiredLabel="<%=false %>" name="<%=VeSinhGiaDinhTerms.LOAI_NHA_TIEU %>" label="<%= LanguageUtil.get(pageContext, \"loai-nha-tieu\") +dotLabel %>" showEmptyOption="<%= false  %>">
						<aui:option value="0"><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
						<%for(DATAITEM loaiNhaTieu: listLoaiNhaTieu){ %>
						<aui:option value="<%=String.valueOf(loaiNhaTieu.getNode1()) %>"><%=String.valueOf(loaiNhaTieu.getName()) %></aui:option>
						<%} %>
				</aui:select>
				<aui:select cssClass="input-col1"   name="<%=VeSinhGiaDinhTerms.NAM_XAY_DUNG %>" label="<%= LanguageUtil.get(pageContext, \"nam-xay-dung\") +dotLabel %>" showEmptyOption="<%= false %>">
						<aui:option value="0"><liferay-ui:message key="nam-xay-dung-0"></liferay-ui:message></aui:option>
						<%for(int i=2000; i<= year; i++){ %>
						<aui:option value="<%=String.valueOf(i) %>"><liferay-ui:message key="<%=String.valueOf(i) %>"></liferay-ui:message></aui:option>
						<%} %>
				</aui:select>
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
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ghi-chu\") +\" \"+dotLabel %>" >
					<aui:input cssClass="inputArea1001"  type="textarea"  name="<%=VeSinhGiaDinhTerms.GHI_CHU %>" label="">
					</aui:input>
				</aui:field-wrapper>
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
//fitter list
function <portlet:namespace />fitterTramCap() {
	var A = AUI();
//		imPortTuExcelURL
	var url = '<%=onpageSuccess.toString() %>';
	if(A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.ID %>')) {
		url += '&<portlet:namespace /><%=VeSinhGiaDinhTerms.ID %>=' + A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.ID %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.MA_TINH %>')) {
		url += '&<portlet:namespace /><%=VeSinhGiaDinhTerms.MA_TINH %>=' + A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.MA_TINH %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.MA_HUYEN %>')) {
		url += '&<portlet:namespace /><%=VeSinhGiaDinhTerms.MA_HUYEN %>=' + A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.MA_HUYEN %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.MA_XA %>')) {
		url += '&<portlet:namespace /><%=VeSinhGiaDinhTerms.MA_XA %>=' + A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.MA_XA %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.LOAI_NHA_TIEU %>')) {
		url += '&<portlet:namespace /><%=VeSinhGiaDinhTerms.LOAI_NHA_TIEU %>=' + A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.LOAI_NHA_TIEU %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.TRANG_THAI %>')) {
		url += '&<portlet:namespace /><%=VeSinhGiaDinhTerms.TRANG_THAI %>=' + A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.TRANG_THAI %>').get('value');
	}
	if(A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.NAM_BAO_CAO %>')) {
		url += '&<portlet:namespace /><%=VeSinhGiaDinhTerms.NAM_BAO_CAO %>=' + A.one('#<portlet:namespace /><%=VeSinhGiaDinhTerms.NAM_BAO_CAO %>').get('value');
	}
	location.href = url;
}
AUI().ready(function(A){
	var capTinhInput = A.one("#<portlet:namespace/><%=VeSinhGiaDinhTerms.MA_TINH %>");
	var capHuyenInput = A.one("#<portlet:namespace/><%=VeSinhGiaDinhTerms.MA_HUYEN %>");
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
		var capTinhInput = A.one("#<portlet:namespace/><%=VeSinhGiaDinhTerms.MA_TINH %>");
		var capHuyenInput = A.one("#<portlet:namespace/><%=VeSinhGiaDinhTerms.MA_HUYEN %>");

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
</style>