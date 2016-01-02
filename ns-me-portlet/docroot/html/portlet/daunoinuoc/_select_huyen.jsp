<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@ include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "capTinhId");
	String maHuyen = ParamUtil.getString(request, "capHuyenId");
	List<DATAITEM> lsHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh);
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	String requiredLabel="";
	 requiredLabel ="(*)";
	 String dotLabel=":";
%>
<aui:select cssClass="input1001" required="true" showRequiredLabel="<%=false %>"  name="<%=DauNoiNuocTerms.MA_HUYEN %>" id="<%=DauNoiNuocTerms.MA_HUYEN %>" onChange="javascript:selectXa();" label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
	<c:if test="<%=userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU 
										|| userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TINH %>">
	<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
	</c:if>
	<%
		for (DATAITEM huyen : lsHuyen) {
	%>
		<aui:option value="<%= huyen.getNode2() %>"><%= huyen.getName() %></aui:option>
	<%
		}
	%>
</aui:select>




