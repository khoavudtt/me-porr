<%@page import="vn.dtt.sol.ns.business.DataItemBusiness"%>
<%@page import="vn.dtt.cmon.dm.dao.model.DATAITEM"%>
<%@page import="vn.dtt.sol.ns.reporting.utils.ReportConstant"%>
<%@page import="vn.dtt.sol.ns.reporting.utils.ReportUtils"%>
<%@page import="vn.dtt.sol.ns.reporting.utils.ReportBusinessUtils"%>
<%@include file="/init.jsp" %>
<%@page pageEncoding="UTF-8"%>
<%
	final Log log = LogFactoryUtil.getLog("html.common.report_export.jsp");
	//so bao cao, nguoi lap, nguoi duyet, ngay bao cao, thang bao cao, nam bao cao
	/*  start input  */
	String type = ParamUtil.getString(request, "type");
	String duoiFile = ParamUtil.getString(request, "duoiFile");

	String thoiGianThuc = ParamUtil.getString(request, "thoiGianThuc");
	long baoCaoDLIId = ParamUtil.getLong(renderRequest, "baoCaoDLIId");
	
	
	String maTinh = ParamUtil.getString(request, "maTinh");
	String namBaoCao = ParamUtil.getString(request, "namBaoCao");	
	String soBaoCao = ParamUtil.getString(request, "soBaoCao");
	String nguoiLap = ParamUtil.getString(request, "nguoiLap");
	String nguoiDuyet = ParamUtil.getString(request, "nguoiDuyet");
	String ngayBaoCao = ParamUtil.getString(request, "ngayBaoCao");
	
	/*  end input  */
	
	String tenFileExport = ReportConstant.TEN_FILE_DEFAULT+"."+duoiFile;

	String fileName = "";

	String urlFileDowLoad = "";

	String urlFileDowLoadXLS = "";
	String urlFile = "";
	String urlFileXLS = "";

	String realPath = "";
	log.info("==report_export.jsp======tenFileExport==macdinh==" + tenFileExport);
	
	realPath=ReportUtils.getTemplateReportFilePath(request);
	urlFile="/"+portletSession.getPortletContext().getPortletContextName()+"/"+ReportUtils.PATH_FILE_EXPORT+"/"+tenFileExport;
	
	
	if(Validator.isNotNull(maTinh)
			&& Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(thoiGianThuc) 
			&& Validator.isNotNull(type) 
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_1_TONGHOP_SO_DAU_NOI_MOI_HOAT_DONG)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExport_Dli_11_TH(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao,nguoiLap,nguoiDuyet,duoiFile,thoiGianThuc); 
	}
	
	if(Validator.isNotNull(maTinh)
			&& Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(thoiGianThuc) 
			&& Validator.isNotNull(type)
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_1_CHITIET_DSDAU_NOI_MOI_CAP_NUOC)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExport_Dli_11_CT(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao,nguoiLap,nguoiDuyet,duoiFile,thoiGianThuc); 		
	}
	if(Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(type)
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_1_TU)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==");
		fileName = ReportBusinessUtils.actionExport_Dli_11_TU(realPath, namBaoCao, duoiFile); 		
			
	}
	
	if(Validator.isNotNull(maTinh)
			&& Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(thoiGianThuc) 
			&& Validator.isNotNull(type) 
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_2_TH)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExport_Dli_12_TH(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao,nguoiLap,nguoiDuyet,duoiFile,thoiGianThuc); 	
	}
	
	if(Validator.isNotNull(maTinh)
			&& Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(thoiGianThuc) 
			&& Validator.isNotNull(type) 
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_2_CT)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExport_Dli_12_CT(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao,nguoiLap,nguoiDuyet,duoiFile,thoiGianThuc); 	
	}
	
	if(Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(type)
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_2_TU)){
		fileName = ReportBusinessUtils.actionExport_Dli_12_TU(realPath, namBaoCao, duoiFile); 		
		log.info("==type--"+type);	
	}
	
	if(Validator.isNotNull(maTinh)
			&& Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(type) 
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI2_1_SNDTCHTCNBV)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExport_Dli_21(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao,nguoiLap,nguoiDuyet,duoiFile); 		
	}
	
	
	
	if(Validator.isNotNull(maTinh)
			&& Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(type) 
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI2_2)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExport_Dli_22(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao,nguoiLap,nguoiDuyet,duoiFile); 		
	}
	
	if( Validator.isNotNull(maTinh)
			&& Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(type) 
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI3)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExport_Dli_3(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao,nguoiLap,nguoiDuyet,duoiFile); 		

	}

	if(Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(type)
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI3_TU)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==");
		fileName = ReportBusinessUtils.actionExport_Dli_3_TU(realPath, namBaoCao, duoiFile); 		
			
	}
	if( Validator.isNotNull(maTinh)
			&& Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(type) 
			&& type.trim().equalsIgnoreCase(ReportConstant.DLI_TH)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExport_Dli_TH(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao,nguoiLap,nguoiDuyet,duoiFile); 		
	}
	
	if( Validator.isNotNull(maTinh)
			&& Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(type) 
			&& type.trim().equalsIgnoreCase(ReportConstant.THDK_DNSDN)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExport_THDK_DNSDN(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao,nguoiLap,nguoiDuyet,duoiFile); 		
	}
	
	if( Validator.isNotNull(maTinh)
			&& Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(type) 
			&& type.trim().equalsIgnoreCase(ReportConstant.THDK_NTHVSXM)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExport_THDK_NTHVSXM(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao,nguoiLap,nguoiDuyet,duoiFile); 		
	}
	
	if( Validator.isNotNull(maTinh)
			&& Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(type) 
			&& type.trim().equalsIgnoreCase(ReportConstant.TDTHCNTT)){
		log.info("==type--"+type);
		log.info("---report_export.jsp-----namBaoCao=="+namBaoCao+"==maTinh--"+maTinh+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		fileName = ReportBusinessUtils.actionExport_TDTHCNTT(realPath, namBaoCao, maTinh,soBaoCao,ngayBaoCao,nguoiLap,nguoiDuyet,duoiFile); 		
	}
	if( Validator.isNotNull(maTinh)
			&& Validator.isNotNull(namBaoCao) 
			&& Validator.isNotNull(type) 
			&& type.trim().equalsIgnoreCase(ReportConstant.THVG)){
		log.info("==type--"+type);
		
		fileName = ReportBusinessUtils.actionExport_TONGHOPVEGIOI(realPath, namBaoCao, maTinh, duoiFile);
	}
	
	if (fileName.trim().length() > 0) {
		tenFileExport = fileName;
		
		log.info("==report_export.jsp======tenFileExport===" + tenFileExport);

		urlFile = request.getContextPath() + "/"+ReportUtils.PATH_FILE_EXPORT+"/" + tenFileExport;
		
	}
	
	log.info("UrlFile====" + urlFile);
	urlFileDowLoad = urlFile;
	
	
%>
<liferay-portlet:resourceURL  var="excelFile" >
	
	<liferay-portlet:param name="typeRS" value="<%= type %>"/>
	<liferay-portlet:param name="duoiFileRS" value="<%=ReportConstant.DUOI_XLS %>"/>
	<liferay-portlet:param name="thoiGianThucRS" value="<%=  thoiGianThuc%>"/>
	<liferay-portlet:param name="maTinhRS" value="<%= maTinh %>"/>
	<liferay-portlet:param name="namBaoCaoRS" value="<%= namBaoCao %>"/>
	<liferay-portlet:param name="soBaoCaoRS" value="<%= soBaoCao %>"/>
	<liferay-portlet:param name="nguoiLapRS" value="<%= nguoiLap %>"/>
	<liferay-portlet:param name="nguoiDuyetRS" value="<%= nguoiDuyet %>"/>
	<liferay-portlet:param name="ngayBaoCaoRS" value="<%= ngayBaoCao %>"/>
</liferay-portlet:resourceURL>





<div align="center">
	<div>
		<div class="file-pdf">
			<a href="<%=urlFileDowLoad%>" target="_blank">Tải xuống PDF</a> 
		</div>
		<div class="file-excel">
			<a href="<%=excelFile.toString()%>" target="_blank">Tải xuống Excel</a> 
		</div>
	</div>	
	<OBJECT data="<%=urlFileDowLoad%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
		type="application/pdf" TITLE="Báo cáo" 
		WIDTH="100%" HEIGHT="900px"
		style="background: white; min-height: 100%;" >
			
	</OBJECT>


</div>