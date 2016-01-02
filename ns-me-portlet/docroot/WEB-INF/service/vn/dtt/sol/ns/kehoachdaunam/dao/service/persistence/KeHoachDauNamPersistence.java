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

package vn.dtt.sol.ns.kehoachdaunam.dao.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam;

/**
 * The persistence interface for the ke hoach dau nam service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HANT
 * @see KeHoachDauNamPersistenceImpl
 * @see KeHoachDauNamUtil
 * @generated
 */
public interface KeHoachDauNamPersistence extends BasePersistence<KeHoachDauNam> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KeHoachDauNamUtil} to access the ke hoach dau nam persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the ke hoach dau nam where id = &#63; or throws a {@link vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException} if it could not be found.
	*
	* @param id the ID
	* @return the matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_ID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the ke hoach dau nam where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_ID(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach dau nam where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_ID(
		long id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the ke hoach dau nam where id = &#63; from the database.
	*
	* @param id the ID
	* @return the ke hoach dau nam that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam removeBy_ID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the number of ke hoach dau nams where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_ID(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach dau nams where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @return the matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_N_T(
		long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ke hoach dau nams where idNguoiTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param idNguoiTao the id nguoi tao
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_N_T(
		long idNguoiTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ke hoach dau nams where idNguoiTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param idNguoiTao the id nguoi tao
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_N_T(
		long idNguoiTao, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_N_T_First(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the first ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_N_T_First(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_N_T_Last(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the last ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_N_T_Last(
		long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where idNguoiTao = &#63;.
	*
	* @param id the primary key of the current ke hoach dau nam
	* @param idNguoiTao the id nguoi tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam[] findBy_N_T_PrevAndNext(
		long id, long idNguoiTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Removes all the ke hoach dau nams where idNguoiTao = &#63; from the database.
	*
	* @param idNguoiTao the id nguoi tao
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_N_T(long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach dau nams where idNguoiTao = &#63;.
	*
	* @param idNguoiTao the id nguoi tao
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_N_T(long idNguoiTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach dau nams where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_T_C_N(
		long tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ke hoach dau nams where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_T_C_N(
		long tramCapNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ke hoach dau nams where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_T_C_N(
		long tramCapNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_T_C_N_First(
		long tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the first ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_T_C_N_First(
		long tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_T_C_N_Last(
		long tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the last ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_T_C_N_Last(
		long tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where tramCapNuocId = &#63;.
	*
	* @param id the primary key of the current ke hoach dau nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam[] findBy_T_C_N_PrevAndNext(
		long id, long tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Removes all the ke hoach dau nams where tramCapNuocId = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_T_C_N(long tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach dau nams where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_T_C_N(long tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach dau nams where nam = &#63;.
	*
	* @param nam the nam
	* @return the matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_Y(
		long nam) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ke hoach dau nams where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_Y(
		long nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ke hoach dau nams where nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nam the nam
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_Y(
		long nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach dau nam in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_Y_First(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the first ke hoach dau nam in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_Y_First(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach dau nam in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_Y_Last(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the last ke hoach dau nam in the ordered set where nam = &#63;.
	*
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_Y_Last(
		long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where nam = &#63;.
	*
	* @param id the primary key of the current ke hoach dau nam
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam[] findBy_Y_PrevAndNext(
		long id, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Removes all the ke hoach dau nams where nam = &#63; from the database.
	*
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_Y(long nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach dau nams where nam = &#63;.
	*
	* @param nam the nam
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_Y(long nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @return the matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findByTramCap_Nam(
		long tramCapNuocId, long nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findByTramCap_Nam(
		long tramCapNuocId, long nam, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findByTramCap_Nam(
		long tramCapNuocId, long nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findByTramCap_Nam_First(
		long tramCapNuocId, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the first ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchByTramCap_Nam_First(
		long tramCapNuocId, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findByTramCap_Nam_Last(
		long tramCapNuocId, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the last ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchByTramCap_Nam_Last(
		long tramCapNuocId, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param id the primary key of the current ke hoach dau nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam[] findByTramCap_Nam_PrevAndNext(
		long id, long tramCapNuocId, long nam,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Removes all the ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTramCap_Nam(long tramCapNuocId, long nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach dau nams where tramCapNuocId = &#63; and nam = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param nam the nam
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public int countByTramCap_Nam(long tramCapNuocId, long nam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach dau nams where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @return the matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_D_L_I(
		long baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ke hoach dau nams where baoCaoDLI = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param baoCaoDLI the bao cao d l i
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_D_L_I(
		long baoCaoDLI, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ke hoach dau nams where baoCaoDLI = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param baoCaoDLI the bao cao d l i
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_D_L_I(
		long baoCaoDLI, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_D_L_I_First(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the first ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_D_L_I_First(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_D_L_I_Last(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the last ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_D_L_I_Last(
		long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where baoCaoDLI = &#63;.
	*
	* @param id the primary key of the current ke hoach dau nam
	* @param baoCaoDLI the bao cao d l i
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam[] findBy_D_L_I_PrevAndNext(
		long id, long baoCaoDLI,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Removes all the ke hoach dau nams where baoCaoDLI = &#63; from the database.
	*
	* @param baoCaoDLI the bao cao d l i
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_D_L_I(long baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach dau nams where baoCaoDLI = &#63;.
	*
	* @param baoCaoDLI the bao cao d l i
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_D_L_I(long baoCaoDLI)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach dau nams where ngayTao = &#63;.
	*
	* @param ngayTao the ngay tao
	* @return the matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_D(
		java.util.Date ngayTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ke hoach dau nams where ngayTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ngayTao the ngay tao
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_D(
		java.util.Date ngayTao, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ke hoach dau nams where ngayTao = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ngayTao the ngay tao
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findBy_D(
		java.util.Date ngayTao, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach dau nam in the ordered set where ngayTao = &#63;.
	*
	* @param ngayTao the ngay tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_D_First(
		java.util.Date ngayTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the first ke hoach dau nam in the ordered set where ngayTao = &#63;.
	*
	* @param ngayTao the ngay tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_D_First(
		java.util.Date ngayTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach dau nam in the ordered set where ngayTao = &#63;.
	*
	* @param ngayTao the ngay tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findBy_D_Last(
		java.util.Date ngayTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the last ke hoach dau nam in the ordered set where ngayTao = &#63;.
	*
	* @param ngayTao the ngay tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach dau nam, or <code>null</code> if a matching ke hoach dau nam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchBy_D_Last(
		java.util.Date ngayTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach dau nams before and after the current ke hoach dau nam in the ordered set where ngayTao = &#63;.
	*
	* @param id the primary key of the current ke hoach dau nam
	* @param ngayTao the ngay tao
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam[] findBy_D_PrevAndNext(
		long id, java.util.Date ngayTao,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Removes all the ke hoach dau nams where ngayTao = &#63; from the database.
	*
	* @param ngayTao the ngay tao
	* @throws SystemException if a system exception occurred
	*/
	public void removeBy_D(java.util.Date ngayTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach dau nams where ngayTao = &#63;.
	*
	* @param ngayTao the ngay tao
	* @return the number of matching ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public int countBy_D(java.util.Date ngayTao)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the ke hoach dau nam in the entity cache if it is enabled.
	*
	* @param keHoachDauNam the ke hoach dau nam
	*/
	public void cacheResult(
		vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam keHoachDauNam);

	/**
	* Caches the ke hoach dau nams in the entity cache if it is enabled.
	*
	* @param keHoachDauNams the ke hoach dau nams
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> keHoachDauNams);

	/**
	* Creates a new ke hoach dau nam with the primary key. Does not add the ke hoach dau nam to the database.
	*
	* @param id the primary key for the new ke hoach dau nam
	* @return the new ke hoach dau nam
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam create(long id);

	/**
	* Removes the ke hoach dau nam with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach dau nam
	* @return the ke hoach dau nam that was removed
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam updateImpl(
		vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam keHoachDauNam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach dau nam with the primary key or throws a {@link vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException} if it could not be found.
	*
	* @param id the primary key of the ke hoach dau nam
	* @return the ke hoach dau nam
	* @throws vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.kehoachdaunam.dao.NoSuchKeHoachDauNamException;

	/**
	* Returns the ke hoach dau nam with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ke hoach dau nam
	* @return the ke hoach dau nam, or <code>null</code> if a ke hoach dau nam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach dau nams.
	*
	* @return the ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ke hoach dau nams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @return the range of ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ke hoach dau nams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach dau nams
	* @param end the upper bound of the range of ke hoach dau nams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the ke hoach dau nams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach dau nams.
	*
	* @return the number of ke hoach dau nams
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}