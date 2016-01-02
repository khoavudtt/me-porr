<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhGiaDinhTerms"%>
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

<%
	String maTinh = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_TINH);
	String maHuyen = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_HUYEN);
	String maXa = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_XA);
	String loaiNhaTieu = (String)request.getAttribute(VeSinhGiaDinhTerms.LOAI_NHA_TIEU);
	String trangThai = (String)request.getAttribute(VeSinhGiaDinhTerms.TRANG_THAI);
	String namBaoCao = (String)request.getAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO);
	VeSinhGiaDinh veSinhGiaDinh = (VeSinhGiaDinh)request.getAttribute("veSinhGiaDinh");
	String requiredLabel="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
	
%>
<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= (veSinhGiaDinh == null) ? "danh-gia-lai-nha-vs-ho-gd" : "danh-gia-lai-nha-vs-ho-gd" %>'
/>
<portlet:actionURL name="addDanhGiaLaiHoGiaDinh" var="addDanhGiaLaiHoGiaDinhURL"/>
<aui:form action="<%= addDanhGiaLaiHoGiaDinhURL %>" method="post" name="fm">
	<aui:model-context bean="<%= Validator.isNotNull(veSinhGiaDinh)?veSinhGiaDinh.toEscapedModel():veSinhGiaDinh %>" model="<%= VeSinhGiaDinh.class %>" />
	
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(veSinhGiaDinh) ? Constants.UPDATE : Constants.ADD %>"/>
	<aui:input name="redirect" type="hidden" value="<%= StringPool.BLANK %>" />
	<aui:input name="currentURL" type="hidden" value="<%= redirect %>" />
	<aui:input name="<%=VeSinhGiaDinhTerms.ID %>" type="hidden" value="<%= Validator.isNotNull(veSinhGiaDinh) ? String.valueOf(veSinhGiaDinh.getId()) : StringPool.BLANK %>" />
	
	<aui:field-wrapper cssClass="form-add-tram-cap">
		<aui:row>
		<aui:col width="50">
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ngay-kiem-dem\") +\" \"+dotLabel %>" >
					<aui:input cssClass="input1001" name="<%=VeSinhGiaDinhTerms.NGAY_KIEM_DEM %>" label="" >
					</aui:input>
				</aui:field-wrapper>

				<aui:select cssClass="inputCbx1001" required="true" showRequiredLabel="<%=false %>" name="<%=VeSinhGiaDinhTerms.NHA_TIEU_HVS %>" label="<%= LanguageUtil.get(pageContext, \"nha-tieu-hop-vs\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false  %>">
						<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
						<aui:option value="1"><liferay-ui:message key="nha-tieu-hop-ve-sinh-1"></liferay-ui:message></aui:option>
						<aui:option value="2"><liferay-ui:message key="nha-tieu-hop-ve-sinh-2"></liferay-ui:message></aui:option>
				</aui:select>
				
			</aui:col>
			<aui:col width="50">
				<aui:select cssClass="input1001" required="true" showRequiredLabel="<%=false %>" name="<%=VeSinhGiaDinhTerms.TRANG_THAI %>" label="<%= LanguageUtil.get(pageContext, \"ket-qua-danh-gia\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false  %>">
						<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
						<aui:option value="2"><liferay-ui:message key="tinh-trang-ve-sinh-2"></liferay-ui:message></aui:option>
						<aui:option value="3"><liferay-ui:message key="tinh-trang-ve-sinh-3"></liferay-ui:message></aui:option>
				</aui:select>
			</aui:col>
		</aui:row>

		<aui:row>	
			<aui:col width="100">
				<aui:button-row>
					<aui:button type="submit" value="cap-nhat-danh-gia"/>
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
	max-width: 466px;
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
