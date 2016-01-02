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
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author BinhTH
 */
public class VeSinhCongTrinhClp extends BaseModelImpl<VeSinhCongTrinh>
	implements VeSinhCongTrinh {
	public VeSinhCongTrinhClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return VeSinhCongTrinh.class;
	}

	@Override
	public String getModelClassName() {
		return VeSinhCongTrinh.class.getName();
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
		attributes.put("tenCongTrinh", getTenCongTrinh());
		attributes.put("loaiCongTrinh", getLoaiCongTrinh());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("diaChi", getDiaChi());
		attributes.put("trangThai", getTrangThai());
		attributes.put("namBaoCao", getNamBaoCao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("kinhDo", getKinhDo());
		attributes.put("viDo", getViDo());
		attributes.put("loaiNguonNuoc", getLoaiNguonNuoc());
		attributes.put("nguonNuocHVS", getNguonNuocHVS());
		attributes.put("loaiNhaTieu", getLoaiNhaTieu());
		attributes.put("nhaTieuHVS", getNhaTieuHVS());
		attributes.put("ketLuanHVS", getKetLuanHVS());
		attributes.put("ngayKiemDem", getNgayKiemDem());
		attributes.put("ngayDanhGia", getNgayDanhGia());
		attributes.put("idNguoiDanhGia", getIdNguoiDanhGia());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String tenCongTrinh = (String)attributes.get("tenCongTrinh");

		if (tenCongTrinh != null) {
			setTenCongTrinh(tenCongTrinh);
		}

		Integer loaiCongTrinh = (Integer)attributes.get("loaiCongTrinh");

		if (loaiCongTrinh != null) {
			setLoaiCongTrinh(loaiCongTrinh);
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

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		Integer trangThai = (Integer)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer namBaoCao = (Integer)attributes.get("namBaoCao");

		if (namBaoCao != null) {
			setNamBaoCao(namBaoCao);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		String idNguoiTao = (String)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		String kinhDo = (String)attributes.get("kinhDo");

		if (kinhDo != null) {
			setKinhDo(kinhDo);
		}

		String viDo = (String)attributes.get("viDo");

		if (viDo != null) {
			setViDo(viDo);
		}

		String loaiNguonNuoc = (String)attributes.get("loaiNguonNuoc");

		if (loaiNguonNuoc != null) {
			setLoaiNguonNuoc(loaiNguonNuoc);
		}

		Integer nguonNuocHVS = (Integer)attributes.get("nguonNuocHVS");

		if (nguonNuocHVS != null) {
			setNguonNuocHVS(nguonNuocHVS);
		}

		String loaiNhaTieu = (String)attributes.get("loaiNhaTieu");

		if (loaiNhaTieu != null) {
			setLoaiNhaTieu(loaiNhaTieu);
		}

		Integer nhaTieuHVS = (Integer)attributes.get("nhaTieuHVS");

		if (nhaTieuHVS != null) {
			setNhaTieuHVS(nhaTieuHVS);
		}

		Integer ketLuanHVS = (Integer)attributes.get("ketLuanHVS");

		if (ketLuanHVS != null) {
			setKetLuanHVS(ketLuanHVS);
		}

		Date ngayKiemDem = (Date)attributes.get("ngayKiemDem");

		if (ngayKiemDem != null) {
			setNgayKiemDem(ngayKiemDem);
		}

		Date ngayDanhGia = (Date)attributes.get("ngayDanhGia");

		if (ngayDanhGia != null) {
			setNgayDanhGia(ngayDanhGia);
		}

		Integer idNguoiDanhGia = (Integer)attributes.get("idNguoiDanhGia");

		if (idNguoiDanhGia != null) {
			setIdNguoiDanhGia(idNguoiDanhGia);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_veSinhCongTrinhRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenCongTrinh() {
		return _tenCongTrinh;
	}

	@Override
	public void setTenCongTrinh(String tenCongTrinh) {
		_tenCongTrinh = tenCongTrinh;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTenCongTrinh", String.class);

				method.invoke(_veSinhCongTrinhRemoteModel, tenCongTrinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoaiCongTrinh() {
		return _loaiCongTrinh;
	}

	@Override
	public void setLoaiCongTrinh(int loaiCongTrinh) {
		_loaiCongTrinh = loaiCongTrinh;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiCongTrinh", int.class);

				method.invoke(_veSinhCongTrinhRemoteModel, loaiCongTrinh);
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

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_veSinhCongTrinhRemoteModel, maTinh);
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

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyen", String.class);

				method.invoke(_veSinhCongTrinhRemoteModel, maHuyen);
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

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMaXa", String.class);

				method.invoke(_veSinhCongTrinhRemoteModel, maXa);
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

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_veSinhCongTrinhRemoteModel, diaChi);
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

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", int.class);

				method.invoke(_veSinhCongTrinhRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNamBaoCao() {
		return _namBaoCao;
	}

	@Override
	public void setNamBaoCao(int namBaoCao) {
		_namBaoCao = namBaoCao;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNamBaoCao", int.class);

				method.invoke(_veSinhCongTrinhRemoteModel, namBaoCao);
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

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_veSinhCongTrinhRemoteModel, ghiChu);
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

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_veSinhCongTrinhRemoteModel, ngayTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIdNguoiTao() {
		return _idNguoiTao;
	}

	@Override
	public void setIdNguoiTao(String idNguoiTao) {
		_idNguoiTao = idNguoiTao;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", String.class);

				method.invoke(_veSinhCongTrinhRemoteModel, idNguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKinhDo() {
		return _kinhDo;
	}

	@Override
	public void setKinhDo(String kinhDo) {
		_kinhDo = kinhDo;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setKinhDo", String.class);

				method.invoke(_veSinhCongTrinhRemoteModel, kinhDo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getViDo() {
		return _viDo;
	}

	@Override
	public void setViDo(String viDo) {
		_viDo = viDo;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setViDo", String.class);

				method.invoke(_veSinhCongTrinhRemoteModel, viDo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiNguonNuoc() {
		return _loaiNguonNuoc;
	}

	@Override
	public void setLoaiNguonNuoc(String loaiNguonNuoc) {
		_loaiNguonNuoc = loaiNguonNuoc;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiNguonNuoc", String.class);

				method.invoke(_veSinhCongTrinhRemoteModel, loaiNguonNuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNguonNuocHVS() {
		return _nguonNuocHVS;
	}

	@Override
	public void setNguonNuocHVS(int nguonNuocHVS) {
		_nguonNuocHVS = nguonNuocHVS;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNguonNuocHVS", int.class);

				method.invoke(_veSinhCongTrinhRemoteModel, nguonNuocHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiNhaTieu() {
		return _loaiNhaTieu;
	}

	@Override
	public void setLoaiNhaTieu(String loaiNhaTieu) {
		_loaiNhaTieu = loaiNhaTieu;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiNhaTieu", String.class);

				method.invoke(_veSinhCongTrinhRemoteModel, loaiNhaTieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNhaTieuHVS() {
		return _nhaTieuHVS;
	}

	@Override
	public void setNhaTieuHVS(int nhaTieuHVS) {
		_nhaTieuHVS = nhaTieuHVS;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNhaTieuHVS", int.class);

				method.invoke(_veSinhCongTrinhRemoteModel, nhaTieuHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKetLuanHVS() {
		return _ketLuanHVS;
	}

	@Override
	public void setKetLuanHVS(int ketLuanHVS) {
		_ketLuanHVS = ketLuanHVS;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setKetLuanHVS", int.class);

				method.invoke(_veSinhCongTrinhRemoteModel, ketLuanHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayKiemDem() {
		return _ngayKiemDem;
	}

	@Override
	public void setNgayKiemDem(Date ngayKiemDem) {
		_ngayKiemDem = ngayKiemDem;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayKiemDem", Date.class);

				method.invoke(_veSinhCongTrinhRemoteModel, ngayKiemDem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayDanhGia() {
		return _ngayDanhGia;
	}

	@Override
	public void setNgayDanhGia(Date ngayDanhGia) {
		_ngayDanhGia = ngayDanhGia;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDanhGia", Date.class);

				method.invoke(_veSinhCongTrinhRemoteModel, ngayDanhGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIdNguoiDanhGia() {
		return _idNguoiDanhGia;
	}

	@Override
	public void setIdNguoiDanhGia(int idNguoiDanhGia) {
		_idNguoiDanhGia = idNguoiDanhGia;

		if (_veSinhCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiDanhGia", int.class);

				method.invoke(_veSinhCongTrinhRemoteModel, idNguoiDanhGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVeSinhCongTrinhRemoteModel() {
		return _veSinhCongTrinhRemoteModel;
	}

	public void setVeSinhCongTrinhRemoteModel(
		BaseModel<?> veSinhCongTrinhRemoteModel) {
		_veSinhCongTrinhRemoteModel = veSinhCongTrinhRemoteModel;
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

		Class<?> remoteModelClass = _veSinhCongTrinhRemoteModel.getClass();

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

		Object returnValue = method.invoke(_veSinhCongTrinhRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VeSinhCongTrinhLocalServiceUtil.addVeSinhCongTrinh(this);
		}
		else {
			VeSinhCongTrinhLocalServiceUtil.updateVeSinhCongTrinh(this);
		}
	}

	@Override
	public VeSinhCongTrinh toEscapedModel() {
		return (VeSinhCongTrinh)ProxyUtil.newProxyInstance(VeSinhCongTrinh.class.getClassLoader(),
			new Class[] { VeSinhCongTrinh.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VeSinhCongTrinhClp clone = new VeSinhCongTrinhClp();

		clone.setId(getId());
		clone.setTenCongTrinh(getTenCongTrinh());
		clone.setLoaiCongTrinh(getLoaiCongTrinh());
		clone.setMaTinh(getMaTinh());
		clone.setMaHuyen(getMaHuyen());
		clone.setMaXa(getMaXa());
		clone.setDiaChi(getDiaChi());
		clone.setTrangThai(getTrangThai());
		clone.setNamBaoCao(getNamBaoCao());
		clone.setGhiChu(getGhiChu());
		clone.setNgayTao(getNgayTao());
		clone.setIdNguoiTao(getIdNguoiTao());
		clone.setKinhDo(getKinhDo());
		clone.setViDo(getViDo());
		clone.setLoaiNguonNuoc(getLoaiNguonNuoc());
		clone.setNguonNuocHVS(getNguonNuocHVS());
		clone.setLoaiNhaTieu(getLoaiNhaTieu());
		clone.setNhaTieuHVS(getNhaTieuHVS());
		clone.setKetLuanHVS(getKetLuanHVS());
		clone.setNgayKiemDem(getNgayKiemDem());
		clone.setNgayDanhGia(getNgayDanhGia());
		clone.setIdNguoiDanhGia(getIdNguoiDanhGia());

		return clone;
	}

	@Override
	public int compareTo(VeSinhCongTrinh veSinhCongTrinh) {
		int value = 0;

		value = getMaTinh().compareTo(veSinhCongTrinh.getMaTinh());

		if (value != 0) {
			return value;
		}

		value = getMaHuyen().compareTo(veSinhCongTrinh.getMaHuyen());

		if (value != 0) {
			return value;
		}

		value = getMaXa().compareTo(veSinhCongTrinh.getMaXa());

		if (value != 0) {
			return value;
		}

		value = getDiaChi().compareTo(veSinhCongTrinh.getDiaChi());

		if (value != 0) {
			return value;
		}

		value = getLoaiNhaTieu().compareTo(veSinhCongTrinh.getLoaiNhaTieu());

		if (value != 0) {
			return value;
		}

		value = getTenCongTrinh().compareTo(veSinhCongTrinh.getTenCongTrinh());

		if (value != 0) {
			return value;
		}

		if (getTrangThai() < veSinhCongTrinh.getTrangThai()) {
			value = -1;
		}
		else if (getTrangThai() > veSinhCongTrinh.getTrangThai()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (getNamBaoCao() < veSinhCongTrinh.getNamBaoCao()) {
			value = -1;
		}
		else if (getNamBaoCao() > veSinhCongTrinh.getNamBaoCao()) {
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

		if (!(obj instanceof VeSinhCongTrinhClp)) {
			return false;
		}

		VeSinhCongTrinhClp veSinhCongTrinh = (VeSinhCongTrinhClp)obj;

		int primaryKey = veSinhCongTrinh.getPrimaryKey();

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
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", tenCongTrinh=");
		sb.append(getTenCongTrinh());
		sb.append(", loaiCongTrinh=");
		sb.append(getLoaiCongTrinh());
		sb.append(", maTinh=");
		sb.append(getMaTinh());
		sb.append(", maHuyen=");
		sb.append(getMaHuyen());
		sb.append(", maXa=");
		sb.append(getMaXa());
		sb.append(", diaChi=");
		sb.append(getDiaChi());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", namBaoCao=");
		sb.append(getNamBaoCao());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", idNguoiTao=");
		sb.append(getIdNguoiTao());
		sb.append(", kinhDo=");
		sb.append(getKinhDo());
		sb.append(", viDo=");
		sb.append(getViDo());
		sb.append(", loaiNguonNuoc=");
		sb.append(getLoaiNguonNuoc());
		sb.append(", nguonNuocHVS=");
		sb.append(getNguonNuocHVS());
		sb.append(", loaiNhaTieu=");
		sb.append(getLoaiNhaTieu());
		sb.append(", nhaTieuHVS=");
		sb.append(getNhaTieuHVS());
		sb.append(", ketLuanHVS=");
		sb.append(getKetLuanHVS());
		sb.append(", ngayKiemDem=");
		sb.append(getNgayKiemDem());
		sb.append(", ngayDanhGia=");
		sb.append(getNgayDanhGia());
		sb.append(", idNguoiDanhGia=");
		sb.append(getIdNguoiDanhGia());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenCongTrinh</column-name><column-value><![CDATA[");
		sb.append(getTenCongTrinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiCongTrinh</column-name><column-value><![CDATA[");
		sb.append(getLoaiCongTrinh());
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
			"<column><column-name>diaChi</column-name><column-value><![CDATA[");
		sb.append(getDiaChi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namBaoCao</column-name><column-value><![CDATA[");
		sb.append(getNamBaoCao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
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
			"<column><column-name>kinhDo</column-name><column-value><![CDATA[");
		sb.append(getKinhDo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viDo</column-name><column-value><![CDATA[");
		sb.append(getViDo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiNguonNuoc</column-name><column-value><![CDATA[");
		sb.append(getLoaiNguonNuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguonNuocHVS</column-name><column-value><![CDATA[");
		sb.append(getNguonNuocHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiNhaTieu</column-name><column-value><![CDATA[");
		sb.append(getLoaiNhaTieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhaTieuHVS</column-name><column-value><![CDATA[");
		sb.append(getNhaTieuHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketLuanHVS</column-name><column-value><![CDATA[");
		sb.append(getKetLuanHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayKiemDem</column-name><column-value><![CDATA[");
		sb.append(getNgayKiemDem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayDanhGia</column-name><column-value><![CDATA[");
		sb.append(getNgayDanhGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idNguoiDanhGia</column-name><column-value><![CDATA[");
		sb.append(getIdNguoiDanhGia());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _tenCongTrinh;
	private int _loaiCongTrinh;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _diaChi;
	private int _trangThai;
	private int _namBaoCao;
	private String _ghiChu;
	private Date _ngayTao;
	private String _idNguoiTao;
	private String _kinhDo;
	private String _viDo;
	private String _loaiNguonNuoc;
	private int _nguonNuocHVS;
	private String _loaiNhaTieu;
	private int _nhaTieuHVS;
	private int _ketLuanHVS;
	private Date _ngayKiemDem;
	private Date _ngayDanhGia;
	private int _idNguoiDanhGia;
	private BaseModel<?> _veSinhCongTrinhRemoteModel;
}