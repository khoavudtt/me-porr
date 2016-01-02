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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.VeSinhGiaDinhLocalServiceBaseImpl;

/**
 * The implementation of the ve sinh gia dinh local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author BinhTH
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.VeSinhGiaDinhLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil
 */
public class VeSinhGiaDinhLocalServiceImpl extends
		VeSinhGiaDinhLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil}
	 * to access the ve sinh gia dinh local service.
	 */
	

	public List<VeSinhGiaDinh> getVSGDByTHXMNN(String tinh, String huyen,
			String xa, int mauNgauNhien, int start, int end)
			throws PortalException, SystemException {
		return veSinhGiaDinhPersistence.findByT_H_XMNN(tinh, huyen, xa,
				mauNgauNhien, start, end);
	}

	public int countVSGDByTHXMNN(String tinh, String huyen, String xa,
			int mauNgauNhien) throws PortalException, SystemException {
		return veSinhGiaDinhPersistence.countByT_H_XMNN(tinh, huyen, xa,
				mauNgauNhien);
	}

	public List<VeSinhGiaDinh> getVSGDByTHXMNN(String tinh, String huyen,
			String xa, int mauNgauNhien) throws PortalException,
			SystemException {
		return veSinhGiaDinhPersistence.findByT_H_XMNN(tinh, huyen, xa,
				mauNgauNhien);
	}

	public int countVeSinhGiaDinhSearch(String maTinh, String maHuyen,
			String maXa, String loaiNhaTieuId, String trangThai,
			String namBaoCao, String namBaoCaoVstx) throws SystemException {
		return veSinhGiaDinhFinder.countVeSinhGiaDinhSearch(maTinh, maHuyen,
				maXa, loaiNhaTieuId, trangThai, namBaoCao, namBaoCaoVstx);
	}

	public List<VeSinhGiaDinh> getVeSinhGiaDinhSearch(String maTinh,
			String maHuyen, String maXa, String loaiNhaTieuId,
			String trangThai, String namBaoCao, String namBaoCaoVstx,
			int start, int end) throws SystemException {
		return veSinhGiaDinhFinder.getVeSinhGiaDinhSearch(maTinh, maHuyen,
				maXa, loaiNhaTieuId, trangThai, namBaoCao, namBaoCaoVstx,
				start, end);
	}

	public void updateVeSinhHoGiaDinhChonMau(int id, int namBaoCao)
			throws SystemException {
		VeSinhGiaDinh ettUpdate = new VeSinhGiaDinhImpl();
		ettUpdate = VeSinhGiaDinhLocalServiceUtil.fetchVeSinhGiaDinh(id);
		ettUpdate.setMauNgauNhien(namBaoCao);
		ettUpdate.setTrangThai(0);
		VeSinhGiaDinhLocalServiceUtil.updateVeSinhGiaDinh(ettUpdate);
	}

	public VeSinhGiaDinh updateMauNgauNhien(long id, int namBaoCao)
			throws PortalException, SystemException {
		
		VeSinhGiaDinh vsgd = veSinhGiaDinhPersistence.fetchByPrimaryKey(id);
		
		if (Validator.isNotNull(vsgd)) {
			vsgd.setMauNgauNhien(namBaoCao);
			vsgd.setTrangThai(0);
		} else {
			System.out.print("sas");
		}
		
		veSinhGiaDinhPersistence.update(vsgd);
		
		veSinhGiaDinhPersistence.clearCache();
		
		return vsgd;
		
	}

	public List<VeSinhGiaDinh> getVeSinhGiaDinhGroupByMaHuyen(String maTinh,
			String maHuyen, String maXa, String loaiNhaTieuId,
			String trangThai, String namBaoCao) throws SystemException {
		return veSinhGiaDinhFinder.getVeSinhGiaDinhGroupByMaHuyen(maTinh,
				maHuyen, maXa, loaiNhaTieuId, trangThai, namBaoCao);
	}

	public List<VeSinhGiaDinh> findByT_CHK_Import(String maTinh,
			String maHuyen, String maXa, String thonXom, String tenChuHo,
			int idNguoiTao) throws SystemException {
		return veSinhGiaDinhPersistence.findByT_CHK_Import(maTinh, maHuyen,
				maXa, thonXom, tenChuHo, idNguoiTao);
	}

	public boolean chkGDinKeHoach(String maTinh, String maHuyen, String maXa)
			throws SystemException {
		boolean result = false;
		List<VeSinhGiaDinh> baseResult = veSinhGiaDinhPersistence
				.findByT_CHK_INKeHoach(maTinh, maHuyen, maXa);
		if (baseResult.size() > 0) {
			result = true;
		}
		return result;
	}

	//
	public int countVeSinhGiaDinhSearch(String maTinh, String maHuyen,
			String maXa, String loaiNhaTieuId, String trangThai,
			String namBaoCao, String namBaoCaoVstx, String ngayNhap,
			String idNguoiTao, String advText) throws SystemException {
		return veSinhGiaDinhFinder.countVeSinhGiaDinhSearch(maTinh, maHuyen,
				maXa, loaiNhaTieuId, trangThai, namBaoCao, namBaoCaoVstx,
				ngayNhap, idNguoiTao, advText);
	}

	public List<VeSinhGiaDinh> getVeSinhGiaDinhSearch(String maTinh,
			String maHuyen, String maXa, String loaiNhaTieuId,
			String trangThai, String namBaoCao, String namBaoCaoVstx,
			String ngayNhap, String idNguoiTao, String advText, int start,
			int end) throws SystemException {
		return veSinhGiaDinhFinder.getVeSinhGiaDinhSearch(maTinh, maHuyen,
				maXa, loaiNhaTieuId, trangThai, namBaoCao, namBaoCaoVstx,
				ngayNhap, idNguoiTao, advText, start, end);
	}
	
	public int countGioiTinhChuHo(String maTinh, String namBaoCao, String namXayDung, String gioiTinhChuHo, String trangThai) throws SystemException {
		return veSinhGiaDinhFinder.countGioiTinhChuHo( maTinh,  namBaoCao,  namXayDung,  gioiTinhChuHo,  trangThai) ;
	}
	public List<VeSinhGiaDinh> getVeSinhGiaDinhGroupByMaTinhTW(String maTinh,String maHuyen, String maXa, String loaiNhaTieuId,String trangThai, String namBaoCao) throws SystemException {
		return veSinhGiaDinhFinder.getVeSinhGiaDinhGroupByMaTinhTW(maTinh,maHuyen,maXa,loaiNhaTieuId,trangThai,namBaoCao);
	}
	public List<VeSinhGiaDinh> getVeSinhGiaDinhGroupByMaHuyenMaXaAndMaXaNotInTW(String maTinh, String trangThai, String namBaoCao, String dangKyVSTX) throws SystemException {
		return veSinhGiaDinhFinder.getVeSinhGiaDinhGroupByMaHuyenMaXaAndMaXaNotInTW(maTinh,trangThai,namBaoCao,dangKyVSTX);
	}
}