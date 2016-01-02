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
public class keHoachVeSinhXaNewSoap implements Serializable {
	public static keHoachVeSinhXaNewSoap toSoapModel(keHoachVeSinhXaNew model) {
		keHoachVeSinhXaNewSoap soapModel = new keHoachVeSinhXaNewSoap();

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

	public static keHoachVeSinhXaNewSoap[] toSoapModels(
		keHoachVeSinhXaNew[] models) {
		keHoachVeSinhXaNewSoap[] soapModels = new keHoachVeSinhXaNewSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static keHoachVeSinhXaNewSoap[][] toSoapModels(
		keHoachVeSinhXaNew[][] models) {
		keHoachVeSinhXaNewSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new keHoachVeSinhXaNewSoap[models.length][models[0].length];
		}
		else {
			soapModels = new keHoachVeSinhXaNewSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static keHoachVeSinhXaNewSoap[] toSoapModels(
		List<keHoachVeSinhXaNew> models) {
		List<keHoachVeSinhXaNewSoap> soapModels = new ArrayList<keHoachVeSinhXaNewSoap>(models.size());

		for (keHoachVeSinhXaNew model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new keHoachVeSinhXaNewSoap[soapModels.size()]);
	}

	public keHoachVeSinhXaNewSoap() {
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

	public int getNam() {
		return _nam;
	}

	public void setNam(int nam) {
		_nam = nam;
	}

	public int getSoNhaTieuHVSMoi() {
		return _soNhaTieuHVSMoi;
	}

	public void setSoNhaTieuHVSMoi(int soNhaTieuHVSMoi) {
		_soNhaTieuHVSMoi = soNhaTieuHVSMoi;
	}

	public int getSoDan() {
		return _soDan;
	}

	public void setSoDan(int soDan) {
		_soDan = soDan;
	}

	public int getDangKyVSTX() {
		return _dangKyVSTX;
	}

	public void setDangKyVSTX(int dangKyVSTX) {
		_dangKyVSTX = dangKyVSTX;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public int getBaoCaoDLI() {
		return _baoCaoDLI;
	}

	public void setBaoCaoDLI(int baoCaoDLI) {
		_baoCaoDLI = baoCaoDLI;
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

	private int _id;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private int _nam;
	private int _soNhaTieuHVSMoi;
	private int _soDan;
	private int _dangKyVSTX;
	private String _ghiChu;
	private int _baoCaoDLI;
	private Date _ngayTao;
	private int _idNguoiTao;
}