package vn.dtt.sol.ns.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.sol.ns.tramcap.action.DanhGiaBenVungAction;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class DanhGiaBenVungPortlet extends MVCPortlet {

	/**
	 * @param actionRequest
	 * @param actionResponse
	 */
	public void deleteDanhGia(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		try {
			DanhGiaBenVungAction danhGiaAction = new DanhGiaBenVungAction();
			
			danhGiaAction.deleteDanhGiaBenVung(actionRequest);
		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass().getName());
		}
	}

	/**
	 * @param actionRequest
	 * @param actionResponse
	 */
	public void addBenVung(ActionRequest actionRequest,
			ActionResponse actionResponse) {

		try {
			DanhGiaBenVungAction danhGiaAction = new DanhGiaBenVungAction();

			danhGiaAction.addDanhGiaBenVung(actionRequest);
		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass().getName());
		}
	}

	private static Log _log = LogFactoryUtil
			.getLog(DanhGiaBenVungPortlet.class);
}
