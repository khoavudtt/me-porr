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
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemCongTrinhLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author BinhTH
 */
public class ThongTinKiemDemCongTrinhClp extends BaseModelImpl<ThongTinKiemDemCongTrinh>
	implements ThongTinKiemDemCongTrinh {
	public ThongTinKiemDemCongTrinhClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ThongTinKiemDemCongTrinh.class;
	}

	@Override
	public String getModelClassName() {
		return ThongTinKiemDemCongTrinh.class.getName();
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
		attributes.put("veSinhConTrinhId", getVeSinhConTrinhId());
		attributes.put("keHoachKiemDemVeSinhId", getKeHoachKiemDemVeSinhId());
		attributes.put("tenCongTrinh", getTenCongTrinh());
		attributes.put("loaiCongTrinh", getLoaiCongTrinh());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("diaChi", getDiaChi());
		attributes.put("ngayKiemDem", getNgayKiemDem());
		attributes.put("hoTenNguoiTraLoi", getHoTenNguoiTraLoi());
		attributes.put("soDienThoai", getSoDienThoai());
		attributes.put("gioiTinhNguoiTraLoi", getGioiTinhNguoiTraLoi());
		attributes.put("vaiTroChucDanh", getVaiTroChucDanh());
		attributes.put("soCa", getSoCa());
		attributes.put("soNguoiTrongCa", getSoNguoiTrongCa());
		attributes.put("kinhDo", getKinhDo());
		attributes.put("viDo", getViDo());
		attributes.put("loaiNguonNuoc", getLoaiNguonNuoc());
		attributes.put("daTQCVN", getDaTQCVN());
		attributes.put("datTieuChuanHVS", getDatTieuChuanHVS());
		attributes.put("anhChupChungNhan", getAnhChupChungNhan());
		attributes.put("soNhaTieu", getSoNhaTieu());
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

		Integer veSinhConTrinhId = (Integer)attributes.get("veSinhConTrinhId");

		if (veSinhConTrinhId != null) {
			setVeSinhConTrinhId(veSinhConTrinhId);
		}

		Integer keHoachKiemDemVeSinhId = (Integer)attributes.get(
				"keHoachKiemDemVeSinhId");

		if (keHoachKiemDemVeSinhId != null) {
			setKeHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);
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

		Date ngayKiemDem = (Date)attributes.get("ngayKiemDem");

		if (ngayKiemDem != null) {
			setNgayKiemDem(ngayKiemDem);
		}

		String hoTenNguoiTraLoi = (String)attributes.get("hoTenNguoiTraLoi");

		if (hoTenNguoiTraLoi != null) {
			setHoTenNguoiTraLoi(hoTenNguoiTraLoi);
		}

		String soDienThoai = (String)attributes.get("soDienThoai");

		if (soDienThoai != null) {
			setSoDienThoai(soDienThoai);
		}

		String gioiTinhNguoiTraLoi = (String)attributes.get(
				"gioiTinhNguoiTraLoi");

		if (gioiTinhNguoiTraLoi != null) {
			setGioiTinhNguoiTraLoi(gioiTinhNguoiTraLoi);
		}

		String vaiTroChucDanh = (String)attributes.get("vaiTroChucDanh");

		if (vaiTroChucDanh != null) {
			setVaiTroChucDanh(vaiTroChucDanh);
		}

		Integer soCa = (Integer)attributes.get("soCa");

		if (soCa != null) {
			setSoCa(soCa);
		}

		Integer soNguoiTrongCa = (Integer)attributes.get("soNguoiTrongCa");

		if (soNguoiTrongCa != null) {
			setSoNguoiTrongCa(soNguoiTrongCa);
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

		Integer daTQCVN = (Integer)attributes.get("daTQCVN");

		if (daTQCVN != null) {
			setDaTQCVN(daTQCVN);
		}

		Integer datTieuChuanHVS = (Integer)attributes.get("datTieuChuanHVS");

		if (datTieuChuanHVS != null) {
			setDatTieuChuanHVS(datTieuChuanHVS);
		}

		String anhChupChungNhan = (String)attributes.get("anhChupChungNhan");

		if (anhChupChungNhan != null) {
			setAnhChupChungNhan(anhChupChungNhan);
		}

		Integer soNhaTieu = (Integer)attributes.get("soNhaTieu");

		if (soNhaTieu != null) {
			setSoNhaTieu(soNhaTieu);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getVeSinhConTrinhId() {
		return _veSinhConTrinhId;
	}

	@Override
	public void setVeSinhConTrinhId(int veSinhConTrinhId) {
		_veSinhConTrinhId = veSinhConTrinhId;

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setVeSinhConTrinhId", int.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
					veSinhConTrinhId);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setKeHoachKiemDemVeSinhId",
						int.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
					keHoachKiemDemVeSinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenCongTrinh() {
		return _tenCongTrinh;
	}

	@Override
	public void setTenCongTrinh(String tenCongTrinh) {
		_tenCongTrinh = tenCongTrinh;

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTenCongTrinh", String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, tenCongTrinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoaiCongTrinh() {
		return _loaiCongTrinh;
	}

	@Override
	public void setLoaiCongTrinh(int loaiCongTrinh) {
		_loaiCongTrinh = loaiCongTrinh;

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiCongTrinh", int.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
					loaiCongTrinh);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, maTinh);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyen", String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, maHuyen);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMaXa", String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, maXa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChi() {
		return _diaChi;
	}

	@Override
	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, diaChi);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayKiemDem", Date.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, ngayKiemDem);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setHoTenNguoiTraLoi",
						String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
					hoTenNguoiTraLoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoDienThoai() {
		return _soDienThoai;
	}

	@Override
	public void setSoDienThoai(String soDienThoai) {
		_soDienThoai = soDienThoai;

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDienThoai", String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, soDienThoai);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinhNguoiTraLoi",
						String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
					gioiTinhNguoiTraLoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVaiTroChucDanh() {
		return _vaiTroChucDanh;
	}

	@Override
	public void setVaiTroChucDanh(String vaiTroChucDanh) {
		_vaiTroChucDanh = vaiTroChucDanh;

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setVaiTroChucDanh",
						String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
					vaiTroChucDanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoCa() {
		return _soCa;
	}

	@Override
	public void setSoCa(int soCa) {
		_soCa = soCa;

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setSoCa", int.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, soCa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNguoiTrongCa() {
		return _soNguoiTrongCa;
	}

	@Override
	public void setSoNguoiTrongCa(int soNguoiTrongCa) {
		_soNguoiTrongCa = soNguoiTrongCa;

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNguoiTrongCa", int.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
					soNguoiTrongCa);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setKinhDo", String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, kinhDo);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setViDo", String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, viDo);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiNguonNuoc", String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
					loaiNguonNuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDaTQCVN() {
		return _daTQCVN;
	}

	@Override
	public void setDaTQCVN(int daTQCVN) {
		_daTQCVN = daTQCVN;

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDaTQCVN", int.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, daTQCVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDatTieuChuanHVS() {
		return _datTieuChuanHVS;
	}

	@Override
	public void setDatTieuChuanHVS(int datTieuChuanHVS) {
		_datTieuChuanHVS = datTieuChuanHVS;

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDatTieuChuanHVS", int.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
					datTieuChuanHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnhChupChungNhan() {
		return _anhChupChungNhan;
	}

	@Override
	public void setAnhChupChungNhan(String anhChupChungNhan) {
		_anhChupChungNhan = anhChupChungNhan;

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setAnhChupChungNhan",
						String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
					anhChupChungNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNhaTieu() {
		return _soNhaTieu;
	}

	@Override
	public void setSoNhaTieu(int soNhaTieu) {
		_soNhaTieu = soNhaTieu;

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNhaTieu", int.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, soNhaTieu);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, ghiChu);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDaKetThucDieuTra", int.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
					daKetThucDieuTra);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongHoanThanh",
						String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setImei", String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, imei);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTaiKhoan", String.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, taiKhoan);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDanhGiaKiemDem", int.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
					danhGiaKiemDem);
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

		if (_thongTinKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _thongTinKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setSavePoint", Date.class);

				method.invoke(_thongTinKiemDemCongTrinhRemoteModel, savePoint);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getThongTinKiemDemCongTrinhRemoteModel() {
		return _thongTinKiemDemCongTrinhRemoteModel;
	}

	public void setThongTinKiemDemCongTrinhRemoteModel(
		BaseModel<?> thongTinKiemDemCongTrinhRemoteModel) {
		_thongTinKiemDemCongTrinhRemoteModel = thongTinKiemDemCongTrinhRemoteModel;
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

		Class<?> remoteModelClass = _thongTinKiemDemCongTrinhRemoteModel.getClass();

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

		Object returnValue = method.invoke(_thongTinKiemDemCongTrinhRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ThongTinKiemDemCongTrinhLocalServiceUtil.addThongTinKiemDemCongTrinh(this);
		}
		else {
			ThongTinKiemDemCongTrinhLocalServiceUtil.updateThongTinKiemDemCongTrinh(this);
		}
	}

	@Override
	public ThongTinKiemDemCongTrinh toEscapedModel() {
		return (ThongTinKiemDemCongTrinh)ProxyUtil.newProxyInstance(ThongTinKiemDemCongTrinh.class.getClassLoader(),
			new Class[] { ThongTinKiemDemCongTrinh.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ThongTinKiemDemCongTrinhClp clone = new ThongTinKiemDemCongTrinhClp();

		clone.setId(getId());
		clone.setVeSinhConTrinhId(getVeSinhConTrinhId());
		clone.setKeHoachKiemDemVeSinhId(getKeHoachKiemDemVeSinhId());
		clone.setTenCongTrinh(getTenCongTrinh());
		clone.setLoaiCongTrinh(getLoaiCongTrinh());
		clone.setMaTinh(getMaTinh());
		clone.setMaHuyen(getMaHuyen());
		clone.setMaXa(getMaXa());
		clone.setDiaChi(getDiaChi());
		clone.setNgayKiemDem(getNgayKiemDem());
		clone.setHoTenNguoiTraLoi(getHoTenNguoiTraLoi());
		clone.setSoDienThoai(getSoDienThoai());
		clone.setGioiTinhNguoiTraLoi(getGioiTinhNguoiTraLoi());
		clone.setVaiTroChucDanh(getVaiTroChucDanh());
		clone.setSoCa(getSoCa());
		clone.setSoNguoiTrongCa(getSoNguoiTrongCa());
		clone.setKinhDo(getKinhDo());
		clone.setViDo(getViDo());
		clone.setLoaiNguonNuoc(getLoaiNguonNuoc());
		clone.setDaTQCVN(getDaTQCVN());
		clone.setDatTieuChuanHVS(getDatTieuChuanHVS());
		clone.setAnhChupChungNhan(getAnhChupChungNhan());
		clone.setSoNhaTieu(getSoNhaTieu());
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
	public int compareTo(ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh) {
		int value = 0;

		if (getId() < thongTinKiemDemCongTrinh.getId()) {
			value = -1;
		}
		else if (getId() > thongTinKiemDemCongTrinh.getId()) {
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

		if (!(obj instanceof ThongTinKiemDemCongTrinhClp)) {
			return false;
		}

		ThongTinKiemDemCongTrinhClp thongTinKiemDemCongTrinh = (ThongTinKiemDemCongTrinhClp)obj;

		int primaryKey = thongTinKiemDemCongTrinh.getPrimaryKey();

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
		StringBundler sb = new StringBundler(61);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", veSinhConTrinhId=");
		sb.append(getVeSinhConTrinhId());
		sb.append(", keHoachKiemDemVeSinhId=");
		sb.append(getKeHoachKiemDemVeSinhId());
		sb.append(", tenCongTrinh=");
		sb.append(getTenCongTrinh());
		sb.append(", loaiCongTrinh=");
		sb.append(getLoaiCongTrinh());
		sb.append(", maTinh=");
		sb.append(getMaTinh());
		sb.append(", maHuyen=");
		sb.append(getMaHuyen());
		sb.append(", maXa=");
		sb.append(getMaXa());
		sb.append(", diaChi=");
		sb.append(getDiaChi());
		sb.append(", ngayKiemDem=");
		sb.append(getNgayKiemDem());
		sb.append(", hoTenNguoiTraLoi=");
		sb.append(getHoTenNguoiTraLoi());
		sb.append(", soDienThoai=");
		sb.append(getSoDienThoai());
		sb.append(", gioiTinhNguoiTraLoi=");
		sb.append(getGioiTinhNguoiTraLoi());
		sb.append(", vaiTroChucDanh=");
		sb.append(getVaiTroChucDanh());
		sb.append(", soCa=");
		sb.append(getSoCa());
		sb.append(", soNguoiTrongCa=");
		sb.append(getSoNguoiTrongCa());
		sb.append(", kinhDo=");
		sb.append(getKinhDo());
		sb.append(", viDo=");
		sb.append(getViDo());
		sb.append(", loaiNguonNuoc=");
		sb.append(getLoaiNguonNuoc());
		sb.append(", daTQCVN=");
		sb.append(getDaTQCVN());
		sb.append(", datTieuChuanHVS=");
		sb.append(getDatTieuChuanHVS());
		sb.append(", anhChupChungNhan=");
		sb.append(getAnhChupChungNhan());
		sb.append(", soNhaTieu=");
		sb.append(getSoNhaTieu());
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
		StringBundler sb = new StringBundler(94);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>veSinhConTrinhId</column-name><column-value><![CDATA[");
		sb.append(getVeSinhConTrinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keHoachKiemDemVeSinhId</column-name><column-value><![CDATA[");
		sb.append(getKeHoachKiemDemVeSinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenCongTrinh</column-name><column-value><![CDATA[");
		sb.append(getTenCongTrinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiCongTrinh</column-name><column-value><![CDATA[");
		sb.append(getLoaiCongTrinh());
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
			"<column><column-name>diaChi</column-name><column-value><![CDATA[");
		sb.append(getDiaChi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayKiemDem</column-name><column-value><![CDATA[");
		sb.append(getNgayKiemDem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoTenNguoiTraLoi</column-name><column-value><![CDATA[");
		sb.append(getHoTenNguoiTraLoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDienThoai</column-name><column-value><![CDATA[");
		sb.append(getSoDienThoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioiTinhNguoiTraLoi</column-name><column-value><![CDATA[");
		sb.append(getGioiTinhNguoiTraLoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroChucDanh</column-name><column-value><![CDATA[");
		sb.append(getVaiTroChucDanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soCa</column-name><column-value><![CDATA[");
		sb.append(getSoCa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNguoiTrongCa</column-name><column-value><![CDATA[");
		sb.append(getSoNguoiTrongCa());
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
			"<column><column-name>loaiNguonNuoc</column-name><column-value><![CDATA[");
		sb.append(getLoaiNguonNuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daTQCVN</column-name><column-value><![CDATA[");
		sb.append(getDaTQCVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>datTieuChuanHVS</column-name><column-value><![CDATA[");
		sb.append(getDatTieuChuanHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anhChupChungNhan</column-name><column-value><![CDATA[");
		sb.append(getAnhChupChungNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNhaTieu</column-name><column-value><![CDATA[");
		sb.append(getSoNhaTieu());
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
	private int _veSinhConTrinhId;
	private int _keHoachKiemDemVeSinhId;
	private String _tenCongTrinh;
	private int _loaiCongTrinh;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _diaChi;
	private Date _ngayKiemDem;
	private String _hoTenNguoiTraLoi;
	private String _soDienThoai;
	private String _gioiTinhNguoiTraLoi;
	private String _vaiTroChucDanh;
	private int _soCa;
	private int _soNguoiTrongCa;
	private String _kinhDo;
	private String _viDo;
	private String _loaiNguonNuoc;
	private int _daTQCVN;
	private int _datTieuChuanHVS;
	private String _anhChupChungNhan;
	private int _soNhaTieu;
	private String _ghiChu;
	private int _daKetThucDieuTra;
	private String _lyDoKhongHoanThanh;
	private String _imei;
	private String _taiKhoan;
	private int _danhGiaKiemDem;
	private Date _savePoint;
	private BaseModel<?> _thongTinKiemDemCongTrinhRemoteModel;
}