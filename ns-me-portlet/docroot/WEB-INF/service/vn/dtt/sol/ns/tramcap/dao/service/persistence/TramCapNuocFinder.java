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
public interface TramCapNuocFinder {
	public int countTramCap(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapByTinh(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocByTinhDauNoiNuoc(
		java.lang.String maTinh, java.lang.String namBaoCao);

	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocByDanhGiaBenVung(
		java.lang.String maTinh, java.lang.String nam,
		java.lang.String ketquadanhgia);

	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocJoinDanhGiaBenVung(
		java.lang.String maTinh, java.lang.String nam);

	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> getTramCapNuocByThoiGianThuc(
		java.lang.String maTinh, java.lang.String namBaoCao,
		java.lang.String danhgiakiemdem);

	public int countTramCapThoiGianThuc(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String danhgiakiemdem,
		java.lang.String tramCapNuocId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc getTramCapNuocByMaTinhAndDNNID(
		java.lang.String maTinh, java.lang.String dauNoiNuocID)
		throws com.liferay.portal.kernel.exception.SystemException;
}