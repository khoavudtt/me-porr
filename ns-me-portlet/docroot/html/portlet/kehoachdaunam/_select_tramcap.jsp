<%@page import="vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@ include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "capTinhId");
	String maTram = ParamUtil.getString(request, "capTramId");
	
	List<TramCapNuoc> lsTramCapNuoc = TramCapBusiness.getByTinh(maTinh);
%>

<aui:select 
	name="maTram" 
	id="maTram" 
	label="ma-tram"
	showEmptyOption="<%= false %>"
	required="true"
>
	<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
	<%
		for (TramCapNuoc tramCap : lsTramCapNuoc) {
	%>
		<aui:option value="<%= tramCap.getId() %>"><%= tramCap.getTenTram() %></aui:option>
	<%
		}
	%>
</aui:select>