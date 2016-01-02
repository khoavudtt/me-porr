<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@ include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "capTinhId");
	String maHuyen = ParamUtil.getString(request, "capHuyenId");
	String maXa = ParamUtil.getString(request, "capXaId");
	
	List<DATAITEM> lsXa = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh, maHuyen);
%>

<aui:select 
	name="maXa" 
	label="xa-label" 
	id="maXa" 
	showEmptyOption="<%= false %>" 
>
	<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
	<%
		for (DATAITEM xa : lsXa) {
	%>
		<aui:option value="<%= xa.getNode3() %>"><%= xa.getName() %></aui:option>
	<%
		}
	%>
</aui:select>




