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

package vn.dtt.sol.ns.vesinhmoitruong.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew;

import java.util.List;

/**
 * The persistence utility for the ke hoach ve sinh xa new service. This utility wraps {@link keHoachVeSinhXaNewPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see keHoachVeSinhXaNewPersistence
 * @see keHoachVeSinhXaNewPersistenceImpl
 * @generated
 */
public class keHoachVeSinhXaNewUtil {
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
	public static void clearCache(keHoachVeSinhXaNew keHoachVeSinhXaNew) {
		getPersistence().clearCache(keHoachVeSinhXaNew);
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
	public static List<keHoachVeSinhXaNew> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<keHoachVeSinhXaNew> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<keHoachVeSinhXaNew> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static keHoachVeSinhXaNew update(
		keHoachVeSinhXaNew keHoachVeSinhXaNew) throws SystemException {
		return getPersistence().update(keHoachVeSinhXaNew);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static keHoachVeSinhXaNew update(
		keHoachVeSinhXaNew keHoachVeSinhXaNew, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(keHoachVeSinhXaNew, serviceContext);
	}

	/**
	* Caches the ke hoach ve sinh xa new in the entity cache if it is enabled.
	*
	* @param keHoachVeSinhXaNew the ke hoach ve sinh xa new
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew keHoachVeSinhXaNew) {
		getPersistence().cacheResult(keHoachVeSinhXaNew);
	}

	/**
	* Caches the ke hoach ve sinh xa news in the entity cache if it is enabled.
	*
	* @param keHoachVeSinhXaNews the ke hoach ve sinh xa news
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew> keHoachVeSinhXaNews) {
		getPersistence().cacheResult(keHoachVeSinhXaNews);
	}

	/**
	* Creates a new ke hoach ve sinh xa new with the primary key. Does not add the ke hoach ve sinh xa new to the database.
	*
	* @param id the primary key for the new ke hoach ve sinh xa new
	* @return the new ke hoach ve sinh xa new
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the ke hoach ve sinh xa new with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach ve sinh xa new
	* @return the ke hoach ve sinh xa new that was removed
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException if a ke hoach ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew keHoachVeSinhXaNew)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(keHoachVeSinhXaNew);
	}

	/**
	* Returns the ke hoach ve sinh xa new with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException} if it could not be found.
	*
	* @param id the primary key of the ke hoach ve sinh xa new
	* @return the ke hoach ve sinh xa new
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException if a ke hoach ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchkeHoachVeSinhXaNewException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the ke hoach ve sinh xa new with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ke hoach ve sinh xa new
	* @return the ke hoach ve sinh xa new, or <code>null</code> if a ke hoach ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the ke hoach ve sinh xa news.
	*
	* @return the ke hoach ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ke hoach ve sinh xa news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.keHoachVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach ve sinh xa news
	* @param end the upper bound of the range of ke hoach ve sinh xa news (not inclusive)
	* @return the range of ke hoach ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach ve sinh xa news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.keHoachVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach ve sinh xa news
	* @param end the upper bound of the range of ke hoach ve sinh xa news (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ke hoach ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the ke hoach ve sinh xa news from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ke hoach ve sinh xa news.
	*
	* @return the number of ke hoach ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static keHoachVeSinhXaNewPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (keHoachVeSinhXaNewPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.vesinhmoitruong.dao.service.ClpSerializer.getServletContextName(),
					keHoachVeSinhXaNewPersistence.class.getName());

			ReferenceRegistry.registerReference(keHoachVeSinhXaNewUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(keHoachVeSinhXaNewPersistence persistence) {
	}

	private static keHoachVeSinhXaNewPersistence _persistence;
}