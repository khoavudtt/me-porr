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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ChiTietKiemDemCongTrinh}.
 * </p>
 *
 * @author BinhTH
 * @see ChiTietKiemDemCongTrinh
 * @generated
 */
public class ChiTietKiemDemCongTrinhWrapper implements ChiTietKiemDemCongTrinh,
	ModelWrapper<ChiTietKiemDemCongTrinh> {
	public ChiTietKiemDemCongTrinhWrapper(
		ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh) {
		_chiTietKiemDemCongTrinh = chiTietKiemDemCongTrinh;
	}

	@Override
	public Class<?> getModelClass() {
		return ChiTietKiemDemCongTrinh.class;
	}

	@Override
	public String getModelClassName() {
		return ChiTietKiemDemCongTrinh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thongTinKiemDemCongTrinhId",
			getThongTinKiemDemCongTrinhId());
		attributes.put("soHoTieu", getSoHoTieu());
		attributes.put("loaiNhaTieu", getLoaiNhaTieu());
		attributes.put("anhToanCanh", getAnhToanCanh());
		attributes.put("anhTrongNhaTieu", getAnhTrongNhaTieu());
		attributes.put("veSinhSachSe", getVeSinhSachSe());
		attributes.put("deLamVeSinh", getDeLamVeSinh());
		attributes.put("muiVeSinh", getMuiVeSinh());
		attributes.put("phiaTrenKinDao", getPhiaTrenKinDao());
		attributes.put("duCheMuaGio", getDuCheMuaGio());
		attributes.put("sanCaoTrenToiThieu", getSanCaoTrenToiThieu());
		attributes.put("coCongTrinhRuaTay", getCoCongTrinhRuaTay());
		attributes.put("chiTietCongTrinhRuaTay", getChiTietCongTrinhRuaTay());
		attributes.put("anhBeChua", getAnhBeChua());
		attributes.put("napBeConTot", getNapBeConTot());
		attributes.put("cuaPhanBitKin", getCuaPhanBitKin());
		attributes.put("tranRaNgoai", getTranRaNgoai());
		attributes.put("nuocThaiDiDau", getNuocThaiDiDau());
		attributes.put("khoangCachNguonNuoc", getKhoangCachNguonNuoc());
		attributes.put("ngapKhiMuaLon", getNgapKhiMuaLon());
		attributes.put("tenCongTrinh", getTenCongTrinh());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thongTinKiemDemCongTrinhId = (Integer)attributes.get(
				"thongTinKiemDemCongTrinhId");

		if (thongTinKiemDemCongTrinhId != null) {
			setThongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId);
		}

		Integer soHoTieu = (Integer)attributes.get("soHoTieu");

		if (soHoTieu != null) {
			setSoHoTieu(soHoTieu);
		}

		String loaiNhaTieu = (String)attributes.get("loaiNhaTieu");

		if (loaiNhaTieu != null) {
			setLoaiNhaTieu(loaiNhaTieu);
		}

		String anhToanCanh = (String)attributes.get("anhToanCanh");

		if (anhToanCanh != null) {
			setAnhToanCanh(anhToanCanh);
		}

		String anhTrongNhaTieu = (String)attributes.get("anhTrongNhaTieu");

		if (anhTrongNhaTieu != null) {
			setAnhTrongNhaTieu(anhTrongNhaTieu);
		}

		Integer veSinhSachSe = (Integer)attributes.get("veSinhSachSe");

		if (veSinhSachSe != null) {
			setVeSinhSachSe(veSinhSachSe);
		}

		Integer deLamVeSinh = (Integer)attributes.get("deLamVeSinh");

		if (deLamVeSinh != null) {
			setDeLamVeSinh(deLamVeSinh);
		}

		Integer muiVeSinh = (Integer)attributes.get("muiVeSinh");

		if (muiVeSinh != null) {
			setMuiVeSinh(muiVeSinh);
		}

		Integer phiaTrenKinDao = (Integer)attributes.get("phiaTrenKinDao");

		if (phiaTrenKinDao != null) {
			setPhiaTrenKinDao(phiaTrenKinDao);
		}

		Integer duCheMuaGio = (Integer)attributes.get("duCheMuaGio");

		if (duCheMuaGio != null) {
			setDuCheMuaGio(duCheMuaGio);
		}

		Integer sanCaoTrenToiThieu = (Integer)attributes.get(
				"sanCaoTrenToiThieu");

		if (sanCaoTrenToiThieu != null) {
			setSanCaoTrenToiThieu(sanCaoTrenToiThieu);
		}

		Integer coCongTrinhRuaTay = (Integer)attributes.get("coCongTrinhRuaTay");

		if (coCongTrinhRuaTay != null) {
			setCoCongTrinhRuaTay(coCongTrinhRuaTay);
		}

		String chiTietCongTrinhRuaTay = (String)attributes.get(
				"chiTietCongTrinhRuaTay");

		if (chiTietCongTrinhRuaTay != null) {
			setChiTietCongTrinhRuaTay(chiTietCongTrinhRuaTay);
		}

		String anhBeChua = (String)attributes.get("anhBeChua");

		if (anhBeChua != null) {
			setAnhBeChua(anhBeChua);
		}

		Integer napBeConTot = (Integer)attributes.get("napBeConTot");

		if (napBeConTot != null) {
			setNapBeConTot(napBeConTot);
		}

		Integer cuaPhanBitKin = (Integer)attributes.get("cuaPhanBitKin");

		if (cuaPhanBitKin != null) {
			setCuaPhanBitKin(cuaPhanBitKin);
		}

		Integer tranRaNgoai = (Integer)attributes.get("tranRaNgoai");

		if (tranRaNgoai != null) {
			setTranRaNgoai(tranRaNgoai);
		}

		Integer nuocThaiDiDau = (Integer)attributes.get("nuocThaiDiDau");

		if (nuocThaiDiDau != null) {
			setNuocThaiDiDau(nuocThaiDiDau);
		}

		Integer khoangCachNguonNuoc = (Integer)attributes.get(
				"khoangCachNguonNuoc");

		if (khoangCachNguonNuoc != null) {
			setKhoangCachNguonNuoc(khoangCachNguonNuoc);
		}

		Integer ngapKhiMuaLon = (Integer)attributes.get("ngapKhiMuaLon");

		if (ngapKhiMuaLon != null) {
			setNgapKhiMuaLon(ngapKhiMuaLon);
		}

		String tenCongTrinh = (String)attributes.get("tenCongTrinh");

		if (tenCongTrinh != null) {
			setTenCongTrinh(tenCongTrinh);
		}
	}

	/**
	* Returns the primary key of this chi tiet kiem dem cong trinh.
	*
	* @return the primary key of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getPrimaryKey() {
		return _chiTietKiemDemCongTrinh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this chi tiet kiem dem cong trinh.
	*
	* @param primaryKey the primary key of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_chiTietKiemDemCongTrinh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this chi tiet kiem dem cong trinh.
	*
	* @return the ID of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getId() {
		return _chiTietKiemDemCongTrinh.getId();
	}

	/**
	* Sets the ID of this chi tiet kiem dem cong trinh.
	*
	* @param id the ID of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setId(int id) {
		_chiTietKiemDemCongTrinh.setId(id);
	}

	/**
	* Returns the thong tin kiem dem cong trinh ID of this chi tiet kiem dem cong trinh.
	*
	* @return the thong tin kiem dem cong trinh ID of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getThongTinKiemDemCongTrinhId() {
		return _chiTietKiemDemCongTrinh.getThongTinKiemDemCongTrinhId();
	}

	/**
	* Sets the thong tin kiem dem cong trinh ID of this chi tiet kiem dem cong trinh.
	*
	* @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setThongTinKiemDemCongTrinhId(int thongTinKiemDemCongTrinhId) {
		_chiTietKiemDemCongTrinh.setThongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId);
	}

	/**
	* Returns the so ho tieu of this chi tiet kiem dem cong trinh.
	*
	* @return the so ho tieu of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getSoHoTieu() {
		return _chiTietKiemDemCongTrinh.getSoHoTieu();
	}

	/**
	* Sets the so ho tieu of this chi tiet kiem dem cong trinh.
	*
	* @param soHoTieu the so ho tieu of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setSoHoTieu(int soHoTieu) {
		_chiTietKiemDemCongTrinh.setSoHoTieu(soHoTieu);
	}

	/**
	* Returns the loai nha tieu of this chi tiet kiem dem cong trinh.
	*
	* @return the loai nha tieu of this chi tiet kiem dem cong trinh
	*/
	@Override
	public java.lang.String getLoaiNhaTieu() {
		return _chiTietKiemDemCongTrinh.getLoaiNhaTieu();
	}

	/**
	* Sets the loai nha tieu of this chi tiet kiem dem cong trinh.
	*
	* @param loaiNhaTieu the loai nha tieu of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setLoaiNhaTieu(java.lang.String loaiNhaTieu) {
		_chiTietKiemDemCongTrinh.setLoaiNhaTieu(loaiNhaTieu);
	}

	/**
	* Returns the anh toan canh of this chi tiet kiem dem cong trinh.
	*
	* @return the anh toan canh of this chi tiet kiem dem cong trinh
	*/
	@Override
	public java.lang.String getAnhToanCanh() {
		return _chiTietKiemDemCongTrinh.getAnhToanCanh();
	}

	/**
	* Sets the anh toan canh of this chi tiet kiem dem cong trinh.
	*
	* @param anhToanCanh the anh toan canh of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setAnhToanCanh(java.lang.String anhToanCanh) {
		_chiTietKiemDemCongTrinh.setAnhToanCanh(anhToanCanh);
	}

	/**
	* Returns the anh trong nha tieu of this chi tiet kiem dem cong trinh.
	*
	* @return the anh trong nha tieu of this chi tiet kiem dem cong trinh
	*/
	@Override
	public java.lang.String getAnhTrongNhaTieu() {
		return _chiTietKiemDemCongTrinh.getAnhTrongNhaTieu();
	}

	/**
	* Sets the anh trong nha tieu of this chi tiet kiem dem cong trinh.
	*
	* @param anhTrongNhaTieu the anh trong nha tieu of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setAnhTrongNhaTieu(java.lang.String anhTrongNhaTieu) {
		_chiTietKiemDemCongTrinh.setAnhTrongNhaTieu(anhTrongNhaTieu);
	}

	/**
	* Returns the ve sinh sach se of this chi tiet kiem dem cong trinh.
	*
	* @return the ve sinh sach se of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getVeSinhSachSe() {
		return _chiTietKiemDemCongTrinh.getVeSinhSachSe();
	}

	/**
	* Sets the ve sinh sach se of this chi tiet kiem dem cong trinh.
	*
	* @param veSinhSachSe the ve sinh sach se of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setVeSinhSachSe(int veSinhSachSe) {
		_chiTietKiemDemCongTrinh.setVeSinhSachSe(veSinhSachSe);
	}

	/**
	* Returns the de lam ve sinh of this chi tiet kiem dem cong trinh.
	*
	* @return the de lam ve sinh of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getDeLamVeSinh() {
		return _chiTietKiemDemCongTrinh.getDeLamVeSinh();
	}

	/**
	* Sets the de lam ve sinh of this chi tiet kiem dem cong trinh.
	*
	* @param deLamVeSinh the de lam ve sinh of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setDeLamVeSinh(int deLamVeSinh) {
		_chiTietKiemDemCongTrinh.setDeLamVeSinh(deLamVeSinh);
	}

	/**
	* Returns the mui ve sinh of this chi tiet kiem dem cong trinh.
	*
	* @return the mui ve sinh of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getMuiVeSinh() {
		return _chiTietKiemDemCongTrinh.getMuiVeSinh();
	}

	/**
	* Sets the mui ve sinh of this chi tiet kiem dem cong trinh.
	*
	* @param muiVeSinh the mui ve sinh of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setMuiVeSinh(int muiVeSinh) {
		_chiTietKiemDemCongTrinh.setMuiVeSinh(muiVeSinh);
	}

	/**
	* Returns the phia tren kin dao of this chi tiet kiem dem cong trinh.
	*
	* @return the phia tren kin dao of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getPhiaTrenKinDao() {
		return _chiTietKiemDemCongTrinh.getPhiaTrenKinDao();
	}

	/**
	* Sets the phia tren kin dao of this chi tiet kiem dem cong trinh.
	*
	* @param phiaTrenKinDao the phia tren kin dao of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setPhiaTrenKinDao(int phiaTrenKinDao) {
		_chiTietKiemDemCongTrinh.setPhiaTrenKinDao(phiaTrenKinDao);
	}

	/**
	* Returns the du che mua gio of this chi tiet kiem dem cong trinh.
	*
	* @return the du che mua gio of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getDuCheMuaGio() {
		return _chiTietKiemDemCongTrinh.getDuCheMuaGio();
	}

	/**
	* Sets the du che mua gio of this chi tiet kiem dem cong trinh.
	*
	* @param duCheMuaGio the du che mua gio of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setDuCheMuaGio(int duCheMuaGio) {
		_chiTietKiemDemCongTrinh.setDuCheMuaGio(duCheMuaGio);
	}

	/**
	* Returns the san cao tren toi thieu of this chi tiet kiem dem cong trinh.
	*
	* @return the san cao tren toi thieu of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getSanCaoTrenToiThieu() {
		return _chiTietKiemDemCongTrinh.getSanCaoTrenToiThieu();
	}

	/**
	* Sets the san cao tren toi thieu of this chi tiet kiem dem cong trinh.
	*
	* @param sanCaoTrenToiThieu the san cao tren toi thieu of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setSanCaoTrenToiThieu(int sanCaoTrenToiThieu) {
		_chiTietKiemDemCongTrinh.setSanCaoTrenToiThieu(sanCaoTrenToiThieu);
	}

	/**
	* Returns the co cong trinh rua tay of this chi tiet kiem dem cong trinh.
	*
	* @return the co cong trinh rua tay of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getCoCongTrinhRuaTay() {
		return _chiTietKiemDemCongTrinh.getCoCongTrinhRuaTay();
	}

	/**
	* Sets the co cong trinh rua tay of this chi tiet kiem dem cong trinh.
	*
	* @param coCongTrinhRuaTay the co cong trinh rua tay of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setCoCongTrinhRuaTay(int coCongTrinhRuaTay) {
		_chiTietKiemDemCongTrinh.setCoCongTrinhRuaTay(coCongTrinhRuaTay);
	}

	/**
	* Returns the chi tiet cong trinh rua tay of this chi tiet kiem dem cong trinh.
	*
	* @return the chi tiet cong trinh rua tay of this chi tiet kiem dem cong trinh
	*/
	@Override
	public java.lang.String getChiTietCongTrinhRuaTay() {
		return _chiTietKiemDemCongTrinh.getChiTietCongTrinhRuaTay();
	}

	/**
	* Sets the chi tiet cong trinh rua tay of this chi tiet kiem dem cong trinh.
	*
	* @param chiTietCongTrinhRuaTay the chi tiet cong trinh rua tay of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setChiTietCongTrinhRuaTay(
		java.lang.String chiTietCongTrinhRuaTay) {
		_chiTietKiemDemCongTrinh.setChiTietCongTrinhRuaTay(chiTietCongTrinhRuaTay);
	}

	/**
	* Returns the anh be chua of this chi tiet kiem dem cong trinh.
	*
	* @return the anh be chua of this chi tiet kiem dem cong trinh
	*/
	@Override
	public java.lang.String getAnhBeChua() {
		return _chiTietKiemDemCongTrinh.getAnhBeChua();
	}

	/**
	* Sets the anh be chua of this chi tiet kiem dem cong trinh.
	*
	* @param anhBeChua the anh be chua of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setAnhBeChua(java.lang.String anhBeChua) {
		_chiTietKiemDemCongTrinh.setAnhBeChua(anhBeChua);
	}

	/**
	* Returns the nap be con tot of this chi tiet kiem dem cong trinh.
	*
	* @return the nap be con tot of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getNapBeConTot() {
		return _chiTietKiemDemCongTrinh.getNapBeConTot();
	}

	/**
	* Sets the nap be con tot of this chi tiet kiem dem cong trinh.
	*
	* @param napBeConTot the nap be con tot of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setNapBeConTot(int napBeConTot) {
		_chiTietKiemDemCongTrinh.setNapBeConTot(napBeConTot);
	}

	/**
	* Returns the cua phan bit kin of this chi tiet kiem dem cong trinh.
	*
	* @return the cua phan bit kin of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getCuaPhanBitKin() {
		return _chiTietKiemDemCongTrinh.getCuaPhanBitKin();
	}

	/**
	* Sets the cua phan bit kin of this chi tiet kiem dem cong trinh.
	*
	* @param cuaPhanBitKin the cua phan bit kin of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setCuaPhanBitKin(int cuaPhanBitKin) {
		_chiTietKiemDemCongTrinh.setCuaPhanBitKin(cuaPhanBitKin);
	}

	/**
	* Returns the tran ra ngoai of this chi tiet kiem dem cong trinh.
	*
	* @return the tran ra ngoai of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getTranRaNgoai() {
		return _chiTietKiemDemCongTrinh.getTranRaNgoai();
	}

	/**
	* Sets the tran ra ngoai of this chi tiet kiem dem cong trinh.
	*
	* @param tranRaNgoai the tran ra ngoai of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setTranRaNgoai(int tranRaNgoai) {
		_chiTietKiemDemCongTrinh.setTranRaNgoai(tranRaNgoai);
	}

	/**
	* Returns the nuoc thai di dau of this chi tiet kiem dem cong trinh.
	*
	* @return the nuoc thai di dau of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getNuocThaiDiDau() {
		return _chiTietKiemDemCongTrinh.getNuocThaiDiDau();
	}

	/**
	* Sets the nuoc thai di dau of this chi tiet kiem dem cong trinh.
	*
	* @param nuocThaiDiDau the nuoc thai di dau of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setNuocThaiDiDau(int nuocThaiDiDau) {
		_chiTietKiemDemCongTrinh.setNuocThaiDiDau(nuocThaiDiDau);
	}

	/**
	* Returns the khoang cach nguon nuoc of this chi tiet kiem dem cong trinh.
	*
	* @return the khoang cach nguon nuoc of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getKhoangCachNguonNuoc() {
		return _chiTietKiemDemCongTrinh.getKhoangCachNguonNuoc();
	}

	/**
	* Sets the khoang cach nguon nuoc of this chi tiet kiem dem cong trinh.
	*
	* @param khoangCachNguonNuoc the khoang cach nguon nuoc of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setKhoangCachNguonNuoc(int khoangCachNguonNuoc) {
		_chiTietKiemDemCongTrinh.setKhoangCachNguonNuoc(khoangCachNguonNuoc);
	}

	/**
	* Returns the ngap khi mua lon of this chi tiet kiem dem cong trinh.
	*
	* @return the ngap khi mua lon of this chi tiet kiem dem cong trinh
	*/
	@Override
	public int getNgapKhiMuaLon() {
		return _chiTietKiemDemCongTrinh.getNgapKhiMuaLon();
	}

	/**
	* Sets the ngap khi mua lon of this chi tiet kiem dem cong trinh.
	*
	* @param ngapKhiMuaLon the ngap khi mua lon of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setNgapKhiMuaLon(int ngapKhiMuaLon) {
		_chiTietKiemDemCongTrinh.setNgapKhiMuaLon(ngapKhiMuaLon);
	}

	/**
	* Returns the ten cong trinh of this chi tiet kiem dem cong trinh.
	*
	* @return the ten cong trinh of this chi tiet kiem dem cong trinh
	*/
	@Override
	public java.lang.String getTenCongTrinh() {
		return _chiTietKiemDemCongTrinh.getTenCongTrinh();
	}

	/**
	* Sets the ten cong trinh of this chi tiet kiem dem cong trinh.
	*
	* @param tenCongTrinh the ten cong trinh of this chi tiet kiem dem cong trinh
	*/
	@Override
	public void setTenCongTrinh(java.lang.String tenCongTrinh) {
		_chiTietKiemDemCongTrinh.setTenCongTrinh(tenCongTrinh);
	}

	@Override
	public boolean isNew() {
		return _chiTietKiemDemCongTrinh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_chiTietKiemDemCongTrinh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _chiTietKiemDemCongTrinh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_chiTietKiemDemCongTrinh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _chiTietKiemDemCongTrinh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _chiTietKiemDemCongTrinh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_chiTietKiemDemCongTrinh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _chiTietKiemDemCongTrinh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_chiTietKiemDemCongTrinh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_chiTietKiemDemCongTrinh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_chiTietKiemDemCongTrinh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ChiTietKiemDemCongTrinhWrapper((ChiTietKiemDemCongTrinh)_chiTietKiemDemCongTrinh.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh) {
		return _chiTietKiemDemCongTrinh.compareTo(chiTietKiemDemCongTrinh);
	}

	@Override
	public int hashCode() {
		return _chiTietKiemDemCongTrinh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh> toCacheModel() {
		return _chiTietKiemDemCongTrinh.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh toEscapedModel() {
		return new ChiTietKiemDemCongTrinhWrapper(_chiTietKiemDemCongTrinh.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh toUnescapedModel() {
		return new ChiTietKiemDemCongTrinhWrapper(_chiTietKiemDemCongTrinh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _chiTietKiemDemCongTrinh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _chiTietKiemDemCongTrinh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_chiTietKiemDemCongTrinh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ChiTietKiemDemCongTrinhWrapper)) {
			return false;
		}

		ChiTietKiemDemCongTrinhWrapper chiTietKiemDemCongTrinhWrapper = (ChiTietKiemDemCongTrinhWrapper)obj;

		if (Validator.equals(_chiTietKiemDemCongTrinh,
					chiTietKiemDemCongTrinhWrapper._chiTietKiemDemCongTrinh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ChiTietKiemDemCongTrinh getWrappedChiTietKiemDemCongTrinh() {
		return _chiTietKiemDemCongTrinh;
	}

	@Override
	public ChiTietKiemDemCongTrinh getWrappedModel() {
		return _chiTietKiemDemCongTrinh;
	}

	@Override
	public void resetOriginalValues() {
		_chiTietKiemDemCongTrinh.resetOriginalValues();
	}

	private ChiTietKiemDemCongTrinh _chiTietKiemDemCongTrinh;
}