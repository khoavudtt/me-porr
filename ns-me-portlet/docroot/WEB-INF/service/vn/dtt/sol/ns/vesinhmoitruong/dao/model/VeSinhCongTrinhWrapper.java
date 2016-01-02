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
 * This class is a wrapper for {@link VeSinhCongTrinh}.
 * </p>
 *
 * @author BinhTH
 * @see VeSinhCongTrinh
 * @generated
 */
public class VeSinhCongTrinhWrapper implements VeSinhCongTrinh,
	ModelWrapper<VeSinhCongTrinh> {
	public VeSinhCongTrinhWrapper(VeSinhCongTrinh veSinhCongTrinh) {
		_veSinhCongTrinh = veSinhCongTrinh;
	}

	@Override
	public Class<?> getModelClass() {
		return VeSinhCongTrinh.class;
	}

	@Override
	public String getModelClassName() {
		return VeSinhCongTrinh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tenCongTrinh", getTenCongTrinh());
		attributes.put("loaiCongTrinh", getLoaiCongTrinh());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("diaChi", getDiaChi());
		attributes.put("trangThai", getTrangThai());
		attributes.put("namBaoCao", getNamBaoCao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("kinhDo", getKinhDo());
		attributes.put("viDo", getViDo());
		attributes.put("loaiNguonNuoc", getLoaiNguonNuoc());
		attributes.put("nguonNuocHVS", getNguonNuocHVS());
		attributes.put("loaiNhaTieu", getLoaiNhaTieu());
		attributes.put("nhaTieuHVS", getNhaTieuHVS());
		attributes.put("ketLuanHVS", getKetLuanHVS());
		attributes.put("ngayKiemDem", getNgayKiemDem());
		attributes.put("ngayDanhGia", getNgayDanhGia());
		attributes.put("idNguoiDanhGia", getIdNguoiDanhGia());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String tenCongTrinh = (String)attributes.get("tenCongTrinh");

		if (tenCongTrinh != null) {
			setTenCongTrinh(tenCongTrinh);
		}

		Integer loaiCongTrinh = (Integer)attributes.get("loaiCongTrinh");

		if (loaiCongTrinh != null) {
			setLoaiCongTrinh(loaiCongTrinh);
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

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		Integer trangThai = (Integer)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer namBaoCao = (Integer)attributes.get("namBaoCao");

		if (namBaoCao != null) {
			setNamBaoCao(namBaoCao);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		String idNguoiTao = (String)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		String kinhDo = (String)attributes.get("kinhDo");

		if (kinhDo != null) {
			setKinhDo(kinhDo);
		}

		String viDo = (String)attributes.get("viDo");

		if (viDo != null) {
			setViDo(viDo);
		}

		String loaiNguonNuoc = (String)attributes.get("loaiNguonNuoc");

		if (loaiNguonNuoc != null) {
			setLoaiNguonNuoc(loaiNguonNuoc);
		}

		Integer nguonNuocHVS = (Integer)attributes.get("nguonNuocHVS");

		if (nguonNuocHVS != null) {
			setNguonNuocHVS(nguonNuocHVS);
		}

		String loaiNhaTieu = (String)attributes.get("loaiNhaTieu");

		if (loaiNhaTieu != null) {
			setLoaiNhaTieu(loaiNhaTieu);
		}

		Integer nhaTieuHVS = (Integer)attributes.get("nhaTieuHVS");

		if (nhaTieuHVS != null) {
			setNhaTieuHVS(nhaTieuHVS);
		}

		Integer ketLuanHVS = (Integer)attributes.get("ketLuanHVS");

		if (ketLuanHVS != null) {
			setKetLuanHVS(ketLuanHVS);
		}

		Date ngayKiemDem = (Date)attributes.get("ngayKiemDem");

		if (ngayKiemDem != null) {
			setNgayKiemDem(ngayKiemDem);
		}

		Date ngayDanhGia = (Date)attributes.get("ngayDanhGia");

		if (ngayDanhGia != null) {
			setNgayDanhGia(ngayDanhGia);
		}

		Integer idNguoiDanhGia = (Integer)attributes.get("idNguoiDanhGia");

		if (idNguoiDanhGia != null) {
			setIdNguoiDanhGia(idNguoiDanhGia);
		}
	}

	/**
	* Returns the primary key of this ve sinh cong trinh.
	*
	* @return the primary key of this ve sinh cong trinh
	*/
	@Override
	public int getPrimaryKey() {
		return _veSinhCongTrinh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ve sinh cong trinh.
	*
	* @param primaryKey the primary key of this ve sinh cong trinh
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_veSinhCongTrinh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this ve sinh cong trinh.
	*
	* @return the ID of this ve sinh cong trinh
	*/
	@Override
	public int getId() {
		return _veSinhCongTrinh.getId();
	}

	/**
	* Sets the ID of this ve sinh cong trinh.
	*
	* @param id the ID of this ve sinh cong trinh
	*/
	@Override
	public void setId(int id) {
		_veSinhCongTrinh.setId(id);
	}

	/**
	* Returns the ten cong trinh of this ve sinh cong trinh.
	*
	* @return the ten cong trinh of this ve sinh cong trinh
	*/
	@Override
	public java.lang.String getTenCongTrinh() {
		return _veSinhCongTrinh.getTenCongTrinh();
	}

	/**
	* Sets the ten cong trinh of this ve sinh cong trinh.
	*
	* @param tenCongTrinh the ten cong trinh of this ve sinh cong trinh
	*/
	@Override
	public void setTenCongTrinh(java.lang.String tenCongTrinh) {
		_veSinhCongTrinh.setTenCongTrinh(tenCongTrinh);
	}

	/**
	* Returns the loai cong trinh of this ve sinh cong trinh.
	*
	* @return the loai cong trinh of this ve sinh cong trinh
	*/
	@Override
	public int getLoaiCongTrinh() {
		return _veSinhCongTrinh.getLoaiCongTrinh();
	}

	/**
	* Sets the loai cong trinh of this ve sinh cong trinh.
	*
	* @param loaiCongTrinh the loai cong trinh of this ve sinh cong trinh
	*/
	@Override
	public void setLoaiCongTrinh(int loaiCongTrinh) {
		_veSinhCongTrinh.setLoaiCongTrinh(loaiCongTrinh);
	}

	/**
	* Returns the ma tinh of this ve sinh cong trinh.
	*
	* @return the ma tinh of this ve sinh cong trinh
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _veSinhCongTrinh.getMaTinh();
	}

	/**
	* Sets the ma tinh of this ve sinh cong trinh.
	*
	* @param maTinh the ma tinh of this ve sinh cong trinh
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_veSinhCongTrinh.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this ve sinh cong trinh.
	*
	* @return the ma huyen of this ve sinh cong trinh
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _veSinhCongTrinh.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this ve sinh cong trinh.
	*
	* @param maHuyen the ma huyen of this ve sinh cong trinh
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_veSinhCongTrinh.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ma xa of this ve sinh cong trinh.
	*
	* @return the ma xa of this ve sinh cong trinh
	*/
	@Override
	public java.lang.String getMaXa() {
		return _veSinhCongTrinh.getMaXa();
	}

	/**
	* Sets the ma xa of this ve sinh cong trinh.
	*
	* @param maXa the ma xa of this ve sinh cong trinh
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_veSinhCongTrinh.setMaXa(maXa);
	}

	/**
	* Returns the dia chi of this ve sinh cong trinh.
	*
	* @return the dia chi of this ve sinh cong trinh
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _veSinhCongTrinh.getDiaChi();
	}

	/**
	* Sets the dia chi of this ve sinh cong trinh.
	*
	* @param diaChi the dia chi of this ve sinh cong trinh
	*/
	@Override
	public void setDiaChi(java.lang.String diaChi) {
		_veSinhCongTrinh.setDiaChi(diaChi);
	}

	/**
	* Returns the trang thai of this ve sinh cong trinh.
	*
	* @return the trang thai of this ve sinh cong trinh
	*/
	@Override
	public int getTrangThai() {
		return _veSinhCongTrinh.getTrangThai();
	}

	/**
	* Sets the trang thai of this ve sinh cong trinh.
	*
	* @param trangThai the trang thai of this ve sinh cong trinh
	*/
	@Override
	public void setTrangThai(int trangThai) {
		_veSinhCongTrinh.setTrangThai(trangThai);
	}

	/**
	* Returns the nam bao cao of this ve sinh cong trinh.
	*
	* @return the nam bao cao of this ve sinh cong trinh
	*/
	@Override
	public int getNamBaoCao() {
		return _veSinhCongTrinh.getNamBaoCao();
	}

	/**
	* Sets the nam bao cao of this ve sinh cong trinh.
	*
	* @param namBaoCao the nam bao cao of this ve sinh cong trinh
	*/
	@Override
	public void setNamBaoCao(int namBaoCao) {
		_veSinhCongTrinh.setNamBaoCao(namBaoCao);
	}

	/**
	* Returns the ghi chu of this ve sinh cong trinh.
	*
	* @return the ghi chu of this ve sinh cong trinh
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _veSinhCongTrinh.getGhiChu();
	}

	/**
	* Sets the ghi chu of this ve sinh cong trinh.
	*
	* @param ghiChu the ghi chu of this ve sinh cong trinh
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_veSinhCongTrinh.setGhiChu(ghiChu);
	}

	/**
	* Returns the ngay tao of this ve sinh cong trinh.
	*
	* @return the ngay tao of this ve sinh cong trinh
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _veSinhCongTrinh.getNgayTao();
	}

	/**
	* Sets the ngay tao of this ve sinh cong trinh.
	*
	* @param ngayTao the ngay tao of this ve sinh cong trinh
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_veSinhCongTrinh.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this ve sinh cong trinh.
	*
	* @return the id nguoi tao of this ve sinh cong trinh
	*/
	@Override
	public java.lang.String getIdNguoiTao() {
		return _veSinhCongTrinh.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this ve sinh cong trinh.
	*
	* @param idNguoiTao the id nguoi tao of this ve sinh cong trinh
	*/
	@Override
	public void setIdNguoiTao(java.lang.String idNguoiTao) {
		_veSinhCongTrinh.setIdNguoiTao(idNguoiTao);
	}

	/**
	* Returns the kinh do of this ve sinh cong trinh.
	*
	* @return the kinh do of this ve sinh cong trinh
	*/
	@Override
	public java.lang.String getKinhDo() {
		return _veSinhCongTrinh.getKinhDo();
	}

	/**
	* Sets the kinh do of this ve sinh cong trinh.
	*
	* @param kinhDo the kinh do of this ve sinh cong trinh
	*/
	@Override
	public void setKinhDo(java.lang.String kinhDo) {
		_veSinhCongTrinh.setKinhDo(kinhDo);
	}

	/**
	* Returns the vi do of this ve sinh cong trinh.
	*
	* @return the vi do of this ve sinh cong trinh
	*/
	@Override
	public java.lang.String getViDo() {
		return _veSinhCongTrinh.getViDo();
	}

	/**
	* Sets the vi do of this ve sinh cong trinh.
	*
	* @param viDo the vi do of this ve sinh cong trinh
	*/
	@Override
	public void setViDo(java.lang.String viDo) {
		_veSinhCongTrinh.setViDo(viDo);
	}

	/**
	* Returns the loai nguon nuoc of this ve sinh cong trinh.
	*
	* @return the loai nguon nuoc of this ve sinh cong trinh
	*/
	@Override
	public java.lang.String getLoaiNguonNuoc() {
		return _veSinhCongTrinh.getLoaiNguonNuoc();
	}

	/**
	* Sets the loai nguon nuoc of this ve sinh cong trinh.
	*
	* @param loaiNguonNuoc the loai nguon nuoc of this ve sinh cong trinh
	*/
	@Override
	public void setLoaiNguonNuoc(java.lang.String loaiNguonNuoc) {
		_veSinhCongTrinh.setLoaiNguonNuoc(loaiNguonNuoc);
	}

	/**
	* Returns the nguon nuoc h v s of this ve sinh cong trinh.
	*
	* @return the nguon nuoc h v s of this ve sinh cong trinh
	*/
	@Override
	public int getNguonNuocHVS() {
		return _veSinhCongTrinh.getNguonNuocHVS();
	}

	/**
	* Sets the nguon nuoc h v s of this ve sinh cong trinh.
	*
	* @param nguonNuocHVS the nguon nuoc h v s of this ve sinh cong trinh
	*/
	@Override
	public void setNguonNuocHVS(int nguonNuocHVS) {
		_veSinhCongTrinh.setNguonNuocHVS(nguonNuocHVS);
	}

	/**
	* Returns the loai nha tieu of this ve sinh cong trinh.
	*
	* @return the loai nha tieu of this ve sinh cong trinh
	*/
	@Override
	public java.lang.String getLoaiNhaTieu() {
		return _veSinhCongTrinh.getLoaiNhaTieu();
	}

	/**
	* Sets the loai nha tieu of this ve sinh cong trinh.
	*
	* @param loaiNhaTieu the loai nha tieu of this ve sinh cong trinh
	*/
	@Override
	public void setLoaiNhaTieu(java.lang.String loaiNhaTieu) {
		_veSinhCongTrinh.setLoaiNhaTieu(loaiNhaTieu);
	}

	/**
	* Returns the nha tieu h v s of this ve sinh cong trinh.
	*
	* @return the nha tieu h v s of this ve sinh cong trinh
	*/
	@Override
	public int getNhaTieuHVS() {
		return _veSinhCongTrinh.getNhaTieuHVS();
	}

	/**
	* Sets the nha tieu h v s of this ve sinh cong trinh.
	*
	* @param nhaTieuHVS the nha tieu h v s of this ve sinh cong trinh
	*/
	@Override
	public void setNhaTieuHVS(int nhaTieuHVS) {
		_veSinhCongTrinh.setNhaTieuHVS(nhaTieuHVS);
	}

	/**
	* Returns the ket luan h v s of this ve sinh cong trinh.
	*
	* @return the ket luan h v s of this ve sinh cong trinh
	*/
	@Override
	public int getKetLuanHVS() {
		return _veSinhCongTrinh.getKetLuanHVS();
	}

	/**
	* Sets the ket luan h v s of this ve sinh cong trinh.
	*
	* @param ketLuanHVS the ket luan h v s of this ve sinh cong trinh
	*/
	@Override
	public void setKetLuanHVS(int ketLuanHVS) {
		_veSinhCongTrinh.setKetLuanHVS(ketLuanHVS);
	}

	/**
	* Returns the ngay kiem dem of this ve sinh cong trinh.
	*
	* @return the ngay kiem dem of this ve sinh cong trinh
	*/
	@Override
	public java.util.Date getNgayKiemDem() {
		return _veSinhCongTrinh.getNgayKiemDem();
	}

	/**
	* Sets the ngay kiem dem of this ve sinh cong trinh.
	*
	* @param ngayKiemDem the ngay kiem dem of this ve sinh cong trinh
	*/
	@Override
	public void setNgayKiemDem(java.util.Date ngayKiemDem) {
		_veSinhCongTrinh.setNgayKiemDem(ngayKiemDem);
	}

	/**
	* Returns the ngay danh gia of this ve sinh cong trinh.
	*
	* @return the ngay danh gia of this ve sinh cong trinh
	*/
	@Override
	public java.util.Date getNgayDanhGia() {
		return _veSinhCongTrinh.getNgayDanhGia();
	}

	/**
	* Sets the ngay danh gia of this ve sinh cong trinh.
	*
	* @param ngayDanhGia the ngay danh gia of this ve sinh cong trinh
	*/
	@Override
	public void setNgayDanhGia(java.util.Date ngayDanhGia) {
		_veSinhCongTrinh.setNgayDanhGia(ngayDanhGia);
	}

	/**
	* Returns the id nguoi danh gia of this ve sinh cong trinh.
	*
	* @return the id nguoi danh gia of this ve sinh cong trinh
	*/
	@Override
	public int getIdNguoiDanhGia() {
		return _veSinhCongTrinh.getIdNguoiDanhGia();
	}

	/**
	* Sets the id nguoi danh gia of this ve sinh cong trinh.
	*
	* @param idNguoiDanhGia the id nguoi danh gia of this ve sinh cong trinh
	*/
	@Override
	public void setIdNguoiDanhGia(int idNguoiDanhGia) {
		_veSinhCongTrinh.setIdNguoiDanhGia(idNguoiDanhGia);
	}

	@Override
	public boolean isNew() {
		return _veSinhCongTrinh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_veSinhCongTrinh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _veSinhCongTrinh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_veSinhCongTrinh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _veSinhCongTrinh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _veSinhCongTrinh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_veSinhCongTrinh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _veSinhCongTrinh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_veSinhCongTrinh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_veSinhCongTrinh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_veSinhCongTrinh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VeSinhCongTrinhWrapper((VeSinhCongTrinh)_veSinhCongTrinh.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh veSinhCongTrinh) {
		return _veSinhCongTrinh.compareTo(veSinhCongTrinh);
	}

	@Override
	public int hashCode() {
		return _veSinhCongTrinh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh> toCacheModel() {
		return _veSinhCongTrinh.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh toEscapedModel() {
		return new VeSinhCongTrinhWrapper(_veSinhCongTrinh.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh toUnescapedModel() {
		return new VeSinhCongTrinhWrapper(_veSinhCongTrinh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _veSinhCongTrinh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _veSinhCongTrinh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_veSinhCongTrinh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VeSinhCongTrinhWrapper)) {
			return false;
		}

		VeSinhCongTrinhWrapper veSinhCongTrinhWrapper = (VeSinhCongTrinhWrapper)obj;

		if (Validator.equals(_veSinhCongTrinh,
					veSinhCongTrinhWrapper._veSinhCongTrinh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VeSinhCongTrinh getWrappedVeSinhCongTrinh() {
		return _veSinhCongTrinh;
	}

	@Override
	public VeSinhCongTrinh getWrappedModel() {
		return _veSinhCongTrinh;
	}

	@Override
	public void resetOriginalValues() {
		_veSinhCongTrinh.resetOriginalValues();
	}

	private VeSinhCongTrinh _veSinhCongTrinh;
}