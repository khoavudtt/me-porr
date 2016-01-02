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

package vn.dtt.sol.ns.kehoachvesinh.dao.model;

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
public class KeHoachVeSinhSoap implements Serializable {
	public static KeHoachVeSinhSoap toSoapModel(KeHoachVeSinh model) {
		KeHoachVeSinhSoap soapModel = new KeHoachVeSinhSoap();

		soapModel.setId(model.getId());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setNam(model.getNam());
		soapModel.setSoNhaTieuHVSMoi(model.getSoNhaTieuHVSMoi());
		soapModel.setSoDan(model.getSoDan());
		soapModel.setDangKyVSTX(model.getDangKyVSTX());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setBaoCaoDLI(model.getBaoCaoDLI());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());

		return soapModel;
	}

	public static KeHoachVeSinhSoap[] toSoapModels(KeHoachVeSinh[] models) {
		KeHoachVeSinhSoap[] soapModels = new KeHoachVeSinhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KeHoachVeSinhSoap[][] toSoapModels(KeHoachVeSinh[][] models) {
		KeHoachVeSinhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KeHoachVeSinhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KeHoachVeSinhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KeHoachVeSinhSoap[] toSoapModels(List<KeHoachVeSinh> models) {
		List<KeHoachVeSinhSoap> soapModels = new ArrayList<KeHoachVeSinhSoap>(models.size());

		for (KeHoachVeSinh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KeHoachVeSinhSoap[soapModels.size()]);
	}

	public KeHoachVeSinhSoap() {
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

	public long getNam() {
		return _nam;
	}

	public void setNam(long nam) {
		_nam = nam;
	}

	public long getSoNhaTieuHVSMoi() {
		return _soNhaTieuHVSMoi;
	}

	public void setSoNhaTieuHVSMoi(long soNhaTieuHVSMoi) {
		_soNhaTieuHVSMoi = soNhaTieuHVSMoi;
	}

	public long getSoDan() {
		return _soDan;
	}

	public void setSoDan(long soDan) {
		_soDan = soDan;
	}

	public long getDangKyVSTX() {
		return _dangKyVSTX;
	}

	public void setDangKyVSTX(long dangKyVSTX) {
		_dangKyVSTX = dangKyVSTX;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public long getBaoCaoDLI() {
		return _baoCaoDLI;
	}

	public void setBaoCaoDLI(long baoCaoDLI) {
		_baoCaoDLI = baoCaoDLI;
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

	private long _id;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private long _nam;
	private long _soNhaTieuHVSMoi;
	private long _soDan;
	private long _dangKyVSTX;
	private String _ghiChu;
	private long _baoCaoDLI;
	private Date _ngayTao;
	private long _idNguoiTao;
}