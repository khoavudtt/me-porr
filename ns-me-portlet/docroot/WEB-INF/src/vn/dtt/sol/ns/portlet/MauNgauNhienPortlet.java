package vn.dtt.sol.ns.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.sol.ns.tramcap.action.MauNgauNhienAction;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class MauNgauNhienPortlet extends MVCPortlet {

	/**
	 * @param actionRequest
	 * @param actionResponse
	 */
	public void addMauNgauNhien(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {

		try {
			String maTinh = ParamUtil.getString(actionRequest, "maTinh");
			String maHuyen = ParamUtil.getString(actionRequest, "maHuyen");
			String maXa = ParamUtil.getString(actionRequest, "maXa");

			MauNgauNhienAction action = new MauNgauNhienAction();

			boolean isInKeHoach = VeSinhGiaDinhLocalServiceUtil.chkGDinKeHoach(
					maTinh, maHuyen, maXa);

			if (!isInKeHoach) {
				action.updateMauNgauNhien(actionRequest);
			} else {
				SessionErrors.add(actionRequest,
						"vshgd-da-ton-tai-trong-ke-hoach");
			}

		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass().getName());
		}

		sendCustomRedirect(actionRequest, actionResponse);
	}

	/**
	 * @param actionRequest
	 * @param actionResponse
	 */
	public void delMauNgauNhien(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		try {

			MauNgauNhienAction action = new MauNgauNhienAction();

			action.deleteMauKiemDem(actionRequest);

		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass().getName());
		}
	}

	/**
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 */
	private void sendCustomRedirect(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {

		if (!SessionErrors.isEmpty(actionRequest)) {
			String errorURL = ParamUtil
					.getString(actionRequest, "pageErrorURL");
			SessionMessages
					.add(actionRequest,
							PortalUtil.getPortletId(actionRequest)
									+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);

			if (Validator.isNotNull(errorURL)) {
				actionResponse.sendRedirect(errorURL);
			}
		} else {
			String successURL = ParamUtil.getString(actionRequest,
					"pageSuccessURL");
			SessionMessages
					.add(actionRequest,
							PortalUtil.getPortletId(actionRequest)
									+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);

			if (Validator.isNotNull(successURL)) {
				actionResponse.sendRedirect(successURL);
			}
		}
	}

	private static Log _log = LogFactoryUtil.getLog(MauNgauNhienPortlet.class);
}
