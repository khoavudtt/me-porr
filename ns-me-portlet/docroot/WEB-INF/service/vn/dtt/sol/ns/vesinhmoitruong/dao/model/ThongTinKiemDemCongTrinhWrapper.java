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
 * This class is a wrapper for {@link ThongTinKiemDemCongTrinh}.
 * </p>
 *
 * @author BinhTH
 * @see ThongTinKiemDemCongTrinh
 * @generated
 */
public class ThongTinKiemDemCongTrinhWrapper implements ThongTinKiemDemCongTrinh,
	ModelWrapper<ThongTinKiemDemCongTrinh> {
	public ThongTinKiemDemCongTrinhWrapper(
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh) {
		_thongTinKiemDemCongTrinh = thongTinKiemDemCongTrinh;
	}

	@Override
	public Class<?> getModelClass() {
		return ThongTinKiemDemCongTrinh.class;
	}

	@Override
	public String getModelClassName() {
		return ThongTinKiemDemCongTrinh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("veSinhConTrinhId", getVeSinhConTrinhId());
		attributes.put("keHoachKiemDemVeSinhId", getKeHoachKiemDemVeSinhId());
		attributes.put("tenCongTrinh", getTenCongTrinh());
		attributes.put("loaiCongTrinh", getLoaiCongTrinh());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("diaChi", getDiaChi());
		attributes.put("ngayKiemDem", getNgayKiemDem());
		attributes.put("hoTenNguoiTraLoi", getHoTenNguoiTraLoi());
		attributes.put("soDienThoai", getSoDienThoai());
		attributes.put("gioiTinhNguoiTraLoi", getGioiTinhNguoiTraLoi());
		attributes.put("vaiTroChucDanh", getVaiTroChucDanh());
		attributes.put("soCa", getSoCa());
		attributes.put("soNguoiTrongCa", getSoNguoiTrongCa());
		attributes.put("kinhDo", getKinhDo());
		attributes.put("viDo", getViDo());
		attributes.put("loaiNguonNuoc", getLoaiNguonNuoc());
		attributes.put("daTQCVN", getDaTQCVN());
		attributes.put("datTieuChuanHVS", getDatTieuChuanHVS());
		attributes.put("anhChupChungNhan", getAnhChupChungNhan());
		attributes.put("soNhaTieu", getSoNhaTieu());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("daKetThucDieuTra", getDaKetThucDieuTra());
		attributes.put("lyDoKhongHoanThanh", getLyDoKhongHoanThanh());
		attributes.put("imei", getImei());
		attributes.put("taiKhoan", getTaiKhoan());
		attributes.put("danhGiaKiemDem", getDanhGiaKiemDem());
		attributes.put("savePoint", getSavePoint());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer veSinhConTrinhId = (Integer)attributes.get("veSinhConTrinhId");

		if (veSinhConTrinhId != null) {
			setVeSinhConTrinhId(veSinhConTrinhId);
		}

		Integer keHoachKiemDemVeSinhId = (Integer)attributes.get(
				"keHoachKiemDemVeSinhId");

		if (keHoachKiemDemVeSinhId != null) {
			setKeHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);
		}

		String tenCongTrinh = (String)attributes.get("tenCongTrinh");

		if (tenCongTrinh != null) {
			setTenCongTrinh(tenCongTrinh);
		}

		Integer loaiCongTrinh = (Integer)attributes.get("loaiCongTrinh");

		if (loaiCongTrinh != null) {
			setLoaiCongTrinh(loaiCongTrinh);
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

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		Date ngayKiemDem = (Date)attributes.get("ngayKiemDem");

		if (ngayKiemDem != null) {
			setNgayKiemDem(ngayKiemDem);
		}

		String hoTenNguoiTraLoi = (String)attributes.get("hoTenNguoiTraLoi");

		if (hoTenNguoiTraLoi != null) {
			setHoTenNguoiTraLoi(hoTenNguoiTraLoi);
		}

		String soDienThoai = (String)attributes.get("soDienThoai");

		if (soDienThoai != null) {
			setSoDienThoai(soDienThoai);
		}

		String gioiTinhNguoiTraLoi = (String)attributes.get(
				"gioiTinhNguoiTraLoi");

		if (gioiTinhNguoiTraLoi != null) {
			setGioiTinhNguoiTraLoi(gioiTinhNguoiTraLoi);
		}

		String vaiTroChucDanh = (String)attributes.get("vaiTroChucDanh");

		if (vaiTroChucDanh != null) {
			setVaiTroChucDanh(vaiTroChucDanh);
		}

		Integer soCa = (Integer)attributes.get("soCa");

		if (soCa != null) {
			setSoCa(soCa);
		}

		Integer soNguoiTrongCa = (Integer)attributes.get("soNguoiTrongCa");

		if (soNguoiTrongCa != null) {
			setSoNguoiTrongCa(soNguoiTrongCa);
		}

		String kinhDo = (String)attributes.get("kinhDo");

		if (kinhDo != null) {
			setKinhDo(kinhDo);
		}

		String viDo = (String)attributes.get("viDo");

		if (viDo != null) {
			setViDo(viDo);
		}

		String loaiNguonNuoc = (String)attributes.get("loaiNguonNuoc");

		if (loaiNguonNuoc != null) {
			setLoaiNguonNuoc(loaiNguonNuoc);
		}

		Integer daTQCVN = (Integer)attributes.get("daTQCVN");

		if (daTQCVN != null) {
			setDaTQCVN(daTQCVN);
		}

		Integer datTieuChuanHVS = (Integer)attributes.get("datTieuChuanHVS");

		if (datTieuChuanHVS != null) {
			setDatTieuChuanHVS(datTieuChuanHVS);
		}

		String anhChupChungNhan = (String)attributes.get("anhChupChungNhan");

		if (anhChupChungNhan != null) {
			setAnhChupChungNhan(anhChupChungNhan);
		}

		Integer soNhaTieu = (Integer)attributes.get("soNhaTieu");

		if (soNhaTieu != null) {
			setSoNhaTieu(soNhaTieu);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Integer daKetThucDieuTra = (Integer)attributes.get("daKetThucDieuTra");

		if (daKetThucDieuTra != null) {
			setDaKetThucDieuTra(daKetThucDieuTra);
		}

		String lyDoKhongHoanThanh = (String)attributes.get("lyDoKhongHoanThanh");

		if (lyDoKhongHoanThanh != null) {
			setLyDoKhongHoanThanh(lyDoKhongHoanThanh);
		}

		String imei = (String)attributes.get("imei");

		if (imei != null) {
			setImei(imei);
		}

		String taiKhoan = (String)attributes.get("taiKhoan");

		if (taiKhoan != null) {
			setTaiKhoan(taiKhoan);
		}

		Integer danhGiaKiemDem = (Integer)attributes.get("danhGiaKiemDem");

		if (danhGiaKiemDem != null) {
			setDanhGiaKiemDem(danhGiaKiemDem);
		}

		Date savePoint = (Date)attributes.get("savePoint");

		if (savePoint != null) {
			setSavePoint(savePoint);
		}
	}

	/**
	* Returns the primary key of this thong tin kiem dem cong trinh.
	*
	* @return the primary key of this thong tin kiem dem cong trinh
	*/
	@Override
	public int getPrimaryKey() {
		return _thongTinKiemDemCongTrinh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this thong tin kiem dem cong trinh.
	*
	* @param primaryKey the primary key of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_thongTinKiemDemCongTrinh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this thong tin kiem dem cong trinh.
	*
	* @return the ID of this thong tin kiem dem cong trinh
	*/
	@Override
	public int getId() {
		return _thongTinKiemDemCongTrinh.getId();
	}

	/**
	* Sets the ID of this thong tin kiem dem cong trinh.
	*
	* @param id the ID of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setId(int id) {
		_thongTinKiemDemCongTrinh.setId(id);
	}

	/**
	* Returns the ve sinh con trinh ID of this thong tin kiem dem cong trinh.
	*
	* @return the ve sinh con trinh ID of this thong tin kiem dem cong trinh
	*/
	@Override
	public int getVeSinhConTrinhId() {
		return _thongTinKiemDemCongTrinh.getVeSinhConTrinhId();
	}

	/**
	* Sets the ve sinh con trinh ID of this thong tin kiem dem cong trinh.
	*
	* @param veSinhConTrinhId the ve sinh con trinh ID of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setVeSinhConTrinhId(int veSinhConTrinhId) {
		_thongTinKiemDemCongTrinh.setVeSinhConTrinhId(veSinhConTrinhId);
	}

	/**
	* Returns the ke hoach kiem dem ve sinh ID of this thong tin kiem dem cong trinh.
	*
	* @return the ke hoach kiem dem ve sinh ID of this thong tin kiem dem cong trinh
	*/
	@Override
	public int getKeHoachKiemDemVeSinhId() {
		return _thongTinKiemDemCongTrinh.getKeHoachKiemDemVeSinhId();
	}

	/**
	* Sets the ke hoach kiem dem ve sinh ID of this thong tin kiem dem cong trinh.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setKeHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId) {
		_thongTinKiemDemCongTrinh.setKeHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);
	}

	/**
	* Returns the ten cong trinh of this thong tin kiem dem cong trinh.
	*
	* @return the ten cong trinh of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getTenCongTrinh() {
		return _thongTinKiemDemCongTrinh.getTenCongTrinh();
	}

	/**
	* Sets the ten cong trinh of this thong tin kiem dem cong trinh.
	*
	* @param tenCongTrinh the ten cong trinh of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setTenCongTrinh(java.lang.String tenCongTrinh) {
		_thongTinKiemDemCongTrinh.setTenCongTrinh(tenCongTrinh);
	}

	/**
	* Returns the loai cong trinh of this thong tin kiem dem cong trinh.
	*
	* @return the loai cong trinh of this thong tin kiem dem cong trinh
	*/
	@Override
	public int getLoaiCongTrinh() {
		return _thongTinKiemDemCongTrinh.getLoaiCongTrinh();
	}

	/**
	* Sets the loai cong trinh of this thong tin kiem dem cong trinh.
	*
	* @param loaiCongTrinh the loai cong trinh of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setLoaiCongTrinh(int loaiCongTrinh) {
		_thongTinKiemDemCongTrinh.setLoaiCongTrinh(loaiCongTrinh);
	}

	/**
	* Returns the ma tinh of this thong tin kiem dem cong trinh.
	*
	* @return the ma tinh of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _thongTinKiemDemCongTrinh.getMaTinh();
	}

	/**
	* Sets the ma tinh of this thong tin kiem dem cong trinh.
	*
	* @param maTinh the ma tinh of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_thongTinKiemDemCongTrinh.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this thong tin kiem dem cong trinh.
	*
	* @return the ma huyen of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _thongTinKiemDemCongTrinh.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this thong tin kiem dem cong trinh.
	*
	* @param maHuyen the ma huyen of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_thongTinKiemDemCongTrinh.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ma xa of this thong tin kiem dem cong trinh.
	*
	* @return the ma xa of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getMaXa() {
		return _thongTinKiemDemCongTrinh.getMaXa();
	}

	/**
	* Sets the ma xa of this thong tin kiem dem cong trinh.
	*
	* @param maXa the ma xa of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_thongTinKiemDemCongTrinh.setMaXa(maXa);
	}

	/**
	* Returns the dia chi of this thong tin kiem dem cong trinh.
	*
	* @return the dia chi of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _thongTinKiemDemCongTrinh.getDiaChi();
	}

	/**
	* Sets the dia chi of this thong tin kiem dem cong trinh.
	*
	* @param diaChi the dia chi of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setDiaChi(java.lang.String diaChi) {
		_thongTinKiemDemCongTrinh.setDiaChi(diaChi);
	}

	/**
	* Returns the ngay kiem dem of this thong tin kiem dem cong trinh.
	*
	* @return the ngay kiem dem of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.util.Date getNgayKiemDem() {
		return _thongTinKiemDemCongTrinh.getNgayKiemDem();
	}

	/**
	* Sets the ngay kiem dem of this thong tin kiem dem cong trinh.
	*
	* @param ngayKiemDem the ngay kiem dem of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setNgayKiemDem(java.util.Date ngayKiemDem) {
		_thongTinKiemDemCongTrinh.setNgayKiemDem(ngayKiemDem);
	}

	/**
	* Returns the ho ten nguoi tra loi of this thong tin kiem dem cong trinh.
	*
	* @return the ho ten nguoi tra loi of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getHoTenNguoiTraLoi() {
		return _thongTinKiemDemCongTrinh.getHoTenNguoiTraLoi();
	}

	/**
	* Sets the ho ten nguoi tra loi of this thong tin kiem dem cong trinh.
	*
	* @param hoTenNguoiTraLoi the ho ten nguoi tra loi of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setHoTenNguoiTraLoi(java.lang.String hoTenNguoiTraLoi) {
		_thongTinKiemDemCongTrinh.setHoTenNguoiTraLoi(hoTenNguoiTraLoi);
	}

	/**
	* Returns the so dien thoai of this thong tin kiem dem cong trinh.
	*
	* @return the so dien thoai of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getSoDienThoai() {
		return _thongTinKiemDemCongTrinh.getSoDienThoai();
	}

	/**
	* Sets the so dien thoai of this thong tin kiem dem cong trinh.
	*
	* @param soDienThoai the so dien thoai of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setSoDienThoai(java.lang.String soDienThoai) {
		_thongTinKiemDemCongTrinh.setSoDienThoai(soDienThoai);
	}

	/**
	* Returns the gioi tinh nguoi tra loi of this thong tin kiem dem cong trinh.
	*
	* @return the gioi tinh nguoi tra loi of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getGioiTinhNguoiTraLoi() {
		return _thongTinKiemDemCongTrinh.getGioiTinhNguoiTraLoi();
	}

	/**
	* Sets the gioi tinh nguoi tra loi of this thong tin kiem dem cong trinh.
	*
	* @param gioiTinhNguoiTraLoi the gioi tinh nguoi tra loi of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setGioiTinhNguoiTraLoi(java.lang.String gioiTinhNguoiTraLoi) {
		_thongTinKiemDemCongTrinh.setGioiTinhNguoiTraLoi(gioiTinhNguoiTraLoi);
	}

	/**
	* Returns the vai tro chuc danh of this thong tin kiem dem cong trinh.
	*
	* @return the vai tro chuc danh of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getVaiTroChucDanh() {
		return _thongTinKiemDemCongTrinh.getVaiTroChucDanh();
	}

	/**
	* Sets the vai tro chuc danh of this thong tin kiem dem cong trinh.
	*
	* @param vaiTroChucDanh the vai tro chuc danh of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setVaiTroChucDanh(java.lang.String vaiTroChucDanh) {
		_thongTinKiemDemCongTrinh.setVaiTroChucDanh(vaiTroChucDanh);
	}

	/**
	* Returns the so ca of this thong tin kiem dem cong trinh.
	*
	* @return the so ca of this thong tin kiem dem cong trinh
	*/
	@Override
	public int getSoCa() {
		return _thongTinKiemDemCongTrinh.getSoCa();
	}

	/**
	* Sets the so ca of this thong tin kiem dem cong trinh.
	*
	* @param soCa the so ca of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setSoCa(int soCa) {
		_thongTinKiemDemCongTrinh.setSoCa(soCa);
	}

	/**
	* Returns the so nguoi trong ca of this thong tin kiem dem cong trinh.
	*
	* @return the so nguoi trong ca of this thong tin kiem dem cong trinh
	*/
	@Override
	public int getSoNguoiTrongCa() {
		return _thongTinKiemDemCongTrinh.getSoNguoiTrongCa();
	}

	/**
	* Sets the so nguoi trong ca of this thong tin kiem dem cong trinh.
	*
	* @param soNguoiTrongCa the so nguoi trong ca of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setSoNguoiTrongCa(int soNguoiTrongCa) {
		_thongTinKiemDemCongTrinh.setSoNguoiTrongCa(soNguoiTrongCa);
	}

	/**
	* Returns the kinh do of this thong tin kiem dem cong trinh.
	*
	* @return the kinh do of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getKinhDo() {
		return _thongTinKiemDemCongTrinh.getKinhDo();
	}

	/**
	* Sets the kinh do of this thong tin kiem dem cong trinh.
	*
	* @param kinhDo the kinh do of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setKinhDo(java.lang.String kinhDo) {
		_thongTinKiemDemCongTrinh.setKinhDo(kinhDo);
	}

	/**
	* Returns the vi do of this thong tin kiem dem cong trinh.
	*
	* @return the vi do of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getViDo() {
		return _thongTinKiemDemCongTrinh.getViDo();
	}

	/**
	* Sets the vi do of this thong tin kiem dem cong trinh.
	*
	* @param viDo the vi do of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setViDo(java.lang.String viDo) {
		_thongTinKiemDemCongTrinh.setViDo(viDo);
	}

	/**
	* Returns the loai nguon nuoc of this thong tin kiem dem cong trinh.
	*
	* @return the loai nguon nuoc of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getLoaiNguonNuoc() {
		return _thongTinKiemDemCongTrinh.getLoaiNguonNuoc();
	}

	/**
	* Sets the loai nguon nuoc of this thong tin kiem dem cong trinh.
	*
	* @param loaiNguonNuoc the loai nguon nuoc of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setLoaiNguonNuoc(java.lang.String loaiNguonNuoc) {
		_thongTinKiemDemCongTrinh.setLoaiNguonNuoc(loaiNguonNuoc);
	}

	/**
	* Returns the da t q c v n of this thong tin kiem dem cong trinh.
	*
	* @return the da t q c v n of this thong tin kiem dem cong trinh
	*/
	@Override
	public int getDaTQCVN() {
		return _thongTinKiemDemCongTrinh.getDaTQCVN();
	}

	/**
	* Sets the da t q c v n of this thong tin kiem dem cong trinh.
	*
	* @param daTQCVN the da t q c v n of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setDaTQCVN(int daTQCVN) {
		_thongTinKiemDemCongTrinh.setDaTQCVN(daTQCVN);
	}

	/**
	* Returns the dat tieu chuan h v s of this thong tin kiem dem cong trinh.
	*
	* @return the dat tieu chuan h v s of this thong tin kiem dem cong trinh
	*/
	@Override
	public int getDatTieuChuanHVS() {
		return _thongTinKiemDemCongTrinh.getDatTieuChuanHVS();
	}

	/**
	* Sets the dat tieu chuan h v s of this thong tin kiem dem cong trinh.
	*
	* @param datTieuChuanHVS the dat tieu chuan h v s of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setDatTieuChuanHVS(int datTieuChuanHVS) {
		_thongTinKiemDemCongTrinh.setDatTieuChuanHVS(datTieuChuanHVS);
	}

	/**
	* Returns the anh chup chung nhan of this thong tin kiem dem cong trinh.
	*
	* @return the anh chup chung nhan of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getAnhChupChungNhan() {
		return _thongTinKiemDemCongTrinh.getAnhChupChungNhan();
	}

	/**
	* Sets the anh chup chung nhan of this thong tin kiem dem cong trinh.
	*
	* @param anhChupChungNhan the anh chup chung nhan of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setAnhChupChungNhan(java.lang.String anhChupChungNhan) {
		_thongTinKiemDemCongTrinh.setAnhChupChungNhan(anhChupChungNhan);
	}

	/**
	* Returns the so nha tieu of this thong tin kiem dem cong trinh.
	*
	* @return the so nha tieu of this thong tin kiem dem cong trinh
	*/
	@Override
	public int getSoNhaTieu() {
		return _thongTinKiemDemCongTrinh.getSoNhaTieu();
	}

	/**
	* Sets the so nha tieu of this thong tin kiem dem cong trinh.
	*
	* @param soNhaTieu the so nha tieu of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setSoNhaTieu(int soNhaTieu) {
		_thongTinKiemDemCongTrinh.setSoNhaTieu(soNhaTieu);
	}

	/**
	* Returns the ghi chu of this thong tin kiem dem cong trinh.
	*
	* @return the ghi chu of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _thongTinKiemDemCongTrinh.getGhiChu();
	}

	/**
	* Sets the ghi chu of this thong tin kiem dem cong trinh.
	*
	* @param ghiChu the ghi chu of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_thongTinKiemDemCongTrinh.setGhiChu(ghiChu);
	}

	/**
	* Returns the da ket thuc dieu tra of this thong tin kiem dem cong trinh.
	*
	* @return the da ket thuc dieu tra of this thong tin kiem dem cong trinh
	*/
	@Override
	public int getDaKetThucDieuTra() {
		return _thongTinKiemDemCongTrinh.getDaKetThucDieuTra();
	}

	/**
	* Sets the da ket thuc dieu tra of this thong tin kiem dem cong trinh.
	*
	* @param daKetThucDieuTra the da ket thuc dieu tra of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setDaKetThucDieuTra(int daKetThucDieuTra) {
		_thongTinKiemDemCongTrinh.setDaKetThucDieuTra(daKetThucDieuTra);
	}

	/**
	* Returns the ly do khong hoan thanh of this thong tin kiem dem cong trinh.
	*
	* @return the ly do khong hoan thanh of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getLyDoKhongHoanThanh() {
		return _thongTinKiemDemCongTrinh.getLyDoKhongHoanThanh();
	}

	/**
	* Sets the ly do khong hoan thanh of this thong tin kiem dem cong trinh.
	*
	* @param lyDoKhongHoanThanh the ly do khong hoan thanh of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setLyDoKhongHoanThanh(java.lang.String lyDoKhongHoanThanh) {
		_thongTinKiemDemCongTrinh.setLyDoKhongHoanThanh(lyDoKhongHoanThanh);
	}

	/**
	* Returns the imei of this thong tin kiem dem cong trinh.
	*
	* @return the imei of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getImei() {
		return _thongTinKiemDemCongTrinh.getImei();
	}

	/**
	* Sets the imei of this thong tin kiem dem cong trinh.
	*
	* @param imei the imei of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setImei(java.lang.String imei) {
		_thongTinKiemDemCongTrinh.setImei(imei);
	}

	/**
	* Returns the tai khoan of this thong tin kiem dem cong trinh.
	*
	* @return the tai khoan of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.lang.String getTaiKhoan() {
		return _thongTinKiemDemCongTrinh.getTaiKhoan();
	}

	/**
	* Sets the tai khoan of this thong tin kiem dem cong trinh.
	*
	* @param taiKhoan the tai khoan of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setTaiKhoan(java.lang.String taiKhoan) {
		_thongTinKiemDemCongTrinh.setTaiKhoan(taiKhoan);
	}

	/**
	* Returns the danh gia kiem dem of this thong tin kiem dem cong trinh.
	*
	* @return the danh gia kiem dem of this thong tin kiem dem cong trinh
	*/
	@Override
	public int getDanhGiaKiemDem() {
		return _thongTinKiemDemCongTrinh.getDanhGiaKiemDem();
	}

	/**
	* Sets the danh gia kiem dem of this thong tin kiem dem cong trinh.
	*
	* @param danhGiaKiemDem the danh gia kiem dem of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setDanhGiaKiemDem(int danhGiaKiemDem) {
		_thongTinKiemDemCongTrinh.setDanhGiaKiemDem(danhGiaKiemDem);
	}

	/**
	* Returns the save point of this thong tin kiem dem cong trinh.
	*
	* @return the save point of this thong tin kiem dem cong trinh
	*/
	@Override
	public java.util.Date getSavePoint() {
		return _thongTinKiemDemCongTrinh.getSavePoint();
	}

	/**
	* Sets the save point of this thong tin kiem dem cong trinh.
	*
	* @param savePoint the save point of this thong tin kiem dem cong trinh
	*/
	@Override
	public void setSavePoint(java.util.Date savePoint) {
		_thongTinKiemDemCongTrinh.setSavePoint(savePoint);
	}

	@Override
	public boolean isNew() {
		return _thongTinKiemDemCongTrinh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thongTinKiemDemCongTrinh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thongTinKiemDemCongTrinh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thongTinKiemDemCongTrinh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thongTinKiemDemCongTrinh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thongTinKiemDemCongTrinh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thongTinKiemDemCongTrinh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thongTinKiemDemCongTrinh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thongTinKiemDemCongTrinh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thongTinKiemDemCongTrinh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thongTinKiemDemCongTrinh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ThongTinKiemDemCongTrinhWrapper((ThongTinKiemDemCongTrinh)_thongTinKiemDemCongTrinh.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh) {
		return _thongTinKiemDemCongTrinh.compareTo(thongTinKiemDemCongTrinh);
	}

	@Override
	public int hashCode() {
		return _thongTinKiemDemCongTrinh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh> toCacheModel() {
		return _thongTinKiemDemCongTrinh.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh toEscapedModel() {
		return new ThongTinKiemDemCongTrinhWrapper(_thongTinKiemDemCongTrinh.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh toUnescapedModel() {
		return new ThongTinKiemDemCongTrinhWrapper(_thongTinKiemDemCongTrinh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thongTinKiemDemCongTrinh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thongTinKiemDemCongTrinh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thongTinKiemDemCongTrinh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ThongTinKiemDemCongTrinhWrapper)) {
			return false;
		}

		ThongTinKiemDemCongTrinhWrapper thongTinKiemDemCongTrinhWrapper = (ThongTinKiemDemCongTrinhWrapper)obj;

		if (Validator.equals(_thongTinKiemDemCongTrinh,
					thongTinKiemDemCongTrinhWrapper._thongTinKiemDemCongTrinh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ThongTinKiemDemCongTrinh getWrappedThongTinKiemDemCongTrinh() {
		return _thongTinKiemDemCongTrinh;
	}

	@Override
	public ThongTinKiemDemCongTrinh getWrappedModel() {
		return _thongTinKiemDemCongTrinh;
	}

	@Override
	public void resetOriginalValues() {
		_thongTinKiemDemCongTrinh.resetOriginalValues();
	}

	private ThongTinKiemDemCongTrinh _thongTinKiemDemCongTrinh;
}