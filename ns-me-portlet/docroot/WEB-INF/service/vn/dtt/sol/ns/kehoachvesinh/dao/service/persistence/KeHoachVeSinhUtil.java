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

package vn.dtt.sol.ns.kehoachvesinh.dao.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh;

import java.util.List;

/**
 * The persistence utility for the ke hoach ve sinh service. This utility wraps {@link KeHoachVeSinhPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HANT
 * @see KeHoachVeSinhPersistence
 * @see KeHoachVeSinhPersistenceImpl
 * @generated
 */
public class KeHoachVeSinhUtil {
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
	public static void clearCache(KeHoachVeSinh keHoachVeSinh) {
		getPersistence().clearCache(keHoachVeSinh);
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
	public static List<KeHoachVeSinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KeHoachVeSinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KeHoachVeSinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static KeHoachVeSinh update(KeHoachVeSinh keHoachVeSinh)
		throws SystemException {
		return getPersistence().update(keHoachVeSinh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static KeHoachVeSinh update(KeHoachVeSinh keHoachVeSinh,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(keHoachVeSinh, serviceContext);
	}

	/**
	* Returns the ke hoach ve sinh where id = &#63; or throws a {@link vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException} if it could not be found.
	*
	* @param id the ID
	* @return the matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_ID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_ID(id);
	}

	/**
	* Returns the ke hoach ve sinh where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_ID(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_ID(id);
	}

	/**
	* Returns the ke hoach ve sinh where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_ID(
		long id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_ID(id, retrieveFromCache);
	}

	/**
	* Removes the ke hoach ve sinh where id = &#63; from the database.
	*
	* @param id the ID
	* @return the ke hoach ve sinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh removeBy_ID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().removeBy_ID(id);
	}

	/**
	* Returns the number of ke hoach ve sinhs where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_ID(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_ID(id);
	}

	/**
	* Returns all the ke hoach ve sinhs where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @return the matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_N_T(
		long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_N_T(idNguoiTao);
	}

	/**
	* Returns a range of all the ke hoach ve sinhs where idNguoiTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param idNguoiTao the id nguoi tao
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @return the range of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_N_T(
		long idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_N_T(idNguoiTao, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach ve sinhs where idNguoiTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param idNguoiTao the id nguoi tao
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_N_T(
		long idNguoiTao, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_N_T(idNguoiTao, start, end, orderByComparator);
	}

	/**
	* Returns the first ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_N_T_First(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_N_T_First(idNguoiTao, orderByComparator);
	}

	/**
	* Returns the first ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_N_T_First(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_N_T_First(idNguoiTao, orderByComparator);
	}

	/**
	* Returns the last ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_N_T_Last(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_N_T_Last(idNguoiTao, orderByComparator);
	}

	/**
	* Returns the last ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_N_T_Last(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_N_T_Last(idNguoiTao, orderByComparator);
	}

	/**
	* Returns the ke hoach ve sinhs before and after the current ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	*
	* @param id the primary key of the current ke hoach ve sinh
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh[] findBy_N_T_PrevAndNext(
		long id, long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence()
				   .findBy_N_T_PrevAndNext(id, idNguoiTao, orderByComparator);
	}

	/**
	* Removes all the ke hoach ve sinhs where idNguoiTao = &#63; from the database.
	*
	* @param idNguoiTao the id nguoi tao
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_N_T(long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_N_T(idNguoiTao);
	}

	/**
	* Returns the number of ke hoach ve sinhs where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_N_T(long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_N_T(idNguoiTao);
	}

	/**
	* Returns all the ke hoach ve sinhs where nam = &#63;.
	*
	* @param nam the nam
	* @return the matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_Y(
		long nam) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_Y(nam);
	}

	/**
	* Returns a range of all the ke hoach ve sinhs where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @return the range of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_Y(
		long nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_Y(nam, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach ve sinhs where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_Y(
		long nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_Y(nam, start, end, orderByComparator);
	}

	/**
	* Returns the first ke hoach ve sinh in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_Y_First(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_Y_First(nam, orderByComparator);
	}

	/**
	* Returns the first ke hoach ve sinh in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_Y_First(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_Y_First(nam, orderByComparator);
	}

	/**
	* Returns the last ke hoach ve sinh in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_Y_Last(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_Y_Last(nam, orderByComparator);
	}

	/**
	* Returns the last ke hoach ve sinh in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_Y_Last(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_Y_Last(nam, orderByComparator);
	}

	/**
	* Returns the ke hoach ve sinhs before and after the current ke hoach ve sinh in the ordered set where nam = &#63;.
	*
	* @param id the primary key of the current ke hoach ve sinh
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh[] findBy_Y_PrevAndNext(
		long id, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_Y_PrevAndNext(id, nam, orderByComparator);
	}

	/**
	* Removes all the ke hoach ve sinhs where nam = &#63; from the database.
	*
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_Y(long nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_Y(nam);
	}

	/**
	* Returns the number of ke hoach ve sinhs where nam = &#63;.
	*
	* @param nam the nam
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_Y(long nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_Y(nam);
	}

	/**
	* Returns all the ke hoach ve sinhs where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @return the matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_D_L_I(
		long baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_D_L_I(baoCaoDLI);
	}

	/**
	* Returns a range of all the ke hoach ve sinhs where baoCaoDLI = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param baoCaoDLI the bao cao d l i
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @return the range of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_D_L_I(
		long baoCaoDLI, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_D_L_I(baoCaoDLI, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach ve sinhs where baoCaoDLI = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param baoCaoDLI the bao cao d l i
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_D_L_I(
		long baoCaoDLI, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_D_L_I(baoCaoDLI, start, end, orderByComparator);
	}

	/**
	* Returns the first ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_D_L_I_First(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_D_L_I_First(baoCaoDLI, orderByComparator);
	}

	/**
	* Returns the first ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_D_L_I_First(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_D_L_I_First(baoCaoDLI, orderByComparator);
	}

	/**
	* Returns the last ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_D_L_I_Last(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_D_L_I_Last(baoCaoDLI, orderByComparator);
	}

	/**
	* Returns the last ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_D_L_I_Last(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_D_L_I_Last(baoCaoDLI, orderByComparator);
	}

	/**
	* Returns the ke hoach ve sinhs before and after the current ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	*
	* @param id the primary key of the current ke hoach ve sinh
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh[] findBy_D_L_I_PrevAndNext(
		long id, long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence()
				   .findBy_D_L_I_PrevAndNext(id, baoCaoDLI, orderByComparator);
	}

	/**
	* Removes all the ke hoach ve sinhs where baoCaoDLI = &#63; from the database.
	*
	* @param baoCaoDLI the bao cao d l i
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_D_L_I(long baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_D_L_I(baoCaoDLI);
	}

	/**
	* Returns the number of ke hoach ve sinhs where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_D_L_I(long baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_D_L_I(baoCaoDLI);
	}

	/**
	* Returns all the ke hoach ve sinhs where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_O_R_1(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_O_R_1(maTinh);
	}

	/**
	* Returns a range of all the ke hoach ve sinhs where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @return the range of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_O_R_1(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_O_R_1(maTinh, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach ve sinhs where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_O_R_1(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_O_R_1(maTinh, start, end, orderByComparator);
	}

	/**
	* Returns the first ke hoach ve sinh in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_O_R_1_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_O_R_1_First(maTinh, orderByComparator);
	}

	/**
	* Returns the first ke hoach ve sinh in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_O_R_1_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_O_R_1_First(maTinh, orderByComparator);
	}

	/**
	* Returns the last ke hoach ve sinh in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_O_R_1_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_O_R_1_Last(maTinh, orderByComparator);
	}

	/**
	* Returns the last ke hoach ve sinh in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_O_R_1_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_O_R_1_Last(maTinh, orderByComparator);
	}

	/**
	* Returns the ke hoach ve sinhs before and after the current ke hoach ve sinh in the ordered set where maTinh = &#63;.
	*
	* @param id the primary key of the current ke hoach ve sinh
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh[] findBy_O_R_1_PrevAndNext(
		long id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence()
				   .findBy_O_R_1_PrevAndNext(id, maTinh, orderByComparator);
	}

	/**
	* Removes all the ke hoach ve sinhs where maTinh = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_O_R_1(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_O_R_1(maTinh);
	}

	/**
	* Returns the number of ke hoach ve sinhs where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_O_R_1(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_O_R_1(maTinh);
	}

	/**
	* Returns all the ke hoach ve sinhs where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @return the matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_O_R_2(
		java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_O_R_2(maHuyen);
	}

	/**
	* Returns a range of all the ke hoach ve sinhs where maHuyen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maHuyen the ma huyen
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @return the range of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_O_R_2(
		java.lang.String maHuyen, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_O_R_2(maHuyen, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach ve sinhs where maHuyen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maHuyen the ma huyen
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_O_R_2(
		java.lang.String maHuyen, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBy_O_R_2(maHuyen, start, end, orderByComparator);
	}

	/**
	* Returns the first ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_O_R_2_First(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_O_R_2_First(maHuyen, orderByComparator);
	}

	/**
	* Returns the first ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_O_R_2_First(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_O_R_2_First(maHuyen, orderByComparator);
	}

	/**
	* Returns the last ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_O_R_2_Last(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_O_R_2_Last(maHuyen, orderByComparator);
	}

	/**
	* Returns the last ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_O_R_2_Last(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_O_R_2_Last(maHuyen, orderByComparator);
	}

	/**
	* Returns the ke hoach ve sinhs before and after the current ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	*
	* @param id the primary key of the current ke hoach ve sinh
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh[] findBy_O_R_2_PrevAndNext(
		long id, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence()
				   .findBy_O_R_2_PrevAndNext(id, maHuyen, orderByComparator);
	}

	/**
	* Removes all the ke hoach ve sinhs where maHuyen = &#63; from the database.
	*
	* @param maHuyen the ma huyen
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_O_R_2(java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_O_R_2(maHuyen);
	}

	/**
	* Returns the number of ke hoach ve sinhs where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_O_R_2(java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_O_R_2(maHuyen);
	}

	/**
	* Returns all the ke hoach ve sinhs where maXa = &#63;.
	*
	* @param maXa the ma xa
	* @return the matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_X_A(
		java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_X_A(maXa);
	}

	/**
	* Returns a range of all the ke hoach ve sinhs where maXa = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maXa the ma xa
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @return the range of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_X_A(
		java.lang.String maXa, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_X_A(maXa, start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach ve sinhs where maXa = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maXa the ma xa
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_X_A(
		java.lang.String maXa, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBy_X_A(maXa, start, end, orderByComparator);
	}

	/**
	* Returns the first ke hoach ve sinh in the ordered set where maXa = &#63;.
	*
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_X_A_First(
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_X_A_First(maXa, orderByComparator);
	}

	/**
	* Returns the first ke hoach ve sinh in the ordered set where maXa = &#63;.
	*
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_X_A_First(
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_X_A_First(maXa, orderByComparator);
	}

	/**
	* Returns the last ke hoach ve sinh in the ordered set where maXa = &#63;.
	*
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_X_A_Last(
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findBy_X_A_Last(maXa, orderByComparator);
	}

	/**
	* Returns the last ke hoach ve sinh in the ordered set where maXa = &#63;.
	*
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_X_A_Last(
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBy_X_A_Last(maXa, orderByComparator);
	}

	/**
	* Returns the ke hoach ve sinhs before and after the current ke hoach ve sinh in the ordered set where maXa = &#63;.
	*
	* @param id the primary key of the current ke hoach ve sinh
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh[] findBy_X_A_PrevAndNext(
		long id, java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence()
				   .findBy_X_A_PrevAndNext(id, maXa, orderByComparator);
	}

	/**
	* Removes all the ke hoach ve sinhs where maXa = &#63; from the database.
	*
	* @param maXa the ma xa
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBy_X_A(java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBy_X_A(maXa);
	}

	/**
	* Returns the number of ke hoach ve sinhs where maXa = &#63;.
	*
	* @param maXa the ma xa
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBy_X_A(java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBy_X_A(maXa);
	}

	/**
	* Caches the ke hoach ve sinh in the entity cache if it is enabled.
	*
	* @param keHoachVeSinh the ke hoach ve sinh
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh keHoachVeSinh) {
		getPersistence().cacheResult(keHoachVeSinh);
	}

	/**
	* Caches the ke hoach ve sinhs in the entity cache if it is enabled.
	*
	* @param keHoachVeSinhs the ke hoach ve sinhs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> keHoachVeSinhs) {
		getPersistence().cacheResult(keHoachVeSinhs);
	}

	/**
	* Creates a new ke hoach ve sinh with the primary key. Does not add the ke hoach ve sinh to the database.
	*
	* @param id the primary key for the new ke hoach ve sinh
	* @return the new ke hoach ve sinh
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the ke hoach ve sinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach ve sinh
	* @return the ke hoach ve sinh that was removed
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh updateImpl(
		vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh keHoachVeSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(keHoachVeSinh);
	}

	/**
	* Returns the ke hoach ve sinh with the primary key or throws a {@link vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException} if it could not be found.
	*
	* @param id the primary key of the ke hoach ve sinh
	* @return the ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the ke hoach ve sinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ke hoach ve sinh
	* @return the ke hoach ve sinh, or <code>null</code> if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the ke hoach ve sinhs.
	*
	* @return the ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ke hoach ve sinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @return the range of ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ke hoach ve sinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach ve sinhs
	* @param end the upper bound of the range of ke hoach ve sinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the ke hoach ve sinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ke hoach ve sinhs.
	*
	* @return the number of ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static KeHoachVeSinhPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KeHoachVeSinhPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.kehoachvesinh.dao.service.ClpSerializer.getServletContextName(),
					KeHoachVeSinhPersistence.class.getName());

			ReferenceRegistry.registerReference(KeHoachVeSinhUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(KeHoachVeSinhPersistence persistence) {
	}

	private static KeHoachVeSinhPersistence _persistence;
}