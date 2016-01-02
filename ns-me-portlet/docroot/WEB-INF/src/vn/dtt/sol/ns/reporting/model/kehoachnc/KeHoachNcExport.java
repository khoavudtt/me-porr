package vn.dtt.sol.ns.reporting.model.kehoachnc;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.business.KiemDemVienBussiness;
import vn.dtt.sol.ns.reporting.utils.ReportConstant;
import vn.dtt.sol.ns.tramcap.business.KeHoachKiemDemNuocBusiness;
import vn.dtt.sol.ns.tramcap.business.THONGTINKIEMDEMNUOCBusiness;
import vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.WebKeys;
import vn.dtt.sol.ns.util.format.ConvertUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class KeHoachNcExport {
	private static Log _log = LogFactoryUtil.getLog(KeHoachNcExport.class);
	
	public static KeHoachNc getModel(String keHoachId){
		_log.info("===KeHoachNcExport===");
		KeHoachNc result = new KeHoachNc();
		
		KeHoachNcDanhSach keHoachNcDanhSach = null;
		List<KeHoachNcDanhSach> lstKeHoachNcDanhSach = null;
		
		String tenHeThongCapNuocValue = "";
		String tenKiemDemVienValue = "";
		String thoiGianDuKienFromValue = "";
		String thoiGianDuKienToValue = "";
		String moTaValue = "";
		String tongSoDauNoiValue = "0";
		String choKSValue = "0";
		String daHoanThanhValue = "0";
		String dangKDValue = "0";
		String kiemDemDatValue = "0";
		String kiemDemKhongDatValue = "0";
		
		long tongSoDauNoiValueLong = 0;
		long choKSValueLong = 0;
		long daHoanThanhValueLong = 0;
		long dangKDValueLong = 0;
		long kiemDemDatValueLong = 0;
		long kiemDemKhongDatValueLong = 0;
		
		KeHoachKiemDemNuoc keHoachKiemDemNuoc = null;
		int keHoachIdInt = ConvertUtil.convertToInt(keHoachId); 
		if(keHoachIdInt > 0){
			keHoachKiemDemNuoc = KeHoachKiemDemNuocBusiness.getKeHoachKiemDemNuocById(keHoachIdInt);
		}
		
		if(Validator.isNotNull(keHoachKiemDemNuoc)){
			
			tenHeThongCapNuocValue = (Validator.isNotNull(keHoachKiemDemNuoc.getTramCapNuocId())) ? NuocSachUtils.getTenTramByTramId(String.valueOf(keHoachKiemDemNuoc.getTramCapNuocId())) : "";
			tenKiemDemVienValue = (Validator.isNotNull(keHoachKiemDemNuoc.getKiemDemVienId())) ? KiemDemVienBussiness.getKiemDemVien( ConvertUtil.convertToLong(String.valueOf(keHoachKiemDemNuoc.getKiemDemVienId())) ).getHoVaTen() : "";
			thoiGianDuKienFromValue = (Validator.isNotNull(keHoachKiemDemNuoc.getNgayBatDau())) ? ConvertUtil.parseDateToString(keHoachKiemDemNuoc.getNgayBatDau()) : "";			
			thoiGianDuKienToValue = (Validator.isNotNull(keHoachKiemDemNuoc.getNgayKetThuc())) ? ConvertUtil.parseDateToString(keHoachKiemDemNuoc.getNgayKetThuc()) : "";
			moTaValue = (Validator.isNotNull(keHoachKiemDemNuoc.getMoTa())) ? keHoachKiemDemNuoc.getMoTa() : "";
			
			List<THONGTINKIEMDEMNUOC> lstThongtinkiemdemnuoc = (Validator.isNotNull(keHoachKiemDemNuoc.getId())) ? THONGTINKIEMDEMNUOCBusiness.getListBykeHoachKiemDemNuocId(keHoachKiemDemNuoc.getId()) : null;
			
			lstKeHoachNcDanhSach = new ArrayList<KeHoachNcDanhSach>();
			if(Validator.isNotNull(lstThongtinkiemdemnuoc) && lstThongtinkiemdemnuoc.size() > 0){
				// tongsodaunoi
				//tongSoDauNoiValue = ConvertUtil.parseIntToString1000(lstThongtinkiemdemnuoc.size());
				for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : lstThongtinkiemdemnuoc) {
					
					keHoachNcDanhSach = new KeHoachNcDanhSach();
					
					String huyenValue = "";
					String xaValue = "";
					String thonValue = "";
					String tenChuHoValue = "";
					String tinhTrangValue = "";
					String ngayKiemDemValue = "";
					String ketQuaValue = "";
					
					huyenValue = Validator.isNotNull(thongtinkiemdemnuoc.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, thongtinkiemdemnuoc.getMaHuyen()) : "";
					xaValue = Validator.isNotNull(thongtinkiemdemnuoc.getMaXa()) ? NuocSachUtils.getNameXa( thongtinkiemdemnuoc.getMaXa()) : "";
					thonValue = Validator.isNotNull(thongtinkiemdemnuoc.getThonXom()) ? thongtinkiemdemnuoc.getThonXom() : "";
					tenChuHoValue = Validator.isNotNull(thongtinkiemdemnuoc.getTenChuHo()) ? thongtinkiemdemnuoc.getTenChuHo() : "";
					if(Validator.isNotNull(thongtinkiemdemnuoc.getDaKetThucDieuTra())){
						int tempDaKetThucDieuTra = thongtinkiemdemnuoc.getDaKetThucDieuTra();
						if(tempDaKetThucDieuTra == WebKeys.DKTDT_CHOKHAOSAT){
							tongSoDauNoiValueLong++;
							choKSValueLong++;
							tinhTrangValue = ReportConstant.CHOKHAOSAT;
						}else if(tempDaKetThucDieuTra == WebKeys.DKTDT_DAHOANTHANH){
							tongSoDauNoiValueLong++;
							daHoanThanhValueLong++;
							tinhTrangValue = ReportConstant.DAHOANTHANH;
						}else if(tempDaKetThucDieuTra == WebKeys.DKTDT_CHUAHOANTHANH){
							tongSoDauNoiValueLong++;
							dangKDValueLong++;
							tinhTrangValue = ReportConstant.CHUAHOANTHANH;
						}else if(tempDaKetThucDieuTra == WebKeys.DKTDT_DAHUY){
							
							tinhTrangValue = ReportConstant.DAHUY;
						}
					}
					if(Validator.isNotNull(thongtinkiemdemnuoc.getDanhGiaKiemDem())){
						int tempDanhGiaKiemDem = thongtinkiemdemnuoc.getDanhGiaKiemDem();
						if(tempDanhGiaKiemDem == WebKeys.DGKD_KIEMDEMDAT){
							kiemDemDatValueLong++;
							ketQuaValue = ReportConstant.KIEMDEMDAT;
						}else if(tempDanhGiaKiemDem == WebKeys.DGKD_KIEMDEMKHONGDAT){
							kiemDemKhongDatValueLong++;
							ketQuaValue = ReportConstant.KIEMDEMKHONGDAT;
						} 
						
					}
					ngayKiemDemValue = (Validator.isNotNull(thongtinkiemdemnuoc.getNgayKiemDem())) ? ConvertUtil.parseDateToString(thongtinkiemdemnuoc.getNgayKiemDem()) : "";	
					
					keHoachNcDanhSach.setHuyen(huyenValue);
					keHoachNcDanhSach.setXa(xaValue);
					keHoachNcDanhSach.setThon(thonValue);
					keHoachNcDanhSach.setTenChuHo(tenChuHoValue);
					keHoachNcDanhSach.setTinhTrang(tinhTrangValue);
					keHoachNcDanhSach.setNgayKiemDem(ngayKiemDemValue);
					keHoachNcDanhSach.setKetQua(ketQuaValue);
					
					lstKeHoachNcDanhSach.add(keHoachNcDanhSach);
				}
			}
			
		}
		
		tongSoDauNoiValue = ConvertUtil.parseLongToString1000(tongSoDauNoiValueLong);
		choKSValue = ConvertUtil.parseLongToString1000(choKSValueLong);
		daHoanThanhValue = ConvertUtil.parseLongToString1000(daHoanThanhValueLong);
		dangKDValue = ConvertUtil.parseLongToString1000(dangKDValueLong);
		kiemDemDatValue = ConvertUtil.parseLongToString1000(kiemDemDatValueLong);
		kiemDemKhongDatValue = ConvertUtil.parseLongToString1000(kiemDemKhongDatValueLong);
		
		result.setTenHeThongCapNuoc(tenHeThongCapNuocValue);
		result.setTenKiemDemVien(tenKiemDemVienValue);
		result.setThoiGianDuKienFrom(thoiGianDuKienFromValue);
		result.setThoiGianDuKienTo(thoiGianDuKienToValue);
		result.setMoTa(moTaValue);
		result.setTongSoDauNoi(tongSoDauNoiValue);
		result.setChoKS(choKSValue);
		result.setDaHoanThanh(daHoanThanhValue);
		result.setDangKD(dangKDValue);
		result.setKiemDemDat(kiemDemDatValue);
		result.setKiemDemKhongDat(kiemDemKhongDatValue);
		result.setLstKeHoachNcDanhSach(lstKeHoachNcDanhSach);
		return result;
		
	}
}
