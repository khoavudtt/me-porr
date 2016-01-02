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
 * This class is a wrapper for {@link UserTramCap}.
 * </p>
 *
 * @author khoa.vu
 * @see UserTramCap
 * @generated
 */
public class UserTramCapWrapper implements UserTramCap,
	ModelWrapper<UserTramCap> {
	public UserTramCapWrapper(UserTramCap userTramCap) {
		_userTramCap = userTramCap;
	}

	@Override
	public Class<?> getModelClass() {
		return UserTramCap.class;
	}

	@Override
	public String getModelClassName() {
		return UserTramCap.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("name", getName());
		attributes.put("maTramCap", getMaTramCap());
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

		Long maTramCap = (Long)attributes.get("maTramCap");

		if (maTramCap != null) {
			setMaTramCap(maTramCap);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	/**
	* Returns the primary key of this user tram cap.
	*
	* @return the primary key of this user tram cap
	*/
	@Override
	public long getPrimaryKey() {
		return _userTramCap.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user tram cap.
	*
	* @param primaryKey the primary key of this user tram cap
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userTramCap.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this user tram cap.
	*
	* @return the ID of this user tram cap
	*/
	@Override
	public long getId() {
		return _userTramCap.getId();
	}

	/**
	* Sets the ID of this user tram cap.
	*
	* @param id the ID of this user tram cap
	*/
	@Override
	public void setId(long id) {
		_userTramCap.setId(id);
	}

	/**
	* Returns the ma tinh of this user tram cap.
	*
	* @return the ma tinh of this user tram cap
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _userTramCap.getMaTinh();
	}

	/**
	* Sets the ma tinh of this user tram cap.
	*
	* @param maTinh the ma tinh of this user tram cap
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_userTramCap.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this user tram cap.
	*
	* @return the ma huyen of this user tram cap
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _userTramCap.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this user tram cap.
	*
	* @param maHuyen the ma huyen of this user tram cap
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_userTramCap.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ma xa of this user tram cap.
	*
	* @return the ma xa of this user tram cap
	*/
	@Override
	public java.lang.String getMaXa() {
		return _userTramCap.getMaXa();
	}

	/**
	* Sets the ma xa of this user tram cap.
	*
	* @param maXa the ma xa of this user tram cap
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_userTramCap.setMaXa(maXa);
	}

	/**
	* Returns the name of this user tram cap.
	*
	* @return the name of this user tram cap
	*/
	@Override
	public java.lang.String getName() {
		return _userTramCap.getName();
	}

	/**
	* Sets the name of this user tram cap.
	*
	* @param name the name of this user tram cap
	*/
	@Override
	public void setName(java.lang.String name) {
		_userTramCap.setName(name);
	}

	/**
	* Returns the ma tram cap of this user tram cap.
	*
	* @return the ma tram cap of this user tram cap
	*/
	@Override
	public long getMaTramCap() {
		return _userTramCap.getMaTramCap();
	}

	/**
	* Sets the ma tram cap of this user tram cap.
	*
	* @param maTramCap the ma tram cap of this user tram cap
	*/
	@Override
	public void setMaTramCap(long maTramCap) {
		_userTramCap.setMaTramCap(maTramCap);
	}

	/**
	* Returns the user ID of this user tram cap.
	*
	* @return the user ID of this user tram cap
	*/
	@Override
	public long getUserId() {
		return _userTramCap.getUserId();
	}

	/**
	* Sets the user ID of this user tram cap.
	*
	* @param userId the user ID of this user tram cap
	*/
	@Override
	public void setUserId(long userId) {
		_userTramCap.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user tram cap.
	*
	* @return the user uuid of this user tram cap
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userTramCap.getUserUuid();
	}

	/**
	* Sets the user uuid of this user tram cap.
	*
	* @param userUuid the user uuid of this user tram cap
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userTramCap.setUserUuid(userUuid);
	}

	@Override
	public boolean isNew() {
		return _userTramCap.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userTramCap.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userTramCap.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userTramCap.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userTramCap.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userTramCap.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userTramCap.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userTramCap.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userTramCap.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userTramCap.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userTramCap.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserTramCapWrapper((UserTramCap)_userTramCap.clone());
	}

	@Override
	public int compareTo(vn.dtt.cmon.user.dao.model.UserTramCap userTramCap) {
		return _userTramCap.compareTo(userTramCap);
	}

	@Override
	public int hashCode() {
		return _userTramCap.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.cmon.user.dao.model.UserTramCap> toCacheModel() {
		return _userTramCap.toCacheModel();
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserTramCap toEscapedModel() {
		return new UserTramCapWrapper(_userTramCap.toEscapedModel());
	}

	@Override
	public vn.dtt.cmon.user.dao.model.UserTramCap toUnescapedModel() {
		return new UserTramCapWrapper(_userTramCap.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userTramCap.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userTramCap.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userTramCap.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserTramCapWrapper)) {
			return false;
		}

		UserTramCapWrapper userTramCapWrapper = (UserTramCapWrapper)obj;

		if (Validator.equals(_userTramCap, userTramCapWrapper._userTramCap)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserTramCap getWrappedUserTramCap() {
		return _userTramCap;
	}

	@Override
	public UserTramCap getWrappedModel() {
		return _userTramCap;
	}

	@Override
	public void resetOriginalValues() {
		_userTramCap.resetOriginalValues();
	}

	private UserTramCap _userTramCap;
}