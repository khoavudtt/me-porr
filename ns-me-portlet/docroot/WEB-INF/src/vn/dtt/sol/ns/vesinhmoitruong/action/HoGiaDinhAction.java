package vn.dtt.sol.ns.vesinhmoitruong.action;

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
import vn.dtt.sol.ns.reporting.HoGiaDinhImportModel;
import vn.dtt.sol.ns.util.DiaBanQuanLyUtils;
import vn.dtt.sol.ns.util.MessageErrors;
import vn.dtt.sol.ns.util.MessageSuccess;
import vn.dtt.sol.ns.util.WebKeys;
import vn.dtt.sol.ns.vesinhmoitruong.business.HoGiaDinhBussiness;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.terms.VeSinhGiaDinhTerms;

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

public class HoGiaDinhAction extends MVCPortlet{

/*	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		User user = null;
		UserMapping loginUserMapping = new UserMappingImpl();
		String maTinh = ParamUtil.getString(renderRequest, VeSinhGiaDinhTerms.MA_TINH);
		String maHuyen = ParamUtil.getString(renderRequest, VeSinhGiaDinhTerms.MA_HUYEN);
		String maXa = ParamUtil.getString(renderRequest, VeSinhGiaDinhTerms.MA_XA);
		String loaiNhaTieu = ParamUtil.getString(renderRequest, VeSinhGiaDinhTerms.LOAI_NHA_TIEU);
		String trangThai = ParamUtil.getString(renderRequest, VeSinhGiaDinhTerms.TRANG_THAI);
		String namBaoCao = ParamUtil.getString(renderRequest, VeSinhGiaDinhTerms.NAM_BAO_CAO);
		List<DATAITEM> listTinh = new ArrayList<DATAITEM>();
		List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
		List<DATAITEM> listXa = new ArrayList<DATAITEM>();
		boolean isSupperAdmin = renderRequest.isUserInRole("Administrator");

		try {
			user = PortalUtil.getUser(renderRequest);
			loginUserMapping = UserMappingBusiness.getUserMapping(user);
			
			listTinh = DiaBanQuanLyUtils.getTinh(user, isSupperAdmin,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listHuyen = DiaBanQuanLyUtils.getHuyen(user, maTinh, 0l,
					isSupperAdmin, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listXa = DiaBanQuanLyUtils.getXa(user, maTinh, maHuyen, 0l,
					isSupperAdmin, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		renderRequest.setAttribute(VeSinhGiaDinhTerms.MA_TINH, maTinh);
		renderRequest.setAttribute(VeSinhGiaDinhTerms.MA_HUYEN, maHuyen);
		renderRequest.setAttribute(VeSinhGiaDinhTerms.MA_XA, maXa);
		renderRequest.setAttribute(VeSinhGiaDinhTerms.LOAI_NHA_TIEU, loaiNhaTieu);
		renderRequest.setAttribute(VeSinhGiaDinhTerms.TRANG_THAI, trangThai);
		renderRequest.setAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO, namBaoCao);
		
		renderRequest.setAttribute("listTinh", listTinh);
		renderRequest.setAttribute("listHuyen", listHuyen);
		renderRequest.setAttribute("listXa", listXa);
		renderRequest.setAttribute("loginUserMapping", loginUserMapping);
		
		super.doView(renderRequest, renderResponse);
	}
	*/
	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// TODO Auto-generated method stub
		_log.info("vao render");
		User user = null;
		UserMapping loginUserMapping = new UserMappingImpl();
		String maTinh = ParamUtil.getString(request, VeSinhGiaDinhTerms.MA_TINH);
		String maHuyen = ParamUtil.getString(request, VeSinhGiaDinhTerms.MA_HUYEN);
		String maXa = ParamUtil.getString(request, VeSinhGiaDinhTerms.MA_XA);
		String loaiNhaTieu = ParamUtil.getString(request, VeSinhGiaDinhTerms.LOAI_NHA_TIEU);
		String id = ParamUtil.getString(request, VeSinhGiaDinhTerms.ID);
		String trangThai = ParamUtil.getString(request, VeSinhGiaDinhTerms.TRANG_THAI);
		String namBaoCao = ParamUtil.getString(request, VeSinhGiaDinhTerms.NAM_BAO_CAO);
		String namBaoCaoVstx = ParamUtil.getString(request, VeSinhGiaDinhTerms.NAM_BAO_CAO+"vstx");
		List<DATAITEM> listTinh = new ArrayList<DATAITEM>();
		List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
		List<DATAITEM> listXa = new ArrayList<DATAITEM>();
		List<DATAITEM> listLoaiNhaTieu = new ArrayList<DATAITEM>();
		VeSinhGiaDinh veSinhGiaDinh = null;
		String ngayNhap = ParamUtil.getString(request, "ngayNhap").replaceAll("-", "/");
		String idNguoiTao = ParamUtil.getString(request, "idNguoiTao");
		String advText = ParamUtil.getString(request, "advText");
		List<UserMapping> listUserBySearch = new ArrayList<UserMapping>();

		boolean isSupperAdmin = request.isUserInRole("Administrator");


		try {
			 user = PortalUtil.getUser(request);
			 loginUserMapping = UserMappingBusiness.getUserMapping(user);

			if(Validator.isNotNull(id)){
					veSinhGiaDinh = HoGiaDinhBussiness.fetchVeSinhGiaDinh(Integer.valueOf(id));
					maTinh = veSinhGiaDinh.getMaTinh();
					maHuyen = veSinhGiaDinh.getMaHuyen();
			}
			 
			loginUserMapping = UserMappingBusiness.getUserMapping(user);
			
			if (Validator.isNull(maTinh) && Validator.isNotNull(loginUserMapping)) {
				maTinh = loginUserMapping.getOrgCode1();
			}
			
			listTinh = DiaBanQuanLyUtils.getTinh(user, isSupperAdmin,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listHuyen = DiaBanQuanLyUtils.getHuyen(user, maTinh, 0l,
					isSupperAdmin, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			listXa = DiaBanQuanLyUtils.getXa(user, maTinh, maHuyen, 0l,
					isSupperAdmin, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			if(loginUserMapping.getUserType()==DauNoiNuocConstantString.UserMapping.CAP_TINH){

				listUserBySearch = UserMappingBusiness.getByTypeOrg1(loginUserMapping.getUserType(), loginUserMapping.getOrgCode1());
			}else if(loginUserMapping.getUserType()==DauNoiNuocConstantString.UserMapping.CAP_HUYEN){
				listUserBySearch = UserMappingBusiness.getByTypeOrg2(loginUserMapping.getUserType(), loginUserMapping.getOrgCode1(), loginUserMapping.getOrgCode2());
			}
			
			listLoaiNhaTieu = DataItemBusiness.getByDataGroupId(WebKeys.DATAGROUPID_LOAICAUTIEU);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute(VeSinhGiaDinhTerms.MA_TINH, maTinh);
		request.setAttribute(VeSinhGiaDinhTerms.MA_HUYEN, maHuyen);
		request.setAttribute(VeSinhGiaDinhTerms.MA_XA, maXa);
		request.setAttribute(VeSinhGiaDinhTerms.ID, id);
		request.setAttribute(VeSinhGiaDinhTerms.LOAI_NHA_TIEU, loaiNhaTieu);
		request.setAttribute(VeSinhGiaDinhTerms.TRANG_THAI, trangThai);
		request.setAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO, namBaoCao);
		request.setAttribute(VeSinhGiaDinhTerms.NAM_BAO_CAO+"vstx", namBaoCaoVstx);
		request.setAttribute("advText", advText);
		request.setAttribute("ngayNhap", ngayNhap);
		request.setAttribute("idNguoiTao", idNguoiTao);
		request.setAttribute("listTinh", listTinh);
		request.setAttribute("listHuyen", listHuyen);
		request.setAttribute("listXa", listXa);
		request.setAttribute("listLoaiNhaTieu", listLoaiNhaTieu);
		request.setAttribute("veSinhGiaDinh", veSinhGiaDinh);
		request.setAttribute("loginUserMapping", loginUserMapping);
		request.setAttribute("listUserBySearch", listUserBySearch);
		super.render(request, response);
	}
	
	public void addHoGiaDinh(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.ADD_HO_GIA_DINH_MESSAGE;
		long idReturn = 0;
		VeSinhGiaDinhTerms veSinhHoGiaDinhTerm = new VeSinhGiaDinhTerms(actionRequest);
		String add = "";
		add = ParamUtil.getString(actionRequest, Constants.CMD);
		long userId = PortalUtil.getUserId(actionRequest);
		try {
			VeSinhGiaDinh hoGiaDinhEtt = new VeSinhGiaDinhImpl();
			if (add.equals(Constants.ADD)) {
				long id = 0;
				id = CounterLocalServiceUtil.increment(VeSinhGiaDinh.class.getName());
				hoGiaDinhEtt = VeSinhGiaDinhLocalServiceUtil.createVeSinhGiaDinh(Integer.valueOf(id+""));
				hoGiaDinhEtt.setIdNguoiTao(Integer.valueOf(String.valueOf(userId)));
				hoGiaDinhEtt.setNgayTao(new Date());
				messageKey = MessageSuccess.ADD_HO_GIA_DINH_MESSAGE;
			} else {
				hoGiaDinhEtt = VeSinhGiaDinhLocalServiceUtil.fetchVeSinhGiaDinh(veSinhHoGiaDinhTerm.getId());
				messageKey = MessageSuccess.EDIT_HO_GIA_DINH_MESSAGE;
				idReturn=hoGiaDinhEtt.getId();
			}
			
			hoGiaDinhEtt.setGioiTinhChuHo(veSinhHoGiaDinhTerm.getGioiTinhChuHo());
			hoGiaDinhEtt.setMaTinh(veSinhHoGiaDinhTerm.getMaTinh());
			hoGiaDinhEtt.setMaHuyen(veSinhHoGiaDinhTerm.getMaHuyen());
			hoGiaDinhEtt.setMaXa(veSinhHoGiaDinhTerm.getMaXa());
			hoGiaDinhEtt.setThonXom(veSinhHoGiaDinhTerm.getThonXom());
			hoGiaDinhEtt.setTenChuHo(veSinhHoGiaDinhTerm.getTenChuHo());
			hoGiaDinhEtt.setNamBaoCao(veSinhHoGiaDinhTerm.getNamBaoCao());
			if(hoGiaDinhEtt.getNamBaoCao() == 0){
				hoGiaDinhEtt.setTrangThai(0);
			}else{
				hoGiaDinhEtt.setTrangThai(2);
			}
			hoGiaDinhEtt.setGhiChu(veSinhHoGiaDinhTerm.getGhiChu());
			hoGiaDinhEtt.setThanhPhanHoGD(veSinhHoGiaDinhTerm.getThanhPhanHoGD());
			
			hoGiaDinhEtt.setLoaiNhaTieu(veSinhHoGiaDinhTerm.getLoaiNhaTieu());
			hoGiaDinhEtt.setSoNguoiTrongHo(veSinhHoGiaDinhTerm.getSoNguoiTrongHo());
			hoGiaDinhEtt.setThangXayDung(veSinhHoGiaDinhTerm.getThangXayDung());
			hoGiaDinhEtt.setNamXayDung(veSinhHoGiaDinhTerm.getNamXayDung());
			hoGiaDinhEtt.setCoNhaTieu(veSinhHoGiaDinhTerm.getCoNhaTieu());
			hoGiaDinhEtt.setNhaTieuHVS(veSinhHoGiaDinhTerm.getNhaTieuHVS());
			//update 
			VeSinhGiaDinhLocalServiceUtil.updateVeSinhGiaDinh(hoGiaDinhEtt);
			isSuccess = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			if (add.equals(Constants.ADD)) {
				messageKey = MessageErrors.ADD_HO_GIA_DINH_MESSAGE;
			}else{
				messageKey = MessageErrors.EDIT_HO_GIA_DINH_MESSAGE;
			}
		}
		sendCustomRedirect(idReturn,isSuccess,messageKey,actionRequest, actionResponse);
	}
	
	public void addDanhGiaLaiHoGiaDinh(ActionRequest actionRequest, ActionResponse actionResponse) {
		VeSinhGiaDinhTerms veSinhGiaDinhTerm = new VeSinhGiaDinhTerms(actionRequest);
		String cuString = ParamUtil.getString(actionRequest, "currentURL");
		String add = "";
		add = ParamUtil.getString(actionRequest, Constants.CMD);
		try {
			long userId = PortalUtil.getUserId(actionRequest);
			VeSinhGiaDinh veSinhGiaDinhEtt = new VeSinhGiaDinhImpl();
			if (add.equals(Constants.ADD)) {
			} else {
				veSinhGiaDinhEtt = VeSinhGiaDinhLocalServiceUtil.fetchVeSinhGiaDinh(veSinhGiaDinhTerm.getId());
			}
			veSinhGiaDinhEtt.setNhaTieuHVS(veSinhGiaDinhTerm.getNhaTieuHVS());
			veSinhGiaDinhEtt.setNgayKiemDem(veSinhGiaDinhTerm.getNgayKiemDem());
			veSinhGiaDinhEtt.setNgayDanhGia(new Date());
			veSinhGiaDinhEtt.setIdNguoiDanhGia(Integer.valueOf(userId+""));
			veSinhGiaDinhEtt.setTrangThai(veSinhGiaDinhTerm.getTrangThai());
//			//update 
			VeSinhGiaDinhLocalServiceUtil.updateVeSinhGiaDinh(veSinhGiaDinhEtt);
			actionResponse.sendRedirect(cuString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteHoGiaDinh(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.XOA_HO_GIA_DINH_MESSAGE;
		long idReturn = 0;
		VeSinhGiaDinhTerms veSinhGiaDinhTerm = new VeSinhGiaDinhTerms(actionRequest);
		try {
			int id = veSinhGiaDinhTerm.getId();
			VeSinhGiaDinhLocalServiceUtil.deleteVeSinhGiaDinh(id);
			messageKey = MessageSuccess.XOA_HO_GIA_DINH_MESSAGE;
			isSuccess = true;
		} catch (Exception e) {
			// TODO: handle exception
			_log.error(e);
			messageKey = MessageErrors.XOA_HO_GIA_DINH_MESSAGE;
		}
		sendCustomRedirect(idReturn,isSuccess,messageKey,actionRequest, actionResponse);
	}
	public void verifiedDocumentData(ActionRequest actionRequest, ActionResponse actionResponse) {
		try {
			boolean isSuccess = false;
			long userId = PortalUtil.getUserId(actionRequest);
			String messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
			DauNoiNuocTerms dauNoiNuocTerm = new DauNoiNuocTerms(actionRequest);
			String maTinh = ParamUtil.getString(actionRequest, DauNoiNuocTerms.MA_TINH);
			int typeImport = ParamUtil.getInteger(actionRequest, VeSinhGiaDinhTerms.TYPE_IMPORT);
			//0-OK 1-TINH_THANH ko dung 
			//2-QUAN_HUYEN ko dung 
			//3-PHUONG_XA ko dung 
			//4-TRAM_CAP_NUOC ko dung 
			//5-NOI_FORMAT_FILE
			int erroType = 0;
			String importName = "";
			List<String> listHuyen = new ArrayList<String>();
			List<String> listXa = new ArrayList<String>();
			File fileImport = dauNoiNuocTerm.getFileImport();
			DATAITEM dataCheckOrg = new DATAITEMImpl();
			
			List<HoGiaDinhImportModel> results = new ArrayList<HoGiaDinhImportModel>();
			try {
				FileInputStream file = new FileInputStream(fileImport);
				_log.info("fileImport.getName()"+fileImport.getName());
				XSSFWorkbook workbook = new XSSFWorkbook();
				Iterator<Row> rowIterator = null;
				if(fileImport.getName().contains(".xlsx")){
					workbook = new XSSFWorkbook(file);
					// Get first/desired sheet from the workbook
					XSSFSheet sheet = workbook.getSheetAt(0);
					// Iterate through each rows one by one
					rowIterator = sheet.iterator();
				}else{
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
					HoGiaDinhImportModel ett = new HoGiaDinhImportModel();
					
					dataCheckOrg = new DATAITEMImpl();
					while (cellIterator.hasNext() && isNext > 0) {
						ett.setMaTinh(maTinh);
//						isNext = 0;
						Cell cell = cellIterator.next();
						int col = cell.getColumnIndex();
						switch (col) {
						case 0:
							cell.setCellType(Cell.CELL_TYPE_STRING);
								ett.setStt(cell.getStringCellValue().trim());
							break;
						case 1:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							listHuyen.add(cell.getStringCellValue().trim());
							ett.setMaHuyen(cell.getStringCellValue().trim());
							break;
						case 2:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							listXa.add(cell.getStringCellValue().trim());
							ett.setMaXa(cell.getStringCellValue().trim());
							break;
						case 3:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							ett.setThonXom(cell.getStringCellValue().trim());
							break;
						case 4:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							ett.setTenChuHo(cell.getStringCellValue().trim());
							break;
						case 5:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							ett.setHoNgheo(cell.getStringCellValue().trim());
							break;
						case 6:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							if(typeImport==1){
								ett.setKhongCoNhaTieu(cell.getStringCellValue().trim().length());
							}else{
								if(cell.getStringCellValue().trim().length()>0){
									ett.setKhongCoNhaTieu(999);
								}else{
									ett.setKhongCoNhaTieu(1);
								}
								
							}
							
							break;
						case 7:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							if(typeImport==1){
								ett.setCoNhaTieuKhongHVS(cell.getStringCellValue().trim().length());
							}else{
								if(cell.getStringCellValue().trim().length()>0){
									ett.setCoNhaTieuKhongHVS(999);
								}else{
									ett.setCoNhaTieuKhongHVS(1);
								}
								
							}
							
							break;
//						case 8:
//							if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
//						        if (DateUtil.isCellDateFormatted(cell)) {
//						           ett.setNgayDauNoiDate(cell.getDateCellValue());
//						           ett.setNgayDauNoi(sdf.format(cell.getDateCellValue()));
//						        } else {
//						        	ett.setNgayDauNoi(cell.getStringCellValue());
//						        }
//							}
//							break;	
						case 8:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							if(typeImport==1){
								if(cell.getStringCellValue().length()>0){
									ett.setLoaiNhaTieu(WebKeys.IMPORT_TH);
								}
							}else{
								if(cell.getStringCellValue().length()>0 && Validator.isNumber(cell.getStringCellValue())){
									ett.setSoNguoi(Integer.valueOf(cell.getStringCellValue().trim()));
								}else{
									ett.setSoNguoi(0);
								}
								
								
							}
							
							break;
						case 9:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							if(typeImport==1){
							if(cell.getStringCellValue().length()>0){
								ett.setLoaiNhaTieu(WebKeys.IMPORT_TD);
							}
							}
							break;
						case 10:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							if(typeImport==1){
							if(cell.getStringCellValue().length()>0){
								ett.setLoaiNhaTieu(WebKeys.IMPORT_HN);
							}
							}
							break;
						case 11:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							if(typeImport==1){
							if(cell.getStringCellValue().length()>0){
								ett.setLoaiNhaTieu(WebKeys.IMPORT_CHIM);
							}
							}
							break;
						case 12:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							if(typeImport==1){
							if(cell.getStringCellValue().length()>0){
								ett.setLoaiNhaTieu(WebKeys.IMPORT_KHAC);
							}
							}
							break;
						case 13:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							if(typeImport==1){
							if(cell.getStringCellValue().length()>0){
								ett.setNguonVon(WebKeys.IMPORT_TRO_CAP);
							}
							}
							break;
						case 14:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							if(typeImport==1){
							if(cell.getStringCellValue().length()>0){
								ett.setNguonVon(WebKeys.IMPORT_VAY_VON);
							}
							}
							break;
						case 15:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							if(typeImport==1){
							if(cell.getStringCellValue().length()>0){
								ett.setNguonVon(WebKeys.IMPORT_TU_XAY);
							}
							}
							break;
						case 16:
							if(typeImport==1){
								cell.setCellType(Cell.CELL_TYPE_STRING);
								if(Validator.isNotNull(cell.getStringCellValue().trim())){
									try {
										 ett.setDateToGet(sdfM.parse(cell.getStringCellValue().trim()));
										 ett.setDateToGetStr(cell.getStringCellValue().trim());
									} catch (Exception e) {
										// TODO: handle exception
									}
									
								}
//							if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
//						        if (DateUtil.isCellDateFormatted(cell)) {
//						           ett.setDateToGet(cell.getDateCellValue());
//						           ett.setDateToGetStr(sdf2Var.format(cell.getDateCellValue()));
//						        } else {
//						        	ett.setDateToGetStr(cell.getNumericCellValue()+"");
//						        }
//							}
							}
							break;	
						case 17:
							cell.setCellType(Cell.CELL_TYPE_STRING);
							if(typeImport==1){
								ett.setGhiChu(cell.getStringCellValue().trim());
							}
							break;
						}
						
					}
					results.add(ett);
					
				}
				file.close();
			} catch (Exception e) {
				// TODO: handle exception
				erroType = 5;
				messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
				_log.error(e);
			}
			listHuyen = new ArrayList<String>(new LinkedHashSet<String>(listHuyen));
			listXa = new ArrayList<String>(new LinkedHashSet<String>(listXa));
			if(erroType!= 1){
				for (int i=0; i< listHuyen.size(); i++) {
					String string = listHuyen.get(i);
					if(i>1){
						try {
//							dataCheckOrg = DataItemBusiness.getDATAITEMByTen(string,maTinh);
							dataCheckOrg = DataItemBusiness.getDATAITEMByTen(string,maTinh,2);
							importName = string;
							if(Validator.isNull(dataCheckOrg)){
								erroType = 2;
								importName = string;
								messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
								break;
							}
						} catch (NoSuchDATAITEMException e) {
							// TODO: handle exception
							erroType = 2;
							importName = string;
							messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
							_log.error(e);
							break;
						} catch (PortalException e) {
							// TODO Auto-generated catch block
							erroType = 5;
							importName = string;
							messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
							_log.error(e);
							break;
						} catch (SystemException e) {
							// TODO Auto-generated catch block
							erroType = 5;
							importName = string;
							messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
							_log.error(e);
							break;
						} catch (NullPointerException e) {
							// TODO Auto-generated catch block
							erroType = 2;
							importName = string;
							messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
							_log.error(e);
							break;
						}
					}
					
				}
				if(erroType!=1 && erroType!=2){
					for (int i=0; i< listXa.size(); i++) {
						String string = listXa.get(i);
						if(i>1){
						try {
//							dataCheckOrg = DataItemBusiness.getDATAITEMByTen(string,"");
							dataCheckOrg = DataItemBusiness.getDATAITEMByTen(string,"",1);
							importName = string;
							if(Validator.isNull(dataCheckOrg)){
								erroType = 3;
								importName = string;
								messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
								break;
							}
						} catch (NoSuchDATAITEMException e) {
							// TODO: handle exception
							erroType = 3;
							importName = string;
							messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
							_log.error(e);
							break;
							
						} catch (PortalException e) {
							// TODO Auto-generated catch block
							erroType = 5;
							importName = string;
							messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
							_log.error(e);
							break;
						} catch (SystemException e) {
							// TODO Auto-generated catch block
							erroType = 5;
							importName = string;
							messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
							_log.error(e);
							break;
						}
						}
					}
					
				}
				
			}
			
			if(erroType == 0){
				
				//check duplicate file
				int isChk =0;
				if(results.size() > 6){
//					for (HoGiaDinhImportModel testModel : results) {
//						_log.info("stt: "+testModel.getStt()+" tinh: "+testModel.getMaTinh()
//								+" huyen: "+testModel.getMaHuyen()
//								+" xa: "+testModel.getMaXa()
//								+" thonxom: "+testModel.getThonXom()
//								+" getTenChuHo: "+testModel.getTenChuHo()
//								+" getHoNgheo: "+testModel.getHoNgheo()
//								+" getKhongCoNhaTieu: "+testModel.getKhongCoNhaTieu()
//								+" getCoNhaTieuKhongHVS: "+testModel.getCoNhaTieuKhongHVS()
//								+" getLoaiNhaTieu: "+testModel.getLoaiNhaTieu()
//								+" getNguonVon: "+testModel.getNguonVon()
//								+" getDateToGetStr: "+testModel.getDateToGetStr()
//								+" getDateToGet: "+testModel.getDateToGet()
//								+" getGhiChu: "+testModel.getGhiChu());
//					}
					for (int i=0; i<6;i++) {
						if( Validator.isNumber(results.get(i).getStt())
								&&results.get(i).getMaHuyen().length()>4
								&&Validator.isNotNull(results.get(i).getStt())){
							DATAITEM dataItem = new DATAITEMImpl();
							DATAITEM dataItem2 = new DATAITEMImpl();
							results.get(i).setMaTinh(maTinh);
//							dataItem = DataItemBusiness.getDATAITEMByTen(results.get(i).getMaHuyen(),maTinh);
							dataItem = DataItemBusiness.getDATAITEMByTen(results.get(i).getMaHuyen(),maTinh,2);
							if(Validator.isNull(dataItem)){
								erroType = 2;
								importName = results.get(i).getMaHuyen();
								messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
								break;
							}
//							if(dataItem.getLevel()==2)results.get(i).setMaHuyen(dataItem.getNode2());
//							dataItem2 = DataItemBusiness.getDATAITEMByTen(results.get(i).getMaXa(),dataItem.getNode2());
							dataItem2 = DataItemBusiness.getDATAITEMByTen(results.get(i).getMaXa(),dataItem.getNode2(),3);
//							if(dataItem.getLevel()==3)results.get(i).setMaXa(dataItem.getNode3());
							_log.info("vo thread getMaTinh"+ maTinh+"");
							_log.info("vo thread getMaHuyen"+ dataItem.getNode2()+"");
							_log.info("vo thread getMaXa"+ dataItem2.getNode3()+"");
							_log.info("vo thread getThonXom"+ results.get(i).getThonXom()+"");
							_log.info("vo thread getTenChuHo"+ results.get(i).getTenChuHo()+"");
							if(VeSinhGiaDinhLocalServiceUtil.findByT_CHK_Import(maTinh, 
									dataItem.getNode2(), 
									dataItem2.getNode3(), 
									results.get(i).getThonXom(), 
									results.get(i).getTenChuHo(), 
									Integer.valueOf(userId+"")).size()>0){
								isChk++;
							}
						}
						
					}
				}
				
				_log.info("vo thread action"+isChk);
				//call thread function.
				if(isChk>2){
					erroType = 6;
					messageKey = MessageErrors.IMPORT_HO_GIA_DINH_MESSAGE;
				}else{
					messageKey = MessageSuccess.IMPORT_HO_GIA_DINH_MESSAGE;
					_log.info("vo thread action");
					ServiceContext context;
					context = ServiceContextFactory.getInstance(actionRequest);
					
					Message message = new Message();
					message.put("listImport", results);
					message.put("context", context);
					message.put("userId", userId);
					message.put("typeImport", typeImport);
					MessageBusUtil.sendMessage("destination/sol/ns/daunoinuoc/HoGiaDinhImportThread", message);
				}
				
			}
			//test
			
			actionRequest.getPortletSession().setAttribute("importName", importName);
//			actionResponse.sendRedirect(cuString);
			if(erroType>0){
				isSuccess = false;
			}else{
				isSuccess = true;
			}
			// Hide default Success Message
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);

			// Hide default Error Message
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			if(isSuccess){
				String successURL = ParamUtil.getString(actionRequest, "onpageSuccess");
				successURL+="&"+actionResponse.getNamespace()+DauNoiNuocTerms.NAM_BAO_CAO+"="+ParamUtil.getInteger(actionRequest, DauNoiNuocTerms.NAM_BAO_CAO);
				successURL+="&"+actionResponse.getNamespace()+"importError="+erroType;
				SessionMessages.add(actionRequest, messageKey);
				if (Validator.isNotNull(successURL)) {
					actionResponse.sendRedirect(successURL);
				}
			}else{
				String errorURL = ParamUtil.getString(actionRequest, "onpageError");
				errorURL+="&"+actionResponse.getNamespace()+DauNoiNuocTerms.NAM_BAO_CAO+"="+ParamUtil.getInteger(actionRequest, DauNoiNuocTerms.NAM_BAO_CAO);
				errorURL+="&"+actionResponse.getNamespace()+"importError="+erroType;
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
	
	//redirect 
		private void sendCustomRedirect(long id,boolean isSuccess,String messageKey,ActionRequest actionRequest, ActionResponse actionResponse) throws IOException{
			if(isSuccess){
//				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
				String successURL = ParamUtil.getString(actionRequest, "onpageSuccess");
				successURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.MA_TINH+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.MA_TINH);
				successURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.MA_HUYEN+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.MA_HUYEN);
				successURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.MA_XA+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.MA_XA);
				successURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.LOAI_NHA_TIEU+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.LOAI_NHA_TIEU);
				successURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.TRANG_THAI+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.TRANG_THAI);
				successURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.NAM_BAO_CAO+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.NAM_BAO_CAO);
				if(id>0){
					successURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.ID+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.ID);
				}
				SessionMessages.add(actionRequest, messageKey);
				if (Validator.isNotNull(successURL)) {
					actionResponse.sendRedirect(successURL);
				}
			}else{
//				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);	
				String errorURL = ParamUtil.getString(actionRequest, "onpageError");
				errorURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.MA_TINH+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.MA_TINH);
				errorURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.MA_HUYEN+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.MA_HUYEN);
				errorURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.MA_XA+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.MA_XA);
				errorURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.LOAI_NHA_TIEU+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.LOAI_NHA_TIEU);
				errorURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.TRANG_THAI+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.TRANG_THAI);
				errorURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.NAM_BAO_CAO+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.NAM_BAO_CAO);
				if(id>0){
					errorURL+="&"+actionResponse.getNamespace()+VeSinhGiaDinhTerms.ID+"="+ParamUtil.getString(actionRequest, VeSinhGiaDinhTerms.ID);
				}
				SessionErrors.add(actionRequest, messageKey);
				if (Validator.isNotNull(errorURL)) {
					actionResponse.sendRedirect(errorURL);
				}
			}
		}
		private static SimpleDateFormat sdfM = new SimpleDateFormat("MM/yyyy");
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdf2Var = new SimpleDateFormat("MM/yyyy");
	private static Log _log = LogFactoryUtil.getLog(HoGiaDinhAction.class);
}
