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

package vn.dtt.sol.ns.baocaodli.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI;

import java.util.List;

/**
 * The persistence utility for the bao cao d l i service. This utility wraps {@link BaoCaoDLIPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HuyMQ
 * @see BaoCaoDLIPersistence
 * @see BaoCaoDLIPersistenceImpl
 * @generated
 */
public class BaoCaoDLIUtil {
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
	public static void clearCache(BaoCaoDLI baoCaoDLI) {
		getPersistence().clearCache(baoCaoDLI);
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
	public static List<BaoCaoDLI> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BaoCaoDLI> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BaoCaoDLI> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static BaoCaoDLI update(BaoCaoDLI baoCaoDLI)
		throws SystemException {
		return getPersistence().update(baoCaoDLI);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static BaoCaoDLI update(BaoCaoDLI baoCaoDLI,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(baoCaoDLI, serviceContext);
	}

	/**
	* Returns the bao cao d l i where id = &#63; or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException} if it could not be found.
	*
	* @param id the ID
	* @return the matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByID(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence().findByID(id);
	}

	/**
	* Returns the bao cao d l i where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByID(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByID(id);
	}

	/**
	* Returns the bao cao d l i where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByID(
		long id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByID(id, retrieveFromCache);
	}

	/**
	* Removes the bao cao d l i where id = &#63; from the database.
	*
	* @param id the ID
	* @return the bao cao d l i that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI removeByID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence().removeByID(id);
	}

	/**
	* Returns the number of bao cao d l is where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static int countByID(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByID(id);
	}

	/**
	* Returns the bao cao d l i where maTinh = &#63; and nam = &#63; or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException} if it could not be found.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @return the matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByMaTinh_Nam(
		java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence().findByMaTinh_Nam(maTinh, nam);
	}

	/**
	* Returns the bao cao d l i where maTinh = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByMaTinh_Nam(
		java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaTinh_Nam(maTinh, nam);
	}

	/**
	* Returns the bao cao d l i where maTinh = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByMaTinh_Nam(
		java.lang.String maTinh, int nam, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaTinh_Nam(maTinh, nam, retrieveFromCache);
	}

	/**
	* Removes the bao cao d l i where maTinh = &#63; and nam = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @return the bao cao d l i that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI removeByMaTinh_Nam(
		java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence().removeByMaTinh_Nam(maTinh, nam);
	}

	/**
	* Returns the number of bao cao d l is where maTinh = &#63; and nam = &#63;.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @return the number of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaTinh_Nam(java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMaTinh_Nam(maTinh, nam);
	}

	/**
	* Returns the bao cao d l i where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63; or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException} if it could not be found.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @param loaiBaoCao the loai bao cao
	* @return the matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByMaTinh_Nam_LoaiBaoCao(
		java.lang.String maTinh, int nam, int loaiBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence()
				   .findByMaTinh_Nam_LoaiBaoCao(maTinh, nam, loaiBaoCao);
	}

	/**
	* Returns the bao cao d l i where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @param loaiBaoCao the loai bao cao
	* @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByMaTinh_Nam_LoaiBaoCao(
		java.lang.String maTinh, int nam, int loaiBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMaTinh_Nam_LoaiBaoCao(maTinh, nam, loaiBaoCao);
	}

	/**
	* Returns the bao cao d l i where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @param loaiBaoCao the loai bao cao
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByMaTinh_Nam_LoaiBaoCao(
		java.lang.String maTinh, int nam, int loaiBaoCao,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMaTinh_Nam_LoaiBaoCao(maTinh, nam, loaiBaoCao,
			retrieveFromCache);
	}

	/**
	* Removes the bao cao d l i where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @param loaiBaoCao the loai bao cao
	* @return the bao cao d l i that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI removeByMaTinh_Nam_LoaiBaoCao(
		java.lang.String maTinh, int nam, int loaiBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence()
				   .removeByMaTinh_Nam_LoaiBaoCao(maTinh, nam, loaiBaoCao);
	}

	/**
	* Returns the number of bao cao d l is where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63;.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @param loaiBaoCao the loai bao cao
	* @return the number of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaTinh_Nam_LoaiBaoCao(java.lang.String maTinh,
		int nam, int loaiBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByMaTinh_Nam_LoaiBaoCao(maTinh, nam, loaiBaoCao);
	}

	/**
	* Returns all the bao cao d l is where nam = &#63;.
	*
	* @param nam the nam
	* @return the matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByNam(
		int nam) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNam(nam);
	}

	/**
	* Returns a range of all the bao cao d l is where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @return the range of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByNam(
		int nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNam(nam, start, end);
	}

	/**
	* Returns an ordered range of all the bao cao d l is where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByNam(
		int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNam(nam, start, end, orderByComparator);
	}

	/**
	* Returns the first bao cao d l i in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByNam_First(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence().findByNam_First(nam, orderByComparator);
	}

	/**
	* Returns the first bao cao d l i in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByNam_First(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNam_First(nam, orderByComparator);
	}

	/**
	* Returns the last bao cao d l i in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByNam_Last(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence().findByNam_Last(nam, orderByComparator);
	}

	/**
	* Returns the last bao cao d l i in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByNam_Last(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNam_Last(nam, orderByComparator);
	}

	/**
	* Returns the bao cao d l is before and after the current bao cao d l i in the ordered set where nam = &#63;.
	*
	* @param id the primary key of the current bao cao d l i
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI[] findByNam_PrevAndNext(
		long id, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence().findByNam_PrevAndNext(id, nam, orderByComparator);
	}

	/**
	* Returns all the bao cao d l is that the user has permission to view where nam = &#63;.
	*
	* @param nam the nam
	* @return the matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByNam(
		int nam) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByNam(nam);
	}

	/**
	* Returns a range of all the bao cao d l is that the user has permission to view where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @return the range of matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByNam(
		int nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByNam(nam, start, end);
	}

	/**
	* Returns an ordered range of all the bao cao d l is that the user has permissions to view where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByNam(
		int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByNam(nam, start, end, orderByComparator);
	}

	/**
	* Returns the bao cao d l is before and after the current bao cao d l i in the ordered set of bao cao d l is that the user has permission to view where nam = &#63;.
	*
	* @param id the primary key of the current bao cao d l i
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI[] filterFindByNam_PrevAndNext(
		long id, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence()
				   .filterFindByNam_PrevAndNext(id, nam, orderByComparator);
	}

	/**
	* Removes all the bao cao d l is where nam = &#63; from the database.
	*
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNam(int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNam(nam);
	}

	/**
	* Returns the number of bao cao d l is where nam = &#63;.
	*
	* @param nam the nam
	* @return the number of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNam(int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNam(nam);
	}

	/**
	* Returns the number of bao cao d l is that the user has permission to view where nam = &#63;.
	*
	* @param nam the nam
	* @return the number of matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByNam(int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByNam(nam);
	}

	/**
	* Returns all the bao cao d l is where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByMaTinh(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMaTinh(maTinh);
	}

	/**
	* Returns a range of all the bao cao d l is where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @return the range of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByMaTinh(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMaTinh(maTinh, start, end);
	}

	/**
	* Returns an ordered range of all the bao cao d l is where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByMaTinh(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMaTinh(maTinh, start, end, orderByComparator);
	}

	/**
	* Returns the first bao cao d l i in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByMaTinh_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence().findByMaTinh_First(maTinh, orderByComparator);
	}

	/**
	* Returns the first bao cao d l i in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByMaTinh_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaTinh_First(maTinh, orderByComparator);
	}

	/**
	* Returns the last bao cao d l i in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByMaTinh_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence().findByMaTinh_Last(maTinh, orderByComparator);
	}

	/**
	* Returns the last bao cao d l i in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByMaTinh_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaTinh_Last(maTinh, orderByComparator);
	}

	/**
	* Returns the bao cao d l is before and after the current bao cao d l i in the ordered set where maTinh = &#63;.
	*
	* @param id the primary key of the current bao cao d l i
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI[] findByMaTinh_PrevAndNext(
		long id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence()
				   .findByMaTinh_PrevAndNext(id, maTinh, orderByComparator);
	}

	/**
	* Returns all the bao cao d l is that the user has permission to view where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByMaTinh(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByMaTinh(maTinh);
	}

	/**
	* Returns a range of all the bao cao d l is that the user has permission to view where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @return the range of matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByMaTinh(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByMaTinh(maTinh, start, end);
	}

	/**
	* Returns an ordered range of all the bao cao d l is that the user has permissions to view where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByMaTinh(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByMaTinh(maTinh, start, end, orderByComparator);
	}

	/**
	* Returns the bao cao d l is before and after the current bao cao d l i in the ordered set of bao cao d l is that the user has permission to view where maTinh = &#63;.
	*
	* @param id the primary key of the current bao cao d l i
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI[] filterFindByMaTinh_PrevAndNext(
		long id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence()
				   .filterFindByMaTinh_PrevAndNext(id, maTinh, orderByComparator);
	}

	/**
	* Removes all the bao cao d l is where maTinh = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMaTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMaTinh(maTinh);
	}

	/**
	* Returns the number of bao cao d l is where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMaTinh(maTinh);
	}

	/**
	* Returns the number of bao cao d l is that the user has permission to view where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByMaTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByMaTinh(maTinh);
	}

	/**
	* Returns all the bao cao d l is where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByTrangThai(
		int trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTrangThai(trangThai);
	}

	/**
	* Returns a range of all the bao cao d l is where trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThai the trang thai
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @return the range of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByTrangThai(
		int trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTrangThai(trangThai, start, end);
	}

	/**
	* Returns an ordered range of all the bao cao d l is where trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThai the trang thai
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByTrangThai(
		int trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTrangThai(trangThai, start, end, orderByComparator);
	}

	/**
	* Returns the first bao cao d l i in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByTrangThai_First(
		int trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence()
				   .findByTrangThai_First(trangThai, orderByComparator);
	}

	/**
	* Returns the first bao cao d l i in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByTrangThai_First(
		int trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTrangThai_First(trangThai, orderByComparator);
	}

	/**
	* Returns the last bao cao d l i in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByTrangThai_Last(
		int trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence()
				   .findByTrangThai_Last(trangThai, orderByComparator);
	}

	/**
	* Returns the last bao cao d l i in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByTrangThai_Last(
		int trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTrangThai_Last(trangThai, orderByComparator);
	}

	/**
	* Returns the bao cao d l is before and after the current bao cao d l i in the ordered set where trangThai = &#63;.
	*
	* @param id the primary key of the current bao cao d l i
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI[] findByTrangThai_PrevAndNext(
		long id, int trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence()
				   .findByTrangThai_PrevAndNext(id, trangThai, orderByComparator);
	}

	/**
	* Returns all the bao cao d l is that the user has permission to view where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByTrangThai(
		int trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByTrangThai(trangThai);
	}

	/**
	* Returns a range of all the bao cao d l is that the user has permission to view where trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThai the trang thai
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @return the range of matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByTrangThai(
		int trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByTrangThai(trangThai, start, end);
	}

	/**
	* Returns an ordered range of all the bao cao d l is that the user has permissions to view where trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThai the trang thai
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByTrangThai(
		int trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByTrangThai(trangThai, start, end,
			orderByComparator);
	}

	/**
	* Returns the bao cao d l is before and after the current bao cao d l i in the ordered set of bao cao d l is that the user has permission to view where trangThai = &#63;.
	*
	* @param id the primary key of the current bao cao d l i
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI[] filterFindByTrangThai_PrevAndNext(
		long id, int trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence()
				   .filterFindByTrangThai_PrevAndNext(id, trangThai,
			orderByComparator);
	}

	/**
	* Removes all the bao cao d l is where trangThai = &#63; from the database.
	*
	* @param trangThai the trang thai
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTrangThai(int trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTrangThai(trangThai);
	}

	/**
	* Returns the number of bao cao d l is where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the number of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTrangThai(int trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTrangThai(trangThai);
	}

	/**
	* Returns the number of bao cao d l is that the user has permission to view where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the number of matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByTrangThai(int trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByTrangThai(trangThai);
	}

	/**
	* Caches the bao cao d l i in the entity cache if it is enabled.
	*
	* @param baoCaoDLI the bao cao d l i
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI baoCaoDLI) {
		getPersistence().cacheResult(baoCaoDLI);
	}

	/**
	* Caches the bao cao d l is in the entity cache if it is enabled.
	*
	* @param baoCaoDLIs the bao cao d l is
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> baoCaoDLIs) {
		getPersistence().cacheResult(baoCaoDLIs);
	}

	/**
	* Creates a new bao cao d l i with the primary key. Does not add the bao cao d l i to the database.
	*
	* @param id the primary key for the new bao cao d l i
	* @return the new bao cao d l i
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the bao cao d l i with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bao cao d l i
	* @return the bao cao d l i that was removed
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI updateImpl(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(baoCaoDLI);
	}

	/**
	* Returns the bao cao d l i with the primary key or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException} if it could not be found.
	*
	* @param id the primary key of the bao cao d l i
	* @return the bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the bao cao d l i with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bao cao d l i
	* @return the bao cao d l i, or <code>null</code> if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the bao cao d l is.
	*
	* @return the bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bao cao d l is.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @return the range of bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bao cao d l is.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bao cao d l is
	* @param end the upper bound of the range of bao cao d l is (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the bao cao d l is from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bao cao d l is.
	*
	* @return the number of bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BaoCaoDLIPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BaoCaoDLIPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.baocaodli.dao.service.ClpSerializer.getServletContextName(),
					BaoCaoDLIPersistence.class.getName());

			ReferenceRegistry.registerReference(BaoCaoDLIUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BaoCaoDLIPersistence persistence) {
	}

	private static BaoCaoDLIPersistence _persistence;
}