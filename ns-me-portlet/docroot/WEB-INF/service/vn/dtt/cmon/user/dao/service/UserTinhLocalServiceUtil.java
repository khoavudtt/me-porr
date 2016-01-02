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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for UserTinh. This utility wraps
 * {@link vn.dtt.cmon.user.dao.service.impl.UserTinhLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoa.vu
 * @see UserTinhLocalService
 * @see vn.dtt.cmon.user.dao.service.base.UserTinhLocalServiceBaseImpl
 * @see vn.dtt.cmon.user.dao.service.impl.UserTinhLocalServiceImpl
 * @generated
 */
public class UserTinhLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.cmon.user.dao.service.impl.UserTinhLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the user tinh to the database. Also notifies the appropriate model listeners.
	*
	* @param userTinh the user tinh
	* @return the user tinh that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTinh addUserTinh(
		vn.dtt.cmon.user.dao.model.UserTinh userTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addUserTinh(userTinh);
	}

	/**
	* Creates a new user tinh with the primary key. Does not add the user tinh to the database.
	*
	* @param id the primary key for the new user tinh
	* @return the new user tinh
	*/
	public static vn.dtt.cmon.user.dao.model.UserTinh createUserTinh(long id) {
		return getService().createUserTinh(id);
	}

	/**
	* Deletes the user tinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user tinh
	* @return the user tinh that was removed
	* @throws PortalException if a user tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTinh deleteUserTinh(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUserTinh(id);
	}

	/**
	* Deletes the user tinh from the database. Also notifies the appropriate model listeners.
	*
	* @param userTinh the user tinh
	* @return the user tinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTinh deleteUserTinh(
		vn.dtt.cmon.user.dao.model.UserTinh userTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUserTinh(userTinh);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.dtt.cmon.user.dao.model.UserTinh fetchUserTinh(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchUserTinh(id);
	}

	/**
	* Returns the user tinh with the primary key.
	*
	* @param id the primary key of the user tinh
	* @return the user tinh
	* @throws PortalException if a user tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTinh getUserTinh(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserTinh(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user tinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user tinhs
	* @param end the upper bound of the range of user tinhs (not inclusive)
	* @return the range of user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTinh> getUserTinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserTinhs(start, end);
	}

	/**
	* Returns the number of user tinhs.
	*
	* @return the number of user tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int getUserTinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserTinhsCount();
	}

	/**
	* Updates the user tinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userTinh the user tinh
	* @return the user tinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserTinh updateUserTinh(
		vn.dtt.cmon.user.dao.model.UserTinh userTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateUserTinh(userTinh);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void addUserTinh(java.lang.String maTinh, long userId,
		java.lang.String[] arrMaHuyen, java.lang.String[] arrMaHuyenDel)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().addUserTinh(maTinh, userId, arrMaHuyen, arrMaHuyenDel);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> getHuyenSelectByTinhAndUser(
		java.lang.String maTinh, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getHuyenSelectByTinhAndUser(maTinh, userId, start, end);
	}

	public static java.util.List<vn.dtt.cmon.user.dao.model.UserTinh> getDiaBanTinhByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiaBanTinhByUserId(userId);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findHuyenQly(
		java.lang.String maTinh, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findHuyenQly(maTinh, userId, start, end);
	}

	public static int countHuyenQly(java.lang.String maTinh, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countHuyenQly(maTinh, userId);
	}

	public static void clearService() {
		_service = null;
	}

	public static UserTinhLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					UserTinhLocalService.class.getName());

			if (invokableLocalService instanceof UserTinhLocalService) {
				_service = (UserTinhLocalService)invokableLocalService;
			}
			else {
				_service = new UserTinhLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(UserTinhLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(UserTinhLocalService service) {
	}

	private static UserTinhLocalService _service;
}