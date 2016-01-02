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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;

/**
 * The persistence interface for the ve sinh gia dinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see VeSinhGiaDinhPersistenceImpl
 * @see VeSinhGiaDinhUtil
 * @generated
 */
public interface VeSinhGiaDinhPersistence extends BasePersistence<VeSinhGiaDinh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VeSinhGiaDinhUtil} to access the ve sinh gia dinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_Import(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_Import(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_Import(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByT_CHK_Import_First(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByT_CHK_Import_First(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByT_CHK_Import_Last(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByT_CHK_Import_Last(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh[] findByT_CHK_Import_PrevAndNext(
		int id, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, java.lang.String thonXom,
		java.lang.String tenChuHo, int idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException;

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
	public void removeByT_CHK_Import(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String thonXom, java.lang.String tenChuHo, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByT_CHK_Import(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa,
		java.lang.String thonXom, java.lang.String tenChuHo, int idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_H_XMNN(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_H_XMNN(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_H_XMNN(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByT_H_XMNN_First(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByT_H_XMNN_First(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByT_H_XMNN_Last(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByT_H_XMNN_Last(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh[] findByT_H_XMNN_PrevAndNext(
		int id, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int mauNgauNhien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException;

	/**
	* Removes all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and mauNgauNhien = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @param mauNgauNhien the mau ngau nhien
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT_H_XMNN(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa, int mauNgauNhien)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByT_H_XMNN(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa, int mauNgauNhien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @return the matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_INKeHoach(
		java.lang.String maTinh, java.lang.String maHuyen, java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_INKeHoach(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findByT_CHK_INKeHoach(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByT_CHK_INKeHoach_First(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByT_CHK_INKeHoach_First(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByT_CHK_INKeHoach_Last(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByT_CHK_INKeHoach_Last(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh[] findByT_CHK_INKeHoach_PrevAndNext(
		int id, java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException;

	/**
	* Removes all the ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT_CHK_INKeHoach(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ve sinh gia dinhs where maTinh = &#63; and maHuyen = &#63; and maXa = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param maXa the ma xa
	* @return the number of matching ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByT_CHK_INKeHoach(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the ve sinh gia dinh in the entity cache if it is enabled.
	*
	* @param veSinhGiaDinh the ve sinh gia dinh
	*/
	public void cacheResult(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh veSinhGiaDinh);

	/**
	* Caches the ve sinh gia dinhs in the entity cache if it is enabled.
	*
	* @param veSinhGiaDinhs the ve sinh gia dinhs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> veSinhGiaDinhs);

	/**
	* Creates a new ve sinh gia dinh with the primary key. Does not add the ve sinh gia dinh to the database.
	*
	* @param id the primary key for the new ve sinh gia dinh
	* @return the new ve sinh gia dinh
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh create(int id);

	/**
	* Removes the ve sinh gia dinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ve sinh gia dinh
	* @return the ve sinh gia dinh that was removed
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException;

	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh veSinhGiaDinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ve sinh gia dinh with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException} if it could not be found.
	*
	* @param id the primary key of the ve sinh gia dinh
	* @return the ve sinh gia dinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException if a ve sinh gia dinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhGiaDinhException;

	/**
	* Returns the ve sinh gia dinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ve sinh gia dinh
	* @return the ve sinh gia dinh, or <code>null</code> if a ve sinh gia dinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ve sinh gia dinhs.
	*
	* @return the ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the ve sinh gia dinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ve sinh gia dinhs.
	*
	* @return the number of ve sinh gia dinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}