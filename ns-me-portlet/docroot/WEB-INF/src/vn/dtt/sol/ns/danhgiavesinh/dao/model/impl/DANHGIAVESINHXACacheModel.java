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

package vn.dtt.sol.ns.danhgiavesinh.dao.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.sol.ns.danhgiavesinh.dao.model.DANHGIAVESINHXA;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DANHGIAVESINHXA in entity cache.
 *
 * @author khoa.vu
 * @see DANHGIAVESINHXA
 * @generated
 */
public class DANHGIAVESINHXACacheModel implements CacheModel<DANHGIAVESINHXA>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maXa=");
		sb.append(maXa);
		sb.append(", maTinh=");
		sb.append(maTinh);
		sb.append(", maHuyen=");
		sb.append(maHuyen);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", soDan=");
		sb.append(soDan);
		sb.append(", tiLeHGDCoNhaTieu=");
		sb.append(tiLeHGDCoNhaTieu);
		sb.append(", tiLeHGDCoNhaTieuHVS=");
		sb.append(tiLeHGDCoNhaTieuHVS);
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
	public DANHGIAVESINHXA toEntityModel() {
		DANHGIAVESINHXAImpl danhgiavesinhxaImpl = new DANHGIAVESINHXAImpl();

		danhgiavesinhxaImpl.setId(id);

		if (maXa == null) {
			danhgiavesinhxaImpl.setMaXa(StringPool.BLANK);
		}
		else {
			danhgiavesinhxaImpl.setMaXa(maXa);
		}

		if (maTinh == null) {
			danhgiavesinhxaImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			danhgiavesinhxaImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			danhgiavesinhxaImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			danhgiavesinhxaImpl.setMaHuyen(maHuyen);
		}

		danhgiavesinhxaImpl.setNam(nam);
		danhgiavesinhxaImpl.setSoDan(soDan);
		danhgiavesinhxaImpl.setTiLeHGDCoNhaTieu(tiLeHGDCoNhaTieu);
		danhgiavesinhxaImpl.setTiLeHGDCoNhaTieuHVS(tiLeHGDCoNhaTieuHVS);
		danhgiavesinhxaImpl.setTiLeTruongHocHVS(tiLeTruongHocHVS);
		danhgiavesinhxaImpl.setTiLeTramYTeHVS(tiLeTramYTeHVS);
		danhgiavesinhxaImpl.setKetLuanVSTX(ketLuanVSTX);
		danhgiavesinhxaImpl.setGhiChu(ghiChu);
		danhgiavesinhxaImpl.setBaoCaoDLI(baoCaoDLI);

		if (ngayTao == Long.MIN_VALUE) {
			danhgiavesinhxaImpl.setNgayTao(null);
		}
		else {
			danhgiavesinhxaImpl.setNgayTao(new Date(ngayTao));
		}

		danhgiavesinhxaImpl.setIdNguoiTao(idNguoiTao);

		danhgiavesinhxaImpl.resetOriginalValues();

		return danhgiavesinhxaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maXa = objectInput.readUTF();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		nam = objectInput.readInt();
		soDan = objectInput.readInt();
		tiLeHGDCoNhaTieu = objectInput.readInt();
		tiLeHGDCoNhaTieuHVS = objectInput.readInt();
		tiLeTruongHocHVS = objectInput.readInt();
		tiLeTramYTeHVS = objectInput.readInt();
		ketLuanVSTX = objectInput.readInt();
		ghiChu = objectInput.readLong();
		baoCaoDLI = objectInput.readInt();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (maXa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maXa);
		}

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

		objectOutput.writeInt(nam);
		objectOutput.writeInt(soDan);
		objectOutput.writeInt(tiLeHGDCoNhaTieu);
		objectOutput.writeInt(tiLeHGDCoNhaTieuHVS);
		objectOutput.writeInt(tiLeTruongHocHVS);
		objectOutput.writeInt(tiLeTramYTeHVS);
		objectOutput.writeInt(ketLuanVSTX);
		objectOutput.writeLong(ghiChu);
		objectOutput.writeInt(baoCaoDLI);
		objectOutput.writeLong(ngayTao);
		objectOutput.writeLong(idNguoiTao);
	}

	public long id;
	public String maXa;
	public String maTinh;
	public String maHuyen;
	public int nam;
	public int soDan;
	public int tiLeHGDCoNhaTieu;
	public int tiLeHGDCoNhaTieuHVS;
	public int tiLeTruongHocHVS;
	public int tiLeTramYTeHVS;
	public int ketLuanVSTX;
	public long ghiChu;
	public int baoCaoDLI;
	public long ngayTao;
	public long idNguoiTao;
}