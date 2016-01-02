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

package vn.dtt.sol.ns.baocaodli.dao.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BaoCaoDLI}.
 * </p>
 *
 * @author HuyMQ
 * @see BaoCaoDLI
 * @generated
 */
public class BaoCaoDLIWrapper implements BaoCaoDLI, ModelWrapper<BaoCaoDLI> {
	public BaoCaoDLIWrapper(BaoCaoDLI baoCaoDLI) {
		_baoCaoDLI = baoCaoDLI;
	}

	@Override
	public Class<?> getModelClass() {
		return BaoCaoDLI.class;
	}

	@Override
	public String getModelClassName() {
		return BaoCaoDLI.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("nam", getNam());
		attributes.put("loaiBaoCao", getLoaiBaoCao());
		attributes.put("nguoiLap", getNguoiLap());
		attributes.put("nguoiDuyet", getNguoiDuyet());
		attributes.put("soBaoCao", getSoBaoCao());
		attributes.put("ngayBaoCao", getNgayBaoCao());
		attributes.put("trangThai", getTrangThai());
		attributes.put("luuTruPDF1Id", getLuuTruPDF1Id());
		attributes.put("luuTruPDF2Id", getLuuTruPDF2Id());
		attributes.put("luuTruCSV1Id", getLuuTruCSV1Id());
		attributes.put("luuTruCSV2Id", getLuuTruCSV2Id());

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

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer loaiBaoCao = (Integer)attributes.get("loaiBaoCao");

		if (loaiBaoCao != null) {
			setLoaiBaoCao(loaiBaoCao);
		}

		String nguoiLap = (String)attributes.get("nguoiLap");

		if (nguoiLap != null) {
			setNguoiLap(nguoiLap);
		}

		String nguoiDuyet = (String)attributes.get("nguoiDuyet");

		if (nguoiDuyet != null) {
			setNguoiDuyet(nguoiDuyet);
		}

		String soBaoCao = (String)attributes.get("soBaoCao");

		if (soBaoCao != null) {
			setSoBaoCao(soBaoCao);
		}

		Date ngayBaoCao = (Date)attributes.get("ngayBaoCao");

		if (ngayBaoCao != null) {
			setNgayBaoCao(ngayBaoCao);
		}

		Integer trangThai = (Integer)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long luuTruPDF1Id = (Long)attributes.get("luuTruPDF1Id");

		if (luuTruPDF1Id != null) {
			setLuuTruPDF1Id(luuTruPDF1Id);
		}

		Long luuTruPDF2Id = (Long)attributes.get("luuTruPDF2Id");

		if (luuTruPDF2Id != null) {
			setLuuTruPDF2Id(luuTruPDF2Id);
		}

		Long luuTruCSV1Id = (Long)attributes.get("luuTruCSV1Id");

		if (luuTruCSV1Id != null) {
			setLuuTruCSV1Id(luuTruCSV1Id);
		}

		Long luuTruCSV2Id = (Long)attributes.get("luuTruCSV2Id");

		if (luuTruCSV2Id != null) {
			setLuuTruCSV2Id(luuTruCSV2Id);
		}
	}

	/**
	* Returns the primary key of this bao cao d l i.
	*
	* @return the primary key of this bao cao d l i
	*/
	@Override
	public long getPrimaryKey() {
		return _baoCaoDLI.getPrimaryKey();
	}

	/**
	* Sets the primary key of this bao cao d l i.
	*
	* @param primaryKey the primary key of this bao cao d l i
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_baoCaoDLI.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this bao cao d l i.
	*
	* @return the ID of this bao cao d l i
	*/
	@Override
	public long getId() {
		return _baoCaoDLI.getId();
	}

	/**
	* Sets the ID of this bao cao d l i.
	*
	* @param id the ID of this bao cao d l i
	*/
	@Override
	public void setId(long id) {
		_baoCaoDLI.setId(id);
	}

	/**
	* Returns the ma tinh of this bao cao d l i.
	*
	* @return the ma tinh of this bao cao d l i
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _baoCaoDLI.getMaTinh();
	}

	/**
	* Sets the ma tinh of this bao cao d l i.
	*
	* @param maTinh the ma tinh of this bao cao d l i
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_baoCaoDLI.setMaTinh(maTinh);
	}

	/**
	* Returns the nam of this bao cao d l i.
	*
	* @return the nam of this bao cao d l i
	*/
	@Override
	public int getNam() {
		return _baoCaoDLI.getNam();
	}

	/**
	* Sets the nam of this bao cao d l i.
	*
	* @param nam the nam of this bao cao d l i
	*/
	@Override
	public void setNam(int nam) {
		_baoCaoDLI.setNam(nam);
	}

	/**
	* Returns the loai bao cao of this bao cao d l i.
	*
	* @return the loai bao cao of this bao cao d l i
	*/
	@Override
	public int getLoaiBaoCao() {
		return _baoCaoDLI.getLoaiBaoCao();
	}

	/**
	* Sets the loai bao cao of this bao cao d l i.
	*
	* @param loaiBaoCao the loai bao cao of this bao cao d l i
	*/
	@Override
	public void setLoaiBaoCao(int loaiBaoCao) {
		_baoCaoDLI.setLoaiBaoCao(loaiBaoCao);
	}

	/**
	* Returns the nguoi lap of this bao cao d l i.
	*
	* @return the nguoi lap of this bao cao d l i
	*/
	@Override
	public java.lang.String getNguoiLap() {
		return _baoCaoDLI.getNguoiLap();
	}

	/**
	* Sets the nguoi lap of this bao cao d l i.
	*
	* @param nguoiLap the nguoi lap of this bao cao d l i
	*/
	@Override
	public void setNguoiLap(java.lang.String nguoiLap) {
		_baoCaoDLI.setNguoiLap(nguoiLap);
	}

	/**
	* Returns the nguoi duyet of this bao cao d l i.
	*
	* @return the nguoi duyet of this bao cao d l i
	*/
	@Override
	public java.lang.String getNguoiDuyet() {
		return _baoCaoDLI.getNguoiDuyet();
	}

	/**
	* Sets the nguoi duyet of this bao cao d l i.
	*
	* @param nguoiDuyet the nguoi duyet of this bao cao d l i
	*/
	@Override
	public void setNguoiDuyet(java.lang.String nguoiDuyet) {
		_baoCaoDLI.setNguoiDuyet(nguoiDuyet);
	}

	/**
	* Returns the so bao cao of this bao cao d l i.
	*
	* @return the so bao cao of this bao cao d l i
	*/
	@Override
	public java.lang.String getSoBaoCao() {
		return _baoCaoDLI.getSoBaoCao();
	}

	/**
	* Sets the so bao cao of this bao cao d l i.
	*
	* @param soBaoCao the so bao cao of this bao cao d l i
	*/
	@Override
	public void setSoBaoCao(java.lang.String soBaoCao) {
		_baoCaoDLI.setSoBaoCao(soBaoCao);
	}

	/**
	* Returns the ngay bao cao of this bao cao d l i.
	*
	* @return the ngay bao cao of this bao cao d l i
	*/
	@Override
	public java.util.Date getNgayBaoCao() {
		return _baoCaoDLI.getNgayBaoCao();
	}

	/**
	* Sets the ngay bao cao of this bao cao d l i.
	*
	* @param ngayBaoCao the ngay bao cao of this bao cao d l i
	*/
	@Override
	public void setNgayBaoCao(java.util.Date ngayBaoCao) {
		_baoCaoDLI.setNgayBaoCao(ngayBaoCao);
	}

	/**
	* Returns the trang thai of this bao cao d l i.
	*
	* @return the trang thai of this bao cao d l i
	*/
	@Override
	public int getTrangThai() {
		return _baoCaoDLI.getTrangThai();
	}

	/**
	* Sets the trang thai of this bao cao d l i.
	*
	* @param trangThai the trang thai of this bao cao d l i
	*/
	@Override
	public void setTrangThai(int trangThai) {
		_baoCaoDLI.setTrangThai(trangThai);
	}

	/**
	* Returns the luu tru p d f1 ID of this bao cao d l i.
	*
	* @return the luu tru p d f1 ID of this bao cao d l i
	*/
	@Override
	public long getLuuTruPDF1Id() {
		return _baoCaoDLI.getLuuTruPDF1Id();
	}

	/**
	* Sets the luu tru p d f1 ID of this bao cao d l i.
	*
	* @param luuTruPDF1Id the luu tru p d f1 ID of this bao cao d l i
	*/
	@Override
	public void setLuuTruPDF1Id(long luuTruPDF1Id) {
		_baoCaoDLI.setLuuTruPDF1Id(luuTruPDF1Id);
	}

	/**
	* Returns the luu tru p d f2 ID of this bao cao d l i.
	*
	* @return the luu tru p d f2 ID of this bao cao d l i
	*/
	@Override
	public long getLuuTruPDF2Id() {
		return _baoCaoDLI.getLuuTruPDF2Id();
	}

	/**
	* Sets the luu tru p d f2 ID of this bao cao d l i.
	*
	* @param luuTruPDF2Id the luu tru p d f2 ID of this bao cao d l i
	*/
	@Override
	public void setLuuTruPDF2Id(long luuTruPDF2Id) {
		_baoCaoDLI.setLuuTruPDF2Id(luuTruPDF2Id);
	}

	/**
	* Returns the luu tru c s v1 ID of this bao cao d l i.
	*
	* @return the luu tru c s v1 ID of this bao cao d l i
	*/
	@Override
	public long getLuuTruCSV1Id() {
		return _baoCaoDLI.getLuuTruCSV1Id();
	}

	/**
	* Sets the luu tru c s v1 ID of this bao cao d l i.
	*
	* @param luuTruCSV1Id the luu tru c s v1 ID of this bao cao d l i
	*/
	@Override
	public void setLuuTruCSV1Id(long luuTruCSV1Id) {
		_baoCaoDLI.setLuuTruCSV1Id(luuTruCSV1Id);
	}

	/**
	* Returns the luu tru c s v2 ID of this bao cao d l i.
	*
	* @return the luu tru c s v2 ID of this bao cao d l i
	*/
	@Override
	public long getLuuTruCSV2Id() {
		return _baoCaoDLI.getLuuTruCSV2Id();
	}

	/**
	* Sets the luu tru c s v2 ID of this bao cao d l i.
	*
	* @param luuTruCSV2Id the luu tru c s v2 ID of this bao cao d l i
	*/
	@Override
	public void setLuuTruCSV2Id(long luuTruCSV2Id) {
		_baoCaoDLI.setLuuTruCSV2Id(luuTruCSV2Id);
	}

	@Override
	public boolean isNew() {
		return _baoCaoDLI.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_baoCaoDLI.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _baoCaoDLI.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_baoCaoDLI.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _baoCaoDLI.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _baoCaoDLI.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_baoCaoDLI.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _baoCaoDLI.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_baoCaoDLI.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_baoCaoDLI.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_baoCaoDLI.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BaoCaoDLIWrapper((BaoCaoDLI)_baoCaoDLI.clone());
	}

	@Override
	public int compareTo(vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI baoCaoDLI) {
		return _baoCaoDLI.compareTo(baoCaoDLI);
	}

	@Override
	public int hashCode() {
		return _baoCaoDLI.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> toCacheModel() {
		return _baoCaoDLI.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI toEscapedModel() {
		return new BaoCaoDLIWrapper(_baoCaoDLI.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI toUnescapedModel() {
		return new BaoCaoDLIWrapper(_baoCaoDLI.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _baoCaoDLI.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _baoCaoDLI.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_baoCaoDLI.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BaoCaoDLIWrapper)) {
			return false;
		}

		BaoCaoDLIWrapper baoCaoDLIWrapper = (BaoCaoDLIWrapper)obj;

		if (Validator.equals(_baoCaoDLI, baoCaoDLIWrapper._baoCaoDLI)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BaoCaoDLI getWrappedBaoCaoDLI() {
		return _baoCaoDLI;
	}

	@Override
	public BaoCaoDLI getWrappedModel() {
		return _baoCaoDLI;
	}

	@Override
	public void resetOriginalValues() {
		_baoCaoDLI.resetOriginalValues();
	}

	private BaoCaoDLI _baoCaoDLI;
}