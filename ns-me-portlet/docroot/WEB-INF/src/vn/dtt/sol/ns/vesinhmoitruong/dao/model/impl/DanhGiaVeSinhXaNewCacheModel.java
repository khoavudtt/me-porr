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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DanhGiaVeSinhXaNew in entity cache.
 *
 * @author BinhTH
 * @see DanhGiaVeSinhXaNew
 * @generated
 */
public class DanhGiaVeSinhXaNewCacheModel implements CacheModel<DanhGiaVeSinhXaNew>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maTinh=");
		sb.append(maTinh);
		sb.append(", maHuyen=");
		sb.append(maHuyen);
		sb.append(", maXa=");
		sb.append(maXa);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DanhGiaVeSinhXaNew toEntityModel() {
		DanhGiaVeSinhXaNewImpl danhGiaVeSinhXaNewImpl = new DanhGiaVeSinhXaNewImpl();

		danhGiaVeSinhXaNewImpl.setId(id);

		if (maTinh == null) {
			danhGiaVeSinhXaNewImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			danhGiaVeSinhXaNewImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			danhGiaVeSinhXaNewImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			danhGiaVeSinhXaNewImpl.setMaHuyen(maHuyen);
		}

		if (maXa == null) {
			danhGiaVeSinhXaNewImpl.setMaXa(StringPool.BLANK);
		}
		else {
			danhGiaVeSinhXaNewImpl.setMaXa(maXa);
		}

		danhGiaVeSinhXaNewImpl.setNam(nam);
		danhGiaVeSinhXaNewImpl.setSoDan(soDan);
		danhGiaVeSinhXaNewImpl.setTongSoHGD(tongSoHGD);
		danhGiaVeSinhXaNewImpl.setSoHGDCoNhaTieu(soHGDCoNhaTieu);
		danhGiaVeSinhXaNewImpl.setSoHGDCoNhaTieuHVS(soHGDCoNhaTieuHVS);
		danhGiaVeSinhXaNewImpl.setSoNhaTieuHVSXayMoi(soNhaTieuHVSXayMoi);
		danhGiaVeSinhXaNewImpl.setTiLeHGDCoNhaTieu(tiLeHGDCoNhaTieu);
		danhGiaVeSinhXaNewImpl.setTiLeHGDCoNhaTieuHVS(tiLeHGDCoNhaTieuHVS);
		danhGiaVeSinhXaNewImpl.setTongSoTruongHoc(tongSoTruongHoc);
		danhGiaVeSinhXaNewImpl.setSoTruongHocHVS(soTruongHocHVS);
		danhGiaVeSinhXaNewImpl.setTongSoTramYTe(tongSoTramYTe);
		danhGiaVeSinhXaNewImpl.setSoTramYTeHVS(soTramYTeHVS);
		danhGiaVeSinhXaNewImpl.setTiLeTruongHocHVS(tiLeTruongHocHVS);
		danhGiaVeSinhXaNewImpl.setTiLeTramYTeHVS(tiLeTramYTeHVS);
		danhGiaVeSinhXaNewImpl.setKetLuanVSTX(ketLuanVSTX);

		if (ghiChu == null) {
			danhGiaVeSinhXaNewImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			danhGiaVeSinhXaNewImpl.setGhiChu(ghiChu);
		}

		danhGiaVeSinhXaNewImpl.setBaoCaoDLI(baoCaoDLI);

		if (ngayTao == Long.MIN_VALUE) {
			danhGiaVeSinhXaNewImpl.setNgayTao(null);
		}
		else {
			danhGiaVeSinhXaNewImpl.setNgayTao(new Date(ngayTao));
		}

		danhGiaVeSinhXaNewImpl.setIdNguoiTao(idNguoiTao);

		danhGiaVeSinhXaNewImpl.resetOriginalValues();

		return danhGiaVeSinhXaNewImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		maXa = objectInput.readUTF();
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
	}

	public int id;
	public String maTinh;
	public String maHuyen;
	public String maXa;
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
}