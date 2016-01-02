<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.DanhGiaVeSinhXaTerm"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@ include file="/init.jsp" %>

<%
	int year = Calendar.getInstance().get(Calendar.YEAR);
	 String requiredLabel="";
	 requiredLabel ="(*)";
	 String dotLabel=":";
%>

<aui:select required="true" name="<%=DanhGiaVeSinhXaTerm.NAM %>"  id="<%=DanhGiaVeSinhXaTerm.NAM %>" label="<%= LanguageUtil.get(pageContext, \"nam-danh-gia\") +\" \"+requiredLabel+ dotLabel %>" onChange="<%= renderResponse.getNamespace() + \"themDanhGiaDefaultOnClick()\" %>" showEmptyOption="<%= false %>">
						<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
					<%for(int i=2013; i<= year; i++){ %>
						<aui:option value="<%=String.valueOf(i) %>"><liferay-ui:message key="<%=LanguageUtil.format(pageContext, \"nam-x-danh-gia\",String.valueOf(i)) %>"></liferay-ui:message></aui:option>
						<%} %>
		</aui:select>