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
 * This class is a wrapper for {@link ThongTinKiemDemHoGD}.
 * </p>
 *
 * @author BinhTH
 * @see ThongTinKiemDemHoGD
 * @generated
 */
public class ThongTinKiemDemHoGDWrapper implements ThongTinKiemDemHoGD,
	ModelWrapper<ThongTinKiemDemHoGD> {
	public ThongTinKiemDemHoGDWrapper(ThongTinKiemDemHoGD thongTinKiemDemHoGD) {
		_thongTinKiemDemHoGD = thongTinKiemDemHoGD;
	}

	@Override
	public Class<?> getModelClass() {
		return ThongTinKiemDemHoGD.class;
	}

	@Override
	public String getModelClassName() {
		return ThongTinKiemDemHoGD.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("veSinhGiaDinhId", getVeSinhGiaDinhId());
		attributes.put("keHoachKiemDemVeSinhId", getKeHoachKiemDemVeSinhId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("thonXom", getThonXom());
		attributes.put("tenChuHo", getTenChuHo());
		attributes.put("gioiTinhChuHo", getGioiTinhChuHo());
		attributes.put("ngayKiemDem", getNgayKiemDem());
		attributes.put("timThayNha", getTimThayNha());
		attributes.put("coNguoiONha", getCoNguoiONha());
		attributes.put("soNguoiTrongHo", getSoNguoiTrongHo());
		attributes.put("hoTenNguoiTraLoi", getHoTenNguoiTraLoi());
		attributes.put("laChuHoKhong", getLaChuHoKhong());
		attributes.put("gioiTinhNguoiTraLoi", getGioiTinhNguoiTraLoi());
		attributes.put("tenDanToc", getTenDanToc());
		attributes.put("kinhDo", getKinhDo());
		attributes.put("viDo", getViDo());
		attributes.put("thanhPhanHoGD", getThanhPhanHoGD());
		attributes.put("chuHoDungDS", getChuHoDungDS());
		attributes.put("lyDoKhongDungDS", getLyDoKhongDungDS());
		attributes.put("tenChuHoHienTai", getTenChuHoHienTai());
		attributes.put("gioiTinhChuHoHienTai", getGioiTinhChuHoHienTai());
		attributes.put("coNhaTieu", getCoNhaTieu());
		attributes.put("loaiNguonNuoc", getLoaiNguonNuoc());
		attributes.put("loaiNhaTieu", getLoaiNhaTieu());
		attributes.put("anhToanCanh", getAnhToanCanh());
		attributes.put("anhTrongNhaTieu", getAnhTrongNhaTieu());
		attributes.put("thangXayDung", getThangXayDung());
		attributes.put("namXayDung", getNamXayDung());
		attributes.put("nguonVon", getNguonVon());
		attributes.put("chiTietVonVay", getChiTietVonVay());
		attributes.put("duocCaiTao", getDuocCaiTao());
		attributes.put("loaiNhaTieuCu", getLoaiNhaTieuCu());
		attributes.put("anhBeChua", getAnhBeChua());
		attributes.put("veSinhSachSe", getVeSinhSachSe());
		attributes.put("deLamVeSinh", getDeLamVeSinh());
		attributes.put("muiVeSinh", getMuiVeSinh());
		attributes.put("phiaTrenKinDao", getPhiaTrenKinDao());
		attributes.put("duCheMuaGio", getDuCheMuaGio());
		attributes.put("sanCaoTrenToiThieu", getSanCaoTrenToiThieu());
		attributes.put("napBeConTot", getNapBeConTot());
		attributes.put("cuaPhanBitKin", getCuaPhanBitKin());
		attributes.put("tranRaNgoai", getTranRaNgoai());
		attributes.put("nuocThaiDiDau", getNuocThaiDiDau());
		attributes.put("khoangCachNguonNuoc", getKhoangCachNguonNuoc());
		attributes.put("ngapKhiMuaLon", getNgapKhiMuaLon());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("daKetThucDieuTra", getDaKetThucDieuTra());
		attributes.put("lyDoKhongHoanThanh", getLyDoKhongHoanThanh());
		attributes.put("imei", getImei());
		attributes.put("taiKhoan", getTaiKhoan());
		attributes.put("danhGiaKiemDem", getDanhGiaKiemDem());
		attributes.put("savePoint", getSavePoint());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer veSinhGiaDinhId = (Integer)attributes.get("veSinhGiaDinhId");

		if (veSinhGiaDinhId != null) {
			setVeSinhGiaDinhId(veSinhGiaDinhId);
		}

		Integer keHoachKiemDemVeSinhId = (Integer)attributes.get(
				"keHoachKiemDemVeSinhId");

		if (keHoachKiemDemVeSinhId != null) {
			setKeHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);
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

		Integer gioiTinhChuHo = (Integer)attributes.get("gioiTinhChuHo");

		if (gioiTinhChuHo != null) {
			setGioiTinhChuHo(gioiTinhChuHo);
		}

		Date ngayKiemDem = (Date)attributes.get("ngayKiemDem");

		if (ngayKiemDem != null) {
			setNgayKiemDem(ngayKiemDem);
		}

		Integer timThayNha = (Integer)attributes.get("timThayNha");

		if (timThayNha != null) {
			setTimThayNha(timThayNha);
		}

		Integer coNguoiONha = (Integer)attributes.get("coNguoiONha");

		if (coNguoiONha != null) {
			setCoNguoiONha(coNguoiONha);
		}

		Integer soNguoiTrongHo = (Integer)attributes.get("soNguoiTrongHo");

		if (soNguoiTrongHo != null) {
			setSoNguoiTrongHo(soNguoiTrongHo);
		}

		String hoTenNguoiTraLoi = (String)attributes.get("hoTenNguoiTraLoi");

		if (hoTenNguoiTraLoi != null) {
			setHoTenNguoiTraLoi(hoTenNguoiTraLoi);
		}

		Integer laChuHoKhong = (Integer)attributes.get("laChuHoKhong");

		if (laChuHoKhong != null) {
			setLaChuHoKhong(laChuHoKhong);
		}

		String gioiTinhNguoiTraLoi = (String)attributes.get(
				"gioiTinhNguoiTraLoi");

		if (gioiTinhNguoiTraLoi != null) {
			setGioiTinhNguoiTraLoi(gioiTinhNguoiTraLoi);
		}

		String tenDanToc = (String)attributes.get("tenDanToc");

		if (tenDanToc != null) {
			setTenDanToc(tenDanToc);
		}

		String kinhDo = (String)attributes.get("kinhDo");

		if (kinhDo != null) {
			setKinhDo(kinhDo);
		}

		String viDo = (String)attributes.get("viDo");

		if (viDo != null) {
			setViDo(viDo);
		}

		Integer thanhPhanHoGD = (Integer)attributes.get("thanhPhanHoGD");

		if (thanhPhanHoGD != null) {
			setThanhPhanHoGD(thanhPhanHoGD);
		}

		Integer chuHoDungDS = (Integer)attributes.get("chuHoDungDS");

		if (chuHoDungDS != null) {
			setChuHoDungDS(chuHoDungDS);
		}

		String lyDoKhongDungDS = (String)attributes.get("lyDoKhongDungDS");

		if (lyDoKhongDungDS != null) {
			setLyDoKhongDungDS(lyDoKhongDungDS);
		}

		String tenChuHoHienTai = (String)attributes.get("tenChuHoHienTai");

		if (tenChuHoHienTai != null) {
			setTenChuHoHienTai(tenChuHoHienTai);
		}

		Integer gioiTinhChuHoHienTai = (Integer)attributes.get(
				"gioiTinhChuHoHienTai");

		if (gioiTinhChuHoHienTai != null) {
			setGioiTinhChuHoHienTai(gioiTinhChuHoHienTai);
		}

		Integer coNhaTieu = (Integer)attributes.get("coNhaTieu");

		if (coNhaTieu != null) {
			setCoNhaTieu(coNhaTieu);
		}

		String loaiNguonNuoc = (String)attributes.get("loaiNguonNuoc");

		if (loaiNguonNuoc != null) {
			setLoaiNguonNuoc(loaiNguonNuoc);
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

		Integer thangXayDung = (Integer)attributes.get("thangXayDung");

		if (thangXayDung != null) {
			setThangXayDung(thangXayDung);
		}

		Integer namXayDung = (Integer)attributes.get("namXayDung");

		if (namXayDung != null) {
			setNamXayDung(namXayDung);
		}

		Integer nguonVon = (Integer)attributes.get("nguonVon");

		if (nguonVon != null) {
			setNguonVon(nguonVon);
		}

		String chiTietVonVay = (String)attributes.get("chiTietVonVay");

		if (chiTietVonVay != null) {
			setChiTietVonVay(chiTietVonVay);
		}

		Integer duocCaiTao = (Integer)attributes.get("duocCaiTao");

		if (duocCaiTao != null) {
			setDuocCaiTao(duocCaiTao);
		}

		String loaiNhaTieuCu = (String)attributes.get("loaiNhaTieuCu");

		if (loaiNhaTieuCu != null) {
			setLoaiNhaTieuCu(loaiNhaTieuCu);
		}

		String anhBeChua = (String)attributes.get("anhBeChua");

		if (anhBeChua != null) {
			setAnhBeChua(anhBeChua);
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

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Integer daKetThucDieuTra = (Integer)attributes.get("daKetThucDieuTra");

		if (daKetThucDieuTra != null) {
			setDaKetThucDieuTra(daKetThucDieuTra);
		}

		String lyDoKhongHoanThanh = (String)attributes.get("lyDoKhongHoanThanh");

		if (lyDoKhongHoanThanh != null) {
			setLyDoKhongHoanThanh(lyDoKhongHoanThanh);
		}

		String imei = (String)attributes.get("imei");

		if (imei != null) {
			setImei(imei);
		}

		String taiKhoan = (String)attributes.get("taiKhoan");

		if (taiKhoan != null) {
			setTaiKhoan(taiKhoan);
		}

		Integer danhGiaKiemDem = (Integer)attributes.get("danhGiaKiemDem");

		if (danhGiaKiemDem != null) {
			setDanhGiaKiemDem(danhGiaKiemDem);
		}

		Date savePoint = (Date)attributes.get("savePoint");

		if (savePoint != null) {
			setSavePoint(savePoint);
		}
	}

	/**
	* Returns the primary key of this thong tin kiem dem ho g d.
	*
	* @return the primary key of this thong tin kiem dem ho g d
	*/
	@Override
	public int getPrimaryKey() {
		return _thongTinKiemDemHoGD.getPrimaryKey();
	}

	/**
	* Sets the primary key of this thong tin kiem dem ho g d.
	*
	* @param primaryKey the primary key of this thong tin kiem dem ho g d
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_thongTinKiemDemHoGD.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this thong tin kiem dem ho g d.
	*
	* @return the ID of this thong tin kiem dem ho g d
	*/
	@Override
	public int getId() {
		return _thongTinKiemDemHoGD.getId();
	}

	/**
	* Sets the ID of this thong tin kiem dem ho g d.
	*
	* @param id the ID of this thong tin kiem dem ho g d
	*/
	@Override
	public void setId(int id) {
		_thongTinKiemDemHoGD.setId(id);
	}

	/**
	* Returns the ve sinh gia dinh ID of this thong tin kiem dem ho g d.
	*
	* @return the ve sinh gia dinh ID of this thong tin kiem dem ho g d
	*/
	@Override
	public int getVeSinhGiaDinhId() {
		return _thongTinKiemDemHoGD.getVeSinhGiaDinhId();
	}

	/**
	* Sets the ve sinh gia dinh ID of this thong tin kiem dem ho g d.
	*
	* @param veSinhGiaDinhId the ve sinh gia dinh ID of this thong tin kiem dem ho g d
	*/
	@Override
	public void setVeSinhGiaDinhId(int veSinhGiaDinhId) {
		_thongTinKiemDemHoGD.setVeSinhGiaDinhId(veSinhGiaDinhId);
	}

	/**
	* Returns the ke hoach kiem dem ve sinh ID of this thong tin kiem dem ho g d.
	*
	* @return the ke hoach kiem dem ve sinh ID of this thong tin kiem dem ho g d
	*/
	@Override
	public int getKeHoachKiemDemVeSinhId() {
		return _thongTinKiemDemHoGD.getKeHoachKiemDemVeSinhId();
	}

	/**
	* Sets the ke hoach kiem dem ve sinh ID of this thong tin kiem dem ho g d.
	*
	* @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID of this thong tin kiem dem ho g d
	*/
	@Override
	public void setKeHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId) {
		_thongTinKiemDemHoGD.setKeHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);
	}

	/**
	* Returns the ma tinh of this thong tin kiem dem ho g d.
	*
	* @return the ma tinh of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _thongTinKiemDemHoGD.getMaTinh();
	}

	/**
	* Sets the ma tinh of this thong tin kiem dem ho g d.
	*
	* @param maTinh the ma tinh of this thong tin kiem dem ho g d
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_thongTinKiemDemHoGD.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this thong tin kiem dem ho g d.
	*
	* @return the ma huyen of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _thongTinKiemDemHoGD.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this thong tin kiem dem ho g d.
	*
	* @param maHuyen the ma huyen of this thong tin kiem dem ho g d
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_thongTinKiemDemHoGD.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ma xa of this thong tin kiem dem ho g d.
	*
	* @return the ma xa of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getMaXa() {
		return _thongTinKiemDemHoGD.getMaXa();
	}

	/**
	* Sets the ma xa of this thong tin kiem dem ho g d.
	*
	* @param maXa the ma xa of this thong tin kiem dem ho g d
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_thongTinKiemDemHoGD.setMaXa(maXa);
	}

	/**
	* Returns the thon xom of this thong tin kiem dem ho g d.
	*
	* @return the thon xom of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getThonXom() {
		return _thongTinKiemDemHoGD.getThonXom();
	}

	/**
	* Sets the thon xom of this thong tin kiem dem ho g d.
	*
	* @param thonXom the thon xom of this thong tin kiem dem ho g d
	*/
	@Override
	public void setThonXom(java.lang.String thonXom) {
		_thongTinKiemDemHoGD.setThonXom(thonXom);
	}

	/**
	* Returns the ten chu ho of this thong tin kiem dem ho g d.
	*
	* @return the ten chu ho of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getTenChuHo() {
		return _thongTinKiemDemHoGD.getTenChuHo();
	}

	/**
	* Sets the ten chu ho of this thong tin kiem dem ho g d.
	*
	* @param tenChuHo the ten chu ho of this thong tin kiem dem ho g d
	*/
	@Override
	public void setTenChuHo(java.lang.String tenChuHo) {
		_thongTinKiemDemHoGD.setTenChuHo(tenChuHo);
	}

	/**
	* Returns the gioi tinh chu ho of this thong tin kiem dem ho g d.
	*
	* @return the gioi tinh chu ho of this thong tin kiem dem ho g d
	*/
	@Override
	public int getGioiTinhChuHo() {
		return _thongTinKiemDemHoGD.getGioiTinhChuHo();
	}

	/**
	* Sets the gioi tinh chu ho of this thong tin kiem dem ho g d.
	*
	* @param gioiTinhChuHo the gioi tinh chu ho of this thong tin kiem dem ho g d
	*/
	@Override
	public void setGioiTinhChuHo(int gioiTinhChuHo) {
		_thongTinKiemDemHoGD.setGioiTinhChuHo(gioiTinhChuHo);
	}

	/**
	* Returns the ngay kiem dem of this thong tin kiem dem ho g d.
	*
	* @return the ngay kiem dem of this thong tin kiem dem ho g d
	*/
	@Override
	public java.util.Date getNgayKiemDem() {
		return _thongTinKiemDemHoGD.getNgayKiemDem();
	}

	/**
	* Sets the ngay kiem dem of this thong tin kiem dem ho g d.
	*
	* @param ngayKiemDem the ngay kiem dem of this thong tin kiem dem ho g d
	*/
	@Override
	public void setNgayKiemDem(java.util.Date ngayKiemDem) {
		_thongTinKiemDemHoGD.setNgayKiemDem(ngayKiemDem);
	}

	/**
	* Returns the tim thay nha of this thong tin kiem dem ho g d.
	*
	* @return the tim thay nha of this thong tin kiem dem ho g d
	*/
	@Override
	public int getTimThayNha() {
		return _thongTinKiemDemHoGD.getTimThayNha();
	}

	/**
	* Sets the tim thay nha of this thong tin kiem dem ho g d.
	*
	* @param timThayNha the tim thay nha of this thong tin kiem dem ho g d
	*/
	@Override
	public void setTimThayNha(int timThayNha) {
		_thongTinKiemDemHoGD.setTimThayNha(timThayNha);
	}

	/**
	* Returns the co nguoi o nha of this thong tin kiem dem ho g d.
	*
	* @return the co nguoi o nha of this thong tin kiem dem ho g d
	*/
	@Override
	public int getCoNguoiONha() {
		return _thongTinKiemDemHoGD.getCoNguoiONha();
	}

	/**
	* Sets the co nguoi o nha of this thong tin kiem dem ho g d.
	*
	* @param coNguoiONha the co nguoi o nha of this thong tin kiem dem ho g d
	*/
	@Override
	public void setCoNguoiONha(int coNguoiONha) {
		_thongTinKiemDemHoGD.setCoNguoiONha(coNguoiONha);
	}

	/**
	* Returns the so nguoi trong ho of this thong tin kiem dem ho g d.
	*
	* @return the so nguoi trong ho of this thong tin kiem dem ho g d
	*/
	@Override
	public int getSoNguoiTrongHo() {
		return _thongTinKiemDemHoGD.getSoNguoiTrongHo();
	}

	/**
	* Sets the so nguoi trong ho of this thong tin kiem dem ho g d.
	*
	* @param soNguoiTrongHo the so nguoi trong ho of this thong tin kiem dem ho g d
	*/
	@Override
	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		_thongTinKiemDemHoGD.setSoNguoiTrongHo(soNguoiTrongHo);
	}

	/**
	* Returns the ho ten nguoi tra loi of this thong tin kiem dem ho g d.
	*
	* @return the ho ten nguoi tra loi of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getHoTenNguoiTraLoi() {
		return _thongTinKiemDemHoGD.getHoTenNguoiTraLoi();
	}

	/**
	* Sets the ho ten nguoi tra loi of this thong tin kiem dem ho g d.
	*
	* @param hoTenNguoiTraLoi the ho ten nguoi tra loi of this thong tin kiem dem ho g d
	*/
	@Override
	public void setHoTenNguoiTraLoi(java.lang.String hoTenNguoiTraLoi) {
		_thongTinKiemDemHoGD.setHoTenNguoiTraLoi(hoTenNguoiTraLoi);
	}

	/**
	* Returns the la chu ho khong of this thong tin kiem dem ho g d.
	*
	* @return the la chu ho khong of this thong tin kiem dem ho g d
	*/
	@Override
	public int getLaChuHoKhong() {
		return _thongTinKiemDemHoGD.getLaChuHoKhong();
	}

	/**
	* Sets the la chu ho khong of this thong tin kiem dem ho g d.
	*
	* @param laChuHoKhong the la chu ho khong of this thong tin kiem dem ho g d
	*/
	@Override
	public void setLaChuHoKhong(int laChuHoKhong) {
		_thongTinKiemDemHoGD.setLaChuHoKhong(laChuHoKhong);
	}

	/**
	* Returns the gioi tinh nguoi tra loi of this thong tin kiem dem ho g d.
	*
	* @return the gioi tinh nguoi tra loi of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getGioiTinhNguoiTraLoi() {
		return _thongTinKiemDemHoGD.getGioiTinhNguoiTraLoi();
	}

	/**
	* Sets the gioi tinh nguoi tra loi of this thong tin kiem dem ho g d.
	*
	* @param gioiTinhNguoiTraLoi the gioi tinh nguoi tra loi of this thong tin kiem dem ho g d
	*/
	@Override
	public void setGioiTinhNguoiTraLoi(java.lang.String gioiTinhNguoiTraLoi) {
		_thongTinKiemDemHoGD.setGioiTinhNguoiTraLoi(gioiTinhNguoiTraLoi);
	}

	/**
	* Returns the ten dan toc of this thong tin kiem dem ho g d.
	*
	* @return the ten dan toc of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getTenDanToc() {
		return _thongTinKiemDemHoGD.getTenDanToc();
	}

	/**
	* Sets the ten dan toc of this thong tin kiem dem ho g d.
	*
	* @param tenDanToc the ten dan toc of this thong tin kiem dem ho g d
	*/
	@Override
	public void setTenDanToc(java.lang.String tenDanToc) {
		_thongTinKiemDemHoGD.setTenDanToc(tenDanToc);
	}

	/**
	* Returns the kinh do of this thong tin kiem dem ho g d.
	*
	* @return the kinh do of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getKinhDo() {
		return _thongTinKiemDemHoGD.getKinhDo();
	}

	/**
	* Sets the kinh do of this thong tin kiem dem ho g d.
	*
	* @param kinhDo the kinh do of this thong tin kiem dem ho g d
	*/
	@Override
	public void setKinhDo(java.lang.String kinhDo) {
		_thongTinKiemDemHoGD.setKinhDo(kinhDo);
	}

	/**
	* Returns the vi do of this thong tin kiem dem ho g d.
	*
	* @return the vi do of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getViDo() {
		return _thongTinKiemDemHoGD.getViDo();
	}

	/**
	* Sets the vi do of this thong tin kiem dem ho g d.
	*
	* @param viDo the vi do of this thong tin kiem dem ho g d
	*/
	@Override
	public void setViDo(java.lang.String viDo) {
		_thongTinKiemDemHoGD.setViDo(viDo);
	}

	/**
	* Returns the thanh phan ho g d of this thong tin kiem dem ho g d.
	*
	* @return the thanh phan ho g d of this thong tin kiem dem ho g d
	*/
	@Override
	public int getThanhPhanHoGD() {
		return _thongTinKiemDemHoGD.getThanhPhanHoGD();
	}

	/**
	* Sets the thanh phan ho g d of this thong tin kiem dem ho g d.
	*
	* @param thanhPhanHoGD the thanh phan ho g d of this thong tin kiem dem ho g d
	*/
	@Override
	public void setThanhPhanHoGD(int thanhPhanHoGD) {
		_thongTinKiemDemHoGD.setThanhPhanHoGD(thanhPhanHoGD);
	}

	/**
	* Returns the chu ho dung d s of this thong tin kiem dem ho g d.
	*
	* @return the chu ho dung d s of this thong tin kiem dem ho g d
	*/
	@Override
	public int getChuHoDungDS() {
		return _thongTinKiemDemHoGD.getChuHoDungDS();
	}

	/**
	* Sets the chu ho dung d s of this thong tin kiem dem ho g d.
	*
	* @param chuHoDungDS the chu ho dung d s of this thong tin kiem dem ho g d
	*/
	@Override
	public void setChuHoDungDS(int chuHoDungDS) {
		_thongTinKiemDemHoGD.setChuHoDungDS(chuHoDungDS);
	}

	/**
	* Returns the ly do khong dung d s of this thong tin kiem dem ho g d.
	*
	* @return the ly do khong dung d s of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getLyDoKhongDungDS() {
		return _thongTinKiemDemHoGD.getLyDoKhongDungDS();
	}

	/**
	* Sets the ly do khong dung d s of this thong tin kiem dem ho g d.
	*
	* @param lyDoKhongDungDS the ly do khong dung d s of this thong tin kiem dem ho g d
	*/
	@Override
	public void setLyDoKhongDungDS(java.lang.String lyDoKhongDungDS) {
		_thongTinKiemDemHoGD.setLyDoKhongDungDS(lyDoKhongDungDS);
	}

	/**
	* Returns the ten chu ho hien tai of this thong tin kiem dem ho g d.
	*
	* @return the ten chu ho hien tai of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getTenChuHoHienTai() {
		return _thongTinKiemDemHoGD.getTenChuHoHienTai();
	}

	/**
	* Sets the ten chu ho hien tai of this thong tin kiem dem ho g d.
	*
	* @param tenChuHoHienTai the ten chu ho hien tai of this thong tin kiem dem ho g d
	*/
	@Override
	public void setTenChuHoHienTai(java.lang.String tenChuHoHienTai) {
		_thongTinKiemDemHoGD.setTenChuHoHienTai(tenChuHoHienTai);
	}

	/**
	* Returns the gioi tinh chu ho hien tai of this thong tin kiem dem ho g d.
	*
	* @return the gioi tinh chu ho hien tai of this thong tin kiem dem ho g d
	*/
	@Override
	public int getGioiTinhChuHoHienTai() {
		return _thongTinKiemDemHoGD.getGioiTinhChuHoHienTai();
	}

	/**
	* Sets the gioi tinh chu ho hien tai of this thong tin kiem dem ho g d.
	*
	* @param gioiTinhChuHoHienTai the gioi tinh chu ho hien tai of this thong tin kiem dem ho g d
	*/
	@Override
	public void setGioiTinhChuHoHienTai(int gioiTinhChuHoHienTai) {
		_thongTinKiemDemHoGD.setGioiTinhChuHoHienTai(gioiTinhChuHoHienTai);
	}

	/**
	* Returns the co nha tieu of this thong tin kiem dem ho g d.
	*
	* @return the co nha tieu of this thong tin kiem dem ho g d
	*/
	@Override
	public int getCoNhaTieu() {
		return _thongTinKiemDemHoGD.getCoNhaTieu();
	}

	/**
	* Sets the co nha tieu of this thong tin kiem dem ho g d.
	*
	* @param coNhaTieu the co nha tieu of this thong tin kiem dem ho g d
	*/
	@Override
	public void setCoNhaTieu(int coNhaTieu) {
		_thongTinKiemDemHoGD.setCoNhaTieu(coNhaTieu);
	}

	/**
	* Returns the loai nguon nuoc of this thong tin kiem dem ho g d.
	*
	* @return the loai nguon nuoc of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getLoaiNguonNuoc() {
		return _thongTinKiemDemHoGD.getLoaiNguonNuoc();
	}

	/**
	* Sets the loai nguon nuoc of this thong tin kiem dem ho g d.
	*
	* @param loaiNguonNuoc the loai nguon nuoc of this thong tin kiem dem ho g d
	*/
	@Override
	public void setLoaiNguonNuoc(java.lang.String loaiNguonNuoc) {
		_thongTinKiemDemHoGD.setLoaiNguonNuoc(loaiNguonNuoc);
	}

	/**
	* Returns the loai nha tieu of this thong tin kiem dem ho g d.
	*
	* @return the loai nha tieu of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getLoaiNhaTieu() {
		return _thongTinKiemDemHoGD.getLoaiNhaTieu();
	}

	/**
	* Sets the loai nha tieu of this thong tin kiem dem ho g d.
	*
	* @param loaiNhaTieu the loai nha tieu of this thong tin kiem dem ho g d
	*/
	@Override
	public void setLoaiNhaTieu(java.lang.String loaiNhaTieu) {
		_thongTinKiemDemHoGD.setLoaiNhaTieu(loaiNhaTieu);
	}

	/**
	* Returns the anh toan canh of this thong tin kiem dem ho g d.
	*
	* @return the anh toan canh of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getAnhToanCanh() {
		return _thongTinKiemDemHoGD.getAnhToanCanh();
	}

	/**
	* Sets the anh toan canh of this thong tin kiem dem ho g d.
	*
	* @param anhToanCanh the anh toan canh of this thong tin kiem dem ho g d
	*/
	@Override
	public void setAnhToanCanh(java.lang.String anhToanCanh) {
		_thongTinKiemDemHoGD.setAnhToanCanh(anhToanCanh);
	}

	/**
	* Returns the anh trong nha tieu of this thong tin kiem dem ho g d.
	*
	* @return the anh trong nha tieu of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getAnhTrongNhaTieu() {
		return _thongTinKiemDemHoGD.getAnhTrongNhaTieu();
	}

	/**
	* Sets the anh trong nha tieu of this thong tin kiem dem ho g d.
	*
	* @param anhTrongNhaTieu the anh trong nha tieu of this thong tin kiem dem ho g d
	*/
	@Override
	public void setAnhTrongNhaTieu(java.lang.String anhTrongNhaTieu) {
		_thongTinKiemDemHoGD.setAnhTrongNhaTieu(anhTrongNhaTieu);
	}

	/**
	* Returns the thang xay dung of this thong tin kiem dem ho g d.
	*
	* @return the thang xay dung of this thong tin kiem dem ho g d
	*/
	@Override
	public int getThangXayDung() {
		return _thongTinKiemDemHoGD.getThangXayDung();
	}

	/**
	* Sets the thang xay dung of this thong tin kiem dem ho g d.
	*
	* @param thangXayDung the thang xay dung of this thong tin kiem dem ho g d
	*/
	@Override
	public void setThangXayDung(int thangXayDung) {
		_thongTinKiemDemHoGD.setThangXayDung(thangXayDung);
	}

	/**
	* Returns the nam xay dung of this thong tin kiem dem ho g d.
	*
	* @return the nam xay dung of this thong tin kiem dem ho g d
	*/
	@Override
	public int getNamXayDung() {
		return _thongTinKiemDemHoGD.getNamXayDung();
	}

	/**
	* Sets the nam xay dung of this thong tin kiem dem ho g d.
	*
	* @param namXayDung the nam xay dung of this thong tin kiem dem ho g d
	*/
	@Override
	public void setNamXayDung(int namXayDung) {
		_thongTinKiemDemHoGD.setNamXayDung(namXayDung);
	}

	/**
	* Returns the nguon von of this thong tin kiem dem ho g d.
	*
	* @return the nguon von of this thong tin kiem dem ho g d
	*/
	@Override
	public int getNguonVon() {
		return _thongTinKiemDemHoGD.getNguonVon();
	}

	/**
	* Sets the nguon von of this thong tin kiem dem ho g d.
	*
	* @param nguonVon the nguon von of this thong tin kiem dem ho g d
	*/
	@Override
	public void setNguonVon(int nguonVon) {
		_thongTinKiemDemHoGD.setNguonVon(nguonVon);
	}

	/**
	* Returns the chi tiet von vay of this thong tin kiem dem ho g d.
	*
	* @return the chi tiet von vay of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getChiTietVonVay() {
		return _thongTinKiemDemHoGD.getChiTietVonVay();
	}

	/**
	* Sets the chi tiet von vay of this thong tin kiem dem ho g d.
	*
	* @param chiTietVonVay the chi tiet von vay of this thong tin kiem dem ho g d
	*/
	@Override
	public void setChiTietVonVay(java.lang.String chiTietVonVay) {
		_thongTinKiemDemHoGD.setChiTietVonVay(chiTietVonVay);
	}

	/**
	* Returns the duoc cai tao of this thong tin kiem dem ho g d.
	*
	* @return the duoc cai tao of this thong tin kiem dem ho g d
	*/
	@Override
	public int getDuocCaiTao() {
		return _thongTinKiemDemHoGD.getDuocCaiTao();
	}

	/**
	* Sets the duoc cai tao of this thong tin kiem dem ho g d.
	*
	* @param duocCaiTao the duoc cai tao of this thong tin kiem dem ho g d
	*/
	@Override
	public void setDuocCaiTao(int duocCaiTao) {
		_thongTinKiemDemHoGD.setDuocCaiTao(duocCaiTao);
	}

	/**
	* Returns the loai nha tieu cu of this thong tin kiem dem ho g d.
	*
	* @return the loai nha tieu cu of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getLoaiNhaTieuCu() {
		return _thongTinKiemDemHoGD.getLoaiNhaTieuCu();
	}

	/**
	* Sets the loai nha tieu cu of this thong tin kiem dem ho g d.
	*
	* @param loaiNhaTieuCu the loai nha tieu cu of this thong tin kiem dem ho g d
	*/
	@Override
	public void setLoaiNhaTieuCu(java.lang.String loaiNhaTieuCu) {
		_thongTinKiemDemHoGD.setLoaiNhaTieuCu(loaiNhaTieuCu);
	}

	/**
	* Returns the anh be chua of this thong tin kiem dem ho g d.
	*
	* @return the anh be chua of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getAnhBeChua() {
		return _thongTinKiemDemHoGD.getAnhBeChua();
	}

	/**
	* Sets the anh be chua of this thong tin kiem dem ho g d.
	*
	* @param anhBeChua the anh be chua of this thong tin kiem dem ho g d
	*/
	@Override
	public void setAnhBeChua(java.lang.String anhBeChua) {
		_thongTinKiemDemHoGD.setAnhBeChua(anhBeChua);
	}

	/**
	* Returns the ve sinh sach se of this thong tin kiem dem ho g d.
	*
	* @return the ve sinh sach se of this thong tin kiem dem ho g d
	*/
	@Override
	public int getVeSinhSachSe() {
		return _thongTinKiemDemHoGD.getVeSinhSachSe();
	}

	/**
	* Sets the ve sinh sach se of this thong tin kiem dem ho g d.
	*
	* @param veSinhSachSe the ve sinh sach se of this thong tin kiem dem ho g d
	*/
	@Override
	public void setVeSinhSachSe(int veSinhSachSe) {
		_thongTinKiemDemHoGD.setVeSinhSachSe(veSinhSachSe);
	}

	/**
	* Returns the de lam ve sinh of this thong tin kiem dem ho g d.
	*
	* @return the de lam ve sinh of this thong tin kiem dem ho g d
	*/
	@Override
	public int getDeLamVeSinh() {
		return _thongTinKiemDemHoGD.getDeLamVeSinh();
	}

	/**
	* Sets the de lam ve sinh of this thong tin kiem dem ho g d.
	*
	* @param deLamVeSinh the de lam ve sinh of this thong tin kiem dem ho g d
	*/
	@Override
	public void setDeLamVeSinh(int deLamVeSinh) {
		_thongTinKiemDemHoGD.setDeLamVeSinh(deLamVeSinh);
	}

	/**
	* Returns the mui ve sinh of this thong tin kiem dem ho g d.
	*
	* @return the mui ve sinh of this thong tin kiem dem ho g d
	*/
	@Override
	public int getMuiVeSinh() {
		return _thongTinKiemDemHoGD.getMuiVeSinh();
	}

	/**
	* Sets the mui ve sinh of this thong tin kiem dem ho g d.
	*
	* @param muiVeSinh the mui ve sinh of this thong tin kiem dem ho g d
	*/
	@Override
	public void setMuiVeSinh(int muiVeSinh) {
		_thongTinKiemDemHoGD.setMuiVeSinh(muiVeSinh);
	}

	/**
	* Returns the phia tren kin dao of this thong tin kiem dem ho g d.
	*
	* @return the phia tren kin dao of this thong tin kiem dem ho g d
	*/
	@Override
	public int getPhiaTrenKinDao() {
		return _thongTinKiemDemHoGD.getPhiaTrenKinDao();
	}

	/**
	* Sets the phia tren kin dao of this thong tin kiem dem ho g d.
	*
	* @param phiaTrenKinDao the phia tren kin dao of this thong tin kiem dem ho g d
	*/
	@Override
	public void setPhiaTrenKinDao(int phiaTrenKinDao) {
		_thongTinKiemDemHoGD.setPhiaTrenKinDao(phiaTrenKinDao);
	}

	/**
	* Returns the du che mua gio of this thong tin kiem dem ho g d.
	*
	* @return the du che mua gio of this thong tin kiem dem ho g d
	*/
	@Override
	public int getDuCheMuaGio() {
		return _thongTinKiemDemHoGD.getDuCheMuaGio();
	}

	/**
	* Sets the du che mua gio of this thong tin kiem dem ho g d.
	*
	* @param duCheMuaGio the du che mua gio of this thong tin kiem dem ho g d
	*/
	@Override
	public void setDuCheMuaGio(int duCheMuaGio) {
		_thongTinKiemDemHoGD.setDuCheMuaGio(duCheMuaGio);
	}

	/**
	* Returns the san cao tren toi thieu of this thong tin kiem dem ho g d.
	*
	* @return the san cao tren toi thieu of this thong tin kiem dem ho g d
	*/
	@Override
	public int getSanCaoTrenToiThieu() {
		return _thongTinKiemDemHoGD.getSanCaoTrenToiThieu();
	}

	/**
	* Sets the san cao tren toi thieu of this thong tin kiem dem ho g d.
	*
	* @param sanCaoTrenToiThieu the san cao tren toi thieu of this thong tin kiem dem ho g d
	*/
	@Override
	public void setSanCaoTrenToiThieu(int sanCaoTrenToiThieu) {
		_thongTinKiemDemHoGD.setSanCaoTrenToiThieu(sanCaoTrenToiThieu);
	}

	/**
	* Returns the nap be con tot of this thong tin kiem dem ho g d.
	*
	* @return the nap be con tot of this thong tin kiem dem ho g d
	*/
	@Override
	public int getNapBeConTot() {
		return _thongTinKiemDemHoGD.getNapBeConTot();
	}

	/**
	* Sets the nap be con tot of this thong tin kiem dem ho g d.
	*
	* @param napBeConTot the nap be con tot of this thong tin kiem dem ho g d
	*/
	@Override
	public void setNapBeConTot(int napBeConTot) {
		_thongTinKiemDemHoGD.setNapBeConTot(napBeConTot);
	}

	/**
	* Returns the cua phan bit kin of this thong tin kiem dem ho g d.
	*
	* @return the cua phan bit kin of this thong tin kiem dem ho g d
	*/
	@Override
	public int getCuaPhanBitKin() {
		return _thongTinKiemDemHoGD.getCuaPhanBitKin();
	}

	/**
	* Sets the cua phan bit kin of this thong tin kiem dem ho g d.
	*
	* @param cuaPhanBitKin the cua phan bit kin of this thong tin kiem dem ho g d
	*/
	@Override
	public void setCuaPhanBitKin(int cuaPhanBitKin) {
		_thongTinKiemDemHoGD.setCuaPhanBitKin(cuaPhanBitKin);
	}

	/**
	* Returns the tran ra ngoai of this thong tin kiem dem ho g d.
	*
	* @return the tran ra ngoai of this thong tin kiem dem ho g d
	*/
	@Override
	public int getTranRaNgoai() {
		return _thongTinKiemDemHoGD.getTranRaNgoai();
	}

	/**
	* Sets the tran ra ngoai of this thong tin kiem dem ho g d.
	*
	* @param tranRaNgoai the tran ra ngoai of this thong tin kiem dem ho g d
	*/
	@Override
	public void setTranRaNgoai(int tranRaNgoai) {
		_thongTinKiemDemHoGD.setTranRaNgoai(tranRaNgoai);
	}

	/**
	* Returns the nuoc thai di dau of this thong tin kiem dem ho g d.
	*
	* @return the nuoc thai di dau of this thong tin kiem dem ho g d
	*/
	@Override
	public int getNuocThaiDiDau() {
		return _thongTinKiemDemHoGD.getNuocThaiDiDau();
	}

	/**
	* Sets the nuoc thai di dau of this thong tin kiem dem ho g d.
	*
	* @param nuocThaiDiDau the nuoc thai di dau of this thong tin kiem dem ho g d
	*/
	@Override
	public void setNuocThaiDiDau(int nuocThaiDiDau) {
		_thongTinKiemDemHoGD.setNuocThaiDiDau(nuocThaiDiDau);
	}

	/**
	* Returns the khoang cach nguon nuoc of this thong tin kiem dem ho g d.
	*
	* @return the khoang cach nguon nuoc of this thong tin kiem dem ho g d
	*/
	@Override
	public int getKhoangCachNguonNuoc() {
		return _thongTinKiemDemHoGD.getKhoangCachNguonNuoc();
	}

	/**
	* Sets the khoang cach nguon nuoc of this thong tin kiem dem ho g d.
	*
	* @param khoangCachNguonNuoc the khoang cach nguon nuoc of this thong tin kiem dem ho g d
	*/
	@Override
	public void setKhoangCachNguonNuoc(int khoangCachNguonNuoc) {
		_thongTinKiemDemHoGD.setKhoangCachNguonNuoc(khoangCachNguonNuoc);
	}

	/**
	* Returns the ngap khi mua lon of this thong tin kiem dem ho g d.
	*
	* @return the ngap khi mua lon of this thong tin kiem dem ho g d
	*/
	@Override
	public int getNgapKhiMuaLon() {
		return _thongTinKiemDemHoGD.getNgapKhiMuaLon();
	}

	/**
	* Sets the ngap khi mua lon of this thong tin kiem dem ho g d.
	*
	* @param ngapKhiMuaLon the ngap khi mua lon of this thong tin kiem dem ho g d
	*/
	@Override
	public void setNgapKhiMuaLon(int ngapKhiMuaLon) {
		_thongTinKiemDemHoGD.setNgapKhiMuaLon(ngapKhiMuaLon);
	}

	/**
	* Returns the ghi chu of this thong tin kiem dem ho g d.
	*
	* @return the ghi chu of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _thongTinKiemDemHoGD.getGhiChu();
	}

	/**
	* Sets the ghi chu of this thong tin kiem dem ho g d.
	*
	* @param ghiChu the ghi chu of this thong tin kiem dem ho g d
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_thongTinKiemDemHoGD.setGhiChu(ghiChu);
	}

	/**
	* Returns the da ket thuc dieu tra of this thong tin kiem dem ho g d.
	*
	* @return the da ket thuc dieu tra of this thong tin kiem dem ho g d
	*/
	@Override
	public int getDaKetThucDieuTra() {
		return _thongTinKiemDemHoGD.getDaKetThucDieuTra();
	}

	/**
	* Sets the da ket thuc dieu tra of this thong tin kiem dem ho g d.
	*
	* @param daKetThucDieuTra the da ket thuc dieu tra of this thong tin kiem dem ho g d
	*/
	@Override
	public void setDaKetThucDieuTra(int daKetThucDieuTra) {
		_thongTinKiemDemHoGD.setDaKetThucDieuTra(daKetThucDieuTra);
	}

	/**
	* Returns the ly do khong hoan thanh of this thong tin kiem dem ho g d.
	*
	* @return the ly do khong hoan thanh of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getLyDoKhongHoanThanh() {
		return _thongTinKiemDemHoGD.getLyDoKhongHoanThanh();
	}

	/**
	* Sets the ly do khong hoan thanh of this thong tin kiem dem ho g d.
	*
	* @param lyDoKhongHoanThanh the ly do khong hoan thanh of this thong tin kiem dem ho g d
	*/
	@Override
	public void setLyDoKhongHoanThanh(java.lang.String lyDoKhongHoanThanh) {
		_thongTinKiemDemHoGD.setLyDoKhongHoanThanh(lyDoKhongHoanThanh);
	}

	/**
	* Returns the imei of this thong tin kiem dem ho g d.
	*
	* @return the imei of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getImei() {
		return _thongTinKiemDemHoGD.getImei();
	}

	/**
	* Sets the imei of this thong tin kiem dem ho g d.
	*
	* @param imei the imei of this thong tin kiem dem ho g d
	*/
	@Override
	public void setImei(java.lang.String imei) {
		_thongTinKiemDemHoGD.setImei(imei);
	}

	/**
	* Returns the tai khoan of this thong tin kiem dem ho g d.
	*
	* @return the tai khoan of this thong tin kiem dem ho g d
	*/
	@Override
	public java.lang.String getTaiKhoan() {
		return _thongTinKiemDemHoGD.getTaiKhoan();
	}

	/**
	* Sets the tai khoan of this thong tin kiem dem ho g d.
	*
	* @param taiKhoan the tai khoan of this thong tin kiem dem ho g d
	*/
	@Override
	public void setTaiKhoan(java.lang.String taiKhoan) {
		_thongTinKiemDemHoGD.setTaiKhoan(taiKhoan);
	}

	/**
	* Returns the danh gia kiem dem of this thong tin kiem dem ho g d.
	*
	* @return the danh gia kiem dem of this thong tin kiem dem ho g d
	*/
	@Override
	public int getDanhGiaKiemDem() {
		return _thongTinKiemDemHoGD.getDanhGiaKiemDem();
	}

	/**
	* Sets the danh gia kiem dem of this thong tin kiem dem ho g d.
	*
	* @param danhGiaKiemDem the danh gia kiem dem of this thong tin kiem dem ho g d
	*/
	@Override
	public void setDanhGiaKiemDem(int danhGiaKiemDem) {
		_thongTinKiemDemHoGD.setDanhGiaKiemDem(danhGiaKiemDem);
	}

	/**
	* Returns the save point of this thong tin kiem dem ho g d.
	*
	* @return the save point of this thong tin kiem dem ho g d
	*/
	@Override
	public java.util.Date getSavePoint() {
		return _thongTinKiemDemHoGD.getSavePoint();
	}

	/**
	* Sets the save point of this thong tin kiem dem ho g d.
	*
	* @param savePoint the save point of this thong tin kiem dem ho g d
	*/
	@Override
	public void setSavePoint(java.util.Date savePoint) {
		_thongTinKiemDemHoGD.setSavePoint(savePoint);
	}

	@Override
	public boolean isNew() {
		return _thongTinKiemDemHoGD.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thongTinKiemDemHoGD.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thongTinKiemDemHoGD.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thongTinKiemDemHoGD.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thongTinKiemDemHoGD.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thongTinKiemDemHoGD.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thongTinKiemDemHoGD.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thongTinKiemDemHoGD.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thongTinKiemDemHoGD.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thongTinKiemDemHoGD.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thongTinKiemDemHoGD.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ThongTinKiemDemHoGDWrapper((ThongTinKiemDemHoGD)_thongTinKiemDemHoGD.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD thongTinKiemDemHoGD) {
		return _thongTinKiemDemHoGD.compareTo(thongTinKiemDemHoGD);
	}

	@Override
	public int hashCode() {
		return _thongTinKiemDemHoGD.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD> toCacheModel() {
		return _thongTinKiemDemHoGD.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD toEscapedModel() {
		return new ThongTinKiemDemHoGDWrapper(_thongTinKiemDemHoGD.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD toUnescapedModel() {
		return new ThongTinKiemDemHoGDWrapper(_thongTinKiemDemHoGD.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thongTinKiemDemHoGD.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thongTinKiemDemHoGD.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thongTinKiemDemHoGD.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ThongTinKiemDemHoGDWrapper)) {
			return false;
		}

		ThongTinKiemDemHoGDWrapper thongTinKiemDemHoGDWrapper = (ThongTinKiemDemHoGDWrapper)obj;

		if (Validator.equals(_thongTinKiemDemHoGD,
					thongTinKiemDemHoGDWrapper._thongTinKiemDemHoGD)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ThongTinKiemDemHoGD getWrappedThongTinKiemDemHoGD() {
		return _thongTinKiemDemHoGD;
	}

	@Override
	public ThongTinKiemDemHoGD getWrappedModel() {
		return _thongTinKiemDemHoGD;
	}

	@Override
	public void resetOriginalValues() {
		_thongTinKiemDemHoGD.resetOriginalValues();
	}

	private ThongTinKiemDemHoGD _thongTinKiemDemHoGD;
}