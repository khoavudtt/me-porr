package vn.dtt.sol.ns.tramcap.search;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh;

import com.liferay.portal.kernel.dao.search.SearchContainer;

public class DanhGiaVanHanhSearch extends SearchContainer<DanhGiaVanHanh> {
	public static final String EMPTY_RESULTS_MESSAGE = "no-danh-gia-were-found";

	public DanhGiaVanHanhSearch(PortletRequest portletRequest, int delta,
			String orderByCol, String orderByType, PortletURL iteratorURL) {
		super(portletRequest, null, null, DEFAULT_CUR_PARAM, delta,
				iteratorURL, null, EMPTY_RESULTS_MESSAGE);
	}
}
