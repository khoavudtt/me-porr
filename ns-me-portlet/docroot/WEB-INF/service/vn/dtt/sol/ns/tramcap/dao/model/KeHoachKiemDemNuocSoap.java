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
public class KeHoachKiemDemNuocSoap implements Serializable {
	public static KeHoachKiemDemNuocSoap toSoapModel(KeHoachKiemDemNuoc model) {
		KeHoachKiemDemNuocSoap soapModel = new KeHoachKiemDemNuocSoap();

		soapModel.setId(model.getId());
		soapModel.setNam(model.getNam());
		soapModel.setTramCapNuocId(model.getTramCapNuocId());
		soapModel.setKiemDemVienId(model.getKiemDemVienId());
		soapModel.setNgayBatDau(model.getNgayBatDau());
		soapModel.setNgayKetThuc(model.getNgayKetThuc());
		soapModel.setMoTa(model.getMoTa());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());
		soapModel.setNgayXuatBan(model.getNgayXuatBan());
		soapModel.setIdNguoiXuatBan(model.getIdNguoiXuatBan());
		soapModel.setNgayDong(model.getNgayDong());
		soapModel.setIdNguoiDong(model.getIdNguoiDong());
		soapModel.setLastSavePoint(model.getLastSavePoint());

		return soapModel;
	}

	public static KeHoachKiemDemNuocSoap[] toSoapModels(
		KeHoachKiemDemNuoc[] models) {
		KeHoachKiemDemNuocSoap[] soapModels = new KeHoachKiemDemNuocSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KeHoachKiemDemNuocSoap[][] toSoapModels(
		KeHoachKiemDemNuoc[][] models) {
		KeHoachKiemDemNuocSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KeHoachKiemDemNuocSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KeHoachKiemDemNuocSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KeHoachKiemDemNuocSoap[] toSoapModels(
		List<KeHoachKiemDemNuoc> models) {
		List<KeHoachKiemDemNuocSoap> soapModels = new ArrayList<KeHoachKiemDemNuocSoap>(models.size());

		for (KeHoachKiemDemNuoc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KeHoachKiemDemNuocSoap[soapModels.size()]);
	}

	public KeHoachKiemDemNuocSoap() {
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

	public int getTramCapNuocId() {
		return _tramCapNuocId;
	}

	public void setTramCapNuocId(int tramCapNuocId) {
		_tramCapNuocId = tramCapNuocId;
	}

	public int getKiemDemVienId() {
		return _kiemDemVienId;
	}

	public void setKiemDemVienId(int kiemDemVienId) {
		_kiemDemVienId = kiemDemVienId;
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
	private int _tramCapNuocId;
	private int _kiemDemVienId;
	private Date _ngayBatDau;
	private Date _ngayKetThuc;
	private String _moTa;
	private Date _ngayTao;
	private int _idNguoiTao;
	private Date _ngayXuatBan;
	private int _idNguoiXuatBan;
	private Date _ngayDong;
	private int _idNguoiDong;
	private Date _lastSavePoint;
}