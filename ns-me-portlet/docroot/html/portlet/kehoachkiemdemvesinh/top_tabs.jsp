
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
String maTinhDauNoi = ParamUtil.getString(request, DauNoiNuocTerms.MA_TINH);
String maHuyenDauNoi = ParamUtil.getString(request, DauNoiNuocTerms.MA_HUYEN);
String maXaDauNoi = ParamUtil.getString(request, DauNoiNuocTerms.MA_XA);
String tramCapNuocIdDauNoi = ParamUtil.getString(request, KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID);
String trangThaiDauNoi = ParamUtil.getString(request, DauNoiNuocTerms.TRANG_THAI);
String namBaoCaoDauNoi = ParamUtil.getString(request, DauNoiNuocTerms.NAM_BAO_CAO);

	long dauNoiId = ParamUtil.getLong(request, DauNoiNuocTerms.ID);
	String tabs = ParamUtil.getString(request, "tabs");
	List<String> names = new ArrayList<String>();
	List<String> urls = new ArrayList<String>();
	String value = null;

		
		PortletURL portletURL = renderResponse.createRenderURL();
		portletURL.setParameter("mvcPath",
				"/html/portlet/kehoachkiemdemnuoc/them_dau_noi_theo_tinh_huyen_xa.jsp");
		portletURL.setParameter("tabs",
				"dau_noi_by_tinh_huyen_xa");
		portletURL.setParameter(DauNoiNuocTerms.ID,
				String.valueOf(dauNoiId));
		portletURL.setParameter(DauNoiNuocTerms.MA_TINH,
				String.valueOf(maTinhDauNoi));
		portletURL.setParameter(DauNoiNuocTerms.MA_HUYEN,
				String.valueOf(maHuyenDauNoi));
		portletURL.setParameter(DauNoiNuocTerms.MA_XA,
				String.valueOf(maXaDauNoi));
		portletURL.setParameter(KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID,
				String.valueOf(tramCapNuocIdDauNoi));
		names.add("dau-noi-by-tinh-huyen-xa");
		urls.add(portletURL.toString());
		value = names.get(0);
		
		portletURL.setParameter("mvcPath",
				"/html/portlet/kehoachkiemdemnuoc/them_dau_noi_theo_dau_noi.jsp");
		portletURL.setParameter("tabs",
				"dau_noi_by_dau_noi");
		portletURL.setParameter(DauNoiNuocTerms.ID,
				String.valueOf(dauNoiId));
		portletURL.setParameter(DauNoiNuocTerms.MA_TINH,
				String.valueOf(maTinhDauNoi));
		portletURL.setParameter(DauNoiNuocTerms.MA_HUYEN,
				String.valueOf(maHuyenDauNoi));
		portletURL.setParameter(DauNoiNuocTerms.MA_XA,
				String.valueOf(maXaDauNoi));
		portletURL.setParameter(KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID,
				String.valueOf(tramCapNuocIdDauNoi));
		names.add("dau-noi-by-dau-noi");
		urls.add(portletURL.toString());
		
		value = tabs.contains("dau_noi_by_dau_noi")?names.get(1):names.get(0);

%>
<liferay-ui:tabs names="<%=StringUtil.merge(names)%>" param="topTabs"
	url0="<%=(urls.size() > 0) ? urls.get(0) : null%>"
	url1="<%=(urls.size() > 1) ? urls.get(1) : null%>" value="<%=value%>" />
