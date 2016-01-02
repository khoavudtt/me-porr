<%@page import="vn.dtt.sol.ns.kehoachkiemdemnuoc.terms.KeHoachKiemDemNuocTerms"%>
<%@page import="vn.dtt.sol.ns.business.KiemDemVienBussiness"%>
<%@page import="vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.sol.ns.tramcap.business.TramCapBusiness"%>
<%@page import="vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@ include file="/init.jsp" %>

<%
	String tramCapIdAjax = ParamUtil.getString(request, "tramCapIdAjax");
	int typeKiemDem = ParamUtil.getInteger(request, "typeKiemDem");
	int type=WebKeys.KDV_TOAN_TINH;
	if(typeKiemDem == WebKeys.KDV_TOAN_TINH){
		type = WebKeys.KDV_TOAN_TINH;
	}else if(typeKiemDem == WebKeys.KDV_TRAMCAP){
		type = WebKeys.KDV_TRAMCAP;
	}
	List<KiemDemVien>  listKiemDemVIen = new ArrayList<KiemDemVien>();
	listKiemDemVIen = KiemDemVienBussiness.findByCapHoatDongOrgCode(String.valueOf(type), tramCapIdAjax);
	String requiredLabel="";
	requiredLabel ="(*)";
	String dotLabel=":";
%>

<aui:select cssClass="input1001" required="true" name="<%=KeHoachKiemDemNuocTerms.KIEM_DEM_VIEN_ID %>" id="<%=DauNoiNuocTerms.TRAM_CAP_NUOC_ID %>"  label="<%= LanguageUtil.get(pageContext, \"kiem-dem-vien\") + dotLabel %>" showEmptyOption="<%= false %>">
	<aui:option value=""><liferay-ui:message key="-chon-"></liferay-ui:message></aui:option>
	<%
		for (KiemDemVien kiemDem : listKiemDemVIen) {
	%>
	<aui:option value="<%= kiemDem.getId() %>"><%= kiemDem.getHoVaTen() %></aui:option>
	<%
		}
	%>
</aui:select>




