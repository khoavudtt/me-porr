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

import java.util.Calendar;
import java.util.Date;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;

import javax.portlet.PortletRequest;

import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.sol.ns.baocaodli.util.BaoCaoDLIUtil;
import vn.dtt.sol.ns.business.UserMappingBusiness;

/**
 * @author HuyMQ
 */
public class BaoCaoDLIDisplayTerms extends DisplayTerms {

	public static final String MA_TINH = "maTinh";
	
	public static final String NAM = "nam";
	
	public static final String TRANG_THAI = "trangThai";

	public BaoCaoDLIDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);
		
		ThemeDisplay themeDisplay = (ThemeDisplay) portletRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		UserMapping userMapping = UserMappingBusiness.getUserMapping(themeDisplay.getUser());
		boolean userTrungUong = BaoCaoDLIUtil.isUserTrungUong(themeDisplay.getUser());
		
		String maTinhDefault = userTrungUong ? StringPool.BLANK : userMapping.getOrgCode1();
		
		Date now = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		
		int namDefault = userTrungUong ? cal.get(Calendar.YEAR) : 0;
		
		maTinh = ParamUtil.getString(portletRequest, MA_TINH, maTinhDefault);
		
		nam = ParamUtil.getInteger(portletRequest, NAM, namDefault);
		
		int intTrangThai = ParamUtil.getInteger(portletRequest, TRANG_THAI, 0);
		
		if(intTrangThai != 0) {
			trangThai = intTrangThai;
		} else {
			trangThai = null;
		}
	}
	
	public String getMaTinh() {
		return maTinh;
	}
	public void setMaTinh(String maTinh) {
		this.maTinh = maTinh;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public Integer getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(Integer trangThai) {
		this.trangThai = trangThai;
	}

	private String maTinh;
	private int nam;
	private Integer trangThai;
}