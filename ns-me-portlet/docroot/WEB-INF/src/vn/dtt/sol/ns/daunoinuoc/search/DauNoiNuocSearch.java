package vn.dtt.sol.ns.daunoinuoc.search;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;

import com.liferay.portal.kernel.dao.search.SearchContainer;

public class DauNoiNuocSearch extends SearchContainer<DauNoiNuoc> {
	public static final String EMPTY_RESULTS_MESSAGE = "no-danh-gia-were-found";

	public DauNoiNuocSearch(PortletRequest portletRequest, int delta,
			String orderByCol, String orderByType, PortletURL iteratorURL) {
		super(portletRequest, new DauNoiNuocDisplayTerms(portletRequest), 
				new DauNoiNuocSearchTerms(portletRequest), DEFAULT_CUR_PARAM, 10,
				iteratorURL, null, EMPTY_RESULTS_MESSAGE);
	}
}
