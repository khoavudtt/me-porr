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

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.DanhGiaVeSinhXaNewFakeLocalServiceBaseImpl;

/**
 * The implementation of the danh gia ve sinh xa new fake local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewFakeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author BinhTH
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.DanhGiaVeSinhXaNewFakeLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewFakeLocalServiceUtil
 */
public class DanhGiaVeSinhXaNewFakeLocalServiceImpl
	extends DanhGiaVeSinhXaNewFakeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewFakeLocalServiceUtil} to access the danh gia ve sinh xa new fake local service.
	 */
	public int countListDanhGiaVeSinhXaInsert(String maTinh,String maHuyen,int nam) throws SystemException {
		return danhGiaVeSinhXaNewFakeFinder.countListDanhGiaVeSinhXaInsert(maTinh, maHuyen, nam);
	}
	public List<DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaInsert(String maTinh,String maHuyen,int nam, int start, int end) throws SystemException {
		return danhGiaVeSinhXaNewFakeFinder.getListDanhGiaVeSinhXaInsert(maTinh, maHuyen, nam, start, end);
	}
	
	public int countListDanhGiaVeSinhXaFakeList(String maTinh,String maHuyen,int nam) throws SystemException {
		return danhGiaVeSinhXaNewFakeFinder.countListDanhGiaVeSinhXaFakeList(maTinh, maHuyen, nam);
	}
	public List<DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaFakeList(String maTinh,String maHuyen,int nam, int start, int end) throws SystemException {
		return danhGiaVeSinhXaNewFakeFinder.getListDanhGiaVeSinhXaFakeList(maTinh, maHuyen, nam, start, end);
	}
	
	public List<DanhGiaVeSinhXaNewFake> getListDanhGiaVeSinhXaSearch(String maTinh,String nam, int start,int end) throws SystemException {
		return danhGiaVeSinhXaNewFakeFinder.getListDanhGiaVeSinhXaSearch(maTinh, nam, start, end);
	}
	public int countListDanhGiaVeSinhXaSearch(String maTinh,String nam) throws SystemException {
		return danhGiaVeSinhXaNewFakeFinder.getListDanhGiaVeSinhXaSearch(maTinh, nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
	}
	public int countListDanhGiaVeSinhXaSearchHuyen(String maTinh,String nam) throws SystemException {
		return danhGiaVeSinhXaNewFakeFinder.getListDanhGiaVeSinhXaSearchHuyen(maTinh, nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
	}
}