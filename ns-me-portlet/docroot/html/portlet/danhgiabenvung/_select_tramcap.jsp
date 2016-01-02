<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
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
	
	String maTinh = ParamUtil.getString(request, "maTinh");
		 
	long selTramCap = ParamUtil.getLong(request, "selTramCap");
	
	List<TramCapNuoc> lsTramCap = DiaBanQuanLyUtils.getTramCap(user, maTinh, renderRequest.isUserInRole("Administrator"), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

%>

<aui:select name="tramCap" inlineField="<%= true %>">		
	<%
		for (TramCapNuoc tramCap : lsTramCap) {
	%>
		<aui:option selected="<%= selTramCap == tramCap.getId() ? true : false %>" value="<%= tramCap.getId() %>"><%= tramCap.getTenTram() %></aui:option>
	<%
		}
	%>
</aui:select>

