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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KeHoachNuocSach}.
 * </p>
 *
 * @author khoa.vu
 * @see KeHoachNuocSach
 * @generated
 */
public class KeHoachNuocSachWrapper implements KeHoachNuocSach,
	ModelWrapper<KeHoachNuocSach> {
	public KeHoachNuocSachWrapper(KeHoachNuocSach keHoachNuocSach) {
		_keHoachNuocSach = keHoachNuocSach;
	}

	@Override
	public Class<?> getModelClass() {
		return KeHoachNuocSach.class;
	}

	@Override
	public String getModelClassName() {
		return KeHoachNuocSach.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tramCapNuocId", getTramCapNuocId());
		attributes.put("nam", getNam());
		attributes.put("soDauNoiMoi", getSoDauNoiMoi());
		attributes.put("soNguoiHuongLoi", getSoNguoiHuongLoi());
		attributes.put("ghiChu", getGhiChu());

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

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer soDauNoiMoi = (Integer)attributes.get("soDauNoiMoi");

		if (soDauNoiMoi != null) {
			setSoDauNoiMoi(soDauNoiMoi);
		}

		Integer soNguoiHuongLoi = (Integer)attributes.get("soNguoiHuongLoi");

		if (soNguoiHuongLoi != null) {
			setSoNguoiHuongLoi(soNguoiHuongLoi);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	/**
	* Returns the primary key of this ke hoach nuoc sach.
	*
	* @return the primary key of this ke hoach nuoc sach
	*/
	@Override
	public long getPrimaryKey() {
		return _keHoachNuocSach.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ke hoach nuoc sach.
	*
	* @param primaryKey the primary key of this ke hoach nuoc sach
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_keHoachNuocSach.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this ke hoach nuoc sach.
	*
	* @return the ID of this ke hoach nuoc sach
	*/
	@Override
	public long getId() {
		return _keHoachNuocSach.getId();
	}

	/**
	* Sets the ID of this ke hoach nuoc sach.
	*
	* @param id the ID of this ke hoach nuoc sach
	*/
	@Override
	public void setId(long id) {
		_keHoachNuocSach.setId(id);
	}

	/**
	* Returns the tram cap nuoc ID of this ke hoach nuoc sach.
	*
	* @return the tram cap nuoc ID of this ke hoach nuoc sach
	*/
	@Override
	public int getTramCapNuocId() {
		return _keHoachNuocSach.getTramCapNuocId();
	}

	/**
	* Sets the tram cap nuoc ID of this ke hoach nuoc sach.
	*
	* @param tramCapNuocId the tram cap nuoc ID of this ke hoach nuoc sach
	*/
	@Override
	public void setTramCapNuocId(int tramCapNuocId) {
		_keHoachNuocSach.setTramCapNuocId(tramCapNuocId);
	}

	/**
	* Returns the nam of this ke hoach nuoc sach.
	*
	* @return the nam of this ke hoach nuoc sach
	*/
	@Override
	public int getNam() {
		return _keHoachNuocSach.getNam();
	}

	/**
	* Sets the nam of this ke hoach nuoc sach.
	*
	* @param nam the nam of this ke hoach nuoc sach
	*/
	@Override
	public void setNam(int nam) {
		_keHoachNuocSach.setNam(nam);
	}

	/**
	* Returns the so dau noi moi of this ke hoach nuoc sach.
	*
	* @return the so dau noi moi of this ke hoach nuoc sach
	*/
	@Override
	public int getSoDauNoiMoi() {
		return _keHoachNuocSach.getSoDauNoiMoi();
	}

	/**
	* Sets the so dau noi moi of this ke hoach nuoc sach.
	*
	* @param soDauNoiMoi the so dau noi moi of this ke hoach nuoc sach
	*/
	@Override
	public void setSoDauNoiMoi(int soDauNoiMoi) {
		_keHoachNuocSach.setSoDauNoiMoi(soDauNoiMoi);
	}

	/**
	* Returns the so nguoi huong loi of this ke hoach nuoc sach.
	*
	* @return the so nguoi huong loi of this ke hoach nuoc sach
	*/
	@Override
	public int getSoNguoiHuongLoi() {
		return _keHoachNuocSach.getSoNguoiHuongLoi();
	}

	/**
	* Sets the so nguoi huong loi of this ke hoach nuoc sach.
	*
	* @param soNguoiHuongLoi the so nguoi huong loi of this ke hoach nuoc sach
	*/
	@Override
	public void setSoNguoiHuongLoi(int soNguoiHuongLoi) {
		_keHoachNuocSach.setSoNguoiHuongLoi(soNguoiHuongLoi);
	}

	/**
	* Returns the ghi chu of this ke hoach nuoc sach.
	*
	* @return the ghi chu of this ke hoach nuoc sach
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _keHoachNuocSach.getGhiChu();
	}

	/**
	* Sets the ghi chu of this ke hoach nuoc sach.
	*
	* @param ghiChu the ghi chu of this ke hoach nuoc sach
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_keHoachNuocSach.setGhiChu(ghiChu);
	}

	@Override
	public boolean isNew() {
		return _keHoachNuocSach.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_keHoachNuocSach.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _keHoachNuocSach.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_keHoachNuocSach.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _keHoachNuocSach.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _keHoachNuocSach.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_keHoachNuocSach.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _keHoachNuocSach.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_keHoachNuocSach.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_keHoachNuocSach.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_keHoachNuocSach.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KeHoachNuocSachWrapper((KeHoachNuocSach)_keHoachNuocSach.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach keHoachNuocSach) {
		return _keHoachNuocSach.compareTo(keHoachNuocSach);
	}

	@Override
	public int hashCode() {
		return _keHoachNuocSach.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach> toCacheModel() {
		return _keHoachNuocSach.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach toEscapedModel() {
		return new KeHoachNuocSachWrapper(_keHoachNuocSach.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach toUnescapedModel() {
		return new KeHoachNuocSachWrapper(_keHoachNuocSach.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _keHoachNuocSach.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _keHoachNuocSach.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_keHoachNuocSach.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KeHoachNuocSachWrapper)) {
			return false;
		}

		KeHoachNuocSachWrapper keHoachNuocSachWrapper = (KeHoachNuocSachWrapper)obj;

		if (Validator.equals(_keHoachNuocSach,
					keHoachNuocSachWrapper._keHoachNuocSach)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KeHoachNuocSach getWrappedKeHoachNuocSach() {
		return _keHoachNuocSach;
	}

	@Override
	public KeHoachNuocSach getWrappedModel() {
		return _keHoachNuocSach;
	}

	@Override
	public void resetOriginalValues() {
		_keHoachNuocSach.resetOriginalValues();
	}

	private KeHoachNuocSach _keHoachNuocSach;
}