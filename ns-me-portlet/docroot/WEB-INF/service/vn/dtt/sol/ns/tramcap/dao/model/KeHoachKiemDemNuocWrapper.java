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
 * This class is a wrapper for {@link KeHoachKiemDemNuoc}.
 * </p>
 *
 * @author khoa.vu
 * @see KeHoachKiemDemNuoc
 * @generated
 */
public class KeHoachKiemDemNuocWrapper implements KeHoachKiemDemNuoc,
	ModelWrapper<KeHoachKiemDemNuoc> {
	public KeHoachKiemDemNuocWrapper(KeHoachKiemDemNuoc keHoachKiemDemNuoc) {
		_keHoachKiemDemNuoc = keHoachKiemDemNuoc;
	}

	@Override
	public Class<?> getModelClass() {
		return KeHoachKiemDemNuoc.class;
	}

	@Override
	public String getModelClassName() {
		return KeHoachKiemDemNuoc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("nam", getNam());
		attributes.put("tramCapNuocId", getTramCapNuocId());
		attributes.put("kiemDemVienId", getKiemDemVienId());
		attributes.put("ngayBatDau", getNgayBatDau());
		attributes.put("ngayKetThuc", getNgayKetThuc());
		attributes.put("moTa", getMoTa());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("ngayXuatBan", getNgayXuatBan());
		attributes.put("idNguoiXuatBan", getIdNguoiXuatBan());
		attributes.put("ngayDong", getNgayDong());
		attributes.put("idNguoiDong", getIdNguoiDong());
		attributes.put("lastSavePoint", getLastSavePoint());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer tramCapNuocId = (Integer)attributes.get("tramCapNuocId");

		if (tramCapNuocId != null) {
			setTramCapNuocId(tramCapNuocId);
		}

		Integer kiemDemVienId = (Integer)attributes.get("kiemDemVienId");

		if (kiemDemVienId != null) {
			setKiemDemVienId(kiemDemVienId);
		}

		Date ngayBatDau = (Date)attributes.get("ngayBatDau");

		if (ngayBatDau != null) {
			setNgayBatDau(ngayBatDau);
		}

		Date ngayKetThuc = (Date)attributes.get("ngayKetThuc");

		if (ngayKetThuc != null) {
			setNgayKetThuc(ngayKetThuc);
		}

		String moTa = (String)attributes.get("moTa");

		if (moTa != null) {
			setMoTa(moTa);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Integer idNguoiTao = (Integer)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		Date ngayXuatBan = (Date)attributes.get("ngayXuatBan");

		if (ngayXuatBan != null) {
			setNgayXuatBan(ngayXuatBan);
		}

		Integer idNguoiXuatBan = (Integer)attributes.get("idNguoiXuatBan");

		if (idNguoiXuatBan != null) {
			setIdNguoiXuatBan(idNguoiXuatBan);
		}

		Date ngayDong = (Date)attributes.get("ngayDong");

		if (ngayDong != null) {
			setNgayDong(ngayDong);
		}

		Integer idNguoiDong = (Integer)attributes.get("idNguoiDong");

		if (idNguoiDong != null) {
			setIdNguoiDong(idNguoiDong);
		}

		Date lastSavePoint = (Date)attributes.get("lastSavePoint");

		if (lastSavePoint != null) {
			setLastSavePoint(lastSavePoint);
		}
	}

	/**
	* Returns the primary key of this ke hoach kiem dem nuoc.
	*
	* @return the primary key of this ke hoach kiem dem nuoc
	*/
	@Override
	public int getPrimaryKey() {
		return _keHoachKiemDemNuoc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ke hoach kiem dem nuoc.
	*
	* @param primaryKey the primary key of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_keHoachKiemDemNuoc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this ke hoach kiem dem nuoc.
	*
	* @return the ID of this ke hoach kiem dem nuoc
	*/
	@Override
	public int getId() {
		return _keHoachKiemDemNuoc.getId();
	}

	/**
	* Sets the ID of this ke hoach kiem dem nuoc.
	*
	* @param id the ID of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setId(int id) {
		_keHoachKiemDemNuoc.setId(id);
	}

	/**
	* Returns the nam of this ke hoach kiem dem nuoc.
	*
	* @return the nam of this ke hoach kiem dem nuoc
	*/
	@Override
	public int getNam() {
		return _keHoachKiemDemNuoc.getNam();
	}

	/**
	* Sets the nam of this ke hoach kiem dem nuoc.
	*
	* @param nam the nam of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setNam(int nam) {
		_keHoachKiemDemNuoc.setNam(nam);
	}

	/**
	* Returns the tram cap nuoc ID of this ke hoach kiem dem nuoc.
	*
	* @return the tram cap nuoc ID of this ke hoach kiem dem nuoc
	*/
	@Override
	public int getTramCapNuocId() {
		return _keHoachKiemDemNuoc.getTramCapNuocId();
	}

	/**
	* Sets the tram cap nuoc ID of this ke hoach kiem dem nuoc.
	*
	* @param tramCapNuocId the tram cap nuoc ID of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setTramCapNuocId(int tramCapNuocId) {
		_keHoachKiemDemNuoc.setTramCapNuocId(tramCapNuocId);
	}

	/**
	* Returns the kiem dem vien ID of this ke hoach kiem dem nuoc.
	*
	* @return the kiem dem vien ID of this ke hoach kiem dem nuoc
	*/
	@Override
	public int getKiemDemVienId() {
		return _keHoachKiemDemNuoc.getKiemDemVienId();
	}

	/**
	* Sets the kiem dem vien ID of this ke hoach kiem dem nuoc.
	*
	* @param kiemDemVienId the kiem dem vien ID of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setKiemDemVienId(int kiemDemVienId) {
		_keHoachKiemDemNuoc.setKiemDemVienId(kiemDemVienId);
	}

	/**
	* Returns the ngay bat dau of this ke hoach kiem dem nuoc.
	*
	* @return the ngay bat dau of this ke hoach kiem dem nuoc
	*/
	@Override
	public java.util.Date getNgayBatDau() {
		return _keHoachKiemDemNuoc.getNgayBatDau();
	}

	/**
	* Sets the ngay bat dau of this ke hoach kiem dem nuoc.
	*
	* @param ngayBatDau the ngay bat dau of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setNgayBatDau(java.util.Date ngayBatDau) {
		_keHoachKiemDemNuoc.setNgayBatDau(ngayBatDau);
	}

	/**
	* Returns the ngay ket thuc of this ke hoach kiem dem nuoc.
	*
	* @return the ngay ket thuc of this ke hoach kiem dem nuoc
	*/
	@Override
	public java.util.Date getNgayKetThuc() {
		return _keHoachKiemDemNuoc.getNgayKetThuc();
	}

	/**
	* Sets the ngay ket thuc of this ke hoach kiem dem nuoc.
	*
	* @param ngayKetThuc the ngay ket thuc of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setNgayKetThuc(java.util.Date ngayKetThuc) {
		_keHoachKiemDemNuoc.setNgayKetThuc(ngayKetThuc);
	}

	/**
	* Returns the mo ta of this ke hoach kiem dem nuoc.
	*
	* @return the mo ta of this ke hoach kiem dem nuoc
	*/
	@Override
	public java.lang.String getMoTa() {
		return _keHoachKiemDemNuoc.getMoTa();
	}

	/**
	* Sets the mo ta of this ke hoach kiem dem nuoc.
	*
	* @param moTa the mo ta of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setMoTa(java.lang.String moTa) {
		_keHoachKiemDemNuoc.setMoTa(moTa);
	}

	/**
	* Returns the ngay tao of this ke hoach kiem dem nuoc.
	*
	* @return the ngay tao of this ke hoach kiem dem nuoc
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _keHoachKiemDemNuoc.getNgayTao();
	}

	/**
	* Sets the ngay tao of this ke hoach kiem dem nuoc.
	*
	* @param ngayTao the ngay tao of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_keHoachKiemDemNuoc.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this ke hoach kiem dem nuoc.
	*
	* @return the id nguoi tao of this ke hoach kiem dem nuoc
	*/
	@Override
	public int getIdNguoiTao() {
		return _keHoachKiemDemNuoc.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this ke hoach kiem dem nuoc.
	*
	* @param idNguoiTao the id nguoi tao of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setIdNguoiTao(int idNguoiTao) {
		_keHoachKiemDemNuoc.setIdNguoiTao(idNguoiTao);
	}

	/**
	* Returns the ngay xuat ban of this ke hoach kiem dem nuoc.
	*
	* @return the ngay xuat ban of this ke hoach kiem dem nuoc
	*/
	@Override
	public java.util.Date getNgayXuatBan() {
		return _keHoachKiemDemNuoc.getNgayXuatBan();
	}

	/**
	* Sets the ngay xuat ban of this ke hoach kiem dem nuoc.
	*
	* @param ngayXuatBan the ngay xuat ban of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setNgayXuatBan(java.util.Date ngayXuatBan) {
		_keHoachKiemDemNuoc.setNgayXuatBan(ngayXuatBan);
	}

	/**
	* Returns the id nguoi xuat ban of this ke hoach kiem dem nuoc.
	*
	* @return the id nguoi xuat ban of this ke hoach kiem dem nuoc
	*/
	@Override
	public int getIdNguoiXuatBan() {
		return _keHoachKiemDemNuoc.getIdNguoiXuatBan();
	}

	/**
	* Sets the id nguoi xuat ban of this ke hoach kiem dem nuoc.
	*
	* @param idNguoiXuatBan the id nguoi xuat ban of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setIdNguoiXuatBan(int idNguoiXuatBan) {
		_keHoachKiemDemNuoc.setIdNguoiXuatBan(idNguoiXuatBan);
	}

	/**
	* Returns the ngay dong of this ke hoach kiem dem nuoc.
	*
	* @return the ngay dong of this ke hoach kiem dem nuoc
	*/
	@Override
	public java.util.Date getNgayDong() {
		return _keHoachKiemDemNuoc.getNgayDong();
	}

	/**
	* Sets the ngay dong of this ke hoach kiem dem nuoc.
	*
	* @param ngayDong the ngay dong of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setNgayDong(java.util.Date ngayDong) {
		_keHoachKiemDemNuoc.setNgayDong(ngayDong);
	}

	/**
	* Returns the id nguoi dong of this ke hoach kiem dem nuoc.
	*
	* @return the id nguoi dong of this ke hoach kiem dem nuoc
	*/
	@Override
	public int getIdNguoiDong() {
		return _keHoachKiemDemNuoc.getIdNguoiDong();
	}

	/**
	* Sets the id nguoi dong of this ke hoach kiem dem nuoc.
	*
	* @param idNguoiDong the id nguoi dong of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setIdNguoiDong(int idNguoiDong) {
		_keHoachKiemDemNuoc.setIdNguoiDong(idNguoiDong);
	}

	/**
	* Returns the last save point of this ke hoach kiem dem nuoc.
	*
	* @return the last save point of this ke hoach kiem dem nuoc
	*/
	@Override
	public java.util.Date getLastSavePoint() {
		return _keHoachKiemDemNuoc.getLastSavePoint();
	}

	/**
	* Sets the last save point of this ke hoach kiem dem nuoc.
	*
	* @param lastSavePoint the last save point of this ke hoach kiem dem nuoc
	*/
	@Override
	public void setLastSavePoint(java.util.Date lastSavePoint) {
		_keHoachKiemDemNuoc.setLastSavePoint(lastSavePoint);
	}

	@Override
	public boolean isNew() {
		return _keHoachKiemDemNuoc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_keHoachKiemDemNuoc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _keHoachKiemDemNuoc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_keHoachKiemDemNuoc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _keHoachKiemDemNuoc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _keHoachKiemDemNuoc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_keHoachKiemDemNuoc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _keHoachKiemDemNuoc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_keHoachKiemDemNuoc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_keHoachKiemDemNuoc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_keHoachKiemDemNuoc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KeHoachKiemDemNuocWrapper((KeHoachKiemDemNuoc)_keHoachKiemDemNuoc.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc keHoachKiemDemNuoc) {
		return _keHoachKiemDemNuoc.compareTo(keHoachKiemDemNuoc);
	}

	@Override
	public int hashCode() {
		return _keHoachKiemDemNuoc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc> toCacheModel() {
		return _keHoachKiemDemNuoc.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc toEscapedModel() {
		return new KeHoachKiemDemNuocWrapper(_keHoachKiemDemNuoc.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc toUnescapedModel() {
		return new KeHoachKiemDemNuocWrapper(_keHoachKiemDemNuoc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _keHoachKiemDemNuoc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _keHoachKiemDemNuoc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_keHoachKiemDemNuoc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KeHoachKiemDemNuocWrapper)) {
			return false;
		}

		KeHoachKiemDemNuocWrapper keHoachKiemDemNuocWrapper = (KeHoachKiemDemNuocWrapper)obj;

		if (Validator.equals(_keHoachKiemDemNuoc,
					keHoachKiemDemNuocWrapper._keHoachKiemDemNuoc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KeHoachKiemDemNuoc getWrappedKeHoachKiemDemNuoc() {
		return _keHoachKiemDemNuoc;
	}

	@Override
	public KeHoachKiemDemNuoc getWrappedModel() {
		return _keHoachKiemDemNuoc;
	}

	@Override
	public void resetOriginalValues() {
		_keHoachKiemDemNuoc.resetOriginalValues();
	}

	private KeHoachKiemDemNuoc _keHoachKiemDemNuoc;
}