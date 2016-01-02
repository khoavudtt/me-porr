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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh;

/**
 * The persistence interface for the ve sinh cong trinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see VeSinhCongTrinhPersistenceImpl
 * @see VeSinhCongTrinhUtil
 * @generated
 */
public interface VeSinhCongTrinhPersistence extends BasePersistence<VeSinhCongTrinh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VeSinhCongTrinhUtil} to access the ve sinh cong trinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the ve sinh cong trinh in the entity cache if it is enabled.
	*
	* @param veSinhCongTrinh the ve sinh cong trinh
	*/
	public void cacheResult(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh veSinhCongTrinh);

	/**
	* Caches the ve sinh cong trinhs in the entity cache if it is enabled.
	*
	* @param veSinhCongTrinhs the ve sinh cong trinhs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh> veSinhCongTrinhs);

	/**
	* Creates a new ve sinh cong trinh with the primary key. Does not add the ve sinh cong trinh to the database.
	*
	* @param id the primary key for the new ve sinh cong trinh
	* @return the new ve sinh cong trinh
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh create(
		int id);

	/**
	* Removes the ve sinh cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ve sinh cong trinh
	* @return the ve sinh cong trinh that was removed
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException if a ve sinh cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException;

	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh veSinhCongTrinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ve sinh cong trinh with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException} if it could not be found.
	*
	* @param id the primary key of the ve sinh cong trinh
	* @return the ve sinh cong trinh
	* @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException if a ve sinh cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchVeSinhCongTrinhException;

	/**
	* Returns the ve sinh cong trinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ve sinh cong trinh
	* @return the ve sinh cong trinh, or <code>null</code> if a ve sinh cong trinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ve sinh cong trinhs.
	*
	* @return the ve sinh cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ve sinh cong trinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ve sinh cong trinhs
	* @param end the upper bound of the range of ve sinh cong trinhs (not inclusive)
	* @return the range of ve sinh cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ve sinh cong trinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ve sinh cong trinhs
	* @param end the upper bound of the range of ve sinh cong trinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ve sinh cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the ve sinh cong trinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ve sinh cong trinhs.
	*
	* @return the number of ve sinh cong trinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}