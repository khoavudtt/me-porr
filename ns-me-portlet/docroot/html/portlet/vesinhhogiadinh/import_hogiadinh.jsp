<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhGiaDinhTerms"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.util.MessageSuccess"%>
<%@page import="vn.dtt.sol.ns.util.MessageErrors"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocDisplayTerms"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocSearchTerms"%>
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
	int errorType = ParamUtil.getInteger(request, "importError");
	 String maTinh = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_TINH);
	String maHuyen = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_HUYEN);
	String maXa = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_XA);
	String loaiNhaTieu = (String)request.getAttribute(VeSinhGiaDinhTerms.LOAI_NHA_TIEU);
	String trangThai = (String)request.getAttribute(VeSinhGiaDinhTerms.TRANG_THAI);
	String namBaoCao = (String)request.getAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO);
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
	List<DATAITEM> listHuyen = (List<DATAITEM>)request.getAttribute("listHuyen"); 
	List<DATAITEM> listXa = (List<DATAITEM>)request.getAttribute("listXa");
	VeSinhGiaDinh veSinhGiaDinh = (VeSinhGiaDinh)request.getAttribute("veSinhGiaDinh");
	String requiredLabel="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
 	
	 String importName = Validator.isNotNull(portletSession.getAttribute("importName"))?(String) portletSession.getAttribute("importName"):"";
%>
<liferay-portlet:renderURL varImpl="redirectDauNoiURL">
	<liferay-portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/view.jsp"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.LOAI_NHA_TIEU %>" value="<%=loaiNhaTieu %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=VeSinhGiaDinhTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<liferay-ui:header
	backURL="<%= redirectDauNoiURL.toString() %>"
	title='<%= "import-dau-noi-nuoc" %>'
/>
<liferay-ui:success key="<%= MessageSuccess.IMPORT_HO_GIA_DINH_MESSAGE  %>" message="<%=  MessageSuccess.IMPORT_HO_GIA_DINH_MESSAGE  %>" />
<liferay-ui:error key="<%= MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE %>" message="<%=  MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE  %>" />
<c:if test="<%=errorType>0 %>">
		<aui:row cssClass="importError">		
		<c:if test="<%=errorType==6 %>">
			Lỗi file excel đã được sử dụng, kiểm tra lại file.
		</c:if>
		<c:if test="<%=errorType==5 %>">
			Lỗi file excel (password protected,định dạng,...)
		</c:if>
		<c:if test="<%=errorType==4 %>">
			Tên Đơn vị trạm cấp nước không hợp lệ: <%=importName %>
		</c:if>
		<c:if test="<%=errorType==3 %>">
			Tên Đơn vị phường xã không hợp lệ: <%=importName %>
		</c:if>
		<c:if test="<%=errorType==2 %>">
			Tên Đơn vị quận huyện không hợp lệ: <%=importName %>
		</c:if>
		<c:if test="<%=errorType==1 %>">
			Tên Đơn vị tỉnh thành không hợp lệ: <%=importName %>
		</c:if>
		</aui:row>
</c:if>
<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/import_hogiadinh.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/vesinhhogiadinh/import_hogiadinh.jsp"/>
</portlet:renderURL>
<portlet:actionURL name="verifiedDocumentData" var="verifiedDocumentDataURL"/>
<aui:model-context bean="<%= Validator.isNotNull(veSinhGiaDinh)?veSinhGiaDinh.toEscapedModel():veSinhGiaDinh %>" model="<%= VeSinhGiaDinh.class %>" />
<aui:form  enctype="multipart/form-data"  action="<%= verifiedDocumentDataURL %>" method="post" name="fm" >
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(veSinhGiaDinh) ? Constants.UPDATE : Constants.ADD %>"/>
	<aui:input name="redirect" type="hidden" value="<%= StringPool.BLANK %>" />
	<aui:input name="currentURL" type="hidden" value="<%= currentURL %>" />
	<aui:input name="onpageError" type="hidden" value="<%= onpageError%>" />
	<aui:input name="onpageSuccess" type="hidden" value="<%= onpageSuccess %>" />
	<aui:input name="id" type="hidden" value="<%= Validator.isNotNull(veSinhGiaDinh) ? String.valueOf(veSinhGiaDinh.getId()) : StringPool.BLANK %>" />
	
	<aui:field-wrapper>
		<aui:row>
			<aui:col width="30">
				<aui:select required="true" showRequiredLabel="<%=false %>" name="<%=VeSinhGiaDinhTerms.MA_TINH %>" id="<%=VeSinhGiaDinhTerms.MA_TINH %>" label="<%= LanguageUtil.get(pageContext, \"tinh-thanh-pho\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
					<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
					<%
						for (DATAITEM tinh : listTinh) {
					%>
						<aui:option value="<%= tinh.getNode1() %>"><%= tinh.getName() %></aui:option>
					<%
						}
					%>
				</aui:select>
				
				<aui:select required="true" name="<%=VeSinhGiaDinhTerms.TYPE_IMPORT %>" label="<%= LanguageUtil.get(pageContext, \"loai-import-ho-gia-dinh\") +\" \"+requiredLabel + dotLabel %>" showEmptyOption="<%= false %>" >
						<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
						<aui:option value="1"><liferay-ui:message key="type-import-1"></liferay-ui:message></aui:option>
						<aui:option value="2"><liferay-ui:message key="type-import-2"></liferay-ui:message></aui:option>
				</aui:select>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"file-import-ho-gia-dinh\") +\" \"+requiredLabel + dotLabel %>" >
				<aui:input type="file" required="true" name="<%=VeSinhGiaDinhTerms.FILE %>" label=""></aui:input>
				</aui:field-wrapper>
			</aui:col>
			
		</aui:row>

		<aui:row>	
			<aui:col width="100">
			
				<aui:button-row>
					<aui:button type="submit" value="im-port-du-lieu"/>
				</aui:button-row>
				
			</aui:col>
		</aui:row>
		
	</aui:field-wrapper>
	
</aui:form>
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
.importError{
	background-color: #fee5e2 !important;
	color: #b50303 !important;
	padding: 8px 0px 8px 14px !important;
	margin-bottom: 20px !important;
	text-shadow: 0 1px 0 rgba(255,255,255,0.5) !important;
	border: 1px solid #fcaca5 !important;
	border-radius: 2px !important;
	width: 98.5% !important;
}
</style>