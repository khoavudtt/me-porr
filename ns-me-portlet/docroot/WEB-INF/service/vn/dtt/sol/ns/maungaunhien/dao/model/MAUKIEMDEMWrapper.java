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

package vn.dtt.sol.ns.maungaunhien.dao.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MAUKIEMDEM}.
 * </p>
 *
 * @author khoa.vu
 * @see MAUKIEMDEM
 * @generated
 */
public class MAUKIEMDEMWrapper implements MAUKIEMDEM, ModelWrapper<MAUKIEMDEM> {
	public MAUKIEMDEMWrapper(MAUKIEMDEM maukiemdem) {
		_maukiemdem = maukiemdem;
	}

	@Override
	public Class<?> getModelClass() {
		return MAUKIEMDEM.class;
	}

	@Override
	public String getModelClassName() {
		return MAUKIEMDEM.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maXa", getMaXa());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("nam", getNam());
		attributes.put("tongSoHGD", getTongSoHGD());
		attributes.put("soMauNgauNhien", getSoMauNgauNhien());
		attributes.put("soMauDuPhong", getSoMauDuPhong());
		attributes.put("tongSoMau", getTongSoMau());
		attributes.put("soMauHVS", getSoMauHVS());
		attributes.put("soMauCoNhaTieu", getSoMauCoNhaTieu());
		attributes.put("soMauKiemDem", getSoMauKiemDem());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maXa = (String)attributes.get("maXa");

		if (maXa != null) {
			setMaXa(maXa);
		}

		String maTinh = (String)attributes.get("maTinh");

		if (maTinh != null) {
			setMaTinh(maTinh);
		}

		String maHuyen = (String)attributes.get("maHuyen");

		if (maHuyen != null) {
			setMaHuyen(maHuyen);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer tongSoHGD = (Integer)attributes.get("tongSoHGD");

		if (tongSoHGD != null) {
			setTongSoHGD(tongSoHGD);
		}

		Integer soMauNgauNhien = (Integer)attributes.get("soMauNgauNhien");

		if (soMauNgauNhien != null) {
			setSoMauNgauNhien(soMauNgauNhien);
		}

		Integer soMauDuPhong = (Integer)attributes.get("soMauDuPhong");

		if (soMauDuPhong != null) {
			setSoMauDuPhong(soMauDuPhong);
		}

		Integer tongSoMau = (Integer)attributes.get("tongSoMau");

		if (tongSoMau != null) {
			setTongSoMau(tongSoMau);
		}

		Integer soMauHVS = (Integer)attributes.get("soMauHVS");

		if (soMauHVS != null) {
			setSoMauHVS(soMauHVS);
		}

		Integer soMauCoNhaTieu = (Integer)attributes.get("soMauCoNhaTieu");

		if (soMauCoNhaTieu != null) {
			setSoMauCoNhaTieu(soMauCoNhaTieu);
		}

		Integer soMauKiemDem = (Integer)attributes.get("soMauKiemDem");

		if (soMauKiemDem != null) {
			setSoMauKiemDem(soMauKiemDem);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	/**
	* Returns the primary key of this m a u k i e m d e m.
	*
	* @return the primary key of this m a u k i e m d e m
	*/
	@Override
	public long getPrimaryKey() {
		return _maukiemdem.getPrimaryKey();
	}

	/**
	* Sets the primary key of this m a u k i e m d e m.
	*
	* @param primaryKey the primary key of this m a u k i e m d e m
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_maukiemdem.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this m a u k i e m d e m.
	*
	* @return the ID of this m a u k i e m d e m
	*/
	@Override
	public long getId() {
		return _maukiemdem.getId();
	}

	/**
	* Sets the ID of this m a u k i e m d e m.
	*
	* @param id the ID of this m a u k i e m d e m
	*/
	@Override
	public void setId(long id) {
		_maukiemdem.setId(id);
	}

	/**
	* Returns the ma xa of this m a u k i e m d e m.
	*
	* @return the ma xa of this m a u k i e m d e m
	*/
	@Override
	public java.lang.String getMaXa() {
		return _maukiemdem.getMaXa();
	}

	/**
	* Sets the ma xa of this m a u k i e m d e m.
	*
	* @param maXa the ma xa of this m a u k i e m d e m
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_maukiemdem.setMaXa(maXa);
	}

	/**
	* Returns the ma tinh of this m a u k i e m d e m.
	*
	* @return the ma tinh of this m a u k i e m d e m
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _maukiemdem.getMaTinh();
	}

	/**
	* Sets the ma tinh of this m a u k i e m d e m.
	*
	* @param maTinh the ma tinh of this m a u k i e m d e m
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_maukiemdem.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this m a u k i e m d e m.
	*
	* @return the ma huyen of this m a u k i e m d e m
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _maukiemdem.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this m a u k i e m d e m.
	*
	* @param maHuyen the ma huyen of this m a u k i e m d e m
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_maukiemdem.setMaHuyen(maHuyen);
	}

	/**
	* Returns the nam of this m a u k i e m d e m.
	*
	* @return the nam of this m a u k i e m d e m
	*/
	@Override
	public int getNam() {
		return _maukiemdem.getNam();
	}

	/**
	* Sets the nam of this m a u k i e m d e m.
	*
	* @param nam the nam of this m a u k i e m d e m
	*/
	@Override
	public void setNam(int nam) {
		_maukiemdem.setNam(nam);
	}

	/**
	* Returns the tong so h g d of this m a u k i e m d e m.
	*
	* @return the tong so h g d of this m a u k i e m d e m
	*/
	@Override
	public int getTongSoHGD() {
		return _maukiemdem.getTongSoHGD();
	}

	/**
	* Sets the tong so h g d of this m a u k i e m d e m.
	*
	* @param tongSoHGD the tong so h g d of this m a u k i e m d e m
	*/
	@Override
	public void setTongSoHGD(int tongSoHGD) {
		_maukiemdem.setTongSoHGD(tongSoHGD);
	}

	/**
	* Returns the so mau ngau nhien of this m a u k i e m d e m.
	*
	* @return the so mau ngau nhien of this m a u k i e m d e m
	*/
	@Override
	public int getSoMauNgauNhien() {
		return _maukiemdem.getSoMauNgauNhien();
	}

	/**
	* Sets the so mau ngau nhien of this m a u k i e m d e m.
	*
	* @param soMauNgauNhien the so mau ngau nhien of this m a u k i e m d e m
	*/
	@Override
	public void setSoMauNgauNhien(int soMauNgauNhien) {
		_maukiemdem.setSoMauNgauNhien(soMauNgauNhien);
	}

	/**
	* Returns the so mau du phong of this m a u k i e m d e m.
	*
	* @return the so mau du phong of this m a u k i e m d e m
	*/
	@Override
	public int getSoMauDuPhong() {
		return _maukiemdem.getSoMauDuPhong();
	}

	/**
	* Sets the so mau du phong of this m a u k i e m d e m.
	*
	* @param soMauDuPhong the so mau du phong of this m a u k i e m d e m
	*/
	@Override
	public void setSoMauDuPhong(int soMauDuPhong) {
		_maukiemdem.setSoMauDuPhong(soMauDuPhong);
	}

	/**
	* Returns the tong so mau of this m a u k i e m d e m.
	*
	* @return the tong so mau of this m a u k i e m d e m
	*/
	@Override
	public int getTongSoMau() {
		return _maukiemdem.getTongSoMau();
	}

	/**
	* Sets the tong so mau of this m a u k i e m d e m.
	*
	* @param tongSoMau the tong so mau of this m a u k i e m d e m
	*/
	@Override
	public void setTongSoMau(int tongSoMau) {
		_maukiemdem.setTongSoMau(tongSoMau);
	}

	/**
	* Returns the so mau h v s of this m a u k i e m d e m.
	*
	* @return the so mau h v s of this m a u k i e m d e m
	*/
	@Override
	public int getSoMauHVS() {
		return _maukiemdem.getSoMauHVS();
	}

	/**
	* Sets the so mau h v s of this m a u k i e m d e m.
	*
	* @param soMauHVS the so mau h v s of this m a u k i e m d e m
	*/
	@Override
	public void setSoMauHVS(int soMauHVS) {
		_maukiemdem.setSoMauHVS(soMauHVS);
	}

	/**
	* Returns the so mau co nha tieu of this m a u k i e m d e m.
	*
	* @return the so mau co nha tieu of this m a u k i e m d e m
	*/
	@Override
	public int getSoMauCoNhaTieu() {
		return _maukiemdem.getSoMauCoNhaTieu();
	}

	/**
	* Sets the so mau co nha tieu of this m a u k i e m d e m.
	*
	* @param soMauCoNhaTieu the so mau co nha tieu of this m a u k i e m d e m
	*/
	@Override
	public void setSoMauCoNhaTieu(int soMauCoNhaTieu) {
		_maukiemdem.setSoMauCoNhaTieu(soMauCoNhaTieu);
	}

	/**
	* Returns the so mau kiem dem of this m a u k i e m d e m.
	*
	* @return the so mau kiem dem of this m a u k i e m d e m
	*/
	@Override
	public int getSoMauKiemDem() {
		return _maukiemdem.getSoMauKiemDem();
	}

	/**
	* Sets the so mau kiem dem of this m a u k i e m d e m.
	*
	* @param soMauKiemDem the so mau kiem dem of this m a u k i e m d e m
	*/
	@Override
	public void setSoMauKiemDem(int soMauKiemDem) {
		_maukiemdem.setSoMauKiemDem(soMauKiemDem);
	}

	/**
	* Returns the ngay tao of this m a u k i e m d e m.
	*
	* @return the ngay tao of this m a u k i e m d e m
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _maukiemdem.getNgayTao();
	}

	/**
	* Sets the ngay tao of this m a u k i e m d e m.
	*
	* @param ngayTao the ngay tao of this m a u k i e m d e m
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_maukiemdem.setNgayTao(ngayTao);
	}

	/**
	* Returns the user ID of this m a u k i e m d e m.
	*
	* @return the user ID of this m a u k i e m d e m
	*/
	@Override
	public long getUserId() {
		return _maukiemdem.getUserId();
	}

	/**
	* Sets the user ID of this m a u k i e m d e m.
	*
	* @param userId the user ID of this m a u k i e m d e m
	*/
	@Override
	public void setUserId(long userId) {
		_maukiemdem.setUserId(userId);
	}

	/**
	* Returns the user uuid of this m a u k i e m d e m.
	*
	* @return the user uuid of this m a u k i e m d e m
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _maukiemdem.getUserUuid();
	}

	/**
	* Sets the user uuid of this m a u k i e m d e m.
	*
	* @param userUuid the user uuid of this m a u k i e m d e m
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_maukiemdem.setUserUuid(userUuid);
	}

	@Override
	public boolean isNew() {
		return _maukiemdem.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_maukiemdem.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _maukiemdem.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_maukiemdem.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _maukiemdem.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _maukiemdem.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_maukiemdem.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _maukiemdem.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_maukiemdem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_maukiemdem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_maukiemdem.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MAUKIEMDEMWrapper((MAUKIEMDEM)_maukiemdem.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM maukiemdem) {
		return _maukiemdem.compareTo(maukiemdem);
	}

	@Override
	public int hashCode() {
		return _maukiemdem.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM> toCacheModel() {
		return _maukiemdem.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM toEscapedModel() {
		return new MAUKIEMDEMWrapper(_maukiemdem.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM toUnescapedModel() {
		return new MAUKIEMDEMWrapper(_maukiemdem.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _maukiemdem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _maukiemdem.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_maukiemdem.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MAUKIEMDEMWrapper)) {
			return false;
		}

		MAUKIEMDEMWrapper maukiemdemWrapper = (MAUKIEMDEMWrapper)obj;

		if (Validator.equals(_maukiemdem, maukiemdemWrapper._maukiemdem)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MAUKIEMDEM getWrappedMAUKIEMDEM() {
		return _maukiemdem;
	}

	@Override
	public MAUKIEMDEM getWrappedModel() {
		return _maukiemdem;
	}

	@Override
	public void resetOriginalValues() {
		_maukiemdem.resetOriginalValues();
	}

	private MAUKIEMDEM _maukiemdem;
}