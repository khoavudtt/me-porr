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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author BinhTH
 * @generated
 */
public class ChiTietKiemDemCongTrinhSoap implements Serializable {
	public static ChiTietKiemDemCongTrinhSoap toSoapModel(
		ChiTietKiemDemCongTrinh model) {
		ChiTietKiemDemCongTrinhSoap soapModel = new ChiTietKiemDemCongTrinhSoap();

		soapModel.setId(model.getId());
		soapModel.setThongTinKiemDemCongTrinhId(model.getThongTinKiemDemCongTrinhId());
		soapModel.setSoHoTieu(model.getSoHoTieu());
		soapModel.setLoaiNhaTieu(model.getLoaiNhaTieu());
		soapModel.setAnhToanCanh(model.getAnhToanCanh());
		soapModel.setAnhTrongNhaTieu(model.getAnhTrongNhaTieu());
		soapModel.setVeSinhSachSe(model.getVeSinhSachSe());
		soapModel.setDeLamVeSinh(model.getDeLamVeSinh());
		soapModel.setMuiVeSinh(model.getMuiVeSinh());
		soapModel.setPhiaTrenKinDao(model.getPhiaTrenKinDao());
		soapModel.setDuCheMuaGio(model.getDuCheMuaGio());
		soapModel.setSanCaoTrenToiThieu(model.getSanCaoTrenToiThieu());
		soapModel.setCoCongTrinhRuaTay(model.getCoCongTrinhRuaTay());
		soapModel.setChiTietCongTrinhRuaTay(model.getChiTietCongTrinhRuaTay());
		soapModel.setAnhBeChua(model.getAnhBeChua());
		soapModel.setNapBeConTot(model.getNapBeConTot());
		soapModel.setCuaPhanBitKin(model.getCuaPhanBitKin());
		soapModel.setTranRaNgoai(model.getTranRaNgoai());
		soapModel.setNuocThaiDiDau(model.getNuocThaiDiDau());
		soapModel.setKhoangCachNguonNuoc(model.getKhoangCachNguonNuoc());
		soapModel.setNgapKhiMuaLon(model.getNgapKhiMuaLon());
		soapModel.setTenCongTrinh(model.getTenCongTrinh());

		return soapModel;
	}

	public static ChiTietKiemDemCongTrinhSoap[] toSoapModels(
		ChiTietKiemDemCongTrinh[] models) {
		ChiTietKiemDemCongTrinhSoap[] soapModels = new ChiTietKiemDemCongTrinhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ChiTietKiemDemCongTrinhSoap[][] toSoapModels(
		ChiTietKiemDemCongTrinh[][] models) {
		ChiTietKiemDemCongTrinhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ChiTietKiemDemCongTrinhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ChiTietKiemDemCongTrinhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ChiTietKiemDemCongTrinhSoap[] toSoapModels(
		List<ChiTietKiemDemCongTrinh> models) {
		List<ChiTietKiemDemCongTrinhSoap> soapModels = new ArrayList<ChiTietKiemDemCongTrinhSoap>(models.size());

		for (ChiTietKiemDemCongTrinh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ChiTietKiemDemCongTrinhSoap[soapModels.size()]);
	}

	public ChiTietKiemDemCongTrinhSoap() {
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

	public int getThongTinKiemDemCongTrinhId() {
		return _thongTinKiemDemCongTrinhId;
	}

	public void setThongTinKiemDemCongTrinhId(int thongTinKiemDemCongTrinhId) {
		_thongTinKiemDemCongTrinhId = thongTinKiemDemCongTrinhId;
	}

	public int getSoHoTieu() {
		return _soHoTieu;
	}

	public void setSoHoTieu(int soHoTieu) {
		_soHoTieu = soHoTieu;
	}

	public String getLoaiNhaTieu() {
		return _loaiNhaTieu;
	}

	public void setLoaiNhaTieu(String loaiNhaTieu) {
		_loaiNhaTieu = loaiNhaTieu;
	}

	public String getAnhToanCanh() {
		return _anhToanCanh;
	}

	public void setAnhToanCanh(String anhToanCanh) {
		_anhToanCanh = anhToanCanh;
	}

	public String getAnhTrongNhaTieu() {
		return _anhTrongNhaTieu;
	}

	public void setAnhTrongNhaTieu(String anhTrongNhaTieu) {
		_anhTrongNhaTieu = anhTrongNhaTieu;
	}

	public int getVeSinhSachSe() {
		return _veSinhSachSe;
	}

	public void setVeSinhSachSe(int veSinhSachSe) {
		_veSinhSachSe = veSinhSachSe;
	}

	public int getDeLamVeSinh() {
		return _deLamVeSinh;
	}

	public void setDeLamVeSinh(int deLamVeSinh) {
		_deLamVeSinh = deLamVeSinh;
	}

	public int getMuiVeSinh() {
		return _muiVeSinh;
	}

	public void setMuiVeSinh(int muiVeSinh) {
		_muiVeSinh = muiVeSinh;
	}

	public int getPhiaTrenKinDao() {
		return _phiaTrenKinDao;
	}

	public void setPhiaTrenKinDao(int phiaTrenKinDao) {
		_phiaTrenKinDao = phiaTrenKinDao;
	}

	public int getDuCheMuaGio() {
		return _duCheMuaGio;
	}

	public void setDuCheMuaGio(int duCheMuaGio) {
		_duCheMuaGio = duCheMuaGio;
	}

	public int getSanCaoTrenToiThieu() {
		return _sanCaoTrenToiThieu;
	}

	public void setSanCaoTrenToiThieu(int sanCaoTrenToiThieu) {
		_sanCaoTrenToiThieu = sanCaoTrenToiThieu;
	}

	public int getCoCongTrinhRuaTay() {
		return _coCongTrinhRuaTay;
	}

	public void setCoCongTrinhRuaTay(int coCongTrinhRuaTay) {
		_coCongTrinhRuaTay = coCongTrinhRuaTay;
	}

	public String getChiTietCongTrinhRuaTay() {
		return _chiTietCongTrinhRuaTay;
	}

	public void setChiTietCongTrinhRuaTay(String chiTietCongTrinhRuaTay) {
		_chiTietCongTrinhRuaTay = chiTietCongTrinhRuaTay;
	}

	public String getAnhBeChua() {
		return _anhBeChua;
	}

	public void setAnhBeChua(String anhBeChua) {
		_anhBeChua = anhBeChua;
	}

	public int getNapBeConTot() {
		return _napBeConTot;
	}

	public void setNapBeConTot(int napBeConTot) {
		_napBeConTot = napBeConTot;
	}

	public int getCuaPhanBitKin() {
		return _cuaPhanBitKin;
	}

	public void setCuaPhanBitKin(int cuaPhanBitKin) {
		_cuaPhanBitKin = cuaPhanBitKin;
	}

	public int getTranRaNgoai() {
		return _tranRaNgoai;
	}

	public void setTranRaNgoai(int tranRaNgoai) {
		_tranRaNgoai = tranRaNgoai;
	}

	public int getNuocThaiDiDau() {
		return _nuocThaiDiDau;
	}

	public void setNuocThaiDiDau(int nuocThaiDiDau) {
		_nuocThaiDiDau = nuocThaiDiDau;
	}

	public int getKhoangCachNguonNuoc() {
		return _khoangCachNguonNuoc;
	}

	public void setKhoangCachNguonNuoc(int khoangCachNguonNuoc) {
		_khoangCachNguonNuoc = khoangCachNguonNuoc;
	}

	public int getNgapKhiMuaLon() {
		return _ngapKhiMuaLon;
	}

	public void setNgapKhiMuaLon(int ngapKhiMuaLon) {
		_ngapKhiMuaLon = ngapKhiMuaLon;
	}

	public String getTenCongTrinh() {
		return _tenCongTrinh;
	}

	public void setTenCongTrinh(String tenCongTrinh) {
		_tenCongTrinh = tenCongTrinh;
	}

	private int _id;
	private int _thongTinKiemDemCongTrinhId;
	private int _soHoTieu;
	private String _loaiNhaTieu;
	private String _anhToanCanh;
	private String _anhTrongNhaTieu;
	private int _veSinhSachSe;
	private int _deLamVeSinh;
	private int _muiVeSinh;
	private int _phiaTrenKinDao;
	private int _duCheMuaGio;
	private int _sanCaoTrenToiThieu;
	private int _coCongTrinhRuaTay;
	private String _chiTietCongTrinhRuaTay;
	private String _anhBeChua;
	private int _napBeConTot;
	private int _cuaPhanBitKin;
	private int _tranRaNgoai;
	private int _nuocThaiDiDau;
	private int _khoangCachNguonNuoc;
	private int _ngapKhiMuaLon;
	private String _tenCongTrinh;
}