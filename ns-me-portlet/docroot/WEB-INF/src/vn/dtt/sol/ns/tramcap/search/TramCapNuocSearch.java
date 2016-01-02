package vn.dtt.sol.ns.tramcap.search;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;

import com.liferay.portal.kernel.dao.search.SearchContainer;

public class TramCapNuocSearch extends SearchContainer<TramCapNuoc>{
	public static final String EMPTY_RESULTS_MESSAGE = "no-tram-cap-were-found";
	public TramCapNuocSearch(PortletRequest portletRequest, int delta,
			String orderByCol, String orderByType, PortletURL iteratorURL) {
		super(portletRequest, null, null, DEFAULT_CUR_PARAM, delta,
				iteratorURL, null, EMPTY_RESULTS_MESSAGE);
	}
}
