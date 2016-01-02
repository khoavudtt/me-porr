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

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DanhGiaVanHanh in entity cache.
 *
 * @author khoa.vu
 * @see DanhGiaVanHanh
 * @generated
 */
public class DanhGiaVanHanhCacheModel implements CacheModel<DanhGiaVanHanh>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tramCapNuocId=");
		sb.append(tramCapNuocId);
		sb.append(", thang=");
		sb.append(thang);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", congXuatThucTe=");
		sb.append(congXuatThucTe);
		sb.append(", nuocThatThoat=");
		sb.append(nuocThatThoat);
		sb.append(", nuocDatTieuChuan=");
		sb.append(nuocDatTieuChuan);
		sb.append(", nuocCoAsen=");
		sb.append(nuocCoAsen);
		sb.append(", trangThaiCapNuoc=");
		sb.append(trangThaiCapNuoc);
		sb.append(", chiPhiHoaChat=");
		sb.append(chiPhiHoaChat);
		sb.append(", chiPhiDien=");
		sb.append(chiPhiDien);
		sb.append(", luongNhanVien=");
		sb.append(luongNhanVien);
		sb.append(", chiPhiSuaChua=");
		sb.append(chiPhiSuaChua);
		sb.append(", doanhThu=");
		sb.append(doanhThu);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", idNguoiTao=");
		sb.append(idNguoiTao);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", sanLuongSanXuat=");
		sb.append(sanLuongSanXuat);
		sb.append(", sanLuongTieuHao=");
		sb.append(sanLuongTieuHao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DanhGiaVanHanh toEntityModel() {
		DanhGiaVanHanhImpl danhGiaVanHanhImpl = new DanhGiaVanHanhImpl();

		danhGiaVanHanhImpl.setId(id);
		danhGiaVanHanhImpl.setTramCapNuocId(tramCapNuocId);
		danhGiaVanHanhImpl.setThang(thang);
		danhGiaVanHanhImpl.setNam(nam);
		danhGiaVanHanhImpl.setCongXuatThucTe(congXuatThucTe);
		danhGiaVanHanhImpl.setNuocThatThoat(nuocThatThoat);
		danhGiaVanHanhImpl.setNuocDatTieuChuan(nuocDatTieuChuan);
		danhGiaVanHanhImpl.setNuocCoAsen(nuocCoAsen);
		danhGiaVanHanhImpl.setTrangThaiCapNuoc(trangThaiCapNuoc);
		danhGiaVanHanhImpl.setChiPhiHoaChat(chiPhiHoaChat);
		danhGiaVanHanhImpl.setChiPhiDien(chiPhiDien);
		danhGiaVanHanhImpl.setLuongNhanVien(luongNhanVien);
		danhGiaVanHanhImpl.setChiPhiSuaChua(chiPhiSuaChua);
		danhGiaVanHanhImpl.setDoanhThu(doanhThu);

		if (ngayTao == Long.MIN_VALUE) {
			danhGiaVanHanhImpl.setNgayTao(null);
		}
		else {
			danhGiaVanHanhImpl.setNgayTao(new Date(ngayTao));
		}

		danhGiaVanHanhImpl.setIdNguoiTao(idNguoiTao);

		if (ghiChu == null) {
			danhGiaVanHanhImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			danhGiaVanHanhImpl.setGhiChu(ghiChu);
		}

		danhGiaVanHanhImpl.setSanLuongSanXuat(sanLuongSanXuat);
		danhGiaVanHanhImpl.setSanLuongTieuHao(sanLuongTieuHao);

		danhGiaVanHanhImpl.resetOriginalValues();

		return danhGiaVanHanhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		tramCapNuocId = objectInput.readInt();
		thang = objectInput.readInt();
		nam = objectInput.readInt();
		congXuatThucTe = objectInput.readInt();
		nuocThatThoat = objectInput.readInt();
		nuocDatTieuChuan = objectInput.readInt();
		nuocCoAsen = objectInput.readInt();
		trangThaiCapNuoc = objectInput.readInt();
		chiPhiHoaChat = objectInput.readInt();
		chiPhiDien = objectInput.readInt();
		luongNhanVien = objectInput.readInt();
		chiPhiSuaChua = objectInput.readInt();
		doanhThu = objectInput.readInt();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readInt();
		ghiChu = objectInput.readUTF();
		sanLuongSanXuat = objectInput.readInt();
		sanLuongTieuHao = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(tramCapNuocId);
		objectOutput.writeInt(thang);
		objectOutput.writeInt(nam);
		objectOutput.writeInt(congXuatThucTe);
		objectOutput.writeInt(nuocThatThoat);
		objectOutput.writeInt(nuocDatTieuChuan);
		objectOutput.writeInt(nuocCoAsen);
		objectOutput.writeInt(trangThaiCapNuoc);
		objectOutput.writeInt(chiPhiHoaChat);
		objectOutput.writeInt(chiPhiDien);
		objectOutput.writeInt(luongNhanVien);
		objectOutput.writeInt(chiPhiSuaChua);
		objectOutput.writeInt(doanhThu);
		objectOutput.writeLong(ngayTao);
		objectOutput.writeInt(idNguoiTao);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeInt(sanLuongSanXuat);
		objectOutput.writeInt(sanLuongTieuHao);
	}

	public long id;
	public int tramCapNuocId;
	public int thang;
	public int nam;
	public int congXuatThucTe;
	public int nuocThatThoat;
	public int nuocDatTieuChuan;
	public int nuocCoAsen;
	public int trangThaiCapNuoc;
	public int chiPhiHoaChat;
	public int chiPhiDien;
	public int luongNhanVien;
	public int chiPhiSuaChua;
	public int doanhThu;
	public long ngayTao;
	public int idNguoiTao;
	public String ghiChu;
	public int sanLuongSanXuat;
	public int sanLuongTieuHao;
}