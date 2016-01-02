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
public class DanhGiaVeSinhXaNewFakeSoap implements Serializable {
	public static DanhGiaVeSinhXaNewFakeSoap toSoapModel(
		DanhGiaVeSinhXaNewFake model) {
		DanhGiaVeSinhXaNewFakeSoap soapModel = new DanhGiaVeSinhXaNewFakeSoap();

		soapModel.setId(model.getId());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setMaTinhStr(model.getMaTinhStr());
		soapModel.setMaHuyenStr(model.getMaHuyenStr());
		soapModel.setMaXaStr(model.getMaXaStr());
		soapModel.setNam(model.getNam());
		soapModel.setSoDan(model.getSoDan());
		soapModel.setTongSoHGD(model.getTongSoHGD());
		soapModel.setSoHGDCoNhaTieu(model.getSoHGDCoNhaTieu());
		soapModel.setSoHGDCoNhaTieuHVS(model.getSoHGDCoNhaTieuHVS());
		soapModel.setSoNhaTieuHVSXayMoi(model.getSoNhaTieuHVSXayMoi());
		soapModel.setTiLeHGDCoNhaTieu(model.getTiLeHGDCoNhaTieu());
		soapModel.setTiLeHGDCoNhaTieuHVS(model.getTiLeHGDCoNhaTieuHVS());
		soapModel.setTongSoTruongHoc(model.getTongSoTruongHoc());
		soapModel.setSoTruongHocHVS(model.getSoTruongHocHVS());
		soapModel.setTongSoTramYTe(model.getTongSoTramYTe());
		soapModel.setSoTramYTeHVS(model.getSoTramYTeHVS());
		soapModel.setTiLeTruongHocHVS(model.getTiLeTruongHocHVS());
		soapModel.setTiLeTramYTeHVS(model.getTiLeTramYTeHVS());
		soapModel.setKetLuanVSTX(model.getKetLuanVSTX());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setBaoCaoDLI(model.getBaoCaoDLI());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());
		soapModel.setDangKyVSTX(model.getDangKyVSTX());
		soapModel.setSoNhaTieuHVSMoi(model.getSoNhaTieuHVSMoi());

		return soapModel;
	}

	public static DanhGiaVeSinhXaNewFakeSoap[] toSoapModels(
		DanhGiaVeSinhXaNewFake[] models) {
		DanhGiaVeSinhXaNewFakeSoap[] soapModels = new DanhGiaVeSinhXaNewFakeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DanhGiaVeSinhXaNewFakeSoap[][] toSoapModels(
		DanhGiaVeSinhXaNewFake[][] models) {
		DanhGiaVeSinhXaNewFakeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DanhGiaVeSinhXaNewFakeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DanhGiaVeSinhXaNewFakeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DanhGiaVeSinhXaNewFakeSoap[] toSoapModels(
		List<DanhGiaVeSinhXaNewFake> models) {
		List<DanhGiaVeSinhXaNewFakeSoap> soapModels = new ArrayList<DanhGiaVeSinhXaNewFakeSoap>(models.size());

		for (DanhGiaVeSinhXaNewFake model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DanhGiaVeSinhXaNewFakeSoap[soapModels.size()]);
	}

	public DanhGiaVeSinhXaNewFakeSoap() {
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

	public String getMaTinhStr() {
		return _maTinhStr;
	}

	public void setMaTinhStr(String maTinhStr) {
		_maTinhStr = maTinhStr;
	}

	public String getMaHuyenStr() {
		return _maHuyenStr;
	}

	public void setMaHuyenStr(String maHuyenStr) {
		_maHuyenStr = maHuyenStr;
	}

	public String getMaXaStr() {
		return _maXaStr;
	}

	public void setMaXaStr(String maXaStr) {
		_maXaStr = maXaStr;
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

	public int getTongSoHGD() {
		return _tongSoHGD;
	}

	public void setTongSoHGD(int tongSoHGD) {
		_tongSoHGD = tongSoHGD;
	}

	public int getSoHGDCoNhaTieu() {
		return _soHGDCoNhaTieu;
	}

	public void setSoHGDCoNhaTieu(int soHGDCoNhaTieu) {
		_soHGDCoNhaTieu = soHGDCoNhaTieu;
	}

	public int getSoHGDCoNhaTieuHVS() {
		return _soHGDCoNhaTieuHVS;
	}

	public void setSoHGDCoNhaTieuHVS(int soHGDCoNhaTieuHVS) {
		_soHGDCoNhaTieuHVS = soHGDCoNhaTieuHVS;
	}

	public int getSoNhaTieuHVSXayMoi() {
		return _soNhaTieuHVSXayMoi;
	}

	public void setSoNhaTieuHVSXayMoi(int soNhaTieuHVSXayMoi) {
		_soNhaTieuHVSXayMoi = soNhaTieuHVSXayMoi;
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

	public int getTongSoTruongHoc() {
		return _tongSoTruongHoc;
	}

	public void setTongSoTruongHoc(int tongSoTruongHoc) {
		_tongSoTruongHoc = tongSoTruongHoc;
	}

	public int getSoTruongHocHVS() {
		return _soTruongHocHVS;
	}

	public void setSoTruongHocHVS(int soTruongHocHVS) {
		_soTruongHocHVS = soTruongHocHVS;
	}

	public int getTongSoTramYTe() {
		return _tongSoTramYTe;
	}

	public void setTongSoTramYTe(int tongSoTramYTe) {
		_tongSoTramYTe = tongSoTramYTe;
	}

	public int getSoTramYTeHVS() {
		return _soTramYTeHVS;
	}

	public void setSoTramYTeHVS(int soTramYTeHVS) {
		_soTramYTeHVS = soTramYTeHVS;
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

	public int getDangKyVSTX() {
		return _dangKyVSTX;
	}

	public void setDangKyVSTX(int dangKyVSTX) {
		_dangKyVSTX = dangKyVSTX;
	}

	public int getSoNhaTieuHVSMoi() {
		return _soNhaTieuHVSMoi;
	}

	public void setSoNhaTieuHVSMoi(int soNhaTieuHVSMoi) {
		_soNhaTieuHVSMoi = soNhaTieuHVSMoi;
	}

	private int _id;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _maTinhStr;
	private String _maHuyenStr;
	private String _maXaStr;
	private int _nam;
	private int _soDan;
	private int _tongSoHGD;
	private int _soHGDCoNhaTieu;
	private int _soHGDCoNhaTieuHVS;
	private int _soNhaTieuHVSXayMoi;
	private int _tiLeHGDCoNhaTieu;
	private int _tiLeHGDCoNhaTieuHVS;
	private int _tongSoTruongHoc;
	private int _soTruongHocHVS;
	private int _tongSoTramYTe;
	private int _soTramYTeHVS;
	private int _tiLeTruongHocHVS;
	private int _tiLeTramYTeHVS;
	private int _ketLuanVSTX;
	private String _ghiChu;
	private int _baoCaoDLI;
	private Date _ngayTao;
	private int _idNguoiTao;
	private int _dangKyVSTX;
	private int _soNhaTieuHVSMoi;
}