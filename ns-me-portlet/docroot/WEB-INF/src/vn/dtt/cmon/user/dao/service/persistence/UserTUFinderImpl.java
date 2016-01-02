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
package vn.dtt.cmon.user.dao.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.model.impl.DATAITEMImpl;
import vn.dtt.cmon.user.dao.model.UserTU;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class UserTUFinderImpl extends BasePersistenceImpl<UserTU> implements
		UserTUFinder {
	public static final String FINDER_TINH_TU_SQL = "lay.danh.sach.tinh.giam.sat.by.user.tu.finder";
	public static final String COUNT_TINH_TU_SQL = "lay.danh.sach.tinh.giam.sat.by.user.tu.count";

	public int countTinhTUByUserId(long userId) throws PortalException,
			SystemException {
		return _countT_UID(userId);
	}

	public List<DATAITEM> finderTinhTUByUserId(long userId, int start, int end)
			throws PortalException, SystemException {
		return _finderT_UID(userId, start, end);
	}

	private List<DATAITEM> _finderT_UID(long userId, int start, int end)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FINDER_TINH_TU_SQL);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DATAITEM", DATAITEMImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userId);

			return (List<DATAITEM>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	private int _countT_UID(long userId) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_TINH_TU_SQL);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userId);

			Iterator<Long> itr = q.iterate();

			if (itr.hasNext()) {
				Long count = itr.next();

				if (count != null) {
					return count.intValue();
				}
			}

			return 0;

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

}
