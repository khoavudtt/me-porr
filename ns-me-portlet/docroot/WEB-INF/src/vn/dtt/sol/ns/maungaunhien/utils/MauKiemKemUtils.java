package vn.dtt.sol.ns.maungaunhien.utils;

import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

public class MauKiemKemUtils {

	/**
	 * Lay so mau kiem dem trong xa
	 * 
	 * @param maTinh
	 * @param maHuyen
	 * @param maXa
	 * @return {@link Integer} - So mau kiem dem trong xa
	 */
	public static int getSoMau(String maTinh, String maHuyen, String maXa) {
		int soMau = 0;

		try {
			soMau = VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch(
					maTinh, maHuyen, maXa, StringPool.BLANK, StringPool.BLANK,
					StringPool.BLANK,StringPool.BLANK);
		} catch (Exception e) {
			_log.error(e);
		}

		return soMau;
	}

	/**
	 * Get so mau ngau nhien can kiem dem
	 * 
	 * @param deltal
	 * @param totalSize
	 * @return {@link Integer} - So mau ngau nhien can kiem dem
	 */
	public static int getSoMauNgauNhien(int deltal, int totalSize) {
		int examSize = 0;

		if (deltal == 3) {

		} else if (deltal == 5) {
			
			if (totalSize > 0 && totalSize <= 500) {
				if (totalSize <= 220) {
					examSize = totalSize;
				} else {
					examSize = 220;
				}
			}
			if (totalSize > 500 && totalSize <= 600) {
				examSize = 240;
			}
			if (totalSize > 600 && totalSize <= 700) {
				examSize = 255;
			}
			if (totalSize > 700 && totalSize <= 800) {
				examSize = 267;
			}
			if (totalSize > 800 && totalSize <= 900) {
				examSize = 277;
			}
			if (totalSize > 900 && totalSize <= 1000) {
				examSize = 286;
			}
			if (totalSize > 1000 && totalSize <= 2000) {
				examSize = 333;
			}
			if (totalSize > 2000 && totalSize <= 3000) {
				examSize = 353;
			}
			if (totalSize > 3000 && totalSize <= 4000) {
				examSize = 364;
			}
			if (totalSize > 4000 && totalSize <= 5000) {
				examSize = 370;
			}
			if (totalSize > 5000 && totalSize <= 6000) {
				examSize = 375;
			}
			if (totalSize > 6000 && totalSize <= 7000) {
				examSize = 378;
			}
			if (totalSize > 7000 && totalSize <= 8000) {
				examSize = 381;
			}
			if (totalSize > 8000 && totalSize <= 9000) {
				examSize = 383;
			}
			if (totalSize > 9000 && totalSize <= 10000) {
				examSize = 385;
			}
			if (totalSize > 10000 && totalSize <= 15000) {
				examSize = 390;
			}

			if (totalSize > 15000 && totalSize <= 20000) {
				examSize = 392;
			}
			if (totalSize > 20000 && totalSize <= 50000) {
				examSize = 397;
			}
			if (totalSize > 50000 && totalSize <= 100000) {
				examSize = 398;
			}
			if (totalSize > 100000) {
				examSize = 400;
			}
		} else if (deltal == 7) {

		} else if (deltal == 10) {

		}

		return examSize;
	}

	private static Log _log = LogFactoryUtil.getLog(MauKiemKemUtils.class);
}
