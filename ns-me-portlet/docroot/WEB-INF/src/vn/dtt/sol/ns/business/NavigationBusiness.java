package vn.dtt.sol.ns.business;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.cmon.dm.dao.model.NAVIGATION;
import vn.dtt.cmon.dm.dao.service.NAVIGATIONLocalServiceUtil;
import vn.dtt.sol.ns.navigation.bussiness.NavigationUtils;
import vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class NavigationBusiness {

	public static List<NAVIGATION> getLeftMenu(boolean isAdmin, int parentId,
			int hidden, String currentUrl, int initUserType, int role,
			String maTinh, String permission, long userId) {

		List<NAVIGATION> resutlsBase = new ArrayList<NAVIGATION>();
		List<NAVIGATION> resutls = new ArrayList<NAVIGATION>();
		try {
			resutlsBase = NAVIGATIONLocalServiceUtil.getLeftMenu(parentId,
					hidden);
			long sumTongHop = 0;
			for (NAVIGATION navigation : resutlsBase) {
				if (currentUrl.contains(navigation.getNavSubOwner())) {
					// sumTongHop =
					// DauNoiNuocLocalServiceUtil.countThongKeMenuLeft(navigation.getThongKe(),
					// initUserType, orgCode);

					sumTongHop = NavigationUtils.countMenu(
							navigation.getThongKe(), initUserType, isAdmin,
							maTinh, userId);
					
					navigation.setThongKe(String.valueOf(sumTongHop));
					resutls.add(navigation);
				}

			}

		} catch (SystemException e) {
			// TODO Auto-generated catch block
			_log.error(e);
		}

		return resutls;
	}

	public static List<NAVIGATION> getLeftMenu(int parentId, int hidden,
			String currentUrl, int initUserType, int role, String orgCode,
			String permission) {

		List<NAVIGATION> resutlsBase = new ArrayList<NAVIGATION>();
		List<NAVIGATION> resutls = new ArrayList<NAVIGATION>();
		try {
			resutlsBase = NAVIGATIONLocalServiceUtil.getLeftMenu(parentId,
					hidden);
			long sumTongHop = 0;
			for (NAVIGATION navigation : resutlsBase) {
				if (currentUrl.contains(navigation.getNavSubOwner())) {
					sumTongHop = DauNoiNuocLocalServiceUtil
							.countThongKeMenuLeft(navigation.getThongKe(),
									initUserType, orgCode);
					navigation.setThongKe(String.valueOf(sumTongHop));
					resutls.add(navigation);
				}

			}

		} catch (SystemException e) {
			// TODO Auto-generated catch block
			_log.error(e);
		}

		return resutls;
	}

	private static Log _log = LogFactoryUtil.getLog(NavigationBusiness.class);
}
