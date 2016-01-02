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

package vn.dtt.cmon.kiemdemvien.dao.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing KiemDemVien in entity cache.
 *
 * @author HANT
 * @see KiemDemVien
 * @generated
 */
public class KiemDemVienCacheModel implements CacheModel<KiemDemVien>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(id);
		sb.append(", hoVaTen=");
		sb.append(hoVaTen);
		sb.append(", taiKhoan=");
		sb.append(taiKhoan);
		sb.append(", matKhau=");
		sb.append(matKhau);
		sb.append(", capHoatDong=");
		sb.append(capHoatDong);
		sb.append(", orgCode1=");
		sb.append(orgCode1);
		sb.append(", orgCode2=");
		sb.append(orgCode2);
		sb.append(", diaChi=");
		sb.append(diaChi);
		sb.append(", chungMinhThu=");
		sb.append(chungMinhThu);
		sb.append(", dienThoai=");
		sb.append(dienThoai);
		sb.append(", imei=");
		sb.append(imei);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", idNguoiTao=");
		sb.append(idNguoiTao);
		sb.append(", idQuanLy=");
		sb.append(idQuanLy);
		sb.append(", nameQuanLy=");
		sb.append(nameQuanLy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KiemDemVien toEntityModel() {
		KiemDemVienImpl kiemDemVienImpl = new KiemDemVienImpl();

		kiemDemVienImpl.setId(id);

		if (hoVaTen == null) {
			kiemDemVienImpl.setHoVaTen(StringPool.BLANK);
		}
		else {
			kiemDemVienImpl.setHoVaTen(hoVaTen);
		}

		if (taiKhoan == null) {
			kiemDemVienImpl.setTaiKhoan(StringPool.BLANK);
		}
		else {
			kiemDemVienImpl.setTaiKhoan(taiKhoan);
		}

		if (matKhau == null) {
			kiemDemVienImpl.setMatKhau(StringPool.BLANK);
		}
		else {
			kiemDemVienImpl.setMatKhau(matKhau);
		}

		kiemDemVienImpl.setCapHoatDong(capHoatDong);

		if (orgCode1 == null) {
			kiemDemVienImpl.setOrgCode1(StringPool.BLANK);
		}
		else {
			kiemDemVienImpl.setOrgCode1(orgCode1);
		}

		if (orgCode2 == null) {
			kiemDemVienImpl.setOrgCode2(StringPool.BLANK);
		}
		else {
			kiemDemVienImpl.setOrgCode2(orgCode2);
		}

		if (diaChi == null) {
			kiemDemVienImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			kiemDemVienImpl.setDiaChi(diaChi);
		}

		if (chungMinhThu == null) {
			kiemDemVienImpl.setChungMinhThu(StringPool.BLANK);
		}
		else {
			kiemDemVienImpl.setChungMinhThu(chungMinhThu);
		}

		if (dienThoai == null) {
			kiemDemVienImpl.setDienThoai(StringPool.BLANK);
		}
		else {
			kiemDemVienImpl.setDienThoai(dienThoai);
		}

		if (imei == null) {
			kiemDemVienImpl.setImei(StringPool.BLANK);
		}
		else {
			kiemDemVienImpl.setImei(imei);
		}

		kiemDemVienImpl.setTrangThai(trangThai);

		if (ngayTao == Long.MIN_VALUE) {
			kiemDemVienImpl.setNgayTao(null);
		}
		else {
			kiemDemVienImpl.setNgayTao(new Date(ngayTao));
		}

		kiemDemVienImpl.setIdNguoiTao(idNguoiTao);
		kiemDemVienImpl.setIdQuanLy(idQuanLy);

		if (nameQuanLy == null) {
			kiemDemVienImpl.setNameQuanLy(StringPool.BLANK);
		}
		else {
			kiemDemVienImpl.setNameQuanLy(nameQuanLy);
		}

		kiemDemVienImpl.resetOriginalValues();

		return kiemDemVienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoVaTen = objectInput.readUTF();
		taiKhoan = objectInput.readUTF();
		matKhau = objectInput.readUTF();
		capHoatDong = objectInput.readLong();
		orgCode1 = objectInput.readUTF();
		orgCode2 = objectInput.readUTF();
		diaChi = objectInput.readUTF();
		chungMinhThu = objectInput.readUTF();
		dienThoai = objectInput.readUTF();
		imei = objectInput.readUTF();
		trangThai = objectInput.readLong();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readLong();
		idQuanLy = objectInput.readLong();
		nameQuanLy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (hoVaTen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hoVaTen);
		}

		if (taiKhoan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(taiKhoan);
		}

		if (matKhau == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(matKhau);
		}

		objectOutput.writeLong(capHoatDong);

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

		if (diaChi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChi);
		}

		if (chungMinhThu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chungMinhThu);
		}

		if (dienThoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dienThoai);
		}

		if (imei == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imei);
		}

		objectOutput.writeLong(trangThai);
		objectOutput.writeLong(ngayTao);
		objectOutput.writeLong(idNguoiTao);
		objectOutput.writeLong(idQuanLy);

		if (nameQuanLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameQuanLy);
		}
	}

	public long id;
	public String hoVaTen;
	public String taiKhoan;
	public String matKhau;
	public long capHoatDong;
	public String orgCode1;
	public String orgCode2;
	public String diaChi;
	public String chungMinhThu;
	public String dienThoai;
	public String imei;
	public long trangThai;
	public long ngayTao;
	public long idNguoiTao;
	public long idQuanLy;
	public String nameQuanLy;
}