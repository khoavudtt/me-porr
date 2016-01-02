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
public class DanhGiaVanHanhFinderUtil {
	public static int countMaxThang(int tramCapNuocId, int nam)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countMaxThang(tramCapNuocId, nam);
	}

	public static DanhGiaVanHanhFinder getFinder() {
		if (_finder == null) {
			_finder = (DanhGiaVanHanhFinder)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer.getServletContextName(),
					DanhGiaVanHanhFinder.class.getName());

			ReferenceRegistry.registerReference(DanhGiaVanHanhFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DanhGiaVanHanhFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DanhGiaVanHanhFinderUtil.class,
			"_finder");
	}

	private static DanhGiaVanHanhFinder _finder;
}