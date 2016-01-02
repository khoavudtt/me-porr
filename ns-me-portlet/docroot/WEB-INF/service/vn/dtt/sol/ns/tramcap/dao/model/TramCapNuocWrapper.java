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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TramCapNuoc}.
 * </p>
 *
 * @author khoa.vu
 * @see TramCapNuoc
 * @generated
 */
public class TramCapNuocWrapper implements TramCapNuoc,
	ModelWrapper<TramCapNuoc> {
	public TramCapNuocWrapper(TramCapNuoc tramCapNuoc) {
		_tramCapNuoc = tramCapNuoc;
	}

	@Override
	public Class<?> getModelClass() {
		return TramCapNuoc.class;
	}

	@Override
	public String getModelClassName() {
		return TramCapNuoc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTram", getMaTram());
		attributes.put("tenTram", getTenTram());
		attributes.put("maTinh", getMaTinh());
		attributes.put("tenTinh", getTenTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("tenHuyen", getTenHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("tenXa", getTenXa());
		attributes.put("diaChi", getDiaChi());
		attributes.put("kinhDo", getKinhDo());
		attributes.put("viDo", getViDo());
		attributes.put("loaiHinh", getLoaiHinh());
		attributes.put("maMoHinh", getMaMoHinh());
		attributes.put("tenMoHinh", getTenMoHinh());
		attributes.put("congXuatThietKe", getCongXuatThietKe());
		attributes.put("tongDauNoiThietKe", getTongDauNoiThietKe());
		attributes.put("soNguoiCapThietKe", getSoNguoiCapThietKe());
		attributes.put("tinhTrangDuAn", getTinhTrangDuAn());
		attributes.put("tienDoXayDung", getTienDoXayDung());
		attributes.put("namXayDung", getNamXayDung());
		attributes.put("namHoanThanh", getNamHoanThanh());
		attributes.put("ngayVanHanh", getNgayVanHanh());
		attributes.put("boMayVanHanh", getBoMayVanHanh());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("idNguoiDanhGia", getIdNguoiDanhGia());
		attributes.put("ngayDanhGia", getNgayDanhGia());
		attributes.put("trangThaiCapNuoc", getTrangThaiCapNuoc());
		attributes.put("congXuatThucTe", getCongXuatThucTe());
		attributes.put("tongDauNoiThucTe", getTongDauNoiThucTe());
		attributes.put("soNguoiCapThucTe", getSoNguoiCapThucTe());
		attributes.put("tongChiPhi", getTongChiPhi());
		attributes.put("tongDoanhThu", getTongDoanhThu());
		attributes.put("nuocDatTieuChuan", getNuocDatTieuChuan());
		attributes.put("nuocCoAsen", getNuocCoAsen());
		attributes.put("nuocThatThoat", getNuocThatThoat());
		attributes.put("trangThaiDanhGia", getTrangThaiDanhGia());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTram = (String)attributes.get("maTram");

		if (maTram != null) {
			setMaTram(maTram);
		}

		String tenTram = (String)attributes.get("tenTram");

		if (tenTram != null) {
			setTenTram(tenTram);
		}

		String maTinh = (String)attributes.get("maTinh");

		if (maTinh != null) {
			setMaTinh(maTinh);
		}

		String tenTinh = (String)attributes.get("tenTinh");

		if (tenTinh != null) {
			setTenTinh(tenTinh);
		}

		String maHuyen = (String)attributes.get("maHuyen");

		if (maHuyen != null) {
			setMaHuyen(maHuyen);
		}

		String tenHuyen = (String)attributes.get("tenHuyen");

		if (tenHuyen != null) {
			setTenHuyen(tenHuyen);
		}

		String maXa = (String)attributes.get("maXa");

		if (maXa != null) {
			setMaXa(maXa);
		}

		String tenXa = (String)attributes.get("tenXa");

		if (tenXa != null) {
			setTenXa(tenXa);
		}

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		String kinhDo = (String)attributes.get("kinhDo");

		if (kinhDo != null) {
			setKinhDo(kinhDo);
		}

		String viDo = (String)attributes.get("viDo");

		if (viDo != null) {
			setViDo(viDo);
		}

		Integer loaiHinh = (Integer)attributes.get("loaiHinh");

		if (loaiHinh != null) {
			setLoaiHinh(loaiHinh);
		}

		String maMoHinh = (String)attributes.get("maMoHinh");

		if (maMoHinh != null) {
			setMaMoHinh(maMoHinh);
		}

		String tenMoHinh = (String)attributes.get("tenMoHinh");

		if (tenMoHinh != null) {
			setTenMoHinh(tenMoHinh);
		}

		Integer congXuatThietKe = (Integer)attributes.get("congXuatThietKe");

		if (congXuatThietKe != null) {
			setCongXuatThietKe(congXuatThietKe);
		}

		Integer tongDauNoiThietKe = (Integer)attributes.get("tongDauNoiThietKe");

		if (tongDauNoiThietKe != null) {
			setTongDauNoiThietKe(tongDauNoiThietKe);
		}

		Integer soNguoiCapThietKe = (Integer)attributes.get("soNguoiCapThietKe");

		if (soNguoiCapThietKe != null) {
			setSoNguoiCapThietKe(soNguoiCapThietKe);
		}

		Integer tinhTrangDuAn = (Integer)attributes.get("tinhTrangDuAn");

		if (tinhTrangDuAn != null) {
			setTinhTrangDuAn(tinhTrangDuAn);
		}

		Integer tienDoXayDung = (Integer)attributes.get("tienDoXayDung");

		if (tienDoXayDung != null) {
			setTienDoXayDung(tienDoXayDung);
		}

		Integer namXayDung = (Integer)attributes.get("namXayDung");

		if (namXayDung != null) {
			setNamXayDung(namXayDung);
		}

		Integer namHoanThanh = (Integer)attributes.get("namHoanThanh");

		if (namHoanThanh != null) {
			setNamHoanThanh(namHoanThanh);
		}

		Date ngayVanHanh = (Date)attributes.get("ngayVanHanh");

		if (ngayVanHanh != null) {
			setNgayVanHanh(ngayVanHanh);
		}

		Integer boMayVanHanh = (Integer)attributes.get("boMayVanHanh");

		if (boMayVanHanh != null) {
			setBoMayVanHanh(boMayVanHanh);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long idNguoiTao = (Long)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		Long idNguoiDanhGia = (Long)attributes.get("idNguoiDanhGia");

		if (idNguoiDanhGia != null) {
			setIdNguoiDanhGia(idNguoiDanhGia);
		}

		Date ngayDanhGia = (Date)attributes.get("ngayDanhGia");

		if (ngayDanhGia != null) {
			setNgayDanhGia(ngayDanhGia);
		}

		Integer trangThaiCapNuoc = (Integer)attributes.get("trangThaiCapNuoc");

		if (trangThaiCapNuoc != null) {
			setTrangThaiCapNuoc(trangThaiCapNuoc);
		}

		Integer congXuatThucTe = (Integer)attributes.get("congXuatThucTe");

		if (congXuatThucTe != null) {
			setCongXuatThucTe(congXuatThucTe);
		}

		Integer tongDauNoiThucTe = (Integer)attributes.get("tongDauNoiThucTe");

		if (tongDauNoiThucTe != null) {
			setTongDauNoiThucTe(tongDauNoiThucTe);
		}

		Integer soNguoiCapThucTe = (Integer)attributes.get("soNguoiCapThucTe");

		if (soNguoiCapThucTe != null) {
			setSoNguoiCapThucTe(soNguoiCapThucTe);
		}

		Integer tongChiPhi = (Integer)attributes.get("tongChiPhi");

		if (tongChiPhi != null) {
			setTongChiPhi(tongChiPhi);
		}

		Integer tongDoanhThu = (Integer)attributes.get("tongDoanhThu");

		if (tongDoanhThu != null) {
			setTongDoanhThu(tongDoanhThu);
		}

		Integer nuocDatTieuChuan = (Integer)attributes.get("nuocDatTieuChuan");

		if (nuocDatTieuChuan != null) {
			setNuocDatTieuChuan(nuocDatTieuChuan);
		}

		Integer nuocCoAsen = (Integer)attributes.get("nuocCoAsen");

		if (nuocCoAsen != null) {
			setNuocCoAsen(nuocCoAsen);
		}

		Integer nuocThatThoat = (Integer)attributes.get("nuocThatThoat");

		if (nuocThatThoat != null) {
			setNuocThatThoat(nuocThatThoat);
		}

		Integer trangThaiDanhGia = (Integer)attributes.get("trangThaiDanhGia");

		if (trangThaiDanhGia != null) {
			setTrangThaiDanhGia(trangThaiDanhGia);
		}
	}

	/**
	* Returns the primary key of this tram cap nuoc.
	*
	* @return the primary key of this tram cap nuoc
	*/
	@Override
	public long getPrimaryKey() {
		return _tramCapNuoc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tram cap nuoc.
	*
	* @param primaryKey the primary key of this tram cap nuoc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tramCapNuoc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tram cap nuoc.
	*
	* @return the ID of this tram cap nuoc
	*/
	@Override
	public long getId() {
		return _tramCapNuoc.getId();
	}

	/**
	* Sets the ID of this tram cap nuoc.
	*
	* @param id the ID of this tram cap nuoc
	*/
	@Override
	public void setId(long id) {
		_tramCapNuoc.setId(id);
	}

	/**
	* Returns the ma tram of this tram cap nuoc.
	*
	* @return the ma tram of this tram cap nuoc
	*/
	@Override
	public java.lang.String getMaTram() {
		return _tramCapNuoc.getMaTram();
	}

	/**
	* Sets the ma tram of this tram cap nuoc.
	*
	* @param maTram the ma tram of this tram cap nuoc
	*/
	@Override
	public void setMaTram(java.lang.String maTram) {
		_tramCapNuoc.setMaTram(maTram);
	}

	/**
	* Returns the ten tram of this tram cap nuoc.
	*
	* @return the ten tram of this tram cap nuoc
	*/
	@Override
	public java.lang.String getTenTram() {
		return _tramCapNuoc.getTenTram();
	}

	/**
	* Sets the ten tram of this tram cap nuoc.
	*
	* @param tenTram the ten tram of this tram cap nuoc
	*/
	@Override
	public void setTenTram(java.lang.String tenTram) {
		_tramCapNuoc.setTenTram(tenTram);
	}

	/**
	* Returns the ma tinh of this tram cap nuoc.
	*
	* @return the ma tinh of this tram cap nuoc
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _tramCapNuoc.getMaTinh();
	}

	/**
	* Sets the ma tinh of this tram cap nuoc.
	*
	* @param maTinh the ma tinh of this tram cap nuoc
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_tramCapNuoc.setMaTinh(maTinh);
	}

	/**
	* Returns the ten tinh of this tram cap nuoc.
	*
	* @return the ten tinh of this tram cap nuoc
	*/
	@Override
	public java.lang.String getTenTinh() {
		return _tramCapNuoc.getTenTinh();
	}

	/**
	* Sets the ten tinh of this tram cap nuoc.
	*
	* @param tenTinh the ten tinh of this tram cap nuoc
	*/
	@Override
	public void setTenTinh(java.lang.String tenTinh) {
		_tramCapNuoc.setTenTinh(tenTinh);
	}

	/**
	* Returns the ma huyen of this tram cap nuoc.
	*
	* @return the ma huyen of this tram cap nuoc
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _tramCapNuoc.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this tram cap nuoc.
	*
	* @param maHuyen the ma huyen of this tram cap nuoc
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_tramCapNuoc.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ten huyen of this tram cap nuoc.
	*
	* @return the ten huyen of this tram cap nuoc
	*/
	@Override
	public java.lang.String getTenHuyen() {
		return _tramCapNuoc.getTenHuyen();
	}

	/**
	* Sets the ten huyen of this tram cap nuoc.
	*
	* @param tenHuyen the ten huyen of this tram cap nuoc
	*/
	@Override
	public void setTenHuyen(java.lang.String tenHuyen) {
		_tramCapNuoc.setTenHuyen(tenHuyen);
	}

	/**
	* Returns the ma xa of this tram cap nuoc.
	*
	* @return the ma xa of this tram cap nuoc
	*/
	@Override
	public java.lang.String getMaXa() {
		return _tramCapNuoc.getMaXa();
	}

	/**
	* Sets the ma xa of this tram cap nuoc.
	*
	* @param maXa the ma xa of this tram cap nuoc
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_tramCapNuoc.setMaXa(maXa);
	}

	/**
	* Returns the ten xa of this tram cap nuoc.
	*
	* @return the ten xa of this tram cap nuoc
	*/
	@Override
	public java.lang.String getTenXa() {
		return _tramCapNuoc.getTenXa();
	}

	/**
	* Sets the ten xa of this tram cap nuoc.
	*
	* @param tenXa the ten xa of this tram cap nuoc
	*/
	@Override
	public void setTenXa(java.lang.String tenXa) {
		_tramCapNuoc.setTenXa(tenXa);
	}

	/**
	* Returns the dia chi of this tram cap nuoc.
	*
	* @return the dia chi of this tram cap nuoc
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _tramCapNuoc.getDiaChi();
	}

	/**
	* Sets the dia chi of this tram cap nuoc.
	*
	* @param diaChi the dia chi of this tram cap nuoc
	*/
	@Override
	public void setDiaChi(java.lang.String diaChi) {
		_tramCapNuoc.setDiaChi(diaChi);
	}

	/**
	* Returns the kinh do of this tram cap nuoc.
	*
	* @return the kinh do of this tram cap nuoc
	*/
	@Override
	public java.lang.String getKinhDo() {
		return _tramCapNuoc.getKinhDo();
	}

	/**
	* Sets the kinh do of this tram cap nuoc.
	*
	* @param kinhDo the kinh do of this tram cap nuoc
	*/
	@Override
	public void setKinhDo(java.lang.String kinhDo) {
		_tramCapNuoc.setKinhDo(kinhDo);
	}

	/**
	* Returns the vi do of this tram cap nuoc.
	*
	* @return the vi do of this tram cap nuoc
	*/
	@Override
	public java.lang.String getViDo() {
		return _tramCapNuoc.getViDo();
	}

	/**
	* Sets the vi do of this tram cap nuoc.
	*
	* @param viDo the vi do of this tram cap nuoc
	*/
	@Override
	public void setViDo(java.lang.String viDo) {
		_tramCapNuoc.setViDo(viDo);
	}

	/**
	* Returns the loai hinh of this tram cap nuoc.
	*
	* @return the loai hinh of this tram cap nuoc
	*/
	@Override
	public int getLoaiHinh() {
		return _tramCapNuoc.getLoaiHinh();
	}

	/**
	* Sets the loai hinh of this tram cap nuoc.
	*
	* @param loaiHinh the loai hinh of this tram cap nuoc
	*/
	@Override
	public void setLoaiHinh(int loaiHinh) {
		_tramCapNuoc.setLoaiHinh(loaiHinh);
	}

	/**
	* Returns the ma mo hinh of this tram cap nuoc.
	*
	* @return the ma mo hinh of this tram cap nuoc
	*/
	@Override
	public java.lang.String getMaMoHinh() {
		return _tramCapNuoc.getMaMoHinh();
	}

	/**
	* Sets the ma mo hinh of this tram cap nuoc.
	*
	* @param maMoHinh the ma mo hinh of this tram cap nuoc
	*/
	@Override
	public void setMaMoHinh(java.lang.String maMoHinh) {
		_tramCapNuoc.setMaMoHinh(maMoHinh);
	}

	/**
	* Returns the ten mo hinh of this tram cap nuoc.
	*
	* @return the ten mo hinh of this tram cap nuoc
	*/
	@Override
	public java.lang.String getTenMoHinh() {
		return _tramCapNuoc.getTenMoHinh();
	}

	/**
	* Sets the ten mo hinh of this tram cap nuoc.
	*
	* @param tenMoHinh the ten mo hinh of this tram cap nuoc
	*/
	@Override
	public void setTenMoHinh(java.lang.String tenMoHinh) {
		_tramCapNuoc.setTenMoHinh(tenMoHinh);
	}

	/**
	* Returns the cong xuat thiet ke of this tram cap nuoc.
	*
	* @return the cong xuat thiet ke of this tram cap nuoc
	*/
	@Override
	public int getCongXuatThietKe() {
		return _tramCapNuoc.getCongXuatThietKe();
	}

	/**
	* Sets the cong xuat thiet ke of this tram cap nuoc.
	*
	* @param congXuatThietKe the cong xuat thiet ke of this tram cap nuoc
	*/
	@Override
	public void setCongXuatThietKe(int congXuatThietKe) {
		_tramCapNuoc.setCongXuatThietKe(congXuatThietKe);
	}

	/**
	* Returns the tong dau noi thiet ke of this tram cap nuoc.
	*
	* @return the tong dau noi thiet ke of this tram cap nuoc
	*/
	@Override
	public int getTongDauNoiThietKe() {
		return _tramCapNuoc.getTongDauNoiThietKe();
	}

	/**
	* Sets the tong dau noi thiet ke of this tram cap nuoc.
	*
	* @param tongDauNoiThietKe the tong dau noi thiet ke of this tram cap nuoc
	*/
	@Override
	public void setTongDauNoiThietKe(int tongDauNoiThietKe) {
		_tramCapNuoc.setTongDauNoiThietKe(tongDauNoiThietKe);
	}

	/**
	* Returns the so nguoi cap thiet ke of this tram cap nuoc.
	*
	* @return the so nguoi cap thiet ke of this tram cap nuoc
	*/
	@Override
	public int getSoNguoiCapThietKe() {
		return _tramCapNuoc.getSoNguoiCapThietKe();
	}

	/**
	* Sets the so nguoi cap thiet ke of this tram cap nuoc.
	*
	* @param soNguoiCapThietKe the so nguoi cap thiet ke of this tram cap nuoc
	*/
	@Override
	public void setSoNguoiCapThietKe(int soNguoiCapThietKe) {
		_tramCapNuoc.setSoNguoiCapThietKe(soNguoiCapThietKe);
	}

	/**
	* Returns the tinh trang du an of this tram cap nuoc.
	*
	* @return the tinh trang du an of this tram cap nuoc
	*/
	@Override
	public int getTinhTrangDuAn() {
		return _tramCapNuoc.getTinhTrangDuAn();
	}

	/**
	* Sets the tinh trang du an of this tram cap nuoc.
	*
	* @param tinhTrangDuAn the tinh trang du an of this tram cap nuoc
	*/
	@Override
	public void setTinhTrangDuAn(int tinhTrangDuAn) {
		_tramCapNuoc.setTinhTrangDuAn(tinhTrangDuAn);
	}

	/**
	* Returns the tien do xay dung of this tram cap nuoc.
	*
	* @return the tien do xay dung of this tram cap nuoc
	*/
	@Override
	public int getTienDoXayDung() {
		return _tramCapNuoc.getTienDoXayDung();
	}

	/**
	* Sets the tien do xay dung of this tram cap nuoc.
	*
	* @param tienDoXayDung the tien do xay dung of this tram cap nuoc
	*/
	@Override
	public void setTienDoXayDung(int tienDoXayDung) {
		_tramCapNuoc.setTienDoXayDung(tienDoXayDung);
	}

	/**
	* Returns the nam xay dung of this tram cap nuoc.
	*
	* @return the nam xay dung of this tram cap nuoc
	*/
	@Override
	public int getNamXayDung() {
		return _tramCapNuoc.getNamXayDung();
	}

	/**
	* Sets the nam xay dung of this tram cap nuoc.
	*
	* @param namXayDung the nam xay dung of this tram cap nuoc
	*/
	@Override
	public void setNamXayDung(int namXayDung) {
		_tramCapNuoc.setNamXayDung(namXayDung);
	}

	/**
	* Returns the nam hoan thanh of this tram cap nuoc.
	*
	* @return the nam hoan thanh of this tram cap nuoc
	*/
	@Override
	public int getNamHoanThanh() {
		return _tramCapNuoc.getNamHoanThanh();
	}

	/**
	* Sets the nam hoan thanh of this tram cap nuoc.
	*
	* @param namHoanThanh the nam hoan thanh of this tram cap nuoc
	*/
	@Override
	public void setNamHoanThanh(int namHoanThanh) {
		_tramCapNuoc.setNamHoanThanh(namHoanThanh);
	}

	/**
	* Returns the ngay van hanh of this tram cap nuoc.
	*
	* @return the ngay van hanh of this tram cap nuoc
	*/
	@Override
	public java.util.Date getNgayVanHanh() {
		return _tramCapNuoc.getNgayVanHanh();
	}

	/**
	* Sets the ngay van hanh of this tram cap nuoc.
	*
	* @param ngayVanHanh the ngay van hanh of this tram cap nuoc
	*/
	@Override
	public void setNgayVanHanh(java.util.Date ngayVanHanh) {
		_tramCapNuoc.setNgayVanHanh(ngayVanHanh);
	}

	/**
	* Returns the bo may van hanh of this tram cap nuoc.
	*
	* @return the bo may van hanh of this tram cap nuoc
	*/
	@Override
	public int getBoMayVanHanh() {
		return _tramCapNuoc.getBoMayVanHanh();
	}

	/**
	* Sets the bo may van hanh of this tram cap nuoc.
	*
	* @param boMayVanHanh the bo may van hanh of this tram cap nuoc
	*/
	@Override
	public void setBoMayVanHanh(int boMayVanHanh) {
		_tramCapNuoc.setBoMayVanHanh(boMayVanHanh);
	}

	/**
	* Returns the ghi chu of this tram cap nuoc.
	*
	* @return the ghi chu of this tram cap nuoc
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _tramCapNuoc.getGhiChu();
	}

	/**
	* Sets the ghi chu of this tram cap nuoc.
	*
	* @param ghiChu the ghi chu of this tram cap nuoc
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_tramCapNuoc.setGhiChu(ghiChu);
	}

	/**
	* Returns the ngay tao of this tram cap nuoc.
	*
	* @return the ngay tao of this tram cap nuoc
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _tramCapNuoc.getNgayTao();
	}

	/**
	* Sets the ngay tao of this tram cap nuoc.
	*
	* @param ngayTao the ngay tao of this tram cap nuoc
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_tramCapNuoc.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this tram cap nuoc.
	*
	* @return the id nguoi tao of this tram cap nuoc
	*/
	@Override
	public long getIdNguoiTao() {
		return _tramCapNuoc.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this tram cap nuoc.
	*
	* @param idNguoiTao the id nguoi tao of this tram cap nuoc
	*/
	@Override
	public void setIdNguoiTao(long idNguoiTao) {
		_tramCapNuoc.setIdNguoiTao(idNguoiTao);
	}

	/**
	* Returns the id nguoi danh gia of this tram cap nuoc.
	*
	* @return the id nguoi danh gia of this tram cap nuoc
	*/
	@Override
	public long getIdNguoiDanhGia() {
		return _tramCapNuoc.getIdNguoiDanhGia();
	}

	/**
	* Sets the id nguoi danh gia of this tram cap nuoc.
	*
	* @param idNguoiDanhGia the id nguoi danh gia of this tram cap nuoc
	*/
	@Override
	public void setIdNguoiDanhGia(long idNguoiDanhGia) {
		_tramCapNuoc.setIdNguoiDanhGia(idNguoiDanhGia);
	}

	/**
	* Returns the ngay danh gia of this tram cap nuoc.
	*
	* @return the ngay danh gia of this tram cap nuoc
	*/
	@Override
	public java.util.Date getNgayDanhGia() {
		return _tramCapNuoc.getNgayDanhGia();
	}

	/**
	* Sets the ngay danh gia of this tram cap nuoc.
	*
	* @param ngayDanhGia the ngay danh gia of this tram cap nuoc
	*/
	@Override
	public void setNgayDanhGia(java.util.Date ngayDanhGia) {
		_tramCapNuoc.setNgayDanhGia(ngayDanhGia);
	}

	/**
	* Returns the trang thai cap nuoc of this tram cap nuoc.
	*
	* @return the trang thai cap nuoc of this tram cap nuoc
	*/
	@Override
	public int getTrangThaiCapNuoc() {
		return _tramCapNuoc.getTrangThaiCapNuoc();
	}

	/**
	* Sets the trang thai cap nuoc of this tram cap nuoc.
	*
	* @param trangThaiCapNuoc the trang thai cap nuoc of this tram cap nuoc
	*/
	@Override
	public void setTrangThaiCapNuoc(int trangThaiCapNuoc) {
		_tramCapNuoc.setTrangThaiCapNuoc(trangThaiCapNuoc);
	}

	/**
	* Returns the cong xuat thuc te of this tram cap nuoc.
	*
	* @return the cong xuat thuc te of this tram cap nuoc
	*/
	@Override
	public int getCongXuatThucTe() {
		return _tramCapNuoc.getCongXuatThucTe();
	}

	/**
	* Sets the cong xuat thuc te of this tram cap nuoc.
	*
	* @param congXuatThucTe the cong xuat thuc te of this tram cap nuoc
	*/
	@Override
	public void setCongXuatThucTe(int congXuatThucTe) {
		_tramCapNuoc.setCongXuatThucTe(congXuatThucTe);
	}

	/**
	* Returns the tong dau noi thuc te of this tram cap nuoc.
	*
	* @return the tong dau noi thuc te of this tram cap nuoc
	*/
	@Override
	public int getTongDauNoiThucTe() {
		return _tramCapNuoc.getTongDauNoiThucTe();
	}

	/**
	* Sets the tong dau noi thuc te of this tram cap nuoc.
	*
	* @param tongDauNoiThucTe the tong dau noi thuc te of this tram cap nuoc
	*/
	@Override
	public void setTongDauNoiThucTe(int tongDauNoiThucTe) {
		_tramCapNuoc.setTongDauNoiThucTe(tongDauNoiThucTe);
	}

	/**
	* Returns the so nguoi cap thuc te of this tram cap nuoc.
	*
	* @return the so nguoi cap thuc te of this tram cap nuoc
	*/
	@Override
	public int getSoNguoiCapThucTe() {
		return _tramCapNuoc.getSoNguoiCapThucTe();
	}

	/**
	* Sets the so nguoi cap thuc te of this tram cap nuoc.
	*
	* @param soNguoiCapThucTe the so nguoi cap thuc te of this tram cap nuoc
	*/
	@Override
	public void setSoNguoiCapThucTe(int soNguoiCapThucTe) {
		_tramCapNuoc.setSoNguoiCapThucTe(soNguoiCapThucTe);
	}

	/**
	* Returns the tong chi phi of this tram cap nuoc.
	*
	* @return the tong chi phi of this tram cap nuoc
	*/
	@Override
	public int getTongChiPhi() {
		return _tramCapNuoc.getTongChiPhi();
	}

	/**
	* Sets the tong chi phi of this tram cap nuoc.
	*
	* @param tongChiPhi the tong chi phi of this tram cap nuoc
	*/
	@Override
	public void setTongChiPhi(int tongChiPhi) {
		_tramCapNuoc.setTongChiPhi(tongChiPhi);
	}

	/**
	* Returns the tong doanh thu of this tram cap nuoc.
	*
	* @return the tong doanh thu of this tram cap nuoc
	*/
	@Override
	public int getTongDoanhThu() {
		return _tramCapNuoc.getTongDoanhThu();
	}

	/**
	* Sets the tong doanh thu of this tram cap nuoc.
	*
	* @param tongDoanhThu the tong doanh thu of this tram cap nuoc
	*/
	@Override
	public void setTongDoanhThu(int tongDoanhThu) {
		_tramCapNuoc.setTongDoanhThu(tongDoanhThu);
	}

	/**
	* Returns the nuoc dat tieu chuan of this tram cap nuoc.
	*
	* @return the nuoc dat tieu chuan of this tram cap nuoc
	*/
	@Override
	public int getNuocDatTieuChuan() {
		return _tramCapNuoc.getNuocDatTieuChuan();
	}

	/**
	* Sets the nuoc dat tieu chuan of this tram cap nuoc.
	*
	* @param nuocDatTieuChuan the nuoc dat tieu chuan of this tram cap nuoc
	*/
	@Override
	public void setNuocDatTieuChuan(int nuocDatTieuChuan) {
		_tramCapNuoc.setNuocDatTieuChuan(nuocDatTieuChuan);
	}

	/**
	* Returns the nuoc co asen of this tram cap nuoc.
	*
	* @return the nuoc co asen of this tram cap nuoc
	*/
	@Override
	public int getNuocCoAsen() {
		return _tramCapNuoc.getNuocCoAsen();
	}

	/**
	* Sets the nuoc co asen of this tram cap nuoc.
	*
	* @param nuocCoAsen the nuoc co asen of this tram cap nuoc
	*/
	@Override
	public void setNuocCoAsen(int nuocCoAsen) {
		_tramCapNuoc.setNuocCoAsen(nuocCoAsen);
	}

	/**
	* Returns the nuoc that thoat of this tram cap nuoc.
	*
	* @return the nuoc that thoat of this tram cap nuoc
	*/
	@Override
	public int getNuocThatThoat() {
		return _tramCapNuoc.getNuocThatThoat();
	}

	/**
	* Sets the nuoc that thoat of this tram cap nuoc.
	*
	* @param nuocThatThoat the nuoc that thoat of this tram cap nuoc
	*/
	@Override
	public void setNuocThatThoat(int nuocThatThoat) {
		_tramCapNuoc.setNuocThatThoat(nuocThatThoat);
	}

	/**
	* Returns the trang thai danh gia of this tram cap nuoc.
	*
	* @return the trang thai danh gia of this tram cap nuoc
	*/
	@Override
	public int getTrangThaiDanhGia() {
		return _tramCapNuoc.getTrangThaiDanhGia();
	}

	/**
	* Sets the trang thai danh gia of this tram cap nuoc.
	*
	* @param trangThaiDanhGia the trang thai danh gia of this tram cap nuoc
	*/
	@Override
	public void setTrangThaiDanhGia(int trangThaiDanhGia) {
		_tramCapNuoc.setTrangThaiDanhGia(trangThaiDanhGia);
	}

	@Override
	public boolean isNew() {
		return _tramCapNuoc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tramCapNuoc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tramCapNuoc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tramCapNuoc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tramCapNuoc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tramCapNuoc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tramCapNuoc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tramCapNuoc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tramCapNuoc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tramCapNuoc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tramCapNuoc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TramCapNuocWrapper((TramCapNuoc)_tramCapNuoc.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc tramCapNuoc) {
		return _tramCapNuoc.compareTo(tramCapNuoc);
	}

	@Override
	public int hashCode() {
		return _tramCapNuoc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc> toCacheModel() {
		return _tramCapNuoc.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc toEscapedModel() {
		return new TramCapNuocWrapper(_tramCapNuoc.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc toUnescapedModel() {
		return new TramCapNuocWrapper(_tramCapNuoc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tramCapNuoc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tramCapNuoc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tramCapNuoc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TramCapNuocWrapper)) {
			return false;
		}

		TramCapNuocWrapper tramCapNuocWrapper = (TramCapNuocWrapper)obj;

		if (Validator.equals(_tramCapNuoc, tramCapNuocWrapper._tramCapNuoc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TramCapNuoc getWrappedTramCapNuoc() {
		return _tramCapNuoc;
	}

	@Override
	public TramCapNuoc getWrappedModel() {
		return _tramCapNuoc;
	}

	@Override
	public void resetOriginalValues() {
		_tramCapNuoc.resetOriginalValues();
	}

	private TramCapNuoc _tramCapNuoc;
}