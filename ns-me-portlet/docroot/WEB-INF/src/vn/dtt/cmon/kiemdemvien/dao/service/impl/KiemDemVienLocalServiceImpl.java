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

package vn.dtt.cmon.kiemdemvien.dao.service.impl;

import java.util.Date;
import java.util.List;

import vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien;
import vn.dtt.cmon.kiemdemvien.dao.service.base.KiemDemVienLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the kiem dem vien local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author HANT
 * @see vn.dtt.cmon.kiemdemvien.dao.service.base.KiemDemVienLocalServiceBaseImpl
 * @see vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil
 */
public class KiemDemVienLocalServiceImpl extends
		KiemDemVienLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil} to
	 * access the kiem dem vien local service.
	 */

	public List<KiemDemVien> findKDVByCTHTT(String capHoatDong, String maTinh,
			String maHuyen, long trangThai, int start, int end)
			throws PortalException, SystemException {
		return kiemDemVienFinder.findByCTHTT(capHoatDong, maTinh, maHuyen,
				trangThai, start, end);
	}

	public int countCTHTT(String capHoatDong, String maTinh, String maHuyen,
			long trangThai) throws PortalException, SystemException {
		return kiemDemVienFinder.countCTHTT(capHoatDong, maTinh, maHuyen,
				trangThai);
	}

	public KiemDemVien getKiemDemVienByTaiKhoan(String maTaiKhoan)
			throws PortalException, SystemException {
		KiemDemVien kdv = null;

		try {
			kdv = kiemDemVienPersistence.fetchByTK(maTaiKhoan);
		} catch (Exception e) {

		}

		return kdv;
	}

	/**
	 * @param id
	 * @param hoVaTen
	 * @param taiKhoan
	 * @param matKhau
	 * @param capHoatDong
	 * @param orgCode1
	 * @param orgCode2
	 * @param diaChi
	 * @param chungMinhThu
	 * @param dienThoai
	 * @param imei
	 * @param trangThai
	 * @param idQuanLy
	 * @param nameQuanLys
	 * @param context
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public KiemDemVien updateKiemDemVien(long id, String hoVaTen,
			String taiKhoan, String matKhau, int capHoatDong, String orgCode1,
			String orgCode2, String diaChi, String chungMinhThu,
			String dienThoai, String imei, long trangThai, long idQuanLy,
			String nameQuanLys, ServiceContext context) throws PortalException,
			SystemException {

		KiemDemVien kdv = null;

		long userId = context.getUserId();

		Date now = new Date();

		if (id != 0) {
			// update
			kdv = kiemDemVienPersistence.findByPrimaryKey(id);
		} else {
			// add
			id = counterLocalService.increment(KiemDemVien.class.getName());

			kdv = kiemDemVienLocalService.createKiemDemVien(id);

			kdv.setTaiKhoan(taiKhoan);
			kdv.setCapHoatDong(capHoatDong);
			kdv.setOrgCode1(orgCode1);
			kdv.setNgayTao(now);
			kdv.setIdNguoiTao(userId);
		}
		
		kdv.setOrgCode2(orgCode2);

		kdv.setHoVaTen(hoVaTen);
		
		// kiem tra mat khau khong trong mowi them vafo
		if (Validator.isNotNull(matKhau)) {
			kdv.setMatKhau(matKhau);
		}

		kdv.setDiaChi(diaChi);
		kdv.setChungMinhThu(chungMinhThu);
		kdv.setDienThoai(dienThoai);
		kdv.setImei(imei);
		kdv.setIdQuanLy(idQuanLy);
		kdv.setNameQuanLy(nameQuanLys);
		kdv.setTrangThai(trangThai);

		kiemDemVienPersistence.update(kdv);

		kiemDemVienPersistence.clearCache();

		return kdv;
	}

	public int countAll() throws PortalException, SystemException {
		return kiemDemVienPersistence.countAll();
	}

	public List<KiemDemVien> findAll() throws PortalException, SystemException {
		return kiemDemVienPersistence.findAll();
	}

	public void addKiemDemVien(String hoVaTen, String taiKhoan, String matKhau,
			int capHoatDong, String orgCode1, String orgCode2, String diaChi,
			String chungMinhThu, String dienThoai, String imei, int idNguoiTao)
			throws PortalException, SystemException {

		kiemDemVienFinder.addKiemDemVien(hoVaTen, taiKhoan, matKhau,
				capHoatDong, orgCode1, orgCode2, diaChi, chungMinhThu,
				dienThoai, imei, idNguoiTao);
	}

	public void chuyenTrangThai(long id) throws PortalException,
			SystemException {
		kiemDemVienFinder.chuyenTrangThai(id);
	}

	public List<KiemDemVien> find(String capHoatDong, String orgCode2,
			int start, int end) throws PortalException, SystemException {
		return kiemDemVienFinder.find(capHoatDong, orgCode2, start, end);
	}

	public long count(String capHoatDong, String orgCode2)
			throws PortalException, SystemException {
		return kiemDemVienFinder.count(capHoatDong, orgCode2);
	}

	public List<KiemDemVien> findKiemDemVien(String capHoatDong, String orgCode)
			throws PortalException, SystemException {
		return kiemDemVienFinder.findKiemDemVien(capHoatDong, orgCode);
	}

	public KiemDemVien getByTaiKhoan(String taiKhoan) throws PortalException,
			SystemException {
		return kiemDemVienPersistence.findByTK(taiKhoan);
	}
}