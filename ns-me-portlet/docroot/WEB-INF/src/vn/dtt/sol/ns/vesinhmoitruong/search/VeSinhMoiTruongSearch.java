package vn.dtt.sol.ns.vesinhmoitruong.search;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;

import com.liferay.portal.kernel.dao.search.SearchContainer;
public class VeSinhMoiTruongSearch extends SearchContainer<VeSinhGiaDinh> {
	public static final String EMPTY_RESULTS_MESSAGE = "no-danh-gia-were-found";

	public VeSinhMoiTruongSearch(PortletRequest portletRequest, int delta,
			String orderByCol, String orderByType, PortletURL iteratorURL) {
		super(portletRequest, new VeSinhMoiTruongSearchTerms(portletRequest), 
				new VeSinhMoiTruongSearchTerms(portletRequest),DEFAULT_CUR_PARAM, delta,
				iteratorURL, null, EMPTY_RESULTS_MESSAGE);
	}
}
