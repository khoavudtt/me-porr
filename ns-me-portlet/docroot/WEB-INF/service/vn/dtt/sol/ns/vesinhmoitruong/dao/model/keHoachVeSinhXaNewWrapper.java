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
 * This class is a wrapper for {@link keHoachVeSinhXaNew}.
 * </p>
 *
 * @author BinhTH
 * @see keHoachVeSinhXaNew
 * @generated
 */
public class keHoachVeSinhXaNewWrapper implements keHoachVeSinhXaNew,
	ModelWrapper<keHoachVeSinhXaNew> {
	public keHoachVeSinhXaNewWrapper(keHoachVeSinhXaNew keHoachVeSinhXaNew) {
		_keHoachVeSinhXaNew = keHoachVeSinhXaNew;
	}

	@Override
	public Class<?> getModelClass() {
		return keHoachVeSinhXaNew.class;
	}

	@Override
	public String getModelClassName() {
		return keHoachVeSinhXaNew.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("nam", getNam());
		attributes.put("soNhaTieuHVSMoi", getSoNhaTieuHVSMoi());
		attributes.put("soDan", getSoDan());
		attributes.put("dangKyVSTX", getDangKyVSTX());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("baoCaoDLI", getBaoCaoDLI());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());

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

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer soNhaTieuHVSMoi = (Integer)attributes.get("soNhaTieuHVSMoi");

		if (soNhaTieuHVSMoi != null) {
			setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		}

		Integer soDan = (Integer)attributes.get("soDan");

		if (soDan != null) {
			setSoDan(soDan);
		}

		Integer dangKyVSTX = (Integer)attributes.get("dangKyVSTX");

		if (dangKyVSTX != null) {
			setDangKyVSTX(dangKyVSTX);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Integer baoCaoDLI = (Integer)attributes.get("baoCaoDLI");

		if (baoCaoDLI != null) {
			setBaoCaoDLI(baoCaoDLI);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Integer idNguoiTao = (Integer)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}
	}

	/**
	* Returns the primary key of this ke hoach ve sinh xa new.
	*
	* @return the primary key of this ke hoach ve sinh xa new
	*/
	@Override
	public int getPrimaryKey() {
		return _keHoachVeSinhXaNew.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ke hoach ve sinh xa new.
	*
	* @param primaryKey the primary key of this ke hoach ve sinh xa new
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_keHoachVeSinhXaNew.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this ke hoach ve sinh xa new.
	*
	* @return the ID of this ke hoach ve sinh xa new
	*/
	@Override
	public int getId() {
		return _keHoachVeSinhXaNew.getId();
	}

	/**
	* Sets the ID of this ke hoach ve sinh xa new.
	*
	* @param id the ID of this ke hoach ve sinh xa new
	*/
	@Override
	public void setId(int id) {
		_keHoachVeSinhXaNew.setId(id);
	}

	/**
	* Returns the ma tinh of this ke hoach ve sinh xa new.
	*
	* @return the ma tinh of this ke hoach ve sinh xa new
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _keHoachVeSinhXaNew.getMaTinh();
	}

	/**
	* Sets the ma tinh of this ke hoach ve sinh xa new.
	*
	* @param maTinh the ma tinh of this ke hoach ve sinh xa new
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_keHoachVeSinhXaNew.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this ke hoach ve sinh xa new.
	*
	* @return the ma huyen of this ke hoach ve sinh xa new
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _keHoachVeSinhXaNew.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this ke hoach ve sinh xa new.
	*
	* @param maHuyen the ma huyen of this ke hoach ve sinh xa new
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_keHoachVeSinhXaNew.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ma xa of this ke hoach ve sinh xa new.
	*
	* @return the ma xa of this ke hoach ve sinh xa new
	*/
	@Override
	public java.lang.String getMaXa() {
		return _keHoachVeSinhXaNew.getMaXa();
	}

	/**
	* Sets the ma xa of this ke hoach ve sinh xa new.
	*
	* @param maXa the ma xa of this ke hoach ve sinh xa new
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_keHoachVeSinhXaNew.setMaXa(maXa);
	}

	/**
	* Returns the nam of this ke hoach ve sinh xa new.
	*
	* @return the nam of this ke hoach ve sinh xa new
	*/
	@Override
	public int getNam() {
		return _keHoachVeSinhXaNew.getNam();
	}

	/**
	* Sets the nam of this ke hoach ve sinh xa new.
	*
	* @param nam the nam of this ke hoach ve sinh xa new
	*/
	@Override
	public void setNam(int nam) {
		_keHoachVeSinhXaNew.setNam(nam);
	}

	/**
	* Returns the so nha tieu h v s moi of this ke hoach ve sinh xa new.
	*
	* @return the so nha tieu h v s moi of this ke hoach ve sinh xa new
	*/
	@Override
	public int getSoNhaTieuHVSMoi() {
		return _keHoachVeSinhXaNew.getSoNhaTieuHVSMoi();
	}

	/**
	* Sets the so nha tieu h v s moi of this ke hoach ve sinh xa new.
	*
	* @param soNhaTieuHVSMoi the so nha tieu h v s moi of this ke hoach ve sinh xa new
	*/
	@Override
	public void setSoNhaTieuHVSMoi(int soNhaTieuHVSMoi) {
		_keHoachVeSinhXaNew.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
	}

	/**
	* Returns the so dan of this ke hoach ve sinh xa new.
	*
	* @return the so dan of this ke hoach ve sinh xa new
	*/
	@Override
	public int getSoDan() {
		return _keHoachVeSinhXaNew.getSoDan();
	}

	/**
	* Sets the so dan of this ke hoach ve sinh xa new.
	*
	* @param soDan the so dan of this ke hoach ve sinh xa new
	*/
	@Override
	public void setSoDan(int soDan) {
		_keHoachVeSinhXaNew.setSoDan(soDan);
	}

	/**
	* Returns the dang ky v s t x of this ke hoach ve sinh xa new.
	*
	* @return the dang ky v s t x of this ke hoach ve sinh xa new
	*/
	@Override
	public int getDangKyVSTX() {
		return _keHoachVeSinhXaNew.getDangKyVSTX();
	}

	/**
	* Sets the dang ky v s t x of this ke hoach ve sinh xa new.
	*
	* @param dangKyVSTX the dang ky v s t x of this ke hoach ve sinh xa new
	*/
	@Override
	public void setDangKyVSTX(int dangKyVSTX) {
		_keHoachVeSinhXaNew.setDangKyVSTX(dangKyVSTX);
	}

	/**
	* Returns the ghi chu of this ke hoach ve sinh xa new.
	*
	* @return the ghi chu of this ke hoach ve sinh xa new
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _keHoachVeSinhXaNew.getGhiChu();
	}

	/**
	* Sets the ghi chu of this ke hoach ve sinh xa new.
	*
	* @param ghiChu the ghi chu of this ke hoach ve sinh xa new
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_keHoachVeSinhXaNew.setGhiChu(ghiChu);
	}

	/**
	* Returns the bao cao d l i of this ke hoach ve sinh xa new.
	*
	* @return the bao cao d l i of this ke hoach ve sinh xa new
	*/
	@Override
	public int getBaoCaoDLI() {
		return _keHoachVeSinhXaNew.getBaoCaoDLI();
	}

	/**
	* Sets the bao cao d l i of this ke hoach ve sinh xa new.
	*
	* @param baoCaoDLI the bao cao d l i of this ke hoach ve sinh xa new
	*/
	@Override
	public void setBaoCaoDLI(int baoCaoDLI) {
		_keHoachVeSinhXaNew.setBaoCaoDLI(baoCaoDLI);
	}

	/**
	* Returns the ngay tao of this ke hoach ve sinh xa new.
	*
	* @return the ngay tao of this ke hoach ve sinh xa new
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _keHoachVeSinhXaNew.getNgayTao();
	}

	/**
	* Sets the ngay tao of this ke hoach ve sinh xa new.
	*
	* @param ngayTao the ngay tao of this ke hoach ve sinh xa new
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_keHoachVeSinhXaNew.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this ke hoach ve sinh xa new.
	*
	* @return the id nguoi tao of this ke hoach ve sinh xa new
	*/
	@Override
	public int getIdNguoiTao() {
		return _keHoachVeSinhXaNew.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this ke hoach ve sinh xa new.
	*
	* @param idNguoiTao the id nguoi tao of this ke hoach ve sinh xa new
	*/
	@Override
	public void setIdNguoiTao(int idNguoiTao) {
		_keHoachVeSinhXaNew.setIdNguoiTao(idNguoiTao);
	}

	@Override
	public boolean isNew() {
		return _keHoachVeSinhXaNew.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_keHoachVeSinhXaNew.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _keHoachVeSinhXaNew.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_keHoachVeSinhXaNew.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _keHoachVeSinhXaNew.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _keHoachVeSinhXaNew.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_keHoachVeSinhXaNew.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _keHoachVeSinhXaNew.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_keHoachVeSinhXaNew.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_keHoachVeSinhXaNew.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_keHoachVeSinhXaNew.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new keHoachVeSinhXaNewWrapper((keHoachVeSinhXaNew)_keHoachVeSinhXaNew.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew keHoachVeSinhXaNew) {
		return _keHoachVeSinhXaNew.compareTo(keHoachVeSinhXaNew);
	}

	@Override
	public int hashCode() {
		return _keHoachVeSinhXaNew.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew> toCacheModel() {
		return _keHoachVeSinhXaNew.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew toEscapedModel() {
		return new keHoachVeSinhXaNewWrapper(_keHoachVeSinhXaNew.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew toUnescapedModel() {
		return new keHoachVeSinhXaNewWrapper(_keHoachVeSinhXaNew.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _keHoachVeSinhXaNew.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _keHoachVeSinhXaNew.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_keHoachVeSinhXaNew.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof keHoachVeSinhXaNewWrapper)) {
			return false;
		}

		keHoachVeSinhXaNewWrapper keHoachVeSinhXaNewWrapper = (keHoachVeSinhXaNewWrapper)obj;

		if (Validator.equals(_keHoachVeSinhXaNew,
					keHoachVeSinhXaNewWrapper._keHoachVeSinhXaNew)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public keHoachVeSinhXaNew getWrappedkeHoachVeSinhXaNew() {
		return _keHoachVeSinhXaNew;
	}

	@Override
	public keHoachVeSinhXaNew getWrappedModel() {
		return _keHoachVeSinhXaNew;
	}

	@Override
	public void resetOriginalValues() {
		_keHoachVeSinhXaNew.resetOriginalValues();
	}

	private keHoachVeSinhXaNew _keHoachVeSinhXaNew;
}