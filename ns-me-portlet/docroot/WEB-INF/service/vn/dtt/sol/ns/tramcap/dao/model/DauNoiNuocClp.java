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
import vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author khoa.vu
 */
public class DauNoiNuocClp extends BaseModelImpl<DauNoiNuoc>
	implements DauNoiNuoc {
	public DauNoiNuocClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dauNoiNuocRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTramCapNuocId() {
		return _tramCapNuocId;
	}

	@Override
	public void setTramCapNuocId(int tramCapNuocId) {
		_tramCapNuocId = tramCapNuocId;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTramCapNuocId", int.class);

				method.invoke(_dauNoiNuocRemoteModel, tramCapNuocId);
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

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTinh", String.class);

				method.invoke(_dauNoiNuocRemoteModel, maTinh);
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

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHuyen", String.class);

				method.invoke(_dauNoiNuocRemoteModel, maHuyen);
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

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setMaXa", String.class);

				method.invoke(_dauNoiNuocRemoteModel, maXa);
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

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setThonXom", String.class);

				method.invoke(_dauNoiNuocRemoteModel, thonXom);
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

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChuHo", String.class);

				method.invoke(_dauNoiNuocRemoteModel, tenChuHo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGioiTinh() {
		return _gioiTinh;
	}

	@Override
	public void setGioiTinh(int gioiTinh) {
		_gioiTinh = gioiTinh;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinh", int.class);

				method.invoke(_dauNoiNuocRemoteModel, gioiTinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayDauNoiHopDong() {
		return _ngayDauNoiHopDong;
	}

	@Override
	public void setNgayDauNoiHopDong(Date ngayDauNoiHopDong) {
		_ngayDauNoiHopDong = ngayDauNoiHopDong;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDauNoiHopDong",
						Date.class);

				method.invoke(_dauNoiNuocRemoteModel, ngayDauNoiHopDong);
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

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", int.class);

				method.invoke(_dauNoiNuocRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNamBaoCao() {
		return _namBaoCao;
	}

	@Override
	public void setNamBaoCao(int namBaoCao) {
		_namBaoCao = namBaoCao;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNamBaoCao", int.class);

				method.invoke(_dauNoiNuocRemoteModel, namBaoCao);
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

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_dauNoiNuocRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTao() {
		return _ngayTao;
	}

	@Override
	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_dauNoiNuocRemoteModel, ngayTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIdNguoiTao() {
		return _idNguoiTao;
	}

	@Override
	public void setIdNguoiTao(int idNguoiTao) {
		_idNguoiTao = idNguoiTao;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiTao", int.class);

				method.invoke(_dauNoiNuocRemoteModel, idNguoiTao);
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

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNguoiTrongHo", int.class);

				method.invoke(_dauNoiNuocRemoteModel, soNguoiTrongHo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThanhPhanHoGiaDinh() {
		return _thanhPhanHoGiaDinh;
	}

	@Override
	public void setThanhPhanHoGiaDinh(int thanhPhanHoGiaDinh) {
		_thanhPhanHoGiaDinh = thanhPhanHoGiaDinh;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhPhanHoGiaDinh",
						int.class);

				method.invoke(_dauNoiNuocRemoteModel, thanhPhanHoGiaDinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTongDoanhThu() {
		return _tongDoanhThu;
	}

	@Override
	public void setTongDoanhThu(int tongDoanhThu) {
		_tongDoanhThu = tongDoanhThu;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setTongDoanhThu", int.class);

				method.invoke(_dauNoiNuocRemoteModel, tongDoanhThu);
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

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setKinhDo", String.class);

				method.invoke(_dauNoiNuocRemoteModel, kinhDo);
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

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setViDo", String.class);

				method.invoke(_dauNoiNuocRemoteModel, viDo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayDauNoiThucTe() {
		return _ngayDauNoiThucTe;
	}

	@Override
	public void setNgayDauNoiThucTe(Date ngayDauNoiThucTe) {
		_ngayDauNoiThucTe = ngayDauNoiThucTe;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDauNoiThucTe",
						Date.class);

				method.invoke(_dauNoiNuocRemoteModel, ngayDauNoiThucTe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoSeryDongHo() {
		return _soSeryDongHo;
	}

	@Override
	public void setSoSeryDongHo(String soSeryDongHo) {
		_soSeryDongHo = soSeryDongHo;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setSoSeryDongHo", String.class);

				method.invoke(_dauNoiNuocRemoteModel, soSeryDongHo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDanhGiaNuocHVS() {
		return _danhGiaNuocHVS;
	}

	@Override
	public void setDanhGiaNuocHVS(String danhGiaNuocHVS) {
		_danhGiaNuocHVS = danhGiaNuocHVS;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setDanhGiaNuocHVS",
						String.class);

				method.invoke(_dauNoiNuocRemoteModel, danhGiaNuocHVS);
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

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayKiemDem", Date.class);

				method.invoke(_dauNoiNuocRemoteModel, ngayKiemDem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayDanhGia() {
		return _ngayDanhGia;
	}

	@Override
	public void setNgayDanhGia(Date ngayDanhGia) {
		_ngayDanhGia = ngayDanhGia;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDanhGia", Date.class);

				method.invoke(_dauNoiNuocRemoteModel, ngayDanhGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIdNguoiDanhGia() {
		return _idNguoiDanhGia;
	}

	@Override
	public void setIdNguoiDanhGia(int idNguoiDanhGia) {
		_idNguoiDanhGia = idNguoiDanhGia;

		if (_dauNoiNuocRemoteModel != null) {
			try {
				Class<?> clazz = _dauNoiNuocRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNguoiDanhGia", int.class);

				method.invoke(_dauNoiNuocRemoteModel, idNguoiDanhGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDauNoiNuocRemoteModel() {
		return _dauNoiNuocRemoteModel;
	}

	public void setDauNoiNuocRemoteModel(BaseModel<?> dauNoiNuocRemoteModel) {
		_dauNoiNuocRemoteModel = dauNoiNuocRemoteModel;
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

		Class<?> remoteModelClass = _dauNoiNuocRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dauNoiNuocRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DauNoiNuocLocalServiceUtil.addDauNoiNuoc(this);
		}
		else {
			DauNoiNuocLocalServiceUtil.updateDauNoiNuoc(this);
		}
	}

	@Override
	public DauNoiNuoc toEscapedModel() {
		return (DauNoiNuoc)ProxyUtil.newProxyInstance(DauNoiNuoc.class.getClassLoader(),
			new Class[] { DauNoiNuoc.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DauNoiNuocClp clone = new DauNoiNuocClp();

		clone.setId(getId());
		clone.setTramCapNuocId(getTramCapNuocId());
		clone.setMaTinh(getMaTinh());
		clone.setMaHuyen(getMaHuyen());
		clone.setMaXa(getMaXa());
		clone.setThonXom(getThonXom());
		clone.setTenChuHo(getTenChuHo());
		clone.setGioiTinh(getGioiTinh());
		clone.setNgayDauNoiHopDong(getNgayDauNoiHopDong());
		clone.setTrangThai(getTrangThai());
		clone.setNamBaoCao(getNamBaoCao());
		clone.setGhiChu(getGhiChu());
		clone.setNgayTao(getNgayTao());
		clone.setIdNguoiTao(getIdNguoiTao());
		clone.setSoNguoiTrongHo(getSoNguoiTrongHo());
		clone.setThanhPhanHoGiaDinh(getThanhPhanHoGiaDinh());
		clone.setTongDoanhThu(getTongDoanhThu());
		clone.setKinhDo(getKinhDo());
		clone.setViDo(getViDo());
		clone.setNgayDauNoiThucTe(getNgayDauNoiThucTe());
		clone.setSoSeryDongHo(getSoSeryDongHo());
		clone.setDanhGiaNuocHVS(getDanhGiaNuocHVS());
		clone.setNgayKiemDem(getNgayKiemDem());
		clone.setNgayDanhGia(getNgayDanhGia());
		clone.setIdNguoiDanhGia(getIdNguoiDanhGia());

		return clone;
	}

	@Override
	public int compareTo(DauNoiNuoc dauNoiNuoc) {
		int value = 0;

		value = getMaTinh().compareTo(dauNoiNuoc.getMaTinh());

		if (value != 0) {
			return value;
		}

		value = getMaHuyen().compareTo(dauNoiNuoc.getMaHuyen());

		if (value != 0) {
			return value;
		}

		value = getMaXa().compareTo(dauNoiNuoc.getMaXa());

		if (value != 0) {
			return value;
		}

		value = getThonXom().compareTo(dauNoiNuoc.getThonXom());

		if (value != 0) {
			return value;
		}

		if (getTramCapNuocId() < dauNoiNuoc.getTramCapNuocId()) {
			value = -1;
		}
		else if (getTramCapNuocId() > dauNoiNuoc.getTramCapNuocId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = getTenChuHo().compareTo(dauNoiNuoc.getTenChuHo());

		if (value != 0) {
			return value;
		}

		if (getTrangThai() < dauNoiNuoc.getTrangThai()) {
			value = -1;
		}
		else if (getTrangThai() > dauNoiNuoc.getTrangThai()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (getNamBaoCao() < dauNoiNuoc.getNamBaoCao()) {
			value = -1;
		}
		else if (getNamBaoCao() > dauNoiNuoc.getNamBaoCao()) {
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

		if (!(obj instanceof DauNoiNuocClp)) {
			return false;
		}

		DauNoiNuocClp dauNoiNuoc = (DauNoiNuocClp)obj;

		long primaryKey = dauNoiNuoc.getPrimaryKey();

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
		StringBundler sb = new StringBundler(51);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", tramCapNuocId=");
		sb.append(getTramCapNuocId());
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
		sb.append(", gioiTinh=");
		sb.append(getGioiTinh());
		sb.append(", ngayDauNoiHopDong=");
		sb.append(getNgayDauNoiHopDong());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", namBaoCao=");
		sb.append(getNamBaoCao());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", idNguoiTao=");
		sb.append(getIdNguoiTao());
		sb.append(", soNguoiTrongHo=");
		sb.append(getSoNguoiTrongHo());
		sb.append(", thanhPhanHoGiaDinh=");
		sb.append(getThanhPhanHoGiaDinh());
		sb.append(", tongDoanhThu=");
		sb.append(getTongDoanhThu());
		sb.append(", kinhDo=");
		sb.append(getKinhDo());
		sb.append(", viDo=");
		sb.append(getViDo());
		sb.append(", ngayDauNoiThucTe=");
		sb.append(getNgayDauNoiThucTe());
		sb.append(", soSeryDongHo=");
		sb.append(getSoSeryDongHo());
		sb.append(", danhGiaNuocHVS=");
		sb.append(getDanhGiaNuocHVS());
		sb.append(", ngayKiemDem=");
		sb.append(getNgayKiemDem());
		sb.append(", ngayDanhGia=");
		sb.append(getNgayDanhGia());
		sb.append(", idNguoiDanhGia=");
		sb.append(getIdNguoiDanhGia());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tramCapNuocId</column-name><column-value><![CDATA[");
		sb.append(getTramCapNuocId());
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
			"<column><column-name>gioiTinh</column-name><column-value><![CDATA[");
		sb.append(getGioiTinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayDauNoiHopDong</column-name><column-value><![CDATA[");
		sb.append(getNgayDauNoiHopDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>namBaoCao</column-name><column-value><![CDATA[");
		sb.append(getNamBaoCao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idNguoiTao</column-name><column-value><![CDATA[");
		sb.append(getIdNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNguoiTrongHo</column-name><column-value><![CDATA[");
		sb.append(getSoNguoiTrongHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhPhanHoGiaDinh</column-name><column-value><![CDATA[");
		sb.append(getThanhPhanHoGiaDinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongDoanhThu</column-name><column-value><![CDATA[");
		sb.append(getTongDoanhThu());
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
			"<column><column-name>ngayDauNoiThucTe</column-name><column-value><![CDATA[");
		sb.append(getNgayDauNoiThucTe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soSeryDongHo</column-name><column-value><![CDATA[");
		sb.append(getSoSeryDongHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>danhGiaNuocHVS</column-name><column-value><![CDATA[");
		sb.append(getDanhGiaNuocHVS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayKiemDem</column-name><column-value><![CDATA[");
		sb.append(getNgayKiemDem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayDanhGia</column-name><column-value><![CDATA[");
		sb.append(getNgayDanhGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idNguoiDanhGia</column-name><column-value><![CDATA[");
		sb.append(getIdNguoiDanhGia());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _tramCapNuocId;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _thonXom;
	private String _tenChuHo;
	private int _gioiTinh;
	private Date _ngayDauNoiHopDong;
	private int _trangThai;
	private int _namBaoCao;
	private String _ghiChu;
	private Date _ngayTao;
	private int _idNguoiTao;
	private int _soNguoiTrongHo;
	private int _thanhPhanHoGiaDinh;
	private int _tongDoanhThu;
	private String _kinhDo;
	private String _viDo;
	private Date _ngayDauNoiThucTe;
	private String _soSeryDongHo;
	private String _danhGiaNuocHVS;
	private Date _ngayKiemDem;
	private Date _ngayDanhGia;
	private int _idNguoiDanhGia;
	private BaseModel<?> _dauNoiNuocRemoteModel;
}