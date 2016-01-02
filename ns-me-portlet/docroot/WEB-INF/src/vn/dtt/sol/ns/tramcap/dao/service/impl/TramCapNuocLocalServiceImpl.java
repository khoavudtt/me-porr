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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.tramcap.dao.service.base.TramCapNuocLocalServiceBaseImpl;

/**
 * The implementation of the tram cap nuoc local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.sol.ns.tramcap.dao.service.base.TramCapNuocLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalServiceUtil
 */
public class TramCapNuocLocalServiceImpl extends
		TramCapNuocLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalServiceUtil} to access
	 * the tram cap nuoc local service.
	 */

	public int getDoublicate(String maTinh, String tenTramCap)
			throws PortalException, SystemException {
		return tramCapNuocPersistence.countByT_TENTRAM_TINH(tenTramCap, maTinh);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalService#danhGiaTram()
	 */
	public int danhGiaTram() throws PortalException, SystemException {
		int diemDanhGia = 0;

		return diemDanhGia;
	}

	/**
	 * @param maTinh
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public int countTramCapByTinh(String maTinh) throws PortalException,
			SystemException {
		return tramCapNuocFinder.countTramCap(maTinh);
	}

	/**
	 * @param maTinh
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public List<TramCapNuoc> findByTinh(String maTinh, int start, int end)
			throws PortalException, SystemException {
		return tramCapNuocFinder.getTramCapByTinh(maTinh, start, end);
	}

	/**
	 * @param id
	 * @param trangThaiDanhGia
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public TramCapNuoc updaTrangThaiDanhGia(long id, int trangThaiDanhGia)
			throws PortalException, SystemException {
		TramCapNuoc tramCap = null;

		if (id > 0)
			tramCap = tramCapNuocPersistence.findByPrimaryKey(id);

		if (Validator.isNotNull(tramCap)) {
			tramCap.setTrangThaiDanhGia(trangThaiDanhGia);

			tramCapNuocPersistence.update(tramCap);

			tramCapNuocPersistence.clearCache();
		}

		return tramCap;
	}

	/**
	 * @param id
	 * @param idNguoiDanhGia
	 * @param ngayDanhGia
	 * @param trangThaiCapNuoc
	 * @param congXuatThucTe
	 * @param tongDauNoiThucTe
	 * @param soNguoiCapThucTe
	 * @param tongChiPhi
	 * @param tongDoanhThu
	 * @param nuocDatTieuChuan
	 * @param nuocCoAsen
	 * @param nuocThatThoat
	 * @param trangThaiDanhGia
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public TramCapNuoc updateDanhGiaTram(long id, long idNguoiDanhGia,
			Date ngayDanhGia, int trangThaiCapNuoc, int congXuatThucTe,
			int tongDauNoiThucTe, int soNguoiCapThucTe, int tongChiPhi,
			int tongDoanhThu, int nuocDatTieuChuan, int nuocCoAsen,
			int nuocThatThoat, int trangThaiDanhGia) throws PortalException,
			SystemException {

		TramCapNuoc tramCap = null;

		int nguoiCapThucTe = dauNoiNuocLocalService.countDauNoiByTram((int) id);

		int dauNoiThucTe = dauNoiNuocLocalService.countDauNoiByTram((int) id);

		if (id > 0)
			tramCap = tramCapNuocPersistence.findByPrimaryKey(id);

		if (Validator.isNotNull(tramCap)) {
			tramCap.setIdNguoiDanhGia(idNguoiDanhGia);
			tramCap.setNgayDanhGia(ngayDanhGia);
			tramCap.setTrangThaiCapNuoc(trangThaiCapNuoc);
			tramCap.setCongXuatThucTe(congXuatThucTe);

			tramCap.setTongDauNoiThucTe(dauNoiThucTe);
			tramCap.setSoNguoiCapThucTe(nguoiCapThucTe);
			tramCap.setTongChiPhi(tongChiPhi);
			tramCap.setTongChiPhi(tongChiPhi);
			tramCap.setTongDoanhThu(tongDoanhThu);
			tramCap.setNuocDatTieuChuan(nuocDatTieuChuan);
			tramCap.setNuocCoAsen(nuocCoAsen);
			tramCap.setNuocThatThoat(nuocThatThoat);

			tramCapNuocPersistence.update(tramCap);

			tramCapNuocPersistence.clearCache();

		}

		return tramCap;
	}

	public TramCapNuoc updateDanhGiaTram(long id, long idNguoiDanhGia,
			Date ngayDanhGia, int trangThaiCapNuoc, int congXuatThucTe,
			int tongDauNoiThucTe, int soNguoiCapThucTe, int tongChiPhi,
			int tongDoanhThu, int nuocDatTieuChuan, int nuocCoAsen,
			int nuocThatThoat, int trangThaiDanhGia, int sanLuongSanXuat,
			int sanLuongTieuHao) throws PortalException, SystemException {

		TramCapNuoc tramCap = null;

		int nguoiCapThucTe = dauNoiNuocLocalService.countDauNoiByTram((int) id);

		int dauNoiThucTe = dauNoiNuocLocalService.countDauNoiByTram((int) id);

		if (id > 0)
			tramCap = tramCapNuocPersistence.findByPrimaryKey(id);

		if (Validator.isNotNull(tramCap)) {
			tramCap.setIdNguoiDanhGia(idNguoiDanhGia);
			tramCap.setNgayDanhGia(new Date());
			tramCap.setTrangThaiCapNuoc(trangThaiCapNuoc);
			tramCap.setCongXuatThucTe(congXuatThucTe);

			tramCap.setTongDauNoiThucTe(dauNoiThucTe);
			tramCap.setSoNguoiCapThucTe(nguoiCapThucTe);
			tramCap.setTongChiPhi(tongChiPhi);
			tramCap.setTongChiPhi(tongChiPhi);
			tramCap.setTongDoanhThu(tongDoanhThu);
			tramCap.setNuocDatTieuChuan(nuocDatTieuChuan);
			tramCap.setNuocCoAsen(nuocCoAsen);
			tramCap.setNuocThatThoat(nuocThatThoat);

			tramCapNuocPersistence.update(tramCap);

			tramCapNuocPersistence.clearCache();

		}

		return tramCap;
	}

	public TramCapNuoc updateTramCap(long id, String maTram, String tenTram,
			String maTinh, String maHuyen, String maXa, String diaChi,
			String kinhDo, String viDo, int loaiHinh, String maMoHinh,
			int congXuatThietKe, int tongDauNoiThietKe, int soNguoiCapThietKe,
			int tinhTrangDuAn, int tienDoXayDung, int namXayDung,
			int namHoanThanh, Date ngayVanHanh, int boMayVanHanh, String ghiChu)
			throws PortalException, SystemException {

		/*
		 * Cac truong khong duoc edit maTramCap maTinh maHuyen maXa
		 */

		TramCapNuoc tramCap = null;

		if (id > 0) {
			tramCap = tramCapNuocPersistence.findByPrimaryKey(id);

		} else {
			id = counterLocalService.increment(TramCapNuoc.class.getName());

			tramCap = tramCapNuocPersistence.create(id);

			tramCap.setMaTram(maTram);
			tramCap.setMaTinh(maTinh);
			tramCap.setMaHuyen(maHuyen);
			tramCap.setMaXa(maXa);

			tramCap.setNgayTao(new Date());

		}
		tramCap.setTenTram(tenTram);
		tramCap.setDiaChi(diaChi);
		tramCap.setKinhDo(kinhDo);
		tramCap.setViDo(viDo);
		tramCap.setLoaiHinh(loaiHinh);
		tramCap.setMaMoHinh(maMoHinh);
		tramCap.setMaMoHinh(maMoHinh);
		tramCap.setCongXuatThietKe(congXuatThietKe);
		tramCap.setTongDauNoiThietKe(tongDauNoiThietKe);
		tramCap.setSoNguoiCapThietKe(soNguoiCapThietKe);
		tramCap.setTinhTrangDuAn(tinhTrangDuAn);
		tramCap.setTienDoXayDung(tienDoXayDung);
		tramCap.setNamXayDung(namXayDung);
		tramCap.setNamHoanThanh(namHoanThanh);
		tramCap.setNgayVanHanh(ngayVanHanh);
		tramCap.setBoMayVanHanh(boMayVanHanh);
		tramCap.setGhiChu(ghiChu);

		tramCapNuocPersistence.update(tramCap);

		tramCapNuocPersistence.clearCache();

		return tramCap;
	}

	public TramCapNuoc updateTramCap(long id, long nguoiTaoId, String maTram,
			String tenTram, String maTinh, String maHuyen, String maXa,
			String diaChi, String kinhDo, String viDo, int loaiHinh,
			String maMoHinh, int congXuatThietKe, int tongDauNoiThietKe,
			int soNguoiCapThietKe, int tinhTrangDuAn, int tienDoXayDung,
			int namXayDung, int namHoanThanh, Date ngayVanHanh,
			int boMayVanHanh, String ghiChu) throws PortalException,
			SystemException {

		/*
		 * Cac truong khong duoc edit maTramCap maTinh maHuyen maXa
		 */

		TramCapNuoc tramCap = null;

		if (id > 0) {
			tramCap = tramCapNuocPersistence.findByPrimaryKey(id);

		} else {
			id = counterLocalService.increment(TramCapNuoc.class.getName());

			tramCap = tramCapNuocPersistence.create(id);

			tramCap.setMaTram(maTram);
			tramCap.setMaTinh(maTinh);
			tramCap.setMaHuyen(maHuyen);
			tramCap.setMaXa(maXa);

			tramCap.setNgayTao(new Date());

		}
		tramCap.setTenTram(tenTram);
		tramCap.setDiaChi(diaChi);
		tramCap.setKinhDo(kinhDo);
		tramCap.setViDo(viDo);
		tramCap.setLoaiHinh(loaiHinh);
		tramCap.setMaMoHinh(maMoHinh);
		tramCap.setMaMoHinh(maMoHinh);
		tramCap.setCongXuatThietKe(congXuatThietKe);
		tramCap.setTongDauNoiThietKe(tongDauNoiThietKe);
		tramCap.setSoNguoiCapThietKe(soNguoiCapThietKe);
		tramCap.setTinhTrangDuAn(tinhTrangDuAn);
		tramCap.setTienDoXayDung(tienDoXayDung);
		tramCap.setNamXayDung(namXayDung);
		tramCap.setNamHoanThanh(namHoanThanh);
		tramCap.setNgayVanHanh(ngayVanHanh);
		tramCap.setBoMayVanHanh(boMayVanHanh);
		tramCap.setGhiChu(ghiChu);
		tramCap.setIdNguoiTao(nguoiTaoId);

		tramCapNuocPersistence.update(tramCap);

		tramCapNuocPersistence.clearCache();

		return tramCap;
	}

	public List<TramCapNuoc> getTramCap(int start, int end)
			throws PortalException, SystemException {
		return tramCapNuocPersistence.findAll(start, end);
	}

	public List<TramCapNuoc> getAllTramCap() throws PortalException,
			SystemException {
		return tramCapNuocPersistence.findAll();
	}

	public int countAllTramCap() throws PortalException, SystemException {
		return tramCapNuocPersistence.countAll();
	}

	public List<TramCapNuoc> getByTinh(String maTinh, int start, int end)
			throws PortalException, SystemException {
		return tramCapNuocPersistence.findByT_(maTinh, start, end);
	}

	public List<TramCapNuoc> getByTinh(String maTinh) throws PortalException,
			SystemException {
		return tramCapNuocPersistence.findByT_(maTinh);
	}

	public List<TramCapNuoc> getByTenTram(String tenTram)
			throws PortalException, SystemException {
		return tramCapNuocPersistence.findByT_TENTRAM(tenTram);
	}

	public int countByTinh(String maTinh) throws PortalException,
			SystemException {
		return tramCapNuocPersistence.countByT_(maTinh);
	}

	public List<TramCapNuoc> getTramCapNuocByTinhDauNoiNuoc(String maTinh,
			String namBaoCao) {
		return tramCapNuocFinder.getTramCapNuocByTinhDauNoiNuoc(maTinh,
				namBaoCao);

	}

	public List<TramCapNuoc> getTramCapNuocByDanhGiaBenVung(String maTinh,
			String nam, String danhGiaBenVung) {
		return tramCapNuocFinder.getTramCapNuocByDanhGiaBenVung(maTinh, nam,
				danhGiaBenVung);
	}

	public List<TramCapNuoc> getTramCapNuocJoinDanhGiaBenVung(String maTinh,
			String nam) {
		return tramCapNuocFinder.getTramCapNuocJoinDanhGiaBenVung(maTinh, nam);
	}

	public List<TramCapNuoc> getTramCapNuocByThoiGianThuc(String maTinh,
			String namBaoCao, String danhgiakiemdem) {
		return tramCapNuocFinder.getTramCapNuocByThoiGianThuc(maTinh,
				namBaoCao, danhgiakiemdem);
	}

	public int countTramCapThoiGianThuc(String maTinh, String namBaoCao,
			String danhgiakiemdem, String tramCapNuocId)
			throws PortalException, SystemException {
		return tramCapNuocFinder.countTramCapThoiGianThuc(maTinh, namBaoCao,
				danhgiakiemdem, tramCapNuocId);
	}

	public TramCapNuoc getTramCapNuocByMaTinhAndDNNID(String maTinh,
			String dauNoiNuocID) throws SystemException {
		return tramCapNuocFinder.getTramCapNuocByMaTinhAndDNNID(maTinh,
				dauNoiNuocID);
	}
}