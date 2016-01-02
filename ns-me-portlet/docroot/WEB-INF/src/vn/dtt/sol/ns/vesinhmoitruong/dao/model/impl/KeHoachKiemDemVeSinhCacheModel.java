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

package vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing KeHoachKiemDemVeSinh in entity cache.
 *
 * @author BinhTH
 * @see KeHoachKiemDemVeSinh
 * @generated
 */
public class KeHoachKiemDemVeSinhCacheModel implements CacheModel<KeHoachKiemDemVeSinh>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(id);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", maTinh=");
		sb.append(maTinh);
		sb.append(", maHuyen=");
		sb.append(maHuyen);
		sb.append(", kiemDemVienID=");
		sb.append(kiemDemVienID);
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
		sb.append(", tableId=");
		sb.append(tableId);
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
	public KeHoachKiemDemVeSinh toEntityModel() {
		KeHoachKiemDemVeSinhImpl keHoachKiemDemVeSinhImpl = new KeHoachKiemDemVeSinhImpl();

		keHoachKiemDemVeSinhImpl.setId(id);
		keHoachKiemDemVeSinhImpl.setNam(nam);

		if (maTinh == null) {
			keHoachKiemDemVeSinhImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			keHoachKiemDemVeSinhImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			keHoachKiemDemVeSinhImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			keHoachKiemDemVeSinhImpl.setMaHuyen(maHuyen);
		}

		keHoachKiemDemVeSinhImpl.setKiemDemVienID(kiemDemVienID);

		if (ngayBatDau == Long.MIN_VALUE) {
			keHoachKiemDemVeSinhImpl.setNgayBatDau(null);
		}
		else {
			keHoachKiemDemVeSinhImpl.setNgayBatDau(new Date(ngayBatDau));
		}

		if (ngayKetThuc == Long.MIN_VALUE) {
			keHoachKiemDemVeSinhImpl.setNgayKetThuc(null);
		}
		else {
			keHoachKiemDemVeSinhImpl.setNgayKetThuc(new Date(ngayKetThuc));
		}

		if (moTa == null) {
			keHoachKiemDemVeSinhImpl.setMoTa(StringPool.BLANK);
		}
		else {
			keHoachKiemDemVeSinhImpl.setMoTa(moTa);
		}

		if (ngayTao == Long.MIN_VALUE) {
			keHoachKiemDemVeSinhImpl.setNgayTao(null);
		}
		else {
			keHoachKiemDemVeSinhImpl.setNgayTao(new Date(ngayTao));
		}

		keHoachKiemDemVeSinhImpl.setIdNguoiTao(idNguoiTao);

		if (ngayXuatBan == Long.MIN_VALUE) {
			keHoachKiemDemVeSinhImpl.setNgayXuatBan(null);
		}
		else {
			keHoachKiemDemVeSinhImpl.setNgayXuatBan(new Date(ngayXuatBan));
		}

		keHoachKiemDemVeSinhImpl.setIdNguoiXuatBan(idNguoiXuatBan);

		if (tableId == null) {
			keHoachKiemDemVeSinhImpl.setTableId(StringPool.BLANK);
		}
		else {
			keHoachKiemDemVeSinhImpl.setTableId(tableId);
		}

		if (ngayDong == Long.MIN_VALUE) {
			keHoachKiemDemVeSinhImpl.setNgayDong(null);
		}
		else {
			keHoachKiemDemVeSinhImpl.setNgayDong(new Date(ngayDong));
		}

		keHoachKiemDemVeSinhImpl.setIdNguoiDong(idNguoiDong);

		if (lastSavePoint == Long.MIN_VALUE) {
			keHoachKiemDemVeSinhImpl.setLastSavePoint(null);
		}
		else {
			keHoachKiemDemVeSinhImpl.setLastSavePoint(new Date(lastSavePoint));
		}

		keHoachKiemDemVeSinhImpl.resetOriginalValues();

		return keHoachKiemDemVeSinhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		nam = objectInput.readInt();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		kiemDemVienID = objectInput.readInt();
		ngayBatDau = objectInput.readLong();
		ngayKetThuc = objectInput.readLong();
		moTa = objectInput.readUTF();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readInt();
		ngayXuatBan = objectInput.readLong();
		idNguoiXuatBan = objectInput.readInt();
		tableId = objectInput.readUTF();
		ngayDong = objectInput.readLong();
		idNguoiDong = objectInput.readInt();
		lastSavePoint = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(nam);

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

		objectOutput.writeInt(kiemDemVienID);
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

		if (tableId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tableId);
		}

		objectOutput.writeLong(ngayDong);
		objectOutput.writeInt(idNguoiDong);
		objectOutput.writeLong(lastSavePoint);
	}

	public int id;
	public int nam;
	public String maTinh;
	public String maHuyen;
	public int kiemDemVienID;
	public long ngayBatDau;
	public long ngayKetThuc;
	public String moTa;
	public long ngayTao;
	public int idNguoiTao;
	public long ngayXuatBan;
	public int idNguoiXuatBan;
	public String tableId;
	public long ngayDong;
	public int idNguoiDong;
	public long lastSavePoint;
}