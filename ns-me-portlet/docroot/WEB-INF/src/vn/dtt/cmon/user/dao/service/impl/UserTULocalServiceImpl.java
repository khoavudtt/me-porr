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

package vn.dtt.cmon.user.dao.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil;
import vn.dtt.cmon.user.dao.model.UserTU;
import vn.dtt.cmon.user.dao.service.base.UserTULocalServiceBaseImpl;

/**
 * The implementation of the user t u local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.cmon.user.dao.service.UserTULocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.cmon.user.dao.service.base.UserTULocalServiceBaseImpl
 * @see vn.dtt.cmon.user.dao.service.UserTULocalServiceUtil
 */
public class UserTULocalServiceImpl extends UserTULocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.cmon.user.dao.service.UserTULocalServiceUtil} to access the user t
	 * u local service.
	 */

	public void addDiaBanTUByUser(long userId, long [] lsMaTinh)
			throws PortalException, SystemException {
		
		deleteByUserId(userId);
		
		for (long maTinh : lsMaTinh) {
			long diaBanId = counterLocalService.increment(UserTU.class.getName());
			
			UserTU userTu = userTULocalService.createUserTU(diaBanId);
			
			String strMaTinh = StringPool.BLANK;
			
			if (maTinh < 10) {
				strMaTinh = "0" + Long.toString(maTinh);
			} else {
				strMaTinh = Long.toString(maTinh);
			}
			
			DATAITEM tinh = DATAITEMLocalServiceUtil.getDataItem(1, 1, strMaTinh);
			
			if (Validator.isNotNull(tinh)) {
				userTu.setMaTinh(strMaTinh);
				userTu.setUserId(userId);
				userTu.setName(tinh.getName());
			}
			
			userTUPersistence.update(userTu);
			
			userTUPersistence.clearCache();
		}
		
	}

	private void deleteByUserId(long userId) throws PortalException,
			SystemException {
		List<UserTU> lsUser = getTinhByUserId(userId);

		for (UserTU userTu : lsUser) {
			userTUPersistence.remove(userTu);
		}
	}

	public List<UserTU> getTinhByUserId(long userId) throws PortalException,
			SystemException {
		return userTUPersistence.findByUID_(userId);
	}

	public List<DATAITEM> getTinhTUByUser(long userId, int start, int end)
			throws PortalException, SystemException {
		return userTUFinder.finderTinhTUByUserId(userId, start, end);
	}

	public int countTinhTUByUser(long userId) throws PortalException,
			SystemException {
		return userTUFinder.countTinhTUByUserId(userId);
	}
}