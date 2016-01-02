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

/**
 * @author khoa.vu
 */
public interface MAUKIEMDEMFinder {
	public java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findMauKiemDem(
		int nam, java.lang.String tinh, java.lang.String huyen,
		java.lang.String xa, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countMauKiemDem(int nam, java.lang.String tinh,
		java.lang.String huyen, java.lang.String xa)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}