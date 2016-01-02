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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.sol.ns.baocaodli.dao.service.http.BaoCaoDLIServiceSoap}.
 *
 * @author HuyMQ
 * @see vn.dtt.sol.ns.baocaodli.dao.service.http.BaoCaoDLIServiceSoap
 * @generated
 */
public class BaoCaoDLISoap implements Serializable {
	public static BaoCaoDLISoap toSoapModel(BaoCaoDLI model) {
		BaoCaoDLISoap soapModel = new BaoCaoDLISoap();

		soapModel.setId(model.getId());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setNam(model.getNam());
		soapModel.setLoaiBaoCao(model.getLoaiBaoCao());
		soapModel.setNguoiLap(model.getNguoiLap());
		soapModel.setNguoiDuyet(model.getNguoiDuyet());
		soapModel.setSoBaoCao(model.getSoBaoCao());
		soapModel.setNgayBaoCao(model.getNgayBaoCao());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setLuuTruPDF1Id(model.getLuuTruPDF1Id());
		soapModel.setLuuTruPDF2Id(model.getLuuTruPDF2Id());
		soapModel.setLuuTruCSV1Id(model.getLuuTruCSV1Id());
		soapModel.setLuuTruCSV2Id(model.getLuuTruCSV2Id());

		return soapModel;
	}

	public static BaoCaoDLISoap[] toSoapModels(BaoCaoDLI[] models) {
		BaoCaoDLISoap[] soapModels = new BaoCaoDLISoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BaoCaoDLISoap[][] toSoapModels(BaoCaoDLI[][] models) {
		BaoCaoDLISoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BaoCaoDLISoap[models.length][models[0].length];
		}
		else {
			soapModels = new BaoCaoDLISoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BaoCaoDLISoap[] toSoapModels(List<BaoCaoDLI> models) {
		List<BaoCaoDLISoap> soapModels = new ArrayList<BaoCaoDLISoap>(models.size());

		for (BaoCaoDLI model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BaoCaoDLISoap[soapModels.size()]);
	}

	public BaoCaoDLISoap() {
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

	public String getMaTinh() {
		return _maTinh;
	}

	public void setMaTinh(String maTinh) {
		_maTinh = maTinh;
	}

	public int getNam() {
		return _nam;
	}

	public void setNam(int nam) {
		_nam = nam;
	}

	public int getLoaiBaoCao() {
		return _loaiBaoCao;
	}

	public void setLoaiBaoCao(int loaiBaoCao) {
		_loaiBaoCao = loaiBaoCao;
	}

	public String getNguoiLap() {
		return _nguoiLap;
	}

	public void setNguoiLap(String nguoiLap) {
		_nguoiLap = nguoiLap;
	}

	public String getNguoiDuyet() {
		return _nguoiDuyet;
	}

	public void setNguoiDuyet(String nguoiDuyet) {
		_nguoiDuyet = nguoiDuyet;
	}

	public String getSoBaoCao() {
		return _soBaoCao;
	}

	public void setSoBaoCao(String soBaoCao) {
		_soBaoCao = soBaoCao;
	}

	public Date getNgayBaoCao() {
		return _ngayBaoCao;
	}

	public void setNgayBaoCao(Date ngayBaoCao) {
		_ngayBaoCao = ngayBaoCao;
	}

	public int getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;
	}

	public long getLuuTruPDF1Id() {
		return _luuTruPDF1Id;
	}

	public void setLuuTruPDF1Id(long luuTruPDF1Id) {
		_luuTruPDF1Id = luuTruPDF1Id;
	}

	public long getLuuTruPDF2Id() {
		return _luuTruPDF2Id;
	}

	public void setLuuTruPDF2Id(long luuTruPDF2Id) {
		_luuTruPDF2Id = luuTruPDF2Id;
	}

	public long getLuuTruCSV1Id() {
		return _luuTruCSV1Id;
	}

	public void setLuuTruCSV1Id(long luuTruCSV1Id) {
		_luuTruCSV1Id = luuTruCSV1Id;
	}

	public long getLuuTruCSV2Id() {
		return _luuTruCSV2Id;
	}

	public void setLuuTruCSV2Id(long luuTruCSV2Id) {
		_luuTruCSV2Id = luuTruCSV2Id;
	}

	private long _id;
	private String _maTinh;
	private int _nam;
	private int _loaiBaoCao;
	private String _nguoiLap;
	private String _nguoiDuyet;
	private String _soBaoCao;
	private Date _ngayBaoCao;
	private int _trangThai;
	private long _luuTruPDF1Id;
	private long _luuTruPDF2Id;
	private long _luuTruCSV1Id;
	private long _luuTruCSV2Id;
}