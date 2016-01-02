<%@page import="vn.dtt.sol.ns.kehoachkiemdemnuoc.terms.KeHoachKiemDemNuocTerms"%>
<%@page import="vn.dtt.sol.ns.util.NuocSachUtils"%>
<%@page import="vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms"%>
<%@page import="vn.dtt.sol.ns.util.WebKeys"%>
<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@ include file="/init.jsp" %>

<%
	String maTinh = ParamUtil.getString(request, "capTinhId");
	String maHuyen = ParamUtil.getString(request, "capHuyenId");
	String tramCapNuocId = (String)request.getAttribute(KeHoachKiemDemNuocTerms.TRAM_CAP_NUOC_ID);
	List<DATAITEM> lsHuyen = NuocSachUtils.getHuyenInTramCap(user, tramCapNuocId);
// 	List<DATAITEM> lsHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh);
	
	String requiredLabel="";
	 requiredLabel ="(*)";
	 String dotLabel=":";
%>
<aui:select required="true" showRequiredLabel="<%=false %>"  name="<%=DauNoiNuocTerms.MA_HUYEN %>" id="<%=DauNoiNuocTerms.MA_HUYEN %>" onChange="javascript:selectXa();" label="<%= LanguageUtil.get(pageContext, \"quan-huyen\") +\" \"+requiredLabel+dotLabel %>" showEmptyOption="<%= false %>" >
	<%
		for (DATAITEM huyen : lsHuyen) {
	%>
		<aui:option value="<%= huyen.getNode2() %>"><%= huyen.getName() %></aui:option>
	<%
		}
	%>
</aui:select>




