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

package vn.dtt.cmon.user.dao.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author khoa.vu
 * @generated
 */
public class UserHuyenSoap implements Serializable {
	public static UserHuyenSoap toSoapModel(UserHuyen model) {
		UserHuyenSoap soapModel = new UserHuyenSoap();

		soapModel.setId(model.getId());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setName(model.getName());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static UserHuyenSoap[] toSoapModels(UserHuyen[] models) {
		UserHuyenSoap[] soapModels = new UserHuyenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserHuyenSoap[][] toSoapModels(UserHuyen[][] models) {
		UserHuyenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserHuyenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserHuyenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserHuyenSoap[] toSoapModels(List<UserHuyen> models) {
		List<UserHuyenSoap> soapModels = new ArrayList<UserHuyenSoap>(models.size());

		for (UserHuyen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserHuyenSoap[soapModels.size()]);
	}

	public UserHuyenSoap() {
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

	public String getMaHuyen() {
		return _maHuyen;
	}

	public void setMaHuyen(String maHuyen) {
		_maHuyen = maHuyen;
	}

	public String getMaXa() {
		return _maXa;
	}

	public void setMaXa(String maXa) {
		_maXa = maXa;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private long _id;
	private String _maTinh;
	private String _maHuyen;
	private String _maXa;
	private String _name;
	private long _userId;
}