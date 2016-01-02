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

package vn.dtt.cmon.kiemdemvien.dao.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.cmon.kiemdemvien.dao.service.ClpSerializer;
import vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author HANT
 */
public class KiemDemVienClp extends BaseModelImpl<KiemDemVien>
	implements KiemDemVien {
	public KiemDemVienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return KiemDemVien.class;
	}

	@Override
	public String getModelClassName() {
		return KiemDemVien.class.getName();
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
		attributes.put("hoVaTen", getHoVaTen());
		attributes.put("taiKhoan", getTaiKhoan());
		attributes.put("matKhau", getMatKhau());
		attributes.put("capHoatDong", getCapHoatDong());
		attributes.put("orgCode1", getOrgCode1());
		attributes.put("orgCode2", getOrgCode2());
		attributes.put("diaChi", getDiaChi());
		attributes.put("chungMinhThu", getChungMinhThu());
		attributes.put("dienThoai", getDienThoai());
		attributes.put("imei", getImei());
		attributes.put("trangThai", getTrangThai());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("idQuanLy", getIdQuanLy());
		attributes.put("nameQuanLy", getNameQuanLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String hoVaTen = (String)attributes.get("hoVaTen");

		if (hoVaTen != null) {
			setHoVaTen(hoVaTen);
		}

		String taiKhoan = (String)attributes.get("taiKhoan");

		if (taiKhoan != null) {
			setTaiKhoan(taiKhoan);
		}

		String matKhau = (String)attributes.get("matKhau");

		if (matKhau != null) {
			setMatKhau(matKhau);
		}

		Long capHoatDong = (Long)attributes.get("capHoatDong");

		if (capHoatDong != null) {
			setCapHoatDong(capHoatDong);
		}

		String orgCode1 = (String)attributes.get("orgCode1");

		if (orgCode1 != null) {
			setOrgCode1(orgCode1);
		}

		String orgCode2 = (String)attributes.get("orgCode2");

		if (orgCode2 != null) {
			setOrgCode2(orgCode2);
		}

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		String chungMinhThu = (String)attributes.get("chungMinhThu");

		if (chungMinhThu != null) {
			setChungMinhThu(chungMinhThu);
		}

		String dienThoai = (String)attributes.get("dienThoai");

		if (dienThoai != null) {
			setDienThoai(dienThoai);
		}

		String imei = (String)attributes.get("imei");

		if (imei != null) {
			setImei(imei);
		}

		Long trangThai = (Long)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long idNguoiTao = (Long)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		Long idQuanLy = (Long)attributes.get("idQuanLy");

		if (idQuanLy != null) {
			setIdQuanLy(idQuanLy);
		}

		String nameQuanLy = (String)attributes.get("nameQuanLy");

		if (nameQuanLy != null) {
			setNameQuanLy(nameQuanLy);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_kiemDemVienRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHoVaTen() {
		return _hoVaTen;
	}

	@Override
	public void setHoVaTen(String hoVaTen) {
		_hoVaTen = hoVaTen;

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setHoVaTen", String.class);

				method.invoke(_kiemDemVienRemoteModel, hoVaTen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTaiKhoan() {
		return _taiKhoan;
	}

	@Override
	public void setTaiKhoan(String taiKhoan) {
		_taiKhoan = taiKhoan;

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setTaiKhoan", String.class);

				method.invoke(_kiemDemVienRemoteModel, taiKhoan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMatKhau() {
		return _matKhau;
	}

	@Override
	public void setMatKhau(String matKhau) {
		_matKhau = matKhau;

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setMatKhau", String.class);

				method.invoke(_kiemDemVienRemoteModel, matKhau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCapHoatDong() {
		return _capHoatDong;
	}

	@Override
	public void setCapHoatDong(long capHoatDong) {
		_capHoatDong = capHoatDong;

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setCapHoatDong", long.class);

				method.invoke(_kiemDemVienRemoteModel, capHoatDong);
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

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setOrgCode1", String.class);

				method.invoke(_kiemDemVienRemoteModel, orgCode1);
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

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setOrgCode2", String.class);

				method.invoke(_kiemDemVienRemoteModel, orgCode2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChi() {
		return _diaChi;
	}

	@Override
	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_kiemDemVienRemoteModel, diaChi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChungMinhThu() {
		return _chungMinhThu;
	}

	@Override
	public void setChungMinhThu(String chungMinhThu) {
		_chungMinhThu = chungMinhThu;

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setChungMinhThu", String.class);

				method.invoke(_kiemDemVienRemoteModel, chungMinhThu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDienThoai() {
		return _dienThoai;
	}

	@Override
	public void setDienThoai(String dienThoai) {
		_dienThoai = dienThoai;

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setDienThoai", String.class);

				method.invoke(_kiemDemVienRemoteModel, dienThoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImei() {
		return _imei;
	}

	@Override
	public void setImei(String imei) {
		_imei = imei;

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setImei", String.class);

				method.invoke(_kiemDemVienRemoteModel, imei);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(long trangThai) {
		_trangThai = trangThai;

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", long.class);

				method.invoke(_kiemDemVienRemoteModel, trangThai);
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

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_kiemDemVienRemoteModel, ngayTao);
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

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", long.class);

				method.invoke(_kiemDemVienRemoteModel, idNguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIdQuanLy() {
		return _idQuanLy;
	}

	@Override
	public void setIdQuanLy(long idQuanLy) {
		_idQuanLy = idQuanLy;

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setIdQuanLy", long.class);

				method.invoke(_kiemDemVienRemoteModel, idQuanLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameQuanLy() {
		return _nameQuanLy;
	}

	@Override
	public void setNameQuanLy(String nameQuanLy) {
		_nameQuanLy = nameQuanLy;

		if (_kiemDemVienRemoteModel != null) {
			try {
				Class<?> clazz = _kiemDemVienRemoteModel.getClass();

				Method method = clazz.getMethod("setNameQuanLy", String.class);

				method.invoke(_kiemDemVienRemoteModel, nameQuanLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKiemDemVienRemoteModel() {
		return _kiemDemVienRemoteModel;
	}

	public void setKiemDemVienRemoteModel(BaseModel<?> kiemDemVienRemoteModel) {
		_kiemDemVienRemoteModel = kiemDemVienRemoteModel;
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

		Class<?> remoteModelClass = _kiemDemVienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_kiemDemVienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KiemDemVienLocalServiceUtil.addKiemDemVien(this);
		}
		else {
			KiemDemVienLocalServiceUtil.updateKiemDemVien(this);
		}
	}

	@Override
	public KiemDemVien toEscapedModel() {
		return (KiemDemVien)ProxyUtil.newProxyInstance(KiemDemVien.class.getClassLoader(),
			new Class[] { KiemDemVien.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KiemDemVienClp clone = new KiemDemVienClp();

		clone.setId(getId());
		clone.setHoVaTen(getHoVaTen());
		clone.setTaiKhoan(getTaiKhoan());
		clone.setMatKhau(getMatKhau());
		clone.setCapHoatDong(getCapHoatDong());
		clone.setOrgCode1(getOrgCode1());
		clone.setOrgCode2(getOrgCode2());
		clone.setDiaChi(getDiaChi());
		clone.setChungMinhThu(getChungMinhThu());
		clone.setDienThoai(getDienThoai());
		clone.setImei(getImei());
		clone.setTrangThai(getTrangThai());
		clone.setNgayTao(getNgayTao());
		clone.setIdNguoiTao(getIdNguoiTao());
		clone.setIdQuanLy(getIdQuanLy());
		clone.setNameQuanLy(getNameQuanLy());

		return clone;
	}

	@Override
	public int compareTo(KiemDemVien kiemDemVien) {
		int value = 0;

		value = getHoVaTen().compareTo(kiemDemVien.getHoVaTen());

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

		if (!(obj instanceof KiemDemVienClp)) {
			return false;
		}

		KiemDemVienClp kiemDemVien = (KiemDemVienClp)obj;

		long primaryKey = kiemDemVien.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hoVaTen=");
		sb.append(getHoVaTen());
		sb.append(", taiKhoan=");
		sb.append(getTaiKhoan());
		sb.append(", matKhau=");
		sb.append(getMatKhau());
		sb.append(", capHoatDong=");
		sb.append(getCapHoatDong());
		sb.append(", orgCode1=");
		sb.append(getOrgCode1());
		sb.append(", orgCode2=");
		sb.append(getOrgCode2());
		sb.append(", diaChi=");
		sb.append(getDiaChi());
		sb.append(", chungMinhThu=");
		sb.append(getChungMinhThu());
		sb.append(", dienThoai=");
		sb.append(getDienThoai());
		sb.append(", imei=");
		sb.append(getImei());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", idNguoiTao=");
		sb.append(getIdNguoiTao());
		sb.append(", idQuanLy=");
		sb.append(getIdQuanLy());
		sb.append(", nameQuanLy=");
		sb.append(getNameQuanLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoVaTen</column-name><column-value><![CDATA[");
		sb.append(getHoVaTen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taiKhoan</column-name><column-value><![CDATA[");
		sb.append(getTaiKhoan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>matKhau</column-name><column-value><![CDATA[");
		sb.append(getMatKhau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capHoatDong</column-name><column-value><![CDATA[");
		sb.append(getCapHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orgCode1</column-name><column-value><![CDATA[");
		sb.append(getOrgCode1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orgCode2</column-name><column-value><![CDATA[");
		sb.append(getOrgCode2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChi</column-name><column-value><![CDATA[");
		sb.append(getDiaChi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chungMinhThu</column-name><column-value><![CDATA[");
		sb.append(getChungMinhThu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dienThoai</column-name><column-value><![CDATA[");
		sb.append(getDienThoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imei</column-name><column-value><![CDATA[");
		sb.append(getImei());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
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
			"<column><column-name>idQuanLy</column-name><column-value><![CDATA[");
		sb.append(getIdQuanLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameQuanLy</column-name><column-value><![CDATA[");
		sb.append(getNameQuanLy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _hoVaTen;
	private String _taiKhoan;
	private String _matKhau;
	private long _capHoatDong;
	private String _orgCode1;
	private String _orgCode2;
	private String _diaChi;
	private String _chungMinhThu;
	private String _dienThoai;
	private String _imei;
	private long _trangThai;
	private Date _ngayTao;
	private long _idNguoiTao;
	private long _idQuanLy;
	private String _nameQuanLy;
	private BaseModel<?> _kiemDemVienRemoteModel;
}