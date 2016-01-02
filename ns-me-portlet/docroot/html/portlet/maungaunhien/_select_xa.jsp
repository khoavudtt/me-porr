<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@ include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "capTinhId");
	String maHuyen = ParamUtil.getString(request, "capHuyenId");
	String selMaXa = ParamUtil.getString(request, "maXa");
	
	List<DATAITEM> lsXa = DiaBanQuanLyUtils.getXa(user, maTinh, maHuyen, 0l, permissionChecker.isOmniadmin(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
%>

<aui:select name="maXa" id="maXa" label="ma-xa" onChange="javascript:selectInfo();" showEmptyOption="<%= true %>">
	<%
		for (DATAITEM xa : lsXa) {
	%>
		<aui:option selected="<%= selMaXa.contentEquals(xa.getNode3()) ? true : false %>" value="<%= xa.getNode3() %>"><%= xa.getName() %></aui:option>
	<%
		}
	%>
</aui:select>