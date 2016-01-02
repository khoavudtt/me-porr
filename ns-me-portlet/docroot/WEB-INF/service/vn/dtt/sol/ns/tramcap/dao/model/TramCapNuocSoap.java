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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author khoa.vu
 * @generated
 */
public class TramCapNuocSoap implements Serializable {
	public static TramCapNuocSoap toSoapModel(TramCapNuoc model) {
		TramCapNuocSoap soapModel = new TramCapNuocSoap();

		soapModel.setId(model.getId());
		soapModel.setMaTram(model.getMaTram());
		soapModel.setTenTram(model.getTenTram());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setTenTinh(model.getTenTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setTenHuyen(model.getTenHuyen());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setTenXa(model.getTenXa());
		soapModel.setDiaChi(model.getDiaChi());
		soapModel.setKinhDo(model.getKinhDo());
		soapModel.setViDo(model.getViDo());
		soapModel.setLoaiHinh(model.getLoaiHinh());
		soapModel.setMaMoHinh(model.getMaMoHinh());
		soapModel.setTenMoHinh(model.getTenMoHinh());
		soapModel.setCongXuatThietKe(model.getCongXuatThietKe());
		soapModel.setTongDauNoiThietKe(model.getTongDauNoiThietKe());
		soapModel.setSoNguoiCapThietKe(model.getSoNguoiCapThietKe());
		soapModel.setTinhTrangDuAn(model.getTinhTrangDuAn());
		soapModel.setTienDoXayDung(model.getTienDoXayDung());
		soapModel.setNamXayDung(model.getNamXayDung());
		soapModel.setNamHoanThanh(model.getNamHoanThanh());
		soapModel.setNgayVanHanh(model.getNgayVanHanh());
		soapModel.setBoMayVanHanh(model.getBoMayVanHanh());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());
		soapModel.setIdNguoiDanhGia(model.getIdNguoiDanhGia());
		soapModel.setNgayDanhGia(model.getNgayDanhGia());
		soapModel.setTrangThaiCapNuoc(model.getTrangThaiCapNuoc());
		soapModel.setCongXuatThucTe(model.getCongXuatThucTe());
		soapModel.setTongDauNoiThucTe(model.getTongDauNoiThucTe());
		soapModel.setSoNguoiCapThucTe(model.getSoNguoiCapThucTe());
		soapModel.setTongChiPhi(model.getTongChiPhi());
		soapModel.setTongDoanhThu(model.getTongDoanhThu());
		soapModel.setNuocDatTieuChuan(model.getNuocDatTieuChuan());
		soapModel.setNuocCoAsen(model.getNuocCoAsen());
		soapModel.setNuocThatThoat(model.getNuocThatThoat());
		soapModel.setTrangThaiDanhGia(model.getTrangThaiDanhGia());

		return soapModel;
	}

	public static TramCapNuocSoap[] toSoapModels(TramCapNuoc[] models) {
		TramCapNuocSoap[] soapModels = new TramCapNuocSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TramCapNuocSoap[][] toSoapModels(TramCapNuoc[][] models) {
		TramCapNuocSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TramCapNuocSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TramCapNuocSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TramCapNuocSoap[] toSoapModels(List<TramCapNuoc> models) {
		List<TramCapNuocSoap> soapModels = new ArrayList<TramCapNuocSoap>(models.size());

		for (TramCapNuoc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TramCapNuocSoap[soapModels.size()]);
	}

	public TramCapNuocSoap() {
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

	public String getMaTram() {
		return _maTram;
	}

	public void setMaTram(String maTram) {
		_maTram = maTram;
	}

	public String getTenTram() {
		return _tenTram;
	}

	public void setTenTram(String tenTram) {
		_tenTram = tenTram;
	}

	public String getMaTinh() {
		return _maTinh;
	}

	public void setMaTinh(String maTinh) {
		_maTinh = maTinh;
	}

	public String getTenTinh() {
		return _tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		_tenTinh = tenTinh;
	}

	public String getMaHuyen() {
		return _maHuyen;
	}

	public void setMaHuyen(String maHuyen) {
		_maHuyen = maHuyen;
	}

	public String getTenHuyen() {
		return _tenHuyen;
	}

	public void setTenHuyen(String tenHuyen) {
		_tenHuyen = tenHuyen;
	}

	public String getMaXa() {
		return _maXa;
	}

	public void setMaXa(String maXa) {
		_maXa = maXa;
	}

	public String getTenXa() {
		return _tenXa;
	}

	public void setTenXa(String tenXa) {
		_tenXa = tenXa;
	}

	public String getDiaChi() {
		return _diaChi;
	}

	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;
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

	public int getLoaiHinh() {
		return _loaiHinh;
	}

	public void setLoaiHinh(int loaiHinh) {
		_loaiHinh = loaiHinh;
	}

	public String getMaMoHinh() {
		return _maMoHinh;
	}

	public void setMaMoHinh(String maMoHinh) {
		_maMoHinh = maMoHinh;
	}

	public String getTenMoHinh() {
		return _tenMoHinh;
	}

	public void setTenMoHinh(String tenMoHinh) {
		_tenMoHinh = tenMoHinh;
	}

	public int getCongXuatThietKe() {
		return _congXuatThietKe;
	}

	public void setCongXuatThietKe(int congXuatThietKe) {
		_congXuatThietKe = congXuatThietKe;
	}

	public int getTongDauNoiThietKe() {
		return _tongDauNoiThietKe;
	}

	public void setTongDauNoiThietKe(int tongDauNoiThietKe) {
		_tongDauNoiThietKe = tongDauNoiThietKe;
	}

	public int getSoNguoiCapThietKe() {
		return _soNguoiCapThietKe;
	}

	public void setSoNguoiCapThietKe(int soNguoiCapThietKe) {
		_soNguoiCapThietKe = soNguoiCapThietKe;
	}

	public int getTinhTrangDuAn() {
		return _tinhTrangDuAn;
	}

	public void setTinhTrangDuAn(int tinhTrangDuAn) {
		_tinhTrangDuAn = tinhTrangDuAn;
	}

	public int getTienDoXayDung() {
		return _tienDoXayDung;
	}

	public void setTienDoXayDung(int tienDoXayDung) {
		_tienDoXayDung = tienDoXayDung;
	}

	public int getNamXayDung() {
		return _namXayDung;
	}

	public void setNamXayDung(int namXayDung) {
		_namXayDung = namXayDung;
	}

	public int getNamHoanThanh() {
		return _namHoanThanh;
	}

	public void setNamHoanThanh(int namHoanThanh) {
		_namHoanThanh = namHoanThanh;
	}

	public Date getNgayVanHanh() {
		return _ngayVanHanh;
	}

	public void setNgayVanHanh(Date ngayVanHanh) {
		_ngayVanHanh = ngayVanHanh;
	}

	public int getBoMayVanHanh() {
		return _boMayVanHanh;
	}

	public void setBoMayVanHanh(int boMayVanHanh) {
		_boMayVanHanh = boMayVanHanh;
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

	public long getIdNguoiTao() {
		return _idNguoiTao;
	}

	public void setIdNguoiTao(long idNguoiTao) {
		_idNguoiTao = idNguoiTao;
	}

	public long getIdNguoiDanhGia() {
		return _idNguoiDanhGia;
	}

	public void setIdNguoiDanhGia(long idNguoiDanhGia) {
		_idNguoiDanhGia = idNguoiDanhGia;
	}

	public Date getNgayDanhGia() {
		return _ngayDanhGia;
	}

	public void setNgayDanhGia(Date ngayDanhGia) {
		_ngayDanhGia = ngayDanhGia;
	}

	public int getTrangThaiCapNuoc() {
		return _trangThaiCapNuoc;
	}

	public void setTrangThaiCapNuoc(int trangThaiCapNuoc) {
		_trangThaiCapNuoc = trangThaiCapNuoc;
	}

	public int getCongXuatThucTe() {
		return _congXuatThucTe;
	}

	public void setCongXuatThucTe(int congXuatThucTe) {
		_congXuatThucTe = congXuatThucTe;
	}

	public int getTongDauNoiThucTe() {
		return _tongDauNoiThucTe;
	}

	public void setTongDauNoiThucTe(int tongDauNoiThucTe) {
		_tongDauNoiThucTe = tongDauNoiThucTe;
	}

	public int getSoNguoiCapThucTe() {
		return _soNguoiCapThucTe;
	}

	public void setSoNguoiCapThucTe(int soNguoiCapThucTe) {
		_soNguoiCapThucTe = soNguoiCapThucTe;
	}

	public int getTongChiPhi() {
		return _tongChiPhi;
	}

	public void setTongChiPhi(int tongChiPhi) {
		_tongChiPhi = tongChiPhi;
	}

	public int getTongDoanhThu() {
		return _tongDoanhThu;
	}

	public void setTongDoanhThu(int tongDoanhThu) {
		_tongDoanhThu = tongDoanhThu;
	}

	public int getNuocDatTieuChuan() {
		return _nuocDatTieuChuan;
	}

	public void setNuocDatTieuChuan(int nuocDatTieuChuan) {
		_nuocDatTieuChuan = nuocDatTieuChuan;
	}

	public int getNuocCoAsen() {
		return _nuocCoAsen;
	}

	public void setNuocCoAsen(int nuocCoAsen) {
		_nuocCoAsen = nuocCoAsen;
	}

	public int getNuocThatThoat() {
		return _nuocThatThoat;
	}

	public void setNuocThatThoat(int nuocThatThoat) {
		_nuocThatThoat = nuocThatThoat;
	}

	public int getTrangThaiDanhGia() {
		return _trangThaiDanhGia;
	}

	public void setTrangThaiDanhGia(int trangThaiDanhGia) {
		_trangThaiDanhGia = trangThaiDanhGia;
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
}