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

package vn.dtt.sol.ns.baocaodli.dao.service.impl;

import java.util.Calendar;
import java.util.Date;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.sol.ns.baocaodli.dao.service.base.BaoCaoDLITongHopServiceBaseImpl;

/**
 * The implementation of the bao cao d l i tong hop remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLITongHopService}
 * interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author HuyMQ
 * @see vn.dtt.sol.ns.baocaodli.dao.service.base.BaoCaoDLITongHopServiceBaseImpl
 * @see vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLITongHopServiceUtil
 */
public class BaoCaoDLITongHopServiceImpl extends
		BaoCaoDLITongHopServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLITongHopServiceUtil} to
	 * access the bao cao d l i tong hop remote service.
	 */

	public void addBaoCaoDLITongHop(int soDauNoiTheoKeHoach,
			int soDauNoiMoi, int soNhaTieuHVSTheoKH, int soNhaTieuHVSMoi,
			int soNguoiHuongLoiNuocSach, int soXa, int tiLeHGDCoNhaTieu,
			int tiLeHGDCoNhaTieuHVS, int tiLeTruongHocHVS, int tiLeTramYTeHVS,
			int soNguoiHuongLoiVSTX, String keHoachPheDuyet) throws PortalException, SystemException {
		
		Date now = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(now);

		int nam = cal.get(Calendar.YEAR);

		baoCaoDLITongHopLocalService.initBaoCaoDLITongHop(nam,
				soDauNoiTheoKeHoach, soDauNoiMoi, soNhaTieuHVSTheoKH,
				soNhaTieuHVSMoi, soNguoiHuongLoiNuocSach, soXa,
				tiLeHGDCoNhaTieu, tiLeHGDCoNhaTieuHVS, tiLeTruongHocHVS,
				tiLeTramYTeHVS, soNguoiHuongLoiVSTX, keHoachPheDuyet);
	}

}