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
public class DanhGiaBenVungSoap implements Serializable {
	public static DanhGiaBenVungSoap toSoapModel(DanhGiaBenVung model) {
		DanhGiaBenVungSoap soapModel = new DanhGiaBenVungSoap();

		soapModel.setId(model.getId());
		soapModel.setTramCapNuocId(model.getTramCapNuocId());
		soapModel.setNam(model.getNam());
		soapModel.setTrangThaiCapNuoc(model.getTrangThaiCapNuoc());
		soapModel.setCongXuatThucTe(model.getCongXuatThucTe());
		soapModel.setTongDauNoiMoi(model.getTongDauNoiMoi());
		soapModel.setTongDauNoiThucTe(model.getTongDauNoiThucTe());
		soapModel.setSoNguoiCapThucTe(model.getSoNguoiCapThucTe());
		soapModel.setNuocThatThoat(model.getNuocThatThoat());
		soapModel.setNuocDatTieuChuan(model.getNuocDatTieuChuan());
		soapModel.setNuocCoAsen(model.getNuocCoAsen());
		soapModel.setTongChiPhi(model.getTongChiPhi());
		soapModel.setTongDoanhThu(model.getTongDoanhThu());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setKetQuaDanhGia(model.getKetQuaDanhGia());
		soapModel.setBaoCaoDLI(model.getBaoCaoDLI());

		return soapModel;
	}

	public static DanhGiaBenVungSoap[] toSoapModels(DanhGiaBenVung[] models) {
		DanhGiaBenVungSoap[] soapModels = new DanhGiaBenVungSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DanhGiaBenVungSoap[][] toSoapModels(DanhGiaBenVung[][] models) {
		DanhGiaBenVungSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DanhGiaBenVungSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DanhGiaBenVungSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DanhGiaBenVungSoap[] toSoapModels(List<DanhGiaBenVung> models) {
		List<DanhGiaBenVungSoap> soapModels = new ArrayList<DanhGiaBenVungSoap>(models.size());

		for (DanhGiaBenVung model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DanhGiaBenVungSoap[soapModels.size()]);
	}

	public DanhGiaBenVungSoap() {
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

	public int getNam() {
		return _nam;
	}

	public void setNam(int nam) {
		_nam = nam;
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

	public int getTongDauNoiMoi() {
		return _tongDauNoiMoi;
	}

	public void setTongDauNoiMoi(int tongDauNoiMoi) {
		_tongDauNoiMoi = tongDauNoiMoi;
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

	public int getKetQuaDanhGia() {
		return _ketQuaDanhGia;
	}

	public void setKetQuaDanhGia(int ketQuaDanhGia) {
		_ketQuaDanhGia = ketQuaDanhGia;
	}

	public int getBaoCaoDLI() {
		return _baoCaoDLI;
	}

	public void setBaoCaoDLI(int baoCaoDLI) {
		_baoCaoDLI = baoCaoDLI;
	}

	private long _id;
	private int _tramCapNuocId;
	private int _nam;
	private int _trangThaiCapNuoc;
	private int _congXuatThucTe;
	private int _tongDauNoiMoi;
	private int _tongDauNoiThucTe;
	private int _soNguoiCapThucTe;
	private int _nuocThatThoat;
	private int _nuocDatTieuChuan;
	private int _nuocCoAsen;
	private int _tongChiPhi;
	private int _tongDoanhThu;
	private Date _ngayTao;
	private int _idNguoiTao;
	private String _ghiChu;
	private int _ketQuaDanhGia;
	private int _baoCaoDLI;
}