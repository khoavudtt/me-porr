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

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.service.base.DauNoiNuocLocalServiceBaseImpl;

/**
 * The implementation of the dau noi nuoc local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.sol.ns.tramcap.dao.service.base.DauNoiNuocLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil
 */
public class DauNoiNuocLocalServiceImpl extends DauNoiNuocLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil} to access
	 * the dau noi nuoc local service.
	 */
	
	public DauNoiNuoc addNamBaoCao(long id, int nambaocao) throws PortalException, SystemException {
		DauNoiNuoc daunoi = null;
		
		if (id > 0) {
			daunoi = dauNoiNuocPersistence.fetchByPrimaryKey(id);
			
			daunoi.setNamBaoCao(nambaocao);
			daunoi.setNgayDanhGia(new Date());
			
			dauNoiNuocPersistence.update(daunoi);
			
			dauNoiNuocPersistence.clearCache();
		}
		
		return daunoi;
	}
	

	/**
	 * @param tramCapId
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public int countSoNguoiHuongLoi(int tramCapId) throws PortalException,
			SystemException {
		
		List<DauNoiNuoc> ls = dauNoiNuocPersistence.findByT_(tramCapId);

		int count = 0;

		for (DauNoiNuoc dauNoi : ls) {
			count = count + dauNoi.getSoNguoiTrongHo();
		}
		
		return count;
	}

	public int countDauNoiByTram(int tramCapId) throws PortalException,
			SystemException {
		return dauNoiNuocPersistence.countByT_(tramCapId);
	}

	public int countDauNoiSearch(String maTinh, String maHuyen, String maXa,
			String tramCapNuocId, String trangThai, String namBaoCao)
			throws SystemException {
		return dauNoiNuocFinder.countDauNoiSearch(maTinh, maHuyen, maXa,
				tramCapNuocId, trangThai, namBaoCao);
	}

	public List<DauNoiNuoc> getDauNoiSearch(String maTinh, String maHuyen,
			String maXa, String tramCapNuocId, String trangThai,
			String namBaoCao, int start, int end) throws SystemException {
		return dauNoiNuocFinder.getDauNoiSearch(maTinh, maHuyen, maXa,
				tramCapNuocId, trangThai, namBaoCao, start, end);
	}

	public int countThongKeMenuLeft(String tableName, int initUserType,
			String orgCode) throws SystemException {
		return dauNoiNuocFinder.countThongKeMenuLeft(tableName, initUserType,
				orgCode);
	}

	public List<DauNoiNuoc> getDauNoiSearch(int tramCapNuocId,
			int idNguoiDanhGia, int start, int end) throws SystemException {
		return dauNoiNuocPersistence.findByT_tramCapNuocId_idNguoiDanhGia(
				tramCapNuocId, idNguoiDanhGia, start, end);
	}

	public List<DATAITEM> getDataItemSearch(String maTinh, String maHuyen,
			String maXa, int start, int end) throws SystemException {
		return dauNoiNuocFinder.getDataItemSearch(maTinh, maHuyen, maXa, start,
				end);
	}

	public List<DauNoiNuoc> getChkImport(int tramCapNuocId, String maTinh,
			String maHuyen, String maXa, String tenChuHo, int idNguoiTao)
			throws SystemException {
		return dauNoiNuocPersistence.findByT_CHK_Import(tramCapNuocId, maTinh,
				maHuyen, maXa, tenChuHo, idNguoiTao);
	}
	public List<DauNoiNuoc> getChkAddDauNoi(int tramCapNuocId, String maTinh,
			String maHuyen, String maXa, String thonXom, String tenChuHo) throws SystemException{
		return dauNoiNuocPersistence.findByT_CHK_ADDDAUNOI(tramCapNuocId, maTinh, maHuyen, maXa, thonXom, tenChuHo);
	}
	public int countDauNoiByMaTinhTramIdTrangThaiAndNam(String maTinh,String tramCapNuocId,String trangThai,String namBaoCao) {
		return dauNoiNuocFinder.countDauNoiByMaTinhTramIdTrangThaiAndNam(maTinh,tramCapNuocId,trangThai,namBaoCao);
	}
	public List<DauNoiNuoc> getDauNoiByMaTinhTramIdTrangThaiAndNam(String maTinh,String tramCapNuocId,String trangThai,String namBaoCao)  {
		return dauNoiNuocFinder.getDauNoiByMaTinhTramIdTrangThaiAndNam(maTinh,tramCapNuocId,trangThai,namBaoCao);
	}
	public List<DauNoiNuoc> getDauNoiByMaTinhTramIdTrangThaiAndNamThoiGianThuc(String maTinh,String danhgiakiemdem,String namBaoCao)  {
		return dauNoiNuocFinder.getDauNoiByMaTinhTramIdTrangThaiAndNamThoiGianThuc(maTinh,danhgiakiemdem,namBaoCao);
	}
	public int countDauNoiSearch(String maTinh, String maHuyen, String maXa,
			String tramCapNuocId, String trangThai, String namBaoCao, String ngayNhap, String idNguoiTao, String advText)
			throws SystemException {
		return dauNoiNuocFinder.countDauNoiSearch(maTinh, maHuyen, maXa,
				tramCapNuocId, trangThai, namBaoCao, ngayNhap, idNguoiTao, advText);
	}

	public List<DauNoiNuoc> getDauNoiSearch(String maTinh, String maHuyen,
			String maXa, String tramCapNuocId, String trangThai,
			String namBaoCao, String ngayNhap, String idNguoiTao, String advText, int start, int end) throws SystemException {
		return dauNoiNuocFinder.getDauNoiSearch(maTinh, maHuyen, maXa,
				tramCapNuocId, trangThai, namBaoCao, ngayNhap, idNguoiTao, advText, start, end);
	}
	
	public int countGioiTinhChuHo(String maTinh, String namBaoCao, String gioiTinh) {
		return dauNoiNuocFinder.countGioiTinhChuHo( maTinh,  namBaoCao,  gioiTinh);
	}
	public List<DauNoiNuoc> getDauNoiGroupByMaTinhTW(String namBaoCao)  {
		return dauNoiNuocFinder.getDauNoiGroupByMaTinhTW(namBaoCao);
	}
	public List<DauNoiNuoc> getDauNoiGroupByTramCapIDTW(String namBaoCao,String trangThai)  {
		return dauNoiNuocFinder.getDauNoiGroupByTramCapIDTW(namBaoCao,trangThai);
	}
}