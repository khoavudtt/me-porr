package vn.dtt.sol.ns.tramcap.search;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;

import com.liferay.portal.kernel.dao.search.SearchContainer;

public class VeSinhGiaDinhSearch extends SearchContainer<VeSinhGiaDinh>{
	public static final String EMPTY_RESULTS_MESSAGE = "no-mau-kiem-dem-were-found";

	public VeSinhGiaDinhSearch(PortletRequest portletRequest, int delta,
			String orderByCol, String orderByType, PortletURL iteratorURL) {
		super(portletRequest, null, null, DEFAULT_CUR_PARAM, delta,
				iteratorURL, null, EMPTY_RESULTS_MESSAGE);
	}
}
