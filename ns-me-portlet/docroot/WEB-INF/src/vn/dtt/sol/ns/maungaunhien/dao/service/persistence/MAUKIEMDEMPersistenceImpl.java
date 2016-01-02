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

package vn.dtt.sol.ns.maungaunhien.dao.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException;
import vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM;
import vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMImpl;
import vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the m a u k i e m d e m service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see MAUKIEMDEMPersistence
 * @see MAUKIEMDEMUtil
 * @generated
 */
public class MAUKIEMDEMPersistenceImpl extends BasePersistenceImpl<MAUKIEMDEM>
	implements MAUKIEMDEMPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MAUKIEMDEMUtil} to access the m a u k i e m d e m persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MAUKIEMDEMImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMModelImpl.FINDER_CACHE_ENABLED, MAUKIEMDEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMModelImpl.FINDER_CACHE_ENABLED, MAUKIEMDEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_T_H_X_N = new FinderPath(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMModelImpl.FINDER_CACHE_ENABLED, MAUKIEMDEMImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByT_H_X_N",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			MAUKIEMDEMModelImpl.MATINH_COLUMN_BITMASK |
			MAUKIEMDEMModelImpl.MAHUYEN_COLUMN_BITMASK |
			MAUKIEMDEMModelImpl.MAXA_COLUMN_BITMASK |
			MAUKIEMDEMModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_H_X_N = new FinderPath(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_H_X_N",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns the m a u k i e m d e m where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and nam = &#63; or throws a {@link vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException} if it could not be found.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param nam the nam
	 * @return the matching m a u k i e m d e m
	 * @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM findByT_H_X_N(String maTinh, String maHuyen, String maXa,
		int nam) throws NoSuchMAUKIEMDEMException, SystemException {
		MAUKIEMDEM maukiemdem = fetchByT_H_X_N(maTinh, maHuyen, maXa, nam);

		if (maukiemdem == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maTinh=");
			msg.append(maTinh);

			msg.append(", maHuyen=");
			msg.append(maHuyen);

			msg.append(", maXa=");
			msg.append(maXa);

			msg.append(", nam=");
			msg.append(nam);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMAUKIEMDEMException(msg.toString());
		}

		return maukiemdem;
	}

	/**
	 * Returns the m a u k i e m d e m where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param nam the nam
	 * @return the matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM fetchByT_H_X_N(String maTinh, String maHuyen,
		String maXa, int nam) throws SystemException {
		return fetchByT_H_X_N(maTinh, maHuyen, maXa, nam, true);
	}

	/**
	 * Returns the m a u k i e m d e m where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param nam the nam
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM fetchByT_H_X_N(String maTinh, String maHuyen,
		String maXa, int nam, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { maTinh, maHuyen, maXa, nam };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_T_H_X_N,
					finderArgs, this);
		}

		if (result instanceof MAUKIEMDEM) {
			MAUKIEMDEM maukiemdem = (MAUKIEMDEM)result;

			if (!Validator.equals(maTinh, maukiemdem.getMaTinh()) ||
					!Validator.equals(maHuyen, maukiemdem.getMaHuyen()) ||
					!Validator.equals(maXa, maukiemdem.getMaXa()) ||
					(nam != maukiemdem.getNam())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_MAUKIEMDEM_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_H_X_N_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_X_N_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_H_X_N_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_T_H_X_N_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_X_N_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_T_H_X_N_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_T_H_X_N_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_X_N_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_T_H_X_N_MAXA_2);
			}

			query.append(_FINDER_COLUMN_T_H_X_N_NAM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				qPos.add(nam);

				List<MAUKIEMDEM> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_H_X_N,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MAUKIEMDEMPersistenceImpl.fetchByT_H_X_N(String, String, String, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MAUKIEMDEM maukiemdem = list.get(0);

					result = maukiemdem;

					cacheResult(maukiemdem);

					if ((maukiemdem.getMaTinh() == null) ||
							!maukiemdem.getMaTinh().equals(maTinh) ||
							(maukiemdem.getMaHuyen() == null) ||
							!maukiemdem.getMaHuyen().equals(maHuyen) ||
							(maukiemdem.getMaXa() == null) ||
							!maukiemdem.getMaXa().equals(maXa) ||
							(maukiemdem.getNam() != nam)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_H_X_N,
							finderArgs, maukiemdem);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_T_H_X_N,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MAUKIEMDEM)result;
		}
	}

	/**
	 * Removes the m a u k i e m d e m where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and nam = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param nam the nam
	 * @return the m a u k i e m d e m that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM removeByT_H_X_N(String maTinh, String maHuyen,
		String maXa, int nam) throws NoSuchMAUKIEMDEMException, SystemException {
		MAUKIEMDEM maukiemdem = findByT_H_X_N(maTinh, maHuyen, maXa, nam);

		return remove(maukiemdem);
	}

	/**
	 * Returns the number of m a u k i e m d e ms where maTinh = &#63; and maHuyen = &#63; and maXa = &#63; and nam = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param nam the nam
	 * @return the number of matching m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_H_X_N(String maTinh, String maHuyen, String maXa,
		int nam) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_H_X_N;

		Object[] finderArgs = new Object[] { maTinh, maHuyen, maXa, nam };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_MAUKIEMDEM_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_H_X_N_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_X_N_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_H_X_N_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_T_H_X_N_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_X_N_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_T_H_X_N_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_T_H_X_N_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_X_N_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_T_H_X_N_MAXA_2);
			}

			query.append(_FINDER_COLUMN_T_H_X_N_NAM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				qPos.add(nam);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_T_H_X_N_MATINH_1 = "maukiemdem.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_T_H_X_N_MATINH_2 = "maukiemdem.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_T_H_X_N_MATINH_3 = "(maukiemdem.maTinh IS NULL OR maukiemdem.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_T_H_X_N_MAHUYEN_1 = "maukiemdem.maHuyen IS NULL AND ";
	private static final String _FINDER_COLUMN_T_H_X_N_MAHUYEN_2 = "maukiemdem.maHuyen = ? AND ";
	private static final String _FINDER_COLUMN_T_H_X_N_MAHUYEN_3 = "(maukiemdem.maHuyen IS NULL OR maukiemdem.maHuyen = '') AND ";
	private static final String _FINDER_COLUMN_T_H_X_N_MAXA_1 = "maukiemdem.maXa IS NULL AND ";
	private static final String _FINDER_COLUMN_T_H_X_N_MAXA_2 = "maukiemdem.maXa = ? AND ";
	private static final String _FINDER_COLUMN_T_H_X_N_MAXA_3 = "(maukiemdem.maXa IS NULL OR maukiemdem.maXa = '') AND ";
	private static final String _FINDER_COLUMN_T_H_X_N_NAM_2 = "maukiemdem.nam = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_ = new FinderPath(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMModelImpl.FINDER_CACHE_ENABLED, MAUKIEMDEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByT_",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_ = new FinderPath(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMModelImpl.FINDER_CACHE_ENABLED, MAUKIEMDEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_",
			new String[] { String.class.getName() },
			MAUKIEMDEMModelImpl.MATINH_COLUMN_BITMASK |
			MAUKIEMDEMModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_ = new FinderPath(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_",
			new String[] { String.class.getName() });

	/**
	 * Returns all the m a u k i e m d e ms where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the matching m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MAUKIEMDEM> findByT_(String maTinh) throws SystemException {
		return findByT_(maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the m a u k i e m d e ms where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of m a u k i e m d e ms
	 * @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	 * @return the range of matching m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MAUKIEMDEM> findByT_(String maTinh, int start, int end)
		throws SystemException {
		return findByT_(maTinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the m a u k i e m d e ms where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of m a u k i e m d e ms
	 * @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MAUKIEMDEM> findByT_(String maTinh, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_;
			finderArgs = new Object[] { maTinh };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_;
			finderArgs = new Object[] { maTinh, start, end, orderByComparator };
		}

		List<MAUKIEMDEM> list = (List<MAUKIEMDEM>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MAUKIEMDEM maukiemdem : list) {
				if (!Validator.equals(maTinh, maukiemdem.getMaTinh())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MAUKIEMDEM_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T__MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T__MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T__MATINH_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MAUKIEMDEMModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				if (!pagination) {
					list = (List<MAUKIEMDEM>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MAUKIEMDEM>(list);
				}
				else {
					list = (List<MAUKIEMDEM>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first m a u k i e m d e m in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching m a u k i e m d e m
	 * @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM findByT__First(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchMAUKIEMDEMException, SystemException {
		MAUKIEMDEM maukiemdem = fetchByT__First(maTinh, orderByComparator);

		if (maukiemdem != null) {
			return maukiemdem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMAUKIEMDEMException(msg.toString());
	}

	/**
	 * Returns the first m a u k i e m d e m in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM fetchByT__First(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		List<MAUKIEMDEM> list = findByT_(maTinh, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last m a u k i e m d e m in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching m a u k i e m d e m
	 * @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM findByT__Last(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchMAUKIEMDEMException, SystemException {
		MAUKIEMDEM maukiemdem = fetchByT__Last(maTinh, orderByComparator);

		if (maukiemdem != null) {
			return maukiemdem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMAUKIEMDEMException(msg.toString());
	}

	/**
	 * Returns the last m a u k i e m d e m in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM fetchByT__Last(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByT_(maTinh);

		if (count == 0) {
			return null;
		}

		List<MAUKIEMDEM> list = findByT_(maTinh, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the m a u k i e m d e ms before and after the current m a u k i e m d e m in the ordered set where maTinh = &#63;.
	 *
	 * @param id the primary key of the current m a u k i e m d e m
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next m a u k i e m d e m
	 * @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a m a u k i e m d e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM[] findByT__PrevAndNext(long id, String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchMAUKIEMDEMException, SystemException {
		MAUKIEMDEM maukiemdem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MAUKIEMDEM[] array = new MAUKIEMDEMImpl[3];

			array[0] = getByT__PrevAndNext(session, maukiemdem, maTinh,
					orderByComparator, true);

			array[1] = maukiemdem;

			array[2] = getByT__PrevAndNext(session, maukiemdem, maTinh,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MAUKIEMDEM getByT__PrevAndNext(Session session,
		MAUKIEMDEM maukiemdem, String maTinh,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MAUKIEMDEM_WHERE);

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T__MATINH_1);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T__MATINH_3);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T__MATINH_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MAUKIEMDEMModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaTinh) {
			qPos.add(maTinh);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(maukiemdem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MAUKIEMDEM> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the m a u k i e m d e ms where maTinh = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_(String maTinh) throws SystemException {
		for (MAUKIEMDEM maukiemdem : findByT_(maTinh, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(maukiemdem);
		}
	}

	/**
	 * Returns the number of m a u k i e m d e ms where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the number of matching m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_(String maTinh) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_;

		Object[] finderArgs = new Object[] { maTinh };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MAUKIEMDEM_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T__MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T__MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T__MATINH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_T__MATINH_1 = "maukiemdem.maTinh IS NULL";
	private static final String _FINDER_COLUMN_T__MATINH_2 = "maukiemdem.maTinh = ?";
	private static final String _FINDER_COLUMN_T__MATINH_3 = "(maukiemdem.maTinh IS NULL OR maukiemdem.maTinh = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_H_ = new FinderPath(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMModelImpl.FINDER_CACHE_ENABLED, MAUKIEMDEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByH_",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_H_ = new FinderPath(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMModelImpl.FINDER_CACHE_ENABLED, MAUKIEMDEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByH_",
			new String[] { String.class.getName() },
			MAUKIEMDEMModelImpl.MAHUYEN_COLUMN_BITMASK |
			MAUKIEMDEMModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_H_ = new FinderPath(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByH_",
			new String[] { String.class.getName() });

	/**
	 * Returns all the m a u k i e m d e ms where maHuyen = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @return the matching m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MAUKIEMDEM> findByH_(String maHuyen) throws SystemException {
		return findByH_(maHuyen, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the m a u k i e m d e ms where maHuyen = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maHuyen the ma huyen
	 * @param start the lower bound of the range of m a u k i e m d e ms
	 * @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	 * @return the range of matching m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MAUKIEMDEM> findByH_(String maHuyen, int start, int end)
		throws SystemException {
		return findByH_(maHuyen, start, end, null);
	}

	/**
	 * Returns an ordered range of all the m a u k i e m d e ms where maHuyen = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maHuyen the ma huyen
	 * @param start the lower bound of the range of m a u k i e m d e ms
	 * @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MAUKIEMDEM> findByH_(String maHuyen, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_H_;
			finderArgs = new Object[] { maHuyen };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_H_;
			finderArgs = new Object[] { maHuyen, start, end, orderByComparator };
		}

		List<MAUKIEMDEM> list = (List<MAUKIEMDEM>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MAUKIEMDEM maukiemdem : list) {
				if (!Validator.equals(maHuyen, maukiemdem.getMaHuyen())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MAUKIEMDEM_WHERE);

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_H__MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_H__MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_H__MAHUYEN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MAUKIEMDEMModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (!pagination) {
					list = (List<MAUKIEMDEM>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MAUKIEMDEM>(list);
				}
				else {
					list = (List<MAUKIEMDEM>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching m a u k i e m d e m
	 * @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM findByH__First(String maHuyen,
		OrderByComparator orderByComparator)
		throws NoSuchMAUKIEMDEMException, SystemException {
		MAUKIEMDEM maukiemdem = fetchByH__First(maHuyen, orderByComparator);

		if (maukiemdem != null) {
			return maukiemdem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maHuyen=");
		msg.append(maHuyen);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMAUKIEMDEMException(msg.toString());
	}

	/**
	 * Returns the first m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM fetchByH__First(String maHuyen,
		OrderByComparator orderByComparator) throws SystemException {
		List<MAUKIEMDEM> list = findByH_(maHuyen, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching m a u k i e m d e m
	 * @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a matching m a u k i e m d e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM findByH__Last(String maHuyen,
		OrderByComparator orderByComparator)
		throws NoSuchMAUKIEMDEMException, SystemException {
		MAUKIEMDEM maukiemdem = fetchByH__Last(maHuyen, orderByComparator);

		if (maukiemdem != null) {
			return maukiemdem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maHuyen=");
		msg.append(maHuyen);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMAUKIEMDEMException(msg.toString());
	}

	/**
	 * Returns the last m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching m a u k i e m d e m, or <code>null</code> if a matching m a u k i e m d e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM fetchByH__Last(String maHuyen,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByH_(maHuyen);

		if (count == 0) {
			return null;
		}

		List<MAUKIEMDEM> list = findByH_(maHuyen, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the m a u k i e m d e ms before and after the current m a u k i e m d e m in the ordered set where maHuyen = &#63;.
	 *
	 * @param id the primary key of the current m a u k i e m d e m
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next m a u k i e m d e m
	 * @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a m a u k i e m d e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM[] findByH__PrevAndNext(long id, String maHuyen,
		OrderByComparator orderByComparator)
		throws NoSuchMAUKIEMDEMException, SystemException {
		MAUKIEMDEM maukiemdem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MAUKIEMDEM[] array = new MAUKIEMDEMImpl[3];

			array[0] = getByH__PrevAndNext(session, maukiemdem, maHuyen,
					orderByComparator, true);

			array[1] = maukiemdem;

			array[2] = getByH__PrevAndNext(session, maukiemdem, maHuyen,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MAUKIEMDEM getByH__PrevAndNext(Session session,
		MAUKIEMDEM maukiemdem, String maHuyen,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MAUKIEMDEM_WHERE);

		boolean bindMaHuyen = false;

		if (maHuyen == null) {
			query.append(_FINDER_COLUMN_H__MAHUYEN_1);
		}
		else if (maHuyen.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_H__MAHUYEN_3);
		}
		else {
			bindMaHuyen = true;

			query.append(_FINDER_COLUMN_H__MAHUYEN_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MAUKIEMDEMModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaHuyen) {
			qPos.add(maHuyen);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(maukiemdem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MAUKIEMDEM> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the m a u k i e m d e ms where maHuyen = &#63; from the database.
	 *
	 * @param maHuyen the ma huyen
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByH_(String maHuyen) throws SystemException {
		for (MAUKIEMDEM maukiemdem : findByH_(maHuyen, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(maukiemdem);
		}
	}

	/**
	 * Returns the number of m a u k i e m d e ms where maHuyen = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @return the number of matching m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByH_(String maHuyen) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_H_;

		Object[] finderArgs = new Object[] { maHuyen };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MAUKIEMDEM_WHERE);

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_H__MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_H__MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_H__MAHUYEN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_H__MAHUYEN_1 = "maukiemdem.maHuyen IS NULL";
	private static final String _FINDER_COLUMN_H__MAHUYEN_2 = "maukiemdem.maHuyen = ?";
	private static final String _FINDER_COLUMN_H__MAHUYEN_3 = "(maukiemdem.maHuyen IS NULL OR maukiemdem.maHuyen = '')";

	public MAUKIEMDEMPersistenceImpl() {
		setModelClass(MAUKIEMDEM.class);
	}

	/**
	 * Caches the m a u k i e m d e m in the entity cache if it is enabled.
	 *
	 * @param maukiemdem the m a u k i e m d e m
	 */
	@Override
	public void cacheResult(MAUKIEMDEM maukiemdem) {
		EntityCacheUtil.putResult(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMImpl.class, maukiemdem.getPrimaryKey(), maukiemdem);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_H_X_N,
			new Object[] {
				maukiemdem.getMaTinh(), maukiemdem.getMaHuyen(),
				maukiemdem.getMaXa(), maukiemdem.getNam()
			}, maukiemdem);

		maukiemdem.resetOriginalValues();
	}

	/**
	 * Caches the m a u k i e m d e ms in the entity cache if it is enabled.
	 *
	 * @param maukiemdems the m a u k i e m d e ms
	 */
	@Override
	public void cacheResult(List<MAUKIEMDEM> maukiemdems) {
		for (MAUKIEMDEM maukiemdem : maukiemdems) {
			if (EntityCacheUtil.getResult(
						MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
						MAUKIEMDEMImpl.class, maukiemdem.getPrimaryKey()) == null) {
				cacheResult(maukiemdem);
			}
			else {
				maukiemdem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all m a u k i e m d e ms.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MAUKIEMDEMImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MAUKIEMDEMImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the m a u k i e m d e m.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MAUKIEMDEM maukiemdem) {
		EntityCacheUtil.removeResult(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMImpl.class, maukiemdem.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(maukiemdem);
	}

	@Override
	public void clearCache(List<MAUKIEMDEM> maukiemdems) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MAUKIEMDEM maukiemdem : maukiemdems) {
			EntityCacheUtil.removeResult(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
				MAUKIEMDEMImpl.class, maukiemdem.getPrimaryKey());

			clearUniqueFindersCache(maukiemdem);
		}
	}

	protected void cacheUniqueFindersCache(MAUKIEMDEM maukiemdem) {
		if (maukiemdem.isNew()) {
			Object[] args = new Object[] {
					maukiemdem.getMaTinh(), maukiemdem.getMaHuyen(),
					maukiemdem.getMaXa(), maukiemdem.getNam()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_T_H_X_N, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_H_X_N, args,
				maukiemdem);
		}
		else {
			MAUKIEMDEMModelImpl maukiemdemModelImpl = (MAUKIEMDEMModelImpl)maukiemdem;

			if ((maukiemdemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_T_H_X_N.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						maukiemdem.getMaTinh(), maukiemdem.getMaHuyen(),
						maukiemdem.getMaXa(), maukiemdem.getNam()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_T_H_X_N, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_H_X_N, args,
					maukiemdem);
			}
		}
	}

	protected void clearUniqueFindersCache(MAUKIEMDEM maukiemdem) {
		MAUKIEMDEMModelImpl maukiemdemModelImpl = (MAUKIEMDEMModelImpl)maukiemdem;

		Object[] args = new Object[] {
				maukiemdem.getMaTinh(), maukiemdem.getMaHuyen(),
				maukiemdem.getMaXa(), maukiemdem.getNam()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_H_X_N, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_T_H_X_N, args);

		if ((maukiemdemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_T_H_X_N.getColumnBitmask()) != 0) {
			args = new Object[] {
					maukiemdemModelImpl.getOriginalMaTinh(),
					maukiemdemModelImpl.getOriginalMaHuyen(),
					maukiemdemModelImpl.getOriginalMaXa(),
					maukiemdemModelImpl.getOriginalNam()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_H_X_N, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_T_H_X_N, args);
		}
	}

	/**
	 * Creates a new m a u k i e m d e m with the primary key. Does not add the m a u k i e m d e m to the database.
	 *
	 * @param id the primary key for the new m a u k i e m d e m
	 * @return the new m a u k i e m d e m
	 */
	@Override
	public MAUKIEMDEM create(long id) {
		MAUKIEMDEM maukiemdem = new MAUKIEMDEMImpl();

		maukiemdem.setNew(true);
		maukiemdem.setPrimaryKey(id);

		return maukiemdem;
	}

	/**
	 * Removes the m a u k i e m d e m with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the m a u k i e m d e m
	 * @return the m a u k i e m d e m that was removed
	 * @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a m a u k i e m d e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM remove(long id)
		throws NoSuchMAUKIEMDEMException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the m a u k i e m d e m with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the m a u k i e m d e m
	 * @return the m a u k i e m d e m that was removed
	 * @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a m a u k i e m d e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM remove(Serializable primaryKey)
		throws NoSuchMAUKIEMDEMException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MAUKIEMDEM maukiemdem = (MAUKIEMDEM)session.get(MAUKIEMDEMImpl.class,
					primaryKey);

			if (maukiemdem == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMAUKIEMDEMException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(maukiemdem);
		}
		catch (NoSuchMAUKIEMDEMException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected MAUKIEMDEM removeImpl(MAUKIEMDEM maukiemdem)
		throws SystemException {
		maukiemdem = toUnwrappedModel(maukiemdem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(maukiemdem)) {
				maukiemdem = (MAUKIEMDEM)session.get(MAUKIEMDEMImpl.class,
						maukiemdem.getPrimaryKeyObj());
			}

			if (maukiemdem != null) {
				session.delete(maukiemdem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (maukiemdem != null) {
			clearCache(maukiemdem);
		}

		return maukiemdem;
	}

	@Override
	public MAUKIEMDEM updateImpl(
		vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM maukiemdem)
		throws SystemException {
		maukiemdem = toUnwrappedModel(maukiemdem);

		boolean isNew = maukiemdem.isNew();

		MAUKIEMDEMModelImpl maukiemdemModelImpl = (MAUKIEMDEMModelImpl)maukiemdem;

		Session session = null;

		try {
			session = openSession();

			if (maukiemdem.isNew()) {
				session.save(maukiemdem);

				maukiemdem.setNew(false);
			}
			else {
				session.merge(maukiemdem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MAUKIEMDEMModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((maukiemdemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						maukiemdemModelImpl.getOriginalMaTinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_,
					args);

				args = new Object[] { maukiemdemModelImpl.getMaTinh() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_,
					args);
			}

			if ((maukiemdemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_H_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						maukiemdemModelImpl.getOriginalMaHuyen()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_H_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_H_,
					args);

				args = new Object[] { maukiemdemModelImpl.getMaHuyen() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_H_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_H_,
					args);
			}
		}

		EntityCacheUtil.putResult(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
			MAUKIEMDEMImpl.class, maukiemdem.getPrimaryKey(), maukiemdem);

		clearUniqueFindersCache(maukiemdem);
		cacheUniqueFindersCache(maukiemdem);

		return maukiemdem;
	}

	protected MAUKIEMDEM toUnwrappedModel(MAUKIEMDEM maukiemdem) {
		if (maukiemdem instanceof MAUKIEMDEMImpl) {
			return maukiemdem;
		}

		MAUKIEMDEMImpl maukiemdemImpl = new MAUKIEMDEMImpl();

		maukiemdemImpl.setNew(maukiemdem.isNew());
		maukiemdemImpl.setPrimaryKey(maukiemdem.getPrimaryKey());

		maukiemdemImpl.setId(maukiemdem.getId());
		maukiemdemImpl.setMaXa(maukiemdem.getMaXa());
		maukiemdemImpl.setMaTinh(maukiemdem.getMaTinh());
		maukiemdemImpl.setMaHuyen(maukiemdem.getMaHuyen());
		maukiemdemImpl.setNam(maukiemdem.getNam());
		maukiemdemImpl.setTongSoHGD(maukiemdem.getTongSoHGD());
		maukiemdemImpl.setSoMauNgauNhien(maukiemdem.getSoMauNgauNhien());
		maukiemdemImpl.setSoMauDuPhong(maukiemdem.getSoMauDuPhong());
		maukiemdemImpl.setTongSoMau(maukiemdem.getTongSoMau());
		maukiemdemImpl.setSoMauHVS(maukiemdem.getSoMauHVS());
		maukiemdemImpl.setSoMauCoNhaTieu(maukiemdem.getSoMauCoNhaTieu());
		maukiemdemImpl.setSoMauKiemDem(maukiemdem.getSoMauKiemDem());
		maukiemdemImpl.setNgayTao(maukiemdem.getNgayTao());
		maukiemdemImpl.setUserId(maukiemdem.getUserId());

		return maukiemdemImpl;
	}

	/**
	 * Returns the m a u k i e m d e m with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the m a u k i e m d e m
	 * @return the m a u k i e m d e m
	 * @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a m a u k i e m d e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMAUKIEMDEMException, SystemException {
		MAUKIEMDEM maukiemdem = fetchByPrimaryKey(primaryKey);

		if (maukiemdem == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMAUKIEMDEMException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return maukiemdem;
	}

	/**
	 * Returns the m a u k i e m d e m with the primary key or throws a {@link vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException} if it could not be found.
	 *
	 * @param id the primary key of the m a u k i e m d e m
	 * @return the m a u k i e m d e m
	 * @throws vn.dtt.sol.ns.maungaunhien.dao.NoSuchMAUKIEMDEMException if a m a u k i e m d e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM findByPrimaryKey(long id)
		throws NoSuchMAUKIEMDEMException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the m a u k i e m d e m with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the m a u k i e m d e m
	 * @return the m a u k i e m d e m, or <code>null</code> if a m a u k i e m d e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MAUKIEMDEM maukiemdem = (MAUKIEMDEM)EntityCacheUtil.getResult(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
				MAUKIEMDEMImpl.class, primaryKey);

		if (maukiemdem == _nullMAUKIEMDEM) {
			return null;
		}

		if (maukiemdem == null) {
			Session session = null;

			try {
				session = openSession();

				maukiemdem = (MAUKIEMDEM)session.get(MAUKIEMDEMImpl.class,
						primaryKey);

				if (maukiemdem != null) {
					cacheResult(maukiemdem);
				}
				else {
					EntityCacheUtil.putResult(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
						MAUKIEMDEMImpl.class, primaryKey, _nullMAUKIEMDEM);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MAUKIEMDEMModelImpl.ENTITY_CACHE_ENABLED,
					MAUKIEMDEMImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return maukiemdem;
	}

	/**
	 * Returns the m a u k i e m d e m with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the m a u k i e m d e m
	 * @return the m a u k i e m d e m, or <code>null</code> if a m a u k i e m d e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MAUKIEMDEM fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the m a u k i e m d e ms.
	 *
	 * @return the m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MAUKIEMDEM> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the m a u k i e m d e ms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of m a u k i e m d e ms
	 * @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	 * @return the range of m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MAUKIEMDEM> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the m a u k i e m d e ms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.maungaunhien.dao.model.impl.MAUKIEMDEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of m a u k i e m d e ms
	 * @param end the upper bound of the range of m a u k i e m d e ms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MAUKIEMDEM> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<MAUKIEMDEM> list = (List<MAUKIEMDEM>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MAUKIEMDEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MAUKIEMDEM;

				if (pagination) {
					sql = sql.concat(MAUKIEMDEMModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MAUKIEMDEM>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MAUKIEMDEM>(list);
				}
				else {
					list = (List<MAUKIEMDEM>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the m a u k i e m d e ms from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MAUKIEMDEM maukiemdem : findAll()) {
			remove(maukiemdem);
		}
	}

	/**
	 * Returns the number of m a u k i e m d e ms.
	 *
	 * @return the number of m a u k i e m d e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MAUKIEMDEM);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the m a u k i e m d e m persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.maungaunhien.dao.model.MAUKIEMDEM")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MAUKIEMDEM>> listenersList = new ArrayList<ModelListener<MAUKIEMDEM>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MAUKIEMDEM>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(MAUKIEMDEMImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MAUKIEMDEM = "SELECT maukiemdem FROM MAUKIEMDEM maukiemdem";
	private static final String _SQL_SELECT_MAUKIEMDEM_WHERE = "SELECT maukiemdem FROM MAUKIEMDEM maukiemdem WHERE ";
	private static final String _SQL_COUNT_MAUKIEMDEM = "SELECT COUNT(maukiemdem) FROM MAUKIEMDEM maukiemdem";
	private static final String _SQL_COUNT_MAUKIEMDEM_WHERE = "SELECT COUNT(maukiemdem) FROM MAUKIEMDEM maukiemdem WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "maukiemdem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MAUKIEMDEM exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MAUKIEMDEM exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MAUKIEMDEMPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maXa", "maTinh", "maHuyen", "nam", "tongSoHGD",
				"soMauNgauNhien", "soMauDuPhong", "tongSoMau", "soMauHVS",
				"soMauCoNhaTieu", "soMauKiemDem", "ngayTao", "userId"
			});
	private static MAUKIEMDEM _nullMAUKIEMDEM = new MAUKIEMDEMImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MAUKIEMDEM> toCacheModel() {
				return _nullMAUKIEMDEMCacheModel;
			}
		};

	private static CacheModel<MAUKIEMDEM> _nullMAUKIEMDEMCacheModel = new CacheModel<MAUKIEMDEM>() {
			@Override
			public MAUKIEMDEM toEntityModel() {
				return _nullMAUKIEMDEM;
			}
		};
}