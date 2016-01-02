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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ClpSerializer;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemHoGDLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author BinhTH
 */
public class ThongTinKiemDemHoGDClp extends BaseModelImpl<ThongTinKiemDemHoGD>
	implements ThongTinKiemDemHoGD {
	public ThongTinKiemDemHoGDClp() {
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
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
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

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getVeSinhGiaDinhId() {
		return _veSinhGiaDinhId;
	}

	@Override
	public void setVeSinhGiaDinhId(int veSinhGiaDinhId) {
		_veSinhGiaDinhId = veSinhGiaDinhId;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setVeSinhGiaDinhId", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, veSinhGiaDinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKeHoachKiemDemVeSinhId() {
		return _keHoachKiemDemVeSinhId;
	}

	@Override
	public void setKeHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId) {
		_keHoachKiemDemVeSinhId = keHoachKiemDemVeSinhId;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setKeHoachKiemDemVeSinhId",
						int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel,
					keHoachKiemDemVeSinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTinh() {
		return _maTinh;
	}

	@Override
	public void setMaTinh(String maTinh) {
		_maTinh = maTinh;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, maTinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaHuyen() {
		return _maHuyen;
	}

	@Override
	public void setMaHuyen(String maHuyen) {
		_maHuyen = maHuyen;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyen", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, maHuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaXa() {
		return _maXa;
	}

	@Override
	public void setMaXa(String maXa) {
		_maXa = maXa;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setMaXa", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, maXa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThonXom() {
		return _thonXom;
	}

	@Override
	public void setThonXom(String thonXom) {
		_thonXom = thonXom;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setThonXom", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, thonXom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenChuHo() {
		return _tenChuHo;
	}

	@Override
	public void setTenChuHo(String tenChuHo) {
		_tenChuHo = tenChuHo;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChuHo", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, tenChuHo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGioiTinhChuHo() {
		return _gioiTinhChuHo;
	}

	@Override
	public void setGioiTinhChuHo(int gioiTinhChuHo) {
		_gioiTinhChuHo = gioiTinhChuHo;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinhChuHo", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, gioiTinhChuHo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayKiemDem() {
		return _ngayKiemDem;
	}

	@Override
	public void setNgayKiemDem(Date ngayKiemDem) {
		_ngayKiemDem = ngayKiemDem;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayKiemDem", Date.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, ngayKiemDem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTimThayNha() {
		return _timThayNha;
	}

	@Override
	public void setTimThayNha(int timThayNha) {
		_timThayNha = timThayNha;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setTimThayNha", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, timThayNha);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCoNguoiONha() {
		return _coNguoiONha;
	}

	@Override
	public void setCoNguoiONha(int coNguoiONha) {
		_coNguoiONha = coNguoiONha;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setCoNguoiONha", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, coNguoiONha);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNguoiTrongHo() {
		return _soNguoiTrongHo;
	}

	@Override
	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		_soNguoiTrongHo = soNguoiTrongHo;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNguoiTrongHo", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, soNguoiTrongHo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHoTenNguoiTraLoi() {
		return _hoTenNguoiTraLoi;
	}

	@Override
	public void setHoTenNguoiTraLoi(String hoTenNguoiTraLoi) {
		_hoTenNguoiTraLoi = hoTenNguoiTraLoi;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setHoTenNguoiTraLoi",
						String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, hoTenNguoiTraLoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLaChuHoKhong() {
		return _laChuHoKhong;
	}

	@Override
	public void setLaChuHoKhong(int laChuHoKhong) {
		_laChuHoKhong = laChuHoKhong;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setLaChuHoKhong", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, laChuHoKhong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGioiTinhNguoiTraLoi() {
		return _gioiTinhNguoiTraLoi;
	}

	@Override
	public void setGioiTinhNguoiTraLoi(String gioiTinhNguoiTraLoi) {
		_gioiTinhNguoiTraLoi = gioiTinhNguoiTraLoi;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinhNguoiTraLoi",
						String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel,
					gioiTinhNguoiTraLoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDanToc() {
		return _tenDanToc;
	}

	@Override
	public void setTenDanToc(String tenDanToc) {
		_tenDanToc = tenDanToc;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDanToc", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, tenDanToc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKinhDo() {
		return _kinhDo;
	}

	@Override
	public void setKinhDo(String kinhDo) {
		_kinhDo = kinhDo;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setKinhDo", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, kinhDo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getViDo() {
		return _viDo;
	}

	@Override
	public void setViDo(String viDo) {
		_viDo = viDo;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setViDo", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, viDo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThanhPhanHoGD() {
		return _thanhPhanHoGD;
	}

	@Override
	public void setThanhPhanHoGD(int thanhPhanHoGD) {
		_thanhPhanHoGD = thanhPhanHoGD;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhPhanHoGD", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, thanhPhanHoGD);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getChuHoDungDS() {
		return _chuHoDungDS;
	}

	@Override
	public void setChuHoDungDS(int chuHoDungDS) {
		_chuHoDungDS = chuHoDungDS;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setChuHoDungDS", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, chuHoDungDS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLyDoKhongDungDS() {
		return _lyDoKhongDungDS;
	}

	@Override
	public void setLyDoKhongDungDS(String lyDoKhongDungDS) {
		_lyDoKhongDungDS = lyDoKhongDungDS;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDungDS",
						String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, lyDoKhongDungDS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenChuHoHienTai() {
		return _tenChuHoHienTai;
	}

	@Override
	public void setTenChuHoHienTai(String tenChuHoHienTai) {
		_tenChuHoHienTai = tenChuHoHienTai;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChuHoHienTai",
						String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, tenChuHoHienTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGioiTinhChuHoHienTai() {
		return _gioiTinhChuHoHienTai;
	}

	@Override
	public void setGioiTinhChuHoHienTai(int gioiTinhChuHoHienTai) {
		_gioiTinhChuHoHienTai = gioiTinhChuHoHienTai;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinhChuHoHienTai",
						int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel,
					gioiTinhChuHoHienTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCoNhaTieu() {
		return _coNhaTieu;
	}

	@Override
	public void setCoNhaTieu(int coNhaTieu) {
		_coNhaTieu = coNhaTieu;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setCoNhaTieu", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, coNhaTieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiNguonNuoc() {
		return _loaiNguonNuoc;
	}

	@Override
	public void setLoaiNguonNuoc(String loaiNguonNuoc) {
		_loaiNguonNuoc = loaiNguonNuoc;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiNguonNuoc", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, loaiNguonNuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiNhaTieu() {
		return _loaiNhaTieu;
	}

	@Override
	public void setLoaiNhaTieu(String loaiNhaTieu) {
		_loaiNhaTieu = loaiNhaTieu;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiNhaTieu", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, loaiNhaTieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnhToanCanh() {
		return _anhToanCanh;
	}

	@Override
	public void setAnhToanCanh(String anhToanCanh) {
		_anhToanCanh = anhToanCanh;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setAnhToanCanh", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, anhToanCanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnhTrongNhaTieu() {
		return _anhTrongNhaTieu;
	}

	@Override
	public void setAnhTrongNhaTieu(String anhTrongNhaTieu) {
		_anhTrongNhaTieu = anhTrongNhaTieu;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setAnhTrongNhaTieu",
						String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, anhTrongNhaTieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThangXayDung() {
		return _thangXayDung;
	}

	@Override
	public void setThangXayDung(int thangXayDung) {
		_thangXayDung = thangXayDung;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setThangXayDung", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, thangXayDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNamXayDung() {
		return _namXayDung;
	}

	@Override
	public void setNamXayDung(int namXayDung) {
		_namXayDung = namXayDung;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setNamXayDung", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, namXayDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNguonVon() {
		return _nguonVon;
	}

	@Override
	public void setNguonVon(int nguonVon) {
		_nguonVon = nguonVon;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setNguonVon", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, nguonVon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChiTietVonVay() {
		return _chiTietVonVay;
	}

	@Override
	public void setChiTietVonVay(String chiTietVonVay) {
		_chiTietVonVay = chiTietVonVay;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setChiTietVonVay", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, chiTietVonVay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDuocCaiTao() {
		return _duocCaiTao;
	}

	@Override
	public void setDuocCaiTao(int duocCaiTao) {
		_duocCaiTao = duocCaiTao;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setDuocCaiTao", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, duocCaiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiNhaTieuCu() {
		return _loaiNhaTieuCu;
	}

	@Override
	public void setLoaiNhaTieuCu(String loaiNhaTieuCu) {
		_loaiNhaTieuCu = loaiNhaTieuCu;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiNhaTieuCu", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, loaiNhaTieuCu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnhBeChua() {
		return _anhBeChua;
	}

	@Override
	public void setAnhBeChua(String anhBeChua) {
		_anhBeChua = anhBeChua;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setAnhBeChua", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, anhBeChua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getVeSinhSachSe() {
		return _veSinhSachSe;
	}

	@Override
	public void setVeSinhSachSe(int veSinhSachSe) {
		_veSinhSachSe = veSinhSachSe;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setVeSinhSachSe", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, veSinhSachSe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDeLamVeSinh() {
		return _deLamVeSinh;
	}

	@Override
	public void setDeLamVeSinh(int deLamVeSinh) {
		_deLamVeSinh = deLamVeSinh;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setDeLamVeSinh", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, deLamVeSinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMuiVeSinh() {
		return _muiVeSinh;
	}

	@Override
	public void setMuiVeSinh(int muiVeSinh) {
		_muiVeSinh = muiVeSinh;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setMuiVeSinh", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, muiVeSinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPhiaTrenKinDao() {
		return _phiaTrenKinDao;
	}

	@Override
	public void setPhiaTrenKinDao(int phiaTrenKinDao) {
		_phiaTrenKinDao = phiaTrenKinDao;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setPhiaTrenKinDao", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, phiaTrenKinDao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDuCheMuaGio() {
		return _duCheMuaGio;
	}

	@Override
	public void setDuCheMuaGio(int duCheMuaGio) {
		_duCheMuaGio = duCheMuaGio;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setDuCheMuaGio", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, duCheMuaGio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSanCaoTrenToiThieu() {
		return _sanCaoTrenToiThieu;
	}

	@Override
	public void setSanCaoTrenToiThieu(int sanCaoTrenToiThieu) {
		_sanCaoTrenToiThieu = sanCaoTrenToiThieu;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setSanCaoTrenToiThieu",
						int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel,
					sanCaoTrenToiThieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNapBeConTot() {
		return _napBeConTot;
	}

	@Override
	public void setNapBeConTot(int napBeConTot) {
		_napBeConTot = napBeConTot;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setNapBeConTot", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, napBeConTot);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCuaPhanBitKin() {
		return _cuaPhanBitKin;
	}

	@Override
	public void setCuaPhanBitKin(int cuaPhanBitKin) {
		_cuaPhanBitKin = cuaPhanBitKin;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setCuaPhanBitKin", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, cuaPhanBitKin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTranRaNgoai() {
		return _tranRaNgoai;
	}

	@Override
	public void setTranRaNgoai(int tranRaNgoai) {
		_tranRaNgoai = tranRaNgoai;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setTranRaNgoai", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, tranRaNgoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNuocThaiDiDau() {
		return _nuocThaiDiDau;
	}

	@Override
	public void setNuocThaiDiDau(int nuocThaiDiDau) {
		_nuocThaiDiDau = nuocThaiDiDau;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocThaiDiDau", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, nuocThaiDiDau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKhoangCachNguonNuoc() {
		return _khoangCachNguonNuoc;
	}

	@Override
	public void setKhoangCachNguonNuoc(int khoangCachNguonNuoc) {
		_khoangCachNguonNuoc = khoangCachNguonNuoc;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setKhoangCachNguonNuoc",
						int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel,
					khoangCachNguonNuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNgapKhiMuaLon() {
		return _ngapKhiMuaLon;
	}

	@Override
	public void setNgapKhiMuaLon(int ngapKhiMuaLon) {
		_ngapKhiMuaLon = ngapKhiMuaLon;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setNgapKhiMuaLon", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, ngapKhiMuaLon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGhiChu() {
		return _ghiChu;
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDaKetThucDieuTra() {
		return _daKetThucDieuTra;
	}

	@Override
	public void setDaKetThucDieuTra(int daKetThucDieuTra) {
		_daKetThucDieuTra = daKetThucDieuTra;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setDaKetThucDieuTra", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, daKetThucDieuTra);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLyDoKhongHoanThanh() {
		return _lyDoKhongHoanThanh;
	}

	@Override
	public void setLyDoKhongHoanThanh(String lyDoKhongHoanThanh) {
		_lyDoKhongHoanThanh = lyDoKhongHoanThanh;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongHoanThanh",
						String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel,
					lyDoKhongHoanThanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImei() {
		return _imei;
	}

	@Override
	public void setImei(String imei) {
		_imei = imei;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setImei", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, imei);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTaiKhoan() {
		return _taiKhoan;
	}

	@Override
	public void setTaiKhoan(String taiKhoan) {
		_taiKhoan = taiKhoan;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setTaiKhoan", String.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, taiKhoan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDanhGiaKiemDem() {
		return _danhGiaKiemDem;
	}

	@Override
	public void setDanhGiaKiemDem(int danhGiaKiemDem) {
		_danhGiaKiemDem = danhGiaKiemDem;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setDanhGiaKiemDem", int.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, danhGiaKiemDem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSavePoint() {
		return _savePoint;
	}

	@Override
	public void setSavePoint(Date savePoint) {
		_savePoint = savePoint;

		if (_thongTinKiemDemHoGDRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemHoGDRemoteModel.getClass();

				Method method = clazz.getMethod("setSavePoint", Date.class);

				method.invoke(_thongTinKiemDemHoGDRemoteModel, savePoint);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getThongTinKiemDemHoGDRemoteModel() {
		return _thongTinKiemDemHoGDRemoteModel;
	}

	public void setThongTinKiemDemHoGDRemoteModel(
		BaseModel<?> thongTinKiemDemHoGDRemoteModel) {
		_thongTinKiemDemHoGDRemoteModel = thongTinKiemDemHoGDRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _thongTinKiemDemHoGDRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_thongTinKiemDemHoGDRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ThongTinKiemDemHoGDLocalServiceUtil.addThongTinKiemDemHoGD(this);
		}
		else {
			ThongTinKiemDemHoGDLocalServiceUtil.updateThongTinKiemDemHoGD(this);
		}
	}

	@Override
	public ThongTinKiemDemHoGD toEscapedModel() {
		return (ThongTinKiemDemHoGD)ProxyUtil.newProxyInstance(ThongTinKiemDemHoGD.class.getClassLoader(),
			new Class[] { ThongTinKiemDemHoGD.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ThongTinKiemDemHoGDClp clone = new ThongTinKiemDemHoGDClp();

		clone.setId(getId());
		clone.setVeSinhGiaDinhId(getVeSinhGiaDinhId());
		clone.setKeHoachKiemDemVeSinhId(getKeHoachKiemDemVeSinhId());
		clone.setMaTinh(getMaTinh());
		clone.setMaHuyen(getMaHuyen());
		clone.setMaXa(getMaXa());
		clone.setThonXom(getThonXom());
		clone.setTenChuHo(getTenChuHo());
		clone.setGioiTinhChuHo(getGioiTinhChuHo());
		clone.setNgayKiemDem(getNgayKiemDem());
		clone.setTimThayNha(getTimThayNha());
		clone.setCoNguoiONha(getCoNguoiONha());
		clone.setSoNguoiTrongHo(getSoNguoiTrongHo());
		clone.setHoTenNguoiTraLoi(getHoTenNguoiTraLoi());
		clone.setLaChuHoKhong(getLaChuHoKhong());
		clone.setGioiTinhNguoiTraLoi(getGioiTinhNguoiTraLoi());
		clone.setTenDanToc(getTenDanToc());
		clone.setKinhDo(getKinhDo());
		clone.setViDo(getViDo());
		clone.setThanhPhanHoGD(getThanhPhanHoGD());
		clone.setChuHoDungDS(getChuHoDungDS());
		clone.setLyDoKhongDungDS(getLyDoKhongDungDS());
		clone.setTenChuHoHienTai(getTenChuHoHienTai());
		clone.setGioiTinhChuHoHienTai(getGioiTinhChuHoHienTai());
		clone.setCoNhaTieu(getCoNhaTieu());
		clone.setLoaiNguonNuoc(getLoaiNguonNuoc());
		clone.setLoaiNhaTieu(getLoaiNhaTieu());
		clone.setAnhToanCanh(getAnhToanCanh());
		clone.setAnhTrongNhaTieu(getAnhTrongNhaTieu());
		clone.setThangXayDung(getThangXayDung());
		clone.setNamXayDung(getNamXayDung());
		clone.setNguonVon(getNguonVon());
		clone.setChiTietVonVay(getChiTietVonVay());
		clone.setDuocCaiTao(getDuocCaiTao());
		clone.setLoaiNhaTieuCu(getLoaiNhaTieuCu());
		clone.setAnhBeChua(getAnhBeChua());
		clone.setVeSinhSachSe(getVeSinhSachSe());
		clone.setDeLamVeSinh(getDeLamVeSinh());
		clone.setMuiVeSinh(getMuiVeSinh());
		clone.setPhiaTrenKinDao(getPhiaTrenKinDao());
		clone.setDuCheMuaGio(getDuCheMuaGio());
		clone.setSanCaoTrenToiThieu(getSanCaoTrenToiThieu());
		clone.setNapBeConTot(getNapBeConTot());
		clone.setCuaPhanBitKin(getCuaPhanBitKin());
		clone.setTranRaNgoai(getTranRaNgoai());
		clone.setNuocThaiDiDau(getNuocThaiDiDau());
		clone.setKhoangCachNguonNuoc(getKhoangCachNguonNuoc());
		clone.setNgapKhiMuaLon(getNgapKhiMuaLon());
		clone.setGhiChu(getGhiChu());
		clone.setDaKetThucDieuTra(getDaKetThucDieuTra());
		clone.setLyDoKhongHoanThanh(getLyDoKhongHoanThanh());
		clone.setImei(getImei());
		clone.setTaiKhoan(getTaiKhoan());
		clone.setDanhGiaKiemDem(getDanhGiaKiemDem());
		clone.setSavePoint(getSavePoint());

		return clone;
	}

	@Override
	public int compareTo(ThongTinKiemDemHoGD thongTinKiemDemHoGD) {
		int value = 0;

		if (getId() < thongTinKiemDemHoGD.getId()) {
			value = -1;
		}
		else if (getId() > thongTinKiemDemHoGD.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ThongTinKiemDemHoGDClp)) {
			return false;
		}

		ThongTinKiemDemHoGDClp thongTinKiemDemHoGD = (ThongTinKiemDemHoGDClp)obj;

		int primaryKey = thongTinKiemDemHoGD.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(111);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", veSinhGiaDinhId=");
		sb.append(getVeSinhGiaDinhId());
		sb.append(", keHoachKiemDemVeSinhId=");
		sb.append(getKeHoachKiemDemVeSinhId());
		sb.append(", maTinh=");
		sb.append(getMaTinh());
		sb.append(", maHuyen=");
		sb.append(getMaHuyen());
		sb.append(", maXa=");
		sb.append(getMaXa());
		sb.append(", thonXom=");
		sb.append(getThonXom());
		sb.append(", tenChuHo=");
		sb.append(getTenChuHo());
		sb.append(", gioiTinhChuHo=");
		sb.append(getGioiTinhChuHo());
		sb.append(", ngayKiemDem=");
		sb.append(getNgayKiemDem());
		sb.append(", timThayNha=");
		sb.append(getTimThayNha());
		sb.append(", coNguoiONha=");
		sb.append(getCoNguoiONha());
		sb.append(", soNguoiTrongHo=");
		sb.append(getSoNguoiTrongHo());
		sb.append(", hoTenNguoiTraLoi=");
		sb.append(getHoTenNguoiTraLoi());
		sb.append(", laChuHoKhong=");
		sb.append(getLaChuHoKhong());
		sb.append(", gioiTinhNguoiTraLoi=");
		sb.append(getGioiTinhNguoiTraLoi());
		sb.append(", tenDanToc=");
		sb.append(getTenDanToc());
		sb.append(", kinhDo=");
		sb.append(getKinhDo());
		sb.append(", viDo=");
		sb.append(getViDo());
		sb.append(", thanhPhanHoGD=");
		sb.append(getThanhPhanHoGD());
		sb.append(", chuHoDungDS=");
		sb.append(getChuHoDungDS());
		sb.append(", lyDoKhongDungDS=");
		sb.append(getLyDoKhongDungDS());
		sb.append(", tenChuHoHienTai=");
		sb.append(getTenChuHoHienTai());
		sb.append(", gioiTinhChuHoHienTai=");
		sb.append(getGioiTinhChuHoHienTai());
		sb.append(", coNhaTieu=");
		sb.append(getCoNhaTieu());
		sb.append(", loaiNguonNuoc=");
		sb.append(getLoaiNguonNuoc());
		sb.append(", loaiNhaTieu=");
		sb.append(getLoaiNhaTieu());
		sb.append(", anhToanCanh=");
		sb.append(getAnhToanCanh());
		sb.append(", anhTrongNhaTieu=");
		sb.append(getAnhTrongNhaTieu());
		sb.append(", thangXayDung=");
		sb.append(getThangXayDung());
		sb.append(", namXayDung=");
		sb.append(getNamXayDung());
		sb.append(", nguonVon=");
		sb.append(getNguonVon());
		sb.append(", chiTietVonVay=");
		sb.append(getChiTietVonVay());
		sb.append(", duocCaiTao=");
		sb.append(getDuocCaiTao());
		sb.append(", loaiNhaTieuCu=");
		sb.append(getLoaiNhaTieuCu());
		sb.append(", anhBeChua=");
		sb.append(getAnhBeChua());
		sb.append(", veSinhSachSe=");
		sb.append(getVeSinhSachSe());
		sb.append(", deLamVeSinh=");
		sb.append(getDeLamVeSinh());
		sb.append(", muiVeSinh=");
		sb.append(getMuiVeSinh());
		sb.append(", phiaTrenKinDao=");
		sb.append(getPhiaTrenKinDao());
		sb.append(", duCheMuaGio=");
		sb.append(getDuCheMuaGio());
		sb.append(", sanCaoTrenToiThieu=");
		sb.append(getSanCaoTrenToiThieu());
		sb.append(", napBeConTot=");
		sb.append(getNapBeConTot());
		sb.append(", cuaPhanBitKin=");
		sb.append(getCuaPhanBitKin());
		sb.append(", tranRaNgoai=");
		sb.append(getTranRaNgoai());
		sb.append(", nuocThaiDiDau=");
		sb.append(getNuocThaiDiDau());
		sb.append(", khoangCachNguonNuoc=");
		sb.append(getKhoangCachNguonNuoc());
		sb.append(", ngapKhiMuaLon=");
		sb.append(getNgapKhiMuaLon());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", daKetThucDieuTra=");
		sb.append(getDaKetThucDieuTra());
		sb.append(", lyDoKhongHoanThanh=");
		sb.append(getLyDoKhongHoanThanh());
		sb.append(", imei=");
		sb.append(getImei());
		sb.append(", taiKhoan=");
		sb.append(getTaiKhoan());
		sb.append(", danhGiaKiemDem=");
		sb.append(getDanhGiaKiemDem());
		sb.append(", savePoint=");
		sb.append(getSavePoint());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(169);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>veSinhGiaDinhId</column-name><column-value><![CDATA[");
		sb.append(getVeSinhGiaDinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keHoachKiemDemVeSinhId</column-name><column-value><![CDATA[");
		sb.append(getKeHoachKiemDemVeSinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTinh</column-name><column-value><![CDATA[");
		sb.append(getMaTinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maHuyen</column-name><column-value><![CDATA[");
		sb.append(getMaHuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maXa</column-name><column-value><![CDATA[");
		sb.append(getMaXa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thonXom</column-name><column-value><![CDATA[");
		sb.append(getThonXom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenChuHo</column-name><column-value><![CDATA[");
		sb.append(getTenChuHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioiTinhChuHo</column-name><column-value><![CDATA[");
		sb.append(getGioiTinhChuHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayKiemDem</column-name><column-value><![CDATA[");
		sb.append(getNgayKiemDem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timThayNha</column-name><column-value><![CDATA[");
		sb.append(getTimThayNha());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coNguoiONha</column-name><column-value><![CDATA[");
		sb.append(getCoNguoiONha());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNguoiTrongHo</column-name><column-value><![CDATA[");
		sb.append(getSoNguoiTrongHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoTenNguoiTraLoi</column-name><column-value><![CDATA[");
		sb.append(getHoTenNguoiTraLoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>laChuHoKhong</column-name><column-value><![CDATA[");
		sb.append(getLaChuHoKhong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioiTinhNguoiTraLoi</column-name><column-value><![CDATA[");
		sb.append(getGioiTinhNguoiTraLoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenDanToc</column-name><column-value><![CDATA[");
		sb.append(getTenDanToc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kinhDo</column-name><column-value><![CDATA[");
		sb.append(getKinhDo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viDo</column-name><column-value><![CDATA[");
		sb.append(getViDo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhPhanHoGD</column-name><column-value><![CDATA[");
		sb.append(getThanhPhanHoGD());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chuHoDungDS</column-name><column-value><![CDATA[");
		sb.append(getChuHoDungDS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDungDS</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDungDS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenChuHoHienTai</column-name><column-value><![CDATA[");
		sb.append(getTenChuHoHienTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioiTinhChuHoHienTai</column-name><column-value><![CDATA[");
		sb.append(getGioiTinhChuHoHienTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coNhaTieu</column-name><column-value><![CDATA[");
		sb.append(getCoNhaTieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiNguonNuoc</column-name><column-value><![CDATA[");
		sb.append(getLoaiNguonNuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiNhaTieu</column-name><column-value><![CDATA[");
		sb.append(getLoaiNhaTieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anhToanCanh</column-name><column-value><![CDATA[");
		sb.append(getAnhToanCanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anhTrongNhaTieu</column-name><column-value><![CDATA[");
		sb.append(getAnhTrongNhaTieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thangXayDung</column-name><column-value><![CDATA[");
		sb.append(getThangXayDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namXayDung</column-name><column-value><![CDATA[");
		sb.append(getNamXayDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguonVon</column-name><column-value><![CDATA[");
		sb.append(getNguonVon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chiTietVonVay</column-name><column-value><![CDATA[");
		sb.append(getChiTietVonVay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duocCaiTao</column-name><column-value><![CDATA[");
		sb.append(getDuocCaiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiNhaTieuCu</column-name><column-value><![CDATA[");
		sb.append(getLoaiNhaTieuCu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anhBeChua</column-name><column-value><![CDATA[");
		sb.append(getAnhBeChua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>veSinhSachSe</column-name><column-value><![CDATA[");
		sb.append(getVeSinhSachSe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deLamVeSinh</column-name><column-value><![CDATA[");
		sb.append(getDeLamVeSinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>muiVeSinh</column-name><column-value><![CDATA[");
		sb.append(getMuiVeSinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phiaTrenKinDao</column-name><column-value><![CDATA[");
		sb.append(getPhiaTrenKinDao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duCheMuaGio</column-name><column-value><![CDATA[");
		sb.append(getDuCheMuaGio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sanCaoTrenToiThieu</column-name><column-value><![CDATA[");
		sb.append(getSanCaoTrenToiThieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>napBeConTot</column-name><column-value><![CDATA[");
		sb.append(getNapBeConTot());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cuaPhanBitKin</column-name><column-value><![CDATA[");
		sb.append(getCuaPhanBitKin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tranRaNgoai</column-name><column-value><![CDATA[");
		sb.append(getTranRaNgoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nuocThaiDiDau</column-name><column-value><![CDATA[");
		sb.append(getNuocThaiDiDau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>khoangCachNguonNuoc</column-name><column-value><![CDATA[");
		sb.append(getKhoangCachNguonNuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngapKhiMuaLon</column-name><column-value><![CDATA[");
		sb.append(getNgapKhiMuaLon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daKetThucDieuTra</column-name><column-value><![CDATA[");
		sb.append(getDaKetThucDieuTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongHoanThanh</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongHoanThanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imei</column-name><column-value><![CDATA[");
		sb.append(getImei());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taiKhoan</column-name><column-value><![CDATA[");
		sb.append(getTaiKhoan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>danhGiaKiemDem</column-name><column-value><![CDATA[");
		sb.append(getDanhGiaKiemDem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>savePoint</column-name><column-value><![CDATA[");
		sb.append(getSavePoint());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private int _veSinhGiaDinhId;
	private int _keHoachKiemDemVeSinhId;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _thonXom;
	private String _tenChuHo;
	private int _gioiTinhChuHo;
	private Date _ngayKiemDem;
	private int _timThayNha;
	private int _coNguoiONha;
	private int _soNguoiTrongHo;
	private String _hoTenNguoiTraLoi;
	private int _laChuHoKhong;
	private String _gioiTinhNguoiTraLoi;
	private String _tenDanToc;
	private String _kinhDo;
	private String _viDo;
	private int _thanhPhanHoGD;
	private int _chuHoDungDS;
	private String _lyDoKhongDungDS;
	private String _tenChuHoHienTai;
	private int _gioiTinhChuHoHienTai;
	private int _coNhaTieu;
	private String _loaiNguonNuoc;
	private String _loaiNhaTieu;
	private String _anhToanCanh;
	private String _anhTrongNhaTieu;
	private int _thangXayDung;
	private int _namXayDung;
	private int _nguonVon;
	private String _chiTietVonVay;
	private int _duocCaiTao;
	private String _loaiNhaTieuCu;
	private String _anhBeChua;
	private int _veSinhSachSe;
	private int _deLamVeSinh;
	private int _muiVeSinh;
	private int _phiaTrenKinDao;
	private int _duCheMuaGio;
	private int _sanCaoTrenToiThieu;
	private int _napBeConTot;
	private int _cuaPhanBitKin;
	private int _tranRaNgoai;
	private int _nuocThaiDiDau;
	private int _khoangCachNguonNuoc;
	private int _ngapKhiMuaLon;
	private String _ghiChu;
	private int _daKetThucDieuTra;
	private String _lyDoKhongHoanThanh;
	private String _imei;
	private String _taiKhoan;
	private int _danhGiaKiemDem;
	private Date _savePoint;
	private BaseModel<?> _thongTinKiemDemHoGDRemoteModel;
}