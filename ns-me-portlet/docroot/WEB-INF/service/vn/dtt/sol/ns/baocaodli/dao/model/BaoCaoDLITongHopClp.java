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

package vn.dtt.sol.ns.baocaodli.dao.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLITongHopLocalServiceUtil;
import vn.dtt.sol.ns.baocaodli.dao.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author HuyMQ
 */
public class BaoCaoDLITongHopClp extends BaseModelImpl<BaoCaoDLITongHop>
	implements BaoCaoDLITongHop {
	public BaoCaoDLITongHopClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return BaoCaoDLITongHop.class;
	}

	@Override
	public String getModelClassName() {
		return BaoCaoDLITongHop.class.getName();
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
		attributes.put("maTinh", getMaTinh());
		attributes.put("nam", getNam());
		attributes.put("soDauNoiTheoKeHoach", getSoDauNoiTheoKeHoach());
		attributes.put("soDauNoiMoi", getSoDauNoiMoi());
		attributes.put("soNhaTieuHVSTheoKH", getSoNhaTieuHVSTheoKH());
		attributes.put("soNhaTieuHVSMoi", getSoNhaTieuHVSMoi());
		attributes.put("soNguoiHuongLoiNuocSach", getSoNguoiHuongLoiNuocSach());
		attributes.put("soXa", getSoXa());
		attributes.put("tiLeHGDCoNhaTieu", getTiLeHGDCoNhaTieu());
		attributes.put("tiLeHGDCoNhaTieuHVS", getTiLeHGDCoNhaTieuHVS());
		attributes.put("tiLeTruongHocHVS", getTiLeTruongHocHVS());
		attributes.put("tiLeTramYTeHVS", getTiLeTramYTeHVS());
		attributes.put("soNguoiHuongLoiVSTX", getSoNguoiHuongLoiVSTX());
		attributes.put("keHoachPheDuyet", getKeHoachPheDuyet());
		attributes.put("ngayDuyetKeHoach", getNgayDuyetKeHoach());
		attributes.put("baoCaoChuongTrinh", getBaoCaoChuongTrinh());
		attributes.put("ngayDangTai", getNgayDangTai());
		attributes.put("nguoiLap", getNguoiLap());
		attributes.put("nguoiDuyet", getNguoiDuyet());
		attributes.put("soBaoCao", getSoBaoCao());
		attributes.put("ngayBaoCao", getNgayBaoCao());
		attributes.put("trangThai", getTrangThai());
		attributes.put("luuTruPdfTH", getLuuTruPdfTH());
		attributes.put("luuTruPdf", getLuuTruPdf());
		attributes.put("luuTruCsv", getLuuTruCsv());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTinh = (String)attributes.get("maTinh");

		if (maTinh != null) {
			setMaTinh(maTinh);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer soDauNoiTheoKeHoach = (Integer)attributes.get(
				"soDauNoiTheoKeHoach");

		if (soDauNoiTheoKeHoach != null) {
			setSoDauNoiTheoKeHoach(soDauNoiTheoKeHoach);
		}

		Integer soDauNoiMoi = (Integer)attributes.get("soDauNoiMoi");

		if (soDauNoiMoi != null) {
			setSoDauNoiMoi(soDauNoiMoi);
		}

		Integer soNhaTieuHVSTheoKH = (Integer)attributes.get(
				"soNhaTieuHVSTheoKH");

		if (soNhaTieuHVSTheoKH != null) {
			setSoNhaTieuHVSTheoKH(soNhaTieuHVSTheoKH);
		}

		Integer soNhaTieuHVSMoi = (Integer)attributes.get("soNhaTieuHVSMoi");

		if (soNhaTieuHVSMoi != null) {
			setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		}

		Integer soNguoiHuongLoiNuocSach = (Integer)attributes.get(
				"soNguoiHuongLoiNuocSach");

		if (soNguoiHuongLoiNuocSach != null) {
			setSoNguoiHuongLoiNuocSach(soNguoiHuongLoiNuocSach);
		}

		Integer soXa = (Integer)attributes.get("soXa");

		if (soXa != null) {
			setSoXa(soXa);
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

		Integer tiLeTruongHocHVS = (Integer)attributes.get("tiLeTruongHocHVS");

		if (tiLeTruongHocHVS != null) {
			setTiLeTruongHocHVS(tiLeTruongHocHVS);
		}

		Integer tiLeTramYTeHVS = (Integer)attributes.get("tiLeTramYTeHVS");

		if (tiLeTramYTeHVS != null) {
			setTiLeTramYTeHVS(tiLeTramYTeHVS);
		}

		Integer soNguoiHuongLoiVSTX = (Integer)attributes.get(
				"soNguoiHuongLoiVSTX");

		if (soNguoiHuongLoiVSTX != null) {
			setSoNguoiHuongLoiVSTX(soNguoiHuongLoiVSTX);
		}

		String keHoachPheDuyet = (String)attributes.get("keHoachPheDuyet");

		if (keHoachPheDuyet != null) {
			setKeHoachPheDuyet(keHoachPheDuyet);
		}

		Date ngayDuyetKeHoach = (Date)attributes.get("ngayDuyetKeHoach");

		if (ngayDuyetKeHoach != null) {
			setNgayDuyetKeHoach(ngayDuyetKeHoach);
		}

		String baoCaoChuongTrinh = (String)attributes.get("baoCaoChuongTrinh");

		if (baoCaoChuongTrinh != null) {
			setBaoCaoChuongTrinh(baoCaoChuongTrinh);
		}

		Date ngayDangTai = (Date)attributes.get("ngayDangTai");

		if (ngayDangTai != null) {
			setNgayDangTai(ngayDangTai);
		}

		String nguoiLap = (String)attributes.get("nguoiLap");

		if (nguoiLap != null) {
			setNguoiLap(nguoiLap);
		}

		String nguoiDuyet = (String)attributes.get("nguoiDuyet");

		if (nguoiDuyet != null) {
			setNguoiDuyet(nguoiDuyet);
		}

		String soBaoCao = (String)attributes.get("soBaoCao");

		if (soBaoCao != null) {
			setSoBaoCao(soBaoCao);
		}

		Date ngayBaoCao = (Date)attributes.get("ngayBaoCao");

		if (ngayBaoCao != null) {
			setNgayBaoCao(ngayBaoCao);
		}

		Integer trangThai = (Integer)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer luuTruPdfTH = (Integer)attributes.get("luuTruPdfTH");

		if (luuTruPdfTH != null) {
			setLuuTruPdfTH(luuTruPdfTH);
		}

		Integer luuTruPdf = (Integer)attributes.get("luuTruPdf");

		if (luuTruPdf != null) {
			setLuuTruPdf(luuTruPdf);
		}

		Integer luuTruCsv = (Integer)attributes.get("luuTruCsv");

		if (luuTruCsv != null) {
			setLuuTruCsv(luuTruCsv);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, id);
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

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, maTinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNam() {
		return _nam;
	}

	@Override
	public void setNam(int nam) {
		_nam = nam;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, nam);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoDauNoiTheoKeHoach() {
		return _soDauNoiTheoKeHoach;
	}

	@Override
	public void setSoDauNoiTheoKeHoach(int soDauNoiTheoKeHoach) {
		_soDauNoiTheoKeHoach = soDauNoiTheoKeHoach;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDauNoiTheoKeHoach",
						int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, soDauNoiTheoKeHoach);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoDauNoiMoi() {
		return _soDauNoiMoi;
	}

	@Override
	public void setSoDauNoiMoi(int soDauNoiMoi) {
		_soDauNoiMoi = soDauNoiMoi;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDauNoiMoi", int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, soDauNoiMoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNhaTieuHVSTheoKH() {
		return _soNhaTieuHVSTheoKH;
	}

	@Override
	public void setSoNhaTieuHVSTheoKH(int soNhaTieuHVSTheoKH) {
		_soNhaTieuHVSTheoKH = soNhaTieuHVSTheoKH;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNhaTieuHVSTheoKH",
						int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, soNhaTieuHVSTheoKH);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNhaTieuHVSMoi() {
		return _soNhaTieuHVSMoi;
	}

	@Override
	public void setSoNhaTieuHVSMoi(int soNhaTieuHVSMoi) {
		_soNhaTieuHVSMoi = soNhaTieuHVSMoi;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNhaTieuHVSMoi", int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, soNhaTieuHVSMoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNguoiHuongLoiNuocSach() {
		return _soNguoiHuongLoiNuocSach;
	}

	@Override
	public void setSoNguoiHuongLoiNuocSach(int soNguoiHuongLoiNuocSach) {
		_soNguoiHuongLoiNuocSach = soNguoiHuongLoiNuocSach;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNguoiHuongLoiNuocSach",
						int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel,
					soNguoiHuongLoiNuocSach);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoXa() {
		return _soXa;
	}

	@Override
	public void setSoXa(int soXa) {
		_soXa = soXa;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setSoXa", int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, soXa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTiLeHGDCoNhaTieu() {
		return _tiLeHGDCoNhaTieu;
	}

	@Override
	public void setTiLeHGDCoNhaTieu(int tiLeHGDCoNhaTieu) {
		_tiLeHGDCoNhaTieu = tiLeHGDCoNhaTieu;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeHGDCoNhaTieu", int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, tiLeHGDCoNhaTieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTiLeHGDCoNhaTieuHVS() {
		return _tiLeHGDCoNhaTieuHVS;
	}

	@Override
	public void setTiLeHGDCoNhaTieuHVS(int tiLeHGDCoNhaTieuHVS) {
		_tiLeHGDCoNhaTieuHVS = tiLeHGDCoNhaTieuHVS;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeHGDCoNhaTieuHVS",
						int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, tiLeHGDCoNhaTieuHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTiLeTruongHocHVS() {
		return _tiLeTruongHocHVS;
	}

	@Override
	public void setTiLeTruongHocHVS(int tiLeTruongHocHVS) {
		_tiLeTruongHocHVS = tiLeTruongHocHVS;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeTruongHocHVS", int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, tiLeTruongHocHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTiLeTramYTeHVS() {
		return _tiLeTramYTeHVS;
	}

	@Override
	public void setTiLeTramYTeHVS(int tiLeTramYTeHVS) {
		_tiLeTramYTeHVS = tiLeTramYTeHVS;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeTramYTeHVS", int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, tiLeTramYTeHVS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoNguoiHuongLoiVSTX() {
		return _soNguoiHuongLoiVSTX;
	}

	@Override
	public void setSoNguoiHuongLoiVSTX(int soNguoiHuongLoiVSTX) {
		_soNguoiHuongLoiVSTX = soNguoiHuongLoiVSTX;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNguoiHuongLoiVSTX",
						int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, soNguoiHuongLoiVSTX);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKeHoachPheDuyet() {
		return _keHoachPheDuyet;
	}

	@Override
	public void setKeHoachPheDuyet(String keHoachPheDuyet) {
		_keHoachPheDuyet = keHoachPheDuyet;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setKeHoachPheDuyet",
						String.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, keHoachPheDuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayDuyetKeHoach() {
		return _ngayDuyetKeHoach;
	}

	@Override
	public void setNgayDuyetKeHoach(Date ngayDuyetKeHoach) {
		_ngayDuyetKeHoach = ngayDuyetKeHoach;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDuyetKeHoach",
						Date.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, ngayDuyetKeHoach);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBaoCaoChuongTrinh() {
		return _baoCaoChuongTrinh;
	}

	@Override
	public void setBaoCaoChuongTrinh(String baoCaoChuongTrinh) {
		_baoCaoChuongTrinh = baoCaoChuongTrinh;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setBaoCaoChuongTrinh",
						String.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, baoCaoChuongTrinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayDangTai() {
		return _ngayDangTai;
	}

	@Override
	public void setNgayDangTai(Date ngayDangTai) {
		_ngayDangTai = ngayDangTai;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDangTai", Date.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, ngayDangTai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiLap() {
		return _nguoiLap;
	}

	@Override
	public void setNguoiLap(String nguoiLap) {
		_nguoiLap = nguoiLap;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiLap", String.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, nguoiLap);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiDuyet() {
		return _nguoiDuyet;
	}

	@Override
	public void setNguoiDuyet(String nguoiDuyet) {
		_nguoiDuyet = nguoiDuyet;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiDuyet", String.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, nguoiDuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoBaoCao() {
		return _soBaoCao;
	}

	@Override
	public void setSoBaoCao(String soBaoCao) {
		_soBaoCao = soBaoCao;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setSoBaoCao", String.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, soBaoCao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayBaoCao() {
		return _ngayBaoCao;
	}

	@Override
	public void setNgayBaoCao(Date ngayBaoCao) {
		_ngayBaoCao = ngayBaoCao;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayBaoCao", Date.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, ngayBaoCao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLuuTruPdfTH() {
		return _luuTruPdfTH;
	}

	@Override
	public void setLuuTruPdfTH(int luuTruPdfTH) {
		_luuTruPdfTH = luuTruPdfTH;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setLuuTruPdfTH", int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, luuTruPdfTH);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLuuTruPdf() {
		return _luuTruPdf;
	}

	@Override
	public void setLuuTruPdf(int luuTruPdf) {
		_luuTruPdf = luuTruPdf;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setLuuTruPdf", int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, luuTruPdf);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLuuTruCsv() {
		return _luuTruCsv;
	}

	@Override
	public void setLuuTruCsv(int luuTruCsv) {
		_luuTruCsv = luuTruCsv;

		if (_baoCaoDLITongHopRemoteModel != null) {
			try {
				Class<?> clazz = _baoCaoDLITongHopRemoteModel.getClass();

				Method method = clazz.getMethod("setLuuTruCsv", int.class);

				method.invoke(_baoCaoDLITongHopRemoteModel, luuTruCsv);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBaoCaoDLITongHopRemoteModel() {
		return _baoCaoDLITongHopRemoteModel;
	}

	public void setBaoCaoDLITongHopRemoteModel(
		BaseModel<?> baoCaoDLITongHopRemoteModel) {
		_baoCaoDLITongHopRemoteModel = baoCaoDLITongHopRemoteModel;
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

		Class<?> remoteModelClass = _baoCaoDLITongHopRemoteModel.getClass();

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

		Object returnValue = method.invoke(_baoCaoDLITongHopRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BaoCaoDLITongHopLocalServiceUtil.addBaoCaoDLITongHop(this);
		}
		else {
			BaoCaoDLITongHopLocalServiceUtil.updateBaoCaoDLITongHop(this);
		}
	}

	@Override
	public BaoCaoDLITongHop toEscapedModel() {
		return (BaoCaoDLITongHop)ProxyUtil.newProxyInstance(BaoCaoDLITongHop.class.getClassLoader(),
			new Class[] { BaoCaoDLITongHop.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BaoCaoDLITongHopClp clone = new BaoCaoDLITongHopClp();

		clone.setId(getId());
		clone.setMaTinh(getMaTinh());
		clone.setNam(getNam());
		clone.setSoDauNoiTheoKeHoach(getSoDauNoiTheoKeHoach());
		clone.setSoDauNoiMoi(getSoDauNoiMoi());
		clone.setSoNhaTieuHVSTheoKH(getSoNhaTieuHVSTheoKH());
		clone.setSoNhaTieuHVSMoi(getSoNhaTieuHVSMoi());
		clone.setSoNguoiHuongLoiNuocSach(getSoNguoiHuongLoiNuocSach());
		clone.setSoXa(getSoXa());
		clone.setTiLeHGDCoNhaTieu(getTiLeHGDCoNhaTieu());
		clone.setTiLeHGDCoNhaTieuHVS(getTiLeHGDCoNhaTieuHVS());
		clone.setTiLeTruongHocHVS(getTiLeTruongHocHVS());
		clone.setTiLeTramYTeHVS(getTiLeTramYTeHVS());
		clone.setSoNguoiHuongLoiVSTX(getSoNguoiHuongLoiVSTX());
		clone.setKeHoachPheDuyet(getKeHoachPheDuyet());
		clone.setNgayDuyetKeHoach(getNgayDuyetKeHoach());
		clone.setBaoCaoChuongTrinh(getBaoCaoChuongTrinh());
		clone.setNgayDangTai(getNgayDangTai());
		clone.setNguoiLap(getNguoiLap());
		clone.setNguoiDuyet(getNguoiDuyet());
		clone.setSoBaoCao(getSoBaoCao());
		clone.setNgayBaoCao(getNgayBaoCao());
		clone.setTrangThai(getTrangThai());
		clone.setLuuTruPdfTH(getLuuTruPdfTH());
		clone.setLuuTruPdf(getLuuTruPdf());
		clone.setLuuTruCsv(getLuuTruCsv());

		return clone;
	}

	@Override
	public int compareTo(BaoCaoDLITongHop baoCaoDLITongHop) {
		long primaryKey = baoCaoDLITongHop.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BaoCaoDLITongHopClp)) {
			return false;
		}

		BaoCaoDLITongHopClp baoCaoDLITongHop = (BaoCaoDLITongHopClp)obj;

		long primaryKey = baoCaoDLITongHop.getPrimaryKey();

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
		StringBundler sb = new StringBundler(53);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maTinh=");
		sb.append(getMaTinh());
		sb.append(", nam=");
		sb.append(getNam());
		sb.append(", soDauNoiTheoKeHoach=");
		sb.append(getSoDauNoiTheoKeHoach());
		sb.append(", soDauNoiMoi=");
		sb.append(getSoDauNoiMoi());
		sb.append(", soNhaTieuHVSTheoKH=");
		sb.append(getSoNhaTieuHVSTheoKH());
		sb.append(", soNhaTieuHVSMoi=");
		sb.append(getSoNhaTieuHVSMoi());
		sb.append(", soNguoiHuongLoiNuocSach=");
		sb.append(getSoNguoiHuongLoiNuocSach());
		sb.append(", soXa=");
		sb.append(getSoXa());
		sb.append(", tiLeHGDCoNhaTieu=");
		sb.append(getTiLeHGDCoNhaTieu());
		sb.append(", tiLeHGDCoNhaTieuHVS=");
		sb.append(getTiLeHGDCoNhaTieuHVS());
		sb.append(", tiLeTruongHocHVS=");
		sb.append(getTiLeTruongHocHVS());
		sb.append(", tiLeTramYTeHVS=");
		sb.append(getTiLeTramYTeHVS());
		sb.append(", soNguoiHuongLoiVSTX=");
		sb.append(getSoNguoiHuongLoiVSTX());
		sb.append(", keHoachPheDuyet=");
		sb.append(getKeHoachPheDuyet());
		sb.append(", ngayDuyetKeHoach=");
		sb.append(getNgayDuyetKeHoach());
		sb.append(", baoCaoChuongTrinh=");
		sb.append(getBaoCaoChuongTrinh());
		sb.append(", ngayDangTai=");
		sb.append(getNgayDangTai());
		sb.append(", nguoiLap=");
		sb.append(getNguoiLap());
		sb.append(", nguoiDuyet=");
		sb.append(getNguoiDuyet());
		sb.append(", soBaoCao=");
		sb.append(getSoBaoCao());
		sb.append(", ngayBaoCao=");
		sb.append(getNgayBaoCao());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", luuTruPdfTH=");
		sb.append(getLuuTruPdfTH());
		sb.append(", luuTruPdf=");
		sb.append(getLuuTruPdf());
		sb.append(", luuTruCsv=");
		sb.append(getLuuTruCsv());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(82);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTinh</column-name><column-value><![CDATA[");
		sb.append(getMaTinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nam</column-name><column-value><![CDATA[");
		sb.append(getNam());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDauNoiTheoKeHoach</column-name><column-value><![CDATA[");
		sb.append(getSoDauNoiTheoKeHoach());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDauNoiMoi</column-name><column-value><![CDATA[");
		sb.append(getSoDauNoiMoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNhaTieuHVSTheoKH</column-name><column-value><![CDATA[");
		sb.append(getSoNhaTieuHVSTheoKH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNhaTieuHVSMoi</column-name><column-value><![CDATA[");
		sb.append(getSoNhaTieuHVSMoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNguoiHuongLoiNuocSach</column-name><column-value><![CDATA[");
		sb.append(getSoNguoiHuongLoiNuocSach());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soXa</column-name><column-value><![CDATA[");
		sb.append(getSoXa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeHGDCoNhaTieu</column-name><column-value><![CDATA[");
		sb.append(getTiLeHGDCoNhaTieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeHGDCoNhaTieuHVS</column-name><column-value><![CDATA[");
		sb.append(getTiLeHGDCoNhaTieuHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeTruongHocHVS</column-name><column-value><![CDATA[");
		sb.append(getTiLeTruongHocHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeTramYTeHVS</column-name><column-value><![CDATA[");
		sb.append(getTiLeTramYTeHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNguoiHuongLoiVSTX</column-name><column-value><![CDATA[");
		sb.append(getSoNguoiHuongLoiVSTX());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keHoachPheDuyet</column-name><column-value><![CDATA[");
		sb.append(getKeHoachPheDuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayDuyetKeHoach</column-name><column-value><![CDATA[");
		sb.append(getNgayDuyetKeHoach());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>baoCaoChuongTrinh</column-name><column-value><![CDATA[");
		sb.append(getBaoCaoChuongTrinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayDangTai</column-name><column-value><![CDATA[");
		sb.append(getNgayDangTai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiLap</column-name><column-value><![CDATA[");
		sb.append(getNguoiLap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiDuyet</column-name><column-value><![CDATA[");
		sb.append(getNguoiDuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soBaoCao</column-name><column-value><![CDATA[");
		sb.append(getSoBaoCao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayBaoCao</column-name><column-value><![CDATA[");
		sb.append(getNgayBaoCao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>luuTruPdfTH</column-name><column-value><![CDATA[");
		sb.append(getLuuTruPdfTH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>luuTruPdf</column-name><column-value><![CDATA[");
		sb.append(getLuuTruPdf());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>luuTruCsv</column-name><column-value><![CDATA[");
		sb.append(getLuuTruCsv());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maTinh;
	private int _nam;
	private int _soDauNoiTheoKeHoach;
	private int _soDauNoiMoi;
	private int _soNhaTieuHVSTheoKH;
	private int _soNhaTieuHVSMoi;
	private int _soNguoiHuongLoiNuocSach;
	private int _soXa;
	private int _tiLeHGDCoNhaTieu;
	private int _tiLeHGDCoNhaTieuHVS;
	private int _tiLeTruongHocHVS;
	private int _tiLeTramYTeHVS;
	private int _soNguoiHuongLoiVSTX;
	private String _keHoachPheDuyet;
	private Date _ngayDuyetKeHoach;
	private String _baoCaoChuongTrinh;
	private Date _ngayDangTai;
	private String _nguoiLap;
	private String _nguoiDuyet;
	private String _soBaoCao;
	private Date _ngayBaoCao;
	private int _trangThai;
	private int _luuTruPdfTH;
	private int _luuTruPdf;
	private int _luuTruCsv;
	private BaseModel<?> _baoCaoDLITongHopRemoteModel;
}