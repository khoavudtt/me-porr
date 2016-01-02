<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

<%
	PortletURL portletURL = renderResponse.createRenderURL();
	String maTinh = ParamUtil.getString(request, "maTinh");
	String maHuyen = ParamUtil.getString(request, "maHuyen");
	String maTramCap = ParamUtil.getString(request, "maTramCap");
	long trangThai = ParamUtil.getLong(request, "trangThai", -1l);
	String capHoatDong = ParamUtil.getString(request, "capHoatDong", "3");
	String tenTinh = ParamUtil.getString(request, "tenTinh");
	
	redirect = ParamUtil.getString(request, "currentURL");
	
	String orgCode2 = StringPool.BLANK;
	
	if(Validator.isNotNull(maHuyen)) {
		orgCode2 = maHuyen;
	} else if (Validator.isNotNull(maTramCap)) {
		orgCode2 = maTramCap;
	}
	
	List<TramCapNuoc> lsTramCap = TramCapBusiness.findTramCap(maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	List<DATAITEM> lsHuyen = DataItemBusiness.getInLevel2(1, maTinh); 

%>

<portlet:renderURL var="addKiemDemVienURL">
	<portlet:param name="mvcPath" value='<%= templatePath + "/add_kiemdemvien.jsp" %>' />
	<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(request) %>"/>
	<portlet:param name="capHoatDong" value="<%= capHoatDong %>"/>
	<portlet:param name="maTinh" value="<%= maTinh %>"/>
</portlet:renderURL>

<aui:button-row cssClass="bnt-add-entry">
	<aui:button cssClass="btn-primary"
		href="<%= addKiemDemVienURL.toString() %>" 
		name="addEntryButton" 
		value="them-moi"
	/>
</aui:button-row>

<liferay-ui:header backURL="<%=redirect%>" title="danh-sach-kiem-dem-vien-nuoc" />

<liferay-ui:success key="success-them-thanh-cong-kiem-dem-vien" message="success-them-thanh-cong-kiem-dem-vien"/>
<liferay-ui:success key="success-sua-thanh-cong-kiem-dem-vien" message="success-sua-thanh-cong-kiem-dem-vien"/>

<div class="box-name">
	<%= tenTinh %>
</div>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath" value='<%= templatePath + "view_kdv_nuoc_by_tinh.jsp" %>'/>
	<portlet:param name="redirect" value="<%= redirect %>"/>
</liferay-portlet:renderURL>

<c:if test="<%= lsTramCap.size() != 0 %>">
	<aui:field-wrapper cssClass="search-form">
		<aui:form action="<%= searchURL %>" method="post" name="fm">
			<aui:input name="maTinh" type="hidden" value="<%= maTinh %>"/>
			<aui:input name="capHoatDong" type="hidden" value="<%= capHoatDong %>"/>
			<aui:input name="tenTinh" type="hidden" value="<%= tenTinh %>"/>
			<aui:input name="trangThai" type="hidden" value="<%= Long.toString(trangThai) %>"/>
			<aui:input name="redirect" type="hidden" value="<%= redirect %>"/>
			
			<div class="search-form">
				<div class="search-30">
					<c:choose>
						<c:when test='<%= capHoatDong.contentEquals("2") %>'>
							<aui:select name="maHuyen" showEmptyOption="<%= true %>">
								<%
									for (DATAITEM huyen : lsHuyen) {
								%>
									<aui:option value="<%= huyen.getNode2() %>"><%= huyen.getName() %></aui:option>
								<%
									}
								%>
							</aui:select>
						</c:when>
						<c:when test='<%= capHoatDong.contentEquals("3") %>' >
							<aui:select name="maTramCap" showEmptyOption="<%= true %>">
								<%
									for (TramCapNuoc trapCap : lsTramCap) {
								%>
									<aui:option value="<%= trapCap.getId() %>"><%= trapCap.getTenTram() %></aui:option>
								<%
									}
								%>
							</aui:select>
						</c:when>
					</c:choose>
				</div>
				<div class="search-20">
					<aui:button name="search" type="submit" value="filter"/>
				</div>
			</div>
			
					
		</aui:form>
	</aui:field-wrapper>
</c:if>

<liferay-ui:search-container delta="20" iteratorURL="<%= searchURL %>" emptyResultsMessage="khong-tim-thay-kiem-dem-vien">
	<liferay-ui:search-container-results>
		<%
			results = KiemDemVienLocalServiceUtil.findKDVByCTHTT(capHoatDong, maTinh, orgCode2, trangThai,
					searchContainer.getStart(), 
					searchContainer.getEnd());
		
			total = KiemDemVienLocalServiceUtil.countCTHTT(capHoatDong, maTinh, orgCode2, trangThai);
			
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
			
			pageContext.setAttribute("searchContainer", searchContainer);
			
		%>
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row
 			className="vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien"
			keyProperty="id"
			modelVar="kiemDemVien"
	>
		<portlet:renderURL var="rowURL">
			<portlet:param name="mvcPath" value="/html/portlet/kiemdemvien/view_detail.jsp" />
			<portlet:param name="id" value="<%=String.valueOf(kiemDemVien.getId()) %>"/>
			<portlet:param name="currentURL" value="<%= currentURL %>"/>
		</portlet:renderURL>
		
		<liferay-ui:search-container-column-text 
			name="don-vi-quan-ly" 
			href="<%= rowURL %>" 
			align="left" 
		>
			<%=(kiemDemVien.getCapHoatDong()==1)? 
					NuocSachUtils.getNameTinh(kiemDemVien.getOrgCode1()):
					((kiemDemVien.getCapHoatDong()==2)?
					NuocSachUtils.getNameHuyen(kiemDemVien.getOrgCode1(), kiemDemVien.getOrgCode2()):
					NuocSachUtils.getTenTramByTramId(kiemDemVien.getOrgCode2()))
			%>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="name" 
			href="<%= rowURL %>" 
			align="left" 
		>
			<%=kiemDemVien.getHoVaTen() %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="account" 
			href="<%= rowURL %>" 
			align="left" 
		> 
			<%=kiemDemVien.getTaiKhoan() %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="giam-sat-vien" 
			href="<%= rowURL %>" 
			align="left" 
		>
			<%
				UserMapping um = null;
			
				if (Validator.isNotNull(kiemDemVien.getIdQuanLy())) {
					um = UserMappingBusiness.getByUserId(kiemDemVien.getIdQuanLy());
				}
				
			%>
			
			<c:if test="<%= Validator.isNotNull(um) %>">
				<%= um.getName() %>
			</c:if>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="status" 
			href="<%= rowURL %>" 
			align="left" 
		>
			<liferay-ui:message 
				key='<%=(kiemDemVien.getTrangThai()==1)? "activated":"deactivated"%>' 
			/>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-jsp 
			name="controller" 
			path="/html/portlet/kiemdemvien/entry_action.jsp"  
			align="left" 
 		/> 
		
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator 
		searchContainer="<%=searchContainer%>" 
		paginate="true" 
	/>
</liferay-ui:search-container>
	
