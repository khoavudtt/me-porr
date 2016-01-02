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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;

import java.util.List;

/**
 * The persistence utility for the ve sinh gia dinh service. This utility wraps {@link VeSinhGiaDinhPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see VeSinhGiaDinhPersistence
 * @see VeSinhGiaDinhPersistenceImpl
 * @generated
 */
public class VeSinhGiaDinhUtil {
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
	public static void clearCache(VeSinhGiaDinh veSinhGiaDinh) {
		getPersistence().clearCache(veSinhGiaDinh);
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
	public static List<VeSinhGiaDinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VeSinhGiaDinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VeSinhGiaDinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static VeSinhGiaDinh update(VeSinhGiaDinh veSinhGiaDinh)
		throws SystemException {
		return getPersistence().update(veSinhGiaDinh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static VeSinhGiaDinh update(VeSinhGiaDinh veSinhGiaDinh,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(veSinhGiaDinh, serviceContext);
	}

	/**
	* Returns all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @return the matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_Import(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_CHK_Import(maTinh, maHuyen, maXa, thonXom,
			tenChuHo, idNguoiTao);
	}

	/**
	* Returns a range of all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param start the lower bound of the range of ve sinh gia dinhs
	* @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	* @return the range of matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_Import(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_CHK_Import(maTinh, maHuyen, maXa, thonXom,
			tenChuHo, idNguoiTao, start, end);
	}

	/**
	* Returns an ordered range of all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param start the lower bound of the range of ve sinh gia dinhs
	* @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_Import(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_CHK_Import(maTinh, maHuyen, maXa, thonXom,
			tenChuHo, idNguoiTao, start, end, orderByComparator);
	}

	/**
	* Returns the first ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ve sinh gia dinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a matching ve sinh gia dinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByT_CHK_Import_First(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException {
		return getPersistence()
				   .findByT_CHK_Import_First(maTinh, maHuyen, maXa, thonXom,
			tenChuHo, idNguoiTao, orderByComparator);
	}

	/**
	* Returns the first ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ve sinh gia dinh, or <code>null</code> if a matching ve sinh gia dinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByT_CHK_Import_First(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_CHK_Import_First(maTinh, maHuyen, maXa, thonXom,
			tenChuHo, idNguoiTao, orderByComparator);
	}

	/**
	* Returns the last ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ve sinh gia dinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a matching ve sinh gia dinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByT_CHK_Import_Last(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException {
		return getPersistence()
				   .findByT_CHK_Import_Last(maTinh, maHuyen, maXa, thonXom,
			tenChuHo, idNguoiTao, orderByComparator);
	}

	/**
	* Returns the last ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ve sinh gia dinh, or <code>null</code> if a matching ve sinh gia dinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByT_CHK_Import_Last(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_CHK_Import_Last(maTinh, maHuyen, maXa, thonXom,
			tenChuHo, idNguoiTao, orderByComparator);
	}

	/**
	* Returns the ve sinh gia dinhs before and after the current ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param id the primary key of the current ve sinh gia dinh
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ve sinh gia dinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh[] findByT_CHK_Import_PrevAndNext(
		int id, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException {
		return getPersistence()
				   .findByT_CHK_Import_PrevAndNext(id, maTinh, maHuyen, maXa,
			thonXom, tenChuHo, idNguoiTao, orderByComparator);
	}

	/**
	* Removes all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_CHK_Import(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String thonXom, java.lang.String tenChuHo, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByT_CHK_Import(maTinh, maHuyen, maXa, thonXom, tenChuHo,
			idNguoiTao);
	}

	/**
	* Returns the number of ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and thonXom = &#63; and tenChuHo = &#63; and idNguoiTao = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param thonXom the thon xom
	* @param tenChuHo the ten chu ho
	* @param idNguoiTao the id nguoi tao
	* @return the number of matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_CHK_Import(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String thonXom, java.lang.String tenChuHo, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByT_CHK_Import(maTinh, maHuyen, maXa, thonXom,
			tenChuHo, idNguoiTao);
	}

	/**
	* Returns all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param mauNgauNhien the mau ngau nhien
	* @return the matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_H_XMNN(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_H_XMNN(maTinh, maHuyen, maXa, mauNgauNhien);
	}

	/**
	* Returns a range of all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param mauNgauNhien the mau ngau nhien
	* @param start the lower bound of the range of ve sinh gia dinhs
	* @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	* @return the range of matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_H_XMNN(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_H_XMNN(maTinh, maHuyen, maXa, mauNgauNhien, start,
			end);
	}

	/**
	* Returns an ordered range of all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param mauNgauNhien the mau ngau nhien
	* @param start the lower bound of the range of ve sinh gia dinhs
	* @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_H_XMNN(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_H_XMNN(maTinh, maHuyen, maXa, mauNgauNhien, start,
			end, orderByComparator);
	}

	/**
	* Returns the first ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param mauNgauNhien the mau ngau nhien
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ve sinh gia dinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a matching ve sinh gia dinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByT_H_XMNN_First(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException {
		return getPersistence()
				   .findByT_H_XMNN_First(maTinh, maHuyen, maXa, mauNgauNhien,
			orderByComparator);
	}

	/**
	* Returns the first ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param mauNgauNhien the mau ngau nhien
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ve sinh gia dinh, or <code>null</code> if a matching ve sinh gia dinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByT_H_XMNN_First(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_H_XMNN_First(maTinh, maHuyen, maXa, mauNgauNhien,
			orderByComparator);
	}

	/**
	* Returns the last ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param mauNgauNhien the mau ngau nhien
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ve sinh gia dinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a matching ve sinh gia dinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByT_H_XMNN_Last(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException {
		return getPersistence()
				   .findByT_H_XMNN_Last(maTinh, maHuyen, maXa, mauNgauNhien,
			orderByComparator);
	}

	/**
	* Returns the last ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param mauNgauNhien the mau ngau nhien
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ve sinh gia dinh, or <code>null</code> if a matching ve sinh gia dinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByT_H_XMNN_Last(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_H_XMNN_Last(maTinh, maHuyen, maXa, mauNgauNhien,
			orderByComparator);
	}

	/**
	* Returns the ve sinh gia dinhs before and after the current ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	*
	* @param id the primary key of the current ve sinh gia dinh
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param mauNgauNhien the mau ngau nhien
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ve sinh gia dinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh[] findByT_H_XMNN_PrevAndNext(
		int id, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException {
		return getPersistence()
				   .findByT_H_XMNN_PrevAndNext(id, maTinh, maHuyen, maXa,
			mauNgauNhien, orderByComparator);
	}

	/**
	* Removes all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param mauNgauNhien the mau ngau nhien
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_H_XMNN(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa, int mauNgauNhien)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_H_XMNN(maTinh, maHuyen, maXa, mauNgauNhien);
	}

	/**
	* Returns the number of ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param mauNgauNhien the mau ngau nhien
	* @return the number of matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_H_XMNN(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa, int mauNgauNhien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByT_H_XMNN(maTinh, maHuyen, maXa, mauNgauNhien);
	}

	/**
	* Returns all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @return the matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_INKeHoach(
		java.lang.String maTinh, java.lang.String maHuyen, java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT_CHK_INKeHoach(maTinh, maHuyen, maXa);
	}

	/**
	* Returns a range of all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param start the lower bound of the range of ve sinh gia dinhs
	* @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	* @return the range of matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_INKeHoach(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_CHK_INKeHoach(maTinh, maHuyen, maXa, start, end);
	}

	/**
	* Returns an ordered range of all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param start the lower bound of the range of ve sinh gia dinhs
	* @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_INKeHoach(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByT_CHK_INKeHoach(maTinh, maHuyen, maXa, start, end,
			orderByComparator);
	}

	/**
	* Returns the first ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ve sinh gia dinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a matching ve sinh gia dinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByT_CHK_INKeHoach_First(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException {
		return getPersistence()
				   .findByT_CHK_INKeHoach_First(maTinh, maHuyen, maXa,
			orderByComparator);
	}

	/**
	* Returns the first ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ve sinh gia dinh, or <code>null</code> if a matching ve sinh gia dinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByT_CHK_INKeHoach_First(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_CHK_INKeHoach_First(maTinh, maHuyen, maXa,
			orderByComparator);
	}

	/**
	* Returns the last ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ve sinh gia dinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a matching ve sinh gia dinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByT_CHK_INKeHoach_Last(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException {
		return getPersistence()
				   .findByT_CHK_INKeHoach_Last(maTinh, maHuyen, maXa,
			orderByComparator);
	}

	/**
	* Returns the last ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ve sinh gia dinh, or <code>null</code> if a matching ve sinh gia dinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByT_CHK_INKeHoach_Last(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_CHK_INKeHoach_Last(maTinh, maHuyen, maXa,
			orderByComparator);
	}

	/**
	* Returns the ve sinh gia dinhs before and after the current ve sinh gia dinh in the ordered set where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	*
	* @param id the primary key of the current ve sinh gia dinh
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ve sinh gia dinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh[] findByT_CHK_INKeHoach_PrevAndNext(
		int id, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException {
		return getPersistence()
				   .findByT_CHK_INKeHoach_PrevAndNext(id, maTinh, maHuyen,
			maXa, orderByComparator);
	}

	/**
	* Removes all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT_CHK_INKeHoach(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT_CHK_INKeHoach(maTinh, maHuyen, maXa);
	}

	/**
	* Returns the number of ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @return the number of matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_CHK_INKeHoach(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_CHK_INKeHoach(maTinh, maHuyen, maXa);
	}

	/**
	* Caches the ve sinh gia dinh in the entity cache if it is enabled.
	*
	* @param veSinhGiaDinh the ve sinh gia dinh
	*/
	public static void cacheResult(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh veSinhGiaDinh) {
		getPersistence().cacheResult(veSinhGiaDinh);
	}

	/**
	* Caches the ve sinh gia dinhs in the entity cache if it is enabled.
	*
	* @param veSinhGiaDinhs the ve sinh gia dinhs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> veSinhGiaDinhs) {
		getPersistence().cacheResult(veSinhGiaDinhs);
	}

	/**
	* Creates a new ve sinh gia dinh with the primary key. Does not add the ve sinh gia dinh to the database.
	*
	* @param id the primary key for the new ve sinh gia dinh
	* @return the new ve sinh gia dinh
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the ve sinh gia dinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ve sinh gia dinh
	* @return the ve sinh gia dinh that was removed
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh veSinhGiaDinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(veSinhGiaDinh);
	}

	/**
	* Returns the ve sinh gia dinh with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException} if it could not be found.
	*
	* @param id the primary key of the ve sinh gia dinh
	* @return the ve sinh gia dinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the ve sinh gia dinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ve sinh gia dinh
	* @return the ve sinh gia dinh, or <code>null</code> if a ve sinh gia dinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the ve sinh gia dinhs.
	*
	* @return the ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ve sinh gia dinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ve sinh gia dinhs
	* @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	* @return the range of ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ve sinh gia dinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ve sinh gia dinhs
	* @param end the upper bound of the range of ve sinh gia dinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the ve sinh gia dinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ve sinh gia dinhs.
	*
	* @return the number of ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VeSinhGiaDinhPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VeSinhGiaDinhPersistence)PortletBeanLocatorUtil.locate(vn.dtt.sol.ns.vesinhmoitruong.dao.service.ClpSerializer.getServletContextName(),
					VeSinhGiaDinhPersistence.class.getName());

			ReferenceRegistry.registerReference(VeSinhGiaDinhUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(VeSinhGiaDinhPersistence persistence) {
	}

	private static VeSinhGiaDinhPersistence _persistence;
}