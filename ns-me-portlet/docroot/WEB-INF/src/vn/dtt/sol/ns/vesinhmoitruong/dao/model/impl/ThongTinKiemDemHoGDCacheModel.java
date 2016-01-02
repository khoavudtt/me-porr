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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ThongTinKiemDemHoGD in entity cache.
 *
 * @author BinhTH
 * @see ThongTinKiemDemHoGD
 * @generated
 */
public class ThongTinKiemDemHoGDCacheModel implements CacheModel<ThongTinKiemDemHoGD>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(111);

		sb.append("{id=");
		sb.append(id);
		sb.append(", veSinhGiaDinhId=");
		sb.append(veSinhGiaDinhId);
		sb.append(", keHoachKiemDemVeSinhId=");
		sb.append(keHoachKiemDemVeSinhId);
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
		sb.append(", soNguoiTrongHo=");
		sb.append(soNguoiTrongHo);
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
		sb.append(", thanhPhanHoGD=");
		sb.append(thanhPhanHoGD);
		sb.append(", chuHoDungDS=");
		sb.append(chuHoDungDS);
		sb.append(", lyDoKhongDungDS=");
		sb.append(lyDoKhongDungDS);
		sb.append(", tenChuHoHienTai=");
		sb.append(tenChuHoHienTai);
		sb.append(", gioiTinhChuHoHienTai=");
		sb.append(gioiTinhChuHoHienTai);
		sb.append(", coNhaTieu=");
		sb.append(coNhaTieu);
		sb.append(", loaiNguonNuoc=");
		sb.append(loaiNguonNuoc);
		sb.append(", loaiNhaTieu=");
		sb.append(loaiNhaTieu);
		sb.append(", anhToanCanh=");
		sb.append(anhToanCanh);
		sb.append(", anhTrongNhaTieu=");
		sb.append(anhTrongNhaTieu);
		sb.append(", thangXayDung=");
		sb.append(thangXayDung);
		sb.append(", namXayDung=");
		sb.append(namXayDung);
		sb.append(", nguonVon=");
		sb.append(nguonVon);
		sb.append(", chiTietVonVay=");
		sb.append(chiTietVonVay);
		sb.append(", duocCaiTao=");
		sb.append(duocCaiTao);
		sb.append(", loaiNhaTieuCu=");
		sb.append(loaiNhaTieuCu);
		sb.append(", anhBeChua=");
		sb.append(anhBeChua);
		sb.append(", veSinhSachSe=");
		sb.append(veSinhSachSe);
		sb.append(", deLamVeSinh=");
		sb.append(deLamVeSinh);
		sb.append(", muiVeSinh=");
		sb.append(muiVeSinh);
		sb.append(", phiaTrenKinDao=");
		sb.append(phiaTrenKinDao);
		sb.append(", duCheMuaGio=");
		sb.append(duCheMuaGio);
		sb.append(", sanCaoTrenToiThieu=");
		sb.append(sanCaoTrenToiThieu);
		sb.append(", napBeConTot=");
		sb.append(napBeConTot);
		sb.append(", cuaPhanBitKin=");
		sb.append(cuaPhanBitKin);
		sb.append(", tranRaNgoai=");
		sb.append(tranRaNgoai);
		sb.append(", nuocThaiDiDau=");
		sb.append(nuocThaiDiDau);
		sb.append(", khoangCachNguonNuoc=");
		sb.append(khoangCachNguonNuoc);
		sb.append(", ngapKhiMuaLon=");
		sb.append(ngapKhiMuaLon);
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
	public ThongTinKiemDemHoGD toEntityModel() {
		ThongTinKiemDemHoGDImpl thongTinKiemDemHoGDImpl = new ThongTinKiemDemHoGDImpl();

		thongTinKiemDemHoGDImpl.setId(id);
		thongTinKiemDemHoGDImpl.setVeSinhGiaDinhId(veSinhGiaDinhId);
		thongTinKiemDemHoGDImpl.setKeHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);

		if (maTinh == null) {
			thongTinKiemDemHoGDImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			thongTinKiemDemHoGDImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setMaHuyen(maHuyen);
		}

		if (maXa == null) {
			thongTinKiemDemHoGDImpl.setMaXa(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setMaXa(maXa);
		}

		if (thonXom == null) {
			thongTinKiemDemHoGDImpl.setThonXom(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setThonXom(thonXom);
		}

		if (tenChuHo == null) {
			thongTinKiemDemHoGDImpl.setTenChuHo(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setTenChuHo(tenChuHo);
		}

		thongTinKiemDemHoGDImpl.setGioiTinhChuHo(gioiTinhChuHo);

		if (ngayKiemDem == Long.MIN_VALUE) {
			thongTinKiemDemHoGDImpl.setNgayKiemDem(null);
		}
		else {
			thongTinKiemDemHoGDImpl.setNgayKiemDem(new Date(ngayKiemDem));
		}

		thongTinKiemDemHoGDImpl.setTimThayNha(timThayNha);
		thongTinKiemDemHoGDImpl.setCoNguoiONha(coNguoiONha);
		thongTinKiemDemHoGDImpl.setSoNguoiTrongHo(soNguoiTrongHo);

		if (hoTenNguoiTraLoi == null) {
			thongTinKiemDemHoGDImpl.setHoTenNguoiTraLoi(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setHoTenNguoiTraLoi(hoTenNguoiTraLoi);
		}

		thongTinKiemDemHoGDImpl.setLaChuHoKhong(laChuHoKhong);

		if (gioiTinhNguoiTraLoi == null) {
			thongTinKiemDemHoGDImpl.setGioiTinhNguoiTraLoi(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setGioiTinhNguoiTraLoi(gioiTinhNguoiTraLoi);
		}

		if (tenDanToc == null) {
			thongTinKiemDemHoGDImpl.setTenDanToc(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setTenDanToc(tenDanToc);
		}

		if (kinhDo == null) {
			thongTinKiemDemHoGDImpl.setKinhDo(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setKinhDo(kinhDo);
		}

		if (viDo == null) {
			thongTinKiemDemHoGDImpl.setViDo(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setViDo(viDo);
		}

		thongTinKiemDemHoGDImpl.setThanhPhanHoGD(thanhPhanHoGD);
		thongTinKiemDemHoGDImpl.setChuHoDungDS(chuHoDungDS);

		if (lyDoKhongDungDS == null) {
			thongTinKiemDemHoGDImpl.setLyDoKhongDungDS(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setLyDoKhongDungDS(lyDoKhongDungDS);
		}

		if (tenChuHoHienTai == null) {
			thongTinKiemDemHoGDImpl.setTenChuHoHienTai(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setTenChuHoHienTai(tenChuHoHienTai);
		}

		thongTinKiemDemHoGDImpl.setGioiTinhChuHoHienTai(gioiTinhChuHoHienTai);
		thongTinKiemDemHoGDImpl.setCoNhaTieu(coNhaTieu);

		if (loaiNguonNuoc == null) {
			thongTinKiemDemHoGDImpl.setLoaiNguonNuoc(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setLoaiNguonNuoc(loaiNguonNuoc);
		}

		if (loaiNhaTieu == null) {
			thongTinKiemDemHoGDImpl.setLoaiNhaTieu(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setLoaiNhaTieu(loaiNhaTieu);
		}

		if (anhToanCanh == null) {
			thongTinKiemDemHoGDImpl.setAnhToanCanh(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setAnhToanCanh(anhToanCanh);
		}

		if (anhTrongNhaTieu == null) {
			thongTinKiemDemHoGDImpl.setAnhTrongNhaTieu(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setAnhTrongNhaTieu(anhTrongNhaTieu);
		}

		thongTinKiemDemHoGDImpl.setThangXayDung(thangXayDung);
		thongTinKiemDemHoGDImpl.setNamXayDung(namXayDung);
		thongTinKiemDemHoGDImpl.setNguonVon(nguonVon);

		if (chiTietVonVay == null) {
			thongTinKiemDemHoGDImpl.setChiTietVonVay(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setChiTietVonVay(chiTietVonVay);
		}

		thongTinKiemDemHoGDImpl.setDuocCaiTao(duocCaiTao);

		if (loaiNhaTieuCu == null) {
			thongTinKiemDemHoGDImpl.setLoaiNhaTieuCu(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setLoaiNhaTieuCu(loaiNhaTieuCu);
		}

		if (anhBeChua == null) {
			thongTinKiemDemHoGDImpl.setAnhBeChua(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setAnhBeChua(anhBeChua);
		}

		thongTinKiemDemHoGDImpl.setVeSinhSachSe(veSinhSachSe);
		thongTinKiemDemHoGDImpl.setDeLamVeSinh(deLamVeSinh);
		thongTinKiemDemHoGDImpl.setMuiVeSinh(muiVeSinh);
		thongTinKiemDemHoGDImpl.setPhiaTrenKinDao(phiaTrenKinDao);
		thongTinKiemDemHoGDImpl.setDuCheMuaGio(duCheMuaGio);
		thongTinKiemDemHoGDImpl.setSanCaoTrenToiThieu(sanCaoTrenToiThieu);
		thongTinKiemDemHoGDImpl.setNapBeConTot(napBeConTot);
		thongTinKiemDemHoGDImpl.setCuaPhanBitKin(cuaPhanBitKin);
		thongTinKiemDemHoGDImpl.setTranRaNgoai(tranRaNgoai);
		thongTinKiemDemHoGDImpl.setNuocThaiDiDau(nuocThaiDiDau);
		thongTinKiemDemHoGDImpl.setKhoangCachNguonNuoc(khoangCachNguonNuoc);
		thongTinKiemDemHoGDImpl.setNgapKhiMuaLon(ngapKhiMuaLon);

		if (ghiChu == null) {
			thongTinKiemDemHoGDImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setGhiChu(ghiChu);
		}

		thongTinKiemDemHoGDImpl.setDaKetThucDieuTra(daKetThucDieuTra);

		if (lyDoKhongHoanThanh == null) {
			thongTinKiemDemHoGDImpl.setLyDoKhongHoanThanh(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setLyDoKhongHoanThanh(lyDoKhongHoanThanh);
		}

		if (imei == null) {
			thongTinKiemDemHoGDImpl.setImei(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setImei(imei);
		}

		if (taiKhoan == null) {
			thongTinKiemDemHoGDImpl.setTaiKhoan(StringPool.BLANK);
		}
		else {
			thongTinKiemDemHoGDImpl.setTaiKhoan(taiKhoan);
		}

		thongTinKiemDemHoGDImpl.setDanhGiaKiemDem(danhGiaKiemDem);

		if (savePoint == Long.MIN_VALUE) {
			thongTinKiemDemHoGDImpl.setSavePoint(null);
		}
		else {
			thongTinKiemDemHoGDImpl.setSavePoint(new Date(savePoint));
		}

		thongTinKiemDemHoGDImpl.resetOriginalValues();

		return thongTinKiemDemHoGDImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		veSinhGiaDinhId = objectInput.readInt();
		keHoachKiemDemVeSinhId = objectInput.readInt();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		maXa = objectInput.readUTF();
		thonXom = objectInput.readUTF();
		tenChuHo = objectInput.readUTF();
		gioiTinhChuHo = objectInput.readInt();
		ngayKiemDem = objectInput.readLong();
		timThayNha = objectInput.readInt();
		coNguoiONha = objectInput.readInt();
		soNguoiTrongHo = objectInput.readInt();
		hoTenNguoiTraLoi = objectInput.readUTF();
		laChuHoKhong = objectInput.readInt();
		gioiTinhNguoiTraLoi = objectInput.readUTF();
		tenDanToc = objectInput.readUTF();
		kinhDo = objectInput.readUTF();
		viDo = objectInput.readUTF();
		thanhPhanHoGD = objectInput.readInt();
		chuHoDungDS = objectInput.readInt();
		lyDoKhongDungDS = objectInput.readUTF();
		tenChuHoHienTai = objectInput.readUTF();
		gioiTinhChuHoHienTai = objectInput.readInt();
		coNhaTieu = objectInput.readInt();
		loaiNguonNuoc = objectInput.readUTF();
		loaiNhaTieu = objectInput.readUTF();
		anhToanCanh = objectInput.readUTF();
		anhTrongNhaTieu = objectInput.readUTF();
		thangXayDung = objectInput.readInt();
		namXayDung = objectInput.readInt();
		nguonVon = objectInput.readInt();
		chiTietVonVay = objectInput.readUTF();
		duocCaiTao = objectInput.readInt();
		loaiNhaTieuCu = objectInput.readUTF();
		anhBeChua = objectInput.readUTF();
		veSinhSachSe = objectInput.readInt();
		deLamVeSinh = objectInput.readInt();
		muiVeSinh = objectInput.readInt();
		phiaTrenKinDao = objectInput.readInt();
		duCheMuaGio = objectInput.readInt();
		sanCaoTrenToiThieu = objectInput.readInt();
		napBeConTot = objectInput.readInt();
		cuaPhanBitKin = objectInput.readInt();
		tranRaNgoai = objectInput.readInt();
		nuocThaiDiDau = objectInput.readInt();
		khoangCachNguonNuoc = objectInput.readInt();
		ngapKhiMuaLon = objectInput.readInt();
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
		objectOutput.writeInt(veSinhGiaDinhId);
		objectOutput.writeInt(keHoachKiemDemVeSinhId);

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
		objectOutput.writeInt(soNguoiTrongHo);

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

		objectOutput.writeInt(thanhPhanHoGD);
		objectOutput.writeInt(chuHoDungDS);

		if (lyDoKhongDungDS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoKhongDungDS);
		}

		if (tenChuHoHienTai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenChuHoHienTai);
		}

		objectOutput.writeInt(gioiTinhChuHoHienTai);
		objectOutput.writeInt(coNhaTieu);

		if (loaiNguonNuoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiNguonNuoc);
		}

		if (loaiNhaTieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiNhaTieu);
		}

		if (anhToanCanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(anhToanCanh);
		}

		if (anhTrongNhaTieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(anhTrongNhaTieu);
		}

		objectOutput.writeInt(thangXayDung);
		objectOutput.writeInt(namXayDung);
		objectOutput.writeInt(nguonVon);

		if (chiTietVonVay == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chiTietVonVay);
		}

		objectOutput.writeInt(duocCaiTao);

		if (loaiNhaTieuCu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiNhaTieuCu);
		}

		if (anhBeChua == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(anhBeChua);
		}

		objectOutput.writeInt(veSinhSachSe);
		objectOutput.writeInt(deLamVeSinh);
		objectOutput.writeInt(muiVeSinh);
		objectOutput.writeInt(phiaTrenKinDao);
		objectOutput.writeInt(duCheMuaGio);
		objectOutput.writeInt(sanCaoTrenToiThieu);
		objectOutput.writeInt(napBeConTot);
		objectOutput.writeInt(cuaPhanBitKin);
		objectOutput.writeInt(tranRaNgoai);
		objectOutput.writeInt(nuocThaiDiDau);
		objectOutput.writeInt(khoangCachNguonNuoc);
		objectOutput.writeInt(ngapKhiMuaLon);

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
	public int veSinhGiaDinhId;
	public int keHoachKiemDemVeSinhId;
	public String maTinh;
	public String maHuyen;
	public String maXa;
	public String thonXom;
	public String tenChuHo;
	public int gioiTinhChuHo;
	public long ngayKiemDem;
	public int timThayNha;
	public int coNguoiONha;
	public int soNguoiTrongHo;
	public String hoTenNguoiTraLoi;
	public int laChuHoKhong;
	public String gioiTinhNguoiTraLoi;
	public String tenDanToc;
	public String kinhDo;
	public String viDo;
	public int thanhPhanHoGD;
	public int chuHoDungDS;
	public String lyDoKhongDungDS;
	public String tenChuHoHienTai;
	public int gioiTinhChuHoHienTai;
	public int coNhaTieu;
	public String loaiNguonNuoc;
	public String loaiNhaTieu;
	public String anhToanCanh;
	public String anhTrongNhaTieu;
	public int thangXayDung;
	public int namXayDung;
	public int nguonVon;
	public String chiTietVonVay;
	public int duocCaiTao;
	public String loaiNhaTieuCu;
	public String anhBeChua;
	public int veSinhSachSe;
	public int deLamVeSinh;
	public int muiVeSinh;
	public int phiaTrenKinDao;
	public int duCheMuaGio;
	public int sanCaoTrenToiThieu;
	public int napBeConTot;
	public int cuaPhanBitKin;
	public int tranRaNgoai;
	public int nuocThaiDiDau;
	public int khoangCachNguonNuoc;
	public int ngapKhiMuaLon;
	public String ghiChu;
	public int daKetThucDieuTra;
	public String lyDoKhongHoanThanh;
	public String imei;
	public String taiKhoan;
	public int danhGiaKiemDem;
	public long savePoint;
}