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
import vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author khoa.vu
 */
public class TramCapNuocClp extends BaseModelImpl<TramCapNuoc>
	implements TramCapNuoc {
	public TramCapNuocClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TramCapNuoc.class;
	}

	@Override
	public String getModelClassName() {
		return TramCapNuoc.class.getName();
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
		attributes.put("maTram", getMaTram());
		attributes.put("tenTram", getTenTram());
		attributes.put("maTinh", getMaTinh());
		attributes.put("tenTinh", getTenTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("tenHuyen", getTenHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("tenXa", getTenXa());
		attributes.put("diaChi", getDiaChi());
		attributes.put("kinhDo", getKinhDo());
		attributes.put("viDo", getViDo());
		attributes.put("loaiHinh", getLoaiHinh());
		attributes.put("maMoHinh", getMaMoHinh());
		attributes.put("tenMoHinh", getTenMoHinh());
		attributes.put("congXuatThietKe", getCongXuatThietKe());
		attributes.put("tongDauNoiThietKe", getTongDauNoiThietKe());
		attributes.put("soNguoiCapThietKe", getSoNguoiCapThietKe());
		attributes.put("tinhTrangDuAn", getTinhTrangDuAn());
		attributes.put("tienDoXayDung", getTienDoXayDung());
		attributes.put("namXayDung", getNamXayDung());
		attributes.put("namHoanThanh", getNamHoanThanh());
		attributes.put("ngayVanHanh", getNgayVanHanh());
		attributes.put("boMayVanHanh", getBoMayVanHanh());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("idNguoiDanhGia", getIdNguoiDanhGia());
		attributes.put("ngayDanhGia", getNgayDanhGia());
		attributes.put("trangThaiCapNuoc", getTrangThaiCapNuoc());
		attributes.put("congXuatThucTe", getCongXuatThucTe());
		attributes.put("tongDauNoiThucTe", getTongDauNoiThucTe());
		attributes.put("soNguoiCapThucTe", getSoNguoiCapThucTe());
		attributes.put("tongChiPhi", getTongChiPhi());
		attributes.put("tongDoanhThu", getTongDoanhThu());
		attributes.put("nuocDatTieuChuan", getNuocDatTieuChuan());
		attributes.put("nuocCoAsen", getNuocCoAsen());
		attributes.put("nuocThatThoat", getNuocThatThoat());
		attributes.put("trangThaiDanhGia", getTrangThaiDanhGia());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTram = (String)attributes.get("maTram");

		if (maTram != null) {
			setMaTram(maTram);
		}

		String tenTram = (String)attributes.get("tenTram");

		if (tenTram != null) {
			setTenTram(tenTram);
		}

		String maTinh = (String)attributes.get("maTinh");

		if (maTinh != null) {
			setMaTinh(maTinh);
		}

		String tenTinh = (String)attributes.get("tenTinh");

		if (tenTinh != null) {
			setTenTinh(tenTinh);
		}

		String maHuyen = (String)attributes.get("maHuyen");

		if (maHuyen != null) {
			setMaHuyen(maHuyen);
		}

		String tenHuyen = (String)attributes.get("tenHuyen");

		if (tenHuyen != null) {
			setTenHuyen(tenHuyen);
		}

		String maXa = (String)attributes.get("maXa");

		if (maXa != null) {
			setMaXa(maXa);
		}

		String tenXa = (String)attributes.get("tenXa");

		if (tenXa != null) {
			setTenXa(tenXa);
		}

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		String kinhDo = (String)attributes.get("kinhDo");

		if (kinhDo != null) {
			setKinhDo(kinhDo);
		}

		String viDo = (String)attributes.get("viDo");

		if (viDo != null) {
			setViDo(viDo);
		}

		Integer loaiHinh = (Integer)attributes.get("loaiHinh");

		if (loaiHinh != null) {
			setLoaiHinh(loaiHinh);
		}

		String maMoHinh = (String)attributes.get("maMoHinh");

		if (maMoHinh != null) {
			setMaMoHinh(maMoHinh);
		}

		String tenMoHinh = (String)attributes.get("tenMoHinh");

		if (tenMoHinh != null) {
			setTenMoHinh(tenMoHinh);
		}

		Integer congXuatThietKe = (Integer)attributes.get("congXuatThietKe");

		if (congXuatThietKe != null) {
			setCongXuatThietKe(congXuatThietKe);
		}

		Integer tongDauNoiThietKe = (Integer)attributes.get("tongDauNoiThietKe");

		if (tongDauNoiThietKe != null) {
			setTongDauNoiThietKe(tongDauNoiThietKe);
		}

		Integer soNguoiCapThietKe = (Integer)attributes.get("soNguoiCapThietKe");

		if (soNguoiCapThietKe != null) {
			setSoNguoiCapThietKe(soNguoiCapThietKe);
		}

		Integer tinhTrangDuAn = (Integer)attributes.get("tinhTrangDuAn");

		if (tinhTrangDuAn != null) {
			setTinhTrangDuAn(tinhTrangDuAn);
		}

		Integer tienDoXayDung = (Integer)attributes.get("tienDoXayDung");

		if (tienDoXayDung != null) {
			setTienDoXayDung(tienDoXayDung);
		}

		Integer namXayDung = (Integer)attributes.get("namXayDung");

		if (namXayDung != null) {
			setNamXayDung(namXayDung);
		}

		Integer namHoanThanh = (Integer)attributes.get("namHoanThanh");

		if (namHoanThanh != null) {
			setNamHoanThanh(namHoanThanh);
		}

		Date ngayVanHanh = (Date)attributes.get("ngayVanHanh");

		if (ngayVanHanh != null) {
			setNgayVanHanh(ngayVanHanh);
		}

		Integer boMayVanHanh = (Integer)attributes.get("boMayVanHanh");

		if (boMayVanHanh != null) {
			setBoMayVanHanh(boMayVanHanh);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long idNguoiTao = (Long)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		Long idNguoiDanhGia = (Long)attributes.get("idNguoiDanhGia");

		if (idNguoiDanhGia != null) {
			setIdNguoiDanhGia(idNguoiDanhGia);
		}

		Date ngayDanhGia = (Date)attributes.get("ngayDanhGia");

		if (ngayDanhGia != null) {
			setNgayDanhGia(ngayDanhGia);
		}

		Integer trangThaiCapNuoc = (Integer)attributes.get("trangThaiCapNuoc");

		if (trangThaiCapNuoc != null) {
			setTrangThaiCapNuoc(trangThaiCapNuoc);
		}

		Integer congXuatThucTe = (Integer)attributes.get("congXuatThucTe");

		if (congXuatThucTe != null) {
			setCongXuatThucTe(congXuatThucTe);
		}

		Integer tongDauNoiThucTe = (Integer)attributes.get("tongDauNoiThucTe");

		if (tongDauNoiThucTe != null) {
			setTongDauNoiThucTe(tongDauNoiThucTe);
		}

		Integer soNguoiCapThucTe = (Integer)attributes.get("soNguoiCapThucTe");

		if (soNguoiCapThucTe != null) {
			setSoNguoiCapThucTe(soNguoiCapThucTe);
		}

		Integer tongChiPhi = (Integer)attributes.get("tongChiPhi");

		if (tongChiPhi != null) {
			setTongChiPhi(tongChiPhi);
		}

		Integer tongDoanhThu = (Integer)attributes.get("tongDoanhThu");

		if (tongDoanhThu != null) {
			setTongDoanhThu(tongDoanhThu);
		}

		Integer nuocDatTieuChuan = (Integer)attributes.get("nuocDatTieuChuan");

		if (nuocDatTieuChuan != null) {
			setNuocDatTieuChuan(nuocDatTieuChuan);
		}

		Integer nuocCoAsen = (Integer)attributes.get("nuocCoAsen");

		if (nuocCoAsen != null) {
			setNuocCoAsen(nuocCoAsen);
		}

		Integer nuocThatThoat = (Integer)attributes.get("nuocThatThoat");

		if (nuocThatThoat != null) {
			setNuocThatThoat(nuocThatThoat);
		}

		Integer trangThaiDanhGia = (Integer)attributes.get("trangThaiDanhGia");

		if (trangThaiDanhGia != null) {
			setTrangThaiDanhGia(trangThaiDanhGia);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tramCapNuocRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTram() {
		return _maTram;
	}

	@Override
	public void setMaTram(String maTram) {
		_maTram = maTram;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTram", String.class);

				method.invoke(_tramCapNuocRemoteModel, maTram);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTram() {
		return _tenTram;
	}

	@Override
	public void setTenTram(String tenTram) {
		_tenTram = tenTram;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTram", String.class);

				method.invoke(_tramCapNuocRemoteModel, tenTram);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_tramCapNuocRemoteModel, maTinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTinh() {
		return _tenTinh;
	}

	@Override
	public void setTenTinh(String tenTinh) {
		_tenTinh = tenTinh;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTinh", String.class);

				method.invoke(_tramCapNuocRemoteModel, tenTinh);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyen", String.class);

				method.invoke(_tramCapNuocRemoteModel, maHuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenHuyen() {
		return _tenHuyen;
	}

	@Override
	public void setTenHuyen(String tenHuyen) {
		_tenHuyen = tenHuyen;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTenHuyen", String.class);

				method.invoke(_tramCapNuocRemoteModel, tenHuyen);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMaXa", String.class);

				method.invoke(_tramCapNuocRemoteModel, maXa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenXa() {
		return _tenXa;
	}

	@Override
	public void setTenXa(String tenXa) {
		_tenXa = tenXa;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTenXa", String.class);

				method.invoke(_tramCapNuocRemoteModel, tenXa);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_tramCapNuocRemoteModel, diaChi);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setKinhDo", String.class);

				method.invoke(_tramCapNuocRemoteModel, kinhDo);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setViDo", String.class);

				method.invoke(_tramCapNuocRemoteModel, viDo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoaiHinh() {
		return _loaiHinh;
	}

	@Override
	public void setLoaiHinh(int loaiHinh) {
		_loaiHinh = loaiHinh;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHinh", int.class);

				method.invoke(_tramCapNuocRemoteModel, loaiHinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaMoHinh() {
		return _maMoHinh;
	}

	@Override
	public void setMaMoHinh(String maMoHinh) {
		_maMoHinh = maMoHinh;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMaMoHinh", String.class);

				method.invoke(_tramCapNuocRemoteModel, maMoHinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenMoHinh() {
		return _tenMoHinh;
	}

	@Override
	public void setTenMoHinh(String tenMoHinh) {
		_tenMoHinh = tenMoHinh;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTenMoHinh", String.class);

				method.invoke(_tramCapNuocRemoteModel, tenMoHinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCongXuatThietKe() {
		return _congXuatThietKe;
	}

	@Override
	public void setCongXuatThietKe(int congXuatThietKe) {
		_congXuatThietKe = congXuatThietKe;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setCongXuatThietKe", int.class);

				method.invoke(_tramCapNuocRemoteModel, congXuatThietKe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTongDauNoiThietKe() {
		return _tongDauNoiThietKe;
	}

	@Override
	public void setTongDauNoiThietKe(int tongDauNoiThietKe) {
		_tongDauNoiThietKe = tongDauNoiThietKe;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTongDauNoiThietKe",
						int.class);

				method.invoke(_tramCapNuocRemoteModel, tongDauNoiThietKe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNguoiCapThietKe() {
		return _soNguoiCapThietKe;
	}

	@Override
	public void setSoNguoiCapThietKe(int soNguoiCapThietKe) {
		_soNguoiCapThietKe = soNguoiCapThietKe;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNguoiCapThietKe",
						int.class);

				method.invoke(_tramCapNuocRemoteModel, soNguoiCapThietKe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTinhTrangDuAn() {
		return _tinhTrangDuAn;
	}

	@Override
	public void setTinhTrangDuAn(int tinhTrangDuAn) {
		_tinhTrangDuAn = tinhTrangDuAn;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhTrangDuAn", int.class);

				method.invoke(_tramCapNuocRemoteModel, tinhTrangDuAn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTienDoXayDung() {
		return _tienDoXayDung;
	}

	@Override
	public void setTienDoXayDung(int tienDoXayDung) {
		_tienDoXayDung = tienDoXayDung;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTienDoXayDung", int.class);

				method.invoke(_tramCapNuocRemoteModel, tienDoXayDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNamXayDung() {
		return _namXayDung;
	}

	@Override
	public void setNamXayDung(int namXayDung) {
		_namXayDung = namXayDung;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNamXayDung", int.class);

				method.invoke(_tramCapNuocRemoteModel, namXayDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNamHoanThanh() {
		return _namHoanThanh;
	}

	@Override
	public void setNamHoanThanh(int namHoanThanh) {
		_namHoanThanh = namHoanThanh;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNamHoanThanh", int.class);

				method.invoke(_tramCapNuocRemoteModel, namHoanThanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayVanHanh() {
		return _ngayVanHanh;
	}

	@Override
	public void setNgayVanHanh(Date ngayVanHanh) {
		_ngayVanHanh = ngayVanHanh;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayVanHanh", Date.class);

				method.invoke(_tramCapNuocRemoteModel, ngayVanHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBoMayVanHanh() {
		return _boMayVanHanh;
	}

	@Override
	public void setBoMayVanHanh(int boMayVanHanh) {
		_boMayVanHanh = boMayVanHanh;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setBoMayVanHanh", int.class);

				method.invoke(_tramCapNuocRemoteModel, boMayVanHanh);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_tramCapNuocRemoteModel, ghiChu);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_tramCapNuocRemoteModel, ngayTao);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", long.class);

				method.invoke(_tramCapNuocRemoteModel, idNguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIdNguoiDanhGia() {
		return _idNguoiDanhGia;
	}

	@Override
	public void setIdNguoiDanhGia(long idNguoiDanhGia) {
		_idNguoiDanhGia = idNguoiDanhGia;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiDanhGia", long.class);

				method.invoke(_tramCapNuocRemoteModel, idNguoiDanhGia);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDanhGia", Date.class);

				method.invoke(_tramCapNuocRemoteModel, ngayDanhGia);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiCapNuoc", int.class);

				method.invoke(_tramCapNuocRemoteModel, trangThaiCapNuoc);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setCongXuatThucTe", int.class);

				method.invoke(_tramCapNuocRemoteModel, congXuatThucTe);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTongDauNoiThucTe", int.class);

				method.invoke(_tramCapNuocRemoteModel, tongDauNoiThucTe);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNguoiCapThucTe", int.class);

				method.invoke(_tramCapNuocRemoteModel, soNguoiCapThucTe);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTongChiPhi", int.class);

				method.invoke(_tramCapNuocRemoteModel, tongChiPhi);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTongDoanhThu", int.class);

				method.invoke(_tramCapNuocRemoteModel, tongDoanhThu);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocDatTieuChuan", int.class);

				method.invoke(_tramCapNuocRemoteModel, nuocDatTieuChuan);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocCoAsen", int.class);

				method.invoke(_tramCapNuocRemoteModel, nuocCoAsen);
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

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocThatThoat", int.class);

				method.invoke(_tramCapNuocRemoteModel, nuocThatThoat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTrangThaiDanhGia() {
		return _trangThaiDanhGia;
	}

	@Override
	public void setTrangThaiDanhGia(int trangThaiDanhGia) {
		_trangThaiDanhGia = trangThaiDanhGia;

		if (_tramCapNuocRemoteModel != null) {
			try {
				Class<?> clazz = _tramCapNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiDanhGia", int.class);

				method.invoke(_tramCapNuocRemoteModel, trangThaiDanhGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTramCapNuocRemoteModel() {
		return _tramCapNuocRemoteModel;
	}

	public void setTramCapNuocRemoteModel(BaseModel<?> tramCapNuocRemoteModel) {
		_tramCapNuocRemoteModel = tramCapNuocRemoteModel;
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

		Class<?> remoteModelClass = _tramCapNuocRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tramCapNuocRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TramCapNuocLocalServiceUtil.addTramCapNuoc(this);
		}
		else {
			TramCapNuocLocalServiceUtil.updateTramCapNuoc(this);
		}
	}

	@Override
	public TramCapNuoc toEscapedModel() {
		return (TramCapNuoc)ProxyUtil.newProxyInstance(TramCapNuoc.class.getClassLoader(),
			new Class[] { TramCapNuoc.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TramCapNuocClp clone = new TramCapNuocClp();

		clone.setId(getId());
		clone.setMaTram(getMaTram());
		clone.setTenTram(getTenTram());
		clone.setMaTinh(getMaTinh());
		clone.setTenTinh(getTenTinh());
		clone.setMaHuyen(getMaHuyen());
		clone.setTenHuyen(getTenHuyen());
		clone.setMaXa(getMaXa());
		clone.setTenXa(getTenXa());
		clone.setDiaChi(getDiaChi());
		clone.setKinhDo(getKinhDo());
		clone.setViDo(getViDo());
		clone.setLoaiHinh(getLoaiHinh());
		clone.setMaMoHinh(getMaMoHinh());
		clone.setTenMoHinh(getTenMoHinh());
		clone.setCongXuatThietKe(getCongXuatThietKe());
		clone.setTongDauNoiThietKe(getTongDauNoiThietKe());
		clone.setSoNguoiCapThietKe(getSoNguoiCapThietKe());
		clone.setTinhTrangDuAn(getTinhTrangDuAn());
		clone.setTienDoXayDung(getTienDoXayDung());
		clone.setNamXayDung(getNamXayDung());
		clone.setNamHoanThanh(getNamHoanThanh());
		clone.setNgayVanHanh(getNgayVanHanh());
		clone.setBoMayVanHanh(getBoMayVanHanh());
		clone.setGhiChu(getGhiChu());
		clone.setNgayTao(getNgayTao());
		clone.setIdNguoiTao(getIdNguoiTao());
		clone.setIdNguoiDanhGia(getIdNguoiDanhGia());
		clone.setNgayDanhGia(getNgayDanhGia());
		clone.setTrangThaiCapNuoc(getTrangThaiCapNuoc());
		clone.setCongXuatThucTe(getCongXuatThucTe());
		clone.setTongDauNoiThucTe(getTongDauNoiThucTe());
		clone.setSoNguoiCapThucTe(getSoNguoiCapThucTe());
		clone.setTongChiPhi(getTongChiPhi());
		clone.setTongDoanhThu(getTongDoanhThu());
		clone.setNuocDatTieuChuan(getNuocDatTieuChuan());
		clone.setNuocCoAsen(getNuocCoAsen());
		clone.setNuocThatThoat(getNuocThatThoat());
		clone.setTrangThaiDanhGia(getTrangThaiDanhGia());

		return clone;
	}

	@Override
	public int compareTo(TramCapNuoc tramCapNuoc) {
		int value = 0;

		value = getTenTram().compareTo(tramCapNuoc.getTenTram());

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

		if (!(obj instanceof TramCapNuocClp)) {
			return false;
		}

		TramCapNuocClp tramCapNuoc = (TramCapNuocClp)obj;

		long primaryKey = tramCapNuoc.getPrimaryKey();

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
		StringBundler sb = new StringBundler(79);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maTram=");
		sb.append(getMaTram());
		sb.append(", tenTram=");
		sb.append(getTenTram());
		sb.append(", maTinh=");
		sb.append(getMaTinh());
		sb.append(", tenTinh=");
		sb.append(getTenTinh());
		sb.append(", maHuyen=");
		sb.append(getMaHuyen());
		sb.append(", tenHuyen=");
		sb.append(getTenHuyen());
		sb.append(", maXa=");
		sb.append(getMaXa());
		sb.append(", tenXa=");
		sb.append(getTenXa());
		sb.append(", diaChi=");
		sb.append(getDiaChi());
		sb.append(", kinhDo=");
		sb.append(getKinhDo());
		sb.append(", viDo=");
		sb.append(getViDo());
		sb.append(", loaiHinh=");
		sb.append(getLoaiHinh());
		sb.append(", maMoHinh=");
		sb.append(getMaMoHinh());
		sb.append(", tenMoHinh=");
		sb.append(getTenMoHinh());
		sb.append(", congXuatThietKe=");
		sb.append(getCongXuatThietKe());
		sb.append(", tongDauNoiThietKe=");
		sb.append(getTongDauNoiThietKe());
		sb.append(", soNguoiCapThietKe=");
		sb.append(getSoNguoiCapThietKe());
		sb.append(", tinhTrangDuAn=");
		sb.append(getTinhTrangDuAn());
		sb.append(", tienDoXayDung=");
		sb.append(getTienDoXayDung());
		sb.append(", namXayDung=");
		sb.append(getNamXayDung());
		sb.append(", namHoanThanh=");
		sb.append(getNamHoanThanh());
		sb.append(", ngayVanHanh=");
		sb.append(getNgayVanHanh());
		sb.append(", boMayVanHanh=");
		sb.append(getBoMayVanHanh());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", idNguoiTao=");
		sb.append(getIdNguoiTao());
		sb.append(", idNguoiDanhGia=");
		sb.append(getIdNguoiDanhGia());
		sb.append(", ngayDanhGia=");
		sb.append(getNgayDanhGia());
		sb.append(", trangThaiCapNuoc=");
		sb.append(getTrangThaiCapNuoc());
		sb.append(", congXuatThucTe=");
		sb.append(getCongXuatThucTe());
		sb.append(", tongDauNoiThucTe=");
		sb.append(getTongDauNoiThucTe());
		sb.append(", soNguoiCapThucTe=");
		sb.append(getSoNguoiCapThucTe());
		sb.append(", tongChiPhi=");
		sb.append(getTongChiPhi());
		sb.append(", tongDoanhThu=");
		sb.append(getTongDoanhThu());
		sb.append(", nuocDatTieuChuan=");
		sb.append(getNuocDatTieuChuan());
		sb.append(", nuocCoAsen=");
		sb.append(getNuocCoAsen());
		sb.append(", nuocThatThoat=");
		sb.append(getNuocThatThoat());
		sb.append(", trangThaiDanhGia=");
		sb.append(getTrangThaiDanhGia());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(121);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTram</column-name><column-value><![CDATA[");
		sb.append(getMaTram());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTram</column-name><column-value><![CDATA[");
		sb.append(getTenTram());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTinh</column-name><column-value><![CDATA[");
		sb.append(getMaTinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTinh</column-name><column-value><![CDATA[");
		sb.append(getTenTinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maHuyen</column-name><column-value><![CDATA[");
		sb.append(getMaHuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenHuyen</column-name><column-value><![CDATA[");
		sb.append(getTenHuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maXa</column-name><column-value><![CDATA[");
		sb.append(getMaXa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenXa</column-name><column-value><![CDATA[");
		sb.append(getTenXa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChi</column-name><column-value><![CDATA[");
		sb.append(getDiaChi());
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
			"<column><column-name>loaiHinh</column-name><column-value><![CDATA[");
		sb.append(getLoaiHinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maMoHinh</column-name><column-value><![CDATA[");
		sb.append(getMaMoHinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenMoHinh</column-name><column-value><![CDATA[");
		sb.append(getTenMoHinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>congXuatThietKe</column-name><column-value><![CDATA[");
		sb.append(getCongXuatThietKe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongDauNoiThietKe</column-name><column-value><![CDATA[");
		sb.append(getTongDauNoiThietKe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNguoiCapThietKe</column-name><column-value><![CDATA[");
		sb.append(getSoNguoiCapThietKe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tinhTrangDuAn</column-name><column-value><![CDATA[");
		sb.append(getTinhTrangDuAn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tienDoXayDung</column-name><column-value><![CDATA[");
		sb.append(getTienDoXayDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namXayDung</column-name><column-value><![CDATA[");
		sb.append(getNamXayDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namHoanThanh</column-name><column-value><![CDATA[");
		sb.append(getNamHoanThanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayVanHanh</column-name><column-value><![CDATA[");
		sb.append(getNgayVanHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>boMayVanHanh</column-name><column-value><![CDATA[");
		sb.append(getBoMayVanHanh());
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
			"<column><column-name>idNguoiDanhGia</column-name><column-value><![CDATA[");
		sb.append(getIdNguoiDanhGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayDanhGia</column-name><column-value><![CDATA[");
		sb.append(getNgayDanhGia());
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
			"<column><column-name>tongDauNoiThucTe</column-name><column-value><![CDATA[");
		sb.append(getTongDauNoiThucTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNguoiCapThucTe</column-name><column-value><![CDATA[");
		sb.append(getSoNguoiCapThucTe());
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
			"<column><column-name>nuocDatTieuChuan</column-name><column-value><![CDATA[");
		sb.append(getNuocDatTieuChuan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nuocCoAsen</column-name><column-value><![CDATA[");
		sb.append(getNuocCoAsen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nuocThatThoat</column-name><column-value><![CDATA[");
		sb.append(getNuocThatThoat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiDanhGia</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiDanhGia());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maTram;
	private String _tenTram;
	private String _maTinh;
	private String _tenTinh;
	private String _maHuyen;
	private String _tenHuyen;
	private String _maXa;
	private String _tenXa;
	private String _diaChi;
	private String _kinhDo;
	private String _viDo;
	private int _loaiHinh;
	private String _maMoHinh;
	private String _tenMoHinh;
	private int _congXuatThietKe;
	private int _tongDauNoiThietKe;
	private int _soNguoiCapThietKe;
	private int _tinhTrangDuAn;
	private int _tienDoXayDung;
	private int _namXayDung;
	private int _namHoanThanh;
	private Date _ngayVanHanh;
	private int _boMayVanHanh;
	private String _ghiChu;
	private Date _ngayTao;
	private long _idNguoiTao;
	private long _idNguoiDanhGia;
	private Date _ngayDanhGia;
	private int _trangThaiCapNuoc;
	private int _congXuatThucTe;
	private int _tongDauNoiThucTe;
	private int _soNguoiCapThucTe;
	private int _tongChiPhi;
	private int _tongDoanhThu;
	private int _nuocDatTieuChuan;
	private int _nuocCoAsen;
	private int _nuocThatThoat;
	private int _trangThaiDanhGia;
	private BaseModel<?> _tramCapNuocRemoteModel;
}