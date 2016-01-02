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

/**
 * @author HANT
 */
public interface KeHoachDauNamFinder {
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> searchByNamAndTinh(
		long namKeHoach, java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countByNamAndTinh(long namKeHoach, java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> searchByNamAndTram(
		long namKeHoach, java.lang.String maTram, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countByNamAndTram(long namKeHoach, java.lang.String MaTram)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countSoNguoiHuongLoiCapNcBenVung(java.lang.String nam,
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> searchByNamAndMaTinh(
		java.lang.String nam, java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int sumSoDauNoiMoiTW(java.lang.String namBaoCao,
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;
}