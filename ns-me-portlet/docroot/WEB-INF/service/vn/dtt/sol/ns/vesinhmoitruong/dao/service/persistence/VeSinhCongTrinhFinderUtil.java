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
public class VeSinhCongTrinhFinderUtil {
	public static int COUNT_VE_SINH_GIA_DINH_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_VE_SINH_GIA_DINH_ADMIN();
	}

	public static int COUNT_VE_SINH_GIA_DINH_TU(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_VE_SINH_GIA_DINH_TU(userId);
	}

	public static int COUNT_VE_SINH_GIA_DINH_TINH(java.lang.String maTinh,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_VE_SINH_GIA_DINH_TINH(maTinh, userId);
	}

	public static int COUNT_VE_SINH_GIA_DINH_HUYEN(java.lang.String maTinh,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_VE_SINH_GIA_DINH_HUYEN(maTinh, userId);
	}

	public static int COUNT_VE_SINH_CONG_TRINH_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_VE_SINH_CONG_TRINH_ADMIN();
	}

	public static int COUNT_VE_SINH_CONG_TRINH_TU(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_VE_SINH_CONG_TRINH_TU(userId);
	}

	public static int COUNT_VE_SINH_CONG_TRINH_TINH(java.lang.String maTinh,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_VE_SINH_CONG_TRINH_TINH(maTinh, userId);
	}

	public static int COUNT_VE_SINH_CONG_TRINH_HUYEN(java.lang.String maTinh,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_VE_SINH_CONG_TRINH_HUYEN(maTinh, userId);
	}

	public static int COUNT_KIEM_DEM_VE_SINH_ADMIN(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KIEM_DEM_VE_SINH_ADMIN(userId);
	}

	public static int COUNT_KIEM_DEM_VE_SINH_TU(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KIEM_DEM_VE_SINH_TU(userId);
	}

	public static int COUNT_KIEM_DEM_VE_SINH_TINH(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KIEM_DEM_VE_SINH_TINH(userId);
	}

	public static int COUNT_KIEM_DEM_VE_SINH_HUYEN(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KIEM_DEM_VE_SINH_HUYEN(userId);
	}

	public static int COUNT_KE_HOACH_VE_SINH_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KE_HOACH_VE_SINH_ADMIN();
	}

	public static int COUNT_KE_HOACH_VE_SINH_TU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KE_HOACH_VE_SINH_TU();
	}

	public static int COUNT_KE_HOACH_VE_SINH_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KE_HOACH_VE_SINH_TINH(maTinh);
	}

	public static int COUNT_KE_HOACH_VE_SINH_HUYEN(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KE_HOACH_VE_SINH_HUYEN(maTinh);
	}

	public static int COUNT_DANH_GIA_VE_SINH_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_DANH_GIA_VE_SINH_ADMIN();
	}

	public static int COUNT_DANH_GIA_VE_SINH_TU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_DANH_GIA_VE_SINH_TU();
	}

	public static int COUNT_DANH_GIA_VE_SINH_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_DANH_GIA_VE_SINH_TINH(maTinh);
	}

	public static int COUNT_DANH_GIA_VE_SINH_HUYEN(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_DANH_GIA_VE_SINH_HUYEN(maTinh);
	}

	public static int COUNT_MAU_NGAU_NHIEN_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_MAU_NGAU_NHIEN_ADMIN();
	}

	public static int COUNT_MAU_NGAU_NHIEN_TU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_MAU_NGAU_NHIEN_TU();
	}

	public static int COUNT_MAU_NGAU_NHIEN_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_MAU_NGAU_NHIEN_TINH(maTinh);
	}

	public static int COUNT_MAU_NGAU_NHIEN_HUYEN(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_MAU_NGAU_NHIEN_HUYEN(maTinh);
	}

	public static int COUNT_DANH_GIA_CUOI_NAM_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_DANH_GIA_CUOI_NAM_ADMIN();
	}

	public static int COUNT_DANH_GIA_CUOI_NAM_TU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_DANH_GIA_CUOI_NAM_TU();
	}

	public static int COUNT_DANH_GIA_CUOI_NAM_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_DANH_GIA_CUOI_NAM_TINH(maTinh);
	}

	public static int COUNT_DANH_GIA_CUOI_NAM_TRAMCAP(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_DANH_GIA_CUOI_NAM_TRAMCAP(maTinh);
	}

	public static int COUNT_KE_HOACH_DAU_NAM_AMDIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KE_HOACH_DAU_NAM_AMDIN();
	}

	public static int COUNT_KE_HOACH_DAU_NAM_TU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KE_HOACH_DAU_NAM_TU();
	}

	public static int COUNT_KE_HOACH_DAU_NAM_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KE_HOACH_DAU_NAM_TINH(maTinh);
	}

	public static int COUNT_KE_HOACH_DAU_NAM_TRAMCAP(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KE_HOACH_DAU_NAM_TRAMCAP(userId);
	}

	public static int COUNT_KE_HOACH_DAU_NOI_NUOC_TRAMCAP(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KE_HOACH_DAU_NOI_NUOC_TRAMCAP(userId);
	}

	public static int COUNT_KE_HOACH_DAU_NOI_NUOC_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KE_HOACH_DAU_NOI_NUOC_TINH(maTinh);
	}

	public static int COUNT_KE_HOACH_DAU_NOI_NUOC_TU()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KE_HOACH_DAU_NOI_NUOC_TU();
	}

	public static int COUNT_KE_HOACH_DAU_NOI_NUOC_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_KE_HOACH_DAU_NOI_NUOC_ADMIN();
	}

	public static int COUNT_DAU_NOI_NUOC_TRAMCAP(java.lang.String maTinh,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_DAU_NOI_NUOC_TRAMCAP(maTinh, userId);
	}

	public static int COUNT_DAU_NOI_NUOC_TINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_DAU_NOI_NUOC_TINH(maTinh);
	}

	public static int COUNT_DAU_NOI_NUOC_TU(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_DAU_NOI_NUOC_TU(userId);
	}

	public static int COUNT_DAU_NOI_NUOC_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_DAU_NOI_NUOC_ADMIN();
	}

	public static int COUNT_CONG_TRINH_CAP_NUOC_TRAMCAP(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_CONG_TRINH_CAP_NUOC_TRAMCAP(userId);
	}

	public static int COUNT_CONG_TRINH_CAP_NUOC_TINH(java.lang.String maTinh,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_CONG_TRINH_CAP_NUOC_TINH(maTinh, userId);
	}

	public static int COUNT_CONG_TRINH_CAP_NUOC_TU(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_CONG_TRINH_CAP_NUOC_TU(userId);
	}

	public static int COUNT_CONG_TRINH_CAP_NUOC_ADMIN()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().COUNT_CONG_TRINH_CAP_NUOC_ADMIN();
	}

	public static int countCongTrinhDongBoInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countCongTrinhDongBoInTinh(maTinh);
	}

	public static int countCongTrinhPhanKHInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countCongTrinhPhanKHInTinh(maTinh);
	}

	public static int countCongTrinhInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countCongTrinhInTinh(maTinh);
	}

	public static int countHGDDongBoInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countHGDDongBoInTinh(maTinh);
	}

	public static int countHGDPhanKHInTinh(java.lang.String maTinh,
		int namXayDung)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countHGDPhanKHInTinh(maTinh, namXayDung);
	}

	public static int countHGDInTinh(java.lang.String maTinh, int namXayDung)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countHGDInTinh(maTinh, namXayDung);
	}

	public static int countDauNoiDongBoInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countDauNoiDongBoInTinh(maTinh);
	}

	public static int countDauNoiPhanKHInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countDauNoiPhanKHInTinh(maTinh);
	}

	public static int countDauNoiInTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countDauNoiInTinh(maTinh);
	}

	public static int countVeSinhCongTrinhSearch(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String loaiNhaTieuId, java.lang.String loaiCongTrinh,
		java.lang.String trangThai, java.lang.String namBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countVeSinhCongTrinhSearch(maTinh, maHuyen, maXa,
			loaiNhaTieuId, loaiCongTrinh, trangThai, namBaoCao);
	}

	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh> getVeSinhCongTrinhSearch(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String loaiNhaTieuId,
		java.lang.String loaiCongTrinh, java.lang.String trangThai,
		java.lang.String namBaoCao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getVeSinhCongTrinhSearch(maTinh, maHuyen, maXa,
			loaiNhaTieuId, loaiCongTrinh, trangThai, namBaoCao, start, end);
	}

	public static VeSinhCongTrinhFinder getFinder() {
		if (_finder == null) {
			_finder = (VeSinhCongTrinhFinder)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.vesinhmoitruong.dao.service.ClpSerializer.getServletContextName(),
					VeSinhCongTrinhFinder.class.getName());

			ReferenceRegistry.registerReference(VeSinhCongTrinhFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(VeSinhCongTrinhFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(VeSinhCongTrinhFinderUtil.class,
			"_finder");
	}

	private static VeSinhCongTrinhFinder _finder;
}