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

package vn.dtt.cmon.dm.dao.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author khoa.vu
 * @generated
 */
public class NAVIGATIONSoap implements Serializable {
	public static NAVIGATIONSoap toSoapModel(NAVIGATION model) {
		NAVIGATIONSoap soapModel = new NAVIGATIONSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setNavSub(model.getNavSub());
		soapModel.setNavSubOwner(model.getNavSubOwner());
		soapModel.setRoleOwner(model.getRoleOwner());
		soapModel.setPermissionOwner(model.getPermissionOwner());
		soapModel.setParentId(model.getParentId());
		soapModel.setHidden(model.getHidden());
		soapModel.setOrder(model.getOrder());
		soapModel.setThongKe(model.getThongKe());

		return soapModel;
	}

	public static NAVIGATIONSoap[] toSoapModels(NAVIGATION[] models) {
		NAVIGATIONSoap[] soapModels = new NAVIGATIONSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NAVIGATIONSoap[][] toSoapModels(NAVIGATION[][] models) {
		NAVIGATIONSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NAVIGATIONSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NAVIGATIONSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NAVIGATIONSoap[] toSoapModels(List<NAVIGATION> models) {
		List<NAVIGATIONSoap> soapModels = new ArrayList<NAVIGATIONSoap>(models.size());

		for (NAVIGATION model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NAVIGATIONSoap[soapModels.size()]);
	}

	public NAVIGATIONSoap() {
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

	public String getNavSub() {
		return _navSub;
	}

	public void setNavSub(String navSub) {
		_navSub = navSub;
	}

	public String getNavSubOwner() {
		return _navSubOwner;
	}

	public void setNavSubOwner(String navSubOwner) {
		_navSubOwner = navSubOwner;
	}

	public String getRoleOwner() {
		return _roleOwner;
	}

	public void setRoleOwner(String roleOwner) {
		_roleOwner = roleOwner;
	}

	public String getPermissionOwner() {
		return _permissionOwner;
	}

	public void setPermissionOwner(String permissionOwner) {
		_permissionOwner = permissionOwner;
	}

	public long getParentId() {
		return _parentId;
	}

	public void setParentId(long parentId) {
		_parentId = parentId;
	}

	public long getHidden() {
		return _hidden;
	}

	public void setHidden(long hidden) {
		_hidden = hidden;
	}

	public long getOrder() {
		return _order;
	}

	public void setOrder(long order) {
		_order = order;
	}

	public String getThongKe() {
		return _thongKe;
	}

	public void setThongKe(String thongKe) {
		_thongKe = thongKe;
	}

	private long _id;
	private String _name;
	private String _navSub;
	private String _navSubOwner;
	private String _roleOwner;
	private String _permissionOwner;
	private long _parentId;
	private long _hidden;
	private long _order;
	private String _thongKe;
}