<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.sol.ns.business.KeHoachVeSinhBusiness"%>
<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.kehoachvesinh.dao.service.KeHoachVeSinhLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
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
	int userType = 0;

	long nam = ParamUtil.getLong(request, "nam");;
	String maTinh = ParamUtil.getString(request, "maTinh");
	String maHuyen = ParamUtil.getString(request, "maHuyen");
	
	List<DATAITEM> listTinh = DATAITEMLocalServiceUtil.getByDataGroupLevel1(1);
	
	List<DATAITEM> listHuyen = new ArrayList<DATAITEM>(); 
	
	UserMapping userMapping = UserMappingBusiness.getUserMapping(user);
	if(userMapping!=null){
		userType = userMapping.getUserType();
		if(userType==2){
			maTinh = userMapping.getOrgCode1();
			listHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh);
		} else if (userType==3){
			maTinh = userMapping.getOrgCode1();
			listHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh);
			maHuyen = userMapping.getOrgCode2();
		} else if (userType==4){
			maTinh = userMapping.getOrgCode1();
			maHuyen = userMapping.getOrgCode2();
		}
	}
	
	
%>
<div class="title">
	<liferay-ui:message key="javax.portlet.title"/>
</div>

<portlet:renderURL var="addKeHoachVeSinhURL">
	<portlet:param name="mvcPath" value='<%= "/html/portlet/kehoachvesinh/add_kehoachvesinh.jsp" %>' />
	<portlet:param name="backURL" value='<%= PortalUtil.getCurrentURL(request) %>' />
	<portlet:param name="userMappingId" value='<%= String.valueOf(userMapping.getId()) %>' />
	<portlet:param name="redirect" value="<%= redirect %>"/>
</portlet:renderURL>

<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kehoachvesinh/_select_huyen.jsp"/>
</portlet:renderURL>

<liferay-ui:error key="them-ke-hoach-that-bai" message="them-ke-hoach-that-bai" />
<liferay-ui:success key="them-ke-hoach-thanh-cong" message="them-ke-hoach-thanh-cong"/>
<liferay-ui:error key="xoa-ke-hoach-that-bai" message="xoa-ke-hoach-that-bai" />
<liferay-ui:success key="xoa-ke-hoach-thanh-cong" message="xoa-ke-hoach-thanh-cong"/>
<liferay-ui:error key="sua-ke-hoach-that-bai" message="sua-ke-hoach-that-bai" />
<liferay-ui:success key="sua-ke-hoach-thanh-cong" message="sua-ke-hoach-thanh-cong"/>

<portlet:actionURL name="search" var="searchURL"></portlet:actionURL>
<aui:form action="<%=searchURL%>" name="search" method="POST">
	<%
	if(userType==2){
	%>
	<aui:input name="maTinh" type="hidden" value="<%=maTinh %>"></aui:input>
	<%
	} else if ((userType==3)||(userType==4)){
	%>
	<aui:input name="maTinh" type="hidden" value="<%=maTinh %>"></aui:input>
	<aui:input name="maHuyen" type="hidden" value="<%=maHuyen %>"></aui:input>
	<%
	}
	%>
	<table>
		<tr>
			<td>
				<aui:select 
					name="nam" 
					label="nam-label" 
					id="nam" 
					showEmptyOption="<%= false %>" 
				>
					<aui:option value=""><liferay-ui:message key="-tat-ca-"></liferay-ui:message></aui:option>
					<aui:option value="<%=2013 %>" selected="<%=(nam==2013) %>">2013</aui:option>
					<aui:option value="<%=2014 %>" selected="<%=(nam==2014) %>">2014</aui:option>
					<aui:option value="<%=2015 %>" selected="<%=(nam==2015) %>">2015</aui:option>
				</aui:select>
			</td>
			
			<td>
				<aui:select 
					name="maTinh" 
					label="tinh-tp-label" 
					id="maTinh" 
					showEmptyOption="<%= false %>"
					disabled="<%=(userType==1)? false:true%>"
				>
					<aui:option value=""><liferay-ui:message key="-tat-ca-"></liferay-ui:message></aui:option>
					<%
						for (DATAITEM tinh : listTinh) {
					%>
						<aui:option value="<%= tinh.getNode1() %>" selected="<%=(maTinh.equals(tinh.getNode1())) %>"><%= tinh.getName() %></aui:option>
					<%
						}
					%>
				</aui:select>
			</td>
			
			<td>
				<div id="optHuyen">
					<aui:select 
						name="maHuyen" 
						label="huyen-label" 
						id="maHuyen" 
						showEmptyOption="<%= false %>" 
						disabled="<%=((userType==1)||(userType==2))? false:true%>"
					>
						<aui:option value=""><liferay-ui:message key="-tat-ca-"></liferay-ui:message></aui:option>
						<%
							for (DATAITEM huyen : listHuyen) {
						%>
							<aui:option value="<%= huyen.getNode2() %>" selected="<%=(maHuyen.equals(huyen.getNode2())) %>"><%= huyen.getName() %></aui:option>
						<%
							}
						%>
					</aui:select>
				</div>
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
		href="<%= addKeHoachVeSinhURL.toString() %>" 
		name="addKeHoachVeSinh" 
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
		//results = KeHoachVeSinhBusiness.search(nam, maTinh, maHuyen, searchContainer.getStart(), searchContainer.getEnd());
	
		if((userType==1)||(userType==2)||(userType==3)){
			results = KeHoachVeSinhBusiness.search(nam, maTinh, maHuyen, searchContainer.getStart(), searchContainer.getEnd());
		} else {
			results = null;
		}
		
		total = KeHoachVeSinhBusiness.count(nam, maTinh, maHuyen);
		
		pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
		
		searchContainer.setIteratorURL(portletURL);
	%>
		
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row 
		className="vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh"
		modelVar="keHoach" rowVar="" 
	>
		<liferay-ui:search-container-column-text 
			name="nam-header" 
			align="left"
		>
			<%=keHoach.getNam() %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="tinh-tp-header" 
			align="left"
		>
			<%=NuocSachUtils.getNameTinh(keHoach.getMaTinh()) %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="huyen-header" 
			align="left"
		>
			<%=NuocSachUtils.getNameHuyen(keHoach.getMaTinh(), keHoach.getMaHuyen()) %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="xa-header" 
			align="left"
		>
			<%=NuocSachUtils.getNameXa(keHoach.getMaXa()) %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="so-nguoi-huong-loi"
			align="right"
		>
			<%=(keHoach.getDangKyVSTX()==1)? keHoach.getSoDan():"-" %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-text 
			name="so-nha-tieu-hvs-moi"
			align="right"
		>
			<%=keHoach.getSoNhaTieuHVSMoi() %>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-jsp 
			name="controller" 
			path="/html/portlet/kehoachvesinh/entry_action.jsp" 
			align="center"
		/>
		
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator 
		searchContainer="<%=searchContainer%>" 
		paginate="true" 
	/>
</liferay-ui:search-container>

<script type="text/javascript">

	AUI().ready(function(A){
		var capTinhInput = A.one("#<portlet:namespace/>maTinh");
		var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");
		
			capTinhInput.on('change', function(){
			var capTinhId = capTinhInput.val();
			var capHuyenId = capHuyenInput.val();
			
			selectHuyen(capTinhId, capHuyenId);
		});
		
	});
	
	function selectHuyen(capTinhId, capHuyenId){
		AUI().use('aui-base','aui-io-request', function(A){
	
			//aui ajax call to get updated content
			A.io.request('<%= selectHuyen %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />capTinhId": capTinhId,
					"<portlet:namespace />capHuyenId": capHuyenId
				},
				on: {
					success: function() {
						var optHuyen = A.one("#optHuyen");
						optHuyen.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});
	}
	
	
</script>