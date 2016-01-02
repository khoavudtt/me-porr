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
import com.liferay.portal.kernel.util.Validator;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.user.dao.model.UserTinh;
import vn.dtt.cmon.user.dao.service.base.UserTinhLocalServiceBaseImpl;

/**
 * The implementation of the user tinh local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.cmon.user.dao.service.UserTinhLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.cmon.user.dao.service.base.UserTinhLocalServiceBaseImpl
 * @see vn.dtt.cmon.user.dao.service.UserTinhLocalServiceUtil
 */
public class UserTinhLocalServiceImpl extends UserTinhLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.cmon.user.dao.service.UserTinhLocalServiceUtil} to access the user
	 * tinh local service.
	 */

	public void addUserTinh(String maTinh, long userId, String[] arrMaHuyen,
			String[] arrMaHuyenDel) throws PortalException, SystemException {

		// them danh sach ma huyen vao danh sach
		for (String maHuyen : arrMaHuyen) {
			UserTinh userTinh = userTinhPersistence.fetchByT_H_UID(userId,
					maTinh, maHuyen);

			DATAITEM huyenInsert = dataitemPersistence.fetchByENTRY_NODE_2(1,
					maTinh, maHuyen);

			if (Validator.isNull(userTinh) && Validator.isNotNull(huyenInsert)) {

				long userTinhId = counterLocalService.increment(UserTinh.class
						.getName());

				UserTinh userTinhAdd = userTinhLocalService
						.createUserTinh(userTinhId);

				userTinhAdd.setMaTinh(maTinh);

				userTinhAdd.setMaHuyen(maHuyen);

				userTinhAdd.setName(huyenInsert.getName());

				userTinhAdd.setUserId(userId);

				userTinhPersistence.update(userTinhAdd);

				userTinhPersistence.clearCache();
			}
		}

		// xoa ma huyen duoc chon

		for (String maHuyenDel : arrMaHuyenDel) {

			UserTinh userTinhDel = userTinhPersistence.fetchByT_H_UID(userId,
					maTinh, maHuyenDel);

			if (Validator.isNotNull(userTinhDel)) {
				userTinhPersistence.remove(userTinhDel);
			}
		}
	}

	public List<DATAITEM> getHuyenSelectByTinhAndUser(String maTinh,
			long userId, int start, int end) throws PortalException,
			SystemException {
		return userTinhFinder.findHuyeSelectByTinhAndUser(maTinh, userId,
				start, end);
	}

	public List<UserTinh> getDiaBanTinhByUserId(long userId)
			throws PortalException, SystemException {
		return userTinhPersistence.findByUID_(userId);
	}

	public List<DATAITEM> findHuyenQly(String maTinh, long userId, int start,
			int end) throws PortalException, SystemException {
		return userTinhFinder.findT_UID(maTinh, userId, start, end);
	}

	public int countHuyenQly(String maTinh, long userId)
			throws PortalException, SystemException {
		return userTinhFinder.countT_UID(maTinh, userId);
	}
}