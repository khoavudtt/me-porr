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

package vn.dtt.sol.ns.kehoachvesinh.dao.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KeHoachVeSinh}.
 * </p>
 *
 * @author HANT
 * @see KeHoachVeSinh
 * @generated
 */
public class KeHoachVeSinhWrapper implements KeHoachVeSinh,
	ModelWrapper<KeHoachVeSinh> {
	public KeHoachVeSinhWrapper(KeHoachVeSinh keHoachVeSinh) {
		_keHoachVeSinh = keHoachVeSinh;
	}

	@Override
	public Class<?> getModelClass() {
		return KeHoachVeSinh.class;
	}

	@Override
	public String getModelClassName() {
		return KeHoachVeSinh.class.getName();
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
		Long id = (Long)attributes.get("id");

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

		Long nam = (Long)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Long soNhaTieuHVSMoi = (Long)attributes.get("soNhaTieuHVSMoi");

		if (soNhaTieuHVSMoi != null) {
			setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		}

		Long soDan = (Long)attributes.get("soDan");

		if (soDan != null) {
			setSoDan(soDan);
		}

		Long dangKyVSTX = (Long)attributes.get("dangKyVSTX");

		if (dangKyVSTX != null) {
			setDangKyVSTX(dangKyVSTX);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Long baoCaoDLI = (Long)attributes.get("baoCaoDLI");

		if (baoCaoDLI != null) {
			setBaoCaoDLI(baoCaoDLI);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long idNguoiTao = (Long)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}
	}

	/**
	* Returns the primary key of this ke hoach ve sinh.
	*
	* @return the primary key of this ke hoach ve sinh
	*/
	@Override
	public long getPrimaryKey() {
		return _keHoachVeSinh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ke hoach ve sinh.
	*
	* @param primaryKey the primary key of this ke hoach ve sinh
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_keHoachVeSinh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this ke hoach ve sinh.
	*
	* @return the ID of this ke hoach ve sinh
	*/
	@Override
	public long getId() {
		return _keHoachVeSinh.getId();
	}

	/**
	* Sets the ID of this ke hoach ve sinh.
	*
	* @param id the ID of this ke hoach ve sinh
	*/
	@Override
	public void setId(long id) {
		_keHoachVeSinh.setId(id);
	}

	/**
	* Returns the ma tinh of this ke hoach ve sinh.
	*
	* @return the ma tinh of this ke hoach ve sinh
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _keHoachVeSinh.getMaTinh();
	}

	/**
	* Sets the ma tinh of this ke hoach ve sinh.
	*
	* @param maTinh the ma tinh of this ke hoach ve sinh
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_keHoachVeSinh.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this ke hoach ve sinh.
	*
	* @return the ma huyen of this ke hoach ve sinh
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _keHoachVeSinh.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this ke hoach ve sinh.
	*
	* @param maHuyen the ma huyen of this ke hoach ve sinh
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_keHoachVeSinh.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ma xa of this ke hoach ve sinh.
	*
	* @return the ma xa of this ke hoach ve sinh
	*/
	@Override
	public java.lang.String getMaXa() {
		return _keHoachVeSinh.getMaXa();
	}

	/**
	* Sets the ma xa of this ke hoach ve sinh.
	*
	* @param maXa the ma xa of this ke hoach ve sinh
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_keHoachVeSinh.setMaXa(maXa);
	}

	/**
	* Returns the nam of this ke hoach ve sinh.
	*
	* @return the nam of this ke hoach ve sinh
	*/
	@Override
	public long getNam() {
		return _keHoachVeSinh.getNam();
	}

	/**
	* Sets the nam of this ke hoach ve sinh.
	*
	* @param nam the nam of this ke hoach ve sinh
	*/
	@Override
	public void setNam(long nam) {
		_keHoachVeSinh.setNam(nam);
	}

	/**
	* Returns the so nha tieu h v s moi of this ke hoach ve sinh.
	*
	* @return the so nha tieu h v s moi of this ke hoach ve sinh
	*/
	@Override
	public long getSoNhaTieuHVSMoi() {
		return _keHoachVeSinh.getSoNhaTieuHVSMoi();
	}

	/**
	* Sets the so nha tieu h v s moi of this ke hoach ve sinh.
	*
	* @param soNhaTieuHVSMoi the so nha tieu h v s moi of this ke hoach ve sinh
	*/
	@Override
	public void setSoNhaTieuHVSMoi(long soNhaTieuHVSMoi) {
		_keHoachVeSinh.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
	}

	/**
	* Returns the so dan of this ke hoach ve sinh.
	*
	* @return the so dan of this ke hoach ve sinh
	*/
	@Override
	public long getSoDan() {
		return _keHoachVeSinh.getSoDan();
	}

	/**
	* Sets the so dan of this ke hoach ve sinh.
	*
	* @param soDan the so dan of this ke hoach ve sinh
	*/
	@Override
	public void setSoDan(long soDan) {
		_keHoachVeSinh.setSoDan(soDan);
	}

	/**
	* Returns the dang ky v s t x of this ke hoach ve sinh.
	*
	* @return the dang ky v s t x of this ke hoach ve sinh
	*/
	@Override
	public long getDangKyVSTX() {
		return _keHoachVeSinh.getDangKyVSTX();
	}

	/**
	* Sets the dang ky v s t x of this ke hoach ve sinh.
	*
	* @param dangKyVSTX the dang ky v s t x of this ke hoach ve sinh
	*/
	@Override
	public void setDangKyVSTX(long dangKyVSTX) {
		_keHoachVeSinh.setDangKyVSTX(dangKyVSTX);
	}

	/**
	* Returns the ghi chu of this ke hoach ve sinh.
	*
	* @return the ghi chu of this ke hoach ve sinh
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _keHoachVeSinh.getGhiChu();
	}

	/**
	* Sets the ghi chu of this ke hoach ve sinh.
	*
	* @param ghiChu the ghi chu of this ke hoach ve sinh
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_keHoachVeSinh.setGhiChu(ghiChu);
	}

	/**
	* Returns the bao cao d l i of this ke hoach ve sinh.
	*
	* @return the bao cao d l i of this ke hoach ve sinh
	*/
	@Override
	public long getBaoCaoDLI() {
		return _keHoachVeSinh.getBaoCaoDLI();
	}

	/**
	* Sets the bao cao d l i of this ke hoach ve sinh.
	*
	* @param baoCaoDLI the bao cao d l i of this ke hoach ve sinh
	*/
	@Override
	public void setBaoCaoDLI(long baoCaoDLI) {
		_keHoachVeSinh.setBaoCaoDLI(baoCaoDLI);
	}

	/**
	* Returns the ngay tao of this ke hoach ve sinh.
	*
	* @return the ngay tao of this ke hoach ve sinh
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _keHoachVeSinh.getNgayTao();
	}

	/**
	* Sets the ngay tao of this ke hoach ve sinh.
	*
	* @param ngayTao the ngay tao of this ke hoach ve sinh
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_keHoachVeSinh.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this ke hoach ve sinh.
	*
	* @return the id nguoi tao of this ke hoach ve sinh
	*/
	@Override
	public long getIdNguoiTao() {
		return _keHoachVeSinh.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this ke hoach ve sinh.
	*
	* @param idNguoiTao the id nguoi tao of this ke hoach ve sinh
	*/
	@Override
	public void setIdNguoiTao(long idNguoiTao) {
		_keHoachVeSinh.setIdNguoiTao(idNguoiTao);
	}

	@Override
	public boolean isNew() {
		return _keHoachVeSinh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_keHoachVeSinh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _keHoachVeSinh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_keHoachVeSinh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _keHoachVeSinh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _keHoachVeSinh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_keHoachVeSinh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _keHoachVeSinh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_keHoachVeSinh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_keHoachVeSinh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_keHoachVeSinh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KeHoachVeSinhWrapper((KeHoachVeSinh)_keHoachVeSinh.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh keHoachVeSinh) {
		return _keHoachVeSinh.compareTo(keHoachVeSinh);
	}

	@Override
	public int hashCode() {
		return _keHoachVeSinh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh> toCacheModel() {
		return _keHoachVeSinh.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh toEscapedModel() {
		return new KeHoachVeSinhWrapper(_keHoachVeSinh.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh toUnescapedModel() {
		return new KeHoachVeSinhWrapper(_keHoachVeSinh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _keHoachVeSinh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _keHoachVeSinh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_keHoachVeSinh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KeHoachVeSinhWrapper)) {
			return false;
		}

		KeHoachVeSinhWrapper keHoachVeSinhWrapper = (KeHoachVeSinhWrapper)obj;

		if (Validator.equals(_keHoachVeSinh, keHoachVeSinhWrapper._keHoachVeSinh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KeHoachVeSinh getWrappedKeHoachVeSinh() {
		return _keHoachVeSinh;
	}

	@Override
	public KeHoachVeSinh getWrappedModel() {
		return _keHoachVeSinh;
	}

	@Override
	public void resetOriginalValues() {
		_keHoachVeSinh.resetOriginalValues();
	}

	private KeHoachVeSinh _keHoachVeSinh;
}