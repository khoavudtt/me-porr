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

package vn.dtt.sol.ns.tramcap.dao.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;
import vn.dtt.sol.ns.tramcap.dao.service.base.THONGTINKIEMDEMNUOCLocalServiceBaseImpl;

/**
 * The implementation of the t h o n g t i n k i e m d e m n u o c local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.sol.ns.tramcap.dao.service.base.THONGTINKIEMDEMNUOCLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil
 */
public class THONGTINKIEMDEMNUOCLocalServiceImpl
	extends THONGTINKIEMDEMNUOCLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil} to access the t h o n g t i n k i e m d e m n u o c local service.
	 */
	public List<THONGTINKIEMDEMNUOC> getListByDauNoiId(long dauNoiNuocId, int start, int end) throws SystemException {
		return thongtinkiemdemnuocPersistence.findByD_dauNoiNuocId(dauNoiNuocId, start, end);
	}
	public List<THONGTINKIEMDEMNUOC> getListBykeHoachKiemDemNuocId(int keHoachKiemDemNuocId, int start, int end) throws SystemException {
		return thongtinkiemdemnuocPersistence.findByD_keHoachKiemDemNuocId(keHoachKiemDemNuocId,start,end);
	}
	public List<THONGTINKIEMDEMNUOC> getThongTinKeHoachKiemDemNuocSearch(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa,String nguonDL, String danhGiaKiemDem,int start,int end) throws SystemException {
		return dauNoiNuocFinder.getThongTinKeHoachKiemDemNuocSearch(keHoachId,trangThai,maTinh,maHuyen,maXa,nguonDL,danhGiaKiemDem,start,end);
	}
	public List<String> getHuyenXaKeHoachKiemDemNuocSearch(String keHoachId,String trangThai,String maTinh,int start,int end) throws SystemException {
		return dauNoiNuocFinder.getHuyenXaKeHoachKiemDemNuocSearch(keHoachId,trangThai,maTinh,start,end);
	}
	
	public int getSumDauNoiBykeHoachKiemDemNuocId(int keHoachKiemDemNuocId) throws SystemException {
		return thongtinkiemdemnuocPersistence.findBy_CountDauNoiByKeHoach(keHoachKiemDemNuocId).size();
	}
	
	public int getCountDauNoiBykeHoachKiemDemNuocId(int keHoachKiemDemNuocId, int daKetThucDieuTra) throws SystemException {
		return thongtinkiemdemnuocPersistence.findByD_keHoachKiemDemNuocId_daKetThucDieuTra(keHoachKiemDemNuocId,daKetThucDieuTra).size();
	}
	public int getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem(int keHoachKiemDemNuocId, int danhGiaKiemDem) throws SystemException {
		return thongtinkiemdemnuocPersistence.findByD_keHoachKiemDemNuocId_danhGiaKiemDem(keHoachKiemDemNuocId, danhGiaKiemDem).size();
	}
	
	
	public List<THONGTINKIEMDEMNUOC> getThongTinDNNThoiGianThuc(String maTinh, String namBaoCao, String danhgiakiemdem) throws SystemException {
		return thongtinkiemdemnuocFinder.getThongTinDNNThoiGianThuc(maTinh,namBaoCao,danhgiakiemdem);
	}
	
	public List<THONGTINKIEMDEMNUOC> getThongTinKeHoachKiemDemNuocSearch(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa,String nguonDL, String danhGiaKiemDem, String advText,int start,int end) throws SystemException {
		return dauNoiNuocFinder.getThongTinKeHoachKiemDemNuocSearch(keHoachId,trangThai,maTinh,maHuyen,maXa,nguonDL,danhGiaKiemDem, advText,start,end);
	}
	public int countGioiTinhChuHo(String maTinh, String namBaoCao, String gioiTinhChuHo, String danhGiaKiemDem) {
		return thongtinkiemdemnuocFinder.countGioiTinhChuHo( maTinh,  namBaoCao,  gioiTinhChuHo,  danhGiaKiemDem);
	}
}