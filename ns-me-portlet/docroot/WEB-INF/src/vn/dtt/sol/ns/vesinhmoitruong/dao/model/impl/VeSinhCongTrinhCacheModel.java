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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VeSinhCongTrinh in entity cache.
 *
 * @author BinhTH
 * @see VeSinhCongTrinh
 * @generated
 */
public class VeSinhCongTrinhCacheModel implements CacheModel<VeSinhCongTrinh>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tenCongTrinh=");
		sb.append(tenCongTrinh);
		sb.append(", loaiCongTrinh=");
		sb.append(loaiCongTrinh);
		sb.append(", maTinh=");
		sb.append(maTinh);
		sb.append(", maHuyen=");
		sb.append(maHuyen);
		sb.append(", maXa=");
		sb.append(maXa);
		sb.append(", diaChi=");
		sb.append(diaChi);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", namBaoCao=");
		sb.append(namBaoCao);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", idNguoiTao=");
		sb.append(idNguoiTao);
		sb.append(", kinhDo=");
		sb.append(kinhDo);
		sb.append(", viDo=");
		sb.append(viDo);
		sb.append(", loaiNguonNuoc=");
		sb.append(loaiNguonNuoc);
		sb.append(", nguonNuocHVS=");
		sb.append(nguonNuocHVS);
		sb.append(", loaiNhaTieu=");
		sb.append(loaiNhaTieu);
		sb.append(", nhaTieuHVS=");
		sb.append(nhaTieuHVS);
		sb.append(", ketLuanHVS=");
		sb.append(ketLuanHVS);
		sb.append(", ngayKiemDem=");
		sb.append(ngayKiemDem);
		sb.append(", ngayDanhGia=");
		sb.append(ngayDanhGia);
		sb.append(", idNguoiDanhGia=");
		sb.append(idNguoiDanhGia);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VeSinhCongTrinh toEntityModel() {
		VeSinhCongTrinhImpl veSinhCongTrinhImpl = new VeSinhCongTrinhImpl();

		veSinhCongTrinhImpl.setId(id);

		if (tenCongTrinh == null) {
			veSinhCongTrinhImpl.setTenCongTrinh(StringPool.BLANK);
		}
		else {
			veSinhCongTrinhImpl.setTenCongTrinh(tenCongTrinh);
		}

		veSinhCongTrinhImpl.setLoaiCongTrinh(loaiCongTrinh);

		if (maTinh == null) {
			veSinhCongTrinhImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			veSinhCongTrinhImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			veSinhCongTrinhImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			veSinhCongTrinhImpl.setMaHuyen(maHuyen);
		}

		if (maXa == null) {
			veSinhCongTrinhImpl.setMaXa(StringPool.BLANK);
		}
		else {
			veSinhCongTrinhImpl.setMaXa(maXa);
		}

		if (diaChi == null) {
			veSinhCongTrinhImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			veSinhCongTrinhImpl.setDiaChi(diaChi);
		}

		veSinhCongTrinhImpl.setTrangThai(trangThai);
		veSinhCongTrinhImpl.setNamBaoCao(namBaoCao);

		if (ghiChu == null) {
			veSinhCongTrinhImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			veSinhCongTrinhImpl.setGhiChu(ghiChu);
		}

		if (ngayTao == Long.MIN_VALUE) {
			veSinhCongTrinhImpl.setNgayTao(null);
		}
		else {
			veSinhCongTrinhImpl.setNgayTao(new Date(ngayTao));
		}

		if (idNguoiTao == null) {
			veSinhCongTrinhImpl.setIdNguoiTao(StringPool.BLANK);
		}
		else {
			veSinhCongTrinhImpl.setIdNguoiTao(idNguoiTao);
		}

		if (kinhDo == null) {
			veSinhCongTrinhImpl.setKinhDo(StringPool.BLANK);
		}
		else {
			veSinhCongTrinhImpl.setKinhDo(kinhDo);
		}

		if (viDo == null) {
			veSinhCongTrinhImpl.setViDo(StringPool.BLANK);
		}
		else {
			veSinhCongTrinhImpl.setViDo(viDo);
		}

		if (loaiNguonNuoc == null) {
			veSinhCongTrinhImpl.setLoaiNguonNuoc(StringPool.BLANK);
		}
		else {
			veSinhCongTrinhImpl.setLoaiNguonNuoc(loaiNguonNuoc);
		}

		veSinhCongTrinhImpl.setNguonNuocHVS(nguonNuocHVS);

		if (loaiNhaTieu == null) {
			veSinhCongTrinhImpl.setLoaiNhaTieu(StringPool.BLANK);
		}
		else {
			veSinhCongTrinhImpl.setLoaiNhaTieu(loaiNhaTieu);
		}

		veSinhCongTrinhImpl.setNhaTieuHVS(nhaTieuHVS);
		veSinhCongTrinhImpl.setKetLuanHVS(ketLuanHVS);

		if (ngayKiemDem == Long.MIN_VALUE) {
			veSinhCongTrinhImpl.setNgayKiemDem(null);
		}
		else {
			veSinhCongTrinhImpl.setNgayKiemDem(new Date(ngayKiemDem));
		}

		if (ngayDanhGia == Long.MIN_VALUE) {
			veSinhCongTrinhImpl.setNgayDanhGia(null);
		}
		else {
			veSinhCongTrinhImpl.setNgayDanhGia(new Date(ngayDanhGia));
		}

		veSinhCongTrinhImpl.setIdNguoiDanhGia(idNguoiDanhGia);

		veSinhCongTrinhImpl.resetOriginalValues();

		return veSinhCongTrinhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		tenCongTrinh = objectInput.readUTF();
		loaiCongTrinh = objectInput.readInt();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		maXa = objectInput.readUTF();
		diaChi = objectInput.readUTF();
		trangThai = objectInput.readInt();
		namBaoCao = objectInput.readInt();
		ghiChu = objectInput.readUTF();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readUTF();
		kinhDo = objectInput.readUTF();
		viDo = objectInput.readUTF();
		loaiNguonNuoc = objectInput.readUTF();
		nguonNuocHVS = objectInput.readInt();
		loaiNhaTieu = objectInput.readUTF();
		nhaTieuHVS = objectInput.readInt();
		ketLuanHVS = objectInput.readInt();
		ngayKiemDem = objectInput.readLong();
		ngayDanhGia = objectInput.readLong();
		idNguoiDanhGia = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);

		if (tenCongTrinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenCongTrinh);
		}

		objectOutput.writeInt(loaiCongTrinh);

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

		if (diaChi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChi);
		}

		objectOutput.writeInt(trangThai);
		objectOutput.writeInt(namBaoCao);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeLong(ngayTao);

		if (idNguoiTao == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(idNguoiTao);
		}

		if (kinhDo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kinhDo);
		}

		if (viDo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(viDo);
		}

		if (loaiNguonNuoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiNguonNuoc);
		}

		objectOutput.writeInt(nguonNuocHVS);

		if (loaiNhaTieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiNhaTieu);
		}

		objectOutput.writeInt(nhaTieuHVS);
		objectOutput.writeInt(ketLuanHVS);
		objectOutput.writeLong(ngayKiemDem);
		objectOutput.writeLong(ngayDanhGia);
		objectOutput.writeInt(idNguoiDanhGia);
	}

	public int id;
	public String tenCongTrinh;
	public int loaiCongTrinh;
	public String maTinh;
	public String maHuyen;
	public String maXa;
	public String diaChi;
	public int trangThai;
	public int namBaoCao;
	public String ghiChu;
	public long ngayTao;
	public String idNguoiTao;
	public String kinhDo;
	public String viDo;
	public String loaiNguonNuoc;
	public int nguonNuocHVS;
	public String loaiNhaTieu;
	public int nhaTieuHVS;
	public int ketLuanHVS;
	public long ngayKiemDem;
	public long ngayDanhGia;
	public int idNguoiDanhGia;
}