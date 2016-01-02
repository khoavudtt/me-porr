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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer;
import vn.dtt.sol.ns.tramcap.dao.service.DanhGiaBenVungLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author khoa.vu
 */
public class DanhGiaBenVungClp extends BaseModelImpl<DanhGiaBenVung>
	implements DanhGiaBenVung {
	public DanhGiaBenVungClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DanhGiaBenVung.class;
	}

	@Override
	public String getModelClassName() {
		return DanhGiaBenVung.class.getName();
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
		attributes.put("trangThaiCapNuoc", getTrangThaiCapNuoc());
		attributes.put("congXuatThucTe", getCongXuatThucTe());
		attributes.put("tongDauNoiMoi", getTongDauNoiMoi());
		attributes.put("tongDauNoiThucTe", getTongDauNoiThucTe());
		attributes.put("soNguoiCapThucTe", getSoNguoiCapThucTe());
		attributes.put("nuocThatThoat", getNuocThatThoat());
		attributes.put("nuocDatTieuChuan", getNuocDatTieuChuan());
		attributes.put("nuocCoAsen", getNuocCoAsen());
		attributes.put("tongChiPhi", getTongChiPhi());
		attributes.put("tongDoanhThu", getTongDoanhThu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("ketQuaDanhGia", getKetQuaDanhGia());
		attributes.put("baoCaoDLI", getBaoCaoDLI());

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

		Integer trangThaiCapNuoc = (Integer)attributes.get("trangThaiCapNuoc");

		if (trangThaiCapNuoc != null) {
			setTrangThaiCapNuoc(trangThaiCapNuoc);
		}

		Integer congXuatThucTe = (Integer)attributes.get("congXuatThucTe");

		if (congXuatThucTe != null) {
			setCongXuatThucTe(congXuatThucTe);
		}

		Integer tongDauNoiMoi = (Integer)attributes.get("tongDauNoiMoi");

		if (tongDauNoiMoi != null) {
			setTongDauNoiMoi(tongDauNoiMoi);
		}

		Integer tongDauNoiThucTe = (Integer)attributes.get("tongDauNoiThucTe");

		if (tongDauNoiThucTe != null) {
			setTongDauNoiThucTe(tongDauNoiThucTe);
		}

		Integer soNguoiCapThucTe = (Integer)attributes.get("soNguoiCapThucTe");

		if (soNguoiCapThucTe != null) {
			setSoNguoiCapThucTe(soNguoiCapThucTe);
		}

		Integer nuocThatThoat = (Integer)attributes.get("nuocThatThoat");

		if (nuocThatThoat != null) {
			setNuocThatThoat(nuocThatThoat);
		}

		Integer nuocDatTieuChuan = (Integer)attributes.get("nuocDatTieuChuan");

		if (nuocDatTieuChuan != null) {
			setNuocDatTieuChuan(nuocDatTieuChuan);
		}

		Integer nuocCoAsen = (Integer)attributes.get("nuocCoAsen");

		if (nuocCoAsen != null) {
			setNuocCoAsen(nuocCoAsen);
		}

		Integer tongChiPhi = (Integer)attributes.get("tongChiPhi");

		if (tongChiPhi != null) {
			setTongChiPhi(tongChiPhi);
		}

		Integer tongDoanhThu = (Integer)attributes.get("tongDoanhThu");

		if (tongDoanhThu != null) {
			setTongDoanhThu(tongDoanhThu);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Integer idNguoiTao = (Integer)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Integer ketQuaDanhGia = (Integer)attributes.get("ketQuaDanhGia");

		if (ketQuaDanhGia != null) {
			setKetQuaDanhGia(ketQuaDanhGia);
		}

		Integer baoCaoDLI = (Integer)attributes.get("baoCaoDLI");

		if (baoCaoDLI != null) {
			setBaoCaoDLI(baoCaoDLI);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_danhGiaBenVungRemoteModel, id);
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

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setTramCapNuocId", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, tramCapNuocId);
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

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, nam);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTrangThaiCapNuoc() {
		return _trangThaiCapNuoc;
	}

	@Override
	public void setTrangThaiCapNuoc(int trangThaiCapNuoc) {
		_trangThaiCapNuoc = trangThaiCapNuoc;

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiCapNuoc", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, trangThaiCapNuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCongXuatThucTe() {
		return _congXuatThucTe;
	}

	@Override
	public void setCongXuatThucTe(int congXuatThucTe) {
		_congXuatThucTe = congXuatThucTe;

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setCongXuatThucTe", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, congXuatThucTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTongDauNoiMoi() {
		return _tongDauNoiMoi;
	}

	@Override
	public void setTongDauNoiMoi(int tongDauNoiMoi) {
		_tongDauNoiMoi = tongDauNoiMoi;

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setTongDauNoiMoi", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, tongDauNoiMoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTongDauNoiThucTe() {
		return _tongDauNoiThucTe;
	}

	@Override
	public void setTongDauNoiThucTe(int tongDauNoiThucTe) {
		_tongDauNoiThucTe = tongDauNoiThucTe;

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setTongDauNoiThucTe", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, tongDauNoiThucTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNguoiCapThucTe() {
		return _soNguoiCapThucTe;
	}

	@Override
	public void setSoNguoiCapThucTe(int soNguoiCapThucTe) {
		_soNguoiCapThucTe = soNguoiCapThucTe;

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNguoiCapThucTe", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, soNguoiCapThucTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNuocThatThoat() {
		return _nuocThatThoat;
	}

	@Override
	public void setNuocThatThoat(int nuocThatThoat) {
		_nuocThatThoat = nuocThatThoat;

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocThatThoat", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, nuocThatThoat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNuocDatTieuChuan() {
		return _nuocDatTieuChuan;
	}

	@Override
	public void setNuocDatTieuChuan(int nuocDatTieuChuan) {
		_nuocDatTieuChuan = nuocDatTieuChuan;

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocDatTieuChuan", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, nuocDatTieuChuan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNuocCoAsen() {
		return _nuocCoAsen;
	}

	@Override
	public void setNuocCoAsen(int nuocCoAsen) {
		_nuocCoAsen = nuocCoAsen;

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocCoAsen", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, nuocCoAsen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTongChiPhi() {
		return _tongChiPhi;
	}

	@Override
	public void setTongChiPhi(int tongChiPhi) {
		_tongChiPhi = tongChiPhi;

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setTongChiPhi", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, tongChiPhi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTongDoanhThu() {
		return _tongDoanhThu;
	}

	@Override
	public void setTongDoanhThu(int tongDoanhThu) {
		_tongDoanhThu = tongDoanhThu;

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setTongDoanhThu", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, tongDoanhThu);
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

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_danhGiaBenVungRemoteModel, ngayTao);
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

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, idNguoiTao);
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

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_danhGiaBenVungRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKetQuaDanhGia() {
		return _ketQuaDanhGia;
	}

	@Override
	public void setKetQuaDanhGia(int ketQuaDanhGia) {
		_ketQuaDanhGia = ketQuaDanhGia;

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaDanhGia", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, ketQuaDanhGia);
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

		if (_danhGiaBenVungRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaBenVungRemoteModel.getClass();

				Method method = clazz.getMethod("setBaoCaoDLI", int.class);

				method.invoke(_danhGiaBenVungRemoteModel, baoCaoDLI);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDanhGiaBenVungRemoteModel() {
		return _danhGiaBenVungRemoteModel;
	}

	public void setDanhGiaBenVungRemoteModel(
		BaseModel<?> danhGiaBenVungRemoteModel) {
		_danhGiaBenVungRemoteModel = danhGiaBenVungRemoteModel;
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

		Class<?> remoteModelClass = _danhGiaBenVungRemoteModel.getClass();

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

		Object returnValue = method.invoke(_danhGiaBenVungRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DanhGiaBenVungLocalServiceUtil.addDanhGiaBenVung(this);
		}
		else {
			DanhGiaBenVungLocalServiceUtil.updateDanhGiaBenVung(this);
		}
	}

	@Override
	public DanhGiaBenVung toEscapedModel() {
		return (DanhGiaBenVung)ProxyUtil.newProxyInstance(DanhGiaBenVung.class.getClassLoader(),
			new Class[] { DanhGiaBenVung.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DanhGiaBenVungClp clone = new DanhGiaBenVungClp();

		clone.setId(getId());
		clone.setTramCapNuocId(getTramCapNuocId());
		clone.setNam(getNam());
		clone.setTrangThaiCapNuoc(getTrangThaiCapNuoc());
		clone.setCongXuatThucTe(getCongXuatThucTe());
		clone.setTongDauNoiMoi(getTongDauNoiMoi());
		clone.setTongDauNoiThucTe(getTongDauNoiThucTe());
		clone.setSoNguoiCapThucTe(getSoNguoiCapThucTe());
		clone.setNuocThatThoat(getNuocThatThoat());
		clone.setNuocDatTieuChuan(getNuocDatTieuChuan());
		clone.setNuocCoAsen(getNuocCoAsen());
		clone.setTongChiPhi(getTongChiPhi());
		clone.setTongDoanhThu(getTongDoanhThu());
		clone.setNgayTao(getNgayTao());
		clone.setIdNguoiTao(getIdNguoiTao());
		clone.setGhiChu(getGhiChu());
		clone.setKetQuaDanhGia(getKetQuaDanhGia());
		clone.setBaoCaoDLI(getBaoCaoDLI());

		return clone;
	}

	@Override
	public int compareTo(DanhGiaBenVung danhGiaBenVung) {
		int value = 0;

		value = DateUtil.compareTo(getNgayTao(), danhGiaBenVung.getNgayTao());

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

		if (!(obj instanceof DanhGiaBenVungClp)) {
			return false;
		}

		DanhGiaBenVungClp danhGiaBenVung = (DanhGiaBenVungClp)obj;

		long primaryKey = danhGiaBenVung.getPrimaryKey();

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
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", tramCapNuocId=");
		sb.append(getTramCapNuocId());
		sb.append(", nam=");
		sb.append(getNam());
		sb.append(", trangThaiCapNuoc=");
		sb.append(getTrangThaiCapNuoc());
		sb.append(", congXuatThucTe=");
		sb.append(getCongXuatThucTe());
		sb.append(", tongDauNoiMoi=");
		sb.append(getTongDauNoiMoi());
		sb.append(", tongDauNoiThucTe=");
		sb.append(getTongDauNoiThucTe());
		sb.append(", soNguoiCapThucTe=");
		sb.append(getSoNguoiCapThucTe());
		sb.append(", nuocThatThoat=");
		sb.append(getNuocThatThoat());
		sb.append(", nuocDatTieuChuan=");
		sb.append(getNuocDatTieuChuan());
		sb.append(", nuocCoAsen=");
		sb.append(getNuocCoAsen());
		sb.append(", tongChiPhi=");
		sb.append(getTongChiPhi());
		sb.append(", tongDoanhThu=");
		sb.append(getTongDoanhThu());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", idNguoiTao=");
		sb.append(getIdNguoiTao());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", ketQuaDanhGia=");
		sb.append(getKetQuaDanhGia());
		sb.append(", baoCaoDLI=");
		sb.append(getBaoCaoDLI());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung");
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
			"<column><column-name>trangThaiCapNuoc</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiCapNuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>congXuatThucTe</column-name><column-value><![CDATA[");
		sb.append(getCongXuatThucTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongDauNoiMoi</column-name><column-value><![CDATA[");
		sb.append(getTongDauNoiMoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongDauNoiThucTe</column-name><column-value><![CDATA[");
		sb.append(getTongDauNoiThucTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNguoiCapThucTe</column-name><column-value><![CDATA[");
		sb.append(getSoNguoiCapThucTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nuocThatThoat</column-name><column-value><![CDATA[");
		sb.append(getNuocThatThoat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nuocDatTieuChuan</column-name><column-value><![CDATA[");
		sb.append(getNuocDatTieuChuan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nuocCoAsen</column-name><column-value><![CDATA[");
		sb.append(getNuocCoAsen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongChiPhi</column-name><column-value><![CDATA[");
		sb.append(getTongChiPhi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongDoanhThu</column-name><column-value><![CDATA[");
		sb.append(getTongDoanhThu());
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
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaDanhGia</column-name><column-value><![CDATA[");
		sb.append(getKetQuaDanhGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>baoCaoDLI</column-name><column-value><![CDATA[");
		sb.append(getBaoCaoDLI());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _tramCapNuocId;
	private int _nam;
	private int _trangThaiCapNuoc;
	private int _congXuatThucTe;
	private int _tongDauNoiMoi;
	private int _tongDauNoiThucTe;
	private int _soNguoiCapThucTe;
	private int _nuocThatThoat;
	private int _nuocDatTieuChuan;
	private int _nuocCoAsen;
	private int _tongChiPhi;
	private int _tongDoanhThu;
	private Date _ngayTao;
	private int _idNguoiTao;
	private String _ghiChu;
	private int _ketQuaDanhGia;
	private int _baoCaoDLI;
	private BaseModel<?> _danhGiaBenVungRemoteModel;
}