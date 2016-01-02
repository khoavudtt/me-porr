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

package vn.dtt.cmon.dm.dao.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.cmon.dm.dao.model.DATAGROUP;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DATAGROUP in entity cache.
 *
 * @author khoa.vu
 * @see DATAGROUP
 * @generated
 */
public class DATAGROUPCacheModel implements CacheModel<DATAGROUP>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", code=");
		sb.append(code);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DATAGROUP toEntityModel() {
		DATAGROUPImpl datagroupImpl = new DATAGROUPImpl();

		datagroupImpl.setId(id);

		if (code == null) {
			datagroupImpl.setCode(StringPool.BLANK);
		}
		else {
			datagroupImpl.setCode(code);
		}

		if (name == null) {
			datagroupImpl.setName(StringPool.BLANK);
		}
		else {
			datagroupImpl.setName(name);
		}

		if (description == null) {
			datagroupImpl.setDescription(StringPool.BLANK);
		}
		else {
			datagroupImpl.setDescription(description);
		}

		datagroupImpl.resetOriginalValues();

		return datagroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		code = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long id;
	public String code;
	public String name;
	public String description;
}