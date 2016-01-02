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

package vn.dtt.sol.ns.maungaunhien.dao.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MAUKIEMDEM in entity cache.
 *
 * @author khoa.vu
 * @see MAUKIEMDEM
 * @generated
 */
public class MAUKIEMDEMCacheModel implements CacheModel<MAUKIEMDEM>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

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
		sb.append(", tongSoHGD=");
		sb.append(tongSoHGD);
		sb.append(", soMauNgauNhien=");
		sb.append(soMauNgauNhien);
		sb.append(", soMauDuPhong=");
		sb.append(soMauDuPhong);
		sb.append(", tongSoMau=");
		sb.append(tongSoMau);
		sb.append(", soMauHVS=");
		sb.append(soMauHVS);
		sb.append(", soMauCoNhaTieu=");
		sb.append(soMauCoNhaTieu);
		sb.append(", soMauKiemDem=");
		sb.append(soMauKiemDem);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MAUKIEMDEM toEntityModel() {
		MAUKIEMDEMImpl maukiemdemImpl = new MAUKIEMDEMImpl();

		maukiemdemImpl.setId(id);

		if (maXa == null) {
			maukiemdemImpl.setMaXa(StringPool.BLANK);
		}
		else {
			maukiemdemImpl.setMaXa(maXa);
		}

		if (maTinh == null) {
			maukiemdemImpl.setMaTinh(StringPool.BLANK);
		}
		else {
			maukiemdemImpl.setMaTinh(maTinh);
		}

		if (maHuyen == null) {
			maukiemdemImpl.setMaHuyen(StringPool.BLANK);
		}
		else {
			maukiemdemImpl.setMaHuyen(maHuyen);
		}

		maukiemdemImpl.setNam(nam);
		maukiemdemImpl.setTongSoHGD(tongSoHGD);
		maukiemdemImpl.setSoMauNgauNhien(soMauNgauNhien);
		maukiemdemImpl.setSoMauDuPhong(soMauDuPhong);
		maukiemdemImpl.setTongSoMau(tongSoMau);
		maukiemdemImpl.setSoMauHVS(soMauHVS);
		maukiemdemImpl.setSoMauCoNhaTieu(soMauCoNhaTieu);
		maukiemdemImpl.setSoMauKiemDem(soMauKiemDem);

		if (ngayTao == Long.MIN_VALUE) {
			maukiemdemImpl.setNgayTao(null);
		}
		else {
			maukiemdemImpl.setNgayTao(new Date(ngayTao));
		}

		maukiemdemImpl.setUserId(userId);

		maukiemdemImpl.resetOriginalValues();

		return maukiemdemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maXa = objectInput.readUTF();
		maTinh = objectInput.readUTF();
		maHuyen = objectInput.readUTF();
		nam = objectInput.readInt();
		tongSoHGD = objectInput.readInt();
		soMauNgauNhien = objectInput.readInt();
		soMauDuPhong = objectInput.readInt();
		tongSoMau = objectInput.readInt();
		soMauHVS = objectInput.readInt();
		soMauCoNhaTieu = objectInput.readInt();
		soMauKiemDem = objectInput.readInt();
		ngayTao = objectInput.readLong();
		userId = objectInput.readLong();
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
		objectOutput.writeInt(tongSoHGD);
		objectOutput.writeInt(soMauNgauNhien);
		objectOutput.writeInt(soMauDuPhong);
		objectOutput.writeInt(tongSoMau);
		objectOutput.writeInt(soMauHVS);
		objectOutput.writeInt(soMauCoNhaTieu);
		objectOutput.writeInt(soMauKiemDem);
		objectOutput.writeLong(ngayTao);
		objectOutput.writeLong(userId);
	}

	public long id;
	public String maXa;
	public String maTinh;
	public String maHuyen;
	public int nam;
	public int tongSoHGD;
	public int soMauNgauNhien;
	public int soMauDuPhong;
	public int tongSoMau;
	public int soMauHVS;
	public int soMauCoNhaTieu;
	public int soMauKiemDem;
	public long ngayTao;
	public long userId;
}