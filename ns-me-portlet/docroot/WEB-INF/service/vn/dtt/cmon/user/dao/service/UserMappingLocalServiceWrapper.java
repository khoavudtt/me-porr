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
 * Provides a wrapper for {@link UserMappingLocalService}.
 *
 * @author khoa.vu
 * @see UserMappingLocalService
 * @generated
 */
public class UserMappingLocalServiceWrapper implements UserMappingLocalService,
	ServiceWrapper<UserMappingLocalService> {
	public UserMappingLocalServiceWrapper(
		UserMappingLocalService userMappingLocalService) {
		_userMappingLocalService = userMappingLocalService;
	}

	/**
	* Adds the user mapping to the database. Also notifies the appropriate model listeners.
	*
	* @param userMapping the user mapping
	* @return the user mapping that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping addUserMapping(
		vn.dtt.cmon.user.dao.model.UserMapping userMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.addUserMapping(userMapping);
	}

	/**
	* Creates a new user mapping with the primary key. Does not add the user mapping to the database.
	*
	* @param id the primary key for the new user mapping
	* @return the new user mapping
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping createUserMapping(long id) {
		return _userMappingLocalService.createUserMapping(id);
	}

	/**
	* Deletes the user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user mapping
	* @return the user mapping that was removed
	* @throws PortalException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping deleteUserMapping(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.deleteUserMapping(id);
	}

	/**
	* Deletes the user mapping from the database. Also notifies the appropriate model listeners.
	*
	* @param userMapping the user mapping
	* @return the user mapping that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping deleteUserMapping(
		vn.dtt.cmon.user.dao.model.UserMapping userMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.deleteUserMapping(userMapping);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userMappingLocalService.dynamicQuery();
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
		return _userMappingLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _userMappingLocalService.dynamicQueryCount(dynamicQuery);
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
		return _userMappingLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping fetchUserMapping(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.fetchUserMapping(id);
	}

	/**
	* Returns the user mapping with the primary key.
	*
	* @param id the primary key of the user mapping
	* @return the user mapping
	* @throws PortalException if a user mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping getUserMapping(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.getUserMapping(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getUserMappings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.getUserMappings(start, end);
	}

	/**
	* Returns the number of user mappings.
	*
	* @return the number of user mappings
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUserMappingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.getUserMappingsCount();
	}

	/**
	* Updates the user mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userMapping the user mapping
	* @return the user mapping that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping updateUserMapping(
		vn.dtt.cmon.user.dao.model.UserMapping userMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.updateUserMapping(userMapping);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _userMappingLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userMappingLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _userMappingLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public int count(java.lang.String keyword, int userType,
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.count(keyword, userType, orgCode1,
			orgCode2);
	}

	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> find(
		java.lang.String keyword, int userType, java.lang.String orgCode1,
		java.lang.String orgCode2, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.find(keyword, userType, orgCode1,
			orgCode2, start, end);
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping getByUserId(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.getByUserId(userId);
	}

	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getByOrg1_Org2(
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.getByOrg1_Org2(orgCode1, orgCode2);
	}

	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getByOrg1(
		java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.getByOrg1(orgCode1);
	}

	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getByOrg2(
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.getByOrg2(orgCode2);
	}

	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getByTypeOrg1(
		int userType, java.lang.String orgCode1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.getByTypeOrg1(userType, orgCode1);
	}

	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getByTypeOrg2(
		int userType, java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.getByTypeOrg2(userType, orgCode1,
			orgCode2);
	}

	@Override
	public java.util.List<vn.dtt.cmon.user.dao.model.UserMapping> getByUserType(
		int userType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.getByUserType(userType);
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping updateUserMapping(
		long userId, java.lang.String password1, java.lang.String password2,
		java.lang.String firstName, long[] roleIds, long[] userGroupIds,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.updateUserMapping(userId, password1,
			password2, firstName, roleIds, userGroupIds, serviceContext);
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
	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping addUserMapping(
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
		return _userMappingLocalService.addUserMapping(maTinh, userType,
			creatorUserId, companyId, autoPassword, password1, password2,
			autoScreenName, screenName, emailAddress, facebookId, openId,
			locale, firstName, middleName, lastName, prefixId, suffixId, male,
			birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds,
			organizationIds, roleIds, userGroupIds, sendEmail, serviceContext);
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping addUserMapping(long id,
		java.lang.String name, long userId, int userType,
		java.lang.String orgCode1, java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.addUserMapping(id, name, userId,
			userType, orgCode1, orgCode2);
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping addUserMapping(long id,
		long userId, int userType, java.lang.String orgCode1,
		java.lang.String orgCode2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userMappingLocalService.addUserMapping(id, userId, userType,
			orgCode1, orgCode2);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UserMappingLocalService getWrappedUserMappingLocalService() {
		return _userMappingLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUserMappingLocalService(
		UserMappingLocalService userMappingLocalService) {
		_userMappingLocalService = userMappingLocalService;
	}

	@Override
	public UserMappingLocalService getWrappedService() {
		return _userMappingLocalService;
	}

	@Override
	public void setWrappedService(
		UserMappingLocalService userMappingLocalService) {
		_userMappingLocalService = userMappingLocalService;
	}

	private UserMappingLocalService _userMappingLocalService;
}