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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.cmon.dm.dao.service.http.DATAGROUPServiceSoap}.
 *
 * @author khoa.vu
 * @see vn.dtt.cmon.dm.dao.service.http.DATAGROUPServiceSoap
 * @generated
 */
public class DATAGROUPSoap implements Serializable {
	public static DATAGROUPSoap toSoapModel(DATAGROUP model) {
		DATAGROUPSoap soapModel = new DATAGROUPSoap();

		soapModel.setId(model.getId());
		soapModel.setCode(model.getCode());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static DATAGROUPSoap[] toSoapModels(DATAGROUP[] models) {
		DATAGROUPSoap[] soapModels = new DATAGROUPSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DATAGROUPSoap[][] toSoapModels(DATAGROUP[][] models) {
		DATAGROUPSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DATAGROUPSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DATAGROUPSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DATAGROUPSoap[] toSoapModels(List<DATAGROUP> models) {
		List<DATAGROUPSoap> soapModels = new ArrayList<DATAGROUPSoap>(models.size());

		for (DATAGROUP model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DATAGROUPSoap[soapModels.size()]);
	}

	public DATAGROUPSoap() {
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

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _id;
	private String _code;
	private String _name;
	private String _description;
}