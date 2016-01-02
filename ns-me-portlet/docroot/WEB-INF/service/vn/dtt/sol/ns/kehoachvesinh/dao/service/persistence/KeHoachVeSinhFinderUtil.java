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

package vn.dtt.sol.ns.kehoachvesinh.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author HANT
 */
public class KeHoachVeSinhFinderUtil {
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> search(
		long nam, java.lang.String maTinh, java.lang.String maHuyen, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().search(nam, maTinh, maHuyen, start, end);
	}

	public static int count(long nam, java.lang.String maTinh,
		java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().count(nam, maTinh, maHuyen);
	}

	public static int countSoDanHuongLoi(java.lang.String nam,
		java.lang.String maTinh, java.lang.String dangkyvstx)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countSoDanHuongLoi(nam, maTinh, dangkyvstx);
	}

	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> getKeHoachVeSinhByNamTinhDangKyVSTX(
		java.lang.String nam, java.lang.String maTinh,
		java.lang.String dangkyvstx)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getKeHoachVeSinhByNamTinhDangKyVSTX(nam, maTinh, dangkyvstx);
	}

	public static int sumSoNhaTieuHVSMoiTW(java.lang.String namBaoCao,
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().sumSoNhaTieuHVSMoiTW(namBaoCao, maTinh);
	}

	public static KeHoachVeSinhFinder getFinder() {
		if (_finder == null) {
			_finder = (KeHoachVeSinhFinder)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.kehoachvesinh.dao.service.ClpSerializer.getServletContextName(),
					KeHoachVeSinhFinder.class.getName());

			ReferenceRegistry.registerReference(KeHoachVeSinhFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(KeHoachVeSinhFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(KeHoachVeSinhFinderUtil.class,
			"_finder");
	}

	private static KeHoachVeSinhFinder _finder;
}