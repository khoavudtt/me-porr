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
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.cmon.user.dao.model.UserTramCap;
import vn.dtt.cmon.user.dao.model.impl.UserMappingImpl;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class UserTramCapFinderImpl extends BasePersistenceImpl<UserTramCap>
		implements UserTramCapFinder {

	public static final String FINDER_TRAMCAP_SQL = "lay.danh.sach.tram.cap.thong.qua.phan.dia.ban.finder";

	public static final String COUNT_TRAMCAP_SQL = "lay.danh.sach.tram.cap.thong.qua.phan.dia.ban.count";

	public static final String FINDER_USER_SQL = "lay.danh.sach.gsv.thong.qua.phan.dia.ban.finder";

	public static final String FINDER_HUYEN_IN_TRAMCAP_SQL = "lay.danh.sach.huyen.thuoc.tram.cap.nuoc";

	public static final String FINDER_XA_IN_TRAMCAP_HUYEN_SQL = "lay.danh.sach.xa.thuoc.tram.cap.nuoc.va.huyen";

	public static final String FINDER_HUYEN_IN_TRAM_CAP_CUA_NGUOI_DUNG = "lay.danh.sach.huyen.thuoc.tram.cap.cua.nguoi.dung.finder";
	
	public static final String FINDER_XA_IN_HUYEN_THUOC_TRAM_CAP_CUA_NGUOI_DUNG = "lay.danh.sach.xa.thuoc.huyen.thuoc.tram.cap.cua.nguoi.dung.finder";
	public static final String FINDER_XA_KHONG_IN_HUYEN_THUOC_TRAM_CAP_CUA_NGUOI_DUNG = "lay.danh.sach.xa.khong.thuoc.huyen.thuoc.tram.cap.cua.nguoi.dung.finder";

	public List<DATAITEM> finderHuyenInTram(String maTinh, long maTramCap,
			int start, int end) throws PortalException, SystemException {
		return _finderHuyenInTram(maTinh, maTramCap, start, end);
	}

	public List<DATAITEM> finderXaInHuyenTram(String maTinh, String maHuyen,
			long maTramCap, int start, int end) throws PortalException,
			SystemException {
		return _finderXaInHuyenTram(maTinh, maHuyen, maTramCap, start, end);
	}

	public List<DATAITEM> finderHuyenInTramByUser(String maTinh,
			long maTramCap, long userId, int start, int end)
			throws PortalException, SystemException {
		return _finderHuyenInTramByUser(maTinh, maTramCap, userId, start, end);
	}

	public List<DATAITEM> finderXaInHuyenTramByUser(String maTinh,
			String maHuyen, long maTramCap, long userId, int start, int end)
			throws PortalException, SystemException {
		return _finderXaHuyenInTramByUser(maTinh, maHuyen, maTramCap, userId,
				start, end);
	}	
	
	public List<DATAITEM> finderXaKhongInHuyenTramByUser(String maTinh,
			String maHuyen, long maTramCap, long userId, int start, int end)
			throws PortalException, SystemException {
		return _finderXaKhongHuyenInTramByUser(maTinh, maHuyen, maTramCap, userId,
				start, end);
	}

	private List<DATAITEM> _finderHuyenInTramByUser(String maTinh,
			long maTramCap, long userId, int start, int end)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil
					.get(FINDER_HUYEN_IN_TRAM_CAP_CUA_NGUOI_DUNG);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DATAITEM", DATAITEMImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(maTinh);

			qPos.add(maTramCap);

			qPos.add(userId);

			return (List<DATAITEM>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	private List<DATAITEM> _finderXaHuyenInTramByUser(String maTinh,
			String maHuyen, long maTramCap, long userId, int start, int end)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil
					.get(FINDER_XA_IN_HUYEN_THUOC_TRAM_CAP_CUA_NGUOI_DUNG);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DATAITEM", DATAITEMImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(maHuyen);
			qPos.add(maTinh);
			qPos.add(maHuyen);
			qPos.add(maTramCap);

			qPos.add(userId);

			return (List<DATAITEM>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	private List<DATAITEM> _finderXaKhongHuyenInTramByUser(String maTinh,
			String maHuyen, long maTramCap, long userId, int start, int end)
			throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil
					.get(FINDER_XA_KHONG_IN_HUYEN_THUOC_TRAM_CAP_CUA_NGUOI_DUNG);
			
			if (userId == 0) {
				sql = StringUtil.replace(sql, "NOT IN", " IN");
			}

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DATAITEM", DATAITEMImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);
			qPos.add(maHuyen);
			qPos.add(maTinh);
			qPos.add(maHuyen);
			qPos.add(maTramCap);

			qPos.add(userId);

			return (List<DATAITEM>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	private List<DATAITEM> _finderHuyenInTram(String maTinh, long maTramCap,
			int start, int end) throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FINDER_HUYEN_IN_TRAMCAP_SQL);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DATAITEM", DATAITEMImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

			qPos.add(maTramCap);

			return (List<DATAITEM>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	private List<DATAITEM> _finderXaInHuyenTram(String maTinh, String maHuyen,
			long maTramCap, int start, int end) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FINDER_XA_IN_TRAMCAP_HUYEN_SQL);

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("DATAITEM", DATAITEMImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maHuyen);

			qPos.add(maTinh);

			qPos.add(maTramCap);

			qPos.add(maHuyen);

			return (List<DATAITEM>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	/**
	 * @param maTinh
	 * @param maTramCap
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public List<UserMapping> finderUserInTramCap(String maTinh,
			String maTramCap, int start, int end) throws PortalException,
			SystemException {
		return finderU_IN_T_C(maTinh, maTramCap, start, end);
	}

	private List<UserMapping> finderU_IN_T_C(String maTinh, String maTramCap,
			int start, int end) throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FINDER_USER_SQL);

			if (Validator.isNull(maTramCap)) {
				sql = StringUtil.replace(sql,
						"AND me_diabanqly_tramcap.maTramCap = ?",
						StringPool.BLANK);
			}

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("UserMapping", UserMappingImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

			if (Validator.isNotNull(maTramCap)) {
				qPos.add(maTramCap);
			}

			return (List<UserMapping>) QueryUtil.list(q, getDialect(), start,
					end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	/**
	 * get tramCapNuoc by UserId (thong qua bang phan quyen tram cap)
	 * 
	 * @param userId
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public List<TramCapNuoc> finderByUserId(String maTinh, long userId,
			int start, int end) throws PortalException, SystemException {
		return finder(maTinh, userId, start, end);
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
	public int countByUserId(String maTinh, long userId)
			throws PortalException, SystemException {
		return count(maTinh, userId);
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
	private List<TramCapNuoc> finder(String maTinh, long userId, int start,
			int end) throws PortalException, SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FINDER_TRAMCAP_SQL);

			if (userId == 0) {
				sql = StringUtil.replace(sql, "AND userId = ?",
						StringPool.BLANK);
			}

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity("TramCapNuoc", TramCapNuocImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(maTinh);

			if (userId != 0) {
				qPos.add(userId);
			}

			return (List<TramCapNuoc>) QueryUtil.list(q, getDialect(), start,
					end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	/**
	 * @param maTinh
	 * @param userId
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	private int count(String maTinh, long userId) throws PortalException,
			SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_TRAMCAP_SQL);

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

}
