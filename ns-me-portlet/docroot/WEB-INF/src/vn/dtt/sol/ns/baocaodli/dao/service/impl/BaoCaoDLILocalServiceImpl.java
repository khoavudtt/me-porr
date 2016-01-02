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

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.sol.ns.baocaodli.dao.NgayBaoCaoException;
import vn.dtt.sol.ns.baocaodli.dao.NguoiDuyetException;
import vn.dtt.sol.ns.baocaodli.dao.NguoiLapException;
import vn.dtt.sol.ns.baocaodli.dao.SoBaoCaoException;
import vn.dtt.sol.ns.baocaodli.dao.UpdateChotBaoCaoException;
import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI;
import vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIImpl;
import vn.dtt.sol.ns.baocaodli.dao.service.base.BaoCaoDLILocalServiceBaseImpl;
import vn.dtt.sol.ns.baocaodli.util.BaoCaoDLIConstants;
import vn.dtt.sol.ns.business.DataItemBusiness;

/**
 * The implementation of the bao cao d l i local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLILocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author HuyMQ
 * @see vn.dtt.sol.ns.baocaodli.dao.service.base.BaoCaoDLILocalServiceBaseImpl
 * @see vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLILocalServiceUtil
 */
public class BaoCaoDLILocalServiceImpl extends BaoCaoDLILocalServiceBaseImpl {

	public boolean hasInitBaoCaoTongHop() throws PortalException,
			SystemException {
		boolean hasInit = true;
		
		Date now = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(now);

		int nam = cal.get(Calendar.YEAR);
		
		if(baoCaoDLITongHopPersistence.countByNam(nam) == 0) {
			hasInit = false;
		}
		
		return hasInit;
	}

	public void initBaoCao(int nam) throws SystemException {

		List<DATAITEM> dataItems = DataItemBusiness.getInLevel1(1);

		for (DATAITEM dataItem : dataItems) {
			if (dataItem.getStatus() == 1) {

				String maTinh = dataItem.getNode1();
				baoCaoDLILocalService.addBaoCao(nam, maTinh,
						BaoCaoDLIConstants.BAO_CAO_DLI_1_1);

				baoCaoDLILocalService.addBaoCao(nam, maTinh,
						BaoCaoDLIConstants.BAO_CAO_DLI_1_2);

				baoCaoDLILocalService.addBaoCao(nam, maTinh,
						BaoCaoDLIConstants.BAO_CAO_DLI_2_1);

				baoCaoDLILocalService.addBaoCao(nam, maTinh,
						BaoCaoDLIConstants.BAO_CAO_DLI_2_2);

				baoCaoDLILocalService.addBaoCao(nam, maTinh,
						BaoCaoDLIConstants.BAO_CAO_DLI_3);
				
				baoCaoDLILocalService.addBaoCao(nam, maTinh,
						BaoCaoDLIConstants.BAO_CAO_DLI_THVG);
			}
		}
	}

	public BaoCaoDLI addBaoCao(int nam, String maTinh, int loaiBaoCao)
			throws SystemException {

		BaoCaoDLI baoCao = baoCaoDLIPersistence.fetchByMaTinh_Nam_LoaiBaoCao(
				maTinh, nam, loaiBaoCao);

		if (baoCao == null) {
			Date now = new Date();

			long id = counterLocalService.increment(BaoCaoDLI.class.getName());

			baoCao = baoCaoDLIPersistence.create(id);

			baoCao.setNam(nam);
			baoCao.setMaTinh(maTinh);
			baoCao.setTrangThai(BaoCaoDLIConstants.TRANG_THAI_DANG_LAP);
			baoCao.setLoaiBaoCao(loaiBaoCao);
			baoCao.setNgayBaoCao(now);

			baoCao = baoCaoDLIPersistence.update(baoCao);
		}

		return baoCao;
	}

	public void deleteBaoCao(long baoCaoDLIId) throws PortalException,
			SystemException {

		BaoCaoDLI baoCao = baoCaoDLIPersistence.findByPrimaryKey(baoCaoDLIId);

		deleteBaoCao(baoCao);
	}

	/**
	 * Khi xoa se empty het du lieu cua bao cao
	 */
	public void deleteBaoCao(BaoCaoDLI baoCaoDLI) throws PortalException,
			SystemException {

		BaoCaoDLI baoCaoDLIDelete = new BaoCaoDLIImpl();

		baoCaoDLIDelete.setId(baoCaoDLI.getId());
		baoCaoDLIDelete.setMaTinh(baoCaoDLI.getMaTinh());
		baoCaoDLIDelete.setNam(baoCaoDLI.getNam());
		baoCaoDLIDelete.setLoaiBaoCao(baoCaoDLI.getLoaiBaoCao());
		baoCaoDLIDelete.setNgayBaoCao(new Date());
		baoCaoDLIDelete.setTrangThai(BaoCaoDLIConstants.TRANG_THAI_DANG_LAP);

		baoCaoDLIPersistence.update(baoCaoDLIDelete);
	}

	public BaoCaoDLI updateBaoCao(long userId, long groupId, long baoCaoDLIId,
			int nam, String maTinh, String soBaoCao, String nguoiLap,
			String nguoiDuyet, int ngayBaoCaoMonth, int ngayBaoCaoDay,
			int ngayBaoCaoYear, long folderId, File luuTruPDF1,
			File luuTruPDF2, File luuTruCSV1, File luuTruCSV2, int trangThai,
			ServiceContext serviceContext) throws PortalException,
			SystemException {

		Date ngayBaoCao = PortalUtil.getDate(ngayBaoCaoMonth, ngayBaoCaoDay,
				ngayBaoCaoYear);

		if (trangThai == 0) {
			// validate(nam, null, nguoiLap, null, ngayBaoCao);
		} else {
			validate(soBaoCao, nguoiLap, nguoiDuyet, ngayBaoCao);
		}

		BaoCaoDLI baoCao = null;

		if (baoCaoDLIId > 0) {
			baoCao = baoCaoDLIPersistence.findByPrimaryKey(baoCaoDLIId);

			if (baoCao.getTrangThai() != 0) {
				throw new UpdateChotBaoCaoException();
			}
		} else {
			baoCaoDLIId = counterLocalService.increment(BaoCaoDLI.class
					.getName());
			baoCao = baoCaoDLIPersistence.create(baoCaoDLIId);
		}

		// baoCao.setNam(nam);
		// baoCao.setMaTinh(maTinh);
		baoCao.setSoBaoCao(soBaoCao);
		baoCao.setNguoiLap(nguoiLap);
		baoCao.setNguoiDuyet(nguoiDuyet);
		baoCao.setNgayBaoCao(ngayBaoCao);
		baoCao.setTrangThai(trangThai);

		long luuTruPDF1Id = 0;
		long luuTruPDF2Id = 0;
		long luuTruCSV1Id = 0;
		long luuTruCSV2Id = 0;

		if (luuTruPDF1 != null) {
			String luuTruPDF1Name = getFileBaoCaoName(nam, maTinh, baoCaoDLIId,
					"pdf1", ".pdf");

			FileEntry fileEntry = DLAppLocalServiceUtil.addFileEntry(userId,
					groupId, folderId, luuTruPDF1Name, StringPool.BLANK,
					luuTruPDF1Name, StringPool.BLANK, StringPool.BLANK,
					luuTruPDF1, serviceContext);

			luuTruPDF1Id = fileEntry.getFileEntryId();
		}

		if (luuTruPDF2 != null) {
			String luuTruPDF2Name = getFileBaoCaoName(nam, maTinh, baoCaoDLIId,
					"pdf2", ".pdf");

			FileEntry fileEntry = DLAppLocalServiceUtil.addFileEntry(userId,
					groupId, folderId, luuTruPDF2Name, StringPool.BLANK,
					luuTruPDF2Name, StringPool.BLANK, StringPool.BLANK,
					luuTruPDF2, serviceContext);

			luuTruPDF2Id = fileEntry.getFileEntryId();
		}

		if (luuTruCSV1 != null) {
			String luuTruCSV1Name = getFileBaoCaoName(nam, maTinh, baoCaoDLIId,
					"csv1", ".csv");

			FileEntry fileEntry = DLAppLocalServiceUtil.addFileEntry(userId,
					groupId, folderId, luuTruCSV1Name, StringPool.BLANK,
					luuTruCSV1Name, StringPool.BLANK, StringPool.BLANK,
					luuTruCSV1, serviceContext);

			luuTruCSV1Id = fileEntry.getFileEntryId();
		}

		if (luuTruCSV2 != null) {
			String luuTruCSV2Name = getFileBaoCaoName(nam, maTinh, baoCaoDLIId,
					"csv2", ".csv");

			FileEntry fileEntry = DLAppLocalServiceUtil.addFileEntry(userId,
					groupId, folderId, luuTruCSV2Name, StringPool.BLANK,
					luuTruCSV2Name, StringPool.BLANK, StringPool.BLANK,
					luuTruCSV2, serviceContext);

			luuTruCSV2Id = fileEntry.getFileEntryId();
		}

		baoCao.setLuuTruPDF1Id(luuTruPDF1Id);
		baoCao.setLuuTruPDF2Id(luuTruPDF2Id);
		baoCao.setLuuTruCSV1Id(luuTruCSV1Id);
		baoCao.setLuuTruCSV2Id(luuTruCSV2Id);

		baoCaoDLIPersistence.update(baoCao);

		return baoCao;
	}

	/**
	 * 
	 * @param maTinh
	 * @return
	 * @throws SystemException
	 */
	public int countByMaTinh(String maTinh) throws SystemException {

		return baoCaoDLIPersistence.countByMaTinh(maTinh);
	}

	/**
	 * 
	 * @param nam
	 * @return
	 * @throws SystemException
	 */
	public int countByNam(int nam) throws SystemException {

		return baoCaoDLIPersistence.countByNam(nam);
	}

	/**
	 * 
	 * @param maTinh
	 * @param nam
	 * @return
	 * @throws SystemException
	 */
	public BaoCaoDLI getByMaTinh_Nam(String maTinh, int nam)
			throws SystemException {

		return baoCaoDLIPersistence.fetchByMaTinh_Nam(maTinh, nam);
	}

	/**
	 * 
	 * @param maTinh
	 * @param start
	 * @param end
	 * @param obc
	 * @return
	 * @throws SystemException
	 */
	public List<BaoCaoDLI> getByMaTinh(String maTinh, int start, int end,
			OrderByComparator obc) throws SystemException {

		return baoCaoDLIPersistence.findByMaTinh(maTinh, start, end, obc);
	}

	/**
	 * 
	 * @param nam
	 * @param start
	 * @param end
	 * @param obc
	 * @return
	 * @throws SystemException
	 */
	public List<BaoCaoDLI> getByNam(int nam, int start, int end,
			OrderByComparator obc) throws SystemException {

		return baoCaoDLIPersistence.findByNam(nam, start, end, obc);
	}

	public List<BaoCaoDLI> search(String maTinh, int loaiBaoCao, int nam,
			Integer trangThai, int start, int end, OrderByComparator obc)
			throws SystemException {

		return baoCaoDLIFinder.searchDLI(maTinh, loaiBaoCao, nam, trangThai,
				start, end, obc);
	}

	public int searchCount(String maTinh, int loaiBaoCao, int nam,
			Integer trangThai) throws SystemException {

		return baoCaoDLIFinder.searchCountDLI(maTinh, loaiBaoCao, nam,
				trangThai);
	}

	public List<BaoCaoDLI> search(String maTinh, int nam, Integer trangThai,
			int start, int end, OrderByComparator obc) throws SystemException {

		return baoCaoDLIFinder.search(maTinh, nam, trangThai, start, end, obc);
	}

	public int searchCount(String maTinh, int nam, Integer trangThai)
			throws SystemException {

		return baoCaoDLIFinder.searchCount(maTinh, nam, trangThai);
	}

	private void validate(String soBaoCao, String nguoiLap, String nguoiDuyet,
			Date ngayBaoCao) throws PortalException {

		if (Validator.isNull(soBaoCao)) {
			throw new SoBaoCaoException();
		}

		if (Validator.isNull(nguoiLap)) {
			throw new NguoiLapException();
		}

		if (Validator.isNull(nguoiDuyet)) {
			throw new NguoiDuyetException();
		}

		if (Validator.isNull(ngayBaoCao)) {
			throw new NgayBaoCaoException();
		}
	}

	/**
	 * 
	 * @param namBaoCao
	 * @param maTinh
	 * @param baoCaoDLIId
	 * @param suffix
	 * @param fileExtension
	 * @return
	 */
	private String getFileBaoCaoName(int namBaoCao, String maTinh,
			long baoCaoDLIId, String suffix, String fileExtension) {

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

		StringBuilder sb = new StringBuilder(10);

		sb.append(namBaoCao);
		sb.append(StringPool.UNDERLINE);
		sb.append(maTinh);
		sb.append(StringPool.UNDERLINE);
		sb.append(baoCaoDLIId);
		sb.append(StringPool.UNDERLINE);
		sb.append(suffix);
		sb.append(StringPool.UNDERLINE);
		sb.append(sdf.format(now));
		sb.append(fileExtension);

		return sb.toString();
	}
}