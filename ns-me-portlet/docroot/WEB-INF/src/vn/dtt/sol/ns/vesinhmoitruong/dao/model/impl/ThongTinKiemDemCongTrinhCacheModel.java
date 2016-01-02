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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ThongTinKiemDemCongTrinh in entity cache.
 *
 * @author BinhTH
 * @see ThongTinKiemDemCongTrinh
 * @generated
 */
public class ThongTinKiemDemCongTrinhCacheModel implements CacheModel<ThongTinKiemDemCongTrinh>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(61);

		sb.append("{id=");
		sb.append(id);
		sb.append(", veSinhConTrinhId=");
		sb.append(veSinhConTrinhId);
		sb.append(", keHoachKiemDemVeSinhId=");
		sb.append(keHoachKiemDemVeSinhId);
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
		sb.append(", ngayKiemDem=");
		sb.append(ngayKiemDem);
		sb.append(", hoTenNguoiTraLoi=");
		sb.append(hoTenNguoiTraLoi);
		sb.append(", soDienThoai=");
		sb.append(soDienThoai);
		sb.append(", gioiTinhNguoiTraLoi=");
		sb.append(gioiTinhNguoiTraLoi);
		sb.append(", vaiTroChucDanh=");
		sb.append(vaiTroChucDanh);
		sb.append(", soCa=");
		sb.append(soCa);
		sb.append(", soNguoiTrongCa=");
		sb.append(soNguoiTrongCa);
		sb.append(", kinhDo=");
		sb.append(kinhDo);
		sb.append(", viDo=");
		sb.append(viDo);
		sb.append(", loaiNguonNuoc=");
		sb.append(loaiNguonNuoc);
		sb.append(", daTQCVN=");
		sb.append(daTQCVN);
		sb.append(", datTieuChuanHVS=");
		sb.append(datTieuChuanHVS);
		sb.append(", anhChupChungNhan=");
		sb.append(anhChupChungNhan);
		sb.append(", soNhaTieu=");
		sb.append(soNhaTieu);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", daKetThucDieuTra=");
		sb.append(daKetThucDieuTra);
		sb.append(", lyDoKhongHoanThanh=");
		sb.append(lyDoKhongHoanThanh);
		sb.append(", imei=");
		sb.append(imei);
		sb.append(", taiKhoan=");
		sb.append(taiKhoan);
		sb.append(", danhGiaKiemDem=");
		sb.append(danhGiaKiemDem);
		sb.append(", savePoint=");
		sb.append(savePoint);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ThongTinKiemDemCongTrinh toEntityModel() {
		ThongTinKiemDemCongTrinhImpl thongTinKiemDemCongTrinhImpl = new ThongTinKiemDemCongTrinhImpl();

		thongTinKiemDemCongTrinhImpl.setId(id);
		thongTinKiemDemCongTrinhImpl.setVeSinhConTrinhId(veSinhConTrinhId);
		thongTinKiemDemCongTrinhImpl.setKeHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);

		if (tenCongTrinh == null) {
			thongTinKiemDemCongTrinhImpl.setTenCongTrinh(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setTenCongTrinh(tenCongTrinh);
		}

		thongTinKiemDemCongTrinhImpl.setLoaiCongTrinh(loaiCongTrinh);

		if (maTinh == null) {
			thongTinKiemDemCongTrinhImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			thongTinKiemDemCongTrinhImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setMaHuyen(maHuyen);
		}

		if (maXa == null) {
			thongTinKiemDemCongTrinhImpl.setMaXa(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setMaXa(maXa);
		}

		if (diaChi == null) {
			thongTinKiemDemCongTrinhImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setDiaChi(diaChi);
		}

		if (ngayKiemDem == Long.MIN_VALUE) {
			thongTinKiemDemCongTrinhImpl.setNgayKiemDem(null);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setNgayKiemDem(new Date(ngayKiemDem));
		}

		if (hoTenNguoiTraLoi == null) {
			thongTinKiemDemCongTrinhImpl.setHoTenNguoiTraLoi(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setHoTenNguoiTraLoi(hoTenNguoiTraLoi);
		}

		if (soDienThoai == null) {
			thongTinKiemDemCongTrinhImpl.setSoDienThoai(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setSoDienThoai(soDienThoai);
		}

		if (gioiTinhNguoiTraLoi == null) {
			thongTinKiemDemCongTrinhImpl.setGioiTinhNguoiTraLoi(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setGioiTinhNguoiTraLoi(gioiTinhNguoiTraLoi);
		}

		if (vaiTroChucDanh == null) {
			thongTinKiemDemCongTrinhImpl.setVaiTroChucDanh(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setVaiTroChucDanh(vaiTroChucDanh);
		}

		thongTinKiemDemCongTrinhImpl.setSoCa(soCa);
		thongTinKiemDemCongTrinhImpl.setSoNguoiTrongCa(soNguoiTrongCa);

		if (kinhDo == null) {
			thongTinKiemDemCongTrinhImpl.setKinhDo(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setKinhDo(kinhDo);
		}

		if (viDo == null) {
			thongTinKiemDemCongTrinhImpl.setViDo(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setViDo(viDo);
		}

		if (loaiNguonNuoc == null) {
			thongTinKiemDemCongTrinhImpl.setLoaiNguonNuoc(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setLoaiNguonNuoc(loaiNguonNuoc);
		}

		thongTinKiemDemCongTrinhImpl.setDaTQCVN(daTQCVN);
		thongTinKiemDemCongTrinhImpl.setDatTieuChuanHVS(datTieuChuanHVS);

		if (anhChupChungNhan == null) {
			thongTinKiemDemCongTrinhImpl.setAnhChupChungNhan(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setAnhChupChungNhan(anhChupChungNhan);
		}

		thongTinKiemDemCongTrinhImpl.setSoNhaTieu(soNhaTieu);

		if (ghiChu == null) {
			thongTinKiemDemCongTrinhImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setGhiChu(ghiChu);
		}

		thongTinKiemDemCongTrinhImpl.setDaKetThucDieuTra(daKetThucDieuTra);

		if (lyDoKhongHoanThanh == null) {
			thongTinKiemDemCongTrinhImpl.setLyDoKhongHoanThanh(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setLyDoKhongHoanThanh(lyDoKhongHoanThanh);
		}

		if (imei == null) {
			thongTinKiemDemCongTrinhImpl.setImei(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setImei(imei);
		}

		if (taiKhoan == null) {
			thongTinKiemDemCongTrinhImpl.setTaiKhoan(StringPool.BLANK);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setTaiKhoan(taiKhoan);
		}

		thongTinKiemDemCongTrinhImpl.setDanhGiaKiemDem(danhGiaKiemDem);

		if (savePoint == Long.MIN_VALUE) {
			thongTinKiemDemCongTrinhImpl.setSavePoint(null);
		}
		else {
			thongTinKiemDemCongTrinhImpl.setSavePoint(new Date(savePoint));
		}

		thongTinKiemDemCongTrinhImpl.resetOriginalValues();

		return thongTinKiemDemCongTrinhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		veSinhConTrinhId = objectInput.readInt();
		keHoachKiemDemVeSinhId = objectInput.readInt();
		tenCongTrinh = objectInput.readUTF();
		loaiCongTrinh = objectInput.readInt();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		maXa = objectInput.readUTF();
		diaChi = objectInput.readUTF();
		ngayKiemDem = objectInput.readLong();
		hoTenNguoiTraLoi = objectInput.readUTF();
		soDienThoai = objectInput.readUTF();
		gioiTinhNguoiTraLoi = objectInput.readUTF();
		vaiTroChucDanh = objectInput.readUTF();
		soCa = objectInput.readInt();
		soNguoiTrongCa = objectInput.readInt();
		kinhDo = objectInput.readUTF();
		viDo = objectInput.readUTF();
		loaiNguonNuoc = objectInput.readUTF();
		daTQCVN = objectInput.readInt();
		datTieuChuanHVS = objectInput.readInt();
		anhChupChungNhan = objectInput.readUTF();
		soNhaTieu = objectInput.readInt();
		ghiChu = objectInput.readUTF();
		daKetThucDieuTra = objectInput.readInt();
		lyDoKhongHoanThanh = objectInput.readUTF();
		imei = objectInput.readUTF();
		taiKhoan = objectInput.readUTF();
		danhGiaKiemDem = objectInput.readInt();
		savePoint = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(veSinhConTrinhId);
		objectOutput.writeInt(keHoachKiemDemVeSinhId);

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

		objectOutput.writeLong(ngayKiemDem);

		if (hoTenNguoiTraLoi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hoTenNguoiTraLoi);
		}

		if (soDienThoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soDienThoai);
		}

		if (gioiTinhNguoiTraLoi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gioiTinhNguoiTraLoi);
		}

		if (vaiTroChucDanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vaiTroChucDanh);
		}

		objectOutput.writeInt(soCa);
		objectOutput.writeInt(soNguoiTrongCa);

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

		objectOutput.writeInt(daTQCVN);
		objectOutput.writeInt(datTieuChuanHVS);

		if (anhChupChungNhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(anhChupChungNhan);
		}

		objectOutput.writeInt(soNhaTieu);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeInt(daKetThucDieuTra);

		if (lyDoKhongHoanThanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoKhongHoanThanh);
		}

		if (imei == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imei);
		}

		if (taiKhoan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(taiKhoan);
		}

		objectOutput.writeInt(danhGiaKiemDem);
		objectOutput.writeLong(savePoint);
	}

	public int id;
	public int veSinhConTrinhId;
	public int keHoachKiemDemVeSinhId;
	public String tenCongTrinh;
	public int loaiCongTrinh;
	public String maTinh;
	public String maHuyen;
	public String maXa;
	public String diaChi;
	public long ngayKiemDem;
	public String hoTenNguoiTraLoi;
	public String soDienThoai;
	public String gioiTinhNguoiTraLoi;
	public String vaiTroChucDanh;
	public int soCa;
	public int soNguoiTrongCa;
	public String kinhDo;
	public String viDo;
	public String loaiNguonNuoc;
	public int daTQCVN;
	public int datTieuChuanHVS;
	public String anhChupChungNhan;
	public int soNhaTieu;
	public String ghiChu;
	public int daKetThucDieuTra;
	public String lyDoKhongHoanThanh;
	public String imei;
	public String taiKhoan;
	public int danhGiaKiemDem;
	public long savePoint;
}