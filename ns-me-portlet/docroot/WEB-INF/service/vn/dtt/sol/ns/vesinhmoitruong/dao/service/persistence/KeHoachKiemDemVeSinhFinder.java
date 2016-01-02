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
public interface KeHoachKiemDemVeSinhFinder {
	public int countKeHoachKiemDemVeSinhSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String kiemDemVienId,
		java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh> getKeHoachKiemDemVeSinhSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String trangThai, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<java.lang.String> getHuyenXaKeHoachKiemDemGiaDinhSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<java.lang.String> getHuyenXaKeHoachKiemDemCongTrinhSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKeHoachKiemDemVeSinhGdSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public int countThongTinKeHoachKiemDemVeSinhGdSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getThongTinKeHoachKiemDemVeSinhCongTrinhSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public int countThongTinKeHoachKiemDemVeSinhCongTrinhSearch(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> getThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem,
		java.lang.String thonXom, java.lang.String nguonDL, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem,
		java.lang.String thonXom, java.lang.String nguonDL, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> getThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem,
		java.lang.String thonXom, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(
		java.lang.String keHoachId, java.lang.String trangThai,
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String danhGiaKiemDem,
		java.lang.String thonXom, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countKeHoachKiemDemVeSinhSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String kiemDemVienId,
		java.lang.String trangThai, java.lang.String idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh> getKeHoachKiemDemVeSinhSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String kiemDemVienId, java.lang.String trangThai,
		java.lang.String idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;
}