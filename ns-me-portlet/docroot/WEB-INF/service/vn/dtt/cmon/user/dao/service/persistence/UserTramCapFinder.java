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

/**
 * @author khoa.vu
 */
public interface UserTramCapFinder {
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> finderHuyenInTram(
		java.lang.String maTinh, long maTramCap, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> finderXaInHuyenTram(
		java.lang.String maTinh, java.lang.String maHuyen, long maTramCap,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> finderHuyenInTramByUser(
		java.lang.String maTinh, long maTramCap, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> finderXaInHuyenTramByUser(
		java.lang.String maTinh, java.lang.String maHuyen, long maTramCap,
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> finderXaKhongInHuyenTramByUser(
		java.lang.String maTinh, java.lang.String maHuyen, long maTramCap,
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> finderUserInTramCap(
		java.lang.String maTinh, java.lang.String maTramCap, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> finderByUserId(
		java.lang.String maTinh, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countByUserId(java.lang.String maTinh, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}