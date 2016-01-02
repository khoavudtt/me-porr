package vn.dtt.sol.ns.business;

import java.util.List;

import vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh;
import vn.dtt.sol.ns.kehoachvesinh.dao.service.KeHoachVeSinhLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class KeHoachVeSinhBusiness {
	
	public static List<KeHoachVeSinh> search(long nam, String maTinh, String maHuyen, int start, int end){
		List<KeHoachVeSinh> keHoach = null;
		
		try {
			keHoach = KeHoachVeSinhLocalServiceUtil.search(nam, maTinh, maHuyen, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return keHoach;
	}
	
	public static int count(long nam, String maTinh, String maHuyen){
		int count = 0;
		
		try {
			count = KeHoachVeSinhLocalServiceUtil.count(nam, maTinh, maHuyen);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return count;
	}
	
	public static int countSoDanHuongLoi(String nam, String maTinh, String dangkyvstx){
		int count = 0;
		
		try{
			count = KeHoachVeSinhLocalServiceUtil.countSoDanHuongLoi(nam,maTinh,dangkyvstx);
		}catch(Exception e){
			_log.error(e);
		}
		
		return count;
	}
	
	public static List<KeHoachVeSinh> getKeHoachVeSinhByNamTinhDangKyVSTX(String nam, String maTinh, String dangkyvstx){
		List<KeHoachVeSinh> keHoach = null;
		
		try {
			keHoach = KeHoachVeSinhLocalServiceUtil.getKeHoachVeSinhByNamTinhDangKyVSTX(nam,maTinh,dangkyvstx);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return keHoach;
	}
	
	public static int sumSoNhaTieuHVSMoiTW( String namBaoCao, String maTinh){
		int count = 0;
		
		try{
			count = KeHoachVeSinhLocalServiceUtil.sumSoNhaTieuHVSMoiTW(namBaoCao,maTinh);
		}catch(Exception e){
			_log.error(e);
		}
		
		return count;
	}
	private static Log _log = LogFactoryUtil.getLog(KeHoachVeSinhBusiness.class);
}
