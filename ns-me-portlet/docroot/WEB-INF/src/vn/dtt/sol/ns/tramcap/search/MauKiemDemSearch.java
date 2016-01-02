package vn.dtt.sol.ns.tramcap.search;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM;

import com.liferay.portal.kernel.dao.search.SearchContainer;

public class MauKiemDemSearch extends SearchContainer<MAUKIEMDEM> {
	
	public static final String EMPTY_RESULTS_MESSAGE = "no-mau-kiem-dem-were-found";

	public MauKiemDemSearch(PortletRequest portletRequest, int delta,
			String orderByCol, String orderByType, PortletURL iteratorURL) {
		super(portletRequest, null, null, DEFAULT_CUR_PARAM, delta,
				iteratorURL, null, EMPTY_RESULTS_MESSAGE);
	}
}
