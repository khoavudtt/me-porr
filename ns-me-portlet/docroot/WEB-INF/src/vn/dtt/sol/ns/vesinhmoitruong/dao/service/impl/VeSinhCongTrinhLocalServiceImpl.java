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

package vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl;

import java.util.List;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.VeSinhCongTrinhLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the ve sinh cong trinh local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author BinhTH
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.VeSinhCongTrinhLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil
 */
public class VeSinhCongTrinhLocalServiceImpl extends
		VeSinhCongTrinhLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.ns.vesinhmoitruong
	 * .dao.service.VeSinhCongTrinhLocalServiceUtil} to access the ve sinh cong
	 * trinh local service.
	 */

	public int COUNT_VE_SINH_GIA_DINH_ADMIN() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_VE_SINH_GIA_DINH_ADMIN();
	}

	public int COUNT_VE_SINH_GIA_DINH_TU(long userId) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_VE_SINH_GIA_DINH_TU(userId);
	}

	public int COUNT_VE_SINH_GIA_DINH_TINH(String maTinh, long userId)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder
				.COUNT_VE_SINH_GIA_DINH_TINH(maTinh, userId);
	}

	public int COUNT_VE_SINH_GIA_DINH_HUYEN(String maTinh, long userId)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_VE_SINH_GIA_DINH_HUYEN(maTinh,
				userId);
	}

	public int COUNT_VE_SINH_CONG_TRINH_ADMIN() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_VE_SINH_CONG_TRINH_ADMIN();
	}

	public int COUNT_VE_SINH_CONG_TRINH_TU(long userId) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_VE_SINH_CONG_TRINH_TU(userId);
	}

	public int COUNT_VE_SINH_CONG_TRINH_TINH(String maTinh, long userId)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_VE_SINH_CONG_TRINH_TINH(maTinh,
				userId);
	}

	public int COUNT_VE_SINH_CONG_TRINH_HUYEN(String maTinh, long userId)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_VE_SINH_CONG_TRINH_HUYEN(maTinh,
				userId);
	}

	public int COUNT_KIEM_DEM_VE_SINH_ADMIN(long userId)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_KIEM_DEM_VE_SINH_ADMIN(userId);
	}

	public int COUNT_KIEM_DEM_VE_SINH_TU(long userId) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_KIEM_DEM_VE_SINH_TU(userId);
	}

	public int COUNT_KIEM_DEM_VE_SINH_TINH(long userId) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_KIEM_DEM_VE_SINH_TINH(userId);
	}

	public int COUNT_KIEM_DEM_VE_SINH_HUYEN(long userId)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_KIEM_DEM_VE_SINH_HUYEN(userId);
	}

	public int COUNT_KE_HOACH_VE_SINH_ADMIN() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_KE_HOACH_VE_SINH_ADMIN();
	}

	public int COUNT_KE_HOACH_VE_SINH_TU() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_KE_HOACH_VE_SINH_TU();
	}

	public int COUNT_KE_HOACH_VE_SINH_TINH(String maTinh)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_KE_HOACH_VE_SINH_TINH(maTinh);
	}

	public int COUNT_KE_HOACH_VE_SINH_HUYEN(String maTinh)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_KE_HOACH_VE_SINH_HUYEN(maTinh);
	}

	public int COUNT_DANH_GIA_VE_SINH_ADMIN() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_DANH_GIA_VE_SINH_ADMIN();
	}

	public int COUNT_DANH_GIA_VE_SINH_TU() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_DANH_GIA_VE_SINH_TU();
	}

	public int COUNT_DANH_GIA_VE_SINH_TINH(String maTinh)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_DANH_GIA_VE_SINH_TINH(maTinh);
	}

	public int COUNT_DANH_GIA_VE_SINH_HUYEN(String maTinh)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_DANH_GIA_VE_SINH_HUYEN(maTinh);
	}

	public int COUNT_MAU_NGAU_NHIEN_ADMIN() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_MAU_NGAU_NHIEN_ADMIN();
	}

	public int COUNT_MAU_NGAU_NHIEN_TU() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_MAU_NGAU_NHIEN_TU();
	}

	public int COUNT_MAU_NGAU_NHIEN_TINH(String maTinh) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_MAU_NGAU_NHIEN_TINH(maTinh);
	}

	public int COUNT_MAU_NGAU_NHIEN_HUYEN(String maTinh)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_MAU_NGAU_NHIEN_HUYEN(maTinh);
	}

	//

	public int COUNT_DANH_GIA_CUOI_NAM_ADMIN() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_DANH_GIA_CUOI_NAM_ADMIN();
	}

	public int COUNT_DANH_GIA_CUOI_NAM_TU() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_DANH_GIA_CUOI_NAM_TU();
	}

	public int COUNT_DANH_GIA_CUOI_NAM_TINH(String maTinh)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_DANH_GIA_CUOI_NAM_TINH(maTinh);
	}

	public int COUNT_DANH_GIA_CUOI_NAM_TRAMCAP(String maTinh)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_DANH_GIA_CUOI_NAM_TRAMCAP(maTinh);
	}

	public int COUNT_KE_HOACH_DAU_NAM_AMDIN() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_KE_HOACH_DAU_NAM_AMDIN();
	}

	public int COUNT_KE_HOACH_DAU_NAM_TU() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_KE_HOACH_DAU_NAM_TU();
	}

	public int COUNT_KE_HOACH_DAU_NAM_TINH(String maTinh)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_KE_HOACH_DAU_NAM_TINH(maTinh);
	}

	public int COUNT_KE_HOACH_DAU_NAM_TRAMCAP(long userId)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_KE_HOACH_DAU_NAM_TRAMCAP(userId);
	}

	public int COUNT_KE_HOACH_DAU_NOI_NUOC_TRAMCAP(long userId)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder
				.COUNT_KE_HOACH_DAU_NOI_NUOC_TRAMCAP(userId);
	}

	public int COUNT_KE_HOACH_DAU_NOI_NUOC_TINH(String maTinh)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_KE_HOACH_DAU_NOI_NUOC_TINH(maTinh);
	}

	public int COUNT_KE_HOACH_DAU_NOI_NUOC_TU() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_KE_HOACH_DAU_NOI_NUOC_TU();
	}

	public int COUNT_KE_HOACH_DAU_NOI_NUOC_ADMIN() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_KE_HOACH_DAU_NOI_NUOC_ADMIN();
	}

	public int COUNT_DAU_NOI_NUOC_TRAMCAP(String maTinh, long userId)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_DAU_NOI_NUOC_TRAMCAP(maTinh, userId);
	}

	public int COUNT_DAU_NOI_NUOC_TINH(String maTinh) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_DAU_NOI_NUOC_TINH(maTinh);
	}

	public int COUNT_DAU_NOI_NUOC_TU(long userId) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_DAU_NOI_NUOC_TU(userId);
	}

	public int COUNT_DAU_NOI_NUOC_ADMIN(long userId) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_DAU_NOI_NUOC_ADMIN();
	}

	public int COUNT_CONG_TRINH_CAP_NUOC_TRAMCAP(long userId)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_CONG_TRINH_CAP_NUOC_TRAMCAP(userId);
	}

	public int COUNT_CONG_TRINH_CAP_NUOC_TINH(String maTinh, long userId)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_CONG_TRINH_CAP_NUOC_TINH(maTinh,
				userId);
	}

	public int COUNT_CONG_TRINH_CAP_NUOC_TU(long userId)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.COUNT_CONG_TRINH_CAP_NUOC_TU(userId);
	}

	public int COUNT_CONG_TRINH_CAP_NUOC_ADMIN() throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.COUNT_CONG_TRINH_CAP_NUOC_ADMIN();
	}

	public int countDauNoiInTinh(String maTinh) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.countDauNoiInTinh(maTinh);
	}

	public int countDauNoiPhanKHInTinh(String maTinh) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.countDauNoiPhanKHInTinh(maTinh);
	}

	public int countDauNoiDongBoInTinh(String maTinh) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.countDauNoiDongBoInTinh(maTinh);
	}

	public int countHGDInTinh(String maTinh, int namXayDung)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.countHGDInTinh(maTinh, namXayDung);
	}

	public int countHGDPhanKHInTinh(String maTinh, int namXayDung)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.countHGDPhanKHInTinh(maTinh, namXayDung);
	}

	public int countHDGDongBoInTinh(String maTinh) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.countHGDDongBoInTinh(maTinh);
	}

	public int countCongTrinhInTinh(String maTinh) throws PortalException,
			SystemException {
		return veSinhCongTrinhFinder.countCongTrinhInTinh(maTinh);
	}

	public int countCongTrinhPhanKHInTinh(String maTinh)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.countCongTrinhPhanKHInTinh(maTinh);
	}

	public int countCongTrinhDongBoInTinh(String maTinh)
			throws PortalException, SystemException {
		return veSinhCongTrinhFinder.countCongTrinhDongBoInTinh(maTinh);
	}

	public int countVeSinhCongTrinhSearch(String maTinh, String maHuyen,
			String maXa, String loaiNhaTieuId, String loaiCongTrinh,
			String trangThai, String namBaoCao) throws SystemException {
		return veSinhCongTrinhFinder.countVeSinhCongTrinhSearch(maTinh,
				maHuyen, maXa, loaiNhaTieuId, loaiCongTrinh, trangThai,
				namBaoCao);
	}

	public List<VeSinhCongTrinh> getVeSinhCongTrinhSearch(String maTinh,
			String maHuyen, String maXa, String loaiNhaTieuId,
			String loaiCongTrinh, String trangThai, String namBaoCao,
			int start, int end) throws SystemException {
		return veSinhCongTrinhFinder.getVeSinhCongTrinhSearch(maTinh, maHuyen,
				maXa, loaiNhaTieuId, loaiCongTrinh, trangThai, namBaoCao,
				start, end);
	}
}