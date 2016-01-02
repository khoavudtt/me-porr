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

package vn.dtt.sol.ns.baocaodli.dao.service.persistence;

/**
 * @author HuyMQ
 */
public interface BaoCaoDLIFinder {
	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> searchDLI(
		java.lang.String maTinh, int loaiBaoCao, int nam,
		java.lang.Integer trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int searchCountDLI(java.lang.String maTinh, int loaiBaoCao, int nam,
		java.lang.Integer trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI> search(
		java.lang.String maTinh, int nam, java.lang.Integer trangThai,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int searchCount(java.lang.String maTinh, int nam,
		java.lang.Integer trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;
}