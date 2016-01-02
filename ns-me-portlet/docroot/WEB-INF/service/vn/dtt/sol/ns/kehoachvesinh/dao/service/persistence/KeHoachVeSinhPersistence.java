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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh;

/**
 * The persistence interface for the ke hoach ve sinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HANT
 * @see KeHoachVeSinhPersistenceImpl
 * @see KeHoachVeSinhUtil
 * @generated
 */
public interface KeHoachVeSinhPersistence extends BasePersistence<KeHoachVeSinh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KeHoachVeSinhUtil} to access the ke hoach ve sinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the ke hoach ve sinh where id = &#63; or throws a {@link vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException} if it could not be found.
	*
	* @param id the ID
	* @return the matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_ID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the ke hoach ve sinh where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_ID(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach ve sinh where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_ID(
		long id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the ke hoach ve sinh where id = &#63; from the database.
	*
	* @param id the ID
	* @return the ke hoach ve sinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh removeBy_ID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the number of ke hoach ve sinhs where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_ID(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach ve sinhs where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @return the matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_N_T(
		long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_N_T(
		long idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_N_T(
		long idNguoiTao, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_N_T_First(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the first ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_N_T_First(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_N_T_Last(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the last ke hoach ve sinh in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_N_T_Last(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh[] findBy_N_T_PrevAndNext(
		long id, long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Removes all the ke hoach ve sinhs where idNguoiTao = &#63; from the database.
	*
	* @param idNguoiTao the id nguoi tao
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_N_T(long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach ve sinhs where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_N_T(long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach ve sinhs where nam = &#63;.
	*
	* @param nam the nam
	* @return the matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_Y(
		long nam) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_Y(
		long nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_Y(
		long nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach ve sinh in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_Y_First(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the first ke hoach ve sinh in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_Y_First(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach ve sinh in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_Y_Last(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the last ke hoach ve sinh in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_Y_Last(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh[] findBy_Y_PrevAndNext(
		long id, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Removes all the ke hoach ve sinhs where nam = &#63; from the database.
	*
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_Y(long nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach ve sinhs where nam = &#63;.
	*
	* @param nam the nam
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_Y(long nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach ve sinhs where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @return the matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_D_L_I(
		long baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_D_L_I(
		long baoCaoDLI, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_D_L_I(
		long baoCaoDLI, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_D_L_I_First(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the first ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_D_L_I_First(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_D_L_I_Last(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the last ke hoach ve sinh in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_D_L_I_Last(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh[] findBy_D_L_I_PrevAndNext(
		long id, long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Removes all the ke hoach ve sinhs where baoCaoDLI = &#63; from the database.
	*
	* @param baoCaoDLI the bao cao d l i
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_D_L_I(long baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach ve sinhs where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_D_L_I(long baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach ve sinhs where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_O_R_1(
		java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_O_R_1(
		java.lang.String maTinh, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_O_R_1(
		java.lang.String maTinh, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach ve sinh in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_O_R_1_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the first ke hoach ve sinh in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_O_R_1_First(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach ve sinh in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_O_R_1_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the last ke hoach ve sinh in the ordered set where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_O_R_1_Last(
		java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh[] findBy_O_R_1_PrevAndNext(
		long id, java.lang.String maTinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Removes all the ke hoach ve sinhs where maTinh = &#63; from the database.
	*
	* @param maTinh the ma tinh
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_O_R_1(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach ve sinhs where maTinh = &#63;.
	*
	* @param maTinh the ma tinh
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_O_R_1(java.lang.String maTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach ve sinhs where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @return the matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_O_R_2(
		java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_O_R_2(
		java.lang.String maHuyen, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_O_R_2(
		java.lang.String maHuyen, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_O_R_2_First(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the first ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_O_R_2_First(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_O_R_2_Last(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the last ke hoach ve sinh in the ordered set where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_O_R_2_Last(
		java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh[] findBy_O_R_2_PrevAndNext(
		long id, java.lang.String maHuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Removes all the ke hoach ve sinhs where maHuyen = &#63; from the database.
	*
	* @param maHuyen the ma huyen
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_O_R_2(java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach ve sinhs where maHuyen = &#63;.
	*
	* @param maHuyen the ma huyen
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_O_R_2(java.lang.String maHuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach ve sinhs where maXa = &#63;.
	*
	* @param maXa the ma xa
	* @return the matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_X_A(
		java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_X_A(
		java.lang.String maXa, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findBy_X_A(
		java.lang.String maXa, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach ve sinh in the ordered set where maXa = &#63;.
	*
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_X_A_First(
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the first ke hoach ve sinh in the ordered set where maXa = &#63;.
	*
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_X_A_First(
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach ve sinh in the ordered set where maXa = &#63;.
	*
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findBy_X_A_Last(
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the last ke hoach ve sinh in the ordered set where maXa = &#63;.
	*
	* @param maXa the ma xa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach ve sinh, or <code>null</code> if a matching ke hoach ve sinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchBy_X_A_Last(
		java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh[] findBy_X_A_PrevAndNext(
		long id, java.lang.String maXa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Removes all the ke hoach ve sinhs where maXa = &#63; from the database.
	*
	* @param maXa the ma xa
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_X_A(java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach ve sinhs where maXa = &#63;.
	*
	* @param maXa the ma xa
	* @return the number of matching ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_X_A(java.lang.String maXa)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the ke hoach ve sinh in the entity cache if it is enabled.
	*
	* @param keHoachVeSinh the ke hoach ve sinh
	*/
	public void cacheResult(
		vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh keHoachVeSinh);

	/**
	* Caches the ke hoach ve sinhs in the entity cache if it is enabled.
	*
	* @param keHoachVeSinhs the ke hoach ve sinhs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> keHoachVeSinhs);

	/**
	* Creates a new ke hoach ve sinh with the primary key. Does not add the ke hoach ve sinh to the database.
	*
	* @param id the primary key for the new ke hoach ve sinh
	* @return the new ke hoach ve sinh
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh create(long id);

	/**
	* Removes the ke hoach ve sinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach ve sinh
	* @return the ke hoach ve sinh that was removed
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh updateImpl(
		vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh keHoachVeSinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach ve sinh with the primary key or throws a {@link vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException} if it could not be found.
	*
	* @param id the primary key of the ke hoach ve sinh
	* @return the ke hoach ve sinh
	* @throws vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachvesinh.dao.NoSuchKeHoachVeSinhException;

	/**
	* Returns the ke hoach ve sinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ke hoach ve sinh
	* @return the ke hoach ve sinh, or <code>null</code> if a ke hoach ve sinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach ve sinhs.
	*
	* @return the ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the ke hoach ve sinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach ve sinhs.
	*
	* @return the number of ke hoach ve sinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}