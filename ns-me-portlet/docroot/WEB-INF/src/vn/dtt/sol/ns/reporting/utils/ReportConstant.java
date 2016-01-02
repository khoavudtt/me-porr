
package vn.dtt.sol.ns.reporting.utils;

import com.liferay.util.portlet.PortletProps;

public class ReportConstant {
	// dinh nghia tieng viet
	public static final String CO = PortletProps.get("vn.ns.label.report.co");
	public static final String DAT = PortletProps.get("vn.ns.label.report.dat");
	public static final String KHONG = PortletProps.get("vn.ns.label.report.khong");
	
	public static final String CHUATHUCHIEN = PortletProps.get("vn.ns.label.report.chuathuchien");
	public static final String DANGXAYDUNG = PortletProps.get("vn.ns.label.report.dangxaydung");
	public static final String DANGVANHANH = PortletProps.get("vn.ns.label.report.dangvanhanh");
	public static final String DANGCHAYTHU = PortletProps.get("vn.ns.label.report.dangchaythu");
	public static final String DANGCHUANBIDAUTU = PortletProps.get("vn.ns.label.report.dangchuanbidautu");
	
	public static final String CHOKHAOSAT = PortletProps.get("vn.ns.label.report.chokhaosat");
	public static final String DAHUY = PortletProps.get("vn.ns.label.report.dahuy");
	public static final String CHUAHOANTHANH = PortletProps.get("vn.ns.label.report.chuahoanthanh");
	public static final String DAHOANTHANH = PortletProps.get("vn.ns.label.report.dahoanthanh");
	public static final String KIEMDEMKHONGDAT = PortletProps.get("vn.ns.label.report.kiemdemkhongdat");
	public static final String KIEMDEMDAT = PortletProps.get("vn.ns.label.report.kiemdemdat");
	
	public static final String CONHATIEUHVSXAYMOI = PortletProps.get("vn.ns.label.report.conhatieuhvsxaymoi");
	public static final String CONHATIEUHVS = PortletProps.get("vn.ns.label.report.conhatieuhvs");
	public static final String CONHATIEUKOHVS = PortletProps.get("vn.ns.label.report.conhatieukohvs");
	public static final String KOCONHATIEU = PortletProps.get("vn.ns.label.report.koconhatieu");
	
	public static final String CTDAT = PortletProps.get("vn.ns.label.report.ctdat");
	public static final String CTKODAT = PortletProps.get("vn.ns.label.report.ctkodat");
	//duoi file
	public static final String DUOI_PDF = "pdf";
	public static final String DUOI_XLS = "xls";
	public static final String DUOI_DOC = "doc";
	
	// bao cao thoi gian thuc, 1 la bao cao thoi gian thuc, 0 la bao cao chot cuoi nam
	public static final String THUC = "thuc";
	public static final String CHOT = "chot";
	
	//type bao cao
	public static final String DLI1_1_CHITIET_DSDAU_NOI_MOI_CAP_NUOC = "dli1_1_chitiet_DSDauNoiMoiCapNuoc";
	public static final String DLI1_1_TONGHOP_SO_DAU_NOI_MOI_HOAT_DONG = "dli1_1_tonghop_SoDauNoiMoiHoatDong";
	public static final String DLI1_1_TU = "DLI1_1_TU";
	
	public static final String DLI1_2_TH = "DLI1_2_TH";
	public static final String DLI1_2_CT = "DLI1_2_CT";
	public static final String DLI1_2_TU = "DLI1_2_TU";
	
	public static final String DLI2_1_SNDTCHTCNBV = "DLI2_1_SNDTCHTCNBV";
	//public static final String DLI2_1_TU = "DLI2_1_TU";
	
	public static final String DLI2_2 = "DLI2_2";
	public static final String DLI2_2_TU = "DLI2_2_TU";
	
	public static final String DLI3 = "DLI_3";
	public static final String DLI3_TU = "DLI_3_TU";
	
	public static final String DLI_TH = "DLI_TH";
	public static final String DLI_TH_TU = "DLI_TH_TU";
	
	public static final String THDK_DNSDN = "THDK_DNSDN";
	public static final String THDK_NTHVSXM = "THDK_NTHVSXM";
	
	public static final String TDTHCNTT = "TDTHCNTT";
	
	public static final String KHNUOC = "khnuoc";
	public static final String KHVS = "khvs";
	
	public static final String THVG = "thvg";
	
	//
	public static final String TEN_FILE_DEFAULT = "default";//100

	public static final String GIAY_DLI1_1_CHITIET_DSDAU_NOI_MOI_CAP_NUOC_TEMP = "dli_11_ct.jrxml"; 
	public static final String GIAY_DLI1_1_CHITIET_DSDAU_NOI_MOI_CAP_NUOC_EXPORT = "dli_11_ct" ;
	
	public static final String GIAY_DLI1_1_TONGHOP_SO_DAU_NOI_MOI_HOAT_DONG_TEMP = "dli_11_th.jrxml"; 
	public static final String GIAY_DLI1_1_TONGHOP_SO_DAU_NOI_MOI_HOAT_DONG_EXPORT = "dli_11_th" ;
	
	public static final String GIAY_DLI2_1_SNDTCHTCNBV_TEMP = "dli_21.jrxml"; 
	public static final String GIAY_DLI2_1_SNDTCHTCNBV_EXPORT = "dli_21" ;
	
	public static final String GIAY_DLI2_2_TEMP = "dli_22.jrxml";
	public static final String GIAY_DLI2_2_EXPORT = "dli_22";
	
	public static final String GIAY_DLI1_2_TH_TEMP = "dli_12_th.jrxml";
	public static final String GIAY_DLI1_2_TH_EXPORT = "dli_12_th";
	
	public static final String GIAY_DLI1_2_CT_TEMP = "dli_12_ct.jrxml";
	public static final String GIAY_DLI1_2_CT_EXPORT = "dli_12_ct";
	
	public static final String GIAY_DLI3_TEMP = "dli_3.jrxml";
	public static final String GIAY_DLI3_EXPORT = "dli_3";
	
	public static final String GIAY_DLI_TH_TEMP = "dli_th.jrxml";
	public static final String GIAY_DLI_TH_EXPORT = "dli_th";
	
	public static final String GIAY_THDK_DNSDN_TEMP = "DNSDN.jrxml";
	public static final String GIAY_THDK_DNSDN_EXPORT = "DNSDN";

	public static final String GIAY_THDK_NTHVSXM_TEMP = "NTHVSXM.jrxml";
	public static final String GIAY_THDK_NTHVSXM_EXPORT = "NTHVSXM";
	
	public static final String GIAY_DLI1_1_TU_TEMP = "dli_11_tu.jrxml";
	public static final String GIAY_DLI1_1_TU_EXPORT = "dli_11_tu";
	
	public static final String GIAY_DLI1_2_TU_TEMP = "dli_12_tu.jrxml";
	public static final String GIAY_DLI1_2_TU_EXPORT = "dli_12_tu";
	
	public static final String GIAY_DLI2_2_TU_TEMP = "dli_22_tu.jrxml";
	public static final String GIAY_DLI2_2_TU_EXPORT = "dli_22_tu";
	
	public static final String GIAY_DLI3_TU_TEMP = "dli_3_tu.jrxml";
	public static final String GIAY_DLI3_TU_EXPORT = "dli_3_tu";
	
	public static final String GIAY_DLI_TH_TU_TEMP = "dli_th_tu.jrxml";
	public static final String GIAY_DLI_TH_TU_EXPORT = "dli_th_tu";
	
	public static final String GIAY_TDTHCNTT_TEMP = "TDTHCNTT.jrxml";
	public static final String GIAY_TDTHCNTT_EXPORT = "TDTHCNTT";
	
	public static final String GIAY_KHNUOC_TEMP = "kehoachnuoc.jrxml";
	public static final String GIAY_KHNUOC_EXPORT = "kehoachnuoc";
	
	public static final String GIAY_KHVESINH_TEMP = "kehoachvesinh.jrxml";
	public static final String GIAY_KHVESINH_EXPORT = "kehoachvesinh";
	
	public static final String GIAY_TONGHOPVEGIOI_TEMP = "tonghopvegioi.jrxml";
	public static final String GIAY_TONGHOPVEGIOI_EXPORT = "tonghopvegioi";
	
}
