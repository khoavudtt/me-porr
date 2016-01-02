<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@ include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "capTinhId");
	List<TramCapNuoc>  listTramCapNuoc = new ArrayList<TramCapNuoc>();
	listTramCapNuoc = TramCapBusiness.findTramCap(maTinh,QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	String requiredLabel="";
	requiredLabel ="(*)";
	String dotLabel=":";
%>
<aui:select cssClass="input1001" required="true" name="<%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>" id="<%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>" label="<%= LanguageUtil.get(pageContext, \"tram-cap-nuoc\") +\" \"+requiredLabel+ dotLabel %>" showEmptyOption="<%= false %>">
	<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
	<%
		for (TramCapNuoc tramCapNuoc : listTramCapNuoc) {
	%>
	<aui:option value="<%= tramCapNuoc.getId() %>"><%= tramCapNuoc.getTenTram() %></aui:option>
	<%
		}
	%>
</aui:select>




