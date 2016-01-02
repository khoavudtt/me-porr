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

package vn.dtt.sol.ns.tramcap.dao.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer;
import vn.dtt.sol.ns.tramcap.dao.service.KeHoachNuocSachLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author khoa.vu
 */
public class KeHoachNuocSachClp extends BaseModelImpl<KeHoachNuocSach>
	implements KeHoachNuocSach {
	public KeHoachNuocSachClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return KeHoachNuocSach.class;
	}

	@Override
	public String getModelClassName() {
		return KeHoachNuocSach.class.getName();
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
		attributes.put("tramCapNuocId", getTramCapNuocId());
		attributes.put("nam", getNam());
		attributes.put("soDauNoiMoi", getSoDauNoiMoi());
		attributes.put("soNguoiHuongLoi", getSoNguoiHuongLoi());
		attributes.put("ghiChu", getGhiChu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer tramCapNuocId = (Integer)attributes.get("tramCapNuocId");

		if (tramCapNuocId != null) {
			setTramCapNuocId(tramCapNuocId);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer soDauNoiMoi = (Integer)attributes.get("soDauNoiMoi");

		if (soDauNoiMoi != null) {
			setSoDauNoiMoi(soDauNoiMoi);
		}

		Integer soNguoiHuongLoi = (Integer)attributes.get("soNguoiHuongLoi");

		if (soNguoiHuongLoi != null) {
			setSoNguoiHuongLoi(soNguoiHuongLoi);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_keHoachNuocSachRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachNuocSachRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_keHoachNuocSachRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTramCapNuocId() {
		return _tramCapNuocId;
	}

	@Override
	public void setTramCapNuocId(int tramCapNuocId) {
		_tramCapNuocId = tramCapNuocId;

		if (_keHoachNuocSachRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachNuocSachRemoteModel.getClass();

				Method method = clazz.getMethod("setTramCapNuocId", int.class);

				method.invoke(_keHoachNuocSachRemoteModel, tramCapNuocId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNam() {
		return _nam;
	}

	@Override
	public void setNam(int nam) {
		_nam = nam;

		if (_keHoachNuocSachRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachNuocSachRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", int.class);

				method.invoke(_keHoachNuocSachRemoteModel, nam);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoDauNoiMoi() {
		return _soDauNoiMoi;
	}

	@Override
	public void setSoDauNoiMoi(int soDauNoiMoi) {
		_soDauNoiMoi = soDauNoiMoi;

		if (_keHoachNuocSachRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachNuocSachRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDauNoiMoi", int.class);

				method.invoke(_keHoachNuocSachRemoteModel, soDauNoiMoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNguoiHuongLoi() {
		return _soNguoiHuongLoi;
	}

	@Override
	public void setSoNguoiHuongLoi(int soNguoiHuongLoi) {
		_soNguoiHuongLoi = soNguoiHuongLoi;

		if (_keHoachNuocSachRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachNuocSachRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNguoiHuongLoi", int.class);

				method.invoke(_keHoachNuocSachRemoteModel, soNguoiHuongLoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGhiChu() {
		return _ghiChu;
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;

		if (_keHoachNuocSachRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachNuocSachRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_keHoachNuocSachRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKeHoachNuocSachRemoteModel() {
		return _keHoachNuocSachRemoteModel;
	}

	public void setKeHoachNuocSachRemoteModel(
		BaseModel<?> keHoachNuocSachRemoteModel) {
		_keHoachNuocSachRemoteModel = keHoachNuocSachRemoteModel;
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

		Class<?> remoteModelClass = _keHoachNuocSachRemoteModel.getClass();

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

		Object returnValue = method.invoke(_keHoachNuocSachRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KeHoachNuocSachLocalServiceUtil.addKeHoachNuocSach(this);
		}
		else {
			KeHoachNuocSachLocalServiceUtil.updateKeHoachNuocSach(this);
		}
	}

	@Override
	public KeHoachNuocSach toEscapedModel() {
		return (KeHoachNuocSach)ProxyUtil.newProxyInstance(KeHoachNuocSach.class.getClassLoader(),
			new Class[] { KeHoachNuocSach.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KeHoachNuocSachClp clone = new KeHoachNuocSachClp();

		clone.setId(getId());
		clone.setTramCapNuocId(getTramCapNuocId());
		clone.setNam(getNam());
		clone.setSoDauNoiMoi(getSoDauNoiMoi());
		clone.setSoNguoiHuongLoi(getSoNguoiHuongLoi());
		clone.setGhiChu(getGhiChu());

		return clone;
	}

	@Override
	public int compareTo(KeHoachNuocSach keHoachNuocSach) {
		int value = 0;

		if (getId() < keHoachNuocSach.getId()) {
			value = -1;
		}
		else if (getId() > keHoachNuocSach.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		if (!(obj instanceof KeHoachNuocSachClp)) {
			return false;
		}

		KeHoachNuocSachClp keHoachNuocSach = (KeHoachNuocSachClp)obj;

		long primaryKey = keHoachNuocSach.getPrimaryKey();

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
		sb.append(", tramCapNuocId=");
		sb.append(getTramCapNuocId());
		sb.append(", nam=");
		sb.append(getNam());
		sb.append(", soDauNoiMoi=");
		sb.append(getSoDauNoiMoi());
		sb.append(", soNguoiHuongLoi=");
		sb.append(getSoNguoiHuongLoi());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tramCapNuocId</column-name><column-value><![CDATA[");
		sb.append(getTramCapNuocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nam</column-name><column-value><![CDATA[");
		sb.append(getNam());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDauNoiMoi</column-name><column-value><![CDATA[");
		sb.append(getSoDauNoiMoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNguoiHuongLoi</column-name><column-value><![CDATA[");
		sb.append(getSoNguoiHuongLoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _tramCapNuocId;
	private int _nam;
	private int _soDauNoiMoi;
	private int _soNguoiHuongLoi;
	private String _ghiChu;
	private BaseModel<?> _keHoachNuocSachRemoteModel;
}