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
 * This class is a wrapper for {@link UserTinh}.
 * </p>
 *
 * @author khoa.vu
 * @see UserTinh
 * @generated
 */
public class UserTinhWrapper implements UserTinh, ModelWrapper<UserTinh> {
	public UserTinhWrapper(UserTinh userTinh) {
		_userTinh = userTinh;
	}

	@Override
	public Class<?> getModelClass() {
		return UserTinh.class;
	}

	@Override
	public String getModelClassName() {
		return UserTinh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
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

		String maHuyen = (String)attributes.get("maHuyen");

		if (maHuyen != null) {
			setMaHuyen(maHuyen);
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
	* Returns the primary key of this user tinh.
	*
	* @return the primary key of this user tinh
	*/
	@Override
	public long getPrimaryKey() {
		return _userTinh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user tinh.
	*
	* @param primaryKey the primary key of this user tinh
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userTinh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this user tinh.
	*
	* @return the ID of this user tinh
	*/
	@Override
	public long getId() {
		return _userTinh.getId();
	}

	/**
	* Sets the ID of this user tinh.
	*
	* @param id the ID of this user tinh
	*/
	@Override
	public void setId(long id) {
		_userTinh.setId(id);
	}

	/**
	* Returns the ma tinh of this user tinh.
	*
	* @return the ma tinh of this user tinh
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _userTinh.getMaTinh();
	}

	/**
	* Sets the ma tinh of this user tinh.
	*
	* @param maTinh the ma tinh of this user tinh
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_userTinh.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this user tinh.
	*
	* @return the ma huyen of this user tinh
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _userTinh.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this user tinh.
	*
	* @param maHuyen the ma huyen of this user tinh
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_userTinh.setMaHuyen(maHuyen);
	}

	/**
	* Returns the name of this user tinh.
	*
	* @return the name of this user tinh
	*/
	@Override
	public java.lang.String getName() {
		return _userTinh.getName();
	}

	/**
	* Sets the name of this user tinh.
	*
	* @param name the name of this user tinh
	*/
	@Override
	public void setName(java.lang.String name) {
		_userTinh.setName(name);
	}

	/**
	* Returns the user ID of this user tinh.
	*
	* @return the user ID of this user tinh
	*/
	@Override
	public long getUserId() {
		return _userTinh.getUserId();
	}

	/**
	* Sets the user ID of this user tinh.
	*
	* @param userId the user ID of this user tinh
	*/
	@Override
	public void setUserId(long userId) {
		_userTinh.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user tinh.
	*
	* @return the user uuid of this user tinh
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTinh.getUserUuid();
	}

	/**
	* Sets the user uuid of this user tinh.
	*
	* @param userUuid the user uuid of this user tinh
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userTinh.setUserUuid(userUuid);
	}

	@Override
	public boolean isNew() {
		return _userTinh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userTinh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userTinh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userTinh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userTinh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userTinh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userTinh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userTinh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userTinh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userTinh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userTinh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserTinhWrapper((UserTinh)_userTinh.clone());
	}

	@Override
	public int compareTo(vn.dtt.cmon.user.dao.model.UserTinh userTinh) {
		return _userTinh.compareTo(userTinh);
	}

	@Override
	public int hashCode() {
		return _userTinh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.cmon.user.dao.model.UserTinh> toCacheModel() {
		return _userTinh.toCacheModel();
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserTinh toEscapedModel() {
		return new UserTinhWrapper(_userTinh.toEscapedModel());
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserTinh toUnescapedModel() {
		return new UserTinhWrapper(_userTinh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userTinh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userTinh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userTinh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserTinhWrapper)) {
			return false;
		}

		UserTinhWrapper userTinhWrapper = (UserTinhWrapper)obj;

		if (Validator.equals(_userTinh, userTinhWrapper._userTinh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserTinh getWrappedUserTinh() {
		return _userTinh;
	}

	@Override
	public UserTinh getWrappedModel() {
		return _userTinh;
	}

	@Override
	public void resetOriginalValues() {
		_userTinh.resetOriginalValues();
	}

	private UserTinh _userTinh;
}