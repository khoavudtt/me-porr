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

package vn.dtt.sol.ns.kehoachdaunam.dao.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.sol.ns.kehoachdaunam.dao.service.ClpSerializer;
import vn.dtt.sol.ns.kehoachdaunam.dao.service.KeHoachDauNamLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author HANT
 */
public class KeHoachDauNamClp extends BaseModelImpl<KeHoachDauNam>
	implements KeHoachDauNam {
	public KeHoachDauNamClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return KeHoachDauNam.class;
	}

	@Override
	public String getModelClassName() {
		return KeHoachDauNam.class.getName();
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
		attributes.put("soHoHuongLoi", getSoHoHuongLoi());
		attributes.put("soNguoiHuongLoi", getSoNguoiHuongLoi());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("baoCaoDLI", getBaoCaoDLI());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long tramCapNuocId = (Long)attributes.get("tramCapNuocId");

		if (tramCapNuocId != null) {
			setTramCapNuocId(tramCapNuocId);
		}

		Long nam = (Long)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Long soDauNoiMoi = (Long)attributes.get("soDauNoiMoi");

		if (soDauNoiMoi != null) {
			setSoDauNoiMoi(soDauNoiMoi);
		}

		Long soHoHuongLoi = (Long)attributes.get("soHoHuongLoi");

		if (soHoHuongLoi != null) {
			setSoHoHuongLoi(soHoHuongLoi);
		}

		Long soNguoiHuongLoi = (Long)attributes.get("soNguoiHuongLoi");

		if (soNguoiHuongLoi != null) {
			setSoNguoiHuongLoi(soNguoiHuongLoi);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Long baoCaoDLI = (Long)attributes.get("baoCaoDLI");

		if (baoCaoDLI != null) {
			setBaoCaoDLI(baoCaoDLI);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long idNguoiTao = (Long)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_keHoachDauNamRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachDauNamRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_keHoachDauNamRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTramCapNuocId() {
		return _tramCapNuocId;
	}

	@Override
	public void setTramCapNuocId(long tramCapNuocId) {
		_tramCapNuocId = tramCapNuocId;

		if (_keHoachDauNamRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachDauNamRemoteModel.getClass();

				Method method = clazz.getMethod("setTramCapNuocId", long.class);

				method.invoke(_keHoachDauNamRemoteModel, tramCapNuocId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNam() {
		return _nam;
	}

	@Override
	public void setNam(long nam) {
		_nam = nam;

		if (_keHoachDauNamRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachDauNamRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", long.class);

				method.invoke(_keHoachDauNamRemoteModel, nam);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoDauNoiMoi() {
		return _soDauNoiMoi;
	}

	@Override
	public void setSoDauNoiMoi(long soDauNoiMoi) {
		_soDauNoiMoi = soDauNoiMoi;

		if (_keHoachDauNamRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachDauNamRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDauNoiMoi", long.class);

				method.invoke(_keHoachDauNamRemoteModel, soDauNoiMoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoHoHuongLoi() {
		return _soHoHuongLoi;
	}

	@Override
	public void setSoHoHuongLoi(long soHoHuongLoi) {
		_soHoHuongLoi = soHoHuongLoi;

		if (_keHoachDauNamRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachDauNamRemoteModel.getClass();

				Method method = clazz.getMethod("setSoHoHuongLoi", long.class);

				method.invoke(_keHoachDauNamRemoteModel, soHoHuongLoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoNguoiHuongLoi() {
		return _soNguoiHuongLoi;
	}

	@Override
	public void setSoNguoiHuongLoi(long soNguoiHuongLoi) {
		_soNguoiHuongLoi = soNguoiHuongLoi;

		if (_keHoachDauNamRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachDauNamRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNguoiHuongLoi", long.class);

				method.invoke(_keHoachDauNamRemoteModel, soNguoiHuongLoi);
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

		if (_keHoachDauNamRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachDauNamRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_keHoachDauNamRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBaoCaoDLI() {
		return _baoCaoDLI;
	}

	@Override
	public void setBaoCaoDLI(long baoCaoDLI) {
		_baoCaoDLI = baoCaoDLI;

		if (_keHoachDauNamRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachDauNamRemoteModel.getClass();

				Method method = clazz.getMethod("setBaoCaoDLI", long.class);

				method.invoke(_keHoachDauNamRemoteModel, baoCaoDLI);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTao() {
		return _ngayTao;
	}

	@Override
	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;

		if (_keHoachDauNamRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachDauNamRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_keHoachDauNamRemoteModel, ngayTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIdNguoiTao() {
		return _idNguoiTao;
	}

	@Override
	public void setIdNguoiTao(long idNguoiTao) {
		_idNguoiTao = idNguoiTao;

		if (_keHoachDauNamRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachDauNamRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", long.class);

				method.invoke(_keHoachDauNamRemoteModel, idNguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKeHoachDauNamRemoteModel() {
		return _keHoachDauNamRemoteModel;
	}

	public void setKeHoachDauNamRemoteModel(
		BaseModel<?> keHoachDauNamRemoteModel) {
		_keHoachDauNamRemoteModel = keHoachDauNamRemoteModel;
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

		Class<?> remoteModelClass = _keHoachDauNamRemoteModel.getClass();

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

		Object returnValue = method.invoke(_keHoachDauNamRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KeHoachDauNamLocalServiceUtil.addKeHoachDauNam(this);
		}
		else {
			KeHoachDauNamLocalServiceUtil.updateKeHoachDauNam(this);
		}
	}

	@Override
	public KeHoachDauNam toEscapedModel() {
		return (KeHoachDauNam)ProxyUtil.newProxyInstance(KeHoachDauNam.class.getClassLoader(),
			new Class[] { KeHoachDauNam.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KeHoachDauNamClp clone = new KeHoachDauNamClp();

		clone.setId(getId());
		clone.setTramCapNuocId(getTramCapNuocId());
		clone.setNam(getNam());
		clone.setSoDauNoiMoi(getSoDauNoiMoi());
		clone.setSoHoHuongLoi(getSoHoHuongLoi());
		clone.setSoNguoiHuongLoi(getSoNguoiHuongLoi());
		clone.setGhiChu(getGhiChu());
		clone.setBaoCaoDLI(getBaoCaoDLI());
		clone.setNgayTao(getNgayTao());
		clone.setIdNguoiTao(getIdNguoiTao());

		return clone;
	}

	@Override
	public int compareTo(KeHoachDauNam keHoachDauNam) {
		int value = 0;

		if (getNam() < keHoachDauNam.getNam()) {
			value = -1;
		}
		else if (getNam() > keHoachDauNam.getNam()) {
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

		if (!(obj instanceof KeHoachDauNamClp)) {
			return false;
		}

		KeHoachDauNamClp keHoachDauNam = (KeHoachDauNamClp)obj;

		long primaryKey = keHoachDauNam.getPrimaryKey();

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
		sb.append(", tramCapNuocId=");
		sb.append(getTramCapNuocId());
		sb.append(", nam=");
		sb.append(getNam());
		sb.append(", soDauNoiMoi=");
		sb.append(getSoDauNoiMoi());
		sb.append(", soHoHuongLoi=");
		sb.append(getSoHoHuongLoi());
		sb.append(", soNguoiHuongLoi=");
		sb.append(getSoNguoiHuongLoi());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", baoCaoDLI=");
		sb.append(getBaoCaoDLI());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", idNguoiTao=");
		sb.append(getIdNguoiTao());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam");
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
			"<column><column-name>soHoHuongLoi</column-name><column-value><![CDATA[");
		sb.append(getSoHoHuongLoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNguoiHuongLoi</column-name><column-value><![CDATA[");
		sb.append(getSoNguoiHuongLoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>baoCaoDLI</column-name><column-value><![CDATA[");
		sb.append(getBaoCaoDLI());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idNguoiTao</column-name><column-value><![CDATA[");
		sb.append(getIdNguoiTao());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _tramCapNuocId;
	private long _nam;
	private long _soDauNoiMoi;
	private long _soHoHuongLoi;
	private long _soNguoiHuongLoi;
	private String _ghiChu;
	private long _baoCaoDLI;
	private Date _ngayTao;
	private long _idNguoiTao;
	private BaseModel<?> _keHoachDauNamRemoteModel;
}