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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.dtt.cmon.user.dao.service.ClpSerializer;
import vn.dtt.cmon.user.dao.service.UserMappingLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author khoa.vu
 */
public class UserMappingClp extends BaseModelImpl<UserMapping>
	implements UserMapping {
	public UserMappingClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_userMappingRemoteModel != null) {
			try {
				Class<?> clazz = _userMappingRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_userMappingRemoteModel, id);
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

		if (_userMappingRemoteModel != null) {
			try {
				Class<?> clazz = _userMappingRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_userMappingRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_userMappingRemoteModel != null) {
			try {
				Class<?> clazz = _userMappingRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_userMappingRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public int getUserType() {
		return _userType;
	}

	@Override
	public void setUserType(int userType) {
		_userType = userType;

		if (_userMappingRemoteModel != null) {
			try {
				Class<?> clazz = _userMappingRemoteModel.getClass();

				Method method = clazz.getMethod("setUserType", int.class);

				method.invoke(_userMappingRemoteModel, userType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrgCode1() {
		return _orgCode1;
	}

	@Override
	public void setOrgCode1(String orgCode1) {
		_orgCode1 = orgCode1;

		if (_userMappingRemoteModel != null) {
			try {
				Class<?> clazz = _userMappingRemoteModel.getClass();

				Method method = clazz.getMethod("setOrgCode1", String.class);

				method.invoke(_userMappingRemoteModel, orgCode1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrgCode2() {
		return _orgCode2;
	}

	@Override
	public void setOrgCode2(String orgCode2) {
		_orgCode2 = orgCode2;

		if (_userMappingRemoteModel != null) {
			try {
				Class<?> clazz = _userMappingRemoteModel.getClass();

				Method method = clazz.getMethod("setOrgCode2", String.class);

				method.invoke(_userMappingRemoteModel, orgCode2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUserMappingRemoteModel() {
		return _userMappingRemoteModel;
	}

	public void setUserMappingRemoteModel(BaseModel<?> userMappingRemoteModel) {
		_userMappingRemoteModel = userMappingRemoteModel;
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

		Class<?> remoteModelClass = _userMappingRemoteModel.getClass();

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

		Object returnValue = method.invoke(_userMappingRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UserMappingLocalServiceUtil.addUserMapping(this);
		}
		else {
			UserMappingLocalServiceUtil.updateUserMapping(this);
		}
	}

	@Override
	public UserMapping toEscapedModel() {
		return (UserMapping)ProxyUtil.newProxyInstance(UserMapping.class.getClassLoader(),
			new Class[] { UserMapping.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UserMappingClp clone = new UserMappingClp();

		clone.setId(getId());
		clone.setName(getName());
		clone.setUserId(getUserId());
		clone.setUserType(getUserType());
		clone.setOrgCode1(getOrgCode1());
		clone.setOrgCode2(getOrgCode2());

		return clone;
	}

	@Override
	public int compareTo(UserMapping userMapping) {
		long primaryKey = userMapping.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserMappingClp)) {
			return false;
		}

		UserMappingClp userMapping = (UserMappingClp)obj;

		long primaryKey = userMapping.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userType=");
		sb.append(getUserType());
		sb.append(", orgCode1=");
		sb.append(getOrgCode1());
		sb.append(", orgCode2=");
		sb.append(getOrgCode2());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.cmon.user.dao.model.UserMapping");
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
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userType</column-name><column-value><![CDATA[");
		sb.append(getUserType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orgCode1</column-name><column-value><![CDATA[");
		sb.append(getOrgCode1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orgCode2</column-name><column-value><![CDATA[");
		sb.append(getOrgCode2());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _name;
	private long _userId;
	private String _userUuid;
	private int _userType;
	private String _orgCode1;
	private String _orgCode2;
	private BaseModel<?> _userMappingRemoteModel;
}