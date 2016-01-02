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
public class ThongTinKiemDemCongTrinhSoap implements Serializable {
	public static ThongTinKiemDemCongTrinhSoap toSoapModel(
		ThongTinKiemDemCongTrinh model) {
		ThongTinKiemDemCongTrinhSoap soapModel = new ThongTinKiemDemCongTrinhSoap();

		soapModel.setId(model.getId());
		soapModel.setVeSinhConTrinhId(model.getVeSinhConTrinhId());
		soapModel.setKeHoachKiemDemVeSinhId(model.getKeHoachKiemDemVeSinhId());
		soapModel.setTenCongTrinh(model.getTenCongTrinh());
		soapModel.setLoaiCongTrinh(model.getLoaiCongTrinh());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setDiaChi(model.getDiaChi());
		soapModel.setNgayKiemDem(model.getNgayKiemDem());
		soapModel.setHoTenNguoiTraLoi(model.getHoTenNguoiTraLoi());
		soapModel.setSoDienThoai(model.getSoDienThoai());
		soapModel.setGioiTinhNguoiTraLoi(model.getGioiTinhNguoiTraLoi());
		soapModel.setVaiTroChucDanh(model.getVaiTroChucDanh());
		soapModel.setSoCa(model.getSoCa());
		soapModel.setSoNguoiTrongCa(model.getSoNguoiTrongCa());
		soapModel.setKinhDo(model.getKinhDo());
		soapModel.setViDo(model.getViDo());
		soapModel.setLoaiNguonNuoc(model.getLoaiNguonNuoc());
		soapModel.setDaTQCVN(model.getDaTQCVN());
		soapModel.setDatTieuChuanHVS(model.getDatTieuChuanHVS());
		soapModel.setAnhChupChungNhan(model.getAnhChupChungNhan());
		soapModel.setSoNhaTieu(model.getSoNhaTieu());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setDaKetThucDieuTra(model.getDaKetThucDieuTra());
		soapModel.setLyDoKhongHoanThanh(model.getLyDoKhongHoanThanh());
		soapModel.setImei(model.getImei());
		soapModel.setTaiKhoan(model.getTaiKhoan());
		soapModel.setDanhGiaKiemDem(model.getDanhGiaKiemDem());
		soapModel.setSavePoint(model.getSavePoint());

		return soapModel;
	}

	public static ThongTinKiemDemCongTrinhSoap[] toSoapModels(
		ThongTinKiemDemCongTrinh[] models) {
		ThongTinKiemDemCongTrinhSoap[] soapModels = new ThongTinKiemDemCongTrinhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ThongTinKiemDemCongTrinhSoap[][] toSoapModels(
		ThongTinKiemDemCongTrinh[][] models) {
		ThongTinKiemDemCongTrinhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ThongTinKiemDemCongTrinhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ThongTinKiemDemCongTrinhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ThongTinKiemDemCongTrinhSoap[] toSoapModels(
		List<ThongTinKiemDemCongTrinh> models) {
		List<ThongTinKiemDemCongTrinhSoap> soapModels = new ArrayList<ThongTinKiemDemCongTrinhSoap>(models.size());

		for (ThongTinKiemDemCongTrinh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ThongTinKiemDemCongTrinhSoap[soapModels.size()]);
	}

	public ThongTinKiemDemCongTrinhSoap() {
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

	public int getVeSinhConTrinhId() {
		return _veSinhConTrinhId;
	}

	public void setVeSinhConTrinhId(int veSinhConTrinhId) {
		_veSinhConTrinhId = veSinhConTrinhId;
	}

	public int getKeHoachKiemDemVeSinhId() {
		return _keHoachKiemDemVeSinhId;
	}

	public void setKeHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId) {
		_keHoachKiemDemVeSinhId = keHoachKiemDemVeSinhId;
	}

	public String getTenCongTrinh() {
		return _tenCongTrinh;
	}

	public void setTenCongTrinh(String tenCongTrinh) {
		_tenCongTrinh = tenCongTrinh;
	}

	public int getLoaiCongTrinh() {
		return _loaiCongTrinh;
	}

	public void setLoaiCongTrinh(int loaiCongTrinh) {
		_loaiCongTrinh = loaiCongTrinh;
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

	public String getDiaChi() {
		return _diaChi;
	}

	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;
	}

	public Date getNgayKiemDem() {
		return _ngayKiemDem;
	}

	public void setNgayKiemDem(Date ngayKiemDem) {
		_ngayKiemDem = ngayKiemDem;
	}

	public String getHoTenNguoiTraLoi() {
		return _hoTenNguoiTraLoi;
	}

	public void setHoTenNguoiTraLoi(String hoTenNguoiTraLoi) {
		_hoTenNguoiTraLoi = hoTenNguoiTraLoi;
	}

	public String getSoDienThoai() {
		return _soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		_soDienThoai = soDienThoai;
	}

	public String getGioiTinhNguoiTraLoi() {
		return _gioiTinhNguoiTraLoi;
	}

	public void setGioiTinhNguoiTraLoi(String gioiTinhNguoiTraLoi) {
		_gioiTinhNguoiTraLoi = gioiTinhNguoiTraLoi;
	}

	public String getVaiTroChucDanh() {
		return _vaiTroChucDanh;
	}

	public void setVaiTroChucDanh(String vaiTroChucDanh) {
		_vaiTroChucDanh = vaiTroChucDanh;
	}

	public int getSoCa() {
		return _soCa;
	}

	public void setSoCa(int soCa) {
		_soCa = soCa;
	}

	public int getSoNguoiTrongCa() {
		return _soNguoiTrongCa;
	}

	public void setSoNguoiTrongCa(int soNguoiTrongCa) {
		_soNguoiTrongCa = soNguoiTrongCa;
	}

	public String getKinhDo() {
		return _kinhDo;
	}

	public void setKinhDo(String kinhDo) {
		_kinhDo = kinhDo;
	}

	public String getViDo() {
		return _viDo;
	}

	public void setViDo(String viDo) {
		_viDo = viDo;
	}

	public String getLoaiNguonNuoc() {
		return _loaiNguonNuoc;
	}

	public void setLoaiNguonNuoc(String loaiNguonNuoc) {
		_loaiNguonNuoc = loaiNguonNuoc;
	}

	public int getDaTQCVN() {
		return _daTQCVN;
	}

	public void setDaTQCVN(int daTQCVN) {
		_daTQCVN = daTQCVN;
	}

	public int getDatTieuChuanHVS() {
		return _datTieuChuanHVS;
	}

	public void setDatTieuChuanHVS(int datTieuChuanHVS) {
		_datTieuChuanHVS = datTieuChuanHVS;
	}

	public String getAnhChupChungNhan() {
		return _anhChupChungNhan;
	}

	public void setAnhChupChungNhan(String anhChupChungNhan) {
		_anhChupChungNhan = anhChupChungNhan;
	}

	public int getSoNhaTieu() {
		return _soNhaTieu;
	}

	public void setSoNhaTieu(int soNhaTieu) {
		_soNhaTieu = soNhaTieu;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public int getDaKetThucDieuTra() {
		return _daKetThucDieuTra;
	}

	public void setDaKetThucDieuTra(int daKetThucDieuTra) {
		_daKetThucDieuTra = daKetThucDieuTra;
	}

	public String getLyDoKhongHoanThanh() {
		return _lyDoKhongHoanThanh;
	}

	public void setLyDoKhongHoanThanh(String lyDoKhongHoanThanh) {
		_lyDoKhongHoanThanh = lyDoKhongHoanThanh;
	}

	public String getImei() {
		return _imei;
	}

	public void setImei(String imei) {
		_imei = imei;
	}

	public String getTaiKhoan() {
		return _taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		_taiKhoan = taiKhoan;
	}

	public int getDanhGiaKiemDem() {
		return _danhGiaKiemDem;
	}

	public void setDanhGiaKiemDem(int danhGiaKiemDem) {
		_danhGiaKiemDem = danhGiaKiemDem;
	}

	public Date getSavePoint() {
		return _savePoint;
	}

	public void setSavePoint(Date savePoint) {
		_savePoint = savePoint;
	}

	private int _id;
	private int _veSinhConTrinhId;
	private int _keHoachKiemDemVeSinhId;
	private String _tenCongTrinh;
	private int _loaiCongTrinh;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _diaChi;
	private Date _ngayKiemDem;
	private String _hoTenNguoiTraLoi;
	private String _soDienThoai;
	private String _gioiTinhNguoiTraLoi;
	private String _vaiTroChucDanh;
	private int _soCa;
	private int _soNguoiTrongCa;
	private String _kinhDo;
	private String _viDo;
	private String _loaiNguonNuoc;
	private int _daTQCVN;
	private int _datTieuChuanHVS;
	private String _anhChupChungNhan;
	private int _soNhaTieu;
	private String _ghiChu;
	private int _daKetThucDieuTra;
	private String _lyDoKhongHoanThanh;
	private String _imei;
	private String _taiKhoan;
	private int _danhGiaKiemDem;
	private Date _savePoint;
}