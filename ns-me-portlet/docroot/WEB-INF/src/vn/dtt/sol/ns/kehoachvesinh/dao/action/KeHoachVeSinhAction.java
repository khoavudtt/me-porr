package vn.dtt.sol.ns.kehoachvesinh.dao.action;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh;
import vn.dtt.sol.ns.kehoachvesinh.dao.model.impl.KeHoachVeSinhImpl;
import vn.dtt.sol.ns.kehoachvesinh.dao.service.KeHoachVeSinhLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

public class KeHoachVeSinhAction {
	
	public void addKeHoachVeSinh(ActionRequest actionRequest, ActionResponse actionResponse){
		
		long nam = ParamUtil.getLong(actionRequest, "nam");
		String maTinh = ParamUtil.getString(actionRequest, "maTinh");
		String maHuyen = ParamUtil.getString(actionRequest, "maHuyen");
		String maXa = ParamUtil.getString(actionRequest, "maXa");
		long soNhaTieuHVSMoi = ParamUtil.getLong(actionRequest, "soNhaTieuHVSMoi");
		long soDan = ParamUtil.getLong(actionRequest, "soDan");
		String ghiChu = ParamUtil.getString(actionRequest, "ghiChu");
		Date ngayTao = new Date();
		long baoCaoDLI = 0;
		long idNguoiTao = ParamUtil.getLong(actionRequest, "userId");
		boolean VSTX = ParamUtil.getBoolean(actionRequest, "VSTX");
		KeHoachVeSinh keHoach = new KeHoachVeSinhImpl();
		int dangKyVSTX;
		
		if(VSTX == true){
			dangKyVSTX = 1;
		} else {
			dangKyVSTX = 2;
		}
		
		if(Validator.isNotNull(nam) &&Validator.isNotNull(maTinh) &&Validator.isNotNull(maHuyen) &&Validator.isNotNull(maXa)){
			
			keHoach.setNam(nam);
			keHoach.setMaTinh(maTinh);
			keHoach.setMaHuyen(maHuyen);
			keHoach.setMaXa(maXa);
						
			keHoach.setDangKyVSTX(dangKyVSTX);
			if(dangKyVSTX==1){
				keHoach.setSoDan(soDan);
				keHoach.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
			} else if(dangKyVSTX==2){
				keHoach.setSoDan(0);
				keHoach.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
			}
			keHoach.setGhiChu(ghiChu);
			keHoach.setNgayTao(ngayTao);
			keHoach.setBaoCaoDLI(baoCaoDLI);
			keHoach.setIdNguoiTao(idNguoiTao);
			
			try {
				KeHoachVeSinhLocalServiceUtil.addKeHoachVeSinh(keHoach);
				SessionMessages.add(actionRequest, "them-ke-hoach-thanh-cong");
			} catch (Exception e) {
				_log.error(e);
				SessionErrors.add(actionRequest, "them-ke-hoach-that-bai");
			}
		} else {
			
			SessionErrors.add(actionRequest, "them-ke-hoach-that-bai");
		}
	}

	public void updateKeHoachVeSinh(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws PortalException, SystemException{
		
		long id = ParamUtil.getLong(actionRequest, "id");
		long nam = ParamUtil.getLong(actionRequest, "nam");
		String maTinh = ParamUtil.getString(actionRequest, "maTinh");
		String maHuyen = ParamUtil.getString(actionRequest, "maHuyen");
		String maXa = ParamUtil.getString(actionRequest, "maXa");
		long soNhaTieuHVSMoi = ParamUtil.getLong(actionRequest, "soNhaTieuHVSMoi");
		long soDan = ParamUtil.getLong(actionRequest, "soDan");
		String ghiChu = ParamUtil.getString(actionRequest, "ghiChu");
		boolean VSTX = ParamUtil.getBoolean(actionRequest, "VSTX");
		
		int dangKyVSTX;
				
		if(VSTX == true){
			dangKyVSTX = 1;
		} else {
			dangKyVSTX = 2;
		}
		
		KeHoachVeSinh keHoach = KeHoachVeSinhLocalServiceUtil.getKeHoachVeSinh(id);
		
		keHoach.setMaTinh(maTinh);
		keHoach.setMaHuyen(maHuyen);
		keHoach.setMaXa(maXa);
		keHoach.setDangKyVSTX(dangKyVSTX);
		if(dangKyVSTX==1){
			keHoach.setSoDan(soDan);
			keHoach.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		} else if(dangKyVSTX==2){
			keHoach.setSoDan(0);
			keHoach.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		}
		keHoach.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		keHoach.setGhiChu(ghiChu);
		
		try {
			KeHoachVeSinhLocalServiceUtil.updateKeHoachVeSinh(keHoach);
			SessionMessages.add(actionRequest, "sua-ke-hoach-thanh-cong");
		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, "sua-ke-hoach-that-bai");
		}
	}
	
	public void deleteKeHoach(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws PortalException, SystemException{
		
		long id = ParamUtil.getLong(actionRequest, "id");
		
		try {
			KeHoachVeSinhLocalServiceUtil.deleteKeHoachVeSinh(id);
			SessionMessages.add(actionRequest, "xoa-ke-hoach-thanh-cong");
		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, "xoa-ke-hoach-that-bai");
		}
	}
	
	private static Log _log = LogFactoryUtil.getLog(KeHoachVeSinh.class);
}
