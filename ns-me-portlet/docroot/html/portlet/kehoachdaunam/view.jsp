
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.business.KeHoachNuocSachBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.kehoachdaunam.dao.service.KeHoachDauNamLocalServiceUtil"%>
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


<%@include file="/init.jsp"%>

<%
	PortletURL portletURL = renderResponse.createRenderURL();
	long namKeHoach = ParamUtil.getLong(request, "namKeHoach");
	String maTinh = StringPool.BLANK;
	String maTram = StringPool.BLANK;
	int userType=0;
	UserMapping userMapping = UserMappingBusiness.getUserMapping(user);
	if(userMapping!=null){
		userType = userMapping.getUserType();
		if(userType==2){
			maTinh = userMapping.getOrgCode1();
		} else if (userType==3){
			
		} else if (userType==4){
			maTram = userMapping.getOrgCode2();
		}
	}
%>

<div class="title">
	<liferay-ui:message key="javax.portlet.title"/>
</div>

<portlet:renderURL var="addKeHoachDauNamURL">
	<portlet:param name="mvcPath" value='<%= "/html/portlet/kehoachdaunam/add_kehoachdaunam.jsp" %>' />
	<portlet:param name="backURL" value='<%= PortalUtil.getCurrentURL(request) %>' />
	<portlet:param name="userMappingId" value='<%= String.valueOf(userMapping.getId()) %>' />
	<portlet:param name="redirect" value="<%= redirect %>"/>
</portlet:renderURL>

<liferay-ui:error key="them-ke-hoach-that-bai" message="them-ke-hoach-that-bai" />
<liferay-ui:success key="them-ke-hoach-thanh-cong" message="them-ke-hoach-thanh-cong"/>
<liferay-ui:error key="xoa-ke-hoach-that-bai" message="xoa-ke-hoach-that-bai" />
<liferay-ui:success key="xoa-ke-hoach-thanh-cong" message="xoa-ke-hoach-thanh-cong"/>
<liferay-ui:error key="sua-ke-hoach-that-bai" message="sua-ke-hoach-that-bai" />
<liferay-ui:success key="sua-ke-hoach-thanh-cong" message="sua-ke-hoach-thanh-cong"/>

<portlet:actionURL name="search" var="searchURL"></portlet:actionURL>
<aui:form action="<%=searchURL%>" name="search" method="POST">
	<aui:input name="tinhSelect" type="hidden" value="<%=maTinh %>" />
	<table>
		<tr>
			<td>
				<aui:select 
					name="namSelect" 
					label="nam" 
					id="nam" 
					showEmptyOption="<%= false %>" 
				>
					<aui:option value=""><liferay-ui:message key="-tat-ca-"></liferay-ui:message></aui:option>
					<aui:option value="<%=2013 %>">2013</aui:option>
					<aui:option value="<%=2014 %>">2014</aui:option>
					<aui:option value="<%=2015 %>">2015</aui:option>
				</aui:select>
			</td>
			
			<td>
				<aui:button 
					name="search" 
					type="submit" 
					value="search"
					style="margin: 6px 0px 0px 5px;"
				/>
			</td>
		</tr>
	</table>
</aui:form>
<c:if test="<%= userType == 1 || userType == 2 %>">
	<aui:button 
		href="<%= addKeHoachDauNamURL.toString() %>" 
		name="addKeHoachDauNam" 
		value="them-ke-hoach"
	/>
</c:if>
<liferay-ui:search-container 
	delta="10" 
	iteratorURL="<%=portletURL %>" 
	emptyResultsMessage="khong-tim-thay-ke-hoach"
>
	<liferay-ui:search-container-results>
	<%
		//results = KeHoachDauNamLocalServiceUtil.getKeHoachDauNams(searchContainer.getStart(), searchContainer.getEnd());
		if(userType==4){
			results = KeHoachNuocSachBusiness.searchByNamAndTram(namKeHoach, maTram, searchContainer.getStart(), searchContainer.getEnd());
		} else if((userType==1)||(userType==2)) {
			results = KeHoachNuocSachBusiness.searchByNamAndTinh(namKeHoach, maTinh, searchContainer.getStart(), searchContainer.getEnd());
		} else {
			results = null;
		}
		
		//total = KeHoachDauNamLocalServiceUtil.getKeHoachDauNamsCount();
		total = KeHoachNuocSachBusiness.countByNamAndTinh(namKeHoach, maTinh);
		
		pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
		
		searchContainer.setIteratorURL(portletURL);
	%>
		
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row 
		className="vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam"
		modelVar="keHoach" rowVar="" 
	>
		<liferay-ui:search-container-column-text 
			name="nam" 
			align="left"
		>
			<%=keHoach.getNam() %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="tinh" 
			align="left"
		>
			<%
				TramCapNuoc tramCap = TramCapBusiness.getTramCap(keHoach.getTramCapNuocId());
			%>
			<%=NuocSachUtils.getNameTinh(tramCap.getMaTinh()) %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="tram-cap-nuoc" 
			align="left"
		>
			<%=NuocSachUtils.getTenTramByTramId(Long.toString(keHoach.getTramCapNuocId())) %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="so-dau-noi-moi" 
			align="right"
		>
			<%=keHoach.getSoDauNoiMoi() %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="so-ho" 
			align="right"
		>
			<%=keHoach.getSoHoHuongLoi() %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="tong-dan-so"
			align="right"
		>
			<%=keHoach.getSoNguoiHuongLoi() %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-jsp 
			name="controller" 
			path="/html/portlet/kehoachdaunam/entry_action.jsp" 
			align="center"
		/>
		
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator 
		searchContainer="<%=searchContainer%>" 
		paginate="true" 
	/>
</liferay-ui:search-container>