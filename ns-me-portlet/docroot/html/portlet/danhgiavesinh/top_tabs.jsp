
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms"%>
<%
	/**
	 * Copyright (c) 2014 DTT Technology, JSC. All rights reserved.
	 *
	 * This library is free software; you can redistribute it and/or modify it under
	 * the terms of the GNU Lesser General Public License as published by the Free
	 * Software Foundation; either version 2.1 of the License, or (at your option)
	 * any later version.
	 *
	 * This library is distributed in the hope that it will be useful, but WITHOUT
	 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
	 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
	 * details.
	 */
%>

<%@ include file="/init.jsp"%>

<%
	DauNoiNuoc dauNoiNuoc = (DauNoiNuoc)request.getAttribute("dauNoiNuoc");
	String tabs = ParamUtil.getString(request, "tabs");
	String cur = Validator.isNotNull(ParamUtil.getString(request, "cur"))?ParamUtil.getString(request, "cur"):"1";
	String cur2 = Validator.isNotNull(ParamUtil.getString(request, "cur2"))?ParamUtil.getString(request, "cur2"):"1";
	if(!cur2.equals(cur)){
		cur2 = cur;
	}
	List<String> names = new ArrayList<String>();
	List<String> urls = new ArrayList<String>();
	String value = null;

		
		PortletURL portletURL = renderResponse.createRenderURL();
		portletURL.setParameter("mvcPath",
				"/html/portlet/daunoinuoc/view_detail.jsp");
		portletURL.setParameter("tabs",
				"dau_noi");
		portletURL.setParameter(DauNoiNuocTerms.ID,
				String.valueOf(dauNoiNuoc.getId()));
		
		portletURL.setParameter("cur2",
				cur2);
		portletURL.setParameter("cur",
				cur2);
		names.add("dau_noi");
		urls.add(portletURL.toString());
		value = names.get(0);
		
		portletURL.setParameter("mvcPath",
				"/html/portlet/daunoinuoc/view_thong_tin_kiem_dem.jsp");
		portletURL.setParameter("tabs",
				"kiem_dem");
		portletURL.setParameter(DauNoiNuocTerms.ID,
				String.valueOf(dauNoiNuoc.getId()));
		
		portletURL.setParameter("cur2",
				cur2);
		portletURL.setParameter("cur",
				cur2);
		names.add("kiem_dem");
		urls.add(portletURL.toString());
		
		value = tabs.contains("kiem_dem")?names.get(1):names.get(0);

%>
<liferay-ui:tabs names="<%=StringUtil.merge(names)%>" param="topTabs"
	url0="<%=(urls.size() > 0) ? urls.get(0) : null%>"
	url1="<%=(urls.size() > 1) ? urls.get(1) : null%>" value="<%=value%>" />
