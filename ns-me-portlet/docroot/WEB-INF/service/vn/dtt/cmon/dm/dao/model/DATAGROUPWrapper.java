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
 * This class is a wrapper for {@link DATAGROUP}.
 * </p>
 *
 * @author khoa.vu
 * @see DATAGROUP
 * @generated
 */
public class DATAGROUPWrapper implements DATAGROUP, ModelWrapper<DATAGROUP> {
	public DATAGROUPWrapper(DATAGROUP datagroup) {
		_datagroup = datagroup;
	}

	@Override
	public Class<?> getModelClass() {
		return DATAGROUP.class;
	}

	@Override
	public String getModelClassName() {
		return DATAGROUP.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("code", getCode());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this d a t a g r o u p.
	*
	* @return the primary key of this d a t a g r o u p
	*/
	@Override
	public long getPrimaryKey() {
		return _datagroup.getPrimaryKey();
	}

	/**
	* Sets the primary key of this d a t a g r o u p.
	*
	* @param primaryKey the primary key of this d a t a g r o u p
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_datagroup.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this d a t a g r o u p.
	*
	* @return the ID of this d a t a g r o u p
	*/
	@Override
	public long getId() {
		return _datagroup.getId();
	}

	/**
	* Sets the ID of this d a t a g r o u p.
	*
	* @param id the ID of this d a t a g r o u p
	*/
	@Override
	public void setId(long id) {
		_datagroup.setId(id);
	}

	/**
	* Returns the code of this d a t a g r o u p.
	*
	* @return the code of this d a t a g r o u p
	*/
	@Override
	public java.lang.String getCode() {
		return _datagroup.getCode();
	}

	/**
	* Sets the code of this d a t a g r o u p.
	*
	* @param code the code of this d a t a g r o u p
	*/
	@Override
	public void setCode(java.lang.String code) {
		_datagroup.setCode(code);
	}

	/**
	* Returns the name of this d a t a g r o u p.
	*
	* @return the name of this d a t a g r o u p
	*/
	@Override
	public java.lang.String getName() {
		return _datagroup.getName();
	}

	/**
	* Sets the name of this d a t a g r o u p.
	*
	* @param name the name of this d a t a g r o u p
	*/
	@Override
	public void setName(java.lang.String name) {
		_datagroup.setName(name);
	}

	/**
	* Returns the description of this d a t a g r o u p.
	*
	* @return the description of this d a t a g r o u p
	*/
	@Override
	public java.lang.String getDescription() {
		return _datagroup.getDescription();
	}

	/**
	* Sets the description of this d a t a g r o u p.
	*
	* @param description the description of this d a t a g r o u p
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_datagroup.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _datagroup.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_datagroup.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _datagroup.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_datagroup.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _datagroup.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _datagroup.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_datagroup.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _datagroup.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_datagroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_datagroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_datagroup.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DATAGROUPWrapper((DATAGROUP)_datagroup.clone());
	}

	@Override
	public int compareTo(vn.dtt.cmon.dm.dao.model.DATAGROUP datagroup) {
		return _datagroup.compareTo(datagroup);
	}

	@Override
	public int hashCode() {
		return _datagroup.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.cmon.dm.dao.model.DATAGROUP> toCacheModel() {
		return _datagroup.toCacheModel();
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.DATAGROUP toEscapedModel() {
		return new DATAGROUPWrapper(_datagroup.toEscapedModel());
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.DATAGROUP toUnescapedModel() {
		return new DATAGROUPWrapper(_datagroup.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _datagroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _datagroup.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_datagroup.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DATAGROUPWrapper)) {
			return false;
		}

		DATAGROUPWrapper datagroupWrapper = (DATAGROUPWrapper)obj;

		if (Validator.equals(_datagroup, datagroupWrapper._datagroup)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DATAGROUP getWrappedDATAGROUP() {
		return _datagroup;
	}

	@Override
	public DATAGROUP getWrappedModel() {
		return _datagroup;
	}

	@Override
	public void resetOriginalValues() {
		_datagroup.resetOriginalValues();
	}

	private DATAGROUP _datagroup;
}