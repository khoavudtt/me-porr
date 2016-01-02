package vn.dtt.sol.ns.vesinhmoitruong.business;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemCongTrinhLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ThongTinKiemDemCongTrinhBusiness {
	
	public static List<ThongTinKiemDemCongTrinh> getListThongTinKiemDemCongTrinhByKeHoachId(int keHoachId) {
		List<ThongTinKiemDemCongTrinh> lstThongTinKiemDemCongTrinh = new ArrayList<ThongTinKiemDemCongTrinh>();
		try{
			lstThongTinKiemDemCongTrinh = ThongTinKiemDemCongTrinhLocalServiceUtil.getListThongTinKiemDemCongTrinhByKeHoachId(keHoachId);
		}catch(Exception e){
			_log.error(e);
		}
		return lstThongTinKiemDemCongTrinh;
	}
	private static Log _log = LogFactoryUtil.getLog(ThongTinKiemDemCongTrinhBusiness.class);
}
