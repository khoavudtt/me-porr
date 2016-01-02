package vn.dtt.sol.ns.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import vn.dtt.cmon.kiemdemvien.action.KiemDemVienAction;
import vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien;
import vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil;
import vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;
import vn.dtt.sol.ns.business.KiemDemVienBussiness;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class KiemDemVienPortlet extends MVCPortlet {

	/**
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 */
	public void addKiemDemVien(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {

		List<String> errors = new ArrayList<String>();

		String hoVaTen = ParamUtil.getString(actionRequest, "hoVaTen");
		String taiKhoan = ParamUtil.getString(actionRequest, "taiKhoan");
		String matKhau1 = ParamUtil.getString(actionRequest, "matKhau");
		String matKhau2 = ParamUtil.getString(actionRequest, "reTypeMatKhau");
		int capHoatDong = ParamUtil.getInteger(actionRequest, "capHoatDong");
		String maTramCap = ParamUtil.getString(actionRequest, "orgCode2", "0");

		String maHuyen = ParamUtil.getString(actionRequest, "orgCode2", "0");

		long maGSV = ParamUtil.getLong(actionRequest, "idQuanLy");

		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		boolean valid = validate(hoVaTen, taiKhoan, matKhau1, matKhau2,
				capHoatDong, maTramCap, maHuyen, maGSV, errors, cmd);

		KiemDemVienAction action = new KiemDemVienAction();

		if (valid) {
			try {

				action.addKiemDemVien(actionRequest, actionResponse);
				
				SessionMessages.add(actionRequest,
						cmd.contentEquals(Constants.ADD) ? "success-them-thanh-cong-kiem-dem-vien" : "success-sua-thanh-cong-kiem-dem-vien");

				actionRequest.getPortletSession().setAttribute("kiemDemVien",
						null);

			} catch (Exception e) {
				_log.error(e);
				SessionErrors.add(actionRequest, e.getClass().getName());
			}
		} else {
			for (String error : errors) {
				SessionErrors.add(actionRequest, error);
			}

			KiemDemVien kdv = action.getKiemDemVien(actionRequest,
					actionResponse);

			actionRequest.getPortletSession().setAttribute("kiemDemVien", kdv);
		}

		sendCustomRedirect(actionRequest, actionResponse);
	}

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {

		try {
			long idKdv = ParamUtil.getLong(request, "id");

			KiemDemVien kdv = null;

			if (idKdv != 0) {
				kdv = KiemDemVienBussiness.getKiemDemVien(idKdv);
			}
			request.setAttribute("kiemDemVien", kdv);

		} catch (Exception e) {
			if (e instanceof NoSuchBaoCaoDLIException
					|| e instanceof PrincipalException) {

				SessionErrors.add(request, e.getClass().getName());

				SessionMessages
						.add(request,
								PortalUtil.getPortletId(request)
										+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			} else {
				throw new PortletException(e);
			}
		}

		_log.info(new Date() + "into render");
		super.render(request, response);
	}

	/**
	 * @param hoTen
	 * @param taiKhoan
	 * @param matKhau1
	 * @param matKhau2
	 * @param capHoatDong
	 * @param maTramCap
	 * @param maHuyen
	 * @param maGSV
	 * @return
	 */
	protected boolean validate(String hoTen, String taiKhoan, String matKhau1,
			String matKhau2, int capHoatDong, String maTramCap, String maHuyen,
			long maGSV, List<String> errors, String cmd) {

		boolean valid = true;

		if (Validator.isNull(hoTen) && hoTen.trim().length() == 0) {
			errors.add("ten-trong-hoac-khong-hop-le");
			valid = false;
		}

		if (Validator.isNull(taiKhoan) && taiKhoan.trim().length() == 0) {
			errors.add("tai-khoan-trong-hoac-khong-hop-le");
			valid = false;
		} else {
			if (cmd.contentEquals(Constants.ADD)) {
				KiemDemVien kdv = null;
				try {
					kdv = KiemDemVienLocalServiceUtil
							.getKiemDemVienByTaiKhoan(taiKhoan);
					// trung tai khoan kiem dem vien
					if (Validator.isNotNull(kdv)) {
						errors.add("tai-khoan-da-ton-tai");
						valid = false;
					}
				} catch (Exception e) {
					_log.error(e);
				}
			}
		}

		if (cmd.contentEquals(Constants.ADD)) {
			if (Validator.isNotNull(matKhau1)
					&& Validator.isNotNull(matKhau2)
					&& !StringUtil.lowerCase(matKhau1).contentEquals(
							StringUtil.lowerCase(matKhau2))) {
				errors.add("mat-khau-nhap-khong-trung");
				valid = false;
			}
		} else {
			if (!StringUtil.lowerCase(matKhau1).contentEquals(
							StringUtil.lowerCase(matKhau2))) {
				errors.add("mat-khau-nhap-khong-trung");
				valid = false;
			}
		}

		if (capHoatDong == 0) {
			errors.add("cap-hoat-dong-khong-dung");
			valid = false;
		} else {
			if (capHoatDong == 2
					&& (Validator.isNull(maHuyen) && maHuyen.trim().length() == 0)) {
				errors.add("ma-huyen-khong-ton-tai");

				valid = false;
			}

			if (capHoatDong == 3
					&& (Validator.isNull(maTramCap) && maTramCap.trim()
							.length() == 0)) {
				errors.add("ma-tram-cap-khong-ton-tai");

				valid = false;
			}
		}

		if (maGSV == 0) {
			errors.add("chua-chon-giam-sat-vien");

			valid = false;
		}

		return valid;
	}

	public void editKiemDemVien(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		try {

			KiemDemVienAction action = new KiemDemVienAction();
			action.editKiemDemVien(actionRequest, actionResponse);

		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass().getName());
		}

		sendCustomRedirect(actionRequest, actionResponse);
	}

	public void deleteKiemDemVien(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		try {

			KiemDemVienAction action = new KiemDemVienAction();
			action.deleteKiemDemVien(actionRequest, actionResponse);

		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass().getName());
		}

		sendCustomRedirect(actionRequest, actionResponse);
	}

	public void chuyenTrangThai(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		try {

			KiemDemVienAction action = new KiemDemVienAction();
			action.chuyenTrangThai(actionRequest, actionResponse);

		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass().getName());
		}

		sendCustomRedirect(actionRequest, actionResponse);
	}

	public void search(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortalException,
			SystemException {

		String capHoatDong = ParamUtil.getString(actionRequest, "capHoatDong");
		String maTinh = ParamUtil.getString(actionRequest, "maTinh");
		String maHuyen = ParamUtil.getString(actionRequest, "maHuyen");
		String maTram = ParamUtil.getString(actionRequest, "maTram");
		String orgCode = StringPool.BLANK;

		if (capHoatDong.equals("1")) {
			orgCode = maTinh;
		} else if (capHoatDong.equals("2")) {
			orgCode = maHuyen;
		} else if (capHoatDong.equals("3")) {
			orgCode = maTram;
		}

		System.out.println("orgCode=" + orgCode);

		actionResponse.setRenderParameter("jspPage",
				"/html/portlet/kiemdemvien/view.jsp");
		actionResponse.setRenderParameter("capHoatDong", capHoatDong);
		actionResponse.setRenderParameter("maTinh", maTinh);
		actionResponse.setRenderParameter("orgCode", orgCode);

	}

	private void sendCustomRedirect(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {

		if (!SessionErrors.isEmpty(actionRequest)) {
			String currentURL = ParamUtil
					.getString(actionRequest, "currentURL");

			SessionMessages
					.add(actionRequest,
							PortalUtil.getPortletId(actionRequest)
									+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);

			if (Validator.isNotNull(currentURL)) {
				actionResponse.sendRedirect(currentURL);
			}
		} else {
			String backURL = ParamUtil.getString(actionRequest, "backURL");

			SessionMessages
					.add(actionRequest,
							PortalUtil.getPortletId(actionRequest)
									+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);

			if (Validator.isNotNull(backURL)) {
				actionResponse.sendRedirect(backURL);
			}
		}
	}

	private static Log _log = LogFactoryUtil.getLog(KiemDemVienPortlet.class);

}
