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

package vn.dtt.sol.ns.baocaodli.dao.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BaoCaoDLITongHop in entity cache.
 *
 * @author HuyMQ
 * @see BaoCaoDLITongHop
 * @generated
 */
public class BaoCaoDLITongHopCacheModel implements CacheModel<BaoCaoDLITongHop>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maTinh=");
		sb.append(maTinh);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", soDauNoiTheoKeHoach=");
		sb.append(soDauNoiTheoKeHoach);
		sb.append(", soDauNoiMoi=");
		sb.append(soDauNoiMoi);
		sb.append(", soNhaTieuHVSTheoKH=");
		sb.append(soNhaTieuHVSTheoKH);
		sb.append(", soNhaTieuHVSMoi=");
		sb.append(soNhaTieuHVSMoi);
		sb.append(", soNguoiHuongLoiNuocSach=");
		sb.append(soNguoiHuongLoiNuocSach);
		sb.append(", soXa=");
		sb.append(soXa);
		sb.append(", tiLeHGDCoNhaTieu=");
		sb.append(tiLeHGDCoNhaTieu);
		sb.append(", tiLeHGDCoNhaTieuHVS=");
		sb.append(tiLeHGDCoNhaTieuHVS);
		sb.append(", tiLeTruongHocHVS=");
		sb.append(tiLeTruongHocHVS);
		sb.append(", tiLeTramYTeHVS=");
		sb.append(tiLeTramYTeHVS);
		sb.append(", soNguoiHuongLoiVSTX=");
		sb.append(soNguoiHuongLoiVSTX);
		sb.append(", keHoachPheDuyet=");
		sb.append(keHoachPheDuyet);
		sb.append(", ngayDuyetKeHoach=");
		sb.append(ngayDuyetKeHoach);
		sb.append(", baoCaoChuongTrinh=");
		sb.append(baoCaoChuongTrinh);
		sb.append(", ngayDangTai=");
		sb.append(ngayDangTai);
		sb.append(", nguoiLap=");
		sb.append(nguoiLap);
		sb.append(", nguoiDuyet=");
		sb.append(nguoiDuyet);
		sb.append(", soBaoCao=");
		sb.append(soBaoCao);
		sb.append(", ngayBaoCao=");
		sb.append(ngayBaoCao);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", luuTruPdfTH=");
		sb.append(luuTruPdfTH);
		sb.append(", luuTruPdf=");
		sb.append(luuTruPdf);
		sb.append(", luuTruCsv=");
		sb.append(luuTruCsv);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BaoCaoDLITongHop toEntityModel() {
		BaoCaoDLITongHopImpl baoCaoDLITongHopImpl = new BaoCaoDLITongHopImpl();

		baoCaoDLITongHopImpl.setId(id);

		if (maTinh == null) {
			baoCaoDLITongHopImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			baoCaoDLITongHopImpl.setMaTinh(maTinh);
		}

		baoCaoDLITongHopImpl.setNam(nam);
		baoCaoDLITongHopImpl.setSoDauNoiTheoKeHoach(soDauNoiTheoKeHoach);
		baoCaoDLITongHopImpl.setSoDauNoiMoi(soDauNoiMoi);
		baoCaoDLITongHopImpl.setSoNhaTieuHVSTheoKH(soNhaTieuHVSTheoKH);
		baoCaoDLITongHopImpl.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		baoCaoDLITongHopImpl.setSoNguoiHuongLoiNuocSach(soNguoiHuongLoiNuocSach);
		baoCaoDLITongHopImpl.setSoXa(soXa);
		baoCaoDLITongHopImpl.setTiLeHGDCoNhaTieu(tiLeHGDCoNhaTieu);
		baoCaoDLITongHopImpl.setTiLeHGDCoNhaTieuHVS(tiLeHGDCoNhaTieuHVS);
		baoCaoDLITongHopImpl.setTiLeTruongHocHVS(tiLeTruongHocHVS);
		baoCaoDLITongHopImpl.setTiLeTramYTeHVS(tiLeTramYTeHVS);
		baoCaoDLITongHopImpl.setSoNguoiHuongLoiVSTX(soNguoiHuongLoiVSTX);

		if (keHoachPheDuyet == null) {
			baoCaoDLITongHopImpl.setKeHoachPheDuyet(StringPool.BLANK);
		}
		else {
			baoCaoDLITongHopImpl.setKeHoachPheDuyet(keHoachPheDuyet);
		}

		if (ngayDuyetKeHoach == Long.MIN_VALUE) {
			baoCaoDLITongHopImpl.setNgayDuyetKeHoach(null);
		}
		else {
			baoCaoDLITongHopImpl.setNgayDuyetKeHoach(new Date(ngayDuyetKeHoach));
		}

		if (baoCaoChuongTrinh == null) {
			baoCaoDLITongHopImpl.setBaoCaoChuongTrinh(StringPool.BLANK);
		}
		else {
			baoCaoDLITongHopImpl.setBaoCaoChuongTrinh(baoCaoChuongTrinh);
		}

		if (ngayDangTai == Long.MIN_VALUE) {
			baoCaoDLITongHopImpl.setNgayDangTai(null);
		}
		else {
			baoCaoDLITongHopImpl.setNgayDangTai(new Date(ngayDangTai));
		}

		if (nguoiLap == null) {
			baoCaoDLITongHopImpl.setNguoiLap(StringPool.BLANK);
		}
		else {
			baoCaoDLITongHopImpl.setNguoiLap(nguoiLap);
		}

		if (nguoiDuyet == null) {
			baoCaoDLITongHopImpl.setNguoiDuyet(StringPool.BLANK);
		}
		else {
			baoCaoDLITongHopImpl.setNguoiDuyet(nguoiDuyet);
		}

		if (soBaoCao == null) {
			baoCaoDLITongHopImpl.setSoBaoCao(StringPool.BLANK);
		}
		else {
			baoCaoDLITongHopImpl.setSoBaoCao(soBaoCao);
		}

		if (ngayBaoCao == Long.MIN_VALUE) {
			baoCaoDLITongHopImpl.setNgayBaoCao(null);
		}
		else {
			baoCaoDLITongHopImpl.setNgayBaoCao(new Date(ngayBaoCao));
		}

		baoCaoDLITongHopImpl.setTrangThai(trangThai);
		baoCaoDLITongHopImpl.setLuuTruPdfTH(luuTruPdfTH);
		baoCaoDLITongHopImpl.setLuuTruPdf(luuTruPdf);
		baoCaoDLITongHopImpl.setLuuTruCsv(luuTruCsv);

		baoCaoDLITongHopImpl.resetOriginalValues();

		return baoCaoDLITongHopImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maTinh = objectInput.readUTF();
		nam = objectInput.readInt();
		soDauNoiTheoKeHoach = objectInput.readInt();
		soDauNoiMoi = objectInput.readInt();
		soNhaTieuHVSTheoKH = objectInput.readInt();
		soNhaTieuHVSMoi = objectInput.readInt();
		soNguoiHuongLoiNuocSach = objectInput.readInt();
		soXa = objectInput.readInt();
		tiLeHGDCoNhaTieu = objectInput.readInt();
		tiLeHGDCoNhaTieuHVS = objectInput.readInt();
		tiLeTruongHocHVS = objectInput.readInt();
		tiLeTramYTeHVS = objectInput.readInt();
		soNguoiHuongLoiVSTX = objectInput.readInt();
		keHoachPheDuyet = objectInput.readUTF();
		ngayDuyetKeHoach = objectInput.readLong();
		baoCaoChuongTrinh = objectInput.readUTF();
		ngayDangTai = objectInput.readLong();
		nguoiLap = objectInput.readUTF();
		nguoiDuyet = objectInput.readUTF();
		soBaoCao = objectInput.readUTF();
		ngayBaoCao = objectInput.readLong();
		trangThai = objectInput.readInt();
		luuTruPdfTH = objectInput.readInt();
		luuTruPdf = objectInput.readInt();
		luuTruCsv = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maTinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maTinh);
		}

		objectOutput.writeInt(nam);
		objectOutput.writeInt(soDauNoiTheoKeHoach);
		objectOutput.writeInt(soDauNoiMoi);
		objectOutput.writeInt(soNhaTieuHVSTheoKH);
		objectOutput.writeInt(soNhaTieuHVSMoi);
		objectOutput.writeInt(soNguoiHuongLoiNuocSach);
		objectOutput.writeInt(soXa);
		objectOutput.writeInt(tiLeHGDCoNhaTieu);
		objectOutput.writeInt(tiLeHGDCoNhaTieuHVS);
		objectOutput.writeInt(tiLeTruongHocHVS);
		objectOutput.writeInt(tiLeTramYTeHVS);
		objectOutput.writeInt(soNguoiHuongLoiVSTX);

		if (keHoachPheDuyet == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(keHoachPheDuyet);
		}

		objectOutput.writeLong(ngayDuyetKeHoach);

		if (baoCaoChuongTrinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(baoCaoChuongTrinh);
		}

		objectOutput.writeLong(ngayDangTai);

		if (nguoiLap == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nguoiLap);
		}

		if (nguoiDuyet == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nguoiDuyet);
		}

		if (soBaoCao == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soBaoCao);
		}

		objectOutput.writeLong(ngayBaoCao);
		objectOutput.writeInt(trangThai);
		objectOutput.writeInt(luuTruPdfTH);
		objectOutput.writeInt(luuTruPdf);
		objectOutput.writeInt(luuTruCsv);
	}

	public long id;
	public String maTinh;
	public int nam;
	public int soDauNoiTheoKeHoach;
	public int soDauNoiMoi;
	public int soNhaTieuHVSTheoKH;
	public int soNhaTieuHVSMoi;
	public int soNguoiHuongLoiNuocSach;
	public int soXa;
	public int tiLeHGDCoNhaTieu;
	public int tiLeHGDCoNhaTieuHVS;
	public int tiLeTruongHocHVS;
	public int tiLeTramYTeHVS;
	public int soNguoiHuongLoiVSTX;
	public String keHoachPheDuyet;
	public long ngayDuyetKeHoach;
	public String baoCaoChuongTrinh;
	public long ngayDangTai;
	public String nguoiLap;
	public String nguoiDuyet;
	public String soBaoCao;
	public long ngayBaoCao;
	public int trangThai;
	public int luuTruPdfTH;
	public int luuTruPdf;
	public int luuTruCsv;
}