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

package vn.dtt.cmon.dm.dao.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NAVIGATION}.
 * </p>
 *
 * @author khoa.vu
 * @see NAVIGATION
 * @generated
 */
public class NAVIGATIONWrapper implements NAVIGATION, ModelWrapper<NAVIGATION> {
	public NAVIGATIONWrapper(NAVIGATION navigation) {
		_navigation = navigation;
	}

	@Override
	public Class<?> getModelClass() {
		return NAVIGATION.class;
	}

	@Override
	public String getModelClassName() {
		return NAVIGATION.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("navSub", getNavSub());
		attributes.put("navSubOwner", getNavSubOwner());
		attributes.put("roleOwner", getRoleOwner());
		attributes.put("permissionOwner", getPermissionOwner());
		attributes.put("parentId", getParentId());
		attributes.put("hidden", getHidden());
		attributes.put("order", getOrder());
		attributes.put("thongKe", getThongKe());

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

		String navSub = (String)attributes.get("navSub");

		if (navSub != null) {
			setNavSub(navSub);
		}

		String navSubOwner = (String)attributes.get("navSubOwner");

		if (navSubOwner != null) {
			setNavSubOwner(navSubOwner);
		}

		String roleOwner = (String)attributes.get("roleOwner");

		if (roleOwner != null) {
			setRoleOwner(roleOwner);
		}

		String permissionOwner = (String)attributes.get("permissionOwner");

		if (permissionOwner != null) {
			setPermissionOwner(permissionOwner);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		Long hidden = (Long)attributes.get("hidden");

		if (hidden != null) {
			setHidden(hidden);
		}

		Long order = (Long)attributes.get("order");

		if (order != null) {
			setOrder(order);
		}

		String thongKe = (String)attributes.get("thongKe");

		if (thongKe != null) {
			setThongKe(thongKe);
		}
	}

	/**
	* Returns the primary key of this n a v i g a t i o n.
	*
	* @return the primary key of this n a v i g a t i o n
	*/
	@Override
	public long getPrimaryKey() {
		return _navigation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this n a v i g a t i o n.
	*
	* @param primaryKey the primary key of this n a v i g a t i o n
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_navigation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this n a v i g a t i o n.
	*
	* @return the ID of this n a v i g a t i o n
	*/
	@Override
	public long getId() {
		return _navigation.getId();
	}

	/**
	* Sets the ID of this n a v i g a t i o n.
	*
	* @param id the ID of this n a v i g a t i o n
	*/
	@Override
	public void setId(long id) {
		_navigation.setId(id);
	}

	/**
	* Returns the name of this n a v i g a t i o n.
	*
	* @return the name of this n a v i g a t i o n
	*/
	@Override
	public java.lang.String getName() {
		return _navigation.getName();
	}

	/**
	* Sets the name of this n a v i g a t i o n.
	*
	* @param name the name of this n a v i g a t i o n
	*/
	@Override
	public void setName(java.lang.String name) {
		_navigation.setName(name);
	}

	/**
	* Returns the nav sub of this n a v i g a t i o n.
	*
	* @return the nav sub of this n a v i g a t i o n
	*/
	@Override
	public java.lang.String getNavSub() {
		return _navigation.getNavSub();
	}

	/**
	* Sets the nav sub of this n a v i g a t i o n.
	*
	* @param navSub the nav sub of this n a v i g a t i o n
	*/
	@Override
	public void setNavSub(java.lang.String navSub) {
		_navigation.setNavSub(navSub);
	}

	/**
	* Returns the nav sub owner of this n a v i g a t i o n.
	*
	* @return the nav sub owner of this n a v i g a t i o n
	*/
	@Override
	public java.lang.String getNavSubOwner() {
		return _navigation.getNavSubOwner();
	}

	/**
	* Sets the nav sub owner of this n a v i g a t i o n.
	*
	* @param navSubOwner the nav sub owner of this n a v i g a t i o n
	*/
	@Override
	public void setNavSubOwner(java.lang.String navSubOwner) {
		_navigation.setNavSubOwner(navSubOwner);
	}

	/**
	* Returns the role owner of this n a v i g a t i o n.
	*
	* @return the role owner of this n a v i g a t i o n
	*/
	@Override
	public java.lang.String getRoleOwner() {
		return _navigation.getRoleOwner();
	}

	/**
	* Sets the role owner of this n a v i g a t i o n.
	*
	* @param roleOwner the role owner of this n a v i g a t i o n
	*/
	@Override
	public void setRoleOwner(java.lang.String roleOwner) {
		_navigation.setRoleOwner(roleOwner);
	}

	/**
	* Returns the permission owner of this n a v i g a t i o n.
	*
	* @return the permission owner of this n a v i g a t i o n
	*/
	@Override
	public java.lang.String getPermissionOwner() {
		return _navigation.getPermissionOwner();
	}

	/**
	* Sets the permission owner of this n a v i g a t i o n.
	*
	* @param permissionOwner the permission owner of this n a v i g a t i o n
	*/
	@Override
	public void setPermissionOwner(java.lang.String permissionOwner) {
		_navigation.setPermissionOwner(permissionOwner);
	}

	/**
	* Returns the parent ID of this n a v i g a t i o n.
	*
	* @return the parent ID of this n a v i g a t i o n
	*/
	@Override
	public long getParentId() {
		return _navigation.getParentId();
	}

	/**
	* Sets the parent ID of this n a v i g a t i o n.
	*
	* @param parentId the parent ID of this n a v i g a t i o n
	*/
	@Override
	public void setParentId(long parentId) {
		_navigation.setParentId(parentId);
	}

	/**
	* Returns the hidden of this n a v i g a t i o n.
	*
	* @return the hidden of this n a v i g a t i o n
	*/
	@Override
	public long getHidden() {
		return _navigation.getHidden();
	}

	/**
	* Sets the hidden of this n a v i g a t i o n.
	*
	* @param hidden the hidden of this n a v i g a t i o n
	*/
	@Override
	public void setHidden(long hidden) {
		_navigation.setHidden(hidden);
	}

	/**
	* Returns the order of this n a v i g a t i o n.
	*
	* @return the order of this n a v i g a t i o n
	*/
	@Override
	public long getOrder() {
		return _navigation.getOrder();
	}

	/**
	* Sets the order of this n a v i g a t i o n.
	*
	* @param order the order of this n a v i g a t i o n
	*/
	@Override
	public void setOrder(long order) {
		_navigation.setOrder(order);
	}

	/**
	* Returns the thong ke of this n a v i g a t i o n.
	*
	* @return the thong ke of this n a v i g a t i o n
	*/
	@Override
	public java.lang.String getThongKe() {
		return _navigation.getThongKe();
	}

	/**
	* Sets the thong ke of this n a v i g a t i o n.
	*
	* @param thongKe the thong ke of this n a v i g a t i o n
	*/
	@Override
	public void setThongKe(java.lang.String thongKe) {
		_navigation.setThongKe(thongKe);
	}

	@Override
	public boolean isNew() {
		return _navigation.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_navigation.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _navigation.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_navigation.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _navigation.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _navigation.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_navigation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _navigation.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_navigation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_navigation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_navigation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NAVIGATIONWrapper((NAVIGATION)_navigation.clone());
	}

	@Override
	public int compareTo(vn.dtt.cmon.dm.dao.model.NAVIGATION navigation) {
		return _navigation.compareTo(navigation);
	}

	@Override
	public int hashCode() {
		return _navigation.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.cmon.dm.dao.model.NAVIGATION> toCacheModel() {
		return _navigation.toCacheModel();
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.NAVIGATION toEscapedModel() {
		return new NAVIGATIONWrapper(_navigation.toEscapedModel());
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.NAVIGATION toUnescapedModel() {
		return new NAVIGATIONWrapper(_navigation.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _navigation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _navigation.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_navigation.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NAVIGATIONWrapper)) {
			return false;
		}

		NAVIGATIONWrapper navigationWrapper = (NAVIGATIONWrapper)obj;

		if (Validator.equals(_navigation, navigationWrapper._navigation)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NAVIGATION getWrappedNAVIGATION() {
		return _navigation;
	}

	@Override
	public NAVIGATION getWrappedModel() {
		return _navigation;
	}

	@Override
	public void resetOriginalValues() {
		_navigation.resetOriginalValues();
	}

	private NAVIGATION _navigation;
}