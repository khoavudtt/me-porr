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
import vn.dtt.sol.ns.tramcap.dao.service.DanhGiaVanHanhLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author khoa.vu
 */
public class DanhGiaVanHanhClp extends BaseModelImpl<DanhGiaVanHanh>
	implements DanhGiaVanHanh {
	public DanhGiaVanHanhClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DanhGiaVanHanh.class;
	}

	@Override
	public String getModelClassName() {
		return DanhGiaVanHanh.class.getName();
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
		attributes.put("thang", getThang());
		attributes.put("nam", getNam());
		attributes.put("congXuatThucTe", getCongXuatThucTe());
		attributes.put("nuocThatThoat", getNuocThatThoat());
		attributes.put("nuocDatTieuChuan", getNuocDatTieuChuan());
		attributes.put("nuocCoAsen", getNuocCoAsen());
		attributes.put("trangThaiCapNuoc", getTrangThaiCapNuoc());
		attributes.put("chiPhiHoaChat", getChiPhiHoaChat());
		attributes.put("chiPhiDien", getChiPhiDien());
		attributes.put("luongNhanVien", getLuongNhanVien());
		attributes.put("chiPhiSuaChua", getChiPhiSuaChua());
		attributes.put("doanhThu", getDoanhThu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("sanLuongSanXuat", getSanLuongSanXuat());
		attributes.put("sanLuongTieuHao", getSanLuongTieuHao());

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

		Integer thang = (Integer)attributes.get("thang");

		if (thang != null) {
			setThang(thang);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer congXuatThucTe = (Integer)attributes.get("congXuatThucTe");

		if (congXuatThucTe != null) {
			setCongXuatThucTe(congXuatThucTe);
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

		Integer trangThaiCapNuoc = (Integer)attributes.get("trangThaiCapNuoc");

		if (trangThaiCapNuoc != null) {
			setTrangThaiCapNuoc(trangThaiCapNuoc);
		}

		Integer chiPhiHoaChat = (Integer)attributes.get("chiPhiHoaChat");

		if (chiPhiHoaChat != null) {
			setChiPhiHoaChat(chiPhiHoaChat);
		}

		Integer chiPhiDien = (Integer)attributes.get("chiPhiDien");

		if (chiPhiDien != null) {
			setChiPhiDien(chiPhiDien);
		}

		Integer luongNhanVien = (Integer)attributes.get("luongNhanVien");

		if (luongNhanVien != null) {
			setLuongNhanVien(luongNhanVien);
		}

		Integer chiPhiSuaChua = (Integer)attributes.get("chiPhiSuaChua");

		if (chiPhiSuaChua != null) {
			setChiPhiSuaChua(chiPhiSuaChua);
		}

		Integer doanhThu = (Integer)attributes.get("doanhThu");

		if (doanhThu != null) {
			setDoanhThu(doanhThu);
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

		Integer sanLuongSanXuat = (Integer)attributes.get("sanLuongSanXuat");

		if (sanLuongSanXuat != null) {
			setSanLuongSanXuat(sanLuongSanXuat);
		}

		Integer sanLuongTieuHao = (Integer)attributes.get("sanLuongTieuHao");

		if (sanLuongTieuHao != null) {
			setSanLuongTieuHao(sanLuongTieuHao);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_danhGiaVanHanhRemoteModel, id);
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

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setTramCapNuocId", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, tramCapNuocId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThang() {
		return _thang;
	}

	@Override
	public void setThang(int thang) {
		_thang = thang;

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setThang", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, thang);
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

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, nam);
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

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setCongXuatThucTe", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, congXuatThucTe);
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

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocThatThoat", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, nuocThatThoat);
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

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocDatTieuChuan", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, nuocDatTieuChuan);
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

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocCoAsen", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, nuocCoAsen);
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

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiCapNuoc", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, trangThaiCapNuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getChiPhiHoaChat() {
		return _chiPhiHoaChat;
	}

	@Override
	public void setChiPhiHoaChat(int chiPhiHoaChat) {
		_chiPhiHoaChat = chiPhiHoaChat;

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setChiPhiHoaChat", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, chiPhiHoaChat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getChiPhiDien() {
		return _chiPhiDien;
	}

	@Override
	public void setChiPhiDien(int chiPhiDien) {
		_chiPhiDien = chiPhiDien;

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setChiPhiDien", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, chiPhiDien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLuongNhanVien() {
		return _luongNhanVien;
	}

	@Override
	public void setLuongNhanVien(int luongNhanVien) {
		_luongNhanVien = luongNhanVien;

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setLuongNhanVien", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, luongNhanVien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getChiPhiSuaChua() {
		return _chiPhiSuaChua;
	}

	@Override
	public void setChiPhiSuaChua(int chiPhiSuaChua) {
		_chiPhiSuaChua = chiPhiSuaChua;

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setChiPhiSuaChua", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, chiPhiSuaChua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDoanhThu() {
		return _doanhThu;
	}

	@Override
	public void setDoanhThu(int doanhThu) {
		_doanhThu = doanhThu;

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setDoanhThu", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, doanhThu);
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

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_danhGiaVanHanhRemoteModel, ngayTao);
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

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, idNguoiTao);
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

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_danhGiaVanHanhRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSanLuongSanXuat() {
		return _sanLuongSanXuat;
	}

	@Override
	public void setSanLuongSanXuat(int sanLuongSanXuat) {
		_sanLuongSanXuat = sanLuongSanXuat;

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setSanLuongSanXuat", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, sanLuongSanXuat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSanLuongTieuHao() {
		return _sanLuongTieuHao;
	}

	@Override
	public void setSanLuongTieuHao(int sanLuongTieuHao) {
		_sanLuongTieuHao = sanLuongTieuHao;

		if (_danhGiaVanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setSanLuongTieuHao", int.class);

				method.invoke(_danhGiaVanHanhRemoteModel, sanLuongTieuHao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDanhGiaVanHanhRemoteModel() {
		return _danhGiaVanHanhRemoteModel;
	}

	public void setDanhGiaVanHanhRemoteModel(
		BaseModel<?> danhGiaVanHanhRemoteModel) {
		_danhGiaVanHanhRemoteModel = danhGiaVanHanhRemoteModel;
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

		Class<?> remoteModelClass = _danhGiaVanHanhRemoteModel.getClass();

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

		Object returnValue = method.invoke(_danhGiaVanHanhRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DanhGiaVanHanhLocalServiceUtil.addDanhGiaVanHanh(this);
		}
		else {
			DanhGiaVanHanhLocalServiceUtil.updateDanhGiaVanHanh(this);
		}
	}

	@Override
	public DanhGiaVanHanh toEscapedModel() {
		return (DanhGiaVanHanh)ProxyUtil.newProxyInstance(DanhGiaVanHanh.class.getClassLoader(),
			new Class[] { DanhGiaVanHanh.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DanhGiaVanHanhClp clone = new DanhGiaVanHanhClp();

		clone.setId(getId());
		clone.setTramCapNuocId(getTramCapNuocId());
		clone.setThang(getThang());
		clone.setNam(getNam());
		clone.setCongXuatThucTe(getCongXuatThucTe());
		clone.setNuocThatThoat(getNuocThatThoat());
		clone.setNuocDatTieuChuan(getNuocDatTieuChuan());
		clone.setNuocCoAsen(getNuocCoAsen());
		clone.setTrangThaiCapNuoc(getTrangThaiCapNuoc());
		clone.setChiPhiHoaChat(getChiPhiHoaChat());
		clone.setChiPhiDien(getChiPhiDien());
		clone.setLuongNhanVien(getLuongNhanVien());
		clone.setChiPhiSuaChua(getChiPhiSuaChua());
		clone.setDoanhThu(getDoanhThu());
		clone.setNgayTao(getNgayTao());
		clone.setIdNguoiTao(getIdNguoiTao());
		clone.setGhiChu(getGhiChu());
		clone.setSanLuongSanXuat(getSanLuongSanXuat());
		clone.setSanLuongTieuHao(getSanLuongTieuHao());

		return clone;
	}

	@Override
	public int compareTo(DanhGiaVanHanh danhGiaVanHanh) {
		int value = 0;

		if (getNam() < danhGiaVanHanh.getNam()) {
			value = -1;
		}
		else if (getNam() > danhGiaVanHanh.getNam()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		if (getThang() < danhGiaVanHanh.getThang()) {
			value = -1;
		}
		else if (getThang() > danhGiaVanHanh.getThang()) {
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

		if (!(obj instanceof DanhGiaVanHanhClp)) {
			return false;
		}

		DanhGiaVanHanhClp danhGiaVanHanh = (DanhGiaVanHanhClp)obj;

		long primaryKey = danhGiaVanHanh.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", tramCapNuocId=");
		sb.append(getTramCapNuocId());
		sb.append(", thang=");
		sb.append(getThang());
		sb.append(", nam=");
		sb.append(getNam());
		sb.append(", congXuatThucTe=");
		sb.append(getCongXuatThucTe());
		sb.append(", nuocThatThoat=");
		sb.append(getNuocThatThoat());
		sb.append(", nuocDatTieuChuan=");
		sb.append(getNuocDatTieuChuan());
		sb.append(", nuocCoAsen=");
		sb.append(getNuocCoAsen());
		sb.append(", trangThaiCapNuoc=");
		sb.append(getTrangThaiCapNuoc());
		sb.append(", chiPhiHoaChat=");
		sb.append(getChiPhiHoaChat());
		sb.append(", chiPhiDien=");
		sb.append(getChiPhiDien());
		sb.append(", luongNhanVien=");
		sb.append(getLuongNhanVien());
		sb.append(", chiPhiSuaChua=");
		sb.append(getChiPhiSuaChua());
		sb.append(", doanhThu=");
		sb.append(getDoanhThu());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", idNguoiTao=");
		sb.append(getIdNguoiTao());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", sanLuongSanXuat=");
		sb.append(getSanLuongSanXuat());
		sb.append(", sanLuongTieuHao=");
		sb.append(getSanLuongTieuHao());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh");
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
			"<column><column-name>thang</column-name><column-value><![CDATA[");
		sb.append(getThang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nam</column-name><column-value><![CDATA[");
		sb.append(getNam());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>congXuatThucTe</column-name><column-value><![CDATA[");
		sb.append(getCongXuatThucTe());
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
			"<column><column-name>trangThaiCapNuoc</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiCapNuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chiPhiHoaChat</column-name><column-value><![CDATA[");
		sb.append(getChiPhiHoaChat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chiPhiDien</column-name><column-value><![CDATA[");
		sb.append(getChiPhiDien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>luongNhanVien</column-name><column-value><![CDATA[");
		sb.append(getLuongNhanVien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chiPhiSuaChua</column-name><column-value><![CDATA[");
		sb.append(getChiPhiSuaChua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doanhThu</column-name><column-value><![CDATA[");
		sb.append(getDoanhThu());
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
			"<column><column-name>sanLuongSanXuat</column-name><column-value><![CDATA[");
		sb.append(getSanLuongSanXuat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sanLuongTieuHao</column-name><column-value><![CDATA[");
		sb.append(getSanLuongTieuHao());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _tramCapNuocId;
	private int _thang;
	private int _nam;
	private int _congXuatThucTe;
	private int _nuocThatThoat;
	private int _nuocDatTieuChuan;
	private int _nuocCoAsen;
	private int _trangThaiCapNuoc;
	private int _chiPhiHoaChat;
	private int _chiPhiDien;
	private int _luongNhanVien;
	private int _chiPhiSuaChua;
	private int _doanhThu;
	private Date _ngayTao;
	private int _idNguoiTao;
	private String _ghiChu;
	private int _sanLuongSanXuat;
	private int _sanLuongTieuHao;
	private BaseModel<?> _danhGiaVanHanhRemoteModel;
}