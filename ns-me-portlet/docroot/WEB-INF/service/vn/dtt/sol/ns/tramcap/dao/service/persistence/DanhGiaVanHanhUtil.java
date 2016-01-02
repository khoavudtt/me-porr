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

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh;

import java.util.List;

/**
 * The persistence utility for the danh gia van hanh service. This utility wraps {@link DanhGiaVanHanhPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see DanhGiaVanHanhPersistence
 * @see DanhGiaVanHanhPersistenceImpl
 * @generated
 */
public class DanhGiaVanHanhUtil {
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
	public static void clearCache(DanhGiaVanHanh danhGiaVanHanh) {
		getPersistence().clearCache(danhGiaVanHanh);
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
	public static List<DanhGiaVanHanh> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DanhGiaVanHanh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DanhGiaVanHanh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DanhGiaVanHanh update(DanhGiaVanHanh danhGiaVanHanh)
		throws SystemException {
		return getPersistence().update(danhGiaVanHanh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DanhGiaVanHanh update(DanhGiaVanHanh danhGiaVanHanh,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(danhGiaVanHanh, serviceContext);
	}

	/**
	* Returns all the danh gia van hanhs where nam = &#63;.
	*
	* @param nam the nam
	* @return the matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> findByN_(
		int nam) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByN_(nam);
	}

	/**
	* Returns a range of all the danh gia van hanhs where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of danh gia van hanhs
	* @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	* @return the range of matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> findByN_(
		int nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByN_(nam, start, end);
	}

	/**
	* Returns an ordered range of all the danh gia van hanhs where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of danh gia van hanhs
	* @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> findByN_(
		int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByN_(nam, start, end, orderByComparator);
	}

	/**
	* Returns the first danh gia van hanh in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia van hanh
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh findByN__First(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence().findByN__First(nam, orderByComparator);
	}

	/**
	* Returns the first danh gia van hanh in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh fetchByN__First(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByN__First(nam, orderByComparator);
	}

	/**
	* Returns the last danh gia van hanh in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia van hanh
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh findByN__Last(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence().findByN__Last(nam, orderByComparator);
	}

	/**
	* Returns the last danh gia van hanh in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh fetchByN__Last(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByN__Last(nam, orderByComparator);
	}

	/**
	* Returns the danh gia van hanhs before and after the current danh gia van hanh in the ordered set where nam = &#63;.
	*
	* @param id the primary key of the current danh gia van hanh
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next danh gia van hanh
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a danh gia van hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh[] findByN__PrevAndNext(
		long id, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence().findByN__PrevAndNext(id, nam, orderByComparator);
	}

	/**
	* Removes all the danh gia van hanhs where nam = &#63; from the database.
	*
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByN_(int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByN_(nam);
	}

	/**
	* Returns the number of danh gia van hanhs where nam = &#63;.
	*
	* @param nam the nam
	* @return the number of matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByN_(int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByN_(nam);
	}

	/**
	* Returns the danh gia van hanh where tramCapNuocId = &#63; or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException} if it could not be found.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching danh gia van hanh
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh findByE_BY_T_(
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence().findByE_BY_T_(tramCapNuocId);
	}

	/**
	* Returns the danh gia van hanh where tramCapNuocId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh fetchByE_BY_T_(
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByE_BY_T_(tramCapNuocId);
	}

	/**
	* Returns the danh gia van hanh where tramCapNuocId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh fetchByE_BY_T_(
		int tramCapNuocId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByE_BY_T_(tramCapNuocId, retrieveFromCache);
	}

	/**
	* Removes the danh gia van hanh where tramCapNuocId = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the danh gia van hanh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh removeByE_BY_T_(
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence().removeByE_BY_T_(tramCapNuocId);
	}

	/**
	* Returns the number of danh gia van hanhs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the number of matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByE_BY_T_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByE_BY_T_(tramCapNuocId);
	}

	/**
	* Returns all the danh gia van hanhs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> findByT_(
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_(tramCapNuocId);
	}

	/**
	* Returns a range of all the danh gia van hanhs where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of danh gia van hanhs
	* @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	* @return the range of matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> findByT_(
		int tramCapNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_(tramCapNuocId, start, end);
	}

	/**
	* Returns an ordered range of all the danh gia van hanhs where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of danh gia van hanhs
	* @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> findByT_(
		int tramCapNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_(tramCapNuocId, start, end, orderByComparator);
	}

	/**
	* Returns the first danh gia van hanh in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia van hanh
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh findByT__First(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence().findByT__First(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the first danh gia van hanh in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh fetchByT__First(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT__First(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the last danh gia van hanh in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia van hanh
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh findByT__Last(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence().findByT__Last(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the last danh gia van hanh in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh fetchByT__Last(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT__Last(tramCapNuocId, orderByComparator);
	}

	/**
	* Returns the danh gia van hanhs before and after the current danh gia van hanh in the ordered set where tramCapNuocId = &#63;.
	*
	* @param id the primary key of the current danh gia van hanh
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next danh gia van hanh
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a danh gia van hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh[] findByT__PrevAndNext(
		long id, int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence()
				   .findByT__PrevAndNext(id, tramCapNuocId, orderByComparator);
	}

	/**
	* Removes all the danh gia van hanhs where tramCapNuocId = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_(tramCapNuocId);
	}

	/**
	* Returns the number of danh gia van hanhs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the number of matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_(tramCapNuocId);
	}

	/**
	* Returns all the danh gia van hanhs where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @return the matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> findByT_N(
		int tramCapNuocId, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_N(tramCapNuocId, nam);
	}

	/**
	* Returns a range of all the danh gia van hanhs where tramCapNuocId = &#63; and nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param start the lower bound of the range of danh gia van hanhs
	* @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	* @return the range of matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> findByT_N(
		int tramCapNuocId, int nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_N(tramCapNuocId, nam, start, end);
	}

	/**
	* Returns an ordered range of all the danh gia van hanhs where tramCapNuocId = &#63; and nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param start the lower bound of the range of danh gia van hanhs
	* @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> findByT_N(
		int tramCapNuocId, int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_N(tramCapNuocId, nam, start, end, orderByComparator);
	}

	/**
	* Returns the first danh gia van hanh in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia van hanh
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh findByT_N_First(
		int tramCapNuocId, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence()
				   .findByT_N_First(tramCapNuocId, nam, orderByComparator);
	}

	/**
	* Returns the first danh gia van hanh in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh fetchByT_N_First(
		int tramCapNuocId, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_N_First(tramCapNuocId, nam, orderByComparator);
	}

	/**
	* Returns the last danh gia van hanh in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia van hanh
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh findByT_N_Last(
		int tramCapNuocId, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence()
				   .findByT_N_Last(tramCapNuocId, nam, orderByComparator);
	}

	/**
	* Returns the last danh gia van hanh in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh fetchByT_N_Last(
		int tramCapNuocId, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_N_Last(tramCapNuocId, nam, orderByComparator);
	}

	/**
	* Returns the danh gia van hanhs before and after the current danh gia van hanh in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param id the primary key of the current danh gia van hanh
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next danh gia van hanh
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a danh gia van hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh[] findByT_N_PrevAndNext(
		long id, int tramCapNuocId, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence()
				   .findByT_N_PrevAndNext(id, tramCapNuocId, nam,
			orderByComparator);
	}

	/**
	* Removes all the danh gia van hanhs where tramCapNuocId = &#63; and nam = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_N(int tramCapNuocId, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_N(tramCapNuocId, nam);
	}

	/**
	* Returns the number of danh gia van hanhs where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @return the number of matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_N(int tramCapNuocId, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_N(tramCapNuocId, nam);
	}

	/**
	* Returns the danh gia van hanh where tramCapNuocId = &#63; and thang = &#63; and nam = &#63; or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException} if it could not be found.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param thang the thang
	* @param nam the nam
	* @return the matching danh gia van hanh
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh findByT_T_N(
		int tramCapNuocId, int thang, int nam)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence().findByT_T_N(tramCapNuocId, thang, nam);
	}

	/**
	* Returns the danh gia van hanh where tramCapNuocId = &#63; and thang = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param thang the thang
	* @param nam the nam
	* @return the matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh fetchByT_T_N(
		int tramCapNuocId, int thang, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT_T_N(tramCapNuocId, thang, nam);
	}

	/**
	* Returns the danh gia van hanh where tramCapNuocId = &#63; and thang = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param thang the thang
	* @param nam the nam
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh fetchByT_T_N(
		int tramCapNuocId, int thang, int nam, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_T_N(tramCapNuocId, thang, nam, retrieveFromCache);
	}

	/**
	* Removes the danh gia van hanh where tramCapNuocId = &#63; and thang = &#63; and nam = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param thang the thang
	* @param nam the nam
	* @return the danh gia van hanh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh removeByT_T_N(
		int tramCapNuocId, int thang, int nam)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence().removeByT_T_N(tramCapNuocId, thang, nam);
	}

	/**
	* Returns the number of danh gia van hanhs where tramCapNuocId = &#63; and thang = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param thang the thang
	* @param nam the nam
	* @return the number of matching danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_T_N(int tramCapNuocId, int thang, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_T_N(tramCapNuocId, thang, nam);
	}

	/**
	* Caches the danh gia van hanh in the entity cache if it is enabled.
	*
	* @param danhGiaVanHanh the danh gia van hanh
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh danhGiaVanHanh) {
		getPersistence().cacheResult(danhGiaVanHanh);
	}

	/**
	* Caches the danh gia van hanhs in the entity cache if it is enabled.
	*
	* @param danhGiaVanHanhs the danh gia van hanhs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> danhGiaVanHanhs) {
		getPersistence().cacheResult(danhGiaVanHanhs);
	}

	/**
	* Creates a new danh gia van hanh with the primary key. Does not add the danh gia van hanh to the database.
	*
	* @param id the primary key for the new danh gia van hanh
	* @return the new danh gia van hanh
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the danh gia van hanh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the danh gia van hanh
	* @return the danh gia van hanh that was removed
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a danh gia van hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh danhGiaVanHanh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(danhGiaVanHanh);
	}

	/**
	* Returns the danh gia van hanh with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException} if it could not be found.
	*
	* @param id the primary key of the danh gia van hanh
	* @return the danh gia van hanh
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a danh gia van hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the danh gia van hanh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the danh gia van hanh
	* @return the danh gia van hanh, or <code>null</code> if a danh gia van hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the danh gia van hanhs.
	*
	* @return the danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the danh gia van hanhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia van hanhs
	* @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	* @return the range of danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the danh gia van hanhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia van hanhs
	* @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the danh gia van hanhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of danh gia van hanhs.
	*
	* @return the number of danh gia van hanhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DanhGiaVanHanhPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DanhGiaVanHanhPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer.getServletContextName(),
					DanhGiaVanHanhPersistence.class.getName());

			ReferenceRegistry.registerReference(DanhGiaVanHanhUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DanhGiaVanHanhPersistence persistence) {
	}

	private static DanhGiaVanHanhPersistence _persistence;
}