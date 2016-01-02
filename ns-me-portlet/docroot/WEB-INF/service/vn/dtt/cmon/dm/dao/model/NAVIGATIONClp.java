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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.cmon.dm.dao.service.ClpSerializer;
import vn.dtt.cmon.dm.dao.service.NAVIGATIONLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author khoa.vu
 */
public class NAVIGATIONClp extends BaseModelImpl<NAVIGATION>
	implements NAVIGATION {
	public NAVIGATIONClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_navigationRemoteModel != null) {
			try {
				Class<?> clazz = _navigationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_navigationRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_navigationRemoteModel != null) {
			try {
				Class<?> clazz = _navigationRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_navigationRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNavSub() {
		return _navSub;
	}

	@Override
	public void setNavSub(String navSub) {
		_navSub = navSub;

		if (_navigationRemoteModel != null) {
			try {
				Class<?> clazz = _navigationRemoteModel.getClass();

				Method method = clazz.getMethod("setNavSub", String.class);

				method.invoke(_navigationRemoteModel, navSub);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNavSubOwner() {
		return _navSubOwner;
	}

	@Override
	public void setNavSubOwner(String navSubOwner) {
		_navSubOwner = navSubOwner;

		if (_navigationRemoteModel != null) {
			try {
				Class<?> clazz = _navigationRemoteModel.getClass();

				Method method = clazz.getMethod("setNavSubOwner", String.class);

				method.invoke(_navigationRemoteModel, navSubOwner);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoleOwner() {
		return _roleOwner;
	}

	@Override
	public void setRoleOwner(String roleOwner) {
		_roleOwner = roleOwner;

		if (_navigationRemoteModel != null) {
			try {
				Class<?> clazz = _navigationRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleOwner", String.class);

				method.invoke(_navigationRemoteModel, roleOwner);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPermissionOwner() {
		return _permissionOwner;
	}

	@Override
	public void setPermissionOwner(String permissionOwner) {
		_permissionOwner = permissionOwner;

		if (_navigationRemoteModel != null) {
			try {
				Class<?> clazz = _navigationRemoteModel.getClass();

				Method method = clazz.getMethod("setPermissionOwner",
						String.class);

				method.invoke(_navigationRemoteModel, permissionOwner);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getParentId() {
		return _parentId;
	}

	@Override
	public void setParentId(long parentId) {
		_parentId = parentId;

		if (_navigationRemoteModel != null) {
			try {
				Class<?> clazz = _navigationRemoteModel.getClass();

				Method method = clazz.getMethod("setParentId", long.class);

				method.invoke(_navigationRemoteModel, parentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHidden() {
		return _hidden;
	}

	@Override
	public void setHidden(long hidden) {
		_hidden = hidden;

		if (_navigationRemoteModel != null) {
			try {
				Class<?> clazz = _navigationRemoteModel.getClass();

				Method method = clazz.getMethod("setHidden", long.class);

				method.invoke(_navigationRemoteModel, hidden);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOrder() {
		return _order;
	}

	@Override
	public void setOrder(long order) {
		_order = order;

		if (_navigationRemoteModel != null) {
			try {
				Class<?> clazz = _navigationRemoteModel.getClass();

				Method method = clazz.getMethod("setOrder", long.class);

				method.invoke(_navigationRemoteModel, order);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThongKe() {
		return _thongKe;
	}

	@Override
	public void setThongKe(String thongKe) {
		_thongKe = thongKe;

		if (_navigationRemoteModel != null) {
			try {
				Class<?> clazz = _navigationRemoteModel.getClass();

				Method method = clazz.getMethod("setThongKe", String.class);

				method.invoke(_navigationRemoteModel, thongKe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNAVIGATIONRemoteModel() {
		return _navigationRemoteModel;
	}

	public void setNAVIGATIONRemoteModel(BaseModel<?> navigationRemoteModel) {
		_navigationRemoteModel = navigationRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _navigationRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_navigationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NAVIGATIONLocalServiceUtil.addNAVIGATION(this);
		}
		else {
			NAVIGATIONLocalServiceUtil.updateNAVIGATION(this);
		}
	}

	@Override
	public NAVIGATION toEscapedModel() {
		return (NAVIGATION)ProxyUtil.newProxyInstance(NAVIGATION.class.getClassLoader(),
			new Class[] { NAVIGATION.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NAVIGATIONClp clone = new NAVIGATIONClp();

		clone.setId(getId());
		clone.setName(getName());
		clone.setNavSub(getNavSub());
		clone.setNavSubOwner(getNavSubOwner());
		clone.setRoleOwner(getRoleOwner());
		clone.setPermissionOwner(getPermissionOwner());
		clone.setParentId(getParentId());
		clone.setHidden(getHidden());
		clone.setOrder(getOrder());
		clone.setThongKe(getThongKe());

		return clone;
	}

	@Override
	public int compareTo(NAVIGATION navigation) {
		int value = 0;

		if (getOrder() < navigation.getOrder()) {
			value = -1;
		}
		else if (getOrder() > navigation.getOrder()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NAVIGATIONClp)) {
			return false;
		}

		NAVIGATIONClp navigation = (NAVIGATIONClp)obj;

		long primaryKey = navigation.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", navSub=");
		sb.append(getNavSub());
		sb.append(", navSubOwner=");
		sb.append(getNavSubOwner());
		sb.append(", roleOwner=");
		sb.append(getRoleOwner());
		sb.append(", permissionOwner=");
		sb.append(getPermissionOwner());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append(", hidden=");
		sb.append(getHidden());
		sb.append(", order=");
		sb.append(getOrder());
		sb.append(", thongKe=");
		sb.append(getThongKe());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.cmon.dm.dao.model.NAVIGATION");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>navSub</column-name><column-value><![CDATA[");
		sb.append(getNavSub());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>navSubOwner</column-name><column-value><![CDATA[");
		sb.append(getNavSubOwner());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleOwner</column-name><column-value><![CDATA[");
		sb.append(getRoleOwner());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>permissionOwner</column-name><column-value><![CDATA[");
		sb.append(getPermissionOwner());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hidden</column-name><column-value><![CDATA[");
		sb.append(getHidden());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>order</column-name><column-value><![CDATA[");
		sb.append(getOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongKe</column-name><column-value><![CDATA[");
		sb.append(getThongKe());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _name;
	private String _navSub;
	private String _navSubOwner;
	private String _roleOwner;
	private String _permissionOwner;
	private long _parentId;
	private long _hidden;
	private long _order;
	private String _thongKe;
	private BaseModel<?> _navigationRemoteModel;
}