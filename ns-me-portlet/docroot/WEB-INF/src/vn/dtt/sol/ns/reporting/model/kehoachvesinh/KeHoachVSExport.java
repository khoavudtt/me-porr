package vn.dtt.sol.ns.reporting.model.kehoachvesinh;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.business.KiemDemVienBussiness;
import vn.dtt.sol.ns.reporting.utils.ReportConstant;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.WebKeys;
import vn.dtt.sol.ns.util.format.ConvertUtil;
import vn.dtt.sol.ns.vesinhmoitruong.business.KeHoachKiemDemVeSinhBussiness;
import vn.dtt.sol.ns.vesinhmoitruong.business.ThongTinKiemDemCongTrinhBusiness;
import vn.dtt.sol.ns.vesinhmoitruong.business.ThongTinKiemDemHoGDBusiness;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemHoGDLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class KeHoachVSExport {
	private static Log _log = LogFactoryUtil.getLog(KeHoachVSExport.class);
	
	public static KeHoachVS getModel(String keHoachId){
		_log.info("===KeHoachVSExport===");
		KeHoachVS result = new KeHoachVS();
		
		KeHoachVSHGDvsCTCC keHoachVSHGD = null;
		List<KeHoachVSHGDvsCTCC> lstKeHoachVSHGD = null;
		
		KeHoachVSHGDvsCTCC keHoachVSCTCC = null;
		List<KeHoachVSHGDvsCTCC> lstKeHoachVSCTCC = null;
		
		KeHoachVSDanhSach keHoachVSDanhSachHGD = null;
		List<KeHoachVSDanhSach> lstKeHoachVSDanhSachHGD = null;
		
		KeHoachVSDanhSach keHoachVSDanhSachCTCC = null;
		List<KeHoachVSDanhSach> lstKeHoachVSDanhSachCTCC = null;
		
		KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = null;
		int keHoachIdInt = ConvertUtil.convertToInt(keHoachId); 
		if(keHoachIdInt > 0){
			keHoachKiemDemVeSinh = KeHoachKiemDemVeSinhBussiness.fetchKeHoachKiemDemVeSinh(keHoachIdInt);
		}
		
		if(Validator.isNotNull(keHoachKiemDemVeSinh)){
			lstKeHoachVSHGD = new ArrayList<KeHoachVSHGDvsCTCC>();
			lstKeHoachVSCTCC = new ArrayList<KeHoachVSHGDvsCTCC>();
			
			keHoachVSHGD = new KeHoachVSHGDvsCTCC();
			keHoachVSCTCC = new KeHoachVSHGDvsCTCC();
			String diaBanKiemDemValue = "";
			String tenKiemDemVienValue = "";
			String thoiGianDuKienFromValue = "";
			String thoiGianDuKienToValue = "";
			String moTaValue = "";
			
			// vesinh ho gia dinh
			String tongSoGDValue = "0";
			String choKSGDValue = "0";
			String daHoanThanhGDValue = "0";
			String coNhaVSValue = "0";
			String hopVSValue = "0";
			String hopVSXayMoiValue = "0";
			long tongSoGDValueLong = 0;
			long choKSGDValueLong = 0;
			long daHoanThanhGDValueLong = 0;
			long coNhaVSValueLong = 0;
			long hopVSValueLong = 0;
			long hopVSXayMoiValueLong = 0;
			
			
			
			String tinhValueTemp = Validator.isNotNull(keHoachKiemDemVeSinh.getMaTinh()) ? NuocSachUtils.getNameTinh( keHoachKiemDemVeSinh.getMaTinh()) : "";
			String huyenValueTemp = Validator.isNotNull(keHoachKiemDemVeSinh.getMaHuyen()) ? ", "+NuocSachUtils.getNameHuyen(null, keHoachKiemDemVeSinh.getMaHuyen()) : "";
			diaBanKiemDemValue = tinhValueTemp + huyenValueTemp;
			
			tenKiemDemVienValue = (Validator.isNotNull(keHoachKiemDemVeSinh.getKiemDemVienID())) ? KiemDemVienBussiness.getKiemDemVien( ConvertUtil.convertToLong(String.valueOf(keHoachKiemDemVeSinh.getKiemDemVienID())) ).getHoVaTen() : "";
			thoiGianDuKienFromValue = (Validator.isNotNull(keHoachKiemDemVeSinh.getNgayBatDau())) ? ConvertUtil.parseDateToString(keHoachKiemDemVeSinh.getNgayBatDau()) : "";			
			thoiGianDuKienToValue = (Validator.isNotNull(keHoachKiemDemVeSinh.getNgayKetThuc())) ? ConvertUtil.parseDateToString(keHoachKiemDemVeSinh.getNgayKetThuc()) : "";
			moTaValue = (Validator.isNotNull(keHoachKiemDemVeSinh.getMoTa())) ? keHoachKiemDemVeSinh.getMoTa() : "";					
			// ve sinh ho gia dinh
			lstKeHoachVSDanhSachHGD = new ArrayList<KeHoachVSDanhSach>();			
			List<ThongTinKiemDemHoGD> lstThongTinKiemDemHoGD = Validator.isNotNull(keHoachKiemDemVeSinh.getId()) ? ThongTinKiemDemHoGDBusiness.getListThongTinKiemDemHoGiaDinhByKeHoachId(keHoachKiemDemVeSinh.getId()) : null;
			if(Validator.isNotNull(lstThongTinKiemDemHoGD) && lstThongTinKiemDemHoGD.size() > 0){
				//tong so ho gia dinh
				
				
				for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : lstThongTinKiemDemHoGD) {
					keHoachVSDanhSachHGD = new KeHoachVSDanhSach();
					
					String huyenValue = "";
					String xaValue = "";
					String thonValue = "";
					String tenChuHoValue = "";
					String tinhTrangValue = "";
					String ngayKiemDemValue = "";
					String ketQuaValue = "";
					
					huyenValue = Validator.isNotNull(thongTinKiemDemHoGD.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, thongTinKiemDemHoGD.getMaHuyen()) : "";
					xaValue = Validator.isNotNull(thongTinKiemDemHoGD.getMaXa()) ? NuocSachUtils.getNameXa( thongTinKiemDemHoGD.getMaXa()) : "";
					thonValue = Validator.isNotNull(thongTinKiemDemHoGD.getThonXom()) ? thongTinKiemDemHoGD.getThonXom() : "";
					tenChuHoValue = Validator.isNotNull(thongTinKiemDemHoGD.getTenChuHo()) ? thongTinKiemDemHoGD.getTenChuHo() : "";
					if(Validator.isNotNull(thongTinKiemDemHoGD.getDaKetThucDieuTra())){
						int tempDaKetThucDieuTra = thongTinKiemDemHoGD.getDaKetThucDieuTra();
						if(tempDaKetThucDieuTra == WebKeys.DKTDT_CHOKHAOSAT){
							tongSoGDValueLong++;
							choKSGDValueLong++;
							tinhTrangValue = ReportConstant.CHOKHAOSAT;
						}else if(tempDaKetThucDieuTra == WebKeys.DKTDT_DAHOANTHANH){
							tongSoGDValueLong++;
							daHoanThanhGDValueLong++;
							tinhTrangValue = ReportConstant.DAHOANTHANH;
						}else if(tempDaKetThucDieuTra == WebKeys.DKTDT_CHUAHOANTHANH){
							tongSoGDValueLong++;
							tinhTrangValue = ReportConstant.CHUAHOANTHANH;
						}else if(tempDaKetThucDieuTra == WebKeys.DKTDT_DAHUY){
							
							tinhTrangValue = ReportConstant.DAHUY;
						}
					}
					ngayKiemDemValue = (Validator.isNotNull(thongTinKiemDemHoGD.getNgayKiemDem())) ? ConvertUtil.parseDateToString(thongTinKiemDemHoGD.getNgayKiemDem()) : "";	
					if(Validator.isNotNull(thongTinKiemDemHoGD.getDanhGiaKiemDem())){
						int tempDanhGiaKiemDem = thongTinKiemDemHoGD.getDanhGiaKiemDem();
						if(tempDanhGiaKiemDem == WebKeys.DGKD_CONHATIEUHVSXAYMOI){
							coNhaVSValueLong++;
							hopVSValueLong++;
							hopVSXayMoiValueLong++;
							ketQuaValue = ReportConstant.CONHATIEUHVSXAYMOI;
						}else if(tempDanhGiaKiemDem == WebKeys.DGKD_CONHATIEUHVS){
							coNhaVSValueLong++;
							hopVSValueLong++;
							ketQuaValue = ReportConstant.CONHATIEUHVS;
						}else if(tempDanhGiaKiemDem == WebKeys.DGKD_CONHATIEUKOHVS){
							
							ketQuaValue = ReportConstant.CONHATIEUKOHVS;
						}else if(tempDanhGiaKiemDem == WebKeys.DGKD_KOCONHATIEU){
							
							ketQuaValue = ReportConstant.KOCONHATIEU;
						}
						
					}
					
					keHoachVSDanhSachHGD.setHuyen(huyenValue);
					keHoachVSDanhSachHGD.setXa(xaValue);
					keHoachVSDanhSachHGD.setThon(thonValue);
					keHoachVSDanhSachHGD.setTenChuHo(tenChuHoValue);
					keHoachVSDanhSachHGD.setTinhTrang(tinhTrangValue);
					keHoachVSDanhSachHGD.setNgayKiemDem(ngayKiemDemValue);
					keHoachVSDanhSachHGD.setKetQua(ketQuaValue);
					
					lstKeHoachVSDanhSachHGD.add(keHoachVSDanhSachHGD);					
				}
			}
			tongSoGDValue = ConvertUtil.parseLongToString1000(tongSoGDValueLong);
			choKSGDValue = ConvertUtil.parseLongToString1000(choKSGDValueLong);
			daHoanThanhGDValue = ConvertUtil.parseLongToString1000(daHoanThanhGDValueLong);
			coNhaVSValue = ConvertUtil.parseLongToString1000(coNhaVSValueLong);
			hopVSValue = ConvertUtil.parseLongToString1000(hopVSValueLong);
			hopVSXayMoiValue = ConvertUtil.parseLongToString1000(hopVSXayMoiValueLong);
			
			keHoachVSHGD.setDiaBanKiemDem(diaBanKiemDemValue);
			keHoachVSHGD.setTenKiemDemVien(tenKiemDemVienValue);
			keHoachVSHGD.setThoiGianDuKienFrom(thoiGianDuKienFromValue);
			keHoachVSHGD.setThoiGianDuKienTo(thoiGianDuKienToValue);
			keHoachVSHGD.setMoTa(moTaValue);
			keHoachVSHGD.setTongSoGD(tongSoGDValue);
			keHoachVSHGD.setChoKSGD(choKSGDValue);
			keHoachVSHGD.setDaHoanThanhGD(daHoanThanhGDValue);
			keHoachVSHGD.setCoNhaVS(coNhaVSValue);
			keHoachVSHGD.setHopVS(hopVSValue);
			keHoachVSHGD.setHopVSXayMoi(hopVSXayMoiValue);
			keHoachVSHGD.setLstKeHoachVSDanhSachHGD(lstKeHoachVSDanhSachHGD);
			
			lstKeHoachVSHGD.add(keHoachVSHGD);
			
			// vesinh ctcc	
			String tongSoCTCCValue = "0";
			String choKSCTCCValue = "0";
			String daHoanThanhCTCCValue = "0";
			String datValue = "0";
			String koDatValue = "0";
			long tongSoCTCCValueLong = 0;
			long choKSCTCCValueLong = 0;
			long daHoanThanhCTCCValueLong = 0;
			long datValueLong = 0;
			long koDatValueLong = 0;
			// ve sinh ctcc
			lstKeHoachVSDanhSachCTCC = new ArrayList<KeHoachVSDanhSach>();
			List<ThongTinKiemDemCongTrinh> lstThongTinKiemDemCongTrinh = Validator.isNotNull(keHoachKiemDemVeSinh.getId()) ? ThongTinKiemDemCongTrinhBusiness.getListThongTinKiemDemCongTrinhByKeHoachId(keHoachKiemDemVeSinh.getId()) : null;
			if(Validator.isNotNull(lstThongTinKiemDemCongTrinh) && lstThongTinKiemDemCongTrinh.size() > 0){
				// tong so ve sinh ctcc
				//tongSoCTCCValue = ConvertUtil.parseIntToString1000(lstThongTinKiemDemCongTrinh.size());
				
				for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : lstThongTinKiemDemCongTrinh) {
					keHoachVSDanhSachCTCC = new KeHoachVSDanhSach();
					String huyenValue = "";
					String xaValue = "";
					String thonValue = "";
					String tenChuHoValue = "";
					String tinhTrangValue = "";
					String ngayKiemDemValue = "";
					String ketQuaValue = "";
					
					huyenValue = Validator.isNotNull(thongTinKiemDemCongTrinh.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, thongTinKiemDemCongTrinh.getMaHuyen()) : "";
					xaValue = Validator.isNotNull(thongTinKiemDemCongTrinh.getMaXa()) ? NuocSachUtils.getNameXa( thongTinKiemDemCongTrinh.getMaXa()) : "";
					thonValue = Validator.isNotNull(thongTinKiemDemCongTrinh.getDiaChi()) ? thongTinKiemDemCongTrinh.getDiaChi() : "";
					String tenNguoiTraLoiTemp = Validator.isNotNull(thongTinKiemDemCongTrinh.getHoTenNguoiTraLoi()) ? thongTinKiemDemCongTrinh.getHoTenNguoiTraLoi() : "";
					String tenCongTrinhTemp = Validator.isNotNull(thongTinKiemDemCongTrinh.getTenCongTrinh()) ? "/"+thongTinKiemDemCongTrinh.getTenCongTrinh() : "";
					tenChuHoValue = tenNguoiTraLoiTemp + tenCongTrinhTemp;
					if(Validator.isNotNull(thongTinKiemDemCongTrinh.getDaKetThucDieuTra())){
						int tempDaKetThucDieuTra = thongTinKiemDemCongTrinh.getDaKetThucDieuTra();
						if(tempDaKetThucDieuTra == WebKeys.DKTDT_CHOKHAOSAT){
							tongSoCTCCValueLong++;
							choKSCTCCValueLong++;
							tinhTrangValue = ReportConstant.CHOKHAOSAT;
						}else if(tempDaKetThucDieuTra == WebKeys.DKTDT_DAHOANTHANH){
							tongSoCTCCValueLong++;
							daHoanThanhCTCCValueLong++;
							tinhTrangValue = ReportConstant.DAHOANTHANH;
						}else if(tempDaKetThucDieuTra == WebKeys.DKTDT_CHUAHOANTHANH){
							tongSoCTCCValueLong++;
							tinhTrangValue = ReportConstant.CHUAHOANTHANH;
						}else if(tempDaKetThucDieuTra == WebKeys.DKTDT_DAHUY){
							
							tinhTrangValue = ReportConstant.DAHUY;
						}
					}
					ngayKiemDemValue = (Validator.isNotNull(thongTinKiemDemCongTrinh.getNgayKiemDem())) ? ConvertUtil.parseDateToString(thongTinKiemDemCongTrinh.getNgayKiemDem()) : "";	
					if(Validator.isNotNull(thongTinKiemDemCongTrinh.getDanhGiaKiemDem())){
						int tempDanhGiaKiemDem = thongTinKiemDemCongTrinh.getDanhGiaKiemDem();
						if(tempDanhGiaKiemDem == WebKeys.DGKD_CTDAT){
							datValueLong++;
							ketQuaValue = ReportConstant.CTDAT;
						}else if(tempDanhGiaKiemDem == WebKeys.DGKD_CTKODAT){
							koDatValueLong++;
							ketQuaValue = ReportConstant.CTKODAT;
						}
						
					}
					
					keHoachVSDanhSachCTCC.setHuyen(huyenValue);
					keHoachVSDanhSachCTCC.setXa(xaValue);
					keHoachVSDanhSachCTCC.setThon(thonValue);
					keHoachVSDanhSachCTCC.setTenChuHo(tenChuHoValue);
					keHoachVSDanhSachCTCC.setTinhTrang(tinhTrangValue);
					keHoachVSDanhSachCTCC.setNgayKiemDem(ngayKiemDemValue);
					keHoachVSDanhSachCTCC.setKetQua(ketQuaValue);
					
					lstKeHoachVSDanhSachCTCC.add(keHoachVSDanhSachCTCC);
				}
			}
			tongSoCTCCValue = ConvertUtil.parseLongToString1000(tongSoCTCCValueLong);
			choKSCTCCValue = ConvertUtil.parseLongToString1000(choKSCTCCValueLong);
			daHoanThanhCTCCValue = ConvertUtil.parseLongToString1000(daHoanThanhCTCCValueLong);
			datValue = ConvertUtil.parseLongToString1000(datValueLong);
			koDatValue = ConvertUtil.parseLongToString1000(koDatValueLong);
			
			keHoachVSCTCC.setDiaBanKiemDem(diaBanKiemDemValue);
			keHoachVSCTCC.setTenKiemDemVien(tenKiemDemVienValue);
			keHoachVSCTCC.setThoiGianDuKienFrom(thoiGianDuKienFromValue);
			keHoachVSCTCC.setThoiGianDuKienTo(thoiGianDuKienToValue);
			keHoachVSCTCC.setMoTa(moTaValue);
			keHoachVSCTCC.setTongSoCTCC(tongSoCTCCValue);
			keHoachVSCTCC.setChoKSCTCC(choKSCTCCValue);
			keHoachVSCTCC.setDaHoanThanhCTCC(daHoanThanhCTCCValue);
			keHoachVSCTCC.setDat(datValue);
			keHoachVSCTCC.setKoDat(koDatValue);
			keHoachVSCTCC.setLstKeHoachVSDanhSachCTCC(lstKeHoachVSDanhSachCTCC);
			
			lstKeHoachVSCTCC.add(keHoachVSCTCC);
		}
		
		
		
		result.setLstKeHoachVSHGD(lstKeHoachVSHGD);
		result.setLstKeHoachVSCTCC(lstKeHoachVSCTCC);
		return result;
	}
}
