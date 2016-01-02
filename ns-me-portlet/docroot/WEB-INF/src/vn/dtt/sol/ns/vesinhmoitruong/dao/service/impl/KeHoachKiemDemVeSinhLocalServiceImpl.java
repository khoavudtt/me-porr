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

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.KeHoachKiemDemVeSinhLocalServiceBaseImpl;

/**
 * The implementation of the ke hoach kiem dem ve sinh local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.KeHoachKiemDemVeSinhLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author BinhTH
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.KeHoachKiemDemVeSinhLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.KeHoachKiemDemVeSinhLocalServiceUtil
 */
public class KeHoachKiemDemVeSinhLocalServiceImpl
	extends KeHoachKiemDemVeSinhLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.KeHoachKiemDemVeSinhLocalServiceUtil} to access the ke hoach kiem dem ve sinh local service.
	 */
	public int countKeHoachKiemDemVeSinhSearch(String maTinh,String maHuyen,String kiemDemVienId,String trangThai ) throws SystemException {
		return keHoachKiemDemVeSinhFinder.countKeHoachKiemDemVeSinhSearch(maTinh, maHuyen, kiemDemVienId, trangThai);
	}
	public List<KeHoachKiemDemVeSinh> getKeHoachKiemDemVeSinhSearch(String maTinh,String maHuyen,String kiemDemVienId,String trangThai,int start,int end) throws SystemException {
		return keHoachKiemDemVeSinhFinder.getKeHoachKiemDemVeSinhSearch(maTinh, maHuyen, kiemDemVienId, trangThai, start, end);
	}
	public List<String> getHuyenXaKeHoachKiemDemGiaDinhSearch(String keHoachId,String trangThai,String maTinh,int start,int end) throws SystemException {
		return keHoachKiemDemVeSinhFinder.getHuyenXaKeHoachKiemDemGiaDinhSearch(keHoachId,trangThai,maTinh,start, end);
	}
	public List<String> getHuyenXaKeHoachKiemDemCongTrinhSearch(String keHoachId,String trangThai,String maTinh,int start,int end) throws SystemException {
		return keHoachKiemDemVeSinhFinder.getHuyenXaKeHoachKiemDemCongTrinhSearch(keHoachId,trangThai,maTinh,start, end);
	}
	public List<ThongTinKiemDemHoGD> getThongTinKeHoachKiemDemVeSinhGdSearch(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa,String danhGiaKiemDem,int start,int end) throws SystemException {
		return keHoachKiemDemVeSinhFinder.getThongTinKeHoachKiemDemVeSinhGdSearch(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
	}
	public List<ThongTinKiemDemHoGD> getListThongTinGdByKeHoachId(int keHoachKiemDemVeSinhId) throws SystemException {
		return thongTinKiemDemHoGDPersistence.findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);
	}
	public List<ThongTinKiemDemCongTrinh> getListThongTinCongTringByKeHoachId(int keHoachKiemDemVeSinhId) throws SystemException {
		return thongTinKiemDemCongTrinhPersistence.findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);
	}
	public int countThongTinKeHoachKiemDemVeSinhGdSearch(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,int start,int end) throws SystemException {
		return keHoachKiemDemVeSinhFinder.countThongTinKeHoachKiemDemVeSinhGdSearch(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
	}
	public List<ThongTinKiemDemCongTrinh> getThongTinKeHoachKiemDemVeSinhCongTrinhSearch(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,int start,int end) throws SystemException {
		return keHoachKiemDemVeSinhFinder.getThongTinKeHoachKiemDemVeSinhCongTrinhSearch(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
	}
	public int countThongTinKeHoachKiemDemVeSinhCongTrinhSearch(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,int start,int end) throws SystemException {
		return keHoachKiemDemVeSinhFinder.countThongTinKeHoachKiemDemVeSinhCongTrinhSearch(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
	}
	
	//
	public List<ThongTinKiemDemHoGD> getThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa,String danhGiaKiemDem,String thonXom,String nguonDL,int start,int end) throws SystemException {
		return keHoachKiemDemVeSinhFinder.getThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom,nguonDL, start, end);
	}
	public int countThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,String thonXom,String nguonDL,int start,int end) throws SystemException {
		return keHoachKiemDemVeSinhFinder.countThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom,nguonDL, start, end);
	}
	public List<ThongTinKiemDemCongTrinh> getThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,String thonXom,int start,int end) throws SystemException {
		return keHoachKiemDemVeSinhFinder.getThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, start, end);
	}
	public int countThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(String keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,String thonXom,int start,int end) throws SystemException {
		return keHoachKiemDemVeSinhFinder.countThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(keHoachId,trangThai,maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, start, end);
	}
	public List<KeHoachKiemDemVeSinh> getKeHoachKiemDemVeSinhSearch(String maTinh,String maHuyen,String kiemDemVienId,String trangThai,String idNguoiTao,int start,int end) throws SystemException {
		return keHoachKiemDemVeSinhFinder.getKeHoachKiemDemVeSinhSearch(maTinh, maHuyen, kiemDemVienId, trangThai,idNguoiTao, start, end);
	}
	public int countKeHoachKiemDemVeSinhSearch(String maTinh,String maHuyen,String kiemDemVienId,String trangThai,String idNguoiTao ) throws SystemException {
		return keHoachKiemDemVeSinhFinder.countKeHoachKiemDemVeSinhSearch(maTinh, maHuyen, kiemDemVienId, trangThai,idNguoiTao);
	}
}