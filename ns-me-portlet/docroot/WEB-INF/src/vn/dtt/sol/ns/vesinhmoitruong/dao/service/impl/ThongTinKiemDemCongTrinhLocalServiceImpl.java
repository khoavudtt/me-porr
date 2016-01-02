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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.ThongTinKiemDemCongTrinhLocalServiceBaseImpl;

/**
 * The implementation of the thong tin kiem dem cong trinh local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemCongTrinhLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author BinhTH
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.ThongTinKiemDemCongTrinhLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemCongTrinhLocalServiceUtil
 */
public class ThongTinKiemDemCongTrinhLocalServiceImpl
	extends ThongTinKiemDemCongTrinhLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemCongTrinhLocalServiceUtil} to access the thong tin kiem dem cong trinh local service.
	 */
	public List<ThongTinKiemDemCongTrinh> getListThongTinKiemDemCongTrinhByCTID(int veSinhGiaDinhId, int start, int end) throws SystemException {
		return thongTinKiemDemCongTrinhPersistence.findBy_veSinhConTrinhId(veSinhGiaDinhId);
	}
	public List<ThongTinKiemDemCongTrinh> getListThongTinKiemDemCongTrinhByGDID(int keHoachKiemDemVeSinhId, int start, int end) throws SystemException {
		return thongTinKiemDemCongTrinhPersistence.findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);
	}
	public int getCountCongTrinhBykeHoachId(int keHoachKiemDemVeSinhId, int daKetThucDieuTra) throws SystemException {
		return thongTinKiemDemCongTrinhPersistence.findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId, daKetThucDieuTra).size();
	}
	public int getCountCongTrinhBykeHoachIdDanhGiaKiemDem(int keHoachKiemDemVeSinhId, int danhGiaKiemDem) throws SystemException {
		return thongTinKiemDemCongTrinhPersistence.findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId, danhGiaKiemDem).size();
	}
	public int getSumCtBykeHoachKiemDemVsId(int keHoachKiemDemVeSinhId) throws SystemException {
		return thongTinKiemDemCongTrinhPersistence.findBy_CountCTByKeHoach(keHoachKiemDemVeSinhId).size();
	}
	
	public List<ThongTinKiemDemCongTrinh> getListThongTinKiemDemCongTrinhByKeHoachId(int keHoachId) throws SystemException {
		return thongTinKiemDemCongTrinhFinder.getListThongTinKiemDemCongTrinhByKeHoachId(keHoachId);
	}
}