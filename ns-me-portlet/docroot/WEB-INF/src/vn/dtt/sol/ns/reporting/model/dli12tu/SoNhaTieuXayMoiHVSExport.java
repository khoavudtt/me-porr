package vn.dtt.sol.ns.reporting.model.dli12tu;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.business.KeHoachVeSinhBusiness;
import vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.vesinhmoitruong.business.VeSinhGiaDinhBusiness;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class SoNhaTieuXayMoiHVSExport {
	private static Log log = LogFactoryUtil.getLog(SoNhaTieuXayMoiHVSExport.class);
	
	public static SoNhaTieuXayMoiHVS getModel(String namBaoCao){
		
		log.info("===SoNhaTieuXayMoiHVSExport===");
		String TRANGTHAI = "2"; // trangthai 2 la co nha tieu hvs
		String DANGKYVSTX = "1"; // da dang ky ve sinh toan xa
		SoNhaTieuXayMoiHVS result = new SoNhaTieuXayMoiHVS();
		
		SoNhaTieuXayMoiHVSToanTinh soNhaTieuXayMoiHVSToanTinh = null;
		List<SoNhaTieuXayMoiHVSToanTinh> lstSoNhaTieuXayMoiHVSToanTinh = null;
		
		SoNhaTieuXayMoiHVSToanTinhDanhSach soNhaTieuXayMoiHVSToanTinhDanhSach = null;
		List<SoNhaTieuXayMoiHVSToanTinhDanhSach> lstSoNhaTieuXayMoiHVSToanTinhDanhSach = null;
		
		///
		SoNhaTieuXayMoiHVSTinh soNhaTieuXayMoiHVSTinh = null;
		List<SoNhaTieuXayMoiHVSTinh> lstSoNhaTieuXayMoiHVSTinh = null;
		
		///
		SoNhaTieuXayMoiHVSTinhDanhSach soNhaTieuXayMoiHVSTinhDanhSachToanXa = null;
		List<SoNhaTieuXayMoiHVSTinhDanhSach> lstSoNhaTieuXayMoiHVSTinhDanhSachToanXa = null;
		
		SoNhaTieuXayMoiHVSTinhDanhSach soNhaTieuXayMoiHVSTinhDanhSachXaKhac = null;
		List<SoNhaTieuXayMoiHVSTinhDanhSach> lstSoNhaTieuXayMoiHVSTinhDanhSachXaKhac = null;
		
		String namValue = "";
		int keHoachTotalValue = 0;
		int thucHienTotalValue = 0;
		
		namValue = Validator.isNotNull(namBaoCao) ? namBaoCao : "";		
		
		// start tat ca cac tinh
		List<VeSinhGiaDinh> lstVeSinhGiaDinhToanTinh = null;
		if(Validator.isNotNull(namBaoCao) ){
			lstVeSinhGiaDinhToanTinh = VeSinhGiaDinhBusiness.getVeSinhGiaDinhGroupByMaTinhTW(null, null, null, null, TRANGTHAI, namBaoCao);
		}
		
		lstSoNhaTieuXayMoiHVSToanTinh = new ArrayList<SoNhaTieuXayMoiHVSToanTinh>();
		if(Validator.isNotNull(lstVeSinhGiaDinhToanTinh) && lstVeSinhGiaDinhToanTinh.size() > 0){
			soNhaTieuXayMoiHVSToanTinh = new SoNhaTieuXayMoiHVSToanTinh();
			
			keHoachTotalValue = Validator.isNotNull(namBaoCao) ? KeHoachVeSinhBusiness.sumSoNhaTieuHVSMoiTW(namBaoCao, null) : 0 ;
			thucHienTotalValue = Validator.isNotNull(namBaoCao) ? VeSinhGiaDinhBusiness.countVeSinhGiaDinhSearch(null,null, null, null, TRANGTHAI, namBaoCao) : 0;
			
			lstSoNhaTieuXayMoiHVSToanTinhDanhSach = new ArrayList<SoNhaTieuXayMoiHVSToanTinhDanhSach>();
			for (VeSinhGiaDinh veSinhGiaDinh : lstVeSinhGiaDinhToanTinh) {
				soNhaTieuXayMoiHVSToanTinhDanhSach = new SoNhaTieuXayMoiHVSToanTinhDanhSach();
				String tenTinhValue = "";	
				int keHoachValue = 0;
				int thucHienValue = 0;
				
				keHoachValue = Validator.isNotNull(veSinhGiaDinh.getMaTinh()) ? KeHoachVeSinhBusiness.sumSoNhaTieuHVSMoiTW(namBaoCao, veSinhGiaDinh.getMaTinh()) : 0 ;
				tenTinhValue = NuocSachUtils.getNameTinh(veSinhGiaDinh.getMaTinh());
				thucHienValue = Validator.isNotNull(veSinhGiaDinh.getMaTinh()) ? VeSinhGiaDinhBusiness.countVeSinhGiaDinhSearch(veSinhGiaDinh.getMaTinh(),null, null, null, TRANGTHAI, namBaoCao) : 0;
				
				soNhaTieuXayMoiHVSToanTinhDanhSach.setKeHoach(keHoachValue);
				soNhaTieuXayMoiHVSToanTinhDanhSach.setTenTinh(tenTinhValue);
				soNhaTieuXayMoiHVSToanTinhDanhSach.setThucHien(thucHienValue);
				lstSoNhaTieuXayMoiHVSToanTinhDanhSach.add(soNhaTieuXayMoiHVSToanTinhDanhSach);
			}
			soNhaTieuXayMoiHVSToanTinh.setKeHoachTotal(keHoachTotalValue);
			soNhaTieuXayMoiHVSToanTinh.setLstSoNhaTieuXayMoiHVSToanTinhDanhSach(lstSoNhaTieuXayMoiHVSToanTinhDanhSach);
			soNhaTieuXayMoiHVSToanTinh.setThucHienTotal(thucHienTotalValue);
			
			lstSoNhaTieuXayMoiHVSToanTinh.add(soNhaTieuXayMoiHVSToanTinh);
		}
		// end tat ca cac tinh
		
		// start cac tinh da phan chia
		List<VeSinhGiaDinh> lstVeSinhGiaDinhTinh = null;
		if(Validator.isNotNull(namBaoCao) ){
			lstVeSinhGiaDinhTinh = VeSinhGiaDinhBusiness.getVeSinhGiaDinhGroupByMaTinhTW(null, null, null, null, TRANGTHAI, namBaoCao);
		}
		
		lstSoNhaTieuXayMoiHVSTinh = new ArrayList<SoNhaTieuXayMoiHVSTinh>();
		
		if(Validator.isNotNull(lstVeSinhGiaDinhTinh) && lstVeSinhGiaDinhTinh.size() > 0){
			for (VeSinhGiaDinh veSinhGiaDinh : lstVeSinhGiaDinhTinh) {
				soNhaTieuXayMoiHVSTinh = new SoNhaTieuXayMoiHVSTinh();
				
				String tenTinhValue = "";
				int totalDanSoVSTXValue = 0;
				int totalDanSoXaKhacValue = 0;
				int totalDanSoTatCaCacXaValue = 0;
				
				tenTinhValue = NuocSachUtils.getNameTinh(veSinhGiaDinh.getMaTinh());
				
				// start cac huyen cua 1 tinh, da co ve sinh toan xa
				lstSoNhaTieuXayMoiHVSTinhDanhSachToanXa = new ArrayList<SoNhaTieuXayMoiHVSTinhDanhSach>();
				List<KeHoachVeSinh> lstKeHoachVeSinhsToanXa = Validator.isNotNull(veSinhGiaDinh.getMaTinh()) ? KeHoachVeSinhBusiness.getKeHoachVeSinhByNamTinhDangKyVSTX(namBaoCao, veSinhGiaDinh.getMaTinh(),DANGKYVSTX ): null;
				if(Validator.isNotNull(lstKeHoachVeSinhsToanXa) && lstKeHoachVeSinhsToanXa.size() > 0){
					for (KeHoachVeSinh keHoachVeSinh : lstKeHoachVeSinhsToanXa) {
						soNhaTieuXayMoiHVSTinhDanhSachToanXa = new SoNhaTieuXayMoiHVSTinhDanhSach();
						String tenTinhToanXaValue = "";
						String huyenToanXaValue = "";
						String xaToanXaValue = "";
						int soNhaTieuHGDHVSMoiToanXaValue = 0;
						String ghiChuToanXa = "";
						
						tenTinhToanXaValue = Validator.isNotNull(tenTinhValue) ?tenTinhValue : "";
						huyenToanXaValue = Validator.isNotNull(keHoachVeSinh.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, keHoachVeSinh.getMaHuyen()) : "";
						xaToanXaValue = Validator.isNotNull(keHoachVeSinh.getMaXa()) ? NuocSachUtils.getNameXa( keHoachVeSinh.getMaXa()) : "";
						if(Validator.isNotNull(keHoachVeSinh.getMaTinh())
								&& Validator.isNotNull(keHoachVeSinh.getMaHuyen())
								&& Validator.isNotNull(keHoachVeSinh.getMaXa())){
							soNhaTieuHGDHVSMoiToanXaValue = VeSinhGiaDinhBusiness.countVeSinhGiaDinhSearch(keHoachVeSinh.getMaTinh(), keHoachVeSinh.getMaHuyen(), keHoachVeSinh.getMaXa(), null, TRANGTHAI, namBaoCao);
						}
						totalDanSoVSTXValue += soNhaTieuHGDHVSMoiToanXaValue;
						ghiChuToanXa = Validator.isNotNull(keHoachVeSinh.getGhiChu()) ?  keHoachVeSinh.getGhiChu() : "";
						
						
						soNhaTieuXayMoiHVSTinhDanhSachToanXa.setTenTinh(tenTinhToanXaValue);
						soNhaTieuXayMoiHVSTinhDanhSachToanXa.setHuyen(huyenToanXaValue);
						soNhaTieuXayMoiHVSTinhDanhSachToanXa.setXa(xaToanXaValue);
						soNhaTieuXayMoiHVSTinhDanhSachToanXa.setSoNhaTieuHGDHVSMoi(soNhaTieuHGDHVSMoiToanXaValue);
						soNhaTieuXayMoiHVSTinhDanhSachToanXa.setGhiChu(ghiChuToanXa);
						lstSoNhaTieuXayMoiHVSTinhDanhSachToanXa.add(soNhaTieuXayMoiHVSTinhDanhSachToanXa);
					}
				}
				// start cac huyen cua 1 tinh, da co ve sinh toan xa
				
				
				// start cac huyen cua 1 tinh, KO ve sinh toan xa
				lstSoNhaTieuXayMoiHVSTinhDanhSachXaKhac = new ArrayList<SoNhaTieuXayMoiHVSTinhDanhSach>();
				List<VeSinhGiaDinh> lstVeSinhGiaDinh = VeSinhGiaDinhBusiness.getVeSinhGiaDinhGroupByMaHuyenMaXaAndMaXaNotInTW(veSinhGiaDinh.getMaTinh(), TRANGTHAI, namBaoCao, DANGKYVSTX);
				if(Validator.isNotNull(lstVeSinhGiaDinh) && lstVeSinhGiaDinh.size() > 0){
					for (VeSinhGiaDinh veSinhGiaDinhXaKhac : lstVeSinhGiaDinh) {
						
						soNhaTieuXayMoiHVSTinhDanhSachXaKhac = new SoNhaTieuXayMoiHVSTinhDanhSach();
						
						String tenTinhXaKhacValue = "";
						String huyenXaKhacValue = "";
						String xaXaKhacValue = "";
						int soNhaTieuHGDHVSMoiXaKhacValue = 0;
						String ghiChuXaKhac = "";
						
						tenTinhXaKhacValue = Validator.isNotNull(tenTinhValue) ?tenTinhValue : "";
						huyenXaKhacValue = Validator.isNotNull(veSinhGiaDinhXaKhac.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, veSinhGiaDinhXaKhac.getMaHuyen()) : "";
						xaXaKhacValue = Validator.isNotNull(veSinhGiaDinhXaKhac.getMaXa()) ? NuocSachUtils.getNameXa( veSinhGiaDinhXaKhac.getMaXa()) : "";
						if(Validator.isNotNull(veSinhGiaDinhXaKhac.getMaTinh())
								&& Validator.isNotNull(veSinhGiaDinhXaKhac.getMaHuyen())
								&& Validator.isNotNull(veSinhGiaDinhXaKhac.getMaXa())){
							soNhaTieuHGDHVSMoiXaKhacValue = VeSinhGiaDinhBusiness.countVeSinhGiaDinhSearch(veSinhGiaDinhXaKhac.getMaTinh(), veSinhGiaDinhXaKhac.getMaHuyen(), veSinhGiaDinhXaKhac.getMaXa(), null, TRANGTHAI, namBaoCao);
						}
						totalDanSoXaKhacValue += soNhaTieuHGDHVSMoiXaKhacValue;
						ghiChuXaKhac = Validator.isNotNull(veSinhGiaDinhXaKhac.getGhiChu()) ? veSinhGiaDinhXaKhac.getGhiChu() : "";
						
						soNhaTieuXayMoiHVSTinhDanhSachXaKhac.setTenTinh(tenTinhXaKhacValue);
						soNhaTieuXayMoiHVSTinhDanhSachXaKhac.setHuyen(huyenXaKhacValue);
						soNhaTieuXayMoiHVSTinhDanhSachXaKhac.setXa(xaXaKhacValue);
						soNhaTieuXayMoiHVSTinhDanhSachXaKhac.setSoNhaTieuHGDHVSMoi(soNhaTieuHGDHVSMoiXaKhacValue);
						soNhaTieuXayMoiHVSTinhDanhSachXaKhac.setGhiChu(ghiChuXaKhac);
						lstSoNhaTieuXayMoiHVSTinhDanhSachXaKhac.add(soNhaTieuXayMoiHVSTinhDanhSachXaKhac);
					}
				}
				totalDanSoTatCaCacXaValue = totalDanSoVSTXValue+totalDanSoXaKhacValue;
				
				// end cac huyen cua 1 tinh, KO ve sinh toan xa
				soNhaTieuXayMoiHVSTinh.setTenTinh(tenTinhValue);
				soNhaTieuXayMoiHVSTinh.setTotalDanSoVSTX(totalDanSoVSTXValue);
				soNhaTieuXayMoiHVSTinh.setLstSoNhaTieuXayMoiHVSTinhDanhSachVSTX(lstSoNhaTieuXayMoiHVSTinhDanhSachToanXa);
				soNhaTieuXayMoiHVSTinh.setLstSoNhaTieuXayMoiHVSTinhDanhSachXaKhac(lstSoNhaTieuXayMoiHVSTinhDanhSachXaKhac);
				soNhaTieuXayMoiHVSTinh.setTotalDanSoXaKhac(totalDanSoXaKhacValue);
				soNhaTieuXayMoiHVSTinh.setTotalDanSoTatCaCacXa(totalDanSoTatCaCacXaValue);
				lstSoNhaTieuXayMoiHVSTinh.add(soNhaTieuXayMoiHVSTinh);
			}	
		}
		// end cac tinh da phan chia
		
		result.setNam(namValue);
		result.setLstSoNhaTieuXayMoiHVSToanTinh(lstSoNhaTieuXayMoiHVSToanTinh);
		result.setLstSoNhaTieuXayMoiHVSTinh(lstSoNhaTieuXayMoiHVSTinh);
		return result;
	}
}
