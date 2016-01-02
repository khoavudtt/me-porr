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
 * Provides the local service utility for UserMapping. This utility wraps
 * {@link vn.dtt.cmon.user.dao.service.impl.UserMappingLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoa.vu
 * @see UserMappingLocalService
 * @see vn.dtt.cmon.user.dao.service.base.UserMappingLocalServiceBaseImpl
 * @see vn.dtt.cmon.user.dao.service.impl.UserMappingLocalServiceImpl
 * @generated
 */
public class UserMappingLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.cmon.user.dao.service.impl.UserMappingLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the user mapping to the database. Also notifies the appropriate model listeners.
	*
	* @param userMapping the user mapping
	* @return the user mapping that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping addUserMapping(
		vn.dtt.cmon.user.dao.model.UserMapping userMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addUserMapping(userMapping);
	}

	/**
	* Creates a new user mapping with the primary key. Does not add the user mapping to the database.
	*
	* @param id the primary key for the new user mapping
	* @return the new user mapping
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping createUserMapping(
		long id) {
		return getService().createUserMapping(id);
	}

	/**
	* Deletes the user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user mapping
	* @return the user mapping that was removed
	* @throws PortalException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping deleteUserMapping(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUserMapping(id);
	}

	/**
	* Deletes the user mapping from the database. Also notifies the appropriate model listeners.
	*
	* @param userMapping the user mapping
	* @return the user mapping that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping deleteUserMapping(
		vn.dtt.cmon.user.dao.model.UserMapping userMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUserMapping(userMapping);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.cmon.user.dao.model.UserMapping fetchUserMapping(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchUserMapping(id);
	}

	/**
	* Returns the user mapping with the primary key.
	*
	* @param id the primary key of the user mapping
	* @return the user mapping
	* @throws PortalException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping getUserMapping(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserMapping(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getUserMappings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserMappings(start, end);
	}

	/**
	* Returns the number of user mappings.
	*
	* @return the number of user mappings
	* @throws SystemException if a system exception occurred
	*/
	public static int getUserMappingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserMappingsCount();
	}

	/**
	* Updates the user mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userMapping the user mapping
	* @return the user mapping that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping updateUserMapping(
		vn.dtt.cmon.user.dao.model.UserMapping userMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateUserMapping(userMapping);
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

	public static int count(java.lang.String keyword, int userType,
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().count(keyword, userType, orgCode1, orgCode2);
	}

	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> find(
		java.lang.String keyword, int userType, java.lang.String orgCode1,
		java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .find(keyword, userType, orgCode1, orgCode2, start, end);
	}

	public static vn.dtt.cmon.user.dao.model.UserMapping getByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByUserId(userId);
	}

	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getByOrg1_Org2(
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByOrg1_Org2(orgCode1, orgCode2);
	}

	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getByOrg1(
		java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByOrg1(orgCode1);
	}

	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getByOrg2(
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByOrg2(orgCode2);
	}

	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getByTypeOrg1(
		int userType, java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByTypeOrg1(userType, orgCode1);
	}

	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getByTypeOrg2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByTypeOrg2(userType, orgCode1, orgCode2);
	}

	public static java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getByUserType(
		int userType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByUserType(userType);
	}

	public static vn.dtt.cmon.user.dao.model.UserMapping updateUserMapping(
		long userId, java.lang.String password1, java.lang.String password2,
		java.lang.String firstName, long[] roleIds, long[] userGroupIds,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateUserMapping(userId, password1, password2, firstName,
			roleIds, userGroupIds, serviceContext);
	}

	/**
	* @param userType
	* @param creatorUserId
	* @param companyId
	* @param autoPassword
	* @param password1
	* @param password2
	* @param autoScreenName
	* @param screenName
	* @param emailAddress
	* @param facebookId
	* @param openId
	* @param locale
	* @param firstName
	* @param middleName
	* @param lastName
	* @param prefixId
	* @param suffixId
	* @param male
	* @param birthdayMonth
	* @param birthdayDay
	* @param birthdayYear
	* @param jobTitle
	* @param groupIds
	* @param organizationIds
	* @param roleIds
	* @param userGroupIds
	* @param sendEmail
	* @param serviceContext
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static vn.dtt.cmon.user.dao.model.UserMapping addUserMapping(
		java.lang.String maTinh, int userType, long creatorUserId,
		long companyId, boolean autoPassword, java.lang.String password1,
		java.lang.String password2, boolean autoScreenName,
		java.lang.String screenName, java.lang.String emailAddress,
		long facebookId, java.lang.String openId, java.util.Locale locale,
		java.lang.String firstName, java.lang.String middleName,
		java.lang.String lastName, int prefixId, int suffixId, boolean male,
		int birthdayMonth, int birthdayDay, int birthdayYear,
		java.lang.String jobTitle, long[] groupIds, long[] organizationIds,
		long[] roleIds, long[] userGroupIds, boolean sendEmail,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addUserMapping(maTinh, userType, creatorUserId, companyId,
			autoPassword, password1, password2, autoScreenName, screenName,
			emailAddress, facebookId, openId, locale, firstName, middleName,
			lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay,
			birthdayYear, jobTitle, groupIds, organizationIds, roleIds,
			userGroupIds, sendEmail, serviceContext);
	}

	public static vn.dtt.cmon.user.dao.model.UserMapping addUserMapping(
		long id, java.lang.String name, long userId, int userType,
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addUserMapping(id, name, userId, userType, orgCode1,
			orgCode2);
	}

	public static vn.dtt.cmon.user.dao.model.UserMapping addUserMapping(
		long id, long userId, int userType, java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addUserMapping(id, userId, userType, orgCode1, orgCode2);
	}

	public static void clearService() {
		_service = null;
	}

	public static UserMappingLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					UserMappingLocalService.class.getName());

			if (invokableLocalService instanceof UserMappingLocalService) {
				_service = (UserMappingLocalService)invokableLocalService;
			}
			else {
				_service = new UserMappingLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(UserMappingLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(UserMappingLocalService service) {
	}

	private static UserMappingLocalService _service;
}