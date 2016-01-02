<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.util.DiaBanQuanLyUtils"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocImpl"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="com.liferay.util.PwdGenerator"%>
<%@page import="vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.sol.ns.business.DataGroupBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAGROUP"%>
<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Organization"%>
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

<script type="text/javascript" src='http://maps.google.com/maps/api/js?sensor=false&libraries=places'></script>

<%@include file="/init.jsp" %>

<%
	TramCapNuoc tramCap = (TramCapNuoc) request.getAttribute("tramCap");

	if(Validator.isNull(tramCap)) {
		tramCap = (TramCapNuoc) portletSession.getAttribute("tramCap");
	}
	String maTram = PwdGenerator.getPassword(10);
	
	String initTinh = StringPool.BLANK;
	String initHuyen = StringPool.BLANK;
	String initXa = StringPool.BLANK;
	String initTramCap = StringPool.BLANK;
	
	if (Validator.isNotNull(tramCap)) {
		initTinh = tramCap.getMaTinh();
		initHuyen = tramCap.getMaHuyen();
		initXa = tramCap.getMaXa();
		initTramCap = tramCap.getMaTram();
	} else {
		initTinh = NuocSachUtils.getInitLevel(user, 2);
		initTramCap = NuocSachUtils.getInitLevel(user, 4);
	}
	
	List<DATAITEM> listMoHinhQuanLy = DATAITEMLocalServiceUtil.getByDataGroupLevel1(WebKeys.DATAGROUPID_MOHINHQUANLY);
	
	List<DATAITEM> listTinh = DiaBanQuanLyUtils.getTinh(user, permissionChecker.isOmniadmin(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

	
	List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
	List<DATAITEM> listXa = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, initTinh, initHuyen);

	
	String backURL = ParamUtil.getString(request, "redirect");
	
	Calendar cal = Calendar.getInstance();
	
	int curYear = cal.get(Calendar.YEAR);
%>

<portlet:renderURL var="selectDiaBan" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/render_huyen.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="selectHuyen" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/_select_huyen.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="selectXa" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/_select_xa.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addTramCap" var="addTramCapURL"/>

<liferay-ui:header
	backURL="<%= backURL %>"
	title='<%= (tramCap == null) ? "them-tram-cap" : "sua-tram-cap" %>'
/>
<liferay-ui:error key="ma-tram-khong-duoc-trong" message="ma-tram-khong-duoc-trong" />
<liferay-ui:error key="ten-tram-khong-duoc-trong" message="ten-tram-khong-duoc-trong" />
<liferay-ui:error key="ten-tram-khong-duoc-trung-nhau" message="ten-tram-khong-duoc-trung-nhau" />
<liferay-ui:error key="tinh-chua-chon" message="tinh-chua-chon" />
<liferay-ui:error key="huyen-chua-chon" message="huyen-chua-chon" />
<liferay-ui:error key="xa-chua-chon" message="xa-chua-chon" />
<liferay-ui:error key="loai-hinh-chua-chon" message="loai-hinh-chua-chon" />

<liferay-ui:error key="ma-mo-hinh-chua-chon" message="ma-mo-hinh-chua-chon" />
<liferay-ui:error key="tinh-trang-du-an-sai-gia-tri" message="tinh-trang-du-an-sai-gia-tri" />
<liferay-ui:error key="tien-do-xay-dung-sai-gia-tri" message="tien-do-xay-dung-sai-gia-tri" />
<%= currentURL %>
<aui:form action="<%= addTramCapURL %>" method="post" name="fm">
	
	<aui:model-context bean="<%= tramCap %>" model="<%= TramCapNuoc.class %>" />
	
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(tramCap) ? Constants.UPDATE : Constants.ADD %>"/>
	<aui:input name="redirect" type="hidden" value="<%= StringPool.BLANK %>" />
	<aui:input name="currentURL" type="hidden" value="<%= StringPool.BLANK %>" />
	<aui:input name="id" type="hidden" value="<%= Validator.isNotNull(tramCap) ? tramCap.getId() : StringPool.BLANK %>" />
	<aui:input name="backURL" type="hidden" value="<%= backURL %>"/>
	<aui:input name="currentURL" type="hidden" value="<%= currentURL %>"/>
	
	<aui:row>
		<aui:col cssClass="wrap-tinh-opt" width="100">
			<aui:select name="maTinh" id="maTinh" label="tinh" showEmptyOption="<%= true %>">
				<%
					for (DATAITEM tinh : listTinh) {
				%>
					<aui:option selected="<%= initTinh.contentEquals(tinh.getNode1()) %>" value="<%= tinh.getNode1() %>"><%= tinh.getName() %></aui:option>
				<%
					}
				%>
			</aui:select>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="60">
			<aui:row>
				<aui:col width="50">
					<aui:input name="maTram" cssClass="input50" 
						value="<%= Validator.isNotNull(tramCap) ? tramCap.getMaTram() : StringUtil.toUpperCase(maTram) %>" >
						<aui:validator name="required" errorMessage="nhap-ma-tram-cap"/>
					</aui:input>
				</aui:col>
				<aui:col width="50">
					<aui:input name="tenTram" cssClass="input50">
						<aui:validator name="required" errorMessage="nhap-ten-tram-cap"/>
					</aui:input>
				</aui:col>
			</aui:row>
			<aui:row>
				<aui:col width="50">
					<div id="optHuyen">
						<aui:select name="maHuyen" id="maHuyen" onChange="javascript:selectXa();" label="huyen" showEmptyOption="<%= true %>">

						</aui:select>
					</div>
				</aui:col>

				<aui:col width="50">
					<div id="optXa">
						<aui:select name="maXa" id="maXa" label="xa" showEmptyOption="<%= true %>">
							<%
								for (DATAITEM xa : listXa) {
							%>
								<aui:option value="<%= xa.getNode3() %>"><%= xa.getName() %></aui:option>
							<%
								}
							%>
						</aui:select>
					</div>
				</aui:col>
			</aui:row>
			
			<aui:row>
				<aui:col width="50">
					<aui:input name="diaChi" cssClass="input50" />
				</aui:col>
				<aui:col width="50">
					<aui:input name="tienDoXayDung" cssClass="input50" />
				</aui:col>
			</aui:row>
			
			<aui:row>
				<aui:col width="50">
					<aui:select name="loaiHinh" label="loai-hinh" showEmptyOption="<%= true %>">
						<aui:option value="1"><liferay-ui:message key="cap-nuoc-tu-chay"/></aui:option>
						<aui:option value="2"><liferay-ui:message key="su-dung-bom-dan"/></aui:option>
					</aui:select>
				</aui:col>
				
				<aui:col width="50">
					<aui:select name="maMoHinh" label="mo-hinh-quan-ly" showEmptyOption="<%= true %>">
						<%
							for (DATAITEM mohinh : listMoHinhQuanLy) {
						%>
							<aui:option value="<%=  mohinh.getNode1() %>"><%= mohinh.getName() %></aui:option>
						<%
							}
						%>
					</aui:select>
				</aui:col>
				
				<aui:row>
					<aui:col width="50">
						<aui:input name="congXuatThietKe"  cssClass="input50 formatPrice"></aui:input>
					</aui:col>
					<aui:col width="50">
						<aui:input name="tongDauNoiThietKe" cssClass="input50 formatPrice"></aui:input>
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col width="50">
						<aui:input name="soNguoiCapThietKe" cssClass="input50 formatPrice"></aui:input>
					</aui:col>
					<aui:col width="50">
						<aui:select name="tinhTrangDuAn" showEmptyOption="true">
							<aui:option value="1"><liferay-ui:message key="tinh-trang-du-an-1"/></aui:option>
							<aui:option value="2"><liferay-ui:message key="tinh-trang-du-an-2"/></aui:option>
							<aui:option value="3"><liferay-ui:message key="tinh-trang-du-an-3"/></aui:option>
							<aui:option value="4"><liferay-ui:message key="tinh-trang-du-an-4"/></aui:option>
						</aui:select>
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col width="50">
						<aui:select name="namXayDung" showEmptyOption="true">
							<%
								for (int i = curYear - 10; i <= curYear; i++) {
							%>
								<aui:option value="<%= i %>"><%= i %></aui:option>
							<% 
								}
							%>
						</aui:select>
					</aui:col>
					<aui:col width="50">
						<aui:select name="namHoanThanh" showEmptyOption="true">
							<%
								for (int i = curYear - 10; i <= curYear; i++) {
							%>
								<aui:option value="<%= i %>"><%= i %></aui:option>
							<% 
								}
							%>
						</aui:select>

					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col width="50">
						<aui:input name="ngayVanHanh" cssClass="input50"></aui:input>
					</aui:col>
					<aui:col width="50">
						<aui:select name="boMayVanHanh" showEmptyOption="true">
							<aui:option value="1"><liferay-ui:message key="co-va-da-duoc-dao-tao"/></aui:option>
							<aui:option value="2"><liferay-ui:message key="co-va-chua-duoc-dao-tao"/></aui:option>
							<aui:option value="3"><liferay-ui:message key="khong-co-bo-may-van-hanh"/></aui:option>
						</aui:select>
					</aui:col>
				</aui:row>

				<aui:row>
					<aui:col width="100">
						<div id="diaban">
						
						</div>
					</aui:col>
				</aui:row>

				<aui:row>
					<aui:col width="100">
						<aui:input name="ghiChu" type="textarea" cssClass="comment-form"></aui:input>
					</aui:col>
				</aui:row>
			</aui:row>
		</aui:col>
		
		<aui:col width="40">
			<aui:row>
				<aui:col width="50">
					<aui:input name="kinhDo" id="kinhDo" label="kinh-do" cssClass="input50"/>
				</aui:col>
				<aui:col width="50">
					<aui:input name="viDo" id="viDo" label="vi-do" cssClass="input50"/>
				</aui:col>
			</aui:row>

			<div id="locationpicker">
				<div id="us2" style="width: 100%; height: 200px;"></div>

				<script>$('#us2').locationpicker({
					location: {latitude: <%= Validator.isNotNull(tramCap) ? tramCap.getViDo() : "21.027764" %>, longitude: <%= Validator.isNotNull(tramCap) ? tramCap.getKinhDo() : "105.834160" %>},	
					radius: 300,
						inputBinding: {
							latitudeInput: $('#<portlet:namespace/>viDo'),
							longitudeInput: $('#<portlet:namespace/>kinhDo'),
						}
					});
				</script>
			</div>
		
		</aui:col>
	</aui:row>
	
	<aui:button-row>
		<aui:button type="submit" value="save"/>
		<aui:button href="<%= redirect %>" name="cancel" type="cancel" />
	</aui:button-row>

</aui:form>

<script type="text/javascript">
	AUI().ready(function(A){
		
		var capTinhInput = A.one("#<portlet:namespace/>maTinh");
		var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");
		
		selectHuyen(capTinhInput.val(), capHuyenInput.val());
		selectXa(capTinhInput.val(), capHuyenInput.val());
		selectDiaBan(capTinhInput.val());
		
		capTinhInput.on('change', function(){
			var capTinhId = capTinhInput.val();
			var capHuyenId = capHuyenInput.val();
			selectHuyen(capTinhId, capHuyenId);
			selectDiaBan(capTinhInput.val());
		});
		
		capHuyenInput.on('change', function(){
			var capTinhId = capTinhInput.val();
			var capHuyenId = capHuyenInput.val();
			selectXa(capTinhId, capHuyenId);
		});
		
		formatNumber();
	});
	
	function formatNumber() {
		
		AUI().all('input.formatPrice').each(function(node){
			
			var priceInput = node;
			
			var money = priceInput.val().toString();
			
			money = money.replace(/[^\d]/g,'');
			
			money = priceInput.val().toString();
			
			money = money.replace(/[^\d]/g,'');
			
			var length = money.length;
			
			var offset = 3;
			
			var periods = 0;
			
			var value = '';
			
			if(length > offset && length % offset == 0){
				periods = (Math.floor(length / offset)) -1;
			}else{
				periods = (Math.floor(length / offset));
			}
			
			if(periods > 0){
				for(var i = 0; i < length; i++){
									
					var periodIndex =  length - (periods * offset) -1;
					
					if(i == periodIndex && periods > 0){
						periods--;
						value += money.charAt(i) + '.';
					}else{
						value += money.charAt(i);
					}
				}

			}else{
				value = money;
			}
			
			priceInput.val(value);
			
		});
	}
	
	function selectDiaBan(maTinh){
		AUI().use('aui-base','aui-io-request', function(A){

			//aui ajax call to get updated content
			A.io.request('<%= selectDiaBan %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: {
					"<portlet:namespace />maTinh": maTinh
				},
				on: {
					success: function() {
						var diaban = A.one("#diaban");
						diaban.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
	
	
	function selectHuyen(capTinhId, capHuyenId){
		AUI().use('aui-base','aui-io-request', function(A){

			//aui ajax call to get updated content
			A.io.request('<%= selectHuyen %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: {
					"<portlet:namespace />initTinh": '<%= initTinh %>',
					"<portlet:namespace />initHuyen": '<%= initHuyen %>',
					"<portlet:namespace />initXa": '<%= initXa %>',
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
	
	function selectXa(){
		AUI().use('aui-base','aui-io-request', function(A){
			//aui ajax call to get updated content
			var capTinhInput = A.one("#<portlet:namespace/>maTinh");
			var capHuyenInput = A.one("#<portlet:namespace/>maHuyen");

			A.io.request('<%= selectXa %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />initTinh": '<%= initTinh %>',
					"<portlet:namespace />initHuyen": '<%= initHuyen %>',
					"<portlet:namespace />initXa": '<%= initXa %>',
					"<portlet:namespace />capTinhId": capTinhInput.val(),
					"<portlet:namespace />capHuyenId": capHuyenInput.val()
				},
				on: {
					success: function() {
						var optXa = A.one("#optXa");
						optXa.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
</script>