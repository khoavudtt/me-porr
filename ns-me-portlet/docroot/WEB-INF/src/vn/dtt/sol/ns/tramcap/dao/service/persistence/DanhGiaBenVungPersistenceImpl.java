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

package vn.dtt.sol.ns.tramcap.dao.service.persistence;

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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException;
import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungImpl;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the danh gia ben vung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see DanhGiaBenVungPersistence
 * @see DanhGiaBenVungUtil
 * @generated
 */
public class DanhGiaBenVungPersistenceImpl extends BasePersistenceImpl<DanhGiaBenVung>
	implements DanhGiaBenVungPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DanhGiaBenVungUtil} to access the danh gia ben vung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DanhGiaBenVungImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaBenVungModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaBenVungImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaBenVungModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaBenVungImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaBenVungModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_N_ = new FinderPath(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaBenVungModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaBenVungImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByN_",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			DanhGiaBenVungModelImpl.NAM_COLUMN_BITMASK |
			DanhGiaBenVungModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_N_ = new FinderPath(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaBenVungModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByN_",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns the danh gia ben vung where nam = &#63; and tramCapNuocId = &#63; or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException} if it could not be found.
	 *
	 * @param nam the nam
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the matching danh gia ben vung
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a matching danh gia ben vung could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung findByN_(int nam, int tramCapNuocId)
		throws NoSuchDanhGiaBenVungException, SystemException {
		DanhGiaBenVung danhGiaBenVung = fetchByN_(nam, tramCapNuocId);

		if (danhGiaBenVung == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("nam=");
			msg.append(nam);

			msg.append(", tramCapNuocId=");
			msg.append(tramCapNuocId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDanhGiaBenVungException(msg.toString());
		}

		return danhGiaBenVung;
	}

	/**
	 * Returns the danh gia ben vung where nam = &#63; and tramCapNuocId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param nam the nam
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the matching danh gia ben vung, or <code>null</code> if a matching danh gia ben vung could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung fetchByN_(int nam, int tramCapNuocId)
		throws SystemException {
		return fetchByN_(nam, tramCapNuocId, true);
	}

	/**
	 * Returns the danh gia ben vung where nam = &#63; and tramCapNuocId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param nam the nam
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching danh gia ben vung, or <code>null</code> if a matching danh gia ben vung could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung fetchByN_(int nam, int tramCapNuocId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { nam, tramCapNuocId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_N_,
					finderArgs, this);
		}

		if (result instanceof DanhGiaBenVung) {
			DanhGiaBenVung danhGiaBenVung = (DanhGiaBenVung)result;

			if ((nam != danhGiaBenVung.getNam()) ||
					(tramCapNuocId != danhGiaBenVung.getTramCapNuocId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DANHGIABENVUNG_WHERE);

			query.append(_FINDER_COLUMN_N__NAM_2);

			query.append(_FINDER_COLUMN_N__TRAMCAPNUOCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nam);

				qPos.add(tramCapNuocId);

				List<DanhGiaBenVung> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_N_,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DanhGiaBenVungPersistenceImpl.fetchByN_(int, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DanhGiaBenVung danhGiaBenVung = list.get(0);

					result = danhGiaBenVung;

					cacheResult(danhGiaBenVung);

					if ((danhGiaBenVung.getNam() != nam) ||
							(danhGiaBenVung.getTramCapNuocId() != tramCapNuocId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_N_,
							finderArgs, danhGiaBenVung);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_N_, finderArgs);

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
			return (DanhGiaBenVung)result;
		}
	}

	/**
	 * Removes the danh gia ben vung where nam = &#63; and tramCapNuocId = &#63; from the database.
	 *
	 * @param nam the nam
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the danh gia ben vung that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung removeByN_(int nam, int tramCapNuocId)
		throws NoSuchDanhGiaBenVungException, SystemException {
		DanhGiaBenVung danhGiaBenVung = findByN_(nam, tramCapNuocId);

		return remove(danhGiaBenVung);
	}

	/**
	 * Returns the number of danh gia ben vungs where nam = &#63; and tramCapNuocId = &#63;.
	 *
	 * @param nam the nam
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the number of matching danh gia ben vungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByN_(int nam, int tramCapNuocId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_N_;

		Object[] finderArgs = new Object[] { nam, tramCapNuocId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DANHGIABENVUNG_WHERE);

			query.append(_FINDER_COLUMN_N__NAM_2);

			query.append(_FINDER_COLUMN_N__TRAMCAPNUOCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nam);

				qPos.add(tramCapNuocId);

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

	private static final String _FINDER_COLUMN_N__NAM_2 = "danhGiaBenVung.nam = ? AND ";
	private static final String _FINDER_COLUMN_N__TRAMCAPNUOCID_2 = "danhGiaBenVung.tramCapNuocId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_ = new FinderPath(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaBenVungModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaBenVungImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByT_",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_ = new FinderPath(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaBenVungModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaBenVungImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_",
			new String[] { Integer.class.getName() },
			DanhGiaBenVungModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK |
			DanhGiaBenVungModelImpl.NGAYTAO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_ = new FinderPath(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaBenVungModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the danh gia ben vungs where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the matching danh gia ben vungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaBenVung> findByT_(int tramCapNuocId)
		throws SystemException {
		return findByT_(tramCapNuocId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the danh gia ben vungs where tramCapNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param start the lower bound of the range of danh gia ben vungs
	 * @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	 * @return the range of matching danh gia ben vungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaBenVung> findByT_(int tramCapNuocId, int start, int end)
		throws SystemException {
		return findByT_(tramCapNuocId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia ben vungs where tramCapNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param start the lower bound of the range of danh gia ben vungs
	 * @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching danh gia ben vungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaBenVung> findByT_(int tramCapNuocId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_;
			finderArgs = new Object[] { tramCapNuocId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_;
			finderArgs = new Object[] {
					tramCapNuocId,
					
					start, end, orderByComparator
				};
		}

		List<DanhGiaBenVung> list = (List<DanhGiaBenVung>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DanhGiaBenVung danhGiaBenVung : list) {
				if ((tramCapNuocId != danhGiaBenVung.getTramCapNuocId())) {
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

			query.append(_SQL_SELECT_DANHGIABENVUNG_WHERE);

			query.append(_FINDER_COLUMN_T__TRAMCAPNUOCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DanhGiaBenVungModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				if (!pagination) {
					list = (List<DanhGiaBenVung>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaBenVung>(list);
				}
				else {
					list = (List<DanhGiaBenVung>)QueryUtil.list(q,
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
	 * Returns the first danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia ben vung
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a matching danh gia ben vung could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung findByT__First(int tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaBenVungException, SystemException {
		DanhGiaBenVung danhGiaBenVung = fetchByT__First(tramCapNuocId,
				orderByComparator);

		if (danhGiaBenVung != null) {
			return danhGiaBenVung;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaBenVungException(msg.toString());
	}

	/**
	 * Returns the first danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia ben vung, or <code>null</code> if a matching danh gia ben vung could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung fetchByT__First(int tramCapNuocId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DanhGiaBenVung> list = findByT_(tramCapNuocId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia ben vung
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a matching danh gia ben vung could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung findByT__Last(int tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaBenVungException, SystemException {
		DanhGiaBenVung danhGiaBenVung = fetchByT__Last(tramCapNuocId,
				orderByComparator);

		if (danhGiaBenVung != null) {
			return danhGiaBenVung;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaBenVungException(msg.toString());
	}

	/**
	 * Returns the last danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia ben vung, or <code>null</code> if a matching danh gia ben vung could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung fetchByT__Last(int tramCapNuocId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByT_(tramCapNuocId);

		if (count == 0) {
			return null;
		}

		List<DanhGiaBenVung> list = findByT_(tramCapNuocId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the danh gia ben vungs before and after the current danh gia ben vung in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param id the primary key of the current danh gia ben vung
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next danh gia ben vung
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a danh gia ben vung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung[] findByT__PrevAndNext(long id, int tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaBenVungException, SystemException {
		DanhGiaBenVung danhGiaBenVung = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DanhGiaBenVung[] array = new DanhGiaBenVungImpl[3];

			array[0] = getByT__PrevAndNext(session, danhGiaBenVung,
					tramCapNuocId, orderByComparator, true);

			array[1] = danhGiaBenVung;

			array[2] = getByT__PrevAndNext(session, danhGiaBenVung,
					tramCapNuocId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DanhGiaBenVung getByT__PrevAndNext(Session session,
		DanhGiaBenVung danhGiaBenVung, int tramCapNuocId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DANHGIABENVUNG_WHERE);

		query.append(_FINDER_COLUMN_T__TRAMCAPNUOCID_2);

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
			query.append(DanhGiaBenVungModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tramCapNuocId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(danhGiaBenVung);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DanhGiaBenVung> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the danh gia ben vungs where tramCapNuocId = &#63; from the database.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_(int tramCapNuocId) throws SystemException {
		for (DanhGiaBenVung danhGiaBenVung : findByT_(tramCapNuocId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(danhGiaBenVung);
		}
	}

	/**
	 * Returns the number of danh gia ben vungs where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the number of matching danh gia ben vungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_(int tramCapNuocId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_;

		Object[] finderArgs = new Object[] { tramCapNuocId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DANHGIABENVUNG_WHERE);

			query.append(_FINDER_COLUMN_T__TRAMCAPNUOCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

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

	private static final String _FINDER_COLUMN_T__TRAMCAPNUOCID_2 = "danhGiaBenVung.tramCapNuocId = ?";

	public DanhGiaBenVungPersistenceImpl() {
		setModelClass(DanhGiaBenVung.class);
	}

	/**
	 * Caches the danh gia ben vung in the entity cache if it is enabled.
	 *
	 * @param danhGiaBenVung the danh gia ben vung
	 */
	@Override
	public void cacheResult(DanhGiaBenVung danhGiaBenVung) {
		EntityCacheUtil.putResult(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaBenVungImpl.class, danhGiaBenVung.getPrimaryKey(),
			danhGiaBenVung);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_N_,
			new Object[] {
				danhGiaBenVung.getNam(), danhGiaBenVung.getTramCapNuocId()
			}, danhGiaBenVung);

		danhGiaBenVung.resetOriginalValues();
	}

	/**
	 * Caches the danh gia ben vungs in the entity cache if it is enabled.
	 *
	 * @param danhGiaBenVungs the danh gia ben vungs
	 */
	@Override
	public void cacheResult(List<DanhGiaBenVung> danhGiaBenVungs) {
		for (DanhGiaBenVung danhGiaBenVung : danhGiaBenVungs) {
			if (EntityCacheUtil.getResult(
						DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
						DanhGiaBenVungImpl.class, danhGiaBenVung.getPrimaryKey()) == null) {
				cacheResult(danhGiaBenVung);
			}
			else {
				danhGiaBenVung.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all danh gia ben vungs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DanhGiaBenVungImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DanhGiaBenVungImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the danh gia ben vung.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DanhGiaBenVung danhGiaBenVung) {
		EntityCacheUtil.removeResult(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaBenVungImpl.class, danhGiaBenVung.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(danhGiaBenVung);
	}

	@Override
	public void clearCache(List<DanhGiaBenVung> danhGiaBenVungs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DanhGiaBenVung danhGiaBenVung : danhGiaBenVungs) {
			EntityCacheUtil.removeResult(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
				DanhGiaBenVungImpl.class, danhGiaBenVung.getPrimaryKey());

			clearUniqueFindersCache(danhGiaBenVung);
		}
	}

	protected void cacheUniqueFindersCache(DanhGiaBenVung danhGiaBenVung) {
		if (danhGiaBenVung.isNew()) {
			Object[] args = new Object[] {
					danhGiaBenVung.getNam(), danhGiaBenVung.getTramCapNuocId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_N_, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_N_, args,
				danhGiaBenVung);
		}
		else {
			DanhGiaBenVungModelImpl danhGiaBenVungModelImpl = (DanhGiaBenVungModelImpl)danhGiaBenVung;

			if ((danhGiaBenVungModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_N_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhGiaBenVung.getNam(),
						danhGiaBenVung.getTramCapNuocId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_N_, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_N_, args,
					danhGiaBenVung);
			}
		}
	}

	protected void clearUniqueFindersCache(DanhGiaBenVung danhGiaBenVung) {
		DanhGiaBenVungModelImpl danhGiaBenVungModelImpl = (DanhGiaBenVungModelImpl)danhGiaBenVung;

		Object[] args = new Object[] {
				danhGiaBenVung.getNam(), danhGiaBenVung.getTramCapNuocId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_N_, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_N_, args);

		if ((danhGiaBenVungModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_N_.getColumnBitmask()) != 0) {
			args = new Object[] {
					danhGiaBenVungModelImpl.getOriginalNam(),
					danhGiaBenVungModelImpl.getOriginalTramCapNuocId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_N_, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_N_, args);
		}
	}

	/**
	 * Creates a new danh gia ben vung with the primary key. Does not add the danh gia ben vung to the database.
	 *
	 * @param id the primary key for the new danh gia ben vung
	 * @return the new danh gia ben vung
	 */
	@Override
	public DanhGiaBenVung create(long id) {
		DanhGiaBenVung danhGiaBenVung = new DanhGiaBenVungImpl();

		danhGiaBenVung.setNew(true);
		danhGiaBenVung.setPrimaryKey(id);

		return danhGiaBenVung;
	}

	/**
	 * Removes the danh gia ben vung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the danh gia ben vung
	 * @return the danh gia ben vung that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a danh gia ben vung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung remove(long id)
		throws NoSuchDanhGiaBenVungException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the danh gia ben vung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the danh gia ben vung
	 * @return the danh gia ben vung that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a danh gia ben vung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung remove(Serializable primaryKey)
		throws NoSuchDanhGiaBenVungException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DanhGiaBenVung danhGiaBenVung = (DanhGiaBenVung)session.get(DanhGiaBenVungImpl.class,
					primaryKey);

			if (danhGiaBenVung == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDanhGiaBenVungException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(danhGiaBenVung);
		}
		catch (NoSuchDanhGiaBenVungException nsee) {
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
	protected DanhGiaBenVung removeImpl(DanhGiaBenVung danhGiaBenVung)
		throws SystemException {
		danhGiaBenVung = toUnwrappedModel(danhGiaBenVung);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(danhGiaBenVung)) {
				danhGiaBenVung = (DanhGiaBenVung)session.get(DanhGiaBenVungImpl.class,
						danhGiaBenVung.getPrimaryKeyObj());
			}

			if (danhGiaBenVung != null) {
				session.delete(danhGiaBenVung);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (danhGiaBenVung != null) {
			clearCache(danhGiaBenVung);
		}

		return danhGiaBenVung;
	}

	@Override
	public DanhGiaBenVung updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung danhGiaBenVung)
		throws SystemException {
		danhGiaBenVung = toUnwrappedModel(danhGiaBenVung);

		boolean isNew = danhGiaBenVung.isNew();

		DanhGiaBenVungModelImpl danhGiaBenVungModelImpl = (DanhGiaBenVungModelImpl)danhGiaBenVung;

		Session session = null;

		try {
			session = openSession();

			if (danhGiaBenVung.isNew()) {
				session.save(danhGiaBenVung);

				danhGiaBenVung.setNew(false);
			}
			else {
				session.merge(danhGiaBenVung);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DanhGiaBenVungModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((danhGiaBenVungModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhGiaBenVungModelImpl.getOriginalTramCapNuocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_,
					args);

				args = new Object[] { danhGiaBenVungModelImpl.getTramCapNuocId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_,
					args);
			}
		}

		EntityCacheUtil.putResult(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaBenVungImpl.class, danhGiaBenVung.getPrimaryKey(),
			danhGiaBenVung);

		clearUniqueFindersCache(danhGiaBenVung);
		cacheUniqueFindersCache(danhGiaBenVung);

		return danhGiaBenVung;
	}

	protected DanhGiaBenVung toUnwrappedModel(DanhGiaBenVung danhGiaBenVung) {
		if (danhGiaBenVung instanceof DanhGiaBenVungImpl) {
			return danhGiaBenVung;
		}

		DanhGiaBenVungImpl danhGiaBenVungImpl = new DanhGiaBenVungImpl();

		danhGiaBenVungImpl.setNew(danhGiaBenVung.isNew());
		danhGiaBenVungImpl.setPrimaryKey(danhGiaBenVung.getPrimaryKey());

		danhGiaBenVungImpl.setId(danhGiaBenVung.getId());
		danhGiaBenVungImpl.setTramCapNuocId(danhGiaBenVung.getTramCapNuocId());
		danhGiaBenVungImpl.setNam(danhGiaBenVung.getNam());
		danhGiaBenVungImpl.setTrangThaiCapNuoc(danhGiaBenVung.getTrangThaiCapNuoc());
		danhGiaBenVungImpl.setCongXuatThucTe(danhGiaBenVung.getCongXuatThucTe());
		danhGiaBenVungImpl.setTongDauNoiMoi(danhGiaBenVung.getTongDauNoiMoi());
		danhGiaBenVungImpl.setTongDauNoiThucTe(danhGiaBenVung.getTongDauNoiThucTe());
		danhGiaBenVungImpl.setSoNguoiCapThucTe(danhGiaBenVung.getSoNguoiCapThucTe());
		danhGiaBenVungImpl.setNuocThatThoat(danhGiaBenVung.getNuocThatThoat());
		danhGiaBenVungImpl.setNuocDatTieuChuan(danhGiaBenVung.getNuocDatTieuChuan());
		danhGiaBenVungImpl.setNuocCoAsen(danhGiaBenVung.getNuocCoAsen());
		danhGiaBenVungImpl.setTongChiPhi(danhGiaBenVung.getTongChiPhi());
		danhGiaBenVungImpl.setTongDoanhThu(danhGiaBenVung.getTongDoanhThu());
		danhGiaBenVungImpl.setNgayTao(danhGiaBenVung.getNgayTao());
		danhGiaBenVungImpl.setIdNguoiTao(danhGiaBenVung.getIdNguoiTao());
		danhGiaBenVungImpl.setGhiChu(danhGiaBenVung.getGhiChu());
		danhGiaBenVungImpl.setKetQuaDanhGia(danhGiaBenVung.getKetQuaDanhGia());
		danhGiaBenVungImpl.setBaoCaoDLI(danhGiaBenVung.getBaoCaoDLI());

		return danhGiaBenVungImpl;
	}

	/**
	 * Returns the danh gia ben vung with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the danh gia ben vung
	 * @return the danh gia ben vung
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a danh gia ben vung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDanhGiaBenVungException, SystemException {
		DanhGiaBenVung danhGiaBenVung = fetchByPrimaryKey(primaryKey);

		if (danhGiaBenVung == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDanhGiaBenVungException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return danhGiaBenVung;
	}

	/**
	 * Returns the danh gia ben vung with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException} if it could not be found.
	 *
	 * @param id the primary key of the danh gia ben vung
	 * @return the danh gia ben vung
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaBenVungException if a danh gia ben vung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung findByPrimaryKey(long id)
		throws NoSuchDanhGiaBenVungException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the danh gia ben vung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the danh gia ben vung
	 * @return the danh gia ben vung, or <code>null</code> if a danh gia ben vung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DanhGiaBenVung danhGiaBenVung = (DanhGiaBenVung)EntityCacheUtil.getResult(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
				DanhGiaBenVungImpl.class, primaryKey);

		if (danhGiaBenVung == _nullDanhGiaBenVung) {
			return null;
		}

		if (danhGiaBenVung == null) {
			Session session = null;

			try {
				session = openSession();

				danhGiaBenVung = (DanhGiaBenVung)session.get(DanhGiaBenVungImpl.class,
						primaryKey);

				if (danhGiaBenVung != null) {
					cacheResult(danhGiaBenVung);
				}
				else {
					EntityCacheUtil.putResult(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
						DanhGiaBenVungImpl.class, primaryKey,
						_nullDanhGiaBenVung);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DanhGiaBenVungModelImpl.ENTITY_CACHE_ENABLED,
					DanhGiaBenVungImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return danhGiaBenVung;
	}

	/**
	 * Returns the danh gia ben vung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the danh gia ben vung
	 * @return the danh gia ben vung, or <code>null</code> if a danh gia ben vung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaBenVung fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the danh gia ben vungs.
	 *
	 * @return the danh gia ben vungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaBenVung> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh gia ben vungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of danh gia ben vungs
	 * @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	 * @return the range of danh gia ben vungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaBenVung> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia ben vungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaBenVungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of danh gia ben vungs
	 * @param end the upper bound of the range of danh gia ben vungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of danh gia ben vungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaBenVung> findAll(int start, int end,
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

		List<DanhGiaBenVung> list = (List<DanhGiaBenVung>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DANHGIABENVUNG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DANHGIABENVUNG;

				if (pagination) {
					sql = sql.concat(DanhGiaBenVungModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DanhGiaBenVung>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaBenVung>(list);
				}
				else {
					list = (List<DanhGiaBenVung>)QueryUtil.list(q,
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
	 * Removes all the danh gia ben vungs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DanhGiaBenVung danhGiaBenVung : findAll()) {
			remove(danhGiaBenVung);
		}
	}

	/**
	 * Returns the number of danh gia ben vungs.
	 *
	 * @return the number of danh gia ben vungs
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

				Query q = session.createQuery(_SQL_COUNT_DANHGIABENVUNG);

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
	 * Initializes the danh gia ben vung persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DanhGiaBenVung>> listenersList = new ArrayList<ModelListener<DanhGiaBenVung>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DanhGiaBenVung>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DanhGiaBenVungImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DANHGIABENVUNG = "SELECT danhGiaBenVung FROM DanhGiaBenVung danhGiaBenVung";
	private static final String _SQL_SELECT_DANHGIABENVUNG_WHERE = "SELECT danhGiaBenVung FROM DanhGiaBenVung danhGiaBenVung WHERE ";
	private static final String _SQL_COUNT_DANHGIABENVUNG = "SELECT COUNT(danhGiaBenVung) FROM DanhGiaBenVung danhGiaBenVung";
	private static final String _SQL_COUNT_DANHGIABENVUNG_WHERE = "SELECT COUNT(danhGiaBenVung) FROM DanhGiaBenVung danhGiaBenVung WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "danhGiaBenVung.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DanhGiaBenVung exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DanhGiaBenVung exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DanhGiaBenVungPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "tramCapNuocId", "nam", "trangThaiCapNuoc",
				"congXuatThucTe", "tongDauNoiMoi", "tongDauNoiThucTe",
				"soNguoiCapThucTe", "nuocThatThoat", "nuocDatTieuChuan",
				"nuocCoAsen", "tongChiPhi", "tongDoanhThu", "ngayTao", "ghiChu",
				"ketQuaDanhGia", "baoCaoDLI"
			});
	private static DanhGiaBenVung _nullDanhGiaBenVung = new DanhGiaBenVungImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DanhGiaBenVung> toCacheModel() {
				return _nullDanhGiaBenVungCacheModel;
			}
		};

	private static CacheModel<DanhGiaBenVung> _nullDanhGiaBenVungCacheModel = new CacheModel<DanhGiaBenVung>() {
			@Override
			public DanhGiaBenVung toEntityModel() {
				return _nullDanhGiaBenVung;
			}
		};
}