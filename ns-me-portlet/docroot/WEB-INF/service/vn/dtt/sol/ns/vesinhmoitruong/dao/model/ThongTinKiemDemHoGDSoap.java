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
public class ThongTinKiemDemHoGDSoap implements Serializable {
	public static ThongTinKiemDemHoGDSoap toSoapModel(ThongTinKiemDemHoGD model) {
		ThongTinKiemDemHoGDSoap soapModel = new ThongTinKiemDemHoGDSoap();

		soapModel.setId(model.getId());
		soapModel.setVeSinhGiaDinhId(model.getVeSinhGiaDinhId());
		soapModel.setKeHoachKiemDemVeSinhId(model.getKeHoachKiemDemVeSinhId());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setThonXom(model.getThonXom());
		soapModel.setTenChuHo(model.getTenChuHo());
		soapModel.setGioiTinhChuHo(model.getGioiTinhChuHo());
		soapModel.setNgayKiemDem(model.getNgayKiemDem());
		soapModel.setTimThayNha(model.getTimThayNha());
		soapModel.setCoNguoiONha(model.getCoNguoiONha());
		soapModel.setSoNguoiTrongHo(model.getSoNguoiTrongHo());
		soapModel.setHoTenNguoiTraLoi(model.getHoTenNguoiTraLoi());
		soapModel.setLaChuHoKhong(model.getLaChuHoKhong());
		soapModel.setGioiTinhNguoiTraLoi(model.getGioiTinhNguoiTraLoi());
		soapModel.setTenDanToc(model.getTenDanToc());
		soapModel.setKinhDo(model.getKinhDo());
		soapModel.setViDo(model.getViDo());
		soapModel.setThanhPhanHoGD(model.getThanhPhanHoGD());
		soapModel.setChuHoDungDS(model.getChuHoDungDS());
		soapModel.setLyDoKhongDungDS(model.getLyDoKhongDungDS());
		soapModel.setTenChuHoHienTai(model.getTenChuHoHienTai());
		soapModel.setGioiTinhChuHoHienTai(model.getGioiTinhChuHoHienTai());
		soapModel.setCoNhaTieu(model.getCoNhaTieu());
		soapModel.setLoaiNguonNuoc(model.getLoaiNguonNuoc());
		soapModel.setLoaiNhaTieu(model.getLoaiNhaTieu());
		soapModel.setAnhToanCanh(model.getAnhToanCanh());
		soapModel.setAnhTrongNhaTieu(model.getAnhTrongNhaTieu());
		soapModel.setThangXayDung(model.getThangXayDung());
		soapModel.setNamXayDung(model.getNamXayDung());
		soapModel.setNguonVon(model.getNguonVon());
		soapModel.setChiTietVonVay(model.getChiTietVonVay());
		soapModel.setDuocCaiTao(model.getDuocCaiTao());
		soapModel.setLoaiNhaTieuCu(model.getLoaiNhaTieuCu());
		soapModel.setAnhBeChua(model.getAnhBeChua());
		soapModel.setVeSinhSachSe(model.getVeSinhSachSe());
		soapModel.setDeLamVeSinh(model.getDeLamVeSinh());
		soapModel.setMuiVeSinh(model.getMuiVeSinh());
		soapModel.setPhiaTrenKinDao(model.getPhiaTrenKinDao());
		soapModel.setDuCheMuaGio(model.getDuCheMuaGio());
		soapModel.setSanCaoTrenToiThieu(model.getSanCaoTrenToiThieu());
		soapModel.setNapBeConTot(model.getNapBeConTot());
		soapModel.setCuaPhanBitKin(model.getCuaPhanBitKin());
		soapModel.setTranRaNgoai(model.getTranRaNgoai());
		soapModel.setNuocThaiDiDau(model.getNuocThaiDiDau());
		soapModel.setKhoangCachNguonNuoc(model.getKhoangCachNguonNuoc());
		soapModel.setNgapKhiMuaLon(model.getNgapKhiMuaLon());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setDaKetThucDieuTra(model.getDaKetThucDieuTra());
		soapModel.setLyDoKhongHoanThanh(model.getLyDoKhongHoanThanh());
		soapModel.setImei(model.getImei());
		soapModel.setTaiKhoan(model.getTaiKhoan());
		soapModel.setDanhGiaKiemDem(model.getDanhGiaKiemDem());
		soapModel.setSavePoint(model.getSavePoint());

		return soapModel;
	}

	public static ThongTinKiemDemHoGDSoap[] toSoapModels(
		ThongTinKiemDemHoGD[] models) {
		ThongTinKiemDemHoGDSoap[] soapModels = new ThongTinKiemDemHoGDSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ThongTinKiemDemHoGDSoap[][] toSoapModels(
		ThongTinKiemDemHoGD[][] models) {
		ThongTinKiemDemHoGDSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ThongTinKiemDemHoGDSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ThongTinKiemDemHoGDSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ThongTinKiemDemHoGDSoap[] toSoapModels(
		List<ThongTinKiemDemHoGD> models) {
		List<ThongTinKiemDemHoGDSoap> soapModels = new ArrayList<ThongTinKiemDemHoGDSoap>(models.size());

		for (ThongTinKiemDemHoGD model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ThongTinKiemDemHoGDSoap[soapModels.size()]);
	}

	public ThongTinKiemDemHoGDSoap() {
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

	public int getVeSinhGiaDinhId() {
		return _veSinhGiaDinhId;
	}

	public void setVeSinhGiaDinhId(int veSinhGiaDinhId) {
		_veSinhGiaDinhId = veSinhGiaDinhId;
	}

	public int getKeHoachKiemDemVeSinhId() {
		return _keHoachKiemDemVeSinhId;
	}

	public void setKeHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId) {
		_keHoachKiemDemVeSinhId = keHoachKiemDemVeSinhId;
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

	public String getThonXom() {
		return _thonXom;
	}

	public void setThonXom(String thonXom) {
		_thonXom = thonXom;
	}

	public String getTenChuHo() {
		return _tenChuHo;
	}

	public void setTenChuHo(String tenChuHo) {
		_tenChuHo = tenChuHo;
	}

	public int getGioiTinhChuHo() {
		return _gioiTinhChuHo;
	}

	public void setGioiTinhChuHo(int gioiTinhChuHo) {
		_gioiTinhChuHo = gioiTinhChuHo;
	}

	public Date getNgayKiemDem() {
		return _ngayKiemDem;
	}

	public void setNgayKiemDem(Date ngayKiemDem) {
		_ngayKiemDem = ngayKiemDem;
	}

	public int getTimThayNha() {
		return _timThayNha;
	}

	public void setTimThayNha(int timThayNha) {
		_timThayNha = timThayNha;
	}

	public int getCoNguoiONha() {
		return _coNguoiONha;
	}

	public void setCoNguoiONha(int coNguoiONha) {
		_coNguoiONha = coNguoiONha;
	}

	public int getSoNguoiTrongHo() {
		return _soNguoiTrongHo;
	}

	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		_soNguoiTrongHo = soNguoiTrongHo;
	}

	public String getHoTenNguoiTraLoi() {
		return _hoTenNguoiTraLoi;
	}

	public void setHoTenNguoiTraLoi(String hoTenNguoiTraLoi) {
		_hoTenNguoiTraLoi = hoTenNguoiTraLoi;
	}

	public int getLaChuHoKhong() {
		return _laChuHoKhong;
	}

	public void setLaChuHoKhong(int laChuHoKhong) {
		_laChuHoKhong = laChuHoKhong;
	}

	public String getGioiTinhNguoiTraLoi() {
		return _gioiTinhNguoiTraLoi;
	}

	public void setGioiTinhNguoiTraLoi(String gioiTinhNguoiTraLoi) {
		_gioiTinhNguoiTraLoi = gioiTinhNguoiTraLoi;
	}

	public String getTenDanToc() {
		return _tenDanToc;
	}

	public void setTenDanToc(String tenDanToc) {
		_tenDanToc = tenDanToc;
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

	public int getThanhPhanHoGD() {
		return _thanhPhanHoGD;
	}

	public void setThanhPhanHoGD(int thanhPhanHoGD) {
		_thanhPhanHoGD = thanhPhanHoGD;
	}

	public int getChuHoDungDS() {
		return _chuHoDungDS;
	}

	public void setChuHoDungDS(int chuHoDungDS) {
		_chuHoDungDS = chuHoDungDS;
	}

	public String getLyDoKhongDungDS() {
		return _lyDoKhongDungDS;
	}

	public void setLyDoKhongDungDS(String lyDoKhongDungDS) {
		_lyDoKhongDungDS = lyDoKhongDungDS;
	}

	public String getTenChuHoHienTai() {
		return _tenChuHoHienTai;
	}

	public void setTenChuHoHienTai(String tenChuHoHienTai) {
		_tenChuHoHienTai = tenChuHoHienTai;
	}

	public int getGioiTinhChuHoHienTai() {
		return _gioiTinhChuHoHienTai;
	}

	public void setGioiTinhChuHoHienTai(int gioiTinhChuHoHienTai) {
		_gioiTinhChuHoHienTai = gioiTinhChuHoHienTai;
	}

	public int getCoNhaTieu() {
		return _coNhaTieu;
	}

	public void setCoNhaTieu(int coNhaTieu) {
		_coNhaTieu = coNhaTieu;
	}

	public String getLoaiNguonNuoc() {
		return _loaiNguonNuoc;
	}

	public void setLoaiNguonNuoc(String loaiNguonNuoc) {
		_loaiNguonNuoc = loaiNguonNuoc;
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

	public int getThangXayDung() {
		return _thangXayDung;
	}

	public void setThangXayDung(int thangXayDung) {
		_thangXayDung = thangXayDung;
	}

	public int getNamXayDung() {
		return _namXayDung;
	}

	public void setNamXayDung(int namXayDung) {
		_namXayDung = namXayDung;
	}

	public int getNguonVon() {
		return _nguonVon;
	}

	public void setNguonVon(int nguonVon) {
		_nguonVon = nguonVon;
	}

	public String getChiTietVonVay() {
		return _chiTietVonVay;
	}

	public void setChiTietVonVay(String chiTietVonVay) {
		_chiTietVonVay = chiTietVonVay;
	}

	public int getDuocCaiTao() {
		return _duocCaiTao;
	}

	public void setDuocCaiTao(int duocCaiTao) {
		_duocCaiTao = duocCaiTao;
	}

	public String getLoaiNhaTieuCu() {
		return _loaiNhaTieuCu;
	}

	public void setLoaiNhaTieuCu(String loaiNhaTieuCu) {
		_loaiNhaTieuCu = loaiNhaTieuCu;
	}

	public String getAnhBeChua() {
		return _anhBeChua;
	}

	public void setAnhBeChua(String anhBeChua) {
		_anhBeChua = anhBeChua;
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
	private int _veSinhGiaDinhId;
	private int _keHoachKiemDemVeSinhId;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _thonXom;
	private String _tenChuHo;
	private int _gioiTinhChuHo;
	private Date _ngayKiemDem;
	private int _timThayNha;
	private int _coNguoiONha;
	private int _soNguoiTrongHo;
	private String _hoTenNguoiTraLoi;
	private int _laChuHoKhong;
	private String _gioiTinhNguoiTraLoi;
	private String _tenDanToc;
	private String _kinhDo;
	private String _viDo;
	private int _thanhPhanHoGD;
	private int _chuHoDungDS;
	private String _lyDoKhongDungDS;
	private String _tenChuHoHienTai;
	private int _gioiTinhChuHoHienTai;
	private int _coNhaTieu;
	private String _loaiNguonNuoc;
	private String _loaiNhaTieu;
	private String _anhToanCanh;
	private String _anhTrongNhaTieu;
	private int _thangXayDung;
	private int _namXayDung;
	private int _nguonVon;
	private String _chiTietVonVay;
	private int _duocCaiTao;
	private String _loaiNhaTieuCu;
	private String _anhBeChua;
	private int _veSinhSachSe;
	private int _deLamVeSinh;
	private int _muiVeSinh;
	private int _phiaTrenKinDao;
	private int _duCheMuaGio;
	private int _sanCaoTrenToiThieu;
	private int _napBeConTot;
	private int _cuaPhanBitKin;
	private int _tranRaNgoai;
	private int _nuocThaiDiDau;
	private int _khoangCachNguonNuoc;
	private int _ngapKhiMuaLon;
	private String _ghiChu;
	private int _daKetThucDieuTra;
	private String _lyDoKhongHoanThanh;
	private String _imei;
	private String _taiKhoan;
	private int _danhGiaKiemDem;
	private Date _savePoint;
}