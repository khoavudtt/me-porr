<%@page import="vn.dtt.sol.ns.reporting.utils.ReportConstant"%>
<%@page import="vn.dtt.sol.ns.reporting.utils.ReportUtils"%>
<%@page import="vn.dtt.sol.ns.reporting.utils.ReportBusinessUtils"%>
<%@include file="/init.jsp" %>
<%@page pageEncoding="UTF-8"%>

<%
	final Log log = LogFactoryUtil.getLog("html.portlet.report_export.jsp");
//so bao cao, nguoi lap, nguoi duyet, ngay bao cao, thang bao cao, nam bao cao
	String trangThai = ParamUtil.getString(request, "trangThai");// fix  = 2
	/*  start input  */
	String type = ParamUtil.getString(request, "type");
	
	String maTinh = ParamUtil.getString(request, "maTinh");
	String namBaoCao = ParamUtil.getString(request, "namBaoCao");	
	String soBaoCao = ParamUtil.getString(request, "soBaoCao");
	String nguoiLap = ParamUtil.getString(request, "nguoiLap");
	String nguoiDuyet = ParamUtil.getString(request, "nguoiDuyet");
	String ngayBaoCao = ParamUtil.getString(request, "ngayBaoCao");
	
	/*  end input  */
	String tenFileExport = "defaultPDF.pdfs";
	String fileName = "";
	String urlFileDowLoad = "";
	String urlFile = "";
	String realPath = "";
	log.info("==report_export.jsp======tenFileExport==macdinh==" + tenFileExport);
	
	realPath=ReportUtils.getTemplateReportFilePath(request);
	urlFile="/"+portletSession.getPortletContext().getPortletContextName()+"/"+ReportUtils.PATH_FILE_EXPORT+"/"+ReportConstant.TEN_FILE_DEFAULT+"";
	
	if(Validator.isNotNull(maTinh != null)
			&& Validator.isNotNull(type)
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_1_CHITIET_DSDAU_NOI_MOI_CAP_NUOC)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExportDli11CTDSDauNoiMoiCapNuoc(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao); 
		
	}
	
	if(Validator.isNotNull(maTinh)
			&& Validator.isNotNull(type)
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_1_TONGHOP_SO_DAU_NOI_MOI_HOAT_DONG)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExportDli11THSoDauNoiMoiHoatDong(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao); 
		
	}
	
	if (fileName.trim().length() > 0) {
		tenFileExport = fileName;
		log.info("==report_export.jsp======tenFileExport===" + tenFileExport);

		urlFile = request.getContextPath() + "/"+ReportUtils.PATH_FILE_EXPORT+"/" + tenFileExport;
		
	}
	
	log.info("UrlFile====" + urlFile);
	urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
%>


<div align="center">
	<OBJECT data="<%=urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
		type="text/html" TITLE="Báo cáo" 
		WIDTH="100%" HEIGHT="1500px"
		style="background: white; min-height: 100%;" >
			<a href="<%=urlFileDowLoad%>">Tải xuống file</a> 
	</object>
</div>