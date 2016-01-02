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
 * Provides the local service utility for UserHuyen. This utility wraps
 * {@link vn.dtt.cmon.user.dao.service.impl.UserHuyenLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoa.vu
 * @see UserHuyenLocalService
 * @see vn.dtt.cmon.user.dao.service.base.UserHuyenLocalServiceBaseImpl
 * @see vn.dtt.cmon.user.dao.service.impl.UserHuyenLocalServiceImpl
 * @generated
 */
public class UserHuyenLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.cmon.user.dao.service.impl.UserHuyenLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the user huyen to the database. Also notifies the appropriate model listeners.
	*
	* @param userHuyen the user huyen
	* @return the user huyen that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserHuyen addUserHuyen(
		vn.dtt.cmon.user.dao.model.UserHuyen userHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addUserHuyen(userHuyen);
	}

	/**
	* Creates a new user huyen with the primary key. Does not add the user huyen to the database.
	*
	* @param id the primary key for the new user huyen
	* @return the new user huyen
	*/
	public static vn.dtt.cmon.user.dao.model.UserHuyen createUserHuyen(long id) {
		return getService().createUserHuyen(id);
	}

	/**
	* Deletes the user huyen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user huyen
	* @return the user huyen that was removed
	* @throws PortalException if a user huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserHuyen deleteUserHuyen(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUserHuyen(id);
	}

	/**
	* Deletes the user huyen from the database. Also notifies the appropriate model listeners.
	*
	* @param userHuyen the user huyen
	* @return the user huyen that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserHuyen deleteUserHuyen(
		vn.dtt.cmon.user.dao.model.UserHuyen userHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUserHuyen(userHuyen);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.cmon.user.dao.model.UserHuyen fetchUserHuyen(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchUserHuyen(id);
	}

	/**
	* Returns the user huyen with the primary key.
	*
	* @param id the primary key of the user huyen
	* @return the user huyen
	* @throws PortalException if a user huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserHuyen getUserHuyen(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserHuyen(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> getUserHuyens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserHuyens(start, end);
	}

	/**
	* Returns the number of user huyens.
	*
	* @return the number of user huyens
	* @throws SystemException if a system exception occurred
	*/
	public static int getUserHuyensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserHuyensCount();
	}

	/**
	* Updates the user huyen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userHuyen the user huyen
	* @return the user huyen that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserHuyen updateUserHuyen(
		vn.dtt.cmon.user.dao.model.UserHuyen userHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateUserHuyen(userHuyen);
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

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findHuyenDuocChonByUser(
		java.lang.String maTinh, java.lang.String maHuyen, long userId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findHuyenDuocChonByUser(maTinh, maHuyen, userId, start, end);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findHuyenDaChonByUser(
		java.lang.String maTinh, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findHuyenDaChonByUser(maTinh, userId, start, end);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findXaThuocHuyenChonByUser(
		java.lang.String maTinh, java.lang.String maHuyen, long userId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findXaThuocHuyenChonByUser(maTinh, maHuyen, userId, start,
			end);
	}

	public static int countHuyenChonByUser(java.lang.String maTinh, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countHuyenChonByUser(maTinh, userId);
	}

	public static int countXaThuocHuyenChonByUser(java.lang.String maTinh,
		java.lang.String maHuyen, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countXaThuocHuyenChonByUser(maTinh, maHuyen, userId);
	}

	public static void delUserHuyen(java.lang.String maTinh,
		java.lang.String maHuyen, java.lang.String maXa, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().delUserHuyen(maTinh, maHuyen, maXa, userId);
	}

	public static vn.dtt.cmon.user.dao.model.UserHuyen addUserHuyen(
		java.lang.String maTinh, java.lang.String maHuyen,
		java.lang.String maXa, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addUserHuyen(maTinh, maHuyen, maXa, userId);
	}

	public static java.util.List<vn.dtt.cmon.user.dao.model.UserHuyen> getDiaBanHuyenByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiaBanHuyenByUserId(userId);
	}

	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getGSVInHuyen(
		java.lang.String maTinh, java.lang.String maHuyen, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getGSVInHuyen(maTinh, maHuyen, start, end);
	}

	public static java.util.List<vn.dtt.cmon.dm.dao.model.DATAITEM> findHuyenByUser(
		java.lang.String maTinh, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findHuyenByUser(maTinh, userId, start, end);
	}

	public static int countHuyenByUser(java.lang.String maTinh, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countHuyenByUser(maTinh, userId);
	}

	public static void clearService() {
		_service = null;
	}

	public static UserHuyenLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					UserHuyenLocalService.class.getName());

			if (invokableLocalService instanceof UserHuyenLocalService) {
				_service = (UserHuyenLocalService)invokableLocalService;
			}
			else {
				_service = new UserHuyenLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(UserHuyenLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(UserHuyenLocalService service) {
	}

	private static UserHuyenLocalService _service;
}