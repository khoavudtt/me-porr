package vn.dtt.sol.ns.daunoinuoc.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.Validator;

public class DauNoiNuocSearchTerms extends DauNoiNuocDisplayTerms {

	public DauNoiNuocSearchTerms(PortletRequest portletRequest) {
		super(portletRequest);
		// TODO Auto-generated constructor stub
	}
	public boolean hasSearchTerms() {

		if (advancedSearch && hasAdvancedSearchTerms()) {
			return true;
		}

		if (!advancedSearch && hasBasicSearchTerms()) {
			return true;
		}

		return false;
	}

	protected boolean hasAdvancedSearchTerms() {
		if (Validator.isNotNull(maTinh)) {
			return true;
		}

		return false;
	}

	protected boolean hasBasicSearchTerms() {

		if (Validator.isNotNull(keywords)) {
			return true;
		}

		return false;
	}
}
