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

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh;
import vn.dtt.sol.ns.tramcap.dao.service.base.DanhGiaVanHanhLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the danh gia van hanh local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.ns.tramcap.dao.service.DanhGiaVanHanhLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.sol.ns.tramcap.dao.service.base.DanhGiaVanHanhLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.tramcap.dao.service.DanhGiaVanHanhLocalServiceUtil
 */
public class DanhGiaVanHanhLocalServiceImpl extends
		DanhGiaVanHanhLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.ns.tramcap.dao.service.DanhGiaVanHanhLocalServiceUtil} to
	 * access the danh gia van hanh local service.
	 */

	public DanhGiaVanHanh getLastestByTramCap(int tramCapId, int nam)
			throws PortalException, SystemException {

		int lastMonth = danhGiaVanHanhFinder.countMaxThang(tramCapId, nam);

		return danhGiaVanHanhPersistence.findByT_T_N(tramCapId, lastMonth, nam);
	}

	public DanhGiaVanHanh getLastestByTramCap(int tramCapId)
			throws PortalException, SystemException {
		return danhGiaVanHanhPersistence.fetchByE_BY_T_(tramCapId);
	}

	public DanhGiaVanHanh getDanhGiaByThanhNamTram(long tramCapId, int thangId,
			int namId) throws PortalException, SystemException {
		return danhGiaVanHanhPersistence.fetchByT_T_N((int) tramCapId, thangId,
				namId);
	}

	public int tongNuocThatThoat(int tramCapId) throws PortalException,
			SystemException {

		int tongThatThoat = 0;

		List<DanhGiaVanHanh> lsDanhGia = danhGiaVanHanhPersistence
				.findByT_(tramCapId);

		for (DanhGiaVanHanh danhGia : lsDanhGia) {
			int thatThoat = danhGia.getNuocThatThoat();

			tongThatThoat = tongThatThoat + thatThoat;
		}
		if (lsDanhGia.size() != 0) {
			tongThatThoat = tongThatThoat / lsDanhGia.size();
		}
		return tongThatThoat;

	}

	public int tongNuocThatThoat(int tramCapId, int nam)
			throws PortalException, SystemException {

		int tongThatThoat = 0;

		List<DanhGiaVanHanh> lsDanhGia = danhGiaVanHanhPersistence.findByT_N(
				tramCapId, nam);

		for (DanhGiaVanHanh danhGia : lsDanhGia) {
			int thatThoat = danhGia.getNuocThatThoat();

			tongThatThoat = tongThatThoat + thatThoat;
		}
		if (lsDanhGia.size() != 0) {
			tongThatThoat = tongThatThoat / lsDanhGia.size();
		}
		return tongThatThoat;

	}

	public int tongDoanhThu(int tramCapId) throws PortalException,
			SystemException {
		int tongDoanhThu = 0;

		List<DanhGiaVanHanh> lsDanhGia = danhGiaVanHanhPersistence
				.findByT_(tramCapId);

		for (DanhGiaVanHanh danhGia : lsDanhGia) {
			int doanhThu = danhGia.getDoanhThu();
			tongDoanhThu = tongDoanhThu + doanhThu;
		}

		return tongDoanhThu;

	}

	public int tongDoanhThu(int tramCapId, int nam) throws PortalException,
			SystemException {
		int tongDoanhThu = 0;

		List<DanhGiaVanHanh> lsDanhGia = danhGiaVanHanhPersistence.findByT_N(
				tramCapId, nam);

		for (DanhGiaVanHanh danhGia : lsDanhGia) {
			int doanhThu = danhGia.getDoanhThu();
			tongDoanhThu = tongDoanhThu + doanhThu;
		}

		return tongDoanhThu;

	}

	public int tongChiPhiTram(int tramCapId, int nam) throws PortalException,
			SystemException {

		int tongChiPhi = 0;

		List<DanhGiaVanHanh> lsDanhGia = danhGiaVanHanhPersistence.findByT_N(
				tramCapId, nam);

		for (DanhGiaVanHanh danhGia : lsDanhGia) {
			int chiPhi = danhGia.getChiPhiDien() + danhGia.getChiPhiHoaChat()
					+ danhGia.getLuongNhanVien() + danhGia.getChiPhiSuaChua();
			tongChiPhi = tongChiPhi + chiPhi;
		}

		return tongChiPhi;

	}

	public List<DanhGiaVanHanh> getByTramCapAndNam(int tramCapNuocId, int nam)
			throws PortalException, SystemException {

		return danhGiaVanHanhPersistence.findByT_N(tramCapNuocId, nam);
	}

	public List<DanhGiaVanHanh> getByTramCapAndNam(int tramCapNuocId, int nam,
			int start, int end) throws PortalException, SystemException {

		return danhGiaVanHanhPersistence.findByT_N(tramCapNuocId, nam, start,
				end);
	}

	public int coutByTramCapAndNam(int tramCapNuocId, int nam)
			throws PortalException, SystemException {

		return danhGiaVanHanhPersistence.countByT_N(tramCapNuocId, nam);
	}

	public List<DanhGiaVanHanh> getByTramCap(int tramCapNuocId)
			throws PortalException, SystemException {

		return danhGiaVanHanhPersistence.findByT_(tramCapNuocId);
	}

	/**
	 * Cap nhat danh gia van hanh
	 * 
	 * @param id
	 * @param userId
	 * @param tramCapNuocId
	 * @param thang
	 * @param nam
	 * @param congXuatThucTe
	 * @param nuocThatThoat
	 * @param nuocDatTieuChuan
	 * @param nuocCoAsen
	 * @param trangThaiCapNuoc
	 * @param chiPhiHoaChat
	 * @param chiPhiDien
	 * @param luongNhanVien
	 * @param chiPhiSuaChua
	 * @param doanhThu
	 * @param ghiChu
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public DanhGiaVanHanh updateDanhGiaVanHanh(long id, int userId,
			int tramCapNuocId, int thang, int nam, int congXuatThucTe,
			int nuocThatThoat, int nuocDatTieuChuan, int nuocCoAsen,
			int trangThaiCapNuoc, int chiPhiHoaChat, int chiPhiDien,
			int luongNhanVien, int chiPhiSuaChua, int doanhThu, String ghiChu)
			throws PortalException, SystemException {

		DanhGiaVanHanh danhGia = null;

		if (id > 0) {
			danhGia = danhGiaVanHanhPersistence.findByPrimaryKey(id);
		} else {
			danhGia = danhGiaVanHanhPersistence.fetchByT_T_N(tramCapNuocId,
					thang, nam);

			if (Validator.isNull(danhGia)) {

				id = counterLocalService.increment(DanhGiaVanHanh.class
						.getName());

				danhGia = danhGiaVanHanhPersistence.create(id);
				danhGia.setTramCapNuocId(tramCapNuocId);

				danhGia.setNgayTao(new Date());
				danhGia.setIdNguoiTao(userId);
			}

		}

		danhGia.setThang(thang);
		danhGia.setNam(nam);
		danhGia.setCongXuatThucTe(congXuatThucTe);
		danhGia.setNuocThatThoat(nuocThatThoat);
		danhGia.setNuocDatTieuChuan(nuocDatTieuChuan);
		danhGia.setNuocCoAsen(nuocCoAsen);
		danhGia.setTrangThaiCapNuoc(trangThaiCapNuoc);
		danhGia.setChiPhiHoaChat(chiPhiHoaChat);
		danhGia.setChiPhiSuaChua(chiPhiSuaChua);
		danhGia.setChiPhiDien(chiPhiDien);
		danhGia.setLuongNhanVien(luongNhanVien);
		danhGia.setDoanhThu(doanhThu);
		danhGia.setGhiChu(ghiChu);

		// cap nhat danh gia hang thang
		danhGiaVanHanhPersistence.update(danhGia);

		int tongChiPhi = 0;
		int tongDoanhThu = tongDoanhThu(tramCapNuocId);
		int tongNuocThatThoat = tongNuocThatThoat(tramCapNuocId);

		// cap nhat danh gia vao bang tong hop tram cap
		tramCapNuocLocalService.updateDanhGiaTram(tramCapNuocId, userId,
				danhGia.getNgayTao(), trangThaiCapNuoc, congXuatThucTe, 0, 0,
				tongChiPhi, tongDoanhThu, nuocDatTieuChuan, nuocCoAsen,
				tongNuocThatThoat, 0);

		int trangThaiDanhGia = tramCapNuocLocalService.danhGiaTram();

		// cap nhat danh gia trang thai
		tramCapNuocLocalService.updaTrangThaiDanhGia(tramCapNuocId,
				trangThaiDanhGia);
		
		danhGiaVanHanhPersistence.clearCache();

		return danhGia;
	}

	public DanhGiaVanHanh updateDanhGiaVanHanh(long id, int userId,
			int tramCapNuocId, int thang, int nam, int congXuatThucTe,
			int nuocThatThoat, int nuocDatTieuChuan, int nuocCoAsen,
			int trangThaiCapNuoc, int chiPhiHoaChat, int chiPhiDien,
			int luongNhanVien, int chiPhiSuaChua, int doanhThu, String ghiChu,
			int sanLuongSanXuat, int sanLuongTieuHao) throws PortalException,
			SystemException {

		DanhGiaVanHanh danhGia = null;

		if (id > 0) {
			danhGia = danhGiaVanHanhPersistence.findByPrimaryKey(id);
		} else {
			danhGia = danhGiaVanHanhPersistence.fetchByT_T_N(tramCapNuocId,
					thang, nam);

			if (Validator.isNull(danhGia)) {

				id = counterLocalService.increment(DanhGiaVanHanh.class
						.getName());

				danhGia = danhGiaVanHanhPersistence.create(id);
				danhGia.setTramCapNuocId(tramCapNuocId);

				danhGia.setNgayTao(new Date());
				danhGia.setIdNguoiTao(userId);
			}

		}

		danhGia.setThang(thang);
		danhGia.setNam(nam);
		danhGia.setCongXuatThucTe(congXuatThucTe);
		danhGia.setNuocThatThoat(nuocThatThoat);
		danhGia.setNuocDatTieuChuan(nuocDatTieuChuan);
		danhGia.setNuocCoAsen(nuocCoAsen);
		danhGia.setTrangThaiCapNuoc(trangThaiCapNuoc);
		danhGia.setChiPhiHoaChat(chiPhiHoaChat);
		danhGia.setChiPhiSuaChua(chiPhiSuaChua);
		danhGia.setChiPhiDien(chiPhiDien);
		danhGia.setLuongNhanVien(luongNhanVien);
		danhGia.setDoanhThu(doanhThu);
		danhGia.setGhiChu(ghiChu);
		danhGia.setSanLuongSanXuat(sanLuongSanXuat);
		danhGia.setSanLuongTieuHao(sanLuongTieuHao);

		// cap nhat danh gia hang thang
		danhGiaVanHanhPersistence.update(danhGia);

		int tongChiPhi = 0;
		int tongDoanhThu = tongDoanhThu(tramCapNuocId);
		int tongNuocThatThoat = tongNuocThatThoat(tramCapNuocId);

		// cap nhat danh gia vao bang tong hop tram cap
		tramCapNuocLocalService.updateDanhGiaTram(tramCapNuocId, userId,
				danhGia.getNgayTao(), trangThaiCapNuoc, congXuatThucTe, 0, 0,
				tongChiPhi, tongDoanhThu, nuocDatTieuChuan, nuocCoAsen,
				tongNuocThatThoat, 0);

		int trangThaiDanhGia = tramCapNuocLocalService.danhGiaTram();

		// cap nhat danh gia trang thai
		tramCapNuocLocalService.updaTrangThaiDanhGia(tramCapNuocId,
				trangThaiDanhGia);

		danhGiaVanHanhPersistence.clearCache();

		return danhGia;
	}
}