
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhGiaDinhTerms"%>
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
	VeSinhGiaDinh veSinhGiaDinh = (VeSinhGiaDinh)request.getAttribute("veSinhGiaDinh");
	String maTinh = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_TINH);
	String maHuyen = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_HUYEN);
	String maXa = (String)request.getAttribute(VeSinhGiaDinhTerms.MA_XA);
	String loaiNhaTieu = (String)request.getAttribute(VeSinhGiaDinhTerms.LOAI_NHA_TIEU);
	String trangThai = (String)request.getAttribute(VeSinhGiaDinhTerms.TRANG_THAI);
	String namBaoCao = (String)request.getAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO);
	String namBaoCaoVstx = (String)request.getAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO+"vstx");
	String ngayDauNoi = (String)request.getAttribute("ngayNhap");
	String idNguoiTao = (String)request.getAttribute("idNguoiTao");
	String advText = (String)request.getAttribute("advText");
	String tabs = ParamUtil.getString(request, "tabs");
	List<String> names = new ArrayList<String>();
	List<String> urls = new ArrayList<String>();
	String value = null;

		
		PortletURL portletURL = renderResponse.createRenderURL();
		portletURL.setParameter("mvcPath",
				"/html/portlet/vesinhhogiadinh/view_detail.jsp");
		portletURL.setParameter("tabs",
				"ho_gia_dinh");
		portletURL.setParameter(VeSinhGiaDinhTerms.ID,
				String.valueOf(veSinhGiaDinh.getId()));
		//par
		portletURL.setParameter(VeSinhGiaDinhTerms.MA_TINH,
				String.valueOf(maTinh));
		portletURL.setParameter(VeSinhGiaDinhTerms.MA_HUYEN,
				String.valueOf(maHuyen));
		portletURL.setParameter(VeSinhGiaDinhTerms.MA_XA,
				String.valueOf(maXa));
		portletURL.setParameter(VeSinhGiaDinhTerms.TRANG_THAI,
				String.valueOf(trangThai));
		portletURL.setParameter(VeSinhGiaDinhTerms.NAM_BAO_CAO,
				String.valueOf(namBaoCao));
		portletURL.setParameter(VeSinhGiaDinhTerms.NAM_BAO_CAO+"vstx",
				String.valueOf(namBaoCaoVstx));
		portletURL.setParameter("ngayNhap",
				String.valueOf(ngayDauNoi));
		portletURL.setParameter("idNguoiTao",
				String.valueOf(idNguoiTao));
		portletURL.setParameter("advText",
				String.valueOf(advText));
		names.add("ho-gia-dinh");
		urls.add(portletURL.toString());
		value = names.get(0);
		
		portletURL.setParameter("mvcPath",
				"/html/portlet/vesinhhogiadinh/view_thong_tin_kiem_dem.jsp");
		portletURL.setParameter("tabs",
				"kiem_dem");
		portletURL.setParameter(VeSinhGiaDinhTerms.ID,
				String.valueOf(veSinhGiaDinh.getId()));
		//par
				portletURL.setParameter(VeSinhGiaDinhTerms.MA_TINH,
						String.valueOf(maTinh));
				portletURL.setParameter(VeSinhGiaDinhTerms.MA_HUYEN,
						String.valueOf(maHuyen));
				portletURL.setParameter(VeSinhGiaDinhTerms.MA_XA,
						String.valueOf(maXa));
				portletURL.setParameter(VeSinhGiaDinhTerms.TRANG_THAI,
						String.valueOf(trangThai));
				portletURL.setParameter(VeSinhGiaDinhTerms.NAM_BAO_CAO,
						String.valueOf(namBaoCao));
				portletURL.setParameter(VeSinhGiaDinhTerms.NAM_BAO_CAO+"vstx",
						String.valueOf(namBaoCaoVstx));
				portletURL.setParameter("ngayNhap",
						String.valueOf(ngayDauNoi));
				portletURL.setParameter("idNguoiTao",
						String.valueOf(idNguoiTao));
				portletURL.setParameter("advText",
						String.valueOf(advText));
		names.add("kiem-dem");
		urls.add(portletURL.toString());
		
		value = tabs.contains("kiem_dem")?names.get(1):names.get(0);

%>
<liferay-ui:tabs names="<%=StringUtil.merge(names)%>" param="topTabs"
	url0="<%=(urls.size() > 0) ? urls.get(0) : null%>"
	url1="<%=(urls.size() > 1) ? urls.get(1) : null%>" value="<%=value%>" />
