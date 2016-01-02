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

import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing THONGTINKIEMDEMNUOC in entity cache.
 *
 * @author khoa.vu
 * @see THONGTINKIEMDEMNUOC
 * @generated
 */
public class THONGTINKIEMDEMNUOCCacheModel implements CacheModel<THONGTINKIEMDEMNUOC>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(109);

		sb.append("{id=");
		sb.append(id);
		sb.append(", dauNoiNuocId=");
		sb.append(dauNoiNuocId);
		sb.append(", keHoachKiemDemNuocId=");
		sb.append(keHoachKiemDemNuocId);
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
		sb.append(", ngayKiemDem=");
		sb.append(ngayKiemDem);
		sb.append(", timThayNha=");
		sb.append(timThayNha);
		sb.append(", coNguoiONha=");
		sb.append(coNguoiONha);
		sb.append(", hoTenNguoiTraLoi=");
		sb.append(hoTenNguoiTraLoi);
		sb.append(", laChuHoKhong=");
		sb.append(laChuHoKhong);
		sb.append(", gioiTinhNguoiTraLoi=");
		sb.append(gioiTinhNguoiTraLoi);
		sb.append(", tenDanToc=");
		sb.append(tenDanToc);
		sb.append(", kinhDo=");
		sb.append(kinhDo);
		sb.append(", viDo=");
		sb.append(viDo);
		sb.append(", soNguoiTrongHo=");
		sb.append(soNguoiTrongHo);
		sb.append(", thanhPhanHoGd=");
		sb.append(thanhPhanHoGd);
		sb.append(", chuHoDungDs=");
		sb.append(chuHoDungDs);
		sb.append(", lyDoKhongDungDs=");
		sb.append(lyDoKhongDungDs);
		sb.append(", tenChuHoHienTai=");
		sb.append(tenChuHoHienTai);
		sb.append(", gioiTinhChuHoHienTai=");
		sb.append(gioiTinhChuHoHienTai);
		sb.append(", dauNoiChua=");
		sb.append(dauNoiChua);
		sb.append(", anhDauNoi=");
		sb.append(anhDauNoi);
		sb.append(", thoiGianDauHopDong=");
		sb.append(thoiGianDauHopDong);
		sb.append(", thoiGianDauNoiThucTe=");
		sb.append(thoiGianDauNoiThucTe);
		sb.append(", voiNuocChayKhong=");
		sb.append(voiNuocChayKhong);
		sb.append(", nuocTrongKhong=");
		sb.append(nuocTrongKhong);
		sb.append(", mauNuoc=");
		sb.append(mauNuoc);
		sb.append(", muiNuoc=");
		sb.append(muiNuoc);
		sb.append(", viNuoc=");
		sb.append(viNuoc);
		sb.append(", loaiKhac=");
		sb.append(loaiKhac);
		sb.append(", daTungDucKhong=");
		sb.append(daTungDucKhong);
		sb.append(", mauNuocTungCo=");
		sb.append(mauNuocTungCo);
		sb.append(", muiNuocTungCo=");
		sb.append(muiNuocTungCo);
		sb.append(", viNuocTungCo=");
		sb.append(viNuocTungCo);
		sb.append(", loaiKhacTungCo=");
		sb.append(loaiKhacTungCo);
		sb.append(", coBeChuaNuoc=");
		sb.append(coBeChuaNuoc);
		sb.append(", tinhTrangBe=");
		sb.append(tinhTrangBe);
		sb.append(", anhBeChua=");
		sb.append(anhBeChua);
		sb.append(", biMatNuoc=");
		sb.append(biMatNuoc);
		sb.append(", soLanMatNuoc=");
		sb.append(soLanMatNuoc);
		sb.append(", soGioTrungBinh=");
		sb.append(soGioTrungBinh);
		sb.append(", soSeRyDongHo=");
		sb.append(soSeRyDongHo);
		sb.append(", chiSoDongHo=");
		sb.append(chiSoDongHo);
		sb.append(", anhDongHo=");
		sb.append(anhDongHo);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", daKetThucDieuTra=");
		sb.append(daKetThucDieuTra);
		sb.append(", lyDoKhongHoanThanh=");
		sb.append(lyDoKhongHoanThanh);
		sb.append(", iMei=");
		sb.append(iMei);
		sb.append(", taiKhoan=");
		sb.append(taiKhoan);
		sb.append(", danhGiaKiemDem=");
		sb.append(danhGiaKiemDem);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public THONGTINKIEMDEMNUOC toEntityModel() {
		THONGTINKIEMDEMNUOCImpl thongtinkiemdemnuocImpl = new THONGTINKIEMDEMNUOCImpl();

		thongtinkiemdemnuocImpl.setId(id);
		thongtinkiemdemnuocImpl.setDauNoiNuocId(dauNoiNuocId);
		thongtinkiemdemnuocImpl.setKeHoachKiemDemNuocId(keHoachKiemDemNuocId);

		if (maTinh == null) {
			thongtinkiemdemnuocImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			thongtinkiemdemnuocImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setMaHuyen(maHuyen);
		}

		if (maXa == null) {
			thongtinkiemdemnuocImpl.setMaXa(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setMaXa(maXa);
		}

		if (thonXom == null) {
			thongtinkiemdemnuocImpl.setThonXom(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setThonXom(thonXom);
		}

		if (tenChuHo == null) {
			thongtinkiemdemnuocImpl.setTenChuHo(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setTenChuHo(tenChuHo);
		}

		thongtinkiemdemnuocImpl.setGioiTinhChuHo(gioiTinhChuHo);

		if (ngayKiemDem == Long.MIN_VALUE) {
			thongtinkiemdemnuocImpl.setNgayKiemDem(null);
		}
		else {
			thongtinkiemdemnuocImpl.setNgayKiemDem(new Date(ngayKiemDem));
		}

		thongtinkiemdemnuocImpl.setTimThayNha(timThayNha);
		thongtinkiemdemnuocImpl.setCoNguoiONha(coNguoiONha);

		if (hoTenNguoiTraLoi == null) {
			thongtinkiemdemnuocImpl.setHoTenNguoiTraLoi(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setHoTenNguoiTraLoi(hoTenNguoiTraLoi);
		}

		thongtinkiemdemnuocImpl.setLaChuHoKhong(laChuHoKhong);

		if (gioiTinhNguoiTraLoi == null) {
			thongtinkiemdemnuocImpl.setGioiTinhNguoiTraLoi(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setGioiTinhNguoiTraLoi(gioiTinhNguoiTraLoi);
		}

		if (tenDanToc == null) {
			thongtinkiemdemnuocImpl.setTenDanToc(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setTenDanToc(tenDanToc);
		}

		if (kinhDo == null) {
			thongtinkiemdemnuocImpl.setKinhDo(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setKinhDo(kinhDo);
		}

		if (viDo == null) {
			thongtinkiemdemnuocImpl.setViDo(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setViDo(viDo);
		}

		thongtinkiemdemnuocImpl.setSoNguoiTrongHo(soNguoiTrongHo);
		thongtinkiemdemnuocImpl.setThanhPhanHoGd(thanhPhanHoGd);
		thongtinkiemdemnuocImpl.setChuHoDungDs(chuHoDungDs);

		if (lyDoKhongDungDs == null) {
			thongtinkiemdemnuocImpl.setLyDoKhongDungDs(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setLyDoKhongDungDs(lyDoKhongDungDs);
		}

		if (tenChuHoHienTai == null) {
			thongtinkiemdemnuocImpl.setTenChuHoHienTai(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setTenChuHoHienTai(tenChuHoHienTai);
		}

		thongtinkiemdemnuocImpl.setGioiTinhChuHoHienTai(gioiTinhChuHoHienTai);
		thongtinkiemdemnuocImpl.setDauNoiChua(dauNoiChua);

		if (anhDauNoi == null) {
			thongtinkiemdemnuocImpl.setAnhDauNoi(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setAnhDauNoi(anhDauNoi);
		}

		if (thoiGianDauHopDong == Long.MIN_VALUE) {
			thongtinkiemdemnuocImpl.setThoiGianDauHopDong(null);
		}
		else {
			thongtinkiemdemnuocImpl.setThoiGianDauHopDong(new Date(
					thoiGianDauHopDong));
		}

		if (thoiGianDauNoiThucTe == Long.MIN_VALUE) {
			thongtinkiemdemnuocImpl.setThoiGianDauNoiThucTe(null);
		}
		else {
			thongtinkiemdemnuocImpl.setThoiGianDauNoiThucTe(new Date(
					thoiGianDauNoiThucTe));
		}

		thongtinkiemdemnuocImpl.setVoiNuocChayKhong(voiNuocChayKhong);
		thongtinkiemdemnuocImpl.setNuocTrongKhong(nuocTrongKhong);

		if (mauNuoc == null) {
			thongtinkiemdemnuocImpl.setMauNuoc(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setMauNuoc(mauNuoc);
		}

		if (muiNuoc == null) {
			thongtinkiemdemnuocImpl.setMuiNuoc(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setMuiNuoc(muiNuoc);
		}

		if (viNuoc == null) {
			thongtinkiemdemnuocImpl.setViNuoc(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setViNuoc(viNuoc);
		}

		if (loaiKhac == null) {
			thongtinkiemdemnuocImpl.setLoaiKhac(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setLoaiKhac(loaiKhac);
		}

		thongtinkiemdemnuocImpl.setDaTungDucKhong(daTungDucKhong);

		if (mauNuocTungCo == null) {
			thongtinkiemdemnuocImpl.setMauNuocTungCo(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setMauNuocTungCo(mauNuocTungCo);
		}

		if (muiNuocTungCo == null) {
			thongtinkiemdemnuocImpl.setMuiNuocTungCo(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setMuiNuocTungCo(muiNuocTungCo);
		}

		if (viNuocTungCo == null) {
			thongtinkiemdemnuocImpl.setViNuocTungCo(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setViNuocTungCo(viNuocTungCo);
		}

		if (loaiKhacTungCo == null) {
			thongtinkiemdemnuocImpl.setLoaiKhacTungCo(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setLoaiKhacTungCo(loaiKhacTungCo);
		}

		thongtinkiemdemnuocImpl.setCoBeChuaNuoc(coBeChuaNuoc);
		thongtinkiemdemnuocImpl.setTinhTrangBe(tinhTrangBe);

		if (anhBeChua == null) {
			thongtinkiemdemnuocImpl.setAnhBeChua(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setAnhBeChua(anhBeChua);
		}

		thongtinkiemdemnuocImpl.setBiMatNuoc(biMatNuoc);
		thongtinkiemdemnuocImpl.setSoLanMatNuoc(soLanMatNuoc);
		thongtinkiemdemnuocImpl.setSoGioTrungBinh(soGioTrungBinh);

		if (soSeRyDongHo == null) {
			thongtinkiemdemnuocImpl.setSoSeRyDongHo(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setSoSeRyDongHo(soSeRyDongHo);
		}

		if (chiSoDongHo == null) {
			thongtinkiemdemnuocImpl.setChiSoDongHo(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setChiSoDongHo(chiSoDongHo);
		}

		if (anhDongHo == null) {
			thongtinkiemdemnuocImpl.setAnhDongHo(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setAnhDongHo(anhDongHo);
		}

		if (ghiChu == null) {
			thongtinkiemdemnuocImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setGhiChu(ghiChu);
		}

		thongtinkiemdemnuocImpl.setDaKetThucDieuTra(daKetThucDieuTra);

		if (lyDoKhongHoanThanh == null) {
			thongtinkiemdemnuocImpl.setLyDoKhongHoanThanh(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setLyDoKhongHoanThanh(lyDoKhongHoanThanh);
		}

		if (iMei == null) {
			thongtinkiemdemnuocImpl.setIMei(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setIMei(iMei);
		}

		if (taiKhoan == null) {
			thongtinkiemdemnuocImpl.setTaiKhoan(StringPool.BLANK);
		}
		else {
			thongtinkiemdemnuocImpl.setTaiKhoan(taiKhoan);
		}

		thongtinkiemdemnuocImpl.setDanhGiaKiemDem(danhGiaKiemDem);

		thongtinkiemdemnuocImpl.resetOriginalValues();

		return thongtinkiemdemnuocImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		dauNoiNuocId = objectInput.readLong();
		keHoachKiemDemNuocId = objectInput.readInt();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		maXa = objectInput.readUTF();
		thonXom = objectInput.readUTF();
		tenChuHo = objectInput.readUTF();
		gioiTinhChuHo = objectInput.readInt();
		ngayKiemDem = objectInput.readLong();
		timThayNha = objectInput.readInt();
		coNguoiONha = objectInput.readInt();
		hoTenNguoiTraLoi = objectInput.readUTF();
		laChuHoKhong = objectInput.readInt();
		gioiTinhNguoiTraLoi = objectInput.readUTF();
		tenDanToc = objectInput.readUTF();
		kinhDo = objectInput.readUTF();
		viDo = objectInput.readUTF();
		soNguoiTrongHo = objectInput.readInt();
		thanhPhanHoGd = objectInput.readInt();
		chuHoDungDs = objectInput.readInt();
		lyDoKhongDungDs = objectInput.readUTF();
		tenChuHoHienTai = objectInput.readUTF();
		gioiTinhChuHoHienTai = objectInput.readInt();
		dauNoiChua = objectInput.readInt();
		anhDauNoi = objectInput.readUTF();
		thoiGianDauHopDong = objectInput.readLong();
		thoiGianDauNoiThucTe = objectInput.readLong();
		voiNuocChayKhong = objectInput.readInt();
		nuocTrongKhong = objectInput.readInt();
		mauNuoc = objectInput.readUTF();
		muiNuoc = objectInput.readUTF();
		viNuoc = objectInput.readUTF();
		loaiKhac = objectInput.readUTF();
		daTungDucKhong = objectInput.readInt();
		mauNuocTungCo = objectInput.readUTF();
		muiNuocTungCo = objectInput.readUTF();
		viNuocTungCo = objectInput.readUTF();
		loaiKhacTungCo = objectInput.readUTF();
		coBeChuaNuoc = objectInput.readInt();
		tinhTrangBe = objectInput.readInt();
		anhBeChua = objectInput.readUTF();
		biMatNuoc = objectInput.readInt();
		soLanMatNuoc = objectInput.readInt();
		soGioTrungBinh = objectInput.readInt();
		soSeRyDongHo = objectInput.readUTF();
		chiSoDongHo = objectInput.readUTF();
		anhDongHo = objectInput.readUTF();
		ghiChu = objectInput.readUTF();
		daKetThucDieuTra = objectInput.readInt();
		lyDoKhongHoanThanh = objectInput.readUTF();
		iMei = objectInput.readUTF();
		taiKhoan = objectInput.readUTF();
		danhGiaKiemDem = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(dauNoiNuocId);
		objectOutput.writeInt(keHoachKiemDemNuocId);

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
		objectOutput.writeLong(ngayKiemDem);
		objectOutput.writeInt(timThayNha);
		objectOutput.writeInt(coNguoiONha);

		if (hoTenNguoiTraLoi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hoTenNguoiTraLoi);
		}

		objectOutput.writeInt(laChuHoKhong);

		if (gioiTinhNguoiTraLoi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gioiTinhNguoiTraLoi);
		}

		if (tenDanToc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenDanToc);
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

		objectOutput.writeInt(soNguoiTrongHo);
		objectOutput.writeInt(thanhPhanHoGd);
		objectOutput.writeInt(chuHoDungDs);

		if (lyDoKhongDungDs == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoKhongDungDs);
		}

		if (tenChuHoHienTai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenChuHoHienTai);
		}

		objectOutput.writeInt(gioiTinhChuHoHienTai);
		objectOutput.writeInt(dauNoiChua);

		if (anhDauNoi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(anhDauNoi);
		}

		objectOutput.writeLong(thoiGianDauHopDong);
		objectOutput.writeLong(thoiGianDauNoiThucTe);
		objectOutput.writeInt(voiNuocChayKhong);
		objectOutput.writeInt(nuocTrongKhong);

		if (mauNuoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mauNuoc);
		}

		if (muiNuoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(muiNuoc);
		}

		if (viNuoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(viNuoc);
		}

		if (loaiKhac == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiKhac);
		}

		objectOutput.writeInt(daTungDucKhong);

		if (mauNuocTungCo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mauNuocTungCo);
		}

		if (muiNuocTungCo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(muiNuocTungCo);
		}

		if (viNuocTungCo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(viNuocTungCo);
		}

		if (loaiKhacTungCo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiKhacTungCo);
		}

		objectOutput.writeInt(coBeChuaNuoc);
		objectOutput.writeInt(tinhTrangBe);

		if (anhBeChua == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(anhBeChua);
		}

		objectOutput.writeInt(biMatNuoc);
		objectOutput.writeInt(soLanMatNuoc);
		objectOutput.writeInt(soGioTrungBinh);

		if (soSeRyDongHo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soSeRyDongHo);
		}

		if (chiSoDongHo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chiSoDongHo);
		}

		if (anhDongHo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(anhDongHo);
		}

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

		if (iMei == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(iMei);
		}

		if (taiKhoan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(taiKhoan);
		}

		objectOutput.writeInt(danhGiaKiemDem);
	}

	public long id;
	public long dauNoiNuocId;
	public int keHoachKiemDemNuocId;
	public String maTinh;
	public String maHuyen;
	public String maXa;
	public String thonXom;
	public String tenChuHo;
	public int gioiTinhChuHo;
	public long ngayKiemDem;
	public int timThayNha;
	public int coNguoiONha;
	public String hoTenNguoiTraLoi;
	public int laChuHoKhong;
	public String gioiTinhNguoiTraLoi;
	public String tenDanToc;
	public String kinhDo;
	public String viDo;
	public int soNguoiTrongHo;
	public int thanhPhanHoGd;
	public int chuHoDungDs;
	public String lyDoKhongDungDs;
	public String tenChuHoHienTai;
	public int gioiTinhChuHoHienTai;
	public int dauNoiChua;
	public String anhDauNoi;
	public long thoiGianDauHopDong;
	public long thoiGianDauNoiThucTe;
	public int voiNuocChayKhong;
	public int nuocTrongKhong;
	public String mauNuoc;
	public String muiNuoc;
	public String viNuoc;
	public String loaiKhac;
	public int daTungDucKhong;
	public String mauNuocTungCo;
	public String muiNuocTungCo;
	public String viNuocTungCo;
	public String loaiKhacTungCo;
	public int coBeChuaNuoc;
	public int tinhTrangBe;
	public String anhBeChua;
	public int biMatNuoc;
	public int soLanMatNuoc;
	public int soGioTrungBinh;
	public String soSeRyDongHo;
	public String chiSoDongHo;
	public String anhDongHo;
	public String ghiChu;
	public int daKetThucDieuTra;
	public String lyDoKhongHoanThanh;
	public String iMei;
	public String taiKhoan;
	public int danhGiaKiemDem;
}