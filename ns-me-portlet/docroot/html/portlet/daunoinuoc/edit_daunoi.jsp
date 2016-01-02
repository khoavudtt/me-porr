<%@page import="vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.util.MessageSuccess"%>
<%@page import="vn.dtt.sol.ns.util.MessageErrors"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.DauNoiNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms"%>
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
	String maTinh = (String)request.getAttribute(DauNoiNuocTerms.MA_TINH);
	String maHuyen = (String)request.getAttribute(DauNoiNuocTerms.MA_HUYEN);
	String maXa = (String)request.getAttribute(DauNoiNuocTerms.MA_XA);
	String tramCapNuocId = (String)request.getAttribute(DauNoiNuocTerms.TRAM_CAP_NUOC_ID);
	String trangThai = (String)request.getAttribute(DauNoiNuocTerms.TRANG_THAI);
	String namBaoCao = (String)request.getAttribute(DauNoiNuocTerms.NAM_BAO_CAO);
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
	List<DATAITEM> listHuyen = (List<DATAITEM>)request.getAttribute("listHuyen"); 
	List<DATAITEM> listXa = (List<DATAITEM>)request.getAttribute("listXa");
	List<TramCapNuoc> listTramCapNuoc = (List<TramCapNuoc>)request.getAttribute("listTramCapNuoc");
	DauNoiNuoc dauNoiNuoc = (DauNoiNuoc)request.getAttribute("dauNoiNuoc");
	String duplicate = ParamUtil.getString(request, "duplicate");
	String requiredLabel="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
	
%>
<liferay-portlet:renderURL varImpl="redirectDauNoiURL">
	<liferay-portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/view.jsp"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>" value="<%=tramCapNuocId %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<liferay-ui:header
	backURL="<%= redirectDauNoiURL.toString() %>"
	title='<%= (dauNoiNuoc == null) ? "add-dau-noi-nuoc" : (Validator.isNotNull(duplicate) && duplicate.equalsIgnoreCase("1"))?"add-dau-noi-nuoc":"edit-dau-noi-nuoc" %>'
/>
<liferay-ui:error key="<%= Validator.isNotNull(dauNoiNuoc)?MessageErrors.EDIT_DAU_NOI_MESSAGE:MessageErrors.ADD_DAU_NOI_MESSAGE %>" message="<%= Validator.isNotNull(dauNoiNuoc)?MessageErrors.EDIT_DAU_NOI_MESSAGE:MessageErrors.ADD_DAU_NOI_MESSAGE %>" />
<liferay-ui:success key="<%= Validator.isNotNull(dauNoiNuoc)?MessageSuccess.EDIT_DAU_NOI_MESSAGE:MessageSuccess.ADD_DAU_NOI_MESSAGE %>" message="<%= Validator.isNotNull(dauNoiNuoc)?MessageSuccess.EDIT_DAU_NOI_MESSAGE:MessageSuccess.ADD_DAU_NOI_MESSAGE %>" />
<liferay-ui:success key="<%= MessageSuccess.ADD_DAU_NOI_DUPLICATE_MESSAGE %>" message="<%= MessageSuccess.ADD_DAU_NOI_DUPLICATE_MESSAGE %>" />

<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/edit_daunoi.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/view.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="selectTramCap" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/_select_tram_cap_form.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/_select_huyen.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="selectXa" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/_select_xa.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addDauNoiNuoc" var="addDauNoiNuocURL"/>
<portlet:actionURL name="deleteDauNoiNuoc" var="deleteDauNoiNuocURL"/>
<aui:model-context bean="<%= Validator.isNotNull(dauNoiNuoc)?dauNoiNuoc.toEscapedModel():dauNoiNuoc %>" model="<%= DauNoiNuoc.class %>" />
<aui:form action="<%= addDauNoiNuocURL %>" method="post" name="fm">
	<c:choose>
		<c:when test="<%=Validator.isNotNull(duplicate) && duplicate.equalsIgnoreCase(\"1\") %>">
		<aui:input cssClass="input1001"  name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.ADD %>"/>
		</c:when>
		<c:otherwise>
			<aui:input cssClass="input1001"  name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(dauNoiNuoc) ? Constants.UPDATE : Constants.ADD %>"/>
		</c:otherwise>
	</c:choose>
	
	<aui:input cssClass="input1001"  name="onpageError" type="hidden" value="<%= onpageError%>" />
	<aui:input cssClass="input1001"  name="onpageSuccess" type="hidden" value="<%= onpageSuccess %>" />
	<aui:input cssClass="input1001"  name="<%=DauNoiNuocTerms.ID %>" type="hidden" value="<%= Validator.isNotNull(dauNoiNuoc) ? String.valueOf(dauNoiNuoc.getId()) : StringPool.BLANK %>" />
	
	<aui:field-wrapper>
	<aui:row>
		
		<aui:col width="33">
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ten-chu-ho\") +\" \"+requiredLabel+dotLabel %>" >
					<aui:input cssClass="input1001"  type="text"  name="<%=DauNoiNuocTerms.TEN_CHU_HO %>" label="" >
						<aui:validator  name="required"  errorMessage="<%=LanguageUtil.get(pageContext, \"ten-chu-ho\") + \" \"+LanguageUtil.get(pageContext, \"cus-required\") %>" />
					</aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"dc-thon-xom\") +\" \"+requiredLabel+dotLabel %>" >
					<aui:input cssClass="input1001"  type="text"  name="<%=DauNoiNuocTerms.THON_XOM %>" label="">
					<aui:validator  name="required"  errorMessage="<%=LanguageUtil.get(pageContext, \"thon-xom\") + \" \"+LanguageUtil.get(pageContext, \"cus-required\") %>" />
					</aui:input>
				</aui:field-wrapper>
				<div id="optHuyen">
					<aui:select cssClass="input1001"  required="true" showRequiredLabel="<%=false %>"  name="<%=DauNoiNuocTerms.MA_HUYEN %>"  id="<%=DauNoiNuocTerms.MA_HUYEN %>" label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
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
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-nguoi-trong-ho\") +\" \"+dotLabel %>" >
					<aui:input cssClass="input1001"  type="text" name="<%=DauNoiNuocTerms.SO_NGUOI_TRONG_HO %>" label="">
					</aui:input>
				</aui:field-wrapper>
				<div id="tramCapCbx">
				<aui:select cssClass="input1001"   required="true"
							name="<%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>" label="<%= LanguageUtil.get(pageContext, \"tram-cap-nuoc\") + \" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>">
					<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
					<%
						for (TramCapNuoc tramCap : listTramCapNuoc) {
					%>
					<aui:option value="<%= tramCap.getId() %>"><%= tramCap.getTenTram() %></aui:option>
					<%
						}
					%>
				</aui:select>
				</div>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-dau-noi-tren-hop-dong\") +dotLabel %>"  >
					<aui:input cssClass="input1001"   name="<%=DauNoiNuocTerms.NGAY_DAU_NOI_HOP_DONG %>" label=""></aui:input>
				</aui:field-wrapper>
				<aui:select cssClass="input1001"   name="<%=DauNoiNuocTerms.NAM_BAO_CAO %>" label="<%= LanguageUtil.get(pageContext, \"tinh-trang-bao-cao\") +dotLabel %>" showEmptyOption="<%= false %>">
						<aui:option value="0"><liferay-ui:message key="nam-bao-cao-0"></liferay-ui:message></aui:option>
						<aui:option value="2013"><liferay-ui:message key="nam-bao-cao-2013"></liferay-ui:message></aui:option>
						<aui:option value="2014"><liferay-ui:message key="nam-bao-cao-2014"></liferay-ui:message></aui:option>
						<aui:option value="2015"><liferay-ui:message key="nam-bao-cao-2015"></liferay-ui:message></aui:option>
				</aui:select>
		</aui:col>
		<aui:col width="33">
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"gioi-tinh\") +\" \"+requiredLabel+dotLabel%>" >
					<aui:input cssClass="input1001"  name="<%=DauNoiNuocTerms.GIOI_TINH %>" checked="<%=Validator.isNotNull(dauNoiNuoc)&&dauNoiNuoc.getGioiTinh()==0?true:false %>"  value="0" label="nam" type="radio" inlineLabel="true" inlineField="<%=true %>" ><aui:validator  name="required"   /></aui:input>
					<aui:input cssClass="input1001"  name="<%=DauNoiNuocTerms.GIOI_TINH %>" checked="<%=Validator.isNotNull(dauNoiNuoc)&&dauNoiNuoc.getGioiTinh()==1?true:false %>" value="1" label="nu" type="radio" inlineLabel="true" inlineField="<%=true %>" ><aui:validator  name="required"   /></aui:input>
				</aui:field-wrapper>
				<aui:select cssClass="input1001"   required="true" showRequiredLabel="<%=false %>" name="<%=DauNoiNuocTerms.MA_TINH %>" id="<%=DauNoiNuocTerms.MA_TINH %>" label="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
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
				
					<aui:select cssClass="input1001"   required="true" showRequiredLabel="<%=false %>"  name="<%=DauNoiNuocTerms.MA_XA %>"  id="<%=DauNoiNuocTerms.MA_XA %>" label="<%= LanguageUtil.get(pageContext, \"phuong-xa\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
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
				<aui:select cssClass="input1001"   showRequiredLabel="<%=false %>" name="<%=DauNoiNuocTerms.THANH_PHAN_HO_GIA_DINH %>" label="<%= LanguageUtil.get(pageContext, \"thanh-phan-ho-gia-dinh\") +dotLabel %>" showEmptyOption="<%= false  %>">
						<aui:option value="0"><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
						<aui:option value="1"><liferay-ui:message key="thanh-phan-ho-gia-dinh-1"></liferay-ui:message></aui:option>
						<aui:option value="2"><liferay-ui:message key="thanh-phan-ho-gia-dinh-2"></liferay-ui:message></aui:option>
						<aui:option value="3"><liferay-ui:message key="thanh-phan-ho-gia-dinh-3"></liferay-ui:message></aui:option>
				</aui:select>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-sery-dong-ho-nuoc\") +dotLabel %>"  >
					<aui:input cssClass="input1001 formatPrice"   name="<%=DauNoiNuocTerms.SO_SERY_DONG_HO %>" label=""></aui:input>
				</aui:field-wrapper>
				
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-dau-noi-thuc-te\") +dotLabel %>"  >
					<aui:input cssClass="input1001"   name="<%=DauNoiNuocTerms.NGAY_DAU_NOI_THUC_TE %>" label=""></aui:input>
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
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ghi-chu\") +\" \"+dotLabel %>" >
					<aui:input cssClass="inputArea1001"  type="textarea"  name="<%=DauNoiNuocTerms.GHI_CHU %>" label="">
					</aui:input>
				</aui:field-wrapper>
		</aui:col>
	</aui:row>
		
		<aui:row >	
			<aui:col width="100">
				<aui:button-row>
					<aui:button type="submit" value="luu"/>
					<c:if test="<%=Validator.isNotNull(duplicate) && duplicate.equalsIgnoreCase(\"1\") %>">
						<aui:button type="submit" onClick='<%="deleteDuplicate();"%>' value="huy"/>
					</c:if>
				</aui:button-row>
			</aui:col>
		</aui:row>
	</aui:field-wrapper>
</aui:form>

<aui:script>
var A = AUI();
Liferay.provide(window, 'deleteDuplicate', function(action) {
     A.one('#<portlet:namespace/>fm').set('action','<%=deleteDauNoiNuocURL.toString()%>');

});

</aui:script>
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
	if(A.one('#<portlet:namespace /><%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>')) {
		url += '&<portlet:namespace /><%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>=' + A.one('#<portlet:namespace /><%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>').get('value');
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
	var capHuyenInput = A.one("#<portlet:namespace/><%=DauNoiNuocTerms.MA_HUYEN %>");

	capTinhInput.on('change', function(){
		var capTinhId = capTinhInput.val();
		var capHuyenId = capHuyenInput.val();
		selectTram(capTinhId);
		selectHuyen(capTinhId, capHuyenId);
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
		var capTinhInput = A.one("#<portlet:namespace/><%=DauNoiNuocTerms.MA_TINH %>");
		var capHuyenInput = A.one("#<portlet:namespace/><%=DauNoiNuocTerms.MA_HUYEN %>");

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