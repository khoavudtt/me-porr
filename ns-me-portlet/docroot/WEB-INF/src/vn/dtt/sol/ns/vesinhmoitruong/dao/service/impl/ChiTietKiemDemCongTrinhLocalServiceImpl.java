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

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.ChiTietKiemDemCongTrinhLocalServiceBaseImpl;

/**
 * The implementation of the chi tiet kiem dem cong trinh local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.ChiTietKiemDemCongTrinhLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author BinhTH
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.ChiTietKiemDemCongTrinhLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.ChiTietKiemDemCongTrinhLocalServiceUtil
 */
public class ChiTietKiemDemCongTrinhLocalServiceImpl
	extends ChiTietKiemDemCongTrinhLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.ChiTietKiemDemCongTrinhLocalServiceUtil} to access the chi tiet kiem dem cong trinh local service.
	 */
	
	public List<ChiTietKiemDemCongTrinh> getListDetailCongTrinhByKeHoachId(int thongTinKiemDemCongTrinhId) throws SystemException {
		return chiTietKiemDemCongTrinhPersistence.findBy_thongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId);
	}
}