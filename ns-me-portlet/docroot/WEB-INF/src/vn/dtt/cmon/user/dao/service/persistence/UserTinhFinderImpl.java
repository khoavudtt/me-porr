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
import vn.dtt.cmon.user.dao.model.UserTinh;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class UserTinhFinderImpl extends BasePersistenceImpl<UserTinh> implements
		UserTinhFinder {
	public static final String FINDER_HUYEN_SQL = "lay.danh.sach.huyen.thong.qua.dia.ban.finder";
	public static final String COUNT_HUYEN_SQL = "lay.danh.sach.huyen.thong.qua.dia.ban.count";
	public static final String FINDER_HUYEN_SELECT_SQL = "lay.danh.sach.huyen.duoc.lua.chon.khi.tao.tai.khoan.tinh";

	public List<DATAITEM> findT_UID(String maTinh, long userId, int start,
			int end) throws PortalException, SystemException {
		return _finderT_UID(maTinh, userId, start, end);
	}

	public List<DATAITEM> findHuyeSelectByTinhAndUser(String maTinh,
			long userId, int start, int end) throws PortalException,
			SystemException {
		return _finderHuyenSelect(maTinh, userId, start, end);
	}

	public int countT_UID(String maTinh, long userId) throws PortalException,
			SystemException {
		return _countT_UID(maTinh, userId);
	}

	/**
	 * @param maTinh
	 * @param userId
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	private int _countT_UID(String maTinh, long userId) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_HUYEN_SQL);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

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

	/**
	 * @param maTinh
	 * @param userId
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	private List<DATAITEM> _finderHuyenSelect(String maTinh, long userId,
			int start, int end) throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FINDER_HUYEN_SELECT_SQL);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DATAITEM", DATAITEMImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(maTinh);

			qPos.add(userId);

			return (List<DATAITEM>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	private List<DATAITEM> _finderT_UID(String maTinh, long userId, int start,
			int end) throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FINDER_HUYEN_SQL);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DATAITEM", DATAITEMImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

			qPos.add(userId);

			return (List<DATAITEM>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

}
