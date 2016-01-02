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

package vn.dtt.sol.ns.kehoachdaunam.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author HANT
 */
public class KeHoachDauNamFinderUtil {
	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> searchByNamAndTinh(
		long namKeHoach, java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().searchByNamAndTinh(namKeHoach, maTinh, start, end);
	}

	public static int countByNamAndTinh(long namKeHoach, java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countByNamAndTinh(namKeHoach, maTinh);
	}

	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> searchByNamAndTram(
		long namKeHoach, java.lang.String maTram, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().searchByNamAndTram(namKeHoach, maTram, start, end);
	}

	public static int countByNamAndTram(long namKeHoach, java.lang.String MaTram)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countByNamAndTram(namKeHoach, MaTram);
	}

	public static int countSoNguoiHuongLoiCapNcBenVung(java.lang.String nam,
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countSoNguoiHuongLoiCapNcBenVung(nam, maTinh);
	}

	public static java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> searchByNamAndMaTinh(
		java.lang.String nam, java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().searchByNamAndMaTinh(nam, maTinh);
	}

	public static int sumSoDauNoiMoiTW(java.lang.String namBaoCao,
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().sumSoDauNoiMoiTW(namBaoCao, maTinh);
	}

	public static KeHoachDauNamFinder getFinder() {
		if (_finder == null) {
			_finder = (KeHoachDauNamFinder)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.kehoachdaunam.dao.service.ClpSerializer.getServletContextName(),
					KeHoachDauNamFinder.class.getName());

			ReferenceRegistry.registerReference(KeHoachDauNamFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(KeHoachDauNamFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(KeHoachDauNamFinderUtil.class,
			"_finder");
	}

	private static KeHoachDauNamFinder _finder;
}