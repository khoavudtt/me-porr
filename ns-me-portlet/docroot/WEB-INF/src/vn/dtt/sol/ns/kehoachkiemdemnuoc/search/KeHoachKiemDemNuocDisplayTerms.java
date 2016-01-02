package vn.dtt.sol.ns.kehoachkiemdemnuoc.search;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

public class KeHoachKiemDemNuocDisplayTerms extends DisplayTerms {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	public String TRAM_CAP_NUOC_ID="tramCapNuocId";
	public String KIEM_DEM_VIEN_ID="kiemDemVienId";
	
	public KeHoachKiemDemNuocDisplayTerms(PortletRequest portletRequest )
	{
		super(portletRequest);
		UploadPortletRequest request = PortalUtil
				.getUploadPortletRequest(portletRequest);
		tramCapNuocId=ParamUtil.getInteger(request, TRAM_CAP_NUOC_ID);
		kiemDemVienId=ParamUtil.getInteger(request, KIEM_DEM_VIEN_ID);
		
	}
	
	public int getTramCapNuocId() {
		return tramCapNuocId;
	}
	public void setTramCapNuocId(int tramCapNuocId) {
		this.tramCapNuocId = tramCapNuocId;
	}
	public int getKiemDemVienId() {
		return kiemDemVienId;
	}
	public void setKiemDemVienId(int kiemDemVienId) {
		this.kiemDemVienId = kiemDemVienId;
	}

	protected int tramCapNuocId;
	protected int kiemDemVienId;
}
