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

import com.liferay.portal.PortletActiveException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.user.dao.model.UserHuyen;
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.cmon.user.dao.service.base.UserHuyenLocalServiceBaseImpl;

/**
 * The implementation of the user huyen local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.cmon.user.dao.service.UserHuyenLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.cmon.user.dao.service.base.UserHuyenLocalServiceBaseImpl
 * @see vn.dtt.cmon.user.dao.service.UserHuyenLocalServiceUtil
 */
public class UserHuyenLocalServiceImpl extends UserHuyenLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.cmon.user.dao.service.UserHuyenLocalServiceUtil} to access the
	 * user huyen local service.
	 */

	public List<DATAITEM> findHuyenDuocChonByUser(String maTinh,
			String maHuyen, long userId, int start, int end)
			throws PortalException, SystemException {
		return userHuyenFinder.findXaThuocHuyenDuocChonByUser(maTinh, maHuyen,
				userId, start, end);
	}

	public List<DATAITEM> findHuyenDaChonByUser(String maTinh, long userId,
			int start, int end) throws PortalException, SystemException {
		return userHuyenFinder.findHuyenChonByUser(maTinh, userId, start, end);
	}

	public List<DATAITEM> findXaThuocHuyenChonByUser(String maTinh,
			String maHuyen, long userId, int start, int end)
			throws PortalException, SystemException {
		return userHuyenFinder.findXaThuocHuyenChonByUser(maTinh, maHuyen,
				userId, start, end);
	}

	public int countHuyenChonByUser(String maTinh, long userId)
			throws PortalException, SystemException {
		return userHuyenFinder.countHuyenByUserId(maTinh, userId);
	}

	public int countXaThuocHuyenChonByUser(String maTinh, String maHuyen,
			long userId) throws PortalException, SystemException {
		return userHuyenFinder.countXaThuocHuyenByUserId(maTinh, maHuyen,
				userId);
	}

	public void delUserHuyen(String maTinh, String maHuyen, String maXa,
			long userId) throws PortalException, SystemException {
		
		UserHuyen inSys = userHuyenPersistence.fetchByUH_T_H_X_UID(userId,
				maHuyen, maXa, maTinh);
		if(Validator.isNotNull(inSys)) {
			userHuyenPersistence.remove(inSys);
		}
	}

	public UserHuyen addUserHuyen(String maTinh, String maHuyen, String maXa,
			long userId) throws PortalException, SystemException {

		UserHuyen userHuyen = null;

		UserHuyen inSys = userHuyenPersistence.fetchByUH_T_H_X_UID(userId,
				maHuyen, maXa, maTinh);

		DATAITEM xa = dataitemPersistence.fetchByENTRY_NODE_3(1, maXa);

		if (Validator.isNull(inSys) && Validator.isNotNull(xa)) {
			long id = counterLocalService.increment(UserHuyen.class.getName());

			userHuyen = userHuyenPersistence.create(id);

			userHuyen.setMaTinh(maTinh);
			userHuyen.setMaHuyen(maHuyen);
			userHuyen.setMaXa(maXa);
			userHuyen.setUserId(userId);
			userHuyen.setName(xa.getName());

			userHuyenPersistence.update(userHuyen);

			userHuyenPersistence.clearCache();
		}

		return userHuyen;
	}

	public List<UserHuyen> getDiaBanHuyenByUserId(long userId)
			throws PortalException, SystemException {
		return userHuyenPersistence.findByUID_(userId);
	}

	public List<UserMapping> getGSVInHuyen(String maTinh, String maHuyen,
			int start, int end) throws PortalException, SystemException {
		return userHuyenFinder.finderGSVInHuyen(maTinh, maHuyen, start, end);
	}

	public List<DATAITEM> findHuyenByUser(String maTinh, long userId,
			int start, int end) throws PortalException, SystemException {
		return userHuyenFinder.findHuyenByUser(maTinh, userId, start, end);
	}

	public int countHuyenByUser(String maTinh, long userId)
			throws PortalException, SystemException {
		return userHuyenFinder.coutHuyenByUser(maTinh, userId);
	}
}