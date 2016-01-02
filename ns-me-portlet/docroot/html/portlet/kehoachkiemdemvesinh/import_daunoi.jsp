<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocDisplayTerms"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocSearchTerms"%>
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
	String maTinh = ParamUtil.getString(request, DauNoiNuocTerms.MA_TINH);
	String maHuyen = ParamUtil.getString(request, DauNoiNuocTerms.MA_HUYEN);
	String maXa = ParamUtil.getString(request, DauNoiNuocTerms.MA_XA);
	String tramCapNuocId = ParamUtil.getString(request, DauNoiNuocTerms.TRAM_CAP_NUOC_ID);
	String trangThai = ParamUtil.getString(request, DauNoiNuocTerms.TRANG_THAI);
	String namBaoCao = ParamUtil.getString(request, DauNoiNuocTerms.NAM_BAO_CAO);
	int errorType = ParamUtil.getInteger(request, "importError");
	DauNoiNuoc dauNoiNuoc = null;
	long dauNoiId = ParamUtil.getLong(request, DauNoiNuocTerms.ID);
	if(dauNoiId>0){
		dauNoiNuoc = DauNoiNuocBusiness.getDauNoiNuocById(dauNoiId);
	}
	String orgCode = ParamUtil.getString(request, "orgcode");
	List<TramCapNuoc>  listTramCapNuoc = new ArrayList<TramCapNuoc>();
	 if(!orgCode.equals("0")){
		 listTramCapNuoc = TramCapBusiness.getByTinh(orgCode);
	 }else{
		 listTramCapNuoc = TramCapBusiness.findTramCap(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	 }
	 String requiredLabel="";
	 requiredLabel ="(*)";
	 String dotLabel=":";
	 
	 String importName = Validator.isNotNull(portletSession.getAttribute("importName"))?(String) portletSession.getAttribute("importName"):"";
%>
<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= "import-dau-noi-nuoc" %>'
/>
<liferay-portlet:renderURL varImpl="redirectDauNoiURL">
	<liferay-portlet:param name="mvcPath" value="/html/portlet/daunoinuoc/view.jsp"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_TINH %>" value="<%=maTinh %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_HUYEN %>" value="<%=maHuyen %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.MA_XA %>" value="<%=maXa %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>" value="<%=tramCapNuocId %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.TRANG_THAI %>" value="<%=trangThai %>"></liferay-portlet:param>
	<liferay-portlet:param name="<%=DauNoiNuocTerms.NAM_BAO_CAO %>" value="<%=namBaoCao %>"></liferay-portlet:param>
</liferay-portlet:renderURL>
<portlet:actionURL name="verifiedDocumentData" var="verifiedDocumentDataURL"/>
<aui:form  enctype="multipart/form-data"  action="<%= verifiedDocumentDataURL %>" method="post" name="fm" >
	<aui:model-context bean="<%= dauNoiNuoc %>" model="<%= DauNoiNuoc.class %>" />
	
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(dauNoiNuoc) ? Constants.UPDATE : Constants.ADD %>"/>
	<aui:input name="redirect" type="hidden" value="<%= StringPool.BLANK %>" />
	<aui:input name="currentURL" type="hidden" value="<%= currentURL %>" />
	<aui:input name="id" type="hidden" value="<%= Validator.isNotNull(dauNoiNuoc) ? String.valueOf(dauNoiNuoc.getId()) : StringPool.BLANK %>" />
	
	<aui:field-wrapper cssClass="form-add-tram-cap">
		<aui:row>
			<aui:col width="100">
				<aui:select name="<%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>" label="<%= LanguageUtil.get(pageContext, \"tram-cap-nuoc\") + dotLabel %>" showEmptyOption="<%= false %>" inlineLabel="true">
					<%
						for (TramCapNuoc tramCap : listTramCapNuoc) {
					%>
						<aui:option value="<%= tramCap.getId() %>"><%= tramCap.getTenTram() %></aui:option>
					<%
						}
					%>
				</aui:select>
				
				<aui:select name="<%=DauNoiNuocTerms.NAM_BAO_CAO %>" label="<%= LanguageUtil.get(pageContext, \"tinh-trang-bao-cao\") + dotLabel %>" showEmptyOption="<%= false %>" inlineLabel="true">
						<aui:option value="0"><liferay-ui:message key="nam-bao-cao-0"></liferay-ui:message></aui:option>
						<aui:option value="2012"><liferay-ui:message key="nam-bao-cao-2012"></liferay-ui:message></aui:option>
						<aui:option value="2013"><liferay-ui:message key="nam-bao-cao-2013"></liferay-ui:message></aui:option>
						<aui:option value="2014"><liferay-ui:message key="nam-bao-cao-2014"></liferay-ui:message></aui:option>
						<aui:option value="2015"><liferay-ui:message key="nam-bao-cao-2015"></liferay-ui:message></aui:option>
				</aui:select>
				<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"file-import-dau-noi\") + dotLabel %>"  inlineLabel="true">
				<aui:input type="file" required="true" name="<%=DauNoiNuocTerms.FILE %>" label=""></aui:input>
				</aui:field-wrapper>
			</aui:col>
			
		</aui:row>

		<aui:row cssClass="fm-button-left100">	
			<aui:col width="100">
			
				<aui:button-row>
					<aui:button type="submit" value="im-port-du-lieu"/>
					<aui:button href="<%= redirectDauNoiURL.toString() %>" name="bo-qua" type="cancel" />
				</aui:button-row>
				
			</aui:col>
		</aui:row>
		<c:if test="<%=errorType>0 %>">
		<aui:row>	
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
	</aui:field-wrapper>
	
</aui:form>
<style>
.fm-button-left100{
padding-left:200px !important;
}
.control-label{
width:200px !important;
}
</style>