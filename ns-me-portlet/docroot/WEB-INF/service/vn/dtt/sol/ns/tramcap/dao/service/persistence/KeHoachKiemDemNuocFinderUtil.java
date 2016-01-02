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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author khoa.vu
 */
public class KeHoachKiemDemNuocFinderUtil {
	public static int countKeHoachKiemDemNuocSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String kiemDemVienId,
		java.lang.String tramCapNuocId, java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countKeHoachKiemDemNuocSearch(maTinh, maHuyen,
			kiemDemVienId, tramCapNuocId, trangThai);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String tramCapNuocId,
		java.lang.String trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getKeHoachKiemDemNuocSearch(maTinh, maHuyen, kiemDemVienId,
			tramCapNuocId, trangThai, start, end);
	}

	public static int countKeHoachKiemDemNuocSearchNam(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String nam,
		java.lang.String idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countKeHoachKiemDemNuocSearchNam(maTinh, maHuyen,
			kiemDemVienId, tramCapNuocId, trangThai, nam, idNguoiTao);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearchNam(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String nam,
		java.lang.String idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getKeHoachKiemDemNuocSearchNam(maTinh, maHuyen,
			kiemDemVienId, tramCapNuocId, trangThai, nam, idNguoiTao, start, end);
	}

	public static KeHoachKiemDemNuocFinder getFinder() {
		if (_finder == null) {
			_finder = (KeHoachKiemDemNuocFinder)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer.getServletContextName(),
					KeHoachKiemDemNuocFinder.class.getName());

			ReferenceRegistry.registerReference(KeHoachKiemDemNuocFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(KeHoachKiemDemNuocFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(KeHoachKiemDemNuocFinderUtil.class,
			"_finder");
	}

	private static KeHoachKiemDemNuocFinder _finder;
}