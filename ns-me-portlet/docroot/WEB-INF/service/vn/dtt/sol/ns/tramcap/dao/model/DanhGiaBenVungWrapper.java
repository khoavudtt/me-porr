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
 * This class is a wrapper for {@link DanhGiaBenVung}.
 * </p>
 *
 * @author khoa.vu
 * @see DanhGiaBenVung
 * @generated
 */
public class DanhGiaBenVungWrapper implements DanhGiaBenVung,
	ModelWrapper<DanhGiaBenVung> {
	public DanhGiaBenVungWrapper(DanhGiaBenVung danhGiaBenVung) {
		_danhGiaBenVung = danhGiaBenVung;
	}

	@Override
	public Class<?> getModelClass() {
		return DanhGiaBenVung.class;
	}

	@Override
	public String getModelClassName() {
		return DanhGiaBenVung.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tramCapNuocId", getTramCapNuocId());
		attributes.put("nam", getNam());
		attributes.put("trangThaiCapNuoc", getTrangThaiCapNuoc());
		attributes.put("congXuatThucTe", getCongXuatThucTe());
		attributes.put("tongDauNoiMoi", getTongDauNoiMoi());
		attributes.put("tongDauNoiThucTe", getTongDauNoiThucTe());
		attributes.put("soNguoiCapThucTe", getSoNguoiCapThucTe());
		attributes.put("nuocThatThoat", getNuocThatThoat());
		attributes.put("nuocDatTieuChuan", getNuocDatTieuChuan());
		attributes.put("nuocCoAsen", getNuocCoAsen());
		attributes.put("tongChiPhi", getTongChiPhi());
		attributes.put("tongDoanhThu", getTongDoanhThu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("ketQuaDanhGia", getKetQuaDanhGia());
		attributes.put("baoCaoDLI", getBaoCaoDLI());

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

		Integer trangThaiCapNuoc = (Integer)attributes.get("trangThaiCapNuoc");

		if (trangThaiCapNuoc != null) {
			setTrangThaiCapNuoc(trangThaiCapNuoc);
		}

		Integer congXuatThucTe = (Integer)attributes.get("congXuatThucTe");

		if (congXuatThucTe != null) {
			setCongXuatThucTe(congXuatThucTe);
		}

		Integer tongDauNoiMoi = (Integer)attributes.get("tongDauNoiMoi");

		if (tongDauNoiMoi != null) {
			setTongDauNoiMoi(tongDauNoiMoi);
		}

		Integer tongDauNoiThucTe = (Integer)attributes.get("tongDauNoiThucTe");

		if (tongDauNoiThucTe != null) {
			setTongDauNoiThucTe(tongDauNoiThucTe);
		}

		Integer soNguoiCapThucTe = (Integer)attributes.get("soNguoiCapThucTe");

		if (soNguoiCapThucTe != null) {
			setSoNguoiCapThucTe(soNguoiCapThucTe);
		}

		Integer nuocThatThoat = (Integer)attributes.get("nuocThatThoat");

		if (nuocThatThoat != null) {
			setNuocThatThoat(nuocThatThoat);
		}

		Integer nuocDatTieuChuan = (Integer)attributes.get("nuocDatTieuChuan");

		if (nuocDatTieuChuan != null) {
			setNuocDatTieuChuan(nuocDatTieuChuan);
		}

		Integer nuocCoAsen = (Integer)attributes.get("nuocCoAsen");

		if (nuocCoAsen != null) {
			setNuocCoAsen(nuocCoAsen);
		}

		Integer tongChiPhi = (Integer)attributes.get("tongChiPhi");

		if (tongChiPhi != null) {
			setTongChiPhi(tongChiPhi);
		}

		Integer tongDoanhThu = (Integer)attributes.get("tongDoanhThu");

		if (tongDoanhThu != null) {
			setTongDoanhThu(tongDoanhThu);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Integer idNguoiTao = (Integer)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Integer ketQuaDanhGia = (Integer)attributes.get("ketQuaDanhGia");

		if (ketQuaDanhGia != null) {
			setKetQuaDanhGia(ketQuaDanhGia);
		}

		Integer baoCaoDLI = (Integer)attributes.get("baoCaoDLI");

		if (baoCaoDLI != null) {
			setBaoCaoDLI(baoCaoDLI);
		}
	}

	/**
	* Returns the primary key of this danh gia ben vung.
	*
	* @return the primary key of this danh gia ben vung
	*/
	@Override
	public long getPrimaryKey() {
		return _danhGiaBenVung.getPrimaryKey();
	}

	/**
	* Sets the primary key of this danh gia ben vung.
	*
	* @param primaryKey the primary key of this danh gia ben vung
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_danhGiaBenVung.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this danh gia ben vung.
	*
	* @return the ID of this danh gia ben vung
	*/
	@Override
	public long getId() {
		return _danhGiaBenVung.getId();
	}

	/**
	* Sets the ID of this danh gia ben vung.
	*
	* @param id the ID of this danh gia ben vung
	*/
	@Override
	public void setId(long id) {
		_danhGiaBenVung.setId(id);
	}

	/**
	* Returns the tram cap nuoc ID of this danh gia ben vung.
	*
	* @return the tram cap nuoc ID of this danh gia ben vung
	*/
	@Override
	public int getTramCapNuocId() {
		return _danhGiaBenVung.getTramCapNuocId();
	}

	/**
	* Sets the tram cap nuoc ID of this danh gia ben vung.
	*
	* @param tramCapNuocId the tram cap nuoc ID of this danh gia ben vung
	*/
	@Override
	public void setTramCapNuocId(int tramCapNuocId) {
		_danhGiaBenVung.setTramCapNuocId(tramCapNuocId);
	}

	/**
	* Returns the nam of this danh gia ben vung.
	*
	* @return the nam of this danh gia ben vung
	*/
	@Override
	public int getNam() {
		return _danhGiaBenVung.getNam();
	}

	/**
	* Sets the nam of this danh gia ben vung.
	*
	* @param nam the nam of this danh gia ben vung
	*/
	@Override
	public void setNam(int nam) {
		_danhGiaBenVung.setNam(nam);
	}

	/**
	* Returns the trang thai cap nuoc of this danh gia ben vung.
	*
	* @return the trang thai cap nuoc of this danh gia ben vung
	*/
	@Override
	public int getTrangThaiCapNuoc() {
		return _danhGiaBenVung.getTrangThaiCapNuoc();
	}

	/**
	* Sets the trang thai cap nuoc of this danh gia ben vung.
	*
	* @param trangThaiCapNuoc the trang thai cap nuoc of this danh gia ben vung
	*/
	@Override
	public void setTrangThaiCapNuoc(int trangThaiCapNuoc) {
		_danhGiaBenVung.setTrangThaiCapNuoc(trangThaiCapNuoc);
	}

	/**
	* Returns the cong xuat thuc te of this danh gia ben vung.
	*
	* @return the cong xuat thuc te of this danh gia ben vung
	*/
	@Override
	public int getCongXuatThucTe() {
		return _danhGiaBenVung.getCongXuatThucTe();
	}

	/**
	* Sets the cong xuat thuc te of this danh gia ben vung.
	*
	* @param congXuatThucTe the cong xuat thuc te of this danh gia ben vung
	*/
	@Override
	public void setCongXuatThucTe(int congXuatThucTe) {
		_danhGiaBenVung.setCongXuatThucTe(congXuatThucTe);
	}

	/**
	* Returns the tong dau noi moi of this danh gia ben vung.
	*
	* @return the tong dau noi moi of this danh gia ben vung
	*/
	@Override
	public int getTongDauNoiMoi() {
		return _danhGiaBenVung.getTongDauNoiMoi();
	}

	/**
	* Sets the tong dau noi moi of this danh gia ben vung.
	*
	* @param tongDauNoiMoi the tong dau noi moi of this danh gia ben vung
	*/
	@Override
	public void setTongDauNoiMoi(int tongDauNoiMoi) {
		_danhGiaBenVung.setTongDauNoiMoi(tongDauNoiMoi);
	}

	/**
	* Returns the tong dau noi thuc te of this danh gia ben vung.
	*
	* @return the tong dau noi thuc te of this danh gia ben vung
	*/
	@Override
	public int getTongDauNoiThucTe() {
		return _danhGiaBenVung.getTongDauNoiThucTe();
	}

	/**
	* Sets the tong dau noi thuc te of this danh gia ben vung.
	*
	* @param tongDauNoiThucTe the tong dau noi thuc te of this danh gia ben vung
	*/
	@Override
	public void setTongDauNoiThucTe(int tongDauNoiThucTe) {
		_danhGiaBenVung.setTongDauNoiThucTe(tongDauNoiThucTe);
	}

	/**
	* Returns the so nguoi cap thuc te of this danh gia ben vung.
	*
	* @return the so nguoi cap thuc te of this danh gia ben vung
	*/
	@Override
	public int getSoNguoiCapThucTe() {
		return _danhGiaBenVung.getSoNguoiCapThucTe();
	}

	/**
	* Sets the so nguoi cap thuc te of this danh gia ben vung.
	*
	* @param soNguoiCapThucTe the so nguoi cap thuc te of this danh gia ben vung
	*/
	@Override
	public void setSoNguoiCapThucTe(int soNguoiCapThucTe) {
		_danhGiaBenVung.setSoNguoiCapThucTe(soNguoiCapThucTe);
	}

	/**
	* Returns the nuoc that thoat of this danh gia ben vung.
	*
	* @return the nuoc that thoat of this danh gia ben vung
	*/
	@Override
	public int getNuocThatThoat() {
		return _danhGiaBenVung.getNuocThatThoat();
	}

	/**
	* Sets the nuoc that thoat of this danh gia ben vung.
	*
	* @param nuocThatThoat the nuoc that thoat of this danh gia ben vung
	*/
	@Override
	public void setNuocThatThoat(int nuocThatThoat) {
		_danhGiaBenVung.setNuocThatThoat(nuocThatThoat);
	}

	/**
	* Returns the nuoc dat tieu chuan of this danh gia ben vung.
	*
	* @return the nuoc dat tieu chuan of this danh gia ben vung
	*/
	@Override
	public int getNuocDatTieuChuan() {
		return _danhGiaBenVung.getNuocDatTieuChuan();
	}

	/**
	* Sets the nuoc dat tieu chuan of this danh gia ben vung.
	*
	* @param nuocDatTieuChuan the nuoc dat tieu chuan of this danh gia ben vung
	*/
	@Override
	public void setNuocDatTieuChuan(int nuocDatTieuChuan) {
		_danhGiaBenVung.setNuocDatTieuChuan(nuocDatTieuChuan);
	}

	/**
	* Returns the nuoc co asen of this danh gia ben vung.
	*
	* @return the nuoc co asen of this danh gia ben vung
	*/
	@Override
	public int getNuocCoAsen() {
		return _danhGiaBenVung.getNuocCoAsen();
	}

	/**
	* Sets the nuoc co asen of this danh gia ben vung.
	*
	* @param nuocCoAsen the nuoc co asen of this danh gia ben vung
	*/
	@Override
	public void setNuocCoAsen(int nuocCoAsen) {
		_danhGiaBenVung.setNuocCoAsen(nuocCoAsen);
	}

	/**
	* Returns the tong chi phi of this danh gia ben vung.
	*
	* @return the tong chi phi of this danh gia ben vung
	*/
	@Override
	public int getTongChiPhi() {
		return _danhGiaBenVung.getTongChiPhi();
	}

	/**
	* Sets the tong chi phi of this danh gia ben vung.
	*
	* @param tongChiPhi the tong chi phi of this danh gia ben vung
	*/
	@Override
	public void setTongChiPhi(int tongChiPhi) {
		_danhGiaBenVung.setTongChiPhi(tongChiPhi);
	}

	/**
	* Returns the tong doanh thu of this danh gia ben vung.
	*
	* @return the tong doanh thu of this danh gia ben vung
	*/
	@Override
	public int getTongDoanhThu() {
		return _danhGiaBenVung.getTongDoanhThu();
	}

	/**
	* Sets the tong doanh thu of this danh gia ben vung.
	*
	* @param tongDoanhThu the tong doanh thu of this danh gia ben vung
	*/
	@Override
	public void setTongDoanhThu(int tongDoanhThu) {
		_danhGiaBenVung.setTongDoanhThu(tongDoanhThu);
	}

	/**
	* Returns the ngay tao of this danh gia ben vung.
	*
	* @return the ngay tao of this danh gia ben vung
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _danhGiaBenVung.getNgayTao();
	}

	/**
	* Sets the ngay tao of this danh gia ben vung.
	*
	* @param ngayTao the ngay tao of this danh gia ben vung
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_danhGiaBenVung.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this danh gia ben vung.
	*
	* @return the id nguoi tao of this danh gia ben vung
	*/
	@Override
	public int getIdNguoiTao() {
		return _danhGiaBenVung.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this danh gia ben vung.
	*
	* @param idNguoiTao the id nguoi tao of this danh gia ben vung
	*/
	@Override
	public void setIdNguoiTao(int idNguoiTao) {
		_danhGiaBenVung.setIdNguoiTao(idNguoiTao);
	}

	/**
	* Returns the ghi chu of this danh gia ben vung.
	*
	* @return the ghi chu of this danh gia ben vung
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _danhGiaBenVung.getGhiChu();
	}

	/**
	* Sets the ghi chu of this danh gia ben vung.
	*
	* @param ghiChu the ghi chu of this danh gia ben vung
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_danhGiaBenVung.setGhiChu(ghiChu);
	}

	/**
	* Returns the ket qua danh gia of this danh gia ben vung.
	*
	* @return the ket qua danh gia of this danh gia ben vung
	*/
	@Override
	public int getKetQuaDanhGia() {
		return _danhGiaBenVung.getKetQuaDanhGia();
	}

	/**
	* Sets the ket qua danh gia of this danh gia ben vung.
	*
	* @param ketQuaDanhGia the ket qua danh gia of this danh gia ben vung
	*/
	@Override
	public void setKetQuaDanhGia(int ketQuaDanhGia) {
		_danhGiaBenVung.setKetQuaDanhGia(ketQuaDanhGia);
	}

	/**
	* Returns the bao cao d l i of this danh gia ben vung.
	*
	* @return the bao cao d l i of this danh gia ben vung
	*/
	@Override
	public int getBaoCaoDLI() {
		return _danhGiaBenVung.getBaoCaoDLI();
	}

	/**
	* Sets the bao cao d l i of this danh gia ben vung.
	*
	* @param baoCaoDLI the bao cao d l i of this danh gia ben vung
	*/
	@Override
	public void setBaoCaoDLI(int baoCaoDLI) {
		_danhGiaBenVung.setBaoCaoDLI(baoCaoDLI);
	}

	@Override
	public boolean isNew() {
		return _danhGiaBenVung.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_danhGiaBenVung.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _danhGiaBenVung.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_danhGiaBenVung.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _danhGiaBenVung.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _danhGiaBenVung.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_danhGiaBenVung.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _danhGiaBenVung.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_danhGiaBenVung.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_danhGiaBenVung.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_danhGiaBenVung.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DanhGiaBenVungWrapper((DanhGiaBenVung)_danhGiaBenVung.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung danhGiaBenVung) {
		return _danhGiaBenVung.compareTo(danhGiaBenVung);
	}

	@Override
	public int hashCode() {
		return _danhGiaBenVung.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung> toCacheModel() {
		return _danhGiaBenVung.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung toEscapedModel() {
		return new DanhGiaBenVungWrapper(_danhGiaBenVung.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung toUnescapedModel() {
		return new DanhGiaBenVungWrapper(_danhGiaBenVung.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _danhGiaBenVung.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _danhGiaBenVung.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_danhGiaBenVung.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DanhGiaBenVungWrapper)) {
			return false;
		}

		DanhGiaBenVungWrapper danhGiaBenVungWrapper = (DanhGiaBenVungWrapper)obj;

		if (Validator.equals(_danhGiaBenVung,
					danhGiaBenVungWrapper._danhGiaBenVung)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DanhGiaBenVung getWrappedDanhGiaBenVung() {
		return _danhGiaBenVung;
	}

	@Override
	public DanhGiaBenVung getWrappedModel() {
		return _danhGiaBenVung;
	}

	@Override
	public void resetOriginalValues() {
		_danhGiaBenVung.resetOriginalValues();
	}

	private DanhGiaBenVung _danhGiaBenVung;
}