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
 * This class is a wrapper for {@link DanhGiaVanHanh}.
 * </p>
 *
 * @author khoa.vu
 * @see DanhGiaVanHanh
 * @generated
 */
public class DanhGiaVanHanhWrapper implements DanhGiaVanHanh,
	ModelWrapper<DanhGiaVanHanh> {
	public DanhGiaVanHanhWrapper(DanhGiaVanHanh danhGiaVanHanh) {
		_danhGiaVanHanh = danhGiaVanHanh;
	}

	@Override
	public Class<?> getModelClass() {
		return DanhGiaVanHanh.class;
	}

	@Override
	public String getModelClassName() {
		return DanhGiaVanHanh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tramCapNuocId", getTramCapNuocId());
		attributes.put("thang", getThang());
		attributes.put("nam", getNam());
		attributes.put("congXuatThucTe", getCongXuatThucTe());
		attributes.put("nuocThatThoat", getNuocThatThoat());
		attributes.put("nuocDatTieuChuan", getNuocDatTieuChuan());
		attributes.put("nuocCoAsen", getNuocCoAsen());
		attributes.put("trangThaiCapNuoc", getTrangThaiCapNuoc());
		attributes.put("chiPhiHoaChat", getChiPhiHoaChat());
		attributes.put("chiPhiDien", getChiPhiDien());
		attributes.put("luongNhanVien", getLuongNhanVien());
		attributes.put("chiPhiSuaChua", getChiPhiSuaChua());
		attributes.put("doanhThu", getDoanhThu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("sanLuongSanXuat", getSanLuongSanXuat());
		attributes.put("sanLuongTieuHao", getSanLuongTieuHao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer tramCapNuocId = (Integer)attributes.get("tramCapNuocId");

		if (tramCapNuocId != null) {
			setTramCapNuocId(tramCapNuocId);
		}

		Integer thang = (Integer)attributes.get("thang");

		if (thang != null) {
			setThang(thang);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer congXuatThucTe = (Integer)attributes.get("congXuatThucTe");

		if (congXuatThucTe != null) {
			setCongXuatThucTe(congXuatThucTe);
		}

		Integer nuocThatThoat = (Integer)attributes.get("nuocThatThoat");

		if (nuocThatThoat != null) {
			setNuocThatThoat(nuocThatThoat);
		}

		Integer nuocDatTieuChuan = (Integer)attributes.get("nuocDatTieuChuan");

		if (nuocDatTieuChuan != null) {
			setNuocDatTieuChuan(nuocDatTieuChuan);
		}

		Integer nuocCoAsen = (Integer)attributes.get("nuocCoAsen");

		if (nuocCoAsen != null) {
			setNuocCoAsen(nuocCoAsen);
		}

		Integer trangThaiCapNuoc = (Integer)attributes.get("trangThaiCapNuoc");

		if (trangThaiCapNuoc != null) {
			setTrangThaiCapNuoc(trangThaiCapNuoc);
		}

		Integer chiPhiHoaChat = (Integer)attributes.get("chiPhiHoaChat");

		if (chiPhiHoaChat != null) {
			setChiPhiHoaChat(chiPhiHoaChat);
		}

		Integer chiPhiDien = (Integer)attributes.get("chiPhiDien");

		if (chiPhiDien != null) {
			setChiPhiDien(chiPhiDien);
		}

		Integer luongNhanVien = (Integer)attributes.get("luongNhanVien");

		if (luongNhanVien != null) {
			setLuongNhanVien(luongNhanVien);
		}

		Integer chiPhiSuaChua = (Integer)attributes.get("chiPhiSuaChua");

		if (chiPhiSuaChua != null) {
			setChiPhiSuaChua(chiPhiSuaChua);
		}

		Integer doanhThu = (Integer)attributes.get("doanhThu");

		if (doanhThu != null) {
			setDoanhThu(doanhThu);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Integer idNguoiTao = (Integer)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Integer sanLuongSanXuat = (Integer)attributes.get("sanLuongSanXuat");

		if (sanLuongSanXuat != null) {
			setSanLuongSanXuat(sanLuongSanXuat);
		}

		Integer sanLuongTieuHao = (Integer)attributes.get("sanLuongTieuHao");

		if (sanLuongTieuHao != null) {
			setSanLuongTieuHao(sanLuongTieuHao);
		}
	}

	/**
	* Returns the primary key of this danh gia van hanh.
	*
	* @return the primary key of this danh gia van hanh
	*/
	@Override
	public long getPrimaryKey() {
		return _danhGiaVanHanh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this danh gia van hanh.
	*
	* @param primaryKey the primary key of this danh gia van hanh
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_danhGiaVanHanh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this danh gia van hanh.
	*
	* @return the ID of this danh gia van hanh
	*/
	@Override
	public long getId() {
		return _danhGiaVanHanh.getId();
	}

	/**
	* Sets the ID of this danh gia van hanh.
	*
	* @param id the ID of this danh gia van hanh
	*/
	@Override
	public void setId(long id) {
		_danhGiaVanHanh.setId(id);
	}

	/**
	* Returns the tram cap nuoc ID of this danh gia van hanh.
	*
	* @return the tram cap nuoc ID of this danh gia van hanh
	*/
	@Override
	public int getTramCapNuocId() {
		return _danhGiaVanHanh.getTramCapNuocId();
	}

	/**
	* Sets the tram cap nuoc ID of this danh gia van hanh.
	*
	* @param tramCapNuocId the tram cap nuoc ID of this danh gia van hanh
	*/
	@Override
	public void setTramCapNuocId(int tramCapNuocId) {
		_danhGiaVanHanh.setTramCapNuocId(tramCapNuocId);
	}

	/**
	* Returns the thang of this danh gia van hanh.
	*
	* @return the thang of this danh gia van hanh
	*/
	@Override
	public int getThang() {
		return _danhGiaVanHanh.getThang();
	}

	/**
	* Sets the thang of this danh gia van hanh.
	*
	* @param thang the thang of this danh gia van hanh
	*/
	@Override
	public void setThang(int thang) {
		_danhGiaVanHanh.setThang(thang);
	}

	/**
	* Returns the nam of this danh gia van hanh.
	*
	* @return the nam of this danh gia van hanh
	*/
	@Override
	public int getNam() {
		return _danhGiaVanHanh.getNam();
	}

	/**
	* Sets the nam of this danh gia van hanh.
	*
	* @param nam the nam of this danh gia van hanh
	*/
	@Override
	public void setNam(int nam) {
		_danhGiaVanHanh.setNam(nam);
	}

	/**
	* Returns the cong xuat thuc te of this danh gia van hanh.
	*
	* @return the cong xuat thuc te of this danh gia van hanh
	*/
	@Override
	public int getCongXuatThucTe() {
		return _danhGiaVanHanh.getCongXuatThucTe();
	}

	/**
	* Sets the cong xuat thuc te of this danh gia van hanh.
	*
	* @param congXuatThucTe the cong xuat thuc te of this danh gia van hanh
	*/
	@Override
	public void setCongXuatThucTe(int congXuatThucTe) {
		_danhGiaVanHanh.setCongXuatThucTe(congXuatThucTe);
	}

	/**
	* Returns the nuoc that thoat of this danh gia van hanh.
	*
	* @return the nuoc that thoat of this danh gia van hanh
	*/
	@Override
	public int getNuocThatThoat() {
		return _danhGiaVanHanh.getNuocThatThoat();
	}

	/**
	* Sets the nuoc that thoat of this danh gia van hanh.
	*
	* @param nuocThatThoat the nuoc that thoat of this danh gia van hanh
	*/
	@Override
	public void setNuocThatThoat(int nuocThatThoat) {
		_danhGiaVanHanh.setNuocThatThoat(nuocThatThoat);
	}

	/**
	* Returns the nuoc dat tieu chuan of this danh gia van hanh.
	*
	* @return the nuoc dat tieu chuan of this danh gia van hanh
	*/
	@Override
	public int getNuocDatTieuChuan() {
		return _danhGiaVanHanh.getNuocDatTieuChuan();
	}

	/**
	* Sets the nuoc dat tieu chuan of this danh gia van hanh.
	*
	* @param nuocDatTieuChuan the nuoc dat tieu chuan of this danh gia van hanh
	*/
	@Override
	public void setNuocDatTieuChuan(int nuocDatTieuChuan) {
		_danhGiaVanHanh.setNuocDatTieuChuan(nuocDatTieuChuan);
	}

	/**
	* Returns the nuoc co asen of this danh gia van hanh.
	*
	* @return the nuoc co asen of this danh gia van hanh
	*/
	@Override
	public int getNuocCoAsen() {
		return _danhGiaVanHanh.getNuocCoAsen();
	}

	/**
	* Sets the nuoc co asen of this danh gia van hanh.
	*
	* @param nuocCoAsen the nuoc co asen of this danh gia van hanh
	*/
	@Override
	public void setNuocCoAsen(int nuocCoAsen) {
		_danhGiaVanHanh.setNuocCoAsen(nuocCoAsen);
	}

	/**
	* Returns the trang thai cap nuoc of this danh gia van hanh.
	*
	* @return the trang thai cap nuoc of this danh gia van hanh
	*/
	@Override
	public int getTrangThaiCapNuoc() {
		return _danhGiaVanHanh.getTrangThaiCapNuoc();
	}

	/**
	* Sets the trang thai cap nuoc of this danh gia van hanh.
	*
	* @param trangThaiCapNuoc the trang thai cap nuoc of this danh gia van hanh
	*/
	@Override
	public void setTrangThaiCapNuoc(int trangThaiCapNuoc) {
		_danhGiaVanHanh.setTrangThaiCapNuoc(trangThaiCapNuoc);
	}

	/**
	* Returns the chi phi hoa chat of this danh gia van hanh.
	*
	* @return the chi phi hoa chat of this danh gia van hanh
	*/
	@Override
	public int getChiPhiHoaChat() {
		return _danhGiaVanHanh.getChiPhiHoaChat();
	}

	/**
	* Sets the chi phi hoa chat of this danh gia van hanh.
	*
	* @param chiPhiHoaChat the chi phi hoa chat of this danh gia van hanh
	*/
	@Override
	public void setChiPhiHoaChat(int chiPhiHoaChat) {
		_danhGiaVanHanh.setChiPhiHoaChat(chiPhiHoaChat);
	}

	/**
	* Returns the chi phi dien of this danh gia van hanh.
	*
	* @return the chi phi dien of this danh gia van hanh
	*/
	@Override
	public int getChiPhiDien() {
		return _danhGiaVanHanh.getChiPhiDien();
	}

	/**
	* Sets the chi phi dien of this danh gia van hanh.
	*
	* @param chiPhiDien the chi phi dien of this danh gia van hanh
	*/
	@Override
	public void setChiPhiDien(int chiPhiDien) {
		_danhGiaVanHanh.setChiPhiDien(chiPhiDien);
	}

	/**
	* Returns the luong nhan vien of this danh gia van hanh.
	*
	* @return the luong nhan vien of this danh gia van hanh
	*/
	@Override
	public int getLuongNhanVien() {
		return _danhGiaVanHanh.getLuongNhanVien();
	}

	/**
	* Sets the luong nhan vien of this danh gia van hanh.
	*
	* @param luongNhanVien the luong nhan vien of this danh gia van hanh
	*/
	@Override
	public void setLuongNhanVien(int luongNhanVien) {
		_danhGiaVanHanh.setLuongNhanVien(luongNhanVien);
	}

	/**
	* Returns the chi phi sua chua of this danh gia van hanh.
	*
	* @return the chi phi sua chua of this danh gia van hanh
	*/
	@Override
	public int getChiPhiSuaChua() {
		return _danhGiaVanHanh.getChiPhiSuaChua();
	}

	/**
	* Sets the chi phi sua chua of this danh gia van hanh.
	*
	* @param chiPhiSuaChua the chi phi sua chua of this danh gia van hanh
	*/
	@Override
	public void setChiPhiSuaChua(int chiPhiSuaChua) {
		_danhGiaVanHanh.setChiPhiSuaChua(chiPhiSuaChua);
	}

	/**
	* Returns the doanh thu of this danh gia van hanh.
	*
	* @return the doanh thu of this danh gia van hanh
	*/
	@Override
	public int getDoanhThu() {
		return _danhGiaVanHanh.getDoanhThu();
	}

	/**
	* Sets the doanh thu of this danh gia van hanh.
	*
	* @param doanhThu the doanh thu of this danh gia van hanh
	*/
	@Override
	public void setDoanhThu(int doanhThu) {
		_danhGiaVanHanh.setDoanhThu(doanhThu);
	}

	/**
	* Returns the ngay tao of this danh gia van hanh.
	*
	* @return the ngay tao of this danh gia van hanh
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _danhGiaVanHanh.getNgayTao();
	}

	/**
	* Sets the ngay tao of this danh gia van hanh.
	*
	* @param ngayTao the ngay tao of this danh gia van hanh
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_danhGiaVanHanh.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this danh gia van hanh.
	*
	* @return the id nguoi tao of this danh gia van hanh
	*/
	@Override
	public int getIdNguoiTao() {
		return _danhGiaVanHanh.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this danh gia van hanh.
	*
	* @param idNguoiTao the id nguoi tao of this danh gia van hanh
	*/
	@Override
	public void setIdNguoiTao(int idNguoiTao) {
		_danhGiaVanHanh.setIdNguoiTao(idNguoiTao);
	}

	/**
	* Returns the ghi chu of this danh gia van hanh.
	*
	* @return the ghi chu of this danh gia van hanh
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _danhGiaVanHanh.getGhiChu();
	}

	/**
	* Sets the ghi chu of this danh gia van hanh.
	*
	* @param ghiChu the ghi chu of this danh gia van hanh
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_danhGiaVanHanh.setGhiChu(ghiChu);
	}

	/**
	* Returns the san luong san xuat of this danh gia van hanh.
	*
	* @return the san luong san xuat of this danh gia van hanh
	*/
	@Override
	public int getSanLuongSanXuat() {
		return _danhGiaVanHanh.getSanLuongSanXuat();
	}

	/**
	* Sets the san luong san xuat of this danh gia van hanh.
	*
	* @param sanLuongSanXuat the san luong san xuat of this danh gia van hanh
	*/
	@Override
	public void setSanLuongSanXuat(int sanLuongSanXuat) {
		_danhGiaVanHanh.setSanLuongSanXuat(sanLuongSanXuat);
	}

	/**
	* Returns the san luong tieu hao of this danh gia van hanh.
	*
	* @return the san luong tieu hao of this danh gia van hanh
	*/
	@Override
	public int getSanLuongTieuHao() {
		return _danhGiaVanHanh.getSanLuongTieuHao();
	}

	/**
	* Sets the san luong tieu hao of this danh gia van hanh.
	*
	* @param sanLuongTieuHao the san luong tieu hao of this danh gia van hanh
	*/
	@Override
	public void setSanLuongTieuHao(int sanLuongTieuHao) {
		_danhGiaVanHanh.setSanLuongTieuHao(sanLuongTieuHao);
	}

	@Override
	public boolean isNew() {
		return _danhGiaVanHanh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_danhGiaVanHanh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _danhGiaVanHanh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_danhGiaVanHanh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _danhGiaVanHanh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _danhGiaVanHanh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_danhGiaVanHanh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _danhGiaVanHanh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_danhGiaVanHanh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_danhGiaVanHanh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_danhGiaVanHanh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DanhGiaVanHanhWrapper((DanhGiaVanHanh)_danhGiaVanHanh.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh danhGiaVanHanh) {
		return _danhGiaVanHanh.compareTo(danhGiaVanHanh);
	}

	@Override
	public int hashCode() {
		return _danhGiaVanHanh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh> toCacheModel() {
		return _danhGiaVanHanh.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh toEscapedModel() {
		return new DanhGiaVanHanhWrapper(_danhGiaVanHanh.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh toUnescapedModel() {
		return new DanhGiaVanHanhWrapper(_danhGiaVanHanh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _danhGiaVanHanh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _danhGiaVanHanh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_danhGiaVanHanh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DanhGiaVanHanhWrapper)) {
			return false;
		}

		DanhGiaVanHanhWrapper danhGiaVanHanhWrapper = (DanhGiaVanHanhWrapper)obj;

		if (Validator.equals(_danhGiaVanHanh,
					danhGiaVanHanhWrapper._danhGiaVanHanh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DanhGiaVanHanh getWrappedDanhGiaVanHanh() {
		return _danhGiaVanHanh;
	}

	@Override
	public DanhGiaVanHanh getWrappedModel() {
		return _danhGiaVanHanh;
	}

	@Override
	public void resetOriginalValues() {
		_danhGiaVanHanh.resetOriginalValues();
	}

	private DanhGiaVanHanh _danhGiaVanHanh;
}