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

package vn.dtt.sol.ns.kehoachdaunam.dao.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing KeHoachDauNam in entity cache.
 *
 * @author HANT
 * @see KeHoachDauNam
 * @generated
 */
public class KeHoachDauNamCacheModel implements CacheModel<KeHoachDauNam>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tramCapNuocId=");
		sb.append(tramCapNuocId);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", soDauNoiMoi=");
		sb.append(soDauNoiMoi);
		sb.append(", soHoHuongLoi=");
		sb.append(soHoHuongLoi);
		sb.append(", soNguoiHuongLoi=");
		sb.append(soNguoiHuongLoi);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", baoCaoDLI=");
		sb.append(baoCaoDLI);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", idNguoiTao=");
		sb.append(idNguoiTao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KeHoachDauNam toEntityModel() {
		KeHoachDauNamImpl keHoachDauNamImpl = new KeHoachDauNamImpl();

		keHoachDauNamImpl.setId(id);
		keHoachDauNamImpl.setTramCapNuocId(tramCapNuocId);
		keHoachDauNamImpl.setNam(nam);
		keHoachDauNamImpl.setSoDauNoiMoi(soDauNoiMoi);
		keHoachDauNamImpl.setSoHoHuongLoi(soHoHuongLoi);
		keHoachDauNamImpl.setSoNguoiHuongLoi(soNguoiHuongLoi);

		if (ghiChu == null) {
			keHoachDauNamImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			keHoachDauNamImpl.setGhiChu(ghiChu);
		}

		keHoachDauNamImpl.setBaoCaoDLI(baoCaoDLI);

		if (ngayTao == Long.MIN_VALUE) {
			keHoachDauNamImpl.setNgayTao(null);
		}
		else {
			keHoachDauNamImpl.setNgayTao(new Date(ngayTao));
		}

		keHoachDauNamImpl.setIdNguoiTao(idNguoiTao);

		keHoachDauNamImpl.resetOriginalValues();

		return keHoachDauNamImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		tramCapNuocId = objectInput.readLong();
		nam = objectInput.readLong();
		soDauNoiMoi = objectInput.readLong();
		soHoHuongLoi = objectInput.readLong();
		soNguoiHuongLoi = objectInput.readLong();
		ghiChu = objectInput.readUTF();
		baoCaoDLI = objectInput.readLong();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(tramCapNuocId);
		objectOutput.writeLong(nam);
		objectOutput.writeLong(soDauNoiMoi);
		objectOutput.writeLong(soHoHuongLoi);
		objectOutput.writeLong(soNguoiHuongLoi);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeLong(baoCaoDLI);
		objectOutput.writeLong(ngayTao);
		objectOutput.writeLong(idNguoiTao);
	}

	public long id;
	public long tramCapNuocId;
	public long nam;
	public long soDauNoiMoi;
	public long soHoHuongLoi;
	public long soNguoiHuongLoi;
	public String ghiChu;
	public long baoCaoDLI;
	public long ngayTao;
	public long idNguoiTao;
}