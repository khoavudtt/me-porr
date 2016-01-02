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

package vn.dtt.sol.ns.baocaodli.dao.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLILocalServiceUtil;
import vn.dtt.sol.ns.baocaodli.dao.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author HuyMQ
 */
public class BaoCaoDLIClp extends BaseModelImpl<BaoCaoDLI> implements BaoCaoDLI {
	public BaoCaoDLIClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return BaoCaoDLI.class;
	}

	@Override
	public String getModelClassName() {
		return BaoCaoDLI.class.getName();
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
		attributes.put("maTinh", getMaTinh());
		attributes.put("nam", getNam());
		attributes.put("loaiBaoCao", getLoaiBaoCao());
		attributes.put("nguoiLap", getNguoiLap());
		attributes.put("nguoiDuyet", getNguoiDuyet());
		attributes.put("soBaoCao", getSoBaoCao());
		attributes.put("ngayBaoCao", getNgayBaoCao());
		attributes.put("trangThai", getTrangThai());
		attributes.put("luuTruPDF1Id", getLuuTruPDF1Id());
		attributes.put("luuTruPDF2Id", getLuuTruPDF2Id());
		attributes.put("luuTruCSV1Id", getLuuTruCSV1Id());
		attributes.put("luuTruCSV2Id", getLuuTruCSV2Id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTinh = (String)attributes.get("maTinh");

		if (maTinh != null) {
			setMaTinh(maTinh);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer loaiBaoCao = (Integer)attributes.get("loaiBaoCao");

		if (loaiBaoCao != null) {
			setLoaiBaoCao(loaiBaoCao);
		}

		String nguoiLap = (String)attributes.get("nguoiLap");

		if (nguoiLap != null) {
			setNguoiLap(nguoiLap);
		}

		String nguoiDuyet = (String)attributes.get("nguoiDuyet");

		if (nguoiDuyet != null) {
			setNguoiDuyet(nguoiDuyet);
		}

		String soBaoCao = (String)attributes.get("soBaoCao");

		if (soBaoCao != null) {
			setSoBaoCao(soBaoCao);
		}

		Date ngayBaoCao = (Date)attributes.get("ngayBaoCao");

		if (ngayBaoCao != null) {
			setNgayBaoCao(ngayBaoCao);
		}

		Integer trangThai = (Integer)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long luuTruPDF1Id = (Long)attributes.get("luuTruPDF1Id");

		if (luuTruPDF1Id != null) {
			setLuuTruPDF1Id(luuTruPDF1Id);
		}

		Long luuTruPDF2Id = (Long)attributes.get("luuTruPDF2Id");

		if (luuTruPDF2Id != null) {
			setLuuTruPDF2Id(luuTruPDF2Id);
		}

		Long luuTruCSV1Id = (Long)attributes.get("luuTruCSV1Id");

		if (luuTruCSV1Id != null) {
			setLuuTruCSV1Id(luuTruCSV1Id);
		}

		Long luuTruCSV2Id = (Long)attributes.get("luuTruCSV2Id");

		if (luuTruCSV2Id != null) {
			setLuuTruCSV2Id(luuTruCSV2Id);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_baoCaoDLIRemoteModel, id);
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

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_baoCaoDLIRemoteModel, maTinh);
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

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", int.class);

				method.invoke(_baoCaoDLIRemoteModel, nam);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoaiBaoCao() {
		return _loaiBaoCao;
	}

	@Override
	public void setLoaiBaoCao(int loaiBaoCao) {
		_loaiBaoCao = loaiBaoCao;

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiBaoCao", int.class);

				method.invoke(_baoCaoDLIRemoteModel, loaiBaoCao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiLap() {
		return _nguoiLap;
	}

	@Override
	public void setNguoiLap(String nguoiLap) {
		_nguoiLap = nguoiLap;

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiLap", String.class);

				method.invoke(_baoCaoDLIRemoteModel, nguoiLap);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiDuyet() {
		return _nguoiDuyet;
	}

	@Override
	public void setNguoiDuyet(String nguoiDuyet) {
		_nguoiDuyet = nguoiDuyet;

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiDuyet", String.class);

				method.invoke(_baoCaoDLIRemoteModel, nguoiDuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoBaoCao() {
		return _soBaoCao;
	}

	@Override
	public void setSoBaoCao(String soBaoCao) {
		_soBaoCao = soBaoCao;

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setSoBaoCao", String.class);

				method.invoke(_baoCaoDLIRemoteModel, soBaoCao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayBaoCao() {
		return _ngayBaoCao;
	}

	@Override
	public void setNgayBaoCao(Date ngayBaoCao) {
		_ngayBaoCao = ngayBaoCao;

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayBaoCao", Date.class);

				method.invoke(_baoCaoDLIRemoteModel, ngayBaoCao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", int.class);

				method.invoke(_baoCaoDLIRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLuuTruPDF1Id() {
		return _luuTruPDF1Id;
	}

	@Override
	public void setLuuTruPDF1Id(long luuTruPDF1Id) {
		_luuTruPDF1Id = luuTruPDF1Id;

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setLuuTruPDF1Id", long.class);

				method.invoke(_baoCaoDLIRemoteModel, luuTruPDF1Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLuuTruPDF2Id() {
		return _luuTruPDF2Id;
	}

	@Override
	public void setLuuTruPDF2Id(long luuTruPDF2Id) {
		_luuTruPDF2Id = luuTruPDF2Id;

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setLuuTruPDF2Id", long.class);

				method.invoke(_baoCaoDLIRemoteModel, luuTruPDF2Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLuuTruCSV1Id() {
		return _luuTruCSV1Id;
	}

	@Override
	public void setLuuTruCSV1Id(long luuTruCSV1Id) {
		_luuTruCSV1Id = luuTruCSV1Id;

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setLuuTruCSV1Id", long.class);

				method.invoke(_baoCaoDLIRemoteModel, luuTruCSV1Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLuuTruCSV2Id() {
		return _luuTruCSV2Id;
	}

	@Override
	public void setLuuTruCSV2Id(long luuTruCSV2Id) {
		_luuTruCSV2Id = luuTruCSV2Id;

		if (_baoCaoDLIRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLIRemoteModel.getClass();

				Method method = clazz.getMethod("setLuuTruCSV2Id", long.class);

				method.invoke(_baoCaoDLIRemoteModel, luuTruCSV2Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBaoCaoDLIRemoteModel() {
		return _baoCaoDLIRemoteModel;
	}

	public void setBaoCaoDLIRemoteModel(BaseModel<?> baoCaoDLIRemoteModel) {
		_baoCaoDLIRemoteModel = baoCaoDLIRemoteModel;
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

		Class<?> remoteModelClass = _baoCaoDLIRemoteModel.getClass();

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

		Object returnValue = method.invoke(_baoCaoDLIRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BaoCaoDLILocalServiceUtil.addBaoCaoDLI(this);
		}
		else {
			BaoCaoDLILocalServiceUtil.updateBaoCaoDLI(this);
		}
	}

	@Override
	public BaoCaoDLI toEscapedModel() {
		return (BaoCaoDLI)ProxyUtil.newProxyInstance(BaoCaoDLI.class.getClassLoader(),
			new Class[] { BaoCaoDLI.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BaoCaoDLIClp clone = new BaoCaoDLIClp();

		clone.setId(getId());
		clone.setMaTinh(getMaTinh());
		clone.setNam(getNam());
		clone.setLoaiBaoCao(getLoaiBaoCao());
		clone.setNguoiLap(getNguoiLap());
		clone.setNguoiDuyet(getNguoiDuyet());
		clone.setSoBaoCao(getSoBaoCao());
		clone.setNgayBaoCao(getNgayBaoCao());
		clone.setTrangThai(getTrangThai());
		clone.setLuuTruPDF1Id(getLuuTruPDF1Id());
		clone.setLuuTruPDF2Id(getLuuTruPDF2Id());
		clone.setLuuTruCSV1Id(getLuuTruCSV1Id());
		clone.setLuuTruCSV2Id(getLuuTruCSV2Id());

		return clone;
	}

	@Override
	public int compareTo(BaoCaoDLI baoCaoDLI) {
		int value = 0;

		if (getNam() < baoCaoDLI.getNam()) {
			value = -1;
		}
		else if (getNam() > baoCaoDLI.getNam()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getMaTinh().compareTo(baoCaoDLI.getMaTinh());

		if (value != 0) {
			return value;
		}

		value = DateUtil.compareTo(getNgayBaoCao(), baoCaoDLI.getNgayBaoCao());

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

		if (!(obj instanceof BaoCaoDLIClp)) {
			return false;
		}

		BaoCaoDLIClp baoCaoDLI = (BaoCaoDLIClp)obj;

		long primaryKey = baoCaoDLI.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maTinh=");
		sb.append(getMaTinh());
		sb.append(", nam=");
		sb.append(getNam());
		sb.append(", loaiBaoCao=");
		sb.append(getLoaiBaoCao());
		sb.append(", nguoiLap=");
		sb.append(getNguoiLap());
		sb.append(", nguoiDuyet=");
		sb.append(getNguoiDuyet());
		sb.append(", soBaoCao=");
		sb.append(getSoBaoCao());
		sb.append(", ngayBaoCao=");
		sb.append(getNgayBaoCao());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", luuTruPDF1Id=");
		sb.append(getLuuTruPDF1Id());
		sb.append(", luuTruPDF2Id=");
		sb.append(getLuuTruPDF2Id());
		sb.append(", luuTruCSV1Id=");
		sb.append(getLuuTruCSV1Id());
		sb.append(", luuTruCSV2Id=");
		sb.append(getLuuTruCSV2Id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTinh</column-name><column-value><![CDATA[");
		sb.append(getMaTinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nam</column-name><column-value><![CDATA[");
		sb.append(getNam());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiBaoCao</column-name><column-value><![CDATA[");
		sb.append(getLoaiBaoCao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiLap</column-name><column-value><![CDATA[");
		sb.append(getNguoiLap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiDuyet</column-name><column-value><![CDATA[");
		sb.append(getNguoiDuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soBaoCao</column-name><column-value><![CDATA[");
		sb.append(getSoBaoCao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayBaoCao</column-name><column-value><![CDATA[");
		sb.append(getNgayBaoCao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>luuTruPDF1Id</column-name><column-value><![CDATA[");
		sb.append(getLuuTruPDF1Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>luuTruPDF2Id</column-name><column-value><![CDATA[");
		sb.append(getLuuTruPDF2Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>luuTruCSV1Id</column-name><column-value><![CDATA[");
		sb.append(getLuuTruCSV1Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>luuTruCSV2Id</column-name><column-value><![CDATA[");
		sb.append(getLuuTruCSV2Id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maTinh;
	private int _nam;
	private int _loaiBaoCao;
	private String _nguoiLap;
	private String _nguoiDuyet;
	private String _soBaoCao;
	private Date _ngayBaoCao;
	private int _trangThai;
	private long _luuTruPDF1Id;
	private long _luuTruPDF2Id;
	private long _luuTruCSV1Id;
	private long _luuTruCSV2Id;
	private BaseModel<?> _baoCaoDLIRemoteModel;
}