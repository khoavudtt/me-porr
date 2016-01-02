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

package vn.dtt.sol.ns.tramcap.dao.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing KeHoachNuocSach in entity cache.
 *
 * @author khoa.vu
 * @see KeHoachNuocSach
 * @generated
 */
public class KeHoachNuocSachCacheModel implements CacheModel<KeHoachNuocSach>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tramCapNuocId=");
		sb.append(tramCapNuocId);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", soDauNoiMoi=");
		sb.append(soDauNoiMoi);
		sb.append(", soNguoiHuongLoi=");
		sb.append(soNguoiHuongLoi);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KeHoachNuocSach toEntityModel() {
		KeHoachNuocSachImpl keHoachNuocSachImpl = new KeHoachNuocSachImpl();

		keHoachNuocSachImpl.setId(id);
		keHoachNuocSachImpl.setTramCapNuocId(tramCapNuocId);
		keHoachNuocSachImpl.setNam(nam);
		keHoachNuocSachImpl.setSoDauNoiMoi(soDauNoiMoi);
		keHoachNuocSachImpl.setSoNguoiHuongLoi(soNguoiHuongLoi);

		if (ghiChu == null) {
			keHoachNuocSachImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			keHoachNuocSachImpl.setGhiChu(ghiChu);
		}

		keHoachNuocSachImpl.resetOriginalValues();

		return keHoachNuocSachImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		tramCapNuocId = objectInput.readInt();
		nam = objectInput.readInt();
		soDauNoiMoi = objectInput.readInt();
		soNguoiHuongLoi = objectInput.readInt();
		ghiChu = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(tramCapNuocId);
		objectOutput.writeInt(nam);
		objectOutput.writeInt(soDauNoiMoi);
		objectOutput.writeInt(soNguoiHuongLoi);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}
	}

	public long id;
	public int tramCapNuocId;
	public int nam;
	public int soDauNoiMoi;
	public int soNguoiHuongLoi;
	public String ghiChu;
}