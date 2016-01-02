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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew;

import java.util.List;

/**
 * The persistence utility for the danh gia ve sinh xa new service. This utility wraps {@link DanhGiaVeSinhXaNewPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see DanhGiaVeSinhXaNewPersistence
 * @see DanhGiaVeSinhXaNewPersistenceImpl
 * @generated
 */
public class DanhGiaVeSinhXaNewUtil {
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
	public static void clearCache(DanhGiaVeSinhXaNew danhGiaVeSinhXaNew) {
		getPersistence().clearCache(danhGiaVeSinhXaNew);
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
	public static List<DanhGiaVeSinhXaNew> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DanhGiaVeSinhXaNew> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DanhGiaVeSinhXaNew> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DanhGiaVeSinhXaNew update(
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew) throws SystemException {
		return getPersistence().update(danhGiaVeSinhXaNew);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DanhGiaVeSinhXaNew update(
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(danhGiaVeSinhXaNew, serviceContext);
	}

	/**
	* Returns all the danh gia ve sinh xa news where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findByF_MATINH(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_MATINH(maTinh);
	}

	/**
	* Returns a range of all the danh gia ve sinh xa news where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of danh gia ve sinh xa news
	* @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	* @return the range of matching danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findByF_MATINH(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_MATINH(maTinh, start, end);
	}

	/**
	* Returns an ordered range of all the danh gia ve sinh xa news where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of danh gia ve sinh xa news
	* @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findByF_MATINH(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_MATINH(maTinh, start, end, orderByComparator);
	}

	/**
	* Returns the first danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia ve sinh xa new
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a matching danh gia ve sinh xa new could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew findByF_MATINH_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException {
		return getPersistence().findByF_MATINH_First(maTinh, orderByComparator);
	}

	/**
	* Returns the first danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia ve sinh xa new, or <code>null</code> if a matching danh gia ve sinh xa new could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew fetchByF_MATINH_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_MATINH_First(maTinh, orderByComparator);
	}

	/**
	* Returns the last danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia ve sinh xa new
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a matching danh gia ve sinh xa new could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew findByF_MATINH_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException {
		return getPersistence().findByF_MATINH_Last(maTinh, orderByComparator);
	}

	/**
	* Returns the last danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia ve sinh xa new, or <code>null</code> if a matching danh gia ve sinh xa new could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew fetchByF_MATINH_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_MATINH_Last(maTinh, orderByComparator);
	}

	/**
	* Returns the danh gia ve sinh xa news before and after the current danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	*
	* @param id the primary key of the current danh gia ve sinh xa new
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next danh gia ve sinh xa new
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a danh gia ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew[] findByF_MATINH_PrevAndNext(
		int id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException {
		return getPersistence()
				   .findByF_MATINH_PrevAndNext(id, maTinh, orderByComparator);
	}

	/**
	* Removes all the danh gia ve sinh xa news where maTinh = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_MATINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_MATINH(maTinh);
	}

	/**
	* Returns the number of danh gia ve sinh xa news where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_MATINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_MATINH(maTinh);
	}

	/**
	* Returns all the danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @return the matching danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findByF_T_H_N(
		java.lang.String maTinh, java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_T_H_N(maTinh, maHuyen, nam);
	}

	/**
	* Returns a range of all the danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @param start the lower bound of the range of danh gia ve sinh xa news
	* @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	* @return the range of matching danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findByF_T_H_N(
		java.lang.String maTinh, java.lang.String maHuyen, int nam, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_T_H_N(maTinh, maHuyen, nam, start, end);
	}

	/**
	* Returns an ordered range of all the danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @param start the lower bound of the range of danh gia ve sinh xa news
	* @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findByF_T_H_N(
		java.lang.String maTinh, java.lang.String maHuyen, int nam, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_T_H_N(maTinh, maHuyen, nam, start, end,
			orderByComparator);
	}

	/**
	* Returns the first danh gia ve sinh xa new in the ordered set where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia ve sinh xa new
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a matching danh gia ve sinh xa new could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew findByF_T_H_N_First(
		java.lang.String maTinh, java.lang.String maHuyen, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException {
		return getPersistence()
				   .findByF_T_H_N_First(maTinh, maHuyen, nam, orderByComparator);
	}

	/**
	* Returns the first danh gia ve sinh xa new in the ordered set where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia ve sinh xa new, or <code>null</code> if a matching danh gia ve sinh xa new could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew fetchByF_T_H_N_First(
		java.lang.String maTinh, java.lang.String maHuyen, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_T_H_N_First(maTinh, maHuyen, nam, orderByComparator);
	}

	/**
	* Returns the last danh gia ve sinh xa new in the ordered set where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia ve sinh xa new
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a matching danh gia ve sinh xa new could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew findByF_T_H_N_Last(
		java.lang.String maTinh, java.lang.String maHuyen, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException {
		return getPersistence()
				   .findByF_T_H_N_Last(maTinh, maHuyen, nam, orderByComparator);
	}

	/**
	* Returns the last danh gia ve sinh xa new in the ordered set where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia ve sinh xa new, or <code>null</code> if a matching danh gia ve sinh xa new could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew fetchByF_T_H_N_Last(
		java.lang.String maTinh, java.lang.String maHuyen, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_T_H_N_Last(maTinh, maHuyen, nam, orderByComparator);
	}

	/**
	* Returns the danh gia ve sinh xa news before and after the current danh gia ve sinh xa new in the ordered set where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	*
	* @param id the primary key of the current danh gia ve sinh xa new
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next danh gia ve sinh xa new
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a danh gia ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew[] findByF_T_H_N_PrevAndNext(
		int id, java.lang.String maTinh, java.lang.String maHuyen, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException {
		return getPersistence()
				   .findByF_T_H_N_PrevAndNext(id, maTinh, maHuyen, nam,
			orderByComparator);
	}

	/**
	* Removes all the danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_T_H_N(java.lang.String maTinh,
		java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_T_H_N(maTinh, maHuyen, nam);
	}

	/**
	* Returns the number of danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @return the number of matching danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_T_H_N(java.lang.String maTinh,
		java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_T_H_N(maTinh, maHuyen, nam);
	}

	/**
	* Caches the danh gia ve sinh xa new in the entity cache if it is enabled.
	*
	* @param danhGiaVeSinhXaNew the danh gia ve sinh xa new
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew danhGiaVeSinhXaNew) {
		getPersistence().cacheResult(danhGiaVeSinhXaNew);
	}

	/**
	* Caches the danh gia ve sinh xa news in the entity cache if it is enabled.
	*
	* @param danhGiaVeSinhXaNews the danh gia ve sinh xa news
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> danhGiaVeSinhXaNews) {
		getPersistence().cacheResult(danhGiaVeSinhXaNews);
	}

	/**
	* Creates a new danh gia ve sinh xa new with the primary key. Does not add the danh gia ve sinh xa new to the database.
	*
	* @param id the primary key for the new danh gia ve sinh xa new
	* @return the new danh gia ve sinh xa new
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the danh gia ve sinh xa new with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the danh gia ve sinh xa new
	* @return the danh gia ve sinh xa new that was removed
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a danh gia ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew danhGiaVeSinhXaNew)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(danhGiaVeSinhXaNew);
	}

	/**
	* Returns the danh gia ve sinh xa new with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException} if it could not be found.
	*
	* @param id the primary key of the danh gia ve sinh xa new
	* @return the danh gia ve sinh xa new
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a danh gia ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the danh gia ve sinh xa new with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the danh gia ve sinh xa new
	* @return the danh gia ve sinh xa new, or <code>null</code> if a danh gia ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the danh gia ve sinh xa news.
	*
	* @return the danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the danh gia ve sinh xa news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia ve sinh xa news
	* @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	* @return the range of danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the danh gia ve sinh xa news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia ve sinh xa news
	* @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the danh gia ve sinh xa news from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of danh gia ve sinh xa news.
	*
	* @return the number of danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DanhGiaVeSinhXaNewPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DanhGiaVeSinhXaNewPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.vesinhmoitruong.dao.service.ClpSerializer.getServletContextName(),
					DanhGiaVeSinhXaNewPersistence.class.getName());

			ReferenceRegistry.registerReference(DanhGiaVeSinhXaNewUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DanhGiaVeSinhXaNewPersistence persistence) {
	}

	private static DanhGiaVeSinhXaNewPersistence _persistence;
}