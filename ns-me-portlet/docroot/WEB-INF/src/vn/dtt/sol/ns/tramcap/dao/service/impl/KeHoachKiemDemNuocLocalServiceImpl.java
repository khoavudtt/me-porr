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

package vn.dtt.sol.ns.tramcap.dao.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc;
import vn.dtt.sol.ns.tramcap.dao.service.base.KeHoachKiemDemNuocLocalServiceBaseImpl;

/**
 * The implementation of the ke hoach kiem dem nuoc local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.sol.ns.tramcap.dao.service.KeHoachKiemDemNuocLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.sol.ns.tramcap.dao.service.base.KeHoachKiemDemNuocLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.tramcap.dao.service.KeHoachKiemDemNuocLocalServiceUtil
 */
public class KeHoachKiemDemNuocLocalServiceImpl
	extends KeHoachKiemDemNuocLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.sol.ns.tramcap.dao.service.KeHoachKiemDemNuocLocalServiceUtil} to access the ke hoach kiem dem nuoc local service.
	 */
	public int countKeHoachKiemDemNuocSearch(String maTinh,String maHuyen,String kiemDemVienId,String tramCapNuocId,String trangThai) throws SystemException {
		return keHoachKiemDemNuocFinder.countKeHoachKiemDemNuocSearch(maTinh, maHuyen, kiemDemVienId, tramCapNuocId, trangThai);
	}
	public List<KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearch(String maTinh,String maHuyen,String kiemDemVienId,String tramCapNuocId,String trangThai,int start,int end) throws SystemException {
		return keHoachKiemDemNuocFinder.getKeHoachKiemDemNuocSearch(maTinh, maHuyen, kiemDemVienId, tramCapNuocId, trangThai, start, end);
	}
	public int countKeHoachKiemDemNuocSearchNam(String maTinh,String maHuyen,String kiemDemVienId,String tramCapNuocId,String trangThai,String nam, String idNguoiTao) throws SystemException {
		return keHoachKiemDemNuocFinder.countKeHoachKiemDemNuocSearchNam(maTinh, maHuyen, kiemDemVienId, tramCapNuocId, trangThai,nam,idNguoiTao);
	}
	public List<KeHoachKiemDemNuoc> getKeHoachKiemDemNuocSearchNam(String maTinh,String maHuyen,String kiemDemVienId,String tramCapNuocId,String trangThai,String nam,String idNguoiTao,int start,int end) throws SystemException {
		return keHoachKiemDemNuocFinder.getKeHoachKiemDemNuocSearchNam(maTinh, maHuyen, kiemDemVienId, tramCapNuocId, trangThai,nam,idNguoiTao, start, end);
	}
}