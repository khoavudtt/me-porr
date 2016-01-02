package vn.dtt.sol.ns.business;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.cmon.dm.dao.model.DATAGROUP;
import vn.dtt.cmon.dm.dao.service.DATAGROUPLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class DataGroupBusiness {
	/**
	 * Get all DATAGROUP
	 * 
	 * @return
	 */
	public static List<DATAGROUP> getAllDataGroup() {
		List<DATAGROUP> ls = new ArrayList<DATAGROUP>();

		try {
			ls = DATAGROUPLocalServiceUtil.getAll();
		} catch (Exception e) {
			_log.error(e);
		}

		return ls;
	}

	/**
	 * Get DATAGROUP in range
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static List<DATAGROUP> getAllDataGroup(int start, int end) {
		List<DATAGROUP> ls = new ArrayList<DATAGROUP>();

		try {
			ls = DATAGROUPLocalServiceUtil.getAll(start, end);
		} catch (Exception e) {
			_log.error(e);
		}

		return ls;
	}

	/**
	 * Count all DATAGROUP
	 * 
	 * @return
	 */
	public static int countAll() {
		int count = 0;

		try {
			count = DATAGROUPLocalServiceUtil.countAll();
		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}

	private static Log _log = LogFactoryUtil.getLog(DataGroupBusiness.class);

}
