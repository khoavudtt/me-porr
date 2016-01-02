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
 * This class is a wrapper for {@link THONGTINKIEMDEMNUOC}.
 * </p>
 *
 * @author khoa.vu
 * @see THONGTINKIEMDEMNUOC
 * @generated
 */
public class THONGTINKIEMDEMNUOCWrapper implements THONGTINKIEMDEMNUOC,
	ModelWrapper<THONGTINKIEMDEMNUOC> {
	public THONGTINKIEMDEMNUOCWrapper(THONGTINKIEMDEMNUOC thongtinkiemdemnuoc) {
		_thongtinkiemdemnuoc = thongtinkiemdemnuoc;
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

	/**
	* Returns the primary key of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the primary key of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public long getPrimaryKey() {
		return _thongtinkiemdemnuoc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param primaryKey the primary key of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_thongtinkiemdemnuoc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ID of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public long getId() {
		return _thongtinkiemdemnuoc.getId();
	}

	/**
	* Sets the ID of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param id the ID of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setId(long id) {
		_thongtinkiemdemnuoc.setId(id);
	}

	/**
	* Returns the dau noi nuoc ID of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the dau noi nuoc ID of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public long getDauNoiNuocId() {
		return _thongtinkiemdemnuoc.getDauNoiNuocId();
	}

	/**
	* Sets the dau noi nuoc ID of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param dauNoiNuocId the dau noi nuoc ID of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setDauNoiNuocId(long dauNoiNuocId) {
		_thongtinkiemdemnuoc.setDauNoiNuocId(dauNoiNuocId);
	}

	/**
	* Returns the ke hoach kiem dem nuoc ID of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ke hoach kiem dem nuoc ID of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getKeHoachKiemDemNuocId() {
		return _thongtinkiemdemnuoc.getKeHoachKiemDemNuocId();
	}

	/**
	* Sets the ke hoach kiem dem nuoc ID of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setKeHoachKiemDemNuocId(int keHoachKiemDemNuocId) {
		_thongtinkiemdemnuoc.setKeHoachKiemDemNuocId(keHoachKiemDemNuocId);
	}

	/**
	* Returns the ma tinh of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ma tinh of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _thongtinkiemdemnuoc.getMaTinh();
	}

	/**
	* Sets the ma tinh of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param maTinh the ma tinh of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_thongtinkiemdemnuoc.setMaTinh(maTinh);
	}

	/**
	* Returns the ma huyen of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ma huyen of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getMaHuyen() {
		return _thongtinkiemdemnuoc.getMaHuyen();
	}

	/**
	* Sets the ma huyen of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param maHuyen the ma huyen of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setMaHuyen(java.lang.String maHuyen) {
		_thongtinkiemdemnuoc.setMaHuyen(maHuyen);
	}

	/**
	* Returns the ma xa of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ma xa of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getMaXa() {
		return _thongtinkiemdemnuoc.getMaXa();
	}

	/**
	* Sets the ma xa of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param maXa the ma xa of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setMaXa(java.lang.String maXa) {
		_thongtinkiemdemnuoc.setMaXa(maXa);
	}

	/**
	* Returns the thon xom of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the thon xom of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getThonXom() {
		return _thongtinkiemdemnuoc.getThonXom();
	}

	/**
	* Sets the thon xom of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param thonXom the thon xom of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setThonXom(java.lang.String thonXom) {
		_thongtinkiemdemnuoc.setThonXom(thonXom);
	}

	/**
	* Returns the ten chu ho of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ten chu ho of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getTenChuHo() {
		return _thongtinkiemdemnuoc.getTenChuHo();
	}

	/**
	* Sets the ten chu ho of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param tenChuHo the ten chu ho of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setTenChuHo(java.lang.String tenChuHo) {
		_thongtinkiemdemnuoc.setTenChuHo(tenChuHo);
	}

	/**
	* Returns the gioi tinh chu ho of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the gioi tinh chu ho of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getGioiTinhChuHo() {
		return _thongtinkiemdemnuoc.getGioiTinhChuHo();
	}

	/**
	* Sets the gioi tinh chu ho of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param gioiTinhChuHo the gioi tinh chu ho of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setGioiTinhChuHo(int gioiTinhChuHo) {
		_thongtinkiemdemnuoc.setGioiTinhChuHo(gioiTinhChuHo);
	}

	/**
	* Returns the ngay kiem dem of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ngay kiem dem of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.util.Date getNgayKiemDem() {
		return _thongtinkiemdemnuoc.getNgayKiemDem();
	}

	/**
	* Sets the ngay kiem dem of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param ngayKiemDem the ngay kiem dem of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setNgayKiemDem(java.util.Date ngayKiemDem) {
		_thongtinkiemdemnuoc.setNgayKiemDem(ngayKiemDem);
	}

	/**
	* Returns the tim thay nha of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the tim thay nha of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getTimThayNha() {
		return _thongtinkiemdemnuoc.getTimThayNha();
	}

	/**
	* Sets the tim thay nha of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param timThayNha the tim thay nha of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setTimThayNha(int timThayNha) {
		_thongtinkiemdemnuoc.setTimThayNha(timThayNha);
	}

	/**
	* Returns the co nguoi o nha of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the co nguoi o nha of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getCoNguoiONha() {
		return _thongtinkiemdemnuoc.getCoNguoiONha();
	}

	/**
	* Sets the co nguoi o nha of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param coNguoiONha the co nguoi o nha of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setCoNguoiONha(int coNguoiONha) {
		_thongtinkiemdemnuoc.setCoNguoiONha(coNguoiONha);
	}

	/**
	* Returns the ho ten nguoi tra loi of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ho ten nguoi tra loi of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getHoTenNguoiTraLoi() {
		return _thongtinkiemdemnuoc.getHoTenNguoiTraLoi();
	}

	/**
	* Sets the ho ten nguoi tra loi of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param hoTenNguoiTraLoi the ho ten nguoi tra loi of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setHoTenNguoiTraLoi(java.lang.String hoTenNguoiTraLoi) {
		_thongtinkiemdemnuoc.setHoTenNguoiTraLoi(hoTenNguoiTraLoi);
	}

	/**
	* Returns the la chu ho khong of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the la chu ho khong of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getLaChuHoKhong() {
		return _thongtinkiemdemnuoc.getLaChuHoKhong();
	}

	/**
	* Sets the la chu ho khong of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param laChuHoKhong the la chu ho khong of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setLaChuHoKhong(int laChuHoKhong) {
		_thongtinkiemdemnuoc.setLaChuHoKhong(laChuHoKhong);
	}

	/**
	* Returns the gioi tinh nguoi tra loi of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the gioi tinh nguoi tra loi of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getGioiTinhNguoiTraLoi() {
		return _thongtinkiemdemnuoc.getGioiTinhNguoiTraLoi();
	}

	/**
	* Sets the gioi tinh nguoi tra loi of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param gioiTinhNguoiTraLoi the gioi tinh nguoi tra loi of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setGioiTinhNguoiTraLoi(java.lang.String gioiTinhNguoiTraLoi) {
		_thongtinkiemdemnuoc.setGioiTinhNguoiTraLoi(gioiTinhNguoiTraLoi);
	}

	/**
	* Returns the ten dan toc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ten dan toc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getTenDanToc() {
		return _thongtinkiemdemnuoc.getTenDanToc();
	}

	/**
	* Sets the ten dan toc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param tenDanToc the ten dan toc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setTenDanToc(java.lang.String tenDanToc) {
		_thongtinkiemdemnuoc.setTenDanToc(tenDanToc);
	}

	/**
	* Returns the kinh do of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the kinh do of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getKinhDo() {
		return _thongtinkiemdemnuoc.getKinhDo();
	}

	/**
	* Sets the kinh do of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param kinhDo the kinh do of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setKinhDo(java.lang.String kinhDo) {
		_thongtinkiemdemnuoc.setKinhDo(kinhDo);
	}

	/**
	* Returns the vi do of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the vi do of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getViDo() {
		return _thongtinkiemdemnuoc.getViDo();
	}

	/**
	* Sets the vi do of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param viDo the vi do of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setViDo(java.lang.String viDo) {
		_thongtinkiemdemnuoc.setViDo(viDo);
	}

	/**
	* Returns the so nguoi trong ho of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the so nguoi trong ho of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getSoNguoiTrongHo() {
		return _thongtinkiemdemnuoc.getSoNguoiTrongHo();
	}

	/**
	* Sets the so nguoi trong ho of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param soNguoiTrongHo the so nguoi trong ho of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setSoNguoiTrongHo(int soNguoiTrongHo) {
		_thongtinkiemdemnuoc.setSoNguoiTrongHo(soNguoiTrongHo);
	}

	/**
	* Returns the thanh phan ho gd of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the thanh phan ho gd of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getThanhPhanHoGd() {
		return _thongtinkiemdemnuoc.getThanhPhanHoGd();
	}

	/**
	* Sets the thanh phan ho gd of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param thanhPhanHoGd the thanh phan ho gd of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setThanhPhanHoGd(int thanhPhanHoGd) {
		_thongtinkiemdemnuoc.setThanhPhanHoGd(thanhPhanHoGd);
	}

	/**
	* Returns the chu ho dung ds of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the chu ho dung ds of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getChuHoDungDs() {
		return _thongtinkiemdemnuoc.getChuHoDungDs();
	}

	/**
	* Sets the chu ho dung ds of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param chuHoDungDs the chu ho dung ds of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setChuHoDungDs(int chuHoDungDs) {
		_thongtinkiemdemnuoc.setChuHoDungDs(chuHoDungDs);
	}

	/**
	* Returns the ly do khong dung ds of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ly do khong dung ds of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getLyDoKhongDungDs() {
		return _thongtinkiemdemnuoc.getLyDoKhongDungDs();
	}

	/**
	* Sets the ly do khong dung ds of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param lyDoKhongDungDs the ly do khong dung ds of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setLyDoKhongDungDs(java.lang.String lyDoKhongDungDs) {
		_thongtinkiemdemnuoc.setLyDoKhongDungDs(lyDoKhongDungDs);
	}

	/**
	* Returns the ten chu ho hien tai of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ten chu ho hien tai of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getTenChuHoHienTai() {
		return _thongtinkiemdemnuoc.getTenChuHoHienTai();
	}

	/**
	* Sets the ten chu ho hien tai of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param tenChuHoHienTai the ten chu ho hien tai of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setTenChuHoHienTai(java.lang.String tenChuHoHienTai) {
		_thongtinkiemdemnuoc.setTenChuHoHienTai(tenChuHoHienTai);
	}

	/**
	* Returns the gioi tinh chu ho hien tai of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the gioi tinh chu ho hien tai of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getGioiTinhChuHoHienTai() {
		return _thongtinkiemdemnuoc.getGioiTinhChuHoHienTai();
	}

	/**
	* Sets the gioi tinh chu ho hien tai of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param gioiTinhChuHoHienTai the gioi tinh chu ho hien tai of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setGioiTinhChuHoHienTai(int gioiTinhChuHoHienTai) {
		_thongtinkiemdemnuoc.setGioiTinhChuHoHienTai(gioiTinhChuHoHienTai);
	}

	/**
	* Returns the dau noi chua of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the dau noi chua of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getDauNoiChua() {
		return _thongtinkiemdemnuoc.getDauNoiChua();
	}

	/**
	* Sets the dau noi chua of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param dauNoiChua the dau noi chua of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setDauNoiChua(int dauNoiChua) {
		_thongtinkiemdemnuoc.setDauNoiChua(dauNoiChua);
	}

	/**
	* Returns the anh dau noi of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the anh dau noi of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getAnhDauNoi() {
		return _thongtinkiemdemnuoc.getAnhDauNoi();
	}

	/**
	* Sets the anh dau noi of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param anhDauNoi the anh dau noi of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setAnhDauNoi(java.lang.String anhDauNoi) {
		_thongtinkiemdemnuoc.setAnhDauNoi(anhDauNoi);
	}

	/**
	* Returns the thoi gian dau hop dong of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the thoi gian dau hop dong of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.util.Date getThoiGianDauHopDong() {
		return _thongtinkiemdemnuoc.getThoiGianDauHopDong();
	}

	/**
	* Sets the thoi gian dau hop dong of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param thoiGianDauHopDong the thoi gian dau hop dong of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setThoiGianDauHopDong(java.util.Date thoiGianDauHopDong) {
		_thongtinkiemdemnuoc.setThoiGianDauHopDong(thoiGianDauHopDong);
	}

	/**
	* Returns the thoi gian dau noi thuc te of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the thoi gian dau noi thuc te of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.util.Date getThoiGianDauNoiThucTe() {
		return _thongtinkiemdemnuoc.getThoiGianDauNoiThucTe();
	}

	/**
	* Sets the thoi gian dau noi thuc te of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param thoiGianDauNoiThucTe the thoi gian dau noi thuc te of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setThoiGianDauNoiThucTe(java.util.Date thoiGianDauNoiThucTe) {
		_thongtinkiemdemnuoc.setThoiGianDauNoiThucTe(thoiGianDauNoiThucTe);
	}

	/**
	* Returns the voi nuoc chay khong of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the voi nuoc chay khong of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getVoiNuocChayKhong() {
		return _thongtinkiemdemnuoc.getVoiNuocChayKhong();
	}

	/**
	* Sets the voi nuoc chay khong of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param voiNuocChayKhong the voi nuoc chay khong of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setVoiNuocChayKhong(int voiNuocChayKhong) {
		_thongtinkiemdemnuoc.setVoiNuocChayKhong(voiNuocChayKhong);
	}

	/**
	* Returns the nuoc trong khong of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the nuoc trong khong of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getNuocTrongKhong() {
		return _thongtinkiemdemnuoc.getNuocTrongKhong();
	}

	/**
	* Sets the nuoc trong khong of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param nuocTrongKhong the nuoc trong khong of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setNuocTrongKhong(int nuocTrongKhong) {
		_thongtinkiemdemnuoc.setNuocTrongKhong(nuocTrongKhong);
	}

	/**
	* Returns the mau nuoc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the mau nuoc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getMauNuoc() {
		return _thongtinkiemdemnuoc.getMauNuoc();
	}

	/**
	* Sets the mau nuoc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param mauNuoc the mau nuoc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setMauNuoc(java.lang.String mauNuoc) {
		_thongtinkiemdemnuoc.setMauNuoc(mauNuoc);
	}

	/**
	* Returns the mui nuoc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the mui nuoc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getMuiNuoc() {
		return _thongtinkiemdemnuoc.getMuiNuoc();
	}

	/**
	* Sets the mui nuoc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param muiNuoc the mui nuoc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setMuiNuoc(java.lang.String muiNuoc) {
		_thongtinkiemdemnuoc.setMuiNuoc(muiNuoc);
	}

	/**
	* Returns the vi nuoc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the vi nuoc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getViNuoc() {
		return _thongtinkiemdemnuoc.getViNuoc();
	}

	/**
	* Sets the vi nuoc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param viNuoc the vi nuoc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setViNuoc(java.lang.String viNuoc) {
		_thongtinkiemdemnuoc.setViNuoc(viNuoc);
	}

	/**
	* Returns the loai khac of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the loai khac of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getLoaiKhac() {
		return _thongtinkiemdemnuoc.getLoaiKhac();
	}

	/**
	* Sets the loai khac of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param loaiKhac the loai khac of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setLoaiKhac(java.lang.String loaiKhac) {
		_thongtinkiemdemnuoc.setLoaiKhac(loaiKhac);
	}

	/**
	* Returns the da tung duc khong of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the da tung duc khong of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getDaTungDucKhong() {
		return _thongtinkiemdemnuoc.getDaTungDucKhong();
	}

	/**
	* Sets the da tung duc khong of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param daTungDucKhong the da tung duc khong of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setDaTungDucKhong(int daTungDucKhong) {
		_thongtinkiemdemnuoc.setDaTungDucKhong(daTungDucKhong);
	}

	/**
	* Returns the mau nuoc tung co of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the mau nuoc tung co of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getMauNuocTungCo() {
		return _thongtinkiemdemnuoc.getMauNuocTungCo();
	}

	/**
	* Sets the mau nuoc tung co of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param mauNuocTungCo the mau nuoc tung co of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setMauNuocTungCo(java.lang.String mauNuocTungCo) {
		_thongtinkiemdemnuoc.setMauNuocTungCo(mauNuocTungCo);
	}

	/**
	* Returns the mui nuoc tung co of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the mui nuoc tung co of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getMuiNuocTungCo() {
		return _thongtinkiemdemnuoc.getMuiNuocTungCo();
	}

	/**
	* Sets the mui nuoc tung co of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param muiNuocTungCo the mui nuoc tung co of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setMuiNuocTungCo(java.lang.String muiNuocTungCo) {
		_thongtinkiemdemnuoc.setMuiNuocTungCo(muiNuocTungCo);
	}

	/**
	* Returns the vi nuoc tung co of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the vi nuoc tung co of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getViNuocTungCo() {
		return _thongtinkiemdemnuoc.getViNuocTungCo();
	}

	/**
	* Sets the vi nuoc tung co of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param viNuocTungCo the vi nuoc tung co of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setViNuocTungCo(java.lang.String viNuocTungCo) {
		_thongtinkiemdemnuoc.setViNuocTungCo(viNuocTungCo);
	}

	/**
	* Returns the loai khac tung co of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the loai khac tung co of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getLoaiKhacTungCo() {
		return _thongtinkiemdemnuoc.getLoaiKhacTungCo();
	}

	/**
	* Sets the loai khac tung co of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param loaiKhacTungCo the loai khac tung co of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setLoaiKhacTungCo(java.lang.String loaiKhacTungCo) {
		_thongtinkiemdemnuoc.setLoaiKhacTungCo(loaiKhacTungCo);
	}

	/**
	* Returns the co be chua nuoc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the co be chua nuoc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getCoBeChuaNuoc() {
		return _thongtinkiemdemnuoc.getCoBeChuaNuoc();
	}

	/**
	* Sets the co be chua nuoc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param coBeChuaNuoc the co be chua nuoc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setCoBeChuaNuoc(int coBeChuaNuoc) {
		_thongtinkiemdemnuoc.setCoBeChuaNuoc(coBeChuaNuoc);
	}

	/**
	* Returns the tinh trang be of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the tinh trang be of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getTinhTrangBe() {
		return _thongtinkiemdemnuoc.getTinhTrangBe();
	}

	/**
	* Sets the tinh trang be of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param tinhTrangBe the tinh trang be of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setTinhTrangBe(int tinhTrangBe) {
		_thongtinkiemdemnuoc.setTinhTrangBe(tinhTrangBe);
	}

	/**
	* Returns the anh be chua of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the anh be chua of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getAnhBeChua() {
		return _thongtinkiemdemnuoc.getAnhBeChua();
	}

	/**
	* Sets the anh be chua of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param anhBeChua the anh be chua of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setAnhBeChua(java.lang.String anhBeChua) {
		_thongtinkiemdemnuoc.setAnhBeChua(anhBeChua);
	}

	/**
	* Returns the bi mat nuoc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the bi mat nuoc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getBiMatNuoc() {
		return _thongtinkiemdemnuoc.getBiMatNuoc();
	}

	/**
	* Sets the bi mat nuoc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param biMatNuoc the bi mat nuoc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setBiMatNuoc(int biMatNuoc) {
		_thongtinkiemdemnuoc.setBiMatNuoc(biMatNuoc);
	}

	/**
	* Returns the so lan mat nuoc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the so lan mat nuoc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getSoLanMatNuoc() {
		return _thongtinkiemdemnuoc.getSoLanMatNuoc();
	}

	/**
	* Sets the so lan mat nuoc of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param soLanMatNuoc the so lan mat nuoc of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setSoLanMatNuoc(int soLanMatNuoc) {
		_thongtinkiemdemnuoc.setSoLanMatNuoc(soLanMatNuoc);
	}

	/**
	* Returns the so gio trung binh of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the so gio trung binh of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getSoGioTrungBinh() {
		return _thongtinkiemdemnuoc.getSoGioTrungBinh();
	}

	/**
	* Sets the so gio trung binh of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param soGioTrungBinh the so gio trung binh of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setSoGioTrungBinh(int soGioTrungBinh) {
		_thongtinkiemdemnuoc.setSoGioTrungBinh(soGioTrungBinh);
	}

	/**
	* Returns the so se ry dong ho of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the so se ry dong ho of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getSoSeRyDongHo() {
		return _thongtinkiemdemnuoc.getSoSeRyDongHo();
	}

	/**
	* Sets the so se ry dong ho of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param soSeRyDongHo the so se ry dong ho of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setSoSeRyDongHo(java.lang.String soSeRyDongHo) {
		_thongtinkiemdemnuoc.setSoSeRyDongHo(soSeRyDongHo);
	}

	/**
	* Returns the chi so dong ho of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the chi so dong ho of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getChiSoDongHo() {
		return _thongtinkiemdemnuoc.getChiSoDongHo();
	}

	/**
	* Sets the chi so dong ho of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param chiSoDongHo the chi so dong ho of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setChiSoDongHo(java.lang.String chiSoDongHo) {
		_thongtinkiemdemnuoc.setChiSoDongHo(chiSoDongHo);
	}

	/**
	* Returns the anh dong ho of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the anh dong ho of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getAnhDongHo() {
		return _thongtinkiemdemnuoc.getAnhDongHo();
	}

	/**
	* Sets the anh dong ho of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param anhDongHo the anh dong ho of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setAnhDongHo(java.lang.String anhDongHo) {
		_thongtinkiemdemnuoc.setAnhDongHo(anhDongHo);
	}

	/**
	* Returns the ghi chu of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ghi chu of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _thongtinkiemdemnuoc.getGhiChu();
	}

	/**
	* Sets the ghi chu of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param ghiChu the ghi chu of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_thongtinkiemdemnuoc.setGhiChu(ghiChu);
	}

	/**
	* Returns the da ket thuc dieu tra of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the da ket thuc dieu tra of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getDaKetThucDieuTra() {
		return _thongtinkiemdemnuoc.getDaKetThucDieuTra();
	}

	/**
	* Sets the da ket thuc dieu tra of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param daKetThucDieuTra the da ket thuc dieu tra of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setDaKetThucDieuTra(int daKetThucDieuTra) {
		_thongtinkiemdemnuoc.setDaKetThucDieuTra(daKetThucDieuTra);
	}

	/**
	* Returns the ly do khong hoan thanh of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the ly do khong hoan thanh of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getLyDoKhongHoanThanh() {
		return _thongtinkiemdemnuoc.getLyDoKhongHoanThanh();
	}

	/**
	* Sets the ly do khong hoan thanh of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param lyDoKhongHoanThanh the ly do khong hoan thanh of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setLyDoKhongHoanThanh(java.lang.String lyDoKhongHoanThanh) {
		_thongtinkiemdemnuoc.setLyDoKhongHoanThanh(lyDoKhongHoanThanh);
	}

	/**
	* Returns the i mei of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the i mei of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getIMei() {
		return _thongtinkiemdemnuoc.getIMei();
	}

	/**
	* Sets the i mei of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param iMei the i mei of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setIMei(java.lang.String iMei) {
		_thongtinkiemdemnuoc.setIMei(iMei);
	}

	/**
	* Returns the tai khoan of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the tai khoan of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public java.lang.String getTaiKhoan() {
		return _thongtinkiemdemnuoc.getTaiKhoan();
	}

	/**
	* Sets the tai khoan of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param taiKhoan the tai khoan of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setTaiKhoan(java.lang.String taiKhoan) {
		_thongtinkiemdemnuoc.setTaiKhoan(taiKhoan);
	}

	/**
	* Returns the danh gia kiem dem of this t h o n g t i n k i e m d e m n u o c.
	*
	* @return the danh gia kiem dem of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public int getDanhGiaKiemDem() {
		return _thongtinkiemdemnuoc.getDanhGiaKiemDem();
	}

	/**
	* Sets the danh gia kiem dem of this t h o n g t i n k i e m d e m n u o c.
	*
	* @param danhGiaKiemDem the danh gia kiem dem of this t h o n g t i n k i e m d e m n u o c
	*/
	@Override
	public void setDanhGiaKiemDem(int danhGiaKiemDem) {
		_thongtinkiemdemnuoc.setDanhGiaKiemDem(danhGiaKiemDem);
	}

	@Override
	public boolean isNew() {
		return _thongtinkiemdemnuoc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thongtinkiemdemnuoc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thongtinkiemdemnuoc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thongtinkiemdemnuoc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thongtinkiemdemnuoc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thongtinkiemdemnuoc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thongtinkiemdemnuoc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thongtinkiemdemnuoc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thongtinkiemdemnuoc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thongtinkiemdemnuoc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thongtinkiemdemnuoc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new THONGTINKIEMDEMNUOCWrapper((THONGTINKIEMDEMNUOC)_thongtinkiemdemnuoc.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC thongtinkiemdemnuoc) {
		return _thongtinkiemdemnuoc.compareTo(thongtinkiemdemnuoc);
	}

	@Override
	public int hashCode() {
		return _thongtinkiemdemnuoc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC> toCacheModel() {
		return _thongtinkiemdemnuoc.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC toEscapedModel() {
		return new THONGTINKIEMDEMNUOCWrapper(_thongtinkiemdemnuoc.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC toUnescapedModel() {
		return new THONGTINKIEMDEMNUOCWrapper(_thongtinkiemdemnuoc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thongtinkiemdemnuoc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thongtinkiemdemnuoc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thongtinkiemdemnuoc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof THONGTINKIEMDEMNUOCWrapper)) {
			return false;
		}

		THONGTINKIEMDEMNUOCWrapper thongtinkiemdemnuocWrapper = (THONGTINKIEMDEMNUOCWrapper)obj;

		if (Validator.equals(_thongtinkiemdemnuoc,
					thongtinkiemdemnuocWrapper._thongtinkiemdemnuoc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public THONGTINKIEMDEMNUOC getWrappedTHONGTINKIEMDEMNUOC() {
		return _thongtinkiemdemnuoc;
	}

	@Override
	public THONGTINKIEMDEMNUOC getWrappedModel() {
		return _thongtinkiemdemnuoc;
	}

	@Override
	public void resetOriginalValues() {
		_thongtinkiemdemnuoc.resetOriginalValues();
	}

	private THONGTINKIEMDEMNUOC _thongtinkiemdemnuoc;
}