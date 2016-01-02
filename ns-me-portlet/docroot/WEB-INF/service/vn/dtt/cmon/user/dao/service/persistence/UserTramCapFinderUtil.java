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

package vn.dtt.cmon.user.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author khoa.vu
 */
public class UserTramCapFinderUtil {
	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> finderHuyenInTram(
		java.lang.String maTinh, long maTramCap, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().finderHuyenInTram(maTinh, maTramCap, start, end);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> finderXaInHuyenTram(
		java.lang.String maTinh, java.lang.String maHuyen, long maTramCap,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .finderXaInHuyenTram(maTinh, maHuyen, maTramCap, start, end);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> finderHuyenInTramByUser(
		java.lang.String maTinh, long maTramCap, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .finderHuyenInTramByUser(maTinh, maTramCap, userId, start,
			end);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> finderXaInHuyenTramByUser(
		java.lang.String maTinh, java.lang.String maHuyen, long maTramCap,
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .finderXaInHuyenTramByUser(maTinh, maHuyen, maTramCap,
			userId, start, end);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> finderXaKhongInHuyenTramByUser(
		java.lang.String maTinh, java.lang.String maHuyen, long maTramCap,
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .finderXaKhongInHuyenTramByUser(maTinh, maHuyen, maTramCap,
			userId, start, end);
	}

	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> finderUserInTramCap(
		java.lang.String maTinh, java.lang.String maTramCap, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().finderUserInTramCap(maTinh, maTramCap, start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> finderByUserId(
		java.lang.String maTinh, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().finderByUserId(maTinh, userId, start, end);
	}

	public static int countByUserId(java.lang.String maTinh, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countByUserId(maTinh, userId);
	}

	public static UserTramCapFinder getFinder() {
		if (_finder == null) {
			_finder = (UserTramCapFinder)PortletBeanLocatorUtil.locate(vn.dtt.cmon.user.dao.service.ClpSerializer.getServletContextName(),
					UserTramCapFinder.class.getName());

			ReferenceRegistry.registerReference(UserTramCapFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(UserTramCapFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(UserTramCapFinderUtil.class,
			"_finder");
	}

	private static UserTramCapFinder _finder;
}