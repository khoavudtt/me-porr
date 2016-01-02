<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil"%>
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

<%@include file="init.jsp" %>

<portlet:renderURL var="rowURL">
	<portlet:param name="mvcPath" value='<%= templatePath + "edit_baocaodli_tu.jsp" %>' />
	<portlet:param name="redirect" value="<%= currentURL %>"/>
	<portlet:param name="isTrungUong" value="true"/>
</portlet:renderURL>

<ul>
  <li> <a href="<%= rowURL %>">2015</a> </li>
</ul>


<%!
	private static Log _log = LogFactoryUtil.getLog("html.portlet.baocaodli.view.jsp");
%>