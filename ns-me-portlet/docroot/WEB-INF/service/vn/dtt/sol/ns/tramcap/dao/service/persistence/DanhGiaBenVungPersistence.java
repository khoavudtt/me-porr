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

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung;

/**
 * The persistence interface for the danh gia ben vung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see DanhGiaBenVungPersistenceImpl
 * @see DanhGiaBenVungUtil
 * @generated
 */
public interface DanhGiaBenVungPersistence extends BasePersistence<DanhGiaBenVung> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DanhGiaBenVungUtil} to access the danh gia ben vung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the danh gia ben vung where nam = &#63; and tramCapNuocId = &#63; or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException} if it could not be found.
	*
	* @param nam the nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching danh gia ben vung
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung findByN_(int nam,
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException;

	/**
	* Returns the danh gia ben vung where nam = &#63; and tramCapNuocId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param nam the nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching danh gia ben vung, or <code>null</code> if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung fetchByN_(int nam,
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the danh gia ben vung where nam = &#63; and tramCapNuocId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param nam the nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching danh gia ben vung, or <code>null</code> if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung fetchByN_(int nam,
		int tramCapNuocId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the danh gia ben vung where nam = &#63; and tramCapNuocId = &#63; from the database.
	*
	* @param nam the nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the danh gia ben vung that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung removeByN_(int nam,
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException;

	/**
	* Returns the number of danh gia ben vungs where nam = &#63; and tramCapNuocId = &#63;.
	*
	* @param nam the nam
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the number of matching danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public int countByN_(int nam, int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the danh gia ben vungs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the matching danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findByT_(
		int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the danh gia ben vungs where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of danh gia ben vungs
	* @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	* @return the range of matching danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findByT_(
		int tramCapNuocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the danh gia ben vungs where tramCapNuocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param start the lower bound of the range of danh gia ben vungs
	* @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findByT_(
		int tramCapNuocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia ben vung
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung findByT__First(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException;

	/**
	* Returns the first danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching danh gia ben vung, or <code>null</code> if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung fetchByT__First(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia ben vung
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung findByT__Last(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException;

	/**
	* Returns the last danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching danh gia ben vung, or <code>null</code> if a matching danh gia ben vung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung fetchByT__Last(
		int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the danh gia ben vungs before and after the current danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	*
	* @param id the primary key of the current danh gia ben vung
	* @param tramCapNuocId the tram cap nuoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next danh gia ben vung
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a danh gia ben vung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung[] findByT__PrevAndNext(
		long id, int tramCapNuocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException;

	/**
	* Removes all the danh gia ben vungs where tramCapNuocId = &#63; from the database.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of danh gia ben vungs where tramCapNuocId = &#63;.
	*
	* @param tramCapNuocId the tram cap nuoc ID
	* @return the number of matching danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public int countByT_(int tramCapNuocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the danh gia ben vung in the entity cache if it is enabled.
	*
	* @param danhGiaBenVung the danh gia ben vung
	*/
	public void cacheResult(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung danhGiaBenVung);

	/**
	* Caches the danh gia ben vungs in the entity cache if it is enabled.
	*
	* @param danhGiaBenVungs the danh gia ben vungs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> danhGiaBenVungs);

	/**
	* Creates a new danh gia ben vung with the primary key. Does not add the danh gia ben vung to the database.
	*
	* @param id the primary key for the new danh gia ben vung
	* @return the new danh gia ben vung
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung create(long id);

	/**
	* Removes the danh gia ben vung with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the danh gia ben vung
	* @return the danh gia ben vung that was removed
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a danh gia ben vung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException;

	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung danhGiaBenVung)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the danh gia ben vung with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException} if it could not be found.
	*
	* @param id the primary key of the danh gia ben vung
	* @return the danh gia ben vung
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a danh gia ben vung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException;

	/**
	* Returns the danh gia ben vung with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the danh gia ben vung
	* @return the danh gia ben vung, or <code>null</code> if a danh gia ben vung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the danh gia ben vungs.
	*
	* @return the danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the danh gia ben vungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia ben vungs
	* @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	* @return the range of danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the danh gia ben vungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of danh gia ben vungs
	* @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the danh gia ben vungs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of danh gia ben vungs.
	*
	* @return the number of danh gia ben vungs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}