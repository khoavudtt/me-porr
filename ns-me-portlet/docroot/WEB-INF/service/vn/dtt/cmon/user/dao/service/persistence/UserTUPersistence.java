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

import vn.dtt.cmon.user.dao.model.UserTU;

/**
 * The persistence interface for the user t u service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see UserTUPersistenceImpl
 * @see UserTUUtil
 * @generated
 */
public interface UserTUPersistence extends BasePersistence<UserTU> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserTUUtil} to access the user t u persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the user t us where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user t us
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTU> findByUID_(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user t us where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user t us
	* @param end the upper bound of the range of user t us (not inclusive)
	* @return the range of matching user t us
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTU> findByUID_(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user t us where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user t us
	* @param end the upper bound of the range of user t us (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user t us
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTU> findByUID_(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user t u in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user t u
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a matching user t u could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTU findByUID__First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTUException;

	/**
	* Returns the first user t u in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user t u, or <code>null</code> if a matching user t u could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTU fetchByUID__First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user t u in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user t u
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a matching user t u could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTU findByUID__Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTUException;

	/**
	* Returns the last user t u in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user t u, or <code>null</code> if a matching user t u could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTU fetchByUID__Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user t us before and after the current user t u in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current user t u
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user t u
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a user t u with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTU[] findByUID__PrevAndNext(long id,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTUException;

	/**
	* Removes all the user t us where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUID_(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user t us where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user t us
	* @throws SystemException if a system exception occurred
	*/
	public int countByUID_(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the user t u in the entity cache if it is enabled.
	*
	* @param userTU the user t u
	*/
	public void cacheResult(vn.dtt.cmon.user.dao.model.UserTU userTU);

	/**
	* Caches the user t us in the entity cache if it is enabled.
	*
	* @param userTUs the user t us
	*/
	public void cacheResult(
		java.util.List<vn.dtt.cmon.user.dao.model.UserTU> userTUs);

	/**
	* Creates a new user t u with the primary key. Does not add the user t u to the database.
	*
	* @param id the primary key for the new user t u
	* @return the new user t u
	*/
	public vn.dtt.cmon.user.dao.model.UserTU create(long id);

	/**
	* Removes the user t u with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user t u
	* @return the user t u that was removed
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a user t u with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTU remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTUException;

	public vn.dtt.cmon.user.dao.model.UserTU updateImpl(
		vn.dtt.cmon.user.dao.model.UserTU userTU)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user t u with the primary key or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTUException} if it could not be found.
	*
	* @param id the primary key of the user t u
	* @return the user t u
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a user t u with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTU findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTUException;

	/**
	* Returns the user t u with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user t u
	* @return the user t u, or <code>null</code> if a user t u with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserTU fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user t us.
	*
	* @return the user t us
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTU> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user t us.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user t us
	* @param end the upper bound of the range of user t us (not inclusive)
	* @return the range of user t us
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTU> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user t us.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user t us
	* @param end the upper bound of the range of user t us (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user t us
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTU> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the user t us from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user t us.
	*
	* @return the number of user t us
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}