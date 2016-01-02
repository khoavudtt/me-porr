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
import vn.dtt.cmon.user.dao.model.UserHuyen;
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.cmon.user.dao.model.impl.UserMappingImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class UserHuyenFinderImpl extends BasePersistenceImpl<UserHuyen>
		implements UserHuyenFinder {
	public static final String FINDER_USER_IN_HUYEN_SQL = "lay.danh.sach.gsv.theo.dia.ban.huyen.finder";

	public static final String FINDER_HUYEN_GS_BY_USER_SQL = "lay.danh.sach.huyen.giam.sat.by.user.finder";

	public static final String COUNT_HUYEN_GS_BY_USER_SQL = "lay.danh.sach.huyen.giam.sat.by.user.count";

	public static final String FINDER_HUYEN_DA_CHON_QLY_DIA_BAN = "lay.danh.sach.huyen.da.phan.dia.ban.cua.user";

	public static final String FINDER_XA_THUOC_HUYEN_DA_CHON_QLY_DIA_BAN = "lay.danh.sach.xa.thuoc.huyen.da.phan.dia.ban.cua.user";

	public static final String COUNT_HUYEN_DA_CHON_QLY_DIA_BAN = "lay.danh.sach.huyen.da.phan.dia.ban.cua.user.count";

	public static final String COUNT_XA_THUOC_HUYEN_DA_CHON_QLY_DIA_BAN = "lay.danh.sach.xa.thuoc.huyen.da.phan.dia.ban.cua.user";

	public static final String FINDER_XA_IN_HUYEN_DUOC_CHON_BY_USER = "lay.danh.sach.xa.thuoc.huyen.duoc.chon.user.count";

	/**
	 * @param maTinh
	 * @param maHuyen
	 * @param maUser
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public List<DATAITEM> findXaThuocHuyenDuocChonByUser(String maTinh,
			String maHuyen, long maUser, int start, int end)
			throws PortalException, SystemException {
		return _finderXA_THUOC_HUYEN_DUOC_CHON_BY_USER(maTinh, maHuyen, maUser,
				start, end);
	}

	private List<DATAITEM> _finderXA_THUOC_HUYEN_DUOC_CHON_BY_USER( String maTinh, String maHuyen, long maUser, int start, int end)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil
					.get(FINDER_XA_IN_HUYEN_DUOC_CHON_BY_USER);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DATAITEM", DATAITEMImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(maHuyen);
			qPos.add(maTinh);
			qPos.add(maHuyen);

			qPos.add(maUser);

			return (List<DATAITEM>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	/**
	 * @param maTinh
	 * @param maHuyen
	 * @param userId
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public int countXaThuocHuyenByUserId(String maTinh, String maHuyen,
			long userId) throws PortalException, SystemException {
		return _countXA_THUOC_HUYEN_DA_CHON_BY_USER(maTinh, maHuyen, userId);
	}

	/**
	 * @param maTinh
	 * @param userId
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public int countHuyenByUserId(String maTinh, long userId)
			throws PortalException, SystemException {
		return _countHUYEN_DA_CHON_BY_USER(maTinh, userId);
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
	public List<DATAITEM> findHuyenChonByUser(String maTinh, long userId,
			int start, int end) throws PortalException, SystemException {
		return _finderHUYEN_DA_CHON_BY_USER(maTinh, userId, start, end);
	}

	/**
	 * @param maTinh
	 * @param maHuyen
	 * @param userId
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public List<DATAITEM> findXaThuocHuyenChonByUser(String maTinh,
			String maHuyen, long userId, int start, int end)
			throws PortalException, SystemException {
		return _finderXA_THUOC_HUYEN_DA_CHON_BY_USER(maTinh, maHuyen, userId,
				start, end);
	}

	private int _countXA_THUOC_HUYEN_DA_CHON_BY_USER(String maTinh,
			String maHuyen, long maUser) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil
					.get(COUNT_XA_THUOC_HUYEN_DA_CHON_QLY_DIA_BAN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(maHuyen);
			qPos.add(maTinh);
			qPos.add(maHuyen);

			qPos.add(maUser);

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

	private int _countHUYEN_DA_CHON_BY_USER(String maTinh, long maUser)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_HUYEN_DA_CHON_QLY_DIA_BAN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(maTinh);
			qPos.add(maUser);

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

	private List<DATAITEM> _finderHUYEN_DA_CHON_BY_USER(String maTinh,
			long maUser, int start, int end) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FINDER_HUYEN_DA_CHON_QLY_DIA_BAN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DATAITEM", DATAITEMImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(maTinh);

			qPos.add(maUser);

			return (List<DATAITEM>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	private List<DATAITEM> _finderXA_THUOC_HUYEN_DA_CHON_BY_USER(String maTinh,
			String maHuyen, long maUser, int start, int end)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil
					.get(FINDER_XA_THUOC_HUYEN_DA_CHON_QLY_DIA_BAN);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DATAITEM", DATAITEMImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(maHuyen);
			qPos.add(maTinh);
			qPos.add(maHuyen);

			qPos.add(maUser);

			return (List<DATAITEM>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * vn.dtt.cmon.user.dao.service.persistence.UserHuyenFinder#finderGSVInHuyen
	 * (java.lang.String, java.lang.String, int, int)
	 */
	public List<UserMapping> finderGSVInHuyen(String maTinh, String maHuyen,
			int start, int end) throws PortalException, SystemException {
		return finderU_IN_T_C(maTinh, maHuyen, start, end);
	}

	/**
	 * Lay danh sach huyen by USER
	 * 
	 * @param maTinh
	 * @param maUser
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public List<DATAITEM> findHuyenByUser(String maTinh, long maUser,
			int start, int end) throws PortalException, SystemException {
		return finderHUYEN_BY_USER(maTinh, maUser, start, end);
	}

	/**
	 * @param maTinh
	 * @param maUser
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public int coutHuyenByUser(String maTinh, long maUser)
			throws PortalException, SystemException {
		return countHUYEN_BY_USER(maTinh, maUser);
	}

	private int countHUYEN_BY_USER(String maTinh, long maUser)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_HUYEN_GS_BY_USER_SQL);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(maUser);

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

	private List<DATAITEM> finderHUYEN_BY_USER(String maTinh, long maUser,
			int start, int end) throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FINDER_HUYEN_GS_BY_USER_SQL);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DATAITEM", DATAITEMImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(maUser);

			return (List<DATAITEM>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	private List<UserMapping> finderU_IN_T_C(String maTinh, String maHuyen,
			int start, int end) throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FINDER_USER_IN_HUYEN_SQL);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("UserMapping", UserMappingImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(maHuyen);

			return (List<UserMapping>) QueryUtil.list(q, getDialect(), start,
					end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

}
