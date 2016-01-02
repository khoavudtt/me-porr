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

package vn.dtt.sol.ns.danhgiavesinh.dao.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DANHGIAVESINHXA}.
 * </p>
 *
 * @author khoa.vu
 * @see DANHGIAVESINHXA
 * @generated
 */
public class DANHGIAVESINHXAWrapper implements DANHGIAVESINHXA,
	ModelWrapper<DANHGIAVESINHXA> {
	public DANHGIAVESINHXAWrapper(DANHGIAVESINHXA danhgiavesinhxa) {
		_danhgiavesinhxa = danhgiavesinhxa;
	}

	@Override
	public Class<?> getModelClass() {
		return DANHGIAVESINHXA.class;
	}

	@Override
	public String getModelClassName() {
		return DANHGIAVESINHXA.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maXa", getMaXa());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("nam", getNam());
		attributes.put("soDan", getSoDan());
		attributes.put("tiLeHGDCoNhaTieu", getTiLeHGDCoNhaTieu());
		attributes.put("tiLeHGDCoNhaTieuHVS", getTiLeHGDCoNhaTieuHVS());
		attributes.put("tiLeTruongHocHVS", getTiLeTruongHocHVS());
		attributes.put("tiLeTramYTeHVS", getTiLeTramYTeHVS());
		attributes.put("ketLuanVSTX", getKetLuanVSTX());
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

		Integer soDan = (Integer)attributes.get("soDan");

		if (soDan != null) {
			setSoDan(soDan);
		}

		Integer tiLeHGDCoNhaTieu = (Integer)attributes.get("tiLeHGDCoNhaTieu");

		if (tiLeHGDCoNhaTieu != null) {
			setTiLeHGDCoNhaTieu(tiLeHGDCoNhaTieu);
		}

		Integer tiLeHGDCoNhaTieuHVS = (Integer)attributes.get(
				"tiLeHGDCoNhaTieuHVS");

		if (tiLeHGDCoNhaTieuHVS != null) {
			setTiLeHGDCoNhaTieuHVS(tiLeHGDCoNhaTieuHVS);
		}

		Integer tiLeTruongHocHVS = (Integer)attributes.get("tiLeTruongHocHVS");

		if (tiLeTruongHocHVS != null) {
			setTiLeTruongHocHVS(tiLeTruongHocHVS);
		}

		Integer tiLeTramYTeHVS = (Integer)attributes.get("tiLeTramYTeHVS");

		if (tiLeTramYTeHVS != null) {
			setTiLeTramYTeHVS(tiLeTramYTeHVS);
		}

		Integer ketLuanVSTX = (Integer)attributes.get("ketLuanVSTX");

		if (ketLuanVSTX != null) {
			setKetLuanVSTX(ketLuanVSTX);
		}

		Long ghiChu = (Long)attributes.get("ghiChu");

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

		Long idNguoiTao = (Long)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}
	}

	/**
	* Returns the primary key of this d a n h g i a v e s i n h x a.
	*
	* @return the primary key of this d a n h g i a v e s i n h x a
	*/
	@Override
	public long getPrimaryKey() {
		return _danhgiavesinhxa.getPrimaryKey();
	}

	/**
	* Sets the primary key of this d a n h g i a v e s i n h x a.
	*
	* @param primaryKey the primary key of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_danhgiavesinhxa.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this d a n h g i a v e s i n h x a.
	*
	* @return the ID of this d a n h g i a v e s i n h x a
	*/
	@Override
	public long getId() {
		return _danhgiavesinhxa.getId();
	}

	/**
	* Sets the ID of this d a n h g i a v e s i n h x a.
	*
	* @param id the ID of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setId(long id) {
		_danhgiavesinhxa.setId(id);
	}

	/**
	* Returns the ma xa of this d a n h g i a v e s i n h x a.
	*
	* @return the ma xa of this d a n h g i a v e s i n h x a
	*/
	@Override
	public java.lang.String getMaXa() {
		return _danhgiavesinhxa.getMaXa();
	}

	/**
	* Sets the ma xa of this d a n h g i a v e s i n h x a.
	*
	* @param maXa the ma xa of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_danhgiavesinhxa.setMaXa(maXa);
	}

	/**
	* Returns the ma tinh of this d a n h g i a v e s i n h x a.
	*
	* @return the ma tinh of this d a n h g i a v e s i n h x a
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _danhgiavesinhxa.getMaTinh();
	}

	/**
	* Sets the ma tinh of this d a n h g i a v e s i n h x a.
	*
	* @param maTinh the ma tinh of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_danhgiavesinhxa.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this d a n h g i a v e s i n h x a.
	*
	* @return the ma huyen of this d a n h g i a v e s i n h x a
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _danhgiavesinhxa.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this d a n h g i a v e s i n h x a.
	*
	* @param maHuyen the ma huyen of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_danhgiavesinhxa.setMaHuyen(maHuyen);
	}

	/**
	* Returns the nam of this d a n h g i a v e s i n h x a.
	*
	* @return the nam of this d a n h g i a v e s i n h x a
	*/
	@Override
	public int getNam() {
		return _danhgiavesinhxa.getNam();
	}

	/**
	* Sets the nam of this d a n h g i a v e s i n h x a.
	*
	* @param nam the nam of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setNam(int nam) {
		_danhgiavesinhxa.setNam(nam);
	}

	/**
	* Returns the so dan of this d a n h g i a v e s i n h x a.
	*
	* @return the so dan of this d a n h g i a v e s i n h x a
	*/
	@Override
	public int getSoDan() {
		return _danhgiavesinhxa.getSoDan();
	}

	/**
	* Sets the so dan of this d a n h g i a v e s i n h x a.
	*
	* @param soDan the so dan of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setSoDan(int soDan) {
		_danhgiavesinhxa.setSoDan(soDan);
	}

	/**
	* Returns the ti le h g d co nha tieu of this d a n h g i a v e s i n h x a.
	*
	* @return the ti le h g d co nha tieu of this d a n h g i a v e s i n h x a
	*/
	@Override
	public int getTiLeHGDCoNhaTieu() {
		return _danhgiavesinhxa.getTiLeHGDCoNhaTieu();
	}

	/**
	* Sets the ti le h g d co nha tieu of this d a n h g i a v e s i n h x a.
	*
	* @param tiLeHGDCoNhaTieu the ti le h g d co nha tieu of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setTiLeHGDCoNhaTieu(int tiLeHGDCoNhaTieu) {
		_danhgiavesinhxa.setTiLeHGDCoNhaTieu(tiLeHGDCoNhaTieu);
	}

	/**
	* Returns the ti le h g d co nha tieu h v s of this d a n h g i a v e s i n h x a.
	*
	* @return the ti le h g d co nha tieu h v s of this d a n h g i a v e s i n h x a
	*/
	@Override
	public int getTiLeHGDCoNhaTieuHVS() {
		return _danhgiavesinhxa.getTiLeHGDCoNhaTieuHVS();
	}

	/**
	* Sets the ti le h g d co nha tieu h v s of this d a n h g i a v e s i n h x a.
	*
	* @param tiLeHGDCoNhaTieuHVS the ti le h g d co nha tieu h v s of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setTiLeHGDCoNhaTieuHVS(int tiLeHGDCoNhaTieuHVS) {
		_danhgiavesinhxa.setTiLeHGDCoNhaTieuHVS(tiLeHGDCoNhaTieuHVS);
	}

	/**
	* Returns the ti le truong hoc h v s of this d a n h g i a v e s i n h x a.
	*
	* @return the ti le truong hoc h v s of this d a n h g i a v e s i n h x a
	*/
	@Override
	public int getTiLeTruongHocHVS() {
		return _danhgiavesinhxa.getTiLeTruongHocHVS();
	}

	/**
	* Sets the ti le truong hoc h v s of this d a n h g i a v e s i n h x a.
	*
	* @param tiLeTruongHocHVS the ti le truong hoc h v s of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setTiLeTruongHocHVS(int tiLeTruongHocHVS) {
		_danhgiavesinhxa.setTiLeTruongHocHVS(tiLeTruongHocHVS);
	}

	/**
	* Returns the ti le tram y te h v s of this d a n h g i a v e s i n h x a.
	*
	* @return the ti le tram y te h v s of this d a n h g i a v e s i n h x a
	*/
	@Override
	public int getTiLeTramYTeHVS() {
		return _danhgiavesinhxa.getTiLeTramYTeHVS();
	}

	/**
	* Sets the ti le tram y te h v s of this d a n h g i a v e s i n h x a.
	*
	* @param tiLeTramYTeHVS the ti le tram y te h v s of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setTiLeTramYTeHVS(int tiLeTramYTeHVS) {
		_danhgiavesinhxa.setTiLeTramYTeHVS(tiLeTramYTeHVS);
	}

	/**
	* Returns the ket luan v s t x of this d a n h g i a v e s i n h x a.
	*
	* @return the ket luan v s t x of this d a n h g i a v e s i n h x a
	*/
	@Override
	public int getKetLuanVSTX() {
		return _danhgiavesinhxa.getKetLuanVSTX();
	}

	/**
	* Sets the ket luan v s t x of this d a n h g i a v e s i n h x a.
	*
	* @param ketLuanVSTX the ket luan v s t x of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setKetLuanVSTX(int ketLuanVSTX) {
		_danhgiavesinhxa.setKetLuanVSTX(ketLuanVSTX);
	}

	/**
	* Returns the ghi chu of this d a n h g i a v e s i n h x a.
	*
	* @return the ghi chu of this d a n h g i a v e s i n h x a
	*/
	@Override
	public long getGhiChu() {
		return _danhgiavesinhxa.getGhiChu();
	}

	/**
	* Sets the ghi chu of this d a n h g i a v e s i n h x a.
	*
	* @param ghiChu the ghi chu of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setGhiChu(long ghiChu) {
		_danhgiavesinhxa.setGhiChu(ghiChu);
	}

	/**
	* Returns the bao cao d l i of this d a n h g i a v e s i n h x a.
	*
	* @return the bao cao d l i of this d a n h g i a v e s i n h x a
	*/
	@Override
	public int getBaoCaoDLI() {
		return _danhgiavesinhxa.getBaoCaoDLI();
	}

	/**
	* Sets the bao cao d l i of this d a n h g i a v e s i n h x a.
	*
	* @param baoCaoDLI the bao cao d l i of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setBaoCaoDLI(int baoCaoDLI) {
		_danhgiavesinhxa.setBaoCaoDLI(baoCaoDLI);
	}

	/**
	* Returns the ngay tao of this d a n h g i a v e s i n h x a.
	*
	* @return the ngay tao of this d a n h g i a v e s i n h x a
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _danhgiavesinhxa.getNgayTao();
	}

	/**
	* Sets the ngay tao of this d a n h g i a v e s i n h x a.
	*
	* @param ngayTao the ngay tao of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_danhgiavesinhxa.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this d a n h g i a v e s i n h x a.
	*
	* @return the id nguoi tao of this d a n h g i a v e s i n h x a
	*/
	@Override
	public long getIdNguoiTao() {
		return _danhgiavesinhxa.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this d a n h g i a v e s i n h x a.
	*
	* @param idNguoiTao the id nguoi tao of this d a n h g i a v e s i n h x a
	*/
	@Override
	public void setIdNguoiTao(long idNguoiTao) {
		_danhgiavesinhxa.setIdNguoiTao(idNguoiTao);
	}

	@Override
	public boolean isNew() {
		return _danhgiavesinhxa.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_danhgiavesinhxa.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _danhgiavesinhxa.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_danhgiavesinhxa.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _danhgiavesinhxa.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _danhgiavesinhxa.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_danhgiavesinhxa.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _danhgiavesinhxa.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_danhgiavesinhxa.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_danhgiavesinhxa.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_danhgiavesinhxa.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DANHGIAVESINHXAWrapper((DANHGIAVESINHXA)_danhgiavesinhxa.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.danhgiavesinh.dao.model.DANHGIAVESINHXA danhgiavesinhxa) {
		return _danhgiavesinhxa.compareTo(danhgiavesinhxa);
	}

	@Override
	public int hashCode() {
		return _danhgiavesinhxa.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.danhgiavesinh.dao.model.DANHGIAVESINHXA> toCacheModel() {
		return _danhgiavesinhxa.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.danhgiavesinh.dao.model.DANHGIAVESINHXA toEscapedModel() {
		return new DANHGIAVESINHXAWrapper(_danhgiavesinhxa.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.danhgiavesinh.dao.model.DANHGIAVESINHXA toUnescapedModel() {
		return new DANHGIAVESINHXAWrapper(_danhgiavesinhxa.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _danhgiavesinhxa.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _danhgiavesinhxa.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_danhgiavesinhxa.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DANHGIAVESINHXAWrapper)) {
			return false;
		}

		DANHGIAVESINHXAWrapper danhgiavesinhxaWrapper = (DANHGIAVESINHXAWrapper)obj;

		if (Validator.equals(_danhgiavesinhxa,
					danhgiavesinhxaWrapper._danhgiavesinhxa)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DANHGIAVESINHXA getWrappedDANHGIAVESINHXA() {
		return _danhgiavesinhxa;
	}

	@Override
	public DANHGIAVESINHXA getWrappedModel() {
		return _danhgiavesinhxa;
	}

	@Override
	public void resetOriginalValues() {
		_danhgiavesinhxa.resetOriginalValues();
	}

	private DANHGIAVESINHXA _danhgiavesinhxa;
}