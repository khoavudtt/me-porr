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

import vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc;

/**
 * The persistence interface for the ke hoach kiem dem nuoc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see KeHoachKiemDemNuocPersistenceImpl
 * @see KeHoachKiemDemNuocUtil
 * @generated
 */
public interface KeHoachKiemDemNuocPersistence extends BasePersistence<KeHoachKiemDemNuoc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KeHoachKiemDemNuocUtil} to access the ke hoach kiem dem nuoc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the ke hoach kiem dem nuoc in the entity cache if it is enabled.
	*
	* @param keHoachKiemDemNuoc the ke hoach kiem dem nuoc
	*/
	public void cacheResult(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc keHoachKiemDemNuoc);

	/**
	* Caches the ke hoach kiem dem nuocs in the entity cache if it is enabled.
	*
	* @param keHoachKiemDemNuocs the ke hoach kiem dem nuocs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> keHoachKiemDemNuocs);

	/**
	* Creates a new ke hoach kiem dem nuoc with the primary key. Does not add the ke hoach kiem dem nuoc to the database.
	*
	* @param id the primary key for the new ke hoach kiem dem nuoc
	* @return the new ke hoach kiem dem nuoc
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc create(int id);

	/**
	* Removes the ke hoach kiem dem nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc that was removed
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException if a ke hoach kiem dem nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException;

	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc keHoachKiemDemNuoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ke hoach kiem dem nuoc with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException} if it could not be found.
	*
	* @param id the primary key of the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc
	* @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException if a ke hoach kiem dem nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachKiemDemNuocException;

	/**
	* Returns the ke hoach kiem dem nuoc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ke hoach kiem dem nuoc
	* @return the ke hoach kiem dem nuoc, or <code>null</code> if a ke hoach kiem dem nuoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ke hoach kiem dem nuocs.
	*
	* @return the ke hoach kiem dem nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ke hoach kiem dem nuocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach kiem dem nuocs
	* @param end the upper bound of the range of ke hoach kiem dem nuocs (not inclusive)
	* @return the range of ke hoach kiem dem nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ke hoach kiem dem nuocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ke hoach kiem dem nuocs
	* @param end the upper bound of the range of ke hoach kiem dem nuocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ke hoach kiem dem nuocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the ke hoach kiem dem nuocs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ke hoach kiem dem nuocs.
	*
	* @return the number of ke hoach kiem dem nuocs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}