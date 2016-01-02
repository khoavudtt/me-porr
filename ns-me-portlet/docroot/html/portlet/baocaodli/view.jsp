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

<%
	int userType = UserMappingBusiness.getUserType(user);
%>

<c:choose>
	<c:when test="<%= typeDLI == 6 %>">
		<liferay-util:include page="/html/portlet/baocaodli/view_dli_th.jsp" servletContext="<%= application %>" />
	</c:when>
	<c:otherwise>
		<c:choose>
			<c:when test="<%= userType == 1 %>">
				<liferay-util:include page="/html/portlet/baocaodli/view_dli_tu.jsp" servletContext="<%= application %>" />
			</c:when>
			
			<c:otherwise>
					<liferay-util:include page="/html/portlet/baocaodli/view_dli.jsp" servletContext="<%= application %>" />
			</c:otherwise>
		</c:choose>
	</c:otherwise>
</c:choose>
