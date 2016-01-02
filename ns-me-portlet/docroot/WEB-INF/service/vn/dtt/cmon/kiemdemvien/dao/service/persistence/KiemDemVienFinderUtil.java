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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author HANT
 */
public class KiemDemVienFinderUtil {
	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findKiemDemVien(
		java.lang.String capHoatDong, java.lang.String orgCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findKiemDemVien(capHoatDong, orgCode);
	}

	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> findByCTHTT(
		java.lang.String capHoatDong, java.lang.String orgCode1,
		java.lang.String orgCode2, long status, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByCTHTT(capHoatDong, orgCode1, orgCode2, status, start,
			end);
	}

	public static int countCTHTT(java.lang.String capHoatDong,
		java.lang.String orgCode1, java.lang.String orgCode2, long status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countCTHTT(capHoatDong, orgCode1, orgCode2, status);
	}

	public static java.util.List<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> find(
		java.lang.String capHoatDong, java.lang.String orgCode, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().find(capHoatDong, orgCode, start, end);
	}

	public static int count(java.lang.String capHoatDong,
		java.lang.String orgCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().count(capHoatDong, orgCode);
	}

	public static void addKiemDemVien(java.lang.String hoVaTen,
		java.lang.String taiKhoan, java.lang.String matKhau, int capHoatDong,
		java.lang.String orgCode1, java.lang.String orgCode2,
		java.lang.String diaChi, java.lang.String chungMinhThu,
		java.lang.String dienThoai, java.lang.String imei, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getFinder()
			.addKiemDemVien(hoVaTen, taiKhoan, matKhau, capHoatDong, orgCode1,
			orgCode2, diaChi, chungMinhThu, dienThoai, imei, idNguoiTao);
	}

	public static void chuyenTrangThai(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getFinder().chuyenTrangThai(id);
	}

	public static KiemDemVienFinder getFinder() {
		if (_finder == null) {
			_finder = (KiemDemVienFinder)PortletBeanLocatorUtil.locate(vn.dtt.cmon.kiemdemvien.dao.service.ClpSerializer.getServletContextName(),
					KiemDemVienFinder.class.getName());

			ReferenceRegistry.registerReference(KiemDemVienFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(KiemDemVienFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(KiemDemVienFinderUtil.class,
			"_finder");
	}

	private static KiemDemVienFinder _finder;
}