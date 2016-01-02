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

package vn.dtt.cmon.kiemdemvien.dao.service.persistence;

/**
 * @author HANT
 */
public interface KiemDemVienFinder {
	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findKiemDemVien(
		java.lang.String capHoatDong, java.lang.String orgCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByCTHTT(
		java.lang.String capHoatDong, java.lang.String orgCode1,
		java.lang.String orgCode2, long status, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countCTHTT(java.lang.String capHoatDong,
		java.lang.String orgCode1, java.lang.String orgCode2, long status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> find(
		java.lang.String capHoatDong, java.lang.String orgCode, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int count(java.lang.String capHoatDong, java.lang.String orgCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addKiemDemVien(java.lang.String hoVaTen,
		java.lang.String taiKhoan, java.lang.String matKhau, int capHoatDong,
		java.lang.String orgCode1, java.lang.String orgCode2,
		java.lang.String diaChi, java.lang.String chungMinhThu,
		java.lang.String dienThoai, java.lang.String imei, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void chuyenTrangThai(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}