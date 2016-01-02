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

/**
 * @author BinhTH
 */
public interface DanhGiaVeSinhXaNewFakeFinder {
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaSearch(
		java.lang.String maTinh, java.lang.String nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaSearchHuyen(
		java.lang.String maHuyen, java.lang.String nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaInsert(
		java.lang.String maTinh, java.lang.String maHuyen, int nam, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaFakeList(
		java.lang.String maTinh, java.lang.String maHuyen, int nam, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public int countListDanhGiaVeSinhXaFakeList(java.lang.String maTinh,
		java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countListDanhGiaVeSinhXaInsert(java.lang.String maTinh,
		java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.SystemException;
}