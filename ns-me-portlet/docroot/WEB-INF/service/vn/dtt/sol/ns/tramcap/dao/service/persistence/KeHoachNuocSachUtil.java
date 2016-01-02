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

package vn.dtt.sol.ns.tramcap.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach;

import java.util.List;

/**
 * The persistence utility for the ke hoach nuoc sach service. This utility wraps {@link KeHoachNuocSachPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see KeHoachNuocSachPersistence
 * @see KeHoachNuocSachPersistenceImpl
 * @generated
 */
public class KeHoachNuocSachUtil {
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
	public static void clearCache(KeHoachNuocSach keHoachNuocSach) {
		getPersistence().clearCache(keHoachNuocSach);
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
	public static List<KeHoachNuocSach> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KeHoachNuocSach> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KeHoachNuocSach> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static KeHoachNuocSach update(KeHoachNuocSach keHoachNuocSach)
		throws SystemException {
		return getPersistence().update(keHoachNuocSach);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static KeHoachNuocSach update(KeHoachNuocSach keHoachNuocSach,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(keHoachNuocSach, serviceContext);
	}

	/**
	* Returns all the ke hoach nuoc sachs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> findByT_(
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_(tramCapNuocId);
	}

	/**
	* Returns a range of all the ke hoach nuoc sachs where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of ke hoach nuoc sachs
	* @param end the upper bound of the range of ke hoach nuoc sachs (not inclusive)
	* @return the range of matching ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> findByT_(
		int tramCapNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_(tramCapNuocId, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach nuoc sachs where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of ke hoach nuoc sachs
	* @param end the upper bound of the range of ke hoach nuoc sachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> findByT_(
		int tramCapNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_(tramCapNuocId, start, end, orderByComparator);
	}

	/**
	* Returns the first ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach nuoc sach
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a matching ke hoach nuoc sach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach findByT__First(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException {
		return getPersistence().findByT__First(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the first ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach nuoc sach, or <code>null</code> if a matching ke hoach nuoc sach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach fetchByT__First(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT__First(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the last ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach nuoc sach
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a matching ke hoach nuoc sach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach findByT__Last(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException {
		return getPersistence().findByT__Last(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the last ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach nuoc sach, or <code>null</code> if a matching ke hoach nuoc sach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach fetchByT__Last(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT__Last(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the ke hoach nuoc sachs before and after the current ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	*
	* @param id the primary key of the current ke hoach nuoc sach
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach nuoc sach
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a ke hoach nuoc sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach[] findByT__PrevAndNext(
		long id, int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException {
		return getPersistence()
				   .findByT__PrevAndNext(id, tramCapNuocId, orderByComparator);
	}

	/**
	* Removes all the ke hoach nuoc sachs where tramCapNuocId = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_(tramCapNuocId);
	}

	/**
	* Returns the number of ke hoach nuoc sachs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the number of matching ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_(tramCapNuocId);
	}

	/**
	* Caches the ke hoach nuoc sach in the entity cache if it is enabled.
	*
	* @param keHoachNuocSach the ke hoach nuoc sach
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach keHoachNuocSach) {
		getPersistence().cacheResult(keHoachNuocSach);
	}

	/**
	* Caches the ke hoach nuoc sachs in the entity cache if it is enabled.
	*
	* @param keHoachNuocSachs the ke hoach nuoc sachs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> keHoachNuocSachs) {
		getPersistence().cacheResult(keHoachNuocSachs);
	}

	/**
	* Creates a new ke hoach nuoc sach with the primary key. Does not add the ke hoach nuoc sach to the database.
	*
	* @param id the primary key for the new ke hoach nuoc sach
	* @return the new ke hoach nuoc sach
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the ke hoach nuoc sach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach nuoc sach
	* @return the ke hoach nuoc sach that was removed
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a ke hoach nuoc sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach keHoachNuocSach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(keHoachNuocSach);
	}

	/**
	* Returns the ke hoach nuoc sach with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException} if it could not be found.
	*
	* @param id the primary key of the ke hoach nuoc sach
	* @return the ke hoach nuoc sach
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a ke hoach nuoc sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the ke hoach nuoc sach with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ke hoach nuoc sach
	* @return the ke hoach nuoc sach, or <code>null</code> if a ke hoach nuoc sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the ke hoach nuoc sachs.
	*
	* @return the ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ke hoach nuoc sachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach nuoc sachs
	* @param end the upper bound of the range of ke hoach nuoc sachs (not inclusive)
	* @return the range of ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach nuoc sachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach nuoc sachs
	* @param end the upper bound of the range of ke hoach nuoc sachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the ke hoach nuoc sachs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ke hoach nuoc sachs.
	*
	* @return the number of ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static KeHoachNuocSachPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KeHoachNuocSachPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer.getServletContextName(),
					KeHoachNuocSachPersistence.class.getName());

			ReferenceRegistry.registerReference(KeHoachNuocSachUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(KeHoachNuocSachPersistence persistence) {
	}

	private static KeHoachNuocSachPersistence _persistence;
}