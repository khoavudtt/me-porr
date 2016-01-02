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

package vn.dtt.sol.ns.tramcap.dao.service.persistence;

/**
 * @author khoa.vu
 */
public interface KeHoachKiemDemNuocFinder {
	public int countKeHoachKiemDemNuocSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String kiemDemVienId,
		java.lang.String tramCapNuocId, java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String tramCapNuocId,
		java.lang.String trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countKeHoachKiemDemNuocSearchNam(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String kiemDemVienId,
		java.lang.String tramCapNuocId, java.lang.String trangThai,
		java.lang.String nam, java.lang.String idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearchNam(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String nam,
		java.lang.String idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;
}