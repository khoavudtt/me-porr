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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VeSinhGiaDinh in entity cache.
 *
 * @author BinhTH
 * @see VeSinhGiaDinh
 * @generated
 */
public class VeSinhGiaDinhCacheModel implements CacheModel<VeSinhGiaDinh>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maTinh=");
		sb.append(maTinh);
		sb.append(", maHuyen=");
		sb.append(maHuyen);
		sb.append(", maXa=");
		sb.append(maXa);
		sb.append(", thonXom=");
		sb.append(thonXom);
		sb.append(", tenChuHo=");
		sb.append(tenChuHo);
		sb.append(", gioiTinhChuHo=");
		sb.append(gioiTinhChuHo);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", mauNgauNhien=");
		sb.append(mauNgauNhien);
		sb.append(", namBaoCao=");
		sb.append(namBaoCao);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", idNguoiTao=");
		sb.append(idNguoiTao);
		sb.append(", soNguoiTrongHo=");
		sb.append(soNguoiTrongHo);
		sb.append(", thanhPhanHoGD=");
		sb.append(thanhPhanHoGD);
		sb.append(", kinhDo=");
		sb.append(kinhDo);
		sb.append(", viDo=");
		sb.append(viDo);
		sb.append(", coNhaTieu=");
		sb.append(coNhaTieu);
		sb.append(", nhaTieuHVS=");
		sb.append(nhaTieuHVS);
		sb.append(", loaiNhaTieu=");
		sb.append(loaiNhaTieu);
		sb.append(", duocCaiTao=");
		sb.append(duocCaiTao);
		sb.append(", thangXayDung=");
		sb.append(thangXayDung);
		sb.append(", namXayDung=");
		sb.append(namXayDung);
		sb.append(", nguonVon=");
		sb.append(nguonVon);
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
	public VeSinhGiaDinh toEntityModel() {
		VeSinhGiaDinhImpl veSinhGiaDinhImpl = new VeSinhGiaDinhImpl();

		veSinhGiaDinhImpl.setId(id);

		if (maTinh == null) {
			veSinhGiaDinhImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			veSinhGiaDinhImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			veSinhGiaDinhImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			veSinhGiaDinhImpl.setMaHuyen(maHuyen);
		}

		if (maXa == null) {
			veSinhGiaDinhImpl.setMaXa(StringPool.BLANK);
		}
		else {
			veSinhGiaDinhImpl.setMaXa(maXa);
		}

		if (thonXom == null) {
			veSinhGiaDinhImpl.setThonXom(StringPool.BLANK);
		}
		else {
			veSinhGiaDinhImpl.setThonXom(thonXom);
		}

		if (tenChuHo == null) {
			veSinhGiaDinhImpl.setTenChuHo(StringPool.BLANK);
		}
		else {
			veSinhGiaDinhImpl.setTenChuHo(tenChuHo);
		}

		veSinhGiaDinhImpl.setGioiTinhChuHo(gioiTinhChuHo);
		veSinhGiaDinhImpl.setTrangThai(trangThai);
		veSinhGiaDinhImpl.setMauNgauNhien(mauNgauNhien);
		veSinhGiaDinhImpl.setNamBaoCao(namBaoCao);

		if (ghiChu == null) {
			veSinhGiaDinhImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			veSinhGiaDinhImpl.setGhiChu(ghiChu);
		}

		if (ngayTao == Long.MIN_VALUE) {
			veSinhGiaDinhImpl.setNgayTao(null);
		}
		else {
			veSinhGiaDinhImpl.setNgayTao(new Date(ngayTao));
		}

		veSinhGiaDinhImpl.setIdNguoiTao(idNguoiTao);
		veSinhGiaDinhImpl.setSoNguoiTrongHo(soNguoiTrongHo);
		veSinhGiaDinhImpl.setThanhPhanHoGD(thanhPhanHoGD);

		if (kinhDo == null) {
			veSinhGiaDinhImpl.setKinhDo(StringPool.BLANK);
		}
		else {
			veSinhGiaDinhImpl.setKinhDo(kinhDo);
		}

		if (viDo == null) {
			veSinhGiaDinhImpl.setViDo(StringPool.BLANK);
		}
		else {
			veSinhGiaDinhImpl.setViDo(viDo);
		}

		veSinhGiaDinhImpl.setCoNhaTieu(coNhaTieu);
		veSinhGiaDinhImpl.setNhaTieuHVS(nhaTieuHVS);

		if (loaiNhaTieu == null) {
			veSinhGiaDinhImpl.setLoaiNhaTieu(StringPool.BLANK);
		}
		else {
			veSinhGiaDinhImpl.setLoaiNhaTieu(loaiNhaTieu);
		}

		veSinhGiaDinhImpl.setDuocCaiTao(duocCaiTao);
		veSinhGiaDinhImpl.setThangXayDung(thangXayDung);
		veSinhGiaDinhImpl.setNamXayDung(namXayDung);
		veSinhGiaDinhImpl.setNguonVon(nguonVon);

		if (ngayKiemDem == Long.MIN_VALUE) {
			veSinhGiaDinhImpl.setNgayKiemDem(null);
		}
		else {
			veSinhGiaDinhImpl.setNgayKiemDem(new Date(ngayKiemDem));
		}

		if (ngayDanhGia == Long.MIN_VALUE) {
			veSinhGiaDinhImpl.setNgayDanhGia(null);
		}
		else {
			veSinhGiaDinhImpl.setNgayDanhGia(new Date(ngayDanhGia));
		}

		veSinhGiaDinhImpl.setIdNguoiDanhGia(idNguoiDanhGia);

		veSinhGiaDinhImpl.resetOriginalValues();

		return veSinhGiaDinhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		maXa = objectInput.readUTF();
		thonXom = objectInput.readUTF();
		tenChuHo = objectInput.readUTF();
		gioiTinhChuHo = objectInput.readInt();
		trangThai = objectInput.readInt();
		mauNgauNhien = objectInput.readInt();
		namBaoCao = objectInput.readInt();
		ghiChu = objectInput.readUTF();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readInt();
		soNguoiTrongHo = objectInput.readInt();
		thanhPhanHoGD = objectInput.readInt();
		kinhDo = objectInput.readUTF();
		viDo = objectInput.readUTF();
		coNhaTieu = objectInput.readInt();
		nhaTieuHVS = objectInput.readInt();
		loaiNhaTieu = objectInput.readUTF();
		duocCaiTao = objectInput.readInt();
		thangXayDung = objectInput.readInt();
		namXayDung = objectInput.readInt();
		nguonVon = objectInput.readInt();
		ngayKiemDem = objectInput.readLong();
		ngayDanhGia = objectInput.readLong();
		idNguoiDanhGia = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);

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

		if (thonXom == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thonXom);
		}

		if (tenChuHo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenChuHo);
		}

		objectOutput.writeInt(gioiTinhChuHo);
		objectOutput.writeInt(trangThai);
		objectOutput.writeInt(mauNgauNhien);
		objectOutput.writeInt(namBaoCao);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeLong(ngayTao);
		objectOutput.writeInt(idNguoiTao);
		objectOutput.writeInt(soNguoiTrongHo);
		objectOutput.writeInt(thanhPhanHoGD);

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

		objectOutput.writeInt(coNhaTieu);
		objectOutput.writeInt(nhaTieuHVS);

		if (loaiNhaTieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiNhaTieu);
		}

		objectOutput.writeInt(duocCaiTao);
		objectOutput.writeInt(thangXayDung);
		objectOutput.writeInt(namXayDung);
		objectOutput.writeInt(nguonVon);
		objectOutput.writeLong(ngayKiemDem);
		objectOutput.writeLong(ngayDanhGia);
		objectOutput.writeInt(idNguoiDanhGia);
	}

	public int id;
	public String maTinh;
	public String maHuyen;
	public String maXa;
	public String thonXom;
	public String tenChuHo;
	public int gioiTinhChuHo;
	public int trangThai;
	public int mauNgauNhien;
	public int namBaoCao;
	public String ghiChu;
	public long ngayTao;
	public int idNguoiTao;
	public int soNguoiTrongHo;
	public int thanhPhanHoGD;
	public String kinhDo;
	public String viDo;
	public int coNhaTieu;
	public int nhaTieuHVS;
	public String loaiNhaTieu;
	public int duocCaiTao;
	public int thangXayDung;
	public int namXayDung;
	public int nguonVon;
	public long ngayKiemDem;
	public long ngayDanhGia;
	public int idNguoiDanhGia;
}