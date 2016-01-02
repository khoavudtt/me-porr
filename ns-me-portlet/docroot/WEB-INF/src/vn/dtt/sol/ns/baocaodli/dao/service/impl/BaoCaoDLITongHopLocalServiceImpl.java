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

package vn.dtt.sol.ns.baocaodli.dao.service.impl;

import java.util.List;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop;
import vn.dtt.sol.ns.baocaodli.dao.service.base.BaoCaoDLITongHopLocalServiceBaseImpl;
import vn.dtt.sol.ns.business.DataItemBusiness;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the bao cao d l i tong hop local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLITongHopLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author HuyMQ
 * @see vn.dtt.sol.ns.baocaodli.dao.service.base.BaoCaoDLITongHopLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLITongHopLocalServiceUtil
 */
public class BaoCaoDLITongHopLocalServiceImpl extends
		BaoCaoDLITongHopLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLITongHopLocalServiceUtil} to
	 * access the bao cao d l i tong hop local service.
	 */



	public void initBaoCaoDLITongHop(String maTinh, int nam,
			int soDauNoiTheoKeHoach, int soDauNoiMoi, int soNhaTieuHVSTheoKH,
			int soNhaTieuHVSMoi, int soNguoiHuongLoiNuocSach, int soXa,
			int tiLeHGDCoNhaTieu, int tiLeHGDCoNhaTieuHVS,
			int tiLeTruongHocHVS, int tiLeTramYTeHVS, int soNguoiHuongLoiVSTX,
			String keHoachPheDuyet) throws PortalException, SystemException {

		baoCaoDLITongHopLocalService.addBaoCaoTH(maTinh, nam,
				soDauNoiTheoKeHoach, soDauNoiMoi, soNhaTieuHVSTheoKH,
				soNhaTieuHVSMoi, soNguoiHuongLoiNuocSach, soXa,
				tiLeHGDCoNhaTieu, tiLeHGDCoNhaTieuHVS, tiLeTruongHocHVS,
				tiLeTramYTeHVS, soNguoiHuongLoiVSTX, keHoachPheDuyet);

	}

	public void initBaoCaoDLITongHop(int nam, int soDauNoiTheoKeHoach,
			int soDauNoiMoi, int soNhaTieuHVSTheoKH, int soNhaTieuHVSMoi,
			int soNguoiHuongLoiNuocSach, int soXa, int tiLeHGDCoNhaTieu,
			int tiLeHGDCoNhaTieuHVS, int tiLeTruongHocHVS, int tiLeTramYTeHVS,
			int soNguoiHuongLoiVSTX, String keHoachPheDuyet)
			throws PortalException, SystemException {

		List<DATAITEM> dataItems = DataItemBusiness.getInLevel1(1);

		for (DATAITEM dataItem : dataItems) {
			if (dataItem.getStatus() == 1) {

				String maTinh = dataItem.getNode1();

				baoCaoDLITongHopLocalService.addBaoCaoTH(maTinh, nam,
						soDauNoiTheoKeHoach, soDauNoiMoi, soNhaTieuHVSTheoKH,
						soNhaTieuHVSMoi, soNguoiHuongLoiNuocSach, soXa,
						tiLeHGDCoNhaTieu, tiLeHGDCoNhaTieuHVS,
						tiLeTruongHocHVS, tiLeTramYTeHVS, soNguoiHuongLoiVSTX,
						keHoachPheDuyet);
			}
		}
	}

	public BaoCaoDLITongHop addBaoCaoTH(String maTinh, int nam,
			int soDauNoiTheoKeHoach, int soDauNoiMoi, int soNhaTieuHVSTheoKH,
			int soNhaTieuHVSMoi, int soNguoiHuongLoiNuocSach, int soXa,
			int tiLeHGDCoNhaTieu, int tiLeHGDCoNhaTieuHVS,
			int tiLeTruongHocHVS, int tiLeTramYTeHVS, int soNguoiHuongLoiVSTX,
			String keHoachPheDuyet) throws PortalException, SystemException {

		BaoCaoDLITongHop baoCaoTongHop = baoCaoDLITongHopPersistence
				.fetchByMaTinh_Nam(maTinh, nam);

		if (Validator.isNull(baoCaoTongHop)) {
			long id = counterLocalService.increment(BaoCaoDLITongHop.class
					.getName());

			baoCaoTongHop = baoCaoDLITongHopPersistence.create(id);

			baoCaoTongHop.setMaTinh(maTinh);
			baoCaoTongHop.setNam(nam);
			baoCaoTongHop.setSoDauNoiTheoKeHoach(soDauNoiTheoKeHoach);
			baoCaoTongHop.setSoDauNoiMoi(soDauNoiMoi);
			baoCaoTongHop.setSoNhaTieuHVSTheoKH(soNhaTieuHVSTheoKH);
			baoCaoTongHop.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
			baoCaoTongHop.setSoNguoiHuongLoiNuocSach(soNguoiHuongLoiNuocSach);
			baoCaoTongHop.setSoXa(soXa);
			baoCaoTongHop.setTiLeHGDCoNhaTieu(tiLeHGDCoNhaTieu);
			baoCaoTongHop.setTiLeHGDCoNhaTieuHVS(tiLeHGDCoNhaTieuHVS);
			baoCaoTongHop.setTiLeTruongHocHVS(tiLeTruongHocHVS);
			baoCaoTongHop.setTiLeTramYTeHVS(tiLeTramYTeHVS);
			baoCaoTongHop.setSoNguoiHuongLoiVSTX(soNguoiHuongLoiVSTX);
			baoCaoTongHop.setKeHoachPheDuyet(keHoachPheDuyet);

			baoCaoDLITongHopPersistence.update(baoCaoTongHop);

			baoCaoDLITongHopPersistence.clearCache();
		}

		return baoCaoTongHop;
	}

	public BaoCaoDLITongHop getBaoCaoDLITongHopByTinhVaNam(String maTinh,
			String namBaoCao) {
		return baoCaoDLITongHopFinder.getBaoCaoDLITongHopByTinhVaNam(maTinh,
				namBaoCao);
	}
	public List<BaoCaoDLITongHop> getListBaoCaoDLITongHopByNamTW(String namBaoCao)  {
		return baoCaoDLITongHopFinder.getListBaoCaoDLITongHopByNamTW(namBaoCao);
	}
}