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
public interface VeSinhGiaDinhFinder {
	public int countVeSinhGiaDinhSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String loaiNhaTieuId, java.lang.String trangThai,
		java.lang.String namBaoCao, java.lang.String namBaoCaoVstx)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVeSinhGiaDinhSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String loaiNhaTieuId,
		java.lang.String trangThai, java.lang.String namBaoCao,
		java.lang.String namBaoCaoVstx, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVeSinhGiaDinhGroupByMaHuyen(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String loaiNhaTieuId,
		java.lang.String trangThai, java.lang.String namBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countVeSinhGiaDinhSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String loaiNhaTieuId, java.lang.String trangThai,
		java.lang.String namBaoCao, java.lang.String namBaoCaoVstx,
		java.lang.String ngayNhap, java.lang.String idNguoiTao,
		java.lang.String advText)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVeSinhGiaDinhSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String loaiNhaTieuId,
		java.lang.String trangThai, java.lang.String namBaoCao,
		java.lang.String namBaoCaoVstx, java.lang.String ngayNhap,
		java.lang.String idNguoiTao, java.lang.String advText, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public int countGioiTinhChuHo(java.lang.String maTinh,
		java.lang.String namBaoCao, java.lang.String namXayDung,
		java.lang.String gioiTinhChuHo, java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVeSinhGiaDinhGroupByMaTinhTW(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String loaiNhaTieuId,
		java.lang.String trangThai, java.lang.String namBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> getVeSinhGiaDinhGroupByMaHuyenMaXaAndMaXaNotInTW(
		java.lang.String maTinh, java.lang.String trangThai,
		java.lang.String namBaoCao, java.lang.String dangKyVSTX)
		throws com.liferay.portal.kernel.exception.SystemException;
}