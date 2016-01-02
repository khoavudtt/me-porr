package vn.dtt.sol.ns.tramcap.business;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh;
import vn.dtt.sol.ns.tramcap.dao.service.DanhGiaVanHanhLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class DanhGiaVanHanhBusiness {
	
	
	
	/**
	 * @param tramCapId
	 * @param thangId
	 * @param namId
	 * @return
	 */
	public static DanhGiaVanHanh getByThangNamTram(long tramCapId, int thangId, int namId) {
		
		try {
			return DanhGiaVanHanhLocalServiceUtil.getDanhGiaByThanhNamTram(tramCapId, thangId, namId);
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
	}

	/**
	 * @param tramCapId
	 * @return
	 */
	public static int getNuocThatThoat(int tramCapId) {

		int nuocThatThoat = 0;
		int tempNuocThatThoat = 0;
		int totalNuocThatThoat = 0;

		List<DanhGiaVanHanh> totalDanhGia = getByTramCapId(tramCapId);

		for (DanhGiaVanHanh danhGia : totalDanhGia) {
			tempNuocThatThoat = danhGia.getNuocThatThoat();

			totalNuocThatThoat = tempNuocThatThoat + totalNuocThatThoat;
		}

		nuocThatThoat = totalNuocThatThoat / totalDanhGia.size();

		return nuocThatThoat;
	}

	/**
	 * @param tramCapId
	 * @return
	 */
	/**
	 * @param tramCapId
	 * @return
	 */
	public static int getTongDoanhThu(int tramCapId) {
		int doanhThuThang = 0;
		int tongDoanhThu = 0;

		List<DanhGiaVanHanh> totalDanhGia = getByTramCapId(tramCapId);

		for (DanhGiaVanHanh danhGia : totalDanhGia) {
			doanhThuThang = danhGia.getDoanhThu();

			tongDoanhThu = doanhThuThang + tongDoanhThu;
		}

		return tongDoanhThu;
	}

	/**
	 * @param tramCap
	 * @return
	 */
	public static int getTongChiPhiTram(int tramCapId) {

		int tongChiPhiThang = 0;
		int tongChiPhi = 0;

		List<DanhGiaVanHanh> totalDanhGia = new ArrayList<DanhGiaVanHanh>();

		totalDanhGia = getByTramCapId(tramCapId);

		for (DanhGiaVanHanh danhGia : totalDanhGia) {
			tongChiPhiThang = danhGia.getChiPhiDien()
					+ danhGia.getChiPhiHoaChat() + danhGia.getChiPhiSuaChua()
					+ danhGia.getLuongNhanVien();

			tongChiPhi = tongChiPhi + tongChiPhiThang;
		}

		return tongChiPhiThang;
	}

	/**
	 * @param tramCapId
	 * @return
	 */
	public static List<DanhGiaVanHanh> getByTramCapId(int tramCapId) {
		List<DanhGiaVanHanh> ls = new ArrayList<DanhGiaVanHanh>();

		try {
			ls = DanhGiaVanHanhLocalServiceUtil.getByTramCap(tramCapId);
		} catch (Exception e) {
			_log.error(e);
		}

		return ls;
	}

	/**
	 * @param tramCapId
	 * @param nam
	 * @return
	 */
	public static List<DanhGiaVanHanh> findDanhGia(int tramCapId, int nam) {
		List<DanhGiaVanHanh> ls = new ArrayList<DanhGiaVanHanh>();

		try {
			ls = DanhGiaVanHanhLocalServiceUtil.getByTramCapAndNam(tramCapId,
					nam);
		} catch (Exception e) {
			_log.error(e);
		}

		return ls;
	}

	public static List<DanhGiaVanHanh> findDanhGia(int tramCapId, int nam,
			int start, int end) {
		List<DanhGiaVanHanh> ls = new ArrayList<DanhGiaVanHanh>();

		try {
			ls = DanhGiaVanHanhLocalServiceUtil.getByTramCapAndNam(tramCapId,
					nam);
		} catch (Exception e) {
			_log.error(e);
		}

		return ls;
	}

	
	public static int countDanhGia(int tramCapId, int nam) {
		int count = 0;

		try {
			count = DanhGiaVanHanhLocalServiceUtil.coutByTramCapAndNam(tramCapId, nam);
		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	private static Log _log = LogFactoryUtil
			.getLog(DanhGiaVanHanhBusiness.class);
}
