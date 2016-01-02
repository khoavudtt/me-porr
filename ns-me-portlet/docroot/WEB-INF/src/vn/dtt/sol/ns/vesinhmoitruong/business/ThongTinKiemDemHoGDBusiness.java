package vn.dtt.sol.ns.vesinhmoitruong.business;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemHoGDLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ThongTinKiemDemHoGDBusiness {
	
	private static Log _log = LogFactoryUtil.getLog(ThongTinKiemDemHoGDBusiness.class);
	
	
	
	public static List<ThongTinKiemDemHoGD> getThongTinKiemDemHGDThoiGianThucGroupBy(String maTinh, String namBaoCao, String danhgiakiemdem) {
		List<ThongTinKiemDemHoGD> lstThongTinKiemDemHoGD = new ArrayList<ThongTinKiemDemHoGD>();
		try{
			lstThongTinKiemDemHoGD = ThongTinKiemDemHoGDLocalServiceUtil.getThongTinKiemDemHGDThoiGianThucGroupBy(maTinh,namBaoCao,danhgiakiemdem);
		}catch(Exception e){
			_log.error(e);
		}
		return lstThongTinKiemDemHoGD;
	}
	
	public static int countThongTinKiemDemHGDThoiGianThucGroupBy(String maTinh, String namBaoCao, String danhgiakiemdem, String maHuyen, String maXa) {
		int count = 0;
		try{
			count = ThongTinKiemDemHoGDLocalServiceUtil.countThongTinKiemDemHGDThoiGianThucGroupBy(maTinh,namBaoCao,danhgiakiemdem,maHuyen,maXa);
		}catch(Exception e){
			_log.error(e);
		}
		return count;
	}
	
	public static List<ThongTinKiemDemHoGD> getThongTinKiemDemHGDThoiGianThuc(String maTinh, String namBaoCao, String danhgiakiemdem) {
		List<ThongTinKiemDemHoGD> lstThongTinKiemDemHoGD = new ArrayList<ThongTinKiemDemHoGD>();
		try{
			lstThongTinKiemDemHoGD = ThongTinKiemDemHoGDLocalServiceUtil.getThongTinKiemDemHGDThoiGianThuc(maTinh,namBaoCao,danhgiakiemdem);
		}catch(Exception e){
			_log.error(e);
		}
		return lstThongTinKiemDemHoGD;
	}
	
	public static List<ThongTinKiemDemHoGD> getListThongTinKiemDemHoGiaDinhByKeHoachId(int keHoachId) {
		List<ThongTinKiemDemHoGD> lstThongTinKiemDemHoGD = new ArrayList<ThongTinKiemDemHoGD>();
		try{
			lstThongTinKiemDemHoGD = ThongTinKiemDemHoGDLocalServiceUtil.getListThongTinKiemDemHoGiaDinhByKeHoachId(keHoachId);
		}catch(Exception e){
			_log.error(e);
		}
		return lstThongTinKiemDemHoGD;
	}
	
	public static int countGioiTinhChuHo(String maTinh, String namBaoCao, String gioiTinhChuHo, String danhGiaKiemDem) {
		int count = 0;
		try{
			count = ThongTinKiemDemHoGDLocalServiceUtil.countGioiTinhChuHo( maTinh,  namBaoCao,  gioiTinhChuHo,  danhGiaKiemDem);
		}catch(Exception e){
			_log.error(e);
		}
		return count;
	}
}
