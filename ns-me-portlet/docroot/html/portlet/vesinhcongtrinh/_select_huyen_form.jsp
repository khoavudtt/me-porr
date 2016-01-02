<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhGiaDinhTerms"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@ include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "capTinhId");
	String maHuyen = ParamUtil.getString(request, "capHuyenId");
	List<DATAITEM> lsHuyen = DiaBanQuanLyUtils.getHuyen(user, maTinh, 0l, permissionChecker.isOmniadmin(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	String requiredLabel="";
	requiredLabel ="(*)";
	String dotLabel=":";
%>
<aui:select cssClass="input1001" required="true" showRequiredLabel="<%=false %>"  name="<%=VeSinhGiaDinhTerms.MA_HUYEN %>" id="<%=VeSinhGiaDinhTerms.MA_HUYEN %>" onChange="javascript:selectXa();" label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
	<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
	<%
		for (DATAITEM huyen : lsHuyen) {
	%>
		<aui:option value="<%= huyen.getNode2() %>"><%= huyen.getName() %></aui:option>
	<%
		}
	%>
</aui:select>




