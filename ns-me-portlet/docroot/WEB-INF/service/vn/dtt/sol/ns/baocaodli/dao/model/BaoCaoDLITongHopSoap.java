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

package vn.dtt.sol.ns.baocaodli.dao.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.sol.ns.baocaodli.dao.service.http.BaoCaoDLITongHopServiceSoap}.
 *
 * @author HuyMQ
 * @see vn.dtt.sol.ns.baocaodli.dao.service.http.BaoCaoDLITongHopServiceSoap
 * @generated
 */
public class BaoCaoDLITongHopSoap implements Serializable {
	public static BaoCaoDLITongHopSoap toSoapModel(BaoCaoDLITongHop model) {
		BaoCaoDLITongHopSoap soapModel = new BaoCaoDLITongHopSoap();

		soapModel.setId(model.getId());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setNam(model.getNam());
		soapModel.setSoDauNoiTheoKeHoach(model.getSoDauNoiTheoKeHoach());
		soapModel.setSoDauNoiMoi(model.getSoDauNoiMoi());
		soapModel.setSoNhaTieuHVSTheoKH(model.getSoNhaTieuHVSTheoKH());
		soapModel.setSoNhaTieuHVSMoi(model.getSoNhaTieuHVSMoi());
		soapModel.setSoNguoiHuongLoiNuocSach(model.getSoNguoiHuongLoiNuocSach());
		soapModel.setSoXa(model.getSoXa());
		soapModel.setTiLeHGDCoNhaTieu(model.getTiLeHGDCoNhaTieu());
		soapModel.setTiLeHGDCoNhaTieuHVS(model.getTiLeHGDCoNhaTieuHVS());
		soapModel.setTiLeTruongHocHVS(model.getTiLeTruongHocHVS());
		soapModel.setTiLeTramYTeHVS(model.getTiLeTramYTeHVS());
		soapModel.setSoNguoiHuongLoiVSTX(model.getSoNguoiHuongLoiVSTX());
		soapModel.setKeHoachPheDuyet(model.getKeHoachPheDuyet());
		soapModel.setNgayDuyetKeHoach(model.getNgayDuyetKeHoach());
		soapModel.setBaoCaoChuongTrinh(model.getBaoCaoChuongTrinh());
		soapModel.setNgayDangTai(model.getNgayDangTai());
		soapModel.setNguoiLap(model.getNguoiLap());
		soapModel.setNguoiDuyet(model.getNguoiDuyet());
		soapModel.setSoBaoCao(model.getSoBaoCao());
		soapModel.setNgayBaoCao(model.getNgayBaoCao());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setLuuTruPdfTH(model.getLuuTruPdfTH());
		soapModel.setLuuTruPdf(model.getLuuTruPdf());
		soapModel.setLuuTruCsv(model.getLuuTruCsv());

		return soapModel;
	}

	public static BaoCaoDLITongHopSoap[] toSoapModels(BaoCaoDLITongHop[] models) {
		BaoCaoDLITongHopSoap[] soapModels = new BaoCaoDLITongHopSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BaoCaoDLITongHopSoap[][] toSoapModels(
		BaoCaoDLITongHop[][] models) {
		BaoCaoDLITongHopSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BaoCaoDLITongHopSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BaoCaoDLITongHopSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BaoCaoDLITongHopSoap[] toSoapModels(
		List<BaoCaoDLITongHop> models) {
		List<BaoCaoDLITongHopSoap> soapModels = new ArrayList<BaoCaoDLITongHopSoap>(models.size());

		for (BaoCaoDLITongHop model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BaoCaoDLITongHopSoap[soapModels.size()]);
	}

	public BaoCaoDLITongHopSoap() {
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

	public int getNam() {
		return _nam;
	}

	public void setNam(int nam) {
		_nam = nam;
	}

	public int getSoDauNoiTheoKeHoach() {
		return _soDauNoiTheoKeHoach;
	}

	public void setSoDauNoiTheoKeHoach(int soDauNoiTheoKeHoach) {
		_soDauNoiTheoKeHoach = soDauNoiTheoKeHoach;
	}

	public int getSoDauNoiMoi() {
		return _soDauNoiMoi;
	}

	public void setSoDauNoiMoi(int soDauNoiMoi) {
		_soDauNoiMoi = soDauNoiMoi;
	}

	public int getSoNhaTieuHVSTheoKH() {
		return _soNhaTieuHVSTheoKH;
	}

	public void setSoNhaTieuHVSTheoKH(int soNhaTieuHVSTheoKH) {
		_soNhaTieuHVSTheoKH = soNhaTieuHVSTheoKH;
	}

	public int getSoNhaTieuHVSMoi() {
		return _soNhaTieuHVSMoi;
	}

	public void setSoNhaTieuHVSMoi(int soNhaTieuHVSMoi) {
		_soNhaTieuHVSMoi = soNhaTieuHVSMoi;
	}

	public int getSoNguoiHuongLoiNuocSach() {
		return _soNguoiHuongLoiNuocSach;
	}

	public void setSoNguoiHuongLoiNuocSach(int soNguoiHuongLoiNuocSach) {
		_soNguoiHuongLoiNuocSach = soNguoiHuongLoiNuocSach;
	}

	public int getSoXa() {
		return _soXa;
	}

	public void setSoXa(int soXa) {
		_soXa = soXa;
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

	public int getSoNguoiHuongLoiVSTX() {
		return _soNguoiHuongLoiVSTX;
	}

	public void setSoNguoiHuongLoiVSTX(int soNguoiHuongLoiVSTX) {
		_soNguoiHuongLoiVSTX = soNguoiHuongLoiVSTX;
	}

	public String getKeHoachPheDuyet() {
		return _keHoachPheDuyet;
	}

	public void setKeHoachPheDuyet(String keHoachPheDuyet) {
		_keHoachPheDuyet = keHoachPheDuyet;
	}

	public Date getNgayDuyetKeHoach() {
		return _ngayDuyetKeHoach;
	}

	public void setNgayDuyetKeHoach(Date ngayDuyetKeHoach) {
		_ngayDuyetKeHoach = ngayDuyetKeHoach;
	}

	public String getBaoCaoChuongTrinh() {
		return _baoCaoChuongTrinh;
	}

	public void setBaoCaoChuongTrinh(String baoCaoChuongTrinh) {
		_baoCaoChuongTrinh = baoCaoChuongTrinh;
	}

	public Date getNgayDangTai() {
		return _ngayDangTai;
	}

	public void setNgayDangTai(Date ngayDangTai) {
		_ngayDangTai = ngayDangTai;
	}

	public String getNguoiLap() {
		return _nguoiLap;
	}

	public void setNguoiLap(String nguoiLap) {
		_nguoiLap = nguoiLap;
	}

	public String getNguoiDuyet() {
		return _nguoiDuyet;
	}

	public void setNguoiDuyet(String nguoiDuyet) {
		_nguoiDuyet = nguoiDuyet;
	}

	public String getSoBaoCao() {
		return _soBaoCao;
	}

	public void setSoBaoCao(String soBaoCao) {
		_soBaoCao = soBaoCao;
	}

	public Date getNgayBaoCao() {
		return _ngayBaoCao;
	}

	public void setNgayBaoCao(Date ngayBaoCao) {
		_ngayBaoCao = ngayBaoCao;
	}

	public int getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;
	}

	public int getLuuTruPdfTH() {
		return _luuTruPdfTH;
	}

	public void setLuuTruPdfTH(int luuTruPdfTH) {
		_luuTruPdfTH = luuTruPdfTH;
	}

	public int getLuuTruPdf() {
		return _luuTruPdf;
	}

	public void setLuuTruPdf(int luuTruPdf) {
		_luuTruPdf = luuTruPdf;
	}

	public int getLuuTruCsv() {
		return _luuTruCsv;
	}

	public void setLuuTruCsv(int luuTruCsv) {
		_luuTruCsv = luuTruCsv;
	}

	private long _id;
	private String _maTinh;
	private int _nam;
	private int _soDauNoiTheoKeHoach;
	private int _soDauNoiMoi;
	private int _soNhaTieuHVSTheoKH;
	private int _soNhaTieuHVSMoi;
	private int _soNguoiHuongLoiNuocSach;
	private int _soXa;
	private int _tiLeHGDCoNhaTieu;
	private int _tiLeHGDCoNhaTieuHVS;
	private int _tiLeTruongHocHVS;
	private int _tiLeTramYTeHVS;
	private int _soNguoiHuongLoiVSTX;
	private String _keHoachPheDuyet;
	private Date _ngayDuyetKeHoach;
	private String _baoCaoChuongTrinh;
	private Date _ngayDangTai;
	private String _nguoiLap;
	private String _nguoiDuyet;
	private String _soBaoCao;
	private Date _ngayBaoCao;
	private int _trangThai;
	private int _luuTruPdfTH;
	private int _luuTruPdf;
	private int _luuTruCsv;
}