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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author HANT
 * @generated
 */
public class KiemDemVienSoap implements Serializable {
	public static KiemDemVienSoap toSoapModel(KiemDemVien model) {
		KiemDemVienSoap soapModel = new KiemDemVienSoap();

		soapModel.setId(model.getId());
		soapModel.setHoVaTen(model.getHoVaTen());
		soapModel.setTaiKhoan(model.getTaiKhoan());
		soapModel.setMatKhau(model.getMatKhau());
		soapModel.setCapHoatDong(model.getCapHoatDong());
		soapModel.setOrgCode1(model.getOrgCode1());
		soapModel.setOrgCode2(model.getOrgCode2());
		soapModel.setDiaChi(model.getDiaChi());
		soapModel.setChungMinhThu(model.getChungMinhThu());
		soapModel.setDienThoai(model.getDienThoai());
		soapModel.setImei(model.getImei());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());
		soapModel.setIdQuanLy(model.getIdQuanLy());
		soapModel.setNameQuanLy(model.getNameQuanLy());

		return soapModel;
	}

	public static KiemDemVienSoap[] toSoapModels(KiemDemVien[] models) {
		KiemDemVienSoap[] soapModels = new KiemDemVienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KiemDemVienSoap[][] toSoapModels(KiemDemVien[][] models) {
		KiemDemVienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KiemDemVienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KiemDemVienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KiemDemVienSoap[] toSoapModels(List<KiemDemVien> models) {
		List<KiemDemVienSoap> soapModels = new ArrayList<KiemDemVienSoap>(models.size());

		for (KiemDemVien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KiemDemVienSoap[soapModels.size()]);
	}

	public KiemDemVienSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getHoVaTen() {
		return _hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		_hoVaTen = hoVaTen;
	}

	public String getTaiKhoan() {
		return _taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		_taiKhoan = taiKhoan;
	}

	public String getMatKhau() {
		return _matKhau;
	}

	public void setMatKhau(String matKhau) {
		_matKhau = matKhau;
	}

	public long getCapHoatDong() {
		return _capHoatDong;
	}

	public void setCapHoatDong(long capHoatDong) {
		_capHoatDong = capHoatDong;
	}

	public String getOrgCode1() {
		return _orgCode1;
	}

	public void setOrgCode1(String orgCode1) {
		_orgCode1 = orgCode1;
	}

	public String getOrgCode2() {
		return _orgCode2;
	}

	public void setOrgCode2(String orgCode2) {
		_orgCode2 = orgCode2;
	}

	public String getDiaChi() {
		return _diaChi;
	}

	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;
	}

	public String getChungMinhThu() {
		return _chungMinhThu;
	}

	public void setChungMinhThu(String chungMinhThu) {
		_chungMinhThu = chungMinhThu;
	}

	public String getDienThoai() {
		return _dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		_dienThoai = dienThoai;
	}

	public String getImei() {
		return _imei;
	}

	public void setImei(String imei) {
		_imei = imei;
	}

	public long getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(long trangThai) {
		_trangThai = trangThai;
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	public long getIdNguoiTao() {
		return _idNguoiTao;
	}

	public void setIdNguoiTao(long idNguoiTao) {
		_idNguoiTao = idNguoiTao;
	}

	public long getIdQuanLy() {
		return _idQuanLy;
	}

	public void setIdQuanLy(long idQuanLy) {
		_idQuanLy = idQuanLy;
	}

	public String getNameQuanLy() {
		return _nameQuanLy;
	}

	public void setNameQuanLy(String nameQuanLy) {
		_nameQuanLy = nameQuanLy;
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
}