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

package vn.dtt.sol.ns.maungaunhien.dao.service.impl;

import java.util.Date;
import java.util.List;

import vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM;
import vn.dtt.sol.ns.maungaunhien.dao.service.MAUKIEMDEMLocalServiceUtil;
import vn.dtt.sol.ns.maungaunhien.dao.service.base.MAUKIEMDEMLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the m a u k i e m d e m local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.ns.maungaunhien.dao.service.MAUKIEMDEMLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoa.vu
 * @see vn.dtt.sol.ns.maungaunhien.dao.service.base.MAUKIEMDEMLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.maungaunhien.dao.service.MAUKIEMDEMLocalServiceUtil
 */
public class MAUKIEMDEMLocalServiceImpl extends MAUKIEMDEMLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.ns.maungaunhien.dao.service.MAUKIEMDEMLocalServiceUtil} to
	 * access the m a u k i e m d e m local service.
	 */
	public int countByTinh(String maTinh) throws PortalException,
			SystemException {
		return maukiemdemPersistence.countByT_(maTinh);
	}

	public int countByHuyen(String maHuyen) throws PortalException,
			SystemException {
		return maukiemdemPersistence.countByH_(maHuyen);
	}

	public int countAll() throws PortalException, SystemException {
		return maukiemdemPersistence.countAll();
	}

	public MAUKIEMDEM getMauKiemDemByTHXN(String maTinh, String maXa,
			String maHuyen, int nam) throws PortalException, SystemException {
		return maukiemdemPersistence.fetchByT_H_X_N(maTinh, maHuyen, maXa, nam);
	}

	public List<MAUKIEMDEM> findMKD(int nam, String tinh, String huyen,
			String xa, int start, int end) throws PortalException,
			SystemException {
		return maukiemdemFinder
				.findMauKiemDem(nam, tinh, huyen, xa, start, end);
	}

	public int countMKD(int nam, String tinh, String huyen, String xa)
			throws PortalException, SystemException {
		return maukiemdemFinder.countMauKiemDem(nam, tinh, huyen, xa);
	}

	/**
	 * Cap nhat soMauCoNhaTieu, soMauDaKiemDem, soMauSoNhaTieuHVS
	 * 
	 * @param maTinh
	 * @param maHuyen
	 * @param maXa
	 * @param nam
	 * @param soMauHVS
	 * @param soMauCoNhaTieu
	 * @param soMauKiemDem
	 * @param context
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public MAUKIEMDEM updateMauKiemDem(String maTinh, String maHuyen,
			String maXa, int nam, int soMauHVS, int soMauCoNhaTieu,
			int soMauKiemDem, ServiceContext context) throws PortalException,
			SystemException {

		MAUKIEMDEM mauKiemDem = null;

		mauKiemDem = maukiemdemPersistence.fetchByT_H_X_N(maTinh, maHuyen,
				maXa, nam);

		long userId = context.getUserId();

		if (Validator.isNotNull(mauKiemDem)) {

			mauKiemDem.setUserId(userId);

			mauKiemDem.setNgayTao(new Date());

			if (soMauCoNhaTieu != 0) {
				mauKiemDem.setSoMauCoNhaTieu(soMauCoNhaTieu);
			}

			if (soMauKiemDem != 0) {
				mauKiemDem.setSoMauKiemDem(soMauKiemDem);
			}

			if (soMauHVS != 0) {
				mauKiemDem.setSoMauHVS(soMauHVS);
			}

		}

		maukiemdemPersistence.update(mauKiemDem);

		maukiemdemPersistence.clearCache();

		return mauKiemDem;
	}

	/**
	 * @param id
	 * @param maTinh
	 * @param maHuyen
	 * @param maXa
	 * @param nam
	 * @param tongSoHGD
	 * @param tongSoMau
	 * @param soMauNgauNhien
	 * @param soMauDuPhong
	 * @param context
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public MAUKIEMDEM updateMauKiemDem(long id, String maTinh, String maHuyen,
			String maXa, int nam, int tongSoHGD, int tongSoMau,
			int soMauNgauNhien, int soMauDuPhong, ServiceContext context)
			throws PortalException, SystemException {

		MAUKIEMDEM mauKiemDem = null;

		long userId = context.getUserId();
		
		System.out.print("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$id:" + id + "maTinh:" + maTinh + "maHuyen:" + maHuyen
				+ "maXa:" + maXa + "nam:" + nam + "tongsoHGD:" + tongSoHGD
				+ "tongSoMau:" + tongSoMau + "soMauNgauNhien:" + soMauNgauNhien
				+ "soMauDuPhong:" + soMauDuPhong);
		_log.info("id:" + id + "maTinh:" + maTinh + "maHuyen:" + maHuyen
				+ "maXa:" + maXa + "nam:" + nam + "tongsoHGD:" + tongSoHGD
				+ "tongSoMau:" + tongSoMau + "soMauNgauNhien:" + soMauNgauNhien
				+ "soMauDuPhong:" + soMauDuPhong);
		if (id > 0) {

			mauKiemDem = maukiemdemPersistence.findByPrimaryKey(id);

		} else {
			id = counterLocalService.increment(MAUKIEMDEM.class.getName());

			mauKiemDem = maukiemdemPersistence.create(id);

			mauKiemDem.setUserId(userId);

			mauKiemDem.setNgayTao(new Date());
		}

		mauKiemDem.setMaTinh(maTinh);

		mauKiemDem.setMaHuyen(maHuyen);

		mauKiemDem.setMaXa(maXa);

		mauKiemDem.setNam(nam);

		mauKiemDem.setTongSoMau(tongSoMau);

		mauKiemDem.setTongSoHGD(tongSoHGD);

		mauKiemDem.setSoMauDuPhong(soMauDuPhong);

		mauKiemDem.setSoMauNgauNhien(soMauNgauNhien);

		maukiemdemPersistence.update(mauKiemDem);

		maukiemdemPersistence.clearCache();

		return mauKiemDem;
	}

	private static Log _log = LogFactoryUtil
			.getLog(MAUKIEMDEMLocalServiceUtil.class);

	public MAUKIEMDEM updateMauKiemDem(long id, String maTinh, String maHuyen,
			String maXa, int nam, int tongSoHGD, int tongSoMau, int soMauHVS,
			int soMauCoNhaTieu, int soMauKiemDem, ServiceContext context)
			throws PortalException, SystemException {

		MAUKIEMDEM mauKiemDem = null;

		long userId = context.getUserId();

		if (id > 0) {

			mauKiemDem = maukiemdemPersistence.findByPrimaryKey(id);

		} else {
			id = counterLocalService.increment(MAUKIEMDEM.class.getName());

			mauKiemDem = maukiemdemPersistence.create(id);

			mauKiemDem.setUserId(userId);

			mauKiemDem.setNgayTao(new Date());
		}

		mauKiemDem.setMaTinh(maTinh);

		mauKiemDem.setMaHuyen(maHuyen);

		mauKiemDem.setMaXa(maXa);

		mauKiemDem.setNam(nam);

		mauKiemDem.setSoMauCoNhaTieu(soMauCoNhaTieu);

		mauKiemDem.setSoMauKiemDem(soMauKiemDem);

		mauKiemDem.setTongSoMau(tongSoMau);

		mauKiemDem.setTongSoHGD(tongSoHGD);

		mauKiemDem.setSoMauHVS(soMauHVS);

		maukiemdemPersistence.update(mauKiemDem);

		maukiemdemPersistence.clearCache();

		return mauKiemDem;
	}
}