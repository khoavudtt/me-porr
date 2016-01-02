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

import vn.dtt.cmon.dm.dao.model.DATAITEM;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DATAITEM in entity cache.
 *
 * @author khoa.vu
 * @see DATAITEM
 * @generated
 */
public class DATAITEMCacheModel implements CacheModel<DATAITEM>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", dataGroupId=");
		sb.append(dataGroupId);
		sb.append(", code=");
		sb.append(code);
		sb.append(", node1=");
		sb.append(node1);
		sb.append(", node2=");
		sb.append(node2);
		sb.append(", node3=");
		sb.append(node3);
		sb.append(", node4=");
		sb.append(node4);
		sb.append(", level=");
		sb.append(level);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", status=");
		sb.append(status);
		sb.append(", validatedFrom=");
		sb.append(validatedFrom);
		sb.append(", validatedTo=");
		sb.append(validatedTo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DATAITEM toEntityModel() {
		DATAITEMImpl dataitemImpl = new DATAITEMImpl();

		dataitemImpl.setId(id);
		dataitemImpl.setDataGroupId(dataGroupId);

		if (code == null) {
			dataitemImpl.setCode(StringPool.BLANK);
		}
		else {
			dataitemImpl.setCode(code);
		}

		if (node1 == null) {
			dataitemImpl.setNode1(StringPool.BLANK);
		}
		else {
			dataitemImpl.setNode1(node1);
		}

		if (node2 == null) {
			dataitemImpl.setNode2(StringPool.BLANK);
		}
		else {
			dataitemImpl.setNode2(node2);
		}

		if (node3 == null) {
			dataitemImpl.setNode3(StringPool.BLANK);
		}
		else {
			dataitemImpl.setNode3(node3);
		}

		if (node4 == null) {
			dataitemImpl.setNode4(StringPool.BLANK);
		}
		else {
			dataitemImpl.setNode4(node4);
		}

		dataitemImpl.setLevel(level);

		if (name == null) {
			dataitemImpl.setName(StringPool.BLANK);
		}
		else {
			dataitemImpl.setName(name);
		}

		if (description == null) {
			dataitemImpl.setDescription(StringPool.BLANK);
		}
		else {
			dataitemImpl.setDescription(description);
		}

		dataitemImpl.setStatus(status);

		if (validatedFrom == Long.MIN_VALUE) {
			dataitemImpl.setValidatedFrom(null);
		}
		else {
			dataitemImpl.setValidatedFrom(new Date(validatedFrom));
		}

		if (validatedTo == Long.MIN_VALUE) {
			dataitemImpl.setValidatedTo(null);
		}
		else {
			dataitemImpl.setValidatedTo(new Date(validatedTo));
		}

		dataitemImpl.resetOriginalValues();

		return dataitemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		dataGroupId = objectInput.readLong();
		code = objectInput.readUTF();
		node1 = objectInput.readUTF();
		node2 = objectInput.readUTF();
		node3 = objectInput.readUTF();
		node4 = objectInput.readUTF();
		level = objectInput.readInt();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		status = objectInput.readInt();
		validatedFrom = objectInput.readLong();
		validatedTo = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(dataGroupId);

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (node1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node1);
		}

		if (node2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node2);
		}

		if (node3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node3);
		}

		if (node4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node4);
		}

		objectOutput.writeInt(level);

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

		objectOutput.writeInt(status);
		objectOutput.writeLong(validatedFrom);
		objectOutput.writeLong(validatedTo);
	}

	public long id;
	public long dataGroupId;
	public String code;
	public String node1;
	public String node2;
	public String node3;
	public String node4;
	public int level;
	public String name;
	public String description;
	public int status;
	public long validatedFrom;
	public long validatedTo;
}