<%--
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
--%>

<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.Map"%>
<%@page import="com.liferay.portal.security.membershippolicy.RoleMembershipPolicyUtil"%>
<%@page import="com.liferay.portlet.usersadmin.util.UsersAdminUtil"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="vn.dtt.sol.ns.search.RoleSearch"%>
<%@ include file="/init.jsp" %>

<%
String p_u_i_d = ParamUtil.getString(request, "p_u_i_d");
String eventName = ParamUtil.getString(request, "eventName", liferayPortletResponse.getNamespace() + "selectRegularRole");

User selUser = PortalUtil.getSelectedUser(request);

PortletURL portletURL = renderResponse.createRenderURL();

portletURL.setParameter("struts_action", "/roles_admin/select_regular_role");

if (selUser != null) {
	portletURL.setParameter("p_u_i_d", String.valueOf(selUser.getUserId()));
}

portletURL.setParameter("eventName", eventName);
%>

<aui:form action="<%= portletURL.toString() %>" method="post" name="selectRegularRoleFm">
	<liferay-ui:header
		title="roles"
	/>

	<liferay-ui:search-container
		headerNames="name"
		searchContainer="<%= new RoleSearch(renderRequest, portletURL) %>"
	>

		<liferay-ui:search-container-results>

			<%
			
				List<Role> roles = RoleLocalServiceUtil.search(company.getCompanyId(), null, new Integer[] {RoleConstants.TYPE_REGULAR}, QueryUtil.ALL_POS, QueryUtil.ALL_POS, searchContainer.getOrderByComparator());

				roles = UsersAdminUtil.filterRoles(permissionChecker, roles);
				
				List<Role> rolesTemp = new ArrayList<Role>();
				
				if (!permissionChecker.isOmniadmin() && roles.size() != 0) {
					for (Role role : roles) {
						if (role.getTitle().trim().length() != 0)
							rolesTemp.add(role);
					}
					
					roles = rolesTemp;
				}

				total = roles.size();

				searchContainer.setTotal(total);

				results = ListUtil.subList(roles, searchContainer.getStart(), searchContainer.getEnd());
	
				searchContainer.setResults(results);
			
			%>

		</liferay-ui:search-container-results>

		<liferay-ui:search-container-row
			className="com.liferay.portal.model.Role"
			keyProperty="roleId"
			modelVar="role"
		>

			<liferay-ui:search-container-column-text
				name="title"
				value="<%= HtmlUtil.escape(role.getTitle(locale)) %>"
			/>

			<liferay-ui:search-container-column-text>
				<c:if test="<%= Validator.isNull(p_u_i_d)|| RoleMembershipPolicyUtil.isRoleAllowed((selUser != null) ? selUser.getUserId() : 0, role.getRoleId()) %>">

					<%
					Map<String, Object> data = new HashMap<String, Object>();

					data.put("roleid", role.getRoleId());
					data.put("roletitle", HtmlUtil.escapeAttribute(role.getTitle(locale)));
					data.put("searchcontainername", "roles");
					%>

					<aui:button cssClass="selector-button" data="<%= data %>" value="choose" />
				</c:if>
			</liferay-ui:search-container-column-text>
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>

<aui:script use="aui-base">
	var Util = Liferay.Util;

	A.one('#<portlet:namespace />selectRegularRoleFm').delegate(
		'click',
		function(event) {
			var result = Util.getAttributes(event.currentTarget, 'data-');

			Util.getOpener().Liferay.fire('<%= HtmlUtil.escapeJS(eventName) %>', result);

			Util.getWindow().hide();
		},
		'.selector-button'
	);
</aui:script>