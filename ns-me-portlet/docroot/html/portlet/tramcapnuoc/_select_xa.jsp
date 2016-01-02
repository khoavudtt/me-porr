<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@ include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "capTinhId");
	String maHuyen = ParamUtil.getString(request, "capHuyenId");
	String initXa = ParamUtil.getString(request, "initXa");
	String initTinh = ParamUtil.getString(request, "initTinh");
	String initHuyen = ParamUtil.getString(request, "initHuyen");
	
	List<DATAITEM> lsXaInit = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, initTinh, initHuyen);
	
	List<DATAITEM> lsXa = new ArrayList<DATAITEM>();
	
	if (lsXaInit.size() == 0) {
		lsXa = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh, maHuyen);
	} else {
		lsXa = lsXaInit;
	}
%>

<aui:select name="maXa" id="maXa" label="xa" showEmptyOption="<%= true %>">
	<%
		for (DATAITEM xa : lsXa) {
	%>
		<aui:option selected="<%= initXa.contentEquals(xa.getNode3()) ? true : false %>" value="<%= xa.getNode3() %>"><%= xa.getName() %></aui:option>
	<%
		}
	%>
</aui:select>