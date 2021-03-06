<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@include file="../init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "maTinh");
	String maHuyen = ParamUtil.getString(request, "maHuyen");
	long userIdSel = ParamUtil.getLong(request, "userIdSel");

	List<DATAITEM> lsXa = DiaBanQuanLyUtils.findHuyenDuocChonByUser(maTinh, maHuyen, userIdSel, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
%>

<c:choose>
	<c:when test="<%= lsXa.size() != 0 %>">
		<%
			for (DATAITEM xa : lsXa) {
		%>
		
			<div class="sel-xa">
				<aui:input type="checkbox" value="<%= xa.getNode3() %>" label="<%= xa.getName() %>" name='<%= maHuyen + "_selXa" %>'/>
			</div>
		
		<%
			}
		%>	
	</c:when>
	<c:otherwise>
		<liferay-ui:message key="toan-bo-xa-da-duoc-chon"/>
	</c:otherwise>
</c:choose>



