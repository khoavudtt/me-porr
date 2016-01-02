package vn.dtt.sol.ns.baocaodli.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI;
import vn.dtt.sol.ns.business.UserMappingBusiness;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.NoSuchFolderException;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;

public class BaoCaoDLIUtil {
	public static boolean isUserTrungUong(User user) {
		
		boolean result = false;
		
		if(user != null) {
			int userType = UserMappingBusiness.getUserType(user);
			
			if(userType == 1) {
				result = true;
			}
		}
		
		return result;
	}
	
	public static List<Integer> getNamBaoCaos() {
		
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);

		int currentYear = cal.get(Calendar.YEAR);
		List<Integer> listYear = new ArrayList<Integer>();
		
		for(int y = 2014; y <= currentYear; y++) {
			listYear.add(y);
		}
		
		return listYear;
	}
	
	/**
	 * Lay folderId dung de luu file bao cao, dua vao nam bao cao
	 * 
	 * @param userId
	 * @param groupId
	 * @return
	 */
	public static long getFolderId(long userId, long groupId) {
		
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);

		int currentYear = cal.get(Calendar.YEAR);
		
		long folderId = 0;
		boolean addFolder = false;
		DLFolder dlFolder = null;
		
		try {
			dlFolder = DLFolderLocalServiceUtil.getFolder(groupId, 0, String.valueOf(currentYear));
		} catch(Exception e) {
			if(e instanceof NoSuchFolderException) {
				addFolder = true;
			} else {
				_log.error(e);
			}
		}
		
		if(addFolder) {
			try {
				ServiceContext serviceContext = new ServiceContext();
				
				serviceContext.setAddGroupPermissions(true);
				serviceContext.setAddGuestPermissions(true);
				
				dlFolder = DLFolderLocalServiceUtil.addFolder(userId, groupId,
						groupId, true, 0, String.valueOf(currentYear),
					StringPool.BLANK, true, serviceContext);
			} catch(PortalException e) {
				_log.error(e);
			} catch(SystemException e) {
				_log.error(e);
			}
		}
		
		if(dlFolder != null) {
			folderId = dlFolder.getFolderId();
		}
		
		return folderId;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(BaoCaoDLI.class);
}
