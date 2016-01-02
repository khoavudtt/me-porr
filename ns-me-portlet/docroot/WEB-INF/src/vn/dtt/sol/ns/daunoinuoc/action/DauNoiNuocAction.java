package vn.dtt.sol.ns.daunoinuoc.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import vn.dtt.cmon.dm.dao.NoSuchDATAITEMException;
import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.model.impl.DATAITEMImpl;
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.cmon.user.dao.model.impl.UserMappingImpl;
import vn.dtt.sol.ns.business.DataItemBusiness;
import vn.dtt.sol.ns.business.UserMappingBusiness;
import vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString;
import vn.dtt.sol.ns.daunoinuoc.terms.DauNoiNuocTerms;
import vn.dtt.sol.ns.reporting.DauNoiNuocImportModel;
import vn.dtt.sol.ns.tramcap.business.DauNoiNuocBusiness;
import vn.dtt.sol.ns.tramcap.business.TramCapBusiness;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocImpl;
import vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil;
import vn.dtt.sol.ns.util.DiaBanQuanLyUtils;
import vn.dtt.sol.ns.util.MessageErrors;
import vn.dtt.sol.ns.util.MessageSuccess;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class DauNoiNuocAction extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		User user = null;

		UserMapping loginUserMapping = new UserMappingImpl();

		String maTinh = ParamUtil.getString(renderRequest,
				DauNoiNuocTerms.MA_TINH);
		String maHuyen = ParamUtil.getString(renderRequest,
				DauNoiNuocTerms.MA_HUYEN);
		String maXa = ParamUtil.getString(renderRequest, DauNoiNuocTerms.MA_XA);
		String tramCapNuocId = ParamUtil.getString(renderRequest,
				DauNoiNuocTerms.TRAM_CAP_NUOC_ID);

		long maTramCap = ParamUtil.getLong(renderRequest,
				DauNoiNuocTerms.TRAM_CAP_NUOC_ID);

		String trangThai = ParamUtil.getString(renderRequest,
				DauNoiNuocTerms.TRANG_THAI);
		String namBaoCao = ParamUtil.getString(renderRequest,
				DauNoiNuocTerms.NAM_BAO_CAO);
		DauNoiNuoc dauNoiNuoc = null;
		List<DATAITEM> listTinh = new ArrayList<DATAITEM>();
		List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
		List<DATAITEM> listXa = new ArrayList<DATAITEM>();
		List<TramCapNuoc> listTramCapNuoc = new ArrayList<TramCapNuoc>();
		List<UserMapping> listUserBySearch = new ArrayList<UserMapping>();

		// kiem tra xem co phai la supperAdmin

		boolean isSupperAdmin = renderRequest.isUserInRole("Administrator");

		try {
			user = PortalUtil.getUser(renderRequest);
			loginUserMapping = UserMappingBusiness.getUserMapping(user);

			long dauNoiId = ParamUtil
					.getLong(renderRequest, DauNoiNuocTerms.ID);

			if (dauNoiId > 0) {
				dauNoiNuoc = DauNoiNuocBusiness.getDauNoiNuocById(dauNoiId);
				maTinh = dauNoiNuoc.getMaTinh();
				maHuyen = dauNoiNuoc.getMaHuyen();
				renderRequest.setAttribute("dauNoiNuoc", dauNoiNuoc);
			}

			listTinh = DiaBanQuanLyUtils.getTinh(user, isSupperAdmin,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listHuyen = DiaBanQuanLyUtils.getHuyen(user, maTinh, maTramCap,
					isSupperAdmin, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listXa = DiaBanQuanLyUtils.getXa(user, maTinh, maHuyen, maTramCap,
					isSupperAdmin, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listTramCapNuoc = DiaBanQuanLyUtils.getTramCap(user, maTinh,
					isSupperAdmin, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			if (loginUserMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
				listUserBySearch = UserMappingBusiness.getByTypeOrg1(
						loginUserMapping.getUserType(),
						loginUserMapping.getOrgCode1());

			} else if (loginUserMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {

				listUserBySearch = UserMappingBusiness.getByTypeOrg2(
						loginUserMapping.getUserType(), maTinh, maHuyen);

			}
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		renderRequest.setAttribute(DauNoiNuocTerms.MA_TINH, maTinh);
		renderRequest.setAttribute(DauNoiNuocTerms.MA_HUYEN, maHuyen);
		renderRequest.setAttribute(DauNoiNuocTerms.MA_XA, maXa);
		renderRequest.setAttribute(DauNoiNuocTerms.TRAM_CAP_NUOC_ID,
				tramCapNuocId);
		renderRequest.setAttribute(DauNoiNuocTerms.TRANG_THAI, trangThai);
		renderRequest.setAttribute(DauNoiNuocTerms.NAM_BAO_CAO, namBaoCao);
		renderRequest.setAttribute("listTinh", listTinh);
		renderRequest.setAttribute("listHuyen", listHuyen);
		renderRequest.setAttribute("listXa", listXa);
		renderRequest.setAttribute("listTramCapNuoc", listTramCapNuoc);
		renderRequest.setAttribute("loginUserMapping", loginUserMapping);
		renderRequest.setAttribute("listUserBySearch", listUserBySearch);
		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// TODO Auto-generated method stub
		User user = null;
		UserMapping loginUserMapping = new UserMappingImpl();
		String maTinh = ParamUtil.getString(request, DauNoiNuocTerms.MA_TINH);
		String maHuyen = ParamUtil.getString(request, DauNoiNuocTerms.MA_HUYEN);
		String maXa = ParamUtil.getString(request, DauNoiNuocTerms.MA_XA);
		String tramCapNuocId = ParamUtil.getString(request,
				DauNoiNuocTerms.TRAM_CAP_NUOC_ID);

		long maTramCap = ParamUtil.getLong(request,
				DauNoiNuocTerms.TRAM_CAP_NUOC_ID);

		String trangThai = ParamUtil.getString(request,
				DauNoiNuocTerms.TRANG_THAI);
		String namBaoCao = ParamUtil.getString(request,
				DauNoiNuocTerms.NAM_BAO_CAO);
		String ngayNhap = ParamUtil.getString(request, "ngayNhap").replaceAll(
				"-", "/");
		String idNguoiTao = ParamUtil.getString(request, "idNguoiTao");
		String advText = ParamUtil.getString(request, "advText");
		DauNoiNuoc dauNoiNuoc = null;
		List<DATAITEM> listTinh = new ArrayList<DATAITEM>();
		List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
		List<DATAITEM> listXa = new ArrayList<DATAITEM>();
		List<TramCapNuoc> listTramCapNuoc = new ArrayList<TramCapNuoc>();
		List<UserMapping> listUserBySearch = new ArrayList<UserMapping>();

		boolean isSupperAdmin = request.isUserInRole("Administrator");

		try {
			user = PortalUtil.getUser(request);
			loginUserMapping = UserMappingBusiness.getUserMapping(user);
			long dauNoiId = ParamUtil.getLong(request, DauNoiNuocTerms.ID);

			if (dauNoiId > 0) {
				dauNoiNuoc = DauNoiNuocBusiness.getDauNoiNuocById(dauNoiId);
				maTinh = dauNoiNuoc.getMaTinh();
				maHuyen = dauNoiNuoc.getMaHuyen();
				request.setAttribute("dauNoiNuoc", dauNoiNuoc);
			}
			
			if (Validator.isNull(maTinh)) {
				maTinh = loginUserMapping.getOrgCode1();
			}

			listTinh = DiaBanQuanLyUtils.getTinh(user, isSupperAdmin,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listHuyen = DiaBanQuanLyUtils.getHuyen(user, maTinh, maTramCap,
					isSupperAdmin, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listXa = DiaBanQuanLyUtils.getXa(user, maTinh, maHuyen, maTramCap,
					isSupperAdmin, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listTramCapNuoc = DiaBanQuanLyUtils.getTramCap(user, maTinh,
					isSupperAdmin, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			_log.info("----Tram cap nuoc -->>"+listTramCapNuoc.size());
			// add new
			if (loginUserMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
				listUserBySearch = UserMappingBusiness.getByTypeOrg1(
						loginUserMapping.getUserType(),
						loginUserMapping.getOrgCode1());

			} else if (loginUserMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {

				listUserBySearch = UserMappingBusiness.getByTypeOrg2(
						loginUserMapping.getUserType(), maTinh, maHuyen);

			}

		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		request.setAttribute(DauNoiNuocTerms.MA_TINH, maTinh);
		request.setAttribute(DauNoiNuocTerms.MA_HUYEN, maHuyen);
		request.setAttribute(DauNoiNuocTerms.MA_XA, maXa);
		request.setAttribute(DauNoiNuocTerms.TRAM_CAP_NUOC_ID, tramCapNuocId);
		request.setAttribute(DauNoiNuocTerms.TRANG_THAI, trangThai);
		request.setAttribute(DauNoiNuocTerms.NAM_BAO_CAO, namBaoCao);
		request.setAttribute("advText", advText);
		request.setAttribute("ngayNhap", ngayNhap);
		request.setAttribute("idNguoiTao", idNguoiTao);
		request.setAttribute("listTinh", listTinh);
		request.setAttribute("listHuyen", listHuyen);
		request.setAttribute("listXa", listXa);
		request.setAttribute("listUserBySearch", listUserBySearch);
		request.setAttribute("listTramCapNuoc", listTramCapNuoc);
		request.setAttribute("loginUserMapping", loginUserMapping);
		super.render(request, response);
	}

	public void addDauNoiNuoc(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.ADD_DAU_NOI_MESSAGE;
		long idReturn = 0;
		DauNoiNuocTerms dauNoiNuocTerm = new DauNoiNuocTerms(actionRequest);
		String add = "";
		add = ParamUtil.getString(actionRequest, Constants.CMD);
		long userId = PortalUtil.getUserId(actionRequest);
		try {
			DauNoiNuoc dauNoiNuocEtt = new DauNoiNuocImpl();
			if (add.equals(Constants.ADD)) {
				long id = 0;
				id = CounterLocalServiceUtil.increment(DauNoiNuoc.class
						.getName());
				dauNoiNuocEtt = DauNoiNuocLocalServiceUtil.createDauNoiNuoc(id);
				dauNoiNuocEtt.setNgayTao(new Date());
				dauNoiNuocEtt.setIdNguoiTao(Integer.valueOf(String
						.valueOf(userId)));
				messageKey = MessageSuccess.ADD_DAU_NOI_MESSAGE;
			} else {
				dauNoiNuocEtt = DauNoiNuocLocalServiceUtil
						.fetchDauNoiNuoc(dauNoiNuocTerm.getId());
				messageKey = MessageSuccess.EDIT_DAU_NOI_MESSAGE;
				idReturn = dauNoiNuocEtt.getId();
			}

			dauNoiNuocEtt.setTramCapNuocId(dauNoiNuocTerm.getTramCapNuocId());
			dauNoiNuocEtt.setTenChuHo(dauNoiNuocTerm.getTenChuHo());
			dauNoiNuocEtt.setGioiTinh(dauNoiNuocTerm.getGioiTinh());
			dauNoiNuocEtt.setMaTinh(dauNoiNuocTerm.getMaTinh());
			dauNoiNuocEtt.setMaHuyen(dauNoiNuocTerm.getMaHuyen());
			dauNoiNuocEtt.setMaXa(dauNoiNuocTerm.getMaXa());
			dauNoiNuocEtt.setNgayDauNoiHopDong(dauNoiNuocTerm
					.getNgayDauNoiHopDong());
			dauNoiNuocEtt.setThonXom(dauNoiNuocTerm.getThonXom());
			dauNoiNuocEtt.setNamBaoCao(dauNoiNuocTerm.getNamBaoCao());
			dauNoiNuocEtt.setSoNguoiTrongHo(dauNoiNuocTerm.getSoNguoiTrongHo());
			dauNoiNuocEtt.setGioiTinh(dauNoiNuocTerm.getGioiTinh());
			dauNoiNuocEtt.setThanhPhanHoGiaDinh(dauNoiNuocTerm
					.getThanhPhanHoGiaDinh());
			dauNoiNuocEtt.setSoSeryDongHo(dauNoiNuocTerm.getSoSeryDongHo());
			dauNoiNuocEtt.setNgayDauNoiThucTe(dauNoiNuocTerm
					.getNgayDauNoiThucTe());
			dauNoiNuocEtt.setGhiChu(dauNoiNuocTerm.getGhiChu());
			if (dauNoiNuocTerm.getNamBaoCao() == 0) {
				dauNoiNuocEtt.setTrangThai(0);
			} else {
				dauNoiNuocEtt.setTrangThai(2);
			}
			// update
			DauNoiNuocLocalServiceUtil.updateDauNoiNuoc(dauNoiNuocEtt);
			List<DauNoiNuoc> resultChk = new ArrayList<DauNoiNuoc>();
			resultChk = DauNoiNuocLocalServiceUtil.getChkAddDauNoi(
					dauNoiNuocEtt.getTramCapNuocId(),
					dauNoiNuocEtt.getMaTinh(), dauNoiNuocEtt.getMaHuyen(),
					dauNoiNuocEtt.getMaXa(), dauNoiNuocEtt.getThonXom(),
					dauNoiNuocEtt.getTenChuHo());
			if (Validator.isNotNull(resultChk) && resultChk.size() > 1) {
				isSuccess = false;
				messageKey = MessageSuccess.ADD_DAU_NOI_DUPLICATE_MESSAGE;
				idReturn = dauNoiNuocEtt.getId();
			} else {
				isSuccess = true;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			if (add.equals(Constants.ADD)) {
				messageKey = MessageErrors.ADD_DAU_NOI_MESSAGE;
			} else {
				messageKey = MessageErrors.EDIT_DAU_NOI_MESSAGE;
			}
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, actionRequest,
				actionResponse);
	}

	public void addDanhGiaLai(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		DauNoiNuocTerms dauNoiNuocTerm = new DauNoiNuocTerms(actionRequest);
		String cuString = ParamUtil.getString(actionRequest, "currentURL");
		String add = "";
		add = ParamUtil.getString(actionRequest, Constants.CMD);
		try {
			long userId = PortalUtil.getUserId(actionRequest);
			DauNoiNuoc dauNoiNuocEtt = new DauNoiNuocImpl();
			if (add.equals(Constants.ADD)) {
			} else {
				dauNoiNuocEtt = DauNoiNuocLocalServiceUtil
						.fetchDauNoiNuoc(dauNoiNuocTerm.getId());
			}
			dauNoiNuocEtt.setDanhGiaNuocHVS(dauNoiNuocTerm.getDanhGiaNuocHVS());
			dauNoiNuocEtt.setNgayKiemDem(dauNoiNuocTerm.getNgayKiemDem());
			dauNoiNuocEtt.setNgayDanhGia(new Date());
			dauNoiNuocEtt.setIdNguoiDanhGia(Integer.valueOf(userId + ""));
			dauNoiNuocEtt.setTrangThai(dauNoiNuocTerm.getTrangThai());
			// update
			DauNoiNuocLocalServiceUtil.updateDauNoiNuoc(dauNoiNuocEtt);
			actionResponse.sendRedirect(cuString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteDauNoiNuoc(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.XOA_DAU_NOI_MESSAGE;
		long idReturn = 0;
		DauNoiNuocTerms dauNoiNuocTerm = new DauNoiNuocTerms(actionRequest);
		try {
			long id = dauNoiNuocTerm.getId();
			DauNoiNuocLocalServiceUtil.deleteDauNoiNuoc(id);
			messageKey = MessageSuccess.XOA_DAU_NOI_MESSAGE;
			isSuccess = true;
		} catch (Exception e) {
			// TODO: handle exception
			_log.error(e);
			messageKey = MessageErrors.XOA_DAU_NOI_MESSAGE;
		}
		sendCustomRedirect(idReturn, isSuccess, messageKey, actionRequest,
				actionResponse);
	}

	public void verifiedDocumentData(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		try {
			boolean isSuccess = false;
			long userId = PortalUtil.getUserId(actionRequest);
			String messageKey = MessageErrors.IMPORT_DAU_NOI_MESSAGE;
			DauNoiNuocTerms dauNoiNuocTerm = new DauNoiNuocTerms(actionRequest);
			String maTinh = ParamUtil.getString(actionRequest,
					DauNoiNuocTerms.MA_TINH);
			// 0-OK 1-TINH_THANH ko dung
			// 2-QUAN_HUYEN ko dung
			// 3-PHUONG_XA ko dung
			// 4-TRAM_CAP_NUOC ko dung
			// 5-NOI_FORMAT_FILE
			int erroType = 0;
			String importName = "";
			List<String> listTram = new ArrayList<String>();
			List<String> listHuyen = new ArrayList<String>();
			List<String> listXa = new ArrayList<String>();
			String tinhStr = "";
			File fileImport = dauNoiNuocTerm.getFileImport();
			DATAITEM dataCheckOrg = new DATAITEMImpl();
			List<DauNoiNuocImportModel> results = new ArrayList<DauNoiNuocImportModel>();
			try {
				FileInputStream file = new FileInputStream(fileImport);
				_log.info("fileImport.getName()" + fileImport.getName());
				XSSFWorkbook workbook = new XSSFWorkbook();
				Iterator<Row> rowIterator = null;
				if (fileImport.getName().contains(".xlsx")) {
					workbook = new XSSFWorkbook(file);
					// Get first/desired sheet from the workbook
					XSSFSheet sheet = workbook.getSheetAt(0);
					// Iterate through each rows one by one
					rowIterator = sheet.iterator();
				} else {
					HSSFWorkbook workbook2 = new HSSFWorkbook(file);
					// Get first/desired sheet from the workbook
					HSSFSheet sheet = workbook2.getSheetAt(0);
					// Iterate through each rows one by one
					rowIterator = sheet.iterator();
				}

				int isNext = 1;
				while (rowIterator.hasNext() && isNext > 0) {
					Row row = rowIterator.next();
					// For each row, iterate through all the columns
					Iterator<Cell> cellIterator = row.cellIterator();
					DauNoiNuocImportModel ett = new DauNoiNuocImportModel();
					dataCheckOrg = new DATAITEMImpl();
					if (isNext == 0) {
						break;
					}
					while (cellIterator.hasNext() && isNext > 0) {
						// isNext = 0;
						Cell cell = cellIterator.next();
						int col = cell.getColumnIndex();
						if (cell.getRowIndex() == 6 && col == 1) {
							tinhStr = cell.getStringCellValue();
							try {
								dataCheckOrg = DataItemBusiness
										.getDATAITEMByTen(tinhStr, "");
								importName = tinhStr;
							} catch (NoSuchDATAITEMException e) {
								// TODO: handle exception
								isNext = 0;
								erroType = 1;
								importName = tinhStr;
								continue;
							} catch (PortalException e) {
								// TODO Auto-generated catch block
								isNext = 0;
								erroType = 5;
								importName = tinhStr;
								continue;
							} catch (SystemException e) {
								// TODO Auto-generated catch block
								isNext = 0;
								erroType = 5;
								importName = tinhStr;
								continue;
							}

						}

						// System.out.println();
						// Check the cell type and format accordingly

						// _log.info("col"+col+"tye"+cell.getCellType()+"/"+cell.getRowIndex()+"/");
						switch (col) {
						case 0:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							ett.setStt(cell.getStringCellValue().trim());
							break;
						case 1:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							ett.setTinh(cell.getStringCellValue().trim());
							break;
						case 2:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							listTram.add(cell.getStringCellValue().trim());
							ett.setTenHeThongCapNuoc(cell.getStringCellValue()
									.trim());
							break;
						case 3:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							listHuyen.add(cell.getStringCellValue().trim());
							ett.setHuyen(cell.getStringCellValue().trim());
							break;
						case 4:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							listXa.add(cell.getStringCellValue().trim());
							ett.setXa(cell.getStringCellValue().trim());
							break;
						case 5:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							ett.setThon(cell.getStringCellValue().trim());
							break;
						case 6:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							ett.setTenChuHoCoQuan(cell.getStringCellValue()
									.trim());
							break;
						case 7:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							ett.setSoNguoiTrongHo(cell.getStringCellValue()
									.trim());
							break;
						case 8:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							try {
								ett.setNgayDauNoiDate(sdf.parse(cell
										.getStringCellValue()));
								ett.setNgayDauNoi(cell.getStringCellValue());
							} catch (Exception e) {
								// TODO: handle exception
							}

							// if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
							// if (DateUtil.isCellDateFormatted(cell)) {
							// ett.setNgayDauNoiDate(cell.getDateCellValue());
							// ett.setNgayDauNoi(sdf.format(cell.getDateCellValue()));
							// //
							// ett.setNgayDauNoiDate(sdf.parse(ett.getNgayDauNoi()));
							// //
							// _log.info("ett.11111"+sdf.parse(ett.getNgayDauNoi()));
							// } else {
							// ett.setNgayDauNoi(cell.getStringCellValue().trim());
							// ett.setNgayDauNoiDate(sdf.parse(ett.getNgayDauNoi()));
							// //
							// _log.info("ett.setNgayDauNoiDate"+sdf.parse(ett.getNgayDauNoi()));
							// }
							// }
							break;
						case 9:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							ett.setSoSeRy(cell.getStringCellValue().trim());
							break;
						}
					}
					results.add(ett);
				}
				file.close();
			} catch (Exception e) {
				// TODO: handle exception
				erroType = 5;
				messageKey = MessageErrors.IMPORT_DAU_NOI_MESSAGE;
				_log.error(e);
			}

			listTram = new ArrayList<String>(
					new LinkedHashSet<String>(listTram));
			listHuyen = new ArrayList<String>(new LinkedHashSet<String>(
					listHuyen));
			listXa = new ArrayList<String>(new LinkedHashSet<String>(listXa));
			if (erroType != 1) {
				for (int i = 0; i < listHuyen.size(); i++) {
					String string = listHuyen.get(i);
					if (i > 1) {
						try {
							_log.info("tinh" + tinhStr + "//" + string);
							// dataCheckOrg =
							// DataItemBusiness.getDATAITEMByTen(tinhStr,"");
							// dataCheckOrg =
							// DataItemBusiness.getDATAITEMByTen(string,dataCheckOrg.getNode1());
							dataCheckOrg = DataItemBusiness.getDATAITEMByTen(
									tinhStr, "", 1);
							dataCheckOrg = DataItemBusiness.getDATAITEMByTen(
									string, dataCheckOrg.getNode1(), 2);
							importName = string;
							if (Validator.isNull(dataCheckOrg)) {
								erroType = 2;
								importName = string;
								messageKey = MessageErrors.IMPORT_DAU_NOI_MESSAGE;
								break;
							}
						} catch (NoSuchDATAITEMException e) {
							// TODO: handle exception
							erroType = 2;
							importName = string;
							messageKey = MessageErrors.IMPORT_DAU_NOI_MESSAGE;
							_log.error(e);
							break;
						} catch (PortalException e) {
							// TODO Auto-generated catch block
							erroType = 5;
							importName = string;
							messageKey = MessageErrors.IMPORT_DAU_NOI_MESSAGE;
							_log.error(e);
							break;
						} catch (SystemException e) {
							// TODO Auto-generated catch block
							erroType = 5;
							importName = string;
							messageKey = MessageErrors.IMPORT_DAU_NOI_MESSAGE;
							_log.error(e);
							break;
						}
					}

				}
				if (erroType != 1 && erroType != 2) {
					for (int i = 0; i < listXa.size(); i++) {
						String string = listXa.get(i);
						if (i > 1) {
							try {
								// dataCheckOrg =
								// DataItemBusiness.getDATAITEMByTen(string,"");
								dataCheckOrg = DataItemBusiness
										.getDATAITEMByTen(string, "", 1);
								importName = string;
								if (Validator.isNull(dataCheckOrg)) {
									erroType = 3;
									importName = string;
									messageKey = MessageErrors.IMPORT_DAU_NOI_MESSAGE;
									break;
								}
							} catch (NoSuchDATAITEMException e) {
								// TODO: handle exception
								erroType = 3;
								importName = string;
								messageKey = MessageErrors.IMPORT_DAU_NOI_MESSAGE;
								_log.error(e);
								break;

							} catch (PortalException e) {
								// TODO Auto-generated catch block
								erroType = 5;
								importName = string;
								messageKey = MessageErrors.IMPORT_DAU_NOI_MESSAGE;
								_log.error(e);
								break;
							} catch (SystemException e) {
								// TODO Auto-generated catch block
								erroType = 5;
								importName = string;
								messageKey = MessageErrors.IMPORT_DAU_NOI_MESSAGE;
								_log.error(e);
								break;
							}
						}
					}

				}

			}
			if (erroType == 0) {
				_log.info("tramCaptramCaptramCaptramCaptramCaptramCap");
				List<TramCapNuoc> listTramCapNuoc = new ArrayList<TramCapNuoc>();
				for (int i = 0; i < listTram.size(); i++) {
					String string = listTram.get(i);
					if (i >= 1) {
						listTramCapNuoc = TramCapBusiness.getByTenTram(string);
						importName = string;
						if (listTramCapNuoc.size() > 0) {
							for (TramCapNuoc tramCapNuoc : listTramCapNuoc) {
								_log.info("tramCapNuoc.getMaTinh()"
										+ tramCapNuoc.getMaTinh() + "//"
										+ maTinh);
								if (!tramCapNuoc.getMaTinh().equalsIgnoreCase(
										maTinh)) {
									erroType = 4;
									importName = string;
									break;
								}
							}
						} else {
							erroType = 4;
							importName = string;
							break;
						}
					}
				}
			}
			if (erroType == 0) {

				// check duplicate file
				int isChk = 0;
				if (results.size() > 6) {
					for (int i = 0; i < 6; i++) {
						_log.info(results.get(i).getHuyen() + "//"
								+ results.get(i).getXa()
								+ "Validator.isNumber(results.get(i).getStt())"
								+ Validator.isNumber(results.get(i).getStt()));
						if (Validator.isNumber(results.get(i).getStt())
								&& results.get(i).getHuyen().length() > 4) {
							long idTram = 0;
							idTram = TramCapBusiness.getByTenTram(
									results.get(i).getTenHeThongCapNuoc())
									.size() > 0 ? TramCapBusiness
									.getByTenTram(
											results.get(i)
													.getTenHeThongCapNuoc())
									.get(0).getId() : 0;
							// results.get(i).setTenHeThongCapNuocId(idTram);
							DATAITEM dataItem = new DATAITEMImpl();
							DATAITEM dataItem2 = new DATAITEMImpl();
							DATAITEM dataItem3 = new DATAITEMImpl();
							// dataItem =
							// DataItemBusiness.getDATAITEMByTen(results.get(i).getTinh(),"");
							dataItem = DataItemBusiness.getDATAITEMByTen(
									results.get(i).getTinh(), "", 1);
							// if(dataItem.getLevel()==1)results.get(i).setMaTinh(dataItem.getNode1());
							// dataItem2 =
							// DataItemBusiness.getDATAITEMByTen(results.get(i).getHuyen(),dataItem.getNode1());
							dataItem2 = DataItemBusiness.getDATAITEMByTen(
									results.get(i).getHuyen(),
									dataItem.getNode1(), 2);
							// if(dataItem.getLevel()==2)results.get(i).setMaHuyen(dataItem.getNode2());
							// dataItem3 =
							// DataItemBusiness.getDATAITEMByTen(results.get(i).getXa(),dataItem2.getNode2());
							dataItem3 = DataItemBusiness.getDATAITEMByTen(
									results.get(i).getXa(),
									dataItem2.getNode2(), 3);
							// if(dataItem.getLevel()==3)results.get(i).setMaXa(dataItem.getNode3());
							_log.info("vo thread getTenHeThongCapNuocId"
									+ Integer.valueOf(idTram + ""));
							_log.info("vo thread getMaTinh"
									+ dataItem.getNode1() + "");
							// _log.info("vo thread getMaHuyen"+
							// dataItem2.getNode2()+"");
							// _log.info("vo thread getMaXa"+
							// dataItem3.getNode3()+"");
							if (DauNoiNuocLocalServiceUtil.getChkImport(
									Integer.valueOf(idTram + ""),
									dataItem.getNode1(), dataItem2.getNode2(),
									dataItem3.getNode3(),
									results.get(i).getTenChuHoCoQuan(),
									Integer.valueOf(userId + "")).size() > 0) {
								isChk++;
							}
						}

					}
				}
				_log.info("vo thread action" + isChk);
				// call thread function.
				if (isChk > 3) {
					erroType = 6;
					messageKey = MessageErrors.IMPORT_DAU_NOI_MESSAGE;
				} else {
					messageKey = MessageSuccess.IMPORT_DAU_NOI_MESSAGE;
					_log.info("vo thread action");
					ServiceContext context;
					context = ServiceContextFactory.getInstance(actionRequest);
					int namBaoCao = ParamUtil.getInteger(actionRequest,
							DauNoiNuocTerms.NAM_BAO_CAO);

					Message message = new Message();
					message.put("namBaoCao", namBaoCao);
					message.put("listImport", results);
					message.put("context", context);
					message.put("userId", userId);
					MessageBusUtil
							.sendMessage(
									"destination/sol/ns/daunoinuoc/DauNoiNuocImportThread",
									message);
				}

			}
			// test

			actionRequest.getPortletSession().setAttribute("importName",
					importName);
			// actionResponse.sendRedirect(cuString);
			if (erroType > 0) {
				isSuccess = false;
			} else {
				isSuccess = true;
			}
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
			if (isSuccess) {
				String successURL = ParamUtil.getString(actionRequest,
						"onpageSuccess");
				successURL += "&"
						+ actionResponse.getNamespace()
						+ DauNoiNuocTerms.NAM_BAO_CAO
						+ "="
						+ ParamUtil.getInteger(actionRequest,
								DauNoiNuocTerms.NAM_BAO_CAO);
				successURL += "&" + actionResponse.getNamespace()
						+ "importError=" + erroType;
				SessionMessages.add(actionRequest, messageKey);
				if (Validator.isNotNull(successURL)) {
					actionResponse.sendRedirect(successURL);
				}
			} else {
				String errorURL = ParamUtil.getString(actionRequest,
						"onpageError");
				errorURL += "&"
						+ actionResponse.getNamespace()
						+ DauNoiNuocTerms.NAM_BAO_CAO
						+ "="
						+ ParamUtil.getInteger(actionRequest,
								DauNoiNuocTerms.NAM_BAO_CAO);
				errorURL += "&" + actionResponse.getNamespace()
						+ "importError=" + erroType;
				SessionErrors.add(actionRequest, messageKey);
				if (Validator.isNotNull(errorURL)) {
					actionResponse.sendRedirect(errorURL);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			_log.error(e);
		}
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
					+ DauNoiNuocTerms.MA_TINH
					+ "="
					+ ParamUtil.getString(actionRequest,
							DauNoiNuocTerms.MA_TINH);
			successURL += "&"
					+ actionResponse.getNamespace()
					+ DauNoiNuocTerms.MA_HUYEN
					+ "="
					+ ParamUtil.getString(actionRequest,
							DauNoiNuocTerms.MA_HUYEN);
			successURL += "&" + actionResponse.getNamespace()
					+ DauNoiNuocTerms.MA_XA + "="
					+ ParamUtil.getString(actionRequest, DauNoiNuocTerms.MA_XA);
			successURL += "&"
					+ actionResponse.getNamespace()
					+ DauNoiNuocTerms.TRAM_CAP_NUOC_ID
					+ "="
					+ ParamUtil.getString(actionRequest,
							DauNoiNuocTerms.TRAM_CAP_NUOC_ID);
			successURL += "&"
					+ actionResponse.getNamespace()
					+ DauNoiNuocTerms.TRANG_THAI
					+ "="
					+ ParamUtil.getString(actionRequest,
							DauNoiNuocTerms.TRANG_THAI);
			successURL += "&"
					+ actionResponse.getNamespace()
					+ DauNoiNuocTerms.NAM_BAO_CAO
					+ "="
					+ ParamUtil.getString(actionRequest,
							DauNoiNuocTerms.NAM_BAO_CAO);
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
					+ DauNoiNuocTerms.MA_TINH
					+ "="
					+ ParamUtil.getString(actionRequest,
							DauNoiNuocTerms.MA_TINH);
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ DauNoiNuocTerms.MA_HUYEN
					+ "="
					+ ParamUtil.getString(actionRequest,
							DauNoiNuocTerms.MA_HUYEN);
			errorURL += "&" + actionResponse.getNamespace()
					+ DauNoiNuocTerms.MA_XA + "="
					+ ParamUtil.getString(actionRequest, DauNoiNuocTerms.MA_XA);
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ DauNoiNuocTerms.TRAM_CAP_NUOC_ID
					+ "="
					+ ParamUtil.getString(actionRequest,
							DauNoiNuocTerms.TRAM_CAP_NUOC_ID);
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ DauNoiNuocTerms.TRANG_THAI
					+ "="
					+ ParamUtil.getString(actionRequest,
							DauNoiNuocTerms.TRANG_THAI);
			errorURL += "&"
					+ actionResponse.getNamespace()
					+ DauNoiNuocTerms.NAM_BAO_CAO
					+ "="
					+ ParamUtil.getString(actionRequest,
							DauNoiNuocTerms.NAM_BAO_CAO);
			if (id > 0) {
				errorURL += "&" + actionResponse.getNamespace() + "duplicate=1";
				errorURL += "&" + actionResponse.getNamespace()
						+ DauNoiNuocTerms.ID + "=" + id;
			}
			if (messageKey
					.equalsIgnoreCase(MessageSuccess.ADD_DAU_NOI_DUPLICATE_MESSAGE)) {
				SessionMessages.add(actionRequest, messageKey);
			} else {
				SessionErrors.add(actionRequest, messageKey);
			}

			if (Validator.isNotNull(errorURL)) {
				actionResponse.sendRedirect(errorURL);
			}
		}
	}

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static Log _log = LogFactoryUtil.getLog(DauNoiNuocAction.class);
}
