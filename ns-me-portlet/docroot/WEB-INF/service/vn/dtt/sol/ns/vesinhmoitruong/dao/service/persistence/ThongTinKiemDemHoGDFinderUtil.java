/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.sol.ns.vesinhmoitruong.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author BinhTH
 */
public class ThongTinKiemDemHoGDFinderUtil {
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKiemDemHGDThoiGianThucGroupBy(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getThongTinKiemDemHGDThoiGianThucGroupBy(maTinh, namBaoCao,
			danhgiakiemdem);
	}

	public static int countThongTinKiemDemHGDThoiGianThucGroupBy(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem, java.lang.String maHuyen,
		java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countThongTinKiemDemHGDThoiGianThucGroupBy(maTinh,
			namBaoCao, danhgiakiemdem, maHuyen, maXa);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKiemDemHGDThoiGianThuc(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getThongTinKiemDemHGDThoiGianThuc(maTinh, namBaoCao,
			danhgiakiemdem);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getListThongTinKiemDemHoGiaDinhByKeHoachId(
		int keHoachId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getListThongTinKiemDemHoGiaDinhByKeHoachId(keHoachId);
	}

	public static int countGioiTinhChuHo(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String gioiTinhChuHo,
		java.lang.String danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countGioiTinhChuHo(maTinh, namBaoCao, gioiTinhChuHo,
			danhGiaKiemDem);
	}

	public static ThongTinKiemDemHoGDFinder getFinder() {
		if (_finder == null) {
			_finder = (ThongTinKiemDemHoGDFinder)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.vesinhmoitruong.dao.service.ClpSerializer.getServletContextName(),
					ThongTinKiemDemHoGDFinder.class.getName());

			ReferenceRegistry.registerReference(ThongTinKiemDemHoGDFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ThongTinKiemDemHoGDFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ThongTinKiemDemHoGDFinderUtil.class,
			"_finder");
	}

	private static ThongTinKiemDemHoGDFinder _finder;
}