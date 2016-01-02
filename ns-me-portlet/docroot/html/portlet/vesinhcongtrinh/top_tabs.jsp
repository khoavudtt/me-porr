
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhCongTrinhTerms"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhCongTrinhTerms"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc"%>
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
	VeSinhCongTrinh veSinhCongTrinh = (VeSinhCongTrinh)request.getAttribute("veSinhCongTrinh");
	String tabs = ParamUtil.getString(request, "tabs");
	List<String> names = new ArrayList<String>();
	List<String> urls = new ArrayList<String>();
	String value = null;

		
		PortletURL portletURL = renderResponse.createRenderURL();
		portletURL.setParameter("mvcPath",
				"/html/portlet/vesinhcongtrinh/view_detail.jsp");
		portletURL.setParameter("tabs",
				"ho_gia_dinh");
		portletURL.setParameter(VeSinhCongTrinhTerms.ID,
				String.valueOf(veSinhCongTrinh.getId()));
		names.add("dau_noi");
		urls.add(portletURL.toString());
		value = names.get(0);
		
		portletURL.setParameter("mvcPath",
				"/html/portlet/vesinhcongtrinh/view_thong_tin_kiem_dem.jsp");
		portletURL.setParameter("tabs",
				"kiem_dem");
		portletURL.setParameter(VeSinhCongTrinhTerms.ID,
				String.valueOf(veSinhCongTrinh.getId()));
		names.add("kiem_dem");
		urls.add(portletURL.toString());
		
		value = tabs.contains("kiem_dem")?names.get(1):names.get(0);

%>
<liferay-ui:tabs names="<%=StringUtil.merge(names)%>" param="topTabs"
	url0="<%=(urls.size() > 0) ? urls.get(0) : null%>"
	url1="<%=(urls.size() > 1) ? urls.get(1) : null%>" value="<%=value%>" />
