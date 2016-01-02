<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "maTinh");
%>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/render_huyen.jsp"/>
</liferay-portlet:renderURL>

<aui:form action="<%= searchURL %>" method="get" name="fm2">
	
	<liferay-portlet:renderURLParams varImpl="searchURL" />
		
	<aui:fieldset>
		
		<liferay-ui:search-container rowChecker="<%= new RowChecker(renderResponse) %>" delta="<%= 100 %>" emptyResultsMessage="no-result-were-found" iteratorURL="<%= searchURL %>">
			
			<liferay-ui:search-container-results results="<%= DataItemBusiness.getInLevel2(1, maTinh, searchContainer.getStart(), searchContainer.getEnd()) %>"
								 total="<%= DataItemBusiness.countInLevel2(1, maTinh) %>">

			</liferay-ui:search-container-results>

			<liferay-ui:search-container-row
	 			className="vn.dtt.cmon.dm.dao.model.DATAITEM"
				keyProperty="node2"
				modelVar="huyen"
			>
			
				<liferay-ui:search-container-column-text
					name="ten-huyen"
					align="left"
					cssClass="col-small"
					property="name"
				/>
				
			</liferay-ui:search-container-row>
	
			<liferay-ui:search-iterator paginate="simple" />

		</liferay-ui:search-container>
	</aui:fieldset>
</aui:form>
