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
public class VeSinhGiaDinhSoap implements Serializable {
	public static VeSinhGiaDinhSoap toSoapModel(VeSinhGiaDinh model) {
		VeSinhGiaDinhSoap soapModel = new VeSinhGiaDinhSoap();

		soapModel.setId(model.getId());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setThonXom(model.getThonXom());
		soapModel.setTenChuHo(model.getTenChuHo());
		soapModel.setGioiTinhChuHo(model.getGioiTinhChuHo());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setMauNgauNhien(model.getMauNgauNhien());
		soapModel.setNamBaoCao(model.getNamBaoCao());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());
		soapModel.setSoNguoiTrongHo(model.getSoNguoiTrongHo());
		soapModel.setThanhPhanHoGD(model.getThanhPhanHoGD());
		soapModel.setKinhDo(model.getKinhDo());
		soapModel.setViDo(model.getViDo());
		soapModel.setCoNhaTieu(model.getCoNhaTieu());
		soapModel.setNhaTieuHVS(model.getNhaTieuHVS());
		soapModel.setLoaiNhaTieu(model.getLoaiNhaTieu());
		soapModel.setDuocCaiTao(model.getDuocCaiTao());
		soapModel.setThangXayDung(model.getThangXayDung());
		soapModel.setNamXayDung(model.getNamXayDung());
		soapModel.setNguonVon(model.getNguonVon());
		soapModel.setNgayKiemDem(model.getNgayKiemDem());
		soapModel.setNgayDanhGia(model.getNgayDanhGia());
		soapModel.setIdNguoiDanhGia(model.getIdNguoiDanhGia());

		return soapModel;
	}

	public static VeSinhGiaDinhSoap[] toSoapModels(VeSinhGiaDinh[] models) {
		VeSinhGiaDinhSoap[] soapModels = new VeSinhGiaDinhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VeSinhGiaDinhSoap[][] toSoapModels(VeSinhGiaDinh[][] models) {
		VeSinhGiaDinhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VeSinhGiaDinhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VeSinhGiaDinhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VeSinhGiaDinhSoap[] toSoapModels(List<VeSinhGiaDinh> models) {
		List<VeSinhGiaDinhSoap> soapModels = new ArrayList<VeSinhGiaDinhSoap>(models.size());

		for (VeSinhGiaDinh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VeSinhGiaDinhSoap[soapModels.size()]);
	}

	public VeSinhGiaDinhSoap() {
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

	public String getThonXom() {
		return _thonXom;
	}

	public void setThonXom(String thonXom) {
		_thonXom = thonXom;
	}

	public String getTenChuHo() {
		return _tenChuHo;
	}

	public void setTenChuHo(String tenChuHo) {
		_tenChuHo = tenChuHo;
	}

	public int getGioiTinhChuHo() {
		return _gioiTinhChuHo;
	}

	public void setGioiTinhChuHo(int gioiTinhChuHo) {
		_gioiTinhChuHo = gioiTinhChuHo;
	}

	public int getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;
	}

	public int getMauNgauNhien() {
		return _mauNgauNhien;
	}

	public void setMauNgauNhien(int mauNgauNhien) {
		_mauNgauNhien = mauNgauNhien;
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

	public int getIdNguoiTao() {
		return _idNguoiTao;
	}

	public void setIdNguoiTao(int idNguoiTao) {
		_idNguoiTao = idNguoiTao;
	}

	public int getSoNguoiTrongHo() {
		return _soNguoiTrongHo;
	}

	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		_soNguoiTrongHo = soNguoiTrongHo;
	}

	public int getThanhPhanHoGD() {
		return _thanhPhanHoGD;
	}

	public void setThanhPhanHoGD(int thanhPhanHoGD) {
		_thanhPhanHoGD = thanhPhanHoGD;
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

	public int getCoNhaTieu() {
		return _coNhaTieu;
	}

	public void setCoNhaTieu(int coNhaTieu) {
		_coNhaTieu = coNhaTieu;
	}

	public int getNhaTieuHVS() {
		return _nhaTieuHVS;
	}

	public void setNhaTieuHVS(int nhaTieuHVS) {
		_nhaTieuHVS = nhaTieuHVS;
	}

	public String getLoaiNhaTieu() {
		return _loaiNhaTieu;
	}

	public void setLoaiNhaTieu(String loaiNhaTieu) {
		_loaiNhaTieu = loaiNhaTieu;
	}

	public int getDuocCaiTao() {
		return _duocCaiTao;
	}

	public void setDuocCaiTao(int duocCaiTao) {
		_duocCaiTao = duocCaiTao;
	}

	public int getThangXayDung() {
		return _thangXayDung;
	}

	public void setThangXayDung(int thangXayDung) {
		_thangXayDung = thangXayDung;
	}

	public int getNamXayDung() {
		return _namXayDung;
	}

	public void setNamXayDung(int namXayDung) {
		_namXayDung = namXayDung;
	}

	public int getNguonVon() {
		return _nguonVon;
	}

	public void setNguonVon(int nguonVon) {
		_nguonVon = nguonVon;
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
}