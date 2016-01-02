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

package vn.dtt.cmon.kiemdemvien.dao.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KiemDemVien}.
 * </p>
 *
 * @author HANT
 * @see KiemDemVien
 * @generated
 */
public class KiemDemVienWrapper implements KiemDemVien,
	ModelWrapper<KiemDemVien> {
	public KiemDemVienWrapper(KiemDemVien kiemDemVien) {
		_kiemDemVien = kiemDemVien;
	}

	@Override
	public Class<?> getModelClass() {
		return KiemDemVien.class;
	}

	@Override
	public String getModelClassName() {
		return KiemDemVien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoVaTen", getHoVaTen());
		attributes.put("taiKhoan", getTaiKhoan());
		attributes.put("matKhau", getMatKhau());
		attributes.put("capHoatDong", getCapHoatDong());
		attributes.put("orgCode1", getOrgCode1());
		attributes.put("orgCode2", getOrgCode2());
		attributes.put("diaChi", getDiaChi());
		attributes.put("chungMinhThu", getChungMinhThu());
		attributes.put("dienThoai", getDienThoai());
		attributes.put("imei", getImei());
		attributes.put("trangThai", getTrangThai());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("idQuanLy", getIdQuanLy());
		attributes.put("nameQuanLy", getNameQuanLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String hoVaTen = (String)attributes.get("hoVaTen");

		if (hoVaTen != null) {
			setHoVaTen(hoVaTen);
		}

		String taiKhoan = (String)attributes.get("taiKhoan");

		if (taiKhoan != null) {
			setTaiKhoan(taiKhoan);
		}

		String matKhau = (String)attributes.get("matKhau");

		if (matKhau != null) {
			setMatKhau(matKhau);
		}

		Long capHoatDong = (Long)attributes.get("capHoatDong");

		if (capHoatDong != null) {
			setCapHoatDong(capHoatDong);
		}

		String orgCode1 = (String)attributes.get("orgCode1");

		if (orgCode1 != null) {
			setOrgCode1(orgCode1);
		}

		String orgCode2 = (String)attributes.get("orgCode2");

		if (orgCode2 != null) {
			setOrgCode2(orgCode2);
		}

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		String chungMinhThu = (String)attributes.get("chungMinhThu");

		if (chungMinhThu != null) {
			setChungMinhThu(chungMinhThu);
		}

		String dienThoai = (String)attributes.get("dienThoai");

		if (dienThoai != null) {
			setDienThoai(dienThoai);
		}

		String imei = (String)attributes.get("imei");

		if (imei != null) {
			setImei(imei);
		}

		Long trangThai = (Long)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long idNguoiTao = (Long)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		Long idQuanLy = (Long)attributes.get("idQuanLy");

		if (idQuanLy != null) {
			setIdQuanLy(idQuanLy);
		}

		String nameQuanLy = (String)attributes.get("nameQuanLy");

		if (nameQuanLy != null) {
			setNameQuanLy(nameQuanLy);
		}
	}

	/**
	* Returns the primary key of this kiem dem vien.
	*
	* @return the primary key of this kiem dem vien
	*/
	@Override
	public long getPrimaryKey() {
		return _kiemDemVien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this kiem dem vien.
	*
	* @param primaryKey the primary key of this kiem dem vien
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_kiemDemVien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this kiem dem vien.
	*
	* @return the ID of this kiem dem vien
	*/
	@Override
	public long getId() {
		return _kiemDemVien.getId();
	}

	/**
	* Sets the ID of this kiem dem vien.
	*
	* @param id the ID of this kiem dem vien
	*/
	@Override
	public void setId(long id) {
		_kiemDemVien.setId(id);
	}

	/**
	* Returns the ho va ten of this kiem dem vien.
	*
	* @return the ho va ten of this kiem dem vien
	*/
	@Override
	public java.lang.String getHoVaTen() {
		return _kiemDemVien.getHoVaTen();
	}

	/**
	* Sets the ho va ten of this kiem dem vien.
	*
	* @param hoVaTen the ho va ten of this kiem dem vien
	*/
	@Override
	public void setHoVaTen(java.lang.String hoVaTen) {
		_kiemDemVien.setHoVaTen(hoVaTen);
	}

	/**
	* Returns the tai khoan of this kiem dem vien.
	*
	* @return the tai khoan of this kiem dem vien
	*/
	@Override
	public java.lang.String getTaiKhoan() {
		return _kiemDemVien.getTaiKhoan();
	}

	/**
	* Sets the tai khoan of this kiem dem vien.
	*
	* @param taiKhoan the tai khoan of this kiem dem vien
	*/
	@Override
	public void setTaiKhoan(java.lang.String taiKhoan) {
		_kiemDemVien.setTaiKhoan(taiKhoan);
	}

	/**
	* Returns the mat khau of this kiem dem vien.
	*
	* @return the mat khau of this kiem dem vien
	*/
	@Override
	public java.lang.String getMatKhau() {
		return _kiemDemVien.getMatKhau();
	}

	/**
	* Sets the mat khau of this kiem dem vien.
	*
	* @param matKhau the mat khau of this kiem dem vien
	*/
	@Override
	public void setMatKhau(java.lang.String matKhau) {
		_kiemDemVien.setMatKhau(matKhau);
	}

	/**
	* Returns the cap hoat dong of this kiem dem vien.
	*
	* @return the cap hoat dong of this kiem dem vien
	*/
	@Override
	public long getCapHoatDong() {
		return _kiemDemVien.getCapHoatDong();
	}

	/**
	* Sets the cap hoat dong of this kiem dem vien.
	*
	* @param capHoatDong the cap hoat dong of this kiem dem vien
	*/
	@Override
	public void setCapHoatDong(long capHoatDong) {
		_kiemDemVien.setCapHoatDong(capHoatDong);
	}

	/**
	* Returns the org code1 of this kiem dem vien.
	*
	* @return the org code1 of this kiem dem vien
	*/
	@Override
	public java.lang.String getOrgCode1() {
		return _kiemDemVien.getOrgCode1();
	}

	/**
	* Sets the org code1 of this kiem dem vien.
	*
	* @param orgCode1 the org code1 of this kiem dem vien
	*/
	@Override
	public void setOrgCode1(java.lang.String orgCode1) {
		_kiemDemVien.setOrgCode1(orgCode1);
	}

	/**
	* Returns the org code2 of this kiem dem vien.
	*
	* @return the org code2 of this kiem dem vien
	*/
	@Override
	public java.lang.String getOrgCode2() {
		return _kiemDemVien.getOrgCode2();
	}

	/**
	* Sets the org code2 of this kiem dem vien.
	*
	* @param orgCode2 the org code2 of this kiem dem vien
	*/
	@Override
	public void setOrgCode2(java.lang.String orgCode2) {
		_kiemDemVien.setOrgCode2(orgCode2);
	}

	/**
	* Returns the dia chi of this kiem dem vien.
	*
	* @return the dia chi of this kiem dem vien
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _kiemDemVien.getDiaChi();
	}

	/**
	* Sets the dia chi of this kiem dem vien.
	*
	* @param diaChi the dia chi of this kiem dem vien
	*/
	@Override
	public void setDiaChi(java.lang.String diaChi) {
		_kiemDemVien.setDiaChi(diaChi);
	}

	/**
	* Returns the chung minh thu of this kiem dem vien.
	*
	* @return the chung minh thu of this kiem dem vien
	*/
	@Override
	public java.lang.String getChungMinhThu() {
		return _kiemDemVien.getChungMinhThu();
	}

	/**
	* Sets the chung minh thu of this kiem dem vien.
	*
	* @param chungMinhThu the chung minh thu of this kiem dem vien
	*/
	@Override
	public void setChungMinhThu(java.lang.String chungMinhThu) {
		_kiemDemVien.setChungMinhThu(chungMinhThu);
	}

	/**
	* Returns the dien thoai of this kiem dem vien.
	*
	* @return the dien thoai of this kiem dem vien
	*/
	@Override
	public java.lang.String getDienThoai() {
		return _kiemDemVien.getDienThoai();
	}

	/**
	* Sets the dien thoai of this kiem dem vien.
	*
	* @param dienThoai the dien thoai of this kiem dem vien
	*/
	@Override
	public void setDienThoai(java.lang.String dienThoai) {
		_kiemDemVien.setDienThoai(dienThoai);
	}

	/**
	* Returns the imei of this kiem dem vien.
	*
	* @return the imei of this kiem dem vien
	*/
	@Override
	public java.lang.String getImei() {
		return _kiemDemVien.getImei();
	}

	/**
	* Sets the imei of this kiem dem vien.
	*
	* @param imei the imei of this kiem dem vien
	*/
	@Override
	public void setImei(java.lang.String imei) {
		_kiemDemVien.setImei(imei);
	}

	/**
	* Returns the trang thai of this kiem dem vien.
	*
	* @return the trang thai of this kiem dem vien
	*/
	@Override
	public long getTrangThai() {
		return _kiemDemVien.getTrangThai();
	}

	/**
	* Sets the trang thai of this kiem dem vien.
	*
	* @param trangThai the trang thai of this kiem dem vien
	*/
	@Override
	public void setTrangThai(long trangThai) {
		_kiemDemVien.setTrangThai(trangThai);
	}

	/**
	* Returns the ngay tao of this kiem dem vien.
	*
	* @return the ngay tao of this kiem dem vien
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _kiemDemVien.getNgayTao();
	}

	/**
	* Sets the ngay tao of this kiem dem vien.
	*
	* @param ngayTao the ngay tao of this kiem dem vien
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_kiemDemVien.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this kiem dem vien.
	*
	* @return the id nguoi tao of this kiem dem vien
	*/
	@Override
	public long getIdNguoiTao() {
		return _kiemDemVien.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this kiem dem vien.
	*
	* @param idNguoiTao the id nguoi tao of this kiem dem vien
	*/
	@Override
	public void setIdNguoiTao(long idNguoiTao) {
		_kiemDemVien.setIdNguoiTao(idNguoiTao);
	}

	/**
	* Returns the id quan ly of this kiem dem vien.
	*
	* @return the id quan ly of this kiem dem vien
	*/
	@Override
	public long getIdQuanLy() {
		return _kiemDemVien.getIdQuanLy();
	}

	/**
	* Sets the id quan ly of this kiem dem vien.
	*
	* @param idQuanLy the id quan ly of this kiem dem vien
	*/
	@Override
	public void setIdQuanLy(long idQuanLy) {
		_kiemDemVien.setIdQuanLy(idQuanLy);
	}

	/**
	* Returns the name quan ly of this kiem dem vien.
	*
	* @return the name quan ly of this kiem dem vien
	*/
	@Override
	public java.lang.String getNameQuanLy() {
		return _kiemDemVien.getNameQuanLy();
	}

	/**
	* Sets the name quan ly of this kiem dem vien.
	*
	* @param nameQuanLy the name quan ly of this kiem dem vien
	*/
	@Override
	public void setNameQuanLy(java.lang.String nameQuanLy) {
		_kiemDemVien.setNameQuanLy(nameQuanLy);
	}

	@Override
	public boolean isNew() {
		return _kiemDemVien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_kiemDemVien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _kiemDemVien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_kiemDemVien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _kiemDemVien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _kiemDemVien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_kiemDemVien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _kiemDemVien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_kiemDemVien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_kiemDemVien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_kiemDemVien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KiemDemVienWrapper((KiemDemVien)_kiemDemVien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien kiemDemVien) {
		return _kiemDemVien.compareTo(kiemDemVien);
	}

	@Override
	public int hashCode() {
		return _kiemDemVien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien> toCacheModel() {
		return _kiemDemVien.toCacheModel();
	}

	@Override
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien toEscapedModel() {
		return new KiemDemVienWrapper(_kiemDemVien.toEscapedModel());
	}

	@Override
	public vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien toUnescapedModel() {
		return new KiemDemVienWrapper(_kiemDemVien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _kiemDemVien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _kiemDemVien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_kiemDemVien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KiemDemVienWrapper)) {
			return false;
		}

		KiemDemVienWrapper kiemDemVienWrapper = (KiemDemVienWrapper)obj;

		if (Validator.equals(_kiemDemVien, kiemDemVienWrapper._kiemDemVien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KiemDemVien getWrappedKiemDemVien() {
		return _kiemDemVien;
	}

	@Override
	public KiemDemVien getWrappedModel() {
		return _kiemDemVien;
	}

	@Override
	public void resetOriginalValues() {
		_kiemDemVien.resetOriginalValues();
	}

	private KiemDemVien _kiemDemVien;
}