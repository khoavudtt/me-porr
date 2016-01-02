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
public class UserTinhFinderUtil {
	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findT_UID(
		java.lang.String maTinh, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findT_UID(maTinh, userId, start, end);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findHuyeSelectByTinhAndUser(
		java.lang.String maTinh, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findHuyeSelectByTinhAndUser(maTinh, userId, start, end);
	}

	public static int countT_UID(java.lang.String maTinh, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countT_UID(maTinh, userId);
	}

	public static UserTinhFinder getFinder() {
		if (_finder == null) {
			_finder = (UserTinhFinder)PortletBeanLocatorUtil.locate(vn.dtt.cmon.user.dao.service.ClpSerializer.getServletContextName(),
					UserTinhFinder.class.getName());

			ReferenceRegistry.registerReference(UserTinhFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(UserTinhFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(UserTinhFinderUtil.class, "_finder");
	}

	private static UserTinhFinder _finder;
}