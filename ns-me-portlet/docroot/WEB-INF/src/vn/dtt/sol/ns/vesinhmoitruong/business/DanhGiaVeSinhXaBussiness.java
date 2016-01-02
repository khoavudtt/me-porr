package vn.dtt.sol.ns.vesinhmoitruong.business;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.DanhGiaVeSinhXaNewLocalServiceUtil;

public class DanhGiaVeSinhXaBussiness {

	public static DanhGiaVeSinhXaNew fetchDanhGiaVeSinhXaById(int id) {
		DanhGiaVeSinhXaNew result = null;
		try {
			result = DanhGiaVeSinhXaNewLocalServiceUtil.fetchDanhGiaVeSinhXaNew(id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
