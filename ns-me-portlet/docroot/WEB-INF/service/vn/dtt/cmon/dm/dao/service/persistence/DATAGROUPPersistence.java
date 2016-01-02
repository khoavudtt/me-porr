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

package vn.dtt.cmon.dm.dao.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.cmon.dm.dao.model.DATAGROUP;

/**
 * The persistence interface for the d a t a g r o u p service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see DATAGROUPPersistenceImpl
 * @see DATAGROUPUtil
 * @generated
 */
public interface DATAGROUPPersistence extends BasePersistence<DATAGROUP> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DATAGROUPUtil} to access the d a t a g r o u p persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the d a t a g r o u p in the entity cache if it is enabled.
	*
	* @param datagroup the d a t a g r o u p
	*/
	public void cacheResult(vn.dtt.cmon.dm.dao.model.DATAGROUP datagroup);

	/**
	* Caches the d a t a g r o u ps in the entity cache if it is enabled.
	*
	* @param datagroups the d a t a g r o u ps
	*/
	public void cacheResult(
		java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> datagroups);

	/**
	* Creates a new d a t a g r o u p with the primary key. Does not add the d a t a g r o u p to the database.
	*
	* @param id the primary key for the new d a t a g r o u p
	* @return the new d a t a g r o u p
	*/
	public vn.dtt.cmon.dm.dao.model.DATAGROUP create(long id);

	/**
	* Removes the d a t a g r o u p with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the d a t a g r o u p
	* @return the d a t a g r o u p that was removed
	* @throws vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException if a d a t a g r o u p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.dm.dao.model.DATAGROUP remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException;

	public vn.dtt.cmon.dm.dao.model.DATAGROUP updateImpl(
		vn.dtt.cmon.dm.dao.model.DATAGROUP datagroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d a t a g r o u p with the primary key or throws a {@link vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException} if it could not be found.
	*
	* @param id the primary key of the d a t a g r o u p
	* @return the d a t a g r o u p
	* @throws vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException if a d a t a g r o u p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.dm.dao.model.DATAGROUP findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.dm.dao.NoSuchDATAGROUPException;

	/**
	* Returns the d a t a g r o u p with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the d a t a g r o u p
	* @return the d a t a g r o u p, or <code>null</code> if a d a t a g r o u p with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.dm.dao.model.DATAGROUP fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the d a t a g r o u ps.
	*
	* @return the d a t a g r o u ps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the d a t a g r o u ps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of d a t a g r o u ps
	* @param end the upper bound of the range of d a t a g r o u ps (not inclusive)
	* @return the range of d a t a g r o u ps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the d a t a g r o u ps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAGROUPModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of d a t a g r o u ps
	* @param end the upper bound of the range of d a t a g r o u ps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of d a t a g r o u ps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAGROUP> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the d a t a g r o u ps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d a t a g r o u ps.
	*
	* @return the number of d a t a g r o u ps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}