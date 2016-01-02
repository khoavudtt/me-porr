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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author khoa.vu
 * @generated
 */
public class KeHoachNuocSachSoap implements Serializable {
	public static KeHoachNuocSachSoap toSoapModel(KeHoachNuocSach model) {
		KeHoachNuocSachSoap soapModel = new KeHoachNuocSachSoap();

		soapModel.setId(model.getId());
		soapModel.setTramCapNuocId(model.getTramCapNuocId());
		soapModel.setNam(model.getNam());
		soapModel.setSoDauNoiMoi(model.getSoDauNoiMoi());
		soapModel.setSoNguoiHuongLoi(model.getSoNguoiHuongLoi());
		soapModel.setGhiChu(model.getGhiChu());

		return soapModel;
	}

	public static KeHoachNuocSachSoap[] toSoapModels(KeHoachNuocSach[] models) {
		KeHoachNuocSachSoap[] soapModels = new KeHoachNuocSachSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KeHoachNuocSachSoap[][] toSoapModels(
		KeHoachNuocSach[][] models) {
		KeHoachNuocSachSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KeHoachNuocSachSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KeHoachNuocSachSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KeHoachNuocSachSoap[] toSoapModels(
		List<KeHoachNuocSach> models) {
		List<KeHoachNuocSachSoap> soapModels = new ArrayList<KeHoachNuocSachSoap>(models.size());

		for (KeHoachNuocSach model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KeHoachNuocSachSoap[soapModels.size()]);
	}

	public KeHoachNuocSachSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public int getTramCapNuocId() {
		return _tramCapNuocId;
	}

	public void setTramCapNuocId(int tramCapNuocId) {
		_tramCapNuocId = tramCapNuocId;
	}

	public int getNam() {
		return _nam;
	}

	public void setNam(int nam) {
		_nam = nam;
	}

	public int getSoDauNoiMoi() {
		return _soDauNoiMoi;
	}

	public void setSoDauNoiMoi(int soDauNoiMoi) {
		_soDauNoiMoi = soDauNoiMoi;
	}

	public int getSoNguoiHuongLoi() {
		return _soNguoiHuongLoi;
	}

	public void setSoNguoiHuongLoi(int soNguoiHuongLoi) {
		_soNguoiHuongLoi = soNguoiHuongLoi;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	private long _id;
	private int _tramCapNuocId;
	private int _nam;
	private int _soDauNoiMoi;
	private int _soNguoiHuongLoi;
	private String _ghiChu;
}