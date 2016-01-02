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

import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DauNoiNuoc in entity cache.
 *
 * @author khoa.vu
 * @see DauNoiNuoc
 * @generated
 */
public class DauNoiNuocCacheModel implements CacheModel<DauNoiNuoc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tramCapNuocId=");
		sb.append(tramCapNuocId);
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
		sb.append(", gioiTinh=");
		sb.append(gioiTinh);
		sb.append(", ngayDauNoiHopDong=");
		sb.append(ngayDauNoiHopDong);
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
		sb.append(", soNguoiTrongHo=");
		sb.append(soNguoiTrongHo);
		sb.append(", thanhPhanHoGiaDinh=");
		sb.append(thanhPhanHoGiaDinh);
		sb.append(", tongDoanhThu=");
		sb.append(tongDoanhThu);
		sb.append(", kinhDo=");
		sb.append(kinhDo);
		sb.append(", viDo=");
		sb.append(viDo);
		sb.append(", ngayDauNoiThucTe=");
		sb.append(ngayDauNoiThucTe);
		sb.append(", soSeryDongHo=");
		sb.append(soSeryDongHo);
		sb.append(", danhGiaNuocHVS=");
		sb.append(danhGiaNuocHVS);
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
	public DauNoiNuoc toEntityModel() {
		DauNoiNuocImpl dauNoiNuocImpl = new DauNoiNuocImpl();

		dauNoiNuocImpl.setId(id);
		dauNoiNuocImpl.setTramCapNuocId(tramCapNuocId);

		if (maTinh == null) {
			dauNoiNuocImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			dauNoiNuocImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			dauNoiNuocImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			dauNoiNuocImpl.setMaHuyen(maHuyen);
		}

		if (maXa == null) {
			dauNoiNuocImpl.setMaXa(StringPool.BLANK);
		}
		else {
			dauNoiNuocImpl.setMaXa(maXa);
		}

		if (thonXom == null) {
			dauNoiNuocImpl.setThonXom(StringPool.BLANK);
		}
		else {
			dauNoiNuocImpl.setThonXom(thonXom);
		}

		if (tenChuHo == null) {
			dauNoiNuocImpl.setTenChuHo(StringPool.BLANK);
		}
		else {
			dauNoiNuocImpl.setTenChuHo(tenChuHo);
		}

		dauNoiNuocImpl.setGioiTinh(gioiTinh);

		if (ngayDauNoiHopDong == Long.MIN_VALUE) {
			dauNoiNuocImpl.setNgayDauNoiHopDong(null);
		}
		else {
			dauNoiNuocImpl.setNgayDauNoiHopDong(new Date(ngayDauNoiHopDong));
		}

		dauNoiNuocImpl.setTrangThai(trangThai);
		dauNoiNuocImpl.setNamBaoCao(namBaoCao);

		if (ghiChu == null) {
			dauNoiNuocImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			dauNoiNuocImpl.setGhiChu(ghiChu);
		}

		if (ngayTao == Long.MIN_VALUE) {
			dauNoiNuocImpl.setNgayTao(null);
		}
		else {
			dauNoiNuocImpl.setNgayTao(new Date(ngayTao));
		}

		dauNoiNuocImpl.setIdNguoiTao(idNguoiTao);
		dauNoiNuocImpl.setSoNguoiTrongHo(soNguoiTrongHo);
		dauNoiNuocImpl.setThanhPhanHoGiaDinh(thanhPhanHoGiaDinh);
		dauNoiNuocImpl.setTongDoanhThu(tongDoanhThu);

		if (kinhDo == null) {
			dauNoiNuocImpl.setKinhDo(StringPool.BLANK);
		}
		else {
			dauNoiNuocImpl.setKinhDo(kinhDo);
		}

		if (viDo == null) {
			dauNoiNuocImpl.setViDo(StringPool.BLANK);
		}
		else {
			dauNoiNuocImpl.setViDo(viDo);
		}

		if (ngayDauNoiThucTe == Long.MIN_VALUE) {
			dauNoiNuocImpl.setNgayDauNoiThucTe(null);
		}
		else {
			dauNoiNuocImpl.setNgayDauNoiThucTe(new Date(ngayDauNoiThucTe));
		}

		if (soSeryDongHo == null) {
			dauNoiNuocImpl.setSoSeryDongHo(StringPool.BLANK);
		}
		else {
			dauNoiNuocImpl.setSoSeryDongHo(soSeryDongHo);
		}

		if (danhGiaNuocHVS == null) {
			dauNoiNuocImpl.setDanhGiaNuocHVS(StringPool.BLANK);
		}
		else {
			dauNoiNuocImpl.setDanhGiaNuocHVS(danhGiaNuocHVS);
		}

		if (ngayKiemDem == Long.MIN_VALUE) {
			dauNoiNuocImpl.setNgayKiemDem(null);
		}
		else {
			dauNoiNuocImpl.setNgayKiemDem(new Date(ngayKiemDem));
		}

		if (ngayDanhGia == Long.MIN_VALUE) {
			dauNoiNuocImpl.setNgayDanhGia(null);
		}
		else {
			dauNoiNuocImpl.setNgayDanhGia(new Date(ngayDanhGia));
		}

		dauNoiNuocImpl.setIdNguoiDanhGia(idNguoiDanhGia);

		dauNoiNuocImpl.resetOriginalValues();

		return dauNoiNuocImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		tramCapNuocId = objectInput.readInt();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		maXa = objectInput.readUTF();
		thonXom = objectInput.readUTF();
		tenChuHo = objectInput.readUTF();
		gioiTinh = objectInput.readInt();
		ngayDauNoiHopDong = objectInput.readLong();
		trangThai = objectInput.readInt();
		namBaoCao = objectInput.readInt();
		ghiChu = objectInput.readUTF();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readInt();
		soNguoiTrongHo = objectInput.readInt();
		thanhPhanHoGiaDinh = objectInput.readInt();
		tongDoanhThu = objectInput.readInt();
		kinhDo = objectInput.readUTF();
		viDo = objectInput.readUTF();
		ngayDauNoiThucTe = objectInput.readLong();
		soSeryDongHo = objectInput.readUTF();
		danhGiaNuocHVS = objectInput.readUTF();
		ngayKiemDem = objectInput.readLong();
		ngayDanhGia = objectInput.readLong();
		idNguoiDanhGia = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(tramCapNuocId);

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

		objectOutput.writeInt(gioiTinh);
		objectOutput.writeLong(ngayDauNoiHopDong);
		objectOutput.writeInt(trangThai);
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
		objectOutput.writeInt(thanhPhanHoGiaDinh);
		objectOutput.writeInt(tongDoanhThu);

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

		objectOutput.writeLong(ngayDauNoiThucTe);

		if (soSeryDongHo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soSeryDongHo);
		}

		if (danhGiaNuocHVS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(danhGiaNuocHVS);
		}

		objectOutput.writeLong(ngayKiemDem);
		objectOutput.writeLong(ngayDanhGia);
		objectOutput.writeInt(idNguoiDanhGia);
	}

	public long id;
	public int tramCapNuocId;
	public String maTinh;
	public String maHuyen;
	public String maXa;
	public String thonXom;
	public String tenChuHo;
	public int gioiTinh;
	public long ngayDauNoiHopDong;
	public int trangThai;
	public int namBaoCao;
	public String ghiChu;
	public long ngayTao;
	public int idNguoiTao;
	public int soNguoiTrongHo;
	public int thanhPhanHoGiaDinh;
	public int tongDoanhThu;
	public String kinhDo;
	public String viDo;
	public long ngayDauNoiThucTe;
	public String soSeryDongHo;
	public String danhGiaNuocHVS;
	public long ngayKiemDem;
	public long ngayDanhGia;
	public int idNguoiDanhGia;
}