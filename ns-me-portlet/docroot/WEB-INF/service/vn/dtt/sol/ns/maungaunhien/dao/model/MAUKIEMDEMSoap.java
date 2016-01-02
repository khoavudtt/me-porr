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

package vn.dtt.sol.ns.maungaunhien.dao.model;

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
public class MAUKIEMDEMSoap implements Serializable {
	public static MAUKIEMDEMSoap toSoapModel(MAUKIEMDEM model) {
		MAUKIEMDEMSoap soapModel = new MAUKIEMDEMSoap();

		soapModel.setId(model.getId());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setNam(model.getNam());
		soapModel.setTongSoHGD(model.getTongSoHGD());
		soapModel.setSoMauNgauNhien(model.getSoMauNgauNhien());
		soapModel.setSoMauDuPhong(model.getSoMauDuPhong());
		soapModel.setTongSoMau(model.getTongSoMau());
		soapModel.setSoMauHVS(model.getSoMauHVS());
		soapModel.setSoMauCoNhaTieu(model.getSoMauCoNhaTieu());
		soapModel.setSoMauKiemDem(model.getSoMauKiemDem());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static MAUKIEMDEMSoap[] toSoapModels(MAUKIEMDEM[] models) {
		MAUKIEMDEMSoap[] soapModels = new MAUKIEMDEMSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MAUKIEMDEMSoap[][] toSoapModels(MAUKIEMDEM[][] models) {
		MAUKIEMDEMSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MAUKIEMDEMSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MAUKIEMDEMSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MAUKIEMDEMSoap[] toSoapModels(List<MAUKIEMDEM> models) {
		List<MAUKIEMDEMSoap> soapModels = new ArrayList<MAUKIEMDEMSoap>(models.size());

		for (MAUKIEMDEM model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MAUKIEMDEMSoap[soapModels.size()]);
	}

	public MAUKIEMDEMSoap() {
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

	public String getMaXa() {
		return _maXa;
	}

	public void setMaXa(String maXa) {
		_maXa = maXa;
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

	public int getNam() {
		return _nam;
	}

	public void setNam(int nam) {
		_nam = nam;
	}

	public int getTongSoHGD() {
		return _tongSoHGD;
	}

	public void setTongSoHGD(int tongSoHGD) {
		_tongSoHGD = tongSoHGD;
	}

	public int getSoMauNgauNhien() {
		return _soMauNgauNhien;
	}

	public void setSoMauNgauNhien(int soMauNgauNhien) {
		_soMauNgauNhien = soMauNgauNhien;
	}

	public int getSoMauDuPhong() {
		return _soMauDuPhong;
	}

	public void setSoMauDuPhong(int soMauDuPhong) {
		_soMauDuPhong = soMauDuPhong;
	}

	public int getTongSoMau() {
		return _tongSoMau;
	}

	public void setTongSoMau(int tongSoMau) {
		_tongSoMau = tongSoMau;
	}

	public int getSoMauHVS() {
		return _soMauHVS;
	}

	public void setSoMauHVS(int soMauHVS) {
		_soMauHVS = soMauHVS;
	}

	public int getSoMauCoNhaTieu() {
		return _soMauCoNhaTieu;
	}

	public void setSoMauCoNhaTieu(int soMauCoNhaTieu) {
		_soMauCoNhaTieu = soMauCoNhaTieu;
	}

	public int getSoMauKiemDem() {
		return _soMauKiemDem;
	}

	public void setSoMauKiemDem(int soMauKiemDem) {
		_soMauKiemDem = soMauKiemDem;
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private long _id;
	private String _maXa;
	private String _maTinh;
	private String _maHuyen;
	private int _nam;
	private int _tongSoHGD;
	private int _soMauNgauNhien;
	private int _soMauDuPhong;
	private int _tongSoMau;
	private int _soMauHVS;
	private int _soMauCoNhaTieu;
	private int _soMauKiemDem;
	private Date _ngayTao;
	private long _userId;
}