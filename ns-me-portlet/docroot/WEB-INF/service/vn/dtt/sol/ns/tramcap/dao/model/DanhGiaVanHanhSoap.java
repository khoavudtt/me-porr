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
public class DanhGiaVanHanhSoap implements Serializable {
	public static DanhGiaVanHanhSoap toSoapModel(DanhGiaVanHanh model) {
		DanhGiaVanHanhSoap soapModel = new DanhGiaVanHanhSoap();

		soapModel.setId(model.getId());
		soapModel.setTramCapNuocId(model.getTramCapNuocId());
		soapModel.setThang(model.getThang());
		soapModel.setNam(model.getNam());
		soapModel.setCongXuatThucTe(model.getCongXuatThucTe());
		soapModel.setNuocThatThoat(model.getNuocThatThoat());
		soapModel.setNuocDatTieuChuan(model.getNuocDatTieuChuan());
		soapModel.setNuocCoAsen(model.getNuocCoAsen());
		soapModel.setTrangThaiCapNuoc(model.getTrangThaiCapNuoc());
		soapModel.setChiPhiHoaChat(model.getChiPhiHoaChat());
		soapModel.setChiPhiDien(model.getChiPhiDien());
		soapModel.setLuongNhanVien(model.getLuongNhanVien());
		soapModel.setChiPhiSuaChua(model.getChiPhiSuaChua());
		soapModel.setDoanhThu(model.getDoanhThu());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setSanLuongSanXuat(model.getSanLuongSanXuat());
		soapModel.setSanLuongTieuHao(model.getSanLuongTieuHao());

		return soapModel;
	}

	public static DanhGiaVanHanhSoap[] toSoapModels(DanhGiaVanHanh[] models) {
		DanhGiaVanHanhSoap[] soapModels = new DanhGiaVanHanhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DanhGiaVanHanhSoap[][] toSoapModels(DanhGiaVanHanh[][] models) {
		DanhGiaVanHanhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DanhGiaVanHanhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DanhGiaVanHanhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DanhGiaVanHanhSoap[] toSoapModels(List<DanhGiaVanHanh> models) {
		List<DanhGiaVanHanhSoap> soapModels = new ArrayList<DanhGiaVanHanhSoap>(models.size());

		for (DanhGiaVanHanh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DanhGiaVanHanhSoap[soapModels.size()]);
	}

	public DanhGiaVanHanhSoap() {
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

	public int getTramCapNuocId() {
		return _tramCapNuocId;
	}

	public void setTramCapNuocId(int tramCapNuocId) {
		_tramCapNuocId = tramCapNuocId;
	}

	public int getThang() {
		return _thang;
	}

	public void setThang(int thang) {
		_thang = thang;
	}

	public int getNam() {
		return _nam;
	}

	public void setNam(int nam) {
		_nam = nam;
	}

	public int getCongXuatThucTe() {
		return _congXuatThucTe;
	}

	public void setCongXuatThucTe(int congXuatThucTe) {
		_congXuatThucTe = congXuatThucTe;
	}

	public int getNuocThatThoat() {
		return _nuocThatThoat;
	}

	public void setNuocThatThoat(int nuocThatThoat) {
		_nuocThatThoat = nuocThatThoat;
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

	public int getTrangThaiCapNuoc() {
		return _trangThaiCapNuoc;
	}

	public void setTrangThaiCapNuoc(int trangThaiCapNuoc) {
		_trangThaiCapNuoc = trangThaiCapNuoc;
	}

	public int getChiPhiHoaChat() {
		return _chiPhiHoaChat;
	}

	public void setChiPhiHoaChat(int chiPhiHoaChat) {
		_chiPhiHoaChat = chiPhiHoaChat;
	}

	public int getChiPhiDien() {
		return _chiPhiDien;
	}

	public void setChiPhiDien(int chiPhiDien) {
		_chiPhiDien = chiPhiDien;
	}

	public int getLuongNhanVien() {
		return _luongNhanVien;
	}

	public void setLuongNhanVien(int luongNhanVien) {
		_luongNhanVien = luongNhanVien;
	}

	public int getChiPhiSuaChua() {
		return _chiPhiSuaChua;
	}

	public void setChiPhiSuaChua(int chiPhiSuaChua) {
		_chiPhiSuaChua = chiPhiSuaChua;
	}

	public int getDoanhThu() {
		return _doanhThu;
	}

	public void setDoanhThu(int doanhThu) {
		_doanhThu = doanhThu;
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

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public int getSanLuongSanXuat() {
		return _sanLuongSanXuat;
	}

	public void setSanLuongSanXuat(int sanLuongSanXuat) {
		_sanLuongSanXuat = sanLuongSanXuat;
	}

	public int getSanLuongTieuHao() {
		return _sanLuongTieuHao;
	}

	public void setSanLuongTieuHao(int sanLuongTieuHao) {
		_sanLuongTieuHao = sanLuongTieuHao;
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
}