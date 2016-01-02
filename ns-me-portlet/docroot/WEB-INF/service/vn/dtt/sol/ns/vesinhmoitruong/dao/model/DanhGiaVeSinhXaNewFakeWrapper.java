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
 * This class is a wrapper for {@link DanhGiaVeSinhXaNewFake}.
 * </p>
 *
 * @author BinhTH
 * @see DanhGiaVeSinhXaNewFake
 * @generated
 */
public class DanhGiaVeSinhXaNewFakeWrapper implements DanhGiaVeSinhXaNewFake,
	ModelWrapper<DanhGiaVeSinhXaNewFake> {
	public DanhGiaVeSinhXaNewFakeWrapper(
		DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake) {
		_danhGiaVeSinhXaNewFake = danhGiaVeSinhXaNewFake;
	}

	@Override
	public Class<?> getModelClass() {
		return DanhGiaVeSinhXaNewFake.class;
	}

	@Override
	public String getModelClassName() {
		return DanhGiaVeSinhXaNewFake.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("maTinhStr", getMaTinhStr());
		attributes.put("maHuyenStr", getMaHuyenStr());
		attributes.put("maXaStr", getMaXaStr());
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
		attributes.put("dangKyVSTX", getDangKyVSTX());
		attributes.put("soNhaTieuHVSMoi", getSoNhaTieuHVSMoi());

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

		String maTinhStr = (String)attributes.get("maTinhStr");

		if (maTinhStr != null) {
			setMaTinhStr(maTinhStr);
		}

		String maHuyenStr = (String)attributes.get("maHuyenStr");

		if (maHuyenStr != null) {
			setMaHuyenStr(maHuyenStr);
		}

		String maXaStr = (String)attributes.get("maXaStr");

		if (maXaStr != null) {
			setMaXaStr(maXaStr);
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

		Integer dangKyVSTX = (Integer)attributes.get("dangKyVSTX");

		if (dangKyVSTX != null) {
			setDangKyVSTX(dangKyVSTX);
		}

		Integer soNhaTieuHVSMoi = (Integer)attributes.get("soNhaTieuHVSMoi");

		if (soNhaTieuHVSMoi != null) {
			setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		}
	}

	/**
	* Returns the primary key of this danh gia ve sinh xa new fake.
	*
	* @return the primary key of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getPrimaryKey() {
		return _danhGiaVeSinhXaNewFake.getPrimaryKey();
	}

	/**
	* Sets the primary key of this danh gia ve sinh xa new fake.
	*
	* @param primaryKey the primary key of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_danhGiaVeSinhXaNewFake.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this danh gia ve sinh xa new fake.
	*
	* @return the ID of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getId() {
		return _danhGiaVeSinhXaNewFake.getId();
	}

	/**
	* Sets the ID of this danh gia ve sinh xa new fake.
	*
	* @param id the ID of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setId(int id) {
		_danhGiaVeSinhXaNewFake.setId(id);
	}

	/**
	* Returns the ma tinh of this danh gia ve sinh xa new fake.
	*
	* @return the ma tinh of this danh gia ve sinh xa new fake
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _danhGiaVeSinhXaNewFake.getMaTinh();
	}

	/**
	* Sets the ma tinh of this danh gia ve sinh xa new fake.
	*
	* @param maTinh the ma tinh of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_danhGiaVeSinhXaNewFake.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this danh gia ve sinh xa new fake.
	*
	* @return the ma huyen of this danh gia ve sinh xa new fake
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _danhGiaVeSinhXaNewFake.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this danh gia ve sinh xa new fake.
	*
	* @param maHuyen the ma huyen of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_danhGiaVeSinhXaNewFake.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ma xa of this danh gia ve sinh xa new fake.
	*
	* @return the ma xa of this danh gia ve sinh xa new fake
	*/
	@Override
	public java.lang.String getMaXa() {
		return _danhGiaVeSinhXaNewFake.getMaXa();
	}

	/**
	* Sets the ma xa of this danh gia ve sinh xa new fake.
	*
	* @param maXa the ma xa of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_danhGiaVeSinhXaNewFake.setMaXa(maXa);
	}

	/**
	* Returns the ma tinh str of this danh gia ve sinh xa new fake.
	*
	* @return the ma tinh str of this danh gia ve sinh xa new fake
	*/
	@Override
	public java.lang.String getMaTinhStr() {
		return _danhGiaVeSinhXaNewFake.getMaTinhStr();
	}

	/**
	* Sets the ma tinh str of this danh gia ve sinh xa new fake.
	*
	* @param maTinhStr the ma tinh str of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setMaTinhStr(java.lang.String maTinhStr) {
		_danhGiaVeSinhXaNewFake.setMaTinhStr(maTinhStr);
	}

	/**
	* Returns the ma huyen str of this danh gia ve sinh xa new fake.
	*
	* @return the ma huyen str of this danh gia ve sinh xa new fake
	*/
	@Override
	public java.lang.String getMaHuyenStr() {
		return _danhGiaVeSinhXaNewFake.getMaHuyenStr();
	}

	/**
	* Sets the ma huyen str of this danh gia ve sinh xa new fake.
	*
	* @param maHuyenStr the ma huyen str of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setMaHuyenStr(java.lang.String maHuyenStr) {
		_danhGiaVeSinhXaNewFake.setMaHuyenStr(maHuyenStr);
	}

	/**
	* Returns the ma xa str of this danh gia ve sinh xa new fake.
	*
	* @return the ma xa str of this danh gia ve sinh xa new fake
	*/
	@Override
	public java.lang.String getMaXaStr() {
		return _danhGiaVeSinhXaNewFake.getMaXaStr();
	}

	/**
	* Sets the ma xa str of this danh gia ve sinh xa new fake.
	*
	* @param maXaStr the ma xa str of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setMaXaStr(java.lang.String maXaStr) {
		_danhGiaVeSinhXaNewFake.setMaXaStr(maXaStr);
	}

	/**
	* Returns the nam of this danh gia ve sinh xa new fake.
	*
	* @return the nam of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getNam() {
		return _danhGiaVeSinhXaNewFake.getNam();
	}

	/**
	* Sets the nam of this danh gia ve sinh xa new fake.
	*
	* @param nam the nam of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setNam(int nam) {
		_danhGiaVeSinhXaNewFake.setNam(nam);
	}

	/**
	* Returns the so dan of this danh gia ve sinh xa new fake.
	*
	* @return the so dan of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getSoDan() {
		return _danhGiaVeSinhXaNewFake.getSoDan();
	}

	/**
	* Sets the so dan of this danh gia ve sinh xa new fake.
	*
	* @param soDan the so dan of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setSoDan(int soDan) {
		_danhGiaVeSinhXaNewFake.setSoDan(soDan);
	}

	/**
	* Returns the tong so h g d of this danh gia ve sinh xa new fake.
	*
	* @return the tong so h g d of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getTongSoHGD() {
		return _danhGiaVeSinhXaNewFake.getTongSoHGD();
	}

	/**
	* Sets the tong so h g d of this danh gia ve sinh xa new fake.
	*
	* @param tongSoHGD the tong so h g d of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setTongSoHGD(int tongSoHGD) {
		_danhGiaVeSinhXaNewFake.setTongSoHGD(tongSoHGD);
	}

	/**
	* Returns the so h g d co nha tieu of this danh gia ve sinh xa new fake.
	*
	* @return the so h g d co nha tieu of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getSoHGDCoNhaTieu() {
		return _danhGiaVeSinhXaNewFake.getSoHGDCoNhaTieu();
	}

	/**
	* Sets the so h g d co nha tieu of this danh gia ve sinh xa new fake.
	*
	* @param soHGDCoNhaTieu the so h g d co nha tieu of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setSoHGDCoNhaTieu(int soHGDCoNhaTieu) {
		_danhGiaVeSinhXaNewFake.setSoHGDCoNhaTieu(soHGDCoNhaTieu);
	}

	/**
	* Returns the so h g d co nha tieu h v s of this danh gia ve sinh xa new fake.
	*
	* @return the so h g d co nha tieu h v s of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getSoHGDCoNhaTieuHVS() {
		return _danhGiaVeSinhXaNewFake.getSoHGDCoNhaTieuHVS();
	}

	/**
	* Sets the so h g d co nha tieu h v s of this danh gia ve sinh xa new fake.
	*
	* @param soHGDCoNhaTieuHVS the so h g d co nha tieu h v s of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setSoHGDCoNhaTieuHVS(int soHGDCoNhaTieuHVS) {
		_danhGiaVeSinhXaNewFake.setSoHGDCoNhaTieuHVS(soHGDCoNhaTieuHVS);
	}

	/**
	* Returns the so nha tieu h v s xay moi of this danh gia ve sinh xa new fake.
	*
	* @return the so nha tieu h v s xay moi of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getSoNhaTieuHVSXayMoi() {
		return _danhGiaVeSinhXaNewFake.getSoNhaTieuHVSXayMoi();
	}

	/**
	* Sets the so nha tieu h v s xay moi of this danh gia ve sinh xa new fake.
	*
	* @param soNhaTieuHVSXayMoi the so nha tieu h v s xay moi of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setSoNhaTieuHVSXayMoi(int soNhaTieuHVSXayMoi) {
		_danhGiaVeSinhXaNewFake.setSoNhaTieuHVSXayMoi(soNhaTieuHVSXayMoi);
	}

	/**
	* Returns the ti le h g d co nha tieu of this danh gia ve sinh xa new fake.
	*
	* @return the ti le h g d co nha tieu of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getTiLeHGDCoNhaTieu() {
		return _danhGiaVeSinhXaNewFake.getTiLeHGDCoNhaTieu();
	}

	/**
	* Sets the ti le h g d co nha tieu of this danh gia ve sinh xa new fake.
	*
	* @param tiLeHGDCoNhaTieu the ti le h g d co nha tieu of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setTiLeHGDCoNhaTieu(int tiLeHGDCoNhaTieu) {
		_danhGiaVeSinhXaNewFake.setTiLeHGDCoNhaTieu(tiLeHGDCoNhaTieu);
	}

	/**
	* Returns the ti le h g d co nha tieu h v s of this danh gia ve sinh xa new fake.
	*
	* @return the ti le h g d co nha tieu h v s of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getTiLeHGDCoNhaTieuHVS() {
		return _danhGiaVeSinhXaNewFake.getTiLeHGDCoNhaTieuHVS();
	}

	/**
	* Sets the ti le h g d co nha tieu h v s of this danh gia ve sinh xa new fake.
	*
	* @param tiLeHGDCoNhaTieuHVS the ti le h g d co nha tieu h v s of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setTiLeHGDCoNhaTieuHVS(int tiLeHGDCoNhaTieuHVS) {
		_danhGiaVeSinhXaNewFake.setTiLeHGDCoNhaTieuHVS(tiLeHGDCoNhaTieuHVS);
	}

	/**
	* Returns the tong so truong hoc of this danh gia ve sinh xa new fake.
	*
	* @return the tong so truong hoc of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getTongSoTruongHoc() {
		return _danhGiaVeSinhXaNewFake.getTongSoTruongHoc();
	}

	/**
	* Sets the tong so truong hoc of this danh gia ve sinh xa new fake.
	*
	* @param tongSoTruongHoc the tong so truong hoc of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setTongSoTruongHoc(int tongSoTruongHoc) {
		_danhGiaVeSinhXaNewFake.setTongSoTruongHoc(tongSoTruongHoc);
	}

	/**
	* Returns the so truong hoc h v s of this danh gia ve sinh xa new fake.
	*
	* @return the so truong hoc h v s of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getSoTruongHocHVS() {
		return _danhGiaVeSinhXaNewFake.getSoTruongHocHVS();
	}

	/**
	* Sets the so truong hoc h v s of this danh gia ve sinh xa new fake.
	*
	* @param soTruongHocHVS the so truong hoc h v s of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setSoTruongHocHVS(int soTruongHocHVS) {
		_danhGiaVeSinhXaNewFake.setSoTruongHocHVS(soTruongHocHVS);
	}

	/**
	* Returns the tong so tram y te of this danh gia ve sinh xa new fake.
	*
	* @return the tong so tram y te of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getTongSoTramYTe() {
		return _danhGiaVeSinhXaNewFake.getTongSoTramYTe();
	}

	/**
	* Sets the tong so tram y te of this danh gia ve sinh xa new fake.
	*
	* @param tongSoTramYTe the tong so tram y te of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setTongSoTramYTe(int tongSoTramYTe) {
		_danhGiaVeSinhXaNewFake.setTongSoTramYTe(tongSoTramYTe);
	}

	/**
	* Returns the so tram y te h v s of this danh gia ve sinh xa new fake.
	*
	* @return the so tram y te h v s of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getSoTramYTeHVS() {
		return _danhGiaVeSinhXaNewFake.getSoTramYTeHVS();
	}

	/**
	* Sets the so tram y te h v s of this danh gia ve sinh xa new fake.
	*
	* @param soTramYTeHVS the so tram y te h v s of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setSoTramYTeHVS(int soTramYTeHVS) {
		_danhGiaVeSinhXaNewFake.setSoTramYTeHVS(soTramYTeHVS);
	}

	/**
	* Returns the ti le truong hoc h v s of this danh gia ve sinh xa new fake.
	*
	* @return the ti le truong hoc h v s of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getTiLeTruongHocHVS() {
		return _danhGiaVeSinhXaNewFake.getTiLeTruongHocHVS();
	}

	/**
	* Sets the ti le truong hoc h v s of this danh gia ve sinh xa new fake.
	*
	* @param tiLeTruongHocHVS the ti le truong hoc h v s of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setTiLeTruongHocHVS(int tiLeTruongHocHVS) {
		_danhGiaVeSinhXaNewFake.setTiLeTruongHocHVS(tiLeTruongHocHVS);
	}

	/**
	* Returns the ti le tram y te h v s of this danh gia ve sinh xa new fake.
	*
	* @return the ti le tram y te h v s of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getTiLeTramYTeHVS() {
		return _danhGiaVeSinhXaNewFake.getTiLeTramYTeHVS();
	}

	/**
	* Sets the ti le tram y te h v s of this danh gia ve sinh xa new fake.
	*
	* @param tiLeTramYTeHVS the ti le tram y te h v s of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setTiLeTramYTeHVS(int tiLeTramYTeHVS) {
		_danhGiaVeSinhXaNewFake.setTiLeTramYTeHVS(tiLeTramYTeHVS);
	}

	/**
	* Returns the ket luan v s t x of this danh gia ve sinh xa new fake.
	*
	* @return the ket luan v s t x of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getKetLuanVSTX() {
		return _danhGiaVeSinhXaNewFake.getKetLuanVSTX();
	}

	/**
	* Sets the ket luan v s t x of this danh gia ve sinh xa new fake.
	*
	* @param ketLuanVSTX the ket luan v s t x of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setKetLuanVSTX(int ketLuanVSTX) {
		_danhGiaVeSinhXaNewFake.setKetLuanVSTX(ketLuanVSTX);
	}

	/**
	* Returns the ghi chu of this danh gia ve sinh xa new fake.
	*
	* @return the ghi chu of this danh gia ve sinh xa new fake
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _danhGiaVeSinhXaNewFake.getGhiChu();
	}

	/**
	* Sets the ghi chu of this danh gia ve sinh xa new fake.
	*
	* @param ghiChu the ghi chu of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_danhGiaVeSinhXaNewFake.setGhiChu(ghiChu);
	}

	/**
	* Returns the bao cao d l i of this danh gia ve sinh xa new fake.
	*
	* @return the bao cao d l i of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getBaoCaoDLI() {
		return _danhGiaVeSinhXaNewFake.getBaoCaoDLI();
	}

	/**
	* Sets the bao cao d l i of this danh gia ve sinh xa new fake.
	*
	* @param baoCaoDLI the bao cao d l i of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setBaoCaoDLI(int baoCaoDLI) {
		_danhGiaVeSinhXaNewFake.setBaoCaoDLI(baoCaoDLI);
	}

	/**
	* Returns the ngay tao of this danh gia ve sinh xa new fake.
	*
	* @return the ngay tao of this danh gia ve sinh xa new fake
	*/
	@Override
	public java.util.Date getNgayTao() {
		return _danhGiaVeSinhXaNewFake.getNgayTao();
	}

	/**
	* Sets the ngay tao of this danh gia ve sinh xa new fake.
	*
	* @param ngayTao the ngay tao of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setNgayTao(java.util.Date ngayTao) {
		_danhGiaVeSinhXaNewFake.setNgayTao(ngayTao);
	}

	/**
	* Returns the id nguoi tao of this danh gia ve sinh xa new fake.
	*
	* @return the id nguoi tao of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getIdNguoiTao() {
		return _danhGiaVeSinhXaNewFake.getIdNguoiTao();
	}

	/**
	* Sets the id nguoi tao of this danh gia ve sinh xa new fake.
	*
	* @param idNguoiTao the id nguoi tao of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setIdNguoiTao(int idNguoiTao) {
		_danhGiaVeSinhXaNewFake.setIdNguoiTao(idNguoiTao);
	}

	/**
	* Returns the dang ky v s t x of this danh gia ve sinh xa new fake.
	*
	* @return the dang ky v s t x of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getDangKyVSTX() {
		return _danhGiaVeSinhXaNewFake.getDangKyVSTX();
	}

	/**
	* Sets the dang ky v s t x of this danh gia ve sinh xa new fake.
	*
	* @param dangKyVSTX the dang ky v s t x of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setDangKyVSTX(int dangKyVSTX) {
		_danhGiaVeSinhXaNewFake.setDangKyVSTX(dangKyVSTX);
	}

	/**
	* Returns the so nha tieu h v s moi of this danh gia ve sinh xa new fake.
	*
	* @return the so nha tieu h v s moi of this danh gia ve sinh xa new fake
	*/
	@Override
	public int getSoNhaTieuHVSMoi() {
		return _danhGiaVeSinhXaNewFake.getSoNhaTieuHVSMoi();
	}

	/**
	* Sets the so nha tieu h v s moi of this danh gia ve sinh xa new fake.
	*
	* @param soNhaTieuHVSMoi the so nha tieu h v s moi of this danh gia ve sinh xa new fake
	*/
	@Override
	public void setSoNhaTieuHVSMoi(int soNhaTieuHVSMoi) {
		_danhGiaVeSinhXaNewFake.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
	}

	@Override
	public boolean isNew() {
		return _danhGiaVeSinhXaNewFake.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_danhGiaVeSinhXaNewFake.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _danhGiaVeSinhXaNewFake.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_danhGiaVeSinhXaNewFake.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _danhGiaVeSinhXaNewFake.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _danhGiaVeSinhXaNewFake.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_danhGiaVeSinhXaNewFake.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _danhGiaVeSinhXaNewFake.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_danhGiaVeSinhXaNewFake.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_danhGiaVeSinhXaNewFake.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_danhGiaVeSinhXaNewFake.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DanhGiaVeSinhXaNewFakeWrapper((DanhGiaVeSinhXaNewFake)_danhGiaVeSinhXaNewFake.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake) {
		return _danhGiaVeSinhXaNewFake.compareTo(danhGiaVeSinhXaNewFake);
	}

	@Override
	public int hashCode() {
		return _danhGiaVeSinhXaNewFake.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake> toCacheModel() {
		return _danhGiaVeSinhXaNewFake.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake toEscapedModel() {
		return new DanhGiaVeSinhXaNewFakeWrapper(_danhGiaVeSinhXaNewFake.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake toUnescapedModel() {
		return new DanhGiaVeSinhXaNewFakeWrapper(_danhGiaVeSinhXaNewFake.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _danhGiaVeSinhXaNewFake.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _danhGiaVeSinhXaNewFake.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_danhGiaVeSinhXaNewFake.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DanhGiaVeSinhXaNewFakeWrapper)) {
			return false;
		}

		DanhGiaVeSinhXaNewFakeWrapper danhGiaVeSinhXaNewFakeWrapper = (DanhGiaVeSinhXaNewFakeWrapper)obj;

		if (Validator.equals(_danhGiaVeSinhXaNewFake,
					danhGiaVeSinhXaNewFakeWrapper._danhGiaVeSinhXaNewFake)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DanhGiaVeSinhXaNewFake getWrappedDanhGiaVeSinhXaNewFake() {
		return _danhGiaVeSinhXaNewFake;
	}

	@Override
	public DanhGiaVeSinhXaNewFake getWrappedModel() {
		return _danhGiaVeSinhXaNewFake;
	}

	@Override
	public void resetOriginalValues() {
		_danhGiaVeSinhXaNewFake.resetOriginalValues();
	}

	private DanhGiaVeSinhXaNewFake _danhGiaVeSinhXaNewFake;
}