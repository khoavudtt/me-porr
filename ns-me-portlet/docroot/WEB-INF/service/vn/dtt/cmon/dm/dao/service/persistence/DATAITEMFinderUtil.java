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

package vn.dtt.cmon.dm.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author khoa.vu
 */
public class DATAITEMFinderUtil {
	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> find(
		int dataGroupCode, int level, java.lang.String orgCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().find(dataGroupCode, level, orgCode);
	}

	public static vn.dtt.cmon.dm.dao.model.DATAITEM findDataItemByName(
		java.lang.String name, java.lang.String maUni, int level)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findDataItemByName(name, maUni, level);
	}

	public static DATAITEMFinder getFinder() {
		if (_finder == null) {
			_finder = (DATAITEMFinder)PortletBeanLocatorUtil.locate(vn.dtt.cmon.dm.dao.service.ClpSerializer.getServletContextName(),
					DATAITEMFinder.class.getName());

			ReferenceRegistry.registerReference(DATAITEMFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DATAITEMFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DATAITEMFinderUtil.class, "_finder");
	}

	private static DATAITEMFinder _finder;
}