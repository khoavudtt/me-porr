package vn.dtt.sol.ns.portlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil;
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.cmon.user.dao.model.impl.UserMappingImpl;
import vn.dtt.sol.ns.business.DataItemBusiness;
import vn.dtt.sol.ns.business.UserMappingBusiness;
import vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString;
import vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM;
import vn.dtt.sol.ns.maungaunhien.dao.service.MAUKIEMDEMLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.business.TramCapBusiness;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.util.MessageErrors;
import vn.dtt.sol.ns.util.MessageSuccess;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.WebKeys;
import vn.dtt.sol.ns.vesinhmoitruong.business.DanhGiaVeSinhXaBussiness;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.terms.DanhGiaVeSinhXaTerm;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class DanhGiaVeSinhPortlet extends MVCPortlet{

	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		User user = null;
		UserMapping loginUserMapping = new UserMappingImpl();
		String maTinh = ParamUtil.getString(renderRequest, DanhGiaVeSinhXaTerm.MA_TINH);
		String maHuyen = ParamUtil.getString(renderRequest, DanhGiaVeSinhXaTerm.MA_HUYEN);
		String maXa = ParamUtil.getString(renderRequest, DanhGiaVeSinhXaTerm.MA_XA);
		String namBaoCao = ParamUtil.getString(renderRequest, DanhGiaVeSinhXaTerm.NAM);
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = null;
		List<DATAITEM> listTinh = new ArrayList<DATAITEM>();
		List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
		List<DATAITEM> listXa = new ArrayList<DATAITEM>();
		int year = Calendar.getInstance().get(Calendar.YEAR);
		try {
			 user = PortalUtil.getUser(renderRequest);
			 loginUserMapping = UserMappingBusiness.getUserMapping(user);
			 int dauNoiId = ParamUtil.getInteger(renderRequest, DanhGiaVeSinhXaTerm.ID);
			 if(dauNoiId>0){
				danhGiaVeSinhXaNew = DanhGiaVeSinhXaBussiness.fetchDanhGiaVeSinhXaById(dauNoiId);
				maTinh = danhGiaVeSinhXaNew.getMaTinh();
				maHuyen = danhGiaVeSinhXaNew.getMaHuyen();
				renderRequest.setAttribute("danhGiaVeSinhXaNew", danhGiaVeSinhXaNew);
			}
			if(loginUserMapping.getUserType()==DauNoiNuocConstantString.UserMapping.CAP_TU){
				listTinh = DATAITEMLocalServiceUtil.getByDataGroupLevel1(WebKeys.DATAGROUPID_DONVIHANHCHINH);
				if(Validator.isNotNull(maTinh)){
					listHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh);
				}
				if(Validator.isNotNull(maHuyen)){
					listXa = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh, maHuyen);
				}
			}else if(loginUserMapping.getUserType()==DauNoiNuocConstantString.UserMapping.CAP_TINH){
				maTinh = loginUserMapping.getOrgCode1();
				listTinh.add(NuocSachUtils.getDATAITEMTinh(loginUserMapping.getOrgCode1()));
				if(Validator.isNotNull(loginUserMapping.getOrgCode1())){
					listHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, loginUserMapping.getOrgCode1());
				}
				if(Validator.isNotNull(maHuyen)){
					listXa = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, loginUserMapping.getOrgCode1(), maHuyen);
				}
			}else if(loginUserMapping.getUserType()==DauNoiNuocConstantString.UserMapping.CAP_HUYEN){
				maTinh = loginUserMapping.getOrgCode1();
				maHuyen = loginUserMapping.getOrgCode2();
				listTinh.add(NuocSachUtils.getDATAITEMTinh(loginUserMapping.getOrgCode1()));
				listHuyen.add(NuocSachUtils.getDATAITEMHuyen(loginUserMapping.getOrgCode1(), loginUserMapping.getOrgCode2()));
				listXa = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, loginUserMapping.getOrgCode1(), loginUserMapping.getOrgCode2());
			}else if(loginUserMapping.getUserType()==DauNoiNuocConstantString.UserMapping.CAP_TRAM){
				TramCapNuoc tramCapUser = null;
				tramCapUser = TramCapBusiness.getTramCap(Long.valueOf(loginUserMapping.getOrgCode2()));
				listTinh.add(NuocSachUtils.getDATAITEMTinh(tramCapUser.getMaTinh()));
				if(Validator.isNotNull(tramCapUser.getMaHuyen())){
					listHuyen.add(NuocSachUtils.getDATAITEMHuyen(tramCapUser.getMaTinh(), tramCapUser.getMaHuyen()));
				}else{
					listHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, tramCapUser.getMaTinh());
				}
				listXa = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, tramCapUser.getMaTinh(), tramCapUser.getMaHuyen());
			}
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		renderRequest.setAttribute(DanhGiaVeSinhXaTerm.MA_TINH, maTinh);
		renderRequest.setAttribute(DanhGiaVeSinhXaTerm.MA_HUYEN, maHuyen);
		renderRequest.setAttribute(DanhGiaVeSinhXaTerm.MA_XA, maXa);
		renderRequest.setAttribute(DanhGiaVeSinhXaTerm.NAM, namBaoCao);
		renderRequest.setAttribute("listTinh", listTinh);
		renderRequest.setAttribute("listHuyen", listHuyen);
		renderRequest.setAttribute("listXa", listXa);
		renderRequest.setAttribute("loginUserMapping", loginUserMapping);
		super.doView(renderRequest, renderResponse);
	}
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws PortletException, IOException {
		// TODO Auto-generated method stub
		User user = null;
		UserMapping loginUserMapping = new UserMappingImpl();
		String maTinh = ParamUtil.getString(renderRequest, DanhGiaVeSinhXaTerm.MA_TINH);
		String maHuyen = ParamUtil.getString(renderRequest, DanhGiaVeSinhXaTerm.MA_HUYEN);
		String maXa = ParamUtil.getString(renderRequest, DanhGiaVeSinhXaTerm.MA_XA);
		String namBaoCao = ParamUtil.getString(renderRequest, DanhGiaVeSinhXaTerm.NAM);
		
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = null;
		List<DATAITEM> listTinh = new ArrayList<DATAITEM>();
		List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
		List<DATAITEM> listXa = new ArrayList<DATAITEM>();
		int tongSoHGDTrongMau =0;
		try {
			 user = PortalUtil.getUser(renderRequest);
			 loginUserMapping = UserMappingBusiness.getUserMapping(user);
			 int dauNoiId = ParamUtil.getInteger(renderRequest, DanhGiaVeSinhXaTerm.ID);
			 if(dauNoiId>0){
				danhGiaVeSinhXaNew = DanhGiaVeSinhXaBussiness.fetchDanhGiaVeSinhXaById(dauNoiId);
				_log.info("tinh: "+danhGiaVeSinhXaNew.getMaTinh() +"huyen: "+danhGiaVeSinhXaNew.getMaHuyen() + "xa: "+danhGiaVeSinhXaNew.getMaXa() + "nam: "+danhGiaVeSinhXaNew.getNam());
				MAUKIEMDEM mkd = MAUKIEMDEMLocalServiceUtil.getMauKiemDemByTHXN(danhGiaVeSinhXaNew.getMaTinh(), danhGiaVeSinhXaNew.getMaXa(), danhGiaVeSinhXaNew.getMaHuyen(), danhGiaVeSinhXaNew.getNam());
				_log.info("Validator.isNotNull(mkd)"+Validator.isNotNull(mkd));
				if(Validator.isNotNull(mkd)){
					tongSoHGDTrongMau = mkd.getSoMauNgauNhien();
					danhGiaVeSinhXaNew.setTongSoHGD(mkd.getTongSoHGD());
				}
				maTinh = danhGiaVeSinhXaNew.getMaTinh();
				maHuyen = danhGiaVeSinhXaNew.getMaHuyen();
				namBaoCao = danhGiaVeSinhXaNew.getNam()+"";
				renderRequest.setAttribute("tongSoHGDTrongMau", tongSoHGDTrongMau);
				renderRequest.setAttribute("danhGiaVeSinhXaNew", danhGiaVeSinhXaNew);
			}
			if(loginUserMapping.getUserType()==DauNoiNuocConstantString.UserMapping.CAP_TU){
				listTinh = DATAITEMLocalServiceUtil.getByDataGroupLevel1(WebKeys.DATAGROUPID_DONVIHANHCHINH);
				if(Validator.isNotNull(maTinh)){
					listHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh);
				}
				if(Validator.isNotNull(maHuyen)){
					listXa = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, maTinh, maHuyen);
				}
			}else if(loginUserMapping.getUserType()==DauNoiNuocConstantString.UserMapping.CAP_TINH){
				maTinh = loginUserMapping.getOrgCode1();
				listTinh.add(NuocSachUtils.getDATAITEMTinh(loginUserMapping.getOrgCode1()));
				if(Validator.isNotNull(loginUserMapping.getOrgCode1())){
					listHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, loginUserMapping.getOrgCode1());
				}
				if(Validator.isNotNull(maHuyen)){
					listXa = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, loginUserMapping.getOrgCode1(), maHuyen);
				}
			}else if(loginUserMapping.getUserType()==DauNoiNuocConstantString.UserMapping.CAP_HUYEN){
				maTinh = loginUserMapping.getOrgCode1();
				maHuyen = loginUserMapping.getOrgCode2();
				listTinh.add(NuocSachUtils.getDATAITEMTinh(loginUserMapping.getOrgCode1()));
				listHuyen.add(NuocSachUtils.getDATAITEMHuyen(loginUserMapping.getOrgCode1(), loginUserMapping.getOrgCode2()));
				listXa = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, loginUserMapping.getOrgCode1(), loginUserMapping.getOrgCode2());
			}else if(loginUserMapping.getUserType()==DauNoiNuocConstantString.UserMapping.CAP_TRAM){
				TramCapNuoc tramCapUser = null;
				tramCapUser = TramCapBusiness.getTramCap(Long.valueOf(loginUserMapping.getOrgCode2()));
				listTinh.add(NuocSachUtils.getDATAITEMTinh(tramCapUser.getMaTinh()));
				if(Validator.isNotNull(tramCapUser.getMaHuyen())){
					listHuyen.add(NuocSachUtils.getDATAITEMHuyen(tramCapUser.getMaTinh(), tramCapUser.getMaHuyen()));
				}else{
					listHuyen = DataItemBusiness.getInLevel2(WebKeys.DATAGROUPID_DONVIHANHCHINH, tramCapUser.getMaTinh());
				}
				listXa = DataItemBusiness.getInLevel3(WebKeys.DATAGROUPID_DONVIHANHCHINH, tramCapUser.getMaTinh(), tramCapUser.getMaHuyen());
			}
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		renderRequest.setAttribute(DanhGiaVeSinhXaTerm.MA_TINH, maTinh);
		renderRequest.setAttribute(DanhGiaVeSinhXaTerm.MA_HUYEN, maHuyen);
		renderRequest.setAttribute(DanhGiaVeSinhXaTerm.MA_XA, maXa);
		renderRequest.setAttribute(DanhGiaVeSinhXaTerm.NAM, namBaoCao);
		renderRequest.setAttribute("listTinh", listTinh);
		renderRequest.setAttribute("listHuyen", listHuyen);
		renderRequest.setAttribute("listXa", listXa);
		renderRequest.setAttribute("loginUserMapping", loginUserMapping);
		super.render(renderRequest, renderResponse);
	}
	
	public void editDanhGiaVesinhDetail(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.EDIT_DANH_GIA_VE_SINH_MESSAGE;
		long idReturn = 0;
		DanhGiaVeSinhXaTerm ettTerms = new DanhGiaVeSinhXaTerm(actionRequest);
		DanhGiaVeSinhXaNew ett = null;
		try {
			ett = DanhGiaVeSinhXaNewLocalServiceUtil.fetchDanhGiaVeSinhXaNew(ettTerms.getId());
//			ett.setSoNhaTieuHVSXayMoi(ettTerms.getSoNhaTieuHVSXayMoi());
			ett.setSoHGDCoNhaTieu(ettTerms.getSoHGDCoNhaTieu());
			ett = DanhGiaVeSinhXaNewLocalServiceUtil.updateDanhGiaVeSinhXaNew(ett);
			//update content giadinh+congtrinh
			updateVeSinhHGDFromDanhGiaVSTX(ett.getMaXa(), ett.getNam());
			updateVeSinhCTFromDanhGiaVSTX(ett.getMaXa(), ett.getNam());
			_log.info("nam"+ett.getNam());
			messageKey = MessageSuccess.EDIT_DANH_GIA_VE_SINH_MESSAGE;
//			idReturn = ett.getId();
			isSuccess = true;
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			messageKey = MessageErrors.EDIT_DANH_GIA_VE_SINH_MESSAGE;
		}
		sendCustomRedirect(idReturn,isSuccess,messageKey,actionRequest, actionResponse);
	}
	private void updateVeSinhHGDFromDanhGiaVSTX(String maXa,int nam) throws SystemException{
		List<VeSinhGiaDinh> listToUpdate = null;
		listToUpdate = VeSinhGiaDinhLocalServiceUtil.getVeSinhGiaDinhSearch("", "", maXa, "", "2", "0","", QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		for (VeSinhGiaDinh veSinhGiaDinh : listToUpdate) {
			veSinhGiaDinh.setNgayDanhGia(new Date());
			veSinhGiaDinh.setNamBaoCao(nam);
			VeSinhGiaDinhLocalServiceUtil.updateVeSinhGiaDinh(veSinhGiaDinh);
		}
		listToUpdate = VeSinhGiaDinhLocalServiceUtil.getVeSinhGiaDinhSearch("", "", maXa, "", "3", "0","", QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		for (VeSinhGiaDinh veSinhGiaDinh : listToUpdate) {
			veSinhGiaDinh.setNgayDanhGia(new Date());
			veSinhGiaDinh.setNamBaoCao(nam);
			VeSinhGiaDinhLocalServiceUtil.updateVeSinhGiaDinh(veSinhGiaDinh);
		}
	}
	private void updateVeSinhCTFromDanhGiaVSTX(String maXa, int nam) throws SystemException{
		List<VeSinhCongTrinh> listToUpdate = null;
		listToUpdate = VeSinhCongTrinhLocalServiceUtil.getVeSinhCongTrinhSearch("", "", maXa, "", "1", "2", "0", QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		for (VeSinhCongTrinh veSinhCongTrinh : listToUpdate) {
			veSinhCongTrinh.setNgayDanhGia(new Date());
			veSinhCongTrinh.setNamBaoCao(nam);
			VeSinhCongTrinhLocalServiceUtil.updateVeSinhCongTrinh(veSinhCongTrinh);
		}
		listToUpdate = VeSinhCongTrinhLocalServiceUtil.getVeSinhCongTrinhSearch("", "", maXa, "", "2", "2", "0", QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		for (VeSinhCongTrinh veSinhCongTrinh : listToUpdate) {
			veSinhCongTrinh.setNgayDanhGia(new Date());
			veSinhCongTrinh.setNamBaoCao(nam);
			VeSinhCongTrinhLocalServiceUtil.updateVeSinhCongTrinh(veSinhCongTrinh);
		}
	}
	public void editDanhGiaVesinh(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.EDIT_DANH_GIA_VE_SINH_MESSAGE;
		long idReturn = 0;
		DanhGiaVeSinhXaTerm ettTerms = new DanhGiaVeSinhXaTerm(actionRequest);
		DanhGiaVeSinhXaNew ett = null;
		try {
			ett = DanhGiaVeSinhXaNewLocalServiceUtil.fetchDanhGiaVeSinhXaNew(ettTerms.getId());
			ett.setTongSoHGD(ettTerms.getTongSoHGD());
			ett.setSoHGDCoNhaTieu(ettTerms.getSoHGDCoNhaTieu());
			ett.setSoHGDCoNhaTieuHVS(ettTerms.getSoHGDCoNhaTieuHVS());
			ett.setTongSoTruongHoc(ettTerms.getTongSoTruongHoc());
			ett.setSoTruongHocHVS(ettTerms.getSoTruongHocHVS());
			ett.setTongSoTramYTe(ettTerms.getTongSoTramYTe());
			ett.setSoTramYTeHVS(ettTerms.getSoTramYTeHVS());
			ett.setGhiChu(ettTerms.getGhiChu());
			ett.setTiLeHGDCoNhaTieu(ettTerms.getTiLeHGDCoNhaTieu());
			ett.setTiLeHGDCoNhaTieuHVS(ettTerms.getTiLeHGDCoNhaTieuHVS());
			ett.setTiLeTruongHocHVS(ettTerms.getTiLeTruongHocHVS());
			ett.setTiLeTramYTeHVS(ettTerms.getTiLeTramYTeHVS());
			ett.setKetLuanVSTX(ettTerms.getKetLuanVSTX());
			ett = DanhGiaVeSinhXaNewLocalServiceUtil.updateDanhGiaVeSinhXaNew(ett);
			//update content giadinh+congtrinh
			updateVeSinhHGDFromDanhGiaVSTX(ett.getMaXa(), ett.getNam());
			updateVeSinhCTFromDanhGiaVSTX(ett.getMaXa(), ett.getNam());
			messageKey = MessageSuccess.EDIT_DANH_GIA_VE_SINH_MESSAGE;
//			idReturn = ett.getId();
			isSuccess = true;
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			messageKey = MessageErrors.EDIT_DANH_GIA_VE_SINH_MESSAGE;
		}
		sendCustomRedirect(idReturn,isSuccess,messageKey,actionRequest, actionResponse);
	}
	public void deleteDanhGiaVeSinh(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		boolean isSuccess = false;
		String messageKey = MessageErrors.XOA_DANH_GIA_VE_SINH_MESSAGE;
		long idReturn = 0;
		DanhGiaVeSinhXaTerm ettTerms = new DanhGiaVeSinhXaTerm(actionRequest);
		DanhGiaVeSinhXaNew ett = null;
		try {
			List<DanhGiaVeSinhXaNew> listToDel = null;
			listToDel = DanhGiaVeSinhXaNewLocalServiceUtil.getListInsertVeSinhXa(ettTerms.getMaTinh(), ettTerms.getMaHuyen(), ettTerms.getNam());
			_log.info(ettTerms.getMaTinh()+"/"+ettTerms.getMaHuyen()+"/"+ettTerms.getNam()+"/"+listToDel.size());
			for (DanhGiaVeSinhXaNew danhGiaVeSinhXaNew : listToDel) {
				DanhGiaVeSinhXaNewLocalServiceUtil.deleteDanhGiaVeSinhXaNew(danhGiaVeSinhXaNew);
			}
			messageKey = MessageSuccess.XOA_DANH_GIA_VE_SINH_MESSAGE;
//			idReturn = ett.getId();
			isSuccess = true;
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			messageKey = MessageErrors.XOA_DANH_GIA_VE_SINH_MESSAGE;
		}
		sendCustomRedirect(idReturn,isSuccess,messageKey,actionRequest, actionResponse);
	}
	
	//redirect 
		private void sendCustomRedirect(long id,boolean isSuccess,String messageKey,ActionRequest actionRequest, ActionResponse actionResponse) throws IOException{
			if(isSuccess){
//				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
				String successURL = ParamUtil.getString(actionRequest, "onpageSuccess");
				successURL+="&"+actionResponse.getNamespace()+DanhGiaVeSinhXaTerm.MA_TINH+"="+ParamUtil.getString(actionRequest, DanhGiaVeSinhXaTerm.MA_TINH);
				successURL+="&"+actionResponse.getNamespace()+DanhGiaVeSinhXaTerm.MA_HUYEN+"="+ParamUtil.getString(actionRequest, DanhGiaVeSinhXaTerm.MA_HUYEN);
				successURL+="&"+actionResponse.getNamespace()+DanhGiaVeSinhXaTerm.MA_XA+"="+ParamUtil.getString(actionRequest, DanhGiaVeSinhXaTerm.MA_XA);
				successURL+="&"+actionResponse.getNamespace()+DanhGiaVeSinhXaTerm.NAM+"="+ParamUtil.getString(actionRequest, DanhGiaVeSinhXaTerm.NAM);
				if(id>0){
					successURL+="&"+actionResponse.getNamespace()+DanhGiaVeSinhXaTerm.ID+"="+id;
				}
				SessionMessages.add(actionRequest, messageKey);
				if (Validator.isNotNull(successURL)) {
					actionResponse.sendRedirect(successURL);
				}
			}else{
//				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);	
				String errorURL = ParamUtil.getString(actionRequest, "onpageError");
				errorURL+="&"+actionResponse.getNamespace()+DanhGiaVeSinhXaTerm.MA_TINH+"="+ParamUtil.getString(actionRequest, DanhGiaVeSinhXaTerm.MA_TINH);
				errorURL+="&"+actionResponse.getNamespace()+DanhGiaVeSinhXaTerm.MA_HUYEN+"="+ParamUtil.getString(actionRequest, DanhGiaVeSinhXaTerm.MA_HUYEN);
				errorURL+="&"+actionResponse.getNamespace()+DanhGiaVeSinhXaTerm.MA_XA+"="+ParamUtil.getString(actionRequest, DanhGiaVeSinhXaTerm.MA_XA);
				errorURL+="&"+actionResponse.getNamespace()+DanhGiaVeSinhXaTerm.NAM+"="+ParamUtil.getString(actionRequest, DanhGiaVeSinhXaTerm.NAM);
					SessionErrors.add(actionRequest, messageKey);
				if (Validator.isNotNull(errorURL)) {
					actionResponse.sendRedirect(errorURL);
				}
			}
		}
		private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		private static Log _log = LogFactoryUtil.getLog(DanhGiaVeSinhPortlet.class);
}
