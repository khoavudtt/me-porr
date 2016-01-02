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
public class THONGTINKIEMDEMNUOCSoap implements Serializable {
	public static THONGTINKIEMDEMNUOCSoap toSoapModel(THONGTINKIEMDEMNUOC model) {
		THONGTINKIEMDEMNUOCSoap soapModel = new THONGTINKIEMDEMNUOCSoap();

		soapModel.setId(model.getId());
		soapModel.setDauNoiNuocId(model.getDauNoiNuocId());
		soapModel.setKeHoachKiemDemNuocId(model.getKeHoachKiemDemNuocId());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setThonXom(model.getThonXom());
		soapModel.setTenChuHo(model.getTenChuHo());
		soapModel.setGioiTinhChuHo(model.getGioiTinhChuHo());
		soapModel.setNgayKiemDem(model.getNgayKiemDem());
		soapModel.setTimThayNha(model.getTimThayNha());
		soapModel.setCoNguoiONha(model.getCoNguoiONha());
		soapModel.setHoTenNguoiTraLoi(model.getHoTenNguoiTraLoi());
		soapModel.setLaChuHoKhong(model.getLaChuHoKhong());
		soapModel.setGioiTinhNguoiTraLoi(model.getGioiTinhNguoiTraLoi());
		soapModel.setTenDanToc(model.getTenDanToc());
		soapModel.setKinhDo(model.getKinhDo());
		soapModel.setViDo(model.getViDo());
		soapModel.setSoNguoiTrongHo(model.getSoNguoiTrongHo());
		soapModel.setThanhPhanHoGd(model.getThanhPhanHoGd());
		soapModel.setChuHoDungDs(model.getChuHoDungDs());
		soapModel.setLyDoKhongDungDs(model.getLyDoKhongDungDs());
		soapModel.setTenChuHoHienTai(model.getTenChuHoHienTai());
		soapModel.setGioiTinhChuHoHienTai(model.getGioiTinhChuHoHienTai());
		soapModel.setDauNoiChua(model.getDauNoiChua());
		soapModel.setAnhDauNoi(model.getAnhDauNoi());
		soapModel.setThoiGianDauHopDong(model.getThoiGianDauHopDong());
		soapModel.setThoiGianDauNoiThucTe(model.getThoiGianDauNoiThucTe());
		soapModel.setVoiNuocChayKhong(model.getVoiNuocChayKhong());
		soapModel.setNuocTrongKhong(model.getNuocTrongKhong());
		soapModel.setMauNuoc(model.getMauNuoc());
		soapModel.setMuiNuoc(model.getMuiNuoc());
		soapModel.setViNuoc(model.getViNuoc());
		soapModel.setLoaiKhac(model.getLoaiKhac());
		soapModel.setDaTungDucKhong(model.getDaTungDucKhong());
		soapModel.setMauNuocTungCo(model.getMauNuocTungCo());
		soapModel.setMuiNuocTungCo(model.getMuiNuocTungCo());
		soapModel.setViNuocTungCo(model.getViNuocTungCo());
		soapModel.setLoaiKhacTungCo(model.getLoaiKhacTungCo());
		soapModel.setCoBeChuaNuoc(model.getCoBeChuaNuoc());
		soapModel.setTinhTrangBe(model.getTinhTrangBe());
		soapModel.setAnhBeChua(model.getAnhBeChua());
		soapModel.setBiMatNuoc(model.getBiMatNuoc());
		soapModel.setSoLanMatNuoc(model.getSoLanMatNuoc());
		soapModel.setSoGioTrungBinh(model.getSoGioTrungBinh());
		soapModel.setSoSeRyDongHo(model.getSoSeRyDongHo());
		soapModel.setChiSoDongHo(model.getChiSoDongHo());
		soapModel.setAnhDongHo(model.getAnhDongHo());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setDaKetThucDieuTra(model.getDaKetThucDieuTra());
		soapModel.setLyDoKhongHoanThanh(model.getLyDoKhongHoanThanh());
		soapModel.setIMei(model.getIMei());
		soapModel.setTaiKhoan(model.getTaiKhoan());
		soapModel.setDanhGiaKiemDem(model.getDanhGiaKiemDem());

		return soapModel;
	}

	public static THONGTINKIEMDEMNUOCSoap[] toSoapModels(
		THONGTINKIEMDEMNUOC[] models) {
		THONGTINKIEMDEMNUOCSoap[] soapModels = new THONGTINKIEMDEMNUOCSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static THONGTINKIEMDEMNUOCSoap[][] toSoapModels(
		THONGTINKIEMDEMNUOC[][] models) {
		THONGTINKIEMDEMNUOCSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new THONGTINKIEMDEMNUOCSoap[models.length][models[0].length];
		}
		else {
			soapModels = new THONGTINKIEMDEMNUOCSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static THONGTINKIEMDEMNUOCSoap[] toSoapModels(
		List<THONGTINKIEMDEMNUOC> models) {
		List<THONGTINKIEMDEMNUOCSoap> soapModels = new ArrayList<THONGTINKIEMDEMNUOCSoap>(models.size());

		for (THONGTINKIEMDEMNUOC model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new THONGTINKIEMDEMNUOCSoap[soapModels.size()]);
	}

	public THONGTINKIEMDEMNUOCSoap() {
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

	public long getDauNoiNuocId() {
		return _dauNoiNuocId;
	}

	public void setDauNoiNuocId(long dauNoiNuocId) {
		_dauNoiNuocId = dauNoiNuocId;
	}

	public int getKeHoachKiemDemNuocId() {
		return _keHoachKiemDemNuocId;
	}

	public void setKeHoachKiemDemNuocId(int keHoachKiemDemNuocId) {
		_keHoachKiemDemNuocId = keHoachKiemDemNuocId;
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

	public int getSoNguoiTrongHo() {
		return _soNguoiTrongHo;
	}

	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		_soNguoiTrongHo = soNguoiTrongHo;
	}

	public int getThanhPhanHoGd() {
		return _thanhPhanHoGd;
	}

	public void setThanhPhanHoGd(int thanhPhanHoGd) {
		_thanhPhanHoGd = thanhPhanHoGd;
	}

	public int getChuHoDungDs() {
		return _chuHoDungDs;
	}

	public void setChuHoDungDs(int chuHoDungDs) {
		_chuHoDungDs = chuHoDungDs;
	}

	public String getLyDoKhongDungDs() {
		return _lyDoKhongDungDs;
	}

	public void setLyDoKhongDungDs(String lyDoKhongDungDs) {
		_lyDoKhongDungDs = lyDoKhongDungDs;
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

	public int getDauNoiChua() {
		return _dauNoiChua;
	}

	public void setDauNoiChua(int dauNoiChua) {
		_dauNoiChua = dauNoiChua;
	}

	public String getAnhDauNoi() {
		return _anhDauNoi;
	}

	public void setAnhDauNoi(String anhDauNoi) {
		_anhDauNoi = anhDauNoi;
	}

	public Date getThoiGianDauHopDong() {
		return _thoiGianDauHopDong;
	}

	public void setThoiGianDauHopDong(Date thoiGianDauHopDong) {
		_thoiGianDauHopDong = thoiGianDauHopDong;
	}

	public Date getThoiGianDauNoiThucTe() {
		return _thoiGianDauNoiThucTe;
	}

	public void setThoiGianDauNoiThucTe(Date thoiGianDauNoiThucTe) {
		_thoiGianDauNoiThucTe = thoiGianDauNoiThucTe;
	}

	public int getVoiNuocChayKhong() {
		return _voiNuocChayKhong;
	}

	public void setVoiNuocChayKhong(int voiNuocChayKhong) {
		_voiNuocChayKhong = voiNuocChayKhong;
	}

	public int getNuocTrongKhong() {
		return _nuocTrongKhong;
	}

	public void setNuocTrongKhong(int nuocTrongKhong) {
		_nuocTrongKhong = nuocTrongKhong;
	}

	public String getMauNuoc() {
		return _mauNuoc;
	}

	public void setMauNuoc(String mauNuoc) {
		_mauNuoc = mauNuoc;
	}

	public String getMuiNuoc() {
		return _muiNuoc;
	}

	public void setMuiNuoc(String muiNuoc) {
		_muiNuoc = muiNuoc;
	}

	public String getViNuoc() {
		return _viNuoc;
	}

	public void setViNuoc(String viNuoc) {
		_viNuoc = viNuoc;
	}

	public String getLoaiKhac() {
		return _loaiKhac;
	}

	public void setLoaiKhac(String loaiKhac) {
		_loaiKhac = loaiKhac;
	}

	public int getDaTungDucKhong() {
		return _daTungDucKhong;
	}

	public void setDaTungDucKhong(int daTungDucKhong) {
		_daTungDucKhong = daTungDucKhong;
	}

	public String getMauNuocTungCo() {
		return _mauNuocTungCo;
	}

	public void setMauNuocTungCo(String mauNuocTungCo) {
		_mauNuocTungCo = mauNuocTungCo;
	}

	public String getMuiNuocTungCo() {
		return _muiNuocTungCo;
	}

	public void setMuiNuocTungCo(String muiNuocTungCo) {
		_muiNuocTungCo = muiNuocTungCo;
	}

	public String getViNuocTungCo() {
		return _viNuocTungCo;
	}

	public void setViNuocTungCo(String viNuocTungCo) {
		_viNuocTungCo = viNuocTungCo;
	}

	public String getLoaiKhacTungCo() {
		return _loaiKhacTungCo;
	}

	public void setLoaiKhacTungCo(String loaiKhacTungCo) {
		_loaiKhacTungCo = loaiKhacTungCo;
	}

	public int getCoBeChuaNuoc() {
		return _coBeChuaNuoc;
	}

	public void setCoBeChuaNuoc(int coBeChuaNuoc) {
		_coBeChuaNuoc = coBeChuaNuoc;
	}

	public int getTinhTrangBe() {
		return _tinhTrangBe;
	}

	public void setTinhTrangBe(int tinhTrangBe) {
		_tinhTrangBe = tinhTrangBe;
	}

	public String getAnhBeChua() {
		return _anhBeChua;
	}

	public void setAnhBeChua(String anhBeChua) {
		_anhBeChua = anhBeChua;
	}

	public int getBiMatNuoc() {
		return _biMatNuoc;
	}

	public void setBiMatNuoc(int biMatNuoc) {
		_biMatNuoc = biMatNuoc;
	}

	public int getSoLanMatNuoc() {
		return _soLanMatNuoc;
	}

	public void setSoLanMatNuoc(int soLanMatNuoc) {
		_soLanMatNuoc = soLanMatNuoc;
	}

	public int getSoGioTrungBinh() {
		return _soGioTrungBinh;
	}

	public void setSoGioTrungBinh(int soGioTrungBinh) {
		_soGioTrungBinh = soGioTrungBinh;
	}

	public String getSoSeRyDongHo() {
		return _soSeRyDongHo;
	}

	public void setSoSeRyDongHo(String soSeRyDongHo) {
		_soSeRyDongHo = soSeRyDongHo;
	}

	public String getChiSoDongHo() {
		return _chiSoDongHo;
	}

	public void setChiSoDongHo(String chiSoDongHo) {
		_chiSoDongHo = chiSoDongHo;
	}

	public String getAnhDongHo() {
		return _anhDongHo;
	}

	public void setAnhDongHo(String anhDongHo) {
		_anhDongHo = anhDongHo;
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

	public String getIMei() {
		return _iMei;
	}

	public void setIMei(String iMei) {
		_iMei = iMei;
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

	private long _id;
	private long _dauNoiNuocId;
	private int _keHoachKiemDemNuocId;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _thonXom;
	private String _tenChuHo;
	private int _gioiTinhChuHo;
	private Date _ngayKiemDem;
	private int _timThayNha;
	private int _coNguoiONha;
	private String _hoTenNguoiTraLoi;
	private int _laChuHoKhong;
	private String _gioiTinhNguoiTraLoi;
	private String _tenDanToc;
	private String _kinhDo;
	private String _viDo;
	private int _soNguoiTrongHo;
	private int _thanhPhanHoGd;
	private int _chuHoDungDs;
	private String _lyDoKhongDungDs;
	private String _tenChuHoHienTai;
	private int _gioiTinhChuHoHienTai;
	private int _dauNoiChua;
	private String _anhDauNoi;
	private Date _thoiGianDauHopDong;
	private Date _thoiGianDauNoiThucTe;
	private int _voiNuocChayKhong;
	private int _nuocTrongKhong;
	private String _mauNuoc;
	private String _muiNuoc;
	private String _viNuoc;
	private String _loaiKhac;
	private int _daTungDucKhong;
	private String _mauNuocTungCo;
	private String _muiNuocTungCo;
	private String _viNuocTungCo;
	private String _loaiKhacTungCo;
	private int _coBeChuaNuoc;
	private int _tinhTrangBe;
	private String _anhBeChua;
	private int _biMatNuoc;
	private int _soLanMatNuoc;
	private int _soGioTrungBinh;
	private String _soSeRyDongHo;
	private String _chiSoDongHo;
	private String _anhDongHo;
	private String _ghiChu;
	private int _daKetThucDieuTra;
	private String _lyDoKhongHoanThanh;
	private String _iMei;
	private String _taiKhoan;
	private int _danhGiaKiemDem;
}