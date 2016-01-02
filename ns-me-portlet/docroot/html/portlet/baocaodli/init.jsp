<%
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

<%@include file="/init.jsp" %>

<%@page import="vn.dtt.sol.ns.baocaodli.search.BaoCaoDLIDisplayTerms"%>
<%@page import="vn.dtt.sol.ns.baocaodli.search.BaoCaoDLISearch"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="vn.dtt.sol.ns.business.BaoCaoDLIBusiness"%>
<%@page import="vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="vn.dtt.sol.ns.business.BaoCaoDLIBusiness"%>
<%@page import="vn.dtt.sol.ns.baocaodli.search.BaoCaoDLIDisplayTerms"%>
<%@page import="vn.dtt.sol.ns.baocaodli.search.BaoCaoDLISearch"%>
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.baocaodli.util.BaoCaoDLIUtil"%>
<%@page import="vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException"%>
<%@page import="vn.dtt.sol.ns.baocaodli.dao.DeleteChotBaoCaoException"%>
<%@page import="vn.dtt.sol.ns.baocaodli.dao.NamBaoCaoException"%>
<%@page import="vn.dtt.sol.ns.baocaodli.dao.NgayBaoCaoException"%>
<%@page import="vn.dtt.sol.ns.baocaodli.dao.NguoiDuyetException"%>
<%@page import="vn.dtt.sol.ns.baocaodli.dao.NguoiLapException"%>
<%@page import="vn.dtt.sol.ns.baocaodli.dao.SoBaoCaoException"%>
<%@page import="vn.dtt.sol.ns.baocaodli.dao.UpdateChotBaoCaoException"%>
<%@page import="vn.dtt.sol.ns.reporting.utils.ReportConstant"%>
<%@page import="vn.dtt.sol.ns.util.format.FormatData"%>
<%@page import="vn.dtt.sol.ns.util.ActionKeys"%>
<%@page import="vn.dtt.sol.ns.baocaodli.permission.BaoCaoDLIPermission"%>
<%@page import="vn.dtt.sol.ns.baocaodli.util.BaoCaoDLIConstants"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil"%>

<%
PortletURL currentURLObj = PortletURLUtil.getCurrent(liferayPortletRequest, liferayPortletResponse);

String redirectURL = ParamUtil.getString(request, "redirect", currentURL);
int typeDLI = 1;
if(Validator.isNotNull(preferences)){
	typeDLI = GetterUtil.getInteger(preferences.getValue("typeDLI", Integer.toString(BaoCaoDLIConstants.BAO_CAO_DLI_1_1)));
}
boolean isRealTimeReport = GetterUtil.getBoolean(preferences.getValue("isRealTimeReport", StringPool.FALSE));

%>