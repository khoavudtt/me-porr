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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.sol.ns.tramcap.dao.service.ClpSerializer;
import vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author khoa.vu
 */
public class THONGTINKIEMDEMNUOCClp extends BaseModelImpl<THONGTINKIEMDEMNUOC>
	implements THONGTINKIEMDEMNUOC {
	public THONGTINKIEMDEMNUOCClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return THONGTINKIEMDEMNUOC.class;
	}

	@Override
	public String getModelClassName() {
		return THONGTINKIEMDEMNUOC.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dauNoiNuocId", getDauNoiNuocId());
		attributes.put("keHoachKiemDemNuocId", getKeHoachKiemDemNuocId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("maHuyen", getMaHuyen());
		attributes.put("maXa", getMaXa());
		attributes.put("thonXom", getThonXom());
		attributes.put("tenChuHo", getTenChuHo());
		attributes.put("gioiTinhChuHo", getGioiTinhChuHo());
		attributes.put("ngayKiemDem", getNgayKiemDem());
		attributes.put("timThayNha", getTimThayNha());
		attributes.put("coNguoiONha", getCoNguoiONha());
		attributes.put("hoTenNguoiTraLoi", getHoTenNguoiTraLoi());
		attributes.put("laChuHoKhong", getLaChuHoKhong());
		attributes.put("gioiTinhNguoiTraLoi", getGioiTinhNguoiTraLoi());
		attributes.put("tenDanToc", getTenDanToc());
		attributes.put("kinhDo", getKinhDo());
		attributes.put("viDo", getViDo());
		attributes.put("soNguoiTrongHo", getSoNguoiTrongHo());
		attributes.put("thanhPhanHoGd", getThanhPhanHoGd());
		attributes.put("chuHoDungDs", getChuHoDungDs());
		attributes.put("lyDoKhongDungDs", getLyDoKhongDungDs());
		attributes.put("tenChuHoHienTai", getTenChuHoHienTai());
		attributes.put("gioiTinhChuHoHienTai", getGioiTinhChuHoHienTai());
		attributes.put("dauNoiChua", getDauNoiChua());
		attributes.put("anhDauNoi", getAnhDauNoi());
		attributes.put("thoiGianDauHopDong", getThoiGianDauHopDong());
		attributes.put("thoiGianDauNoiThucTe", getThoiGianDauNoiThucTe());
		attributes.put("voiNuocChayKhong", getVoiNuocChayKhong());
		attributes.put("nuocTrongKhong", getNuocTrongKhong());
		attributes.put("mauNuoc", getMauNuoc());
		attributes.put("muiNuoc", getMuiNuoc());
		attributes.put("viNuoc", getViNuoc());
		attributes.put("loaiKhac", getLoaiKhac());
		attributes.put("daTungDucKhong", getDaTungDucKhong());
		attributes.put("mauNuocTungCo", getMauNuocTungCo());
		attributes.put("muiNuocTungCo", getMuiNuocTungCo());
		attributes.put("viNuocTungCo", getViNuocTungCo());
		attributes.put("loaiKhacTungCo", getLoaiKhacTungCo());
		attributes.put("coBeChuaNuoc", getCoBeChuaNuoc());
		attributes.put("tinhTrangBe", getTinhTrangBe());
		attributes.put("anhBeChua", getAnhBeChua());
		attributes.put("biMatNuoc", getBiMatNuoc());
		attributes.put("soLanMatNuoc", getSoLanMatNuoc());
		attributes.put("soGioTrungBinh", getSoGioTrungBinh());
		attributes.put("soSeRyDongHo", getSoSeRyDongHo());
		attributes.put("chiSoDongHo", getChiSoDongHo());
		attributes.put("anhDongHo", getAnhDongHo());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("daKetThucDieuTra", getDaKetThucDieuTra());
		attributes.put("lyDoKhongHoanThanh", getLyDoKhongHoanThanh());
		attributes.put("iMei", getIMei());
		attributes.put("taiKhoan", getTaiKhoan());
		attributes.put("danhGiaKiemDem", getDanhGiaKiemDem());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dauNoiNuocId = (Long)attributes.get("dauNoiNuocId");

		if (dauNoiNuocId != null) {
			setDauNoiNuocId(dauNoiNuocId);
		}

		Integer keHoachKiemDemNuocId = (Integer)attributes.get(
				"keHoachKiemDemNuocId");

		if (keHoachKiemDemNuocId != null) {
			setKeHoachKiemDemNuocId(keHoachKiemDemNuocId);
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

		Integer soNguoiTrongHo = (Integer)attributes.get("soNguoiTrongHo");

		if (soNguoiTrongHo != null) {
			setSoNguoiTrongHo(soNguoiTrongHo);
		}

		Integer thanhPhanHoGd = (Integer)attributes.get("thanhPhanHoGd");

		if (thanhPhanHoGd != null) {
			setThanhPhanHoGd(thanhPhanHoGd);
		}

		Integer chuHoDungDs = (Integer)attributes.get("chuHoDungDs");

		if (chuHoDungDs != null) {
			setChuHoDungDs(chuHoDungDs);
		}

		String lyDoKhongDungDs = (String)attributes.get("lyDoKhongDungDs");

		if (lyDoKhongDungDs != null) {
			setLyDoKhongDungDs(lyDoKhongDungDs);
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

		Integer dauNoiChua = (Integer)attributes.get("dauNoiChua");

		if (dauNoiChua != null) {
			setDauNoiChua(dauNoiChua);
		}

		String anhDauNoi = (String)attributes.get("anhDauNoi");

		if (anhDauNoi != null) {
			setAnhDauNoi(anhDauNoi);
		}

		Date thoiGianDauHopDong = (Date)attributes.get("thoiGianDauHopDong");

		if (thoiGianDauHopDong != null) {
			setThoiGianDauHopDong(thoiGianDauHopDong);
		}

		Date thoiGianDauNoiThucTe = (Date)attributes.get("thoiGianDauNoiThucTe");

		if (thoiGianDauNoiThucTe != null) {
			setThoiGianDauNoiThucTe(thoiGianDauNoiThucTe);
		}

		Integer voiNuocChayKhong = (Integer)attributes.get("voiNuocChayKhong");

		if (voiNuocChayKhong != null) {
			setVoiNuocChayKhong(voiNuocChayKhong);
		}

		Integer nuocTrongKhong = (Integer)attributes.get("nuocTrongKhong");

		if (nuocTrongKhong != null) {
			setNuocTrongKhong(nuocTrongKhong);
		}

		String mauNuoc = (String)attributes.get("mauNuoc");

		if (mauNuoc != null) {
			setMauNuoc(mauNuoc);
		}

		String muiNuoc = (String)attributes.get("muiNuoc");

		if (muiNuoc != null) {
			setMuiNuoc(muiNuoc);
		}

		String viNuoc = (String)attributes.get("viNuoc");

		if (viNuoc != null) {
			setViNuoc(viNuoc);
		}

		String loaiKhac = (String)attributes.get("loaiKhac");

		if (loaiKhac != null) {
			setLoaiKhac(loaiKhac);
		}

		Integer daTungDucKhong = (Integer)attributes.get("daTungDucKhong");

		if (daTungDucKhong != null) {
			setDaTungDucKhong(daTungDucKhong);
		}

		String mauNuocTungCo = (String)attributes.get("mauNuocTungCo");

		if (mauNuocTungCo != null) {
			setMauNuocTungCo(mauNuocTungCo);
		}

		String muiNuocTungCo = (String)attributes.get("muiNuocTungCo");

		if (muiNuocTungCo != null) {
			setMuiNuocTungCo(muiNuocTungCo);
		}

		String viNuocTungCo = (String)attributes.get("viNuocTungCo");

		if (viNuocTungCo != null) {
			setViNuocTungCo(viNuocTungCo);
		}

		String loaiKhacTungCo = (String)attributes.get("loaiKhacTungCo");

		if (loaiKhacTungCo != null) {
			setLoaiKhacTungCo(loaiKhacTungCo);
		}

		Integer coBeChuaNuoc = (Integer)attributes.get("coBeChuaNuoc");

		if (coBeChuaNuoc != null) {
			setCoBeChuaNuoc(coBeChuaNuoc);
		}

		Integer tinhTrangBe = (Integer)attributes.get("tinhTrangBe");

		if (tinhTrangBe != null) {
			setTinhTrangBe(tinhTrangBe);
		}

		String anhBeChua = (String)attributes.get("anhBeChua");

		if (anhBeChua != null) {
			setAnhBeChua(anhBeChua);
		}

		Integer biMatNuoc = (Integer)attributes.get("biMatNuoc");

		if (biMatNuoc != null) {
			setBiMatNuoc(biMatNuoc);
		}

		Integer soLanMatNuoc = (Integer)attributes.get("soLanMatNuoc");

		if (soLanMatNuoc != null) {
			setSoLanMatNuoc(soLanMatNuoc);
		}

		Integer soGioTrungBinh = (Integer)attributes.get("soGioTrungBinh");

		if (soGioTrungBinh != null) {
			setSoGioTrungBinh(soGioTrungBinh);
		}

		String soSeRyDongHo = (String)attributes.get("soSeRyDongHo");

		if (soSeRyDongHo != null) {
			setSoSeRyDongHo(soSeRyDongHo);
		}

		String chiSoDongHo = (String)attributes.get("chiSoDongHo");

		if (chiSoDongHo != null) {
			setChiSoDongHo(chiSoDongHo);
		}

		String anhDongHo = (String)attributes.get("anhDongHo");

		if (anhDongHo != null) {
			setAnhDongHo(anhDongHo);
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

		String iMei = (String)attributes.get("iMei");

		if (iMei != null) {
			setIMei(iMei);
		}

		String taiKhoan = (String)attributes.get("taiKhoan");

		if (taiKhoan != null) {
			setTaiKhoan(taiKhoan);
		}

		Integer danhGiaKiemDem = (Integer)attributes.get("danhGiaKiemDem");

		if (danhGiaKiemDem != null) {
			setDanhGiaKiemDem(danhGiaKiemDem);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDauNoiNuocId() {
		return _dauNoiNuocId;
	}

	@Override
	public void setDauNoiNuocId(long dauNoiNuocId) {
		_dauNoiNuocId = dauNoiNuocId;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setDauNoiNuocId", long.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, dauNoiNuocId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKeHoachKiemDemNuocId() {
		return _keHoachKiemDemNuocId;
	}

	@Override
	public void setKeHoachKiemDemNuocId(int keHoachKiemDemNuocId) {
		_keHoachKiemDemNuocId = keHoachKiemDemNuocId;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setKeHoachKiemDemNuocId",
						int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel,
					keHoachKiemDemNuocId);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, maTinh);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyen", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, maHuyen);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMaXa", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, maXa);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setThonXom", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, thonXom);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChuHo", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, tenChuHo);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinhChuHo", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, gioiTinhChuHo);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayKiemDem", Date.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, ngayKiemDem);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTimThayNha", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, timThayNha);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setCoNguoiONha", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, coNguoiONha);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setHoTenNguoiTraLoi",
						String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, hoTenNguoiTraLoi);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setLaChuHoKhong", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, laChuHoKhong);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinhNguoiTraLoi",
						String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel,
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDanToc", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, tenDanToc);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setKinhDo", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, kinhDo);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setViDo", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, viDo);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNguoiTrongHo", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, soNguoiTrongHo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThanhPhanHoGd() {
		return _thanhPhanHoGd;
	}

	@Override
	public void setThanhPhanHoGd(int thanhPhanHoGd) {
		_thanhPhanHoGd = thanhPhanHoGd;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhPhanHoGd", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, thanhPhanHoGd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getChuHoDungDs() {
		return _chuHoDungDs;
	}

	@Override
	public void setChuHoDungDs(int chuHoDungDs) {
		_chuHoDungDs = chuHoDungDs;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setChuHoDungDs", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, chuHoDungDs);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLyDoKhongDungDs() {
		return _lyDoKhongDungDs;
	}

	@Override
	public void setLyDoKhongDungDs(String lyDoKhongDungDs) {
		_lyDoKhongDungDs = lyDoKhongDungDs;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongDungDs",
						String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, lyDoKhongDungDs);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChuHoHienTai",
						String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, tenChuHoHienTai);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinhChuHoHienTai",
						int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel,
					gioiTinhChuHoHienTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDauNoiChua() {
		return _dauNoiChua;
	}

	@Override
	public void setDauNoiChua(int dauNoiChua) {
		_dauNoiChua = dauNoiChua;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setDauNoiChua", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, dauNoiChua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnhDauNoi() {
		return _anhDauNoi;
	}

	@Override
	public void setAnhDauNoi(String anhDauNoi) {
		_anhDauNoi = anhDauNoi;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setAnhDauNoi", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, anhDauNoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianDauHopDong() {
		return _thoiGianDauHopDong;
	}

	@Override
	public void setThoiGianDauHopDong(Date thoiGianDauHopDong) {
		_thoiGianDauHopDong = thoiGianDauHopDong;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianDauHopDong",
						Date.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel,
					thoiGianDauHopDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianDauNoiThucTe() {
		return _thoiGianDauNoiThucTe;
	}

	@Override
	public void setThoiGianDauNoiThucTe(Date thoiGianDauNoiThucTe) {
		_thoiGianDauNoiThucTe = thoiGianDauNoiThucTe;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianDauNoiThucTe",
						Date.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel,
					thoiGianDauNoiThucTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getVoiNuocChayKhong() {
		return _voiNuocChayKhong;
	}

	@Override
	public void setVoiNuocChayKhong(int voiNuocChayKhong) {
		_voiNuocChayKhong = voiNuocChayKhong;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setVoiNuocChayKhong", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, voiNuocChayKhong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNuocTrongKhong() {
		return _nuocTrongKhong;
	}

	@Override
	public void setNuocTrongKhong(int nuocTrongKhong) {
		_nuocTrongKhong = nuocTrongKhong;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocTrongKhong", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, nuocTrongKhong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMauNuoc() {
		return _mauNuoc;
	}

	@Override
	public void setMauNuoc(String mauNuoc) {
		_mauNuoc = mauNuoc;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMauNuoc", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, mauNuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMuiNuoc() {
		return _muiNuoc;
	}

	@Override
	public void setMuiNuoc(String muiNuoc) {
		_muiNuoc = muiNuoc;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMuiNuoc", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, muiNuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getViNuoc() {
		return _viNuoc;
	}

	@Override
	public void setViNuoc(String viNuoc) {
		_viNuoc = viNuoc;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setViNuoc", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, viNuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiKhac() {
		return _loaiKhac;
	}

	@Override
	public void setLoaiKhac(String loaiKhac) {
		_loaiKhac = loaiKhac;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiKhac", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, loaiKhac);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDaTungDucKhong() {
		return _daTungDucKhong;
	}

	@Override
	public void setDaTungDucKhong(int daTungDucKhong) {
		_daTungDucKhong = daTungDucKhong;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setDaTungDucKhong", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, daTungDucKhong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMauNuocTungCo() {
		return _mauNuocTungCo;
	}

	@Override
	public void setMauNuocTungCo(String mauNuocTungCo) {
		_mauNuocTungCo = mauNuocTungCo;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMauNuocTungCo", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, mauNuocTungCo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMuiNuocTungCo() {
		return _muiNuocTungCo;
	}

	@Override
	public void setMuiNuocTungCo(String muiNuocTungCo) {
		_muiNuocTungCo = muiNuocTungCo;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMuiNuocTungCo", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, muiNuocTungCo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getViNuocTungCo() {
		return _viNuocTungCo;
	}

	@Override
	public void setViNuocTungCo(String viNuocTungCo) {
		_viNuocTungCo = viNuocTungCo;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setViNuocTungCo", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, viNuocTungCo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiKhacTungCo() {
		return _loaiKhacTungCo;
	}

	@Override
	public void setLoaiKhacTungCo(String loaiKhacTungCo) {
		_loaiKhacTungCo = loaiKhacTungCo;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiKhacTungCo",
						String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, loaiKhacTungCo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCoBeChuaNuoc() {
		return _coBeChuaNuoc;
	}

	@Override
	public void setCoBeChuaNuoc(int coBeChuaNuoc) {
		_coBeChuaNuoc = coBeChuaNuoc;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setCoBeChuaNuoc", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, coBeChuaNuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTinhTrangBe() {
		return _tinhTrangBe;
	}

	@Override
	public void setTinhTrangBe(int tinhTrangBe) {
		_tinhTrangBe = tinhTrangBe;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhTrangBe", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, tinhTrangBe);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setAnhBeChua", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, anhBeChua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBiMatNuoc() {
		return _biMatNuoc;
	}

	@Override
	public void setBiMatNuoc(int biMatNuoc) {
		_biMatNuoc = biMatNuoc;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setBiMatNuoc", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, biMatNuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoLanMatNuoc() {
		return _soLanMatNuoc;
	}

	@Override
	public void setSoLanMatNuoc(int soLanMatNuoc) {
		_soLanMatNuoc = soLanMatNuoc;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLanMatNuoc", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, soLanMatNuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoGioTrungBinh() {
		return _soGioTrungBinh;
	}

	@Override
	public void setSoGioTrungBinh(int soGioTrungBinh) {
		_soGioTrungBinh = soGioTrungBinh;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setSoGioTrungBinh", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, soGioTrungBinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoSeRyDongHo() {
		return _soSeRyDongHo;
	}

	@Override
	public void setSoSeRyDongHo(String soSeRyDongHo) {
		_soSeRyDongHo = soSeRyDongHo;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setSoSeRyDongHo", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, soSeRyDongHo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChiSoDongHo() {
		return _chiSoDongHo;
	}

	@Override
	public void setChiSoDongHo(String chiSoDongHo) {
		_chiSoDongHo = chiSoDongHo;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setChiSoDongHo", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, chiSoDongHo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnhDongHo() {
		return _anhDongHo;
	}

	@Override
	public void setAnhDongHo(String anhDongHo) {
		_anhDongHo = anhDongHo;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setAnhDongHo", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, anhDongHo);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, ghiChu);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setDaKetThucDieuTra", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, daKetThucDieuTra);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoKhongHoanThanh",
						String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel,
					lyDoKhongHoanThanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIMei() {
		return _iMei;
	}

	@Override
	public void setIMei(String iMei) {
		_iMei = iMei;

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setIMei", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, iMei);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTaiKhoan", String.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, taiKhoan);
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

		if (_thongtinkiemdemnuocRemoteModel != null) {
			try {
				Class<?> clazz = _thongtinkiemdemnuocRemoteModel.getClass();

				Method method = clazz.getMethod("setDanhGiaKiemDem", int.class);

				method.invoke(_thongtinkiemdemnuocRemoteModel, danhGiaKiemDem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTHONGTINKIEMDEMNUOCRemoteModel() {
		return _thongtinkiemdemnuocRemoteModel;
	}

	public void setTHONGTINKIEMDEMNUOCRemoteModel(
		BaseModel<?> thongtinkiemdemnuocRemoteModel) {
		_thongtinkiemdemnuocRemoteModel = thongtinkiemdemnuocRemoteModel;
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

		Class<?> remoteModelClass = _thongtinkiemdemnuocRemoteModel.getClass();

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

		Object returnValue = method.invoke(_thongtinkiemdemnuocRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			THONGTINKIEMDEMNUOCLocalServiceUtil.addTHONGTINKIEMDEMNUOC(this);
		}
		else {
			THONGTINKIEMDEMNUOCLocalServiceUtil.updateTHONGTINKIEMDEMNUOC(this);
		}
	}

	@Override
	public THONGTINKIEMDEMNUOC toEscapedModel() {
		return (THONGTINKIEMDEMNUOC)ProxyUtil.newProxyInstance(THONGTINKIEMDEMNUOC.class.getClassLoader(),
			new Class[] { THONGTINKIEMDEMNUOC.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		THONGTINKIEMDEMNUOCClp clone = new THONGTINKIEMDEMNUOCClp();

		clone.setId(getId());
		clone.setDauNoiNuocId(getDauNoiNuocId());
		clone.setKeHoachKiemDemNuocId(getKeHoachKiemDemNuocId());
		clone.setMaTinh(getMaTinh());
		clone.setMaHuyen(getMaHuyen());
		clone.setMaXa(getMaXa());
		clone.setThonXom(getThonXom());
		clone.setTenChuHo(getTenChuHo());
		clone.setGioiTinhChuHo(getGioiTinhChuHo());
		clone.setNgayKiemDem(getNgayKiemDem());
		clone.setTimThayNha(getTimThayNha());
		clone.setCoNguoiONha(getCoNguoiONha());
		clone.setHoTenNguoiTraLoi(getHoTenNguoiTraLoi());
		clone.setLaChuHoKhong(getLaChuHoKhong());
		clone.setGioiTinhNguoiTraLoi(getGioiTinhNguoiTraLoi());
		clone.setTenDanToc(getTenDanToc());
		clone.setKinhDo(getKinhDo());
		clone.setViDo(getViDo());
		clone.setSoNguoiTrongHo(getSoNguoiTrongHo());
		clone.setThanhPhanHoGd(getThanhPhanHoGd());
		clone.setChuHoDungDs(getChuHoDungDs());
		clone.setLyDoKhongDungDs(getLyDoKhongDungDs());
		clone.setTenChuHoHienTai(getTenChuHoHienTai());
		clone.setGioiTinhChuHoHienTai(getGioiTinhChuHoHienTai());
		clone.setDauNoiChua(getDauNoiChua());
		clone.setAnhDauNoi(getAnhDauNoi());
		clone.setThoiGianDauHopDong(getThoiGianDauHopDong());
		clone.setThoiGianDauNoiThucTe(getThoiGianDauNoiThucTe());
		clone.setVoiNuocChayKhong(getVoiNuocChayKhong());
		clone.setNuocTrongKhong(getNuocTrongKhong());
		clone.setMauNuoc(getMauNuoc());
		clone.setMuiNuoc(getMuiNuoc());
		clone.setViNuoc(getViNuoc());
		clone.setLoaiKhac(getLoaiKhac());
		clone.setDaTungDucKhong(getDaTungDucKhong());
		clone.setMauNuocTungCo(getMauNuocTungCo());
		clone.setMuiNuocTungCo(getMuiNuocTungCo());
		clone.setViNuocTungCo(getViNuocTungCo());
		clone.setLoaiKhacTungCo(getLoaiKhacTungCo());
		clone.setCoBeChuaNuoc(getCoBeChuaNuoc());
		clone.setTinhTrangBe(getTinhTrangBe());
		clone.setAnhBeChua(getAnhBeChua());
		clone.setBiMatNuoc(getBiMatNuoc());
		clone.setSoLanMatNuoc(getSoLanMatNuoc());
		clone.setSoGioTrungBinh(getSoGioTrungBinh());
		clone.setSoSeRyDongHo(getSoSeRyDongHo());
		clone.setChiSoDongHo(getChiSoDongHo());
		clone.setAnhDongHo(getAnhDongHo());
		clone.setGhiChu(getGhiChu());
		clone.setDaKetThucDieuTra(getDaKetThucDieuTra());
		clone.setLyDoKhongHoanThanh(getLyDoKhongHoanThanh());
		clone.setIMei(getIMei());
		clone.setTaiKhoan(getTaiKhoan());
		clone.setDanhGiaKiemDem(getDanhGiaKiemDem());

		return clone;
	}

	@Override
	public int compareTo(THONGTINKIEMDEMNUOC thongtinkiemdemnuoc) {
		int value = 0;

		if (getId() < thongtinkiemdemnuoc.getId()) {
			value = -1;
		}
		else if (getId() > thongtinkiemdemnuoc.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		if (!(obj instanceof THONGTINKIEMDEMNUOCClp)) {
			return false;
		}

		THONGTINKIEMDEMNUOCClp thongtinkiemdemnuoc = (THONGTINKIEMDEMNUOCClp)obj;

		long primaryKey = thongtinkiemdemnuoc.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(109);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", dauNoiNuocId=");
		sb.append(getDauNoiNuocId());
		sb.append(", keHoachKiemDemNuocId=");
		sb.append(getKeHoachKiemDemNuocId());
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
		sb.append(", soNguoiTrongHo=");
		sb.append(getSoNguoiTrongHo());
		sb.append(", thanhPhanHoGd=");
		sb.append(getThanhPhanHoGd());
		sb.append(", chuHoDungDs=");
		sb.append(getChuHoDungDs());
		sb.append(", lyDoKhongDungDs=");
		sb.append(getLyDoKhongDungDs());
		sb.append(", tenChuHoHienTai=");
		sb.append(getTenChuHoHienTai());
		sb.append(", gioiTinhChuHoHienTai=");
		sb.append(getGioiTinhChuHoHienTai());
		sb.append(", dauNoiChua=");
		sb.append(getDauNoiChua());
		sb.append(", anhDauNoi=");
		sb.append(getAnhDauNoi());
		sb.append(", thoiGianDauHopDong=");
		sb.append(getThoiGianDauHopDong());
		sb.append(", thoiGianDauNoiThucTe=");
		sb.append(getThoiGianDauNoiThucTe());
		sb.append(", voiNuocChayKhong=");
		sb.append(getVoiNuocChayKhong());
		sb.append(", nuocTrongKhong=");
		sb.append(getNuocTrongKhong());
		sb.append(", mauNuoc=");
		sb.append(getMauNuoc());
		sb.append(", muiNuoc=");
		sb.append(getMuiNuoc());
		sb.append(", viNuoc=");
		sb.append(getViNuoc());
		sb.append(", loaiKhac=");
		sb.append(getLoaiKhac());
		sb.append(", daTungDucKhong=");
		sb.append(getDaTungDucKhong());
		sb.append(", mauNuocTungCo=");
		sb.append(getMauNuocTungCo());
		sb.append(", muiNuocTungCo=");
		sb.append(getMuiNuocTungCo());
		sb.append(", viNuocTungCo=");
		sb.append(getViNuocTungCo());
		sb.append(", loaiKhacTungCo=");
		sb.append(getLoaiKhacTungCo());
		sb.append(", coBeChuaNuoc=");
		sb.append(getCoBeChuaNuoc());
		sb.append(", tinhTrangBe=");
		sb.append(getTinhTrangBe());
		sb.append(", anhBeChua=");
		sb.append(getAnhBeChua());
		sb.append(", biMatNuoc=");
		sb.append(getBiMatNuoc());
		sb.append(", soLanMatNuoc=");
		sb.append(getSoLanMatNuoc());
		sb.append(", soGioTrungBinh=");
		sb.append(getSoGioTrungBinh());
		sb.append(", soSeRyDongHo=");
		sb.append(getSoSeRyDongHo());
		sb.append(", chiSoDongHo=");
		sb.append(getChiSoDongHo());
		sb.append(", anhDongHo=");
		sb.append(getAnhDongHo());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", daKetThucDieuTra=");
		sb.append(getDaKetThucDieuTra());
		sb.append(", lyDoKhongHoanThanh=");
		sb.append(getLyDoKhongHoanThanh());
		sb.append(", iMei=");
		sb.append(getIMei());
		sb.append(", taiKhoan=");
		sb.append(getTaiKhoan());
		sb.append(", danhGiaKiemDem=");
		sb.append(getDanhGiaKiemDem());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(166);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dauNoiNuocId</column-name><column-value><![CDATA[");
		sb.append(getDauNoiNuocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keHoachKiemDemNuocId</column-name><column-value><![CDATA[");
		sb.append(getKeHoachKiemDemNuocId());
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
			"<column><column-name>soNguoiTrongHo</column-name><column-value><![CDATA[");
		sb.append(getSoNguoiTrongHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhPhanHoGd</column-name><column-value><![CDATA[");
		sb.append(getThanhPhanHoGd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chuHoDungDs</column-name><column-value><![CDATA[");
		sb.append(getChuHoDungDs());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoKhongDungDs</column-name><column-value><![CDATA[");
		sb.append(getLyDoKhongDungDs());
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
			"<column><column-name>dauNoiChua</column-name><column-value><![CDATA[");
		sb.append(getDauNoiChua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anhDauNoi</column-name><column-value><![CDATA[");
		sb.append(getAnhDauNoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiGianDauHopDong</column-name><column-value><![CDATA[");
		sb.append(getThoiGianDauHopDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiGianDauNoiThucTe</column-name><column-value><![CDATA[");
		sb.append(getThoiGianDauNoiThucTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>voiNuocChayKhong</column-name><column-value><![CDATA[");
		sb.append(getVoiNuocChayKhong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nuocTrongKhong</column-name><column-value><![CDATA[");
		sb.append(getNuocTrongKhong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mauNuoc</column-name><column-value><![CDATA[");
		sb.append(getMauNuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>muiNuoc</column-name><column-value><![CDATA[");
		sb.append(getMuiNuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viNuoc</column-name><column-value><![CDATA[");
		sb.append(getViNuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiKhac</column-name><column-value><![CDATA[");
		sb.append(getLoaiKhac());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daTungDucKhong</column-name><column-value><![CDATA[");
		sb.append(getDaTungDucKhong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mauNuocTungCo</column-name><column-value><![CDATA[");
		sb.append(getMauNuocTungCo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>muiNuocTungCo</column-name><column-value><![CDATA[");
		sb.append(getMuiNuocTungCo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viNuocTungCo</column-name><column-value><![CDATA[");
		sb.append(getViNuocTungCo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiKhacTungCo</column-name><column-value><![CDATA[");
		sb.append(getLoaiKhacTungCo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coBeChuaNuoc</column-name><column-value><![CDATA[");
		sb.append(getCoBeChuaNuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tinhTrangBe</column-name><column-value><![CDATA[");
		sb.append(getTinhTrangBe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anhBeChua</column-name><column-value><![CDATA[");
		sb.append(getAnhBeChua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>biMatNuoc</column-name><column-value><![CDATA[");
		sb.append(getBiMatNuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLanMatNuoc</column-name><column-value><![CDATA[");
		sb.append(getSoLanMatNuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soGioTrungBinh</column-name><column-value><![CDATA[");
		sb.append(getSoGioTrungBinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soSeRyDongHo</column-name><column-value><![CDATA[");
		sb.append(getSoSeRyDongHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chiSoDongHo</column-name><column-value><![CDATA[");
		sb.append(getChiSoDongHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anhDongHo</column-name><column-value><![CDATA[");
		sb.append(getAnhDongHo());
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
			"<column><column-name>iMei</column-name><column-value><![CDATA[");
		sb.append(getIMei());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taiKhoan</column-name><column-value><![CDATA[");
		sb.append(getTaiKhoan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>danhGiaKiemDem</column-name><column-value><![CDATA[");
		sb.append(getDanhGiaKiemDem());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _dauNoiNuocId;
	private int _keHoachKiemDemNuocId;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _thonXom;
	private String _tenChuHo;
	private int _gioiTinhChuHo;
	private Date _ngayKiemDem;
	private int _timThayNha;
	private int _coNguoiONha;
	private String _hoTenNguoiTraLoi;
	private int _laChuHoKhong;
	private String _gioiTinhNguoiTraLoi;
	private String _tenDanToc;
	private String _kinhDo;
	private String _viDo;
	private int _soNguoiTrongHo;
	private int _thanhPhanHoGd;
	private int _chuHoDungDs;
	private String _lyDoKhongDungDs;
	private String _tenChuHoHienTai;
	private int _gioiTinhChuHoHienTai;
	private int _dauNoiChua;
	private String _anhDauNoi;
	private Date _thoiGianDauHopDong;
	private Date _thoiGianDauNoiThucTe;
	private int _voiNuocChayKhong;
	private int _nuocTrongKhong;
	private String _mauNuoc;
	private String _muiNuoc;
	private String _viNuoc;
	private String _loaiKhac;
	private int _daTungDucKhong;
	private String _mauNuocTungCo;
	private String _muiNuocTungCo;
	private String _viNuocTungCo;
	private String _loaiKhacTungCo;
	private int _coBeChuaNuoc;
	private int _tinhTrangBe;
	private String _anhBeChua;
	private int _biMatNuoc;
	private int _soLanMatNuoc;
	private int _soGioTrungBinh;
	private String _soSeRyDongHo;
	private String _chiSoDongHo;
	private String _anhDongHo;
	private String _ghiChu;
	private int _daKetThucDieuTra;
	private String _lyDoKhongHoanThanh;
	private String _iMei;
	private String _taiKhoan;
	private int _danhGiaKiemDem;
	private BaseModel<?> _thongtinkiemdemnuocRemoteModel;
}