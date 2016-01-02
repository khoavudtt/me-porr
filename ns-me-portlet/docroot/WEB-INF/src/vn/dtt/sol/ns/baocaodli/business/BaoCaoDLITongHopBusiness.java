package vn.dtt.sol.ns.baocaodli.business;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop;
import vn.dtt.sol.ns.baocaodli.dao.service.BaoCaoDLITongHopLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class BaoCaoDLITongHopBusiness {
	
	
	private static final Log _log = LogFactoryUtil.getLog(BaoCaoDLITongHopBusiness.class);
	public static BaoCaoDLITongHop getBaoCaoDLITongHopByTinhVaNam(String maTinh, String namBaoCao){
		BaoCaoDLITongHop baoCaoDLITongHop = null;
		
		try {

			baoCaoDLITongHop = BaoCaoDLITongHopLocalServiceUtil.getBaoCaoDLITongHopByTinhVaNam(maTinh,namBaoCao);

		} catch (Exception e) {
			_log.error(e);
		}
		
		return baoCaoDLITongHop;
	}
	
	public static List<BaoCaoDLITongHop> getListBaoCaoDLITongHopByNamTW(String namBaoCao){
		List<BaoCaoDLITongHop> lst = new ArrayList<BaoCaoDLITongHop>();
		
		try {

			lst = BaoCaoDLITongHopLocalServiceUtil.getListBaoCaoDLITongHopByNamTW(namBaoCao);

		} catch (Exception e) {
			_log.error(e);
		}
		
		return lst;
	}
}
