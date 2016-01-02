<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.KeHoachKiemDemVeSinhTerms"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@ include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "capTinhId");
	String maHuyen = ParamUtil.getString(request, "capHuyenId");
	List<DATAITEM> lsHuyen = DiaBanQuanLyUtils.getHuyen(user, maTinh, 0, permissionChecker.isOmniadmin(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
// 	List<DATAITEM> lsHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh);
	 String requiredLabel="";
	 requiredLabel ="(*)";
	 String dotLabel=":";
	 
%>
<aui:select showRequiredLabel="<%=false %>"  name="<%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>" id="<%=KeHoachKiemDemVeSinhTerms.MA_HUYEN %>" onChange="javascript:selectXa();" label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") +\"\"+dotLabel %>" showEmptyOption="<%= false %>" >
	<aui:option value=""><liferay-ui:message key="-chon-tat-ca-"></liferay-ui:message></aui:option>
	<%
		for (DATAITEM huyen : lsHuyen) {
	%>
		<aui:option value="<%= huyen.getNode2() %>"><%= huyen.getName() %></aui:option>
	<%
		}
	%>
</aui:select>




