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
 * This class is a wrapper for {@link UserHuyen}.
 * </p>
 *
 * @author khoa.vu
 * @see UserHuyen
 * @generated
 */
public class UserHuyenWrapper implements UserHuyen, ModelWrapper<UserHuyen> {
	public UserHuyenWrapper(UserHuyen userHuyen) {
		_userHuyen = userHuyen;
	}

	@Override
	public Class<?> getModelClass() {
		return UserHuyen.class;
	}

	@Override
	public String getModelClassName() {
		return UserHuyen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
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

		String maXa = (String)attributes.get("maXa");

		if (maXa != null) {
			setMaXa(maXa);
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
	* Returns the primary key of this user huyen.
	*
	* @return the primary key of this user huyen
	*/
	@Override
	public long getPrimaryKey() {
		return _userHuyen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user huyen.
	*
	* @param primaryKey the primary key of this user huyen
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userHuyen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this user huyen.
	*
	* @return the ID of this user huyen
	*/
	@Override
	public long getId() {
		return _userHuyen.getId();
	}

	/**
	* Sets the ID of this user huyen.
	*
	* @param id the ID of this user huyen
	*/
	@Override
	public void setId(long id) {
		_userHuyen.setId(id);
	}

	/**
	* Returns the ma tinh of this user huyen.
	*
	* @return the ma tinh of this user huyen
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _userHuyen.getMaTinh();
	}

	/**
	* Sets the ma tinh of this user huyen.
	*
	* @param maTinh the ma tinh of this user huyen
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_userHuyen.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this user huyen.
	*
	* @return the ma huyen of this user huyen
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _userHuyen.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this user huyen.
	*
	* @param maHuyen the ma huyen of this user huyen
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_userHuyen.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ma xa of this user huyen.
	*
	* @return the ma xa of this user huyen
	*/
	@Override
	public java.lang.String getMaXa() {
		return _userHuyen.getMaXa();
	}

	/**
	* Sets the ma xa of this user huyen.
	*
	* @param maXa the ma xa of this user huyen
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_userHuyen.setMaXa(maXa);
	}

	/**
	* Returns the name of this user huyen.
	*
	* @return the name of this user huyen
	*/
	@Override
	public java.lang.String getName() {
		return _userHuyen.getName();
	}

	/**
	* Sets the name of this user huyen.
	*
	* @param name the name of this user huyen
	*/
	@Override
	public void setName(java.lang.String name) {
		_userHuyen.setName(name);
	}

	/**
	* Returns the user ID of this user huyen.
	*
	* @return the user ID of this user huyen
	*/
	@Override
	public long getUserId() {
		return _userHuyen.getUserId();
	}

	/**
	* Sets the user ID of this user huyen.
	*
	* @param userId the user ID of this user huyen
	*/
	@Override
	public void setUserId(long userId) {
		_userHuyen.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user huyen.
	*
	* @return the user uuid of this user huyen
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userHuyen.getUserUuid();
	}

	/**
	* Sets the user uuid of this user huyen.
	*
	* @param userUuid the user uuid of this user huyen
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userHuyen.setUserUuid(userUuid);
	}

	@Override
	public boolean isNew() {
		return _userHuyen.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userHuyen.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userHuyen.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userHuyen.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userHuyen.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userHuyen.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userHuyen.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userHuyen.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userHuyen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userHuyen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userHuyen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserHuyenWrapper((UserHuyen)_userHuyen.clone());
	}

	@Override
	public int compareTo(vn.dtt.cmon.user.dao.model.UserHuyen userHuyen) {
		return _userHuyen.compareTo(userHuyen);
	}

	@Override
	public int hashCode() {
		return _userHuyen.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.cmon.user.dao.model.UserHuyen> toCacheModel() {
		return _userHuyen.toCacheModel();
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserHuyen toEscapedModel() {
		return new UserHuyenWrapper(_userHuyen.toEscapedModel());
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserHuyen toUnescapedModel() {
		return new UserHuyenWrapper(_userHuyen.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userHuyen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userHuyen.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userHuyen.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserHuyenWrapper)) {
			return false;
		}

		UserHuyenWrapper userHuyenWrapper = (UserHuyenWrapper)obj;

		if (Validator.equals(_userHuyen, userHuyenWrapper._userHuyen)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserHuyen getWrappedUserHuyen() {
		return _userHuyen;
	}

	@Override
	public UserHuyen getWrappedModel() {
		return _userHuyen;
	}

	@Override
	public void resetOriginalValues() {
		_userHuyen.resetOriginalValues();
	}

	private UserHuyen _userHuyen;
}