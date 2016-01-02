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

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI;

/**
 * The persistence interface for the bao cao d l i service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HuyMQ
 * @see BaoCaoDLIPersistenceImpl
 * @see BaoCaoDLIUtil
 * @generated
 */
public interface BaoCaoDLIPersistence extends BasePersistence<BaoCaoDLI> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BaoCaoDLIUtil} to access the bao cao d l i persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the bao cao d l i where id = &#63; or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException} if it could not be found.
	*
	* @param id the ID
	* @return the matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByID(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the bao cao d l i where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByID(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bao cao d l i where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByID(long id,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the bao cao d l i where id = &#63; from the database.
	*
	* @param id the ID
	* @return the bao cao d l i that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI removeByID(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the number of bao cao d l is where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public int countByID(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bao cao d l i where maTinh = &#63; and nam = &#63; or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException} if it could not be found.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @return the matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByMaTinh_Nam(
		java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the bao cao d l i where maTinh = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByMaTinh_Nam(
		java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bao cao d l i where maTinh = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByMaTinh_Nam(
		java.lang.String maTinh, int nam, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the bao cao d l i where maTinh = &#63; and nam = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @return the bao cao d l i that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI removeByMaTinh_Nam(
		java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the number of bao cao d l is where maTinh = &#63; and nam = &#63;.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @return the number of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaTinh_Nam(java.lang.String maTinh, int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByMaTinh_Nam_LoaiBaoCao(
		java.lang.String maTinh, int nam, int loaiBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the bao cao d l i where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @param loaiBaoCao the loai bao cao
	* @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByMaTinh_Nam_LoaiBaoCao(
		java.lang.String maTinh, int nam, int loaiBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByMaTinh_Nam_LoaiBaoCao(
		java.lang.String maTinh, int nam, int loaiBaoCao,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the bao cao d l i where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @param loaiBaoCao the loai bao cao
	* @return the bao cao d l i that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI removeByMaTinh_Nam_LoaiBaoCao(
		java.lang.String maTinh, int nam, int loaiBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the number of bao cao d l is where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63;.
	*
	* @param maTinh the ma tinh
	* @param nam the nam
	* @param loaiBaoCao the loai bao cao
	* @return the number of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaTinh_Nam_LoaiBaoCao(java.lang.String maTinh, int nam,
		int loaiBaoCao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bao cao d l is where nam = &#63;.
	*
	* @param nam the nam
	* @return the matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByNam(
		int nam) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByNam(
		int nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByNam(
		int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bao cao d l i in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByNam_First(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the first bao cao d l i in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByNam_First(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bao cao d l i in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByNam_Last(int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the last bao cao d l i in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByNam_Last(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI[] findByNam_PrevAndNext(
		long id, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns all the bao cao d l is that the user has permission to view where nam = &#63;.
	*
	* @param nam the nam
	* @return the matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByNam(
		int nam) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByNam(
		int nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByNam(
		int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI[] filterFindByNam_PrevAndNext(
		long id, int nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Removes all the bao cao d l is where nam = &#63; from the database.
	*
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNam(int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bao cao d l is where nam = &#63;.
	*
	* @param nam the nam
	* @return the number of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public int countByNam(int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bao cao d l is that the user has permission to view where nam = &#63;.
	*
	* @param nam the nam
	* @return the number of matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByNam(int nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bao cao d l is where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByMaTinh(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByMaTinh(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByMaTinh(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bao cao d l i in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByMaTinh_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the first bao cao d l i in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByMaTinh_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bao cao d l i in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByMaTinh_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the last bao cao d l i in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByMaTinh_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI[] findByMaTinh_PrevAndNext(
		long id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns all the bao cao d l is that the user has permission to view where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByMaTinh(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByMaTinh(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByMaTinh(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI[] filterFindByMaTinh_PrevAndNext(
		long id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Removes all the bao cao d l is where maTinh = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMaTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bao cao d l is where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bao cao d l is that the user has permission to view where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByMaTinh(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bao cao d l is where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByTrangThai(
		int trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByTrangThai(
		int trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findByTrangThai(
		int trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first bao cao d l i in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByTrangThai_First(
		int trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the first bao cao d l i in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByTrangThai_First(
		int trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last bao cao d l i in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByTrangThai_Last(
		int trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the last bao cao d l i in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByTrangThai_Last(
		int trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI[] findByTrangThai_PrevAndNext(
		long id, int trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns all the bao cao d l is that the user has permission to view where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByTrangThai(
		int trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByTrangThai(
		int trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> filterFindByTrangThai(
		int trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI[] filterFindByTrangThai_PrevAndNext(
		long id, int trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Removes all the bao cao d l is where trangThai = &#63; from the database.
	*
	* @param trangThai the trang thai
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTrangThai(int trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bao cao d l is where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the number of matching bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public int countByTrangThai(int trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bao cao d l is that the user has permission to view where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the number of matching bao cao d l is that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByTrangThai(int trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the bao cao d l i in the entity cache if it is enabled.
	*
	* @param baoCaoDLI the bao cao d l i
	*/
	public void cacheResult(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI baoCaoDLI);

	/**
	* Caches the bao cao d l is in the entity cache if it is enabled.
	*
	* @param baoCaoDLIs the bao cao d l is
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> baoCaoDLIs);

	/**
	* Creates a new bao cao d l i with the primary key. Does not add the bao cao d l i to the database.
	*
	* @param id the primary key for the new bao cao d l i
	* @return the new bao cao d l i
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI create(long id);

	/**
	* Removes the bao cao d l i with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bao cao d l i
	* @return the bao cao d l i that was removed
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI updateImpl(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bao cao d l i with the primary key or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException} if it could not be found.
	*
	* @param id the primary key of the bao cao d l i
	* @return the bao cao d l i
	* @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;

	/**
	* Returns the bao cao d l i with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bao cao d l i
	* @return the bao cao d l i, or <code>null</code> if a bao cao d l i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bao cao d l is.
	*
	* @return the bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bao cao d l is from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bao cao d l is.
	*
	* @return the number of bao cao d l is
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}