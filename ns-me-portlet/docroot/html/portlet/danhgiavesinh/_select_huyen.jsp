<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.DanhGiaVeSinhXaTerm"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@ include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "capTinhId");
	String maHuyen = ParamUtil.getString(request, "capHuyenId");
	List<DATAITEM> lsHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh);
	 String requiredLabel="";
	 requiredLabel ="(*)";
	 String dotLabel=":";
%>
<aui:select cssClass="input1001" required="true" showRequiredLabel="<%=false %>"  name="<%=DanhGiaVeSinhXaTerm.MA_HUYEN %>" id="<%=DanhGiaVeSinhXaTerm.MA_HUYEN %>" onChange="javascript:selectXa();" label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
	<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
	<%
		for (DATAITEM huyen : lsHuyen) {
	%>
		<aui:option value="<%= huyen.getNode2() %>"><%= huyen.getName() %></aui:option>
	<%
		}
	%>
</aui:select>




