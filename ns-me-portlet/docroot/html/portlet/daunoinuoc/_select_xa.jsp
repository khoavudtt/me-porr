<%@page import="vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@ include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "capTinhId");
	String maHuyen = ParamUtil.getString(request, "capHuyenId");
	
	List<DATAITEM> lsXa = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh, maHuyen);
	 String requiredLabel="";
	 requiredLabel ="(*)";
	 String dotLabel=":";
%>

<aui:select cssClass="input1001" required="true" showRequiredLabel="<%=false %>"  name="<%=DauNoiNuocTerms.MA_XA %>" id="<%=DauNoiNuocTerms.MA_XA %>" label="<%= LanguageUtil.get(pageContext, \"phuong-xa\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>">
	<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
	<%
		for (DATAITEM xa : lsXa) {
	%>
		<aui:option value="<%= xa.getNode3() %>"><%= xa.getName() %></aui:option>
	<%
		}
	%>
</aui:select>