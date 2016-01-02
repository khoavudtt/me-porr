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

package vn.dtt.sol.ns.kehoachdaunam.dao.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author HANT
 * @generated
 */
public class KeHoachDauNamSoap implements Serializable {
	public static KeHoachDauNamSoap toSoapModel(KeHoachDauNam model) {
		KeHoachDauNamSoap soapModel = new KeHoachDauNamSoap();

		soapModel.setId(model.getId());
		soapModel.setTramCapNuocId(model.getTramCapNuocId());
		soapModel.setNam(model.getNam());
		soapModel.setSoDauNoiMoi(model.getSoDauNoiMoi());
		soapModel.setSoHoHuongLoi(model.getSoHoHuongLoi());
		soapModel.setSoNguoiHuongLoi(model.getSoNguoiHuongLoi());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setBaoCaoDLI(model.getBaoCaoDLI());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setIdNguoiTao(model.getIdNguoiTao());

		return soapModel;
	}

	public static KeHoachDauNamSoap[] toSoapModels(KeHoachDauNam[] models) {
		KeHoachDauNamSoap[] soapModels = new KeHoachDauNamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KeHoachDauNamSoap[][] toSoapModels(KeHoachDauNam[][] models) {
		KeHoachDauNamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KeHoachDauNamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KeHoachDauNamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KeHoachDauNamSoap[] toSoapModels(List<KeHoachDauNam> models) {
		List<KeHoachDauNamSoap> soapModels = new ArrayList<KeHoachDauNamSoap>(models.size());

		for (KeHoachDauNam model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KeHoachDauNamSoap[soapModels.size()]);
	}

	public KeHoachDauNamSoap() {
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

	public long getTramCapNuocId() {
		return _tramCapNuocId;
	}

	public void setTramCapNuocId(long tramCapNuocId) {
		_tramCapNuocId = tramCapNuocId;
	}

	public long getNam() {
		return _nam;
	}

	public void setNam(long nam) {
		_nam = nam;
	}

	public long getSoDauNoiMoi() {
		return _soDauNoiMoi;
	}

	public void setSoDauNoiMoi(long soDauNoiMoi) {
		_soDauNoiMoi = soDauNoiMoi;
	}

	public long getSoHoHuongLoi() {
		return _soHoHuongLoi;
	}

	public void setSoHoHuongLoi(long soHoHuongLoi) {
		_soHoHuongLoi = soHoHuongLoi;
	}

	public long getSoNguoiHuongLoi() {
		return _soNguoiHuongLoi;
	}

	public void setSoNguoiHuongLoi(long soNguoiHuongLoi) {
		_soNguoiHuongLoi = soNguoiHuongLoi;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public long getBaoCaoDLI() {
		return _baoCaoDLI;
	}

	public void setBaoCaoDLI(long baoCaoDLI) {
		_baoCaoDLI = baoCaoDLI;
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	public long getIdNguoiTao() {
		return _idNguoiTao;
	}

	public void setIdNguoiTao(long idNguoiTao) {
		_idNguoiTao = idNguoiTao;
	}

	private long _id;
	private long _tramCapNuocId;
	private long _nam;
	private long _soDauNoiMoi;
	private long _soHoHuongLoi;
	private long _soNguoiHuongLoi;
	private String _ghiChu;
	private long _baoCaoDLI;
	private Date _ngayTao;
	private long _idNguoiTao;
}