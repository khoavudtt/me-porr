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
public class DauNoiNuocFinderUtil {
	public static int countThongKeMenuLeft(java.lang.String tableName,
		int initUserType, java.lang.String orgCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countThongKeMenuLeft(tableName, initUserType, orgCode);
	}

	public static int countDauNoiSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String tramCapNuocId, java.lang.String trangThai,
		java.lang.String namBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDauNoiSearch(maTinh, maHuyen, maXa, tramCapNuocId,
			trangThai, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String namBaoCao, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getDauNoiSearch(maTinh, maHuyen, maXa, tramCapNuocId,
			trangThai, namBaoCao, start, end);
	}

	public static int countDataItemSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countDataItemSearch(maTinh, maHuyen, maXa);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getDataItemSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getDataItemSearch(maTinh, maHuyen, maXa, start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> getThongTinKeHoachKiemDemNuocSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String nguonDL,
		java.lang.String danhGiaKiemDem, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getThongTinKeHoachKiemDemNuocSearch(keHoachId, trangThai,
			maTinh, maHuyen, maXa, nguonDL, danhGiaKiemDem, start, end);
	}

	public static int countDauNoiByMaTinhTramIdTrangThaiAndNam(
		java.lang.String maTinh, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String namBaoCao) {
		return getFinder()
				   .countDauNoiByMaTinhTramIdTrangThaiAndNam(maTinh,
			tramCapNuocId, trangThai, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiByMaTinhTramIdTrangThaiAndNam(
		java.lang.String maTinh, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String namBaoCao) {
		return getFinder()
				   .getDauNoiByMaTinhTramIdTrangThaiAndNam(maTinh,
			tramCapNuocId, trangThai, namBaoCao);
	}

	public static java.util.List<java.lang.String> getHuyenXaKeHoachKiemDemNuocSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getHuyenXaKeHoachKiemDemNuocSearch(keHoachId, trangThai,
			maTinh, start, end);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiByMaTinhTramIdTrangThaiAndNamThoiGianThuc(
		java.lang.String maTinh, java.lang.String danhgiakiemdem,
		java.lang.String namBaoCao) {
		return getFinder()
				   .getDauNoiByMaTinhTramIdTrangThaiAndNamThoiGianThuc(maTinh,
			danhgiakiemdem, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String tramCapNuocId,
		java.lang.String trangThai, java.lang.String namBaoCao,
		java.lang.String ngayNhap, java.lang.String idNguoiTao,
		java.lang.String advText, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getDauNoiSearch(maTinh, maHuyen, maXa, tramCapNuocId,
			trangThai, namBaoCao, ngayNhap, idNguoiTao, advText, start, end);
	}

	public static int countDauNoiSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String tramCapNuocId, java.lang.String trangThai,
		java.lang.String namBaoCao, java.lang.String ngayNhap,
		java.lang.String idNguoiTao, java.lang.String advText)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDauNoiSearch(maTinh, maHuyen, maXa, tramCapNuocId,
			trangThai, namBaoCao, ngayNhap, idNguoiTao, advText);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> getThongTinKeHoachKiemDemNuocSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String nguonDL,
		java.lang.String danhGiaKiemDem, java.lang.String advText, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getThongTinKeHoachKiemDemNuocSearch(keHoachId, trangThai,
			maTinh, maHuyen, maXa, nguonDL, danhGiaKiemDem, advText, start, end);
	}

	public static int countGioiTinhChuHo(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String gioiTinh) {
		return getFinder().countGioiTinhChuHo(maTinh, namBaoCao, gioiTinh);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiGroupByMaTinhTW(
		java.lang.String namBaoCao) {
		return getFinder().getDauNoiGroupByMaTinhTW(namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> getDauNoiGroupByTramCapIDTW(
		java.lang.String namBaoCao, java.lang.String trangThai) {
		return getFinder().getDauNoiGroupByTramCapIDTW(namBaoCao, trangThai);
	}

	public static DauNoiNuocFinder getFinder() {
		if (_finder == null) {
			_finder = (DauNoiNuocFinder)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer.getServletContextName(),
					DauNoiNuocFinder.class.getName());

			ReferenceRegistry.registerReference(DauNoiNuocFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DauNoiNuocFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DauNoiNuocFinderUtil.class,
			"_finder");
	}

	private static DauNoiNuocFinder _finder;
}