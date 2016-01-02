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

package vn.dtt.cmon.user.dao.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserTramCapLocalService}.
 *
 * @author khoa.vu
 * @see UserTramCapLocalService
 * @generated
 */
public class UserTramCapLocalServiceWrapper implements UserTramCapLocalService,
	ServiceWrapper<UserTramCapLocalService> {
	public UserTramCapLocalServiceWrapper(
		UserTramCapLocalService userTramCapLocalService) {
		_userTramCapLocalService = userTramCapLocalService;
	}

	/**
	* Adds the user tram cap to the database. Also notifies the appropriate model listeners.
	*
	* @param userTramCap the user tram cap
	* @return the user tram cap that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserTramCap addUserTramCap(
		vn.dtt.cmon.user.dao.model.UserTramCap userTramCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.addUserTramCap(userTramCap);
	}

	/**
	* Creates a new user tram cap with the primary key. Does not add the user tram cap to the database.
	*
	* @param id the primary key for the new user tram cap
	* @return the new user tram cap
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserTramCap createUserTramCap(long id) {
		return _userTramCapLocalService.createUserTramCap(id);
	}

	/**
	* Deletes the user tram cap with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user tram cap
	* @return the user tram cap that was removed
	* @throws PortalException if a user tram cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserTramCap deleteUserTramCap(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.deleteUserTramCap(id);
	}

	/**
	* Deletes the user tram cap from the database. Also notifies the appropriate model listeners.
	*
	* @param userTramCap the user tram cap
	* @return the user tram cap that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserTramCap deleteUserTramCap(
		vn.dtt.cmon.user.dao.model.UserTramCap userTramCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.deleteUserTramCap(userTramCap);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userTramCapLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserTramCap fetchUserTramCap(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.fetchUserTramCap(id);
	}

	/**
	* Returns the user tram cap with the primary key.
	*
	* @param id the primary key of the user tram cap
	* @return the user tram cap
	* @throws PortalException if a user tram cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserTramCap getUserTramCap(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.getUserTramCap(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user tram caps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user tram caps
	* @param end the upper bound of the range of user tram caps (not inclusive)
	* @return the range of user tram caps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> getUserTramCaps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.getUserTramCaps(start, end);
	}

	/**
	* Returns the number of user tram caps.
	*
	* @return the number of user tram caps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUserTramCapsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.getUserTramCapsCount();
	}

	/**
	* Updates the user tram cap in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userTramCap the user tram cap
	* @return the user tram cap that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserTramCap updateUserTramCap(
		vn.dtt.cmon.user.dao.model.UserTramCap userTramCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.updateUserTramCap(userTramCap);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _userTramCapLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userTramCapLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _userTramCapLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findHuyenInTramCaoByUser(
		java.lang.String maTinh, long maTramCap, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.findHuyenInTramCaoByUser(maTinh,
			maTramCap, userId, start, end);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findXaInHuyenInTramCapByUser(
		java.lang.String maTinh, java.lang.String maHuyen, long maTramCap,
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.findXaInHuyenInTramCapByUser(maTinh,
			maHuyen, maTramCap, userId, start, end);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findXaKhongInHuyenInTramCapByUser(
		java.lang.String maTinh, java.lang.String maHuyen, long maTramCap,
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.findXaKhongInHuyenInTramCapByUser(maTinh,
			maHuyen, maTramCap, userId, start, end);
	}

	/**
	* Xoa UserTramCap
	*
	* @param maTinh
	* @param maHuyen
	* @param maXa
	* @param maTramCap
	* @param userId
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public void delUserTramCap(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa, long maTramCap,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userTramCapLocalService.delUserTramCap(maTinh, maHuyen, maXa,
			maTramCap, userId);
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserTramCap addTramCap(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, long maTramCap, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.addTramCap(maTinh, maHuyen, maXa,
			maTramCap, userId);
	}

	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> getDiaBanByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.getDiaBanByUserId(userId);
	}

	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserTramCap> getDiaBanByUserId(
		long userId, long maTramCap)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.getDiaBanByUserId(userId, maTramCap);
	}

	@Override
	public java.util.List<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> findTramCapByUserId(
		java.lang.String maTinh, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.findTramCapByUserId(maTinh, userId,
			start, end);
	}

	@Override
	public int countTramCapByUser(java.lang.String maTinh, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.countTramCapByUser(maTinh, userId);
	}

	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> findUserInTramCap(
		java.lang.String maTinh, java.lang.String maTramCap, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.findUserInTramCap(maTinh, maTramCap,
			start, end);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findHuyenInTramCap(
		java.lang.String maTinh, long maTramCap, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.findHuyenInTramCap(maTinh, maTramCap,
			start, end);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findXaInHuyenAndTramCap(
		java.lang.String maTinh, java.lang.String maHuyen, long maTramCap,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userTramCapLocalService.findXaInHuyenAndTramCap(maTinh,
			maHuyen, maTramCap, start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UserTramCapLocalService getWrappedUserTramCapLocalService() {
		return _userTramCapLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUserTramCapLocalService(
		UserTramCapLocalService userTramCapLocalService) {
		_userTramCapLocalService = userTramCapLocalService;
	}

	@Override
	public UserTramCapLocalService getWrappedService() {
		return _userTramCapLocalService;
	}

	@Override
	public void setWrappedService(
		UserTramCapLocalService userTramCapLocalService) {
		_userTramCapLocalService = userTramCapLocalService;
	}

	private UserTramCapLocalService _userTramCapLocalService;
}