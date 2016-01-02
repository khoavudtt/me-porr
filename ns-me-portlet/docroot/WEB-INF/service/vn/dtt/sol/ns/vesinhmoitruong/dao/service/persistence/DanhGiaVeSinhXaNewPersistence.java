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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew;

/**
 * The persistence interface for the danh gia ve sinh xa new service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see DanhGiaVeSinhXaNewPersistenceImpl
 * @see DanhGiaVeSinhXaNewUtil
 * @generated
 */
public interface DanhGiaVeSinhXaNewPersistence extends BasePersistence<DanhGiaVeSinhXaNew> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DanhGiaVeSinhXaNewUtil} to access the danh gia ve sinh xa new persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the danh gia ve sinh xa news where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findByF_MATINH(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findByF_MATINH(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findByF_MATINH(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia ve sinh xa new
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a matching danh gia ve sinh xa new could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew findByF_MATINH_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException;

	/**
	* Returns the first danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia ve sinh xa new, or <code>null</code> if a matching danh gia ve sinh xa new could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew fetchByF_MATINH_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia ve sinh xa new
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a matching danh gia ve sinh xa new could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew findByF_MATINH_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException;

	/**
	* Returns the last danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia ve sinh xa new, or <code>null</code> if a matching danh gia ve sinh xa new could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew fetchByF_MATINH_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew[] findByF_MATINH_PrevAndNext(
		int id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException;

	/**
	* Removes all the danh gia ve sinh xa news where maTinh = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @throws SystemException if a system exception occurred
	*/
	public void removeByF_MATINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of danh gia ve sinh xa news where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public int countByF_MATINH(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @return the matching danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findByF_T_H_N(
		java.lang.String maTinh, java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findByF_T_H_N(
		java.lang.String maTinh, java.lang.String maHuyen, int nam, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findByF_T_H_N(
		java.lang.String maTinh, java.lang.String maHuyen, int nam, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew findByF_T_H_N_First(
		java.lang.String maTinh, java.lang.String maHuyen, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew fetchByF_T_H_N_First(
		java.lang.String maTinh, java.lang.String maHuyen, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew findByF_T_H_N_Last(
		java.lang.String maTinh, java.lang.String maHuyen, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew fetchByF_T_H_N_Last(
		java.lang.String maTinh, java.lang.String maHuyen, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew[] findByF_T_H_N_PrevAndNext(
		int id, java.lang.String maTinh, java.lang.String maHuyen, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException;

	/**
	* Removes all the danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public void removeByF_T_H_N(java.lang.String maTinh,
		java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	*
	* @param maTinh the ma tinh
	* @param maHuyen the ma huyen
	* @param nam the nam
	* @return the number of matching danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public int countByF_T_H_N(java.lang.String maTinh,
		java.lang.String maHuyen, int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the danh gia ve sinh xa new in the entity cache if it is enabled.
	*
	* @param danhGiaVeSinhXaNew the danh gia ve sinh xa new
	*/
	public void cacheResult(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew danhGiaVeSinhXaNew);

	/**
	* Caches the danh gia ve sinh xa news in the entity cache if it is enabled.
	*
	* @param danhGiaVeSinhXaNews the danh gia ve sinh xa news
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> danhGiaVeSinhXaNews);

	/**
	* Creates a new danh gia ve sinh xa new with the primary key. Does not add the danh gia ve sinh xa new to the database.
	*
	* @param id the primary key for the new danh gia ve sinh xa new
	* @return the new danh gia ve sinh xa new
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew create(
		int id);

	/**
	* Removes the danh gia ve sinh xa new with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the danh gia ve sinh xa new
	* @return the danh gia ve sinh xa new that was removed
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a danh gia ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException;

	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew danhGiaVeSinhXaNew)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the danh gia ve sinh xa new with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException} if it could not be found.
	*
	* @param id the primary key of the danh gia ve sinh xa new
	* @return the danh gia ve sinh xa new
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a danh gia ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException;

	/**
	* Returns the danh gia ve sinh xa new with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the danh gia ve sinh xa new
	* @return the danh gia ve sinh xa new, or <code>null</code> if a danh gia ve sinh xa new with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the danh gia ve sinh xa news.
	*
	* @return the danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the danh gia ve sinh xa news from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of danh gia ve sinh xa news.
	*
	* @return the number of danh gia ve sinh xa news
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}