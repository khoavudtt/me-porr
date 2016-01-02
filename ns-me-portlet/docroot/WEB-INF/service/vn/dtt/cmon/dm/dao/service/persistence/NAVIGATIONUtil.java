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

package vn.dtt.cmon.dm.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.cmon.dm.dao.model.NAVIGATION;

import java.util.List;

/**
 * The persistence utility for the n a v i g a t i o n service. This utility wraps {@link NAVIGATIONPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see NAVIGATIONPersistence
 * @see NAVIGATIONPersistenceImpl
 * @generated
 */
public class NAVIGATIONUtil {
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
	public static void clearCache(NAVIGATION navigation) {
		getPersistence().clearCache(navigation);
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
	public static List<NAVIGATION> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NAVIGATION> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NAVIGATION> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static NAVIGATION update(NAVIGATION navigation)
		throws SystemException {
		return getPersistence().update(navigation);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static NAVIGATION update(NAVIGATION navigation,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(navigation, serviceContext);
	}

	/**
	* Returns all the n a v i g a t i o ns where parentId = &#63; and hidden = &#63;.
	*
	* @param parentId the parent ID
	* @param hidden the hidden
	* @return the matching n a v i g a t i o ns
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.dm.dao.model.NAVIGATION> findByPARENTID(
		long parentId, long hidden)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPARENTID(parentId, hidden);
	}

	/**
	* Returns a range of all the n a v i g a t i o ns where parentId = &#63; and hidden = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parentId the parent ID
	* @param hidden the hidden
	* @param start the lower bound of the range of n a v i g a t i o ns
	* @param end the upper bound of the range of n a v i g a t i o ns (not inclusive)
	* @return the range of matching n a v i g a t i o ns
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.dm.dao.model.NAVIGATION> findByPARENTID(
		long parentId, long hidden, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPARENTID(parentId, hidden, start, end);
	}

	/**
	* Returns an ordered range of all the n a v i g a t i o ns where parentId = &#63; and hidden = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parentId the parent ID
	* @param hidden the hidden
	* @param start the lower bound of the range of n a v i g a t i o ns
	* @param end the upper bound of the range of n a v i g a t i o ns (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching n a v i g a t i o ns
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.dm.dao.model.NAVIGATION> findByPARENTID(
		long parentId, long hidden, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPARENTID(parentId, hidden, start, end,
			orderByComparator);
	}

	/**
	* Returns the first n a v i g a t i o n in the ordered set where parentId = &#63; and hidden = &#63;.
	*
	* @param parentId the parent ID
	* @param hidden the hidden
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n a v i g a t i o n
	* @throws vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException if a matching n a v i g a t i o n could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.NAVIGATION findByPARENTID_First(
		long parentId, long hidden,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException {
		return getPersistence()
				   .findByPARENTID_First(parentId, hidden, orderByComparator);
	}

	/**
	* Returns the first n a v i g a t i o n in the ordered set where parentId = &#63; and hidden = &#63;.
	*
	* @param parentId the parent ID
	* @param hidden the hidden
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching n a v i g a t i o n, or <code>null</code> if a matching n a v i g a t i o n could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.NAVIGATION fetchByPARENTID_First(
		long parentId, long hidden,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPARENTID_First(parentId, hidden, orderByComparator);
	}

	/**
	* Returns the last n a v i g a t i o n in the ordered set where parentId = &#63; and hidden = &#63;.
	*
	* @param parentId the parent ID
	* @param hidden the hidden
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n a v i g a t i o n
	* @throws vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException if a matching n a v i g a t i o n could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.NAVIGATION findByPARENTID_Last(
		long parentId, long hidden,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException {
		return getPersistence()
				   .findByPARENTID_Last(parentId, hidden, orderByComparator);
	}

	/**
	* Returns the last n a v i g a t i o n in the ordered set where parentId = &#63; and hidden = &#63;.
	*
	* @param parentId the parent ID
	* @param hidden the hidden
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching n a v i g a t i o n, or <code>null</code> if a matching n a v i g a t i o n could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.NAVIGATION fetchByPARENTID_Last(
		long parentId, long hidden,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPARENTID_Last(parentId, hidden, orderByComparator);
	}

	/**
	* Returns the n a v i g a t i o ns before and after the current n a v i g a t i o n in the ordered set where parentId = &#63; and hidden = &#63;.
	*
	* @param id the primary key of the current n a v i g a t i o n
	* @param parentId the parent ID
	* @param hidden the hidden
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next n a v i g a t i o n
	* @throws vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException if a n a v i g a t i o n with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.NAVIGATION[] findByPARENTID_PrevAndNext(
		long id, long parentId, long hidden,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException {
		return getPersistence()
				   .findByPARENTID_PrevAndNext(id, parentId, hidden,
			orderByComparator);
	}

	/**
	* Removes all the n a v i g a t i o ns where parentId = &#63; and hidden = &#63; from the database.
	*
	* @param parentId the parent ID
	* @param hidden the hidden
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPARENTID(long parentId, long hidden)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPARENTID(parentId, hidden);
	}

	/**
	* Returns the number of n a v i g a t i o ns where parentId = &#63; and hidden = &#63;.
	*
	* @param parentId the parent ID
	* @param hidden the hidden
	* @return the number of matching n a v i g a t i o ns
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPARENTID(long parentId, long hidden)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPARENTID(parentId, hidden);
	}

	/**
	* Caches the n a v i g a t i o n in the entity cache if it is enabled.
	*
	* @param navigation the n a v i g a t i o n
	*/
	public static void cacheResult(
		vn.dtt.cmon.dm.dao.model.NAVIGATION navigation) {
		getPersistence().cacheResult(navigation);
	}

	/**
	* Caches the n a v i g a t i o ns in the entity cache if it is enabled.
	*
	* @param navigations the n a v i g a t i o ns
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.cmon.dm.dao.model.NAVIGATION> navigations) {
		getPersistence().cacheResult(navigations);
	}

	/**
	* Creates a new n a v i g a t i o n with the primary key. Does not add the n a v i g a t i o n to the database.
	*
	* @param id the primary key for the new n a v i g a t i o n
	* @return the new n a v i g a t i o n
	*/
	public static vn.dtt.cmon.dm.dao.model.NAVIGATION create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the n a v i g a t i o n with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the n a v i g a t i o n
	* @return the n a v i g a t i o n that was removed
	* @throws vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException if a n a v i g a t i o n with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.NAVIGATION remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.cmon.dm.dao.model.NAVIGATION updateImpl(
		vn.dtt.cmon.dm.dao.model.NAVIGATION navigation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(navigation);
	}

	/**
	* Returns the n a v i g a t i o n with the primary key or throws a {@link vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException} if it could not be found.
	*
	* @param id the primary key of the n a v i g a t i o n
	* @return the n a v i g a t i o n
	* @throws vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException if a n a v i g a t i o n with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.NAVIGATION findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the n a v i g a t i o n with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the n a v i g a t i o n
	* @return the n a v i g a t i o n, or <code>null</code> if a n a v i g a t i o n with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.NAVIGATION fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the n a v i g a t i o ns.
	*
	* @return the n a v i g a t i o ns
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.dm.dao.model.NAVIGATION> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the n a v i g a t i o ns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of n a v i g a t i o ns
	* @param end the upper bound of the range of n a v i g a t i o ns (not inclusive)
	* @return the range of n a v i g a t i o ns
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.dm.dao.model.NAVIGATION> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the n a v i g a t i o ns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of n a v i g a t i o ns
	* @param end the upper bound of the range of n a v i g a t i o ns (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of n a v i g a t i o ns
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.dm.dao.model.NAVIGATION> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the n a v i g a t i o ns from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of n a v i g a t i o ns.
	*
	* @return the number of n a v i g a t i o ns
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static NAVIGATIONPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (NAVIGATIONPersistence)PortletBeanLocatorUtil.locate(vn.dtt.cmon.dm.dao.service.ClpSerializer.getServletContextName(),
					NAVIGATIONPersistence.class.getName());

			ReferenceRegistry.registerReference(NAVIGATIONUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(NAVIGATIONPersistence persistence) {
	}

	private static NAVIGATIONPersistence _persistence;
}