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
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author BinhTH
 */
public class VeSinhGiaDinhClp extends BaseModelImpl<VeSinhGiaDinh>
	implements VeSinhGiaDinh {
	public VeSinhGiaDinhClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return VeSinhGiaDinh.class;
	}

	@Override
	public String getModelClassName() {
		return VeSinhGiaDinh.class.getName();
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
		attributes.put("thonXom", getThonXom());
		attributes.put("tenChuHo", getTenChuHo());
		attributes.put("gioiTinhChuHo", getGioiTinhChuHo());
		attributes.put("trangThai", getTrangThai());
		attributes.put("mauNgauNhien", getMauNgauNhien());
		attributes.put("namBaoCao", getNamBaoCao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("soNguoiTrongHo", getSoNguoiTrongHo());
		attributes.put("thanhPhanHoGD", getThanhPhanHoGD());
		attributes.put("kinhDo", getKinhDo());
		attributes.put("viDo", getViDo());
		attributes.put("coNhaTieu", getCoNhaTieu());
		attributes.put("nhaTieuHVS", getNhaTieuHVS());
		attributes.put("loaiNhaTieu", getLoaiNhaTieu());
		attributes.put("duocCaiTao", getDuocCaiTao());
		attributes.put("thangXayDung", getThangXayDung());
		attributes.put("namXayDung", getNamXayDung());
		attributes.put("nguonVon", getNguonVon());
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

		String thonXom = (String)attributes.get("thonXom");

		if (thonXom != null) {
			setThonXom(thonXom);
		}

		String tenChuHo = (String)attributes.get("tenChuHo");

		if (tenChuHo != null) {
			setTenChuHo(tenChuHo);
		}

		Integer gioiTinhChuHo = (Integer)attributes.get("gioiTinhChuHo");

		if (gioiTinhChuHo != null) {
			setGioiTinhChuHo(gioiTinhChuHo);
		}

		Integer trangThai = (Integer)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer mauNgauNhien = (Integer)attributes.get("mauNgauNhien");

		if (mauNgauNhien != null) {
			setMauNgauNhien(mauNgauNhien);
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

		Integer idNguoiTao = (Integer)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		Integer soNguoiTrongHo = (Integer)attributes.get("soNguoiTrongHo");

		if (soNguoiTrongHo != null) {
			setSoNguoiTrongHo(soNguoiTrongHo);
		}

		Integer thanhPhanHoGD = (Integer)attributes.get("thanhPhanHoGD");

		if (thanhPhanHoGD != null) {
			setThanhPhanHoGD(thanhPhanHoGD);
		}

		String kinhDo = (String)attributes.get("kinhDo");

		if (kinhDo != null) {
			setKinhDo(kinhDo);
		}

		String viDo = (String)attributes.get("viDo");

		if (viDo != null) {
			setViDo(viDo);
		}

		Integer coNhaTieu = (Integer)attributes.get("coNhaTieu");

		if (coNhaTieu != null) {
			setCoNhaTieu(coNhaTieu);
		}

		Integer nhaTieuHVS = (Integer)attributes.get("nhaTieuHVS");

		if (nhaTieuHVS != null) {
			setNhaTieuHVS(nhaTieuHVS);
		}

		String loaiNhaTieu = (String)attributes.get("loaiNhaTieu");

		if (loaiNhaTieu != null) {
			setLoaiNhaTieu(loaiNhaTieu);
		}

		Integer duocCaiTao = (Integer)attributes.get("duocCaiTao");

		if (duocCaiTao != null) {
			setDuocCaiTao(duocCaiTao);
		}

		Integer thangXayDung = (Integer)attributes.get("thangXayDung");

		if (thangXayDung != null) {
			setThangXayDung(thangXayDung);
		}

		Integer namXayDung = (Integer)attributes.get("namXayDung");

		if (namXayDung != null) {
			setNamXayDung(namXayDung);
		}

		Integer nguonVon = (Integer)attributes.get("nguonVon");

		if (nguonVon != null) {
			setNguonVon(nguonVon);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, id);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_veSinhGiaDinhRemoteModel, maTinh);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyen", String.class);

				method.invoke(_veSinhGiaDinhRemoteModel, maHuyen);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMaXa", String.class);

				method.invoke(_veSinhGiaDinhRemoteModel, maXa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThonXom() {
		return _thonXom;
	}

	@Override
	public void setThonXom(String thonXom) {
		_thonXom = thonXom;

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setThonXom", String.class);

				method.invoke(_veSinhGiaDinhRemoteModel, thonXom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenChuHo() {
		return _tenChuHo;
	}

	@Override
	public void setTenChuHo(String tenChuHo) {
		_tenChuHo = tenChuHo;

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChuHo", String.class);

				method.invoke(_veSinhGiaDinhRemoteModel, tenChuHo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGioiTinhChuHo() {
		return _gioiTinhChuHo;
	}

	@Override
	public void setGioiTinhChuHo(int gioiTinhChuHo) {
		_gioiTinhChuHo = gioiTinhChuHo;

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinhChuHo", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, gioiTinhChuHo);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMauNgauNhien() {
		return _mauNgauNhien;
	}

	@Override
	public void setMauNgauNhien(int mauNgauNhien) {
		_mauNgauNhien = mauNgauNhien;

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMauNgauNhien", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, mauNgauNhien);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNamBaoCao", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, namBaoCao);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_veSinhGiaDinhRemoteModel, ghiChu);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_veSinhGiaDinhRemoteModel, ngayTao);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, idNguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNguoiTrongHo() {
		return _soNguoiTrongHo;
	}

	@Override
	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		_soNguoiTrongHo = soNguoiTrongHo;

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNguoiTrongHo", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, soNguoiTrongHo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThanhPhanHoGD() {
		return _thanhPhanHoGD;
	}

	@Override
	public void setThanhPhanHoGD(int thanhPhanHoGD) {
		_thanhPhanHoGD = thanhPhanHoGD;

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhPhanHoGD", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, thanhPhanHoGD);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setKinhDo", String.class);

				method.invoke(_veSinhGiaDinhRemoteModel, kinhDo);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setViDo", String.class);

				method.invoke(_veSinhGiaDinhRemoteModel, viDo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCoNhaTieu() {
		return _coNhaTieu;
	}

	@Override
	public void setCoNhaTieu(int coNhaTieu) {
		_coNhaTieu = coNhaTieu;

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setCoNhaTieu", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, coNhaTieu);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNhaTieuHVS", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, nhaTieuHVS);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiNhaTieu", String.class);

				method.invoke(_veSinhGiaDinhRemoteModel, loaiNhaTieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDuocCaiTao() {
		return _duocCaiTao;
	}

	@Override
	public void setDuocCaiTao(int duocCaiTao) {
		_duocCaiTao = duocCaiTao;

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDuocCaiTao", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, duocCaiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThangXayDung() {
		return _thangXayDung;
	}

	@Override
	public void setThangXayDung(int thangXayDung) {
		_thangXayDung = thangXayDung;

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setThangXayDung", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, thangXayDung);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNamXayDung", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, namXayDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNguonVon() {
		return _nguonVon;
	}

	@Override
	public void setNguonVon(int nguonVon) {
		_nguonVon = nguonVon;

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNguonVon", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, nguonVon);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayKiemDem", Date.class);

				method.invoke(_veSinhGiaDinhRemoteModel, ngayKiemDem);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDanhGia", Date.class);

				method.invoke(_veSinhGiaDinhRemoteModel, ngayDanhGia);
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

		if (_veSinhGiaDinhRemoteModel != null) {
			try {
				Class<?> clazz = _veSinhGiaDinhRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiDanhGia", int.class);

				method.invoke(_veSinhGiaDinhRemoteModel, idNguoiDanhGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVeSinhGiaDinhRemoteModel() {
		return _veSinhGiaDinhRemoteModel;
	}

	public void setVeSinhGiaDinhRemoteModel(
		BaseModel<?> veSinhGiaDinhRemoteModel) {
		_veSinhGiaDinhRemoteModel = veSinhGiaDinhRemoteModel;
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

		Class<?> remoteModelClass = _veSinhGiaDinhRemoteModel.getClass();

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

		Object returnValue = method.invoke(_veSinhGiaDinhRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VeSinhGiaDinhLocalServiceUtil.addVeSinhGiaDinh(this);
		}
		else {
			VeSinhGiaDinhLocalServiceUtil.updateVeSinhGiaDinh(this);
		}
	}

	@Override
	public VeSinhGiaDinh toEscapedModel() {
		return (VeSinhGiaDinh)ProxyUtil.newProxyInstance(VeSinhGiaDinh.class.getClassLoader(),
			new Class[] { VeSinhGiaDinh.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VeSinhGiaDinhClp clone = new VeSinhGiaDinhClp();

		clone.setId(getId());
		clone.setMaTinh(getMaTinh());
		clone.setMaHuyen(getMaHuyen());
		clone.setMaXa(getMaXa());
		clone.setThonXom(getThonXom());
		clone.setTenChuHo(getTenChuHo());
		clone.setGioiTinhChuHo(getGioiTinhChuHo());
		clone.setTrangThai(getTrangThai());
		clone.setMauNgauNhien(getMauNgauNhien());
		clone.setNamBaoCao(getNamBaoCao());
		clone.setGhiChu(getGhiChu());
		clone.setNgayTao(getNgayTao());
		clone.setIdNguoiTao(getIdNguoiTao());
		clone.setSoNguoiTrongHo(getSoNguoiTrongHo());
		clone.setThanhPhanHoGD(getThanhPhanHoGD());
		clone.setKinhDo(getKinhDo());
		clone.setViDo(getViDo());
		clone.setCoNhaTieu(getCoNhaTieu());
		clone.setNhaTieuHVS(getNhaTieuHVS());
		clone.setLoaiNhaTieu(getLoaiNhaTieu());
		clone.setDuocCaiTao(getDuocCaiTao());
		clone.setThangXayDung(getThangXayDung());
		clone.setNamXayDung(getNamXayDung());
		clone.setNguonVon(getNguonVon());
		clone.setNgayKiemDem(getNgayKiemDem());
		clone.setNgayDanhGia(getNgayDanhGia());
		clone.setIdNguoiDanhGia(getIdNguoiDanhGia());

		return clone;
	}

	@Override
	public int compareTo(VeSinhGiaDinh veSinhGiaDinh) {
		int value = 0;

		value = getMaTinh().compareTo(veSinhGiaDinh.getMaTinh());

		if (value != 0) {
			return value;
		}

		value = getMaHuyen().compareTo(veSinhGiaDinh.getMaHuyen());

		if (value != 0) {
			return value;
		}

		value = getMaXa().compareTo(veSinhGiaDinh.getMaXa());

		if (value != 0) {
			return value;
		}

		value = getThonXom().compareTo(veSinhGiaDinh.getThonXom());

		if (value != 0) {
			return value;
		}

		value = getLoaiNhaTieu().compareTo(veSinhGiaDinh.getLoaiNhaTieu());

		if (value != 0) {
			return value;
		}

		value = getTenChuHo().compareTo(veSinhGiaDinh.getTenChuHo());

		if (value != 0) {
			return value;
		}

		if (getTrangThai() < veSinhGiaDinh.getTrangThai()) {
			value = -1;
		}
		else if (getTrangThai() > veSinhGiaDinh.getTrangThai()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (getNamBaoCao() < veSinhGiaDinh.getNamBaoCao()) {
			value = -1;
		}
		else if (getNamBaoCao() > veSinhGiaDinh.getNamBaoCao()) {
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

		if (!(obj instanceof VeSinhGiaDinhClp)) {
			return false;
		}

		VeSinhGiaDinhClp veSinhGiaDinh = (VeSinhGiaDinhClp)obj;

		int primaryKey = veSinhGiaDinh.getPrimaryKey();

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
		StringBundler sb = new StringBundler(55);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maTinh=");
		sb.append(getMaTinh());
		sb.append(", maHuyen=");
		sb.append(getMaHuyen());
		sb.append(", maXa=");
		sb.append(getMaXa());
		sb.append(", thonXom=");
		sb.append(getThonXom());
		sb.append(", tenChuHo=");
		sb.append(getTenChuHo());
		sb.append(", gioiTinhChuHo=");
		sb.append(getGioiTinhChuHo());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", mauNgauNhien=");
		sb.append(getMauNgauNhien());
		sb.append(", namBaoCao=");
		sb.append(getNamBaoCao());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", idNguoiTao=");
		sb.append(getIdNguoiTao());
		sb.append(", soNguoiTrongHo=");
		sb.append(getSoNguoiTrongHo());
		sb.append(", thanhPhanHoGD=");
		sb.append(getThanhPhanHoGD());
		sb.append(", kinhDo=");
		sb.append(getKinhDo());
		sb.append(", viDo=");
		sb.append(getViDo());
		sb.append(", coNhaTieu=");
		sb.append(getCoNhaTieu());
		sb.append(", nhaTieuHVS=");
		sb.append(getNhaTieuHVS());
		sb.append(", loaiNhaTieu=");
		sb.append(getLoaiNhaTieu());
		sb.append(", duocCaiTao=");
		sb.append(getDuocCaiTao());
		sb.append(", thangXayDung=");
		sb.append(getThangXayDung());
		sb.append(", namXayDung=");
		sb.append(getNamXayDung());
		sb.append(", nguonVon=");
		sb.append(getNguonVon());
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
		StringBundler sb = new StringBundler(85);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh");
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
			"<column><column-name>thonXom</column-name><column-value><![CDATA[");
		sb.append(getThonXom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenChuHo</column-name><column-value><![CDATA[");
		sb.append(getTenChuHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioiTinhChuHo</column-name><column-value><![CDATA[");
		sb.append(getGioiTinhChuHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mauNgauNhien</column-name><column-value><![CDATA[");
		sb.append(getMauNgauNhien());
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
			"<column><column-name>soNguoiTrongHo</column-name><column-value><![CDATA[");
		sb.append(getSoNguoiTrongHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhPhanHoGD</column-name><column-value><![CDATA[");
		sb.append(getThanhPhanHoGD());
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
			"<column><column-name>coNhaTieu</column-name><column-value><![CDATA[");
		sb.append(getCoNhaTieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhaTieuHVS</column-name><column-value><![CDATA[");
		sb.append(getNhaTieuHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiNhaTieu</column-name><column-value><![CDATA[");
		sb.append(getLoaiNhaTieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duocCaiTao</column-name><column-value><![CDATA[");
		sb.append(getDuocCaiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thangXayDung</column-name><column-value><![CDATA[");
		sb.append(getThangXayDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namXayDung</column-name><column-value><![CDATA[");
		sb.append(getNamXayDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguonVon</column-name><column-value><![CDATA[");
		sb.append(getNguonVon());
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
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _thonXom;
	private String _tenChuHo;
	private int _gioiTinhChuHo;
	private int _trangThai;
	private int _mauNgauNhien;
	private int _namBaoCao;
	private String _ghiChu;
	private Date _ngayTao;
	private int _idNguoiTao;
	private int _soNguoiTrongHo;
	private int _thanhPhanHoGD;
	private String _kinhDo;
	private String _viDo;
	private int _coNhaTieu;
	private int _nhaTieuHVS;
	private String _loaiNhaTieu;
	private int _duocCaiTao;
	private int _thangXayDung;
	private int _namXayDung;
	private int _nguonVon;
	private Date _ngayKiemDem;
	private Date _ngayDanhGia;
	private int _idNguoiDanhGia;
	private BaseModel<?> _veSinhGiaDinhRemoteModel;
}