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

import javax.sound.midi.SysexMessage;

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung;
import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung;
import vn.dtt.sol.ns.tramcap.dao.service.base.DanhGiaBenVungLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the danh gia ben vung local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.ns.tramcap.dao.service.DanhGiaBenVungLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.sol.ns.tramcap.dao.service.base.DanhGiaBenVungLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.tramcap.dao.service.DanhGiaBenVungLocalServiceUtil
 */
public class DanhGiaBenVungLocalServiceImpl extends
		DanhGiaBenVungLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.ns.tramcap.dao.service.DanhGiaBenVungLocalServiceUtil} to
	 * access the danh gia ben vung local service.
	 */
	
	public int countByTram(int tramCapId) throws PortalException, SystemException {
		return danhGiaBenVungPersistence.countByT_(tramCapId);
	}
	
	
	public List<DanhGiaBenVung> findByTram(int tramCapId) throws PortalException, SystemException {
		return danhGiaBenVungPersistence.findByT_(tramCapId);
	}

	public int countAll() throws PortalException, SystemException {
		return danhGiaBenVungPersistence.countAll();
	}


	public List<DanhGiaBenVung> findDanhGia(int[] lsTramCap, int start, int end)
			throws PortalException, SystemException {
		return danhGiaBenVungFinder.findDanhGiaBenVung(lsTramCap, start, end);
	}

	public int countDanhGia(int[] lsTramCap) throws PortalException,
			SystemException {
		return danhGiaBenVungFinder.countDanhGia(lsTramCap);
	}

	public DanhGiaBenVung getDanhGiaByNam(int nam, int tramCapId)
			throws PortalException, SystemException {
		return danhGiaBenVungPersistence.fetchByN_(nam, tramCapId);
	}

	/**
	 * UPDATE DLI
	 * 
	 * @param id
	 * @param baoCaoDLI
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public DanhGiaBenVung updateDLI(long id, int baoCaoDLI)
			throws PortalException, SystemException {
		DanhGiaBenVung danhGiaBenVung = null;

		if (id > 0) {
			danhGiaBenVung = danhGiaBenVungPersistence.findByPrimaryKey(id);

			if (Validator.isNotNull(danhGiaBenVung)) {
				danhGiaBenVung.setBaoCaoDLI(baoCaoDLI);

				danhGiaBenVungPersistence.update(danhGiaBenVung);
			}
		}

		return danhGiaBenVung;
	}
	
/*	public DanhGiaBenVung updateDLI(long id, int baoCaoIDL) throws PortalException, SystemException {
		
	}
	*/
	public DanhGiaBenVung updateDanhGiaBenVung(long id, int tramCapNuocId,
			int idNguoiTao, int nam, int trangThaiCapNuoc, int tongDauNoiMoi, int congXuatThucTe,
			int tongDauNoiThucTe, int soNguoiCapThucTe, int nuocThatThoat,
			int nuocDatTieuChuan, int nuocCoAsen, int tongChiPhi,
			int tongDoanhThu, String ghiChu, int ketQuaDanhGia, int baoCaoDLI)
			throws PortalException, SystemException {
		DanhGiaBenVung danhGiaBenVung = null;

		if (id > 0) {
			danhGiaBenVung = danhGiaBenVungPersistence.fetchByPrimaryKey(id);
		} else {
			id = counterLocalService.increment(DanhGiaBenVung.class.getName());

			danhGiaBenVung = danhGiaBenVungPersistence.create(id);
		}


		danhGiaBenVung.setIdNguoiTao(idNguoiTao);
		danhGiaBenVung.setTramCapNuocId(tramCapNuocId);
		danhGiaBenVung.setNam(nam);
		danhGiaBenVung.setTrangThaiCapNuoc(trangThaiCapNuoc);
		danhGiaBenVung.setCongXuatThucTe(congXuatThucTe);
		danhGiaBenVung.setNuocThatThoat(nuocThatThoat);
		danhGiaBenVung.setNuocDatTieuChuan(nuocDatTieuChuan);
		danhGiaBenVung.setNuocCoAsen(nuocCoAsen);
		danhGiaBenVung.setTongChiPhi(tongChiPhi);
		danhGiaBenVung.setTongDoanhThu(tongDoanhThu);
		danhGiaBenVung.setNgayTao(new Date());
		danhGiaBenVung.setGhiChu(ghiChu);
		danhGiaBenVung.setKetQuaDanhGia(ketQuaDanhGia);
		danhGiaBenVung.setBaoCaoDLI(baoCaoDLI);
		danhGiaBenVung.setTongDauNoiMoi(tongDauNoiMoi);

		danhGiaBenVungPersistence.update(danhGiaBenVung);

		danhGiaBenVungPersistence.clearCache();

		return danhGiaBenVung;
	}


	public DanhGiaBenVung updateDanhGiaBenVung(long id, int tramCapNuocId,
			int idNguoiTao, int nam, int trangThaiCapNuoc, int congXuatThucTe,
			int tongDauNoiThucTe, int soNguoiCapThucTe, int nuocThatThoat,
			int nuocDatTieuChuan, int nuocCoAsen, int tongChiPhi,
			int tongDoanhThu, String ghiChu, int ketQuaDanhGia, int baoCaoDLI)
			throws PortalException, SystemException {
		DanhGiaBenVung danhGiaBenVung = null;

		if (id > 0) {
			danhGiaBenVung = danhGiaBenVungPersistence.fetchByPrimaryKey(id);
		} else {
			id = counterLocalService.increment(DanhGiaBenVung.class.getName());

			danhGiaBenVung = danhGiaBenVungPersistence.create(id);
		}

		int tongDauNoiMoi = 0;

		danhGiaBenVung.setIdNguoiTao(idNguoiTao);
		danhGiaBenVung.setTramCapNuocId(tramCapNuocId);
		danhGiaBenVung.setNam(nam);
		danhGiaBenVung.setTrangThaiCapNuoc(trangThaiCapNuoc);
		danhGiaBenVung.setCongXuatThucTe(congXuatThucTe);
		danhGiaBenVung.setNuocThatThoat(nuocThatThoat);
		danhGiaBenVung.setNuocDatTieuChuan(nuocDatTieuChuan);
		danhGiaBenVung.setNuocCoAsen(nuocCoAsen);
		danhGiaBenVung.setTongChiPhi(tongChiPhi);
		danhGiaBenVung.setTongDoanhThu(tongDoanhThu);
		danhGiaBenVung.setNgayTao(new Date());
		danhGiaBenVung.setGhiChu(ghiChu);
		danhGiaBenVung.setKetQuaDanhGia(ketQuaDanhGia);
		danhGiaBenVung.setBaoCaoDLI(baoCaoDLI);

		danhGiaBenVungPersistence.update(danhGiaBenVung);
		

		danhGiaBenVungPersistence.clearCache();

		return danhGiaBenVung;
	}

	public DanhGiaBenVung updaTramCapNuoc(long id, int idNguoiTao, int nam,
			int trangThaiCapNuoc, int congXuatThucTe, int tongDauNoiThucTe,
			int soNguoiCapThucTe, int nuocThatThoat, int nuocDatTieuChuan,
			int nuocCoAsen, int tongChiPhi, int tongDoanhThu, String ghiChu,
			int ketQuaDanhGia, int baoCaoDLI) throws PortalException,
			SystemException {
		DanhGiaBenVung danhGiaBenVung = null;

		if (id > 0) {
			danhGiaBenVung = danhGiaBenVungPersistence.fetchByPrimaryKey(id);
		} else {
			id = counterLocalService.increment(DanhGiaBenVung.class.getName());

			danhGiaBenVung = danhGiaBenVungPersistence.create(id);
		}

		int tongDauNoiMoi = 0;

		danhGiaBenVung.setIdNguoiTao(idNguoiTao);
		danhGiaBenVung.setNam(nam);
		danhGiaBenVung.setTrangThaiCapNuoc(trangThaiCapNuoc);
		danhGiaBenVung.setCongXuatThucTe(congXuatThucTe);
		danhGiaBenVung.setNuocThatThoat(nuocThatThoat);
		danhGiaBenVung.setNuocDatTieuChuan(nuocDatTieuChuan);
		danhGiaBenVung.setNuocCoAsen(nuocCoAsen);
		danhGiaBenVung.setTongChiPhi(tongChiPhi);
		danhGiaBenVung.setTongDoanhThu(tongDoanhThu);
		danhGiaBenVung.setNgayTao(new Date());
		danhGiaBenVung.setGhiChu(ghiChu);
		danhGiaBenVung.setKetQuaDanhGia(ketQuaDanhGia);
		danhGiaBenVung.setBaoCaoDLI(baoCaoDLI);

		danhGiaBenVungPersistence.update(danhGiaBenVung);

		danhGiaBenVungPersistence.clearCache();

		return danhGiaBenVung;
	}

	public DanhGiaBenVung getDanhGiaBenVungByTramCapNuocAndNam(
			long tramCapNuocId, String nam, String ketquadanhgia) {
		return danhGiaBenVungFinder.getDanhGiaBenVungByTramCapNuocAndNam(
				tramCapNuocId, nam, ketquadanhgia);
	}

}