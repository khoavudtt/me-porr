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

import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ChiTietKiemDemCongTrinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author BinhTH
 */
public class ChiTietKiemDemCongTrinhClp extends BaseModelImpl<ChiTietKiemDemCongTrinh>
	implements ChiTietKiemDemCongTrinh {
	public ChiTietKiemDemCongTrinhClp() {
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

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThongTinKiemDemCongTrinhId() {
		return _thongTinKiemDemCongTrinhId;
	}

	@Override
	public void setThongTinKiemDemCongTrinhId(int thongTinKiemDemCongTrinhId) {
		_thongTinKiemDemCongTrinhId = thongTinKiemDemCongTrinhId;

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinKiemDemCongTrinhId",
						int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel,
					thongTinKiemDemCongTrinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoHoTieu() {
		return _soHoTieu;
	}

	@Override
	public void setSoHoTieu(int soHoTieu) {
		_soHoTieu = soHoTieu;

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setSoHoTieu", int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, soHoTieu);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiNhaTieu", String.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, loaiNhaTieu);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setAnhToanCanh", String.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, anhToanCanh);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setAnhTrongNhaTieu",
						String.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel,
					anhTrongNhaTieu);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setVeSinhSachSe", int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, veSinhSachSe);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDeLamVeSinh", int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, deLamVeSinh);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setMuiVeSinh", int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, muiVeSinh);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setPhiaTrenKinDao", int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel,
					phiaTrenKinDao);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setDuCheMuaGio", int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, duCheMuaGio);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setSanCaoTrenToiThieu",
						int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel,
					sanCaoTrenToiThieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCoCongTrinhRuaTay() {
		return _coCongTrinhRuaTay;
	}

	@Override
	public void setCoCongTrinhRuaTay(int coCongTrinhRuaTay) {
		_coCongTrinhRuaTay = coCongTrinhRuaTay;

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setCoCongTrinhRuaTay",
						int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel,
					coCongTrinhRuaTay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChiTietCongTrinhRuaTay() {
		return _chiTietCongTrinhRuaTay;
	}

	@Override
	public void setChiTietCongTrinhRuaTay(String chiTietCongTrinhRuaTay) {
		_chiTietCongTrinhRuaTay = chiTietCongTrinhRuaTay;

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setChiTietCongTrinhRuaTay",
						String.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel,
					chiTietCongTrinhRuaTay);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setAnhBeChua", String.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, anhBeChua);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNapBeConTot", int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, napBeConTot);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setCuaPhanBitKin", int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, cuaPhanBitKin);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTranRaNgoai", int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, tranRaNgoai);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNuocThaiDiDau", int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, nuocThaiDiDau);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setKhoangCachNguonNuoc",
						int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel,
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setNgapKhiMuaLon", int.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, ngapKhiMuaLon);
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

		if (_chiTietKiemDemCongTrinhRemoteModel != null) {
			try {
				Class<?> clazz = _chiTietKiemDemCongTrinhRemoteModel.getClass();

				Method method = clazz.getMethod("setTenCongTrinh", String.class);

				method.invoke(_chiTietKiemDemCongTrinhRemoteModel, tenCongTrinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getChiTietKiemDemCongTrinhRemoteModel() {
		return _chiTietKiemDemCongTrinhRemoteModel;
	}

	public void setChiTietKiemDemCongTrinhRemoteModel(
		BaseModel<?> chiTietKiemDemCongTrinhRemoteModel) {
		_chiTietKiemDemCongTrinhRemoteModel = chiTietKiemDemCongTrinhRemoteModel;
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

		Class<?> remoteModelClass = _chiTietKiemDemCongTrinhRemoteModel.getClass();

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

		Object returnValue = method.invoke(_chiTietKiemDemCongTrinhRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ChiTietKiemDemCongTrinhLocalServiceUtil.addChiTietKiemDemCongTrinh(this);
		}
		else {
			ChiTietKiemDemCongTrinhLocalServiceUtil.updateChiTietKiemDemCongTrinh(this);
		}
	}

	@Override
	public ChiTietKiemDemCongTrinh toEscapedModel() {
		return (ChiTietKiemDemCongTrinh)ProxyUtil.newProxyInstance(ChiTietKiemDemCongTrinh.class.getClassLoader(),
			new Class[] { ChiTietKiemDemCongTrinh.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ChiTietKiemDemCongTrinhClp clone = new ChiTietKiemDemCongTrinhClp();

		clone.setId(getId());
		clone.setThongTinKiemDemCongTrinhId(getThongTinKiemDemCongTrinhId());
		clone.setSoHoTieu(getSoHoTieu());
		clone.setLoaiNhaTieu(getLoaiNhaTieu());
		clone.setAnhToanCanh(getAnhToanCanh());
		clone.setAnhTrongNhaTieu(getAnhTrongNhaTieu());
		clone.setVeSinhSachSe(getVeSinhSachSe());
		clone.setDeLamVeSinh(getDeLamVeSinh());
		clone.setMuiVeSinh(getMuiVeSinh());
		clone.setPhiaTrenKinDao(getPhiaTrenKinDao());
		clone.setDuCheMuaGio(getDuCheMuaGio());
		clone.setSanCaoTrenToiThieu(getSanCaoTrenToiThieu());
		clone.setCoCongTrinhRuaTay(getCoCongTrinhRuaTay());
		clone.setChiTietCongTrinhRuaTay(getChiTietCongTrinhRuaTay());
		clone.setAnhBeChua(getAnhBeChua());
		clone.setNapBeConTot(getNapBeConTot());
		clone.setCuaPhanBitKin(getCuaPhanBitKin());
		clone.setTranRaNgoai(getTranRaNgoai());
		clone.setNuocThaiDiDau(getNuocThaiDiDau());
		clone.setKhoangCachNguonNuoc(getKhoangCachNguonNuoc());
		clone.setNgapKhiMuaLon(getNgapKhiMuaLon());
		clone.setTenCongTrinh(getTenCongTrinh());

		return clone;
	}

	@Override
	public int compareTo(ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh) {
		int value = 0;

		if (getId() < chiTietKiemDemCongTrinh.getId()) {
			value = -1;
		}
		else if (getId() > chiTietKiemDemCongTrinh.getId()) {
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

		if (!(obj instanceof ChiTietKiemDemCongTrinhClp)) {
			return false;
		}

		ChiTietKiemDemCongTrinhClp chiTietKiemDemCongTrinh = (ChiTietKiemDemCongTrinhClp)obj;

		int primaryKey = chiTietKiemDemCongTrinh.getPrimaryKey();

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
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thongTinKiemDemCongTrinhId=");
		sb.append(getThongTinKiemDemCongTrinhId());
		sb.append(", soHoTieu=");
		sb.append(getSoHoTieu());
		sb.append(", loaiNhaTieu=");
		sb.append(getLoaiNhaTieu());
		sb.append(", anhToanCanh=");
		sb.append(getAnhToanCanh());
		sb.append(", anhTrongNhaTieu=");
		sb.append(getAnhTrongNhaTieu());
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
		sb.append(", coCongTrinhRuaTay=");
		sb.append(getCoCongTrinhRuaTay());
		sb.append(", chiTietCongTrinhRuaTay=");
		sb.append(getChiTietCongTrinhRuaTay());
		sb.append(", anhBeChua=");
		sb.append(getAnhBeChua());
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
		sb.append(", tenCongTrinh=");
		sb.append(getTenCongTrinh());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinKiemDemCongTrinhId</column-name><column-value><![CDATA[");
		sb.append(getThongTinKiemDemCongTrinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soHoTieu</column-name><column-value><![CDATA[");
		sb.append(getSoHoTieu());
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
			"<column><column-name>coCongTrinhRuaTay</column-name><column-value><![CDATA[");
		sb.append(getCoCongTrinhRuaTay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chiTietCongTrinhRuaTay</column-name><column-value><![CDATA[");
		sb.append(getChiTietCongTrinhRuaTay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anhBeChua</column-name><column-value><![CDATA[");
		sb.append(getAnhBeChua());
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
			"<column><column-name>tenCongTrinh</column-name><column-value><![CDATA[");
		sb.append(getTenCongTrinh());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private int _thongTinKiemDemCongTrinhId;
	private int _soHoTieu;
	private String _loaiNhaTieu;
	private String _anhToanCanh;
	private String _anhTrongNhaTieu;
	private int _veSinhSachSe;
	private int _deLamVeSinh;
	private int _muiVeSinh;
	private int _phiaTrenKinDao;
	private int _duCheMuaGio;
	private int _sanCaoTrenToiThieu;
	private int _coCongTrinhRuaTay;
	private String _chiTietCongTrinhRuaTay;
	private String _anhBeChua;
	private int _napBeConTot;
	private int _cuaPhanBitKin;
	private int _tranRaNgoai;
	private int _nuocThaiDiDau;
	private int _khoangCachNguonNuoc;
	private int _ngapKhiMuaLon;
	private String _tenCongTrinh;
	private BaseModel<?> _chiTietKiemDemCongTrinhRemoteModel;
}