/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.sol.ns.baocaodli.search;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI;
import vn.dtt.sol.ns.baocaodli.util.comparator.BaoCaoDLINamComparator;
import vn.dtt.sol.ns.baocaodli.util.comparator.BaoCaoDLINgayBaoCaoComparator;

/**
 * @author HuyMQ
 */
public class BaoCaoDLISearch extends SearchContainer<BaoCaoDLI> {

	public BaoCaoDLISearch(
		PortletRequest portletRequest, PortletURL iteratorURL) {

		this(portletRequest, DEFAULT_CUR_PARAM, iteratorURL);
	}

	public BaoCaoDLISearch(
		PortletRequest portletRequest, String curParam,
		PortletURL iteratorURL) {

		super(
			portletRequest, new BaoCaoDLIDisplayTerms(portletRequest),
			new BaoCaoDLIDisplayTerms(portletRequest), curParam,
			DEFAULT_DELTA, iteratorURL, null, null);

		BaoCaoDLIDisplayTerms displayTerms =
			(BaoCaoDLIDisplayTerms)getDisplayTerms();
		
		iteratorURL.setParameter(
			BaoCaoDLIDisplayTerms.MA_TINH,
			String.valueOf(displayTerms.getMaTinh()));
		
		iteratorURL.setParameter(
			BaoCaoDLIDisplayTerms.NAM,
			String.valueOf(displayTerms.getNam()));

		String orderByCol = ParamUtil.getString(portletRequest, "orderByCol");
		String orderByType = ParamUtil.getString(portletRequest, "orderByType");

		OrderByComparator orderByComparator = getOrderByComparator(
			orderByCol, orderByType);

		setOrderByCol(orderByCol);
		setOrderByType(orderByType);
		setOrderByComparator(orderByComparator);
	}

	protected OrderByComparator getOrderByComparator(
		String orderByCol, String orderByType) {

		boolean orderByAsc = false;

		if (orderByType.equals("asc")) {
			orderByAsc = true;
		}

		OrderByComparator orderByComparator = null;

		if (orderByCol.equals("nam")) {
			orderByComparator = new BaoCaoDLINamComparator(orderByAsc);
		} else if (orderByCol.equals("ngay-bao-cao")) {
			orderByComparator = new BaoCaoDLINgayBaoCaoComparator(orderByAsc);
		} 

		return orderByComparator;
	}

}