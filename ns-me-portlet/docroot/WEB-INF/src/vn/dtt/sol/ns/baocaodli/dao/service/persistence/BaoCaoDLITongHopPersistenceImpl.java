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

import vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException;
import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop;
import vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopImpl;
import vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the bao cao d l i tong hop service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HuyMQ
 * @see BaoCaoDLITongHopPersistence
 * @see BaoCaoDLITongHopUtil
 * @generated
 */
public class BaoCaoDLITongHopPersistenceImpl extends BasePersistenceImpl<BaoCaoDLITongHop>
	implements BaoCaoDLITongHopPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BaoCaoDLITongHopUtil} to access the bao cao d l i tong hop persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BaoCaoDLITongHopImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopModelImpl.FINDER_CACHE_ENABLED,
			BaoCaoDLITongHopImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopModelImpl.FINDER_CACHE_ENABLED,
			BaoCaoDLITongHopImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_MATINH_NAM = new FinderPath(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopModelImpl.FINDER_CACHE_ENABLED,
			BaoCaoDLITongHopImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMaTinh_Nam",
			new String[] { String.class.getName(), Integer.class.getName() },
			BaoCaoDLITongHopModelImpl.MATINH_COLUMN_BITMASK |
			BaoCaoDLITongHopModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MATINH_NAM = new FinderPath(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaTinh_Nam",
			new String[] { String.class.getName(), Integer.class.getName() });

	/**
	 * Returns the bao cao d l i tong hop where maTinh = &#63; and nam = &#63; or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException} if it could not be found.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @return the matching bao cao d l i tong hop
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a matching bao cao d l i tong hop could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop findByMaTinh_Nam(String maTinh, int nam)
		throws NoSuchBaoCaoDLITongHopException, SystemException {
		BaoCaoDLITongHop baoCaoDLITongHop = fetchByMaTinh_Nam(maTinh, nam);

		if (baoCaoDLITongHop == null) {
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

			throw new NoSuchBaoCaoDLITongHopException(msg.toString());
		}

		return baoCaoDLITongHop;
	}

	/**
	 * Returns the bao cao d l i tong hop where maTinh = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @return the matching bao cao d l i tong hop, or <code>null</code> if a matching bao cao d l i tong hop could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop fetchByMaTinh_Nam(String maTinh, int nam)
		throws SystemException {
		return fetchByMaTinh_Nam(maTinh, nam, true);
	}

	/**
	 * Returns the bao cao d l i tong hop where maTinh = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching bao cao d l i tong hop, or <code>null</code> if a matching bao cao d l i tong hop could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop fetchByMaTinh_Nam(String maTinh, int nam,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maTinh, nam };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MATINH_NAM,
					finderArgs, this);
		}

		if (result instanceof BaoCaoDLITongHop) {
			BaoCaoDLITongHop baoCaoDLITongHop = (BaoCaoDLITongHop)result;

			if (!Validator.equals(maTinh, baoCaoDLITongHop.getMaTinh()) ||
					(nam != baoCaoDLITongHop.getNam())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_BAOCAODLITONGHOP_WHERE);

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

				List<BaoCaoDLITongHop> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"BaoCaoDLITongHopPersistenceImpl.fetchByMaTinh_Nam(String, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					BaoCaoDLITongHop baoCaoDLITongHop = list.get(0);

					result = baoCaoDLITongHop;

					cacheResult(baoCaoDLITongHop);

					if ((baoCaoDLITongHop.getMaTinh() == null) ||
							!baoCaoDLITongHop.getMaTinh().equals(maTinh) ||
							(baoCaoDLITongHop.getNam() != nam)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM,
							finderArgs, baoCaoDLITongHop);
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
			return (BaoCaoDLITongHop)result;
		}
	}

	/**
	 * Removes the bao cao d l i tong hop where maTinh = &#63; and nam = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @return the bao cao d l i tong hop that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop removeByMaTinh_Nam(String maTinh, int nam)
		throws NoSuchBaoCaoDLITongHopException, SystemException {
		BaoCaoDLITongHop baoCaoDLITongHop = findByMaTinh_Nam(maTinh, nam);

		return remove(baoCaoDLITongHop);
	}

	/**
	 * Returns the number of bao cao d l i tong hops where maTinh = &#63; and nam = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param nam the nam
	 * @return the number of matching bao cao d l i tong hops
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

			query.append(_SQL_COUNT_BAOCAODLITONGHOP_WHERE);

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

	private static final String _FINDER_COLUMN_MATINH_NAM_MATINH_1 = "baoCaoDLITongHop.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_MATINH_NAM_MATINH_2 = "baoCaoDLITongHop.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_MATINH_NAM_MATINH_3 = "(baoCaoDLITongHop.maTinh IS NULL OR baoCaoDLITongHop.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_MATINH_NAM_NAM_2 = "baoCaoDLITongHop.nam = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAM = new FinderPath(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopModelImpl.FINDER_CACHE_ENABLED,
			BaoCaoDLITongHopImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNam",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAM = new FinderPath(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopModelImpl.FINDER_CACHE_ENABLED,
			BaoCaoDLITongHopImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNam",
			new String[] { Integer.class.getName() },
			BaoCaoDLITongHopModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NAM = new FinderPath(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNam",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the bao cao d l i tong hops where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the matching bao cao d l i tong hops
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLITongHop> findByNam(int nam) throws SystemException {
		return findByNam(nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bao cao d l i tong hops where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of bao cao d l i tong hops
	 * @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	 * @return the range of matching bao cao d l i tong hops
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLITongHop> findByNam(int nam, int start, int end)
		throws SystemException {
		return findByNam(nam, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bao cao d l i tong hops where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of bao cao d l i tong hops
	 * @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bao cao d l i tong hops
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLITongHop> findByNam(int nam, int start, int end,
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

		List<BaoCaoDLITongHop> list = (List<BaoCaoDLITongHop>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BaoCaoDLITongHop baoCaoDLITongHop : list) {
				if ((nam != baoCaoDLITongHop.getNam())) {
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

			query.append(_SQL_SELECT_BAOCAODLITONGHOP_WHERE);

			query.append(_FINDER_COLUMN_NAM_NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BaoCaoDLITongHopModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nam);

				if (!pagination) {
					list = (List<BaoCaoDLITongHop>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BaoCaoDLITongHop>(list);
				}
				else {
					list = (List<BaoCaoDLITongHop>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first bao cao d l i tong hop in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bao cao d l i tong hop
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a matching bao cao d l i tong hop could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop findByNam_First(int nam,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLITongHopException, SystemException {
		BaoCaoDLITongHop baoCaoDLITongHop = fetchByNam_First(nam,
				orderByComparator);

		if (baoCaoDLITongHop != null) {
			return baoCaoDLITongHop;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBaoCaoDLITongHopException(msg.toString());
	}

	/**
	 * Returns the first bao cao d l i tong hop in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bao cao d l i tong hop, or <code>null</code> if a matching bao cao d l i tong hop could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop fetchByNam_First(int nam,
		OrderByComparator orderByComparator) throws SystemException {
		List<BaoCaoDLITongHop> list = findByNam(nam, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bao cao d l i tong hop in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bao cao d l i tong hop
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a matching bao cao d l i tong hop could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop findByNam_Last(int nam,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLITongHopException, SystemException {
		BaoCaoDLITongHop baoCaoDLITongHop = fetchByNam_Last(nam,
				orderByComparator);

		if (baoCaoDLITongHop != null) {
			return baoCaoDLITongHop;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBaoCaoDLITongHopException(msg.toString());
	}

	/**
	 * Returns the last bao cao d l i tong hop in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bao cao d l i tong hop, or <code>null</code> if a matching bao cao d l i tong hop could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop fetchByNam_Last(int nam,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNam(nam);

		if (count == 0) {
			return null;
		}

		List<BaoCaoDLITongHop> list = findByNam(nam, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bao cao d l i tong hops before and after the current bao cao d l i tong hop in the ordered set where nam = &#63;.
	 *
	 * @param id the primary key of the current bao cao d l i tong hop
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bao cao d l i tong hop
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a bao cao d l i tong hop with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop[] findByNam_PrevAndNext(long id, int nam,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLITongHopException, SystemException {
		BaoCaoDLITongHop baoCaoDLITongHop = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BaoCaoDLITongHop[] array = new BaoCaoDLITongHopImpl[3];

			array[0] = getByNam_PrevAndNext(session, baoCaoDLITongHop, nam,
					orderByComparator, true);

			array[1] = baoCaoDLITongHop;

			array[2] = getByNam_PrevAndNext(session, baoCaoDLITongHop, nam,
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

	protected BaoCaoDLITongHop getByNam_PrevAndNext(Session session,
		BaoCaoDLITongHop baoCaoDLITongHop, int nam,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BAOCAODLITONGHOP_WHERE);

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
			query.append(BaoCaoDLITongHopModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nam);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(baoCaoDLITongHop);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BaoCaoDLITongHop> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bao cao d l i tong hops where nam = &#63; from the database.
	 *
	 * @param nam the nam
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNam(int nam) throws SystemException {
		for (BaoCaoDLITongHop baoCaoDLITongHop : findByNam(nam,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(baoCaoDLITongHop);
		}
	}

	/**
	 * Returns the number of bao cao d l i tong hops where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the number of matching bao cao d l i tong hops
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

			query.append(_SQL_COUNT_BAOCAODLITONGHOP_WHERE);

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

	private static final String _FINDER_COLUMN_NAM_NAM_2 = "baoCaoDLITongHop.nam = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MATINH = new FinderPath(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopModelImpl.FINDER_CACHE_ENABLED,
			BaoCaoDLITongHopImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByMaTinh",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATINH =
		new FinderPath(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopModelImpl.FINDER_CACHE_ENABLED,
			BaoCaoDLITongHopImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMaTinh",
			new String[] { String.class.getName() },
			BaoCaoDLITongHopModelImpl.MATINH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MATINH = new FinderPath(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaTinh",
			new String[] { String.class.getName() });

	/**
	 * Returns all the bao cao d l i tong hops where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the matching bao cao d l i tong hops
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLITongHop> findByMaTinh(String maTinh)
		throws SystemException {
		return findByMaTinh(maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bao cao d l i tong hops where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of bao cao d l i tong hops
	 * @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	 * @return the range of matching bao cao d l i tong hops
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLITongHop> findByMaTinh(String maTinh, int start, int end)
		throws SystemException {
		return findByMaTinh(maTinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bao cao d l i tong hops where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of bao cao d l i tong hops
	 * @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bao cao d l i tong hops
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLITongHop> findByMaTinh(String maTinh, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<BaoCaoDLITongHop> list = (List<BaoCaoDLITongHop>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BaoCaoDLITongHop baoCaoDLITongHop : list) {
				if (!Validator.equals(maTinh, baoCaoDLITongHop.getMaTinh())) {
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

			query.append(_SQL_SELECT_BAOCAODLITONGHOP_WHERE);

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
				query.append(BaoCaoDLITongHopModelImpl.ORDER_BY_JPQL);
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
					list = (List<BaoCaoDLITongHop>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BaoCaoDLITongHop>(list);
				}
				else {
					list = (List<BaoCaoDLITongHop>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first bao cao d l i tong hop in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bao cao d l i tong hop
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a matching bao cao d l i tong hop could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop findByMaTinh_First(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLITongHopException, SystemException {
		BaoCaoDLITongHop baoCaoDLITongHop = fetchByMaTinh_First(maTinh,
				orderByComparator);

		if (baoCaoDLITongHop != null) {
			return baoCaoDLITongHop;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBaoCaoDLITongHopException(msg.toString());
	}

	/**
	 * Returns the first bao cao d l i tong hop in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bao cao d l i tong hop, or <code>null</code> if a matching bao cao d l i tong hop could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop fetchByMaTinh_First(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		List<BaoCaoDLITongHop> list = findByMaTinh(maTinh, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bao cao d l i tong hop in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bao cao d l i tong hop
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a matching bao cao d l i tong hop could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop findByMaTinh_Last(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLITongHopException, SystemException {
		BaoCaoDLITongHop baoCaoDLITongHop = fetchByMaTinh_Last(maTinh,
				orderByComparator);

		if (baoCaoDLITongHop != null) {
			return baoCaoDLITongHop;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBaoCaoDLITongHopException(msg.toString());
	}

	/**
	 * Returns the last bao cao d l i tong hop in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bao cao d l i tong hop, or <code>null</code> if a matching bao cao d l i tong hop could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop fetchByMaTinh_Last(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMaTinh(maTinh);

		if (count == 0) {
			return null;
		}

		List<BaoCaoDLITongHop> list = findByMaTinh(maTinh, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bao cao d l i tong hops before and after the current bao cao d l i tong hop in the ordered set where maTinh = &#63;.
	 *
	 * @param id the primary key of the current bao cao d l i tong hop
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bao cao d l i tong hop
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a bao cao d l i tong hop with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop[] findByMaTinh_PrevAndNext(long id, String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchBaoCaoDLITongHopException, SystemException {
		BaoCaoDLITongHop baoCaoDLITongHop = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BaoCaoDLITongHop[] array = new BaoCaoDLITongHopImpl[3];

			array[0] = getByMaTinh_PrevAndNext(session, baoCaoDLITongHop,
					maTinh, orderByComparator, true);

			array[1] = baoCaoDLITongHop;

			array[2] = getByMaTinh_PrevAndNext(session, baoCaoDLITongHop,
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

	protected BaoCaoDLITongHop getByMaTinh_PrevAndNext(Session session,
		BaoCaoDLITongHop baoCaoDLITongHop, String maTinh,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BAOCAODLITONGHOP_WHERE);

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
			query.append(BaoCaoDLITongHopModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(baoCaoDLITongHop);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BaoCaoDLITongHop> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bao cao d l i tong hops where maTinh = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMaTinh(String maTinh) throws SystemException {
		for (BaoCaoDLITongHop baoCaoDLITongHop : findByMaTinh(maTinh,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(baoCaoDLITongHop);
		}
	}

	/**
	 * Returns the number of bao cao d l i tong hops where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the number of matching bao cao d l i tong hops
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

			query.append(_SQL_COUNT_BAOCAODLITONGHOP_WHERE);

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

	private static final String _FINDER_COLUMN_MATINH_MATINH_1 = "baoCaoDLITongHop.maTinh IS NULL";
	private static final String _FINDER_COLUMN_MATINH_MATINH_2 = "baoCaoDLITongHop.maTinh = ?";
	private static final String _FINDER_COLUMN_MATINH_MATINH_3 = "(baoCaoDLITongHop.maTinh IS NULL OR baoCaoDLITongHop.maTinh = '')";

	public BaoCaoDLITongHopPersistenceImpl() {
		setModelClass(BaoCaoDLITongHop.class);
	}

	/**
	 * Caches the bao cao d l i tong hop in the entity cache if it is enabled.
	 *
	 * @param baoCaoDLITongHop the bao cao d l i tong hop
	 */
	@Override
	public void cacheResult(BaoCaoDLITongHop baoCaoDLITongHop) {
		EntityCacheUtil.putResult(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopImpl.class, baoCaoDLITongHop.getPrimaryKey(),
			baoCaoDLITongHop);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM,
			new Object[] { baoCaoDLITongHop.getMaTinh(), baoCaoDLITongHop.getNam() },
			baoCaoDLITongHop);

		baoCaoDLITongHop.resetOriginalValues();
	}

	/**
	 * Caches the bao cao d l i tong hops in the entity cache if it is enabled.
	 *
	 * @param baoCaoDLITongHops the bao cao d l i tong hops
	 */
	@Override
	public void cacheResult(List<BaoCaoDLITongHop> baoCaoDLITongHops) {
		for (BaoCaoDLITongHop baoCaoDLITongHop : baoCaoDLITongHops) {
			if (EntityCacheUtil.getResult(
						BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
						BaoCaoDLITongHopImpl.class,
						baoCaoDLITongHop.getPrimaryKey()) == null) {
				cacheResult(baoCaoDLITongHop);
			}
			else {
				baoCaoDLITongHop.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bao cao d l i tong hops.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BaoCaoDLITongHopImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BaoCaoDLITongHopImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bao cao d l i tong hop.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BaoCaoDLITongHop baoCaoDLITongHop) {
		EntityCacheUtil.removeResult(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopImpl.class, baoCaoDLITongHop.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(baoCaoDLITongHop);
	}

	@Override
	public void clearCache(List<BaoCaoDLITongHop> baoCaoDLITongHops) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BaoCaoDLITongHop baoCaoDLITongHop : baoCaoDLITongHops) {
			EntityCacheUtil.removeResult(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
				BaoCaoDLITongHopImpl.class, baoCaoDLITongHop.getPrimaryKey());

			clearUniqueFindersCache(baoCaoDLITongHop);
		}
	}

	protected void cacheUniqueFindersCache(BaoCaoDLITongHop baoCaoDLITongHop) {
		if (baoCaoDLITongHop.isNew()) {
			Object[] args = new Object[] {
					baoCaoDLITongHop.getMaTinh(), baoCaoDLITongHop.getNam()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATINH_NAM, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM, args,
				baoCaoDLITongHop);
		}
		else {
			BaoCaoDLITongHopModelImpl baoCaoDLITongHopModelImpl = (BaoCaoDLITongHopModelImpl)baoCaoDLITongHop;

			if ((baoCaoDLITongHopModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MATINH_NAM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						baoCaoDLITongHop.getMaTinh(), baoCaoDLITongHop.getNam()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATINH_NAM,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATINH_NAM,
					args, baoCaoDLITongHop);
			}
		}
	}

	protected void clearUniqueFindersCache(BaoCaoDLITongHop baoCaoDLITongHop) {
		BaoCaoDLITongHopModelImpl baoCaoDLITongHopModelImpl = (BaoCaoDLITongHopModelImpl)baoCaoDLITongHop;

		Object[] args = new Object[] {
				baoCaoDLITongHop.getMaTinh(), baoCaoDLITongHop.getNam()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATINH_NAM, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATINH_NAM, args);

		if ((baoCaoDLITongHopModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MATINH_NAM.getColumnBitmask()) != 0) {
			args = new Object[] {
					baoCaoDLITongHopModelImpl.getOriginalMaTinh(),
					baoCaoDLITongHopModelImpl.getOriginalNam()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATINH_NAM, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATINH_NAM, args);
		}
	}

	/**
	 * Creates a new bao cao d l i tong hop with the primary key. Does not add the bao cao d l i tong hop to the database.
	 *
	 * @param id the primary key for the new bao cao d l i tong hop
	 * @return the new bao cao d l i tong hop
	 */
	@Override
	public BaoCaoDLITongHop create(long id) {
		BaoCaoDLITongHop baoCaoDLITongHop = new BaoCaoDLITongHopImpl();

		baoCaoDLITongHop.setNew(true);
		baoCaoDLITongHop.setPrimaryKey(id);

		return baoCaoDLITongHop;
	}

	/**
	 * Removes the bao cao d l i tong hop with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the bao cao d l i tong hop
	 * @return the bao cao d l i tong hop that was removed
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a bao cao d l i tong hop with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop remove(long id)
		throws NoSuchBaoCaoDLITongHopException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the bao cao d l i tong hop with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bao cao d l i tong hop
	 * @return the bao cao d l i tong hop that was removed
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a bao cao d l i tong hop with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop remove(Serializable primaryKey)
		throws NoSuchBaoCaoDLITongHopException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BaoCaoDLITongHop baoCaoDLITongHop = (BaoCaoDLITongHop)session.get(BaoCaoDLITongHopImpl.class,
					primaryKey);

			if (baoCaoDLITongHop == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBaoCaoDLITongHopException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(baoCaoDLITongHop);
		}
		catch (NoSuchBaoCaoDLITongHopException nsee) {
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
	protected BaoCaoDLITongHop removeImpl(BaoCaoDLITongHop baoCaoDLITongHop)
		throws SystemException {
		baoCaoDLITongHop = toUnwrappedModel(baoCaoDLITongHop);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(baoCaoDLITongHop)) {
				baoCaoDLITongHop = (BaoCaoDLITongHop)session.get(BaoCaoDLITongHopImpl.class,
						baoCaoDLITongHop.getPrimaryKeyObj());
			}

			if (baoCaoDLITongHop != null) {
				session.delete(baoCaoDLITongHop);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (baoCaoDLITongHop != null) {
			clearCache(baoCaoDLITongHop);
		}

		return baoCaoDLITongHop;
	}

	@Override
	public BaoCaoDLITongHop updateImpl(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop baoCaoDLITongHop)
		throws SystemException {
		baoCaoDLITongHop = toUnwrappedModel(baoCaoDLITongHop);

		boolean isNew = baoCaoDLITongHop.isNew();

		BaoCaoDLITongHopModelImpl baoCaoDLITongHopModelImpl = (BaoCaoDLITongHopModelImpl)baoCaoDLITongHop;

		Session session = null;

		try {
			session = openSession();

			if (baoCaoDLITongHop.isNew()) {
				session.save(baoCaoDLITongHop);

				baoCaoDLITongHop.setNew(false);
			}
			else {
				session.merge(baoCaoDLITongHop);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BaoCaoDLITongHopModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((baoCaoDLITongHopModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						baoCaoDLITongHopModelImpl.getOriginalNam()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAM, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAM,
					args);

				args = new Object[] { baoCaoDLITongHopModelImpl.getNam() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAM, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAM,
					args);
			}

			if ((baoCaoDLITongHopModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATINH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						baoCaoDLITongHopModelImpl.getOriginalMaTinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATINH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATINH,
					args);

				args = new Object[] { baoCaoDLITongHopModelImpl.getMaTinh() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATINH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MATINH,
					args);
			}
		}

		EntityCacheUtil.putResult(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
			BaoCaoDLITongHopImpl.class, baoCaoDLITongHop.getPrimaryKey(),
			baoCaoDLITongHop);

		clearUniqueFindersCache(baoCaoDLITongHop);
		cacheUniqueFindersCache(baoCaoDLITongHop);

		return baoCaoDLITongHop;
	}

	protected BaoCaoDLITongHop toUnwrappedModel(
		BaoCaoDLITongHop baoCaoDLITongHop) {
		if (baoCaoDLITongHop instanceof BaoCaoDLITongHopImpl) {
			return baoCaoDLITongHop;
		}

		BaoCaoDLITongHopImpl baoCaoDLITongHopImpl = new BaoCaoDLITongHopImpl();

		baoCaoDLITongHopImpl.setNew(baoCaoDLITongHop.isNew());
		baoCaoDLITongHopImpl.setPrimaryKey(baoCaoDLITongHop.getPrimaryKey());

		baoCaoDLITongHopImpl.setId(baoCaoDLITongHop.getId());
		baoCaoDLITongHopImpl.setMaTinh(baoCaoDLITongHop.getMaTinh());
		baoCaoDLITongHopImpl.setNam(baoCaoDLITongHop.getNam());
		baoCaoDLITongHopImpl.setSoDauNoiTheoKeHoach(baoCaoDLITongHop.getSoDauNoiTheoKeHoach());
		baoCaoDLITongHopImpl.setSoDauNoiMoi(baoCaoDLITongHop.getSoDauNoiMoi());
		baoCaoDLITongHopImpl.setSoNhaTieuHVSTheoKH(baoCaoDLITongHop.getSoNhaTieuHVSTheoKH());
		baoCaoDLITongHopImpl.setSoNhaTieuHVSMoi(baoCaoDLITongHop.getSoNhaTieuHVSMoi());
		baoCaoDLITongHopImpl.setSoNguoiHuongLoiNuocSach(baoCaoDLITongHop.getSoNguoiHuongLoiNuocSach());
		baoCaoDLITongHopImpl.setSoXa(baoCaoDLITongHop.getSoXa());
		baoCaoDLITongHopImpl.setTiLeHGDCoNhaTieu(baoCaoDLITongHop.getTiLeHGDCoNhaTieu());
		baoCaoDLITongHopImpl.setTiLeHGDCoNhaTieuHVS(baoCaoDLITongHop.getTiLeHGDCoNhaTieuHVS());
		baoCaoDLITongHopImpl.setTiLeTruongHocHVS(baoCaoDLITongHop.getTiLeTruongHocHVS());
		baoCaoDLITongHopImpl.setTiLeTramYTeHVS(baoCaoDLITongHop.getTiLeTramYTeHVS());
		baoCaoDLITongHopImpl.setSoNguoiHuongLoiVSTX(baoCaoDLITongHop.getSoNguoiHuongLoiVSTX());
		baoCaoDLITongHopImpl.setKeHoachPheDuyet(baoCaoDLITongHop.getKeHoachPheDuyet());
		baoCaoDLITongHopImpl.setNgayDuyetKeHoach(baoCaoDLITongHop.getNgayDuyetKeHoach());
		baoCaoDLITongHopImpl.setBaoCaoChuongTrinh(baoCaoDLITongHop.getBaoCaoChuongTrinh());
		baoCaoDLITongHopImpl.setNgayDangTai(baoCaoDLITongHop.getNgayDangTai());
		baoCaoDLITongHopImpl.setNguoiLap(baoCaoDLITongHop.getNguoiLap());
		baoCaoDLITongHopImpl.setNguoiDuyet(baoCaoDLITongHop.getNguoiDuyet());
		baoCaoDLITongHopImpl.setSoBaoCao(baoCaoDLITongHop.getSoBaoCao());
		baoCaoDLITongHopImpl.setNgayBaoCao(baoCaoDLITongHop.getNgayBaoCao());
		baoCaoDLITongHopImpl.setTrangThai(baoCaoDLITongHop.getTrangThai());
		baoCaoDLITongHopImpl.setLuuTruPdfTH(baoCaoDLITongHop.getLuuTruPdfTH());
		baoCaoDLITongHopImpl.setLuuTruPdf(baoCaoDLITongHop.getLuuTruPdf());
		baoCaoDLITongHopImpl.setLuuTruCsv(baoCaoDLITongHop.getLuuTruCsv());

		return baoCaoDLITongHopImpl;
	}

	/**
	 * Returns the bao cao d l i tong hop with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bao cao d l i tong hop
	 * @return the bao cao d l i tong hop
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a bao cao d l i tong hop with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBaoCaoDLITongHopException, SystemException {
		BaoCaoDLITongHop baoCaoDLITongHop = fetchByPrimaryKey(primaryKey);

		if (baoCaoDLITongHop == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBaoCaoDLITongHopException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return baoCaoDLITongHop;
	}

	/**
	 * Returns the bao cao d l i tong hop with the primary key or throws a {@link vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException} if it could not be found.
	 *
	 * @param id the primary key of the bao cao d l i tong hop
	 * @return the bao cao d l i tong hop
	 * @throws vn.dtt.sol.ns.baocaodli.dao.NoSuchBaoCaoDLITongHopException if a bao cao d l i tong hop with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop findByPrimaryKey(long id)
		throws NoSuchBaoCaoDLITongHopException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the bao cao d l i tong hop with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bao cao d l i tong hop
	 * @return the bao cao d l i tong hop, or <code>null</code> if a bao cao d l i tong hop with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		BaoCaoDLITongHop baoCaoDLITongHop = (BaoCaoDLITongHop)EntityCacheUtil.getResult(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
				BaoCaoDLITongHopImpl.class, primaryKey);

		if (baoCaoDLITongHop == _nullBaoCaoDLITongHop) {
			return null;
		}

		if (baoCaoDLITongHop == null) {
			Session session = null;

			try {
				session = openSession();

				baoCaoDLITongHop = (BaoCaoDLITongHop)session.get(BaoCaoDLITongHopImpl.class,
						primaryKey);

				if (baoCaoDLITongHop != null) {
					cacheResult(baoCaoDLITongHop);
				}
				else {
					EntityCacheUtil.putResult(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
						BaoCaoDLITongHopImpl.class, primaryKey,
						_nullBaoCaoDLITongHop);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BaoCaoDLITongHopModelImpl.ENTITY_CACHE_ENABLED,
					BaoCaoDLITongHopImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return baoCaoDLITongHop;
	}

	/**
	 * Returns the bao cao d l i tong hop with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the bao cao d l i tong hop
	 * @return the bao cao d l i tong hop, or <code>null</code> if a bao cao d l i tong hop with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BaoCaoDLITongHop fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the bao cao d l i tong hops.
	 *
	 * @return the bao cao d l i tong hops
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLITongHop> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bao cao d l i tong hops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bao cao d l i tong hops
	 * @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	 * @return the range of bao cao d l i tong hops
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLITongHop> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bao cao d l i tong hops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.baocaodli.dao.model.impl.BaoCaoDLITongHopModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bao cao d l i tong hops
	 * @param end the upper bound of the range of bao cao d l i tong hops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bao cao d l i tong hops
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BaoCaoDLITongHop> findAll(int start, int end,
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

		List<BaoCaoDLITongHop> list = (List<BaoCaoDLITongHop>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BAOCAODLITONGHOP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BAOCAODLITONGHOP;

				if (pagination) {
					sql = sql.concat(BaoCaoDLITongHopModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BaoCaoDLITongHop>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BaoCaoDLITongHop>(list);
				}
				else {
					list = (List<BaoCaoDLITongHop>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the bao cao d l i tong hops from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (BaoCaoDLITongHop baoCaoDLITongHop : findAll()) {
			remove(baoCaoDLITongHop);
		}
	}

	/**
	 * Returns the number of bao cao d l i tong hops.
	 *
	 * @return the number of bao cao d l i tong hops
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

				Query q = session.createQuery(_SQL_COUNT_BAOCAODLITONGHOP);

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
	 * Initializes the bao cao d l i tong hop persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BaoCaoDLITongHop>> listenersList = new ArrayList<ModelListener<BaoCaoDLITongHop>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BaoCaoDLITongHop>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BaoCaoDLITongHopImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BAOCAODLITONGHOP = "SELECT baoCaoDLITongHop FROM BaoCaoDLITongHop baoCaoDLITongHop";
	private static final String _SQL_SELECT_BAOCAODLITONGHOP_WHERE = "SELECT baoCaoDLITongHop FROM BaoCaoDLITongHop baoCaoDLITongHop WHERE ";
	private static final String _SQL_COUNT_BAOCAODLITONGHOP = "SELECT COUNT(baoCaoDLITongHop) FROM BaoCaoDLITongHop baoCaoDLITongHop";
	private static final String _SQL_COUNT_BAOCAODLITONGHOP_WHERE = "SELECT COUNT(baoCaoDLITongHop) FROM BaoCaoDLITongHop baoCaoDLITongHop WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "baoCaoDLITongHop.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BaoCaoDLITongHop exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BaoCaoDLITongHop exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BaoCaoDLITongHopPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maTinh", "nam", "soDauNoiTheoKeHoach", "soDauNoiMoi",
				"soNhaTieuHVSTheoKH", "soNhaTieuHVSMoi",
				"soNguoiHuongLoiNuocSach", "soXa", "tiLeHGDCoNhaTieu",
				"tiLeHGDCoNhaTieuHVS", "tiLeTruongHocHVS", "tiLeTramYTeHVS",
				"soNguoiHuongLoiVSTX", "keHoachPheDuyet", "ngayDuyetKeHoach",
				"baoCaoChuongTrinh", "ngayDangTai", "nguoiLap", "nguoiDuyet",
				"soBaoCao", "ngayBaoCao", "trangThai", "luuTruPdfTH",
				"luuTruPdf", "luuTruCsv"
			});
	private static BaoCaoDLITongHop _nullBaoCaoDLITongHop = new BaoCaoDLITongHopImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BaoCaoDLITongHop> toCacheModel() {
				return _nullBaoCaoDLITongHopCacheModel;
			}
		};

	private static CacheModel<BaoCaoDLITongHop> _nullBaoCaoDLITongHopCacheModel = new CacheModel<BaoCaoDLITongHop>() {
			@Override
			public BaoCaoDLITongHop toEntityModel() {
				return _nullBaoCaoDLITongHop;
			}
		};
}