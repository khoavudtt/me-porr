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

import vn.dtt.cmon.user.dao.model.UserTramCap;

import java.util.List;

/**
 * The persistence utility for the user tram cap service. This utility wraps {@link UserTramCapPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see UserTramCapPersistence
 * @see UserTramCapPersistenceImpl
 * @generated
 */
public class UserTramCapUtil {
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
	public static void clearCache(UserTramCap userTramCap) {
		getPersistence().clearCache(userTramCap);
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
	public static List<UserTramCap> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserTramCap> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserTramCap> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UserTramCap update(UserTramCap userTramCap)
		throws SystemException {
		return getPersistence().update(userTramCap);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UserTramCap update(UserTramCap userTramCap,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(userTramCap, serviceContext);
	}

	/**
	* Returns all the user tram caps where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> findByUID_(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUID_(userId);
	}

	/**
	* Returns a range of all the user tram caps where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user tram caps
	* @param end the upper bound of the range of user tram caps (not inclusive)
	* @return the range of matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> findByUID_(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUID_(userId, start, end);
	}

	/**
	* Returns an ordered range of all the user tram caps where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of user tram caps
	* @param end the upper bound of the range of user tram caps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> findByUID_(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUID_(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first user tram cap in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user tram cap
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap findByUID__First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence().findByUID__First(userId, orderByComparator);
	}

	/**
	* Returns the first user tram cap in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap fetchByUID__First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUID__First(userId, orderByComparator);
	}

	/**
	* Returns the last user tram cap in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user tram cap
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap findByUID__Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence().findByUID__Last(userId, orderByComparator);
	}

	/**
	* Returns the last user tram cap in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap fetchByUID__Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUID__Last(userId, orderByComparator);
	}

	/**
	* Returns the user tram caps before and after the current user tram cap in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current user tram cap
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user tram cap
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a user tram cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap[] findByUID__PrevAndNext(
		long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence()
				   .findByUID__PrevAndNext(id, userId, orderByComparator);
	}

	/**
	* Removes all the user tram caps where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUID_(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUID_(userId);
	}

	/**
	* Returns the number of user tram caps where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUID_(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUID_(userId);
	}

	/**
	* Returns all the user tram caps where userId = &#63; and maTramCap = &#63;.
	*
	* @param userId the user ID
	* @param maTramCap the ma tram cap
	* @return the matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> findByUID_TC(
		long userId, long maTramCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUID_TC(userId, maTramCap);
	}

	/**
	* Returns a range of all the user tram caps where userId = &#63; and maTramCap = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param maTramCap the ma tram cap
	* @param start the lower bound of the range of user tram caps
	* @param end the upper bound of the range of user tram caps (not inclusive)
	* @return the range of matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> findByUID_TC(
		long userId, long maTramCap, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUID_TC(userId, maTramCap, start, end);
	}

	/**
	* Returns an ordered range of all the user tram caps where userId = &#63; and maTramCap = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param maTramCap the ma tram cap
	* @param start the lower bound of the range of user tram caps
	* @param end the upper bound of the range of user tram caps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> findByUID_TC(
		long userId, long maTramCap, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUID_TC(userId, maTramCap, start, end,
			orderByComparator);
	}

	/**
	* Returns the first user tram cap in the ordered set where userId = &#63; and maTramCap = &#63;.
	*
	* @param userId the user ID
	* @param maTramCap the ma tram cap
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user tram cap
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap findByUID_TC_First(
		long userId, long maTramCap,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence()
				   .findByUID_TC_First(userId, maTramCap, orderByComparator);
	}

	/**
	* Returns the first user tram cap in the ordered set where userId = &#63; and maTramCap = &#63;.
	*
	* @param userId the user ID
	* @param maTramCap the ma tram cap
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap fetchByUID_TC_First(
		long userId, long maTramCap,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUID_TC_First(userId, maTramCap, orderByComparator);
	}

	/**
	* Returns the last user tram cap in the ordered set where userId = &#63; and maTramCap = &#63;.
	*
	* @param userId the user ID
	* @param maTramCap the ma tram cap
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user tram cap
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap findByUID_TC_Last(
		long userId, long maTramCap,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence()
				   .findByUID_TC_Last(userId, maTramCap, orderByComparator);
	}

	/**
	* Returns the last user tram cap in the ordered set where userId = &#63; and maTramCap = &#63;.
	*
	* @param userId the user ID
	* @param maTramCap the ma tram cap
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap fetchByUID_TC_Last(
		long userId, long maTramCap,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUID_TC_Last(userId, maTramCap, orderByComparator);
	}

	/**
	* Returns the user tram caps before and after the current user tram cap in the ordered set where userId = &#63; and maTramCap = &#63;.
	*
	* @param id the primary key of the current user tram cap
	* @param userId the user ID
	* @param maTramCap the ma tram cap
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user tram cap
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a user tram cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap[] findByUID_TC_PrevAndNext(
		long id, long userId, long maTramCap,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence()
				   .findByUID_TC_PrevAndNext(id, userId, maTramCap,
			orderByComparator);
	}

	/**
	* Removes all the user tram caps where userId = &#63; and maTramCap = &#63; from the database.
	*
	* @param userId the user ID
	* @param maTramCap the ma tram cap
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUID_TC(long userId, long maTramCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUID_TC(userId, maTramCap);
	}

	/**
	* Returns the number of user tram caps where userId = &#63; and maTramCap = &#63;.
	*
	* @param userId the user ID
	* @param maTramCap the ma tram cap
	* @return the number of matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUID_TC(long userId, long maTramCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUID_TC(userId, maTramCap);
	}

	/**
	* Returns all the user tram caps where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @return the matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> findByUID_MH(
		long userId, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUID_MH(userId, maHuyen);
	}

	/**
	* Returns a range of all the user tram caps where userId = &#63; and maHuyen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param start the lower bound of the range of user tram caps
	* @param end the upper bound of the range of user tram caps (not inclusive)
	* @return the range of matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> findByUID_MH(
		long userId, java.lang.String maHuyen, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUID_MH(userId, maHuyen, start, end);
	}

	/**
	* Returns an ordered range of all the user tram caps where userId = &#63; and maHuyen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param start the lower bound of the range of user tram caps
	* @param end the upper bound of the range of user tram caps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> findByUID_MH(
		long userId, java.lang.String maHuyen, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUID_MH(userId, maHuyen, start, end, orderByComparator);
	}

	/**
	* Returns the first user tram cap in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user tram cap
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap findByUID_MH_First(
		long userId, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence()
				   .findByUID_MH_First(userId, maHuyen, orderByComparator);
	}

	/**
	* Returns the first user tram cap in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap fetchByUID_MH_First(
		long userId, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUID_MH_First(userId, maHuyen, orderByComparator);
	}

	/**
	* Returns the last user tram cap in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user tram cap
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap findByUID_MH_Last(
		long userId, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence()
				   .findByUID_MH_Last(userId, maHuyen, orderByComparator);
	}

	/**
	* Returns the last user tram cap in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap fetchByUID_MH_Last(
		long userId, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUID_MH_Last(userId, maHuyen, orderByComparator);
	}

	/**
	* Returns the user tram caps before and after the current user tram cap in the ordered set where userId = &#63; and maHuyen = &#63;.
	*
	* @param id the primary key of the current user tram cap
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user tram cap
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a user tram cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap[] findByUID_MH_PrevAndNext(
		long id, long userId, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence()
				   .findByUID_MH_PrevAndNext(id, userId, maHuyen,
			orderByComparator);
	}

	/**
	* Removes all the user tram caps where userId = &#63; and maHuyen = &#63; from the database.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUID_MH(long userId, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUID_MH(userId, maHuyen);
	}

	/**
	* Returns the number of user tram caps where userId = &#63; and maHuyen = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @return the number of matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUID_MH(long userId, java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUID_MH(userId, maHuyen);
	}

	/**
	* Returns the user tram cap where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTramCapException} if it could not be found.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @param maTramCap the ma tram cap
	* @return the matching user tram cap
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap findByUTC_T_H_X_TC_UID(
		long userId, java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh, long maTramCap)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence()
				   .findByUTC_T_H_X_TC_UID(userId, maHuyen, maXa, maTinh,
			maTramCap);
	}

	/**
	* Returns the user tram cap where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @param maTramCap the ma tram cap
	* @return the matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap fetchByUTC_T_H_X_TC_UID(
		long userId, java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh, long maTramCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUTC_T_H_X_TC_UID(userId, maHuyen, maXa, maTinh,
			maTramCap);
	}

	/**
	* Returns the user tram cap where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @param maTramCap the ma tram cap
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap fetchByUTC_T_H_X_TC_UID(
		long userId, java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh, long maTramCap, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUTC_T_H_X_TC_UID(userId, maHuyen, maXa, maTinh,
			maTramCap, retrieveFromCache);
	}

	/**
	* Removes the user tram cap where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; from the database.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @param maTramCap the ma tram cap
	* @return the user tram cap that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap removeByUTC_T_H_X_TC_UID(
		long userId, java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh, long maTramCap)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence()
				   .removeByUTC_T_H_X_TC_UID(userId, maHuyen, maXa, maTinh,
			maTramCap);
	}

	/**
	* Returns the number of user tram caps where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63;.
	*
	* @param userId the user ID
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @param maTramCap the ma tram cap
	* @return the number of matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUTC_T_H_X_TC_UID(long userId,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh, long maTramCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByUTC_T_H_X_TC_UID(userId, maHuyen, maXa, maTinh,
			maTramCap);
	}

	/**
	* Returns the user tram cap where maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTramCapException} if it could not be found.
	*
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @param maTramCap the ma tram cap
	* @return the matching user tram cap
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap findByUTC_T_H_X_TC(
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh, long maTramCap)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence()
				   .findByUTC_T_H_X_TC(maHuyen, maXa, maTinh, maTramCap);
	}

	/**
	* Returns the user tram cap where maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @param maTramCap the ma tram cap
	* @return the matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap fetchByUTC_T_H_X_TC(
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh, long maTramCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUTC_T_H_X_TC(maHuyen, maXa, maTinh, maTramCap);
	}

	/**
	* Returns the user tram cap where maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @param maTramCap the ma tram cap
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap fetchByUTC_T_H_X_TC(
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh, long maTramCap, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUTC_T_H_X_TC(maHuyen, maXa, maTinh, maTramCap,
			retrieveFromCache);
	}

	/**
	* Removes the user tram cap where maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; from the database.
	*
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @param maTramCap the ma tram cap
	* @return the user tram cap that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap removeByUTC_T_H_X_TC(
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String maTinh, long maTramCap)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence()
				   .removeByUTC_T_H_X_TC(maHuyen, maXa, maTinh, maTramCap);
	}

	/**
	* Returns the number of user tram caps where maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param maTinh the ma tinh
	* @param maTramCap the ma tram cap
	* @return the number of matching user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUTC_T_H_X_TC(java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String maTinh, long maTramCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByUTC_T_H_X_TC(maHuyen, maXa, maTinh, maTramCap);
	}

	/**
	* Caches the user tram cap in the entity cache if it is enabled.
	*
	* @param userTramCap the user tram cap
	*/
	public static void cacheResult(
		vn.dtt.cmon.user.dao.model.UserTramCap userTramCap) {
		getPersistence().cacheResult(userTramCap);
	}

	/**
	* Caches the user tram caps in the entity cache if it is enabled.
	*
	* @param userTramCaps the user tram caps
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> userTramCaps) {
		getPersistence().cacheResult(userTramCaps);
	}

	/**
	* Creates a new user tram cap with the primary key. Does not add the user tram cap to the database.
	*
	* @param id the primary key for the new user tram cap
	* @return the new user tram cap
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the user tram cap with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user tram cap
	* @return the user tram cap that was removed
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a user tram cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.cmon.user.dao.model.UserTramCap updateImpl(
		vn.dtt.cmon.user.dao.model.UserTramCap userTramCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userTramCap);
	}

	/**
	* Returns the user tram cap with the primary key or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTramCapException} if it could not be found.
	*
	* @param id the primary key of the user tram cap
	* @return the user tram cap
	* @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a user tram cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserTramCapException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the user tram cap with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user tram cap
	* @return the user tram cap, or <code>null</code> if a user tram cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTramCap fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the user tram caps.
	*
	* @return the user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the user tram caps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user tram caps
	* @param end the upper bound of the range of user tram caps (not inclusive)
	* @return the range of user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the user tram caps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user tram caps
	* @param end the upper bound of the range of user tram caps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the user tram caps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user tram caps.
	*
	* @return the number of user tram caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserTramCapPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserTramCapPersistence)PortletBeanLocatorUtil.locate(vn.dtt.cmon.user.dao.service.ClpSerializer.getServletContextName(),
					UserTramCapPersistence.class.getName());

			ReferenceRegistry.registerReference(UserTramCapUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UserTramCapPersistence persistence) {
	}

	private static UserTramCapPersistence _persistence;
}