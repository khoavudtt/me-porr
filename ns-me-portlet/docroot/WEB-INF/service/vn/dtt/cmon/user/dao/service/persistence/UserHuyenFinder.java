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
public interface UserHuyenFinder {
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findXaThuocHuyenDuocChonByUser(
		java.lang.String maTinh, java.lang.String maHuyen, long maUser,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countXaThuocHuyenByUserId(java.lang.String maTinh,
		java.lang.String maHuyen, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countHuyenByUserId(java.lang.String maTinh, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findHuyenChonByUser(
		java.lang.String maTinh, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findXaThuocHuyenChonByUser(
		java.lang.String maTinh, java.lang.String maHuyen, long userId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> finderGSVInHuyen(
		java.lang.String maTinh, java.lang.String maHuyen, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findHuyenByUser(
		java.lang.String maTinh, long maUser, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int coutHuyenByUser(java.lang.String maTinh, long maUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}