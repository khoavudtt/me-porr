
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.KeHoachKiemDemNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc"%>
<%@page import="vn.dtt.sol.ns.kehoachkiemdemnuoc.terms.KeHoachKiemDemNuocTerms"%>
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
	String quanHuyen = ParamUtil.getString(request, DauNoiNuocTerms.MA_HUYEN);
	String phuongXa = ParamUtil.getString(request, DauNoiNuocTerms.MA_XA);
	String trangThai = ParamUtil.getString(request, "daKetThucDieuTra");
	String trangThai2 = ParamUtil.getString(request, "trangThai");
	KeHoachKiemDemNuoc keHoachKiemDem = (KeHoachKiemDemNuoc)request.getAttribute("keHoachKiemDem");
	String tabs = ParamUtil.getString(request, "tabs");
	List<String> names = new ArrayList<String>();
	List<String> urls = new ArrayList<String>();
	String value = null;
		
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("mvcPath", "/html/portlet/kehoachkiemdemnuoc/view_detail_tab1.jsp");
	portletURL.setParameter("tabs", "view_detail_tab1");
	portletURL.setParameter(KeHoachKiemDemNuocTerms.ID, String.valueOf(keHoachKiemDem.getId()));
	portletURL.setParameter(DauNoiNuocTerms.MA_HUYEN, quanHuyen);
	portletURL.setParameter(DauNoiNuocTerms.MA_XA, phuongXa);
	portletURL.setParameter("daKetThucDieuTra", trangThai);
	portletURL.setParameter("trangThai", trangThai2);	
	names.add("view-detail-tab1");
	urls.add(portletURL.toString());
	value = names.get(0);
		
	portletURL.setParameter("mvcPath", "/html/portlet/kehoachkiemdemnuoc/view_detail_tab2.jsp");
	portletURL.setParameter("tabs", "view_detail_tab2");
	portletURL.setParameter(KeHoachKiemDemNuocTerms.ID, String.valueOf(keHoachKiemDem.getId()));
	portletURL.setParameter(DauNoiNuocTerms.MA_HUYEN, quanHuyen);
	portletURL.setParameter(DauNoiNuocTerms.MA_XA, phuongXa);
	portletURL.setParameter("daKetThucDieuTra", trangThai);
	portletURL.setParameter("trangThai", trangThai2);
	names.add("view-detail-tab2");
	urls.add(portletURL.toString());
		
	if(tabs.contains("view_detail_tab2")){
		value = names.get(1);
	}else{
		value = names.get(0);
	}

%>
<liferay-ui:tabs names="<%=StringUtil.merge(names)%>" param="topTabs"
	url0="<%=(urls.size() > 0) ? urls.get(0) : null%>"
	url1="<%=(urls.size() > 1) ? urls.get(1) : null%>" value="<%=value%>" />
