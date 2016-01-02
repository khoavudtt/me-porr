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

import vn.dtt.cmon.user.dao.model.UserHuyen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserHuyen in entity cache.
 *
 * @author khoa.vu
 * @see UserHuyen
 * @generated
 */
public class UserHuyenCacheModel implements CacheModel<UserHuyen>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maTinh=");
		sb.append(maTinh);
		sb.append(", maHuyen=");
		sb.append(maHuyen);
		sb.append(", maXa=");
		sb.append(maXa);
		sb.append(", name=");
		sb.append(name);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserHuyen toEntityModel() {
		UserHuyenImpl userHuyenImpl = new UserHuyenImpl();

		userHuyenImpl.setId(id);

		if (maTinh == null) {
			userHuyenImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			userHuyenImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			userHuyenImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			userHuyenImpl.setMaHuyen(maHuyen);
		}

		if (maXa == null) {
			userHuyenImpl.setMaXa(StringPool.BLANK);
		}
		else {
			userHuyenImpl.setMaXa(maXa);
		}

		if (name == null) {
			userHuyenImpl.setName(StringPool.BLANK);
		}
		else {
			userHuyenImpl.setName(name);
		}

		userHuyenImpl.setUserId(userId);

		userHuyenImpl.resetOriginalValues();

		return userHuyenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		maXa = objectInput.readUTF();
		name = objectInput.readUTF();
		userId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maTinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTinh);
		}

		if (maHuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maHuyen);
		}

		if (maXa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maXa);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(userId);
	}

	public long id;
	public String maTinh;
	public String maHuyen;
	public String maXa;
	public String name;
	public long userId;
}