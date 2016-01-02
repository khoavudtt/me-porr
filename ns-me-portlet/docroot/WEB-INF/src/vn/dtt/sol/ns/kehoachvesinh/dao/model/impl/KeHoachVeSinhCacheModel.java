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

package vn.dtt.sol.ns.kehoachvesinh.dao.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing KeHoachVeSinh in entity cache.
 *
 * @author HANT
 * @see KeHoachVeSinh
 * @generated
 */
public class KeHoachVeSinhCacheModel implements CacheModel<KeHoachVeSinh>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

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
		sb.append(", soNhaTieuHVSMoi=");
		sb.append(soNhaTieuHVSMoi);
		sb.append(", soDan=");
		sb.append(soDan);
		sb.append(", dangKyVSTX=");
		sb.append(dangKyVSTX);
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
	public KeHoachVeSinh toEntityModel() {
		KeHoachVeSinhImpl keHoachVeSinhImpl = new KeHoachVeSinhImpl();

		keHoachVeSinhImpl.setId(id);

		if (maTinh == null) {
			keHoachVeSinhImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			keHoachVeSinhImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			keHoachVeSinhImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			keHoachVeSinhImpl.setMaHuyen(maHuyen);
		}

		if (maXa == null) {
			keHoachVeSinhImpl.setMaXa(StringPool.BLANK);
		}
		else {
			keHoachVeSinhImpl.setMaXa(maXa);
		}

		keHoachVeSinhImpl.setNam(nam);
		keHoachVeSinhImpl.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		keHoachVeSinhImpl.setSoDan(soDan);
		keHoachVeSinhImpl.setDangKyVSTX(dangKyVSTX);

		if (ghiChu == null) {
			keHoachVeSinhImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			keHoachVeSinhImpl.setGhiChu(ghiChu);
		}

		keHoachVeSinhImpl.setBaoCaoDLI(baoCaoDLI);

		if (ngayTao == Long.MIN_VALUE) {
			keHoachVeSinhImpl.setNgayTao(null);
		}
		else {
			keHoachVeSinhImpl.setNgayTao(new Date(ngayTao));
		}

		keHoachVeSinhImpl.setIdNguoiTao(idNguoiTao);

		keHoachVeSinhImpl.resetOriginalValues();

		return keHoachVeSinhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		maXa = objectInput.readUTF();
		nam = objectInput.readLong();
		soNhaTieuHVSMoi = objectInput.readLong();
		soDan = objectInput.readLong();
		dangKyVSTX = objectInput.readLong();
		ghiChu = objectInput.readUTF();
		baoCaoDLI = objectInput.readLong();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readLong();
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

		objectOutput.writeLong(nam);
		objectOutput.writeLong(soNhaTieuHVSMoi);
		objectOutput.writeLong(soDan);
		objectOutput.writeLong(dangKyVSTX);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeLong(baoCaoDLI);
		objectOutput.writeLong(ngayTao);
		objectOutput.writeLong(idNguoiTao);
	}

	public long id;
	public String maTinh;
	public String maHuyen;
	public String maXa;
	public long nam;
	public long soNhaTieuHVSMoi;
	public long soDan;
	public long dangKyVSTX;
	public String ghiChu;
	public long baoCaoDLI;
	public long ngayTao;
	public long idNguoiTao;
}