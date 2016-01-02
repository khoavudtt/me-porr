package vn.dtt.sol.ns.kehoachdaunam.action;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam;
import vn.dtt.sol.ns.kehoachdaunam.dao.model.impl.KeHoachDauNamImpl;
import vn.dtt.sol.ns.kehoachdaunam.dao.service.KeHoachDauNamLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * @author ha.nguyen
 *
 */

public class KeHoachDauNamAction {
	
	public void addKeHoachNuocSach(ActionRequest actionRequest, ActionResponse actionResponse){
		
		long nam = ParamUtil.getLong(actionRequest, "namSelect");
		long tramCapNuocId = ParamUtil.getLong(actionRequest, "maTram");
		long soDauNoiMoi = ParamUtil.getLong(actionRequest, "soDauNoiMoi");
		long soHoHuongLoi = ParamUtil.getLong(actionRequest, "soHoHuongLoi");
		long soNguoiHuongLoi = ParamUtil.getLong(actionRequest, "soNguoiHuongLoi");
		String ghiChu = ParamUtil.getString(actionRequest, "ghiChu");
		Date ngayTao = new Date();
		long idNguoiTao = ParamUtil.getLong(actionRequest, "userId");
		
		KeHoachDauNam keHoachDauNam = new KeHoachDauNamImpl();
		
		keHoachDauNam.setNam(nam);
		keHoachDauNam.setTramCapNuocId(tramCapNuocId);
		keHoachDauNam.setSoDauNoiMoi(soDauNoiMoi);
		keHoachDauNam.setSoHoHuongLoi(soHoHuongLoi);
		keHoachDauNam.setSoNguoiHuongLoi(soNguoiHuongLoi);
		keHoachDauNam.setGhiChu(ghiChu);
		keHoachDauNam.setNgayTao(ngayTao);
		keHoachDauNam.setIdNguoiTao(idNguoiTao);
		
		try {
			KeHoachDauNamLocalServiceUtil.addKeHoachDauNam(keHoachDauNam);
			SessionMessages.add(actionRequest, "them-ke-hoach-thanh-cong");
		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, "them-ke-hoach-that-bai");
		}
		
	}

	public void deleteKeHoach(ActionRequest actionRequest, ActionResponse actionResponse){
		
		long id = ParamUtil.getLong(actionRequest, "id");
		
		try {
			KeHoachDauNamLocalServiceUtil.deleteKeHoachDauNam(id);
			SessionMessages.add(actionRequest, "xoa-ke-hoach-thanh-cong");
		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, "xoa-ke-hoach-that-bai");
		}
	}
	
	public void updateKeHoachNuocSach(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		long id = ParamUtil.getLong(actionRequest, "id");
		
		long nam = ParamUtil.getLong(actionRequest, "namSelect");
		long tramCapNuocId = ParamUtil.getLong(actionRequest, "maTram");
		long soDauNoiMoi = ParamUtil.getLong(actionRequest, "soDauNoiMoi");
		long soHoHuongLoi = ParamUtil.getLong(actionRequest, "soHoHuongLoi");
		long soNguoiHuongLoi = ParamUtil.getLong(actionRequest, "soNguoiHuongLoi");
		String ghiChu = ParamUtil.getString(actionRequest, "ghiChu");
		long idNguoiTao = ParamUtil.getLong(actionRequest, "userId");
		
		try {
			KeHoachDauNam keHoachDauNam = KeHoachDauNamLocalServiceUtil.getKeHoachDauNam(id);
			
			keHoachDauNam.setNam(nam);
			keHoachDauNam.setTramCapNuocId(tramCapNuocId);
			keHoachDauNam.setSoDauNoiMoi(soDauNoiMoi);
			keHoachDauNam.setSoHoHuongLoi(soHoHuongLoi);
			keHoachDauNam.setSoNguoiHuongLoi(soNguoiHuongLoi);
			keHoachDauNam.setGhiChu(ghiChu);
			
			KeHoachDauNamLocalServiceUtil.updateKeHoachDauNam(keHoachDauNam);
			SessionMessages.add(actionRequest, "sua-ke-hoach-thanh-cong");
		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, "sua-ke-hoach-that-bai");
		}
		
	}
	
	private static final Log _log = LogFactoryUtil.getLog(KeHoachDauNamAction.class);

	
}
