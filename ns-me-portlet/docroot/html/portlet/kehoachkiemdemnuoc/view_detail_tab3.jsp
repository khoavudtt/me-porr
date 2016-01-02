

<%@page import="vn.dtt.sol.ns.kehoachkiemdemnuoc.terms.KeHoachKiemDemNuocTerms"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC"%>
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
	THONGTINKIEMDEMNUOC thongTin = null;
	long idThongTin = ParamUtil.getLong(request, "idThongTin");
	if(idThongTin>0){
		thongTin = THONGTINKIEMDEMNUOCLocalServiceUtil.fetchTHONGTINKIEMDEMNUOC(idThongTin);
	}
%>
<liferay-portlet:renderURL var="viewEntryURL">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachkiemdemnuoc/view_detail_tab1.jsp" />
	<liferay-portlet:param name="<%=WebKeys.REDIRECT %>" value="<%=currentURL %>"></liferay-portlet:param>
	<portlet:param name="<%=KeHoachKiemDemNuocTerms.ID%>" value="<%= String.valueOf(thongTin.getKeHoachKiemDemNuocId()) %>" />
</liferay-portlet:renderURL>
<liferay-ui:header backURL="<%= viewEntryURL.toString() %>" title='<%="thong-tin-dau-noi" %>' />
<liferay-util:include page='<%= "/html/portlet/kehoachkiemdemnuoc/top_tabs_detail_thong_tin.jsp" %>'
	servletContext="<%= application %>" />
<c:choose>
	<c:when test="<%= Validator.isNotNull(thongTin) %>">
	<aui:field-wrapper name=" " label=" " inlineLabel="true">
				<div id="locationpicker">
						<div id="us2" style="width: 100%; height: 350px;"></div>
						<script>$('#us2').locationpicker({
								location: {latitude: '<%= Validator.isNotNull(thongTin)?thongTin.getViDo():0 %>', longitude: '<%= Validator.isNotNull(thongTin)?thongTin.getKinhDo():0 %>'},	
								radius: 300
							});
						</script>
						</div>
				</aui:field-wrapper>
	</c:when>	
	
	<c:otherwise>
		<liferay-ui:message key="thong-tin-ke-hoach-khong-ton-tai"/>
	</c:otherwise>

</c:choose>
