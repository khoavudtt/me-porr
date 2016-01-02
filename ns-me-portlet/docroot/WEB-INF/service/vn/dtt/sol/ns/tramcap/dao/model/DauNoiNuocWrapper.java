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
 * This class is a wrapper for {@link DauNoiNuoc}.
 * </p>
 *
 * @author khoa.vu
 * @see DauNoiNuoc
 * @generated
 */
public class DauNoiNuocWrapper implements DauNoiNuoc, ModelWrapper<DauNoiNuoc> {
	public DauNoiNuocWrapper(DauNoiNuoc dauNoiNuoc) {
		_dauNoiNuoc = dauNoiNuoc;
	}

	@Override
	public Class<?> getModelClass() {
		return DauNoiNuoc.class;
	}

	@Override
	public String getModelClassName() {
		return DauNoiNuoc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tramCapNuocId", getTramCapNuocId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("thonXom", getThonXom());
		attributes.put("tenChuHo", getTenChuHo());
		attributes.put("gioiTinh", getGioiTinh());
		attributes.put("ngayDauNoiHopDong", getNgayDauNoiHopDong());
		attributes.put("trangThai", getTrangThai());
		attributes.put("namBaoCao", getNamBaoCao());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("idNguoiTao", getIdNguoiTao());
		attributes.put("soNguoiTrongHo", getSoNguoiTrongHo());
		attributes.put("thanhPhanHoGiaDinh", getThanhPhanHoGiaDinh());
		attributes.put("tongDoanhThu", getTongDoanhThu());
		attributes.put("kinhDo", getKinhDo());
		attributes.put("viDo", getViDo());
		attributes.put("ngayDauNoiThucTe", getNgayDauNoiThucTe());
		attributes.put("soSeryDongHo", getSoSeryDongHo());
		attributes.put("danhGiaNuocHVS", getDanhGiaNuocHVS());
		attributes.put("ngayKiemDem", getNgayKiemDem());
		attributes.put("ngayDanhGia", getNgayDanhGia());
		attributes.put("idNguoiDanhGia", getIdNguoiDanhGia());

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

		String thonXom = (String)attributes.get("thonXom");

		if (thonXom != null) {
			setThonXom(thonXom);
		}

		String tenChuHo = (String)attributes.get("tenChuHo");

		if (tenChuHo != null) {
			setTenChuHo(tenChuHo);
		}

		Integer gioiTinh = (Integer)attributes.get("gioiTinh");

		if (gioiTinh != null) {
			setGioiTinh(gioiTinh);
		}

		Date ngayDauNoiHopDong = (Date)attributes.get("ngayDauNoiHopDong");

		if (ngayDauNoiHopDong != null) {
			setNgayDauNoiHopDong(ngayDauNoiHopDong);
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

		Integer idNguoiTao = (Integer)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}

		Integer soNguoiTrongHo = (Integer)attributes.get("soNguoiTrongHo");

		if (soNguoiTrongHo != null) {
			setSoNguoiTrongHo(soNguoiTrongHo);
		}

		Integer thanhPhanHoGiaDinh = (Integer)attributes.get(
				"thanhPhanHoGiaDinh");

		if (thanhPhanHoGiaDinh != null) {
			setThanhPhanHoGiaDinh(thanhPhanHoGiaDinh);
		}

		Integer tongDoanhThu = (Integer)attributes.get("tongDoanhThu");

		if (tongDoanhThu != null) {
			setTongDoanhThu(tongDoanhThu);
		}

		String kinhDo = (String)attributes.get("kinhDo");

		if (kinhDo != null) {
			setKinhDo(kinhDo);
		}

		String viDo = (String)attributes.get("viDo");

		if (viDo != null) {
			setViDo(viDo);
		}

		Date ngayDauNoiThucTe = (Date)attributes.get("ngayDauNoiThucTe");

		if (ngayDauNoiThucTe != null) {
			setNgayDauNoiThucTe(ngayDauNoiThucTe);
		}

		String soSeryDongHo = (String)attributes.get("soSeryDongHo");

		if (soSeryDongHo != null) {
			setSoSeryDongHo(soSeryDongHo);
		}

		String danhGiaNuocHVS = (String)attributes.get("danhGiaNuocHVS");

		if (danhGiaNuocHVS != null) {
			setDanhGiaNuocHVS(danhGiaNuocHVS);
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
	* Returns the primary key of this dau noi nuoc.
	*
	* @return the primary key of this dau noi nuoc
	*/
	@Override
	public long getPrimaryKey() {
		return _dauNoiNuoc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dau noi nuoc.
	*
	* @param primaryKey the primary key of this dau noi nuoc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dauNoiNuoc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dau noi nuoc.
	*
	* @return the ID of this dau noi nuoc
	*/
	@Override
	public long getId() {
		return _dauNoiNuoc.getId();
	}

	/**
	* Sets the ID of this dau noi nuoc.
	*
	* @param id the ID of this dau noi nuoc
	*/
	@Override
	public void setId(long id) {
		_dauNoiNuoc.setId(id);
	}

	/**
	* Returns the tram cap nuoc ID of this dau noi nuoc.
	*
	* @return the tram cap nuoc ID of this dau noi nuoc
	*/
	@Override
	public int getTramCapNuocId() {
		return _dauNoiNuoc.getTramCapNuocId();
	}

	/**
	* Sets the tram cap nuoc ID of this dau noi nuoc.
	*
	* @param tramCapNuocId the tram cap nuoc ID of this dau noi nuoc
	*/
	@Override
	public void setTramCapNuocId(int tramCapNuocId) {
		_dauNoiNuoc.setTramCapNuocId(tramCapNuocId);
	}

	/**
	* Returns the ma tinh of this dau noi nuoc.
	*
	* @return the ma tinh of this dau noi nuoc
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _dauNoiNuoc.getMaTinh();
	}

	/**
	* Sets the ma tinh of this dau noi nuoc.
	*
	* @param maTinh the ma tinh of this dau noi nuoc
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_dauNoiNuoc.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this dau noi nuoc.
	*
	* @return the ma huyen of this dau noi nuoc
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _dauNoiNuoc.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this dau noi nuoc.
	*
	* @param maHuyen the ma huyen of this dau noi nuoc
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_dauNoiNuoc.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ma xa of this dau noi nuoc.
	*
	* @return the ma xa of this dau noi nuoc
	*/
	@Override
	public java.lang.String getMaXa() {
		return _dauNoiNuoc.getMaXa();
	}

	/**
	* Sets the ma xa of this dau noi nuoc.
	*
	* @param maXa the ma xa of this dau noi nuoc
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_dauNoiNuoc.setMaXa(maXa);
	}

	/**
	* Returns the thon xom of this dau noi nuoc.
	*
	* @return the thon xom of this dau noi nuoc
	*/
	@Override
	public java.lang.String getThonXom() {
		return _dauNoiNuoc.getThonXom();
	}

	/**
	* Sets the thon xom of this dau noi nuoc.
	*
	* @param thonXom the thon xom of this dau noi nuoc
	*/
	@Override
	public void setThonXom(java.lang.String thonXom) {
		_dauNoiNuoc.setThonXom(thonXom);
	}

	/**
	* Returns the ten chu ho of this dau noi nuoc.
	*
	* @return the ten chu ho of this dau noi nuoc
	*/
	@Override
	public java.lang.String getTenChuHo() {
		return _dauNoiNuoc.getTenChuHo();
	}

	/**
	* Sets the ten chu ho of this dau noi nuoc.
	*
	* @param tenChuHo the ten chu ho of this dau noi nuoc
	*/
	@Override
	public void setTenChuHo(java.lang.String tenChuHo) {
		_dauNoiNuoc.setTenChuHo(tenChuHo);
	}

	/**
	* Returns the gioi tinh of this dau noi nuoc.
	*
	* @return the gioi tinh of this dau noi nuoc
	*/
	@Override
	public int getGioiTinh() {
		return _dauNoiNuoc.getGioiTinh();
	}

	/**
	* Sets the gioi tinh of this dau noi nuoc.
	*
	* @param gioiTinh the gioi tinh of this dau noi nuoc
	*/
	@Override
	public void setGioiTinh(int gioiTinh) {
		_dauNoiNuoc.setGioiTinh(gioiTinh);
	}

	/**
	* Returns the ngay dau noi hop dong of this dau noi nuoc.
	*
	* @return the ngay dau noi hop dong of this dau noi nuoc
	*/
	@Override
	public java.util.Date getNgayDauNoiHopDong() {
		return _dauNoiNuoc.getNgayDauNoiHopDong();
	}

	/**
	* Sets the ngay dau noi hop dong of this dau noi nuoc.
	*
	* @param ngayDauNoiHopDong the ngay dau noi hop dong of this dau noi nuoc
	*/
	@Override
	public void setNgayDauNoiHopDong(java.util.Date ngayDauNoiHopDong) {
		_dauNoiNuoc.setNgayDauNoiHopDong(ngayDauNoiHopDong);
	}

	/**
	* Returns the trang thai of this dau noi nuoc.
	*
	* @return the trang thai of this dau noi nuoc
	*/
	@Override
	public int getTrangThai() {
		return _dauNoiNuoc.getTrangThai();
	}

	/**
	* Sets the trang thai of this dau noi nuoc.
	*
	* @param trangThai the trang thai of this dau noi nuoc
	*/
	@Override
	public void setTrangThai(int trangThai) {
		_dauNoiNuoc.setTrangThai(trangThai);
	}

	/**
	* Returns the nam bao cao of this dau noi nuoc.
	*
	* @return the nam bao cao of this dau noi nuoc
	*/
	@Override
	public int getNamBaoCao() {
		return _dauNoiNuoc.getNamBaoCao();
	}

	/**
	* Sets the nam bao cao of this dau noi nuoc.
	*
	* @param namBaoCao the nam bao cao of this dau noi nuoc
	*/
	@Override
	public void setNamBaoCao(int namBaoCao) {
		_dauNoiNuoc.setNamBaoCao(namBaoCao);
	}

	/**
	* Returns the ghi chu of this dau noi nuoc.
	*
	* @return the ghi chu of this dau noi nuoc
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _dauNoiNuoc.getGhiChu();
	}

	/**
	* Sets the ghi chu of this dau noi nuoc.
	*
	* @param ghiChu the ghi chu of this dau noi nuoc
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_dauNoiNuoc.setGhiChu(ghiChu);
	}

	/**
	* Returns the ngay tao of this dau noi nuoc.
	*
	* @return the ngay tao of this dau noi nuoc
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _dauNoiNuoc.getNgayTao();
	}

	/**
	* Sets the ngay tao of this dau noi nuoc.
	*
	* @param ngayTao the ngay tao of this dau noi nuoc
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_dauNoiNuoc.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this dau noi nuoc.
	*
	* @return the id nguoi tao of this dau noi nuoc
	*/
	@Override
	public int getIdNguoiTao() {
		return _dauNoiNuoc.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this dau noi nuoc.
	*
	* @param idNguoiTao the id nguoi tao of this dau noi nuoc
	*/
	@Override
	public void setIdNguoiTao(int idNguoiTao) {
		_dauNoiNuoc.setIdNguoiTao(idNguoiTao);
	}

	/**
	* Returns the so nguoi trong ho of this dau noi nuoc.
	*
	* @return the so nguoi trong ho of this dau noi nuoc
	*/
	@Override
	public int getSoNguoiTrongHo() {
		return _dauNoiNuoc.getSoNguoiTrongHo();
	}

	/**
	* Sets the so nguoi trong ho of this dau noi nuoc.
	*
	* @param soNguoiTrongHo the so nguoi trong ho of this dau noi nuoc
	*/
	@Override
	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		_dauNoiNuoc.setSoNguoiTrongHo(soNguoiTrongHo);
	}

	/**
	* Returns the thanh phan ho gia dinh of this dau noi nuoc.
	*
	* @return the thanh phan ho gia dinh of this dau noi nuoc
	*/
	@Override
	public int getThanhPhanHoGiaDinh() {
		return _dauNoiNuoc.getThanhPhanHoGiaDinh();
	}

	/**
	* Sets the thanh phan ho gia dinh of this dau noi nuoc.
	*
	* @param thanhPhanHoGiaDinh the thanh phan ho gia dinh of this dau noi nuoc
	*/
	@Override
	public void setThanhPhanHoGiaDinh(int thanhPhanHoGiaDinh) {
		_dauNoiNuoc.setThanhPhanHoGiaDinh(thanhPhanHoGiaDinh);
	}

	/**
	* Returns the tong doanh thu of this dau noi nuoc.
	*
	* @return the tong doanh thu of this dau noi nuoc
	*/
	@Override
	public int getTongDoanhThu() {
		return _dauNoiNuoc.getTongDoanhThu();
	}

	/**
	* Sets the tong doanh thu of this dau noi nuoc.
	*
	* @param tongDoanhThu the tong doanh thu of this dau noi nuoc
	*/
	@Override
	public void setTongDoanhThu(int tongDoanhThu) {
		_dauNoiNuoc.setTongDoanhThu(tongDoanhThu);
	}

	/**
	* Returns the kinh do of this dau noi nuoc.
	*
	* @return the kinh do of this dau noi nuoc
	*/
	@Override
	public java.lang.String getKinhDo() {
		return _dauNoiNuoc.getKinhDo();
	}

	/**
	* Sets the kinh do of this dau noi nuoc.
	*
	* @param kinhDo the kinh do of this dau noi nuoc
	*/
	@Override
	public void setKinhDo(java.lang.String kinhDo) {
		_dauNoiNuoc.setKinhDo(kinhDo);
	}

	/**
	* Returns the vi do of this dau noi nuoc.
	*
	* @return the vi do of this dau noi nuoc
	*/
	@Override
	public java.lang.String getViDo() {
		return _dauNoiNuoc.getViDo();
	}

	/**
	* Sets the vi do of this dau noi nuoc.
	*
	* @param viDo the vi do of this dau noi nuoc
	*/
	@Override
	public void setViDo(java.lang.String viDo) {
		_dauNoiNuoc.setViDo(viDo);
	}

	/**
	* Returns the ngay dau noi thuc te of this dau noi nuoc.
	*
	* @return the ngay dau noi thuc te of this dau noi nuoc
	*/
	@Override
	public java.util.Date getNgayDauNoiThucTe() {
		return _dauNoiNuoc.getNgayDauNoiThucTe();
	}

	/**
	* Sets the ngay dau noi thuc te of this dau noi nuoc.
	*
	* @param ngayDauNoiThucTe the ngay dau noi thuc te of this dau noi nuoc
	*/
	@Override
	public void setNgayDauNoiThucTe(java.util.Date ngayDauNoiThucTe) {
		_dauNoiNuoc.setNgayDauNoiThucTe(ngayDauNoiThucTe);
	}

	/**
	* Returns the so sery dong ho of this dau noi nuoc.
	*
	* @return the so sery dong ho of this dau noi nuoc
	*/
	@Override
	public java.lang.String getSoSeryDongHo() {
		return _dauNoiNuoc.getSoSeryDongHo();
	}

	/**
	* Sets the so sery dong ho of this dau noi nuoc.
	*
	* @param soSeryDongHo the so sery dong ho of this dau noi nuoc
	*/
	@Override
	public void setSoSeryDongHo(java.lang.String soSeryDongHo) {
		_dauNoiNuoc.setSoSeryDongHo(soSeryDongHo);
	}

	/**
	* Returns the danh gia nuoc h v s of this dau noi nuoc.
	*
	* @return the danh gia nuoc h v s of this dau noi nuoc
	*/
	@Override
	public java.lang.String getDanhGiaNuocHVS() {
		return _dauNoiNuoc.getDanhGiaNuocHVS();
	}

	/**
	* Sets the danh gia nuoc h v s of this dau noi nuoc.
	*
	* @param danhGiaNuocHVS the danh gia nuoc h v s of this dau noi nuoc
	*/
	@Override
	public void setDanhGiaNuocHVS(java.lang.String danhGiaNuocHVS) {
		_dauNoiNuoc.setDanhGiaNuocHVS(danhGiaNuocHVS);
	}

	/**
	* Returns the ngay kiem dem of this dau noi nuoc.
	*
	* @return the ngay kiem dem of this dau noi nuoc
	*/
	@Override
	public java.util.Date getNgayKiemDem() {
		return _dauNoiNuoc.getNgayKiemDem();
	}

	/**
	* Sets the ngay kiem dem of this dau noi nuoc.
	*
	* @param ngayKiemDem the ngay kiem dem of this dau noi nuoc
	*/
	@Override
	public void setNgayKiemDem(java.util.Date ngayKiemDem) {
		_dauNoiNuoc.setNgayKiemDem(ngayKiemDem);
	}

	/**
	* Returns the ngay danh gia of this dau noi nuoc.
	*
	* @return the ngay danh gia of this dau noi nuoc
	*/
	@Override
	public java.util.Date getNgayDanhGia() {
		return _dauNoiNuoc.getNgayDanhGia();
	}

	/**
	* Sets the ngay danh gia of this dau noi nuoc.
	*
	* @param ngayDanhGia the ngay danh gia of this dau noi nuoc
	*/
	@Override
	public void setNgayDanhGia(java.util.Date ngayDanhGia) {
		_dauNoiNuoc.setNgayDanhGia(ngayDanhGia);
	}

	/**
	* Returns the id nguoi danh gia of this dau noi nuoc.
	*
	* @return the id nguoi danh gia of this dau noi nuoc
	*/
	@Override
	public int getIdNguoiDanhGia() {
		return _dauNoiNuoc.getIdNguoiDanhGia();
	}

	/**
	* Sets the id nguoi danh gia of this dau noi nuoc.
	*
	* @param idNguoiDanhGia the id nguoi danh gia of this dau noi nuoc
	*/
	@Override
	public void setIdNguoiDanhGia(int idNguoiDanhGia) {
		_dauNoiNuoc.setIdNguoiDanhGia(idNguoiDanhGia);
	}

	@Override
	public boolean isNew() {
		return _dauNoiNuoc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dauNoiNuoc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dauNoiNuoc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dauNoiNuoc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dauNoiNuoc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dauNoiNuoc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dauNoiNuoc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dauNoiNuoc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dauNoiNuoc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dauNoiNuoc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dauNoiNuoc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DauNoiNuocWrapper((DauNoiNuoc)_dauNoiNuoc.clone());
	}

	@Override
	public int compareTo(vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc dauNoiNuoc) {
		return _dauNoiNuoc.compareTo(dauNoiNuoc);
	}

	@Override
	public int hashCode() {
		return _dauNoiNuoc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc> toCacheModel() {
		return _dauNoiNuoc.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc toEscapedModel() {
		return new DauNoiNuocWrapper(_dauNoiNuoc.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc toUnescapedModel() {
		return new DauNoiNuocWrapper(_dauNoiNuoc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dauNoiNuoc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dauNoiNuoc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dauNoiNuoc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DauNoiNuocWrapper)) {
			return false;
		}

		DauNoiNuocWrapper dauNoiNuocWrapper = (DauNoiNuocWrapper)obj;

		if (Validator.equals(_dauNoiNuoc, dauNoiNuocWrapper._dauNoiNuoc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DauNoiNuoc getWrappedDauNoiNuoc() {
		return _dauNoiNuoc;
	}

	@Override
	public DauNoiNuoc getWrappedModel() {
		return _dauNoiNuoc;
	}

	@Override
	public void resetOriginalValues() {
		_dauNoiNuoc.resetOriginalValues();
	}

	private DauNoiNuoc _dauNoiNuoc;
}