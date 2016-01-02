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

package vn.dtt.cmon.user.dao.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.cmon.user.dao.model.UserMapping;

/**
 * The persistence interface for the user mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see UserMappingPersistenceImpl
 * @see UserMappingUtil
 * @generated
 */
public interface UserMappingPersistence extends BasePersistence<UserMapping> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserMappingUtil} to access the user mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the user mappings where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @return the matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_1(
		java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings where orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_1(
		java.lang.String orgCode1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings where orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_1(
		java.lang.String orgCode1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user mapping in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByO_C_1_First(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the first user mapping in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByO_C_1_First(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user mapping in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByO_C_1_Last(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the last user mapping in the ordered set where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByO_C_1_Last(
		java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set where orgCode1 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping[] findByO_C_1_PrevAndNext(
		long id, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns all the user mappings that the user has permission to view where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @return the matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_1(
		java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings that the user has permission to view where orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_1(
		java.lang.String orgCode1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings that the user has permissions to view where orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_1(
		java.lang.String orgCode1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where orgCode1 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping[] filterFindByO_C_1_PrevAndNext(
		long id, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Removes all the user mappings where orgCode1 = &#63; from the database.
	*
	* @param orgCode1 the org code1
	* @throws SystemException if a system exception occurred
	*/
	public void removeByO_C_1(java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByO_C_1(java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings that the user has permission to view where orgCode1 = &#63;.
	*
	* @param orgCode1 the org code1
	* @return the number of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByO_C_1(java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user mappings where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByO_C_1_O_C_2_First(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the first user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByO_C_1_O_C_2_First(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByO_C_1_O_C_2_Last(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the last user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByO_C_1_O_C_2_Last(
		java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping[] findByO_C_1_O_C_2_PrevAndNext(
		long id, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns all the user mappings that the user has permission to view where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings that the user has permission to view where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings that the user has permissions to view where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_1_O_C_2(
		java.lang.String orgCode1, java.lang.String orgCode2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping[] filterFindByO_C_1_O_C_2_PrevAndNext(
		long id, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Removes all the user mappings where orgCode1 = &#63; and orgCode2 = &#63; from the database.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public void removeByO_C_1_O_C_2(java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByO_C_1_O_C_2(java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings that the user has permission to view where orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the number of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByO_C_1_O_C_2(java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user mappings where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @return the matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_2(
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings where orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_2(
		java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings where orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByO_C_2(
		java.lang.String orgCode2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user mapping in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByO_C_2_First(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the first user mapping in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByO_C_2_First(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user mapping in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByO_C_2_Last(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the last user mapping in the ordered set where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByO_C_2_Last(
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set where orgCode2 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping[] findByO_C_2_PrevAndNext(
		long id, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns all the user mappings that the user has permission to view where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @return the matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_2(
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings that the user has permission to view where orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_2(
		java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings that the user has permissions to view where orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByO_C_2(
		java.lang.String orgCode2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where orgCode2 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping[] filterFindByO_C_2_PrevAndNext(
		long id, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Removes all the user mappings where orgCode2 = &#63; from the database.
	*
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public void removeByO_C_2(java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByO_C_2(java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings that the user has permission to view where orgCode2 = &#63;.
	*
	* @param orgCode2 the org code2
	* @return the number of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByO_C_2(java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user mappings where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @return the matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByT_O_C_1(
		int userType, java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings where userType = &#63; and orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByT_O_C_1(
		int userType, java.lang.String orgCode1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings where userType = &#63; and orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByT_O_C_1(
		int userType, java.lang.String orgCode1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByT_O_C_1_First(
		int userType, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the first user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByT_O_C_1_First(
		int userType, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByT_O_C_1_Last(
		int userType, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the last user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByT_O_C_1_Last(
		int userType, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping[] findByT_O_C_1_PrevAndNext(
		long id, int userType, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns all the user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @return the matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByT_O_C_1(
		int userType, java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByT_O_C_1(
		int userType, java.lang.String orgCode1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings that the user has permissions to view where userType = &#63; and orgCode1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByT_O_C_1(
		int userType, java.lang.String orgCode1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping[] filterFindByT_O_C_1_PrevAndNext(
		long id, int userType, java.lang.String orgCode1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Removes all the user mappings where userType = &#63; and orgCode1 = &#63; from the database.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT_O_C_1(int userType, java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByT_O_C_1(int userType, java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @return the number of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByT_O_C_1(int userType, java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByT_O_C_2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByT_O_C_2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByT_O_C_2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByT_O_C_2_First(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the first user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByT_O_C_2_First(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByT_O_C_2_Last(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the last user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByT_O_C_2_Last(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping[] findByT_O_C_2_PrevAndNext(
		long id, int userType, java.lang.String orgCode1,
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns all the user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByT_O_C_2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByT_O_C_2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings that the user has permissions to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByT_O_C_2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping[] filterFindByT_O_C_2_PrevAndNext(
		long id, int userType, java.lang.String orgCode1,
		java.lang.String orgCode2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Removes all the user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63; from the database.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT_O_C_2(int userType, java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByT_O_C_2(int userType, java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	*
	* @param userType the user type
	* @param orgCode1 the org code1
	* @param orgCode2 the org code2
	* @return the number of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByT_O_C_2(int userType, java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user mappings where userType = &#63;.
	*
	* @param userType the user type
	* @return the matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByU_T(
		int userType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings where userType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByU_T(
		int userType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings where userType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findByU_T(
		int userType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user mapping in the ordered set where userType = &#63;.
	*
	* @param userType the user type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByU_T_First(
		int userType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the first user mapping in the ordered set where userType = &#63;.
	*
	* @param userType the user type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByU_T_First(
		int userType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user mapping in the ordered set where userType = &#63;.
	*
	* @param userType the user type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByU_T_Last(int userType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the last user mapping in the ordered set where userType = &#63;.
	*
	* @param userType the user type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByU_T_Last(
		int userType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set where userType = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param userType the user type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping[] findByU_T_PrevAndNext(
		long id, int userType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns all the user mappings that the user has permission to view where userType = &#63;.
	*
	* @param userType the user type
	* @return the matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByU_T(
		int userType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings that the user has permission to view where userType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByU_T(
		int userType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings that the user has permissions to view where userType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userType the user type
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> filterFindByU_T(
		int userType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where userType = &#63;.
	*
	* @param id the primary key of the current user mapping
	* @param userType the user type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping[] filterFindByU_T_PrevAndNext(
		long id, int userType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Removes all the user mappings where userType = &#63; from the database.
	*
	* @param userType the user type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU_T(int userType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings where userType = &#63;.
	*
	* @param userType the user type
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_T(int userType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings that the user has permission to view where userType = &#63;.
	*
	* @param userType the user type
	* @return the number of matching user mappings that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByU_T(int userType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mapping where userId = &#63; or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserMappingException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByU_M(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the user mapping where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByU_M(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mapping where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user mapping, or <code>null</code> if a matching user mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByU_M(long userId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the user mapping where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the user mapping that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping removeByU_M(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the number of user mappings where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_M(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the user mapping in the entity cache if it is enabled.
	*
	* @param userMapping the user mapping
	*/
	public void cacheResult(vn.dtt.cmon.user.dao.model.UserMapping userMapping);

	/**
	* Caches the user mappings in the entity cache if it is enabled.
	*
	* @param userMappings the user mappings
	*/
	public void cacheResult(
		java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> userMappings);

	/**
	* Creates a new user mapping with the primary key. Does not add the user mapping to the database.
	*
	* @param id the primary key for the new user mapping
	* @return the new user mapping
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping create(long id);

	/**
	* Removes the user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user mapping
	* @return the user mapping that was removed
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	public vn.dtt.cmon.user.dao.model.UserMapping updateImpl(
		vn.dtt.cmon.user.dao.model.UserMapping userMapping)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user mapping with the primary key or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserMappingException} if it could not be found.
	*
	* @param id the primary key of the user mapping
	* @return the user mapping
	* @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.cmon.user.dao.NoSuchUserMappingException;

	/**
	* Returns the user mapping with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user mapping
	* @return the user mapping, or <code>null</code> if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.cmon.user.dao.model.UserMapping fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user mappings.
	*
	* @return the user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @return the range of user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user mappings
	* @param end the upper bound of the range of user mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the user mappings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user mappings.
	*
	* @return the number of user mappings
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}