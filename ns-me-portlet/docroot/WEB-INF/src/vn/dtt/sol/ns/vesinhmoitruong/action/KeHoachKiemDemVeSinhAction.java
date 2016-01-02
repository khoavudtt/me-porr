package vn.dtt.sol.ns.vesinhmoitruong.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien;
import vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil;
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.cmon.user.dao.model.impl.UserMappingImpl;
import vn.dtt.sol.ns.business.DataItemBusiness;
import vn.dtt.sol.ns.business.KiemDemVienBussiness;
import vn.dtt.sol.ns.business.UserMappingBusiness;
import vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString;
import vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms;
import vn.dtt.sol.ns.reporting.utils.ReportBusinessUtils;
import vn.dtt.sol.ns.tramcap.business.KeHoachKiemDemNuocBusiness;
import vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc;
import vn.dtt.sol.ns.util.DiaBanQuanLyUtils;
import vn.dtt.sol.ns.util.MessageErrors;
import vn.dtt.sol.ns.util.MessageSuccess;
import vn.dtt.sol.ns.util.WebKeys;
import vn.dtt.sol.ns.vesinhmoitruong.business.KeHoachKiemDemVeSinhBussiness;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.KeHoachKiemDemVeSinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhCongTrinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.KeHoachKiemDemVeSinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemCongTrinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemHoGDLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.terms.KeHoachKiemDemVeSinhTerms;

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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class KeHoachKiemDemVeSinhAction extends MVCPortlet {

/*	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub

		User user = null;
		UserMapping loginUserMapping = new UserMappingImpl();
		String maTinh = ParamUtil.getString(renderRequest,
				KeHoachKiemDemVeSinhTerms.MA_TINH);
		String maHuyen = ParamUtil.getString(renderRequest,
				KeHoachKiemDemVeSinhTerms.MA_HUYEN);
		String kiemDemVienId = ParamUtil.getString(renderRequest,
				KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID);
		String trangThai = ParamUtil.getString(renderRequest, "trangThai");
		String daKetThucDieuTra = ParamUtil.getString(renderRequest,
				"daKetThucDieuTra");
		List<DATAITEM> listTinh = new ArrayList<DATAITEM>();
		// List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
		// List<DATAITEM> listXa = new ArrayList<DATAITEM>();
		List<KiemDemVien> listKiemDemVien = new ArrayList<KiemDemVien>();
		List<UserMapping> listUserBySearch = new ArrayList<UserMapping>();
		boolean isSupperAdmin = renderRequest.isUserInRole("Administrator");

		try {
			user = PortalUtil.getUser(renderRequest);
			loginUserMapping = UserMappingBusiness.getUserMapping(user);
			KeHoachKiemDemNuoc keHoachKiemDem = null;
			int id = ParamUtil.getInteger(renderRequest,
					KeHoachKiemDemVeSinhTerms.ID);
			if (id > 0) {
				keHoachKiemDem = KeHoachKiemDemNuocBusiness
						.getKeHoachKiemDemNuocById(id);
				renderRequest.setAttribute("keHoachKiemDem", keHoachKiemDem);
			}

			listTinh = DiaBanQuanLyUtils.getTinh(user, isSupperAdmin,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			if (loginUserMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU) {
				if (Validator.isNotNull(maTinh)) {
					listKiemDemVien = KiemDemVienBussiness
							.findByCapHoatDongOrgCode(
									String.valueOf(WebKeys.KDV_TOAN_TINH),
									maTinh);
				} else {
					listKiemDemVien = new ArrayList<KiemDemVien>();
				}
			} else if (loginUserMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
				listKiemDemVien = KiemDemVienBussiness
						.findByCapHoatDongOrgCode(
								String.valueOf(WebKeys.KDV_TOAN_TINH),
								loginUserMapping.getOrgCode1());
				listUserBySearch = UserMappingBusiness.getByTypeOrg1(
						loginUserMapping.getUserType(),
						loginUserMapping.getOrgCode1());
			} else if (loginUserMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
				listKiemDemVien = KiemDemVienBussiness
						.findByCapHoatDongOrgCode(
								String.valueOf(WebKeys.KDV_VSHUYEN),
								loginUserMapping.getOrgCode2());
				listUserBySearch = UserMappingBusiness.getByTypeOrg2(
						loginUserMapping.getUserType(),
						loginUserMapping.getOrgCode1(),
						loginUserMapping.getOrgCode2());
			}
			if (Validator.isNotNull(keHoachKiemDem)) {

			}
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		renderRequest.setAttribute(KeHoachKiemDemVeSinhTerms.MA_TINH, maTinh);
		renderRequest.setAttribute(KeHoachKiemDemVeSinhTerms.MA_HUYEN, maHuyen);
		renderRequest.setAttribute(KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID,
				kiemDemVienId);
		renderRequest.setAttribute("trangThai", trangThai);
		renderRequest.setAttribute("daKetThucDieuTra", daKetThucDieuTra);
		renderRequest.setAttribute("loginUserMapping", loginUserMapping);
		renderRequest.setAttribute("listTinh", listTinh);
		renderRequest.setAttribute("listKiemDemVien", listKiemDemVien);
		renderRequest.setAttribute("listUserBySearch", listUserBySearch);
		super.doView(renderRequest, renderResponse);
	}
*/
	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// TODO Auto-generated method stub
		User user = null;
		UserMapping loginUserMapping = new UserMappingImpl();
		String maTinh = ParamUtil.getString(request,
				KeHoachKiemDemVeSinhTerms.MA_TINH);
		
		String maHuyen = ParamUtil.getString(request,
				KeHoachKiemDemVeSinhTerms.MA_HUYEN);
		
		String maXa = ParamUtil.getString(request, "maXa");
		
		String kiemDemVienId = ParamUtil.getString(request,
				KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID);
		String trangThai = ParamUtil.getString(request, "trangThai");
		String daKetThucDieuTra = ParamUtil.getString(request,
				"daKetThucDieuTra");
		String namBaoCaovstx = ParamUtil.getString(request, "namBaoCaovstx");
		String idNguoiTao = ParamUtil.getString(request, "idNguoiTao");
		String advText = ParamUtil.getString(request, "advText");
		String idTrangThaiChk = ParamUtil.getString(request, "idTrangThaiChk");
		List<DATAITEM> listTinh = new ArrayList<DATAITEM>();
		List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
		List<KiemDemVien> listKiemDemVien = new ArrayList<KiemDemVien>();
		List<DATAITEM> listLoaiCongTrinh = new ArrayList<DATAITEM>();
		List<UserMapping> listUserBySearch = new ArrayList<UserMapping>();
		boolean isSupperAdmin = request.isUserInRole("Administrator");

		try {
			user = PortalUtil.getUser(request);
			loginUserMapping = UserMappingBusiness.getUserMapping(user);
			KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = null;
			int id = ParamUtil
					.getInteger(request, KeHoachKiemDemVeSinhTerms.ID);
			if (id > 0) {
				keHoachKiemDemVeSinh = KeHoachKiemDemVeSinhBussiness
						.fetchKeHoachKiemDemVeSinh(id);
				request.setAttribute("keHoachKiemDemVeSinh",
						keHoachKiemDemVeSinh);
				
				if (Validator.isNull(maHuyen)) {
					maHuyen = keHoachKiemDemVeSinh.getMaHuyen();
				}
				
				if (Validator.isNull(maTinh)) {
					maTinh = keHoachKiemDemVeSinh.getMaTinh();
				}
				
				DATAITEM selHuyen = DataItemBusiness.getByNode2Id(1, maTinh, maHuyen);
				
				if(Validator.isNotNull(selHuyen)) {
					listHuyen.add(selHuyen);
				} 
				

			} else {
				listHuyen = DiaBanQuanLyUtils.getHuyen(user, maTinh, 0l,
						isSupperAdmin, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				listTinh = DiaBanQuanLyUtils.getTinh(user, isSupperAdmin,
						QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			}


			if (loginUserMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU) {
				if (Validator.isNotNull(maTinh)) {
					if (Validator.isNotNull(maHuyen)) {
						listKiemDemVien = KiemDemVienBussiness
								.findByCapHoatDongOrgCode(
										String.valueOf(WebKeys.KDV_VSHUYEN),
										maHuyen);
					} else {
						listKiemDemVien = KiemDemVienBussiness
								.findByCapHoatDongOrgCode(
										String.valueOf(WebKeys.KDV_TOAN_TINH),
										maTinh);
					}
				}
			} else if (loginUserMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TINH) {

				if (Validator.isNotNull(maHuyen)) {
					listKiemDemVien = KiemDemVienBussiness
							.findByCapHoatDongOrgCode(
									String.valueOf(WebKeys.KDV_VSHUYEN),
									maHuyen);
				} else {
					listKiemDemVien = KiemDemVienBussiness
							.findByCapHoatDongOrgCode(
									String.valueOf(WebKeys.KDV_TOAN_TINH),
									loginUserMapping.getOrgCode1());
				}
				listUserBySearch = UserMappingBusiness.getByTypeOrg1(
						loginUserMapping.getUserType(),
						loginUserMapping.getOrgCode1());
			} else if (loginUserMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {

				listKiemDemVien = KiemDemVienBussiness
						.findByCapHoatDongOrgCode(
								String.valueOf(WebKeys.KDV_VSHUYEN),
								loginUserMapping.getOrgCode2());
				listUserBySearch = UserMappingBusiness.getByTypeOrg2(
						loginUserMapping.getUserType(),
						loginUserMapping.getOrgCode1(),
						loginUserMapping.getOrgCode2());
			}
			if (Validator.isNotNull(keHoachKiemDemVeSinh)) {
				maTinh = keHoachKiemDemVeSinh.getMaTinh();
				maHuyen = keHoachKiemDemVeSinh.getMaHuyen();
				listKiemDemVien = KiemDemVienBussiness
						.findByCapHoatDongOrgCode(
								String.valueOf(WebKeys.KDV_VSHUYEN),
								keHoachKiemDemVeSinh.getMaHuyen());
			}
			listLoaiCongTrinh = DataItemBusiness
					.getByDataGroupId(WebKeys.DATAGROUPID_LOAICONGTRINH);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		request.setAttribute(KeHoachKiemDemVeSinhTerms.MA_TINH, maTinh);
		request.setAttribute(KeHoachKiemDemVeSinhTerms.MA_HUYEN, maHuyen);
		request.setAttribute(KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID,
				kiemDemVienId);
		request.setAttribute("namBaoCaovstx", namBaoCaovstx);
		request.setAttribute("trangThai", trangThai);
		request.setAttribute("daKetThucDieuTra", daKetThucDieuTra);
		request.setAttribute("loginUserMapping", loginUserMapping);
		request.setAttribute("listTinh", listTinh);
		request.setAttribute("listHuyen", listHuyen);
		request.setAttribute("listKiemDemVien", listKiemDemVien);
		request.setAttribute("listLoaiCongTrinh", listLoaiCongTrinh);
		request.setAttribute("listUserBySearch", listUserBySearch);
		request.setAttribute("idNguoiTao", idNguoiTao);
		request.setAttribute("advText", advText);
		request.setAttribute("maTinh", maTinh );
		request.setAttribute("maHuyen", maHuyen);
		request.setAttribute("idTrangThaiChk", idTrangThaiChk);
		super.render(request, response);
	}

	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		String key = ParamUtil.getString(resourceRequest, "keyExport");
		int idKeHoach = ParamUtil.getInteger(resourceRequest,
				KeHoachKiemDemVeSinhTerms.ID);

		if (key.equalsIgnoreCase("export_csv_kehoachkiemdemnuoc")) {
			xuatBankeHoachKiemDem(resourceRequest, resourceResponse, idKeHoach);
		}
		// lttai - xuat excel ke hoach cua tung kiem dem vien
		ReportBusinessUtils.inBaoCaoDLI(resourceRequest, resourceResponse);
	}

	private void xuatBankeHoachKiemDem(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse, int idKeHoach) {
		KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = new KeHoachKiemDemVeSinhImpl();
		HttpServletRequest request = PortalUtil
				.getOriginalServletRequest(PortalUtil
						.getHttpServletRequest(resourceRequest));
		HttpServletResponse respon = PortalUtil
				.getHttpServletResponse(resourceResponse);
		try {
			keHoachKiemDemVeSinh = KeHoachKiemDemVeSinhLocalServiceUtil
					.fetchKeHoachKiemDemVeSinh(idKeHoach);
			if (Validator.isNotNull(keHoachKiemDemVeSinh)) {
				keHoachKiemDemVeSinh.setNgayXuatBan(new Date());
			}
			KeHoachKiemDemVeSinhLocalServiceUtil
					.updateKeHoachKiemDemVeSinh(keHoachKiemDemVeSinh);
			SessionMessages.add(request,
					MessageSuccess.XUAT_BAN_KE_HOACH_KIEM_DEM_MESSAGE);
			String redirect = ParamUtil.getString(request, WebKeys.REDIRECT);
			respon.sendRedirect(redirect);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			SessionErrors.add(request,
					MessageErrors.XUAT_BAN_KE_HOACH_KIEM_DEM_MESSAGE);
		}
	}

	public void xuatBankeHoachKiemDem(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = new KeHoachKiemDemVeSinhImpl();
		try {
			int idKeHoach = ParamUtil.getInteger(actionRequest,
					KeHoachKiemDemVeSinhTerms.ID);
			keHoachKiemDemVeSinh = KeHoachKiemDemVeSinhLocalServiceUtil
					.fetchKeHoachKiemDemVeSinh(idKeHoach);
			if (Validator.isNotNull(keHoachKiemDemVeSinh)) {
				keHoachKiemDemVeSinh.setNgayXuatBan(new Date());
			}
			KeHoachKiemDemVeSinhLocalServiceUtil
					.updateKeHoachKiemDemVeSinh(keHoachKiemDemVeSinh);
			SessionMessages.add(actionRequest,
					MessageSuccess.XUAT_BAN_KE_HOACH_KIEM_DEM_MESSAGE);
			String successURL = ParamUtil.getString(actionRequest,
					"onpageSuccess");
			_log.info("successURL" + successURL);
			actionResponse.sendRedirect(successURL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			SessionErrors.add(actionRequest,
					MessageErrors.XUAT_BAN_KE_HOACH_KIEM_DEM_MESSAGE);
		}
	}

	public void addkeHoachKiemDem(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.ADD_KE_HOACH_KIEM_DEM_MESSAGE;
		long idReturn = 0;
		KeHoachKiemDemVeSinhTerms keHoachKiemDemVeSinhTerms = new KeHoachKiemDemVeSinhTerms(
				actionRequest);
		String add = "";
		add = ParamUtil.getString(actionRequest, Constants.CMD);
		long userId = PortalUtil.getUserId(actionRequest);
		try {
			Date fromDate = keHoachKiemDemVeSinhTerms.getNgayBatDau();
			Date toDate = keHoachKiemDemVeSinhTerms.getNgayKetThuc();
			_log.info("fromDate" + fromDate + "toDate" + toDate);
			_log.info("fromDate.before(toDate)" + fromDate.before(toDate));
			_log.info("fromDate.after(toDate)" + fromDate.after(toDate));
			if (fromDate.before(toDate)) {
				KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = new KeHoachKiemDemVeSinhImpl();
				if (add.equals(Constants.ADD)) {
					long id = 0;
					id = CounterLocalServiceUtil
							.increment(KeHoachKiemDemVeSinh.class.getName());
					keHoachKiemDemVeSinh = KeHoachKiemDemVeSinhLocalServiceUtil
							.createKeHoachKiemDemVeSinh(Integer
									.valueOf(id + ""));
					keHoachKiemDemVeSinh.setIdNguoiTao(Integer.valueOf(String
							.valueOf(userId)));
					keHoachKiemDemVeSinh.setNgayTao(new Date());
					int year = Calendar.getInstance().get(Calendar.YEAR);
					keHoachKiemDemVeSinh.setNam(year);
					keHoachKiemDemVeSinh.setNgayXuatBan(null);
					keHoachKiemDemVeSinh.setNgayDong(null);
					messageKey = MessageSuccess.ADD_KE_HOACH_KIEM_DEM_MESSAGE;
					idReturn = id;
				} else {
					keHoachKiemDemVeSinh = KeHoachKiemDemVeSinhLocalServiceUtil
							.fetchKeHoachKiemDemVeSinh(keHoachKiemDemVeSinhTerms
									.getId());
					messageKey = MessageSuccess.EDIT_KE_HOACH_KIEM_DEM_MESSAGE;
					idReturn = keHoachKiemDemVeSinhTerms.getId();
				}

				keHoachKiemDemVeSinh.setMaTinh(keHoachKiemDemVeSinhTerms
						.getMaTinh());
				keHoachKiemDemVeSinh.setMaHuyen(keHoachKiemDemVeSinhTerms
						.getMaHuyen());
				keHoachKiemDemVeSinh.setKiemDemVienID(keHoachKiemDemVeSinhTerms
						.getKiemDemVienId());
				keHoachKiemDemVeSinh.setNgayBatDau(keHoachKiemDemVeSinhTerms
						.getNgayBatDau());
				keHoachKiemDemVeSinh.setNgayKetThuc(keHoachKiemDemVeSinhTerms
						.getNgayKetThuc());
				keHoachKiemDemVeSinh.setMoTa(keHoachKiemDemVeSinhTerms
						.getMoTa());

				// update
				KeHoachKiemDemVeSinhLocalServiceUtil
						.updateKeHoachKiemDemVeSinh(keHoachKiemDemVeSinh);
				// actionResponse.sendRedirect(cuString);
				isSuccess = true;
			} else {
				// Hide default Success Message
				SessionMessages
						.add(actionRequest,
								PortalUtil.getPortletId(actionRequest)
										+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);

				// Hide default Error Message
				SessionMessages
						.add(actionRequest,
								PortalUtil.getPortletId(actionRequest)
										+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
				messageKey = MessageErrors.ERROR_NGAY_THANG;
				isSuccess = false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			if (add.equals(Constants.ADD)) {
				messageKey = MessageErrors.ADD_KE_HOACH_KIEM_DEM_MESSAGE;
			} else {
				messageKey = MessageErrors.EDIT_KE_HOACH_KIEM_DEM_MESSAGE;
			}
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, actionRequest,
				actionResponse);
	}

	private void updateStatusHoGiaDinh(ThongTinKiemDemHoGD thongtinkiemdemhogd,
			int type) throws SystemException {
		// TODO Auto-generated method stub
		VeSinhGiaDinh ettUpdate = new VeSinhGiaDinhImpl();
		ettUpdate = VeSinhGiaDinhLocalServiceUtil
				.fetchVeSinhGiaDinh(thongtinkiemdemhogd.getVeSinhGiaDinhId());
		if (thongtinkiemdemhogd.getDanhGiaKiemDem() == 0) {
			ettUpdate.setTrangThai(0);
		} else if (thongtinkiemdemhogd.getDanhGiaKiemDem() == 1) {
			ettUpdate.setTrangThai(2);
		} else if (thongtinkiemdemhogd.getDanhGiaKiemDem() == 2) {
			ettUpdate.setTrangThai(3);
		} else if (thongtinkiemdemhogd.getDanhGiaKiemDem() == 3) {
			ettUpdate.setTrangThai(4);
		} else if (thongtinkiemdemhogd.getDanhGiaKiemDem() == 4) {
			ettUpdate.setTrangThai(5);
		}
		if (thongtinkiemdemhogd.getDanhGiaKiemDem() == 0) {
			thongtinkiemdemhogd.setDaKetThucDieuTra(3);
		}
		if (thongtinkiemdemhogd.getDaKetThucDieuTra() == 3) {
			if (type == 1) {
				ettUpdate.setTrangThai(0);
			} else {
				ettUpdate.setTrangThai(8);
			}

		}
		ettUpdate.setNgayKiemDem(thongtinkiemdemhogd.getNgayKiemDem());
		ettUpdate.setKinhDo(thongtinkiemdemhogd.getKinhDo());
		ettUpdate.setViDo(thongtinkiemdemhogd.getViDo());
		ettUpdate.setNguonVon(thongtinkiemdemhogd.getNguonVon());
		ThongTinKiemDemHoGDLocalServiceUtil
				.updateThongTinKiemDemHoGD(thongtinkiemdemhogd);
		VeSinhGiaDinhLocalServiceUtil.updateVeSinhGiaDinh(ettUpdate);
	}

	private void updateStatusCongTrinh(
			ThongTinKiemDemCongTrinh thongtinkiemdemcongtrinh, int type)
			throws SystemException {
		// TODO Auto-generated method stub
		VeSinhCongTrinh ettUpdate = new VeSinhCongTrinhImpl();
		ettUpdate = VeSinhCongTrinhLocalServiceUtil
				.fetchVeSinhCongTrinh(thongtinkiemdemcongtrinh
						.getVeSinhConTrinhId());
		if (thongtinkiemdemcongtrinh.getDanhGiaKiemDem() == 0) {
			ettUpdate.setTrangThai(0);
		} else if (thongtinkiemdemcongtrinh.getDanhGiaKiemDem() == 1) {
			ettUpdate.setTrangThai(2);
		} else if (thongtinkiemdemcongtrinh.getDanhGiaKiemDem() == 2) {
			ettUpdate.setTrangThai(3);
		}
		if (thongtinkiemdemcongtrinh.getDanhGiaKiemDem() == 0) {
			thongtinkiemdemcongtrinh.setDaKetThucDieuTra(3);
		}
		if (thongtinkiemdemcongtrinh.getDaKetThucDieuTra() == 3) {
			if (type == 1) {
				ettUpdate.setTrangThai(0);
			} else {
				ettUpdate.setTrangThai(8);
			}
		}
		ettUpdate.setNgayKiemDem(thongtinkiemdemcongtrinh.getNgayKiemDem());
		ettUpdate.setKinhDo(thongtinkiemdemcongtrinh.getKinhDo());
		ettUpdate.setViDo(thongtinkiemdemcongtrinh.getViDo());
		ThongTinKiemDemCongTrinhLocalServiceUtil
				.updateThongTinKiemDemCongTrinh(thongtinkiemdemcongtrinh);
		VeSinhCongTrinhLocalServiceUtil.updateVeSinhCongTrinh(ettUpdate);
	}

	public void themAllDauNoiToKeHoachKieDemVesinh(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.THEM_GIA_DINH_KE_HOACH_MESSAGE;
		long idReturn = 0;

		try {
			long maDotBaoCao = ParamUtil.getLong(actionRequest,
					"maKeHoachKiemDem");
			long kehoachId = ParamUtil.getLong(actionRequest,
					KeHoachKiemDemVeSinhTerms.ID);
			KeHoachKiemDemVeSinh keHoach = KeHoachKiemDemVeSinhBussiness
					.fetchKeHoachKiemDemVeSinh(Integer.valueOf(kehoachId + ""));
			List<VeSinhGiaDinh> listHoGdByOrgId = new ArrayList<VeSinhGiaDinh>();
			idReturn = maDotBaoCao;
			_log.info("keHoach.getMaTinh()" + keHoach.getMaTinh() + ""
					+ keHoach.getMaHuyen());
			listHoGdByOrgId = VeSinhGiaDinhLocalServiceUtil
					.getVeSinhGiaDinhSearch(
							keHoach.getMaTinh(),
							keHoach.getMaHuyen(),
							"",
							"",
							"0",
							"9999"
									+ (Validator.isNotNull(keHoach) ? keHoach
											.getNam() : StringPool.BLANK), "",
							QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			_log.info("listHoGdByOrgIdlistHoGdByOrgId" + listHoGdByOrgId.size());
			doInsertHoGdToKeHoach(listHoGdByOrgId, idReturn);
			messageKey = MessageSuccess.THEM_GIA_DINH_KE_HOACH_MESSAGE;
			isSuccess = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			messageKey = MessageErrors.THEM_GIA_DINH_KE_HOACH_MESSAGE;
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, actionRequest,
				actionResponse);
	}

	public void themDauNoiToKeHoachKieDemVesinhHoGDId(
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.THEM_GIA_DINH_KE_HOACH_MESSAGE;
		long idReturn = 0;
		String errorKD = "";
		try {
			long[] orgIds = StringUtil.split(
					ParamUtil.getString(actionRequest, "orgIds"), 0L);
			long maDotBaoCao = ParamUtil.getLong(actionRequest,
					"maKeHoachKiemDem");
			int trangThai = ParamUtil.getInteger(actionRequest, "trangThai");
			List<VeSinhGiaDinh> listHoGdByOrgId = new ArrayList<VeSinhGiaDinh>();
			idReturn = maDotBaoCao;
			VeSinhGiaDinh ettGiaDinh = null;
			for (long l : orgIds) {
				ettGiaDinh = VeSinhGiaDinhLocalServiceUtil
						.fetchVeSinhGiaDinh(Integer.valueOf(l + ""));
				if (trangThai == 1) {
					listHoGdByOrgId.add(VeSinhGiaDinhLocalServiceUtil
							.fetchVeSinhGiaDinh(Integer.valueOf(l + "")));
				} else if (Validator.isNotNull(ettGiaDinh)
						&& (ettGiaDinh.getTrangThai() == 0 || ettGiaDinh
								.getTrangThai() == 8)) {
					listHoGdByOrgId.add(VeSinhGiaDinhLocalServiceUtil
							.fetchVeSinhGiaDinh(Integer.valueOf(l + "")));
				} else if (Validator.isNotNull(ettGiaDinh)
						&& (ettGiaDinh.getTrangThai() != 0 && ettGiaDinh
								.getTrangThai() != 8)) {
					errorKD += ettGiaDinh.getId() + ",";
				}
			}
			doInsertHoGdToKeHoach(listHoGdByOrgId, idReturn);
			messageKey = MessageSuccess.THEM_GIA_DINH_KE_HOACH_MESSAGE;
			isSuccess = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			messageKey = MessageErrors.THEM_GIA_DINH_KE_HOACH_MESSAGE;
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, errorKD,
				actionRequest, actionResponse);
	}

	public void themAllCongTrinhToKeHoachKieDemVesinh(
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.THEM_DAU_NOI_VAO_KE_HOACH_MESSAGE;
		long idReturn = 0;

		try {
			long maDotBaoCao = ParamUtil.getLong(actionRequest,
					"maKeHoachKiemDem");
			long kehoachId = ParamUtil.getLong(actionRequest,
					KeHoachKiemDemVeSinhTerms.ID);
			KeHoachKiemDemVeSinh keHoach = KeHoachKiemDemVeSinhBussiness
					.fetchKeHoachKiemDemVeSinh(Integer.valueOf(kehoachId + ""));
			List<VeSinhCongTrinh> listCongTrinhByOrgId = new ArrayList<VeSinhCongTrinh>();
			idReturn = maDotBaoCao;
			_log.info("keHoach.getMaTinh()" + keHoach.getMaTinh() + ""
					+ keHoach.getMaHuyen());
			listCongTrinhByOrgId = VeSinhCongTrinhLocalServiceUtil
					.getVeSinhCongTrinhSearch(
							keHoach.getMaTinh(),
							keHoach.getMaHuyen(),
							"",
							"",
							"",
							"0",
							"9999"
									+ (Validator.isNotNull(keHoach) ? keHoach
											.getNam() : StringPool.BLANK),
							QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			doInsertCongTrinhToKeHoach(listCongTrinhByOrgId, idReturn);
			messageKey = MessageSuccess.THEM_DAU_NOI_VAO_KE_HOACH_MESSAGE;
			isSuccess = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			messageKey = MessageErrors.THEM_DAU_NOI_VAO_KE_HOACH_MESSAGE;
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, actionRequest,
				actionResponse);
	}

	public void themCongTrinhToKeHoachKieDemNVesinh(
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.THEM_CONG_TRINH_VAO_KE_HOACH_MESSAGE;
		long idReturn = 0;
		try {
			long[] orgIds = StringUtil.split(
					ParamUtil.getString(actionRequest, "orgIds"), 0L);
			long maDotBaoCao = ParamUtil.getLong(actionRequest,
					"maKeHoachKiemDem");
			int trangThai = ParamUtil.getInteger(actionRequest, "trangThai");
			List<VeSinhCongTrinh> listCongTrinhByOrgId = new ArrayList<VeSinhCongTrinh>();
			idReturn = maDotBaoCao;
			VeSinhCongTrinh ettCongTrinh = null;
			for (long l : orgIds) {
				ettCongTrinh = VeSinhCongTrinhLocalServiceUtil
						.fetchVeSinhCongTrinh(Integer.valueOf("0" + l));
				if (trangThai == 1) {
					listCongTrinhByOrgId.add(VeSinhCongTrinhLocalServiceUtil
							.fetchVeSinhCongTrinh(Integer.valueOf(l + "")));
				} else if (Validator.isNotNull(ettCongTrinh)
						&& (ettCongTrinh.getTrangThai() == 0 || ettCongTrinh
								.getTrangThai() == 8)) {
					listCongTrinhByOrgId.add(VeSinhCongTrinhLocalServiceUtil
							.fetchVeSinhCongTrinh(Integer.valueOf(l + "")));
				}
			}
			doInsertCongTrinhToKeHoach(listCongTrinhByOrgId, idReturn);
			messageKey = MessageSuccess.THEM_CONG_TRINH_VAO_KE_HOACH_MESSAGE;
			isSuccess = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			messageKey = MessageErrors.THEM_CONG_TRINH_VAO_KE_HOACH_MESSAGE;
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, actionRequest,
				actionResponse);
	}

	private void doInsertHoGdToKeHoach(List<VeSinhGiaDinh> listHoGdByOrgId,
			long keHoachId) throws SystemException {
		// TODO Auto-generated method stub
		ThongTinKiemDemHoGD ettInsert = new ThongTinKiemDemHoGDImpl();
		KeHoachKiemDemVeSinh keHoach = null;
		keHoach = KeHoachKiemDemVeSinhLocalServiceUtil
				.fetchKeHoachKiemDemVeSinh(Integer.valueOf(keHoachId + ""));
		KiemDemVien kiemDemVien = null;
		String taiKhoan = StringPool.BLANK;
		if (Validator.isNotNull(keHoach)) {
			if (Validator.isNotNull(keHoach.getKiemDemVienID())) {
				kiemDemVien = KiemDemVienLocalServiceUtil
						.fetchKiemDemVien(keHoach.getKiemDemVienID());
				taiKhoan = Validator.isNotNull(kiemDemVien) ? kiemDemVien
						.getTaiKhoan() : StringPool.BLANK;
			}
		}
		for (VeSinhGiaDinh veSinhGiaDinh : listHoGdByOrgId) {

			veSinhGiaDinh.setTrangThai(1);
			VeSinhGiaDinhLocalServiceUtil.updateVeSinhGiaDinh(veSinhGiaDinh);
			ettInsert = new ThongTinKiemDemHoGDImpl();
			long id = 0;
			id = CounterLocalServiceUtil.increment(ThongTinKiemDemHoGD.class
					.getName());
			ettInsert = ThongTinKiemDemHoGDLocalServiceUtil
					.createThongTinKiemDemHoGD(Integer.valueOf(id + ""));
			ettInsert.setVeSinhGiaDinhId(veSinhGiaDinh.getId());
			ettInsert
					.setKeHoachKiemDemVeSinhId(Integer.valueOf(keHoachId + ""));
			ettInsert.setMaTinh(veSinhGiaDinh.getMaTinh());
			ettInsert.setMaHuyen(veSinhGiaDinh.getMaHuyen());
			ettInsert.setMaXa(veSinhGiaDinh.getMaXa());
			ettInsert.setThonXom(veSinhGiaDinh.getThonXom());
			ettInsert.setTenChuHo(veSinhGiaDinh.getTenChuHo());
			ettInsert.setGioiTinhChuHo(veSinhGiaDinh.getGioiTinhChuHo());
			ettInsert.setDanhGiaKiemDem(0);
			ettInsert.setTaiKhoan(taiKhoan);
			ThongTinKiemDemHoGDLocalServiceUtil
					.updateThongTinKiemDemHoGD(ettInsert);
		}
	}

	public void phanCongLaiKeHoachKieDemCTHuyBo(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.PHAN_CONG_LAI_CONG_TRINH_MESSAGE;
		long idReturn = 0;
		try {
			long[] orgIds = StringUtil.split(
					ParamUtil.getString(actionRequest, "orgIds"), 0L);
			long maDotBaoCao = ParamUtil.getLong(actionRequest,
					"maKeHoachKiemDem");
			idReturn = maDotBaoCao;
			VeSinhCongTrinh ettRevert = null;
			ThongTinKiemDemCongTrinh ettThongTin = null;
			for (long l : orgIds) {
				ettThongTin = ThongTinKiemDemCongTrinhLocalServiceUtil
						.fetchThongTinKiemDemCongTrinh(Integer.valueOf(l + ""));
				_log.info("*****" + l);
				ettRevert = new VeSinhCongTrinhImpl();
				if (Validator.isNotNull(ettThongTin)
						&& (ettThongTin.getDaKetThucDieuTra() == 0 || ettThongTin
								.getDaKetThucDieuTra() == 2)) {
					ettRevert = VeSinhCongTrinhLocalServiceUtil
							.fetchVeSinhCongTrinh(ettThongTin
									.getVeSinhConTrinhId());
					ettRevert.setTrangThai(8);
					VeSinhCongTrinhLocalServiceUtil
							.updateVeSinhCongTrinh(ettRevert);
					ettThongTin.setDaKetThucDieuTra(3);
					ThongTinKiemDemCongTrinhLocalServiceUtil
							.updateThongTinKiemDemCongTrinh(ettThongTin);
				}
			}
			messageKey = MessageSuccess.PHAN_CONG_LAI_CONG_TRINH_MESSAGE;
			isSuccess = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			messageKey = MessageErrors.PHAN_CONG_LAI_CONG_TRINH_MESSAGE;
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, actionRequest,
				actionResponse);
	}

	public void phanCongLaiKeHoachKieDemGDHuyBo(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.PHAN_CONG_LAI_GIA_DINH_MESSAGE;
		long idReturn = 0;
		try {
			long[] orgIds = StringUtil.split(
					ParamUtil.getString(actionRequest, "orgIds"), 0L);
			long maDotBaoCao = ParamUtil.getLong(actionRequest,
					"maKeHoachKiemDem");
			idReturn = maDotBaoCao;
			VeSinhGiaDinh ettRevert = null;
			ThongTinKiemDemHoGD ettThongTin = null;
			for (long l : orgIds) {
				ettThongTin = ThongTinKiemDemHoGDLocalServiceUtil
						.fetchThongTinKiemDemHoGD(Integer.valueOf(l + ""));
				_log.info("*****" + l);
				ettRevert = new VeSinhGiaDinhImpl();
				if (Validator.isNotNull(ettThongTin)
						&& (ettThongTin.getDaKetThucDieuTra() == 0 || ettThongTin
								.getDaKetThucDieuTra() == 2)) {
					ettRevert = VeSinhGiaDinhLocalServiceUtil
							.fetchVeSinhGiaDinh(ettThongTin
									.getVeSinhGiaDinhId());
					ettRevert.setTrangThai(8);
					VeSinhGiaDinhLocalServiceUtil
							.updateVeSinhGiaDinh(ettRevert);
					ettThongTin.setDaKetThucDieuTra(3);
					ThongTinKiemDemHoGDLocalServiceUtil
							.updateThongTinKiemDemHoGD(ettThongTin);
				}
			}
			messageKey = MessageSuccess.PHAN_CONG_LAI_GIA_DINH_MESSAGE;
			isSuccess = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			messageKey = MessageErrors.PHAN_CONG_LAI_GIA_DINH_MESSAGE;
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, actionRequest,
				actionResponse);
	}

	public void phanCongLaiKeHoachKieDemHoGd(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.PHAN_CONG_LAI_GIA_DINH_MESSAGE;
		long idReturn = 0;
		try {
			long[] orgIds = StringUtil.split(
					ParamUtil.getString(actionRequest, "orgIds"), 0L);
			long maDotBaoCao = ParamUtil.getLong(actionRequest,
					"maKeHoachKiemDem");
			idReturn = maDotBaoCao;
			VeSinhGiaDinh ettRevert = null;
			ThongTinKiemDemHoGD ettThongTin = null;
			for (long l : orgIds) {
				ettThongTin = ThongTinKiemDemHoGDLocalServiceUtil
						.fetchThongTinKiemDemHoGD(Integer.valueOf(l + ""));
				_log.info("*****" + l);
				ettRevert = new VeSinhGiaDinhImpl();
				if (Validator.isNotNull(ettThongTin)) {
					ettRevert = VeSinhGiaDinhLocalServiceUtil
							.fetchVeSinhGiaDinh(ettThongTin
									.getVeSinhGiaDinhId());
					ettRevert.setTrangThai(0);
					VeSinhGiaDinhLocalServiceUtil
							.updateVeSinhGiaDinh(ettRevert);
				}

				ThongTinKiemDemHoGDLocalServiceUtil
						.deleteThongTinKiemDemHoGD(Integer.valueOf(l + ""));
			}
			messageKey = MessageSuccess.PHAN_CONG_LAI_GIA_DINH_MESSAGE;
			isSuccess = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			messageKey = MessageErrors.PHAN_CONG_LAI_GIA_DINH_MESSAGE;
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, actionRequest,
				actionResponse);
	}

	private void doInsertCongTrinhToKeHoach(
			List<VeSinhCongTrinh> listCongTrinhByOrgId, long keHoachId)
			throws SystemException {
		// TODO Auto-generated method stub
		ThongTinKiemDemCongTrinh ettInsert = new ThongTinKiemDemCongTrinhImpl();
		KeHoachKiemDemVeSinh keHoach = null;
		keHoach = KeHoachKiemDemVeSinhLocalServiceUtil
				.fetchKeHoachKiemDemVeSinh(Integer.valueOf(keHoachId + ""));
		KiemDemVien kiemDemVien = null;
		String taiKhoan = StringPool.BLANK;
		if (Validator.isNotNull(keHoach)) {
			if (Validator.isNotNull(keHoach.getKiemDemVienID())) {
				kiemDemVien = KiemDemVienLocalServiceUtil
						.fetchKiemDemVien(keHoach.getKiemDemVienID());
				taiKhoan = Validator.isNotNull(kiemDemVien) ? kiemDemVien
						.getTaiKhoan() : StringPool.BLANK;
			}
		}
		for (VeSinhCongTrinh veSinhCongTrinh : listCongTrinhByOrgId) {
			veSinhCongTrinh.setTrangThai(1);
			VeSinhCongTrinhLocalServiceUtil
					.updateVeSinhCongTrinh(veSinhCongTrinh);
			ettInsert = new ThongTinKiemDemCongTrinhImpl();
			long id = 0;
			id = CounterLocalServiceUtil
					.increment(ThongTinKiemDemCongTrinh.class.getName());
			ettInsert = ThongTinKiemDemCongTrinhLocalServiceUtil
					.createThongTinKiemDemCongTrinh(Integer.valueOf(id + ""));
			ettInsert.setVeSinhConTrinhId(veSinhCongTrinh.getId());
			ettInsert
					.setKeHoachKiemDemVeSinhId(Integer.valueOf(keHoachId + ""));
			ettInsert.setMaTinh(veSinhCongTrinh.getMaTinh());
			ettInsert.setMaHuyen(veSinhCongTrinh.getMaHuyen());
			ettInsert.setMaXa(veSinhCongTrinh.getMaXa());
			ettInsert.setDiaChi(veSinhCongTrinh.getDiaChi());
			ettInsert.setTenCongTrinh(veSinhCongTrinh.getTenCongTrinh());
			ettInsert.setDanhGiaKiemDem(0);
			ettInsert.setTaiKhoan(taiKhoan);
			ettInsert.setLoaiCongTrinh(veSinhCongTrinh.getLoaiCongTrinh());
			ThongTinKiemDemCongTrinhLocalServiceUtil
					.updateThongTinKiemDemCongTrinh(ettInsert);
		}
	}

	public void phanCongLaiKeHoachKieDemCongTrinh(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.PHAN_CONG_LAI_CONG_TRINH_MESSAGE;
		long idReturn = 0;
		try {
			long[] orgIds = StringUtil.split(
					ParamUtil.getString(actionRequest, "orgIds"), 0L);
			long maDotBaoCao = ParamUtil.getLong(actionRequest,
					"maKeHoachKiemDem");
			idReturn = maDotBaoCao;
			VeSinhCongTrinh ettRevert = null;
			ThongTinKiemDemCongTrinh ettThongTin = null;
			for (long l : orgIds) {
				ettThongTin = ThongTinKiemDemCongTrinhLocalServiceUtil
						.fetchThongTinKiemDemCongTrinh(Integer.valueOf(l + ""));
				_log.info("*****" + l);
				ettRevert = new VeSinhCongTrinhImpl();
				if (Validator.isNotNull(ettThongTin)) {
					ettRevert = VeSinhCongTrinhLocalServiceUtil
							.fetchVeSinhCongTrinh(ettThongTin
									.getVeSinhConTrinhId());
					ettRevert.setTrangThai(0);
					VeSinhCongTrinhLocalServiceUtil
							.updateVeSinhCongTrinh(ettRevert);
				}
				ThongTinKiemDemCongTrinhLocalServiceUtil
						.deleteThongTinKiemDemCongTrinh(Integer.valueOf(l + ""));
			}
			messageKey = MessageSuccess.PHAN_CONG_LAI_CONG_TRINH_MESSAGE;
			isSuccess = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			messageKey = MessageErrors.PHAN_CONG_LAI_CONG_TRINH_MESSAGE;
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, actionRequest,
				actionResponse);
	}

	public void deleteKeHoachKiemDem(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.ADD_KE_HOACH_KIEM_DEM_MESSAGE;
		long idReturn = 0;
		long userId = PortalUtil.getUserId(actionRequest);
		KeHoachKiemDemVeSinhTerms keHoachKiemDemVeSinhTerms = new KeHoachKiemDemVeSinhTerms(
				actionRequest);
		try {
			int id = keHoachKiemDemVeSinhTerms.getId();
			KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = new KeHoachKiemDemVeSinhImpl();
			if (id > 0) {
				keHoachKiemDemVeSinh = KeHoachKiemDemVeSinhLocalServiceUtil
						.fetchKeHoachKiemDemVeSinh(id);
				messageKey = MessageSuccess.DONG_KE_HOACH_KIEM_DEM_MESSAGE;
				keHoachKiemDemVeSinh.setNgayDong(new Date());
				keHoachKiemDemVeSinh.setIdNguoiDong(Integer
						.valueOf(userId + ""));
				// //update
				KeHoachKiemDemVeSinhLocalServiceUtil
						.updateKeHoachKiemDemVeSinh(keHoachKiemDemVeSinh);
				//
				List<ThongTinKiemDemHoGD> listTt = new ArrayList<ThongTinKiemDemHoGD>();
				listTt = KeHoachKiemDemVeSinhLocalServiceUtil
						.getListThongTinGdByKeHoachId(id);
				List<ThongTinKiemDemCongTrinh> listCt = new ArrayList<ThongTinKiemDemCongTrinh>();
				listCt = KeHoachKiemDemVeSinhLocalServiceUtil
						.getListThongTinCongTringByKeHoachId(id);
				//
				for (ThongTinKiemDemHoGD thongtinkiemdemVeSinh : listTt) {
					updateStatusHoGiaDinh(thongtinkiemdemVeSinh, 1);
				}
				for (ThongTinKiemDemCongTrinh thongtinkiemdemVeSinh : listCt) {
					updateStatusCongTrinh(thongtinkiemdemVeSinh, 1);
				}
				KeHoachKiemDemVeSinhLocalServiceUtil
						.deleteKeHoachKiemDemVeSinh(id);
				messageKey = MessageSuccess.XOA_KE_HOACH_KIEM_DEM_MESSAGE;
				isSuccess = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			_log.error(e);
			messageKey = MessageErrors.XOA_KE_HOACH_KIEM_DEM_MESSAGE;
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
					+ KeHoachKiemDemVeSinhTerms.MA_TINH
					+ "="
					+ ParamUtil.getString(actionRequest,
							KeHoachKiemDemVeSinhTerms.MA_TINH);
			successURL += "&"
					+ actionResponse.getNamespace()
					+ KeHoachKiemDemVeSinhTerms.MA_HUYEN
					+ "="
					+ ParamUtil.getString(actionRequest,
							KeHoachKiemDemVeSinhTerms.MA_HUYEN);
			successURL += "&" + actionResponse.getNamespace() + "maXa="
					+ ParamUtil.getString(actionRequest, "maXa");
			successURL += "&" + actionResponse.getNamespace()
					+ "idTrangThaiChk="
					+ ParamUtil.getString(actionRequest, "idTrangThaiChk");
			successURL += "&"
					+ actionResponse.getNamespace()
					+ KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID
					+ "="
					+ ParamUtil.getString(actionRequest,
							KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID);
			successURL += "&" + actionResponse.getNamespace() + "trangThai="
					+ ParamUtil.getString(actionRequest, "trangThai");
			successURL += "&" + actionResponse.getNamespace() + "orgcode="
					+ ParamUtil.getString(actionRequest, "orgcode");
			if (id > 0) {
				successURL += "&" + actionResponse.getNamespace()
						+ DauNoiNuocTerms.ID + "=" + id;
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
					+ KeHoachKiemDemVeSinhTerms.MA_TINH
					+ "="
					+ ParamUtil.getString(actionRequest,
							KeHoachKiemDemVeSinhTerms.MA_TINH);
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ KeHoachKiemDemVeSinhTerms.MA_HUYEN
					+ "="
					+ ParamUtil.getString(actionRequest,
							KeHoachKiemDemVeSinhTerms.MA_HUYEN);
			errorURL += "&" + actionResponse.getNamespace() + "maXa="
					+ ParamUtil.getString(actionRequest, "maXa");
			errorURL += "&" + actionResponse.getNamespace() + "idTrangThaiChk="
					+ ParamUtil.getString(actionRequest, "idTrangThaiChk");
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID
					+ "="
					+ ParamUtil.getString(actionRequest,
							KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID);
			errorURL += "&" + actionResponse.getNamespace() + "trangThai="
					+ ParamUtil.getString(actionRequest, "trangThai");
			errorURL += "&" + actionResponse.getNamespace() + "orgcode="
					+ ParamUtil.getString(actionRequest, "orgcode");
			if (id > 0) {
				errorURL += "&" + actionResponse.getNamespace()
						+ DauNoiNuocTerms.ID + "=" + id;
			}
			SessionErrors.add(actionRequest, messageKey);
			if (Validator.isNotNull(errorURL)) {
				actionResponse.sendRedirect(errorURL);
			}
		}
	}

	// redirect
	private void sendCustomRedirect(long id, boolean isSuccess,
			String messageKey, String errorKD, ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		if (isSuccess) {
			// SessionMessages.add(actionRequest,
			// PortalUtil.getPortletId(actionRequest) +
			// SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			String successURL = ParamUtil.getString(actionRequest,
					"onpageSuccess");
			successURL += "&"
					+ actionResponse.getNamespace()
					+ KeHoachKiemDemVeSinhTerms.MA_TINH
					+ "="
					+ ParamUtil.getString(actionRequest,
							KeHoachKiemDemVeSinhTerms.MA_TINH);
			successURL += "&"
					+ actionResponse.getNamespace()
					+ KeHoachKiemDemVeSinhTerms.MA_HUYEN
					+ "="
					+ ParamUtil.getString(actionRequest,
							KeHoachKiemDemVeSinhTerms.MA_HUYEN);
			successURL += "&" + actionResponse.getNamespace() + "maXa="
					+ ParamUtil.getString(actionRequest, "maXa");
			successURL += "&" + actionResponse.getNamespace()
					+ "idTrangThaiChk="
					+ ParamUtil.getString(actionRequest, "idTrangThaiChk");
			successURL += "&"
					+ actionResponse.getNamespace()
					+ KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID
					+ "="
					+ ParamUtil.getString(actionRequest,
							KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID);
			successURL += "&" + actionResponse.getNamespace() + "trangThai="
					+ ParamUtil.getString(actionRequest, "trangThai");
			successURL += "&" + actionResponse.getNamespace() + "orgcode="
					+ ParamUtil.getString(actionRequest, "orgcode");
			if (id > 0) {
				successURL += "&" + actionResponse.getNamespace()
						+ DauNoiNuocTerms.ID + "=" + id;
				successURL += "&" + actionResponse.getNamespace() + "lsId="
						+ errorKD;
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
					+ KeHoachKiemDemVeSinhTerms.MA_TINH
					+ "="
					+ ParamUtil.getString(actionRequest,
							KeHoachKiemDemVeSinhTerms.MA_TINH);
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ KeHoachKiemDemVeSinhTerms.MA_HUYEN
					+ "="
					+ ParamUtil.getString(actionRequest,
							KeHoachKiemDemVeSinhTerms.MA_HUYEN);
			errorURL += "&" + actionResponse.getNamespace() + "maXa="
					+ ParamUtil.getString(actionRequest, "maXa");
			errorURL += "&" + actionResponse.getNamespace() + "idTrangThaiChk="
					+ ParamUtil.getString(actionRequest, "idTrangThaiChk");
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID
					+ "="
					+ ParamUtil.getString(actionRequest,
							KeHoachKiemDemVeSinhTerms.KIEM_DEM_VIEN_ID);
			errorURL += "&" + actionResponse.getNamespace() + "trangThai="
					+ ParamUtil.getString(actionRequest, "trangThai");
			errorURL += "&" + actionResponse.getNamespace() + "orgcode="
					+ ParamUtil.getString(actionRequest, "orgcode");
			if (id > 0) {
				errorURL += "&" + actionResponse.getNamespace()
						+ DauNoiNuocTerms.ID + "=" + id;
				errorURL += "&" + actionResponse.getNamespace() + "lsId="
						+ errorKD;
			}
			SessionErrors.add(actionRequest, messageKey);
			if (Validator.isNotNull(errorURL)) {
				actionResponse.sendRedirect(errorURL);
			}
		}
	}

	public void dongkeHoachKiemDem(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.DONG_KE_HOACH_KIEM_DEM_MESSAGE;
		long userId = PortalUtil.getUserId(actionRequest);
		int id = 0;
		try {
			id = ParamUtil.getInteger(actionRequest,
					KeHoachKiemDemVeSinhTerms.ID);
			KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = new KeHoachKiemDemVeSinhImpl();
			_log.info("sadfasdfsadfasdfasdfasdfsadf" + id);
			if (id > 0) {
				keHoachKiemDemVeSinh = KeHoachKiemDemVeSinhLocalServiceUtil
						.fetchKeHoachKiemDemVeSinh(id);
				messageKey = MessageSuccess.DONG_KE_HOACH_KIEM_DEM_MESSAGE;
				_log.info("keHoachKiemDemVeSinh" + keHoachKiemDemVeSinh);

				keHoachKiemDemVeSinh.setNgayDong(new Date());
				keHoachKiemDemVeSinh.setIdNguoiDong(Integer
						.valueOf(userId + ""));
				// //update
				KeHoachKiemDemVeSinhLocalServiceUtil
						.updateKeHoachKiemDemVeSinh(keHoachKiemDemVeSinh);
				//
				List<ThongTinKiemDemHoGD> listTt = new ArrayList<ThongTinKiemDemHoGD>();
				listTt = KeHoachKiemDemVeSinhLocalServiceUtil
						.getListThongTinGdByKeHoachId(id);
				List<ThongTinKiemDemCongTrinh> listCt = new ArrayList<ThongTinKiemDemCongTrinh>();
				listCt = KeHoachKiemDemVeSinhLocalServiceUtil
						.getListThongTinCongTringByKeHoachId(id);
				//
				for (ThongTinKiemDemHoGD thongtinkiemdemVeSinh : listTt) {
					updateStatusHoGiaDinh(thongtinkiemdemVeSinh, 2);
				}
				for (ThongTinKiemDemCongTrinh thongtinkiemdemVeSinh : listCt) {
					updateStatusCongTrinh(thongtinkiemdemVeSinh, 2);
				}
				// actionResponse.sendRedirect(cuString);
				isSuccess = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			isSuccess = false;
			messageKey = MessageErrors.DONG_KE_HOACH_KIEM_DEM_MESSAGE;
		}
		//
		if (isSuccess) {
			SessionMessages.add(actionRequest, messageKey);
		} else {
			SessionErrors.add(actionRequest, messageKey);
		}
	}

	public void reopenkeHoachKiemDem(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.REOPEN_KE_HOACH_KIEM_DEM_MESSAGE;
		long userId = PortalUtil.getUserId(actionRequest);
		int id = 0;
		try {
			id = ParamUtil.getInteger(actionRequest,
					KeHoachKiemDemVeSinhTerms.ID);
			KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = new KeHoachKiemDemVeSinhImpl();
			_log.info("sadfasdfsadfasdfasdfasdfsadf" + id);
			if (id > 0) {
				keHoachKiemDemVeSinh = KeHoachKiemDemVeSinhLocalServiceUtil
						.fetchKeHoachKiemDemVeSinh(id);
				messageKey = MessageSuccess.REOPEN_KE_HOACH_KIEM_DEM_MESSAGE;
				_log.info("keHoachKiemDemVeSinh" + keHoachKiemDemVeSinh);
				keHoachKiemDemVeSinh.setNgayDong(null);
				keHoachKiemDemVeSinh.setIdNguoiDong(Integer
						.valueOf(userId + ""));
				// //update
				KeHoachKiemDemVeSinhLocalServiceUtil
						.updateKeHoachKiemDemVeSinh(keHoachKiemDemVeSinh);
				//
				// actionResponse.sendRedirect(cuString);
				isSuccess = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			isSuccess = false;
			messageKey = MessageErrors.REOPEN_KE_HOACH_KIEM_DEM_MESSAGE;
		}
		//
		if (isSuccess) {
			SessionMessages.add(actionRequest, messageKey);
		} else {
			SessionErrors.add(actionRequest, messageKey);
		}
	}

	private static Log _log = LogFactoryUtil
			.getLog(KeHoachKiemDemVeSinhAction.class);
}
