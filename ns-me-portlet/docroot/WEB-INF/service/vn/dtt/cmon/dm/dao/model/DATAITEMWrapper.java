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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DATAITEM}.
 * </p>
 *
 * @author khoa.vu
 * @see DATAITEM
 * @generated
 */
public class DATAITEMWrapper implements DATAITEM, ModelWrapper<DATAITEM> {
	public DATAITEMWrapper(DATAITEM dataitem) {
		_dataitem = dataitem;
	}

	@Override
	public Class<?> getModelClass() {
		return DATAITEM.class;
	}

	@Override
	public String getModelClassName() {
		return DATAITEM.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dataGroupId", getDataGroupId());
		attributes.put("code", getCode());
		attributes.put("node1", getNode1());
		attributes.put("node2", getNode2());
		attributes.put("node3", getNode3());
		attributes.put("node4", getNode4());
		attributes.put("level", getLevel());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("status", getStatus());
		attributes.put("validatedFrom", getValidatedFrom());
		attributes.put("validatedTo", getValidatedTo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dataGroupId = (Long)attributes.get("dataGroupId");

		if (dataGroupId != null) {
			setDataGroupId(dataGroupId);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String node1 = (String)attributes.get("node1");

		if (node1 != null) {
			setNode1(node1);
		}

		String node2 = (String)attributes.get("node2");

		if (node2 != null) {
			setNode2(node2);
		}

		String node3 = (String)attributes.get("node3");

		if (node3 != null) {
			setNode3(node3);
		}

		String node4 = (String)attributes.get("node4");

		if (node4 != null) {
			setNode4(node4);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date validatedFrom = (Date)attributes.get("validatedFrom");

		if (validatedFrom != null) {
			setValidatedFrom(validatedFrom);
		}

		Date validatedTo = (Date)attributes.get("validatedTo");

		if (validatedTo != null) {
			setValidatedTo(validatedTo);
		}
	}

	/**
	* Returns the primary key of this d a t a i t e m.
	*
	* @return the primary key of this d a t a i t e m
	*/
	@Override
	public long getPrimaryKey() {
		return _dataitem.getPrimaryKey();
	}

	/**
	* Sets the primary key of this d a t a i t e m.
	*
	* @param primaryKey the primary key of this d a t a i t e m
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dataitem.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this d a t a i t e m.
	*
	* @return the ID of this d a t a i t e m
	*/
	@Override
	public long getId() {
		return _dataitem.getId();
	}

	/**
	* Sets the ID of this d a t a i t e m.
	*
	* @param id the ID of this d a t a i t e m
	*/
	@Override
	public void setId(long id) {
		_dataitem.setId(id);
	}

	/**
	* Returns the data group ID of this d a t a i t e m.
	*
	* @return the data group ID of this d a t a i t e m
	*/
	@Override
	public long getDataGroupId() {
		return _dataitem.getDataGroupId();
	}

	/**
	* Sets the data group ID of this d a t a i t e m.
	*
	* @param dataGroupId the data group ID of this d a t a i t e m
	*/
	@Override
	public void setDataGroupId(long dataGroupId) {
		_dataitem.setDataGroupId(dataGroupId);
	}

	/**
	* Returns the code of this d a t a i t e m.
	*
	* @return the code of this d a t a i t e m
	*/
	@Override
	public java.lang.String getCode() {
		return _dataitem.getCode();
	}

	/**
	* Sets the code of this d a t a i t e m.
	*
	* @param code the code of this d a t a i t e m
	*/
	@Override
	public void setCode(java.lang.String code) {
		_dataitem.setCode(code);
	}

	/**
	* Returns the node1 of this d a t a i t e m.
	*
	* @return the node1 of this d a t a i t e m
	*/
	@Override
	public java.lang.String getNode1() {
		return _dataitem.getNode1();
	}

	/**
	* Sets the node1 of this d a t a i t e m.
	*
	* @param node1 the node1 of this d a t a i t e m
	*/
	@Override
	public void setNode1(java.lang.String node1) {
		_dataitem.setNode1(node1);
	}

	/**
	* Returns the node2 of this d a t a i t e m.
	*
	* @return the node2 of this d a t a i t e m
	*/
	@Override
	public java.lang.String getNode2() {
		return _dataitem.getNode2();
	}

	/**
	* Sets the node2 of this d a t a i t e m.
	*
	* @param node2 the node2 of this d a t a i t e m
	*/
	@Override
	public void setNode2(java.lang.String node2) {
		_dataitem.setNode2(node2);
	}

	/**
	* Returns the node3 of this d a t a i t e m.
	*
	* @return the node3 of this d a t a i t e m
	*/
	@Override
	public java.lang.String getNode3() {
		return _dataitem.getNode3();
	}

	/**
	* Sets the node3 of this d a t a i t e m.
	*
	* @param node3 the node3 of this d a t a i t e m
	*/
	@Override
	public void setNode3(java.lang.String node3) {
		_dataitem.setNode3(node3);
	}

	/**
	* Returns the node4 of this d a t a i t e m.
	*
	* @return the node4 of this d a t a i t e m
	*/
	@Override
	public java.lang.String getNode4() {
		return _dataitem.getNode4();
	}

	/**
	* Sets the node4 of this d a t a i t e m.
	*
	* @param node4 the node4 of this d a t a i t e m
	*/
	@Override
	public void setNode4(java.lang.String node4) {
		_dataitem.setNode4(node4);
	}

	/**
	* Returns the level of this d a t a i t e m.
	*
	* @return the level of this d a t a i t e m
	*/
	@Override
	public int getLevel() {
		return _dataitem.getLevel();
	}

	/**
	* Sets the level of this d a t a i t e m.
	*
	* @param level the level of this d a t a i t e m
	*/
	@Override
	public void setLevel(int level) {
		_dataitem.setLevel(level);
	}

	/**
	* Returns the name of this d a t a i t e m.
	*
	* @return the name of this d a t a i t e m
	*/
	@Override
	public java.lang.String getName() {
		return _dataitem.getName();
	}

	/**
	* Sets the name of this d a t a i t e m.
	*
	* @param name the name of this d a t a i t e m
	*/
	@Override
	public void setName(java.lang.String name) {
		_dataitem.setName(name);
	}

	/**
	* Returns the description of this d a t a i t e m.
	*
	* @return the description of this d a t a i t e m
	*/
	@Override
	public java.lang.String getDescription() {
		return _dataitem.getDescription();
	}

	/**
	* Sets the description of this d a t a i t e m.
	*
	* @param description the description of this d a t a i t e m
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dataitem.setDescription(description);
	}

	/**
	* Returns the status of this d a t a i t e m.
	*
	* @return the status of this d a t a i t e m
	*/
	@Override
	public int getStatus() {
		return _dataitem.getStatus();
	}

	/**
	* Sets the status of this d a t a i t e m.
	*
	* @param status the status of this d a t a i t e m
	*/
	@Override
	public void setStatus(int status) {
		_dataitem.setStatus(status);
	}

	/**
	* Returns the validated from of this d a t a i t e m.
	*
	* @return the validated from of this d a t a i t e m
	*/
	@Override
	public java.util.Date getValidatedFrom() {
		return _dataitem.getValidatedFrom();
	}

	/**
	* Sets the validated from of this d a t a i t e m.
	*
	* @param validatedFrom the validated from of this d a t a i t e m
	*/
	@Override
	public void setValidatedFrom(java.util.Date validatedFrom) {
		_dataitem.setValidatedFrom(validatedFrom);
	}

	/**
	* Returns the validated to of this d a t a i t e m.
	*
	* @return the validated to of this d a t a i t e m
	*/
	@Override
	public java.util.Date getValidatedTo() {
		return _dataitem.getValidatedTo();
	}

	/**
	* Sets the validated to of this d a t a i t e m.
	*
	* @param validatedTo the validated to of this d a t a i t e m
	*/
	@Override
	public void setValidatedTo(java.util.Date validatedTo) {
		_dataitem.setValidatedTo(validatedTo);
	}

	@Override
	public boolean isNew() {
		return _dataitem.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dataitem.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dataitem.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dataitem.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dataitem.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dataitem.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dataitem.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dataitem.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dataitem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dataitem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dataitem.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DATAITEMWrapper((DATAITEM)_dataitem.clone());
	}

	@Override
	public int compareTo(vn.dtt.cmon.dm.dao.model.DATAITEM dataitem) {
		return _dataitem.compareTo(dataitem);
	}

	@Override
	public int hashCode() {
		return _dataitem.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.cmon.dm.dao.model.DATAITEM> toCacheModel() {
		return _dataitem.toCacheModel();
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM toEscapedModel() {
		return new DATAITEMWrapper(_dataitem.toEscapedModel());
	}

	@Override
	public vn.dtt.cmon.dm.dao.model.DATAITEM toUnescapedModel() {
		return new DATAITEMWrapper(_dataitem.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dataitem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dataitem.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dataitem.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DATAITEMWrapper)) {
			return false;
		}

		DATAITEMWrapper dataitemWrapper = (DATAITEMWrapper)obj;

		if (Validator.equals(_dataitem, dataitemWrapper._dataitem)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DATAITEM getWrappedDATAITEM() {
		return _dataitem;
	}

	@Override
	public DATAITEM getWrappedModel() {
		return _dataitem;
	}

	@Override
	public void resetOriginalValues() {
		_dataitem.resetOriginalValues();
	}

	private DATAITEM _dataitem;
}