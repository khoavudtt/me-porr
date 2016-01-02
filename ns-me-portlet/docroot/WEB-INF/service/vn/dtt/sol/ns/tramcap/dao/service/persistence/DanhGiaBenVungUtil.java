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

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung;

import java.util.List;

/**
 * The persistence utility for the danh gia ben vung service. This utility wraps {@link DanhGiaBenVungPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see DanhGiaBenVungPersistence
 * @see DanhGiaBenVungPersistenceImpl
 * @generated
 */
public class DanhGiaBenVungUtil {
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
	public static void clearCache(DanhGiaBenVung danhGiaBenVung) {
		getPersistence().clearCache(danhGiaBenVung);
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
	public static List<DanhGiaBenVung> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DanhGiaBenVung> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DanhGiaBenVung> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DanhGiaBenVung update(DanhGiaBenVung danhGiaBenVung)
		throws SystemException {
		return getPersistence().update(danhGiaBenVung);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DanhGiaBenVung update(DanhGiaBenVung danhGiaBenVung,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(danhGiaBenVung, serviceContext);
	}

	/**
	* Returns the danh gia ben vung where nam = &#63; and tramCapNuocId = &#63; or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException} if it could not be found.
	*
	* @param nam the nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching danh gia ben vung
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung findByN_(
		int nam, int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException {
		return getPersistence().findByN_(nam, tramCapNuocId);
	}

	/**
	* Returns the danh gia ben vung where nam = &#63; and tramCapNuocId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param nam the nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching danh gia ben vung, or <code>null</code> if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung fetchByN_(
		int nam, int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByN_(nam, tramCapNuocId);
	}

	/**
	* Returns the danh gia ben vung where nam = &#63; and tramCapNuocId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param nam the nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching danh gia ben vung, or <code>null</code> if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung fetchByN_(
		int nam, int tramCapNuocId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByN_(nam, tramCapNuocId, retrieveFromCache);
	}

	/**
	* Removes the danh gia ben vung where nam = &#63; and tramCapNuocId = &#63; from the database.
	*
	* @param nam the nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the danh gia ben vung that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung removeByN_(
		int nam, int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException {
		return getPersistence().removeByN_(nam, tramCapNuocId);
	}

	/**
	* Returns the number of danh gia ben vungs where nam = &#63; and tramCapNuocId = &#63;.
	*
	* @param nam the nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the number of matching danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByN_(int nam, int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByN_(nam, tramCapNuocId);
	}

	/**
	* Returns all the danh gia ben vungs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findByT_(
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_(tramCapNuocId);
	}

	/**
	* Returns a range of all the danh gia ben vungs where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of danh gia ben vungs
	* @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	* @return the range of matching danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findByT_(
		int tramCapNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_(tramCapNuocId, start, end);
	}

	/**
	* Returns an ordered range of all the danh gia ben vungs where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of danh gia ben vungs
	* @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findByT_(
		int tramCapNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_(tramCapNuocId, start, end, orderByComparator);
	}

	/**
	* Returns the first danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia ben vung
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung findByT__First(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException {
		return getPersistence().findByT__First(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the first danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia ben vung, or <code>null</code> if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung fetchByT__First(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT__First(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the last danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia ben vung
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung findByT__Last(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException {
		return getPersistence().findByT__Last(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the last danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia ben vung, or <code>null</code> if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung fetchByT__Last(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT__Last(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the danh gia ben vungs before and after the current danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	*
	* @param id the primary key of the current danh gia ben vung
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next danh gia ben vung
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a danh gia ben vung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung[] findByT__PrevAndNext(
		long id, int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException {
		return getPersistence()
				   .findByT__PrevAndNext(id, tramCapNuocId, orderByComparator);
	}

	/**
	* Removes all the danh gia ben vungs where tramCapNuocId = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_(tramCapNuocId);
	}

	/**
	* Returns the number of danh gia ben vungs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the number of matching danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_(tramCapNuocId);
	}

	/**
	* Caches the danh gia ben vung in the entity cache if it is enabled.
	*
	* @param danhGiaBenVung the danh gia ben vung
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung danhGiaBenVung) {
		getPersistence().cacheResult(danhGiaBenVung);
	}

	/**
	* Caches the danh gia ben vungs in the entity cache if it is enabled.
	*
	* @param danhGiaBenVungs the danh gia ben vungs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> danhGiaBenVungs) {
		getPersistence().cacheResult(danhGiaBenVungs);
	}

	/**
	* Creates a new danh gia ben vung with the primary key. Does not add the danh gia ben vung to the database.
	*
	* @param id the primary key for the new danh gia ben vung
	* @return the new danh gia ben vung
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the danh gia ben vung with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the danh gia ben vung
	* @return the danh gia ben vung that was removed
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a danh gia ben vung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung danhGiaBenVung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(danhGiaBenVung);
	}

	/**
	* Returns the danh gia ben vung with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException} if it could not be found.
	*
	* @param id the primary key of the danh gia ben vung
	* @return the danh gia ben vung
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a danh gia ben vung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the danh gia ben vung with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the danh gia ben vung
	* @return the danh gia ben vung, or <code>null</code> if a danh gia ben vung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the danh gia ben vungs.
	*
	* @return the danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the danh gia ben vungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia ben vungs
	* @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	* @return the range of danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the danh gia ben vungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia ben vungs
	* @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the danh gia ben vungs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of danh gia ben vungs.
	*
	* @return the number of danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DanhGiaBenVungPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DanhGiaBenVungPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer.getServletContextName(),
					DanhGiaBenVungPersistence.class.getName());

			ReferenceRegistry.registerReference(DanhGiaBenVungUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DanhGiaBenVungPersistence persistence) {
	}

	private static DanhGiaBenVungPersistence _persistence;
}