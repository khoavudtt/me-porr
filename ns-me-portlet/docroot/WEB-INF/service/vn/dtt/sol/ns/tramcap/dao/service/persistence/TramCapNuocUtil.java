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

import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;

import java.util.List;

/**
 * The persistence utility for the tram cap nuoc service. This utility wraps {@link TramCapNuocPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see TramCapNuocPersistence
 * @see TramCapNuocPersistenceImpl
 * @generated
 */
public class TramCapNuocUtil {
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
	public static void clearCache(TramCapNuoc tramCapNuoc) {
		getPersistence().clearCache(tramCapNuoc);
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
	public static List<TramCapNuoc> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TramCapNuoc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TramCapNuoc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TramCapNuoc update(TramCapNuoc tramCapNuoc)
		throws SystemException {
		return getPersistence().update(tramCapNuoc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TramCapNuoc update(TramCapNuoc tramCapNuoc,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tramCapNuoc, serviceContext);
	}

	/**
	* Returns all the tram cap nuocs where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findByT_(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_(maTinh);
	}

	/**
	* Returns a range of all the tram cap nuocs where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @return the range of matching tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findByT_(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_(maTinh, start, end);
	}

	/**
	* Returns an ordered range of all the tram cap nuocs where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findByT_(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_(maTinh, start, end, orderByComparator);
	}

	/**
	* Returns the first tram cap nuoc in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a matching tram cap nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc findByT__First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence().findByT__First(maTinh, orderByComparator);
	}

	/**
	* Returns the first tram cap nuoc in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tram cap nuoc, or <code>null</code> if a matching tram cap nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc fetchByT__First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT__First(maTinh, orderByComparator);
	}

	/**
	* Returns the last tram cap nuoc in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a matching tram cap nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc findByT__Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence().findByT__Last(maTinh, orderByComparator);
	}

	/**
	* Returns the last tram cap nuoc in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tram cap nuoc, or <code>null</code> if a matching tram cap nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc fetchByT__Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT__Last(maTinh, orderByComparator);
	}

	/**
	* Returns the tram cap nuocs before and after the current tram cap nuoc in the ordered set where maTinh = &#63;.
	*
	* @param id the primary key of the current tram cap nuoc
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc[] findByT__PrevAndNext(
		long id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence()
				   .findByT__PrevAndNext(id, maTinh, orderByComparator);
	}

	/**
	* Returns all the tram cap nuocs that the user has permission to view where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching tram cap nuocs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> filterFindByT_(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByT_(maTinh);
	}

	/**
	* Returns a range of all the tram cap nuocs that the user has permission to view where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @return the range of matching tram cap nuocs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> filterFindByT_(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByT_(maTinh, start, end);
	}

	/**
	* Returns an ordered range of all the tram cap nuocs that the user has permissions to view where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tram cap nuocs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> filterFindByT_(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByT_(maTinh, start, end, orderByComparator);
	}

	/**
	* Returns the tram cap nuocs before and after the current tram cap nuoc in the ordered set of tram cap nuocs that the user has permission to view where maTinh = &#63;.
	*
	* @param id the primary key of the current tram cap nuoc
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc[] filterFindByT__PrevAndNext(
		long id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence()
				   .filterFindByT__PrevAndNext(id, maTinh, orderByComparator);
	}

	/**
	* Removes all the tram cap nuocs where maTinh = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_(maTinh);
	}

	/**
	* Returns the number of tram cap nuocs where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_(maTinh);
	}

	/**
	* Returns the number of tram cap nuocs that the user has permission to view where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching tram cap nuocs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByT_(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByT_(maTinh);
	}

	/**
	* Returns all the tram cap nuocs where tenTram = &#63;.
	*
	* @param tenTram the ten tram
	* @return the matching tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findByT_TENTRAM(
		java.lang.String tenTram)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_TENTRAM(tenTram);
	}

	/**
	* Returns a range of all the tram cap nuocs where tenTram = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenTram the ten tram
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @return the range of matching tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findByT_TENTRAM(
		java.lang.String tenTram, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_TENTRAM(tenTram, start, end);
	}

	/**
	* Returns an ordered range of all the tram cap nuocs where tenTram = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenTram the ten tram
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findByT_TENTRAM(
		java.lang.String tenTram, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_TENTRAM(tenTram, start, end, orderByComparator);
	}

	/**
	* Returns the first tram cap nuoc in the ordered set where tenTram = &#63;.
	*
	* @param tenTram the ten tram
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a matching tram cap nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc findByT_TENTRAM_First(
		java.lang.String tenTram,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence().findByT_TENTRAM_First(tenTram, orderByComparator);
	}

	/**
	* Returns the first tram cap nuoc in the ordered set where tenTram = &#63;.
	*
	* @param tenTram the ten tram
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tram cap nuoc, or <code>null</code> if a matching tram cap nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc fetchByT_TENTRAM_First(
		java.lang.String tenTram,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_TENTRAM_First(tenTram, orderByComparator);
	}

	/**
	* Returns the last tram cap nuoc in the ordered set where tenTram = &#63;.
	*
	* @param tenTram the ten tram
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a matching tram cap nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc findByT_TENTRAM_Last(
		java.lang.String tenTram,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence().findByT_TENTRAM_Last(tenTram, orderByComparator);
	}

	/**
	* Returns the last tram cap nuoc in the ordered set where tenTram = &#63;.
	*
	* @param tenTram the ten tram
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tram cap nuoc, or <code>null</code> if a matching tram cap nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc fetchByT_TENTRAM_Last(
		java.lang.String tenTram,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT_TENTRAM_Last(tenTram, orderByComparator);
	}

	/**
	* Returns the tram cap nuocs before and after the current tram cap nuoc in the ordered set where tenTram = &#63;.
	*
	* @param id the primary key of the current tram cap nuoc
	* @param tenTram the ten tram
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc[] findByT_TENTRAM_PrevAndNext(
		long id, java.lang.String tenTram,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence()
				   .findByT_TENTRAM_PrevAndNext(id, tenTram, orderByComparator);
	}

	/**
	* Returns all the tram cap nuocs that the user has permission to view where tenTram = &#63;.
	*
	* @param tenTram the ten tram
	* @return the matching tram cap nuocs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> filterFindByT_TENTRAM(
		java.lang.String tenTram)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByT_TENTRAM(tenTram);
	}

	/**
	* Returns a range of all the tram cap nuocs that the user has permission to view where tenTram = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenTram the ten tram
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @return the range of matching tram cap nuocs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> filterFindByT_TENTRAM(
		java.lang.String tenTram, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByT_TENTRAM(tenTram, start, end);
	}

	/**
	* Returns an ordered range of all the tram cap nuocs that the user has permissions to view where tenTram = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenTram the ten tram
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tram cap nuocs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> filterFindByT_TENTRAM(
		java.lang.String tenTram, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByT_TENTRAM(tenTram, start, end, orderByComparator);
	}

	/**
	* Returns the tram cap nuocs before and after the current tram cap nuoc in the ordered set of tram cap nuocs that the user has permission to view where tenTram = &#63;.
	*
	* @param id the primary key of the current tram cap nuoc
	* @param tenTram the ten tram
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc[] filterFindByT_TENTRAM_PrevAndNext(
		long id, java.lang.String tenTram,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence()
				   .filterFindByT_TENTRAM_PrevAndNext(id, tenTram,
			orderByComparator);
	}

	/**
	* Removes all the tram cap nuocs where tenTram = &#63; from the database.
	*
	* @param tenTram the ten tram
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_TENTRAM(java.lang.String tenTram)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_TENTRAM(tenTram);
	}

	/**
	* Returns the number of tram cap nuocs where tenTram = &#63;.
	*
	* @param tenTram the ten tram
	* @return the number of matching tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_TENTRAM(java.lang.String tenTram)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_TENTRAM(tenTram);
	}

	/**
	* Returns the number of tram cap nuocs that the user has permission to view where tenTram = &#63;.
	*
	* @param tenTram the ten tram
	* @return the number of matching tram cap nuocs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByT_TENTRAM(java.lang.String tenTram)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByT_TENTRAM(tenTram);
	}

	/**
	* Returns all the tram cap nuocs where tenTram = &#63; and maTinh = &#63;.
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @return the matching tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findByT_TENTRAM_TINH(
		java.lang.String tenTram, java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_TENTRAM_TINH(tenTram, maTinh);
	}

	/**
	* Returns a range of all the tram cap nuocs where tenTram = &#63; and maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @return the range of matching tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findByT_TENTRAM_TINH(
		java.lang.String tenTram, java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_TENTRAM_TINH(tenTram, maTinh, start, end);
	}

	/**
	* Returns an ordered range of all the tram cap nuocs where tenTram = &#63; and maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findByT_TENTRAM_TINH(
		java.lang.String tenTram, java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_TENTRAM_TINH(tenTram, maTinh, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tram cap nuoc in the ordered set where tenTram = &#63; and maTinh = &#63;.
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a matching tram cap nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc findByT_TENTRAM_TINH_First(
		java.lang.String tenTram, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence()
				   .findByT_TENTRAM_TINH_First(tenTram, maTinh,
			orderByComparator);
	}

	/**
	* Returns the first tram cap nuoc in the ordered set where tenTram = &#63; and maTinh = &#63;.
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tram cap nuoc, or <code>null</code> if a matching tram cap nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc fetchByT_TENTRAM_TINH_First(
		java.lang.String tenTram, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_TENTRAM_TINH_First(tenTram, maTinh,
			orderByComparator);
	}

	/**
	* Returns the last tram cap nuoc in the ordered set where tenTram = &#63; and maTinh = &#63;.
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a matching tram cap nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc findByT_TENTRAM_TINH_Last(
		java.lang.String tenTram, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence()
				   .findByT_TENTRAM_TINH_Last(tenTram, maTinh, orderByComparator);
	}

	/**
	* Returns the last tram cap nuoc in the ordered set where tenTram = &#63; and maTinh = &#63;.
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tram cap nuoc, or <code>null</code> if a matching tram cap nuoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc fetchByT_TENTRAM_TINH_Last(
		java.lang.String tenTram, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_TENTRAM_TINH_Last(tenTram, maTinh,
			orderByComparator);
	}

	/**
	* Returns the tram cap nuocs before and after the current tram cap nuoc in the ordered set where tenTram = &#63; and maTinh = &#63;.
	*
	* @param id the primary key of the current tram cap nuoc
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc[] findByT_TENTRAM_TINH_PrevAndNext(
		long id, java.lang.String tenTram, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence()
				   .findByT_TENTRAM_TINH_PrevAndNext(id, tenTram, maTinh,
			orderByComparator);
	}

	/**
	* Returns all the tram cap nuocs that the user has permission to view where tenTram = &#63; and maTinh = &#63;.
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @return the matching tram cap nuocs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> filterFindByT_TENTRAM_TINH(
		java.lang.String tenTram, java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByT_TENTRAM_TINH(tenTram, maTinh);
	}

	/**
	* Returns a range of all the tram cap nuocs that the user has permission to view where tenTram = &#63; and maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @return the range of matching tram cap nuocs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> filterFindByT_TENTRAM_TINH(
		java.lang.String tenTram, java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByT_TENTRAM_TINH(tenTram, maTinh, start, end);
	}

	/**
	* Returns an ordered range of all the tram cap nuocs that the user has permissions to view where tenTram = &#63; and maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tram cap nuocs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> filterFindByT_TENTRAM_TINH(
		java.lang.String tenTram, java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByT_TENTRAM_TINH(tenTram, maTinh, start, end,
			orderByComparator);
	}

	/**
	* Returns the tram cap nuocs before and after the current tram cap nuoc in the ordered set of tram cap nuocs that the user has permission to view where tenTram = &#63; and maTinh = &#63;.
	*
	* @param id the primary key of the current tram cap nuoc
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc[] filterFindByT_TENTRAM_TINH_PrevAndNext(
		long id, java.lang.String tenTram, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence()
				   .filterFindByT_TENTRAM_TINH_PrevAndNext(id, tenTram, maTinh,
			orderByComparator);
	}

	/**
	* Removes all the tram cap nuocs where tenTram = &#63; and maTinh = &#63; from the database.
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_TENTRAM_TINH(java.lang.String tenTram,
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_TENTRAM_TINH(tenTram, maTinh);
	}

	/**
	* Returns the number of tram cap nuocs where tenTram = &#63; and maTinh = &#63;.
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @return the number of matching tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_TENTRAM_TINH(java.lang.String tenTram,
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_TENTRAM_TINH(tenTram, maTinh);
	}

	/**
	* Returns the number of tram cap nuocs that the user has permission to view where tenTram = &#63; and maTinh = &#63;.
	*
	* @param tenTram the ten tram
	* @param maTinh the ma tinh
	* @return the number of matching tram cap nuocs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByT_TENTRAM_TINH(java.lang.String tenTram,
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByT_TENTRAM_TINH(tenTram, maTinh);
	}

	/**
	* Caches the tram cap nuoc in the entity cache if it is enabled.
	*
	* @param tramCapNuoc the tram cap nuoc
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc tramCapNuoc) {
		getPersistence().cacheResult(tramCapNuoc);
	}

	/**
	* Caches the tram cap nuocs in the entity cache if it is enabled.
	*
	* @param tramCapNuocs the tram cap nuocs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> tramCapNuocs) {
		getPersistence().cacheResult(tramCapNuocs);
	}

	/**
	* Creates a new tram cap nuoc with the primary key. Does not add the tram cap nuoc to the database.
	*
	* @param id the primary key for the new tram cap nuoc
	* @return the new tram cap nuoc
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tram cap nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tram cap nuoc
	* @return the tram cap nuoc that was removed
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc tramCapNuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tramCapNuoc);
	}

	/**
	* Returns the tram cap nuoc with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException} if it could not be found.
	*
	* @param id the primary key of the tram cap nuoc
	* @return the tram cap nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tram cap nuoc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tram cap nuoc
	* @return the tram cap nuoc, or <code>null</code> if a tram cap nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tram cap nuocs.
	*
	* @return the tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tram cap nuocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @return the range of tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tram cap nuocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tram cap nuocs
	* @param end the upper bound of the range of tram cap nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tram cap nuocs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tram cap nuocs.
	*
	* @return the number of tram cap nuocs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TramCapNuocPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TramCapNuocPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer.getServletContextName(),
					TramCapNuocPersistence.class.getName());

			ReferenceRegistry.registerReference(TramCapNuocUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TramCapNuocPersistence persistence) {
	}

	private static TramCapNuocPersistence _persistence;
}