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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ChiTietKiemDemCongTrinh in entity cache.
 *
 * @author BinhTH
 * @see ChiTietKiemDemCongTrinh
 * @generated
 */
public class ChiTietKiemDemCongTrinhCacheModel implements CacheModel<ChiTietKiemDemCongTrinh>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thongTinKiemDemCongTrinhId=");
		sb.append(thongTinKiemDemCongTrinhId);
		sb.append(", soHoTieu=");
		sb.append(soHoTieu);
		sb.append(", loaiNhaTieu=");
		sb.append(loaiNhaTieu);
		sb.append(", anhToanCanh=");
		sb.append(anhToanCanh);
		sb.append(", anhTrongNhaTieu=");
		sb.append(anhTrongNhaTieu);
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
		sb.append(", coCongTrinhRuaTay=");
		sb.append(coCongTrinhRuaTay);
		sb.append(", chiTietCongTrinhRuaTay=");
		sb.append(chiTietCongTrinhRuaTay);
		sb.append(", anhBeChua=");
		sb.append(anhBeChua);
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
		sb.append(", tenCongTrinh=");
		sb.append(tenCongTrinh);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ChiTietKiemDemCongTrinh toEntityModel() {
		ChiTietKiemDemCongTrinhImpl chiTietKiemDemCongTrinhImpl = new ChiTietKiemDemCongTrinhImpl();

		chiTietKiemDemCongTrinhImpl.setId(id);
		chiTietKiemDemCongTrinhImpl.setThongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId);
		chiTietKiemDemCongTrinhImpl.setSoHoTieu(soHoTieu);

		if (loaiNhaTieu == null) {
			chiTietKiemDemCongTrinhImpl.setLoaiNhaTieu(StringPool.BLANK);
		}
		else {
			chiTietKiemDemCongTrinhImpl.setLoaiNhaTieu(loaiNhaTieu);
		}

		if (anhToanCanh == null) {
			chiTietKiemDemCongTrinhImpl.setAnhToanCanh(StringPool.BLANK);
		}
		else {
			chiTietKiemDemCongTrinhImpl.setAnhToanCanh(anhToanCanh);
		}

		if (anhTrongNhaTieu == null) {
			chiTietKiemDemCongTrinhImpl.setAnhTrongNhaTieu(StringPool.BLANK);
		}
		else {
			chiTietKiemDemCongTrinhImpl.setAnhTrongNhaTieu(anhTrongNhaTieu);
		}

		chiTietKiemDemCongTrinhImpl.setVeSinhSachSe(veSinhSachSe);
		chiTietKiemDemCongTrinhImpl.setDeLamVeSinh(deLamVeSinh);
		chiTietKiemDemCongTrinhImpl.setMuiVeSinh(muiVeSinh);
		chiTietKiemDemCongTrinhImpl.setPhiaTrenKinDao(phiaTrenKinDao);
		chiTietKiemDemCongTrinhImpl.setDuCheMuaGio(duCheMuaGio);
		chiTietKiemDemCongTrinhImpl.setSanCaoTrenToiThieu(sanCaoTrenToiThieu);
		chiTietKiemDemCongTrinhImpl.setCoCongTrinhRuaTay(coCongTrinhRuaTay);

		if (chiTietCongTrinhRuaTay == null) {
			chiTietKiemDemCongTrinhImpl.setChiTietCongTrinhRuaTay(StringPool.BLANK);
		}
		else {
			chiTietKiemDemCongTrinhImpl.setChiTietCongTrinhRuaTay(chiTietCongTrinhRuaTay);
		}

		if (anhBeChua == null) {
			chiTietKiemDemCongTrinhImpl.setAnhBeChua(StringPool.BLANK);
		}
		else {
			chiTietKiemDemCongTrinhImpl.setAnhBeChua(anhBeChua);
		}

		chiTietKiemDemCongTrinhImpl.setNapBeConTot(napBeConTot);
		chiTietKiemDemCongTrinhImpl.setCuaPhanBitKin(cuaPhanBitKin);
		chiTietKiemDemCongTrinhImpl.setTranRaNgoai(tranRaNgoai);
		chiTietKiemDemCongTrinhImpl.setNuocThaiDiDau(nuocThaiDiDau);
		chiTietKiemDemCongTrinhImpl.setKhoangCachNguonNuoc(khoangCachNguonNuoc);
		chiTietKiemDemCongTrinhImpl.setNgapKhiMuaLon(ngapKhiMuaLon);

		if (tenCongTrinh == null) {
			chiTietKiemDemCongTrinhImpl.setTenCongTrinh(StringPool.BLANK);
		}
		else {
			chiTietKiemDemCongTrinhImpl.setTenCongTrinh(tenCongTrinh);
		}

		chiTietKiemDemCongTrinhImpl.resetOriginalValues();

		return chiTietKiemDemCongTrinhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		thongTinKiemDemCongTrinhId = objectInput.readInt();
		soHoTieu = objectInput.readInt();
		loaiNhaTieu = objectInput.readUTF();
		anhToanCanh = objectInput.readUTF();
		anhTrongNhaTieu = objectInput.readUTF();
		veSinhSachSe = objectInput.readInt();
		deLamVeSinh = objectInput.readInt();
		muiVeSinh = objectInput.readInt();
		phiaTrenKinDao = objectInput.readInt();
		duCheMuaGio = objectInput.readInt();
		sanCaoTrenToiThieu = objectInput.readInt();
		coCongTrinhRuaTay = objectInput.readInt();
		chiTietCongTrinhRuaTay = objectInput.readUTF();
		anhBeChua = objectInput.readUTF();
		napBeConTot = objectInput.readInt();
		cuaPhanBitKin = objectInput.readInt();
		tranRaNgoai = objectInput.readInt();
		nuocThaiDiDau = objectInput.readInt();
		khoangCachNguonNuoc = objectInput.readInt();
		ngapKhiMuaLon = objectInput.readInt();
		tenCongTrinh = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);
		objectOutput.writeInt(thongTinKiemDemCongTrinhId);
		objectOutput.writeInt(soHoTieu);

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

		objectOutput.writeInt(veSinhSachSe);
		objectOutput.writeInt(deLamVeSinh);
		objectOutput.writeInt(muiVeSinh);
		objectOutput.writeInt(phiaTrenKinDao);
		objectOutput.writeInt(duCheMuaGio);
		objectOutput.writeInt(sanCaoTrenToiThieu);
		objectOutput.writeInt(coCongTrinhRuaTay);

		if (chiTietCongTrinhRuaTay == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chiTietCongTrinhRuaTay);
		}

		if (anhBeChua == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(anhBeChua);
		}

		objectOutput.writeInt(napBeConTot);
		objectOutput.writeInt(cuaPhanBitKin);
		objectOutput.writeInt(tranRaNgoai);
		objectOutput.writeInt(nuocThaiDiDau);
		objectOutput.writeInt(khoangCachNguonNuoc);
		objectOutput.writeInt(ngapKhiMuaLon);

		if (tenCongTrinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenCongTrinh);
		}
	}

	public int id;
	public int thongTinKiemDemCongTrinhId;
	public int soHoTieu;
	public String loaiNhaTieu;
	public String anhToanCanh;
	public String anhTrongNhaTieu;
	public int veSinhSachSe;
	public int deLamVeSinh;
	public int muiVeSinh;
	public int phiaTrenKinDao;
	public int duCheMuaGio;
	public int sanCaoTrenToiThieu;
	public int coCongTrinhRuaTay;
	public String chiTietCongTrinhRuaTay;
	public String anhBeChua;
	public int napBeConTot;
	public int cuaPhanBitKin;
	public int tranRaNgoai;
	public int nuocThaiDiDau;
	public int khoangCachNguonNuoc;
	public int ngapKhiMuaLon;
	public String tenCongTrinh;
}