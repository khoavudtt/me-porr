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

<%
	BaoCaoDLIBusiness.initBaoCaoDLI();
%>

<liferay-ui:success key="success-chot-bao-cao-thanh-cong" message="success-chot-bao-cao-thanh-cong"/>
<liferay-ui:success key="success-xoa-bao-cao-thanh-cong" message="success-xoa-bao-cao-thanh-cong"/>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath" value='<%= templatePath + "view.jsp" %>' />
</liferay-portlet:renderURL>

<aui:form action="<%= searchURL %>" method="get" name="fm">
	<liferay-portlet:renderURLParams varImpl="searchURL" />
		
	<aui:fieldset>
		<liferay-ui:search-container delta="20" emptyResultsMessage="no-result-were-found" 
			searchContainer="<%= new BaoCaoDLISearch(renderRequest, currentURLObj) %>">
			
			<liferay-ui:search-form
				page='<%= templatePath + "baocaodli_search.jsp" %>'
				servletContext="<%= application %>"
			/>
		
			<%
			BaoCaoDLIDisplayTerms searchTerms = (BaoCaoDLIDisplayTerms)searchContainer.getSearchTerms();
			%>
			
			<liferay-ui:search-container-results
				results="<%= BaoCaoDLIBusiness.search(searchTerms.getMaTinh(), typeDLI, searchTerms.getNam(), searchTerms.getTrangThai(), searchContainer.getStart(), searchContainer.getEnd(), searchContainer.getOrderByComparator()) %>"
				total="<%= BaoCaoDLIBusiness.searchCount(searchTerms.getMaTinh(), typeDLI, searchTerms.getNam(), searchTerms.getTrangThai()) %>"
			/>

			<liferay-ui:search-container-row
	 			className="vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI"
				keyProperty="id"
				modelVar="baoCaoDLI"
			>
				<portlet:renderURL var="rowURL">
					<portlet:param name="mvcPath" value='<%= templatePath + "edit_baocaodli.jsp" %>' />
					<portlet:param name="baoCaoDLIId" value="<%=String.valueOf(baoCaoDLI.getId()) %>"/>
					<portlet:param name="redirect" value="<%= currentURL %>"/>
				</portlet:renderURL>
				
				<liferay-ui:search-container-column-text
					buffer="buffer"
					name="tinh-thanh-pho"
					href="<%=rowURL %>"
				>
					<%
					String tenTinh = NuocSachUtils.getNameTinh(baoCaoDLI.getMaTinh());
					
					buffer.append(HtmlUtil.escape(tenTinh));
					%>
				</liferay-ui:search-container-column-text>
				
				<liferay-ui:search-container-column-text
					buffer="buffer"
					name="nam-bao-cao"
				>
					<%
						buffer.append("<div class=\"text-center\">");
						buffer.append("<a href=\"" + rowURL +  "\">");
						buffer.append(baoCaoDLI.getNam());
						buffer.append("</a>");
						buffer.append("</div>");
					%>
				</liferay-ui:search-container-column-text>

				<liferay-ui:search-container-column-text
					href="<%=rowURL %>"
					name="trang-thai"
				>
					<c:choose>
						<c:when test="<%= baoCaoDLI.getTrangThai() == BaoCaoDLIConstants.TRANG_THAI_DANG_LAP %>">
							<liferay-ui:message key="dang-lap"/>
						</c:when>
						
						<c:when test="<%= baoCaoDLI.getTrangThai() == BaoCaoDLIConstants.TRANG_THAI_DA_CHOT %>">
							<liferay-ui:message key="da-luu-tru"/>
						</c:when>
					</c:choose>
				</liferay-ui:search-container-column-text>
				
				<liferay-ui:search-container-column-text
					buffer="buffer"
					name="ngay-bao-cao"
				>
					<%
						if(dateFormatDateTime.format(baoCaoDLI.getNgayBaoCao()) != null) {
							buffer.append("<div class=\"text-center\">");
							buffer.append("<a href=\"" + rowURL +  "\">");
							buffer.append(dateFormatDate.format(baoCaoDLI.getNgayBaoCao()));
							buffer.append("</a>");
							buffer.append("</div>");
						}
					%>
				</liferay-ui:search-container-column-text>
				
				<c:choose>
					<c:when test="<%= typeDLI == 1 %>">
						<liferay-ui:search-container-column-text
							href="<%=rowURL %>"
							name="tong-dau-noi"
						>
							<%= DauNoiNuocLocalServiceUtil.countDauNoiSearch(baoCaoDLI.getMaTinh(), StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, "2", Integer.toString(searchTerms.getNam()))%>
						</liferay-ui:search-container-column-text>
					</c:when>
					<c:when test="<%= typeDLI == 2 %>">
						<liferay-ui:search-container-column-text
							buffer="buffer"
							href="<%=rowURL %>"
							name="tong-nha-tieu-xay-moi"
						>
							<%= VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch(searchTerms.getMaTinh(), "", "", "", "2", Integer.toString(searchTerms.getNam()), "") %>
						</liferay-ui:search-container-column-text>
					</c:when>
					<c:when test="<%= typeDLI == 3 %>">
						<liferay-ui:search-container-column-text
							buffer="buffer"
							href="<%=rowURL %>"
							name="so-nguoi-huong-loi"
						>
							<%
							int tongDauNoi = DauNoiNuocLocalServiceUtil.countDauNoiSearch(baoCaoDLI.getMaTinh(), StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, "2", Integer.toString(searchTerms.getNam()));
							
							buffer.append(tongDauNoi);

							%>
						</liferay-ui:search-container-column-text>
					
					</c:when>
					<c:when test="<%= typeDLI == 4 %>">
						<liferay-ui:search-container-column-text
							buffer="buffer"
							href="<%=rowURL %>"
							name="so-nguoi-huong-loi"
						>
							<%
							int tongDauNoi = DauNoiNuocLocalServiceUtil.countDauNoiSearch(baoCaoDLI.getMaTinh(), StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, "2", Integer.toString(searchTerms.getNam()));
							
							buffer.append(tongDauNoi);

							%>
						</liferay-ui:search-container-column-text>
					
					</c:when>
				</c:choose>
				
				
				<%-- <liferay-ui:search-container-column-text
					name="action"
				>
					<%
					boolean deletePermission = baoCaoDLI.getTrangThai() == 1 
						|| BaoCaoDLIPermission.contains(permissionChecker, scopeGroupId, ActionKeys.DELETE);
					%>
					<c:if test="<%= deletePermission %>">
						<portlet:actionURL var="deleteURL" name="deleteBaoCaoDLI">
							<portlet:param name="baoCaoDLIId" value="<%= String.valueOf(baoCaoDLI.getId()) %>"/>
							<portlet:param name="redirect" value="<%= currentURL %>"/>
						</portlet:actionURL>
					
						<liferay-ui:icon-delete url="<%= deleteURL %>" />
					</c:if>
				</liferay-ui:search-container-column-text> --%>
			</liferay-ui:search-container-row>
	
			<liferay-ui:search-iterator />

		</liferay-ui:search-container>
	</aui:fieldset>
</aui:form>

<%!
	private static Log _log = LogFactoryUtil.getLog("html.portlet.baocaodli.view.jsp");
%>