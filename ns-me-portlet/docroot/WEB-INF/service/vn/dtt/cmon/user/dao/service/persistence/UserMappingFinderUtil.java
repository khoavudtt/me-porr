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
public class UserMappingFinderUtil {
	public static int count(java.lang.String keyword, int userType,
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().count(keyword, userType, orgCode1, orgCode2);
	}

	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> find(
		java.lang.String keyword, int userType, java.lang.String orgCode1,
		java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .find(keyword, userType, orgCode1, orgCode2, start, end);
	}

	public static UserMappingFinder getFinder() {
		if (_finder == null) {
			_finder = (UserMappingFinder)PortletBeanLocatorUtil.locate(vn.dtt.cmon.user.dao.service.ClpSerializer.getServletContextName(),
					UserMappingFinder.class.getName());

			ReferenceRegistry.registerReference(UserMappingFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(UserMappingFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(UserMappingFinderUtil.class,
			"_finder");
	}

	private static UserMappingFinder _finder;
}