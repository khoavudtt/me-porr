<%@page import="vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalServiceUtil"%>
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

<script type="text/javascript" src='http://maps.google.com/maps/api/js?sensor=false&libraries=places'></script>

<%@include file="/init.jsp" %>
<liferay-util:include page='<%= templatePath + "top_tabs_tramcap.jsp" %>' servletContext="<%= application %>" />

<%
	long tramCapId = ParamUtil.getLong(request, "tramCapId");
	
	TramCapNuoc tramCap = null;
	
	if (tramCapId > 0) {
		tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(tramCapId);
	}
%>

<c:choose>
	<c:when test="<%= Validator.isNotNull(tramCap) %>">
		<div class="tramcap-header">
			<%= tramCap.getTenTram() %>
		</div>
		
	</c:when>
	<c:otherwise>
		<liferay-ui:message key="thong-tin-tram-cap-khong-ton-tai"/>
	</c:otherwise>
</c:choose>
