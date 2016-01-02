package vn.dtt.cmon.kiemdemvien.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien;
import vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienImpl;
import vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil;
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.sol.ns.business.UserMappingBusiness;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;

public class KiemDemVienAction {

	public KiemDemVien getKiemDemVien(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		KiemDemVien kiemDemVien = new KiemDemVienImpl();

		String orgCode2 = StringPool.BLANK;

		long id = ParamUtil.getLong(actionRequest, "id");
		String hoVaTen = ParamUtil.getString(actionRequest, "hoVaTen");
		String taiKhoan = ParamUtil.getString(actionRequest, "taiKhoan");
		String matKhau = ParamUtil.getString(actionRequest, "matKhau");
		String diaChi = ParamUtil.getString(actionRequest, "diaChi");
		String chungMinhThu = ParamUtil
				.getString(actionRequest, "chungMinhThu");
		String dienThoai = ParamUtil.getString(actionRequest, "dienThoai");

		String maTinh = ParamUtil.getString(actionRequest, "maTinh");

		int capHoatDong = ParamUtil.getInteger(actionRequest, "capHoatDong");
		String imei = ParamUtil.getString(actionRequest, "imei");
		long idQuanLy = ParamUtil.getLong(actionRequest, "idQuanLy");
		String nameQuanLy = StringPool.BLANK;

		long trangThai = ParamUtil.getLong(actionRequest, "trangThai", 1);

		UserMapping um = UserMappingBusiness.getByUserId(idQuanLy);

		if (Validator.isNotNull(um)) {
			nameQuanLy = um.getName();
		}

		// Cap hoat dong 2 : Huyen
		// Cap hoat dong 3 : TramCap
		if (capHoatDong == 2) {
			orgCode2 = ParamUtil.getString(actionRequest, "maHuyen");
		} else if (capHoatDong == 3) {
			orgCode2 = ParamUtil.getString(actionRequest, "maTramCap");
		}

		kiemDemVien.setId(id);
		kiemDemVien.setHoVaTen(hoVaTen);
		kiemDemVien.setTaiKhoan(taiKhoan);
		kiemDemVien.setMatKhau(matKhau);
		kiemDemVien.setDiaChi(diaChi);
		kiemDemVien.setChungMinhThu(chungMinhThu);
		kiemDemVien.setDienThoai(dienThoai);
		kiemDemVien.setOrgCode1(maTinh);
		kiemDemVien.setOrgCode2(orgCode2);
		kiemDemVien.setCapHoatDong(capHoatDong);
		kiemDemVien.setImei(imei);
		kiemDemVien.setIdQuanLy(idQuanLy);
		kiemDemVien.setNameQuanLy(nameQuanLy);
		kiemDemVien.setTrangThai(trangThai);

		return kiemDemVien;
	}

	public void addKiemDemVien(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortalException,
			SystemException {

		ServiceContext context = ServiceContextFactory
				.getInstance(actionRequest);

		String orgCode2 = StringPool.BLANK;

		long id = ParamUtil.getLong(actionRequest, "id");
		String hoVaTen = ParamUtil.getString(actionRequest, "hoVaTen");
		String taiKhoan = ParamUtil.getString(actionRequest, "taiKhoan");
		String matKhau = ParamUtil.getString(actionRequest, "matKhau");
		String diaChi = ParamUtil.getString(actionRequest, "diaChi");
		String chungMinhThu = ParamUtil
				.getString(actionRequest, "chungMinhThu");
		String dienThoai = ParamUtil.getString(actionRequest, "dienThoai");

		String maTinh = ParamUtil.getString(actionRequest, "maTinh");

		int capHoatDong = ParamUtil.getInteger(actionRequest, "capHoatDong");
		String imei = ParamUtil.getString(actionRequest, "imei");
		long idQuanLy = ParamUtil.getLong(actionRequest, "idQuanLy");
		String nameQuanLys = StringPool.BLANK;

		long trangThai = ParamUtil.getLong(actionRequest, "trangThai", 1);

		UserMapping um = UserMappingBusiness.getByUserId(idQuanLy);

		if (Validator.isNotNull(um)) {
			nameQuanLys = um.getName();
		}


		orgCode2 = ParamUtil.getString(actionRequest, "orgCode2");


		try {
			KiemDemVienLocalServiceUtil.updateKiemDemVien(id, hoVaTen,
					taiKhoan, matKhau, capHoatDong, maTinh, orgCode2, diaChi,
					chungMinhThu, dienThoai, imei, trangThai, idQuanLy,
					nameQuanLys, context);
		} catch (Exception e) {
			_log.error(e);
		}

	}

	public void deleteKiemDemVien(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		long id = ParamUtil.getLong(actionRequest, "id");

		try {
			KiemDemVienLocalServiceUtil.deleteKiemDemVien(id);
		} catch (Exception e) {
			_log.error(e);
		}
	}

	public void chuyenTrangThai(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		long id = ParamUtil.getLong(actionRequest, "id");

		try {
			KiemDemVienLocalServiceUtil.chuyenTrangThai(id);
		} catch (Exception e) {
			_log.error(e);
		}
	}

	public void editKiemDemVien(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortalException,
			SystemException {
		long id = ParamUtil.getLong(actionRequest, "id");

		String hoVaTen = ParamUtil.getString(actionRequest, "hoVaTen");
		String taiKhoan = ParamUtil.getString(actionRequest, "taiKhoan");
		String matKhau = ParamUtil.getString(actionRequest, "matKhau");
		String diaChi = ParamUtil.getString(actionRequest, "diaChi");
		String chungMinhThu = ParamUtil
				.getString(actionRequest, "chungMinhThu");
		String dienThoai = ParamUtil.getString(actionRequest, "dienThoai");

		int capHoatDong = ParamUtil.getInteger(actionRequest, "capHoatDong");
		String maTinh = ParamUtil.getString(actionRequest, "maTinh");
		String maHuyen = ParamUtil.getString(actionRequest, "maHuyen");
		String maTram = ParamUtil.getString(actionRequest, "maTram");
		String imei = ParamUtil.getString(actionRequest, "imei");

		String orgCode1 = StringPool.BLANK;
		String orgCode2 = StringPool.BLANK;

		if (capHoatDong == 1) {
			orgCode1 = maTinh;
			orgCode2 = StringPool.BLANK;

		} else if (capHoatDong == 2) {
			orgCode1 = maTinh;
			orgCode2 = maHuyen;

		} else if (capHoatDong == 3) {
			orgCode1 = maTinh;
			orgCode2 = maTram;
		}

		KiemDemVien kiemDemVien = KiemDemVienLocalServiceUtil
				.getKiemDemVien(id);
		kiemDemVien.setHoVaTen(hoVaTen);
		kiemDemVien.setTaiKhoan(taiKhoan);
		kiemDemVien.setCapHoatDong(capHoatDong);
		kiemDemVien.setOrgCode1(orgCode1);
		kiemDemVien.setOrgCode2(orgCode2);
		kiemDemVien.setDiaChi(diaChi);
		kiemDemVien.setDienThoai(dienThoai);
		kiemDemVien.setChungMinhThu(chungMinhThu);
		kiemDemVien.setImei(imei);

		if (matKhau != StringPool.BLANK) {
			kiemDemVien.setMatKhau(matKhau);
		}

		try {
			KiemDemVienLocalServiceUtil.updateKiemDemVien(kiemDemVien);
		} catch (Exception e) {
			_log.error(e);
		}
	}

	private static final Log _log = LogFactoryUtil
			.getLog(KiemDemVienAction.class);
}