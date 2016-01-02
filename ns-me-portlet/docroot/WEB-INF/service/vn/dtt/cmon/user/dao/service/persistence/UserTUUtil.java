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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.cmon.user.dao.model.UserTU;

import java.util.List;

/**
 * The persistence utility for the user t u service. This utility wraps {@link UserTUPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see UserTUPersistence
 * @see UserTUPersistenceImpl
 * @generated
 */
public class UserTUUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(UserTU userTU) {
		getPersistence().clearCache(userTU);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UserTU> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserTU> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserTU> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UserTU update(UserTU userTU) throws SystemException {
		return getPersistence().update(userTU);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UserTU update(UserTU userTU, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(userTU, serviceContext);
	}

	/**
	* Returns all the user t us where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user t us
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTU> findByUID_(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUID_(userId);
	}

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
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTU> findByUID_(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUID_(userId, start, end);
	}

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
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTU> findByUID_(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUID_(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first user t u in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user t u
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a matching user t u could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTU findByUID__First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTUException {
		return getPersistence().findByUID__First(userId, orderByComparator);
	}

	/**
	* Returns the first user t u in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user t u, or <code>null</code> if a matching user t u could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTU fetchByUID__First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUID__First(userId, orderByComparator);
	}

	/**
	* Returns the last user t u in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user t u
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a matching user t u could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTU findByUID__Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTUException {
		return getPersistence().findByUID__Last(userId, orderByComparator);
	}

	/**
	* Returns the last user t u in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user t u, or <code>null</code> if a matching user t u could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTU fetchByUID__Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUID__Last(userId, orderByComparator);
	}

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
	public static vn.dtt.cmon.user.dao.model.UserTU[] findByUID__PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTUException {
		return getPersistence()
				   .findByUID__PrevAndNext(id, userId, orderByComparator);
	}

	/**
	* Removes all the user t us where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUID_(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUID_(userId);
	}

	/**
	* Returns the number of user t us where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user t us
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUID_(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUID_(userId);
	}

	/**
	* Caches the user t u in the entity cache if it is enabled.
	*
	* @param userTU the user t u
	*/
	public static void cacheResult(vn.dtt.cmon.user.dao.model.UserTU userTU) {
		getPersistence().cacheResult(userTU);
	}

	/**
	* Caches the user t us in the entity cache if it is enabled.
	*
	* @param userTUs the user t us
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.cmon.user.dao.model.UserTU> userTUs) {
		getPersistence().cacheResult(userTUs);
	}

	/**
	* Creates a new user t u with the primary key. Does not add the user t u to the database.
	*
	* @param id the primary key for the new user t u
	* @return the new user t u
	*/
	public static vn.dtt.cmon.user.dao.model.UserTU create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the user t u with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user t u
	* @return the user t u that was removed
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a user t u with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTU remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTUException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.cmon.user.dao.model.UserTU updateImpl(
		vn.dtt.cmon.user.dao.model.UserTU userTU)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userTU);
	}

	/**
	* Returns the user t u with the primary key or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTUException} if it could not be found.
	*
	* @param id the primary key of the user t u
	* @return the user t u
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a user t u with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTU findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTUException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the user t u with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user t u
	* @return the user t u, or <code>null</code> if a user t u with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTU fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the user t us.
	*
	* @return the user t us
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTU> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTU> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTU> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the user t us from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user t us.
	*
	* @return the number of user t us
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserTUPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserTUPersistence)PortletBeanLocatorUtil.locate(vn.dtt.cmon.user.dao.service.ClpSerializer.getServletContextName(),
					UserTUPersistence.class.getName());

			ReferenceRegistry.registerReference(UserTUUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UserTUPersistence persistence) {
	}

	private static UserTUPersistence _persistence;
}