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
 * This class is a wrapper for {@link KeHoachKiemDemVeSinh}.
 * </p>
 *
 * @author BinhTH
 * @see KeHoachKiemDemVeSinh
 * @generated
 */
public class KeHoachKiemDemVeSinhWrapper implements KeHoachKiemDemVeSinh,
	ModelWrapper<KeHoachKiemDemVeSinh> {
	public KeHoachKiemDemVeSinhWrapper(
		KeHoachKiemDemVeSinh keHoachKiemDemVeSinh) {
		_keHoachKiemDemVeSinh = keHoachKiemDemVeSinh;
	}

	@Override
	public Class<?> getModelClass() {
		return KeHoachKiemDemVeSinh.class;
	}

	@Override
	public String getModelClassName() {
		return KeHoachKiemDemVeSinh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("nam", getNam());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("kiemDemVienID", getKiemDemVienID());
		attributes.put("ngayBatDau", getNgayBatDau());
		attributes.put("ngayKetThuc", getNgayKetThuc());
		attributes.put("moTa", getMoTa());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("ngayXuatBan", getNgayXuatBan());
		attributes.put("idNguoiXuatBan", getIdNguoiXuatBan());
		attributes.put("tableId", getTableId());
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

		String maTinh = (String)attributes.get("maTinh");

		if (maTinh != null) {
			setMaTinh(maTinh);
		}

		String maHuyen = (String)attributes.get("maHuyen");

		if (maHuyen != null) {
			setMaHuyen(maHuyen);
		}

		Integer kiemDemVienID = (Integer)attributes.get("kiemDemVienID");

		if (kiemDemVienID != null) {
			setKiemDemVienID(kiemDemVienID);
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

		String tableId = (String)attributes.get("tableId");

		if (tableId != null) {
			setTableId(tableId);
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
	* Returns the primary key of this ke hoach kiem dem ve sinh.
	*
	* @return the primary key of this ke hoach kiem dem ve sinh
	*/
	@Override
	public int getPrimaryKey() {
		return _keHoachKiemDemVeSinh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ke hoach kiem dem ve sinh.
	*
	* @param primaryKey the primary key of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_keHoachKiemDemVeSinh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this ke hoach kiem dem ve sinh.
	*
	* @return the ID of this ke hoach kiem dem ve sinh
	*/
	@Override
	public int getId() {
		return _keHoachKiemDemVeSinh.getId();
	}

	/**
	* Sets the ID of this ke hoach kiem dem ve sinh.
	*
	* @param id the ID of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setId(int id) {
		_keHoachKiemDemVeSinh.setId(id);
	}

	/**
	* Returns the nam of this ke hoach kiem dem ve sinh.
	*
	* @return the nam of this ke hoach kiem dem ve sinh
	*/
	@Override
	public int getNam() {
		return _keHoachKiemDemVeSinh.getNam();
	}

	/**
	* Sets the nam of this ke hoach kiem dem ve sinh.
	*
	* @param nam the nam of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setNam(int nam) {
		_keHoachKiemDemVeSinh.setNam(nam);
	}

	/**
	* Returns the ma tinh of this ke hoach kiem dem ve sinh.
	*
	* @return the ma tinh of this ke hoach kiem dem ve sinh
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _keHoachKiemDemVeSinh.getMaTinh();
	}

	/**
	* Sets the ma tinh of this ke hoach kiem dem ve sinh.
	*
	* @param maTinh the ma tinh of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_keHoachKiemDemVeSinh.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this ke hoach kiem dem ve sinh.
	*
	* @return the ma huyen of this ke hoach kiem dem ve sinh
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _keHoachKiemDemVeSinh.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this ke hoach kiem dem ve sinh.
	*
	* @param maHuyen the ma huyen of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_keHoachKiemDemVeSinh.setMaHuyen(maHuyen);
	}

	/**
	* Returns the kiem dem vien i d of this ke hoach kiem dem ve sinh.
	*
	* @return the kiem dem vien i d of this ke hoach kiem dem ve sinh
	*/
	@Override
	public int getKiemDemVienID() {
		return _keHoachKiemDemVeSinh.getKiemDemVienID();
	}

	/**
	* Sets the kiem dem vien i d of this ke hoach kiem dem ve sinh.
	*
	* @param kiemDemVienID the kiem dem vien i d of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setKiemDemVienID(int kiemDemVienID) {
		_keHoachKiemDemVeSinh.setKiemDemVienID(kiemDemVienID);
	}

	/**
	* Returns the ngay bat dau of this ke hoach kiem dem ve sinh.
	*
	* @return the ngay bat dau of this ke hoach kiem dem ve sinh
	*/
	@Override
	public java.util.Date getNgayBatDau() {
		return _keHoachKiemDemVeSinh.getNgayBatDau();
	}

	/**
	* Sets the ngay bat dau of this ke hoach kiem dem ve sinh.
	*
	* @param ngayBatDau the ngay bat dau of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setNgayBatDau(java.util.Date ngayBatDau) {
		_keHoachKiemDemVeSinh.setNgayBatDau(ngayBatDau);
	}

	/**
	* Returns the ngay ket thuc of this ke hoach kiem dem ve sinh.
	*
	* @return the ngay ket thuc of this ke hoach kiem dem ve sinh
	*/
	@Override
	public java.util.Date getNgayKetThuc() {
		return _keHoachKiemDemVeSinh.getNgayKetThuc();
	}

	/**
	* Sets the ngay ket thuc of this ke hoach kiem dem ve sinh.
	*
	* @param ngayKetThuc the ngay ket thuc of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setNgayKetThuc(java.util.Date ngayKetThuc) {
		_keHoachKiemDemVeSinh.setNgayKetThuc(ngayKetThuc);
	}

	/**
	* Returns the mo ta of this ke hoach kiem dem ve sinh.
	*
	* @return the mo ta of this ke hoach kiem dem ve sinh
	*/
	@Override
	public java.lang.String getMoTa() {
		return _keHoachKiemDemVeSinh.getMoTa();
	}

	/**
	* Sets the mo ta of this ke hoach kiem dem ve sinh.
	*
	* @param moTa the mo ta of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setMoTa(java.lang.String moTa) {
		_keHoachKiemDemVeSinh.setMoTa(moTa);
	}

	/**
	* Returns the ngay tao of this ke hoach kiem dem ve sinh.
	*
	* @return the ngay tao of this ke hoach kiem dem ve sinh
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _keHoachKiemDemVeSinh.getNgayTao();
	}

	/**
	* Sets the ngay tao of this ke hoach kiem dem ve sinh.
	*
	* @param ngayTao the ngay tao of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_keHoachKiemDemVeSinh.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this ke hoach kiem dem ve sinh.
	*
	* @return the id nguoi tao of this ke hoach kiem dem ve sinh
	*/
	@Override
	public int getIdNguoiTao() {
		return _keHoachKiemDemVeSinh.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this ke hoach kiem dem ve sinh.
	*
	* @param idNguoiTao the id nguoi tao of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setIdNguoiTao(int idNguoiTao) {
		_keHoachKiemDemVeSinh.setIdNguoiTao(idNguoiTao);
	}

	/**
	* Returns the ngay xuat ban of this ke hoach kiem dem ve sinh.
	*
	* @return the ngay xuat ban of this ke hoach kiem dem ve sinh
	*/
	@Override
	public java.util.Date getNgayXuatBan() {
		return _keHoachKiemDemVeSinh.getNgayXuatBan();
	}

	/**
	* Sets the ngay xuat ban of this ke hoach kiem dem ve sinh.
	*
	* @param ngayXuatBan the ngay xuat ban of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setNgayXuatBan(java.util.Date ngayXuatBan) {
		_keHoachKiemDemVeSinh.setNgayXuatBan(ngayXuatBan);
	}

	/**
	* Returns the id nguoi xuat ban of this ke hoach kiem dem ve sinh.
	*
	* @return the id nguoi xuat ban of this ke hoach kiem dem ve sinh
	*/
	@Override
	public int getIdNguoiXuatBan() {
		return _keHoachKiemDemVeSinh.getIdNguoiXuatBan();
	}

	/**
	* Sets the id nguoi xuat ban of this ke hoach kiem dem ve sinh.
	*
	* @param idNguoiXuatBan the id nguoi xuat ban of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setIdNguoiXuatBan(int idNguoiXuatBan) {
		_keHoachKiemDemVeSinh.setIdNguoiXuatBan(idNguoiXuatBan);
	}

	/**
	* Returns the table ID of this ke hoach kiem dem ve sinh.
	*
	* @return the table ID of this ke hoach kiem dem ve sinh
	*/
	@Override
	public java.lang.String getTableId() {
		return _keHoachKiemDemVeSinh.getTableId();
	}

	/**
	* Sets the table ID of this ke hoach kiem dem ve sinh.
	*
	* @param tableId the table ID of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setTableId(java.lang.String tableId) {
		_keHoachKiemDemVeSinh.setTableId(tableId);
	}

	/**
	* Returns the ngay dong of this ke hoach kiem dem ve sinh.
	*
	* @return the ngay dong of this ke hoach kiem dem ve sinh
	*/
	@Override
	public java.util.Date getNgayDong() {
		return _keHoachKiemDemVeSinh.getNgayDong();
	}

	/**
	* Sets the ngay dong of this ke hoach kiem dem ve sinh.
	*
	* @param ngayDong the ngay dong of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setNgayDong(java.util.Date ngayDong) {
		_keHoachKiemDemVeSinh.setNgayDong(ngayDong);
	}

	/**
	* Returns the id nguoi dong of this ke hoach kiem dem ve sinh.
	*
	* @return the id nguoi dong of this ke hoach kiem dem ve sinh
	*/
	@Override
	public int getIdNguoiDong() {
		return _keHoachKiemDemVeSinh.getIdNguoiDong();
	}

	/**
	* Sets the id nguoi dong of this ke hoach kiem dem ve sinh.
	*
	* @param idNguoiDong the id nguoi dong of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setIdNguoiDong(int idNguoiDong) {
		_keHoachKiemDemVeSinh.setIdNguoiDong(idNguoiDong);
	}

	/**
	* Returns the last save point of this ke hoach kiem dem ve sinh.
	*
	* @return the last save point of this ke hoach kiem dem ve sinh
	*/
	@Override
	public java.util.Date getLastSavePoint() {
		return _keHoachKiemDemVeSinh.getLastSavePoint();
	}

	/**
	* Sets the last save point of this ke hoach kiem dem ve sinh.
	*
	* @param lastSavePoint the last save point of this ke hoach kiem dem ve sinh
	*/
	@Override
	public void setLastSavePoint(java.util.Date lastSavePoint) {
		_keHoachKiemDemVeSinh.setLastSavePoint(lastSavePoint);
	}

	@Override
	public boolean isNew() {
		return _keHoachKiemDemVeSinh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_keHoachKiemDemVeSinh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _keHoachKiemDemVeSinh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_keHoachKiemDemVeSinh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _keHoachKiemDemVeSinh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _keHoachKiemDemVeSinh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_keHoachKiemDemVeSinh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _keHoachKiemDemVeSinh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_keHoachKiemDemVeSinh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_keHoachKiemDemVeSinh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_keHoachKiemDemVeSinh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KeHoachKiemDemVeSinhWrapper((KeHoachKiemDemVeSinh)_keHoachKiemDemVeSinh.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh keHoachKiemDemVeSinh) {
		return _keHoachKiemDemVeSinh.compareTo(keHoachKiemDemVeSinh);
	}

	@Override
	public int hashCode() {
		return _keHoachKiemDemVeSinh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh> toCacheModel() {
		return _keHoachKiemDemVeSinh.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh toEscapedModel() {
		return new KeHoachKiemDemVeSinhWrapper(_keHoachKiemDemVeSinh.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh toUnescapedModel() {
		return new KeHoachKiemDemVeSinhWrapper(_keHoachKiemDemVeSinh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _keHoachKiemDemVeSinh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _keHoachKiemDemVeSinh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_keHoachKiemDemVeSinh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KeHoachKiemDemVeSinhWrapper)) {
			return false;
		}

		KeHoachKiemDemVeSinhWrapper keHoachKiemDemVeSinhWrapper = (KeHoachKiemDemVeSinhWrapper)obj;

		if (Validator.equals(_keHoachKiemDemVeSinh,
					keHoachKiemDemVeSinhWrapper._keHoachKiemDemVeSinh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KeHoachKiemDemVeSinh getWrappedKeHoachKiemDemVeSinh() {
		return _keHoachKiemDemVeSinh;
	}

	@Override
	public KeHoachKiemDemVeSinh getWrappedModel() {
		return _keHoachKiemDemVeSinh;
	}

	@Override
	public void resetOriginalValues() {
		_keHoachKiemDemVeSinh.resetOriginalValues();
	}

	private KeHoachKiemDemVeSinh _keHoachKiemDemVeSinh;
}