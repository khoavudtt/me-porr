package vn.dtt.sol.ns.danhgiavesinh.business;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.danhgiavesinh.dao.model.DANHGIAVESINHXA;
import vn.dtt.sol.ns.danhgiavesinh.dao.service.DANHGIAVESINHXALocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class DANHGIAVESINHXABusiness {
	private static Log _log = LogFactoryUtil.getLog(DANHGIAVESINHXABusiness.class);
	
	/**
	 * @author tailt
	 * @param maTinh
	 * @param maHuyen
	 * @param maXa
	 * @param namBaoCao
	 * @return
	 */
	public static List<DANHGIAVESINHXA> getDanhGiaVeSinhXaBaoCao(String maTinh,String maHuyen,String maXa,String namBaoCao){
		List<DANHGIAVESINHXA> ls = new ArrayList<DANHGIAVESINHXA>();
		
		try{
			ls = DANHGIAVESINHXALocalServiceUtil.getDanhGiaVeSinhXaBaoCao(maTinh, maHuyen, maXa,  namBaoCao);
		}catch(Exception e){
			_log.error(e);
		}
		
		return ls;
	}
	public static int sumSoNguoiHuongLoiByMaTinh(String maTinh, String namBaoCao){
		int count = 0;
		try{
			count = DANHGIAVESINHXALocalServiceUtil.sumSoNguoiHuongLoiByMaTinh(maTinh,namBaoCao);
		}catch(Exception e){
			_log.error(e);
		}
		return count;
	}
}
