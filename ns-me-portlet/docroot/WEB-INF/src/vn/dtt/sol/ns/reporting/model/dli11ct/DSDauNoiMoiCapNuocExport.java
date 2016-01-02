package vn.dtt.sol.ns.reporting.model.dli11ct;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.sol.ns.reporting.utils.ReportConstant;
import vn.dtt.sol.ns.reporting.utils.ReportFunction;
import vn.dtt.sol.ns.tramcap.business.DauNoiNuocBusiness;
import vn.dtt.sol.ns.tramcap.business.THONGTINKIEMDEMNUOCBusiness;
import vn.dtt.sol.ns.tramcap.business.TramCapBusiness;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.format.ConvertUtil;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;


public class DSDauNoiMoiCapNuocExport {
	private static Log log = LogFactoryUtil.getLog(DSDauNoiMoiCapNuocExport.class);
	
	/**
	 * @author tailt
	 * @param namBaoCao
	 * @param maTinh
	 * @param soBaoCao
	 * @param ngayBaoCao
	 * @param nguoiLap
	 * @param nguoiDuyet
	 * @return
	 */
	public static DSDauNoiMoiCapNuoc getModel(String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String thoigianthuc ) {
		log.info("===DSDauNoiMoiCapNuocExport===");
		log.info("--getModel==namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao+"==maTinh--"+maTinh);
		
		String TRANGTHAI = "2"; // trangthai 2 la dau noi nuoc kiem dem dat
		String DANHGIAKIEMDEM = "1"; ///danhgiakiemdem 1 la kiem dem dat	
		
		DSDauNoiMoiCapNuoc result = new DSDauNoiMoiCapNuoc();
		
		DSDauNoiMoiCapNuocDanhSach dsDauNoiMoiCapNuocDanhSach = null;
		List<DSDauNoiMoiCapNuocDanhSach> lstDSDauNoiMoiCapNuocDanhSach = null;
		
		

		
		String namValue = "";
		String tenTinhValue = "";
		String baoCaoSoValue = "";
		String baoCaoNgayThangNamValue = "";
		String nguoiLapValue = "";
		String nguoiDuyetValue = "";
		
		namValue = namBaoCao;		
		tenTinhValue = NuocSachUtils.getNameTinh(maTinh);
		baoCaoSoValue = Validator.isNotNull(soBaoCao) ? soBaoCao : "" ;
		if(Validator.isNotNull(ngayBaoCao)){
			Date dateNgayBaoCao = FormatData.parseStringToDateTypeDDMMYYYY(ngayBaoCao.trim());
			baoCaoNgayThangNamValue = ReportFunction.parserDateToString4(dateNgayBaoCao);
		}
		if(Validator.isNotNull(nguoiLap)){
			nguoiLapValue = nguoiLap;
		}
		if(Validator.isNotNull(nguoiDuyet)){
			nguoiDuyetValue = nguoiDuyet;
		}
		lstDSDauNoiMoiCapNuocDanhSach = new ArrayList<DSDauNoiMoiCapNuocDanhSach>();
		
		if(thoigianthuc.equalsIgnoreCase(ReportConstant.THUC)){
			log.info("===DSDauNoiMoiCapNuocExport======THUC===="+thoigianthuc);
			//lstdauNoiNuoc = DauNoiNuocBusiness.getDauNoiByMaTinhTramIdTrangThaiAndNamThoiGianThuc(maTinh,DANHGIAKIEMDEM,namBaoCao);
			List<THONGTINKIEMDEMNUOC> lstThongtinkiemdemnuoc = THONGTINKIEMDEMNUOCBusiness.getThongTinDNNThoiGianThuc(maTinh, namBaoCao, DANHGIAKIEMDEM);
			
			if(Validator.isNotNull(lstThongtinkiemdemnuoc) && lstThongtinkiemdemnuoc.size() > 0){
				log.info("===DSDauNoiMoiCapNuocExport===getModel---===lstThongtinkiemdemnuoc---"+lstThongtinkiemdemnuoc.size());
				for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : lstThongtinkiemdemnuoc) {
					dsDauNoiMoiCapNuocDanhSach = new DSDauNoiMoiCapNuocDanhSach();
					
					String tenHeThongCapNuocValue = "";
					String huyenValue = "";
					String xaValue = "";
					String thonValue = "";
					String tenChuHoValue = "";
					String toaDoValue = "";
					String soNguoiTrongHoValue = "";
					String ngayDauNoiValue = "";
					String soSeriDongHoNuocValue = "";
					String ngayDanhGiaValue = "";
					
					TramCapNuoc tramCapNuoc = TramCapBusiness.getTramCapNuocByMaTinhAndDNNID(maTinh, String.valueOf(thongtinkiemdemnuoc.getDauNoiNuocId()));
					if(Validator.isNotNull(tramCapNuoc)){
						tenHeThongCapNuocValue = Validator.isNotNull(tramCapNuoc.getTenTram()) ? tramCapNuoc.getTenTram() : "";
					}
					huyenValue = Validator.isNotNull(thongtinkiemdemnuoc.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, thongtinkiemdemnuoc.getMaHuyen()) : "";
					xaValue = Validator.isNotNull(thongtinkiemdemnuoc.getMaXa()) ? NuocSachUtils.getNameXa( thongtinkiemdemnuoc.getMaXa()) : "";
					thonValue = Validator.isNotNull(thongtinkiemdemnuoc.getThonXom()) ? thongtinkiemdemnuoc.getThonXom() : "";
					tenChuHoValue = Validator.isNotNull(thongtinkiemdemnuoc.getTenChuHo()) ? thongtinkiemdemnuoc.getTenChuHo() : "";
					String kinhDoTemp = Validator.isNotNull(thongtinkiemdemnuoc.getKinhDo()) ? thongtinkiemdemnuoc.getKinhDo() : "";
					String viDoTemp = Validator.isNotNull(thongtinkiemdemnuoc.getViDo()) ? "/"+thongtinkiemdemnuoc.getViDo() : "";
					toaDoValue = kinhDoTemp + viDoTemp;
					
					soNguoiTrongHoValue = Validator.isNotNull(thongtinkiemdemnuoc.getSoNguoiTrongHo()) ? String.valueOf( thongtinkiemdemnuoc.getSoNguoiTrongHo()) : "";
					ngayDauNoiValue = Validator.isNotNull(thongtinkiemdemnuoc.getThoiGianDauNoiThucTe()) ? ConvertUtil.parseDateToString(thongtinkiemdemnuoc.getThoiGianDauNoiThucTe()) : "";
					soSeriDongHoNuocValue = Validator.isNotNull(thongtinkiemdemnuoc.getSoSeRyDongHo()) ? thongtinkiemdemnuoc.getSoSeRyDongHo() : "";
					ngayDanhGiaValue = Validator.isNotNull(thongtinkiemdemnuoc.getNgayKiemDem()) ? ConvertUtil.parseDateToString(thongtinkiemdemnuoc.getNgayKiemDem()) : "";
					
					dsDauNoiMoiCapNuocDanhSach.setTenHeThongCapNuoc(tenHeThongCapNuocValue);
					dsDauNoiMoiCapNuocDanhSach.setHuyen(huyenValue);
					dsDauNoiMoiCapNuocDanhSach.setXa(xaValue);
					dsDauNoiMoiCapNuocDanhSach.setThon(thonValue);
					dsDauNoiMoiCapNuocDanhSach.setTenChuHo(tenChuHoValue);
					dsDauNoiMoiCapNuocDanhSach.setToaDo(toaDoValue);
					dsDauNoiMoiCapNuocDanhSach.setSoNguoiTrongHo(soNguoiTrongHoValue);
					dsDauNoiMoiCapNuocDanhSach.setNgayDauNoi(ngayDauNoiValue);
					dsDauNoiMoiCapNuocDanhSach.setSoSeriDongHoNuoc(soSeriDongHoNuocValue);
					dsDauNoiMoiCapNuocDanhSach.setNgayDanhGia(ngayDanhGiaValue);
					dsDauNoiMoiCapNuocDanhSach.setTenTinh(tenTinhValue);
					
					lstDSDauNoiMoiCapNuocDanhSach.add(dsDauNoiMoiCapNuocDanhSach);
				}
			}
			
		}else if (thoigianthuc.equalsIgnoreCase(ReportConstant.CHOT)){
			log.info("===DSDauNoiMoiCapNuocExport======CHOT===="+thoigianthuc);
			List<DauNoiNuoc> lstdauNoiNuoc = DauNoiNuocBusiness.getDauNoiByMaTinhTramIdTrangThaiAndNam(maTinh, null, TRANGTHAI, namBaoCao);
			if(Validator.isNotNull(lstdauNoiNuoc) && lstdauNoiNuoc.size() > 0){
				log.info("===DSDauNoiMoiCapNuocExport===getModel---===lstdauNoiNuoc---"+lstdauNoiNuoc.size());
				for(DauNoiNuoc dauNoiNuoc : lstdauNoiNuoc){
					dsDauNoiMoiCapNuocDanhSach = new DSDauNoiMoiCapNuocDanhSach();
					
					String tenHeThongCapNuocValue = "";
					String huyenValue = "";
					String xaValue = "";
					String thonValue = "";
					String tenChuHoValue = "";
					String toaDoValue = "";
					String soNguoiTrongHoValue = "";
					String ngayDauNoiValue = "";
					String soSeriDongHoNuocValue = "";
					String ngayDanhGiaValue = "";
					
					tenHeThongCapNuocValue = Validator.isNotNull(dauNoiNuoc.getTramCapNuocId()) ? NuocSachUtils.getTenTramByTramId(String.valueOf(dauNoiNuoc.getTramCapNuocId())) : "";
					huyenValue = Validator.isNotNull(dauNoiNuoc.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, dauNoiNuoc.getMaHuyen()) : "";
					xaValue = Validator.isNotNull(dauNoiNuoc.getMaXa()) ? NuocSachUtils.getNameXa( dauNoiNuoc.getMaXa()) : "";
					thonValue = Validator.isNotNull(dauNoiNuoc.getThonXom()) ? dauNoiNuoc.getThonXom() : "";
					tenChuHoValue = Validator.isNotNull(dauNoiNuoc.getTenChuHo()) ? dauNoiNuoc.getTenChuHo() : "";
					
					String kinhDoTemp = Validator.isNotNull(dauNoiNuoc.getKinhDo()) ? dauNoiNuoc.getKinhDo() : "";
					String viDoTemp = Validator.isNotNull(dauNoiNuoc.getViDo()) ? "/"+dauNoiNuoc.getViDo() : "";
					toaDoValue = kinhDoTemp + viDoTemp;
					
					soNguoiTrongHoValue = Validator.isNotNull(dauNoiNuoc.getSoNguoiTrongHo()) ? String.valueOf( dauNoiNuoc.getSoNguoiTrongHo()) : "";
					ngayDauNoiValue = Validator.isNotNull(dauNoiNuoc.getNgayDauNoiThucTe()) ? ConvertUtil.parseDateToString(dauNoiNuoc.getNgayDauNoiThucTe()) : "";
					soSeriDongHoNuocValue = Validator.isNotNull(dauNoiNuoc.getSoSeryDongHo()) ? dauNoiNuoc.getSoSeryDongHo() : "";
					ngayDanhGiaValue = Validator.isNotNull(dauNoiNuoc.getNgayDanhGia()) ? ConvertUtil.parseDateToString(dauNoiNuoc.getNgayDanhGia()) : "";
					
					dsDauNoiMoiCapNuocDanhSach.setTenHeThongCapNuoc(tenHeThongCapNuocValue);
					dsDauNoiMoiCapNuocDanhSach.setHuyen(huyenValue);
					dsDauNoiMoiCapNuocDanhSach.setXa(xaValue);
					dsDauNoiMoiCapNuocDanhSach.setThon(thonValue);
					dsDauNoiMoiCapNuocDanhSach.setTenChuHo(tenChuHoValue);
					dsDauNoiMoiCapNuocDanhSach.setToaDo(toaDoValue);
					dsDauNoiMoiCapNuocDanhSach.setSoNguoiTrongHo(soNguoiTrongHoValue);
					dsDauNoiMoiCapNuocDanhSach.setNgayDauNoi(ngayDauNoiValue);
					dsDauNoiMoiCapNuocDanhSach.setSoSeriDongHoNuoc(soSeriDongHoNuocValue);
					dsDauNoiMoiCapNuocDanhSach.setNgayDanhGia(ngayDanhGiaValue);
					dsDauNoiMoiCapNuocDanhSach.setTenTinh(tenTinhValue);
					
					lstDSDauNoiMoiCapNuocDanhSach.add(dsDauNoiMoiCapNuocDanhSach);
				}

			}
			
			
		}
		
		
		
		
		log.info("===DSDauNoiMoiCapNuocExport===getModel--result--==lstDSDauNoiMoiCapNuocDanhSach--"+lstDSDauNoiMoiCapNuocDanhSach.size() +"==thoigianthuc=="+thoigianthuc);
		result.setNam(namValue);
		result.setTenTinh(tenTinhValue);
		result.setBaoCaoSo(baoCaoSoValue);
		result.setBaoCaoNgayThangNam(baoCaoNgayThangNamValue);
		result.setNguoiLap(nguoiLapValue);
		result.setNguoiDuyet(nguoiDuyetValue);
		result.setLstDSDauNoiMoiCapNuocDanhSachs(lstDSDauNoiMoiCapNuocDanhSach);
		return result;
		
	}
}
