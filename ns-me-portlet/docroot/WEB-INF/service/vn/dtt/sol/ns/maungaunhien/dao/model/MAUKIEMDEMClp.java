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

package vn.dtt.sol.ns.maungaunhien.dao.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.dtt.sol.ns.maungaunhien.dao.service.ClpSerializer;
import vn.dtt.sol.ns.maungaunhien.dao.service.MAUKIEMDEMLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author khoa.vu
 */
public class MAUKIEMDEMClp extends BaseModelImpl<MAUKIEMDEM>
	implements MAUKIEMDEM {
	public MAUKIEMDEMClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MAUKIEMDEM.class;
	}

	@Override
	public String getModelClassName() {
		return MAUKIEMDEM.class.getName();
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
		attributes.put("maXa", getMaXa());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("nam", getNam());
		attributes.put("tongSoHGD", getTongSoHGD());
		attributes.put("soMauNgauNhien", getSoMauNgauNhien());
		attributes.put("soMauDuPhong", getSoMauDuPhong());
		attributes.put("tongSoMau", getTongSoMau());
		attributes.put("soMauHVS", getSoMauHVS());
		attributes.put("soMauCoNhaTieu", getSoMauCoNhaTieu());
		attributes.put("soMauKiemDem", getSoMauKiemDem());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maXa = (String)attributes.get("maXa");

		if (maXa != null) {
			setMaXa(maXa);
		}

		String maTinh = (String)attributes.get("maTinh");

		if (maTinh != null) {
			setMaTinh(maTinh);
		}

		String maHuyen = (String)attributes.get("maHuyen");

		if (maHuyen != null) {
			setMaHuyen(maHuyen);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer tongSoHGD = (Integer)attributes.get("tongSoHGD");

		if (tongSoHGD != null) {
			setTongSoHGD(tongSoHGD);
		}

		Integer soMauNgauNhien = (Integer)attributes.get("soMauNgauNhien");

		if (soMauNgauNhien != null) {
			setSoMauNgauNhien(soMauNgauNhien);
		}

		Integer soMauDuPhong = (Integer)attributes.get("soMauDuPhong");

		if (soMauDuPhong != null) {
			setSoMauDuPhong(soMauDuPhong);
		}

		Integer tongSoMau = (Integer)attributes.get("tongSoMau");

		if (tongSoMau != null) {
			setTongSoMau(tongSoMau);
		}

		Integer soMauHVS = (Integer)attributes.get("soMauHVS");

		if (soMauHVS != null) {
			setSoMauHVS(soMauHVS);
		}

		Integer soMauCoNhaTieu = (Integer)attributes.get("soMauCoNhaTieu");

		if (soMauCoNhaTieu != null) {
			setSoMauCoNhaTieu(soMauCoNhaTieu);
		}

		Integer soMauKiemDem = (Integer)attributes.get("soMauKiemDem");

		if (soMauKiemDem != null) {
			setSoMauKiemDem(soMauKiemDem);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_maukiemdemRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaXa() {
		return _maXa;
	}

	@Override
	public void setMaXa(String maXa) {
		_maXa = maXa;

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setMaXa", String.class);

				method.invoke(_maukiemdemRemoteModel, maXa);
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

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_maukiemdemRemoteModel, maTinh);
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

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyen", String.class);

				method.invoke(_maukiemdemRemoteModel, maHuyen);
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

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", int.class);

				method.invoke(_maukiemdemRemoteModel, nam);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTongSoHGD() {
		return _tongSoHGD;
	}

	@Override
	public void setTongSoHGD(int tongSoHGD) {
		_tongSoHGD = tongSoHGD;

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setTongSoHGD", int.class);

				method.invoke(_maukiemdemRemoteModel, tongSoHGD);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoMauNgauNhien() {
		return _soMauNgauNhien;
	}

	@Override
	public void setSoMauNgauNhien(int soMauNgauNhien) {
		_soMauNgauNhien = soMauNgauNhien;

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setSoMauNgauNhien", int.class);

				method.invoke(_maukiemdemRemoteModel, soMauNgauNhien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoMauDuPhong() {
		return _soMauDuPhong;
	}

	@Override
	public void setSoMauDuPhong(int soMauDuPhong) {
		_soMauDuPhong = soMauDuPhong;

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setSoMauDuPhong", int.class);

				method.invoke(_maukiemdemRemoteModel, soMauDuPhong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTongSoMau() {
		return _tongSoMau;
	}

	@Override
	public void setTongSoMau(int tongSoMau) {
		_tongSoMau = tongSoMau;

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setTongSoMau", int.class);

				method.invoke(_maukiemdemRemoteModel, tongSoMau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoMauHVS() {
		return _soMauHVS;
	}

	@Override
	public void setSoMauHVS(int soMauHVS) {
		_soMauHVS = soMauHVS;

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setSoMauHVS", int.class);

				method.invoke(_maukiemdemRemoteModel, soMauHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoMauCoNhaTieu() {
		return _soMauCoNhaTieu;
	}

	@Override
	public void setSoMauCoNhaTieu(int soMauCoNhaTieu) {
		_soMauCoNhaTieu = soMauCoNhaTieu;

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setSoMauCoNhaTieu", int.class);

				method.invoke(_maukiemdemRemoteModel, soMauCoNhaTieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoMauKiemDem() {
		return _soMauKiemDem;
	}

	@Override
	public void setSoMauKiemDem(int soMauKiemDem) {
		_soMauKiemDem = soMauKiemDem;

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setSoMauKiemDem", int.class);

				method.invoke(_maukiemdemRemoteModel, soMauKiemDem);
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

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_maukiemdemRemoteModel, ngayTao);
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

		if (_maukiemdemRemoteModel != null) {
			try {
				Class<?> clazz = _maukiemdemRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_maukiemdemRemoteModel, userId);
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

	public BaseModel<?> getMAUKIEMDEMRemoteModel() {
		return _maukiemdemRemoteModel;
	}

	public void setMAUKIEMDEMRemoteModel(BaseModel<?> maukiemdemRemoteModel) {
		_maukiemdemRemoteModel = maukiemdemRemoteModel;
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

		Class<?> remoteModelClass = _maukiemdemRemoteModel.getClass();

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

		Object returnValue = method.invoke(_maukiemdemRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MAUKIEMDEMLocalServiceUtil.addMAUKIEMDEM(this);
		}
		else {
			MAUKIEMDEMLocalServiceUtil.updateMAUKIEMDEM(this);
		}
	}

	@Override
	public MAUKIEMDEM toEscapedModel() {
		return (MAUKIEMDEM)ProxyUtil.newProxyInstance(MAUKIEMDEM.class.getClassLoader(),
			new Class[] { MAUKIEMDEM.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MAUKIEMDEMClp clone = new MAUKIEMDEMClp();

		clone.setId(getId());
		clone.setMaXa(getMaXa());
		clone.setMaTinh(getMaTinh());
		clone.setMaHuyen(getMaHuyen());
		clone.setNam(getNam());
		clone.setTongSoHGD(getTongSoHGD());
		clone.setSoMauNgauNhien(getSoMauNgauNhien());
		clone.setSoMauDuPhong(getSoMauDuPhong());
		clone.setTongSoMau(getTongSoMau());
		clone.setSoMauHVS(getSoMauHVS());
		clone.setSoMauCoNhaTieu(getSoMauCoNhaTieu());
		clone.setSoMauKiemDem(getSoMauKiemDem());
		clone.setNgayTao(getNgayTao());
		clone.setUserId(getUserId());

		return clone;
	}

	@Override
	public int compareTo(MAUKIEMDEM maukiemdem) {
		int value = 0;

		if (getNam() < maukiemdem.getNam()) {
			value = -1;
		}
		else if (getNam() > maukiemdem.getNam()) {
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

		if (!(obj instanceof MAUKIEMDEMClp)) {
			return false;
		}

		MAUKIEMDEMClp maukiemdem = (MAUKIEMDEMClp)obj;

		long primaryKey = maukiemdem.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maXa=");
		sb.append(getMaXa());
		sb.append(", maTinh=");
		sb.append(getMaTinh());
		sb.append(", maHuyen=");
		sb.append(getMaHuyen());
		sb.append(", nam=");
		sb.append(getNam());
		sb.append(", tongSoHGD=");
		sb.append(getTongSoHGD());
		sb.append(", soMauNgauNhien=");
		sb.append(getSoMauNgauNhien());
		sb.append(", soMauDuPhong=");
		sb.append(getSoMauDuPhong());
		sb.append(", tongSoMau=");
		sb.append(getTongSoMau());
		sb.append(", soMauHVS=");
		sb.append(getSoMauHVS());
		sb.append(", soMauCoNhaTieu=");
		sb.append(getSoMauCoNhaTieu());
		sb.append(", soMauKiemDem=");
		sb.append(getSoMauKiemDem());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maXa</column-name><column-value><![CDATA[");
		sb.append(getMaXa());
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
			"<column><column-name>nam</column-name><column-value><![CDATA[");
		sb.append(getNam());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongSoHGD</column-name><column-value><![CDATA[");
		sb.append(getTongSoHGD());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soMauNgauNhien</column-name><column-value><![CDATA[");
		sb.append(getSoMauNgauNhien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soMauDuPhong</column-name><column-value><![CDATA[");
		sb.append(getSoMauDuPhong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongSoMau</column-name><column-value><![CDATA[");
		sb.append(getTongSoMau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soMauHVS</column-name><column-value><![CDATA[");
		sb.append(getSoMauHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soMauCoNhaTieu</column-name><column-value><![CDATA[");
		sb.append(getSoMauCoNhaTieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soMauKiemDem</column-name><column-value><![CDATA[");
		sb.append(getSoMauKiemDem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maXa;
	private String _maTinh;
	private String _maHuyen;
	private int _nam;
	private int _tongSoHGD;
	private int _soMauNgauNhien;
	private int _soMauDuPhong;
	private int _tongSoMau;
	private int _soMauHVS;
	private int _soMauCoNhaTieu;
	private int _soMauKiemDem;
	private Date _ngayTao;
	private long _userId;
	private String _userUuid;
	private BaseModel<?> _maukiemdemRemoteModel;
}