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

package vn.dtt.sol.ns.baocaodli.dao.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BaoCaoDLI in entity cache.
 *
 * @author HuyMQ
 * @see BaoCaoDLI
 * @generated
 */
public class BaoCaoDLICacheModel implements CacheModel<BaoCaoDLI>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maTinh=");
		sb.append(maTinh);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", loaiBaoCao=");
		sb.append(loaiBaoCao);
		sb.append(", nguoiLap=");
		sb.append(nguoiLap);
		sb.append(", nguoiDuyet=");
		sb.append(nguoiDuyet);
		sb.append(", soBaoCao=");
		sb.append(soBaoCao);
		sb.append(", ngayBaoCao=");
		sb.append(ngayBaoCao);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", luuTruPDF1Id=");
		sb.append(luuTruPDF1Id);
		sb.append(", luuTruPDF2Id=");
		sb.append(luuTruPDF2Id);
		sb.append(", luuTruCSV1Id=");
		sb.append(luuTruCSV1Id);
		sb.append(", luuTruCSV2Id=");
		sb.append(luuTruCSV2Id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BaoCaoDLI toEntityModel() {
		BaoCaoDLIImpl baoCaoDLIImpl = new BaoCaoDLIImpl();

		baoCaoDLIImpl.setId(id);

		if (maTinh == null) {
			baoCaoDLIImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			baoCaoDLIImpl.setMaTinh(maTinh);
		}

		baoCaoDLIImpl.setNam(nam);
		baoCaoDLIImpl.setLoaiBaoCao(loaiBaoCao);

		if (nguoiLap == null) {
			baoCaoDLIImpl.setNguoiLap(StringPool.BLANK);
		}
		else {
			baoCaoDLIImpl.setNguoiLap(nguoiLap);
		}

		if (nguoiDuyet == null) {
			baoCaoDLIImpl.setNguoiDuyet(StringPool.BLANK);
		}
		else {
			baoCaoDLIImpl.setNguoiDuyet(nguoiDuyet);
		}

		if (soBaoCao == null) {
			baoCaoDLIImpl.setSoBaoCao(StringPool.BLANK);
		}
		else {
			baoCaoDLIImpl.setSoBaoCao(soBaoCao);
		}

		if (ngayBaoCao == Long.MIN_VALUE) {
			baoCaoDLIImpl.setNgayBaoCao(null);
		}
		else {
			baoCaoDLIImpl.setNgayBaoCao(new Date(ngayBaoCao));
		}

		baoCaoDLIImpl.setTrangThai(trangThai);
		baoCaoDLIImpl.setLuuTruPDF1Id(luuTruPDF1Id);
		baoCaoDLIImpl.setLuuTruPDF2Id(luuTruPDF2Id);
		baoCaoDLIImpl.setLuuTruCSV1Id(luuTruCSV1Id);
		baoCaoDLIImpl.setLuuTruCSV2Id(luuTruCSV2Id);

		baoCaoDLIImpl.resetOriginalValues();

		return baoCaoDLIImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maTinh = objectInput.readUTF();
		nam = objectInput.readInt();
		loaiBaoCao = objectInput.readInt();
		nguoiLap = objectInput.readUTF();
		nguoiDuyet = objectInput.readUTF();
		soBaoCao = objectInput.readUTF();
		ngayBaoCao = objectInput.readLong();
		trangThai = objectInput.readInt();
		luuTruPDF1Id = objectInput.readLong();
		luuTruPDF2Id = objectInput.readLong();
		luuTruCSV1Id = objectInput.readLong();
		luuTruCSV2Id = objectInput.readLong();
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

		objectOutput.writeInt(nam);
		objectOutput.writeInt(loaiBaoCao);

		if (nguoiLap == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nguoiLap);
		}

		if (nguoiDuyet == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nguoiDuyet);
		}

		if (soBaoCao == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soBaoCao);
		}

		objectOutput.writeLong(ngayBaoCao);
		objectOutput.writeInt(trangThai);
		objectOutput.writeLong(luuTruPDF1Id);
		objectOutput.writeLong(luuTruPDF2Id);
		objectOutput.writeLong(luuTruCSV1Id);
		objectOutput.writeLong(luuTruCSV2Id);
	}

	public long id;
	public String maTinh;
	public int nam;
	public int loaiBaoCao;
	public String nguoiLap;
	public String nguoiDuyet;
	public String soBaoCao;
	public long ngayBaoCao;
	public int trangThai;
	public long luuTruPDF1Id;
	public long luuTruPDF2Id;
	public long luuTruCSV1Id;
	public long luuTruCSV2Id;
}