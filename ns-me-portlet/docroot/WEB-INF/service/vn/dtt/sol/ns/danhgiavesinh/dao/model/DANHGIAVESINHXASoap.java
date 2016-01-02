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

package vn.dtt.sol.ns.danhgiavesinh.dao.model;

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
public class DANHGIAVESINHXASoap implements Serializable {
	public static DANHGIAVESINHXASoap toSoapModel(DANHGIAVESINHXA model) {
		DANHGIAVESINHXASoap soapModel = new DANHGIAVESINHXASoap();

		soapModel.setId(model.getId());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setNam(model.getNam());
		soapModel.setSoDan(model.getSoDan());
		soapModel.setTiLeHGDCoNhaTieu(model.getTiLeHGDCoNhaTieu());
		soapModel.setTiLeHGDCoNhaTieuHVS(model.getTiLeHGDCoNhaTieuHVS());
		soapModel.setTiLeTruongHocHVS(model.getTiLeTruongHocHVS());
		soapModel.setTiLeTramYTeHVS(model.getTiLeTramYTeHVS());
		soapModel.setKetLuanVSTX(model.getKetLuanVSTX());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setBaoCaoDLI(model.getBaoCaoDLI());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());

		return soapModel;
	}

	public static DANHGIAVESINHXASoap[] toSoapModels(DANHGIAVESINHXA[] models) {
		DANHGIAVESINHXASoap[] soapModels = new DANHGIAVESINHXASoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DANHGIAVESINHXASoap[][] toSoapModels(
		DANHGIAVESINHXA[][] models) {
		DANHGIAVESINHXASoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DANHGIAVESINHXASoap[models.length][models[0].length];
		}
		else {
			soapModels = new DANHGIAVESINHXASoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DANHGIAVESINHXASoap[] toSoapModels(
		List<DANHGIAVESINHXA> models) {
		List<DANHGIAVESINHXASoap> soapModels = new ArrayList<DANHGIAVESINHXASoap>(models.size());

		for (DANHGIAVESINHXA model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DANHGIAVESINHXASoap[soapModels.size()]);
	}

	public DANHGIAVESINHXASoap() {
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

	public int getSoDan() {
		return _soDan;
	}

	public void setSoDan(int soDan) {
		_soDan = soDan;
	}

	public int getTiLeHGDCoNhaTieu() {
		return _tiLeHGDCoNhaTieu;
	}

	public void setTiLeHGDCoNhaTieu(int tiLeHGDCoNhaTieu) {
		_tiLeHGDCoNhaTieu = tiLeHGDCoNhaTieu;
	}

	public int getTiLeHGDCoNhaTieuHVS() {
		return _tiLeHGDCoNhaTieuHVS;
	}

	public void setTiLeHGDCoNhaTieuHVS(int tiLeHGDCoNhaTieuHVS) {
		_tiLeHGDCoNhaTieuHVS = tiLeHGDCoNhaTieuHVS;
	}

	public int getTiLeTruongHocHVS() {
		return _tiLeTruongHocHVS;
	}

	public void setTiLeTruongHocHVS(int tiLeTruongHocHVS) {
		_tiLeTruongHocHVS = tiLeTruongHocHVS;
	}

	public int getTiLeTramYTeHVS() {
		return _tiLeTramYTeHVS;
	}

	public void setTiLeTramYTeHVS(int tiLeTramYTeHVS) {
		_tiLeTramYTeHVS = tiLeTramYTeHVS;
	}

	public int getKetLuanVSTX() {
		return _ketLuanVSTX;
	}

	public void setKetLuanVSTX(int ketLuanVSTX) {
		_ketLuanVSTX = ketLuanVSTX;
	}

	public long getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(long ghiChu) {
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

	public long getIdNguoiTao() {
		return _idNguoiTao;
	}

	public void setIdNguoiTao(long idNguoiTao) {
		_idNguoiTao = idNguoiTao;
	}

	private long _id;
	private String _maXa;
	private String _maTinh;
	private String _maHuyen;
	private int _nam;
	private int _soDan;
	private int _tiLeHGDCoNhaTieu;
	private int _tiLeHGDCoNhaTieuHVS;
	private int _tiLeTruongHocHVS;
	private int _tiLeTramYTeHVS;
	private int _ketLuanVSTX;
	private long _ghiChu;
	private int _baoCaoDLI;
	private Date _ngayTao;
	private long _idNguoiTao;
}