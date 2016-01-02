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

import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;

import java.util.List;

/**
 * The persistence utility for the t h o n g t i n k i e m d e m n u o c service. This utility wraps {@link THONGTINKIEMDEMNUOCPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see THONGTINKIEMDEMNUOCPersistence
 * @see THONGTINKIEMDEMNUOCPersistenceImpl
 * @generated
 */
public class THONGTINKIEMDEMNUOCUtil {
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
	public static void clearCache(THONGTINKIEMDEMNUOC thongtinkiemdemnuoc) {
		getPersistence().clearCache(thongtinkiemdemnuoc);
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
	public static List<THONGTINKIEMDEMNUOC> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<THONGTINKIEMDEMNUOC> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<THONGTINKIEMDEMNUOC> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static THONGTINKIEMDEMNUOC update(
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc) throws SystemException {
		return getPersistence().update(thongtinkiemdemnuoc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static THONGTINKIEMDEMNUOC update(
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(thongtinkiemdemnuoc, serviceContext);
	}

	/**
	* Returns all the t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63;.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @return the matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_dauNoiNuocId(
		long dauNoiNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_dauNoiNuocId(dauNoiNuocId);
	}

	/**
	* Returns a range of all the t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @return the range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_dauNoiNuocId(
		long dauNoiNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_dauNoiNuocId(dauNoiNuocId, start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_dauNoiNuocId(
		long dauNoiNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_dauNoiNuocId(dauNoiNuocId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_dauNoiNuocId_First(
		long dauNoiNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findByD_dauNoiNuocId_First(dauNoiNuocId, orderByComparator);
	}

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_dauNoiNuocId_First(
		long dauNoiNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_dauNoiNuocId_First(dauNoiNuocId, orderByComparator);
	}

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_dauNoiNuocId_Last(
		long dauNoiNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findByD_dauNoiNuocId_Last(dauNoiNuocId, orderByComparator);
	}

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_dauNoiNuocId_Last(
		long dauNoiNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_dauNoiNuocId_Last(dauNoiNuocId, orderByComparator);
	}

	/**
	* Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	*
	* @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	* @param dauNoiNuocId the dau noi nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC[] findByD_dauNoiNuocId_PrevAndNext(
		long id, long dauNoiNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findByD_dauNoiNuocId_PrevAndNext(id, dauNoiNuocId,
			orderByComparator);
	}

	/**
	* Removes all the t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63; from the database.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_dauNoiNuocId(long dauNoiNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByD_dauNoiNuocId(dauNoiNuocId);
	}

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63;.
	*
	* @param dauNoiNuocId the dau noi nuoc ID
	* @return the number of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_dauNoiNuocId(long dauNoiNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByD_dauNoiNuocId(dauNoiNuocId);
	}

	/**
	* Returns all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @return the matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId(
		int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId(keHoachKiemDemNuocId);
	}

	/**
	* Returns a range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @return the range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId(
		int keHoachKiemDemNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId(keHoachKiemDemNuocId, start,
			end);
	}

	/**
	* Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId(
		int keHoachKiemDemNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId(keHoachKiemDemNuocId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_First(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_First(keHoachKiemDemNuocId,
			orderByComparator);
	}

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_First(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_keHoachKiemDemNuocId_First(keHoachKiemDemNuocId,
			orderByComparator);
	}

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_Last(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_Last(keHoachKiemDemNuocId,
			orderByComparator);
	}

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_Last(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_keHoachKiemDemNuocId_Last(keHoachKiemDemNuocId,
			orderByComparator);
	}

	/**
	* Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC[] findByD_keHoachKiemDemNuocId_PrevAndNext(
		long id, int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_PrevAndNext(id,
			keHoachKiemDemNuocId, orderByComparator);
	}

	/**
	* Removes all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; from the database.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_keHoachKiemDemNuocId(int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByD_keHoachKiemDemNuocId(keHoachKiemDemNuocId);
	}

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @return the number of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_keHoachKiemDemNuocId(int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByD_keHoachKiemDemNuocId(keHoachKiemDemNuocId);
	}

	/**
	* Returns all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @return the matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_daKetThucDieuTra(keHoachKiemDemNuocId,
			daKetThucDieuTra);
	}

	/**
	* Returns a range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @return the range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_daKetThucDieuTra(keHoachKiemDemNuocId,
			daKetThucDieuTra, start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_daKetThucDieuTra(keHoachKiemDemNuocId,
			daKetThucDieuTra, start, end, orderByComparator);
	}

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_daKetThucDieuTra_First(
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_daKetThucDieuTra_First(keHoachKiemDemNuocId,
			daKetThucDieuTra, orderByComparator);
	}

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_daKetThucDieuTra_First(
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_keHoachKiemDemNuocId_daKetThucDieuTra_First(keHoachKiemDemNuocId,
			daKetThucDieuTra, orderByComparator);
	}

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_daKetThucDieuTra_Last(
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_daKetThucDieuTra_Last(keHoachKiemDemNuocId,
			daKetThucDieuTra, orderByComparator);
	}

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_daKetThucDieuTra_Last(
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_keHoachKiemDemNuocId_daKetThucDieuTra_Last(keHoachKiemDemNuocId,
			daKetThucDieuTra, orderByComparator);
	}

	/**
	* Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC[] findByD_keHoachKiemDemNuocId_daKetThucDieuTra_PrevAndNext(
		long id, int keHoachKiemDemNuocId, int daKetThucDieuTra,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_daKetThucDieuTra_PrevAndNext(id,
			keHoachKiemDemNuocId, daKetThucDieuTra, orderByComparator);
	}

	/**
	* Removes all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63; from the database.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByD_keHoachKiemDemNuocId_daKetThucDieuTra(keHoachKiemDemNuocId,
			daKetThucDieuTra);
	}

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param daKetThucDieuTra the da ket thuc dieu tra
	* @return the number of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByD_keHoachKiemDemNuocId_daKetThucDieuTra(keHoachKiemDemNuocId,
			daKetThucDieuTra);
	}

	/**
	* Returns all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @return the matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_danhGiaKiemDem(keHoachKiemDemNuocId,
			danhGiaKiemDem);
	}

	/**
	* Returns a range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @return the range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_danhGiaKiemDem(keHoachKiemDemNuocId,
			danhGiaKiemDem, start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_danhGiaKiemDem(keHoachKiemDemNuocId,
			danhGiaKiemDem, start, end, orderByComparator);
	}

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_danhGiaKiemDem_First(
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_danhGiaKiemDem_First(keHoachKiemDemNuocId,
			danhGiaKiemDem, orderByComparator);
	}

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_danhGiaKiemDem_First(
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_keHoachKiemDemNuocId_danhGiaKiemDem_First(keHoachKiemDemNuocId,
			danhGiaKiemDem, orderByComparator);
	}

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_danhGiaKiemDem_Last(
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_danhGiaKiemDem_Last(keHoachKiemDemNuocId,
			danhGiaKiemDem, orderByComparator);
	}

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_danhGiaKiemDem_Last(
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_keHoachKiemDemNuocId_danhGiaKiemDem_Last(keHoachKiemDemNuocId,
			danhGiaKiemDem, orderByComparator);
	}

	/**
	* Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC[] findByD_keHoachKiemDemNuocId_danhGiaKiemDem_PrevAndNext(
		long id, int keHoachKiemDemNuocId, int danhGiaKiemDem,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findByD_keHoachKiemDemNuocId_danhGiaKiemDem_PrevAndNext(id,
			keHoachKiemDemNuocId, danhGiaKiemDem, orderByComparator);
	}

	/**
	* Removes all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63; from the database.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByD_keHoachKiemDemNuocId_danhGiaKiemDem(keHoachKiemDemNuocId,
			danhGiaKiemDem);
	}

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param danhGiaKiemDem the danh gia kiem dem
	* @return the number of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByD_keHoachKiemDemNuocId_danhGiaKiemDem(keHoachKiemDemNuocId,
			danhGiaKiemDem);
	}

	/**
	* Returns all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @return the matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findBy_CountDauNoiByKeHoach(
		int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_CountDauNoiByKeHoach(keHoachKiemDemNuocId);
	}

	/**
	* Returns a range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @return the range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findBy_CountDauNoiByKeHoach(
		int keHoachKiemDemNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_CountDauNoiByKeHoach(keHoachKiemDemNuocId, start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findBy_CountDauNoiByKeHoach(
		int keHoachKiemDemNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_CountDauNoiByKeHoach(keHoachKiemDemNuocId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findBy_CountDauNoiByKeHoach_First(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findBy_CountDauNoiByKeHoach_First(keHoachKiemDemNuocId,
			orderByComparator);
	}

	/**
	* Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchBy_CountDauNoiByKeHoach_First(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_CountDauNoiByKeHoach_First(keHoachKiemDemNuocId,
			orderByComparator);
	}

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findBy_CountDauNoiByKeHoach_Last(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findBy_CountDauNoiByKeHoach_Last(keHoachKiemDemNuocId,
			orderByComparator);
	}

	/**
	* Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchBy_CountDauNoiByKeHoach_Last(
		int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBy_CountDauNoiByKeHoach_Last(keHoachKiemDemNuocId,
			orderByComparator);
	}

	/**
	* Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	*
	* @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC[] findBy_CountDauNoiByKeHoach_PrevAndNext(
		long id, int keHoachKiemDemNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence()
				   .findBy_CountDauNoiByKeHoach_PrevAndNext(id,
			keHoachKiemDemNuocId, orderByComparator);
	}

	/**
	* Removes all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; from the database.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_CountDauNoiByKeHoach(int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_CountDauNoiByKeHoach(keHoachKiemDemNuocId);
	}

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	* @return the number of matching t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_CountDauNoiByKeHoach(int keHoachKiemDemNuocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBy_CountDauNoiByKeHoach(keHoachKiemDemNuocId);
	}

	/**
	* Caches the t h o n g t i n k i e m d e m n u o c in the entity cache if it is enabled.
	*
	* @param thongtinkiemdemnuoc the t h o n g t i n k i e m d e m n u o c
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC thongtinkiemdemnuoc) {
		getPersistence().cacheResult(thongtinkiemdemnuoc);
	}

	/**
	* Caches the t h o n g t i n k i e m d e m n u o cs in the entity cache if it is enabled.
	*
	* @param thongtinkiemdemnuocs the t h o n g t i n k i e m d e m n u o cs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> thongtinkiemdemnuocs) {
		getPersistence().cacheResult(thongtinkiemdemnuocs);
	}

	/**
	* Creates a new t h o n g t i n k i e m d e m n u o c with the primary key. Does not add the t h o n g t i n k i e m d e m n u o c to the database.
	*
	* @param id the primary key for the new t h o n g t i n k i e m d e m n u o c
	* @return the new t h o n g t i n k i e m d e m n u o c
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the t h o n g t i n k i e m d e m n u o c with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t h o n g t i n k i e m d e m n u o c
	* @return the t h o n g t i n k i e m d e m n u o c that was removed
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC thongtinkiemdemnuoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(thongtinkiemdemnuoc);
	}

	/**
	* Returns the t h o n g t i n k i e m d e m n u o c with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException} if it could not be found.
	*
	* @param id the primary key of the t h o n g t i n k i e m d e m n u o c
	* @return the t h o n g t i n k i e m d e m n u o c
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the t h o n g t i n k i e m d e m n u o c with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the t h o n g t i n k i e m d e m n u o c
	* @return the t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the t h o n g t i n k i e m d e m n u o cs.
	*
	* @return the t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the t h o n g t i n k i e m d e m n u o cs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @return the range of t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	* @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the t h o n g t i n k i e m d e m n u o cs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of t h o n g t i n k i e m d e m n u o cs.
	*
	* @return the number of t h o n g t i n k i e m d e m n u o cs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static THONGTINKIEMDEMNUOCPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (THONGTINKIEMDEMNUOCPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer.getServletContextName(),
					THONGTINKIEMDEMNUOCPersistence.class.getName());

			ReferenceRegistry.registerReference(THONGTINKIEMDEMNUOCUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(THONGTINKIEMDEMNUOCPersistence persistence) {
	}

	private static THONGTINKIEMDEMNUOCPersistence _persistence;
}