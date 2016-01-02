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
package vn.dtt.cmon.dm.search;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import vn.dtt.cmon.dm.dao.model.DATAITEM;

import com.liferay.portal.kernel.dao.search.SearchContainer;

public class DataItemSearch extends SearchContainer<DATAITEM>{
	public static final String EMPTY_RESULTS_MESSAGE = "no-tram-cap-were-found";
	public DataItemSearch(PortletRequest portletRequest, int delta,
			String orderByCol, String orderByType, PortletURL iteratorURL) {
		super(portletRequest, null, null, DEFAULT_CUR_PARAM, delta,
				iteratorURL, null, EMPTY_RESULTS_MESSAGE);
	}
}



