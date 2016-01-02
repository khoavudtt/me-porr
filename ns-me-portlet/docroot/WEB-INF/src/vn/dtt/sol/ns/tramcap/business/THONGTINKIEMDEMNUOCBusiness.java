package vn.dtt.sol.ns.tramcap.business;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;
import vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class THONGTINKIEMDEMNUOCBusiness {
	private static Log _log = LogFactoryUtil.getLog(THONGTINKIEMDEMNUOCBusiness.class);
	
	public static List<THONGTINKIEMDEMNUOC> getThongTinDNNThoiGianThuc(String maTinh, String namBaoCao, String danhgiakiemdem) {
		List<THONGTINKIEMDEMNUOC> ls = new ArrayList<THONGTINKIEMDEMNUOC>();

		try {

			ls = THONGTINKIEMDEMNUOCLocalServiceUtil.getThongTinDNNThoiGianThuc(maTinh,namBaoCao,danhgiakiemdem);

		} catch (Exception e) {
			_log.error(e);
		}

		return ls;
	}
	public static List<THONGTINKIEMDEMNUOC> getListBykeHoachKiemDemNuocId(int keHoachKiemDemNuocId) {
		List<THONGTINKIEMDEMNUOC> ls = new ArrayList<THONGTINKIEMDEMNUOC>();

		try {

			ls = THONGTINKIEMDEMNUOCLocalServiceUtil.getListBykeHoachKiemDemNuocId(keHoachKiemDemNuocId,QueryUtil.ALL_POS,QueryUtil.ALL_POS);

		} catch (Exception e) {
			_log.error(e);
		}

		return ls;
	}
	
	public static int countGioiTinhChuHo(String maTinh, String namBaoCao, String gioiTinhChuHo, String danhGiaKiemDem) {
		int count = 0;

		try {
			count = THONGTINKIEMDEMNUOCLocalServiceUtil.countGioiTinhChuHo( maTinh,  namBaoCao,  gioiTinhChuHo,  danhGiaKiemDem);
		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}
}
