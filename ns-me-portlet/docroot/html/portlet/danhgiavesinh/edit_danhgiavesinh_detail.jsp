<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.DanhGiaVeSinhXaTerm"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.terms.DanhGiaVeSinhXaTerm"%>
<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh"%>
<%@page import="vn.dtt.cmon.user.dao.model.UserMapping"%>
<%@page import="vn.dtt.sol.ns.util.MessageSuccess"%>
<%@page import="vn.dtt.sol.ns.util.MessageErrors"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.DauNoiNuocBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc"%>
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
<script type="text/javascript" src='http://maps.google.com/maps/api/js?sensor=false&libraries=places'></script>

<%
	String maTinh = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_TINH);
	String maHuyen = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_HUYEN);
	String maXa = (String)request.getAttribute(DanhGiaVeSinhXaTerm.MA_XA);
	String namBaoCao = (String)request.getAttribute(DanhGiaVeSinhXaTerm.NAM);
	UserMapping userMapping = (UserMapping)request.getAttribute("loginUserMapping");
	List<DATAITEM> listTinh = (List<DATAITEM>)request.getAttribute("listTinh");
	List<DATAITEM> listHuyen = (List<DATAITEM>)request.getAttribute("listHuyen"); 
	List<DATAITEM> listXa = (List<DATAITEM>)request.getAttribute("listXa");
	DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = (DanhGiaVeSinhXaNew)request.getAttribute("danhGiaVeSinhXaNew");
	int countHGDCoNhaTieuXayMoi = 0;
	int countHGDCoNhaTieu = 0;
	int countHGDCoNhaTieuHVS = 0;
	int countTruongHocHVS = 0;
	int countTramYTeHVS = 0;
	countHGDCoNhaTieuXayMoi = VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch("", "", danhGiaVeSinhXaNew.getMaXa(), "", "2", "","");
	countHGDCoNhaTieu = VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch("", "", danhGiaVeSinhXaNew.getMaXa(), "", "2", "","")
						+ VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch("", "", danhGiaVeSinhXaNew.getMaXa(), "", "3", "","")
						+ VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch("", "", danhGiaVeSinhXaNew.getMaXa(), "", "4", "","");
	countHGDCoNhaTieuHVS = VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch("", "", danhGiaVeSinhXaNew.getMaXa(), "", "2", "","")
							+ VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch("", "", danhGiaVeSinhXaNew.getMaXa(), "", "3", "","");
	countTruongHocHVS = VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch("", "", danhGiaVeSinhXaNew.getMaXa(), "", "1", "2", "")
						+ VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch("", "", danhGiaVeSinhXaNew.getMaXa(), "", "2", "2", "")
						+ VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch("", "", danhGiaVeSinhXaNew.getMaXa(), "", "3", "2", "");
	countTramYTeHVS = VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch("", "", danhGiaVeSinhXaNew.getMaXa(), "", "4", "2", "");
	if(danhGiaVeSinhXaNew.getSoHGDCoNhaTieu()<=0){
		danhGiaVeSinhXaNew.setSoHGDCoNhaTieu(countHGDCoNhaTieu);
	}else{
		danhGiaVeSinhXaNew.setSoHGDCoNhaTieu(danhGiaVeSinhXaNew.getSoHGDCoNhaTieu() + countHGDCoNhaTieu);
	}
	if(danhGiaVeSinhXaNew.getSoHGDCoNhaTieuHVS()<=0){
		danhGiaVeSinhXaNew.setSoHGDCoNhaTieuHVS(countHGDCoNhaTieuHVS);
	}else{
		danhGiaVeSinhXaNew.setSoHGDCoNhaTieuHVS(danhGiaVeSinhXaNew.getSoHGDCoNhaTieuHVS() + countHGDCoNhaTieuHVS);
	}
	if(danhGiaVeSinhXaNew.getSoTruongHocHVS()<=0)danhGiaVeSinhXaNew.setSoTruongHocHVS(countTruongHocHVS);
	if(danhGiaVeSinhXaNew.getSoTramYTeHVS()<=0)danhGiaVeSinhXaNew.setSoTramYTeHVS(countTramYTeHVS);
	String requiredLabel="(*)";
	String dotLabel=":";
	String dot="<font style=\"color:#ffffff\">.</font>";
	int year = Calendar.getInstance().get(Calendar.YEAR);
	String tongHGDTrongMau = (Integer)request.getAttribute("tongSoHGDTrongMau")+"";
%>
<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= Validator.isNotNull(danhGiaVeSinhXaNew)?LanguageUtil.format(pageContext, "x-xa-dang-ky-ve-sinh-toan-xa", NuocSachUtils.getNameXa(danhGiaVeSinhXaNew.getMaXa())):"" %>'
/>

<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/edit_danhgiavesinh.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/portlet/danhgiavesinh/edit_danhgiavesinh.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="editDanhGiaVesinh" var="editDanhGiaVesinhURL"/>
<aui:model-context bean="<%= Validator.isNotNull(danhGiaVeSinhXaNew)?danhGiaVeSinhXaNew.toEscapedModel():danhGiaVeSinhXaNew %>" model="<%= DanhGiaVeSinhXaNew.class %>" />
<aui:form action="<%= editDanhGiaVesinhURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Validator.isNotNull(danhGiaVeSinhXaNew) ? Constants.UPDATE : Constants.ADD %>"/>
	<aui:input name="onpageError" type="hidden" value="<%= onpageError%>" />
	<aui:input name="onpageSuccess" type="hidden" value="<%= onpageSuccess %>" />
	<aui:input name="<%=DanhGiaVeSinhXaTerm.ID %>" type="hidden" value="<%= Validator.isNotNull(danhGiaVeSinhXaNew) ? String.valueOf(danhGiaVeSinhXaNew.getId()) : StringPool.BLANK %>" />
	<aui:input name="<%=DanhGiaVeSinhXaTerm.MA_TINH %>" type="hidden" value="<%= maTinh %>" />
	<aui:input name="<%=DanhGiaVeSinhXaTerm.MA_HUYEN %>" type="hidden" value="<%= maHuyen %>" />
	<aui:input name="<%=DanhGiaVeSinhXaTerm.NAM %>" type="hidden" value="<%= namBaoCao %>" />
	<aui:input name="<%=DanhGiaVeSinhXaTerm.TI_LE_HGD_CO_NHA_TIEU %>" type="hidden" value="" />
	<aui:input name="<%=DanhGiaVeSinhXaTerm.TI_LE_HGD_CO_NHA_TIEU_HVS %>" type="hidden" value="" />
	<aui:input name="<%=DanhGiaVeSinhXaTerm.TI_LE_TRUONG_HOC_HVS %>" type="hidden" value="" />
	<aui:input name="<%=DanhGiaVeSinhXaTerm.TI_LE_TRAM_YTE_HVS %>" type="hidden" value="" />
	<aui:row cssClass="mHeigh">
		<aui:col width="40">
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tong-so-hgd-trong-mau\") +dotLabel %>" >
			<aui:input cssClass="input-col2" name="<%=DanhGiaVeSinhXaTerm.TONG_SO_HGD_TRONG_MAU %>" disabled="true" value="<%=tongHGDTrongMau %>"  label="" type="text" onChange='<%= renderResponse.getNamespace() + "updateValue();" %>'></aui:input>
			</aui:field-wrapper>
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-hgd-co-nha-tieu\") +dotLabel %>" >
			<aui:input cssClass="input-col2" name="<%=DanhGiaVeSinhXaTerm.SO_HGD_CO_NHA_TIEU %>" label="" type="text" onChange='<%= renderResponse.getNamespace() + "updateValue();" %>' ></aui:input>
			</aui:field-wrapper>
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-hgd-co-nha-tieu-fake\") +dotLabel %>" >
			<aui:input cssClass="input-col2" name="<%=DanhGiaVeSinhXaTerm.SO_HGD_CO_NHA_TIEU+\"fake\" %>" label="" value="<%=countHGDCoNhaTieu %>" type="text" onChange='<%= renderResponse.getNamespace() + "updateValue();" %>' ></aui:input>
			</aui:field-wrapper>
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-hgd-co-nha-tieu-hvs\") +dotLabel %>" >
			<aui:input cssClass="input-col2" name="<%=DanhGiaVeSinhXaTerm.SO_HGD_CO_NHA_TIEU_HVS %>" label="" type="text"  onChange='<%= renderResponse.getNamespace() + "updateValue();" %>' ></aui:input>
			</aui:field-wrapper>
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tong-so-truong-hoc\") +dotLabel %>" >
			<aui:input cssClass="input-col2" name="<%=DanhGiaVeSinhXaTerm.TONG_SO_TRUONG_HOC %>" label="" type="text"  onChange='<%= renderResponse.getNamespace() + "updateValue();" %>' ></aui:input>
			</aui:field-wrapper>
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-truong-hoc-hvs\") +dotLabel %>" >
			<aui:input cssClass="input-col2" name="<%=DanhGiaVeSinhXaTerm.SO_TRUONG_HOC_HVS %>" label="" type="text"  onChange='<%= renderResponse.getNamespace() + "updateValue();" %>' ></aui:input>
			</aui:field-wrapper>
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tong-so-tram-y-te\") +dotLabel %>" >
			<aui:input cssClass="input-col2" name="<%=DanhGiaVeSinhXaTerm.TONG_SO_TRAM_YTE %>" label="" type="text"  onChange='<%= renderResponse.getNamespace() + "updateValue();" %>' ></aui:input>
			</aui:field-wrapper>
			<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"so-tram-y-te-hvs\") +dotLabel %>" >
			<aui:input cssClass="input-col2" name="<%=DanhGiaVeSinhXaTerm.SO_TRAM_YTE_HVS %>" label="" type="text"  onChange='<%= renderResponse.getNamespace() + "updateValue();" %>' ></aui:input>
			</aui:field-wrapper>
			<aui:field-wrapper cssClass="inputArea1001" label="<%= LanguageUtil.get(pageContext, \"ghi-chu\") +dotLabel %>" >
			<aui:input type="textarea" cssClass="inputArea1001" name="<%=DanhGiaVeSinhXaTerm.GHI_CHU %>" label="" ></aui:input>
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="40">
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"tong-so-hgd\") +dotLabel %>" >
			<aui:input cssClass="input-col2" name="<%=DanhGiaVeSinhXaTerm.TONG_SO_HGD %>" disabled="true" label="" type="text" ></aui:input>
			</aui:field-wrapper>
			<aui:field-wrapper label=" ">
		<%=dot %>
		</aui:field-wrapper>
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ti-le-ho-gia-dinh-co-nha-tieu\") +dotLabel %>" >
		<aui:input disabled="true" cssClass="input-col2-no-border" prefix="%" name="<%=DanhGiaVeSinhXaTerm.TI_LE_HGD_CO_NHA_TIEU +\"1\"%>" type="text" label="" ></aui:input>
		</aui:field-wrapper>
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ti-le-ho-gia-dinh-co-nha-tieu-hvs\") +dotLabel %>" >
		<aui:input disabled="true" cssClass="input-col2-no-border" prefix="%" name="<%=DanhGiaVeSinhXaTerm.TI_LE_HGD_CO_NHA_TIEU_HVS +\"1\"%>" type="text" label="" ></aui:input>
		</aui:field-wrapper>
		<aui:field-wrapper label=" ">
		<%=dot %>
		</aui:field-wrapper>
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ti-le-truong-hoc-hvs\") +dotLabel %>" >
		<aui:input disabled="true" cssClass="input-col2-no-border" prefix="%" name="<%=DanhGiaVeSinhXaTerm.TI_LE_TRUONG_HOC_HVS +\"1\"%>" type="text"   label=""></aui:input>
		</aui:field-wrapper>
		<aui:field-wrapper label=" ">
		<%=dot %>
		</aui:field-wrapper>
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ti-le-tram-y-te-hvs\") +dotLabel %>" >
		<aui:input disabled="true" cssClass="input-col2-no-border" prefix="%" name="<%=DanhGiaVeSinhXaTerm.TI_LE_TRAM_YTE_HVS  +\"1\"%>" type="text"  label=""></aui:input>
		</aui:field-wrapper>
		<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"ket-luan-v-s-t-x\") +dotLabel +\" \" +LanguageUtil.get(pageContext, \"ket-luan-vstx-\"+danhGiaVeSinhXaNew.getKetLuanVSTX()) %>" >
		</aui:field-wrapper>
		</aui:col>
	</aui:row>
		
		<aui:row >	
			<aui:col width="100">
				<aui:button-row>
					<aui:button type="submit" value="luu"/>
				</aui:button-row>
			</aui:col>
		</aui:row>
</aui:form>

<style>
.inputArea1001{
max-width: 350px !important;
}
.aui .input-prepend .add-on:first-child, .aui .input-prepend .btn:first-child{
border-radius: 0px 2px 2px 0px !important;
}
.aui .input-prepend .add-on, .aui .input-prepend .btn{
margin-left:-1px !important;
float: right !important;
}
.input-col2{
max-width: 350px;
}
.input-col2-no-border{
max-width: 30px !important; 
box-shadow: inset 0 0px 0px rgba(0,0,0,0.075) !important;
}
.aui .control-group{
	margin-bottom:10px  !important;
height: 55px !important;
}
.mHeigh{
height: 650px;
}
.aui select {
	width: 94% !important;
}
.input-medium{
	max-width: 317px;
	width: 100% !important;
	margin-bottom: 0 !important;
}
.radio .form-validator-stack.help-inline{
	position: absolute !important;
	margin-top: -26px !important;
	margin-left: 15% !important;
	float: right;
    text-align: right !important;
}
</style>

<script type="text/javascript"> 
var A = AUI();
AUI().ready(
		function() {
			<portlet:namespace />updateValue();
	});
function <portlet:namespace />updateValue() {
	var row1 = A.one("#<portlet:namespace/>tongSoHGDTrongMau");
	var row2 = A.one("#<portlet:namespace/>soHGDCoNhaTieufake");
	var row3 = A.one("#<portlet:namespace/>soHGDCoNhaTieuHVS");
	var row4 = A.one("#<portlet:namespace/>tongSoTruongHoc");
	var row5 = A.one("#<portlet:namespace/>soTruongHocHVS");
	var row6 = A.one("#<portlet:namespace/>tongSoTramYTe");
	var row7 = A.one("#<portlet:namespace/>soTramYTeHVS");
	var tl1 = A.one("#<portlet:namespace/>tiLeHGDCoNhaTieu");
	var tl2 = A.one("#<portlet:namespace/>tiLeHGDCoNhaTieuHVS");
	var tl3 = A.one("#<portlet:namespace/>tiLeTruongHocHVS");
	var tl4 = A.one("#<portlet:namespace/>tiLeTramYTeHVS");
	var tl11 = A.one("#<portlet:namespace/>tiLeHGDCoNhaTieu1");
	var tl21 = A.one("#<portlet:namespace/>tiLeHGDCoNhaTieuHVS1");
	var tl31 = A.one("#<portlet:namespace/>tiLeTruongHocHVS1");
	var tl41 = A.one("#<portlet:namespace/>tiLeTramYTeHVS1");
	

	tl1.val(((parseInt(row2.get('value') == '' ? 0 : row2.get('value')) / parseInt(row1.get('value') == '' ? 0 : row1.get('value')))*100).toFixed(0));
	tl2.val(((parseInt(row3.get('value') == '' ? 0 : row3.get('value')) / parseInt(row1.get('value') == '' ? 0 : row1.get('value')))*100).toFixed(0));
	tl3.val(((parseInt(row5.get('value') == '' ? 0 : row5.get('value')) / parseInt(row4.get('value') == '' ? 0 : row4.get('value')))*100).toFixed(0));
	tl4.val(((parseInt(row7.get('value') == '' ? 0 : row7.get('value')) / parseInt(row6.get('value') == '' ? 0 : row6.get('value')))*100).toFixed(0));

	tl11.val(((parseInt(row2.get('value') == '' ? 0 : row2.get('value')) / parseInt(row1.get('value') == '' ? 0 : row1.get('value')))*100).toFixed(0));
	tl21.val(((parseInt(row3.get('value') == '' ? 0 : row3.get('value')) / parseInt(row1.get('value') == '' ? 0 : row1.get('value')))*100).toFixed(0));
	tl31.val(((parseInt(row5.get('value') == '' ? 0 : row5.get('value')) / parseInt(row4.get('value') == '' ? 0 : row4.get('value')))*100).toFixed(0));
	tl41.val(((parseInt(row7.get('value') == '' ? 0 : row7.get('value')) / parseInt(row6.get('value') == '' ? 0 : row6.get('value')))*100).toFixed(0));
}
</script>