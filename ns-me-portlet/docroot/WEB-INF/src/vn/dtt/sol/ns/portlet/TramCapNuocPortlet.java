package vn.dtt.sol.ns.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import vn.dtt.sol.ns.tramcap.action.TramCapAction;
import vn.dtt.sol.ns.tramcap.business.DauNoiNuocBusiness;
import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.tramcap.dao.service.DanhGiaVanHanhLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalServiceUtil;
import vn.dtt.sol.ns.util.WebKeys;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class TramCapNuocPortlet extends MVCPortlet {

	/**
	 * @param actionRequest
	 * @param actionResponse
	 */
	public void editVanHanh(ActionRequest actionRequest,
			ActionResponse actionResponse) {

		long tramCapId = ParamUtil.getLong(actionRequest, "tramCapId");

		TramCapNuoc tramCap = null;

		long danhGiaId = ParamUtil.getLong(actionRequest, "danhGiaId");

		DanhGiaVanHanh danhGia = null;

		try {
			tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(tramCapId);

			danhGia = DanhGiaVanHanhLocalServiceUtil
					.fetchDanhGiaVanHanh(danhGiaId);
		} catch (Exception e) {
			_log.error(e);
		}

		actionRequest.setAttribute("tramCap", tramCap);
		actionRequest.setAttribute("danhGia", danhGia);

		actionResponse.setRenderParameter("mvcPath", editVanHanhTramJSP);

	}

	public void editTramCap(ActionRequest request, ActionResponse response) {
		long tramCapId = ParamUtil.getLong(request, "tramCapId");

		TramCapNuoc tramCap = null;

		try {
			tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(tramCapId);

		} catch (Exception e) {
			_log.error(e);
		}

		request.setAttribute("tramCap", tramCap);
		
		response.setRenderParameter("mvcPath", "/html/portlet/tramcapnuoc/edit_tramcap.jsp");
	}

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// TODO Auto-generated method stub
		super.render(request, response);

		long id = ParamUtil.getLong(request, "tramCapId");

		TramCapNuoc tramCap = null;

		try {
			tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(id);
		} catch (Exception e) {
			_log.error(e);
		}

		request.setAttribute("tramCap", tramCap);
	}

	/**
	 * Them danh gia van hanh
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 */
	public void adDanhGiaVanHanh(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {

		int nam = ParamUtil.getInteger(actionRequest, "nam");
		int thang = ParamUtil.getInteger(actionRequest, "thang");
		int nuocDatTieuChuan = ParamUtil.getInteger(actionRequest,
				"nuocDatTieuChuan");
		int trangThaiCapNuoc = ParamUtil.getInteger(actionRequest,
				"trangThaiCapNuoc");

		List<String> errors = new ArrayList<String>();

		boolean valid = validDanhGia(nam, thang, nuocDatTieuChuan,
				trangThaiCapNuoc, errors);

		if (valid) {
			try {
				TramCapAction action = new TramCapAction();

				action.updateDanhGiaVanHanh(actionRequest);
			} catch (Exception e) {
				SessionErrors.add(actionRequest, e.getClass().getName());
				_log.error(e);
			}
		}
		if (errors.size() != 0) {
			for (String error : errors) {
				SessionMessages.add(actionRequest, error);
			}
		}

		sendCustomRedirect(errors, actionRequest, actionResponse);

	}

	/**
	 * Them tram cap
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 */
	public void addTramCap(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {

		String maTram = ParamUtil.getString(actionRequest, "maTram");
		String tenTram = ParamUtil.getString(actionRequest, "tenTram");
		String maTinh = ParamUtil.getString(actionRequest, "maTinh");
		String maHuyen = ParamUtil.getString(actionRequest, "maHuyen");
		String maXa = ParamUtil.getString(actionRequest, "maXa");
		int loaiHinh = ParamUtil.getInteger(actionRequest, "loaiHinh");
		String maMoHinh = ParamUtil.getString(actionRequest, "maMoHinh");
		int tinhTrangDuAn = ParamUtil
				.getInteger(actionRequest, "tinhTrangDuAn");
		int tienDoXayDung = ParamUtil
				.getInteger(actionRequest, "tienDoXayDung");
		int boMayVanHanh = ParamUtil.getInteger(actionRequest, "boMayVanHanh");

		List<String> errors = new ArrayList<String>();

		boolean valid = validTramCapInput(maTram, tenTram, maTinh, maHuyen,
				maXa, loaiHinh, maMoHinh, tinhTrangDuAn, tienDoXayDung,
				boMayVanHanh, errors);
		TramCapAction tramCapAction = new TramCapAction();

		if (valid) {
			try {

				tramCapAction.updaTramCap(actionRequest);

			} catch (Exception e) {
				_log.error(e);
				SessionErrors.add(actionRequest, e.getClass().getName());
			}

		} else {
			for (String error : errors) {
				SessionErrors.add(actionRequest, error);
			}
			
			TramCapNuoc tramCapNuoc = tramCapAction.getTramCapNuoc(actionRequest, actionResponse);
			
			actionRequest.getPortletSession().setAttribute("tramCap", tramCapNuoc);
		}

		sendCustomRedirect(actionRequest, actionResponse);
	}

	public void deleteTramCap(ActionRequest request, ActionResponse response)
			throws IOException {
		long tramCapId = ParamUtil.getLong(request, "tramCapId");
		String curentURL = ParamUtil.getString(request, WebKeys.CURRENT_URL);

		if (DauNoiNuocBusiness.countDauNoiByTram(tramCapId) != 0) {
			SessionErrors.add(request, "tram-cap-da-chua-dau-noi");
		} else {

			TramCapAction action = new TramCapAction();

			if (!action.deleteTramCap(tramCapId)) {
				SessionErrors.add(request,
						"khong-xoa-duoc-tram-cap-vui-long-thu-lai");
			}
		}

		response.sendRedirect(curentURL);

	}

	/**
	 * @param nam
	 * @param thang
	 * @param nuocDatTieuChuan
	 * @param trangThaiCapNuoc
	 * @param errors
	 * @return
	 */
	private boolean validDanhGia(int nam, int thang, int nuocDatTieuChuan,
			int trangThaiCapNuoc, List<String> errors) {

		boolean result = true;

		if (nam == 0) {
			errors.add("chon-nam-khong-dug");
			result = false;
		}

		if (thang == 0) {
			errors.add("chon-thang-khong-dung");
			result = false;
		}

		if (nuocDatTieuChuan == 0) {
			errors.add("nuoc-dat-tieu-chuan-chua-duoc-chon");
			result = false;
		}

		if (trangThaiCapNuoc == 0) {
			result = false;
			errors.add("trang-thai-cap-nuoc-chua-duoc-chon");
		}

		return result;

	}
	
	private boolean checkDoublicate(String maTinh, String tenTramCap) {
		boolean isDoublicate = false;
		
		try {
			if (TramCapNuocLocalServiceUtil.getDoublicate(maTinh, tenTramCap) != 0) {
				isDoublicate = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return isDoublicate;
	}

	private boolean validTramCapInput(String maTram, String tenTram,
			String maTinh, String maHuyen, String maXa, int loaiHinh,
			String maMoHinh, int tinhTrangDuAn, int tienDoXayDung,
			int boMayVanHanh, List<String> errors) {
		/*
		 * cac gi tri dieu kien them
		 * 
		 * maTram notNull && empty tenTram notNull && empty maTinh != 0 maHuyen
		 * != 0 maXa != 0 loaiHinh != 0 moHinhQuanLy notNull && empty
		 * tinhTrangDuAn != 0 tienDoXayDung < 100 boMayVanHanh != 0
		 */
		
		boolean isDoublicate = checkDoublicate(maTinh, tenTram);
		

		
		boolean result = true;

		if (Validator.isNotNull(maTram) && maTram.trim().isEmpty()) {
			errors.add("ma-tram-khong-duoc-trong");
			result = false;
		}

		if (Validator.isNotNull(tenTram) && tenTram.trim().isEmpty()) {
			errors.add("ten-tram-khong-duoc-trong");
			result = false;
		} 
		
		if (isDoublicate) {
			errors.add("ten-tram-khong-duoc-trung-nhau");
			result = false;
		} 		

		if (Validator.isNotNull(maTinh) && maTinh.trim().isEmpty()) {
			errors.add("tinh-chua-chon");
			result = false;
		}
		if (Validator.isNotNull(maHuyen) && maHuyen.trim().isEmpty()) {
			errors.add("huyen-chua-chon");
			result = false;
		}
		if (Validator.isNotNull(maXa) && maXa.trim().isEmpty()) {
			errors.add("xa-chua-chon");
			result = false;
		}
		if (loaiHinh == 0) {
			errors.add("loai-hinh-chua-chon");
			result = false;
		}

		if (Validator.isNotNull(maMoHinh) && maMoHinh.trim().isEmpty()) {
			errors.add("ma-mo-hinh-chua-chon");
			result = false;
		}

		if (tinhTrangDuAn == 0) {
			errors.add("tinh-trang-du-an-sai-gia-tri");
			result = false;
		}

		if (tienDoXayDung < 0 && tienDoXayDung > 100) {
			errors.add("tien-do-xay-dung-sai-gia-tri");
			result = false;
		}

		return result;
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


	private void sendCustomRedirect(List<String> errors,
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException {

		long tramCapId = ParamUtil.getLong(actionRequest, "tramCapId");

		TramCapNuoc tramCap = null;

		long danhGiaId = ParamUtil.getLong(actionRequest, "danhGiaId");

		DanhGiaVanHanh danhGia = null;

		try {
			tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(tramCapId);

			danhGia = DanhGiaVanHanhLocalServiceUtil
					.fetchDanhGiaVanHanh(danhGiaId);
		} catch (Exception e) {
			_log.error(e);
		}

		actionRequest.setAttribute("tramCap", tramCap);
		actionRequest.setAttribute("danhGia", danhGia);

		if (errors.size() != 0) {
			String errorURL = ParamUtil.getString(actionRequest, "onpageError");
			SessionMessages
					.add(actionRequest,
							PortalUtil.getPortletId(actionRequest)
									+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			if (Validator.isNotNull(errorURL)) {
				actionResponse.sendRedirect(errorURL);
			}
		} else {
			String successURL = ParamUtil.getString(actionRequest,
					"onpageSuccess");
			SessionMessages
					.add(actionRequest,
							PortalUtil.getPortletId(actionRequest)
									+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);

			if (Validator.isNotNull(successURL)) {
				actionResponse.sendRedirect(successURL);
			}
		}

	}

	protected String editVanHanhTramJSP = "/html/portlet/tramcapnuoc/edit_vanhanh_tramcap.jsp";

	private static Log _log = LogFactoryUtil.getLog(TramCapNuocPortlet.class);
}
