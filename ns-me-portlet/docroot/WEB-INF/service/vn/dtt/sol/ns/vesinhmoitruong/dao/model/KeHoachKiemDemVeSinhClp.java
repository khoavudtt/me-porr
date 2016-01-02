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

package vn.dtt.sol.ns.vesinhmoitruong.dao.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ClpSerializer;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.KeHoachKiemDemVeSinhLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author BinhTH
 */
public class KeHoachKiemDemVeSinhClp extends BaseModelImpl<KeHoachKiemDemVeSinh>
	implements KeHoachKiemDemVeSinh {
	public KeHoachKiemDemVeSinhClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return KeHoachKiemDemVeSinh.class;
	}

	@Override
	public String getModelClassName() {
		return KeHoachKiemDemVeSinh.class.getName();
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
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("kiemDemVienID", getKiemDemVienID());
		attributes.put("ngayBatDau", getNgayBatDau());
		attributes.put("ngayKetThuc", getNgayKetThuc());
		attributes.put("moTa", getMoTa());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("ngayXuatBan", getNgayXuatBan());
		attributes.put("idNguoiXuatBan", getIdNguoiXuatBan());
		attributes.put("tableId", getTableId());
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

		String maTinh = (String)attributes.get("maTinh");

		if (maTinh != null) {
			setMaTinh(maTinh);
		}

		String maHuyen = (String)attributes.get("maHuyen");

		if (maHuyen != null) {
			setMaHuyen(maHuyen);
		}

		Integer kiemDemVienID = (Integer)attributes.get("kiemDemVienID");

		if (kiemDemVienID != null) {
			setKiemDemVienID(kiemDemVienID);
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

		String tableId = (String)attributes.get("tableId");

		if (tableId != null) {
			setTableId(tableId);
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

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, id);
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

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", int.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, nam);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTinh() {
		return _maTinh;
	}

	@Override
	public void setMaTinh(String maTinh) {
		_maTinh = maTinh;

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, maTinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaHuyen() {
		return _maHuyen;
	}

	@Override
	public void setMaHuyen(String maHuyen) {
		_maHuyen = maHuyen;

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyen", String.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, maHuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKiemDemVienID() {
		return _kiemDemVienID;
	}

	@Override
	public void setKiemDemVienID(int kiemDemVienID) {
		_kiemDemVienID = kiemDemVienID;

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setKiemDemVienID", int.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, kiemDemVienID);
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

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayBatDau", Date.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, ngayBatDau);
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

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayKetThuc", Date.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, ngayKetThuc);
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

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMoTa", String.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, moTa);
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

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, ngayTao);
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

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", int.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, idNguoiTao);
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

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayXuatBan", Date.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, ngayXuatBan);
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

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiXuatBan", int.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, idNguoiXuatBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTableId() {
		return _tableId;
	}

	@Override
	public void setTableId(String tableId) {
		_tableId = tableId;

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTableId", String.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, tableId);
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

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDong", Date.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, ngayDong);
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

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiDong", int.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, idNguoiDong);
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

		if (_keHoachKiemDemVeSinhRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachKiemDemVeSinhRemoteModel.getClass();

				Method method = clazz.getMethod("setLastSavePoint", Date.class);

				method.invoke(_keHoachKiemDemVeSinhRemoteModel, lastSavePoint);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKeHoachKiemDemVeSinhRemoteModel() {
		return _keHoachKiemDemVeSinhRemoteModel;
	}

	public void setKeHoachKiemDemVeSinhRemoteModel(
		BaseModel<?> keHoachKiemDemVeSinhRemoteModel) {
		_keHoachKiemDemVeSinhRemoteModel = keHoachKiemDemVeSinhRemoteModel;
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

		Class<?> remoteModelClass = _keHoachKiemDemVeSinhRemoteModel.getClass();

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

		Object returnValue = method.invoke(_keHoachKiemDemVeSinhRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KeHoachKiemDemVeSinhLocalServiceUtil.addKeHoachKiemDemVeSinh(this);
		}
		else {
			KeHoachKiemDemVeSinhLocalServiceUtil.updateKeHoachKiemDemVeSinh(this);
		}
	}

	@Override
	public KeHoachKiemDemVeSinh toEscapedModel() {
		return (KeHoachKiemDemVeSinh)ProxyUtil.newProxyInstance(KeHoachKiemDemVeSinh.class.getClassLoader(),
			new Class[] { KeHoachKiemDemVeSinh.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KeHoachKiemDemVeSinhClp clone = new KeHoachKiemDemVeSinhClp();

		clone.setId(getId());
		clone.setNam(getNam());
		clone.setMaTinh(getMaTinh());
		clone.setMaHuyen(getMaHuyen());
		clone.setKiemDemVienID(getKiemDemVienID());
		clone.setNgayBatDau(getNgayBatDau());
		clone.setNgayKetThuc(getNgayKetThuc());
		clone.setMoTa(getMoTa());
		clone.setNgayTao(getNgayTao());
		clone.setIdNguoiTao(getIdNguoiTao());
		clone.setNgayXuatBan(getNgayXuatBan());
		clone.setIdNguoiXuatBan(getIdNguoiXuatBan());
		clone.setTableId(getTableId());
		clone.setNgayDong(getNgayDong());
		clone.setIdNguoiDong(getIdNguoiDong());
		clone.setLastSavePoint(getLastSavePoint());

		return clone;
	}

	@Override
	public int compareTo(KeHoachKiemDemVeSinh keHoachKiemDemVeSinh) {
		int primaryKey = keHoachKiemDemVeSinh.getPrimaryKey();

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

		if (!(obj instanceof KeHoachKiemDemVeSinhClp)) {
			return false;
		}

		KeHoachKiemDemVeSinhClp keHoachKiemDemVeSinh = (KeHoachKiemDemVeSinhClp)obj;

		int primaryKey = keHoachKiemDemVeSinh.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", nam=");
		sb.append(getNam());
		sb.append(", maTinh=");
		sb.append(getMaTinh());
		sb.append(", maHuyen=");
		sb.append(getMaHuyen());
		sb.append(", kiemDemVienID=");
		sb.append(getKiemDemVienID());
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
		sb.append(", tableId=");
		sb.append(getTableId());
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
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh");
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
			"<column><column-name>maTinh</column-name><column-value><![CDATA[");
		sb.append(getMaTinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maHuyen</column-name><column-value><![CDATA[");
		sb.append(getMaHuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kiemDemVienID</column-name><column-value><![CDATA[");
		sb.append(getKiemDemVienID());
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
			"<column><column-name>tableId</column-name><column-value><![CDATA[");
		sb.append(getTableId());
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
	private String _maTinh;
	private String _maHuyen;
	private int _kiemDemVienID;
	private Date _ngayBatDau;
	private Date _ngayKetThuc;
	private String _moTa;
	private Date _ngayTao;
	private int _idNguoiTao;
	private Date _ngayXuatBan;
	private int _idNguoiXuatBan;
	private String _tableId;
	private Date _ngayDong;
	private int _idNguoiDong;
	private Date _lastSavePoint;
	private BaseModel<?> _keHoachKiemDemVeSinhRemoteModel;
}