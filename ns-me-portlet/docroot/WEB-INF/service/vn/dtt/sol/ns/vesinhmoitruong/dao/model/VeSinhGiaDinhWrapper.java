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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link VeSinhGiaDinh}.
 * </p>
 *
 * @author BinhTH
 * @see VeSinhGiaDinh
 * @generated
 */
public class VeSinhGiaDinhWrapper implements VeSinhGiaDinh,
	ModelWrapper<VeSinhGiaDinh> {
	public VeSinhGiaDinhWrapper(VeSinhGiaDinh veSinhGiaDinh) {
		_veSinhGiaDinh = veSinhGiaDinh;
	}

	@Override
	public Class<?> getModelClass() {
		return VeSinhGiaDinh.class;
	}

	@Override
	public String getModelClassName() {
		return VeSinhGiaDinh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("thonXom", getThonXom());
		attributes.put("tenChuHo", getTenChuHo());
		attributes.put("gioiTinhChuHo", getGioiTinhChuHo());
		attributes.put("trangThai", getTrangThai());
		attributes.put("mauNgauNhien", getMauNgauNhien());
		attributes.put("namBaoCao", getNamBaoCao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("soNguoiTrongHo", getSoNguoiTrongHo());
		attributes.put("thanhPhanHoGD", getThanhPhanHoGD());
		attributes.put("kinhDo", getKinhDo());
		attributes.put("viDo", getViDo());
		attributes.put("coNhaTieu", getCoNhaTieu());
		attributes.put("nhaTieuHVS", getNhaTieuHVS());
		attributes.put("loaiNhaTieu", getLoaiNhaTieu());
		attributes.put("duocCaiTao", getDuocCaiTao());
		attributes.put("thangXayDung", getThangXayDung());
		attributes.put("namXayDung", getNamXayDung());
		attributes.put("nguonVon", getNguonVon());
		attributes.put("ngayKiemDem", getNgayKiemDem());
		attributes.put("ngayDanhGia", getNgayDanhGia());
		attributes.put("idNguoiDanhGia", getIdNguoiDanhGia());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTinh = (String)attributes.get("maTinh");

		if (maTinh != null) {
			setMaTinh(maTinh);
		}

		String maHuyen = (String)attributes.get("maHuyen");

		if (maHuyen != null) {
			setMaHuyen(maHuyen);
		}

		String maXa = (String)attributes.get("maXa");

		if (maXa != null) {
			setMaXa(maXa);
		}

		String thonXom = (String)attributes.get("thonXom");

		if (thonXom != null) {
			setThonXom(thonXom);
		}

		String tenChuHo = (String)attributes.get("tenChuHo");

		if (tenChuHo != null) {
			setTenChuHo(tenChuHo);
		}

		Integer gioiTinhChuHo = (Integer)attributes.get("gioiTinhChuHo");

		if (gioiTinhChuHo != null) {
			setGioiTinhChuHo(gioiTinhChuHo);
		}

		Integer trangThai = (Integer)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer mauNgauNhien = (Integer)attributes.get("mauNgauNhien");

		if (mauNgauNhien != null) {
			setMauNgauNhien(mauNgauNhien);
		}

		Integer namBaoCao = (Integer)attributes.get("namBaoCao");

		if (namBaoCao != null) {
			setNamBaoCao(namBaoCao);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Integer idNguoiTao = (Integer)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		Integer soNguoiTrongHo = (Integer)attributes.get("soNguoiTrongHo");

		if (soNguoiTrongHo != null) {
			setSoNguoiTrongHo(soNguoiTrongHo);
		}

		Integer thanhPhanHoGD = (Integer)attributes.get("thanhPhanHoGD");

		if (thanhPhanHoGD != null) {
			setThanhPhanHoGD(thanhPhanHoGD);
		}

		String kinhDo = (String)attributes.get("kinhDo");

		if (kinhDo != null) {
			setKinhDo(kinhDo);
		}

		String viDo = (String)attributes.get("viDo");

		if (viDo != null) {
			setViDo(viDo);
		}

		Integer coNhaTieu = (Integer)attributes.get("coNhaTieu");

		if (coNhaTieu != null) {
			setCoNhaTieu(coNhaTieu);
		}

		Integer nhaTieuHVS = (Integer)attributes.get("nhaTieuHVS");

		if (nhaTieuHVS != null) {
			setNhaTieuHVS(nhaTieuHVS);
		}

		String loaiNhaTieu = (String)attributes.get("loaiNhaTieu");

		if (loaiNhaTieu != null) {
			setLoaiNhaTieu(loaiNhaTieu);
		}

		Integer duocCaiTao = (Integer)attributes.get("duocCaiTao");

		if (duocCaiTao != null) {
			setDuocCaiTao(duocCaiTao);
		}

		Integer thangXayDung = (Integer)attributes.get("thangXayDung");

		if (thangXayDung != null) {
			setThangXayDung(thangXayDung);
		}

		Integer namXayDung = (Integer)attributes.get("namXayDung");

		if (namXayDung != null) {
			setNamXayDung(namXayDung);
		}

		Integer nguonVon = (Integer)attributes.get("nguonVon");

		if (nguonVon != null) {
			setNguonVon(nguonVon);
		}

		Date ngayKiemDem = (Date)attributes.get("ngayKiemDem");

		if (ngayKiemDem != null) {
			setNgayKiemDem(ngayKiemDem);
		}

		Date ngayDanhGia = (Date)attributes.get("ngayDanhGia");

		if (ngayDanhGia != null) {
			setNgayDanhGia(ngayDanhGia);
		}

		Integer idNguoiDanhGia = (Integer)attributes.get("idNguoiDanhGia");

		if (idNguoiDanhGia != null) {
			setIdNguoiDanhGia(idNguoiDanhGia);
		}
	}

	/**
	* Returns the primary key of this ve sinh gia dinh.
	*
	* @return the primary key of this ve sinh gia dinh
	*/
	@Override
	public int getPrimaryKey() {
		return _veSinhGiaDinh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ve sinh gia dinh.
	*
	* @param primaryKey the primary key of this ve sinh gia dinh
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_veSinhGiaDinh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this ve sinh gia dinh.
	*
	* @return the ID of this ve sinh gia dinh
	*/
	@Override
	public int getId() {
		return _veSinhGiaDinh.getId();
	}

	/**
	* Sets the ID of this ve sinh gia dinh.
	*
	* @param id the ID of this ve sinh gia dinh
	*/
	@Override
	public void setId(int id) {
		_veSinhGiaDinh.setId(id);
	}

	/**
	* Returns the ma tinh of this ve sinh gia dinh.
	*
	* @return the ma tinh of this ve sinh gia dinh
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _veSinhGiaDinh.getMaTinh();
	}

	/**
	* Sets the ma tinh of this ve sinh gia dinh.
	*
	* @param maTinh the ma tinh of this ve sinh gia dinh
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_veSinhGiaDinh.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this ve sinh gia dinh.
	*
	* @return the ma huyen of this ve sinh gia dinh
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _veSinhGiaDinh.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this ve sinh gia dinh.
	*
	* @param maHuyen the ma huyen of this ve sinh gia dinh
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_veSinhGiaDinh.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ma xa of this ve sinh gia dinh.
	*
	* @return the ma xa of this ve sinh gia dinh
	*/
	@Override
	public java.lang.String getMaXa() {
		return _veSinhGiaDinh.getMaXa();
	}

	/**
	* Sets the ma xa of this ve sinh gia dinh.
	*
	* @param maXa the ma xa of this ve sinh gia dinh
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_veSinhGiaDinh.setMaXa(maXa);
	}

	/**
	* Returns the thon xom of this ve sinh gia dinh.
	*
	* @return the thon xom of this ve sinh gia dinh
	*/
	@Override
	public java.lang.String getThonXom() {
		return _veSinhGiaDinh.getThonXom();
	}

	/**
	* Sets the thon xom of this ve sinh gia dinh.
	*
	* @param thonXom the thon xom of this ve sinh gia dinh
	*/
	@Override
	public void setThonXom(java.lang.String thonXom) {
		_veSinhGiaDinh.setThonXom(thonXom);
	}

	/**
	* Returns the ten chu ho of this ve sinh gia dinh.
	*
	* @return the ten chu ho of this ve sinh gia dinh
	*/
	@Override
	public java.lang.String getTenChuHo() {
		return _veSinhGiaDinh.getTenChuHo();
	}

	/**
	* Sets the ten chu ho of this ve sinh gia dinh.
	*
	* @param tenChuHo the ten chu ho of this ve sinh gia dinh
	*/
	@Override
	public void setTenChuHo(java.lang.String tenChuHo) {
		_veSinhGiaDinh.setTenChuHo(tenChuHo);
	}

	/**
	* Returns the gioi tinh chu ho of this ve sinh gia dinh.
	*
	* @return the gioi tinh chu ho of this ve sinh gia dinh
	*/
	@Override
	public int getGioiTinhChuHo() {
		return _veSinhGiaDinh.getGioiTinhChuHo();
	}

	/**
	* Sets the gioi tinh chu ho of this ve sinh gia dinh.
	*
	* @param gioiTinhChuHo the gioi tinh chu ho of this ve sinh gia dinh
	*/
	@Override
	public void setGioiTinhChuHo(int gioiTinhChuHo) {
		_veSinhGiaDinh.setGioiTinhChuHo(gioiTinhChuHo);
	}

	/**
	* Returns the trang thai of this ve sinh gia dinh.
	*
	* @return the trang thai of this ve sinh gia dinh
	*/
	@Override
	public int getTrangThai() {
		return _veSinhGiaDinh.getTrangThai();
	}

	/**
	* Sets the trang thai of this ve sinh gia dinh.
	*
	* @param trangThai the trang thai of this ve sinh gia dinh
	*/
	@Override
	public void setTrangThai(int trangThai) {
		_veSinhGiaDinh.setTrangThai(trangThai);
	}

	/**
	* Returns the mau ngau nhien of this ve sinh gia dinh.
	*
	* @return the mau ngau nhien of this ve sinh gia dinh
	*/
	@Override
	public int getMauNgauNhien() {
		return _veSinhGiaDinh.getMauNgauNhien();
	}

	/**
	* Sets the mau ngau nhien of this ve sinh gia dinh.
	*
	* @param mauNgauNhien the mau ngau nhien of this ve sinh gia dinh
	*/
	@Override
	public void setMauNgauNhien(int mauNgauNhien) {
		_veSinhGiaDinh.setMauNgauNhien(mauNgauNhien);
	}

	/**
	* Returns the nam bao cao of this ve sinh gia dinh.
	*
	* @return the nam bao cao of this ve sinh gia dinh
	*/
	@Override
	public int getNamBaoCao() {
		return _veSinhGiaDinh.getNamBaoCao();
	}

	/**
	* Sets the nam bao cao of this ve sinh gia dinh.
	*
	* @param namBaoCao the nam bao cao of this ve sinh gia dinh
	*/
	@Override
	public void setNamBaoCao(int namBaoCao) {
		_veSinhGiaDinh.setNamBaoCao(namBaoCao);
	}

	/**
	* Returns the ghi chu of this ve sinh gia dinh.
	*
	* @return the ghi chu of this ve sinh gia dinh
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _veSinhGiaDinh.getGhiChu();
	}

	/**
	* Sets the ghi chu of this ve sinh gia dinh.
	*
	* @param ghiChu the ghi chu of this ve sinh gia dinh
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_veSinhGiaDinh.setGhiChu(ghiChu);
	}

	/**
	* Returns the ngay tao of this ve sinh gia dinh.
	*
	* @return the ngay tao of this ve sinh gia dinh
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _veSinhGiaDinh.getNgayTao();
	}

	/**
	* Sets the ngay tao of this ve sinh gia dinh.
	*
	* @param ngayTao the ngay tao of this ve sinh gia dinh
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_veSinhGiaDinh.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this ve sinh gia dinh.
	*
	* @return the id nguoi tao of this ve sinh gia dinh
	*/
	@Override
	public int getIdNguoiTao() {
		return _veSinhGiaDinh.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this ve sinh gia dinh.
	*
	* @param idNguoiTao the id nguoi tao of this ve sinh gia dinh
	*/
	@Override
	public void setIdNguoiTao(int idNguoiTao) {
		_veSinhGiaDinh.setIdNguoiTao(idNguoiTao);
	}

	/**
	* Returns the so nguoi trong ho of this ve sinh gia dinh.
	*
	* @return the so nguoi trong ho of this ve sinh gia dinh
	*/
	@Override
	public int getSoNguoiTrongHo() {
		return _veSinhGiaDinh.getSoNguoiTrongHo();
	}

	/**
	* Sets the so nguoi trong ho of this ve sinh gia dinh.
	*
	* @param soNguoiTrongHo the so nguoi trong ho of this ve sinh gia dinh
	*/
	@Override
	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		_veSinhGiaDinh.setSoNguoiTrongHo(soNguoiTrongHo);
	}

	/**
	* Returns the thanh phan ho g d of this ve sinh gia dinh.
	*
	* @return the thanh phan ho g d of this ve sinh gia dinh
	*/
	@Override
	public int getThanhPhanHoGD() {
		return _veSinhGiaDinh.getThanhPhanHoGD();
	}

	/**
	* Sets the thanh phan ho g d of this ve sinh gia dinh.
	*
	* @param thanhPhanHoGD the thanh phan ho g d of this ve sinh gia dinh
	*/
	@Override
	public void setThanhPhanHoGD(int thanhPhanHoGD) {
		_veSinhGiaDinh.setThanhPhanHoGD(thanhPhanHoGD);
	}

	/**
	* Returns the kinh do of this ve sinh gia dinh.
	*
	* @return the kinh do of this ve sinh gia dinh
	*/
	@Override
	public java.lang.String getKinhDo() {
		return _veSinhGiaDinh.getKinhDo();
	}

	/**
	* Sets the kinh do of this ve sinh gia dinh.
	*
	* @param kinhDo the kinh do of this ve sinh gia dinh
	*/
	@Override
	public void setKinhDo(java.lang.String kinhDo) {
		_veSinhGiaDinh.setKinhDo(kinhDo);
	}

	/**
	* Returns the vi do of this ve sinh gia dinh.
	*
	* @return the vi do of this ve sinh gia dinh
	*/
	@Override
	public java.lang.String getViDo() {
		return _veSinhGiaDinh.getViDo();
	}

	/**
	* Sets the vi do of this ve sinh gia dinh.
	*
	* @param viDo the vi do of this ve sinh gia dinh
	*/
	@Override
	public void setViDo(java.lang.String viDo) {
		_veSinhGiaDinh.setViDo(viDo);
	}

	/**
	* Returns the co nha tieu of this ve sinh gia dinh.
	*
	* @return the co nha tieu of this ve sinh gia dinh
	*/
	@Override
	public int getCoNhaTieu() {
		return _veSinhGiaDinh.getCoNhaTieu();
	}

	/**
	* Sets the co nha tieu of this ve sinh gia dinh.
	*
	* @param coNhaTieu the co nha tieu of this ve sinh gia dinh
	*/
	@Override
	public void setCoNhaTieu(int coNhaTieu) {
		_veSinhGiaDinh.setCoNhaTieu(coNhaTieu);
	}

	/**
	* Returns the nha tieu h v s of this ve sinh gia dinh.
	*
	* @return the nha tieu h v s of this ve sinh gia dinh
	*/
	@Override
	public int getNhaTieuHVS() {
		return _veSinhGiaDinh.getNhaTieuHVS();
	}

	/**
	* Sets the nha tieu h v s of this ve sinh gia dinh.
	*
	* @param nhaTieuHVS the nha tieu h v s of this ve sinh gia dinh
	*/
	@Override
	public void setNhaTieuHVS(int nhaTieuHVS) {
		_veSinhGiaDinh.setNhaTieuHVS(nhaTieuHVS);
	}

	/**
	* Returns the loai nha tieu of this ve sinh gia dinh.
	*
	* @return the loai nha tieu of this ve sinh gia dinh
	*/
	@Override
	public java.lang.String getLoaiNhaTieu() {
		return _veSinhGiaDinh.getLoaiNhaTieu();
	}

	/**
	* Sets the loai nha tieu of this ve sinh gia dinh.
	*
	* @param loaiNhaTieu the loai nha tieu of this ve sinh gia dinh
	*/
	@Override
	public void setLoaiNhaTieu(java.lang.String loaiNhaTieu) {
		_veSinhGiaDinh.setLoaiNhaTieu(loaiNhaTieu);
	}

	/**
	* Returns the duoc cai tao of this ve sinh gia dinh.
	*
	* @return the duoc cai tao of this ve sinh gia dinh
	*/
	@Override
	public int getDuocCaiTao() {
		return _veSinhGiaDinh.getDuocCaiTao();
	}

	/**
	* Sets the duoc cai tao of this ve sinh gia dinh.
	*
	* @param duocCaiTao the duoc cai tao of this ve sinh gia dinh
	*/
	@Override
	public void setDuocCaiTao(int duocCaiTao) {
		_veSinhGiaDinh.setDuocCaiTao(duocCaiTao);
	}

	/**
	* Returns the thang xay dung of this ve sinh gia dinh.
	*
	* @return the thang xay dung of this ve sinh gia dinh
	*/
	@Override
	public int getThangXayDung() {
		return _veSinhGiaDinh.getThangXayDung();
	}

	/**
	* Sets the thang xay dung of this ve sinh gia dinh.
	*
	* @param thangXayDung the thang xay dung of this ve sinh gia dinh
	*/
	@Override
	public void setThangXayDung(int thangXayDung) {
		_veSinhGiaDinh.setThangXayDung(thangXayDung);
	}

	/**
	* Returns the nam xay dung of this ve sinh gia dinh.
	*
	* @return the nam xay dung of this ve sinh gia dinh
	*/
	@Override
	public int getNamXayDung() {
		return _veSinhGiaDinh.getNamXayDung();
	}

	/**
	* Sets the nam xay dung of this ve sinh gia dinh.
	*
	* @param namXayDung the nam xay dung of this ve sinh gia dinh
	*/
	@Override
	public void setNamXayDung(int namXayDung) {
		_veSinhGiaDinh.setNamXayDung(namXayDung);
	}

	/**
	* Returns the nguon von of this ve sinh gia dinh.
	*
	* @return the nguon von of this ve sinh gia dinh
	*/
	@Override
	public int getNguonVon() {
		return _veSinhGiaDinh.getNguonVon();
	}

	/**
	* Sets the nguon von of this ve sinh gia dinh.
	*
	* @param nguonVon the nguon von of this ve sinh gia dinh
	*/
	@Override
	public void setNguonVon(int nguonVon) {
		_veSinhGiaDinh.setNguonVon(nguonVon);
	}

	/**
	* Returns the ngay kiem dem of this ve sinh gia dinh.
	*
	* @return the ngay kiem dem of this ve sinh gia dinh
	*/
	@Override
	public java.util.Date getNgayKiemDem() {
		return _veSinhGiaDinh.getNgayKiemDem();
	}

	/**
	* Sets the ngay kiem dem of this ve sinh gia dinh.
	*
	* @param ngayKiemDem the ngay kiem dem of this ve sinh gia dinh
	*/
	@Override
	public void setNgayKiemDem(java.util.Date ngayKiemDem) {
		_veSinhGiaDinh.setNgayKiemDem(ngayKiemDem);
	}

	/**
	* Returns the ngay danh gia of this ve sinh gia dinh.
	*
	* @return the ngay danh gia of this ve sinh gia dinh
	*/
	@Override
	public java.util.Date getNgayDanhGia() {
		return _veSinhGiaDinh.getNgayDanhGia();
	}

	/**
	* Sets the ngay danh gia of this ve sinh gia dinh.
	*
	* @param ngayDanhGia the ngay danh gia of this ve sinh gia dinh
	*/
	@Override
	public void setNgayDanhGia(java.util.Date ngayDanhGia) {
		_veSinhGiaDinh.setNgayDanhGia(ngayDanhGia);
	}

	/**
	* Returns the id nguoi danh gia of this ve sinh gia dinh.
	*
	* @return the id nguoi danh gia of this ve sinh gia dinh
	*/
	@Override
	public int getIdNguoiDanhGia() {
		return _veSinhGiaDinh.getIdNguoiDanhGia();
	}

	/**
	* Sets the id nguoi danh gia of this ve sinh gia dinh.
	*
	* @param idNguoiDanhGia the id nguoi danh gia of this ve sinh gia dinh
	*/
	@Override
	public void setIdNguoiDanhGia(int idNguoiDanhGia) {
		_veSinhGiaDinh.setIdNguoiDanhGia(idNguoiDanhGia);
	}

	@Override
	public boolean isNew() {
		return _veSinhGiaDinh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_veSinhGiaDinh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _veSinhGiaDinh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_veSinhGiaDinh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _veSinhGiaDinh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _veSinhGiaDinh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_veSinhGiaDinh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _veSinhGiaDinh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_veSinhGiaDinh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_veSinhGiaDinh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_veSinhGiaDinh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VeSinhGiaDinhWrapper((VeSinhGiaDinh)_veSinhGiaDinh.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh veSinhGiaDinh) {
		return _veSinhGiaDinh.compareTo(veSinhGiaDinh);
	}

	@Override
	public int hashCode() {
		return _veSinhGiaDinh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh> toCacheModel() {
		return _veSinhGiaDinh.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh toEscapedModel() {
		return new VeSinhGiaDinhWrapper(_veSinhGiaDinh.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh toUnescapedModel() {
		return new VeSinhGiaDinhWrapper(_veSinhGiaDinh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _veSinhGiaDinh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _veSinhGiaDinh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_veSinhGiaDinh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VeSinhGiaDinhWrapper)) {
			return false;
		}

		VeSinhGiaDinhWrapper veSinhGiaDinhWrapper = (VeSinhGiaDinhWrapper)obj;

		if (Validator.equals(_veSinhGiaDinh, veSinhGiaDinhWrapper._veSinhGiaDinh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VeSinhGiaDinh getWrappedVeSinhGiaDinh() {
		return _veSinhGiaDinh;
	}

	@Override
	public VeSinhGiaDinh getWrappedModel() {
		return _veSinhGiaDinh;
	}

	@Override
	public void resetOriginalValues() {
		_veSinhGiaDinh.resetOriginalValues();
	}

	private VeSinhGiaDinh _veSinhGiaDinh;
}