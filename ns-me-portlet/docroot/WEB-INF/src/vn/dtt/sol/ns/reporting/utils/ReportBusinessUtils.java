package vn.dtt.sol.ns.reporting.utils;

import java.util.HashMap;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import vn.dtt.sol.ns.reporting.model.dli11ct.DSDauNoiMoiCapNuoc;
import vn.dtt.sol.ns.reporting.model.dli11ct.DSDauNoiMoiCapNuocExport;
import vn.dtt.sol.ns.reporting.model.dli11th.SoDauNoiMoiHoatDong;
import vn.dtt.sol.ns.reporting.model.dli11th.SoDauNoiMoiHoatDongExport;
import vn.dtt.sol.ns.reporting.model.dli11tu.TUDauNoiCapNuoc;
import vn.dtt.sol.ns.reporting.model.dli11tu.TUDauNoiCapNuocExport;
import vn.dtt.sol.ns.reporting.model.dli12ct.DSNhaTieuHGDXayMoi;
import vn.dtt.sol.ns.reporting.model.dli12ct.DSNhaTieuHGDXayMoiExport;
import vn.dtt.sol.ns.reporting.model.dli12th.SoNhaTieuHGDXayMoiHVS;
import vn.dtt.sol.ns.reporting.model.dli12th.SoNhaTieuHGDXayMoiHVSExport;
import vn.dtt.sol.ns.reporting.model.dli12tu.SoNhaTieuXayMoiHVS;
import vn.dtt.sol.ns.reporting.model.dli12tu.SoNhaTieuXayMoiHVSExport;
import vn.dtt.sol.ns.reporting.model.dli21.HTCapNuocBenVung;
import vn.dtt.sol.ns.reporting.model.dli21.HTCapNuocBenVungExport;
import vn.dtt.sol.ns.reporting.model.dli22.SoNgDcTiepCanVsDienVSTX;
import vn.dtt.sol.ns.reporting.model.dli22.SoNgDcTiepCanVsDienVSTXExport;
import vn.dtt.sol.ns.reporting.model.dli3.KHTinhVaBaoCaoCT;
import vn.dtt.sol.ns.reporting.model.dli3.KHTinhVaBaoCaoCTExport;
import vn.dtt.sol.ns.reporting.model.dli3tu.KHNamCuaTinhVaBaoCaoCT;
import vn.dtt.sol.ns.reporting.model.dli3tu.KHNamCuaTinhVaBaoCaoCTExport;
import vn.dtt.sol.ns.reporting.model.dlith.TomTatTDTHCSGiaiNgan;
import vn.dtt.sol.ns.reporting.model.dlith.TomTatTDTHCSGiaiNganExport;
import vn.dtt.sol.ns.reporting.model.kehoachnc.KeHoachNc;
import vn.dtt.sol.ns.reporting.model.kehoachnc.KeHoachNcExport;
import vn.dtt.sol.ns.reporting.model.kehoachvesinh.KeHoachVS;
import vn.dtt.sol.ns.reporting.model.kehoachvesinh.KeHoachVSExport;
import vn.dtt.sol.ns.reporting.model.tdthcntt.TienDoThucHienCapNuoc;
import vn.dtt.sol.ns.reporting.model.tdthcntt.TienDoThucHienCapNuocExport;
import vn.dtt.sol.ns.reporting.model.thdkdaunoisdnuoc.DauNoiSDNcKH;
import vn.dtt.sol.ns.reporting.model.thdkdaunoisdnuoc.DauNoiSDNcKHExport;
import vn.dtt.sol.ns.reporting.model.thdknhatieuhvsxm.NhaTieuHVSXM;
import vn.dtt.sol.ns.reporting.model.thdknhatieuhvsxm.NhaTieuHVSXMExport;
import vn.dtt.sol.ns.reporting.model.tonghopvegioi.TongHopVeGioi;
import vn.dtt.sol.ns.reporting.model.tonghopvegioi.TongHopVeGioiExport;
import vn.dtt.sol.ns.util.format.ConvertUtil;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

public class ReportBusinessUtils {
	
	private static Log log = LogFactoryUtil.getLog(ReportBusinessUtils.class);
	
	private static HashMap<String, Object> parameters = null;
	
	
	
	public static String actionExport_Dli_11_TH(String realPath, String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String duoiFile, String thoigianthuc){
		String fileUrl = "";
		log.debug("--actionExport_Dli_11_TH==maTinh--"+maTinh+"--namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		
		try {
			String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI1_1_TONGHOP_SO_DAU_NOI_MOI_HOAT_DONG_EXPORT+"_"+thoigianthuc;
			SoDauNoiMoiHoatDong objectReport = SoDauNoiMoiHoatDongExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet,thoigianthuc);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.DLI_1_1, ReportConstant.GIAY_DLI1_1_TONGHOP_SO_DAU_NOI_MOI_HOAT_DONG_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExport_Dli_11_CT(String realPath, String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String duoiFile, String thoigianthuc){
		String fileUrl = "";
		log.debug("--actionExport_Dli_11_CT==maTinh--"+maTinh+"--namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		
		try {
			String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI1_1_CHITIET_DSDAU_NOI_MOI_CAP_NUOC_EXPORT+"_"+thoigianthuc;
			DSDauNoiMoiCapNuoc objectReport = DSDauNoiMoiCapNuocExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet,thoigianthuc);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.DLI_1_1, ReportConstant.GIAY_DLI1_1_CHITIET_DSDAU_NOI_MOI_CAP_NUOC_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			
			log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExport_Dli_11_TU(String realPath, String namBaoCao, String duoiFile){
		String fileUrl = "";
		log.debug("--actionExport_Dli_11_TU==namBaoCao=="+namBaoCao);
		try {
			String tenFile_Export = namBaoCao+"_"+ReportConstant.GIAY_DLI1_1_TU_EXPORT;
			TUDauNoiCapNuoc objectReport = TUDauNoiCapNuocExport.getModel(namBaoCao);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.DLI_1_1, ReportConstant.GIAY_DLI1_1_TU_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExport_Dli_12_TH(String realPath, String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String duoiFile, String thoigianthuc ){
		String fileUrl = "";
		log.debug("--actionExport_Dli_12_TH==maTinh--"+maTinh+"--namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		try {
			String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI1_2_TH_EXPORT+"_"+thoigianthuc;
			SoNhaTieuHGDXayMoiHVS objectReport = SoNhaTieuHGDXayMoiHVSExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet, thoigianthuc);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.DLI_1_2, ReportConstant.GIAY_DLI1_2_TH_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExport_Dli_12_CT(String realPath, String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String duoiFile, String thoigianthuc){
		String fileUrl = "";
		log.debug("--actionExport_Dli_12_CT==maTinh--"+maTinh+"--namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		try {
			String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI1_2_CT_EXPORT+"_"+thoigianthuc;
			DSNhaTieuHGDXayMoi objectReport = DSNhaTieuHGDXayMoiExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet,thoigianthuc);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.DLI_1_2, ReportConstant.GIAY_DLI1_2_CT_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExport_Dli_12_TU(String realPath, String namBaoCao, String duoiFile){
		String fileUrl = "";
		log.debug("--actionExport_Dli_12_TU==namBaoCao=="+namBaoCao);
		try {
			String tenFile_Export = namBaoCao+"_"+ReportConstant.GIAY_DLI1_2_TU_EXPORT;
			SoNhaTieuXayMoiHVS objectReport = SoNhaTieuXayMoiHVSExport.getModel(namBaoCao);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.DLI_1_2, ReportConstant.GIAY_DLI1_2_TU_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExport_Dli_21(String realPath, String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String duoiFile){
		String fileUrl = "";
		log.debug("--actionExport_Dli_21==maTinh--"+maTinh+"--namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		try {
			String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI2_1_SNDTCHTCNBV_EXPORT;
			HTCapNuocBenVung objectReport = HTCapNuocBenVungExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.DLI_2_1, ReportConstant.GIAY_DLI2_1_SNDTCHTCNBV_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	
	
	
	public static String actionExport_Dli_22(String realPath, String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String duoiFile){
		String fileUrl = "";
		log.debug("--actionExport_Dli_22==maTinh--"+maTinh+"--namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		try {
			String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI2_2_EXPORT;
			SoNgDcTiepCanVsDienVSTX objectReport = SoNgDcTiepCanVsDienVSTXExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.DLI_2_2, ReportConstant.GIAY_DLI2_2_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExport_Dli_3(String realPath, String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String duoiFile){
		String fileUrl = "";
		log.debug("--actionExport_Dli_3==maTinh--"+maTinh+"--namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		try {
			String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI3_EXPORT;
			KHTinhVaBaoCaoCT objectReport = KHTinhVaBaoCaoCTExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.DLI_3, ReportConstant.GIAY_DLI3_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExport_Dli_3_TU(String realPath, String namBaoCao, String duoiFile){
		String fileUrl = "";
		log.debug("--actionExport_Dli_3==namBaoCao=="+namBaoCao+"--");
		try {
			String tenFile_Export = namBaoCao+"_"+ReportConstant.GIAY_DLI3_TU_EXPORT;
			KHNamCuaTinhVaBaoCaoCT objectReport = KHNamCuaTinhVaBaoCaoCTExport.getModel(namBaoCao);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.DLI_3, ReportConstant.GIAY_DLI3_TU_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExport_Dli_TH(String realPath, String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String duoiFile){
		String fileUrl = "";
		log.debug("--actionExport_Dli_TH==maTinh--"+maTinh+"--namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		try {
			String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI_TH_EXPORT;
			TomTatTDTHCSGiaiNgan objectReport = TomTatTDTHCSGiaiNganExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.DLI_TH, ReportConstant.GIAY_DLI_TH_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExport_THDK_DNSDN(String realPath, String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String duoiFile){
		String fileUrl = "";
		log.debug("--actionExport_THDK_DNSDN==maTinh--"+maTinh+"--namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		try {
			String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_THDK_DNSDN_EXPORT;
			DauNoiSDNcKH objectReport = DauNoiSDNcKHExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.TONGHOPDUKIEN, ReportConstant.GIAY_THDK_DNSDN_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	
	public static String actionExport_THDK_NTHVSXM(String realPath, String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String duoiFile){
		String fileUrl = "";
		log.debug("--actionExport_THDK_NTHVSXM==maTinh--"+maTinh+"--namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao);
		try {
			String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_THDK_NTHVSXM_EXPORT;
			NhaTieuHVSXM objectReport = NhaTieuHVSXMExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.TONGHOPDUKIEN, ReportConstant.GIAY_THDK_NTHVSXM_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	

	
	public static String actionExport_TDTHCNTT(String realPath, String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String duoiFile){
		String fileUrl = "";
		log.debug("--actionExport_Dli_11_TU==namBaoCao=="+namBaoCao);
		try {
			String tenFile_Export = namBaoCao+"_"+ReportConstant.GIAY_TDTHCNTT_EXPORT;
			TienDoThucHienCapNuoc objectReport = TienDoThucHienCapNuocExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.BAOCAOMOI, ReportConstant.GIAY_TDTHCNTT_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		} catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	public static String actionExport_TONGHOPVEGIOI(String realPath, String namBaoCao, String maTinh, String duoiFile){
		String fileUrl = "";
		log.debug("--actionExport_TONGHOPVEGIOI==namBaoCao=="+namBaoCao);
		try {
			String tenFile_Export = namBaoCao+"_"+ReportConstant.GIAY_TONGHOPVEGIOI_EXPORT;
			TongHopVeGioi objectReport = TongHopVeGioiExport.getModel(namBaoCao, maTinh);
			JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
			parameters = new HashMap<String, Object>();
			fileUrl = ReportUtils.exportFunction(realPath, ReportUtils.BAOCAOMOI, ReportConstant.GIAY_TONGHOPVEGIOI_TEMP, tenFile_Export, dataSource, parameters,duoiFile);
		}catch (Exception e) {
			log.error(e);
		} 
		return fileUrl;
	}
	public static void inBaoCaoDLI(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		log.info("----inBaoCaoDLI---vao inbaocao");
		HashMap<String, Object> parameters = null;
		String currentTimeFull = FormatData.getCurrentTimeFull();
		
		String type = ParamUtil.getString(resourceRequest, "typeRS");
		String duoiFile = ParamUtil.getString(resourceRequest, "duoiFileRS");
		String thoiGianThuc = ParamUtil.getString(resourceRequest, "thoiGianThucRS");
		
		String maTinh = ParamUtil.getString(resourceRequest, "maTinhRS");
		String namBaoCao = ParamUtil.getString(resourceRequest, "namBaoCaoRS");	
		String soBaoCao = ParamUtil.getString(resourceRequest, "soBaoCaoRS");
		String nguoiLap = ParamUtil.getString(resourceRequest, "nguoiLapRS");
		String nguoiDuyet = ParamUtil.getString(resourceRequest, "nguoiDuyetRS");
		String ngayBaoCao = ParamUtil.getString(resourceRequest, "ngayBaoCaoRS");
		
		String keHoachId = ParamUtil.getString(resourceRequest, "keHoachId");
		
		
		String realPath = ReportUtils.getTemplateReportFilePath(resourceRequest);
		log.info("--inBaoCaoDLI--realpath--"+realPath+"==");
		
		//String tenFileExport = ReportConstant.TEN_FILE_DEFAULT+"."+duoiFile;
		log.info("---inBaoCaoDLI--duoiFile--"+duoiFile+"====");
		log.info("---type---"+type+"===");
		try{
			if(Validator.isNotNull(maTinh)
					&& Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(thoiGianThuc) 
					&& Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_1_TONGHOP_SO_DAU_NOI_MOI_HOAT_DONG)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI1_1_TONGHOP_SO_DAU_NOI_MOI_HOAT_DONG_EXPORT+"_"+thoiGianThuc+"_"+currentTimeFull;
				SoDauNoiMoiHoatDong objectReport = SoDauNoiMoiHoatDongExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet,thoiGianThuc);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.DLI_1_1, ReportConstant.GIAY_DLI1_1_TONGHOP_SO_DAU_NOI_MOI_HOAT_DONG_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			
			if(Validator.isNotNull(maTinh)
					&& Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(thoiGianThuc) 
					&& Validator.isNotNull(type)
					&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_1_CHITIET_DSDAU_NOI_MOI_CAP_NUOC)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI1_1_CHITIET_DSDAU_NOI_MOI_CAP_NUOC_EXPORT+"_"+thoiGianThuc+"_"+currentTimeFull;
				DSDauNoiMoiCapNuoc objectReport = DSDauNoiMoiCapNuocExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet,thoiGianThuc);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.DLI_1_1, ReportConstant.GIAY_DLI1_1_CHITIET_DSDAU_NOI_MOI_CAP_NUOC_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			
			if( Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(type)
					&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_1_TU)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+ReportConstant.GIAY_DLI1_1_TU_EXPORT+"_"+currentTimeFull;
				TUDauNoiCapNuoc objectReport = TUDauNoiCapNuocExport.getModel(namBaoCao);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.DLI_1_1, ReportConstant.GIAY_DLI1_1_TU_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			
			if(Validator.isNotNull(maTinh)
					&& Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(thoiGianThuc) 
					&& Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_2_TH)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI1_2_TH_EXPORT+"_"+thoiGianThuc+"_"+currentTimeFull;
				SoNhaTieuHGDXayMoiHVS objectReport = SoNhaTieuHGDXayMoiHVSExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet, thoiGianThuc);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.DLI_1_2, ReportConstant.GIAY_DLI1_2_TH_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			
			if(Validator.isNotNull(maTinh)
					&& Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(thoiGianThuc) 
					&& Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_2_CT)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI1_2_CT_EXPORT+"_"+thoiGianThuc+"_"+currentTimeFull;
				DSNhaTieuHGDXayMoi objectReport = DSNhaTieuHGDXayMoiExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet,thoiGianThuc);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.DLI_1_2, ReportConstant.GIAY_DLI1_2_CT_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			
			if( Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(type)
					&& type.trim().equalsIgnoreCase(ReportConstant.DLI1_2_TU)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+ReportConstant.GIAY_DLI1_2_TU_EXPORT+"_"+currentTimeFull;
				SoNhaTieuXayMoiHVS objectReport = SoNhaTieuXayMoiHVSExport.getModel(namBaoCao);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.DLI_1_2, ReportConstant.GIAY_DLI1_2_TU_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			
			if(Validator.isNotNull(maTinh)
					&& Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.DLI2_1_SNDTCHTCNBV)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI2_1_SNDTCHTCNBV_EXPORT+"_"+currentTimeFull;
				HTCapNuocBenVung objectReport = HTCapNuocBenVungExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.DLI_2_1, ReportConstant.GIAY_DLI2_1_SNDTCHTCNBV_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			
			
			
			if(Validator.isNotNull(maTinh)
					&& Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.DLI2_2)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI2_2_EXPORT+"_"+currentTimeFull;
				SoNgDcTiepCanVsDienVSTX objectReport = SoNgDcTiepCanVsDienVSTXExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.DLI_2_2, ReportConstant.GIAY_DLI2_2_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			
			if( Validator.isNotNull(maTinh)
					&& Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.DLI3)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI3_EXPORT+"_"+currentTimeFull;
				KHTinhVaBaoCaoCT objectReport = KHTinhVaBaoCaoCTExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.DLI_3, ReportConstant.GIAY_DLI3_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			
			if(  Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.DLI3_TU)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+ReportConstant.GIAY_DLI3_TU_EXPORT+"_"+currentTimeFull;
				KHNamCuaTinhVaBaoCaoCT objectReport = KHNamCuaTinhVaBaoCaoCTExport.getModel(namBaoCao);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.DLI_3, ReportConstant.GIAY_DLI3_TU_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			if( Validator.isNotNull(maTinh)
					&& Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.DLI_TH)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_DLI_TH_EXPORT+"_"+currentTimeFull;
				TomTatTDTHCSGiaiNgan objectReport = TomTatTDTHCSGiaiNganExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.DLI_TH, ReportConstant.GIAY_DLI_TH_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			
			if( Validator.isNotNull(maTinh)
					&& Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.THDK_DNSDN)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_THDK_DNSDN_EXPORT+"_"+currentTimeFull;
				DauNoiSDNcKH objectReport = DauNoiSDNcKHExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.TONGHOPDUKIEN, ReportConstant.GIAY_THDK_DNSDN_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			
			if( Validator.isNotNull(maTinh)
					&& Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.THDK_NTHVSXM)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+maTinh+"_"+ReportConstant.GIAY_THDK_NTHVSXM_EXPORT+"_"+currentTimeFull;
				NhaTieuHVSXM objectReport = NhaTieuHVSXMExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.TONGHOPDUKIEN, ReportConstant.GIAY_THDK_NTHVSXM_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			
			if( Validator.isNotNull(maTinh)
					&& Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.TDTHCNTT)){
				log.info("==type--"+type);
				
				String tenFile_Export = namBaoCao+"_"+ReportConstant.GIAY_TDTHCNTT_EXPORT+"_"+currentTimeFull;
				TienDoThucHienCapNuoc objectReport = TienDoThucHienCapNuocExport.getModel(namBaoCao, maTinh,  soBaoCao, ngayBaoCao,nguoiLap,nguoiDuyet);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.BAOCAOMOI, ReportConstant.GIAY_TDTHCNTT_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
				
			}
			if( Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.KHNUOC)){
				KeHoachNc objectReport = KeHoachNcExport.getModel(keHoachId);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				String tenFile_Export = namBaoCao+"_"+ConvertUtil.unAccent(objectReport.getTenKiemDemVien())+"_"+ReportConstant.GIAY_KHNUOC_EXPORT+"_"+currentTimeFull;
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.BAOCAOMOI, ReportConstant.GIAY_KHNUOC_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
			}
			
			if( Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.KHVS)){
				KeHoachVS objectReport = KeHoachVSExport.getModel(keHoachId);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				String tenFile_Export = ConvertUtil.unAccent(objectReport.getLstKeHoachVSHGD().get(0).getTenKiemDemVien())+"_"+ReportConstant.GIAY_KHVESINH_EXPORT+"_"+currentTimeFull;
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.BAOCAOMOI, ReportConstant.GIAY_KHVESINH_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
			}
			
			if(  Validator.isNotNull(maTinh) 
					&&Validator.isNotNull(namBaoCao) 
					&& Validator.isNotNull(type) 
					&& type.trim().equalsIgnoreCase(ReportConstant.THVG)){
				TongHopVeGioi objectReport = TongHopVeGioiExport.getModel(namBaoCao, maTinh);
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau( objectReport);
				parameters = new HashMap<String, Object>();
				String tenFile_Export = namBaoCao+"_"+ReportConstant.GIAY_TONGHOPVEGIOI_EXPORT+"_"+currentTimeFull;
				ReportUtils.exportFunctionResourceURL(realPath, ReportUtils.BAOCAOMOI, ReportConstant.GIAY_TONGHOPVEGIOI_TEMP, tenFile_Export, dataSource, parameters,duoiFile,resourceResponse);
			}
			
		}catch (Exception e) {
			log.error(e);
		}
		
		
	}
}
