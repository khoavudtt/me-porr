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

<%@ include file="init.jsp" %>

<%
BaoCaoDLISearch searchContainer = (BaoCaoDLISearch)request.getAttribute("liferay-ui:search:searchContainer");

BaoCaoDLIDisplayTerms displayTerms = (BaoCaoDLIDisplayTerms)searchContainer.getDisplayTerms();

List<DATAITEM> listTinh = DataItemBusiness.getInLevel1(1);

renderRequest.setAttribute("selectedNamBaoCao", displayTerms.getNam());
List<Integer> namBaoCaos = BaoCaoDLIUtil.getNamBaoCaos();
renderRequest.setAttribute("namBaoCaos", namBaoCaos);

int userType = UserMappingBusiness.getUserType(user);

boolean userTrungUong = userType == 1 ? true : false;

%>

<c:if test="<%= userTrungUong %>">
	<aui:fieldset>
		<aui:select name="<%= displayTerms.NAM %>" label="nam-bao-cao" onChange='<%= renderResponse.getNamespace() + "search();" %>'>
			<aui:option value="-1"><liferay-ui:message key="-all-" /></aui:option>
			
			<c:forEach items="${namBaoCaos}" var="namBaoCao">
				<aui:option value="${namBaoCao}" label="${namBaoCao}" selected="${selectedNamBaoCao == namBaoCao}"/>
			</c:forEach>
		</aui:select>
	</aui:fieldset>
</c:if>

<aui:script>
	function <portlet:namespace/>search() {
		submitForm(document.<portlet:namespace/>fm);
	}
</aui:script>