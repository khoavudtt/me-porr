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
public class DauNoiNuocSoap implements Serializable {
	public static DauNoiNuocSoap toSoapModel(DauNoiNuoc model) {
		DauNoiNuocSoap soapModel = new DauNoiNuocSoap();

		soapModel.setId(model.getId());
		soapModel.setTramCapNuocId(model.getTramCapNuocId());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setThonXom(model.getThonXom());
		soapModel.setTenChuHo(model.getTenChuHo());
		soapModel.setGioiTinh(model.getGioiTinh());
		soapModel.setNgayDauNoiHopDong(model.getNgayDauNoiHopDong());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setNamBaoCao(model.getNamBaoCao());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());
		soapModel.setSoNguoiTrongHo(model.getSoNguoiTrongHo());
		soapModel.setThanhPhanHoGiaDinh(model.getThanhPhanHoGiaDinh());
		soapModel.setTongDoanhThu(model.getTongDoanhThu());
		soapModel.setKinhDo(model.getKinhDo());
		soapModel.setViDo(model.getViDo());
		soapModel.setNgayDauNoiThucTe(model.getNgayDauNoiThucTe());
		soapModel.setSoSeryDongHo(model.getSoSeryDongHo());
		soapModel.setDanhGiaNuocHVS(model.getDanhGiaNuocHVS());
		soapModel.setNgayKiemDem(model.getNgayKiemDem());
		soapModel.setNgayDanhGia(model.getNgayDanhGia());
		soapModel.setIdNguoiDanhGia(model.getIdNguoiDanhGia());

		return soapModel;
	}

	public static DauNoiNuocSoap[] toSoapModels(DauNoiNuoc[] models) {
		DauNoiNuocSoap[] soapModels = new DauNoiNuocSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DauNoiNuocSoap[][] toSoapModels(DauNoiNuoc[][] models) {
		DauNoiNuocSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DauNoiNuocSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DauNoiNuocSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DauNoiNuocSoap[] toSoapModels(List<DauNoiNuoc> models) {
		List<DauNoiNuocSoap> soapModels = new ArrayList<DauNoiNuocSoap>(models.size());

		for (DauNoiNuoc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DauNoiNuocSoap[soapModels.size()]);
	}

	public DauNoiNuocSoap() {
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

	public int getTramCapNuocId() {
		return _tramCapNuocId;
	}

	public void setTramCapNuocId(int tramCapNuocId) {
		_tramCapNuocId = tramCapNuocId;
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

	public int getGioiTinh() {
		return _gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		_gioiTinh = gioiTinh;
	}

	public Date getNgayDauNoiHopDong() {
		return _ngayDauNoiHopDong;
	}

	public void setNgayDauNoiHopDong(Date ngayDauNoiHopDong) {
		_ngayDauNoiHopDong = ngayDauNoiHopDong;
	}

	public int getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;
	}

	public int getNamBaoCao() {
		return _namBaoCao;
	}

	public void setNamBaoCao(int namBaoCao) {
		_namBaoCao = namBaoCao;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
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

	public int getSoNguoiTrongHo() {
		return _soNguoiTrongHo;
	}

	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		_soNguoiTrongHo = soNguoiTrongHo;
	}

	public int getThanhPhanHoGiaDinh() {
		return _thanhPhanHoGiaDinh;
	}

	public void setThanhPhanHoGiaDinh(int thanhPhanHoGiaDinh) {
		_thanhPhanHoGiaDinh = thanhPhanHoGiaDinh;
	}

	public int getTongDoanhThu() {
		return _tongDoanhThu;
	}

	public void setTongDoanhThu(int tongDoanhThu) {
		_tongDoanhThu = tongDoanhThu;
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

	public Date getNgayDauNoiThucTe() {
		return _ngayDauNoiThucTe;
	}

	public void setNgayDauNoiThucTe(Date ngayDauNoiThucTe) {
		_ngayDauNoiThucTe = ngayDauNoiThucTe;
	}

	public String getSoSeryDongHo() {
		return _soSeryDongHo;
	}

	public void setSoSeryDongHo(String soSeryDongHo) {
		_soSeryDongHo = soSeryDongHo;
	}

	public String getDanhGiaNuocHVS() {
		return _danhGiaNuocHVS;
	}

	public void setDanhGiaNuocHVS(String danhGiaNuocHVS) {
		_danhGiaNuocHVS = danhGiaNuocHVS;
	}

	public Date getNgayKiemDem() {
		return _ngayKiemDem;
	}

	public void setNgayKiemDem(Date ngayKiemDem) {
		_ngayKiemDem = ngayKiemDem;
	}

	public Date getNgayDanhGia() {
		return _ngayDanhGia;
	}

	public void setNgayDanhGia(Date ngayDanhGia) {
		_ngayDanhGia = ngayDanhGia;
	}

	public int getIdNguoiDanhGia() {
		return _idNguoiDanhGia;
	}

	public void setIdNguoiDanhGia(int idNguoiDanhGia) {
		_idNguoiDanhGia = idNguoiDanhGia;
	}

	private long _id;
	private int _tramCapNuocId;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _thonXom;
	private String _tenChuHo;
	private int _gioiTinh;
	private Date _ngayDauNoiHopDong;
	private int _trangThai;
	private int _namBaoCao;
	private String _ghiChu;
	private Date _ngayTao;
	private int _idNguoiTao;
	private int _soNguoiTrongHo;
	private int _thanhPhanHoGiaDinh;
	private int _tongDoanhThu;
	private String _kinhDo;
	private String _viDo;
	private Date _ngayDauNoiThucTe;
	private String _soSeryDongHo;
	private String _danhGiaNuocHVS;
	private Date _ngayKiemDem;
	private Date _ngayDanhGia;
	private int _idNguoiDanhGia;
}