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
public class UserMappingSoap implements Serializable {
	public static UserMappingSoap toSoapModel(UserMapping model) {
		UserMappingSoap soapModel = new UserMappingSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserType(model.getUserType());
		soapModel.setOrgCode1(model.getOrgCode1());
		soapModel.setOrgCode2(model.getOrgCode2());

		return soapModel;
	}

	public static UserMappingSoap[] toSoapModels(UserMapping[] models) {
		UserMappingSoap[] soapModels = new UserMappingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserMappingSoap[][] toSoapModels(UserMapping[][] models) {
		UserMappingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserMappingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserMappingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserMappingSoap[] toSoapModels(List<UserMapping> models) {
		List<UserMappingSoap> soapModels = new ArrayList<UserMappingSoap>(models.size());

		for (UserMapping model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserMappingSoap[soapModels.size()]);
	}

	public UserMappingSoap() {
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

	public int getUserType() {
		return _userType;
	}

	public void setUserType(int userType) {
		_userType = userType;
	}

	public String getOrgCode1() {
		return _orgCode1;
	}

	public void setOrgCode1(String orgCode1) {
		_orgCode1 = orgCode1;
	}

	public String getOrgCode2() {
		return _orgCode2;
	}

	public void setOrgCode2(String orgCode2) {
		_orgCode2 = orgCode2;
	}

	private long _id;
	private String _name;
	private long _userId;
	private int _userType;
	private String _orgCode1;
	private String _orgCode2;
}