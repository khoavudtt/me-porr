package vn.dtt.sol.ns.business;

import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam;
import vn.dtt.sol.ns.kehoachdaunam.dao.service.KeHoachDauNamLocalServiceUtil;
public class KeHoachNuocSachBusiness {
	
	public static List<KeHoachDauNam> searchByNamAndTinh(long namKeHoach, String maTinh, int start, int end){
		List<KeHoachDauNam> keHoachDauNam = null;
		
		try {
			keHoachDauNam = KeHoachDauNamLocalServiceUtil.searchByNamAndTinh(namKeHoach, maTinh, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return keHoachDauNam;
	}
	
	public static int countByNamAndTinh(long namKeHoach, String maTinh){
		int count = 0;
		
		try {
			count = KeHoachDauNamLocalServiceUtil.countByNamAndTinh(namKeHoach, maTinh);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return count;
	}
	
	public static List<KeHoachDauNam> searchByNamAndTram(long namKeHoach, String maTram, int start, int end){
		List<KeHoachDauNam> keHoachDauNam = null;
		
		try {
			keHoachDauNam = KeHoachDauNamLocalServiceUtil.searchByNamAndTram(namKeHoach, maTram, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return keHoachDauNam;
	}
	
	public static int countByNamAndTram(long namKeHoach, String maTram){
		int count = 0;
		
		try {
			count = KeHoachDauNamLocalServiceUtil.countByNamAndTram(namKeHoach, maTram);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return count;
	}
	
	public static int countSoNguoiHuongLoiCapNcBenVung(String nam, String maTinh) {
		int count = 0;
		
		try {
			count = KeHoachDauNamLocalServiceUtil.countSoNguoiHuongLoiCapNcBenVung(nam, maTinh);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return count;
	}
	
	public static List<KeHoachDauNam> searchByNamAndMaTinh(String nam, String maTinh) {
		List<KeHoachDauNam> lstKeHoachDauNam = null;
		try {
			lstKeHoachDauNam = KeHoachDauNamLocalServiceUtil.searchByNamAndMaTinh(nam, maTinh);
		} catch (Exception e) {
			_log.error(e);
		}
		return lstKeHoachDauNam;
	}
	
	public static int sumSoDauNoiMoiTW(String namBaoCao, String maTinh) {
		int count = 0;
		
		try {
			count = KeHoachDauNamLocalServiceUtil.sumSoDauNoiMoiTW(namBaoCao, maTinh);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return count;
	}
	
	private static Log _log = LogFactoryUtil.getLog(KeHoachNuocSachBusiness.class);

}
