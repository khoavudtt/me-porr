package vn.dtt.sol.ns.vesinhmoitruong.search;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.liferay.portal.kernel.util.Validator;

import vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocDisplayTerms;
import vn.dtt.sol.ns.daunoinuoc.search.DauNoiNuocSearchTerms;

public class VeSinhMoiTruongSearchTerms extends VeSinhMoiTruongDisplayTerms{

	public VeSinhMoiTruongSearchTerms(PortletRequest portletRequest) {
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
