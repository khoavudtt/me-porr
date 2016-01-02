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

package vn.dtt.cmon.user.dao.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.cmon.user.dao.model.UserTinh;

/**
 * The persistence interface for the user tinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see UserTinhPersistenceImpl
 * @see UserTinhUtil
 * @generated
 */
public interface UserTinhPersistence extends BasePersistence<UserTinh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserTinhUtil} to access the user tinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the user tinhs where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @return the matching user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTinh> findByUID_MH(
		long userId, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user tinhs where userId = &#63; and maHuyen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param start the lower bound of the range of user tinhs
	* @param end the upper bound of the range of user tinhs (not inclusive)
	* @return the range of matching user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTinh> findByUID_MH(
		long userId, java.lang.String maHuyen, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user tinhs where userId = &#63; and maHuyen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param start the lower bound of the range of user tinhs
	* @param end the upper bound of the range of user tinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTinh> findByUID_MH(
		long userId, java.lang.String maHuyen, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user tinh in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user tinh
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a matching user tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh findByUID_MH_First(long userId,
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTinhException;

	/**
	* Returns the first user tinh in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user tinh, or <code>null</code> if a matching user tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh fetchByUID_MH_First(
		long userId, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user tinh in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user tinh
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a matching user tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh findByUID_MH_Last(long userId,
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTinhException;

	/**
	* Returns the last user tinh in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user tinh, or <code>null</code> if a matching user tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh fetchByUID_MH_Last(long userId,
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user tinhs before and after the current user tinh in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param id the primary key of the current user tinh
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user tinh
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a user tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh[] findByUID_MH_PrevAndNext(
		long id, long userId, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTinhException;

	/**
	* Removes all the user tinhs where userId = &#63; and maHuyen = &#63; from the database.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUID_MH(long userId, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user tinhs where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @return the number of matching user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByUID_MH(long userId, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user tinhs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTinh> findByUID_(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user tinhs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user tinhs
	* @param end the upper bound of the range of user tinhs (not inclusive)
	* @return the range of matching user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTinh> findByUID_(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user tinhs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user tinhs
	* @param end the upper bound of the range of user tinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTinh> findByUID_(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user tinh in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user tinh
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a matching user tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh findByUID__First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTinhException;

	/**
	* Returns the first user tinh in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user tinh, or <code>null</code> if a matching user tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh fetchByUID__First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user tinh in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user tinh
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a matching user tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh findByUID__Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTinhException;

	/**
	* Returns the last user tinh in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user tinh, or <code>null</code> if a matching user tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh fetchByUID__Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user tinhs before and after the current user tinh in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current user tinh
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user tinh
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a user tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh[] findByUID__PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTinhException;

	/**
	* Removes all the user tinhs where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUID_(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user tinhs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByUID_(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user tinh where userId = &#63; and maTinh = &#63; and maHuyen = &#63; or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTinhException} if it could not be found.
	*
	* @param userId the user ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @return the matching user tinh
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a matching user tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh findByT_H_UID(long userId,
		java.lang.String maTinh, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTinhException;

	/**
	* Returns the user tinh where userId = &#63; and maTinh = &#63; and maHuyen = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @return the matching user tinh, or <code>null</code> if a matching user tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh fetchByT_H_UID(long userId,
		java.lang.String maTinh, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user tinh where userId = &#63; and maTinh = &#63; and maHuyen = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user tinh, or <code>null</code> if a matching user tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh fetchByT_H_UID(long userId,
		java.lang.String maTinh, java.lang.String maHuyen,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the user tinh where userId = &#63; and maTinh = &#63; and maHuyen = &#63; from the database.
	*
	* @param userId the user ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @return the user tinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh removeByT_H_UID(long userId,
		java.lang.String maTinh, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTinhException;

	/**
	* Returns the number of user tinhs where userId = &#63; and maTinh = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @return the number of matching user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByT_H_UID(long userId, java.lang.String maTinh,
		java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the user tinh in the entity cache if it is enabled.
	*
	* @param userTinh the user tinh
	*/
	public void cacheResult(vn.dtt.cmon.user.dao.model.UserTinh userTinh);

	/**
	* Caches the user tinhs in the entity cache if it is enabled.
	*
	* @param userTinhs the user tinhs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.cmon.user.dao.model.UserTinh> userTinhs);

	/**
	* Creates a new user tinh with the primary key. Does not add the user tinh to the database.
	*
	* @param id the primary key for the new user tinh
	* @return the new user tinh
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh create(long id);

	/**
	* Removes the user tinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user tinh
	* @return the user tinh that was removed
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a user tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTinhException;

	public vn.dtt.cmon.user.dao.model.UserTinh updateImpl(
		vn.dtt.cmon.user.dao.model.UserTinh userTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user tinh with the primary key or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTinhException} if it could not be found.
	*
	* @param id the primary key of the user tinh
	* @return the user tinh
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a user tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTinhException;

	/**
	* Returns the user tinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user tinh
	* @return the user tinh, or <code>null</code> if a user tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTinh fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user tinhs.
	*
	* @return the user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user tinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user tinhs
	* @param end the upper bound of the range of user tinhs (not inclusive)
	* @return the range of user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user tinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user tinhs
	* @param end the upper bound of the range of user tinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the user tinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user tinhs.
	*
	* @return the number of user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}