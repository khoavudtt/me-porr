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

import vn.dtt.cmon.user.dao.model.UserHuyen;

/**
 * The persistence interface for the user huyen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see UserHuyenPersistenceImpl
 * @see UserHuyenUtil
 * @generated
 */
public interface UserHuyenPersistence extends BasePersistence<UserHuyen> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserHuyenUtil} to access the user huyen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the user huyens where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user huyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> findByUID_(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user huyens where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user huyens
	* @param end the upper bound of the range of user huyens (not inclusive)
	* @return the range of matching user huyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> findByUID_(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user huyens where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user huyens
	* @param end the upper bound of the range of user huyens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user huyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> findByUID_(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user huyen in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user huyen
	* @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a matching user huyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen findByUID__First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserHuyenException;

	/**
	* Returns the first user huyen in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user huyen, or <code>null</code> if a matching user huyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen fetchByUID__First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user huyen in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user huyen
	* @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a matching user huyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen findByUID__Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserHuyenException;

	/**
	* Returns the last user huyen in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user huyen, or <code>null</code> if a matching user huyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen fetchByUID__Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user huyens before and after the current user huyen in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current user huyen
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user huyen
	* @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a user huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen[] findByUID__PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserHuyenException;

	/**
	* Removes all the user huyens where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUID_(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user huyens where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user huyens
	* @throws SystemException if a system exception occurred
	*/
	public int countByUID_(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user huyens where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @return the matching user huyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> findByUID_MH(
		long userId, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user huyens where userId = &#63; and maHuyen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param start the lower bound of the range of user huyens
	* @param end the upper bound of the range of user huyens (not inclusive)
	* @return the range of matching user huyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> findByUID_MH(
		long userId, java.lang.String maHuyen, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user huyens where userId = &#63; and maHuyen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param start the lower bound of the range of user huyens
	* @param end the upper bound of the range of user huyens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user huyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> findByUID_MH(
		long userId, java.lang.String maHuyen, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user huyen in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user huyen
	* @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a matching user huyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen findByUID_MH_First(
		long userId, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserHuyenException;

	/**
	* Returns the first user huyen in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user huyen, or <code>null</code> if a matching user huyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen fetchByUID_MH_First(
		long userId, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user huyen in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user huyen
	* @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a matching user huyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen findByUID_MH_Last(long userId,
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserHuyenException;

	/**
	* Returns the last user huyen in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user huyen, or <code>null</code> if a matching user huyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen fetchByUID_MH_Last(
		long userId, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user huyens before and after the current user huyen in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param id the primary key of the current user huyen
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user huyen
	* @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a user huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen[] findByUID_MH_PrevAndNext(
		long id, long userId, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserHuyenException;

	/**
	* Removes all the user huyens where userId = &#63; and maHuyen = &#63; from the database.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUID_MH(long userId, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user huyens where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @return the number of matching user huyens
	* @throws SystemException if a system exception occurred
	*/
	public int countByUID_MH(long userId, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user huyen where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserHuyenException} if it could not be found.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @return the matching user huyen
	* @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a matching user huyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen findByUH_T_H_X_UID(
		long userId, java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserHuyenException;

	/**
	* Returns the user huyen where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @return the matching user huyen, or <code>null</code> if a matching user huyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen fetchByUH_T_H_X_UID(
		long userId, java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user huyen where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user huyen, or <code>null</code> if a matching user huyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen fetchByUH_T_H_X_UID(
		long userId, java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the user huyen where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; from the database.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @return the user huyen that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen removeByUH_T_H_X_UID(
		long userId, java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserHuyenException;

	/**
	* Returns the number of user huyens where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @return the number of matching user huyens
	* @throws SystemException if a system exception occurred
	*/
	public int countByUH_T_H_X_UID(long userId, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the user huyen in the entity cache if it is enabled.
	*
	* @param userHuyen the user huyen
	*/
	public void cacheResult(vn.dtt.cmon.user.dao.model.UserHuyen userHuyen);

	/**
	* Caches the user huyens in the entity cache if it is enabled.
	*
	* @param userHuyens the user huyens
	*/
	public void cacheResult(
		java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> userHuyens);

	/**
	* Creates a new user huyen with the primary key. Does not add the user huyen to the database.
	*
	* @param id the primary key for the new user huyen
	* @return the new user huyen
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen create(long id);

	/**
	* Removes the user huyen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user huyen
	* @return the user huyen that was removed
	* @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a user huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserHuyenException;

	public vn.dtt.cmon.user.dao.model.UserHuyen updateImpl(
		vn.dtt.cmon.user.dao.model.UserHuyen userHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user huyen with the primary key or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserHuyenException} if it could not be found.
	*
	* @param id the primary key of the user huyen
	* @return the user huyen
	* @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a user huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserHuyenException;

	/**
	* Returns the user huyen with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user huyen
	* @return the user huyen, or <code>null</code> if a user huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserHuyen fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user huyens.
	*
	* @return the user huyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user huyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user huyens
	* @param end the upper bound of the range of user huyens (not inclusive)
	* @return the range of user huyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user huyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user huyens
	* @param end the upper bound of the range of user huyens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user huyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the user huyens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user huyens.
	*
	* @return the number of user huyens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}