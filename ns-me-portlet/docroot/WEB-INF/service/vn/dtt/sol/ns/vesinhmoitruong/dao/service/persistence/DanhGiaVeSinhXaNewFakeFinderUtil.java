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

package vn.dtt.sol.ns.vesinhmoitruong.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author BinhTH
 */
public class DanhGiaVeSinhXaNewFakeFinderUtil {
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaSearch(
		java.lang.String maTinh, java.lang.String nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getListDanhGiaVeSinhXaSearch(maTinh, nam, start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaSearchHuyen(
		java.lang.String maHuyen, java.lang.String nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getListDanhGiaVeSinhXaSearchHuyen(maHuyen, nam, start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaInsert(
		java.lang.String maTinh, java.lang.String maHuyen, int nam, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getListDanhGiaVeSinhXaInsert(maTinh, maHuyen, nam, start,
			end);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaFakeList(
		java.lang.String maTinh, java.lang.String maHuyen, int nam, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getListDanhGiaVeSinhXaFakeList(maTinh, maHuyen, nam, start,
			end);
	}

	public static int countListDanhGiaVeSinhXaFakeList(
		java.lang.String maTinh, java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countListDanhGiaVeSinhXaFakeList(maTinh, maHuyen, nam);
	}

	public static int countListDanhGiaVeSinhXaInsert(java.lang.String maTinh,
		java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countListDanhGiaVeSinhXaInsert(maTinh, maHuyen, nam);
	}

	public static DanhGiaVeSinhXaNewFakeFinder getFinder() {
		if (_finder == null) {
			_finder = (DanhGiaVeSinhXaNewFakeFinder)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.vesinhmoitruong.dao.service.ClpSerializer.getServletContextName(),
					DanhGiaVeSinhXaNewFakeFinder.class.getName());

			ReferenceRegistry.registerReference(DanhGiaVeSinhXaNewFakeFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DanhGiaVeSinhXaNewFakeFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DanhGiaVeSinhXaNewFakeFinderUtil.class,
			"_finder");
	}

	private static DanhGiaVeSinhXaNewFakeFinder _finder;
}