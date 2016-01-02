<%@page import="vn.dtt.sol.ns.maungaunhien.utils.MauKiemKemUtils"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@ include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "capTinhId", "0");
	String maHuyen = ParamUtil.getString(request, "capHuyenId", "0");
	String maXa = ParamUtil.getString(request, "capXaId", "0");
	

	int soMau = MauKiemKemUtils.getSoMau(maTinh, maHuyen, maXa);
	
	int soMauChon = MauKiemKemUtils.getSoMauNgauNhien(5, soMau);
	
	int soMauDuPhong = 0;
	
	// neu so mau nho hon 500 thi so mau du phong = 0
	if (soMau > 500) 
		soMauDuPhong = new Double(soMauChon * 0.05).intValue();
%>

<aui:row>
	<aui:col width="30">
		<aui:input name="soMau" disabled="<%= true %>" inlineField="<%= true %>" value="<%= Integer.toString(soMau) %>" type="text" cssClass="input-1"></aui:input>
	</aui:col>
	<aui:col width="30">
		<aui:input name="soMauChon" disabled="<%= true %>" inlineField="<%= true %>" value="<%= Integer.toString(soMauChon) %>" type="text" cssClass="input-1"></aui:input>
	</aui:col>
	<aui:col width="30">
		<aui:input name="soMauDuPhong" disabled="<%= true %>" inlineField="<%= true %>" value="<%= Integer.toString(soMauDuPhong) %>" type="text" cssClass="input-1"></aui:input>
	</aui:col>
</aui:row>

<aui:input name="tongSoMau" type="hidden" value="<%= Integer.toString(soMauChon + soMauDuPhong) %>"/>
<aui:input name="tongSoHGD" type="hidden" value="<%= Integer.toString(soMau) %>"/>

<aui:input name="soMauNgauNhien" type="hidden" value="<%= Integer.toString(soMauChon) %>"/>
<aui:input name="soMauDuPhong" type="hidden" value="<%= Integer.toString(soMauDuPhong) %>"/>

	