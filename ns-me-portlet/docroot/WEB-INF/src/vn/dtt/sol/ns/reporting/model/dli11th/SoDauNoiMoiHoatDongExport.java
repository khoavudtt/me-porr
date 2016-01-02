package vn.dtt.sol.ns.reporting.model.dli11th;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.sol.ns.reporting.utils.ReportConstant;
import vn.dtt.sol.ns.reporting.utils.ReportFunction;
import vn.dtt.sol.ns.tramcap.business.DanhGiaBenVungBussiness;
import vn.dtt.sol.ns.tramcap.business.TramCapBusiness;
import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.format.ConvertUtil;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class SoDauNoiMoiHoatDongExport {
	private static Log log = LogFactoryUtil.getLog(SoDauNoiMoiHoatDongExport.class);
	
	/**
	 * @author tailt
	 * @param namBaoCao
	 * @param maTinh
	 * @param soBaoCao
	 * @param ngayBaoCao
	 * @param nguoiLap
	 * @param nguoiDuyet
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static SoDauNoiMoiHoatDong getModel(String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String thoigianthuc) {
		log.info("===SoDauNoiMoiHoatDongExport===");
		log.info("--getModel==namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao+"==maTinh--"+maTinh);
		String DANHGIAKIEMDEM = "1"; ///danhgiakiemdem 1 la kiem dem dat		
		SoDauNoiMoiHoatDong result = new SoDauNoiMoiHoatDong();
		
		SoDauNoiMoiHoatDongDanhSach soDauNoiMoiHoatDongDanhSach = null;
		List<SoDauNoiMoiHoatDongDanhSach> lstSoDauNoiMoiHoatDongDanhSach = null;
		
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
		
		List<TramCapNuoc> lstTramCapNuoc = new ArrayList<TramCapNuoc>();
		if(thoigianthuc.equalsIgnoreCase(ReportConstant.THUC)){
			log.info("===SoDauNoiMoiHoatDongExport======THUC===="+thoigianthuc);
			lstTramCapNuoc  = TramCapBusiness.getTramCapNuocByThoiGianThuc(maTinh, namBaoCao, DANHGIAKIEMDEM); 
			
		}else if (thoigianthuc.equalsIgnoreCase(ReportConstant.CHOT)){
			log.info("===SoDauNoiMoiHoatDongExport======CHOT===="+thoigianthuc);
			lstTramCapNuoc  = TramCapBusiness.getTramCapNuocByTinhDauNoiNuoc(maTinh, namBaoCao);
			
		}
		
		
		
		lstSoDauNoiMoiHoatDongDanhSach = new ArrayList<SoDauNoiMoiHoatDongDanhSach>();
		if(Validator.isNotNull(lstTramCapNuoc) && lstTramCapNuoc.size() > 0){
			log.info("===SoDauNoiMoiHoatDongExport===getModel---===lstTramCapNuoc---"+lstTramCapNuoc.size());
			for(TramCapNuoc tramCapNuoc : lstTramCapNuoc){
				soDauNoiMoiHoatDongDanhSach = new SoDauNoiMoiHoatDongDanhSach();
				
				String tenHeThongCapNuocValue = "";
				String huyenValue = "";
				String xaValue = "";
				String soDauNoiMoiHoatDongValue = "0";
				
				tenHeThongCapNuocValue = Validator.isNotNull(tramCapNuoc.getTenTram()) ? tramCapNuoc.getTenTram() : "";
				huyenValue = Validator.isNotNull(tramCapNuoc.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, tramCapNuoc.getMaHuyen()) : "";
				xaValue = Validator.isNotNull(tramCapNuoc.getMaXa()) ? NuocSachUtils.getNameXa( tramCapNuoc.getMaXa()) : "";
				
				
				if(thoigianthuc.equalsIgnoreCase(ReportConstant.THUC)){
					log.info("===SoDauNoiMoiHoatDongExport======THOIGIANTHUC==lstTramCapNuoc=="+thoigianthuc);
					int countDauNoiTemp = TramCapBusiness.countTramCapThoiGianThuc(maTinh,namBaoCao,DANHGIAKIEMDEM,String.valueOf(tramCapNuoc.getId()));
					soDauNoiMoiHoatDongValue = (countDauNoiTemp > 0) ? ConvertUtil.parseIntToString1000(countDauNoiTemp) : "0";
					
				}else if (thoigianthuc.equalsIgnoreCase(ReportConstant.CHOT)){
					log.info("===SoDauNoiMoiHoatDongExport======THOIGIANCHOT==lstTramCapNuoc=="+thoigianthuc);
					DanhGiaBenVung danhGiaBenVung = DanhGiaBenVungBussiness.getDanhGiaBenVungByTramCapNuocAndNam(tramCapNuoc.getId(),namBaoCao,null); // tramcapnuoc join danhgiabenvung chi bang tramcapid thoi
					if(Validator.isNotNull(danhGiaBenVung)){
						int countDauNoiTemp = danhGiaBenVung.getTongDauNoiMoi();
						soDauNoiMoiHoatDongValue = (countDauNoiTemp > 0) ? ConvertUtil.parseIntToString1000(countDauNoiTemp) : "0";
					}
				}
				
				
				
				
				soDauNoiMoiHoatDongDanhSach.setTenHeThongCapNuoc(tenHeThongCapNuocValue);
				soDauNoiMoiHoatDongDanhSach.setHuyen(huyenValue);
				soDauNoiMoiHoatDongDanhSach.setXa(xaValue);				
				soDauNoiMoiHoatDongDanhSach.setSoDauNoiMoiHoatDong(soDauNoiMoiHoatDongValue);
				
				lstSoDauNoiMoiHoatDongDanhSach.add(soDauNoiMoiHoatDongDanhSach);
			}
			
		}
		log.info("===SoDauNoiMoiHoatDongExport===getModel--result--===namValue---"+namValue+"==tenTinhValue--"+tenTinhValue+"==baoCaoSoValue--"+baoCaoSoValue+"==baoCaoNgayThangNamValue--"+baoCaoNgayThangNamValue+"==lstSoDauNoiMoiHoatDongDanhSach--"+lstSoDauNoiMoiHoatDongDanhSach.size());
		
		result.setNam(namValue);
		result.setTenTinh(tenTinhValue);
		result.setBaoCaoSo(baoCaoSoValue);
		result.setBaoCaoNgayThangNam(baoCaoNgayThangNamValue);
		result.setNguoiLap(nguoiLapValue);
		result.setNguoiDuyet(nguoiDuyetValue);
		result.setLstDoDauNoiMoiHoatDongDanhSach(lstSoDauNoiMoiHoatDongDanhSach);
		return result;
	}
}
