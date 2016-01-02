package vn.dtt.sol.ns.reporting.model.dli21;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

public class HTCapNuocBenVungExport {
	private static Log log = LogFactoryUtil.getLog(HTCapNuocBenVungExport.class);
	
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
	public static HTCapNuocBenVung getModel(String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet) {
		HTCapNuocBenVung result = new HTCapNuocBenVung();
		
		HTCapNuocBenVungDanhSach htCapNuocBenVungDanhSach = null;
		List<HTCapNuocBenVungDanhSach> lstHTCapNuocBenVungDanhSach = null;
		
		String namValue = "";
		String tinhValue = "";
		String baoCaoSoValue = "";
		String ngay_thang_namValue = "";
		String nguoiLapValue = "";
		String nguoiDuyetValue = "";
		

		
		namValue = namBaoCao;		
		tinhValue = NuocSachUtils.getNameTinh(maTinh);
		baoCaoSoValue = Validator.isNotNull(soBaoCao) ? soBaoCao : "" ;
		if(Validator.isNotNull(ngayBaoCao)){
			Date dateNgayBaoCao = FormatData.parseStringToDateTypeDDMMYYYY(ngayBaoCao.trim());
			ngay_thang_namValue = ReportFunction.parserDateToString4(dateNgayBaoCao);
		}
		if(Validator.isNotNull(nguoiLap)){
			nguoiLapValue = nguoiLap;
		}
		if(Validator.isNotNull(nguoiDuyet)){
			nguoiDuyetValue = nguoiDuyet;
		}		
		List<TramCapNuoc> lstTramCapNuoc = TramCapBusiness.getTramCapNuocByDanhGiaBenVung(maTinh, namBaoCao, "1");
		// ketquadanhgia = 1 : ben vung
		lstHTCapNuocBenVungDanhSach = new ArrayList<HTCapNuocBenVungDanhSach>();
		if(Validator.isNotNull(lstTramCapNuoc) && lstTramCapNuoc.size() > 0){
			log.info("===HTCapNuocBenVungExport===getModel---===lstTramCapNuoc---"+lstTramCapNuoc.size());
			
			for(TramCapNuoc tramCapNuoc : lstTramCapNuoc){
				htCapNuocBenVungDanhSach = new HTCapNuocBenVungDanhSach();
				
				
				String tenHeThongCapNuocValue = "";
				String huyenValue = "";
				String xaValue = "";
				String soNguoiHuongLoiValue = "0";
				
				tenHeThongCapNuocValue = Validator.isNotNull(tramCapNuoc.getTenTram()) ? String.valueOf(tramCapNuoc.getTenTram()) : "";
				huyenValue = Validator.isNotNull(tramCapNuoc.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, tramCapNuoc.getMaHuyen()) : "";
				xaValue = Validator.isNotNull(tramCapNuoc.getMaXa()) ? NuocSachUtils.getNameXa( tramCapNuoc.getMaXa()) : "";
				
				
				DanhGiaBenVung danhGiaBenVungSoNgHuongLoi = 
						DanhGiaBenVungBussiness.getDanhGiaBenVungByTramCapNuocAndNam(tramCapNuoc.getId(), null, "1");
				// ketquadanhgia = 1 : ben vung
				if(Validator.isNotNull(danhGiaBenVungSoNgHuongLoi)){
					soNguoiHuongLoiValue = 
							Validator.isNotNull(danhGiaBenVungSoNgHuongLoi.getSoNguoiCapThucTe()) ? ConvertUtil.parseIntToString1000(danhGiaBenVungSoNgHuongLoi.getSoNguoiCapThucTe()) : "0" ;
				}
				
				htCapNuocBenVungDanhSach.setTenHeThongCapNuoc(tenHeThongCapNuocValue);
				htCapNuocBenVungDanhSach.setHuyen(huyenValue);
				htCapNuocBenVungDanhSach.setXa(xaValue);
				htCapNuocBenVungDanhSach.setSoNguoiHuongLoi(soNguoiHuongLoiValue);
				
				lstHTCapNuocBenVungDanhSach.add(htCapNuocBenVungDanhSach);
			}
		}
		
		result.setNam(namValue);
		result.setTinh(tinhValue);
		result.setBaoCaoSo(baoCaoSoValue);
		result.setNgay_thang_nam(ngay_thang_namValue);
		result.setNguoiLap(nguoiLapValue);
		result.setNguoiDuyet(nguoiDuyetValue);
		result.setDanhSachTenHeThongCapNuoc(lstHTCapNuocBenVungDanhSach);
		
		return result;
	}
}
