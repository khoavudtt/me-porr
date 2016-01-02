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

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.cmon.user.dao.model.UserTramCap;
import vn.dtt.cmon.user.dao.service.base.UserTramCapLocalServiceBaseImpl;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the user tram cap local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.cmon.user.dao.service.UserTramCapLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.cmon.user.dao.service.base.UserTramCapLocalServiceBaseImpl
 * @see vn.dtt.cmon.user.dao.service.UserTramCapLocalServiceUtil
 */
public class UserTramCapLocalServiceImpl extends
		UserTramCapLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.cmon.user.dao.service.UserTramCapLocalServiceUtil} to access the
	 * user tram cap local service.
	 */

	public List<DATAITEM> findHuyenInTramCaoByUser(String maTinh,
			long maTramCap, long userId, int start, int end)
			throws PortalException, SystemException {
		return userTramCapFinder.finderHuyenInTramByUser(maTinh, maTramCap,
				userId, start, end);
	}

	public List<DATAITEM> findXaInHuyenInTramCapByUser(String maTinh,
			String maHuyen, long maTramCap, long userId, int start, int end)
			throws PortalException, SystemException {
		return userTramCapFinder.finderXaInHuyenTramByUser(maTinh, maHuyen,
				maTramCap, userId, start, end);
	}

	public List<DATAITEM> findXaKhongInHuyenInTramCapByUser(String maTinh,
			String maHuyen, long maTramCap, long userId, int start, int end)
			throws PortalException, SystemException {
		return userTramCapFinder.finderXaKhongInHuyenTramByUser(maTinh,
				maHuyen, maTramCap, userId, start, end);
	}

	/**
	 * Xoa UserTramCap
	 * 
	 * @param maTinh
	 * @param maHuyen
	 * @param maXa
	 * @param maTramCap
	 * @param userId
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void delUserTramCap(String maTinh, String maHuyen, String maXa,
			long maTramCap, long userId) throws PortalException,
			SystemException {
		UserTramCap userTramCap = userTramCapPersistence
				.fetchByUTC_T_H_X_TC_UID(userId, maHuyen, maXa, maTinh,
						maTramCap);

		if (Validator.isNotNull(userTramCap)) {
			userTramCapPersistence.remove(userTramCap);
		}
	}

	public UserTramCap addTramCap(String maTinh, String maHuyen, String maXa,
			long maTramCap, long userId) throws PortalException,
			SystemException {

		UserTramCap userTC = null;

		UserTramCap userInSys = userTramCapPersistence.fetchByUTC_T_H_X_TC_UID(
				userId, maHuyen, maXa, maTinh, maTramCap);

		DATAITEM xa = dataitemPersistence.fetchByENTRY_NODE_3(1, maXa);

		TramCapNuoc tramCap = tramCapNuocPersistence
				.fetchByPrimaryKey(maTramCap);

		if (Validator.isNull(userInSys) && Validator.isNotNull(xa)
				&& Validator.isNotNull(tramCap)) {

			userTC = userTramCapPersistence.fetchByUTC_T_H_X_TC(maHuyen, maXa,
					maTinh, maTramCap);

			if (Validator.isNull(userTC)) {

				long id = counterLocalService.increment(UserTramCap.class
						.getName());

				userTC = userTramCapPersistence.create(id);

				userTC.setMaTinh(maTinh);
				userTC.setMaHuyen(maHuyen);
				userTC.setMaXa(maXa);
				userTC.setMaTramCap(maTramCap);
				userTC.setName(xa.getName());
			} else {
				userTC.setUserId(userId);
			}

			userTramCapPersistence.update(userTC);

			userTramCapPersistence.clearCache();
		}

		return userTC;
	}

	public List<UserTramCap> getDiaBanByUserId(long userId)
			throws PortalException, SystemException {
		return userTramCapPersistence.findByUID_(userId);
	}

	public List<UserTramCap> getDiaBanByUserId(long userId, long maTramCap)
			throws PortalException, SystemException {
		return userTramCapPersistence.findByUID_TC(userId, maTramCap);
	}

	public List<TramCapNuoc> findTramCapByUserId(String maTinh, long userId,
			int start, int end) throws PortalException, SystemException {
		return userTramCapFinder.finderByUserId(maTinh, userId, start, end);
	}

	public int countTramCapByUser(String maTinh, long userId)
			throws PortalException, SystemException {
		return userTramCapFinder.countByUserId(maTinh, userId);
	}

	public List<UserMapping> findUserInTramCap(String maTinh, String maTramCap,
			int start, int end) throws PortalException, SystemException {
		return userTramCapFinder.finderUserInTramCap(maTinh, maTramCap, start,
				end);
	}

	public List<DATAITEM> findHuyenInTramCap(String maTinh, long maTramCap,
			int start, int end) throws PortalException, SystemException {
		return userTramCapFinder.finderHuyenInTram(maTinh, maTramCap, start,
				end);
	}

	public List<DATAITEM> findXaInHuyenAndTramCap(String maTinh,
			String maHuyen, long maTramCap, int start, int end)
			throws PortalException, SystemException {
		return userTramCapFinder.finderXaInHuyenTram(maTinh, maHuyen,
				maTramCap, start, end);
	}

}