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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM;

/**
 * The persistence interface for the m a u k i e m d e m service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see MAUKIEMDEMPersistenceImpl
 * @see MAUKIEMDEMUtil
 * @generated
 */
public interface MAUKIEMDEMPersistence extends BasePersistence<MAUKIEMDEM> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MAUKIEMDEMUtil} to access the m a u k i e m d e m persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

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
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM findByT_H_X_N(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException;

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
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByT_H_X_N(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByT_H_X_N(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM removeByT_H_X_N(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, int nam)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException;

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
	public int countByT_H_X_N(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa, int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the m a u k i e m d e ms where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findByT_(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findByT_(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findByT_(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first m a u k i e m d e m in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM findByT__First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException;

	/**
	* Returns the first m a u k i e m d e m in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByT__First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last m a u k i e m d e m in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM findByT__Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException;

	/**
	* Returns the last m a u k i e m d e m in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByT__Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM[] findByT__PrevAndNext(
		long id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException;

	/**
	* Removes all the m a u k i e m d e ms where maTinh = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT_(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of m a u k i e m d e ms where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public int countByT_(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the m a u k i e m d e ms where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @return the matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findByH_(
		java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findByH_(
		java.lang.String maHuyen, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findByH_(
		java.lang.String maHuyen, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM findByH__First(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException;

	/**
	* Returns the first m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByH__First(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM findByH__Last(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException;

	/**
	* Returns the last m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByH__Last(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM[] findByH__PrevAndNext(
		long id, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException;

	/**
	* Removes all the m a u k i e m d e ms where maHuyen = &#63; from the database.
	*
	* @param maHuyen the ma huyen
	* @throws SystemException if a system exception occurred
	*/
	public void removeByH_(java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of m a u k i e m d e ms where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @return the number of matching m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public int countByH_(java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the m a u k i e m d e m in the entity cache if it is enabled.
	*
	* @param maukiemdem the m a u k i e m d e m
	*/
	public void cacheResult(
		vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM maukiemdem);

	/**
	* Caches the m a u k i e m d e ms in the entity cache if it is enabled.
	*
	* @param maukiemdems the m a u k i e m d e ms
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> maukiemdems);

	/**
	* Creates a new m a u k i e m d e m with the primary key. Does not add the m a u k i e m d e m to the database.
	*
	* @param id the primary key for the new m a u k i e m d e m
	* @return the new m a u k i e m d e m
	*/
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM create(long id);

	/**
	* Removes the m a u k i e m d e m with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the m a u k i e m d e m
	* @return the m a u k i e m d e m that was removed
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a m a u k i e m d e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException;

	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM updateImpl(
		vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM maukiemdem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the m a u k i e m d e m with the primary key or throws a {@link vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException} if it could not be found.
	*
	* @param id the primary key of the m a u k i e m d e m
	* @return the m a u k i e m d e m
	* @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a m a u k i e m d e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException;

	/**
	* Returns the m a u k i e m d e m with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the m a u k i e m d e m
	* @return the m a u k i e m d e m, or <code>null</code> if a m a u k i e m d e m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the m a u k i e m d e ms.
	*
	* @return the m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the m a u k i e m d e ms from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of m a u k i e m d e ms.
	*
	* @return the number of m a u k i e m d e ms
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}