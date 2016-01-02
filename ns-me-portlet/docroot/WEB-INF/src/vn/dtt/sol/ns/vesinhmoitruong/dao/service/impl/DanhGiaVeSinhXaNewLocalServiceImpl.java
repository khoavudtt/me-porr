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

import java.util.Date;
import java.util.List;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.sol.ns.business.DataItemBusiness;
import vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM;
import vn.dtt.sol.ns.maungaunhien.dao.service.MAUKIEMDEMLocalServiceUtil;
import vn.dtt.sol.ns.portlet.DanhGiaVeSinhPortlet;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.WebKeys;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewFakeLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.DanhGiaVeSinhXaNewLocalServiceBaseImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.persistence.DanhGiaVeSinhXaNewPersistence;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the danh gia ve sinh xa new local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author BinhTH
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.base.DanhGiaVeSinhXaNewLocalServiceBaseImpl
 * @see vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewLocalServiceUtil
 */
public class DanhGiaVeSinhXaNewLocalServiceImpl extends
		DanhGiaVeSinhXaNewLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.sol.ns.vesinhmoitruong
	 * .dao.service.DanhGiaVeSinhXaNewLocalServiceUtil} to access the danh gia
	 * ve sinh xa new local service.
	 */

	public void initDanhGiaVeSinh(String maTinh, String maHuyen, int nam,
			int userId) throws SystemException {

		int count = countByMaTinhHuyenNam(maTinh, maHuyen, nam);

		if (count == 0 && Validator.isNotNull(maHuyen)) {
			List<DanhGiaVeSinhXaNewFake> listInsert = DanhGiaVeSinhXaNewFakeLocalServiceUtil
					.getListDanhGiaVeSinhXaInsert(maTinh, maHuyen, nam,
							QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			DanhGiaVeSinhXaNew ett = null;
			for (DanhGiaVeSinhXaNewFake ettFake : listInsert) {
				ett = new DanhGiaVeSinhXaNewImpl();
				long id = counterLocalService
						.increment(DanhGiaVeSinhXaNew.class.getName());
				ett = danhGiaVeSinhXaNewPersistence.create(Integer.valueOf(id
						+ ""));
				ett.setMaTinh(ettFake.getMaTinh());
				ett.setMaHuyen(ettFake.getMaHuyen());
				ett.setMaXa(ettFake.getMaXa());
				ett.setTongSoHGD(ettFake.getTongSoHGD());
				ett.setTongSoTruongHoc(ettFake.getTongSoTruongHoc());
				ett.setTongSoTramYTe(ettFake.getTongSoTramYTe());
				ett.setGhiChu("");
				ett.setNgayTao(new Date());
				ett.setIdNguoiTao(userId);
				ett.setSoDan(ettFake.getSoDan());
				ett.setNam(ettFake.getNam());
				ett.setSoNhaTieuHVSXayMoi(ettFake.getSoNhaTieuHVSXayMoi());
				//ti le %
				int countHGDCoNhaTieuXayMoi = 0;
				int countHGDCoNhaTieu = 0;
				int countHGDCoNhaTieuHVS = 0;
				int countTruongHocHVS = 0;
				int countTramYTeHVS = 0;
				countHGDCoNhaTieuXayMoi = VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch("", "", ettFake.getMaXa(), "", "2", "","");
				countHGDCoNhaTieu = VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch("", "", ettFake.getMaXa(), "", "2", "","")
									+ VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch("", "", ettFake.getMaXa(), "", "3", "","")
									+ VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch("", "", ettFake.getMaXa(), "", "4", "","");
				countHGDCoNhaTieuHVS = VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch("", "", ettFake.getMaXa(), "", "2", "","")
										+ VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch("", "", ettFake.getMaXa(), "", "3", "","");
				countTruongHocHVS = VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch("", "", ettFake.getMaXa(), "", "1", "2", "")
									+ VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch("", "", ettFake.getMaXa(), "", "2", "2", "")
									+ VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch("", "", ettFake.getMaXa(), "", "3", "2", "");
				countTramYTeHVS = VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch("", "", ettFake.getMaXa(), "", "4", "2", "");
				//
				int tongSoHGDTrongMau =0;
				MAUKIEMDEM mkd = null;
				try {
					mkd = MAUKIEMDEMLocalServiceUtil.getMauKiemDemByTHXN(ettFake.getMaTinh(), ettFake.getMaXa(), ettFake.getMaHuyen(), ettFake.getNam());
				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(Validator.isNotNull(mkd)){
					tongSoHGDTrongMau = mkd.getSoMauNgauNhien();
				}
				_log.info("tongSoHGDTrongMau: "+tongSoHGDTrongMau);
				_log.info("countHGDCoNhaTieuXayMoi: "+countHGDCoNhaTieuXayMoi);
				_log.info("countHGDCoNhaTieu: "+countHGDCoNhaTieu);
				_log.info("countHGDCoNhaTieuHVS: "+countHGDCoNhaTieuHVS);
				_log.info("countTruongHocHVS: "+countTruongHocHVS);
				_log.info("countTramYTeHVS: "+countTramYTeHVS);
				Float tiLeHGDCoNhaTieu = tongSoHGDTrongMau>0?(Float.valueOf(countHGDCoNhaTieu) /tongSoHGDTrongMau)*100:0;
				Float tiLeHGDCoNhaTieuHVS = tongSoHGDTrongMau>0?(Float.valueOf(countHGDCoNhaTieuHVS)/tongSoHGDTrongMau)*100:0;
				Float tiLeTramYTeHVS = ettFake.getTongSoTramYTe()>0?(Float.valueOf(countTramYTeHVS)/ettFake.getTongSoTramYTe())*100:0;
				Float tiLeTruongHocHVS = ettFake.getTongSoTruongHoc()>0?(Float.valueOf(countTruongHocHVS)/ettFake.getTongSoTruongHoc())*100:0;
				ett.setTiLeHGDCoNhaTieu(Math.round(tiLeHGDCoNhaTieu));
				ett.setTiLeHGDCoNhaTieuHVS(Math.round(tiLeHGDCoNhaTieuHVS));
				ett.setTiLeTramYTeHVS(Math.round(tiLeTramYTeHVS));
				ett.setTiLeTruongHocHVS(Math.round(tiLeTruongHocHVS));
				//
				ett.setSoHGDCoNhaTieu(countHGDCoNhaTieuXayMoi);
				//danh gioa ket luan VSTX
				if(tongSoHGDTrongMau > 0
						&& ettFake.getTongSoTramYTe() > 0
						&& ettFake.getTongSoTruongHoc() > 0){
					
				}
				if(tiLeTruongHocHVS == 100 
						&& tiLeTramYTeHVS == 100
						&& tiLeHGDCoNhaTieuHVS == 100
						&& tiLeHGDCoNhaTieu >= 70){
					ett.setKetLuanVSTX(1);
				}else{
					ett.setKetLuanVSTX(2);
				}
				danhGiaVeSinhXaNewPersistence.update(ett);
			}
		}
	}

	public int countByMaTinhHuyenNam(String maTinh, String maHuyen, int nam)
			throws SystemException {
		return danhGiaVeSinhXaNewPersistence
				.findByF_T_H_N(maTinh, maHuyen, nam).size();
	}

	public List<DanhGiaVeSinhXaNew> getListInsertVeSinhXa(String maTinh,
			String maHuyen, int nam) throws SystemException {
		return danhGiaVeSinhXaNewPersistence
				.findByF_T_H_N(maTinh, maHuyen, nam);
	}
	private static Log _log = LogFactoryUtil.getLog(DanhGiaVeSinhXaNewLocalServiceImpl.class);
}