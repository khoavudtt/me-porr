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

import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TramCapNuoc in entity cache.
 *
 * @author khoa.vu
 * @see TramCapNuoc
 * @generated
 */
public class TramCapNuocCacheModel implements CacheModel<TramCapNuoc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(79);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maTram=");
		sb.append(maTram);
		sb.append(", tenTram=");
		sb.append(tenTram);
		sb.append(", maTinh=");
		sb.append(maTinh);
		sb.append(", tenTinh=");
		sb.append(tenTinh);
		sb.append(", maHuyen=");
		sb.append(maHuyen);
		sb.append(", tenHuyen=");
		sb.append(tenHuyen);
		sb.append(", maXa=");
		sb.append(maXa);
		sb.append(", tenXa=");
		sb.append(tenXa);
		sb.append(", diaChi=");
		sb.append(diaChi);
		sb.append(", kinhDo=");
		sb.append(kinhDo);
		sb.append(", viDo=");
		sb.append(viDo);
		sb.append(", loaiHinh=");
		sb.append(loaiHinh);
		sb.append(", maMoHinh=");
		sb.append(maMoHinh);
		sb.append(", tenMoHinh=");
		sb.append(tenMoHinh);
		sb.append(", congXuatThietKe=");
		sb.append(congXuatThietKe);
		sb.append(", tongDauNoiThietKe=");
		sb.append(tongDauNoiThietKe);
		sb.append(", soNguoiCapThietKe=");
		sb.append(soNguoiCapThietKe);
		sb.append(", tinhTrangDuAn=");
		sb.append(tinhTrangDuAn);
		sb.append(", tienDoXayDung=");
		sb.append(tienDoXayDung);
		sb.append(", namXayDung=");
		sb.append(namXayDung);
		sb.append(", namHoanThanh=");
		sb.append(namHoanThanh);
		sb.append(", ngayVanHanh=");
		sb.append(ngayVanHanh);
		sb.append(", boMayVanHanh=");
		sb.append(boMayVanHanh);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", idNguoiTao=");
		sb.append(idNguoiTao);
		sb.append(", idNguoiDanhGia=");
		sb.append(idNguoiDanhGia);
		sb.append(", ngayDanhGia=");
		sb.append(ngayDanhGia);
		sb.append(", trangThaiCapNuoc=");
		sb.append(trangThaiCapNuoc);
		sb.append(", congXuatThucTe=");
		sb.append(congXuatThucTe);
		sb.append(", tongDauNoiThucTe=");
		sb.append(tongDauNoiThucTe);
		sb.append(", soNguoiCapThucTe=");
		sb.append(soNguoiCapThucTe);
		sb.append(", tongChiPhi=");
		sb.append(tongChiPhi);
		sb.append(", tongDoanhThu=");
		sb.append(tongDoanhThu);
		sb.append(", nuocDatTieuChuan=");
		sb.append(nuocDatTieuChuan);
		sb.append(", nuocCoAsen=");
		sb.append(nuocCoAsen);
		sb.append(", nuocThatThoat=");
		sb.append(nuocThatThoat);
		sb.append(", trangThaiDanhGia=");
		sb.append(trangThaiDanhGia);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TramCapNuoc toEntityModel() {
		TramCapNuocImpl tramCapNuocImpl = new TramCapNuocImpl();

		tramCapNuocImpl.setId(id);

		if (maTram == null) {
			tramCapNuocImpl.setMaTram(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setMaTram(maTram);
		}

		if (tenTram == null) {
			tramCapNuocImpl.setTenTram(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setTenTram(tenTram);
		}

		if (maTinh == null) {
			tramCapNuocImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setMaTinh(maTinh);
		}

		if (tenTinh == null) {
			tramCapNuocImpl.setTenTinh(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setTenTinh(tenTinh);
		}

		if (maHuyen == null) {
			tramCapNuocImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setMaHuyen(maHuyen);
		}

		if (tenHuyen == null) {
			tramCapNuocImpl.setTenHuyen(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setTenHuyen(tenHuyen);
		}

		if (maXa == null) {
			tramCapNuocImpl.setMaXa(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setMaXa(maXa);
		}

		if (tenXa == null) {
			tramCapNuocImpl.setTenXa(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setTenXa(tenXa);
		}

		if (diaChi == null) {
			tramCapNuocImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setDiaChi(diaChi);
		}

		if (kinhDo == null) {
			tramCapNuocImpl.setKinhDo(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setKinhDo(kinhDo);
		}

		if (viDo == null) {
			tramCapNuocImpl.setViDo(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setViDo(viDo);
		}

		tramCapNuocImpl.setLoaiHinh(loaiHinh);

		if (maMoHinh == null) {
			tramCapNuocImpl.setMaMoHinh(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setMaMoHinh(maMoHinh);
		}

		if (tenMoHinh == null) {
			tramCapNuocImpl.setTenMoHinh(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setTenMoHinh(tenMoHinh);
		}

		tramCapNuocImpl.setCongXuatThietKe(congXuatThietKe);
		tramCapNuocImpl.setTongDauNoiThietKe(tongDauNoiThietKe);
		tramCapNuocImpl.setSoNguoiCapThietKe(soNguoiCapThietKe);
		tramCapNuocImpl.setTinhTrangDuAn(tinhTrangDuAn);
		tramCapNuocImpl.setTienDoXayDung(tienDoXayDung);
		tramCapNuocImpl.setNamXayDung(namXayDung);
		tramCapNuocImpl.setNamHoanThanh(namHoanThanh);

		if (ngayVanHanh == Long.MIN_VALUE) {
			tramCapNuocImpl.setNgayVanHanh(null);
		}
		else {
			tramCapNuocImpl.setNgayVanHanh(new Date(ngayVanHanh));
		}

		tramCapNuocImpl.setBoMayVanHanh(boMayVanHanh);

		if (ghiChu == null) {
			tramCapNuocImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			tramCapNuocImpl.setGhiChu(ghiChu);
		}

		if (ngayTao == Long.MIN_VALUE) {
			tramCapNuocImpl.setNgayTao(null);
		}
		else {
			tramCapNuocImpl.setNgayTao(new Date(ngayTao));
		}

		tramCapNuocImpl.setIdNguoiTao(idNguoiTao);
		tramCapNuocImpl.setIdNguoiDanhGia(idNguoiDanhGia);

		if (ngayDanhGia == Long.MIN_VALUE) {
			tramCapNuocImpl.setNgayDanhGia(null);
		}
		else {
			tramCapNuocImpl.setNgayDanhGia(new Date(ngayDanhGia));
		}

		tramCapNuocImpl.setTrangThaiCapNuoc(trangThaiCapNuoc);
		tramCapNuocImpl.setCongXuatThucTe(congXuatThucTe);
		tramCapNuocImpl.setTongDauNoiThucTe(tongDauNoiThucTe);
		tramCapNuocImpl.setSoNguoiCapThucTe(soNguoiCapThucTe);
		tramCapNuocImpl.setTongChiPhi(tongChiPhi);
		tramCapNuocImpl.setTongDoanhThu(tongDoanhThu);
		tramCapNuocImpl.setNuocDatTieuChuan(nuocDatTieuChuan);
		tramCapNuocImpl.setNuocCoAsen(nuocCoAsen);
		tramCapNuocImpl.setNuocThatThoat(nuocThatThoat);
		tramCapNuocImpl.setTrangThaiDanhGia(trangThaiDanhGia);

		tramCapNuocImpl.resetOriginalValues();

		return tramCapNuocImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maTram = objectInput.readUTF();
		tenTram = objectInput.readUTF();
		maTinh = objectInput.readUTF();
		tenTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		tenHuyen = objectInput.readUTF();
		maXa = objectInput.readUTF();
		tenXa = objectInput.readUTF();
		diaChi = objectInput.readUTF();
		kinhDo = objectInput.readUTF();
		viDo = objectInput.readUTF();
		loaiHinh = objectInput.readInt();
		maMoHinh = objectInput.readUTF();
		tenMoHinh = objectInput.readUTF();
		congXuatThietKe = objectInput.readInt();
		tongDauNoiThietKe = objectInput.readInt();
		soNguoiCapThietKe = objectInput.readInt();
		tinhTrangDuAn = objectInput.readInt();
		tienDoXayDung = objectInput.readInt();
		namXayDung = objectInput.readInt();
		namHoanThanh = objectInput.readInt();
		ngayVanHanh = objectInput.readLong();
		boMayVanHanh = objectInput.readInt();
		ghiChu = objectInput.readUTF();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readLong();
		idNguoiDanhGia = objectInput.readLong();
		ngayDanhGia = objectInput.readLong();
		trangThaiCapNuoc = objectInput.readInt();
		congXuatThucTe = objectInput.readInt();
		tongDauNoiThucTe = objectInput.readInt();
		soNguoiCapThucTe = objectInput.readInt();
		tongChiPhi = objectInput.readInt();
		tongDoanhThu = objectInput.readInt();
		nuocDatTieuChuan = objectInput.readInt();
		nuocCoAsen = objectInput.readInt();
		nuocThatThoat = objectInput.readInt();
		trangThaiDanhGia = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maTram == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTram);
		}

		if (tenTram == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenTram);
		}

		if (maTinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTinh);
		}

		if (tenTinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenTinh);
		}

		if (maHuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maHuyen);
		}

		if (tenHuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenHuyen);
		}

		if (maXa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maXa);
		}

		if (tenXa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenXa);
		}

		if (diaChi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChi);
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

		objectOutput.writeInt(loaiHinh);

		if (maMoHinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maMoHinh);
		}

		if (tenMoHinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenMoHinh);
		}

		objectOutput.writeInt(congXuatThietKe);
		objectOutput.writeInt(tongDauNoiThietKe);
		objectOutput.writeInt(soNguoiCapThietKe);
		objectOutput.writeInt(tinhTrangDuAn);
		objectOutput.writeInt(tienDoXayDung);
		objectOutput.writeInt(namXayDung);
		objectOutput.writeInt(namHoanThanh);
		objectOutput.writeLong(ngayVanHanh);
		objectOutput.writeInt(boMayVanHanh);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeLong(ngayTao);
		objectOutput.writeLong(idNguoiTao);
		objectOutput.writeLong(idNguoiDanhGia);
		objectOutput.writeLong(ngayDanhGia);
		objectOutput.writeInt(trangThaiCapNuoc);
		objectOutput.writeInt(congXuatThucTe);
		objectOutput.writeInt(tongDauNoiThucTe);
		objectOutput.writeInt(soNguoiCapThucTe);
		objectOutput.writeInt(tongChiPhi);
		objectOutput.writeInt(tongDoanhThu);
		objectOutput.writeInt(nuocDatTieuChuan);
		objectOutput.writeInt(nuocCoAsen);
		objectOutput.writeInt(nuocThatThoat);
		objectOutput.writeInt(trangThaiDanhGia);
	}

	public long id;
	public String maTram;
	public String tenTram;
	public String maTinh;
	public String tenTinh;
	public String maHuyen;
	public String tenHuyen;
	public String maXa;
	public String tenXa;
	public String diaChi;
	public String kinhDo;
	public String viDo;
	public int loaiHinh;
	public String maMoHinh;
	public String tenMoHinh;
	public int congXuatThietKe;
	public int tongDauNoiThietKe;
	public int soNguoiCapThietKe;
	public int tinhTrangDuAn;
	public int tienDoXayDung;
	public int namXayDung;
	public int namHoanThanh;
	public long ngayVanHanh;
	public int boMayVanHanh;
	public String ghiChu;
	public long ngayTao;
	public long idNguoiTao;
	public long idNguoiDanhGia;
	public long ngayDanhGia;
	public int trangThaiCapNuoc;
	public int congXuatThucTe;
	public int tongDauNoiThucTe;
	public int soNguoiCapThucTe;
	public int tongChiPhi;
	public int tongDoanhThu;
	public int nuocDatTieuChuan;
	public int nuocCoAsen;
	public int nuocThatThoat;
	public int trangThaiDanhGia;
}