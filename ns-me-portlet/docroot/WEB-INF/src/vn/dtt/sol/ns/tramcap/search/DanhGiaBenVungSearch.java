package vn.dtt.sol.ns.tramcap.search;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung;

import com.liferay.portal.kernel.dao.search.SearchContainer;

public class DanhGiaBenVungSearch extends SearchContainer<DanhGiaBenVung>{
	
	public static final String EMPTY_RESULTS_MESSAGE = "no-danh-gia-were-found";
	
	public DanhGiaBenVungSearch(PortletRequest portletRequest, int delta,
			String orderByCol, String orderByType, PortletURL iteratorURL) {
		super(portletRequest, null, null, DEFAULT_CUR_PARAM, delta,
				iteratorURL, null, EMPTY_RESULTS_MESSAGE);
	}


}
