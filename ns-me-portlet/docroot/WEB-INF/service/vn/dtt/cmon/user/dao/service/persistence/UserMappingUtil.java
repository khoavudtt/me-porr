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

import vn.dtt.cmon.user.dao.model.UserMapping;

import java.util.List;

/**
 * The persistence utility for the user mapping service. This utility wraps {@link UserMappingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see UserMappingPersistence
 * @see UserMappingPersistenceImpl
 * @generated
 */
public class UserMappingUtil {
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
	public static void clearCache(UserMapping userMapping) {
		getPersistence().clearCache(userMapping);
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
	public static List<UserMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static UserMapping update(UserMapping userMapping)
		throws SystemException {
		return getPersistence().update(userMapping);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static UserMapping update(UserMapping userMapping,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(userMapping, serviceContext);
	}

	/**
	* Returns all the user mappings where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @return the matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_1(
		java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_C_1(orgCode1);
	}

	/**
	* Returns a range of all the user mappings where orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_1(
		java.lang.String orgCode1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_C_1(orgCode1, start, end);
	}

	/**
	* Returns an ordered range of all the user mappings where orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_1(
		java.lang.String orgCode1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByO_C_1(orgCode1, start, end, orderByComparator);
	}

	/**
	* Returns the first user mapping in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByO_C_1_First(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence().findByO_C_1_First(orgCode1, orderByComparator);
	}

	/**
	* Returns the first user mapping in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByO_C_1_First(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByO_C_1_First(orgCode1, orderByComparator);
	}

	/**
	* Returns the last user mapping in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByO_C_1_Last(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence().findByO_C_1_Last(orgCode1, orderByComparator);
	}

	/**
	* Returns the last user mapping in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByO_C_1_Last(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByO_C_1_Last(orgCode1, orderByComparator);
	}

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set where orgCode1 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping[] findByO_C_1_PrevAndNext(
		long id, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .findByO_C_1_PrevAndNext(id, orgCode1, orderByComparator);
	}

	/**
	* Returns all the user mappings that the user has permission to view where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @return the matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_1(
		java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByO_C_1(orgCode1);
	}

	/**
	* Returns a range of all the user mappings that the user has permission to view where orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_1(
		java.lang.String orgCode1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByO_C_1(orgCode1, start, end);
	}

	/**
	* Returns an ordered range of all the user mappings that the user has permissions to view where orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_1(
		java.lang.String orgCode1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByO_C_1(orgCode1, start, end, orderByComparator);
	}

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where orgCode1 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping[] filterFindByO_C_1_PrevAndNext(
		long id, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .filterFindByO_C_1_PrevAndNext(id, orgCode1,
			orderByComparator);
	}

	/**
	* Removes all the user mappings where orgCode1 = &#63; from the database.
	*
	* @param orgCode1 the org code1
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByO_C_1(java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByO_C_1(orgCode1);
	}

	/**
	* Returns the number of user mappings where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByO_C_1(java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByO_C_1(orgCode1);
	}

	/**
	* Returns the number of user mappings that the user has permission to view where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @return the number of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByO_C_1(java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByO_C_1(orgCode1);
	}

	/**
	* Returns all the user mappings where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_C_1_O_C_2(orgCode1, orgCode2);
	}

	/**
	* Returns a range of all the user mappings where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_C_1_O_C_2(orgCode1, orgCode2, start, end);
	}

	/**
	* Returns an ordered range of all the user mappings where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByO_C_1_O_C_2(orgCode1, orgCode2, start, end,
			orderByComparator);
	}

	/**
	* Returns the first user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByO_C_1_O_C_2_First(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .findByO_C_1_O_C_2_First(orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the first user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByO_C_1_O_C_2_First(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByO_C_1_O_C_2_First(orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the last user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByO_C_1_O_C_2_Last(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .findByO_C_1_O_C_2_Last(orgCode1, orgCode2, orderByComparator);
	}

	/**
	* Returns the last user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByO_C_1_O_C_2_Last(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByO_C_1_O_C_2_Last(orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping[] findByO_C_1_O_C_2_PrevAndNext(
		long id, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .findByO_C_1_O_C_2_PrevAndNext(id, orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Returns all the user mappings that the user has permission to view where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByO_C_1_O_C_2(orgCode1, orgCode2);
	}

	/**
	* Returns a range of all the user mappings that the user has permission to view where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByO_C_1_O_C_2(orgCode1, orgCode2, start, end);
	}

	/**
	* Returns an ordered range of all the user mappings that the user has permissions to view where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByO_C_1_O_C_2(orgCode1, orgCode2, start, end,
			orderByComparator);
	}

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping[] filterFindByO_C_1_O_C_2_PrevAndNext(
		long id, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .filterFindByO_C_1_O_C_2_PrevAndNext(id, orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Removes all the user mappings where orgCode1 = &#63; and orgCode2 = &#63; from the database.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByO_C_1_O_C_2(java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByO_C_1_O_C_2(orgCode1, orgCode2);
	}

	/**
	* Returns the number of user mappings where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByO_C_1_O_C_2(java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByO_C_1_O_C_2(orgCode1, orgCode2);
	}

	/**
	* Returns the number of user mappings that the user has permission to view where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the number of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByO_C_1_O_C_2(java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByO_C_1_O_C_2(orgCode1, orgCode2);
	}

	/**
	* Returns all the user mappings where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @return the matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_2(
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_C_2(orgCode2);
	}

	/**
	* Returns a range of all the user mappings where orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_2(
		java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_C_2(orgCode2, start, end);
	}

	/**
	* Returns an ordered range of all the user mappings where orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_2(
		java.lang.String orgCode2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByO_C_2(orgCode2, start, end, orderByComparator);
	}

	/**
	* Returns the first user mapping in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByO_C_2_First(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence().findByO_C_2_First(orgCode2, orderByComparator);
	}

	/**
	* Returns the first user mapping in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByO_C_2_First(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByO_C_2_First(orgCode2, orderByComparator);
	}

	/**
	* Returns the last user mapping in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByO_C_2_Last(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence().findByO_C_2_Last(orgCode2, orderByComparator);
	}

	/**
	* Returns the last user mapping in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByO_C_2_Last(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByO_C_2_Last(orgCode2, orderByComparator);
	}

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set where orgCode2 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping[] findByO_C_2_PrevAndNext(
		long id, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .findByO_C_2_PrevAndNext(id, orgCode2, orderByComparator);
	}

	/**
	* Returns all the user mappings that the user has permission to view where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @return the matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_2(
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByO_C_2(orgCode2);
	}

	/**
	* Returns a range of all the user mappings that the user has permission to view where orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_2(
		java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByO_C_2(orgCode2, start, end);
	}

	/**
	* Returns an ordered range of all the user mappings that the user has permissions to view where orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_2(
		java.lang.String orgCode2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByO_C_2(orgCode2, start, end, orderByComparator);
	}

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where orgCode2 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping[] filterFindByO_C_2_PrevAndNext(
		long id, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .filterFindByO_C_2_PrevAndNext(id, orgCode2,
			orderByComparator);
	}

	/**
	* Removes all the user mappings where orgCode2 = &#63; from the database.
	*
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByO_C_2(java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByO_C_2(orgCode2);
	}

	/**
	* Returns the number of user mappings where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByO_C_2(java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByO_C_2(orgCode2);
	}

	/**
	* Returns the number of user mappings that the user has permission to view where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @return the number of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByO_C_2(java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByO_C_2(orgCode2);
	}

	/**
	* Returns all the user mappings where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @return the matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByT_O_C_1(
		int userType, java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_O_C_1(userType, orgCode1);
	}

	/**
	* Returns a range of all the user mappings where userType = &#63; and orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByT_O_C_1(
		int userType, java.lang.String orgCode1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_O_C_1(userType, orgCode1, start, end);
	}

	/**
	* Returns an ordered range of all the user mappings where userType = &#63; and orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByT_O_C_1(
		int userType, java.lang.String orgCode1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_O_C_1(userType, orgCode1, start, end,
			orderByComparator);
	}

	/**
	* Returns the first user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByT_O_C_1_First(
		int userType, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .findByT_O_C_1_First(userType, orgCode1, orderByComparator);
	}

	/**
	* Returns the first user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByT_O_C_1_First(
		int userType, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_O_C_1_First(userType, orgCode1, orderByComparator);
	}

	/**
	* Returns the last user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByT_O_C_1_Last(
		int userType, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .findByT_O_C_1_Last(userType, orgCode1, orderByComparator);
	}

	/**
	* Returns the last user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByT_O_C_1_Last(
		int userType, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_O_C_1_Last(userType, orgCode1, orderByComparator);
	}

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping[] findByT_O_C_1_PrevAndNext(
		long id, int userType, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .findByT_O_C_1_PrevAndNext(id, userType, orgCode1,
			orderByComparator);
	}

	/**
	* Returns all the user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @return the matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByT_O_C_1(
		int userType, java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByT_O_C_1(userType, orgCode1);
	}

	/**
	* Returns a range of all the user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByT_O_C_1(
		int userType, java.lang.String orgCode1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByT_O_C_1(userType, orgCode1, start, end);
	}

	/**
	* Returns an ordered range of all the user mappings that the user has permissions to view where userType = &#63; and orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByT_O_C_1(
		int userType, java.lang.String orgCode1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByT_O_C_1(userType, orgCode1, start, end,
			orderByComparator);
	}

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping[] filterFindByT_O_C_1_PrevAndNext(
		long id, int userType, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .filterFindByT_O_C_1_PrevAndNext(id, userType, orgCode1,
			orderByComparator);
	}

	/**
	* Removes all the user mappings where userType = &#63; and orgCode1 = &#63; from the database.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_O_C_1(int userType, java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_O_C_1(userType, orgCode1);
	}

	/**
	* Returns the number of user mappings where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_O_C_1(int userType, java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_O_C_1(userType, orgCode1);
	}

	/**
	* Returns the number of user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @return the number of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByT_O_C_1(int userType,
		java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByT_O_C_1(userType, orgCode1);
	}

	/**
	* Returns all the user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByT_O_C_2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_O_C_2(userType, orgCode1, orgCode2);
	}

	/**
	* Returns a range of all the user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByT_O_C_2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_O_C_2(userType, orgCode1, orgCode2, start, end);
	}

	/**
	* Returns an ordered range of all the user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByT_O_C_2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_O_C_2(userType, orgCode1, orgCode2, start, end,
			orderByComparator);
	}

	/**
	* Returns the first user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByT_O_C_2_First(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .findByT_O_C_2_First(userType, orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the first user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByT_O_C_2_First(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_O_C_2_First(userType, orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the last user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByT_O_C_2_Last(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .findByT_O_C_2_Last(userType, orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the last user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByT_O_C_2_Last(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_O_C_2_Last(userType, orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping[] findByT_O_C_2_PrevAndNext(
		long id, int userType, java.lang.String orgCode1,
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .findByT_O_C_2_PrevAndNext(id, userType, orgCode1, orgCode2,
			orderByComparator);
	}

	/**
	* Returns all the user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByT_O_C_2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByT_O_C_2(userType, orgCode1, orgCode2);
	}

	/**
	* Returns a range of all the user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByT_O_C_2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByT_O_C_2(userType, orgCode1, orgCode2, start, end);
	}

	/**
	* Returns an ordered range of all the user mappings that the user has permissions to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByT_O_C_2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByT_O_C_2(userType, orgCode1, orgCode2, start,
			end, orderByComparator);
	}

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping[] filterFindByT_O_C_2_PrevAndNext(
		long id, int userType, java.lang.String orgCode1,
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .filterFindByT_O_C_2_PrevAndNext(id, userType, orgCode1,
			orgCode2, orderByComparator);
	}

	/**
	* Removes all the user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63; from the database.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_O_C_2(int userType, java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_O_C_2(userType, orgCode1, orgCode2);
	}

	/**
	* Returns the number of user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_O_C_2(int userType, java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_O_C_2(userType, orgCode1, orgCode2);
	}

	/**
	* Returns the number of user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the number of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByT_O_C_2(int userType,
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByT_O_C_2(userType, orgCode1, orgCode2);
	}

	/**
	* Returns all the user mappings where userType = &#63;.
	*
	* @param userType the user type
	* @return the matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByU_T(
		int userType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_T(userType);
	}

	/**
	* Returns a range of all the user mappings where userType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByU_T(
		int userType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_T(userType, start, end);
	}

	/**
	* Returns an ordered range of all the user mappings where userType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByU_T(
		int userType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_T(userType, start, end, orderByComparator);
	}

	/**
	* Returns the first user mapping in the ordered set where userType = &#63;.
	*
	* @param userType the user type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByU_T_First(
		int userType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence().findByU_T_First(userType, orderByComparator);
	}

	/**
	* Returns the first user mapping in the ordered set where userType = &#63;.
	*
	* @param userType the user type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByU_T_First(
		int userType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_T_First(userType, orderByComparator);
	}

	/**
	* Returns the last user mapping in the ordered set where userType = &#63;.
	*
	* @param userType the user type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByU_T_Last(
		int userType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence().findByU_T_Last(userType, orderByComparator);
	}

	/**
	* Returns the last user mapping in the ordered set where userType = &#63;.
	*
	* @param userType the user type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByU_T_Last(
		int userType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_T_Last(userType, orderByComparator);
	}

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set where userType = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param userType the user type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping[] findByU_T_PrevAndNext(
		long id, int userType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .findByU_T_PrevAndNext(id, userType, orderByComparator);
	}

	/**
	* Returns all the user mappings that the user has permission to view where userType = &#63;.
	*
	* @param userType the user type
	* @return the matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByU_T(
		int userType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByU_T(userType);
	}

	/**
	* Returns a range of all the user mappings that the user has permission to view where userType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByU_T(
		int userType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByU_T(userType, start, end);
	}

	/**
	* Returns an ordered range of all the user mappings that the user has permissions to view where userType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByU_T(
		int userType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByU_T(userType, start, end, orderByComparator);
	}

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where userType = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param userType the user type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping[] filterFindByU_T_PrevAndNext(
		long id, int userType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence()
				   .filterFindByU_T_PrevAndNext(id, userType, orderByComparator);
	}

	/**
	* Removes all the user mappings where userType = &#63; from the database.
	*
	* @param userType the user type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU_T(int userType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU_T(userType);
	}

	/**
	* Returns the number of user mappings where userType = &#63;.
	*
	* @param userType the user type
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU_T(int userType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU_T(userType);
	}

	/**
	* Returns the number of user mappings that the user has permission to view where userType = &#63;.
	*
	* @param userType the user type
	* @return the number of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByU_T(int userType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByU_T(userType);
	}

	/**
	* Returns the user mapping where userId = &#63; or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserMappingException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByU_M(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence().findByU_M(userId);
	}

	/**
	* Returns the user mapping where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByU_M(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_M(userId);
	}

	/**
	* Returns the user mapping where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByU_M(
		long userId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByU_M(userId, retrieveFromCache);
	}

	/**
	* Removes the user mapping where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the user mapping that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping removeByU_M(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence().removeByU_M(userId);
	}

	/**
	* Returns the number of user mappings where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU_M(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU_M(userId);
	}

	/**
	* Caches the user mapping in the entity cache if it is enabled.
	*
	* @param userMapping the user mapping
	*/
	public static void cacheResult(
		vn.dtt.cmon.user.dao.model.UserMapping userMapping) {
		getPersistence().cacheResult(userMapping);
	}

	/**
	* Caches the user mappings in the entity cache if it is enabled.
	*
	* @param userMappings the user mappings
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> userMappings) {
		getPersistence().cacheResult(userMappings);
	}

	/**
	* Creates a new user mapping with the primary key. Does not add the user mapping to the database.
	*
	* @param id the primary key for the new user mapping
	* @return the new user mapping
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user mapping
	* @return the user mapping that was removed
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.cmon.user.dao.model.UserMapping updateImpl(
		vn.dtt.cmon.user.dao.model.UserMapping userMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userMapping);
	}

	/**
	* Returns the user mapping with the primary key or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserMappingException} if it could not be found.
	*
	* @param id the primary key of the user mapping
	* @return the user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the user mapping with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user mapping
	* @return the user mapping, or <code>null</code> if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the user mappings.
	*
	* @return the user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the user mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the user mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the user mappings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user mappings.
	*
	* @return the number of user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserMappingPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserMappingPersistence)PortletBeanLocatorUtil.locate(vn.dtt.cmon.user.dao.service.ClpSerializer.getServletContextName(),
					UserMappingPersistence.class.getName());

			ReferenceRegistry.registerReference(UserMappingUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UserMappingPersistence persistence) {
	}

	private static UserMappingPersistence _persistence;
}