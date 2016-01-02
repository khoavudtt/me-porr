package vn.dtt.sol.ns.tramcap.business;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.tramcap.dao.service.DanhGiaBenVungLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class DanhGiaBenVungBussiness {

	/**
	 * @param danhGiaid
	 * @return
	 */
	public static DanhGiaBenVung findBenVungById(long danhGiaid) {
		DanhGiaBenVung danhGia = null;

		try {
			danhGia = DanhGiaBenVungLocalServiceUtil
					.fetchDanhGiaBenVung(danhGiaid);
		} catch (Exception e) {
			_log.error(e);
		}

		return danhGia;
	}

	/**
	 * @param maTinh
	 * @param maTramCap
	 * @param start
	 * @param end
	 * @return
	 */
	public static List<DanhGiaBenVung> findDanhGiaBenVung(String maTinh,
			int maTramCap, int start, int end) {

		List<DanhGiaBenVung> ls = new ArrayList<DanhGiaBenVung>();

		int[] lsTramCap = buildArrayTramCap(maTinh, maTramCap);

		try {
			ls = DanhGiaBenVungLocalServiceUtil.findDanhGia(lsTramCap, start,
					end);
		} catch (Exception e) {
			_log.error(e);
		}

		return ls;

	}

	/**
	 * @param maTinh
	 * @param maTramCap
	 * @return
	 */
	public static int countDanhGiaBenVung(String maTinh, int maTramCap) {
		int count = 0;

		int[] lsTramCap = buildArrayTramCap(maTinh, maTramCap);

		try {
			count = DanhGiaBenVungLocalServiceUtil.countDanhGia(lsTramCap);
		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	/**
	 * @param maTinh
	 * @param maTramCap
	 * @return
	 */
	private static int[] buildArrayTramCap(String maTinh, int maTramCap) {
		int[] arrTramCap;

		List<TramCapNuoc> lsTramCap = new ArrayList<TramCapNuoc>();

		lsTramCap = TramCapBusiness.findTramCap(maTinh, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS);

		if (Validator.isNull(maTinh)) {
			arrTramCap = new int[0];
		} else {
			if (maTramCap == 0) {
				arrTramCap = new int[lsTramCap.size()];

				for (int i = 0; i < lsTramCap.size(); i++) {
					arrTramCap[i] = (int) lsTramCap.get(i).getId();
				}
			} else {
				arrTramCap = new int[] { maTramCap };
			}
		}
		
		return arrTramCap;
	}

	/**
	 * @param nam
	 * @param tramCapId
	 * @return
	 */
	public static DanhGiaBenVung getDanhGiaBenVungByNam(int nam, int tramCapId) {
		DanhGiaBenVung benVung = null;

		try {
			benVung = DanhGiaBenVungLocalServiceUtil.getDanhGiaByNam(nam,
					tramCapId);
		} catch (Exception e) {
			_log.error(e);
		}

		return benVung;
	}

	public static DanhGiaBenVung getDanhGiaBenVungByTramCapNuocAndNam(
			long tramCapNuocId, String nam, String ketquadanhgia) {
		DanhGiaBenVung danhGiaBenVung = null;
		try {
			danhGiaBenVung = DanhGiaBenVungLocalServiceUtil
					.getDanhGiaBenVungByTramCapNuocAndNam(tramCapNuocId, nam,
							ketquadanhgia);
		} catch (Exception e) {
			_log.error(e);
		}

		return danhGiaBenVung;
	}

	private static Log _log = LogFactoryUtil
			.getLog(DanhGiaBenVungBussiness.class);
}
