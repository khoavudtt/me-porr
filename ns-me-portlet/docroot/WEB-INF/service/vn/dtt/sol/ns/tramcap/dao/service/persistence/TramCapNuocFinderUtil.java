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
public class TramCapNuocFinderUtil {
	public static int countTramCap(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countTramCap(maTinh);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapByTinh(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getTramCapByTinh(maTinh, start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocByTinhDauNoiNuoc(
		java.lang.String maTinh, java.lang.String namBaoCao) {
		return getFinder().getTramCapNuocByTinhDauNoiNuoc(maTinh, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocByDanhGiaBenVung(
		java.lang.String maTinh, java.lang.String nam,
		java.lang.String ketquadanhgia) {
		return getFinder()
				   .getTramCapNuocByDanhGiaBenVung(maTinh, nam, ketquadanhgia);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocJoinDanhGiaBenVung(
		java.lang.String maTinh, java.lang.String nam) {
		return getFinder().getTramCapNuocJoinDanhGiaBenVung(maTinh, nam);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocByThoiGianThuc(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem) {
		return getFinder()
				   .getTramCapNuocByThoiGianThuc(maTinh, namBaoCao,
			danhgiakiemdem);
	}

	public static int countTramCapThoiGianThuc(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String danhgiakiemdem,
		java.lang.String tramCapNuocId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countTramCapThoiGianThuc(maTinh, namBaoCao, danhgiakiemdem,
			tramCapNuocId);
	}

	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc getTramCapNuocByMaTinhAndDNNID(
		java.lang.String maTinh, java.lang.String dauNoiNuocID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getTramCapNuocByMaTinhAndDNNID(maTinh, dauNoiNuocID);
	}

	public static TramCapNuocFinder getFinder() {
		if (_finder == null) {
			_finder = (TramCapNuocFinder)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer.getServletContextName(),
					TramCapNuocFinder.class.getName());

			ReferenceRegistry.registerReference(TramCapNuocFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TramCapNuocFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TramCapNuocFinderUtil.class,
			"_finder");
	}

	private static TramCapNuocFinder _finder;
}