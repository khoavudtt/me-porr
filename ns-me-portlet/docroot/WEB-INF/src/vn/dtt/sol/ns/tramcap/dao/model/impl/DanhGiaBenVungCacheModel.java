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

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DanhGiaBenVung in entity cache.
 *
 * @author khoa.vu
 * @see DanhGiaBenVung
 * @generated
 */
public class DanhGiaBenVungCacheModel implements CacheModel<DanhGiaBenVung>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tramCapNuocId=");
		sb.append(tramCapNuocId);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", trangThaiCapNuoc=");
		sb.append(trangThaiCapNuoc);
		sb.append(", congXuatThucTe=");
		sb.append(congXuatThucTe);
		sb.append(", tongDauNoiMoi=");
		sb.append(tongDauNoiMoi);
		sb.append(", tongDauNoiThucTe=");
		sb.append(tongDauNoiThucTe);
		sb.append(", soNguoiCapThucTe=");
		sb.append(soNguoiCapThucTe);
		sb.append(", nuocThatThoat=");
		sb.append(nuocThatThoat);
		sb.append(", nuocDatTieuChuan=");
		sb.append(nuocDatTieuChuan);
		sb.append(", nuocCoAsen=");
		sb.append(nuocCoAsen);
		sb.append(", tongChiPhi=");
		sb.append(tongChiPhi);
		sb.append(", tongDoanhThu=");
		sb.append(tongDoanhThu);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", idNguoiTao=");
		sb.append(idNguoiTao);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", ketQuaDanhGia=");
		sb.append(ketQuaDanhGia);
		sb.append(", baoCaoDLI=");
		sb.append(baoCaoDLI);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DanhGiaBenVung toEntityModel() {
		DanhGiaBenVungImpl danhGiaBenVungImpl = new DanhGiaBenVungImpl();

		danhGiaBenVungImpl.setId(id);
		danhGiaBenVungImpl.setTramCapNuocId(tramCapNuocId);
		danhGiaBenVungImpl.setNam(nam);
		danhGiaBenVungImpl.setTrangThaiCapNuoc(trangThaiCapNuoc);
		danhGiaBenVungImpl.setCongXuatThucTe(congXuatThucTe);
		danhGiaBenVungImpl.setTongDauNoiMoi(tongDauNoiMoi);
		danhGiaBenVungImpl.setTongDauNoiThucTe(tongDauNoiThucTe);
		danhGiaBenVungImpl.setSoNguoiCapThucTe(soNguoiCapThucTe);
		danhGiaBenVungImpl.setNuocThatThoat(nuocThatThoat);
		danhGiaBenVungImpl.setNuocDatTieuChuan(nuocDatTieuChuan);
		danhGiaBenVungImpl.setNuocCoAsen(nuocCoAsen);
		danhGiaBenVungImpl.setTongChiPhi(tongChiPhi);
		danhGiaBenVungImpl.setTongDoanhThu(tongDoanhThu);

		if (ngayTao == Long.MIN_VALUE) {
			danhGiaBenVungImpl.setNgayTao(null);
		}
		else {
			danhGiaBenVungImpl.setNgayTao(new Date(ngayTao));
		}

		danhGiaBenVungImpl.setIdNguoiTao(idNguoiTao);

		if (ghiChu == null) {
			danhGiaBenVungImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			danhGiaBenVungImpl.setGhiChu(ghiChu);
		}

		danhGiaBenVungImpl.setKetQuaDanhGia(ketQuaDanhGia);
		danhGiaBenVungImpl.setBaoCaoDLI(baoCaoDLI);

		danhGiaBenVungImpl.resetOriginalValues();

		return danhGiaBenVungImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		tramCapNuocId = objectInput.readInt();
		nam = objectInput.readInt();
		trangThaiCapNuoc = objectInput.readInt();
		congXuatThucTe = objectInput.readInt();
		tongDauNoiMoi = objectInput.readInt();
		tongDauNoiThucTe = objectInput.readInt();
		soNguoiCapThucTe = objectInput.readInt();
		nuocThatThoat = objectInput.readInt();
		nuocDatTieuChuan = objectInput.readInt();
		nuocCoAsen = objectInput.readInt();
		tongChiPhi = objectInput.readInt();
		tongDoanhThu = objectInput.readInt();
		ngayTao = objectInput.readLong();
		idNguoiTao = objectInput.readInt();
		ghiChu = objectInput.readUTF();
		ketQuaDanhGia = objectInput.readInt();
		baoCaoDLI = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(tramCapNuocId);
		objectOutput.writeInt(nam);
		objectOutput.writeInt(trangThaiCapNuoc);
		objectOutput.writeInt(congXuatThucTe);
		objectOutput.writeInt(tongDauNoiMoi);
		objectOutput.writeInt(tongDauNoiThucTe);
		objectOutput.writeInt(soNguoiCapThucTe);
		objectOutput.writeInt(nuocThatThoat);
		objectOutput.writeInt(nuocDatTieuChuan);
		objectOutput.writeInt(nuocCoAsen);
		objectOutput.writeInt(tongChiPhi);
		objectOutput.writeInt(tongDoanhThu);
		objectOutput.writeLong(ngayTao);
		objectOutput.writeInt(idNguoiTao);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeInt(ketQuaDanhGia);
		objectOutput.writeInt(baoCaoDLI);
	}

	public long id;
	public int tramCapNuocId;
	public int nam;
	public int trangThaiCapNuoc;
	public int congXuatThucTe;
	public int tongDauNoiMoi;
	public int tongDauNoiThucTe;
	public int soNguoiCapThucTe;
	public int nuocThatThoat;
	public int nuocDatTieuChuan;
	public int nuocCoAsen;
	public int tongChiPhi;
	public int tongDoanhThu;
	public long ngayTao;
	public int idNguoiTao;
	public String ghiChu;
	public int ketQuaDanhGia;
	public int baoCaoDLI;
}