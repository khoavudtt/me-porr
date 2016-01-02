package vn.dtt.sol.ns.tramcap.business;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM;
import vn.dtt.sol.ns.maungaunhien.dao.service.MAUKIEMDEMLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class MauNgauNhienBusiness {

	/**
	 * @param maTinh
	 * @param maHuyen
	 * @param maXa
	 * @param mauNgauNhien
	 * @return
	 */
	public static List<VeSinhGiaDinh> getVSDGByTHXMNN(String maTinh,
			String maHuyen, String maXa, int mauNgauNhien) {
		List<VeSinhGiaDinh> lsVeSinhGaiDinh = new ArrayList<VeSinhGiaDinh>();

		try {
			lsVeSinhGaiDinh = VeSinhGiaDinhLocalServiceUtil.getVSGDByTHXMNN(
					maTinh, maHuyen, maXa, mauNgauNhien);
		} catch (Exception e) {
			_log.error(e);
		}

		return lsVeSinhGaiDinh;
	}

	/**
	 * @param maTinh
	 * @param maHuyen
	 * @param maXa
	 * @param nam
	 * @return
	 */
	public static MAUKIEMDEM getMauKiemDemByTHXN(String maTinh, String maHuyen,
			String maXa, int nam) {
		MAUKIEMDEM mauKiemDem = null;

		try {
			mauKiemDem = MAUKIEMDEMLocalServiceUtil.getMauKiemDemByTHXN(maTinh,
					maXa, maHuyen, nam);
		} catch (Exception e) {
			_log.error(e);
		}

		return mauKiemDem;
	}

	/**
	 * @param maTinh
	 * @param maHuyen
	 * @param maXa
	 * @param namLayMau
	 * @param start
	 * @param end
	 * @return
	 */
	public static List<VeSinhGiaDinh> findVSGD(String maTinh, String maHuyen,
			String maXa, int namLayMau, int start, int end) {

		List<VeSinhGiaDinh> ls = new ArrayList<VeSinhGiaDinh>();

		try {
			ls = VeSinhGiaDinhLocalServiceUtil.getVSGDByTHXMNN(maTinh, maHuyen,
					maXa, namLayMau, start, end);

		} catch (Exception e) {
			_log.error(e);
		}

		return ls;
	}

	/**
	 * @param maTinh
	 * @param maHuyen
	 * @param maXa
	 * @param namLayMau
	 * @return
	 */
	public static int countVSGD(String maTinh, String maHuyen, String maXa,
			int namLayMau) {
		int count = 0;

		try {
			count = VeSinhGiaDinhLocalServiceUtil.countVSGDByTHXMNN(maTinh, maHuyen, maXa, namLayMau);
		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	/**
	 * @param nam
	 * @param tinh
	 * @param huyen
	 * @param xa
	 * @param start
	 * @param end
	 * @return
	 */
	public static List<MAUKIEMDEM> findMKD(int nam, String tinh, String huyen,
			String xa, int start, int end) {
		List<MAUKIEMDEM> ls = new ArrayList<MAUKIEMDEM>();

		try {
			ls = MAUKIEMDEMLocalServiceUtil.findMKD(nam, tinh, huyen, xa,
					start, end);
		} catch (Exception e) {
			_log.error(e);
		}

		return ls;
	}

	/**
	 * @param nam
	 * @param tinh
	 * @param huyen
	 * @param xa
	 * @return
	 */
	public static int countMKD(int nam, String tinh, String huyen, String xa) {

		int count = 0;

		try {
			count = MAUKIEMDEMLocalServiceUtil.countMKD(nam, tinh, huyen, xa);
		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	private static final Log _log = LogFactoryUtil
			.getLog(MauNgauNhienBusiness.class);

}
