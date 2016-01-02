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

package vn.dtt.sol.ns.tramcap.dao.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach;

/**
 * The persistence interface for the ke hoach nuoc sach service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see KeHoachNuocSachPersistenceImpl
 * @see KeHoachNuocSachUtil
 * @generated
 */
public interface KeHoachNuocSachPersistence extends BasePersistence<KeHoachNuocSach> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KeHoachNuocSachUtil} to access the ke hoach nuoc sach persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ke hoach nuoc sachs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> findByT_(
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ke hoach nuoc sachs where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of ke hoach nuoc sachs
	* @param end the upper bound of the range of ke hoach nuoc sachs (not inclusive)
	* @return the range of matching ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> findByT_(
		int tramCapNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ke hoach nuoc sachs where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of ke hoach nuoc sachs
	* @param end the upper bound of the range of ke hoach nuoc sachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> findByT_(
		int tramCapNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach nuoc sach
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a matching ke hoach nuoc sach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach findByT__First(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException;

	/**
	* Returns the first ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ke hoach nuoc sach, or <code>null</code> if a matching ke hoach nuoc sach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach fetchByT__First(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach nuoc sach
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a matching ke hoach nuoc sach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach findByT__Last(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException;

	/**
	* Returns the last ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ke hoach nuoc sach, or <code>null</code> if a matching ke hoach nuoc sach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach fetchByT__Last(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach nuoc sachs before and after the current ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	*
	* @param id the primary key of the current ke hoach nuoc sach
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ke hoach nuoc sach
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a ke hoach nuoc sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach[] findByT__PrevAndNext(
		long id, int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException;

	/**
	* Removes all the ke hoach nuoc sachs where tramCapNuocId = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach nuoc sachs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the number of matching ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public int countByT_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the ke hoach nuoc sach in the entity cache if it is enabled.
	*
	* @param keHoachNuocSach the ke hoach nuoc sach
	*/
	public void cacheResult(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach keHoachNuocSach);

	/**
	* Caches the ke hoach nuoc sachs in the entity cache if it is enabled.
	*
	* @param keHoachNuocSachs the ke hoach nuoc sachs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> keHoachNuocSachs);

	/**
	* Creates a new ke hoach nuoc sach with the primary key. Does not add the ke hoach nuoc sach to the database.
	*
	* @param id the primary key for the new ke hoach nuoc sach
	* @return the new ke hoach nuoc sach
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach create(long id);

	/**
	* Removes the ke hoach nuoc sach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach nuoc sach
	* @return the ke hoach nuoc sach that was removed
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a ke hoach nuoc sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException;

	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach keHoachNuocSach)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach nuoc sach with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException} if it could not be found.
	*
	* @param id the primary key of the ke hoach nuoc sach
	* @return the ke hoach nuoc sach
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a ke hoach nuoc sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException;

	/**
	* Returns the ke hoach nuoc sach with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ke hoach nuoc sach
	* @return the ke hoach nuoc sach, or <code>null</code> if a ke hoach nuoc sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach nuoc sachs.
	*
	* @return the ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ke hoach nuoc sachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach nuoc sachs
	* @param end the upper bound of the range of ke hoach nuoc sachs (not inclusive)
	* @return the range of ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ke hoach nuoc sachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach nuoc sachs
	* @param end the upper bound of the range of ke hoach nuoc sachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the ke hoach nuoc sachs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach nuoc sachs.
	*
	* @return the number of ke hoach nuoc sachs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}