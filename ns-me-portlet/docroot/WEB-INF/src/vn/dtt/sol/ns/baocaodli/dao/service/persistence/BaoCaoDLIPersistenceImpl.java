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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
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
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException;
import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI;
import vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIImpl;
import vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the bao cao d l i service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HuyMQ
 * @see BaoCaoDLIPersistence
 * @see BaoCaoDLIUtil
 * @generated
 */
public class BaoCaoDLIPersistenceImpl extends BasePersistenceImpl<BaoCaoDLI>
	implements BaoCaoDLIPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BaoCaoDLIUtil} to access the bao cao d l i persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BaoCaoDLIImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, BaoCaoDLIImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, BaoCaoDLIImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_ID = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, BaoCaoDLIImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByID",
			new String[] { Long.class.getName() },
			BaoCaoDLIModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByID",
			new String[] { Long.class.getName() });

	/**
	 * Returns the bao cao d l i where id = &#63; or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException} if it could not be found.
	 *
	 * @param id the ID
	 * @return the matching bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI findByID(long id)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = fetchByID(id);

		if (baoCaoDLI == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id=");
			msg.append(id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchBaoCaoDLIException(msg.toString());
		}

		return baoCaoDLI;
	}

	/**
	 * Returns the bao cao d l i where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id the ID
	 * @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByID(long id) throws SystemException {
		return fetchByID(id, true);
	}

	/**
	 * Returns the bao cao d l i where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id the ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByID(long id, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { id };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ID,
					finderArgs, this);
		}

		if (result instanceof BaoCaoDLI) {
			BaoCaoDLI baoCaoDLI = (BaoCaoDLI)result;

			if ((id != baoCaoDLI.getId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_BAOCAODLI_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				List<BaoCaoDLI> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"BaoCaoDLIPersistenceImpl.fetchByID(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					BaoCaoDLI baoCaoDLI = list.get(0);

					result = baoCaoDLI;

					cacheResult(baoCaoDLI);

					if ((baoCaoDLI.getId() != id)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
							finderArgs, baoCaoDLI);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, finderArgs);

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
			return (BaoCaoDLI)result;
		}
	}

	/**
	 * Removes the bao cao d l i where id = &#63; from the database.
	 *
	 * @param id the ID
	 * @return the bao cao d l i that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI removeByID(long id)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = findByID(id);

		return remove(baoCaoDLI);
	}

	/**
	 * Returns the number of bao cao d l is where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByID(long id) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BAOCAODLI_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "baoCaoDLI.id = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_MATINH_NAM = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, BaoCaoDLIImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMaTinh_Nam",
			new String[] { String.class.getName(), Integer.class.getName() },
			BaoCaoDLIModelImpl.MATINH_COLUMN_BITMASK |
			BaoCaoDLIModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MATINH_NAM = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaTinh_Nam",
			new String[] { String.class.getName(), Integer.class.getName() });

	/**
	 * Returns the bao cao d l i where maTinh = &#63; and nam = &#63; or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException} if it could not be found.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @return the matching bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI findByMaTinh_Nam(String maTinh, int nam)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = fetchByMaTinh_Nam(maTinh, nam);

		if (baoCaoDLI == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maTinh=");
			msg.append(maTinh);

			msg.append(", nam=");
			msg.append(nam);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchBaoCaoDLIException(msg.toString());
		}

		return baoCaoDLI;
	}

	/**
	 * Returns the bao cao d l i where maTinh = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByMaTinh_Nam(String maTinh, int nam)
		throws SystemException {
		return fetchByMaTinh_Nam(maTinh, nam, true);
	}

	/**
	 * Returns the bao cao d l i where maTinh = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByMaTinh_Nam(String maTinh, int nam,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maTinh, nam };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MATINH_NAM,
					finderArgs, this);
		}

		if (result instanceof BaoCaoDLI) {
			BaoCaoDLI baoCaoDLI = (BaoCaoDLI)result;

			if (!Validator.equals(maTinh, baoCaoDLI.getMaTinh()) ||
					(nam != baoCaoDLI.getNam())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_BAOCAODLI_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_MATINH_NAM_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATINH_NAM_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_MATINH_NAM_MATINH_2);
			}

			query.append(_FINDER_COLUMN_MATINH_NAM_NAM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				qPos.add(nam);

				List<BaoCaoDLI> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"BaoCaoDLIPersistenceImpl.fetchByMaTinh_Nam(String, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					BaoCaoDLI baoCaoDLI = list.get(0);

					result = baoCaoDLI;

					cacheResult(baoCaoDLI);

					if ((baoCaoDLI.getMaTinh() == null) ||
							!baoCaoDLI.getMaTinh().equals(maTinh) ||
							(baoCaoDLI.getNam() != nam)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM,
							finderArgs, baoCaoDLI);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATINH_NAM,
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
			return (BaoCaoDLI)result;
		}
	}

	/**
	 * Removes the bao cao d l i where maTinh = &#63; and nam = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @return the bao cao d l i that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI removeByMaTinh_Nam(String maTinh, int nam)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = findByMaTinh_Nam(maTinh, nam);

		return remove(baoCaoDLI);
	}

	/**
	 * Returns the number of bao cao d l is where maTinh = &#63; and nam = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @return the number of matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaTinh_Nam(String maTinh, int nam)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MATINH_NAM;

		Object[] finderArgs = new Object[] { maTinh, nam };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_BAOCAODLI_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_MATINH_NAM_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATINH_NAM_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_MATINH_NAM_MATINH_2);
			}

			query.append(_FINDER_COLUMN_MATINH_NAM_NAM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTinh) {
					qPos.add(maTinh);
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

	private static final String _FINDER_COLUMN_MATINH_NAM_MATINH_1 = "baoCaoDLI.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_MATINH_NAM_MATINH_2 = "baoCaoDLI.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_MATINH_NAM_MATINH_3 = "(baoCaoDLI.maTinh IS NULL OR baoCaoDLI.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_MATINH_NAM_NAM_2 = "baoCaoDLI.nam = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_MATINH_NAM_LOAIBAOCAO = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, BaoCaoDLIImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMaTinh_Nam_LoaiBaoCao",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			BaoCaoDLIModelImpl.MATINH_COLUMN_BITMASK |
			BaoCaoDLIModelImpl.NAM_COLUMN_BITMASK |
			BaoCaoDLIModelImpl.LOAIBAOCAO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MATINH_NAM_LOAIBAOCAO = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMaTinh_Nam_LoaiBaoCao",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns the bao cao d l i where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63; or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException} if it could not be found.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @param loaiBaoCao the loai bao cao
	 * @return the matching bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI findByMaTinh_Nam_LoaiBaoCao(String maTinh, int nam,
		int loaiBaoCao) throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = fetchByMaTinh_Nam_LoaiBaoCao(maTinh, nam,
				loaiBaoCao);

		if (baoCaoDLI == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maTinh=");
			msg.append(maTinh);

			msg.append(", nam=");
			msg.append(nam);

			msg.append(", loaiBaoCao=");
			msg.append(loaiBaoCao);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchBaoCaoDLIException(msg.toString());
		}

		return baoCaoDLI;
	}

	/**
	 * Returns the bao cao d l i where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @param loaiBaoCao the loai bao cao
	 * @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByMaTinh_Nam_LoaiBaoCao(String maTinh, int nam,
		int loaiBaoCao) throws SystemException {
		return fetchByMaTinh_Nam_LoaiBaoCao(maTinh, nam, loaiBaoCao, true);
	}

	/**
	 * Returns the bao cao d l i where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @param loaiBaoCao the loai bao cao
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByMaTinh_Nam_LoaiBaoCao(String maTinh, int nam,
		int loaiBaoCao, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maTinh, nam, loaiBaoCao };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MATINH_NAM_LOAIBAOCAO,
					finderArgs, this);
		}

		if (result instanceof BaoCaoDLI) {
			BaoCaoDLI baoCaoDLI = (BaoCaoDLI)result;

			if (!Validator.equals(maTinh, baoCaoDLI.getMaTinh()) ||
					(nam != baoCaoDLI.getNam()) ||
					(loaiBaoCao != baoCaoDLI.getLoaiBaoCao())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_BAOCAODLI_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_MATINH_2);
			}

			query.append(_FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_NAM_2);

			query.append(_FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_LOAIBAOCAO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				qPos.add(nam);

				qPos.add(loaiBaoCao);

				List<BaoCaoDLI> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM_LOAIBAOCAO,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"BaoCaoDLIPersistenceImpl.fetchByMaTinh_Nam_LoaiBaoCao(String, int, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					BaoCaoDLI baoCaoDLI = list.get(0);

					result = baoCaoDLI;

					cacheResult(baoCaoDLI);

					if ((baoCaoDLI.getMaTinh() == null) ||
							!baoCaoDLI.getMaTinh().equals(maTinh) ||
							(baoCaoDLI.getNam() != nam) ||
							(baoCaoDLI.getLoaiBaoCao() != loaiBaoCao)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM_LOAIBAOCAO,
							finderArgs, baoCaoDLI);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATINH_NAM_LOAIBAOCAO,
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
			return (BaoCaoDLI)result;
		}
	}

	/**
	 * Removes the bao cao d l i where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @param loaiBaoCao the loai bao cao
	 * @return the bao cao d l i that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI removeByMaTinh_Nam_LoaiBaoCao(String maTinh, int nam,
		int loaiBaoCao) throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = findByMaTinh_Nam_LoaiBaoCao(maTinh, nam,
				loaiBaoCao);

		return remove(baoCaoDLI);
	}

	/**
	 * Returns the number of bao cao d l is where maTinh = &#63; and nam = &#63; and loaiBaoCao = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @param loaiBaoCao the loai bao cao
	 * @return the number of matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaTinh_Nam_LoaiBaoCao(String maTinh, int nam,
		int loaiBaoCao) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MATINH_NAM_LOAIBAOCAO;

		Object[] finderArgs = new Object[] { maTinh, nam, loaiBaoCao };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_BAOCAODLI_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_MATINH_2);
			}

			query.append(_FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_NAM_2);

			query.append(_FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_LOAIBAOCAO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				qPos.add(nam);

				qPos.add(loaiBaoCao);

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

	private static final String _FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_MATINH_1 = "baoCaoDLI.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_MATINH_2 = "baoCaoDLI.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_MATINH_3 = "(baoCaoDLI.maTinh IS NULL OR baoCaoDLI.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_NAM_2 = "baoCaoDLI.nam = ? AND ";
	private static final String _FINDER_COLUMN_MATINH_NAM_LOAIBAOCAO_LOAIBAOCAO_2 =
		"baoCaoDLI.loaiBaoCao = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAM = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, BaoCaoDLIImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNam",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAM = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, BaoCaoDLIImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNam",
			new String[] { Integer.class.getName() },
			BaoCaoDLIModelImpl.NAM_COLUMN_BITMASK |
			BaoCaoDLIModelImpl.MATINH_COLUMN_BITMASK |
			BaoCaoDLIModelImpl.NGAYBAOCAO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NAM = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNam",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the bao cao d l is where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> findByNam(int nam) throws SystemException {
		return findByNam(nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bao cao d l is where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @return the range of matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> findByNam(int nam, int start, int end)
		throws SystemException {
		return findByNam(nam, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bao cao d l is where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> findByNam(int nam, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAM;
			finderArgs = new Object[] { nam };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAM;
			finderArgs = new Object[] { nam, start, end, orderByComparator };
		}

		List<BaoCaoDLI> list = (List<BaoCaoDLI>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BaoCaoDLI baoCaoDLI : list) {
				if ((nam != baoCaoDLI.getNam())) {
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

			query.append(_SQL_SELECT_BAOCAODLI_WHERE);

			query.append(_FINDER_COLUMN_NAM_NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nam);

				if (!pagination) {
					list = (List<BaoCaoDLI>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BaoCaoDLI>(list);
				}
				else {
					list = (List<BaoCaoDLI>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bao cao d l i in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI findByNam_First(int nam,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = fetchByNam_First(nam, orderByComparator);

		if (baoCaoDLI != null) {
			return baoCaoDLI;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBaoCaoDLIException(msg.toString());
	}

	/**
	 * Returns the first bao cao d l i in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByNam_First(int nam,
		OrderByComparator orderByComparator) throws SystemException {
		List<BaoCaoDLI> list = findByNam(nam, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bao cao d l i in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI findByNam_Last(int nam, OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = fetchByNam_Last(nam, orderByComparator);

		if (baoCaoDLI != null) {
			return baoCaoDLI;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBaoCaoDLIException(msg.toString());
	}

	/**
	 * Returns the last bao cao d l i in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByNam_Last(int nam,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNam(nam);

		if (count == 0) {
			return null;
		}

		List<BaoCaoDLI> list = findByNam(nam, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bao cao d l is before and after the current bao cao d l i in the ordered set where nam = &#63;.
	 *
	 * @param id the primary key of the current bao cao d l i
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI[] findByNam_PrevAndNext(long id, int nam,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BaoCaoDLI[] array = new BaoCaoDLIImpl[3];

			array[0] = getByNam_PrevAndNext(session, baoCaoDLI, nam,
					orderByComparator, true);

			array[1] = baoCaoDLI;

			array[2] = getByNam_PrevAndNext(session, baoCaoDLI, nam,
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

	protected BaoCaoDLI getByNam_PrevAndNext(Session session,
		BaoCaoDLI baoCaoDLI, int nam, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BAOCAODLI_WHERE);

		query.append(_FINDER_COLUMN_NAM_NAM_2);

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
			query.append(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nam);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(baoCaoDLI);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BaoCaoDLI> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the bao cao d l is that the user has permission to view where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the matching bao cao d l is that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> filterFindByNam(int nam) throws SystemException {
		return filterFindByNam(nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bao cao d l is that the user has permission to view where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @return the range of matching bao cao d l is that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> filterFindByNam(int nam, int start, int end)
		throws SystemException {
		return filterFindByNam(nam, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bao cao d l is that the user has permissions to view where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bao cao d l is that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> filterFindByNam(int nam, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByNam(nam, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(3 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_NAM_NAM_2_SQL);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				BaoCaoDLI.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, BaoCaoDLIImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, BaoCaoDLIImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(nam);

			return (List<BaoCaoDLI>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the bao cao d l is before and after the current bao cao d l i in the ordered set of bao cao d l is that the user has permission to view where nam = &#63;.
	 *
	 * @param id the primary key of the current bao cao d l i
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI[] filterFindByNam_PrevAndNext(long id, int nam,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLIException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByNam_PrevAndNext(id, nam, orderByComparator);
		}

		BaoCaoDLI baoCaoDLI = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BaoCaoDLI[] array = new BaoCaoDLIImpl[3];

			array[0] = filterGetByNam_PrevAndNext(session, baoCaoDLI, nam,
					orderByComparator, true);

			array[1] = baoCaoDLI;

			array[2] = filterGetByNam_PrevAndNext(session, baoCaoDLI, nam,
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

	protected BaoCaoDLI filterGetByNam_PrevAndNext(Session session,
		BaoCaoDLI baoCaoDLI, int nam, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_NAM_NAM_2_SQL);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				BaoCaoDLI.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, BaoCaoDLIImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, BaoCaoDLIImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nam);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(baoCaoDLI);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BaoCaoDLI> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bao cao d l is where nam = &#63; from the database.
	 *
	 * @param nam the nam
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNam(int nam) throws SystemException {
		for (BaoCaoDLI baoCaoDLI : findByNam(nam, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(baoCaoDLI);
		}
	}

	/**
	 * Returns the number of bao cao d l is where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the number of matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNam(int nam) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NAM;

		Object[] finderArgs = new Object[] { nam };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BAOCAODLI_WHERE);

			query.append(_FINDER_COLUMN_NAM_NAM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	/**
	 * Returns the number of bao cao d l is that the user has permission to view where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the number of matching bao cao d l is that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByNam(int nam) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByNam(nam);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_BAOCAODLI_WHERE);

		query.append(_FINDER_COLUMN_NAM_NAM_2_SQL);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				BaoCaoDLI.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(nam);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_NAM_NAM_2 = "baoCaoDLI.nam = ?";
	private static final String _FINDER_COLUMN_NAM_NAM_2_SQL = "baoCaoDLI.NAM = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MATINH = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, BaoCaoDLIImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMaTinh",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATINH =
		new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, BaoCaoDLIImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMaTinh",
			new String[] { String.class.getName() },
			BaoCaoDLIModelImpl.MATINH_COLUMN_BITMASK |
			BaoCaoDLIModelImpl.NAM_COLUMN_BITMASK |
			BaoCaoDLIModelImpl.NGAYBAOCAO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MATINH = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaTinh",
			new String[] { String.class.getName() });

	/**
	 * Returns all the bao cao d l is where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> findByMaTinh(String maTinh)
		throws SystemException {
		return findByMaTinh(maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bao cao d l is where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @return the range of matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> findByMaTinh(String maTinh, int start, int end)
		throws SystemException {
		return findByMaTinh(maTinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bao cao d l is where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> findByMaTinh(String maTinh, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATINH;
			finderArgs = new Object[] { maTinh };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MATINH;
			finderArgs = new Object[] { maTinh, start, end, orderByComparator };
		}

		List<BaoCaoDLI> list = (List<BaoCaoDLI>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BaoCaoDLI baoCaoDLI : list) {
				if (!Validator.equals(maTinh, baoCaoDLI.getMaTinh())) {
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

			query.append(_SQL_SELECT_BAOCAODLI_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_MATINH_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATINH_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_MATINH_MATINH_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
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
					list = (List<BaoCaoDLI>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BaoCaoDLI>(list);
				}
				else {
					list = (List<BaoCaoDLI>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bao cao d l i in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI findByMaTinh_First(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = fetchByMaTinh_First(maTinh, orderByComparator);

		if (baoCaoDLI != null) {
			return baoCaoDLI;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBaoCaoDLIException(msg.toString());
	}

	/**
	 * Returns the first bao cao d l i in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByMaTinh_First(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		List<BaoCaoDLI> list = findByMaTinh(maTinh, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bao cao d l i in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI findByMaTinh_Last(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = fetchByMaTinh_Last(maTinh, orderByComparator);

		if (baoCaoDLI != null) {
			return baoCaoDLI;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBaoCaoDLIException(msg.toString());
	}

	/**
	 * Returns the last bao cao d l i in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByMaTinh_Last(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMaTinh(maTinh);

		if (count == 0) {
			return null;
		}

		List<BaoCaoDLI> list = findByMaTinh(maTinh, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bao cao d l is before and after the current bao cao d l i in the ordered set where maTinh = &#63;.
	 *
	 * @param id the primary key of the current bao cao d l i
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI[] findByMaTinh_PrevAndNext(long id, String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BaoCaoDLI[] array = new BaoCaoDLIImpl[3];

			array[0] = getByMaTinh_PrevAndNext(session, baoCaoDLI, maTinh,
					orderByComparator, true);

			array[1] = baoCaoDLI;

			array[2] = getByMaTinh_PrevAndNext(session, baoCaoDLI, maTinh,
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

	protected BaoCaoDLI getByMaTinh_PrevAndNext(Session session,
		BaoCaoDLI baoCaoDLI, String maTinh,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BAOCAODLI_WHERE);

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_MATINH_MATINH_1);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MATINH_MATINH_3);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_MATINH_MATINH_2);
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
			query.append(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(baoCaoDLI);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BaoCaoDLI> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the bao cao d l is that the user has permission to view where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the matching bao cao d l is that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> filterFindByMaTinh(String maTinh)
		throws SystemException {
		return filterFindByMaTinh(maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the bao cao d l is that the user has permission to view where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @return the range of matching bao cao d l is that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> filterFindByMaTinh(String maTinh, int start, int end)
		throws SystemException {
		return filterFindByMaTinh(maTinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bao cao d l is that the user has permissions to view where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bao cao d l is that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> filterFindByMaTinh(String maTinh, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByMaTinh(maTinh, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(3 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_MATINH_MATINH_1_SQL);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MATINH_MATINH_3_SQL);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_MATINH_MATINH_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				BaoCaoDLI.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, BaoCaoDLIImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, BaoCaoDLIImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindMaTinh) {
				qPos.add(maTinh);
			}

			return (List<BaoCaoDLI>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the bao cao d l is before and after the current bao cao d l i in the ordered set of bao cao d l is that the user has permission to view where maTinh = &#63;.
	 *
	 * @param id the primary key of the current bao cao d l i
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI[] filterFindByMaTinh_PrevAndNext(long id, String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLIException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByMaTinh_PrevAndNext(id, maTinh, orderByComparator);
		}

		BaoCaoDLI baoCaoDLI = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BaoCaoDLI[] array = new BaoCaoDLIImpl[3];

			array[0] = filterGetByMaTinh_PrevAndNext(session, baoCaoDLI,
					maTinh, orderByComparator, true);

			array[1] = baoCaoDLI;

			array[2] = filterGetByMaTinh_PrevAndNext(session, baoCaoDLI,
					maTinh, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BaoCaoDLI filterGetByMaTinh_PrevAndNext(Session session,
		BaoCaoDLI baoCaoDLI, String maTinh,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_MATINH_MATINH_1_SQL);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MATINH_MATINH_3_SQL);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_MATINH_MATINH_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				BaoCaoDLI.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, BaoCaoDLIImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, BaoCaoDLIImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaTinh) {
			qPos.add(maTinh);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(baoCaoDLI);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BaoCaoDLI> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bao cao d l is where maTinh = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMaTinh(String maTinh) throws SystemException {
		for (BaoCaoDLI baoCaoDLI : findByMaTinh(maTinh, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(baoCaoDLI);
		}
	}

	/**
	 * Returns the number of bao cao d l is where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the number of matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaTinh(String maTinh) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MATINH;

		Object[] finderArgs = new Object[] { maTinh };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BAOCAODLI_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_MATINH_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATINH_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_MATINH_MATINH_2);
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

	/**
	 * Returns the number of bao cao d l is that the user has permission to view where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the number of matching bao cao d l is that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByMaTinh(String maTinh) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByMaTinh(maTinh);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_BAOCAODLI_WHERE);

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_MATINH_MATINH_1_SQL);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MATINH_MATINH_3_SQL);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_MATINH_MATINH_2_SQL);
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				BaoCaoDLI.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindMaTinh) {
				qPos.add(maTinh);
			}

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_MATINH_MATINH_1 = "baoCaoDLI.maTinh IS NULL";
	private static final String _FINDER_COLUMN_MATINH_MATINH_2 = "baoCaoDLI.maTinh = ?";
	private static final String _FINDER_COLUMN_MATINH_MATINH_3 = "(baoCaoDLI.maTinh IS NULL OR baoCaoDLI.maTinh = '')";
	private static final String _FINDER_COLUMN_MATINH_MATINH_1_SQL = "baoCaoDLI.MATINH IS NULL";
	private static final String _FINDER_COLUMN_MATINH_MATINH_2_SQL = "baoCaoDLI.MATINH = ?";
	private static final String _FINDER_COLUMN_MATINH_MATINH_3_SQL = "(baoCaoDLI.MATINH IS NULL OR baoCaoDLI.MATINH = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAI =
		new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, BaoCaoDLIImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTrangThai",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAI =
		new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, BaoCaoDLIImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTrangThai",
			new String[] { Integer.class.getName() },
			BaoCaoDLIModelImpl.TRANGTHAI_COLUMN_BITMASK |
			BaoCaoDLIModelImpl.NAM_COLUMN_BITMASK |
			BaoCaoDLIModelImpl.MATINH_COLUMN_BITMASK |
			BaoCaoDLIModelImpl.NGAYBAOCAO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRANGTHAI = new FinderPath(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTrangThai",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the bao cao d l is where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @return the matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> findByTrangThai(int trangThai)
		throws SystemException {
		return findByTrangThai(trangThai, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the bao cao d l is where trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @return the range of matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> findByTrangThai(int trangThai, int start, int end)
		throws SystemException {
		return findByTrangThai(trangThai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bao cao d l is where trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> findByTrangThai(int trangThai, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAI;
			finderArgs = new Object[] { trangThai };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAI;
			finderArgs = new Object[] { trangThai, start, end, orderByComparator };
		}

		List<BaoCaoDLI> list = (List<BaoCaoDLI>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BaoCaoDLI baoCaoDLI : list) {
				if ((trangThai != baoCaoDLI.getTrangThai())) {
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

			query.append(_SQL_SELECT_BAOCAODLI_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAI_TRANGTHAI_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThai);

				if (!pagination) {
					list = (List<BaoCaoDLI>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BaoCaoDLI>(list);
				}
				else {
					list = (List<BaoCaoDLI>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bao cao d l i in the ordered set where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI findByTrangThai_First(int trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = fetchByTrangThai_First(trangThai,
				orderByComparator);

		if (baoCaoDLI != null) {
			return baoCaoDLI;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBaoCaoDLIException(msg.toString());
	}

	/**
	 * Returns the first bao cao d l i in the ordered set where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByTrangThai_First(int trangThai,
		OrderByComparator orderByComparator) throws SystemException {
		List<BaoCaoDLI> list = findByTrangThai(trangThai, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bao cao d l i in the ordered set where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI findByTrangThai_Last(int trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = fetchByTrangThai_Last(trangThai, orderByComparator);

		if (baoCaoDLI != null) {
			return baoCaoDLI;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBaoCaoDLIException(msg.toString());
	}

	/**
	 * Returns the last bao cao d l i in the ordered set where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bao cao d l i, or <code>null</code> if a matching bao cao d l i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByTrangThai_Last(int trangThai,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTrangThai(trangThai);

		if (count == 0) {
			return null;
		}

		List<BaoCaoDLI> list = findByTrangThai(trangThai, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bao cao d l is before and after the current bao cao d l i in the ordered set where trangThai = &#63;.
	 *
	 * @param id the primary key of the current bao cao d l i
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI[] findByTrangThai_PrevAndNext(long id, int trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BaoCaoDLI[] array = new BaoCaoDLIImpl[3];

			array[0] = getByTrangThai_PrevAndNext(session, baoCaoDLI,
					trangThai, orderByComparator, true);

			array[1] = baoCaoDLI;

			array[2] = getByTrangThai_PrevAndNext(session, baoCaoDLI,
					trangThai, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BaoCaoDLI getByTrangThai_PrevAndNext(Session session,
		BaoCaoDLI baoCaoDLI, int trangThai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BAOCAODLI_WHERE);

		query.append(_FINDER_COLUMN_TRANGTHAI_TRANGTHAI_2);

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
			query.append(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(trangThai);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(baoCaoDLI);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BaoCaoDLI> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the bao cao d l is that the user has permission to view where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @return the matching bao cao d l is that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> filterFindByTrangThai(int trangThai)
		throws SystemException {
		return filterFindByTrangThai(trangThai, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bao cao d l is that the user has permission to view where trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @return the range of matching bao cao d l is that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> filterFindByTrangThai(int trangThai, int start,
		int end) throws SystemException {
		return filterFindByTrangThai(trangThai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bao cao d l is that the user has permissions to view where trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bao cao d l is that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> filterFindByTrangThai(int trangThai, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByTrangThai(trangThai, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(3 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_TRANGTHAI_TRANGTHAI_2_SQL);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				BaoCaoDLI.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, BaoCaoDLIImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, BaoCaoDLIImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(trangThai);

			return (List<BaoCaoDLI>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the bao cao d l is before and after the current bao cao d l i in the ordered set of bao cao d l is that the user has permission to view where trangThai = &#63;.
	 *
	 * @param id the primary key of the current bao cao d l i
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI[] filterFindByTrangThai_PrevAndNext(long id,
		int trangThai, OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLIException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByTrangThai_PrevAndNext(id, trangThai, orderByComparator);
		}

		BaoCaoDLI baoCaoDLI = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BaoCaoDLI[] array = new BaoCaoDLIImpl[3];

			array[0] = filterGetByTrangThai_PrevAndNext(session, baoCaoDLI,
					trangThai, orderByComparator, true);

			array[1] = baoCaoDLI;

			array[2] = filterGetByTrangThai_PrevAndNext(session, baoCaoDLI,
					trangThai, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BaoCaoDLI filterGetByTrangThai_PrevAndNext(Session session,
		BaoCaoDLI baoCaoDLI, int trangThai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_TRANGTHAI_TRANGTHAI_2_SQL);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(BaoCaoDLIModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				BaoCaoDLI.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, BaoCaoDLIImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, BaoCaoDLIImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(trangThai);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(baoCaoDLI);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BaoCaoDLI> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bao cao d l is where trangThai = &#63; from the database.
	 *
	 * @param trangThai the trang thai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTrangThai(int trangThai) throws SystemException {
		for (BaoCaoDLI baoCaoDLI : findByTrangThai(trangThai,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(baoCaoDLI);
		}
	}

	/**
	 * Returns the number of bao cao d l is where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @return the number of matching bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTrangThai(int trangThai) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TRANGTHAI;

		Object[] finderArgs = new Object[] { trangThai };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BAOCAODLI_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAI_TRANGTHAI_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThai);

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

	/**
	 * Returns the number of bao cao d l is that the user has permission to view where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @return the number of matching bao cao d l is that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByTrangThai(int trangThai) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByTrangThai(trangThai);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_BAOCAODLI_WHERE);

		query.append(_FINDER_COLUMN_TRANGTHAI_TRANGTHAI_2_SQL);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				BaoCaoDLI.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(trangThai);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_TRANGTHAI_TRANGTHAI_2 = "baoCaoDLI.trangThai = ?";
	private static final String _FINDER_COLUMN_TRANGTHAI_TRANGTHAI_2_SQL = "baoCaoDLI.TRANGTHAI = ?";

	public BaoCaoDLIPersistenceImpl() {
		setModelClass(BaoCaoDLI.class);
	}

	/**
	 * Caches the bao cao d l i in the entity cache if it is enabled.
	 *
	 * @param baoCaoDLI the bao cao d l i
	 */
	@Override
	public void cacheResult(BaoCaoDLI baoCaoDLI) {
		EntityCacheUtil.putResult(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIImpl.class, baoCaoDLI.getPrimaryKey(), baoCaoDLI);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
			new Object[] { baoCaoDLI.getId() }, baoCaoDLI);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM,
			new Object[] { baoCaoDLI.getMaTinh(), baoCaoDLI.getNam() },
			baoCaoDLI);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM_LOAIBAOCAO,
			new Object[] {
				baoCaoDLI.getMaTinh(), baoCaoDLI.getNam(),
				baoCaoDLI.getLoaiBaoCao()
			}, baoCaoDLI);

		baoCaoDLI.resetOriginalValues();
	}

	/**
	 * Caches the bao cao d l is in the entity cache if it is enabled.
	 *
	 * @param baoCaoDLIs the bao cao d l is
	 */
	@Override
	public void cacheResult(List<BaoCaoDLI> baoCaoDLIs) {
		for (BaoCaoDLI baoCaoDLI : baoCaoDLIs) {
			if (EntityCacheUtil.getResult(
						BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
						BaoCaoDLIImpl.class, baoCaoDLI.getPrimaryKey()) == null) {
				cacheResult(baoCaoDLI);
			}
			else {
				baoCaoDLI.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bao cao d l is.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BaoCaoDLIImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BaoCaoDLIImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bao cao d l i.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BaoCaoDLI baoCaoDLI) {
		EntityCacheUtil.removeResult(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIImpl.class, baoCaoDLI.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(baoCaoDLI);
	}

	@Override
	public void clearCache(List<BaoCaoDLI> baoCaoDLIs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BaoCaoDLI baoCaoDLI : baoCaoDLIs) {
			EntityCacheUtil.removeResult(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
				BaoCaoDLIImpl.class, baoCaoDLI.getPrimaryKey());

			clearUniqueFindersCache(baoCaoDLI);
		}
	}

	protected void cacheUniqueFindersCache(BaoCaoDLI baoCaoDLI) {
		if (baoCaoDLI.isNew()) {
			Object[] args = new Object[] { baoCaoDLI.getId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID, args, baoCaoDLI);

			args = new Object[] { baoCaoDLI.getMaTinh(), baoCaoDLI.getNam() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATINH_NAM, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM, args,
				baoCaoDLI);

			args = new Object[] {
					baoCaoDLI.getMaTinh(), baoCaoDLI.getNam(),
					baoCaoDLI.getLoaiBaoCao()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATINH_NAM_LOAIBAOCAO,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM_LOAIBAOCAO,
				args, baoCaoDLI);
		}
		else {
			BaoCaoDLIModelImpl baoCaoDLIModelImpl = (BaoCaoDLIModelImpl)baoCaoDLI;

			if ((baoCaoDLIModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { baoCaoDLI.getId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID, args,
					baoCaoDLI);
			}

			if ((baoCaoDLIModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MATINH_NAM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						baoCaoDLI.getMaTinh(), baoCaoDLI.getNam()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATINH_NAM,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM,
					args, baoCaoDLI);
			}

			if ((baoCaoDLIModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MATINH_NAM_LOAIBAOCAO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						baoCaoDLI.getMaTinh(), baoCaoDLI.getNam(),
						baoCaoDLI.getLoaiBaoCao()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATINH_NAM_LOAIBAOCAO,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM_LOAIBAOCAO,
					args, baoCaoDLI);
			}
		}
	}

	protected void clearUniqueFindersCache(BaoCaoDLI baoCaoDLI) {
		BaoCaoDLIModelImpl baoCaoDLIModelImpl = (BaoCaoDLIModelImpl)baoCaoDLI;

		Object[] args = new Object[] { baoCaoDLI.getId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, args);

		if ((baoCaoDLIModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ID.getColumnBitmask()) != 0) {
			args = new Object[] { baoCaoDLIModelImpl.getOriginalId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, args);
		}

		args = new Object[] { baoCaoDLI.getMaTinh(), baoCaoDLI.getNam() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATINH_NAM, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATINH_NAM, args);

		if ((baoCaoDLIModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MATINH_NAM.getColumnBitmask()) != 0) {
			args = new Object[] {
					baoCaoDLIModelImpl.getOriginalMaTinh(),
					baoCaoDLIModelImpl.getOriginalNam()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATINH_NAM, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATINH_NAM, args);
		}

		args = new Object[] {
				baoCaoDLI.getMaTinh(), baoCaoDLI.getNam(),
				baoCaoDLI.getLoaiBaoCao()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATINH_NAM_LOAIBAOCAO,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATINH_NAM_LOAIBAOCAO,
			args);

		if ((baoCaoDLIModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MATINH_NAM_LOAIBAOCAO.getColumnBitmask()) != 0) {
			args = new Object[] {
					baoCaoDLIModelImpl.getOriginalMaTinh(),
					baoCaoDLIModelImpl.getOriginalNam(),
					baoCaoDLIModelImpl.getOriginalLoaiBaoCao()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATINH_NAM_LOAIBAOCAO,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATINH_NAM_LOAIBAOCAO,
				args);
		}
	}

	/**
	 * Creates a new bao cao d l i with the primary key. Does not add the bao cao d l i to the database.
	 *
	 * @param id the primary key for the new bao cao d l i
	 * @return the new bao cao d l i
	 */
	@Override
	public BaoCaoDLI create(long id) {
		BaoCaoDLI baoCaoDLI = new BaoCaoDLIImpl();

		baoCaoDLI.setNew(true);
		baoCaoDLI.setPrimaryKey(id);

		return baoCaoDLI;
	}

	/**
	 * Removes the bao cao d l i with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the bao cao d l i
	 * @return the bao cao d l i that was removed
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI remove(long id)
		throws NoSuchBaoCaoDLIException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the bao cao d l i with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bao cao d l i
	 * @return the bao cao d l i that was removed
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI remove(Serializable primaryKey)
		throws NoSuchBaoCaoDLIException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BaoCaoDLI baoCaoDLI = (BaoCaoDLI)session.get(BaoCaoDLIImpl.class,
					primaryKey);

			if (baoCaoDLI == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBaoCaoDLIException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(baoCaoDLI);
		}
		catch (NoSuchBaoCaoDLIException nsee) {
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
	protected BaoCaoDLI removeImpl(BaoCaoDLI baoCaoDLI)
		throws SystemException {
		baoCaoDLI = toUnwrappedModel(baoCaoDLI);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(baoCaoDLI)) {
				baoCaoDLI = (BaoCaoDLI)session.get(BaoCaoDLIImpl.class,
						baoCaoDLI.getPrimaryKeyObj());
			}

			if (baoCaoDLI != null) {
				session.delete(baoCaoDLI);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (baoCaoDLI != null) {
			clearCache(baoCaoDLI);
		}

		return baoCaoDLI;
	}

	@Override
	public BaoCaoDLI updateImpl(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI baoCaoDLI)
		throws SystemException {
		baoCaoDLI = toUnwrappedModel(baoCaoDLI);

		boolean isNew = baoCaoDLI.isNew();

		BaoCaoDLIModelImpl baoCaoDLIModelImpl = (BaoCaoDLIModelImpl)baoCaoDLI;

		Session session = null;

		try {
			session = openSession();

			if (baoCaoDLI.isNew()) {
				session.save(baoCaoDLI);

				baoCaoDLI.setNew(false);
			}
			else {
				session.merge(baoCaoDLI);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BaoCaoDLIModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((baoCaoDLIModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { baoCaoDLIModelImpl.getOriginalNam() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAM, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAM,
					args);

				args = new Object[] { baoCaoDLIModelImpl.getNam() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAM, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAM,
					args);
			}

			if ((baoCaoDLIModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATINH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						baoCaoDLIModelImpl.getOriginalMaTinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATINH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATINH,
					args);

				args = new Object[] { baoCaoDLIModelImpl.getMaTinh() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATINH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATINH,
					args);
			}

			if ((baoCaoDLIModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						baoCaoDLIModelImpl.getOriginalTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAI,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAI,
					args);

				args = new Object[] { baoCaoDLIModelImpl.getTrangThai() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAI,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAI,
					args);
			}
		}

		EntityCacheUtil.putResult(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLIImpl.class, baoCaoDLI.getPrimaryKey(), baoCaoDLI);

		clearUniqueFindersCache(baoCaoDLI);
		cacheUniqueFindersCache(baoCaoDLI);

		return baoCaoDLI;
	}

	protected BaoCaoDLI toUnwrappedModel(BaoCaoDLI baoCaoDLI) {
		if (baoCaoDLI instanceof BaoCaoDLIImpl) {
			return baoCaoDLI;
		}

		BaoCaoDLIImpl baoCaoDLIImpl = new BaoCaoDLIImpl();

		baoCaoDLIImpl.setNew(baoCaoDLI.isNew());
		baoCaoDLIImpl.setPrimaryKey(baoCaoDLI.getPrimaryKey());

		baoCaoDLIImpl.setId(baoCaoDLI.getId());
		baoCaoDLIImpl.setMaTinh(baoCaoDLI.getMaTinh());
		baoCaoDLIImpl.setNam(baoCaoDLI.getNam());
		baoCaoDLIImpl.setLoaiBaoCao(baoCaoDLI.getLoaiBaoCao());
		baoCaoDLIImpl.setNguoiLap(baoCaoDLI.getNguoiLap());
		baoCaoDLIImpl.setNguoiDuyet(baoCaoDLI.getNguoiDuyet());
		baoCaoDLIImpl.setSoBaoCao(baoCaoDLI.getSoBaoCao());
		baoCaoDLIImpl.setNgayBaoCao(baoCaoDLI.getNgayBaoCao());
		baoCaoDLIImpl.setTrangThai(baoCaoDLI.getTrangThai());
		baoCaoDLIImpl.setLuuTruPDF1Id(baoCaoDLI.getLuuTruPDF1Id());
		baoCaoDLIImpl.setLuuTruPDF2Id(baoCaoDLI.getLuuTruPDF2Id());
		baoCaoDLIImpl.setLuuTruCSV1Id(baoCaoDLI.getLuuTruCSV1Id());
		baoCaoDLIImpl.setLuuTruCSV2Id(baoCaoDLI.getLuuTruCSV2Id());

		return baoCaoDLIImpl;
	}

	/**
	 * Returns the bao cao d l i with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bao cao d l i
	 * @return the bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBaoCaoDLIException, SystemException {
		BaoCaoDLI baoCaoDLI = fetchByPrimaryKey(primaryKey);

		if (baoCaoDLI == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBaoCaoDLIException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return baoCaoDLI;
	}

	/**
	 * Returns the bao cao d l i with the primary key or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException} if it could not be found.
	 *
	 * @param id the primary key of the bao cao d l i
	 * @return the bao cao d l i
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLIException if a bao cao d l i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI findByPrimaryKey(long id)
		throws NoSuchBaoCaoDLIException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the bao cao d l i with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bao cao d l i
	 * @return the bao cao d l i, or <code>null</code> if a bao cao d l i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		BaoCaoDLI baoCaoDLI = (BaoCaoDLI)EntityCacheUtil.getResult(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
				BaoCaoDLIImpl.class, primaryKey);

		if (baoCaoDLI == _nullBaoCaoDLI) {
			return null;
		}

		if (baoCaoDLI == null) {
			Session session = null;

			try {
				session = openSession();

				baoCaoDLI = (BaoCaoDLI)session.get(BaoCaoDLIImpl.class,
						primaryKey);

				if (baoCaoDLI != null) {
					cacheResult(baoCaoDLI);
				}
				else {
					EntityCacheUtil.putResult(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
						BaoCaoDLIImpl.class, primaryKey, _nullBaoCaoDLI);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BaoCaoDLIModelImpl.ENTITY_CACHE_ENABLED,
					BaoCaoDLIImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return baoCaoDLI;
	}

	/**
	 * Returns the bao cao d l i with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the bao cao d l i
	 * @return the bao cao d l i, or <code>null</code> if a bao cao d l i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLI fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the bao cao d l is.
	 *
	 * @return the bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bao cao d l is.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @return the range of bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bao cao d l is.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bao cao d l is
	 * @param end the upper bound of the range of bao cao d l is (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bao cao d l is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLI> findAll(int start, int end,
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

		List<BaoCaoDLI> list = (List<BaoCaoDLI>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BAOCAODLI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BAOCAODLI;

				if (pagination) {
					sql = sql.concat(BaoCaoDLIModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BaoCaoDLI>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BaoCaoDLI>(list);
				}
				else {
					list = (List<BaoCaoDLI>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the bao cao d l is from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (BaoCaoDLI baoCaoDLI : findAll()) {
			remove(baoCaoDLI);
		}
	}

	/**
	 * Returns the number of bao cao d l is.
	 *
	 * @return the number of bao cao d l is
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

				Query q = session.createQuery(_SQL_COUNT_BAOCAODLI);

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
	 * Initializes the bao cao d l i persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLI")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BaoCaoDLI>> listenersList = new ArrayList<ModelListener<BaoCaoDLI>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BaoCaoDLI>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BaoCaoDLIImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BAOCAODLI = "SELECT baoCaoDLI FROM BaoCaoDLI baoCaoDLI";
	private static final String _SQL_SELECT_BAOCAODLI_WHERE = "SELECT baoCaoDLI FROM BaoCaoDLI baoCaoDLI WHERE ";
	private static final String _SQL_COUNT_BAOCAODLI = "SELECT COUNT(baoCaoDLI) FROM BaoCaoDLI baoCaoDLI";
	private static final String _SQL_COUNT_BAOCAODLI_WHERE = "SELECT COUNT(baoCaoDLI) FROM BaoCaoDLI baoCaoDLI WHERE ";
	private static final String _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN = "baoCaoDLI.ID";
	private static final String _FILTER_SQL_SELECT_BAOCAODLI_WHERE = "SELECT DISTINCT {baoCaoDLI.*} FROM ME_BAOCAODLI baoCaoDLI WHERE ";
	private static final String _FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {ME_BAOCAODLI.*} FROM (SELECT DISTINCT baoCaoDLI.ID FROM ME_BAOCAODLI baoCaoDLI WHERE ";
	private static final String _FILTER_SQL_SELECT_BAOCAODLI_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN ME_BAOCAODLI ON TEMP_TABLE.ID = ME_BAOCAODLI.ID";
	private static final String _FILTER_SQL_COUNT_BAOCAODLI_WHERE = "SELECT COUNT(DISTINCT baoCaoDLI.ID) AS COUNT_VALUE FROM ME_BAOCAODLI baoCaoDLI WHERE ";
	private static final String _FILTER_ENTITY_ALIAS = "baoCaoDLI";
	private static final String _FILTER_ENTITY_TABLE = "ME_BAOCAODLI";
	private static final String _ORDER_BY_ENTITY_ALIAS = "baoCaoDLI.";
	private static final String _ORDER_BY_ENTITY_TABLE = "ME_BAOCAODLI.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BaoCaoDLI exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BaoCaoDLI exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BaoCaoDLIPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maTinh", "nam", "loaiBaoCao", "nguoiLap", "nguoiDuyet",
				"soBaoCao", "ngayBaoCao", "trangThai", "luuTruPDF1Id",
				"luuTruPDF2Id", "luuTruCSV1Id", "luuTruCSV2Id"
			});
	private static BaoCaoDLI _nullBaoCaoDLI = new BaoCaoDLIImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BaoCaoDLI> toCacheModel() {
				return _nullBaoCaoDLICacheModel;
			}
		};

	private static CacheModel<BaoCaoDLI> _nullBaoCaoDLICacheModel = new CacheModel<BaoCaoDLI>() {
			@Override
			public BaoCaoDLI toEntityModel() {
				return _nullBaoCaoDLI;
			}
		};
}