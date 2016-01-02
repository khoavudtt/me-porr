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
 * Provides a wrapper for {@link UserHuyenLocalService}.
 *
 * @author khoa.vu
 * @see UserHuyenLocalService
 * @generated
 */
public class UserHuyenLocalServiceWrapper implements UserHuyenLocalService,
	ServiceWrapper<UserHuyenLocalService> {
	public UserHuyenLocalServiceWrapper(
		UserHuyenLocalService userHuyenLocalService) {
		_userHuyenLocalService = userHuyenLocalService;
	}

	/**
	* Adds the user huyen to the database. Also notifies the appropriate model listeners.
	*
	* @param userHuyen the user huyen
	* @return the user huyen that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserHuyen addUserHuyen(
		vn.dtt.cmon.user.dao.model.UserHuyen userHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.addUserHuyen(userHuyen);
	}

	/**
	* Creates a new user huyen with the primary key. Does not add the user huyen to the database.
	*
	* @param id the primary key for the new user huyen
	* @return the new user huyen
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserHuyen createUserHuyen(long id) {
		return _userHuyenLocalService.createUserHuyen(id);
	}

	/**
	* Deletes the user huyen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user huyen
	* @return the user huyen that was removed
	* @throws PortalException if a user huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserHuyen deleteUserHuyen(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.deleteUserHuyen(id);
	}

	/**
	* Deletes the user huyen from the database. Also notifies the appropriate model listeners.
	*
	* @param userHuyen the user huyen
	* @return the user huyen that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserHuyen deleteUserHuyen(
		vn.dtt.cmon.user.dao.model.UserHuyen userHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.deleteUserHuyen(userHuyen);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userHuyenLocalService.dynamicQuery();
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
		return _userHuyenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _userHuyenLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _userHuyenLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _userHuyenLocalService.dynamicQueryCount(dynamicQuery);
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
		return _userHuyenLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserHuyen fetchUserHuyen(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.fetchUserHuyen(id);
	}

	/**
	* Returns the user huyen with the primary key.
	*
	* @param id the primary key of the user huyen
	* @return the user huyen
	* @throws PortalException if a user huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserHuyen getUserHuyen(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.getUserHuyen(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user huyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user huyens
	* @param end the upper bound of the range of user huyens (not inclusive)
	* @return the range of user huyens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> getUserHuyens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.getUserHuyens(start, end);
	}

	/**
	* Returns the number of user huyens.
	*
	* @return the number of user huyens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUserHuyensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.getUserHuyensCount();
	}

	/**
	* Updates the user huyen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userHuyen the user huyen
	* @return the user huyen that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserHuyen updateUserHuyen(
		vn.dtt.cmon.user.dao.model.UserHuyen userHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.updateUserHuyen(userHuyen);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _userHuyenLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userHuyenLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _userHuyenLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findHuyenDuocChonByUser(
		java.lang.String maTinh, java.lang.String maHuyen, long userId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.findHuyenDuocChonByUser(maTinh, maHuyen,
			userId, start, end);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findHuyenDaChonByUser(
		java.lang.String maTinh, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.findHuyenDaChonByUser(maTinh, userId,
			start, end);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findXaThuocHuyenChonByUser(
		java.lang.String maTinh, java.lang.String maHuyen, long userId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.findXaThuocHuyenChonByUser(maTinh,
			maHuyen, userId, start, end);
	}

	@Override
	public int countHuyenChonByUser(java.lang.String maTinh, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.countHuyenChonByUser(maTinh, userId);
	}

	@Override
	public int countXaThuocHuyenChonByUser(java.lang.String maTinh,
		java.lang.String maHuyen, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.countXaThuocHuyenChonByUser(maTinh,
			maHuyen, userId);
	}

	@Override
	public void delUserHuyen(java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userHuyenLocalService.delUserHuyen(maTinh, maHuyen, maXa, userId);
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserHuyen addUserHuyen(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.addUserHuyen(maTinh, maHuyen, maXa, userId);
	}

	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> getDiaBanHuyenByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.getDiaBanHuyenByUserId(userId);
	}

	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getGSVInHuyen(
		java.lang.String maTinh, java.lang.String maHuyen, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.getGSVInHuyen(maTinh, maHuyen, start, end);
	}

	@Override
	public java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findHuyenByUser(
		java.lang.String maTinh, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.findHuyenByUser(maTinh, userId, start, end);
	}

	@Override
	public int countHuyenByUser(java.lang.String maTinh, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userHuyenLocalService.countHuyenByUser(maTinh, userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UserHuyenLocalService getWrappedUserHuyenLocalService() {
		return _userHuyenLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUserHuyenLocalService(
		UserHuyenLocalService userHuyenLocalService) {
		_userHuyenLocalService = userHuyenLocalService;
	}

	@Override
	public UserHuyenLocalService getWrappedService() {
		return _userHuyenLocalService;
	}

	@Override
	public void setWrappedService(UserHuyenLocalService userHuyenLocalService) {
		_userHuyenLocalService = userHuyenLocalService;
	}

	private UserHuyenLocalService _userHuyenLocalService;
}