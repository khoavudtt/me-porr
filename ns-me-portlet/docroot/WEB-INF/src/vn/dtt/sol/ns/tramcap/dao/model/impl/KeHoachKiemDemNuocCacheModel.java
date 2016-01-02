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

import vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing KeHoachKiemDemNuoc in entity cache.
 *
 * @author khoa.vu
 * @see KeHoachKiemDemNuoc
 * @generated
 */
public class KeHoachKiemDemNuocCacheModel implements CacheModel<KeHoachKiemDemNuoc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", tramCapNuocId=");
		sb.append(tramCapNuocId);
		sb.append(", kiemDemVienId=");
		sb.append(kiemDemVienId);
		sb.append(", ngayBatDau=");
		sb.append(ngayBatDau);
		sb.append(", ngayKetThuc=");
		sb.append(ngayKetThuc);
		sb.append(", moTa=");
		sb.append(moTa);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", idNguoiTao=");
		sb.append(idNguoiTao);
		sb.append(", ngayXuatBan=");
		sb.append(ngayXuatBan);
		sb.append(", idNguoiXuatBan=");
		sb.append(idNguoiXuatBan);
		sb.append(", ngayDong=");
		sb.append(ngayDong);
		sb.append(", idNguoiDong=");
		sb.append(idNguoiDong);
		sb.append(", lastSavePoint=");
		sb.append(lastSavePoint);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KeHoachKiemDemNuoc toEntityModel() {
		KeHoachKiemDemNuocImpl keHoachKiemDemNuocImpl = new KeHoachKiemDemNuocImpl();

		keHoachKiemDemNuocImpl.setId(id);
		keHoachKiemDemNuocImpl.setNam(nam);
		keHoachKiemDemNuocImpl.setTramCapNuocId(tramCapNuocId);
		keHoachKiemDemNuocImpl.setKiemDemVienId(kiemDemVienId);

		if (ngayBatDau == Long.MIN_VALUE) {
			keHoachKiemDemNuocImpl.setNgayBatDau(null);
		}
		else {
			keHoachKiemDemNuocImpl.setNgayBatDau(new Date(ngayBatDau));
		}

		if (ngayKetThuc == Long.MIN_VALUE) {
			keHoachKiemDemNuocImpl.setNgayKetThuc(null);
		}
		else {
			keHoachKiemDemNuocImpl.setNgayKetThuc(new Date(ngayKetThuc));
		}

		if (moTa == null) {
			keHoachKiemDemNuocImpl.setMoTa(StringPool.BLANK);
		}
		else {
			keHoachKiemDemNuocImpl.setMoTa(moTa);
		}

		if (ngayTao == Long.MIN_VALUE) {
			keHoachKiemDemNuocImpl.setNgayTao(null);
		}
		else {
			keHoachKiemDemNuocImpl.setNgayTao(new Date(ngayTao));
		}

		keHoachKiemDemNuocImpl.setIdNguoiTao(idNguoiTao);

		if (ngayXuatBan == Long.MIN_VALUE) {
			keHoachKiemDemNuocImpl.setNgayXuatBan(null);
		}
		else {
			keHoachKiemDemNuocImpl.setNgayXuatBan(new Date(ngayXuatBan));
		}

		keHoachKiemDemNuocImpl.setIdNguoiXuatBan(idNguoiXuatBan);

		if (ngayDong == Long.MIN_VALUE) {
			keHoachKiemDemNuocImpl.setNgayDong(null);
		}
		else {
			keHoachKiemDemNuocImpl.setNgayDong(new Date(ngayDong));
		}

		keHoachKiemDemNuocImpl.setIdNguoiDong(idNguoiDong);

		if (lastSavePoint == Long.MIN_VALUE) {
			keHoachKiemDemNuocImpl.setLastSavePoint(null);
		}
		else {
			keHoachKiemDemNuocImpl.setLastSavePoint(new Date(lastSavePoint));
		}

		keHoachKiemDemNuocImpl.resetOriginalValues();

		return keHoachKiemDemNuocImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		nam = objectInput.readInt();
		tramCapNuocId = objectInput.readInt();
		kiemDemVienId = objectInput.readInt();
		ngayBatDau = objectInput.readLong();
		ngayKetThuc = objectInput.readLong();
		moTa = objectInput.readUTF();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readInt();
		ngayXuatBan = objectInput.readLong();
		idNguoiXuatBan = objectInput.readInt();
		ngayDong = objectInput.readLong();
		idNguoiDong = objectInput.readInt();
		lastSavePoint = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(nam);
		objectOutput.writeInt(tramCapNuocId);
		objectOutput.writeInt(kiemDemVienId);
		objectOutput.writeLong(ngayBatDau);
		objectOutput.writeLong(ngayKetThuc);

		if (moTa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(moTa);
		}

		objectOutput.writeLong(ngayTao);
		objectOutput.writeInt(idNguoiTao);
		objectOutput.writeLong(ngayXuatBan);
		objectOutput.writeInt(idNguoiXuatBan);
		objectOutput.writeLong(ngayDong);
		objectOutput.writeInt(idNguoiDong);
		objectOutput.writeLong(lastSavePoint);
	}

	public int id;
	public int nam;
	public int tramCapNuocId;
	public int kiemDemVienId;
	public long ngayBatDau;
	public long ngayKetThuc;
	public String moTa;
	public long ngayTao;
	public int idNguoiTao;
	public long ngayXuatBan;
	public int idNguoiXuatBan;
	public long ngayDong;
	public int idNguoiDong;
	public long lastSavePoint;
}