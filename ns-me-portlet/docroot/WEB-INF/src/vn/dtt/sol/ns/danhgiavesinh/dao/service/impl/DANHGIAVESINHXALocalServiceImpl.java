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

package vn.dtt.sol.ns.danhgiavesinh.dao.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.sol.ns.danhgiavesinh.dao.model.DANHGIAVESINHXA;
import vn.dtt.sol.ns.danhgiavesinh.dao.service.base.DANHGIAVESINHXALocalServiceBaseImpl;

/**
 * The implementation of the d a n h g i a v e s i n h x a local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.sol.ns.danhgiavesinh.dao.service.DANHGIAVESINHXALocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.sol.ns.danhgiavesinh.dao.service.base.DANHGIAVESINHXALocalServiceBaseImpl
 * @see vn.dtt.sol.ns.danhgiavesinh.dao.service.DANHGIAVESINHXALocalServiceUtil
 */
public class DANHGIAVESINHXALocalServiceImpl
	extends DANHGIAVESINHXALocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.sol.ns.danhgiavesinh.dao.service.DANHGIAVESINHXALocalServiceUtil} to access the d a n h g i a v e s i n h x a local service.
	 */
	public List<DANHGIAVESINHXA> getDanhGiaVeSinhXaBaoCao(String maTinh,String maHuyen,String maXa,String namBaoCao) throws SystemException {
		return danhgiavesinhxaFinder.getDanhGiaVeSinhXaBaoCao(maTinh, maHuyen, maXa,  namBaoCao);
	}
	public int sumSoNguoiHuongLoiByMaTinh(String maTinh, String namBaoCao) {
		return danhgiavesinhxaFinder.sumSoNguoiHuongLoiByMaTinh(maTinh,namBaoCao);
	}
}