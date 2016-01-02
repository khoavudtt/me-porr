
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.KeHoachKiemDemVeSinhTerms"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.KeHoachKiemDemNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc"%>
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
	String idTrangThaiChk = ParamUtil.getString(request, "idTrangThaiChk");
	long idTrangThaiChkLong = 0;
	if(Validator.isNotNull(idTrangThaiChk) && Validator.isNumber(idTrangThaiChk)){
		idTrangThaiChkLong = Long.valueOf(idTrangThaiChk);
	}else{
		idTrangThaiChkLong = 0;
	}
	String maTinh = (String)request.getAttribute(KeHoachKiemDemVeSinhTerms.MA_TINH);
	String maHuyen = (String)request.getAttribute(KeHoachKiemDemVeSinhTerms.MA_HUYEN);
	String trangThai = (String)request.getAttribute("trangThai");
	String daKetThucDieuTra = (String)request.getAttribute("daKetThucDieuTra");
	KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = (KeHoachKiemDemVeSinh)request.getAttribute("keHoachKiemDemVeSinh");
	String tabs = ParamUtil.getString(request, "tabs");
	List<String> names = new ArrayList<String>();
	List<String> urls = new ArrayList<String>();
	String value = null;
		
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("mvcPath", "/html/portlet/kehoachkiemdemvesinh/view_detail_tab1.jsp");
	portletURL.setParameter("tabs", "view_detail_tab1");
	portletURL.setParameter(KeHoachKiemDemVeSinhTerms.ID, String.valueOf(keHoachKiemDemVeSinh.getId()));
	portletURL.setParameter(KeHoachKiemDemVeSinhTerms.MA_HUYEN, maHuyen);
	portletURL.setParameter("daKetThucDieuTra", trangThai);
	portletURL.setParameter("trangThai", trangThai);
	portletURL.setParameter("idTrangThaiChk", String.valueOf(idTrangThaiChkLong));
	names.add("view-detail-tab1");
	urls.add(portletURL.toString());
	value = names.get(0);
		
	portletURL.setParameter("mvcPath", "/html/portlet/kehoachkiemdemvesinh/view_detail_tab3.jsp");
	portletURL.setParameter("tabs", "view_detail_tab3");
	portletURL.setParameter(KeHoachKiemDemVeSinhTerms.ID, String.valueOf(keHoachKiemDemVeSinh.getId()));
	portletURL.setParameter(KeHoachKiemDemVeSinhTerms.MA_HUYEN, maHuyen);
	portletURL.setParameter("daKetThucDieuTra", trangThai);
	portletURL.setParameter("idTrangThaiChk", String.valueOf(idTrangThaiChkLong));
	portletURL.setParameter("trangThai", trangThai);
	names.add("view-detail-tab3");
	urls.add(portletURL.toString());
	
	portletURL.setParameter("mvcPath", "/html/portlet/kehoachkiemdemvesinh/view_detail_tab2.jsp");
	portletURL.setParameter("tabs", "view_detail_tab2");
	portletURL.setParameter(KeHoachKiemDemVeSinhTerms.ID, String.valueOf(keHoachKiemDemVeSinh.getId()));
	portletURL.setParameter(KeHoachKiemDemVeSinhTerms.MA_HUYEN, maHuyen);
	portletURL.setParameter("daKetThucDieuTra", trangThai);
	portletURL.setParameter("trangThai", trangThai);
	portletURL.setParameter("idTrangThaiChk", String.valueOf(idTrangThaiChkLong));
	names.add("view-detail-tab2");
	urls.add(portletURL.toString());
		
	if(tabs.contains("view_detail_tab2")){
		value = names.get(2);
	}else if(tabs.contains("view_detail_tab3")){
		value = names.get(1);
	}else{
		value = names.get(0);
	}

%>
<liferay-ui:tabs names="<%=StringUtil.merge(names)%>" param="topTabs"
	url0="<%=(urls.size() > 0) ? urls.get(0) : null%>"
	url1="<%=(urls.size() > 1) ? urls.get(1) : null%>"
	url2="<%=(urls.size() > 2) ? urls.get(2) : null%>" value="<%=value%>" />
