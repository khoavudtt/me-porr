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

package vn.dtt.sol.ns.maungaunhien.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM;

import java.util.List;

/**
 * The persistence utility for the m a u k i e m d e m service. This utility wraps {@link MAUKIEMDEMPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see MAUKIEMDEMPersistence
 * @see MAUKIEMDEMPersistenceImpl
 * @generated
 */
public class MAUKIEMDEMUtil {
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
	public static void clearCache(MAUKIEMDEM maukiemdem) {
		getPersistence().clearCache(maukiemdem);
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
	public static List<MAUKIEMDEM> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MAUKIEMDEM> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MAUKIEMDEM> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MAUKIEMDEM update(MAUKIEMDEM maukiemdem)
		throws SystemException {
		return getPersistence().update(maukiemdem);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MAUKIEMDEM update(MAUKIEMDEM maukiemdem,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(maukiemdem, serviceContext);
	}

	/**
	* Returns the m a u k i e m d e m where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and nam = &#63; or throws a {@link vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException} if it could not be found.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param nam the nam
	* @return the matching m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM findByT_H_X_N(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException {
		return getPersistence().findByT_H_X_N(maTinh, maHuyen, maXa, nam);
	}

	/**
	* Returns the m a u k i e m d e m where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param nam the nam
	* @return the matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByT_H_X_N(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT_H_X_N(maTinh, maHuyen, maXa, nam);
	}

	/**
	* Returns the m a u k i e m d e m where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param nam the nam
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByT_H_X_N(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_H_X_N(maTinh, maHuyen, maXa, nam, retrieveFromCache);
	}

	/**
	* Removes the m a u k i e m d e m where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and nam = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param nam the nam
	* @return the m a u k i e m d e m that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM removeByT_H_X_N(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException {
		return getPersistence().removeByT_H_X_N(maTinh, maHuyen, maXa, nam);
	}

	/**
	* Returns the number of m a u k i e m d e ms where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and nam = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param nam the nam
	* @return the number of matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_H_X_N(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_H_X_N(maTinh, maHuyen, maXa, nam);
	}

	/**
	* Returns all the m a u k i e m d e ms where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findByT_(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_(maTinh);
	}

	/**
	* Returns a range of all the m a u k i e m d e ms where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of m a u k i e m d e ms
	* @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	* @return the range of matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findByT_(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_(maTinh, start, end);
	}

	/**
	* Returns an ordered range of all the m a u k i e m d e ms where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of m a u k i e m d e ms
	* @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findByT_(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_(maTinh, start, end, orderByComparator);
	}

	/**
	* Returns the first m a u k i e m d e m in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM findByT__First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException {
		return getPersistence().findByT__First(maTinh, orderByComparator);
	}

	/**
	* Returns the first m a u k i e m d e m in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByT__First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT__First(maTinh, orderByComparator);
	}

	/**
	* Returns the last m a u k i e m d e m in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM findByT__Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException {
		return getPersistence().findByT__Last(maTinh, orderByComparator);
	}

	/**
	* Returns the last m a u k i e m d e m in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByT__Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT__Last(maTinh, orderByComparator);
	}

	/**
	* Returns the m a u k i e m d e ms before and after the current m a u k i e m d e m in the ordered set where maTinh = &#63;.
	*
	* @param id the primary key of the current m a u k i e m d e m
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a m a u k i e m d e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM[] findByT__PrevAndNext(
		long id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException {
		return getPersistence()
				   .findByT__PrevAndNext(id, maTinh, orderByComparator);
	}

	/**
	* Removes all the m a u k i e m d e ms where maTinh = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_(maTinh);
	}

	/**
	* Returns the number of m a u k i e m d e ms where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_(maTinh);
	}

	/**
	* Returns all the m a u k i e m d e ms where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @return the matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findByH_(
		java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByH_(maHuyen);
	}

	/**
	* Returns a range of all the m a u k i e m d e ms where maHuyen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maHuyen the ma huyen
	* @param start the lower bound of the range of m a u k i e m d e ms
	* @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	* @return the range of matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findByH_(
		java.lang.String maHuyen, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByH_(maHuyen, start, end);
	}

	/**
	* Returns an ordered range of all the m a u k i e m d e ms where maHuyen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maHuyen the ma huyen
	* @param start the lower bound of the range of m a u k i e m d e ms
	* @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findByH_(
		java.lang.String maHuyen, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByH_(maHuyen, start, end, orderByComparator);
	}

	/**
	* Returns the first m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM findByH__First(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException {
		return getPersistence().findByH__First(maHuyen, orderByComparator);
	}

	/**
	* Returns the first m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByH__First(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByH__First(maHuyen, orderByComparator);
	}

	/**
	* Returns the last m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM findByH__Last(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException {
		return getPersistence().findByH__Last(maHuyen, orderByComparator);
	}

	/**
	* Returns the last m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByH__Last(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByH__Last(maHuyen, orderByComparator);
	}

	/**
	* Returns the m a u k i e m d e ms before and after the current m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	*
	* @param id the primary key of the current m a u k i e m d e m
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a m a u k i e m d e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM[] findByH__PrevAndNext(
		long id, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException {
		return getPersistence()
				   .findByH__PrevAndNext(id, maHuyen, orderByComparator);
	}

	/**
	* Removes all the m a u k i e m d e ms where maHuyen = &#63; from the database.
	*
	* @param maHuyen the ma huyen
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByH_(java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByH_(maHuyen);
	}

	/**
	* Returns the number of m a u k i e m d e ms where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @return the number of matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static int countByH_(java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByH_(maHuyen);
	}

	/**
	* Caches the m a u k i e m d e m in the entity cache if it is enabled.
	*
	* @param maukiemdem the m a u k i e m d e m
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM maukiemdem) {
		getPersistence().cacheResult(maukiemdem);
	}

	/**
	* Caches the m a u k i e m d e ms in the entity cache if it is enabled.
	*
	* @param maukiemdems the m a u k i e m d e ms
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> maukiemdems) {
		getPersistence().cacheResult(maukiemdems);
	}

	/**
	* Creates a new m a u k i e m d e m with the primary key. Does not add the m a u k i e m d e m to the database.
	*
	* @param id the primary key for the new m a u k i e m d e m
	* @return the new m a u k i e m d e m
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the m a u k i e m d e m with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the m a u k i e m d e m
	* @return the m a u k i e m d e m that was removed
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a m a u k i e m d e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM updateImpl(
		vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM maukiemdem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(maukiemdem);
	}

	/**
	* Returns the m a u k i e m d e m with the primary key or throws a {@link vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException} if it could not be found.
	*
	* @param id the primary key of the m a u k i e m d e m
	* @return the m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a m a u k i e m d e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the m a u k i e m d e m with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the m a u k i e m d e m
	* @return the m a u k i e m d e m, or <code>null</code> if a m a u k i e m d e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the m a u k i e m d e ms.
	*
	* @return the m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the m a u k i e m d e ms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of m a u k i e m d e ms
	* @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	* @return the range of m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the m a u k i e m d e ms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of m a u k i e m d e ms
	* @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the m a u k i e m d e ms from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of m a u k i e m d e ms.
	*
	* @return the number of m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MAUKIEMDEMPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MAUKIEMDEMPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.maungaunhien.dao.service.ClpSerializer.getServletContextName(),
					MAUKIEMDEMPersistence.class.getName());

			ReferenceRegistry.registerReference(MAUKIEMDEMUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MAUKIEMDEMPersistence persistence) {
	}

	private static MAUKIEMDEMPersistence _persistence;
}