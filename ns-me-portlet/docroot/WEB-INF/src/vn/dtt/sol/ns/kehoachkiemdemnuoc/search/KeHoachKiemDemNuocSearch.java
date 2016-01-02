package vn.dtt.sol.ns.kehoachkiemdemnuoc.search;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocDisplayTerms;
import vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocSearchTerms;
import vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc;

import com.liferay.portal.kernel.dao.search.SearchContainer;

public class KeHoachKiemDemNuocSearch extends SearchContainer<KeHoachKiemDemNuoc>{
	public static final String EMPTY_RESULTS_MESSAGE = "no-ke-hoach-were-found";
	public KeHoachKiemDemNuocSearch(PortletRequest portletRequest, int delta,
			String orderByCol, String orderByType, PortletURL iteratorURL) {
		super(portletRequest, new KeHoachKiemDemNuocDisplayTerms(portletRequest),
				new KeHoachKiemDemNuocSearchTerms(portletRequest), DEFAULT_CUR_PARAM, 10, iteratorURL, null, EMPTY_RESULTS_MESSAGE);
	}
}
