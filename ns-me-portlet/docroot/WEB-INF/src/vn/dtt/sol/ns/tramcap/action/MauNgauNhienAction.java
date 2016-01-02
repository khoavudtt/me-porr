package vn.dtt.sol.ns.tramcap.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.portlet.ActionRequest;

import vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM;
import vn.dtt.sol.ns.maungaunhien.dao.service.MAUKIEMDEMLocalServiceUtil;
import vn.dtt.sol.ns.maungaunhien.utils.MauKiemKemUtils;
import vn.dtt.sol.ns.tramcap.business.MauNgauNhienBusiness;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;

public class MauNgauNhienAction {

	/**
	 * @param request
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public MAUKIEMDEM updateMauNgauNhien(ActionRequest request)
			throws PortalException, SystemException {

		ServiceContext context = ServiceContextFactory.getInstance(request);

		MAUKIEMDEM mauKiemDem = null;

		long id = 0;

		// ParamUtil.getLong(request, "id");

		String maTinh = ParamUtil.getString(request, "maTinh");
		String maHuyen = ParamUtil.getString(request, "maHuyen");
		String maXa = ParamUtil.getString(request, "maXa");
		int nam = ParamUtil.getInteger(request, "nam");
		
		long seedNumber = ParamUtil.getLong(request, "seedNumber");
		
		int soMau = MauKiemKemUtils.getSoMau(maTinh, maHuyen, maXa);

		int soMauChon = MauKiemKemUtils.getSoMauNgauNhien(5, soMau);

		int soMauDuPhong = 0;

		// neu so mau nho hon 500 thi so mau du phong = 0
		if (soMau > 500)
			soMauDuPhong = new Double(soMauChon * 0.05).intValue();

		// int soMauHVS = ParamUtil.getInteger(request, "soMauHVS");
		// int soMauCoNhaTieu = ParamUtil.getInteger(request, "soMauCoNhaTieu");
		// int soMauKiemDem = ParamUtil.getInteger(request, "soMauKiemDem");

		MAUKIEMDEM mkd = MauNgauNhienBusiness.getMauKiemDemByTHXN(maTinh,
				maHuyen, maXa, nam);

		if (Validator.isNotNull(mkd)) {
			id = mkd.getId();
		}

		mauKiemDem = MAUKIEMDEMLocalServiceUtil.updateMauKiemDem(id, maTinh,
				maHuyen, maXa, nam, soMau, soMau, soMauChon, soMauDuPhong,
				context);
		
		if (Validator.isNull(mauKiemDem)) {
			_log.info("khong them duoc mau kiem dem");
		}

		List<VeSinhGiaDinh> lsMauNgauNhien = randomMauKiemDem(maTinh, maHuyen,
				maXa, seedNumber, soMau, soMauChon, soMauDuPhong, true);
		
		List<VeSinhGiaDinh> lsMauDuPhong = randomMauKiemDem(maTinh, maHuyen,
				maXa, seedNumber, soMau, soMauChon, soMauDuPhong, false);

		List<VeSinhGiaDinh> lsVeSinhGiaDinh = MauNgauNhienBusiness
				.getVSDGByTHXMNN(maTinh, maHuyen, maXa, nam);

		// reset mau gia dinh
		for (VeSinhGiaDinh vsgd : lsVeSinhGiaDinh) {
			VeSinhGiaDinhLocalServiceUtil.updateVeSinhHoGiaDinhChonMau(
					vsgd.getId(), 0);
		}

		// cap nhat mau ngau nhien
		for (VeSinhGiaDinh vsgd : lsMauNgauNhien) {
			VeSinhGiaDinhLocalServiceUtil.updateVeSinhHoGiaDinhChonMau(
					vsgd.getId(), nam);
		}
		
		// cap nhat mau du phong
		for (VeSinhGiaDinh vsgd : lsMauDuPhong) {
			VeSinhGiaDinhLocalServiceUtil.updateVeSinhHoGiaDinhChonMau(
					vsgd.getId(), nam * 10);
		}

		return mauKiemDem;
	}

	/**
	 * @param request
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void deleteMauKiemDem(ActionRequest request) throws PortalException,
			SystemException {
		long id = ParamUtil.getLong(request, "id");

		MAUKIEMDEM mauKiemDem = null;

		try {
			mauKiemDem = MAUKIEMDEMLocalServiceUtil.fetchMAUKIEMDEM(id);
		} catch (Exception e) {
			_log.error(e);
		}

		if (Validator.isNotNull(mauKiemDem)) {
			MAUKIEMDEMLocalServiceUtil.deleteMAUKIEMDEM(mauKiemDem);
		}
	}

	/**
	 * Lay danh sach mau ngau nhien,
	 * 
	 * @param request
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public List<VeSinhGiaDinh> randomMauKiemDem(String maTinh, String maHuyen,
			String maXa, long seedNumber, int soMau, int soMauChon,
			int mauDuPhong, boolean isMauNgauNhien) throws PortalException,
			SystemException {

		List<VeSinhGiaDinh> lsVeSinhATX = new ArrayList<VeSinhGiaDinh>();

		try {

			lsVeSinhATX = VeSinhGiaDinhLocalServiceUtil.getVeSinhGiaDinhSearch(
					maTinh, maHuyen, maXa, StringPool.BLANK, StringPool.BLANK,
					StringPool.BLANK, StringPool.BLANK, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS);

		} catch (Exception e) {
			_log.error(e);
		}

		// copy to an modifiable array
		List<VeSinhGiaDinh> copyLs = new ArrayList<VeSinhGiaDinh>();

		for (VeSinhGiaDinh vs : lsVeSinhATX) {
			copyLs.add(vs);
		}

		Collections.shuffle(copyLs, new Random(seedNumber));

		List<VeSinhGiaDinh> randomMau = new ArrayList<VeSinhGiaDinh>();

		if (isMauNgauNhien) {
			randomMau = copyLs.subList(0, soMauChon);
		} else {
			if (mauDuPhong > 0) {
				randomMau = copyLs.subList(soMauChon, soMauChon + mauDuPhong);
			}
		}

		return randomMau;
	}

	private static Log _log = LogFactoryUtil.getLog(MauNgauNhienAction.class);
}
