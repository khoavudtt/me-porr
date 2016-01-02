<%@page import="vn.dtt.sol.ns.business.UserMappingBusiness"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="vn.dtt.sol.ns.business.KiemDemVienBussiness"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien"%>
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
	long kiemDemVienId = ParamUtil.getLong(request, "id");
	
	String initCapTinh = StringPool.BLANK;
	String initCapHuyen = StringPool.BLANK;
	String initCapTram = StringPool.BLANK;

	KiemDemVien selKiemDemVien = KiemDemVienBussiness.getKiemDemVien(kiemDemVienId);
	
	long capHoatDong = selKiemDemVien.getCapHoatDong();
	
	List<DATAITEM> listTinh = DATAITEMLocalServiceUtil.getByDataGroupLevel1(1);
	
	List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
	
	List<TramCapNuoc> listTramCap = new ArrayList<TramCapNuoc>();
	if ((capHoatDong!=1)&&(capHoatDong!=2)&&(capHoatDong!=3)){
		capHoatDong = 0;
	} else if(capHoatDong==1){
		initCapTinh = selKiemDemVien.getOrgCode1();
	} else if (capHoatDong==2){
		initCapTinh = selKiemDemVien.getOrgCode1();
		initCapHuyen = selKiemDemVien.getOrgCode2();
	} else if (capHoatDong==3){
		initCapTinh = selKiemDemVien.getOrgCode1();
		initCapTram = selKiemDemVien.getOrgCode2();
	}
	
	List<DATAITEM> lsHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, initCapTinh);
	
	List<TramCapNuoc> lsTramCapNuoc = TramCapBusiness.getByTinh(initCapTinh);
	
	String lastURL = ParamUtil.getString(request, "currentURL");
	
	UserMapping userMapping = UserMappingBusiness.getUserMapping(user);
	
	int userType = UserMappingBusiness.getUserType(user);
	
	
%>
<liferay-ui:header
	backURL="<%= lastURL %>"
	title="edit-kiem-dem-vien"
/>
<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kiemdemvien/_select_huyen.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="selectTram" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/kiemdemvien/_select_tramcap.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="editKiemDemVien" var="editKiemDemVienURL"/>
<aui:form action="<%=editKiemDemVienURL %>" method="POST" name="fm">
	<aui:input name="id" type="hidden" value="<%=selKiemDemVien.getId() %>"></aui:input>
	
<%
	if(userType==2||userType==3||userType==4){
%>
	<aui:input name="maTinh" type="hidden" value="<%=initCapTinh %>"></aui:input>
<%
	}
%>
<%
	if(userType==3||userType==4){
%>
	<aui:input name="maHuyen" type="hidden" value="<%=initCapHuyen %>"></aui:input>
	<aui:input name="maTram" type="hidden" value="<%=initCapTram %>"></aui:input>
<%
	}
%>
	<aui:field-wrapper>
		<aui:row>
			<aui:col width="50">
				<aui:input 
					name="hoVaTen" 
					label="full-name" 
					type="text" 
					value="<%= selKiemDemVien.getHoVaTen() %>" 
				>
					<aui:validator name="required" />
				</aui:input>
			</aui:col>
			<aui:col width="50">
				<aui:input 
					name="taiKhoan" 
					label="username" 
					type="text" 
					value="<%= selKiemDemVien.getTaiKhoan() %>" 
				>
					<aui:validator name="required" />
				</aui:input>
			</aui:col>
		</aui:row>
		
		<aui:row>
			<aui:col width="50">
				<aui:input 
					name="matKhau" 
					id="matKhau" 
					label="password" 
					type="password" 
					value="<%= StringPool.BLANK %>"
				>
				</aui:input>
			</aui:col>
			
			<aui:col width="50">
				<aui:input 
					name="matKhau-2" 
					label="re-password" 
					type="password" 
				>
					<aui:validator name="equalTo">'#<portlet:namespace />matKhau'</aui:validator>
				</aui:input>
			</aui:col>
		</aui:row>
		
		<aui:row>
			<aui:col width="50">
				<aui:select 
					name="capHoatDong" 
					label="cap-hoat-dong" 
					id="capHoatDong" 
					showEmptyOption="<%= false %>"
					disabled="<%=(userType==1 || userType==2)? false:true %>"
					required="<%=true %>"
				>
					<aui:option value=""><liferay-ui:message key="--chon--"/></aui:option>
					<aui:option value="1" selected='<%= capHoatDong == 1 %>'><liferay-ui:message key="toan-tinh"/></aui:option>
					<aui:option value="2" selected='<%= capHoatDong == 2 %>'><liferay-ui:message key="ve-sinh-huyen"/></aui:option>
					<aui:option value="3" selected='<%= capHoatDong == 3 %>'><liferay-ui:message key="tram-cap-nuoc"/></aui:option>
				</aui:select>
			</aui:col>
		</aui:row>
		
		<aui:row id="optToanTinh">
			<aui:col width="50">
				<aui:select 
					name="maTinh" 
					id="maTinh" 
					showEmptyOption="<%= false %>" 
					disabled="<%=(userType==1)? false:true %>"
				>
					<aui:option value=""><liferay-ui:message key="--chon--"/></aui:option>
					<%
						for (DATAITEM tinh : listTinh) {
					%>
						<aui:option value="<%= tinh.getNode1() %>" selected="<%=(tinh.getNode1().equals(initCapTinh)) %>"><%= tinh.getName() %></aui:option>
					<%
						}
					%>
				</aui:select>
			</aui:col>
		
			<aui:col id="optVeSinhHuyen" width="50">
				<div id="optHuyen">
					<aui:select 
						name="maHuyen" 
						id="maHuyen" 
						showEmptyOption="<%= false %>" 
						disabled="<%=(userType==1 || userType==2)? false:true %>"
					>
						<aui:option value=""><liferay-ui:message key="--chon--"/></aui:option>
						<%
							for (DATAITEM huyen : lsHuyen) {
						%>
						<aui:option value="<%= huyen.getNode2() %>" selected="<%=(huyen.getNode2().equals(initCapHuyen)) %>"><%= huyen.getName() %></aui:option>
						<%
								}
						%>
					</aui:select>
				</div>
			</aui:col>
			
			<aui:col id="optTramCapNuoc" width="50">
				<div id="optTram">
					<aui:select
						name="maTram" 
						id="maTram" 
						showEmptyOption="<%= false %>"
						disabled="<%=(userType==1 || userType==2)? false:true %>"
					>
						<aui:option value=""><liferay-ui:message key="--chon--"/></aui:option>
						<%
							for (TramCapNuoc tramCap : lsTramCapNuoc) {
						%>
							<aui:option value="<%= tramCap.getId() %>" selected="<%=(String.valueOf(tramCap.getId()).equals(initCapTram))? true:false %>"><%= tramCap.getTenTram() %></aui:option>
						<%
							}
						%>
					</aui:select>
				</div>
			</aui:col>
		</aui:row>
		
		<aui:row>
			<aui:col width="50">
				<aui:input 
					name="diaChi" 
					label="address" 
					type="text" 
					value="<%= selKiemDemVien.getDiaChi() %>" 
					cssClass="lfr-input-text" 
				></aui:input>
			</aui:col>
			<aui:col width="50">
				<aui:input 
					name="chungMinhThu" 
					label="chung-minh-thu" 
					type="text" 
					value="<%=selKiemDemVien.getChungMinhThu() %>" 
				></aui:input>
			</aui:col>
		</aui:row>
		
		<aui:row>
			<aui:col width="50">
				<aui:input 
					name="dienThoai" 
					label="phone" 
					type="text" 
					value="<%= selKiemDemVien.getDienThoai() %>" 
				></aui:input>
			</aui:col>
			<aui:col width="50">
				<aui:input 
					name="imei"
					label="imei" 
					type="text" 
					value="<%= selKiemDemVien.getImei() %>" 
				></aui:input>
			</aui:col>
		</aui:row>
	
		<aui:row cssClass="fm-button">
			<aui:col width="100">
				<aui:button-row>
					<aui:button 
						type="submit" 
						value="save"
					/>
					<aui:button 
						href="<%= lastURL %>" 
						name="cancel" 
						value="cancel" 
					/>
				</aui:button-row>
			</aui:col>
		</aui:row>
	</aui:field-wrapper>
</aui:form>
<script type="text/javascript">

	AUI().ready(function(A){
		var capHoatDong = '<%= capHoatDong %>';
		var capHoatDongInput = A.one("#<portlet:namespace/>capHoatDong");
		
		var capTinhInput = A.one("#<portlet:namespace/>maTinh");
		var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");
		var capTramInput = A.one("#<portlet:namespace/>maTram");
		
		<portlet:namespace/>loadingDialogState(capHoatDong);
		
		capHoatDongInput.on('change', function(){
			var value = capHoatDongInput.val();
			<portlet:namespace />loadingDialogState(value);
			
			var capTinhId = capTinhInput.val();
			var capHuyenId = capHuyenInput.val();
			var capTramId = capTramInput.val();
			selectHuyen(capTinhId, capHuyenId);
			selectTram(capTinhId, capTramId);
		});
	
		capTinhInput.on('change', function(){
			var capTinhId = capTinhInput.val();
			var capHuyenId = capHuyenInput.val();
			var capTramId = capTramInput.val();
			selectHuyen(capTinhId, capHuyenId);
			selectTram(capTinhId, capTramId);
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
	
	function selectTram(capTinhId, capTramId){
		AUI().use('aui-base','aui-io-request', function(A){
	
			//aui ajax call to get updated content
			A.io.request('<%= selectTram %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />capTinhId": capTinhId,
					"<portlet:namespace />capTramId": capTramId
				},
				on: {
					success: function() {
						var optHuyen = A.one("#optTram");
						optHuyen.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});
	}

	Liferay.provide(window, '<portlet:namespace/>loadingDialogState',

	function(value) {
		var A = AUI();

		var capTinh = A.one('#<portlet:namespace/>optToanTinh');
		var capHuyen = A.one('#<portlet:namespace/>optVeSinhHuyen');
		var capTramCap = A.one('#<portlet:namespace/>optTramCapNuoc');

		if (value == '1') {
			capTinh.show();
			capHuyen.hide();
			capTramCap.hide();
		} else if (value == '2') {
			capTinh.show();
			capHuyen.show();
			capTramCap.hide();
		} else if (value == '3') {
			capTinh.show();
			capHuyen.hide();
			capTramCap.show();
		} else {
			capTinh.hide();
			capHuyen.hide();
			capTramCap.hide();
		}
	});
</script>