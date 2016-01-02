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
import vn.dtt.sol.ns.tramcap.dao.service.KeHoachKiemDemNuocLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author khoa.vu
 */
public class KeHoachKiemDemNuocClp extends BaseModelImpl<KeHoachKiemDemNuoc>
	implements KeHoachKiemDemNuoc {
	public KeHoachKiemDemNuocClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return KeHoachKiemDemNuoc.class;
	}

	@Override
	public String getModelClassName() {
		return KeHoachKiemDemNuoc.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("nam", getNam());
		attributes.put("tramCapNuocId", getTramCapNuocId());
		attributes.put("kiemDemVienId", getKiemDemVienId());
		attributes.put("ngayBatDau", getNgayBatDau());
		attributes.put("ngayKetThuc", getNgayKetThuc());
		attributes.put("moTa", getMoTa());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("ngayXuatBan", getNgayXuatBan());
		attributes.put("idNguoiXuatBan", getIdNguoiXuatBan());
		attributes.put("ngayDong", getNgayDong());
		attributes.put("idNguoiDong", getIdNguoiDong());
		attributes.put("lastSavePoint", getLastSavePoint());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer tramCapNuocId = (Integer)attributes.get("tramCapNuocId");

		if (tramCapNuocId != null) {
			setTramCapNuocId(tramCapNuocId);
		}

		Integer kiemDemVienId = (Integer)attributes.get("kiemDemVienId");

		if (kiemDemVienId != null) {
			setKiemDemVienId(kiemDemVienId);
		}

		Date ngayBatDau = (Date)attributes.get("ngayBatDau");

		if (ngayBatDau != null) {
			setNgayBatDau(ngayBatDau);
		}

		Date ngayKetThuc = (Date)attributes.get("ngayKetThuc");

		if (ngayKetThuc != null) {
			setNgayKetThuc(ngayKetThuc);
		}

		String moTa = (String)attributes.get("moTa");

		if (moTa != null) {
			setMoTa(moTa);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Integer idNguoiTao = (Integer)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		Date ngayXuatBan = (Date)attributes.get("ngayXuatBan");

		if (ngayXuatBan != null) {
			setNgayXuatBan(ngayXuatBan);
		}

		Integer idNguoiXuatBan = (Integer)attributes.get("idNguoiXuatBan");

		if (idNguoiXuatBan != null) {
			setIdNguoiXuatBan(idNguoiXuatBan);
		}

		Date ngayDong = (Date)attributes.get("ngayDong");

		if (ngayDong != null) {
			setNgayDong(ngayDong);
		}

		Integer idNguoiDong = (Integer)attributes.get("idNguoiDong");

		if (idNguoiDong != null) {
			setIdNguoiDong(idNguoiDong);
		}

		Date lastSavePoint = (Date)attributes.get("lastSavePoint");

		if (lastSavePoint != null) {
			setLastSavePoint(lastSavePoint);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, id);
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

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", int.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, nam);
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

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTramCapNuocId", int.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, tramCapNuocId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKiemDemVienId() {
		return _kiemDemVienId;
	}

	@Override
	public void setKiemDemVienId(int kiemDemVienId) {
		_kiemDemVienId = kiemDemVienId;

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setKiemDemVienId", int.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, kiemDemVienId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayBatDau() {
		return _ngayBatDau;
	}

	@Override
	public void setNgayBatDau(Date ngayBatDau) {
		_ngayBatDau = ngayBatDau;

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayBatDau", Date.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, ngayBatDau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayKetThuc() {
		return _ngayKetThuc;
	}

	@Override
	public void setNgayKetThuc(Date ngayKetThuc) {
		_ngayKetThuc = ngayKetThuc;

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayKetThuc", Date.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, ngayKetThuc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMoTa() {
		return _moTa;
	}

	@Override
	public void setMoTa(String moTa) {
		_moTa = moTa;

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMoTa", String.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, moTa);
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

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, ngayTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIdNguoiTao() {
		return _idNguoiTao;
	}

	@Override
	public void setIdNguoiTao(int idNguoiTao) {
		_idNguoiTao = idNguoiTao;

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", int.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, idNguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayXuatBan() {
		return _ngayXuatBan;
	}

	@Override
	public void setNgayXuatBan(Date ngayXuatBan) {
		_ngayXuatBan = ngayXuatBan;

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayXuatBan", Date.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, ngayXuatBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIdNguoiXuatBan() {
		return _idNguoiXuatBan;
	}

	@Override
	public void setIdNguoiXuatBan(int idNguoiXuatBan) {
		_idNguoiXuatBan = idNguoiXuatBan;

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiXuatBan", int.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, idNguoiXuatBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayDong() {
		return _ngayDong;
	}

	@Override
	public void setNgayDong(Date ngayDong) {
		_ngayDong = ngayDong;

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDong", Date.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, ngayDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIdNguoiDong() {
		return _idNguoiDong;
	}

	@Override
	public void setIdNguoiDong(int idNguoiDong) {
		_idNguoiDong = idNguoiDong;

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiDong", int.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, idNguoiDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLastSavePoint() {
		return _lastSavePoint;
	}

	@Override
	public void setLastSavePoint(Date lastSavePoint) {
		_lastSavePoint = lastSavePoint;

		if (_keHoachKiemDemNuocRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setLastSavePoint", Date.class);

				method.invoke(_keHoachKiemDemNuocRemoteModel, lastSavePoint);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKeHoachKiemDemNuocRemoteModel() {
		return _keHoachKiemDemNuocRemoteModel;
	}

	public void setKeHoachKiemDemNuocRemoteModel(
		BaseModel<?> keHoachKiemDemNuocRemoteModel) {
		_keHoachKiemDemNuocRemoteModel = keHoachKiemDemNuocRemoteModel;
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

		Class<?> remoteModelClass = _keHoachKiemDemNuocRemoteModel.getClass();

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

		Object returnValue = method.invoke(_keHoachKiemDemNuocRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KeHoachKiemDemNuocLocalServiceUtil.addKeHoachKiemDemNuoc(this);
		}
		else {
			KeHoachKiemDemNuocLocalServiceUtil.updateKeHoachKiemDemNuoc(this);
		}
	}

	@Override
	public KeHoachKiemDemNuoc toEscapedModel() {
		return (KeHoachKiemDemNuoc)ProxyUtil.newProxyInstance(KeHoachKiemDemNuoc.class.getClassLoader(),
			new Class[] { KeHoachKiemDemNuoc.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KeHoachKiemDemNuocClp clone = new KeHoachKiemDemNuocClp();

		clone.setId(getId());
		clone.setNam(getNam());
		clone.setTramCapNuocId(getTramCapNuocId());
		clone.setKiemDemVienId(getKiemDemVienId());
		clone.setNgayBatDau(getNgayBatDau());
		clone.setNgayKetThuc(getNgayKetThuc());
		clone.setMoTa(getMoTa());
		clone.setNgayTao(getNgayTao());
		clone.setIdNguoiTao(getIdNguoiTao());
		clone.setNgayXuatBan(getNgayXuatBan());
		clone.setIdNguoiXuatBan(getIdNguoiXuatBan());
		clone.setNgayDong(getNgayDong());
		clone.setIdNguoiDong(getIdNguoiDong());
		clone.setLastSavePoint(getLastSavePoint());

		return clone;
	}

	@Override
	public int compareTo(KeHoachKiemDemNuoc keHoachKiemDemNuoc) {
		int value = 0;

		if (getTramCapNuocId() < keHoachKiemDemNuoc.getTramCapNuocId()) {
			value = -1;
		}
		else if (getTramCapNuocId() > keHoachKiemDemNuoc.getTramCapNuocId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (getKiemDemVienId() < keHoachKiemDemNuoc.getKiemDemVienId()) {
			value = -1;
		}
		else if (getKiemDemVienId() > keHoachKiemDemNuoc.getKiemDemVienId()) {
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

		if (!(obj instanceof KeHoachKiemDemNuocClp)) {
			return false;
		}

		KeHoachKiemDemNuocClp keHoachKiemDemNuoc = (KeHoachKiemDemNuocClp)obj;

		int primaryKey = keHoachKiemDemNuoc.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", nam=");
		sb.append(getNam());
		sb.append(", tramCapNuocId=");
		sb.append(getTramCapNuocId());
		sb.append(", kiemDemVienId=");
		sb.append(getKiemDemVienId());
		sb.append(", ngayBatDau=");
		sb.append(getNgayBatDau());
		sb.append(", ngayKetThuc=");
		sb.append(getNgayKetThuc());
		sb.append(", moTa=");
		sb.append(getMoTa());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", idNguoiTao=");
		sb.append(getIdNguoiTao());
		sb.append(", ngayXuatBan=");
		sb.append(getNgayXuatBan());
		sb.append(", idNguoiXuatBan=");
		sb.append(getIdNguoiXuatBan());
		sb.append(", ngayDong=");
		sb.append(getNgayDong());
		sb.append(", idNguoiDong=");
		sb.append(getIdNguoiDong());
		sb.append(", lastSavePoint=");
		sb.append(getLastSavePoint());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nam</column-name><column-value><![CDATA[");
		sb.append(getNam());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tramCapNuocId</column-name><column-value><![CDATA[");
		sb.append(getTramCapNuocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kiemDemVienId</column-name><column-value><![CDATA[");
		sb.append(getKiemDemVienId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayBatDau</column-name><column-value><![CDATA[");
		sb.append(getNgayBatDau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayKetThuc</column-name><column-value><![CDATA[");
		sb.append(getNgayKetThuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>moTa</column-name><column-value><![CDATA[");
		sb.append(getMoTa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idNguoiTao</column-name><column-value><![CDATA[");
		sb.append(getIdNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayXuatBan</column-name><column-value><![CDATA[");
		sb.append(getNgayXuatBan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idNguoiXuatBan</column-name><column-value><![CDATA[");
		sb.append(getIdNguoiXuatBan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayDong</column-name><column-value><![CDATA[");
		sb.append(getNgayDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idNguoiDong</column-name><column-value><![CDATA[");
		sb.append(getIdNguoiDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastSavePoint</column-name><column-value><![CDATA[");
		sb.append(getLastSavePoint());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private int _nam;
	private int _tramCapNuocId;
	private int _kiemDemVienId;
	private Date _ngayBatDau;
	private Date _ngayKetThuc;
	private String _moTa;
	private Date _ngayTao;
	private int _idNguoiTao;
	private Date _ngayXuatBan;
	private int _idNguoiXuatBan;
	private Date _ngayDong;
	private int _idNguoiDong;
	private Date _lastSavePoint;
	private BaseModel<?> _keHoachKiemDemNuocRemoteModel;
}