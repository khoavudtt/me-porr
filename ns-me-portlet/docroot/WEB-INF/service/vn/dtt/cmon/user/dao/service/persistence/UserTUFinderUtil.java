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
public class UserTUFinderUtil {
	public static int countTinhTUByUserId(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countTinhTUByUserId(userId);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> finderTinhTUByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().finderTinhTUByUserId(userId, start, end);
	}

	public static UserTUFinder getFinder() {
		if (_finder == null) {
			_finder = (UserTUFinder)PortletBeanLocatorUtil.locate(vn.dtt.cmon.user.dao.service.ClpSerializer.getServletContextName(),
					UserTUFinder.class.getName());

			ReferenceRegistry.registerReference(UserTUFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(UserTUFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(UserTUFinderUtil.class, "_finder");
	}

	private static UserTUFinder _finder;
}