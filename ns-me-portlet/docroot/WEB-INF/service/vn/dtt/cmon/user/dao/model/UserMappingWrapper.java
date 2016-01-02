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

package vn.dtt.cmon.user.dao.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserMapping}.
 * </p>
 *
 * @author khoa.vu
 * @see UserMapping
 * @generated
 */
public class UserMappingWrapper implements UserMapping,
	ModelWrapper<UserMapping> {
	public UserMappingWrapper(UserMapping userMapping) {
		_userMapping = userMapping;
	}

	@Override
	public Class<?> getModelClass() {
		return UserMapping.class;
	}

	@Override
	public String getModelClassName() {
		return UserMapping.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("userId", getUserId());
		attributes.put("userType", getUserType());
		attributes.put("orgCode1", getOrgCode1());
		attributes.put("orgCode2", getOrgCode2());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer userType = (Integer)attributes.get("userType");

		if (userType != null) {
			setUserType(userType);
		}

		String orgCode1 = (String)attributes.get("orgCode1");

		if (orgCode1 != null) {
			setOrgCode1(orgCode1);
		}

		String orgCode2 = (String)attributes.get("orgCode2");

		if (orgCode2 != null) {
			setOrgCode2(orgCode2);
		}
	}

	/**
	* Returns the primary key of this user mapping.
	*
	* @return the primary key of this user mapping
	*/
	@Override
	public long getPrimaryKey() {
		return _userMapping.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user mapping.
	*
	* @param primaryKey the primary key of this user mapping
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userMapping.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this user mapping.
	*
	* @return the ID of this user mapping
	*/
	@Override
	public long getId() {
		return _userMapping.getId();
	}

	/**
	* Sets the ID of this user mapping.
	*
	* @param id the ID of this user mapping
	*/
	@Override
	public void setId(long id) {
		_userMapping.setId(id);
	}

	/**
	* Returns the name of this user mapping.
	*
	* @return the name of this user mapping
	*/
	@Override
	public java.lang.String getName() {
		return _userMapping.getName();
	}

	/**
	* Sets the name of this user mapping.
	*
	* @param name the name of this user mapping
	*/
	@Override
	public void setName(java.lang.String name) {
		_userMapping.setName(name);
	}

	/**
	* Returns the user ID of this user mapping.
	*
	* @return the user ID of this user mapping
	*/
	@Override
	public long getUserId() {
		return _userMapping.getUserId();
	}

	/**
	* Sets the user ID of this user mapping.
	*
	* @param userId the user ID of this user mapping
	*/
	@Override
	public void setUserId(long userId) {
		_userMapping.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user mapping.
	*
	* @return the user uuid of this user mapping
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userMapping.getUserUuid();
	}

	/**
	* Sets the user uuid of this user mapping.
	*
	* @param userUuid the user uuid of this user mapping
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userMapping.setUserUuid(userUuid);
	}

	/**
	* Returns the user type of this user mapping.
	*
	* @return the user type of this user mapping
	*/
	@Override
	public int getUserType() {
		return _userMapping.getUserType();
	}

	/**
	* Sets the user type of this user mapping.
	*
	* @param userType the user type of this user mapping
	*/
	@Override
	public void setUserType(int userType) {
		_userMapping.setUserType(userType);
	}

	/**
	* Returns the org code1 of this user mapping.
	*
	* @return the org code1 of this user mapping
	*/
	@Override
	public java.lang.String getOrgCode1() {
		return _userMapping.getOrgCode1();
	}

	/**
	* Sets the org code1 of this user mapping.
	*
	* @param orgCode1 the org code1 of this user mapping
	*/
	@Override
	public void setOrgCode1(java.lang.String orgCode1) {
		_userMapping.setOrgCode1(orgCode1);
	}

	/**
	* Returns the org code2 of this user mapping.
	*
	* @return the org code2 of this user mapping
	*/
	@Override
	public java.lang.String getOrgCode2() {
		return _userMapping.getOrgCode2();
	}

	/**
	* Sets the org code2 of this user mapping.
	*
	* @param orgCode2 the org code2 of this user mapping
	*/
	@Override
	public void setOrgCode2(java.lang.String orgCode2) {
		_userMapping.setOrgCode2(orgCode2);
	}

	@Override
	public boolean isNew() {
		return _userMapping.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userMapping.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userMapping.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userMapping.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userMapping.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userMapping.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userMapping.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userMapping.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userMapping.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userMapping.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userMapping.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserMappingWrapper((UserMapping)_userMapping.clone());
	}

	@Override
	public int compareTo(vn.dtt.cmon.user.dao.model.UserMapping userMapping) {
		return _userMapping.compareTo(userMapping);
	}

	@Override
	public int hashCode() {
		return _userMapping.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.cmon.user.dao.model.UserMapping> toCacheModel() {
		return _userMapping.toCacheModel();
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping toEscapedModel() {
		return new UserMappingWrapper(_userMapping.toEscapedModel());
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserMapping toUnescapedModel() {
		return new UserMappingWrapper(_userMapping.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userMapping.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userMapping.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userMapping.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserMappingWrapper)) {
			return false;
		}

		UserMappingWrapper userMappingWrapper = (UserMappingWrapper)obj;

		if (Validator.equals(_userMapping, userMappingWrapper._userMapping)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserMapping getWrappedUserMapping() {
		return _userMapping;
	}

	@Override
	public UserMapping getWrappedModel() {
		return _userMapping;
	}

	@Override
	public void resetOriginalValues() {
		_userMapping.resetOriginalValues();
	}

	private UserMapping _userMapping;
}