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

import java.io.File;
import java.util.Calendar;
import java.util.Date;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI;
import vn.dtt.sol.ns.baocaodli.dao.service.base.BaoCaoDLIServiceBaseImpl;
import vn.dtt.sol.ns.baocaodli.permission.BaoCaoDLIPermission;

/**
 * The implementation of the bao cao d l i remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLIService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HuyMQ
 * @see vn.dtt.sol.ns.baocaodli.dao.service.base.BaoCaoDLIServiceBaseImpl
 * @see vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLIServiceUtil
 */
public class BaoCaoDLIServiceImpl extends BaoCaoDLIServiceBaseImpl {
	public void initBaoCaoDLI() throws SystemException {
		Date now = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		
		int nam = cal.get(Calendar.YEAR);
		
		int count = baoCaoDLIPersistence.countByNam(nam);
		
		if(count == 0) {
			baoCaoDLILocalService.initBaoCao(nam);
		}
	}
	
	public void deleteBaoCao(long baoCaoDLIId) 
		throws PortalException, SystemException {
		
		baoCaoDLILocalService.deleteBaoCao(baoCaoDLIId);
	}
	
	public BaoCaoDLI updateBaoCao(long groupId, long baoCaoDLIId, int nam, String maTinh, 
			String soBaoCao, String nguoiLap, String nguoiDuyet, int ngayBaoCaoMonth, 
			int ngayBaoCaoDay, int ngayBaoCaoYear, long folderId, File luuTruPDF1, File luuTruPDF2, 
			File luuTruCSV1, File luuTruCSV2, int trangThai, ServiceContext serviceContext)
		throws PortalException, SystemException {
		
		
		BaoCaoDLIPermission.check(getPermissionChecker() , groupId, vn.dtt.sol.ns.util.ActionKeys.ADD_BAOCAO);
		
		return baoCaoDLILocalService.updateBaoCao(getUserId(), groupId, baoCaoDLIId, nam,
			maTinh, soBaoCao, nguoiLap, nguoiDuyet, ngayBaoCaoMonth,
			ngayBaoCaoDay, ngayBaoCaoYear, folderId, luuTruPDF1,
			luuTruPDF2, luuTruCSV1, luuTruCSV2, trangThai, serviceContext);
	}
}