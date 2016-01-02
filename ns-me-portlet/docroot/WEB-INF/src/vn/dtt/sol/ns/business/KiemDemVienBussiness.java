package vn.dtt.sol.ns.business;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien;
import vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienImpl;
import vn.dtt.cmon.kiemdemvien.dao.service.KiemDemVienLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;


/**
 * @author ha.nguyen
 *
 */

public class KiemDemVienBussiness {
	
	public static KiemDemVien getKiemDemVien(long kiemDemVienId) {
		KiemDemVien kiemDemVien = null;
		try {
			kiemDemVien = KiemDemVienLocalServiceUtil.fetchKiemDemVien(kiemDemVienId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return kiemDemVien;
	}
	
	public static List<KiemDemVien> findByCapHoatDongOrgCode(String capHoatDong, String orgCode){
		List<KiemDemVien> kiemDemVien = new ArrayList<KiemDemVien>();
		
		try {
			kiemDemVien = KiemDemVienLocalServiceUtil.findKiemDemVien(capHoatDong, orgCode);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return kiemDemVien;
	}
	
	public static int countAll() {
		int count = 0;
		
		try {
			count = KiemDemVienLocalServiceUtil.countAll();
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		return count;
	}
	
	public static List<KiemDemVien> findAll() {
		List<KiemDemVien> list = new ArrayList<KiemDemVien>();
		
		try {
			list = KiemDemVienLocalServiceUtil.findAll();
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		return list;
	}
	
	public static KiemDemVien findByTaiKhoan(String taiKhoan) {
		KiemDemVien kiemDemVien = null;
		
		try {
			kiemDemVien = KiemDemVienLocalServiceUtil.getByTaiKhoan(taiKhoan);
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		return kiemDemVien;
		
	}
	private static Log _log = LogFactoryUtil.getLog(KiemDemVienBussiness.class);
}