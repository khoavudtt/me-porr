<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.DanhGiaVeSinhXaTerm"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.DanhGiaVeSinhXaTerm"%>
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
	String maTinh = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_TINH);
	String maHuyen = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_HUYEN);
	String maXa = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_XA);
	String namBaoCao = (String)request.getAttribute(DanhGiaVeSinhXaTerm.NAM);
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
	List<DATAITEM> listHuyen = (List<DATAITEM>)request.getAttribute("listHuyen"); 
	List<DATAITEM> listXa = (List<DATAITEM>)request.getAttribute("listXa");
	DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = (DanhGiaVeSinhXaNew)request.getAttribute("danhGiaVeSinhXaNew");
	String requiredLabel="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
	int year = Calendar.getInstance().get(Calendar.YEAR);
%>
<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= Validator.isNotNull(danhGiaVeSinhXaNew)?LanguageUtil.format(pageContext, "x-xa-dang-ky-ve-sinh", NuocSachUtils.getNameXa(danhGiaVeSinhXaNew.getMaXa())):"" %>'
/>

<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/edit_danhgiavesinh.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/edit_danhgiavesinh.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="editDanhGiaVesinhDetail" var="editDanhGiaVesinhDetailURL"/>
<aui:model-context bean="<%= Validator.isNotNull(danhGiaVeSinhXaNew)?danhGiaVeSinhXaNew.toEscapedModel():danhGiaVeSinhXaNew %>" model="<%= DanhGiaVeSinhXaNew.class %>" />
<aui:form action="<%= editDanhGiaVesinhDetailURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(danhGiaVeSinhXaNew) ? Constants.UPDATE : Constants.ADD %>"/>
	<aui:input name="onpageError" type="hidden" value="<%= onpageError%>" />
	<aui:input name="onpageSuccess" type="hidden" value="<%= onpageSuccess %>" />
	<aui:input name="<%=DanhGiaVeSinhXaTerm.ID %>" type="hidden" value="<%= Validator.isNotNull(danhGiaVeSinhXaNew) ? String.valueOf(danhGiaVeSinhXaNew.getId()) : StringPool.BLANK %>" />
	<aui:input name="<%=DanhGiaVeSinhXaTerm.MA_TINH %>" type="hidden" value="<%= maTinh %>" />
	<aui:input name="<%=DanhGiaVeSinhXaTerm.MA_HUYEN %>" type="hidden" value="<%= maHuyen %>" />
	<aui:input name="<%=DanhGiaVeSinhXaTerm.NAM %>" type="hidden" value="<%= namBaoCao %>" />
	<aui:field-wrapper>
	<aui:row>
		<aui:col width="50">
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-nha-tieu-xay-moi\") +dotLabel %>" >
			<aui:input name="<%=DanhGiaVeSinhXaTerm.SO_HGD_CO_NHA_TIEU %>" label="" ></aui:input>
		</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
		
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