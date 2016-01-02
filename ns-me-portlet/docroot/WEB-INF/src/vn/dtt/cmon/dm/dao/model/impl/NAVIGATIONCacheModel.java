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

import vn.dtt.cmon.dm.dao.model.NAVIGATION;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing NAVIGATION in entity cache.
 *
 * @author khoa.vu
 * @see NAVIGATION
 * @generated
 */
public class NAVIGATIONCacheModel implements CacheModel<NAVIGATION>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", navSub=");
		sb.append(navSub);
		sb.append(", navSubOwner=");
		sb.append(navSubOwner);
		sb.append(", roleOwner=");
		sb.append(roleOwner);
		sb.append(", permissionOwner=");
		sb.append(permissionOwner);
		sb.append(", parentId=");
		sb.append(parentId);
		sb.append(", hidden=");
		sb.append(hidden);
		sb.append(", order=");
		sb.append(order);
		sb.append(", thongKe=");
		sb.append(thongKe);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NAVIGATION toEntityModel() {
		NAVIGATIONImpl navigationImpl = new NAVIGATIONImpl();

		navigationImpl.setId(id);

		if (name == null) {
			navigationImpl.setName(StringPool.BLANK);
		}
		else {
			navigationImpl.setName(name);
		}

		if (navSub == null) {
			navigationImpl.setNavSub(StringPool.BLANK);
		}
		else {
			navigationImpl.setNavSub(navSub);
		}

		if (navSubOwner == null) {
			navigationImpl.setNavSubOwner(StringPool.BLANK);
		}
		else {
			navigationImpl.setNavSubOwner(navSubOwner);
		}

		if (roleOwner == null) {
			navigationImpl.setRoleOwner(StringPool.BLANK);
		}
		else {
			navigationImpl.setRoleOwner(roleOwner);
		}

		if (permissionOwner == null) {
			navigationImpl.setPermissionOwner(StringPool.BLANK);
		}
		else {
			navigationImpl.setPermissionOwner(permissionOwner);
		}

		navigationImpl.setParentId(parentId);
		navigationImpl.setHidden(hidden);
		navigationImpl.setOrder(order);

		if (thongKe == null) {
			navigationImpl.setThongKe(StringPool.BLANK);
		}
		else {
			navigationImpl.setThongKe(thongKe);
		}

		navigationImpl.resetOriginalValues();

		return navigationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		name = objectInput.readUTF();
		navSub = objectInput.readUTF();
		navSubOwner = objectInput.readUTF();
		roleOwner = objectInput.readUTF();
		permissionOwner = objectInput.readUTF();
		parentId = objectInput.readLong();
		hidden = objectInput.readLong();
		order = objectInput.readLong();
		thongKe = objectInput.readUTF();
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

		if (navSub == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(navSub);
		}

		if (navSubOwner == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(navSubOwner);
		}

		if (roleOwner == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(roleOwner);
		}

		if (permissionOwner == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(permissionOwner);
		}

		objectOutput.writeLong(parentId);
		objectOutput.writeLong(hidden);
		objectOutput.writeLong(order);

		if (thongKe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thongKe);
		}
	}

	public long id;
	public String name;
	public String navSub;
	public String navSubOwner;
	public String roleOwner;
	public String permissionOwner;
	public long parentId;
	public long hidden;
	public long order;
	public String thongKe;
}