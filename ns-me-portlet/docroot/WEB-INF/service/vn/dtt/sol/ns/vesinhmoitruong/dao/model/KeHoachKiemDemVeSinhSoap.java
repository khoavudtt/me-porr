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
public class KeHoachKiemDemVeSinhSoap implements Serializable {
	public static KeHoachKiemDemVeSinhSoap toSoapModel(
		KeHoachKiemDemVeSinh model) {
		KeHoachKiemDemVeSinhSoap soapModel = new KeHoachKiemDemVeSinhSoap();

		soapModel.setId(model.getId());
		soapModel.setNam(model.getNam());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setKiemDemVienID(model.getKiemDemVienID());
		soapModel.setNgayBatDau(model.getNgayBatDau());
		soapModel.setNgayKetThuc(model.getNgayKetThuc());
		soapModel.setMoTa(model.getMoTa());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());
		soapModel.setNgayXuatBan(model.getNgayXuatBan());
		soapModel.setIdNguoiXuatBan(model.getIdNguoiXuatBan());
		soapModel.setTableId(model.getTableId());
		soapModel.setNgayDong(model.getNgayDong());
		soapModel.setIdNguoiDong(model.getIdNguoiDong());
		soapModel.setLastSavePoint(model.getLastSavePoint());

		return soapModel;
	}

	public static KeHoachKiemDemVeSinhSoap[] toSoapModels(
		KeHoachKiemDemVeSinh[] models) {
		KeHoachKiemDemVeSinhSoap[] soapModels = new KeHoachKiemDemVeSinhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KeHoachKiemDemVeSinhSoap[][] toSoapModels(
		KeHoachKiemDemVeSinh[][] models) {
		KeHoachKiemDemVeSinhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KeHoachKiemDemVeSinhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KeHoachKiemDemVeSinhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KeHoachKiemDemVeSinhSoap[] toSoapModels(
		List<KeHoachKiemDemVeSinh> models) {
		List<KeHoachKiemDemVeSinhSoap> soapModels = new ArrayList<KeHoachKiemDemVeSinhSoap>(models.size());

		for (KeHoachKiemDemVeSinh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KeHoachKiemDemVeSinhSoap[soapModels.size()]);
	}

	public KeHoachKiemDemVeSinhSoap() {
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

	public int getNam() {
		return _nam;
	}

	public void setNam(int nam) {
		_nam = nam;
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

	public int getKiemDemVienID() {
		return _kiemDemVienID;
	}

	public void setKiemDemVienID(int kiemDemVienID) {
		_kiemDemVienID = kiemDemVienID;
	}

	public Date getNgayBatDau() {
		return _ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		_ngayBatDau = ngayBatDau;
	}

	public Date getNgayKetThuc() {
		return _ngayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		_ngayKetThuc = ngayKetThuc;
	}

	public String getMoTa() {
		return _moTa;
	}

	public void setMoTa(String moTa) {
		_moTa = moTa;
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

	public Date getNgayXuatBan() {
		return _ngayXuatBan;
	}

	public void setNgayXuatBan(Date ngayXuatBan) {
		_ngayXuatBan = ngayXuatBan;
	}

	public int getIdNguoiXuatBan() {
		return _idNguoiXuatBan;
	}

	public void setIdNguoiXuatBan(int idNguoiXuatBan) {
		_idNguoiXuatBan = idNguoiXuatBan;
	}

	public String getTableId() {
		return _tableId;
	}

	public void setTableId(String tableId) {
		_tableId = tableId;
	}

	public Date getNgayDong() {
		return _ngayDong;
	}

	public void setNgayDong(Date ngayDong) {
		_ngayDong = ngayDong;
	}

	public int getIdNguoiDong() {
		return _idNguoiDong;
	}

	public void setIdNguoiDong(int idNguoiDong) {
		_idNguoiDong = idNguoiDong;
	}

	public Date getLastSavePoint() {
		return _lastSavePoint;
	}

	public void setLastSavePoint(Date lastSavePoint) {
		_lastSavePoint = lastSavePoint;
	}

	private int _id;
	private int _nam;
	private String _maTinh;
	private String _maHuyen;
	private int _kiemDemVienID;
	private Date _ngayBatDau;
	private Date _ngayKetThuc;
	private String _moTa;
	private Date _ngayTao;
	private int _idNguoiTao;
	private Date _ngayXuatBan;
	private int _idNguoiXuatBan;
	private String _tableId;
	private Date _ngayDong;
	private int _idNguoiDong;
	private Date _lastSavePoint;
}