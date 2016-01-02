<%@page import="vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhImpl"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh"%>
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

<%@include file="/init.jsp" %>

<liferay-util:include page='<%= templatePath + "top_tabs_tramcap.jsp" %>' servletContext="<%= application %>" />

<div class="title">
	<liferay-ui:message key='danh-gia-van-hanh'/>
</div>

<%
	TramCapNuoc tramCap = (TramCapNuoc) renderRequest.getAttribute("tramCap");
	
	Calendar cal = Calendar.getInstance();
	
	DanhGiaVanHanh danhGiaVanHanh = (DanhGiaVanHanh) renderRequest.getAttribute("danhGia");
%>

<c:choose>
	<c:when test="<%= Validator.isNotNull(tramCap) %>">
		<portlet:renderURL var="onpageError">
			<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/edit_vanhanh_tramcap.jsp"/>
			<portlet:param name="tramCapId" value="<%= Long.toString(tramCap.getId()) %>"/>
			<portlet:param name="danhGiaId" value="<%= Validator.isNotNull(danhGiaVanHanh) ? Long.toString(danhGiaVanHanh.getId()) : StringPool.BLANK %>"/>
		</portlet:renderURL>
		
		<portlet:renderURL var="onpageSuccess">
			<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/view_vanhanh_tramcap.jsp"/>
			<portlet:param name="tramCapId" value="<%= Long.toString(tramCap.getId()) %>"/>
			<portlet:param name="danhGiaId" value="<%= Validator.isNotNull(danhGiaVanHanh) ? Long.toString(danhGiaVanHanh.getId()) : StringPool.BLANK %>"/>
		</portlet:renderURL>
			
		
		<portlet:actionURL name="adDanhGiaVanHanh" var="addDanhGiaURL"/>
		
		<aui:form action="<%= addDanhGiaURL %>" method="post" name="fm">
			<aui:model-context bean="<%= danhGiaVanHanh %>" model="<%= DanhGiaVanHanh.class %>" />
			
			<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(danhGiaVanHanh) ? Constants.UPDATE : Constants.ADD %>"/>
			<aui:input name="danhGiaId" type="hidden" value="<%= Validator.isNotNull(danhGiaVanHanh) ? danhGiaVanHanh.getId() : 0 %>" />
			<aui:input name="tramCapId" type="hidden" value="<%= Long.toString(tramCap.getId()) %>"/>
			<aui:input name="onpageError" type="hidden" value="<%= currentURL %>" />
			<aui:input name="onpageSuccess" type="hidden" value="<%= onpageSuccess %>" />
			
			<aui:row>
				<aui:col width="25">
					<aui:select name="thang" inlineField="true" showEmptyOption="true">
						<%
							int currMonth = cal.get(Calendar.MONTH) + 1;
							for (int i = 1; i <= 12; i++) {
								if (i >= currMonth + 1)
									break;
						%>
								<aui:option selected="<%= i == currMonth ? true : false %>" value="<%= i %>"><%= i %></aui:option>
						<%
							}
						%>
					</aui:select>
				</aui:col>
				<aui:col width="25">
					<aui:select name="nam" inlineField="true">
						<%
							int currYear = cal.get(Calendar.YEAR);
						
							for (int j = (currYear - 3); j <= currYear ; j++) {
						%>
								<aui:option selected="<%= j == currYear ? true : false %>" value="<%= j %>"><%= j %></aui:option>
						<%
							}
						%>
					</aui:select>				
				</aui:col>
			</aui:row>
			<div id="danhgia">
				<aui:row>
					<aui:col width="25">
						<aui:select name="trangThaiCapNuoc" showEmptyOption="true">
							<aui:option value="<%= 1 %>" ><liferay-ui:message key="on-dinh"/></aui:option>
							<aui:option value="<%= 2 %>" ><liferay-ui:message key="khong-on-dinh"/></aui:option>
							<aui:option value="<%= 3 %>" ><liferay-ui:message key="khong-cap-nuo"/></aui:option>
						</aui:select>
					</aui:col>
					<aui:col width="25">
						<aui:input name="congXuatThucTe" cssClass="formatPrice"></aui:input>
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col width="25">
						<aui:select name="nuocDatTieuChuan" showEmptyOption="true">
							<aui:option value="<%= 1 %>" ><liferay-ui:message key="nuoc-dat-tieu-chuan"/></aui:option>
							<aui:option value="<%= 2 %>" ><liferay-ui:message key="nuoc-khong-dat-tieu-chuan"/></aui:option>
						</aui:select>
					</aui:col>
					<aui:col width="25">
						<aui:select name="nuocCoAsen" showEmptyOption="true">
							<aui:option value="<%= 1 %>" ><liferay-ui:message key="co-asen"/></aui:option>
							<aui:option value="<%= 0 %>" ><liferay-ui:message key="khong-co-asen"/></aui:option>
						</aui:select>
					</aui:col>
				</aui:row>
	
				<aui:row>
					<aui:col width="25">
						<aui:input name="sanLuongSanXuat" cssClass="formatPrice"></aui:input>
					</aui:col>
					<aui:col width="25">
						<aui:input name="sanLuongTieuHao" cssClass="formatPrice"></aui:input>
					</aui:col>
				</aui:row>
	
				<aui:row>
					<aui:col width="25">
						<aui:input name="doanhThu" cssClass="formatPrice"></aui:input>
						<aui:input name="chiPhiHoaChat" cssClass="formatPrice" ></aui:input>
						<aui:input name="chiPhiDien" cssClass="formatPrice" ></aui:input>
					</aui:col>
					<aui:col width="25">
						<aui:input name="luongNhanVien" cssClass="formatPrice" ></aui:input>
						<aui:input name="chiPhiSuaChua" cssClass="formatPrice" ></aui:input>
						<aui:input name="ghiChu" type="textarea" cssClass="fm-textarea" ></aui:input>
					</aui:col>
				</aui:row>
			</div>
			<aui:button-row>
				<aui:button type="submit" value="save"/>
				<aui:button href="<%= redirect %>" name="cancel" type="cancel" />
			</aui:button-row>

		</aui:form>
	</c:when>
	<c:otherwise>
		<liferay-ui:message key="thong-tin-tram-cap-khong-ton-tai"/>
	</c:otherwise>
</c:choose>

<liferay-portlet:renderURL var="selectDateURL" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/portlet/tramcapnuoc/_edit_vanhanh.jsp"/>
</liferay-portlet:renderURL>

<script type="text/javascript">
	AUI().ready(function(A){
		var thangInput = A.one("#<portlet:namespace/>thang");
		var namInput = A.one("#<portlet:namespace/>nam");
		
		formatNumber();
		
		selectDate(thangInput.val(), namInput.val(), '<%= Validator.isNotNull(tramCap) ? tramCap.getId() : 0 %>');

		thangInput.on('change', function(){
			var thangId = thangInput.val();
			var namId = namInput.val();
			selectDate(thangId, namId, '<%= Validator.isNotNull(tramCap) ? tramCap.getId() : 0 %>');
		});
		
		namInput.on('change', function(){
			var thangId = thangInput.val();
			var namId = namInput.val();
			selectDate(thangId, namId, '<%= Validator.isNotNull(tramCap) ? tramCap.getId() : 0 %>');
		});
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

	function selectDate(thangId, namId, tramCapId){
		AUI().use('aui-base','aui-io-request', function(A){

			//aui ajax call to get updated content
			A.io.request('<%= selectDateURL %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />namId": namId,
					"<portlet:namespace />thangId": thangId,
					"<portlet:namespace />tramCapId": tramCapId
				},
				on: {
					success: function() {
						var danhGia = A.one("#danhgia");
						danhGia.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
	
</script>
