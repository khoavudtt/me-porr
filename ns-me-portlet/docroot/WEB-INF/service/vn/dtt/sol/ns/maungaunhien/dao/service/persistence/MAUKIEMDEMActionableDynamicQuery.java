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

package vn.dtt.sol.ns.maungaunhien.dao.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM;
import vn.dtt.sol.ns.maungaunhien.dao.service.MAUKIEMDEMLocalServiceUtil;

/**
 * @author khoa.vu
 * @generated
 */
public abstract class MAUKIEMDEMActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public MAUKIEMDEMActionableDynamicQuery() throws SystemException {
		setBaseLocalService(MAUKIEMDEMLocalServiceUtil.getService());
		setClass(MAUKIEMDEM.class);

		setClassLoader(vn.dtt.sol.ns.maungaunhien.dao.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("id");
	}
}