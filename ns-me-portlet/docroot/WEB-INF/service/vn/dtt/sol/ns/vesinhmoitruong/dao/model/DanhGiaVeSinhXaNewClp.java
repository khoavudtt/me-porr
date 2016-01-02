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
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author BinhTH
 */
public class DanhGiaVeSinhXaNewClp extends BaseModelImpl<DanhGiaVeSinhXaNew>
	implements DanhGiaVeSinhXaNew {
	public DanhGiaVeSinhXaNewClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DanhGiaVeSinhXaNew.class;
	}

	@Override
	public String getModelClassName() {
		return DanhGiaVeSinhXaNew.class.getName();
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
		attributes.put("soDan", getSoDan());
		attributes.put("tongSoHGD", getTongSoHGD());
		attributes.put("soHGDCoNhaTieu", getSoHGDCoNhaTieu());
		attributes.put("soHGDCoNhaTieuHVS", getSoHGDCoNhaTieuHVS());
		attributes.put("soNhaTieuHVSXayMoi", getSoNhaTieuHVSXayMoi());
		attributes.put("tiLeHGDCoNhaTieu", getTiLeHGDCoNhaTieu());
		attributes.put("tiLeHGDCoNhaTieuHVS", getTiLeHGDCoNhaTieuHVS());
		attributes.put("tongSoTruongHoc", getTongSoTruongHoc());
		attributes.put("soTruongHocHVS", getSoTruongHocHVS());
		attributes.put("tongSoTramYTe", getTongSoTramYTe());
		attributes.put("soTramYTeHVS", getSoTramYTeHVS());
		attributes.put("tiLeTruongHocHVS", getTiLeTruongHocHVS());
		attributes.put("tiLeTramYTeHVS", getTiLeTramYTeHVS());
		attributes.put("ketLuanVSTX", getKetLuanVSTX());
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

		Integer soDan = (Integer)attributes.get("soDan");

		if (soDan != null) {
			setSoDan(soDan);
		}

		Integer tongSoHGD = (Integer)attributes.get("tongSoHGD");

		if (tongSoHGD != null) {
			setTongSoHGD(tongSoHGD);
		}

		Integer soHGDCoNhaTieu = (Integer)attributes.get("soHGDCoNhaTieu");

		if (soHGDCoNhaTieu != null) {
			setSoHGDCoNhaTieu(soHGDCoNhaTieu);
		}

		Integer soHGDCoNhaTieuHVS = (Integer)attributes.get("soHGDCoNhaTieuHVS");

		if (soHGDCoNhaTieuHVS != null) {
			setSoHGDCoNhaTieuHVS(soHGDCoNhaTieuHVS);
		}

		Integer soNhaTieuHVSXayMoi = (Integer)attributes.get(
				"soNhaTieuHVSXayMoi");

		if (soNhaTieuHVSXayMoi != null) {
			setSoNhaTieuHVSXayMoi(soNhaTieuHVSXayMoi);
		}

		Integer tiLeHGDCoNhaTieu = (Integer)attributes.get("tiLeHGDCoNhaTieu");

		if (tiLeHGDCoNhaTieu != null) {
			setTiLeHGDCoNhaTieu(tiLeHGDCoNhaTieu);
		}

		Integer tiLeHGDCoNhaTieuHVS = (Integer)attributes.get(
				"tiLeHGDCoNhaTieuHVS");

		if (tiLeHGDCoNhaTieuHVS != null) {
			setTiLeHGDCoNhaTieuHVS(tiLeHGDCoNhaTieuHVS);
		}

		Integer tongSoTruongHoc = (Integer)attributes.get("tongSoTruongHoc");

		if (tongSoTruongHoc != null) {
			setTongSoTruongHoc(tongSoTruongHoc);
		}

		Integer soTruongHocHVS = (Integer)attributes.get("soTruongHocHVS");

		if (soTruongHocHVS != null) {
			setSoTruongHocHVS(soTruongHocHVS);
		}

		Integer tongSoTramYTe = (Integer)attributes.get("tongSoTramYTe");

		if (tongSoTramYTe != null) {
			setTongSoTramYTe(tongSoTramYTe);
		}

		Integer soTramYTeHVS = (Integer)attributes.get("soTramYTeHVS");

		if (soTramYTeHVS != null) {
			setSoTramYTeHVS(soTramYTeHVS);
		}

		Integer tiLeTruongHocHVS = (Integer)attributes.get("tiLeTruongHocHVS");

		if (tiLeTruongHocHVS != null) {
			setTiLeTruongHocHVS(tiLeTruongHocHVS);
		}

		Integer tiLeTramYTeHVS = (Integer)attributes.get("tiLeTramYTeHVS");

		if (tiLeTramYTeHVS != null) {
			setTiLeTramYTeHVS(tiLeTramYTeHVS);
		}

		Integer ketLuanVSTX = (Integer)attributes.get("ketLuanVSTX");

		if (ketLuanVSTX != null) {
			setKetLuanVSTX(ketLuanVSTX);
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

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, id);
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

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, maTinh);
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

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyen", String.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, maHuyen);
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

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setMaXa", String.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, maXa);
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

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, nam);
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

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDan", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, soDan);
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

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setTongSoHGD", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, tongSoHGD);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoHGDCoNhaTieu() {
		return _soHGDCoNhaTieu;
	}

	@Override
	public void setSoHGDCoNhaTieu(int soHGDCoNhaTieu) {
		_soHGDCoNhaTieu = soHGDCoNhaTieu;

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setSoHGDCoNhaTieu", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, soHGDCoNhaTieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoHGDCoNhaTieuHVS() {
		return _soHGDCoNhaTieuHVS;
	}

	@Override
	public void setSoHGDCoNhaTieuHVS(int soHGDCoNhaTieuHVS) {
		_soHGDCoNhaTieuHVS = soHGDCoNhaTieuHVS;

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setSoHGDCoNhaTieuHVS",
						int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, soHGDCoNhaTieuHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNhaTieuHVSXayMoi() {
		return _soNhaTieuHVSXayMoi;
	}

	@Override
	public void setSoNhaTieuHVSXayMoi(int soNhaTieuHVSXayMoi) {
		_soNhaTieuHVSXayMoi = soNhaTieuHVSXayMoi;

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNhaTieuHVSXayMoi",
						int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, soNhaTieuHVSXayMoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTiLeHGDCoNhaTieu() {
		return _tiLeHGDCoNhaTieu;
	}

	@Override
	public void setTiLeHGDCoNhaTieu(int tiLeHGDCoNhaTieu) {
		_tiLeHGDCoNhaTieu = tiLeHGDCoNhaTieu;

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeHGDCoNhaTieu", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, tiLeHGDCoNhaTieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTiLeHGDCoNhaTieuHVS() {
		return _tiLeHGDCoNhaTieuHVS;
	}

	@Override
	public void setTiLeHGDCoNhaTieuHVS(int tiLeHGDCoNhaTieuHVS) {
		_tiLeHGDCoNhaTieuHVS = tiLeHGDCoNhaTieuHVS;

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeHGDCoNhaTieuHVS",
						int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel,
					tiLeHGDCoNhaTieuHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTongSoTruongHoc() {
		return _tongSoTruongHoc;
	}

	@Override
	public void setTongSoTruongHoc(int tongSoTruongHoc) {
		_tongSoTruongHoc = tongSoTruongHoc;

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setTongSoTruongHoc", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, tongSoTruongHoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoTruongHocHVS() {
		return _soTruongHocHVS;
	}

	@Override
	public void setSoTruongHocHVS(int soTruongHocHVS) {
		_soTruongHocHVS = soTruongHocHVS;

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setSoTruongHocHVS", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, soTruongHocHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTongSoTramYTe() {
		return _tongSoTramYTe;
	}

	@Override
	public void setTongSoTramYTe(int tongSoTramYTe) {
		_tongSoTramYTe = tongSoTramYTe;

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setTongSoTramYTe", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, tongSoTramYTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoTramYTeHVS() {
		return _soTramYTeHVS;
	}

	@Override
	public void setSoTramYTeHVS(int soTramYTeHVS) {
		_soTramYTeHVS = soTramYTeHVS;

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setSoTramYTeHVS", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, soTramYTeHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTiLeTruongHocHVS() {
		return _tiLeTruongHocHVS;
	}

	@Override
	public void setTiLeTruongHocHVS(int tiLeTruongHocHVS) {
		_tiLeTruongHocHVS = tiLeTruongHocHVS;

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeTruongHocHVS", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, tiLeTruongHocHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTiLeTramYTeHVS() {
		return _tiLeTramYTeHVS;
	}

	@Override
	public void setTiLeTramYTeHVS(int tiLeTramYTeHVS) {
		_tiLeTramYTeHVS = tiLeTramYTeHVS;

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeTramYTeHVS", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, tiLeTramYTeHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKetLuanVSTX() {
		return _ketLuanVSTX;
	}

	@Override
	public void setKetLuanVSTX(int ketLuanVSTX) {
		_ketLuanVSTX = ketLuanVSTX;

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setKetLuanVSTX", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, ketLuanVSTX);
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

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, ghiChu);
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

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setBaoCaoDLI", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, baoCaoDLI);
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

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, ngayTao);
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

		if (_danhGiaVeSinhXaNewRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", int.class);

				method.invoke(_danhGiaVeSinhXaNewRemoteModel, idNguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDanhGiaVeSinhXaNewRemoteModel() {
		return _danhGiaVeSinhXaNewRemoteModel;
	}

	public void setDanhGiaVeSinhXaNewRemoteModel(
		BaseModel<?> danhGiaVeSinhXaNewRemoteModel) {
		_danhGiaVeSinhXaNewRemoteModel = danhGiaVeSinhXaNewRemoteModel;
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

		Class<?> remoteModelClass = _danhGiaVeSinhXaNewRemoteModel.getClass();

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

		Object returnValue = method.invoke(_danhGiaVeSinhXaNewRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DanhGiaVeSinhXaNewLocalServiceUtil.addDanhGiaVeSinhXaNew(this);
		}
		else {
			DanhGiaVeSinhXaNewLocalServiceUtil.updateDanhGiaVeSinhXaNew(this);
		}
	}

	@Override
	public DanhGiaVeSinhXaNew toEscapedModel() {
		return (DanhGiaVeSinhXaNew)ProxyUtil.newProxyInstance(DanhGiaVeSinhXaNew.class.getClassLoader(),
			new Class[] { DanhGiaVeSinhXaNew.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DanhGiaVeSinhXaNewClp clone = new DanhGiaVeSinhXaNewClp();

		clone.setId(getId());
		clone.setMaTinh(getMaTinh());
		clone.setMaHuyen(getMaHuyen());
		clone.setMaXa(getMaXa());
		clone.setNam(getNam());
		clone.setSoDan(getSoDan());
		clone.setTongSoHGD(getTongSoHGD());
		clone.setSoHGDCoNhaTieu(getSoHGDCoNhaTieu());
		clone.setSoHGDCoNhaTieuHVS(getSoHGDCoNhaTieuHVS());
		clone.setSoNhaTieuHVSXayMoi(getSoNhaTieuHVSXayMoi());
		clone.setTiLeHGDCoNhaTieu(getTiLeHGDCoNhaTieu());
		clone.setTiLeHGDCoNhaTieuHVS(getTiLeHGDCoNhaTieuHVS());
		clone.setTongSoTruongHoc(getTongSoTruongHoc());
		clone.setSoTruongHocHVS(getSoTruongHocHVS());
		clone.setTongSoTramYTe(getTongSoTramYTe());
		clone.setSoTramYTeHVS(getSoTramYTeHVS());
		clone.setTiLeTruongHocHVS(getTiLeTruongHocHVS());
		clone.setTiLeTramYTeHVS(getTiLeTramYTeHVS());
		clone.setKetLuanVSTX(getKetLuanVSTX());
		clone.setGhiChu(getGhiChu());
		clone.setBaoCaoDLI(getBaoCaoDLI());
		clone.setNgayTao(getNgayTao());
		clone.setIdNguoiTao(getIdNguoiTao());

		return clone;
	}

	@Override
	public int compareTo(DanhGiaVeSinhXaNew danhGiaVeSinhXaNew) {
		int value = 0;

		if (getId() < danhGiaVeSinhXaNew.getId()) {
			value = -1;
		}
		else if (getId() > danhGiaVeSinhXaNew.getId()) {
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

		if (!(obj instanceof DanhGiaVeSinhXaNewClp)) {
			return false;
		}

		DanhGiaVeSinhXaNewClp danhGiaVeSinhXaNew = (DanhGiaVeSinhXaNewClp)obj;

		int primaryKey = danhGiaVeSinhXaNew.getPrimaryKey();

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
		StringBundler sb = new StringBundler(47);

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
		sb.append(", soDan=");
		sb.append(getSoDan());
		sb.append(", tongSoHGD=");
		sb.append(getTongSoHGD());
		sb.append(", soHGDCoNhaTieu=");
		sb.append(getSoHGDCoNhaTieu());
		sb.append(", soHGDCoNhaTieuHVS=");
		sb.append(getSoHGDCoNhaTieuHVS());
		sb.append(", soNhaTieuHVSXayMoi=");
		sb.append(getSoNhaTieuHVSXayMoi());
		sb.append(", tiLeHGDCoNhaTieu=");
		sb.append(getTiLeHGDCoNhaTieu());
		sb.append(", tiLeHGDCoNhaTieuHVS=");
		sb.append(getTiLeHGDCoNhaTieuHVS());
		sb.append(", tongSoTruongHoc=");
		sb.append(getTongSoTruongHoc());
		sb.append(", soTruongHocHVS=");
		sb.append(getSoTruongHocHVS());
		sb.append(", tongSoTramYTe=");
		sb.append(getTongSoTramYTe());
		sb.append(", soTramYTeHVS=");
		sb.append(getSoTramYTeHVS());
		sb.append(", tiLeTruongHocHVS=");
		sb.append(getTiLeTruongHocHVS());
		sb.append(", tiLeTramYTeHVS=");
		sb.append(getTiLeTramYTeHVS());
		sb.append(", ketLuanVSTX=");
		sb.append(getKetLuanVSTX());
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
		StringBundler sb = new StringBundler(73);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew");
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
			"<column><column-name>soDan</column-name><column-value><![CDATA[");
		sb.append(getSoDan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongSoHGD</column-name><column-value><![CDATA[");
		sb.append(getTongSoHGD());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soHGDCoNhaTieu</column-name><column-value><![CDATA[");
		sb.append(getSoHGDCoNhaTieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soHGDCoNhaTieuHVS</column-name><column-value><![CDATA[");
		sb.append(getSoHGDCoNhaTieuHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNhaTieuHVSXayMoi</column-name><column-value><![CDATA[");
		sb.append(getSoNhaTieuHVSXayMoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeHGDCoNhaTieu</column-name><column-value><![CDATA[");
		sb.append(getTiLeHGDCoNhaTieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeHGDCoNhaTieuHVS</column-name><column-value><![CDATA[");
		sb.append(getTiLeHGDCoNhaTieuHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongSoTruongHoc</column-name><column-value><![CDATA[");
		sb.append(getTongSoTruongHoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soTruongHocHVS</column-name><column-value><![CDATA[");
		sb.append(getSoTruongHocHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongSoTramYTe</column-name><column-value><![CDATA[");
		sb.append(getTongSoTramYTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soTramYTeHVS</column-name><column-value><![CDATA[");
		sb.append(getSoTramYTeHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeTruongHocHVS</column-name><column-value><![CDATA[");
		sb.append(getTiLeTruongHocHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeTramYTeHVS</column-name><column-value><![CDATA[");
		sb.append(getTiLeTramYTeHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketLuanVSTX</column-name><column-value><![CDATA[");
		sb.append(getKetLuanVSTX());
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
	private int _soDan;
	private int _tongSoHGD;
	private int _soHGDCoNhaTieu;
	private int _soHGDCoNhaTieuHVS;
	private int _soNhaTieuHVSXayMoi;
	private int _tiLeHGDCoNhaTieu;
	private int _tiLeHGDCoNhaTieuHVS;
	private int _tongSoTruongHoc;
	private int _soTruongHocHVS;
	private int _tongSoTramYTe;
	private int _soTramYTeHVS;
	private int _tiLeTruongHocHVS;
	private int _tiLeTramYTeHVS;
	private int _ketLuanVSTX;
	private String _ghiChu;
	private int _baoCaoDLI;
	private Date _ngayTao;
	private int _idNguoiTao;
	private BaseModel<?> _danhGiaVeSinhXaNewRemoteModel;
}