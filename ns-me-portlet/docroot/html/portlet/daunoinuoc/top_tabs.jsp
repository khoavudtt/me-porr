
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
	String maTinh = (String)request.getAttribute(DauNoiNuocTerms.MA_TINH);
	String maHuyen = (String)request.getAttribute(DauNoiNuocTerms.MA_HUYEN);
	String maXa = (String)request.getAttribute(DauNoiNuocTerms.MA_XA);
	String tramCapNuocId = (String)request.getAttribute(DauNoiNuocTerms.TRAM_CAP_NUOC_ID);
	String trangThai = (String)request.getAttribute(DauNoiNuocTerms.TRANG_THAI);
	String namBaoCao = (String)request.getAttribute(DauNoiNuocTerms.NAM_BAO_CAO);
	String ngayDauNoi = (String)request.getAttribute("ngayNhap");
	String idNguoiTao = (String)request.getAttribute("idNguoiTao");
	String advText = (String)request.getAttribute("advText");
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
		//par
		portletURL.setParameter(DauNoiNuocTerms.MA_TINH,
				String.valueOf(maTinh));
		portletURL.setParameter(DauNoiNuocTerms.MA_HUYEN,
				String.valueOf(maHuyen));
		portletURL.setParameter(DauNoiNuocTerms.MA_XA,
				String.valueOf(maXa));
		portletURL.setParameter(DauNoiNuocTerms.TRAM_CAP_NUOC_ID,
				String.valueOf(tramCapNuocId));
		portletURL.setParameter(DauNoiNuocTerms.TRANG_THAI,
				String.valueOf(trangThai));
		portletURL.setParameter(DauNoiNuocTerms.NAM_BAO_CAO,
				String.valueOf(namBaoCao));
		portletURL.setParameter("ngayNhap",
				String.valueOf(ngayDauNoi));
		portletURL.setParameter("idNguoiTao",
				String.valueOf(idNguoiTao));
		portletURL.setParameter("advText",
				String.valueOf(advText));
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
		//par
				portletURL.setParameter(DauNoiNuocTerms.MA_TINH,
						String.valueOf(maTinh));
				portletURL.setParameter(DauNoiNuocTerms.MA_HUYEN,
						String.valueOf(maHuyen));
				portletURL.setParameter(DauNoiNuocTerms.MA_XA,
						String.valueOf(maXa));
				portletURL.setParameter(DauNoiNuocTerms.TRAM_CAP_NUOC_ID,
						String.valueOf(tramCapNuocId));
				portletURL.setParameter(DauNoiNuocTerms.TRANG_THAI,
						String.valueOf(trangThai));
				portletURL.setParameter(DauNoiNuocTerms.NAM_BAO_CAO,
						String.valueOf(namBaoCao));
				portletURL.setParameter("ngayNhap",
						String.valueOf(ngayDauNoi));
				portletURL.setParameter("idNguoiTao",
						String.valueOf(idNguoiTao));
				portletURL.setParameter("advText",
						String.valueOf(advText));
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
