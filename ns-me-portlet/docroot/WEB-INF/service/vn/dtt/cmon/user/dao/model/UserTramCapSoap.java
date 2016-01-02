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
public class UserTramCapSoap implements Serializable {
	public static UserTramCapSoap toSoapModel(UserTramCap model) {
		UserTramCapSoap soapModel = new UserTramCapSoap();

		soapModel.setId(model.getId());
		soapModel.setMaTinh(model.getMaTinh());
		soapModel.setMaHuyen(model.getMaHuyen());
		soapModel.setMaXa(model.getMaXa());
		soapModel.setName(model.getName());
		soapModel.setMaTramCap(model.getMaTramCap());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static UserTramCapSoap[] toSoapModels(UserTramCap[] models) {
		UserTramCapSoap[] soapModels = new UserTramCapSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserTramCapSoap[][] toSoapModels(UserTramCap[][] models) {
		UserTramCapSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserTramCapSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserTramCapSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserTramCapSoap[] toSoapModels(List<UserTramCap> models) {
		List<UserTramCapSoap> soapModels = new ArrayList<UserTramCapSoap>(models.size());

		for (UserTramCap model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserTramCapSoap[soapModels.size()]);
	}

	public UserTramCapSoap() {
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

	public long getMaTramCap() {
		return _maTramCap;
	}

	public void setMaTramCap(long maTramCap) {
		_maTramCap = maTramCap;
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
	private long _maTramCap;
	private long _userId;
}