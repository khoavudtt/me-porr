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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author BinhTH
 * @generated
 */
public class VeSinhCongTrinhSoap implements Serializable {
	public static VeSinhCongTrinhSoap toSoapModel(VeSinhCongTrinh model) {
		VeSinhCongTrinhSoap soapModel = new VeSinhCongTrinhSoap();

		soapModel.setId(model.getId());
		soapModel.setTenCongTrinh(model.getTenCongTrinh());
		soapModel.setLoaiCongTrinh(model.getLoaiCongTrinh());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setDiaChi(model.getDiaChi());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setNamBaoCao(model.getNamBaoCao());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());
		soapModel.setKinhDo(model.getKinhDo());
		soapModel.setViDo(model.getViDo());
		soapModel.setLoaiNguonNuoc(model.getLoaiNguonNuoc());
		soapModel.setNguonNuocHVS(model.getNguonNuocHVS());
		soapModel.setLoaiNhaTieu(model.getLoaiNhaTieu());
		soapModel.setNhaTieuHVS(model.getNhaTieuHVS());
		soapModel.setKetLuanHVS(model.getKetLuanHVS());
		soapModel.setNgayKiemDem(model.getNgayKiemDem());
		soapModel.setNgayDanhGia(model.getNgayDanhGia());
		soapModel.setIdNguoiDanhGia(model.getIdNguoiDanhGia());

		return soapModel;
	}

	public static VeSinhCongTrinhSoap[] toSoapModels(VeSinhCongTrinh[] models) {
		VeSinhCongTrinhSoap[] soapModels = new VeSinhCongTrinhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VeSinhCongTrinhSoap[][] toSoapModels(
		VeSinhCongTrinh[][] models) {
		VeSinhCongTrinhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VeSinhCongTrinhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VeSinhCongTrinhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VeSinhCongTrinhSoap[] toSoapModels(
		List<VeSinhCongTrinh> models) {
		List<VeSinhCongTrinhSoap> soapModels = new ArrayList<VeSinhCongTrinhSoap>(models.size());

		for (VeSinhCongTrinh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VeSinhCongTrinhSoap[soapModels.size()]);
	}

	public VeSinhCongTrinhSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getTenCongTrinh() {
		return _tenCongTrinh;
	}

	public void setTenCongTrinh(String tenCongTrinh) {
		_tenCongTrinh = tenCongTrinh;
	}

	public int getLoaiCongTrinh() {
		return _loaiCongTrinh;
	}

	public void setLoaiCongTrinh(int loaiCongTrinh) {
		_loaiCongTrinh = loaiCongTrinh;
	}

	public String getMaTinh() {
		return _maTinh;
	}

	public void setMaTinh(String maTinh) {
		_maTinh = maTinh;
	}

	public String getMaHuyen() {
		return _maHuyen;
	}

	public void setMaHuyen(String maHuyen) {
		_maHuyen = maHuyen;
	}

	public String getMaXa() {
		return _maXa;
	}

	public void setMaXa(String maXa) {
		_maXa = maXa;
	}

	public String getDiaChi() {
		return _diaChi;
	}

	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;
	}

	public int getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;
	}

	public int getNamBaoCao() {
		return _namBaoCao;
	}

	public void setNamBaoCao(int namBaoCao) {
		_namBaoCao = namBaoCao;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	public String getIdNguoiTao() {
		return _idNguoiTao;
	}

	public void setIdNguoiTao(String idNguoiTao) {
		_idNguoiTao = idNguoiTao;
	}

	public String getKinhDo() {
		return _kinhDo;
	}

	public void setKinhDo(String kinhDo) {
		_kinhDo = kinhDo;
	}

	public String getViDo() {
		return _viDo;
	}

	public void setViDo(String viDo) {
		_viDo = viDo;
	}

	public String getLoaiNguonNuoc() {
		return _loaiNguonNuoc;
	}

	public void setLoaiNguonNuoc(String loaiNguonNuoc) {
		_loaiNguonNuoc = loaiNguonNuoc;
	}

	public int getNguonNuocHVS() {
		return _nguonNuocHVS;
	}

	public void setNguonNuocHVS(int nguonNuocHVS) {
		_nguonNuocHVS = nguonNuocHVS;
	}

	public String getLoaiNhaTieu() {
		return _loaiNhaTieu;
	}

	public void setLoaiNhaTieu(String loaiNhaTieu) {
		_loaiNhaTieu = loaiNhaTieu;
	}

	public int getNhaTieuHVS() {
		return _nhaTieuHVS;
	}

	public void setNhaTieuHVS(int nhaTieuHVS) {
		_nhaTieuHVS = nhaTieuHVS;
	}

	public int getKetLuanHVS() {
		return _ketLuanHVS;
	}

	public void setKetLuanHVS(int ketLuanHVS) {
		_ketLuanHVS = ketLuanHVS;
	}

	public Date getNgayKiemDem() {
		return _ngayKiemDem;
	}

	public void setNgayKiemDem(Date ngayKiemDem) {
		_ngayKiemDem = ngayKiemDem;
	}

	public Date getNgayDanhGia() {
		return _ngayDanhGia;
	}

	public void setNgayDanhGia(Date ngayDanhGia) {
		_ngayDanhGia = ngayDanhGia;
	}

	public int getIdNguoiDanhGia() {
		return _idNguoiDanhGia;
	}

	public void setIdNguoiDanhGia(int idNguoiDanhGia) {
		_idNguoiDanhGia = idNguoiDanhGia;
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
}