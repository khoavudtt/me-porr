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
 * This class is a wrapper for {@link DanhGiaVeSinhXaNew}.
 * </p>
 *
 * @author BinhTH
 * @see DanhGiaVeSinhXaNew
 * @generated
 */
public class DanhGiaVeSinhXaNewWrapper implements DanhGiaVeSinhXaNew,
	ModelWrapper<DanhGiaVeSinhXaNew> {
	public DanhGiaVeSinhXaNewWrapper(DanhGiaVeSinhXaNew danhGiaVeSinhXaNew) {
		_danhGiaVeSinhXaNew = danhGiaVeSinhXaNew;
	}

	@Override
	public Class<?> getModelClass() {
		return DanhGiaVeSinhXaNew.class;
	}

	@Override
	public String getModelClassName() {
		return DanhGiaVeSinhXaNew.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("nam", getNam());
		attributes.put("soDan", getSoDan());
		attributes.put("tongSoHGD", getTongSoHGD());
		attributes.put("soHGDCoNhaTieu", getSoHGDCoNhaTieu());
		attributes.put("soHGDCoNhaTieuHVS", getSoHGDCoNhaTieuHVS());
		attributes.put("soNhaTieuHVSXayMoi", getSoNhaTieuHVSXayMoi());
		attributes.put("tiLeHGDCoNhaTieu", getTiLeHGDCoNhaTieu());
		attributes.put("tiLeHGDCoNhaTieuHVS", getTiLeHGDCoNhaTieuHVS());
		attributes.put("tongSoTruongHoc", getTongSoTruongHoc());
		attributes.put("soTruongHocHVS", getSoTruongHocHVS());
		attributes.put("tongSoTramYTe", getTongSoTramYTe());
		attributes.put("soTramYTeHVS", getSoTramYTeHVS());
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
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
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

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer soDan = (Integer)attributes.get("soDan");

		if (soDan != null) {
			setSoDan(soDan);
		}

		Integer tongSoHGD = (Integer)attributes.get("tongSoHGD");

		if (tongSoHGD != null) {
			setTongSoHGD(tongSoHGD);
		}

		Integer soHGDCoNhaTieu = (Integer)attributes.get("soHGDCoNhaTieu");

		if (soHGDCoNhaTieu != null) {
			setSoHGDCoNhaTieu(soHGDCoNhaTieu);
		}

		Integer soHGDCoNhaTieuHVS = (Integer)attributes.get("soHGDCoNhaTieuHVS");

		if (soHGDCoNhaTieuHVS != null) {
			setSoHGDCoNhaTieuHVS(soHGDCoNhaTieuHVS);
		}

		Integer soNhaTieuHVSXayMoi = (Integer)attributes.get(
				"soNhaTieuHVSXayMoi");

		if (soNhaTieuHVSXayMoi != null) {
			setSoNhaTieuHVSXayMoi(soNhaTieuHVSXayMoi);
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

		Integer tongSoTruongHoc = (Integer)attributes.get("tongSoTruongHoc");

		if (tongSoTruongHoc != null) {
			setTongSoTruongHoc(tongSoTruongHoc);
		}

		Integer soTruongHocHVS = (Integer)attributes.get("soTruongHocHVS");

		if (soTruongHocHVS != null) {
			setSoTruongHocHVS(soTruongHocHVS);
		}

		Integer tongSoTramYTe = (Integer)attributes.get("tongSoTramYTe");

		if (tongSoTramYTe != null) {
			setTongSoTramYTe(tongSoTramYTe);
		}

		Integer soTramYTeHVS = (Integer)attributes.get("soTramYTeHVS");

		if (soTramYTeHVS != null) {
			setSoTramYTeHVS(soTramYTeHVS);
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

		String ghiChu = (String)attributes.get("ghiChu");

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

		Integer idNguoiTao = (Integer)attributes.get("idNguoiTao");

		if (idNguoiTao != null) {
			setIdNguoiTao(idNguoiTao);
		}
	}

	/**
	* Returns the primary key of this danh gia ve sinh xa new.
	*
	* @return the primary key of this danh gia ve sinh xa new
	*/
	@Override
	public int getPrimaryKey() {
		return _danhGiaVeSinhXaNew.getPrimaryKey();
	}

	/**
	* Sets the primary key of this danh gia ve sinh xa new.
	*
	* @param primaryKey the primary key of this danh gia ve sinh xa new
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_danhGiaVeSinhXaNew.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this danh gia ve sinh xa new.
	*
	* @return the ID of this danh gia ve sinh xa new
	*/
	@Override
	public int getId() {
		return _danhGiaVeSinhXaNew.getId();
	}

	/**
	* Sets the ID of this danh gia ve sinh xa new.
	*
	* @param id the ID of this danh gia ve sinh xa new
	*/
	@Override
	public void setId(int id) {
		_danhGiaVeSinhXaNew.setId(id);
	}

	/**
	* Returns the ma tinh of this danh gia ve sinh xa new.
	*
	* @return the ma tinh of this danh gia ve sinh xa new
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _danhGiaVeSinhXaNew.getMaTinh();
	}

	/**
	* Sets the ma tinh of this danh gia ve sinh xa new.
	*
	* @param maTinh the ma tinh of this danh gia ve sinh xa new
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_danhGiaVeSinhXaNew.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this danh gia ve sinh xa new.
	*
	* @return the ma huyen of this danh gia ve sinh xa new
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _danhGiaVeSinhXaNew.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this danh gia ve sinh xa new.
	*
	* @param maHuyen the ma huyen of this danh gia ve sinh xa new
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_danhGiaVeSinhXaNew.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ma xa of this danh gia ve sinh xa new.
	*
	* @return the ma xa of this danh gia ve sinh xa new
	*/
	@Override
	public java.lang.String getMaXa() {
		return _danhGiaVeSinhXaNew.getMaXa();
	}

	/**
	* Sets the ma xa of this danh gia ve sinh xa new.
	*
	* @param maXa the ma xa of this danh gia ve sinh xa new
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_danhGiaVeSinhXaNew.setMaXa(maXa);
	}

	/**
	* Returns the nam of this danh gia ve sinh xa new.
	*
	* @return the nam of this danh gia ve sinh xa new
	*/
	@Override
	public int getNam() {
		return _danhGiaVeSinhXaNew.getNam();
	}

	/**
	* Sets the nam of this danh gia ve sinh xa new.
	*
	* @param nam the nam of this danh gia ve sinh xa new
	*/
	@Override
	public void setNam(int nam) {
		_danhGiaVeSinhXaNew.setNam(nam);
	}

	/**
	* Returns the so dan of this danh gia ve sinh xa new.
	*
	* @return the so dan of this danh gia ve sinh xa new
	*/
	@Override
	public int getSoDan() {
		return _danhGiaVeSinhXaNew.getSoDan();
	}

	/**
	* Sets the so dan of this danh gia ve sinh xa new.
	*
	* @param soDan the so dan of this danh gia ve sinh xa new
	*/
	@Override
	public void setSoDan(int soDan) {
		_danhGiaVeSinhXaNew.setSoDan(soDan);
	}

	/**
	* Returns the tong so h g d of this danh gia ve sinh xa new.
	*
	* @return the tong so h g d of this danh gia ve sinh xa new
	*/
	@Override
	public int getTongSoHGD() {
		return _danhGiaVeSinhXaNew.getTongSoHGD();
	}

	/**
	* Sets the tong so h g d of this danh gia ve sinh xa new.
	*
	* @param tongSoHGD the tong so h g d of this danh gia ve sinh xa new
	*/
	@Override
	public void setTongSoHGD(int tongSoHGD) {
		_danhGiaVeSinhXaNew.setTongSoHGD(tongSoHGD);
	}

	/**
	* Returns the so h g d co nha tieu of this danh gia ve sinh xa new.
	*
	* @return the so h g d co nha tieu of this danh gia ve sinh xa new
	*/
	@Override
	public int getSoHGDCoNhaTieu() {
		return _danhGiaVeSinhXaNew.getSoHGDCoNhaTieu();
	}

	/**
	* Sets the so h g d co nha tieu of this danh gia ve sinh xa new.
	*
	* @param soHGDCoNhaTieu the so h g d co nha tieu of this danh gia ve sinh xa new
	*/
	@Override
	public void setSoHGDCoNhaTieu(int soHGDCoNhaTieu) {
		_danhGiaVeSinhXaNew.setSoHGDCoNhaTieu(soHGDCoNhaTieu);
	}

	/**
	* Returns the so h g d co nha tieu h v s of this danh gia ve sinh xa new.
	*
	* @return the so h g d co nha tieu h v s of this danh gia ve sinh xa new
	*/
	@Override
	public int getSoHGDCoNhaTieuHVS() {
		return _danhGiaVeSinhXaNew.getSoHGDCoNhaTieuHVS();
	}

	/**
	* Sets the so h g d co nha tieu h v s of this danh gia ve sinh xa new.
	*
	* @param soHGDCoNhaTieuHVS the so h g d co nha tieu h v s of this danh gia ve sinh xa new
	*/
	@Override
	public void setSoHGDCoNhaTieuHVS(int soHGDCoNhaTieuHVS) {
		_danhGiaVeSinhXaNew.setSoHGDCoNhaTieuHVS(soHGDCoNhaTieuHVS);
	}

	/**
	* Returns the so nha tieu h v s xay moi of this danh gia ve sinh xa new.
	*
	* @return the so nha tieu h v s xay moi of this danh gia ve sinh xa new
	*/
	@Override
	public int getSoNhaTieuHVSXayMoi() {
		return _danhGiaVeSinhXaNew.getSoNhaTieuHVSXayMoi();
	}

	/**
	* Sets the so nha tieu h v s xay moi of this danh gia ve sinh xa new.
	*
	* @param soNhaTieuHVSXayMoi the so nha tieu h v s xay moi of this danh gia ve sinh xa new
	*/
	@Override
	public void setSoNhaTieuHVSXayMoi(int soNhaTieuHVSXayMoi) {
		_danhGiaVeSinhXaNew.setSoNhaTieuHVSXayMoi(soNhaTieuHVSXayMoi);
	}

	/**
	* Returns the ti le h g d co nha tieu of this danh gia ve sinh xa new.
	*
	* @return the ti le h g d co nha tieu of this danh gia ve sinh xa new
	*/
	@Override
	public int getTiLeHGDCoNhaTieu() {
		return _danhGiaVeSinhXaNew.getTiLeHGDCoNhaTieu();
	}

	/**
	* Sets the ti le h g d co nha tieu of this danh gia ve sinh xa new.
	*
	* @param tiLeHGDCoNhaTieu the ti le h g d co nha tieu of this danh gia ve sinh xa new
	*/
	@Override
	public void setTiLeHGDCoNhaTieu(int tiLeHGDCoNhaTieu) {
		_danhGiaVeSinhXaNew.setTiLeHGDCoNhaTieu(tiLeHGDCoNhaTieu);
	}

	/**
	* Returns the ti le h g d co nha tieu h v s of this danh gia ve sinh xa new.
	*
	* @return the ti le h g d co nha tieu h v s of this danh gia ve sinh xa new
	*/
	@Override
	public int getTiLeHGDCoNhaTieuHVS() {
		return _danhGiaVeSinhXaNew.getTiLeHGDCoNhaTieuHVS();
	}

	/**
	* Sets the ti le h g d co nha tieu h v s of this danh gia ve sinh xa new.
	*
	* @param tiLeHGDCoNhaTieuHVS the ti le h g d co nha tieu h v s of this danh gia ve sinh xa new
	*/
	@Override
	public void setTiLeHGDCoNhaTieuHVS(int tiLeHGDCoNhaTieuHVS) {
		_danhGiaVeSinhXaNew.setTiLeHGDCoNhaTieuHVS(tiLeHGDCoNhaTieuHVS);
	}

	/**
	* Returns the tong so truong hoc of this danh gia ve sinh xa new.
	*
	* @return the tong so truong hoc of this danh gia ve sinh xa new
	*/
	@Override
	public int getTongSoTruongHoc() {
		return _danhGiaVeSinhXaNew.getTongSoTruongHoc();
	}

	/**
	* Sets the tong so truong hoc of this danh gia ve sinh xa new.
	*
	* @param tongSoTruongHoc the tong so truong hoc of this danh gia ve sinh xa new
	*/
	@Override
	public void setTongSoTruongHoc(int tongSoTruongHoc) {
		_danhGiaVeSinhXaNew.setTongSoTruongHoc(tongSoTruongHoc);
	}

	/**
	* Returns the so truong hoc h v s of this danh gia ve sinh xa new.
	*
	* @return the so truong hoc h v s of this danh gia ve sinh xa new
	*/
	@Override
	public int getSoTruongHocHVS() {
		return _danhGiaVeSinhXaNew.getSoTruongHocHVS();
	}

	/**
	* Sets the so truong hoc h v s of this danh gia ve sinh xa new.
	*
	* @param soTruongHocHVS the so truong hoc h v s of this danh gia ve sinh xa new
	*/
	@Override
	public void setSoTruongHocHVS(int soTruongHocHVS) {
		_danhGiaVeSinhXaNew.setSoTruongHocHVS(soTruongHocHVS);
	}

	/**
	* Returns the tong so tram y te of this danh gia ve sinh xa new.
	*
	* @return the tong so tram y te of this danh gia ve sinh xa new
	*/
	@Override
	public int getTongSoTramYTe() {
		return _danhGiaVeSinhXaNew.getTongSoTramYTe();
	}

	/**
	* Sets the tong so tram y te of this danh gia ve sinh xa new.
	*
	* @param tongSoTramYTe the tong so tram y te of this danh gia ve sinh xa new
	*/
	@Override
	public void setTongSoTramYTe(int tongSoTramYTe) {
		_danhGiaVeSinhXaNew.setTongSoTramYTe(tongSoTramYTe);
	}

	/**
	* Returns the so tram y te h v s of this danh gia ve sinh xa new.
	*
	* @return the so tram y te h v s of this danh gia ve sinh xa new
	*/
	@Override
	public int getSoTramYTeHVS() {
		return _danhGiaVeSinhXaNew.getSoTramYTeHVS();
	}

	/**
	* Sets the so tram y te h v s of this danh gia ve sinh xa new.
	*
	* @param soTramYTeHVS the so tram y te h v s of this danh gia ve sinh xa new
	*/
	@Override
	public void setSoTramYTeHVS(int soTramYTeHVS) {
		_danhGiaVeSinhXaNew.setSoTramYTeHVS(soTramYTeHVS);
	}

	/**
	* Returns the ti le truong hoc h v s of this danh gia ve sinh xa new.
	*
	* @return the ti le truong hoc h v s of this danh gia ve sinh xa new
	*/
	@Override
	public int getTiLeTruongHocHVS() {
		return _danhGiaVeSinhXaNew.getTiLeTruongHocHVS();
	}

	/**
	* Sets the ti le truong hoc h v s of this danh gia ve sinh xa new.
	*
	* @param tiLeTruongHocHVS the ti le truong hoc h v s of this danh gia ve sinh xa new
	*/
	@Override
	public void setTiLeTruongHocHVS(int tiLeTruongHocHVS) {
		_danhGiaVeSinhXaNew.setTiLeTruongHocHVS(tiLeTruongHocHVS);
	}

	/**
	* Returns the ti le tram y te h v s of this danh gia ve sinh xa new.
	*
	* @return the ti le tram y te h v s of this danh gia ve sinh xa new
	*/
	@Override
	public int getTiLeTramYTeHVS() {
		return _danhGiaVeSinhXaNew.getTiLeTramYTeHVS();
	}

	/**
	* Sets the ti le tram y te h v s of this danh gia ve sinh xa new.
	*
	* @param tiLeTramYTeHVS the ti le tram y te h v s of this danh gia ve sinh xa new
	*/
	@Override
	public void setTiLeTramYTeHVS(int tiLeTramYTeHVS) {
		_danhGiaVeSinhXaNew.setTiLeTramYTeHVS(tiLeTramYTeHVS);
	}

	/**
	* Returns the ket luan v s t x of this danh gia ve sinh xa new.
	*
	* @return the ket luan v s t x of this danh gia ve sinh xa new
	*/
	@Override
	public int getKetLuanVSTX() {
		return _danhGiaVeSinhXaNew.getKetLuanVSTX();
	}

	/**
	* Sets the ket luan v s t x of this danh gia ve sinh xa new.
	*
	* @param ketLuanVSTX the ket luan v s t x of this danh gia ve sinh xa new
	*/
	@Override
	public void setKetLuanVSTX(int ketLuanVSTX) {
		_danhGiaVeSinhXaNew.setKetLuanVSTX(ketLuanVSTX);
	}

	/**
	* Returns the ghi chu of this danh gia ve sinh xa new.
	*
	* @return the ghi chu of this danh gia ve sinh xa new
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _danhGiaVeSinhXaNew.getGhiChu();
	}

	/**
	* Sets the ghi chu of this danh gia ve sinh xa new.
	*
	* @param ghiChu the ghi chu of this danh gia ve sinh xa new
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_danhGiaVeSinhXaNew.setGhiChu(ghiChu);
	}

	/**
	* Returns the bao cao d l i of this danh gia ve sinh xa new.
	*
	* @return the bao cao d l i of this danh gia ve sinh xa new
	*/
	@Override
	public int getBaoCaoDLI() {
		return _danhGiaVeSinhXaNew.getBaoCaoDLI();
	}

	/**
	* Sets the bao cao d l i of this danh gia ve sinh xa new.
	*
	* @param baoCaoDLI the bao cao d l i of this danh gia ve sinh xa new
	*/
	@Override
	public void setBaoCaoDLI(int baoCaoDLI) {
		_danhGiaVeSinhXaNew.setBaoCaoDLI(baoCaoDLI);
	}

	/**
	* Returns the ngay tao of this danh gia ve sinh xa new.
	*
	* @return the ngay tao of this danh gia ve sinh xa new
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _danhGiaVeSinhXaNew.getNgayTao();
	}

	/**
	* Sets the ngay tao of this danh gia ve sinh xa new.
	*
	* @param ngayTao the ngay tao of this danh gia ve sinh xa new
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_danhGiaVeSinhXaNew.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this danh gia ve sinh xa new.
	*
	* @return the id nguoi tao of this danh gia ve sinh xa new
	*/
	@Override
	public int getIdNguoiTao() {
		return _danhGiaVeSinhXaNew.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this danh gia ve sinh xa new.
	*
	* @param idNguoiTao the id nguoi tao of this danh gia ve sinh xa new
	*/
	@Override
	public void setIdNguoiTao(int idNguoiTao) {
		_danhGiaVeSinhXaNew.setIdNguoiTao(idNguoiTao);
	}

	@Override
	public boolean isNew() {
		return _danhGiaVeSinhXaNew.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_danhGiaVeSinhXaNew.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _danhGiaVeSinhXaNew.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_danhGiaVeSinhXaNew.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _danhGiaVeSinhXaNew.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _danhGiaVeSinhXaNew.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_danhGiaVeSinhXaNew.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _danhGiaVeSinhXaNew.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_danhGiaVeSinhXaNew.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_danhGiaVeSinhXaNew.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_danhGiaVeSinhXaNew.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DanhGiaVeSinhXaNewWrapper((DanhGiaVeSinhXaNew)_danhGiaVeSinhXaNew.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew danhGiaVeSinhXaNew) {
		return _danhGiaVeSinhXaNew.compareTo(danhGiaVeSinhXaNew);
	}

	@Override
	public int hashCode() {
		return _danhGiaVeSinhXaNew.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew> toCacheModel() {
		return _danhGiaVeSinhXaNew.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew toEscapedModel() {
		return new DanhGiaVeSinhXaNewWrapper(_danhGiaVeSinhXaNew.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew toUnescapedModel() {
		return new DanhGiaVeSinhXaNewWrapper(_danhGiaVeSinhXaNew.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _danhGiaVeSinhXaNew.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _danhGiaVeSinhXaNew.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_danhGiaVeSinhXaNew.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DanhGiaVeSinhXaNewWrapper)) {
			return false;
		}

		DanhGiaVeSinhXaNewWrapper danhGiaVeSinhXaNewWrapper = (DanhGiaVeSinhXaNewWrapper)obj;

		if (Validator.equals(_danhGiaVeSinhXaNew,
					danhGiaVeSinhXaNewWrapper._danhGiaVeSinhXaNew)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DanhGiaVeSinhXaNew getWrappedDanhGiaVeSinhXaNew() {
		return _danhGiaVeSinhXaNew;
	}

	@Override
	public DanhGiaVeSinhXaNew getWrappedModel() {
		return _danhGiaVeSinhXaNew;
	}

	@Override
	public void resetOriginalValues() {
		_danhGiaVeSinhXaNew.resetOriginalValues();
	}

	private DanhGiaVeSinhXaNew _danhGiaVeSinhXaNew;
}