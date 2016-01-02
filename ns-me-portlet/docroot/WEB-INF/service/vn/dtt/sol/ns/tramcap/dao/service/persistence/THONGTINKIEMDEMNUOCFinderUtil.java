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

package vn.dtt.sol.ns.tramcap.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author khoa.vu
 */
public class THONGTINKIEMDEMNUOCFinderUtil {
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> getThongTinDNNThoiGianThuc(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getThongTinDNNThoiGianThuc(maTinh, namBaoCao, danhgiakiemdem);
	}

	public static int countGioiTinhChuHo(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String gioiTinhChuHo,
		java.lang.String danhGiaKiemDem) {
		return getFinder()
				   .countGioiTinhChuHo(maTinh, namBaoCao, gioiTinhChuHo,
			danhGiaKiemDem);
	}

	public static THONGTINKIEMDEMNUOCFinder getFinder() {
		if (_finder == null) {
			_finder = (THONGTINKIEMDEMNUOCFinder)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer.getServletContextName(),
					THONGTINKIEMDEMNUOCFinder.class.getName());

			ReferenceRegistry.registerReference(THONGTINKIEMDEMNUOCFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(THONGTINKIEMDEMNUOCFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(THONGTINKIEMDEMNUOCFinderUtil.class,
			"_finder");
	}

	private static THONGTINKIEMDEMNUOCFinder _finder;
}