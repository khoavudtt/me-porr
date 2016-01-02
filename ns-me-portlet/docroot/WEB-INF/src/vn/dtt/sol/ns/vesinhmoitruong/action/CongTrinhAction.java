package vn.dtt.sol.ns.vesinhmoitruong.action;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.cmon.user.dao.model.impl.UserMappingImpl;
import vn.dtt.sol.ns.business.DataItemBusiness;
import vn.dtt.sol.ns.business.UserMappingBusiness;
import vn.dtt.sol.ns.util.DiaBanQuanLyUtils;
import vn.dtt.sol.ns.util.MessageErrors;
import vn.dtt.sol.ns.util.MessageSuccess;
import vn.dtt.sol.ns.util.WebKeys;
import vn.dtt.sol.ns.vesinhmoitruong.business.CongTrinhBussiness;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhCongTrinhTerms;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class CongTrinhAction extends MVCPortlet {

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// TODO Auto-generated method stub
		_log.info("vao render");
		User user = null;
		UserMapping loginUserMapping = new UserMappingImpl();
		String maTinh = ParamUtil.getString(request,
				VeSinhCongTrinhTerms.MA_TINH);
		String maHuyen = ParamUtil.getString(request,
				VeSinhCongTrinhTerms.MA_HUYEN);
		String maXa = ParamUtil.getString(request, VeSinhCongTrinhTerms.MA_XA);
		String loaiNhaTieu = ParamUtil.getString(request,
				VeSinhCongTrinhTerms.LOAI_NHA_TIEU);
		String loaiCongTrinh = ParamUtil.getString(request,
				VeSinhCongTrinhTerms.LOAI_CONG_TRINH);
		String id = ParamUtil.getString(request, VeSinhCongTrinhTerms.ID);
		String trangThai = ParamUtil.getString(request,
				VeSinhCongTrinhTerms.TRANG_THAI);
		String namBaoCao = ParamUtil.getString(request,
				VeSinhCongTrinhTerms.NAM_BAO_CAO);

		boolean isSupperAdmin = request.isUserInRole("Administrator");

		List<DATAITEM> listTinh = new ArrayList<DATAITEM>();
		List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
		List<DATAITEM> listXa = new ArrayList<DATAITEM>();
		List<DATAITEM> listLoaiNhaTieu = new ArrayList<DATAITEM>();
		List<DATAITEM> listLoaiNguonNuoc = new ArrayList<DATAITEM>();
		List<DATAITEM> listLoaiCongTrinh = new ArrayList<DATAITEM>();
		VeSinhCongTrinh veSinhCongTrinh = null;

		try {
			user = PortalUtil.getUser(request);
			loginUserMapping = UserMappingBusiness.getUserMapping(user);
			if (Validator.isNotNull(id)) {
				veSinhCongTrinh = CongTrinhBussiness
						.fetchVeSinhCongTrinh(Integer.valueOf(id));
				maTinh = veSinhCongTrinh.getMaTinh();
				maHuyen = veSinhCongTrinh.getMaHuyen();
			}

			if (Validator.isNull(maTinh)
					&& Validator.isNotNull(loginUserMapping)) {
				maTinh = loginUserMapping.getOrgCode1();
			}

			listTinh = DiaBanQuanLyUtils.getTinh(user, isSupperAdmin,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listHuyen = DiaBanQuanLyUtils.getHuyen(user,
					maTinh, 0l, isSupperAdmin,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listXa = DiaBanQuanLyUtils.getXa(user, maTinh, maHuyen, 0l,
					isSupperAdmin, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listLoaiNhaTieu = DataItemBusiness
					.getByDataGroupId(WebKeys.DATAGROUPID_LOAICAUTIEU);
			listLoaiNguonNuoc = DataItemBusiness
					.getByDataGroupId(WebKeys.DATAGROUPID_LOAINGUONNUOC);
			listLoaiCongTrinh = DataItemBusiness
					.getByDataGroupId(WebKeys.DATAGROUPID_LOAICONGTRINH);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute(VeSinhCongTrinhTerms.MA_TINH, maTinh);
		request.setAttribute(VeSinhCongTrinhTerms.MA_HUYEN, maHuyen);
		request.setAttribute(VeSinhCongTrinhTerms.MA_XA, maXa);
		request.setAttribute(VeSinhCongTrinhTerms.ID, id);
		request.setAttribute(VeSinhCongTrinhTerms.LOAI_NHA_TIEU, loaiNhaTieu);
		request.setAttribute(VeSinhCongTrinhTerms.LOAI_CONG_TRINH,
				loaiCongTrinh);
		request.setAttribute(VeSinhCongTrinhTerms.TRANG_THAI, trangThai);
		request.setAttribute(VeSinhCongTrinhTerms.NAM_BAO_CAO, namBaoCao);
		request.setAttribute("listTinh", listTinh);
		request.setAttribute("listHuyen", listHuyen);
		request.setAttribute("listXa", listXa);
		request.setAttribute("listLoaiNhaTieu", listLoaiNhaTieu);
		request.setAttribute("listLoaiNguonNuoc", listLoaiNguonNuoc);
		request.setAttribute("listLoaiCongTrinh", listLoaiCongTrinh);
		request.setAttribute("veSinhCongTrinh", veSinhCongTrinh);
		request.setAttribute("loginUserMapping", loginUserMapping);
		super.render(request, response);
	}

	public void addCongTrinh(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.ADD_CONG_TRINH_MESSAGE;
		long idReturn = 0;
		VeSinhCongTrinhTerms veSinhCongTrinhTerm = new VeSinhCongTrinhTerms(
				actionRequest);
		String add = "";
		add = ParamUtil.getString(actionRequest, Constants.CMD);
		long userId = PortalUtil.getUserId(actionRequest);
		try {

			VeSinhCongTrinh veSinhCongTrinhEtt = new VeSinhCongTrinhImpl();
			if (add.equals(Constants.ADD)) {
				long id = 0;
				id = CounterLocalServiceUtil.increment(VeSinhCongTrinh.class
						.getName());
				veSinhCongTrinhEtt = VeSinhCongTrinhLocalServiceUtil
						.createVeSinhCongTrinh(Integer.valueOf(id + ""));
				veSinhCongTrinhEtt.setIdNguoiTao(String.valueOf(userId));
				veSinhCongTrinhEtt.setNgayTao(new Date());
				messageKey = MessageSuccess.ADD_CONG_TRINH_MESSAGE;
			} else {
				veSinhCongTrinhEtt = VeSinhCongTrinhLocalServiceUtil
						.fetchVeSinhCongTrinh(veSinhCongTrinhTerm.getId());
				messageKey = MessageSuccess.EDIT_CONG_TRINH_MESSAGE;
				idReturn = veSinhCongTrinhEtt.getId();
			}
			veSinhCongTrinhEtt.setTenCongTrinh(veSinhCongTrinhTerm
					.getTenCongTrinh());
			veSinhCongTrinhEtt.setLoaiCongTrinh(veSinhCongTrinhTerm
					.getLoaiCongTrinh());
			veSinhCongTrinhEtt.setDiaChi(veSinhCongTrinhTerm.getDiaChi());
			veSinhCongTrinhEtt.setMaHuyen(veSinhCongTrinhTerm.getMaHuyen());
			veSinhCongTrinhEtt.setNhaTieuHVS(veSinhCongTrinhTerm
					.getNhaTieuHVS());

			veSinhCongTrinhEtt.setMaTinh(veSinhCongTrinhTerm.getMaTinh());
			veSinhCongTrinhEtt.setMaXa(veSinhCongTrinhTerm.getMaXa());
			veSinhCongTrinhEtt.setLoaiNhaTieu(veSinhCongTrinhEtt
					.getLoaiNhaTieu());
			veSinhCongTrinhEtt.setLoaiNguonNuoc(veSinhCongTrinhTerm
					.getLoaiNguonNuoc());
			veSinhCongTrinhEtt.setNamBaoCao(veSinhCongTrinhTerm.getNamBaoCao());
			if (veSinhCongTrinhEtt.getNamBaoCao() == 0) {
				veSinhCongTrinhEtt.setTrangThai(0);
			} else {
				veSinhCongTrinhEtt.setTrangThai(2);
			}

			veSinhCongTrinhEtt.setGhiChu(veSinhCongTrinhTerm.getGhiChu());
			// update
			VeSinhCongTrinhLocalServiceUtil
					.updateVeSinhCongTrinh(veSinhCongTrinhEtt);
			isSuccess = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			if (add.equals(Constants.ADD)) {
				messageKey = MessageErrors.ADD_CONG_TRINH_MESSAGE;
			} else {
				messageKey = MessageErrors.EDIT_CONG_TRINH_MESSAGE;
			}
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, actionRequest,
				actionResponse);
	}

	//
	public void addDanhGiaLaiCongTrinh(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		VeSinhCongTrinhTerms veSinhCongTrinhTerm = new VeSinhCongTrinhTerms(
				actionRequest);
		String cuString = ParamUtil.getString(actionRequest, "currentURL");
		String add = "";
		add = ParamUtil.getString(actionRequest, Constants.CMD);
		try {
			long userId = PortalUtil.getUserId(actionRequest);
			VeSinhCongTrinh veSinhCongTrinhEtt = new VeSinhCongTrinhImpl();
			if (add.equals(Constants.ADD)) {
			} else {
				veSinhCongTrinhEtt = VeSinhCongTrinhLocalServiceUtil
						.fetchVeSinhCongTrinh(veSinhCongTrinhTerm.getId());
			}
			veSinhCongTrinhEtt.setNhaTieuHVS(veSinhCongTrinhTerm
					.getNhaTieuHVS());
			veSinhCongTrinhEtt.setNgayKiemDem(veSinhCongTrinhTerm
					.getNgayKiemDem());
			veSinhCongTrinhEtt.setNgayDanhGia(new Date());
			veSinhCongTrinhEtt.setIdNguoiDanhGia(Integer.valueOf(userId + ""));
			veSinhCongTrinhEtt.setTrangThai(veSinhCongTrinhTerm.getTrangThai());
			// //update
			VeSinhCongTrinhLocalServiceUtil
					.updateVeSinhCongTrinh(veSinhCongTrinhEtt);
			actionResponse.sendRedirect(cuString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteCongTrinh(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.XOA_CONG_TRINH_MESSAGE;
		long idReturn = 0;
		VeSinhCongTrinhTerms veSinhGiaDinhTerm = new VeSinhCongTrinhTerms(
				actionRequest);
		try {
			int id = veSinhGiaDinhTerm.getId();
			VeSinhCongTrinhLocalServiceUtil.deleteVeSinhCongTrinh(id);
			messageKey = MessageSuccess.XOA_CONG_TRINH_MESSAGE;
			isSuccess = true;
		} catch (Exception e) {
			// TODO: handle exception
			_log.error(e);
			messageKey = MessageErrors.XOA_CONG_TRINH_MESSAGE;
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, actionRequest,
				actionResponse);
	}

	// redirect
	private void sendCustomRedirect(long id, boolean isSuccess,
			String messageKey, ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		if (isSuccess) {
			// SessionMessages.add(actionRequest,
			// PortalUtil.getPortletId(actionRequest) +
			// SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			String successURL = ParamUtil.getString(actionRequest,
					"onpageSuccess");
			successURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.MA_TINH
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.MA_TINH);
			successURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.MA_HUYEN
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.MA_HUYEN);
			successURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.MA_XA
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.MA_XA);
			successURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.LOAI_NHA_TIEU
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.LOAI_NHA_TIEU);
			successURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.LOAI_CONG_TRINH
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.LOAI_CONG_TRINH);
			successURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.TRANG_THAI
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.TRANG_THAI);
			successURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.NAM_BAO_CAO
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.NAM_BAO_CAO);
			if (id > 0) {
				successURL += "&"
						+ actionResponse.getNamespace()
						+ VeSinhCongTrinhTerms.ID
						+ "="
						+ ParamUtil.getString(actionRequest,
								VeSinhCongTrinhTerms.ID);
			}
			SessionMessages.add(actionRequest, messageKey);
			if (Validator.isNotNull(successURL)) {
				actionResponse.sendRedirect(successURL);
			}
		} else {
			// SessionMessages.add(actionRequest,
			// PortalUtil.getPortletId(actionRequest) +
			// SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			String errorURL = ParamUtil.getString(actionRequest, "onpageError");
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.MA_TINH
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.MA_TINH);
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.MA_HUYEN
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.MA_HUYEN);
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.MA_XA
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.MA_XA);
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.LOAI_NHA_TIEU
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.LOAI_NHA_TIEU);
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.LOAI_CONG_TRINH
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.LOAI_CONG_TRINH);
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.TRANG_THAI
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.TRANG_THAI);
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ VeSinhCongTrinhTerms.NAM_BAO_CAO
					+ "="
					+ ParamUtil.getString(actionRequest,
							VeSinhCongTrinhTerms.NAM_BAO_CAO);
			if (id > 0) {
				errorURL += "&"
						+ actionResponse.getNamespace()
						+ VeSinhCongTrinhTerms.ID
						+ "="
						+ ParamUtil.getString(actionRequest,
								VeSinhCongTrinhTerms.ID);
			}
			SessionErrors.add(actionRequest, messageKey);
			if (Validator.isNotNull(errorURL)) {
				actionResponse.sendRedirect(errorURL);
			}
		}
	}

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static Log _log = LogFactoryUtil.getLog(CongTrinhAction.class);
}
