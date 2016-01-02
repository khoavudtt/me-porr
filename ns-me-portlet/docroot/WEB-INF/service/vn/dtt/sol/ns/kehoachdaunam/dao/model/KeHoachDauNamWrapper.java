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

package vn.dtt.sol.ns.kehoachdaunam.dao.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KeHoachDauNam}.
 * </p>
 *
 * @author HANT
 * @see KeHoachDauNam
 * @generated
 */
public class KeHoachDauNamWrapper implements KeHoachDauNam,
	ModelWrapper<KeHoachDauNam> {
	public KeHoachDauNamWrapper(KeHoachDauNam keHoachDauNam) {
		_keHoachDauNam = keHoachDauNam;
	}

	@Override
	public Class<?> getModelClass() {
		return KeHoachDauNam.class;
	}

	@Override
	public String getModelClassName() {
		return KeHoachDauNam.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tramCapNuocId", getTramCapNuocId());
		attributes.put("nam", getNam());
		attributes.put("soDauNoiMoi", getSoDauNoiMoi());
		attributes.put("soHoHuongLoi", getSoHoHuongLoi());
		attributes.put("soNguoiHuongLoi", getSoNguoiHuongLoi());
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

		Long tramCapNuocId = (Long)attributes.get("tramCapNuocId");

		if (tramCapNuocId != null) {
			setTramCapNuocId(tramCapNuocId);
		}

		Long nam = (Long)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Long soDauNoiMoi = (Long)attributes.get("soDauNoiMoi");

		if (soDauNoiMoi != null) {
			setSoDauNoiMoi(soDauNoiMoi);
		}

		Long soHoHuongLoi = (Long)attributes.get("soHoHuongLoi");

		if (soHoHuongLoi != null) {
			setSoHoHuongLoi(soHoHuongLoi);
		}

		Long soNguoiHuongLoi = (Long)attributes.get("soNguoiHuongLoi");

		if (soNguoiHuongLoi != null) {
			setSoNguoiHuongLoi(soNguoiHuongLoi);
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
	* Returns the primary key of this ke hoach dau nam.
	*
	* @return the primary key of this ke hoach dau nam
	*/
	@Override
	public long getPrimaryKey() {
		return _keHoachDauNam.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ke hoach dau nam.
	*
	* @param primaryKey the primary key of this ke hoach dau nam
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_keHoachDauNam.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this ke hoach dau nam.
	*
	* @return the ID of this ke hoach dau nam
	*/
	@Override
	public long getId() {
		return _keHoachDauNam.getId();
	}

	/**
	* Sets the ID of this ke hoach dau nam.
	*
	* @param id the ID of this ke hoach dau nam
	*/
	@Override
	public void setId(long id) {
		_keHoachDauNam.setId(id);
	}

	/**
	* Returns the tram cap nuoc ID of this ke hoach dau nam.
	*
	* @return the tram cap nuoc ID of this ke hoach dau nam
	*/
	@Override
	public long getTramCapNuocId() {
		return _keHoachDauNam.getTramCapNuocId();
	}

	/**
	* Sets the tram cap nuoc ID of this ke hoach dau nam.
	*
	* @param tramCapNuocId the tram cap nuoc ID of this ke hoach dau nam
	*/
	@Override
	public void setTramCapNuocId(long tramCapNuocId) {
		_keHoachDauNam.setTramCapNuocId(tramCapNuocId);
	}

	/**
	* Returns the nam of this ke hoach dau nam.
	*
	* @return the nam of this ke hoach dau nam
	*/
	@Override
	public long getNam() {
		return _keHoachDauNam.getNam();
	}

	/**
	* Sets the nam of this ke hoach dau nam.
	*
	* @param nam the nam of this ke hoach dau nam
	*/
	@Override
	public void setNam(long nam) {
		_keHoachDauNam.setNam(nam);
	}

	/**
	* Returns the so dau noi moi of this ke hoach dau nam.
	*
	* @return the so dau noi moi of this ke hoach dau nam
	*/
	@Override
	public long getSoDauNoiMoi() {
		return _keHoachDauNam.getSoDauNoiMoi();
	}

	/**
	* Sets the so dau noi moi of this ke hoach dau nam.
	*
	* @param soDauNoiMoi the so dau noi moi of this ke hoach dau nam
	*/
	@Override
	public void setSoDauNoiMoi(long soDauNoiMoi) {
		_keHoachDauNam.setSoDauNoiMoi(soDauNoiMoi);
	}

	/**
	* Returns the so ho huong loi of this ke hoach dau nam.
	*
	* @return the so ho huong loi of this ke hoach dau nam
	*/
	@Override
	public long getSoHoHuongLoi() {
		return _keHoachDauNam.getSoHoHuongLoi();
	}

	/**
	* Sets the so ho huong loi of this ke hoach dau nam.
	*
	* @param soHoHuongLoi the so ho huong loi of this ke hoach dau nam
	*/
	@Override
	public void setSoHoHuongLoi(long soHoHuongLoi) {
		_keHoachDauNam.setSoHoHuongLoi(soHoHuongLoi);
	}

	/**
	* Returns the so nguoi huong loi of this ke hoach dau nam.
	*
	* @return the so nguoi huong loi of this ke hoach dau nam
	*/
	@Override
	public long getSoNguoiHuongLoi() {
		return _keHoachDauNam.getSoNguoiHuongLoi();
	}

	/**
	* Sets the so nguoi huong loi of this ke hoach dau nam.
	*
	* @param soNguoiHuongLoi the so nguoi huong loi of this ke hoach dau nam
	*/
	@Override
	public void setSoNguoiHuongLoi(long soNguoiHuongLoi) {
		_keHoachDauNam.setSoNguoiHuongLoi(soNguoiHuongLoi);
	}

	/**
	* Returns the ghi chu of this ke hoach dau nam.
	*
	* @return the ghi chu of this ke hoach dau nam
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _keHoachDauNam.getGhiChu();
	}

	/**
	* Sets the ghi chu of this ke hoach dau nam.
	*
	* @param ghiChu the ghi chu of this ke hoach dau nam
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_keHoachDauNam.setGhiChu(ghiChu);
	}

	/**
	* Returns the bao cao d l i of this ke hoach dau nam.
	*
	* @return the bao cao d l i of this ke hoach dau nam
	*/
	@Override
	public long getBaoCaoDLI() {
		return _keHoachDauNam.getBaoCaoDLI();
	}

	/**
	* Sets the bao cao d l i of this ke hoach dau nam.
	*
	* @param baoCaoDLI the bao cao d l i of this ke hoach dau nam
	*/
	@Override
	public void setBaoCaoDLI(long baoCaoDLI) {
		_keHoachDauNam.setBaoCaoDLI(baoCaoDLI);
	}

	/**
	* Returns the ngay tao of this ke hoach dau nam.
	*
	* @return the ngay tao of this ke hoach dau nam
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _keHoachDauNam.getNgayTao();
	}

	/**
	* Sets the ngay tao of this ke hoach dau nam.
	*
	* @param ngayTao the ngay tao of this ke hoach dau nam
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_keHoachDauNam.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this ke hoach dau nam.
	*
	* @return the id nguoi tao of this ke hoach dau nam
	*/
	@Override
	public long getIdNguoiTao() {
		return _keHoachDauNam.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this ke hoach dau nam.
	*
	* @param idNguoiTao the id nguoi tao of this ke hoach dau nam
	*/
	@Override
	public void setIdNguoiTao(long idNguoiTao) {
		_keHoachDauNam.setIdNguoiTao(idNguoiTao);
	}

	@Override
	public boolean isNew() {
		return _keHoachDauNam.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_keHoachDauNam.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _keHoachDauNam.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_keHoachDauNam.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _keHoachDauNam.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _keHoachDauNam.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_keHoachDauNam.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _keHoachDauNam.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_keHoachDauNam.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_keHoachDauNam.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_keHoachDauNam.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KeHoachDauNamWrapper((KeHoachDauNam)_keHoachDauNam.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam keHoachDauNam) {
		return _keHoachDauNam.compareTo(keHoachDauNam);
	}

	@Override
	public int hashCode() {
		return _keHoachDauNam.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam> toCacheModel() {
		return _keHoachDauNam.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam toEscapedModel() {
		return new KeHoachDauNamWrapper(_keHoachDauNam.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam toUnescapedModel() {
		return new KeHoachDauNamWrapper(_keHoachDauNam.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _keHoachDauNam.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _keHoachDauNam.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_keHoachDauNam.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KeHoachDauNamWrapper)) {
			return false;
		}

		KeHoachDauNamWrapper keHoachDauNamWrapper = (KeHoachDauNamWrapper)obj;

		if (Validator.equals(_keHoachDauNam, keHoachDauNamWrapper._keHoachDauNam)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KeHoachDauNam getWrappedKeHoachDauNam() {
		return _keHoachDauNam;
	}

	@Override
	public KeHoachDauNam getWrappedModel() {
		return _keHoachDauNam;
	}

	@Override
	public void resetOriginalValues() {
		_keHoachDauNam.resetOriginalValues();
	}

	private KeHoachDauNam _keHoachDauNam;
}