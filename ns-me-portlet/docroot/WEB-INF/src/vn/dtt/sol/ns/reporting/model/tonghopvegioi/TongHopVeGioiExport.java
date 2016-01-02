package vn.dtt.sol.ns.reporting.model.tonghopvegioi;

import vn.dtt.sol.ns.danhgiavesinh.business.DANHGIAVESINHXABusiness;
import vn.dtt.sol.ns.tramcap.business.DauNoiNuocBusiness;
import vn.dtt.sol.ns.tramcap.business.THONGTINKIEMDEMNUOCBusiness;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.WebKeys;
import vn.dtt.sol.ns.util.format.ConvertUtil;
import vn.dtt.sol.ns.vesinhmoitruong.business.ThongTinKiemDemHoGDBusiness;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class TongHopVeGioiExport {
	private static Log _log = LogFactoryUtil.getLog(TongHopVeGioiExport.class);
	
	public static TongHopVeGioi getModel(String nam, String maTinh){
		String DANHGIAKIEMDEMDNN = "1"; ///danhgiakiemdem 1 la kiem dem dat
		String DANHGIAKIEMDEMVSHGD = "1";// danhgiakiemdem 1 la co nha tieu hvs xay moi
		TongHopVeGioi result = new TongHopVeGioi();
		_log.info("===TongHopVeGioiExport===");
		
		String namValue = "";
		String tenTinhValue = "";
		
		String tongSo11Value = "";
		String chuHoNam11Value = "";
		String chuHoNu11Value = "";
		int tongSo11ValueInt = 0;
		int chuHoNam11ValueInt = 0;
		int chuHoNu11ValueInt = 0;
		
		String tongSo12Value = "";
		String chuHoNam12Value = "";
		String chuHoNu12Value = "";
		int tongSo12ValueInt = 0;
		int chuHoNam12ValueInt = 0;
		int chuHoNu12ValueInt = 0;
		
		String tongSo22Value = "";
		String chuHoNam22Value = "";
		String chuHoNu22Value = "";
		int tongSo22ValueInt = 0;
		int chuHoNam22ValueInt = 0;
		int chuHoNu22ValueInt = 0;
		
		namValue = Validator.isNotNull(nam) ? nam : "";
		tenTinhValue = NuocSachUtils.getNameTinh(maTinh);
		
		chuHoNam11ValueInt = THONGTINKIEMDEMNUOCBusiness.countGioiTinhChuHo(maTinh, nam, String.valueOf(WebKeys.GIOITINH_NAM), DANHGIAKIEMDEMDNN);
		chuHoNu11ValueInt = THONGTINKIEMDEMNUOCBusiness.countGioiTinhChuHo(maTinh, nam, String.valueOf(WebKeys.GIOITINH_NU), DANHGIAKIEMDEMDNN);
		tongSo11ValueInt = chuHoNam11ValueInt + chuHoNu11ValueInt;
		chuHoNam11Value = ConvertUtil.parseIntToString1000(chuHoNam11ValueInt);
		chuHoNu11Value = ConvertUtil.parseIntToString1000(chuHoNu11ValueInt);
		tongSo11Value = ConvertUtil.parseIntToString1000(tongSo11ValueInt);
		
		chuHoNam12ValueInt = ThongTinKiemDemHoGDBusiness.countGioiTinhChuHo(maTinh, nam, String.valueOf(WebKeys.GIOITINH_NAM), DANHGIAKIEMDEMVSHGD);
		chuHoNu12ValueInt = ThongTinKiemDemHoGDBusiness.countGioiTinhChuHo(maTinh, nam, String.valueOf(WebKeys.GIOITINH_NU), DANHGIAKIEMDEMVSHGD);
		tongSo12ValueInt = chuHoNam12ValueInt + chuHoNu12ValueInt;
		chuHoNam12Value = ConvertUtil.parseIntToString1000(chuHoNam12ValueInt);
		chuHoNu12Value = ConvertUtil.parseIntToString1000(chuHoNu12ValueInt);
		tongSo12Value = ConvertUtil.parseIntToString1000(tongSo12ValueInt);
		
		tongSo22ValueInt = DANHGIAVESINHXABusiness.sumSoNguoiHuongLoiByMaTinh(maTinh, nam);
		tongSo22Value = ConvertUtil.parseIntToString1000(tongSo22ValueInt);
		
		result.setNam(namValue);
		result.setTenTinh(tenTinhValue);
		result.setTongSo11(tongSo11Value);
		result.setChuHoNam11(chuHoNam11Value);
		result.setChuHoNu11(chuHoNu11Value);
		
		result.setTongSo12(tongSo12Value);
		result.setChuHoNam12(chuHoNam12Value);
		result.setChuHoNu12(chuHoNu12Value);
		
		result.setTongSo22(tongSo22Value);
		result.setChuHoNam22(chuHoNam22Value);
		result.setChuHoNu22(chuHoNu22Value);
		return result;
	}
}
