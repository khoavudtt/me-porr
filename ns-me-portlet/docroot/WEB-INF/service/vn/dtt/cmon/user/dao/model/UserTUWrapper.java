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
 * This class is a wrapper for {@link UserTU}.
 * </p>
 *
 * @author khoa.vu
 * @see UserTU
 * @generated
 */
public class UserTUWrapper implements UserTU, ModelWrapper<UserTU> {
	public UserTUWrapper(UserTU userTU) {
		_userTU = userTU;
	}

	@Override
	public Class<?> getModelClass() {
		return UserTU.class;
	}

	@Override
	public String getModelClassName() {
		return UserTU.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("name", getName());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTinh = (String)attributes.get("maTinh");

		if (maTinh != null) {
			setMaTinh(maTinh);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	/**
	* Returns the primary key of this user t u.
	*
	* @return the primary key of this user t u
	*/
	@Override
	public long getPrimaryKey() {
		return _userTU.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user t u.
	*
	* @param primaryKey the primary key of this user t u
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userTU.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this user t u.
	*
	* @return the ID of this user t u
	*/
	@Override
	public long getId() {
		return _userTU.getId();
	}

	/**
	* Sets the ID of this user t u.
	*
	* @param id the ID of this user t u
	*/
	@Override
	public void setId(long id) {
		_userTU.setId(id);
	}

	/**
	* Returns the ma tinh of this user t u.
	*
	* @return the ma tinh of this user t u
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _userTU.getMaTinh();
	}

	/**
	* Sets the ma tinh of this user t u.
	*
	* @param maTinh the ma tinh of this user t u
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_userTU.setMaTinh(maTinh);
	}

	/**
	* Returns the name of this user t u.
	*
	* @return the name of this user t u
	*/
	@Override
	public java.lang.String getName() {
		return _userTU.getName();
	}

	/**
	* Sets the name of this user t u.
	*
	* @param name the name of this user t u
	*/
	@Override
	public void setName(java.lang.String name) {
		_userTU.setName(name);
	}

	/**
	* Returns the user ID of this user t u.
	*
	* @return the user ID of this user t u
	*/
	@Override
	public long getUserId() {
		return _userTU.getUserId();
	}

	/**
	* Sets the user ID of this user t u.
	*
	* @param userId the user ID of this user t u
	*/
	@Override
	public void setUserId(long userId) {
		_userTU.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user t u.
	*
	* @return the user uuid of this user t u
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTU.getUserUuid();
	}

	/**
	* Sets the user uuid of this user t u.
	*
	* @param userUuid the user uuid of this user t u
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userTU.setUserUuid(userUuid);
	}

	@Override
	public boolean isNew() {
		return _userTU.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userTU.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userTU.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userTU.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userTU.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userTU.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userTU.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userTU.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userTU.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userTU.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userTU.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserTUWrapper((UserTU)_userTU.clone());
	}

	@Override
	public int compareTo(vn.dtt.cmon.user.dao.model.UserTU userTU) {
		return _userTU.compareTo(userTU);
	}

	@Override
	public int hashCode() {
		return _userTU.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.cmon.user.dao.model.UserTU> toCacheModel() {
		return _userTU.toCacheModel();
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserTU toEscapedModel() {
		return new UserTUWrapper(_userTU.toEscapedModel());
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserTU toUnescapedModel() {
		return new UserTUWrapper(_userTU.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userTU.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userTU.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userTU.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserTUWrapper)) {
			return false;
		}

		UserTUWrapper userTUWrapper = (UserTUWrapper)obj;

		if (Validator.equals(_userTU, userTUWrapper._userTU)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserTU getWrappedUserTU() {
		return _userTU;
	}

	@Override
	public UserTU getWrappedModel() {
		return _userTU;
	}

	@Override
	public void resetOriginalValues() {
		_userTU.resetOriginalValues();
	}

	private UserTU _userTU;
}