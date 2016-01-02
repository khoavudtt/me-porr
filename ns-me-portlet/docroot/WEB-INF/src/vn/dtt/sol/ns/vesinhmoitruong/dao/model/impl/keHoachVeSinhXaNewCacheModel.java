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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.keHoachVeSinhXaNew;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing keHoachVeSinhXaNew in entity cache.
 *
 * @author BinhTH
 * @see keHoachVeSinhXaNew
 * @generated
 */
public class keHoachVeSinhXaNewCacheModel implements CacheModel<keHoachVeSinhXaNew>,
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
	public keHoachVeSinhXaNew toEntityModel() {
		keHoachVeSinhXaNewImpl keHoachVeSinhXaNewImpl = new keHoachVeSinhXaNewImpl();

		keHoachVeSinhXaNewImpl.setId(id);

		if (maTinh == null) {
			keHoachVeSinhXaNewImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			keHoachVeSinhXaNewImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			keHoachVeSinhXaNewImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			keHoachVeSinhXaNewImpl.setMaHuyen(maHuyen);
		}

		if (maXa == null) {
			keHoachVeSinhXaNewImpl.setMaXa(StringPool.BLANK);
		}
		else {
			keHoachVeSinhXaNewImpl.setMaXa(maXa);
		}

		keHoachVeSinhXaNewImpl.setNam(nam);
		keHoachVeSinhXaNewImpl.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		keHoachVeSinhXaNewImpl.setSoDan(soDan);
		keHoachVeSinhXaNewImpl.setDangKyVSTX(dangKyVSTX);

		if (ghiChu == null) {
			keHoachVeSinhXaNewImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			keHoachVeSinhXaNewImpl.setGhiChu(ghiChu);
		}

		keHoachVeSinhXaNewImpl.setBaoCaoDLI(baoCaoDLI);

		if (ngayTao == Long.MIN_VALUE) {
			keHoachVeSinhXaNewImpl.setNgayTao(null);
		}
		else {
			keHoachVeSinhXaNewImpl.setNgayTao(new Date(ngayTao));
		}

		keHoachVeSinhXaNewImpl.setIdNguoiTao(idNguoiTao);

		keHoachVeSinhXaNewImpl.resetOriginalValues();

		return keHoachVeSinhXaNewImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		maXa = objectInput.readUTF();
		nam = objectInput.readInt();
		soNhaTieuHVSMoi = objectInput.readInt();
		soDan = objectInput.readInt();
		dangKyVSTX = objectInput.readInt();
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
		objectOutput.writeInt(soNhaTieuHVSMoi);
		objectOutput.writeInt(soDan);
		objectOutput.writeInt(dangKyVSTX);

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
	public int soNhaTieuHVSMoi;
	public int soDan;
	public int dangKyVSTX;
	public String ghiChu;
	public int baoCaoDLI;
	public long ngayTao;
	public int idNguoiTao;
}