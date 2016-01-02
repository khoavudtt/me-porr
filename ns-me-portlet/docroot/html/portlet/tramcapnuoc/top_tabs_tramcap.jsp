<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.util.ActionKeys"%>
<%@ include file="/init.jsp" %>

<%
	String mvcPath = ParamUtil.getString(request, "mvcPath");
	
	List<String> names = new ArrayList<String>();
	List<String> urls = new ArrayList<String>();
	String value = null;
	
	long tramCapId = ParamUtil.getLong(request, "tramCapId");
	
	TramCapNuoc tramCap = TramCapBusiness.getTramCap(tramCapId);
	
	if (PortletPermissionUtil.contains(permissionChecker, plid, portletDisplay.getId(), ActionKeys.VIEW)) {
		
		PortletURL portletURL = renderResponse.createRenderURL();

		portletURL.setParameter("mvcPath", templatePath + "view_detail.jsp");
		portletURL.setParameter("tramCapId", Long.toString(tramCapId));
		
		names.add("chi-tiet-tram-cap");
		urls.add(portletURL.toString());
		value = names.get(names.size() - 1);
	}
	
	if (PortletPermissionUtil.contains(permissionChecker, plid, portletDisplay.getId(), ActionKeys.VIEW)) {
		
		PortletURL portletURL = renderResponse.createRenderURL();
		
		portletURL.setParameter("mvcPath", templatePath + "view_vanhanh_tramcap.jsp");
		portletURL.setParameter("tramCapId", Long.toString(tramCapId));
		names.add("thong-tin-van-hanh");
		urls.add(portletURL.toString());
		value = mvcPath.contains("vanhanh_tramcap") ? names.get(names.size() - 1) : value;
	}

%>

<c:if test="<%= Validator.isNotNull(tramCap) %>">
	
	<liferay-ui:tabs
		names="<%= StringUtil.merge(names) %>"
		param="topTabs"
		url0="<%= (urls.size() > 0) ? urls.get(0) : null %>"
		url1="<%= (urls.size() > 1) ? urls.get(1) : null %>"
		value="<%= value %>"
	/>
</c:if>