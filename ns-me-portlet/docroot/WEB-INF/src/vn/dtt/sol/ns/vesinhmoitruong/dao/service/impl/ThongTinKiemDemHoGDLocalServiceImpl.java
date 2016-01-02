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

package vn.dtt.sol.ns.vesinhmoitruong.dao.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.ThongTinKiemDemHoGDLocalServiceBaseImpl;

/**
 * The implementation of the thong tin kiem dem ho g d local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemHoGDLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author BinhTH
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.ThongTinKiemDemHoGDLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemHoGDLocalServiceUtil
 */
public class ThongTinKiemDemHoGDLocalServiceImpl
	extends ThongTinKiemDemHoGDLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemHoGDLocalServiceUtil} to access the thong tin kiem dem ho g d local service.
	 */
	public List<ThongTinKiemDemHoGD> getListThongTinKiemDemHoGiaDinhByGDID(int veSinhGiaDinhId, int start, int end) throws SystemException {
		return thongTinKiemDemHoGDPersistence.findBy_veSinhGiaDinhId(veSinhGiaDinhId, start, end);
	}
	public int getCountGiaDinhBykeHoachId(int keHoachKiemDemVeSinhId, int daKetThucDieuTra) throws SystemException {
		return thongTinKiemDemHoGDPersistence.findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId, daKetThucDieuTra).size();
	}
	public int getCountGiaDinhBykeHoachIdDanhGiaKiemDem(int keHoachKiemDemVeSinhId, int danhGiaKiemDem) throws SystemException {
		return thongTinKiemDemHoGDPersistence.findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId, danhGiaKiemDem).size();
	}
	public int getCountCoNhaVeSinh(int keHoachKiemDemVeSinhId) throws SystemException {
		return thongTinKiemDemHoGDPersistence.findBy_coNhaVeSinh(keHoachKiemDemVeSinhId).size();
	}
	public int getCountcoHVS(int keHoachKiemDemVeSinhId) throws SystemException {
		return thongTinKiemDemHoGDPersistence.findBy_coHVS(keHoachKiemDemVeSinhId).size();
	}
	public int getCountcoHVSXayMoi(int keHoachKiemDemVeSinhId) throws SystemException {
		return thongTinKiemDemHoGDPersistence.findBy_coHVSXayMoi(keHoachKiemDemVeSinhId).size();
	}
	public int getSumHDGBykeHoachKiemDemVsId(int keHoachKiemDemVeSinhId) throws SystemException {
		return thongTinKiemDemHoGDPersistence.findBy_CountHGDByKeHoach(keHoachKiemDemVeSinhId).size();
	}
	
	public List<ThongTinKiemDemHoGD> getThongTinKiemDemHGDThoiGianThucGroupBy(String maTinh, String namBaoCao, String danhgiakiemdem) throws SystemException {
		return thongTinKiemDemHoGDFinder.getThongTinKiemDemHGDThoiGianThucGroupBy(maTinh,namBaoCao,danhgiakiemdem);
	}
	
	public int countThongTinKiemDemHGDThoiGianThucGroupBy(String maTinh, String namBaoCao, String danhgiakiemdem, String maHuyen, String maXa) throws SystemException {
		return thongTinKiemDemHoGDFinder.countThongTinKiemDemHGDThoiGianThucGroupBy(maTinh,namBaoCao,danhgiakiemdem,maHuyen,maXa);
	}
	
	public List<ThongTinKiemDemHoGD> getThongTinKiemDemHGDThoiGianThuc(String maTinh, String namBaoCao, String danhgiakiemdem) throws SystemException {
		return thongTinKiemDemHoGDFinder.getThongTinKiemDemHGDThoiGianThuc(maTinh,namBaoCao,danhgiakiemdem);
	}
	
	public List<ThongTinKiemDemHoGD> getListThongTinKiemDemHoGiaDinhByKeHoachId(int keHoachId) throws SystemException {
		return thongTinKiemDemHoGDFinder.getListThongTinKiemDemHoGiaDinhByKeHoachId(keHoachId);
	}
	public int countGioiTinhChuHo(String maTinh, String namBaoCao, String gioiTinhChuHo, String danhGiaKiemDem) throws SystemException {
		return thongTinKiemDemHoGDFinder.countGioiTinhChuHo( maTinh,  namBaoCao,  gioiTinhChuHo,  danhGiaKiemDem);
	}
}