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

package vn.dtt.cmon.user.dao.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.cmon.user.dao.model.UserMapping;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserMapping in entity cache.
 *
 * @author khoa.vu
 * @see UserMapping
 * @generated
 */
public class UserMappingCacheModel implements CacheModel<UserMapping>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userType=");
		sb.append(userType);
		sb.append(", orgCode1=");
		sb.append(orgCode1);
		sb.append(", orgCode2=");
		sb.append(orgCode2);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserMapping toEntityModel() {
		UserMappingImpl userMappingImpl = new UserMappingImpl();

		userMappingImpl.setId(id);

		if (name == null) {
			userMappingImpl.setName(StringPool.BLANK);
		}
		else {
			userMappingImpl.setName(name);
		}

		userMappingImpl.setUserId(userId);
		userMappingImpl.setUserType(userType);

		if (orgCode1 == null) {
			userMappingImpl.setOrgCode1(StringPool.BLANK);
		}
		else {
			userMappingImpl.setOrgCode1(orgCode1);
		}

		if (orgCode2 == null) {
			userMappingImpl.setOrgCode2(StringPool.BLANK);
		}
		else {
			userMappingImpl.setOrgCode2(orgCode2);
		}

		userMappingImpl.resetOriginalValues();

		return userMappingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		name = objectInput.readUTF();
		userId = objectInput.readLong();
		userType = objectInput.readInt();
		orgCode1 = objectInput.readUTF();
		orgCode2 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(userId);
		objectOutput.writeInt(userType);

		if (orgCode1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(orgCode1);
		}

		if (orgCode2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(orgCode2);
		}
	}

	public long id;
	public String name;
	public long userId;
	public int userType;
	public String orgCode1;
	public String orgCode2;
}