package vn.dtt.sol.ns.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.sol.ns.kehoachvesinh.dao.action.KeHoachVeSinhAction;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class KeHoachVeSinh extends MVCPortlet{
	
	public void addKeHoachVeSinh(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException{
		
		try {
			
			KeHoachVeSinhAction action = new KeHoachVeSinhAction();
			
			action.addKeHoachVeSinh(actionRequest, actionResponse);
			
		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass().getName());
		}
		
		sendCustomRedirect(actionRequest, actionResponse);
	}
	
	public void updateKeHoachVeSinh(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException{
		
		try {
			
			KeHoachVeSinhAction action = new KeHoachVeSinhAction();
			
			action.updateKeHoachVeSinh(actionRequest, actionResponse);
			
		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass().getName());
		}
		
		sendCustomRedirect(actionRequest, actionResponse);
	}
	
	public void deleteKeHoach(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws IOException{
		
		try {
			
			KeHoachVeSinhAction action = new KeHoachVeSinhAction();
			
			action.deleteKeHoach(actionRequest, actionResponse);
			
		} catch (Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass().getName());
		}
		
		sendCustomRedirect(actionRequest, actionResponse);
	}
	
	public void search(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws IOException{
		long nam = ParamUtil.getLong(actionRequest, "nam");
		String maTinh = ParamUtil.getString(actionRequest, "maTinh");
		String maHuyen = ParamUtil.getString(actionRequest, "maHuyen");
		
		actionResponse.setRenderParameter("nam", Long.toString(nam));
		actionResponse.setRenderParameter("maTinh", maTinh);
		actionResponse.setRenderParameter("maHuyen", maHuyen);
		
	}
	
	private void sendCustomRedirect(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {

		if (!SessionErrors.isEmpty(actionRequest)) {
			String errorURL = ParamUtil.getString(actionRequest, "onpageError");
			SessionMessages
					.add(actionRequest,
							PortalUtil.getPortletId(actionRequest)
									+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);

			if (Validator.isNotNull(errorURL)) {
				actionResponse.sendRedirect(errorURL);
			}
		} else {
			String successURL = ParamUtil.getString(actionRequest, "onpageSuccess");
			SessionMessages
					.add(actionRequest,
							PortalUtil.getPortletId(actionRequest)
									+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);

			if (Validator.isNotNull(successURL)) {
				actionResponse.sendRedirect(successURL);
			}
		}
	}
	
	private static Log _log = LogFactoryUtil.getLog(KeHoachVeSinh.class);
}
