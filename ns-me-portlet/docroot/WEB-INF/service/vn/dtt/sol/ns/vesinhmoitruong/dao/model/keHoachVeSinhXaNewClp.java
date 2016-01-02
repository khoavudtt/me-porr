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
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.keHoachVeSinhXaNewLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author BinhTH
 */
public class keHoachVeSinhXaNewClp extends BaseModelImpl<keHoachVeSinhXaNew>
	implements keHoachVeSinhXaNew {
	public keHoachVeSinhXaNewClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return keHoachVeSinhXaNew.class;
	}

	@Override
	public String getModelClassName() {
		return keHoachVeSinhXaNew.class.getName();
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
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("nam", getNam());
		attributes.put("soNhaTieuHVSMoi", getSoNhaTieuHVSMoi());
		attributes.put("soDan", getSoDan());
		attributes.put("dangKyVSTX", getDangKyVSTX());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("baoCaoDLI", getBaoCaoDLI());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTinh = (String)attributes.get("maTinh");

		if (maTinh != null) {
			setMaTinh(maTinh);
		}

		String maHuyen = (String)attributes.get("maHuyen");

		if (maHuyen != null) {
			setMaHuyen(maHuyen);
		}

		String maXa = (String)attributes.get("maXa");

		if (maXa != null) {
			setMaXa(maXa);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer soNhaTieuHVSMoi = (Integer)attributes.get("soNhaTieuHVSMoi");

		if (soNhaTieuHVSMoi != null) {
			setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		}

		Integer soDan = (Integer)attributes.get("soDan");

		if (soDan != null) {
			setSoDan(soDan);
		}

		Integer dangKyVSTX = (Integer)attributes.get("dangKyVSTX");

		if (dangKyVSTX != null) {
			setDangKyVSTX(dangKyVSTX);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Integer baoCaoDLI = (Integer)attributes.get("baoCaoDLI");

		if (baoCaoDLI != null) {
			setBaoCaoDLI(baoCaoDLI);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Integer idNguoiTao = (Integer)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_keHoachVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_keHoachVeSinhXaNewRemoteModel, id);
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

		if (_keHoachVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_keHoachVeSinhXaNewRemoteModel, maTinh);
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

		if (_keHoachVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyen", String.class);

				method.invoke(_keHoachVeSinhXaNewRemoteModel, maHuyen);
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

		if (_keHoachVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setMaXa", String.class);

				method.invoke(_keHoachVeSinhXaNewRemoteModel, maXa);
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

		if (_keHoachVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", int.class);

				method.invoke(_keHoachVeSinhXaNewRemoteModel, nam);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNhaTieuHVSMoi() {
		return _soNhaTieuHVSMoi;
	}

	@Override
	public void setSoNhaTieuHVSMoi(int soNhaTieuHVSMoi) {
		_soNhaTieuHVSMoi = soNhaTieuHVSMoi;

		if (_keHoachVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNhaTieuHVSMoi", int.class);

				method.invoke(_keHoachVeSinhXaNewRemoteModel, soNhaTieuHVSMoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoDan() {
		return _soDan;
	}

	@Override
	public void setSoDan(int soDan) {
		_soDan = soDan;

		if (_keHoachVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDan", int.class);

				method.invoke(_keHoachVeSinhXaNewRemoteModel, soDan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDangKyVSTX() {
		return _dangKyVSTX;
	}

	@Override
	public void setDangKyVSTX(int dangKyVSTX) {
		_dangKyVSTX = dangKyVSTX;

		if (_keHoachVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setDangKyVSTX", int.class);

				method.invoke(_keHoachVeSinhXaNewRemoteModel, dangKyVSTX);
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

		if (_keHoachVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_keHoachVeSinhXaNewRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBaoCaoDLI() {
		return _baoCaoDLI;
	}

	@Override
	public void setBaoCaoDLI(int baoCaoDLI) {
		_baoCaoDLI = baoCaoDLI;

		if (_keHoachVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setBaoCaoDLI", int.class);

				method.invoke(_keHoachVeSinhXaNewRemoteModel, baoCaoDLI);
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

		if (_keHoachVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_keHoachVeSinhXaNewRemoteModel, ngayTao);
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

		if (_keHoachVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _keHoachVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", int.class);

				method.invoke(_keHoachVeSinhXaNewRemoteModel, idNguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getkeHoachVeSinhXaNewRemoteModel() {
		return _keHoachVeSinhXaNewRemoteModel;
	}

	public void setkeHoachVeSinhXaNewRemoteModel(
		BaseModel<?> keHoachVeSinhXaNewRemoteModel) {
		_keHoachVeSinhXaNewRemoteModel = keHoachVeSinhXaNewRemoteModel;
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

		Class<?> remoteModelClass = _keHoachVeSinhXaNewRemoteModel.getClass();

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

		Object returnValue = method.invoke(_keHoachVeSinhXaNewRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			keHoachVeSinhXaNewLocalServiceUtil.addkeHoachVeSinhXaNew(this);
		}
		else {
			keHoachVeSinhXaNewLocalServiceUtil.updatekeHoachVeSinhXaNew(this);
		}
	}

	@Override
	public keHoachVeSinhXaNew toEscapedModel() {
		return (keHoachVeSinhXaNew)ProxyUtil.newProxyInstance(keHoachVeSinhXaNew.class.getClassLoader(),
			new Class[] { keHoachVeSinhXaNew.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		keHoachVeSinhXaNewClp clone = new keHoachVeSinhXaNewClp();

		clone.setId(getId());
		clone.setMaTinh(getMaTinh());
		clone.setMaHuyen(getMaHuyen());
		clone.setMaXa(getMaXa());
		clone.setNam(getNam());
		clone.setSoNhaTieuHVSMoi(getSoNhaTieuHVSMoi());
		clone.setSoDan(getSoDan());
		clone.setDangKyVSTX(getDangKyVSTX());
		clone.setGhiChu(getGhiChu());
		clone.setBaoCaoDLI(getBaoCaoDLI());
		clone.setNgayTao(getNgayTao());
		clone.setIdNguoiTao(getIdNguoiTao());

		return clone;
	}

	@Override
	public int compareTo(keHoachVeSinhXaNew keHoachVeSinhXaNew) {
		int value = 0;

		if (getId() < keHoachVeSinhXaNew.getId()) {
			value = -1;
		}
		else if (getId() > keHoachVeSinhXaNew.getId()) {
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

		if (!(obj instanceof keHoachVeSinhXaNewClp)) {
			return false;
		}

		keHoachVeSinhXaNewClp keHoachVeSinhXaNew = (keHoachVeSinhXaNewClp)obj;

		int primaryKey = keHoachVeSinhXaNew.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maTinh=");
		sb.append(getMaTinh());
		sb.append(", maHuyen=");
		sb.append(getMaHuyen());
		sb.append(", maXa=");
		sb.append(getMaXa());
		sb.append(", nam=");
		sb.append(getNam());
		sb.append(", soNhaTieuHVSMoi=");
		sb.append(getSoNhaTieuHVSMoi());
		sb.append(", soDan=");
		sb.append(getSoDan());
		sb.append(", dangKyVSTX=");
		sb.append(getDangKyVSTX());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew");
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
			"<column><column-name>maHuyen</column-name><column-value><![CDATA[");
		sb.append(getMaHuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maXa</column-name><column-value><![CDATA[");
		sb.append(getMaXa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nam</column-name><column-value><![CDATA[");
		sb.append(getNam());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNhaTieuHVSMoi</column-name><column-value><![CDATA[");
		sb.append(getSoNhaTieuHVSMoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDan</column-name><column-value><![CDATA[");
		sb.append(getSoDan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dangKyVSTX</column-name><column-value><![CDATA[");
		sb.append(getDangKyVSTX());
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

	private int _id;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private int _nam;
	private int _soNhaTieuHVSMoi;
	private int _soDan;
	private int _dangKyVSTX;
	private String _ghiChu;
	private int _baoCaoDLI;
	private Date _ngayTao;
	private int _idNguoiTao;
	private BaseModel<?> _keHoachVeSinhXaNewRemoteModel;
}