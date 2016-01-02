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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DanhGiaVeSinhXaNewFake in entity cache.
 *
 * @author BinhTH
 * @see DanhGiaVeSinhXaNewFake
 * @generated
 */
public class DanhGiaVeSinhXaNewFakeCacheModel implements CacheModel<DanhGiaVeSinhXaNewFake>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maTinh=");
		sb.append(maTinh);
		sb.append(", maHuyen=");
		sb.append(maHuyen);
		sb.append(", maXa=");
		sb.append(maXa);
		sb.append(", maTinhStr=");
		sb.append(maTinhStr);
		sb.append(", maHuyenStr=");
		sb.append(maHuyenStr);
		sb.append(", maXaStr=");
		sb.append(maXaStr);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", soDan=");
		sb.append(soDan);
		sb.append(", tongSoHGD=");
		sb.append(tongSoHGD);
		sb.append(", soHGDCoNhaTieu=");
		sb.append(soHGDCoNhaTieu);
		sb.append(", soHGDCoNhaTieuHVS=");
		sb.append(soHGDCoNhaTieuHVS);
		sb.append(", soNhaTieuHVSXayMoi=");
		sb.append(soNhaTieuHVSXayMoi);
		sb.append(", tiLeHGDCoNhaTieu=");
		sb.append(tiLeHGDCoNhaTieu);
		sb.append(", tiLeHGDCoNhaTieuHVS=");
		sb.append(tiLeHGDCoNhaTieuHVS);
		sb.append(", tongSoTruongHoc=");
		sb.append(tongSoTruongHoc);
		sb.append(", soTruongHocHVS=");
		sb.append(soTruongHocHVS);
		sb.append(", tongSoTramYTe=");
		sb.append(tongSoTramYTe);
		sb.append(", soTramYTeHVS=");
		sb.append(soTramYTeHVS);
		sb.append(", tiLeTruongHocHVS=");
		sb.append(tiLeTruongHocHVS);
		sb.append(", tiLeTramYTeHVS=");
		sb.append(tiLeTramYTeHVS);
		sb.append(", ketLuanVSTX=");
		sb.append(ketLuanVSTX);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", baoCaoDLI=");
		sb.append(baoCaoDLI);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", idNguoiTao=");
		sb.append(idNguoiTao);
		sb.append(", dangKyVSTX=");
		sb.append(dangKyVSTX);
		sb.append(", soNhaTieuHVSMoi=");
		sb.append(soNhaTieuHVSMoi);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DanhGiaVeSinhXaNewFake toEntityModel() {
		DanhGiaVeSinhXaNewFakeImpl danhGiaVeSinhXaNewFakeImpl = new DanhGiaVeSinhXaNewFakeImpl();

		danhGiaVeSinhXaNewFakeImpl.setId(id);

		if (maTinh == null) {
			danhGiaVeSinhXaNewFakeImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			danhGiaVeSinhXaNewFakeImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			danhGiaVeSinhXaNewFakeImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			danhGiaVeSinhXaNewFakeImpl.setMaHuyen(maHuyen);
		}

		if (maXa == null) {
			danhGiaVeSinhXaNewFakeImpl.setMaXa(StringPool.BLANK);
		}
		else {
			danhGiaVeSinhXaNewFakeImpl.setMaXa(maXa);
		}

		if (maTinhStr == null) {
			danhGiaVeSinhXaNewFakeImpl.setMaTinhStr(StringPool.BLANK);
		}
		else {
			danhGiaVeSinhXaNewFakeImpl.setMaTinhStr(maTinhStr);
		}

		if (maHuyenStr == null) {
			danhGiaVeSinhXaNewFakeImpl.setMaHuyenStr(StringPool.BLANK);
		}
		else {
			danhGiaVeSinhXaNewFakeImpl.setMaHuyenStr(maHuyenStr);
		}

		if (maXaStr == null) {
			danhGiaVeSinhXaNewFakeImpl.setMaXaStr(StringPool.BLANK);
		}
		else {
			danhGiaVeSinhXaNewFakeImpl.setMaXaStr(maXaStr);
		}

		danhGiaVeSinhXaNewFakeImpl.setNam(nam);
		danhGiaVeSinhXaNewFakeImpl.setSoDan(soDan);
		danhGiaVeSinhXaNewFakeImpl.setTongSoHGD(tongSoHGD);
		danhGiaVeSinhXaNewFakeImpl.setSoHGDCoNhaTieu(soHGDCoNhaTieu);
		danhGiaVeSinhXaNewFakeImpl.setSoHGDCoNhaTieuHVS(soHGDCoNhaTieuHVS);
		danhGiaVeSinhXaNewFakeImpl.setSoNhaTieuHVSXayMoi(soNhaTieuHVSXayMoi);
		danhGiaVeSinhXaNewFakeImpl.setTiLeHGDCoNhaTieu(tiLeHGDCoNhaTieu);
		danhGiaVeSinhXaNewFakeImpl.setTiLeHGDCoNhaTieuHVS(tiLeHGDCoNhaTieuHVS);
		danhGiaVeSinhXaNewFakeImpl.setTongSoTruongHoc(tongSoTruongHoc);
		danhGiaVeSinhXaNewFakeImpl.setSoTruongHocHVS(soTruongHocHVS);
		danhGiaVeSinhXaNewFakeImpl.setTongSoTramYTe(tongSoTramYTe);
		danhGiaVeSinhXaNewFakeImpl.setSoTramYTeHVS(soTramYTeHVS);
		danhGiaVeSinhXaNewFakeImpl.setTiLeTruongHocHVS(tiLeTruongHocHVS);
		danhGiaVeSinhXaNewFakeImpl.setTiLeTramYTeHVS(tiLeTramYTeHVS);
		danhGiaVeSinhXaNewFakeImpl.setKetLuanVSTX(ketLuanVSTX);

		if (ghiChu == null) {
			danhGiaVeSinhXaNewFakeImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			danhGiaVeSinhXaNewFakeImpl.setGhiChu(ghiChu);
		}

		danhGiaVeSinhXaNewFakeImpl.setBaoCaoDLI(baoCaoDLI);

		if (ngayTao == Long.MIN_VALUE) {
			danhGiaVeSinhXaNewFakeImpl.setNgayTao(null);
		}
		else {
			danhGiaVeSinhXaNewFakeImpl.setNgayTao(new Date(ngayTao));
		}

		danhGiaVeSinhXaNewFakeImpl.setIdNguoiTao(idNguoiTao);
		danhGiaVeSinhXaNewFakeImpl.setDangKyVSTX(dangKyVSTX);
		danhGiaVeSinhXaNewFakeImpl.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);

		danhGiaVeSinhXaNewFakeImpl.resetOriginalValues();

		return danhGiaVeSinhXaNewFakeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		maXa = objectInput.readUTF();
		maTinhStr = objectInput.readUTF();
		maHuyenStr = objectInput.readUTF();
		maXaStr = objectInput.readUTF();
		nam = objectInput.readInt();
		soDan = objectInput.readInt();
		tongSoHGD = objectInput.readInt();
		soHGDCoNhaTieu = objectInput.readInt();
		soHGDCoNhaTieuHVS = objectInput.readInt();
		soNhaTieuHVSXayMoi = objectInput.readInt();
		tiLeHGDCoNhaTieu = objectInput.readInt();
		tiLeHGDCoNhaTieuHVS = objectInput.readInt();
		tongSoTruongHoc = objectInput.readInt();
		soTruongHocHVS = objectInput.readInt();
		tongSoTramYTe = objectInput.readInt();
		soTramYTeHVS = objectInput.readInt();
		tiLeTruongHocHVS = objectInput.readInt();
		tiLeTramYTeHVS = objectInput.readInt();
		ketLuanVSTX = objectInput.readInt();
		ghiChu = objectInput.readUTF();
		baoCaoDLI = objectInput.readInt();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readInt();
		dangKyVSTX = objectInput.readInt();
		soNhaTieuHVSMoi = objectInput.readInt();
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

		if (maTinhStr == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTinhStr);
		}

		if (maHuyenStr == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maHuyenStr);
		}

		if (maXaStr == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maXaStr);
		}

		objectOutput.writeInt(nam);
		objectOutput.writeInt(soDan);
		objectOutput.writeInt(tongSoHGD);
		objectOutput.writeInt(soHGDCoNhaTieu);
		objectOutput.writeInt(soHGDCoNhaTieuHVS);
		objectOutput.writeInt(soNhaTieuHVSXayMoi);
		objectOutput.writeInt(tiLeHGDCoNhaTieu);
		objectOutput.writeInt(tiLeHGDCoNhaTieuHVS);
		objectOutput.writeInt(tongSoTruongHoc);
		objectOutput.writeInt(soTruongHocHVS);
		objectOutput.writeInt(tongSoTramYTe);
		objectOutput.writeInt(soTramYTeHVS);
		objectOutput.writeInt(tiLeTruongHocHVS);
		objectOutput.writeInt(tiLeTramYTeHVS);
		objectOutput.writeInt(ketLuanVSTX);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeInt(baoCaoDLI);
		objectOutput.writeLong(ngayTao);
		objectOutput.writeInt(idNguoiTao);
		objectOutput.writeInt(dangKyVSTX);
		objectOutput.writeInt(soNhaTieuHVSMoi);
	}

	public int id;
	public String maTinh;
	public String maHuyen;
	public String maXa;
	public String maTinhStr;
	public String maHuyenStr;
	public String maXaStr;
	public int nam;
	public int soDan;
	public int tongSoHGD;
	public int soHGDCoNhaTieu;
	public int soHGDCoNhaTieuHVS;
	public int soNhaTieuHVSXayMoi;
	public int tiLeHGDCoNhaTieu;
	public int tiLeHGDCoNhaTieuHVS;
	public int tongSoTruongHoc;
	public int soTruongHocHVS;
	public int tongSoTramYTe;
	public int soTramYTeHVS;
	public int tiLeTruongHocHVS;
	public int tiLeTramYTeHVS;
	public int ketLuanVSTX;
	public String ghiChu;
	public int baoCaoDLI;
	public long ngayTao;
	public int idNguoiTao;
	public int dangKyVSTX;
	public int soNhaTieuHVSMoi;
}