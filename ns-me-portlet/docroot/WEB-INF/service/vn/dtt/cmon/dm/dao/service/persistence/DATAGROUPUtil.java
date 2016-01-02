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

import vn.dtt.cmon.dm.dao.model.DATAGROUP;

import java.util.List;

/**
 * The persistence utility for the d a t a g r o u p service. This utility wraps {@link DATAGROUPPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see DATAGROUPPersistence
 * @see DATAGROUPPersistenceImpl
 * @generated
 */
public class DATAGROUPUtil {
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
	public static void clearCache(DATAGROUP datagroup) {
		getPersistence().clearCache(datagroup);
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
	public static List<DATAGROUP> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DATAGROUP> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DATAGROUP> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DATAGROUP update(DATAGROUP datagroup)
		throws SystemException {
		return getPersistence().update(datagroup);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DATAGROUP update(DATAGROUP datagroup,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(datagroup, serviceContext);
	}

	/**
	* Caches the d a t a g r o u p in the entity cache if it is enabled.
	*
	* @param datagroup the d a t a g r o u p
	*/
	public static void cacheResult(vn.dtt.cmon.dm.dao.model.DATAGROUP datagroup) {
		getPersistence().cacheResult(datagroup);
	}

	/**
	* Caches the d a t a g r o u ps in the entity cache if it is enabled.
	*
	* @param datagroups the d a t a g r o u ps
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> datagroups) {
		getPersistence().cacheResult(datagroups);
	}

	/**
	* Creates a new d a t a g r o u p with the primary key. Does not add the d a t a g r o u p to the database.
	*
	* @param id the primary key for the new d a t a g r o u p
	* @return the new d a t a g r o u p
	*/
	public static vn.dtt.cmon.dm.dao.model.DATAGROUP create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the d a t a g r o u p with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the d a t a g r o u p
	* @return the d a t a g r o u p that was removed
	* @throws vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException if a d a t a g r o u p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.DATAGROUP remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.cmon.dm.dao.model.DATAGROUP updateImpl(
		vn.dtt.cmon.dm.dao.model.DATAGROUP datagroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(datagroup);
	}

	/**
	* Returns the d a t a g r o u p with the primary key or throws a {@link vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException} if it could not be found.
	*
	* @param id the primary key of the d a t a g r o u p
	* @return the d a t a g r o u p
	* @throws vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException if a d a t a g r o u p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.DATAGROUP findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the d a t a g r o u p with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the d a t a g r o u p
	* @return the d a t a g r o u p, or <code>null</code> if a d a t a g r o u p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.dm.dao.model.DATAGROUP fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the d a t a g r o u ps.
	*
	* @return the d a t a g r o u ps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the d a t a g r o u ps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of d a t a g r o u ps
	* @param end the upper bound of the range of d a t a g r o u ps (not inclusive)
	* @return the range of d a t a g r o u ps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the d a t a g r o u ps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of d a t a g r o u ps
	* @param end the upper bound of the range of d a t a g r o u ps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of d a t a g r o u ps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the d a t a g r o u ps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of d a t a g r o u ps.
	*
	* @return the number of d a t a g r o u ps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DATAGROUPPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DATAGROUPPersistence)PortletBeanLocatorUtil.locate(vn.dtt.cmon.dm.dao.service.ClpSerializer.getServletContextName(),
					DATAGROUPPersistence.class.getName());

			ReferenceRegistry.registerReference(DATAGROUPUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DATAGROUPPersistence persistence) {
	}

	private static DATAGROUPPersistence _persistence;
}