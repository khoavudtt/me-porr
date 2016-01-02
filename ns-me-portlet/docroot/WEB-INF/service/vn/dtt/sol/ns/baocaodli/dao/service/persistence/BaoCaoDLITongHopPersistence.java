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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop;

/**
 * The persistence interface for the bao cao d l i tong hop service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HuyMQ
 * @see BaoCaoDLITongHopPersistenceImpl
 * @see BaoCaoDLITongHopUtil
 * @generated
 */
public interface BaoCaoDLITongHopPersistence extends BasePersistence<BaoCaoDLITongHop> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BaoCaoDLITongHopUtil} to access the bao cao d l i tong hop persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the bao cao d l i tong hop where maTinh = &#63; and nam = &#63; or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException} if it could not be found.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @return the matching bao cao d l i tong hop
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a matching bao cao d l i tong hop could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop findByMaTinh_Nam(
		java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException;

	/**
	* Returns the bao cao d l i tong hop where maTinh = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @return the matching bao cao d l i tong hop, or <code>null</code> if a matching bao cao d l i tong hop could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop fetchByMaTinh_Nam(
		java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bao cao d l i tong hop where maTinh = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching bao cao d l i tong hop, or <code>null</code> if a matching bao cao d l i tong hop could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop fetchByMaTinh_Nam(
		java.lang.String maTinh, int nam, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the bao cao d l i tong hop where maTinh = &#63; and nam = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @return the bao cao d l i tong hop that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop removeByMaTinh_Nam(
		java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException;

	/**
	* Returns the number of bao cao d l i tong hops where maTinh = &#63; and nam = &#63;.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @return the number of matching bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaTinh_Nam(java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bao cao d l i tong hops where nam = &#63;.
	*
	* @param nam the nam
	* @return the matching bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> findByNam(
		int nam) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the bao cao d l i tong hops where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of bao cao d l i tong hops
	* @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	* @return the range of matching bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> findByNam(
		int nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the bao cao d l i tong hops where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of bao cao d l i tong hops
	* @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> findByNam(
		int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bao cao d l i tong hop in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i tong hop
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a matching bao cao d l i tong hop could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop findByNam_First(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException;

	/**
	* Returns the first bao cao d l i tong hop in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i tong hop, or <code>null</code> if a matching bao cao d l i tong hop could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop fetchByNam_First(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bao cao d l i tong hop in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i tong hop
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a matching bao cao d l i tong hop could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop findByNam_Last(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException;

	/**
	* Returns the last bao cao d l i tong hop in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i tong hop, or <code>null</code> if a matching bao cao d l i tong hop could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop fetchByNam_Last(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bao cao d l i tong hops before and after the current bao cao d l i tong hop in the ordered set where nam = &#63;.
	*
	* @param id the primary key of the current bao cao d l i tong hop
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bao cao d l i tong hop
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a bao cao d l i tong hop with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop[] findByNam_PrevAndNext(
		long id, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException;

	/**
	* Removes all the bao cao d l i tong hops where nam = &#63; from the database.
	*
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNam(int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bao cao d l i tong hops where nam = &#63;.
	*
	* @param nam the nam
	* @return the number of matching bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public int countByNam(int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bao cao d l i tong hops where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> findByMaTinh(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the bao cao d l i tong hops where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of bao cao d l i tong hops
	* @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	* @return the range of matching bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> findByMaTinh(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the bao cao d l i tong hops where maTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTinh the ma tinh
	* @param start the lower bound of the range of bao cao d l i tong hops
	* @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> findByMaTinh(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bao cao d l i tong hop in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i tong hop
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a matching bao cao d l i tong hop could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop findByMaTinh_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException;

	/**
	* Returns the first bao cao d l i tong hop in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i tong hop, or <code>null</code> if a matching bao cao d l i tong hop could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop fetchByMaTinh_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bao cao d l i tong hop in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i tong hop
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a matching bao cao d l i tong hop could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop findByMaTinh_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException;

	/**
	* Returns the last bao cao d l i tong hop in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i tong hop, or <code>null</code> if a matching bao cao d l i tong hop could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop fetchByMaTinh_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bao cao d l i tong hops before and after the current bao cao d l i tong hop in the ordered set where maTinh = &#63;.
	*
	* @param id the primary key of the current bao cao d l i tong hop
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bao cao d l i tong hop
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a bao cao d l i tong hop with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop[] findByMaTinh_PrevAndNext(
		long id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException;

	/**
	* Removes all the bao cao d l i tong hops where maTinh = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMaTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bao cao d l i tong hops where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the bao cao d l i tong hop in the entity cache if it is enabled.
	*
	* @param baoCaoDLITongHop the bao cao d l i tong hop
	*/
	public void cacheResult(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop baoCaoDLITongHop);

	/**
	* Caches the bao cao d l i tong hops in the entity cache if it is enabled.
	*
	* @param baoCaoDLITongHops the bao cao d l i tong hops
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> baoCaoDLITongHops);

	/**
	* Creates a new bao cao d l i tong hop with the primary key. Does not add the bao cao d l i tong hop to the database.
	*
	* @param id the primary key for the new bao cao d l i tong hop
	* @return the new bao cao d l i tong hop
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop create(long id);

	/**
	* Removes the bao cao d l i tong hop with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bao cao d l i tong hop
	* @return the bao cao d l i tong hop that was removed
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a bao cao d l i tong hop with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException;

	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop updateImpl(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop baoCaoDLITongHop)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bao cao d l i tong hop with the primary key or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException} if it could not be found.
	*
	* @param id the primary key of the bao cao d l i tong hop
	* @return the bao cao d l i tong hop
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a bao cao d l i tong hop with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException;

	/**
	* Returns the bao cao d l i tong hop with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bao cao d l i tong hop
	* @return the bao cao d l i tong hop, or <code>null</code> if a bao cao d l i tong hop with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bao cao d l i tong hops.
	*
	* @return the bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the bao cao d l i tong hops.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bao cao d l i tong hops
	* @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	* @return the range of bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the bao cao d l i tong hops.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bao cao d l i tong hops
	* @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bao cao d l i tong hops from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bao cao d l i tong hops.
	*
	* @return the number of bao cao d l i tong hops
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}