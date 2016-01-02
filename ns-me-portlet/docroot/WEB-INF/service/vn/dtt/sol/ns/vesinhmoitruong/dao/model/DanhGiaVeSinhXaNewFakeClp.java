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
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewFakeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author BinhTH
 */
public class DanhGiaVeSinhXaNewFakeClp extends BaseModelImpl<DanhGiaVeSinhXaNewFake>
	implements DanhGiaVeSinhXaNewFake {
	public DanhGiaVeSinhXaNewFakeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DanhGiaVeSinhXaNewFake.class;
	}

	@Override
	public String getModelClassName() {
		return DanhGiaVeSinhXaNewFake.class.getName();
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
		attributes.put("maTinhStr", getMaTinhStr());
		attributes.put("maHuyenStr", getMaHuyenStr());
		attributes.put("maXaStr", getMaXaStr());
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
		attributes.put("dangKyVSTX", getDangKyVSTX());
		attributes.put("soNhaTieuHVSMoi", getSoNhaTieuHVSMoi());

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

		String maTinhStr = (String)attributes.get("maTinhStr");

		if (maTinhStr != null) {
			setMaTinhStr(maTinhStr);
		}

		String maHuyenStr = (String)attributes.get("maHuyenStr");

		if (maHuyenStr != null) {
			setMaHuyenStr(maHuyenStr);
		}

		String maXaStr = (String)attributes.get("maXaStr");

		if (maXaStr != null) {
			setMaXaStr(maXaStr);
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

		Integer dangKyVSTX = (Integer)attributes.get("dangKyVSTX");

		if (dangKyVSTX != null) {
			setDangKyVSTX(dangKyVSTX);
		}

		Integer soNhaTieuHVSMoi = (Integer)attributes.get("soNhaTieuHVSMoi");

		if (soNhaTieuHVSMoi != null) {
			setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, id);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, maTinh);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyen", String.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, maHuyen);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaXa", String.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, maXa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTinhStr() {
		return _maTinhStr;
	}

	@Override
	public void setMaTinhStr(String maTinhStr) {
		_maTinhStr = maTinhStr;

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinhStr", String.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, maTinhStr);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaHuyenStr() {
		return _maHuyenStr;
	}

	@Override
	public void setMaHuyenStr(String maHuyenStr) {
		_maHuyenStr = maHuyenStr;

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyenStr", String.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, maHuyenStr);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaXaStr() {
		return _maXaStr;
	}

	@Override
	public void setMaXaStr(String maXaStr) {
		_maXaStr = maXaStr;

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaXaStr", String.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, maXaStr);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, nam);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDan", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, soDan);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setTongSoHGD", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, tongSoHGD);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setSoHGDCoNhaTieu", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, soHGDCoNhaTieu);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setSoHGDCoNhaTieuHVS",
						int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel,
					soHGDCoNhaTieuHVS);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNhaTieuHVSXayMoi",
						int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel,
					soNhaTieuHVSXayMoi);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeHGDCoNhaTieu", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel,
					tiLeHGDCoNhaTieu);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeHGDCoNhaTieuHVS",
						int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel,
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setTongSoTruongHoc", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel,
					tongSoTruongHoc);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setSoTruongHocHVS", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, soTruongHocHVS);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setTongSoTramYTe", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, tongSoTramYTe);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setSoTramYTeHVS", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, soTramYTeHVS);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeTruongHocHVS", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel,
					tiLeTruongHocHVS);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeTramYTeHVS", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, tiLeTramYTeHVS);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setKetLuanVSTX", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, ketLuanVSTX);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, ghiChu);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setBaoCaoDLI", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, baoCaoDLI);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, ngayTao);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, idNguoiTao);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setDangKyVSTX", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel, dangKyVSTX);
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

		if (_danhGiaVeSinhXaNewFakeRemoteModel != null) {
			try {
				Class<?> clazz = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNhaTieuHVSMoi", int.class);

				method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel,
					soNhaTieuHVSMoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDanhGiaVeSinhXaNewFakeRemoteModel() {
		return _danhGiaVeSinhXaNewFakeRemoteModel;
	}

	public void setDanhGiaVeSinhXaNewFakeRemoteModel(
		BaseModel<?> danhGiaVeSinhXaNewFakeRemoteModel) {
		_danhGiaVeSinhXaNewFakeRemoteModel = danhGiaVeSinhXaNewFakeRemoteModel;
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

		Class<?> remoteModelClass = _danhGiaVeSinhXaNewFakeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_danhGiaVeSinhXaNewFakeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DanhGiaVeSinhXaNewFakeLocalServiceUtil.addDanhGiaVeSinhXaNewFake(this);
		}
		else {
			DanhGiaVeSinhXaNewFakeLocalServiceUtil.updateDanhGiaVeSinhXaNewFake(this);
		}
	}

	@Override
	public DanhGiaVeSinhXaNewFake toEscapedModel() {
		return (DanhGiaVeSinhXaNewFake)ProxyUtil.newProxyInstance(DanhGiaVeSinhXaNewFake.class.getClassLoader(),
			new Class[] { DanhGiaVeSinhXaNewFake.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DanhGiaVeSinhXaNewFakeClp clone = new DanhGiaVeSinhXaNewFakeClp();

		clone.setId(getId());
		clone.setMaTinh(getMaTinh());
		clone.setMaHuyen(getMaHuyen());
		clone.setMaXa(getMaXa());
		clone.setMaTinhStr(getMaTinhStr());
		clone.setMaHuyenStr(getMaHuyenStr());
		clone.setMaXaStr(getMaXaStr());
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
		clone.setDangKyVSTX(getDangKyVSTX());
		clone.setSoNhaTieuHVSMoi(getSoNhaTieuHVSMoi());

		return clone;
	}

	@Override
	public int compareTo(DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake) {
		int value = 0;

		if (getId() < danhGiaVeSinhXaNewFake.getId()) {
			value = -1;
		}
		else if (getId() > danhGiaVeSinhXaNewFake.getId()) {
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

		if (!(obj instanceof DanhGiaVeSinhXaNewFakeClp)) {
			return false;
		}

		DanhGiaVeSinhXaNewFakeClp danhGiaVeSinhXaNewFake = (DanhGiaVeSinhXaNewFakeClp)obj;

		int primaryKey = danhGiaVeSinhXaNewFake.getPrimaryKey();

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
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maTinh=");
		sb.append(getMaTinh());
		sb.append(", maHuyen=");
		sb.append(getMaHuyen());
		sb.append(", maXa=");
		sb.append(getMaXa());
		sb.append(", maTinhStr=");
		sb.append(getMaTinhStr());
		sb.append(", maHuyenStr=");
		sb.append(getMaHuyenStr());
		sb.append(", maXaStr=");
		sb.append(getMaXaStr());
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
		sb.append(", dangKyVSTX=");
		sb.append(getDangKyVSTX());
		sb.append(", soNhaTieuHVSMoi=");
		sb.append(getSoNhaTieuHVSMoi());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(88);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake");
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
			"<column><column-name>maTinhStr</column-name><column-value><![CDATA[");
		sb.append(getMaTinhStr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maHuyenStr</column-name><column-value><![CDATA[");
		sb.append(getMaHuyenStr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maXaStr</column-name><column-value><![CDATA[");
		sb.append(getMaXaStr());
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
		sb.append(
			"<column><column-name>dangKyVSTX</column-name><column-value><![CDATA[");
		sb.append(getDangKyVSTX());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNhaTieuHVSMoi</column-name><column-value><![CDATA[");
		sb.append(getSoNhaTieuHVSMoi());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _maTinhStr;
	private String _maHuyenStr;
	private String _maXaStr;
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
	private int _dangKyVSTX;
	private int _soNhaTieuHVSMoi;
	private BaseModel<?> _danhGiaVeSinhXaNewFakeRemoteModel;
}