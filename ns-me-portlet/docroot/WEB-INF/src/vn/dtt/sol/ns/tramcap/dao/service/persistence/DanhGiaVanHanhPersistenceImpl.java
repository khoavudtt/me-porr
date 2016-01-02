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

import vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException;
import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhImpl;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the danh gia van hanh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see DanhGiaVanHanhPersistence
 * @see DanhGiaVanHanhUtil
 * @generated
 */
public class DanhGiaVanHanhPersistenceImpl extends BasePersistenceImpl<DanhGiaVanHanh>
	implements DanhGiaVanHanhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DanhGiaVanHanhUtil} to access the danh gia van hanh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DanhGiaVanHanhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_N_ = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByN_",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_N_ = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByN_",
			new String[] { Integer.class.getName() },
			DanhGiaVanHanhModelImpl.NAM_COLUMN_BITMASK |
			DanhGiaVanHanhModelImpl.THANG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_N_ = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByN_",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the danh gia van hanhs where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVanHanh> findByN_(int nam) throws SystemException {
		return findByN_(nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh gia van hanhs where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of danh gia van hanhs
	 * @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	 * @return the range of matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVanHanh> findByN_(int nam, int start, int end)
		throws SystemException {
		return findByN_(nam, start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia van hanhs where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of danh gia van hanhs
	 * @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVanHanh> findByN_(int nam, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_N_;
			finderArgs = new Object[] { nam };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_N_;
			finderArgs = new Object[] { nam, start, end, orderByComparator };
		}

		List<DanhGiaVanHanh> list = (List<DanhGiaVanHanh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DanhGiaVanHanh danhGiaVanHanh : list) {
				if ((nam != danhGiaVanHanh.getNam())) {
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

			query.append(_SQL_SELECT_DANHGIAVANHANH_WHERE);

			query.append(_FINDER_COLUMN_N__NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DanhGiaVanHanhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nam);

				if (!pagination) {
					list = (List<DanhGiaVanHanh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaVanHanh>(list);
				}
				else {
					list = (List<DanhGiaVanHanh>)QueryUtil.list(q,
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
	 * Returns the first danh gia van hanh in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh findByN__First(int nam,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = fetchByN__First(nam, orderByComparator);

		if (danhGiaVanHanh != null) {
			return danhGiaVanHanh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaVanHanhException(msg.toString());
	}

	/**
	 * Returns the first danh gia van hanh in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh fetchByN__First(int nam,
		OrderByComparator orderByComparator) throws SystemException {
		List<DanhGiaVanHanh> list = findByN_(nam, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last danh gia van hanh in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh findByN__Last(int nam,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = fetchByN__Last(nam, orderByComparator);

		if (danhGiaVanHanh != null) {
			return danhGiaVanHanh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaVanHanhException(msg.toString());
	}

	/**
	 * Returns the last danh gia van hanh in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh fetchByN__Last(int nam,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByN_(nam);

		if (count == 0) {
			return null;
		}

		List<DanhGiaVanHanh> list = findByN_(nam, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the danh gia van hanhs before and after the current danh gia van hanh in the ordered set where nam = &#63;.
	 *
	 * @param id the primary key of the current danh gia van hanh
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a danh gia van hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh[] findByN__PrevAndNext(long id, int nam,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DanhGiaVanHanh[] array = new DanhGiaVanHanhImpl[3];

			array[0] = getByN__PrevAndNext(session, danhGiaVanHanh, nam,
					orderByComparator, true);

			array[1] = danhGiaVanHanh;

			array[2] = getByN__PrevAndNext(session, danhGiaVanHanh, nam,
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

	protected DanhGiaVanHanh getByN__PrevAndNext(Session session,
		DanhGiaVanHanh danhGiaVanHanh, int nam,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DANHGIAVANHANH_WHERE);

		query.append(_FINDER_COLUMN_N__NAM_2);

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
			query.append(DanhGiaVanHanhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nam);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(danhGiaVanHanh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DanhGiaVanHanh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the danh gia van hanhs where nam = &#63; from the database.
	 *
	 * @param nam the nam
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByN_(int nam) throws SystemException {
		for (DanhGiaVanHanh danhGiaVanHanh : findByN_(nam, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(danhGiaVanHanh);
		}
	}

	/**
	 * Returns the number of danh gia van hanhs where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the number of matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByN_(int nam) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_N_;

		Object[] finderArgs = new Object[] { nam };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DANHGIAVANHANH_WHERE);

			query.append(_FINDER_COLUMN_N__NAM_2);

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

	private static final String _FINDER_COLUMN_N__NAM_2 = "danhGiaVanHanh.nam = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_E_BY_T_ = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByE_BY_T_", new String[] { Integer.class.getName() },
			DanhGiaVanHanhModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_E_BY_T_ = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByE_BY_T_",
			new String[] { Integer.class.getName() });

	/**
	 * Returns the danh gia van hanh where tramCapNuocId = &#63; or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException} if it could not be found.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the matching danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh findByE_BY_T_(int tramCapNuocId)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = fetchByE_BY_T_(tramCapNuocId);

		if (danhGiaVanHanh == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("tramCapNuocId=");
			msg.append(tramCapNuocId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDanhGiaVanHanhException(msg.toString());
		}

		return danhGiaVanHanh;
	}

	/**
	 * Returns the danh gia van hanh where tramCapNuocId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh fetchByE_BY_T_(int tramCapNuocId)
		throws SystemException {
		return fetchByE_BY_T_(tramCapNuocId, true);
	}

	/**
	 * Returns the danh gia van hanh where tramCapNuocId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh fetchByE_BY_T_(int tramCapNuocId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { tramCapNuocId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_E_BY_T_,
					finderArgs, this);
		}

		if (result instanceof DanhGiaVanHanh) {
			DanhGiaVanHanh danhGiaVanHanh = (DanhGiaVanHanh)result;

			if ((tramCapNuocId != danhGiaVanHanh.getTramCapNuocId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DANHGIAVANHANH_WHERE);

			query.append(_FINDER_COLUMN_E_BY_T__TRAMCAPNUOCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				List<DanhGiaVanHanh> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_E_BY_T_,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DanhGiaVanHanhPersistenceImpl.fetchByE_BY_T_(int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DanhGiaVanHanh danhGiaVanHanh = list.get(0);

					result = danhGiaVanHanh;

					cacheResult(danhGiaVanHanh);

					if ((danhGiaVanHanh.getTramCapNuocId() != tramCapNuocId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_E_BY_T_,
							finderArgs, danhGiaVanHanh);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_E_BY_T_,
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
			return (DanhGiaVanHanh)result;
		}
	}

	/**
	 * Removes the danh gia van hanh where tramCapNuocId = &#63; from the database.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the danh gia van hanh that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh removeByE_BY_T_(int tramCapNuocId)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = findByE_BY_T_(tramCapNuocId);

		return remove(danhGiaVanHanh);
	}

	/**
	 * Returns the number of danh gia van hanhs where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the number of matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByE_BY_T_(int tramCapNuocId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_E_BY_T_;

		Object[] finderArgs = new Object[] { tramCapNuocId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DANHGIAVANHANH_WHERE);

			query.append(_FINDER_COLUMN_E_BY_T__TRAMCAPNUOCID_2);

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

	private static final String _FINDER_COLUMN_E_BY_T__TRAMCAPNUOCID_2 = "danhGiaVanHanh.tramCapNuocId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_ = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByT_",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_ = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_",
			new String[] { Integer.class.getName() },
			DanhGiaVanHanhModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK |
			DanhGiaVanHanhModelImpl.NAM_COLUMN_BITMASK |
			DanhGiaVanHanhModelImpl.THANG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_ = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the danh gia van hanhs where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVanHanh> findByT_(int tramCapNuocId)
		throws SystemException {
		return findByT_(tramCapNuocId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the danh gia van hanhs where tramCapNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param start the lower bound of the range of danh gia van hanhs
	 * @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	 * @return the range of matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVanHanh> findByT_(int tramCapNuocId, int start, int end)
		throws SystemException {
		return findByT_(tramCapNuocId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia van hanhs where tramCapNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param start the lower bound of the range of danh gia van hanhs
	 * @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVanHanh> findByT_(int tramCapNuocId, int start, int end,
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

		List<DanhGiaVanHanh> list = (List<DanhGiaVanHanh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DanhGiaVanHanh danhGiaVanHanh : list) {
				if ((tramCapNuocId != danhGiaVanHanh.getTramCapNuocId())) {
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

			query.append(_SQL_SELECT_DANHGIAVANHANH_WHERE);

			query.append(_FINDER_COLUMN_T__TRAMCAPNUOCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DanhGiaVanHanhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				if (!pagination) {
					list = (List<DanhGiaVanHanh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaVanHanh>(list);
				}
				else {
					list = (List<DanhGiaVanHanh>)QueryUtil.list(q,
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
	 * Returns the first danh gia van hanh in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh findByT__First(int tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = fetchByT__First(tramCapNuocId,
				orderByComparator);

		if (danhGiaVanHanh != null) {
			return danhGiaVanHanh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaVanHanhException(msg.toString());
	}

	/**
	 * Returns the first danh gia van hanh in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh fetchByT__First(int tramCapNuocId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DanhGiaVanHanh> list = findByT_(tramCapNuocId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last danh gia van hanh in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh findByT__Last(int tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = fetchByT__Last(tramCapNuocId,
				orderByComparator);

		if (danhGiaVanHanh != null) {
			return danhGiaVanHanh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaVanHanhException(msg.toString());
	}

	/**
	 * Returns the last danh gia van hanh in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh fetchByT__Last(int tramCapNuocId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByT_(tramCapNuocId);

		if (count == 0) {
			return null;
		}

		List<DanhGiaVanHanh> list = findByT_(tramCapNuocId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the danh gia van hanhs before and after the current danh gia van hanh in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param id the primary key of the current danh gia van hanh
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a danh gia van hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh[] findByT__PrevAndNext(long id, int tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DanhGiaVanHanh[] array = new DanhGiaVanHanhImpl[3];

			array[0] = getByT__PrevAndNext(session, danhGiaVanHanh,
					tramCapNuocId, orderByComparator, true);

			array[1] = danhGiaVanHanh;

			array[2] = getByT__PrevAndNext(session, danhGiaVanHanh,
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

	protected DanhGiaVanHanh getByT__PrevAndNext(Session session,
		DanhGiaVanHanh danhGiaVanHanh, int tramCapNuocId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DANHGIAVANHANH_WHERE);

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
			query.append(DanhGiaVanHanhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tramCapNuocId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(danhGiaVanHanh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DanhGiaVanHanh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the danh gia van hanhs where tramCapNuocId = &#63; from the database.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_(int tramCapNuocId) throws SystemException {
		for (DanhGiaVanHanh danhGiaVanHanh : findByT_(tramCapNuocId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(danhGiaVanHanh);
		}
	}

	/**
	 * Returns the number of danh gia van hanhs where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the number of matching danh gia van hanhs
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

			query.append(_SQL_COUNT_DANHGIAVANHANH_WHERE);

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

	private static final String _FINDER_COLUMN_T__TRAMCAPNUOCID_2 = "danhGiaVanHanh.tramCapNuocId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_N = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByT_N",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_N = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_N",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			DanhGiaVanHanhModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK |
			DanhGiaVanHanhModelImpl.NAM_COLUMN_BITMASK |
			DanhGiaVanHanhModelImpl.THANG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_N = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_N",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the danh gia van hanhs where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @return the matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVanHanh> findByT_N(int tramCapNuocId, int nam)
		throws SystemException {
		return findByT_N(tramCapNuocId, nam, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh gia van hanhs where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param start the lower bound of the range of danh gia van hanhs
	 * @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	 * @return the range of matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVanHanh> findByT_N(int tramCapNuocId, int nam,
		int start, int end) throws SystemException {
		return findByT_N(tramCapNuocId, nam, start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia van hanhs where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param start the lower bound of the range of danh gia van hanhs
	 * @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVanHanh> findByT_N(int tramCapNuocId, int nam,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_N;
			finderArgs = new Object[] { tramCapNuocId, nam };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_N;
			finderArgs = new Object[] {
					tramCapNuocId, nam,
					
					start, end, orderByComparator
				};
		}

		List<DanhGiaVanHanh> list = (List<DanhGiaVanHanh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DanhGiaVanHanh danhGiaVanHanh : list) {
				if ((tramCapNuocId != danhGiaVanHanh.getTramCapNuocId()) ||
						(nam != danhGiaVanHanh.getNam())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DANHGIAVANHANH_WHERE);

			query.append(_FINDER_COLUMN_T_N_TRAMCAPNUOCID_2);

			query.append(_FINDER_COLUMN_T_N_NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DanhGiaVanHanhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				qPos.add(nam);

				if (!pagination) {
					list = (List<DanhGiaVanHanh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaVanHanh>(list);
				}
				else {
					list = (List<DanhGiaVanHanh>)QueryUtil.list(q,
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
	 * Returns the first danh gia van hanh in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh findByT_N_First(int tramCapNuocId, int nam,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = fetchByT_N_First(tramCapNuocId, nam,
				orderByComparator);

		if (danhGiaVanHanh != null) {
			return danhGiaVanHanh;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(", nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaVanHanhException(msg.toString());
	}

	/**
	 * Returns the first danh gia van hanh in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh fetchByT_N_First(int tramCapNuocId, int nam,
		OrderByComparator orderByComparator) throws SystemException {
		List<DanhGiaVanHanh> list = findByT_N(tramCapNuocId, nam, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last danh gia van hanh in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh findByT_N_Last(int tramCapNuocId, int nam,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = fetchByT_N_Last(tramCapNuocId, nam,
				orderByComparator);

		if (danhGiaVanHanh != null) {
			return danhGiaVanHanh;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(", nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaVanHanhException(msg.toString());
	}

	/**
	 * Returns the last danh gia van hanh in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh fetchByT_N_Last(int tramCapNuocId, int nam,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByT_N(tramCapNuocId, nam);

		if (count == 0) {
			return null;
		}

		List<DanhGiaVanHanh> list = findByT_N(tramCapNuocId, nam, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the danh gia van hanhs before and after the current danh gia van hanh in the ordered set where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current danh gia van hanh
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a danh gia van hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh[] findByT_N_PrevAndNext(long id, int tramCapNuocId,
		int nam, OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DanhGiaVanHanh[] array = new DanhGiaVanHanhImpl[3];

			array[0] = getByT_N_PrevAndNext(session, danhGiaVanHanh,
					tramCapNuocId, nam, orderByComparator, true);

			array[1] = danhGiaVanHanh;

			array[2] = getByT_N_PrevAndNext(session, danhGiaVanHanh,
					tramCapNuocId, nam, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DanhGiaVanHanh getByT_N_PrevAndNext(Session session,
		DanhGiaVanHanh danhGiaVanHanh, int tramCapNuocId, int nam,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DANHGIAVANHANH_WHERE);

		query.append(_FINDER_COLUMN_T_N_TRAMCAPNUOCID_2);

		query.append(_FINDER_COLUMN_T_N_NAM_2);

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
			query.append(DanhGiaVanHanhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tramCapNuocId);

		qPos.add(nam);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(danhGiaVanHanh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DanhGiaVanHanh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the danh gia van hanhs where tramCapNuocId = &#63; and nam = &#63; from the database.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_N(int tramCapNuocId, int nam)
		throws SystemException {
		for (DanhGiaVanHanh danhGiaVanHanh : findByT_N(tramCapNuocId, nam,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(danhGiaVanHanh);
		}
	}

	/**
	 * Returns the number of danh gia van hanhs where tramCapNuocId = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param nam the nam
	 * @return the number of matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_N(int tramCapNuocId, int nam) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_N;

		Object[] finderArgs = new Object[] { tramCapNuocId, nam };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DANHGIAVANHANH_WHERE);

			query.append(_FINDER_COLUMN_T_N_TRAMCAPNUOCID_2);

			query.append(_FINDER_COLUMN_T_N_NAM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

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

	private static final String _FINDER_COLUMN_T_N_TRAMCAPNUOCID_2 = "danhGiaVanHanh.tramCapNuocId = ? AND ";
	private static final String _FINDER_COLUMN_T_N_NAM_2 = "danhGiaVanHanh.nam = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_T_T_N = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByT_T_N",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			DanhGiaVanHanhModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK |
			DanhGiaVanHanhModelImpl.THANG_COLUMN_BITMASK |
			DanhGiaVanHanhModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_T_N = new FinderPath(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_T_N",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns the danh gia van hanh where tramCapNuocId = &#63; and thang = &#63; and nam = &#63; or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException} if it could not be found.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param thang the thang
	 * @param nam the nam
	 * @return the matching danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh findByT_T_N(int tramCapNuocId, int thang, int nam)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = fetchByT_T_N(tramCapNuocId, thang, nam);

		if (danhGiaVanHanh == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("tramCapNuocId=");
			msg.append(tramCapNuocId);

			msg.append(", thang=");
			msg.append(thang);

			msg.append(", nam=");
			msg.append(nam);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDanhGiaVanHanhException(msg.toString());
		}

		return danhGiaVanHanh;
	}

	/**
	 * Returns the danh gia van hanh where tramCapNuocId = &#63; and thang = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param thang the thang
	 * @param nam the nam
	 * @return the matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh fetchByT_T_N(int tramCapNuocId, int thang, int nam)
		throws SystemException {
		return fetchByT_T_N(tramCapNuocId, thang, nam, true);
	}

	/**
	 * Returns the danh gia van hanh where tramCapNuocId = &#63; and thang = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param thang the thang
	 * @param nam the nam
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching danh gia van hanh, or <code>null</code> if a matching danh gia van hanh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh fetchByT_T_N(int tramCapNuocId, int thang, int nam,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { tramCapNuocId, thang, nam };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_T_T_N,
					finderArgs, this);
		}

		if (result instanceof DanhGiaVanHanh) {
			DanhGiaVanHanh danhGiaVanHanh = (DanhGiaVanHanh)result;

			if ((tramCapNuocId != danhGiaVanHanh.getTramCapNuocId()) ||
					(thang != danhGiaVanHanh.getThang()) ||
					(nam != danhGiaVanHanh.getNam())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_DANHGIAVANHANH_WHERE);

			query.append(_FINDER_COLUMN_T_T_N_TRAMCAPNUOCID_2);

			query.append(_FINDER_COLUMN_T_T_N_THANG_2);

			query.append(_FINDER_COLUMN_T_T_N_NAM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				qPos.add(thang);

				qPos.add(nam);

				List<DanhGiaVanHanh> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_T_N,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DanhGiaVanHanhPersistenceImpl.fetchByT_T_N(int, int, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DanhGiaVanHanh danhGiaVanHanh = list.get(0);

					result = danhGiaVanHanh;

					cacheResult(danhGiaVanHanh);

					if ((danhGiaVanHanh.getTramCapNuocId() != tramCapNuocId) ||
							(danhGiaVanHanh.getThang() != thang) ||
							(danhGiaVanHanh.getNam() != nam)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_T_N,
							finderArgs, danhGiaVanHanh);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_T_T_N,
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
			return (DanhGiaVanHanh)result;
		}
	}

	/**
	 * Removes the danh gia van hanh where tramCapNuocId = &#63; and thang = &#63; and nam = &#63; from the database.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param thang the thang
	 * @param nam the nam
	 * @return the danh gia van hanh that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh removeByT_T_N(int tramCapNuocId, int thang, int nam)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = findByT_T_N(tramCapNuocId, thang, nam);

		return remove(danhGiaVanHanh);
	}

	/**
	 * Returns the number of danh gia van hanhs where tramCapNuocId = &#63; and thang = &#63; and nam = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param thang the thang
	 * @param nam the nam
	 * @return the number of matching danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_T_N(int tramCapNuocId, int thang, int nam)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_T_N;

		Object[] finderArgs = new Object[] { tramCapNuocId, thang, nam };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DANHGIAVANHANH_WHERE);

			query.append(_FINDER_COLUMN_T_T_N_TRAMCAPNUOCID_2);

			query.append(_FINDER_COLUMN_T_T_N_THANG_2);

			query.append(_FINDER_COLUMN_T_T_N_NAM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				qPos.add(thang);

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

	private static final String _FINDER_COLUMN_T_T_N_TRAMCAPNUOCID_2 = "danhGiaVanHanh.tramCapNuocId = ? AND ";
	private static final String _FINDER_COLUMN_T_T_N_THANG_2 = "danhGiaVanHanh.thang = ? AND ";
	private static final String _FINDER_COLUMN_T_T_N_NAM_2 = "danhGiaVanHanh.nam = ?";

	public DanhGiaVanHanhPersistenceImpl() {
		setModelClass(DanhGiaVanHanh.class);
	}

	/**
	 * Caches the danh gia van hanh in the entity cache if it is enabled.
	 *
	 * @param danhGiaVanHanh the danh gia van hanh
	 */
	@Override
	public void cacheResult(DanhGiaVanHanh danhGiaVanHanh) {
		EntityCacheUtil.putResult(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class, danhGiaVanHanh.getPrimaryKey(),
			danhGiaVanHanh);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_E_BY_T_,
			new Object[] { danhGiaVanHanh.getTramCapNuocId() }, danhGiaVanHanh);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_T_N,
			new Object[] {
				danhGiaVanHanh.getTramCapNuocId(), danhGiaVanHanh.getThang(),
				danhGiaVanHanh.getNam()
			}, danhGiaVanHanh);

		danhGiaVanHanh.resetOriginalValues();
	}

	/**
	 * Caches the danh gia van hanhs in the entity cache if it is enabled.
	 *
	 * @param danhGiaVanHanhs the danh gia van hanhs
	 */
	@Override
	public void cacheResult(List<DanhGiaVanHanh> danhGiaVanHanhs) {
		for (DanhGiaVanHanh danhGiaVanHanh : danhGiaVanHanhs) {
			if (EntityCacheUtil.getResult(
						DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
						DanhGiaVanHanhImpl.class, danhGiaVanHanh.getPrimaryKey()) == null) {
				cacheResult(danhGiaVanHanh);
			}
			else {
				danhGiaVanHanh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all danh gia van hanhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DanhGiaVanHanhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DanhGiaVanHanhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the danh gia van hanh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DanhGiaVanHanh danhGiaVanHanh) {
		EntityCacheUtil.removeResult(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class, danhGiaVanHanh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(danhGiaVanHanh);
	}

	@Override
	public void clearCache(List<DanhGiaVanHanh> danhGiaVanHanhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DanhGiaVanHanh danhGiaVanHanh : danhGiaVanHanhs) {
			EntityCacheUtil.removeResult(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
				DanhGiaVanHanhImpl.class, danhGiaVanHanh.getPrimaryKey());

			clearUniqueFindersCache(danhGiaVanHanh);
		}
	}

	protected void cacheUniqueFindersCache(DanhGiaVanHanh danhGiaVanHanh) {
		if (danhGiaVanHanh.isNew()) {
			Object[] args = new Object[] { danhGiaVanHanh.getTramCapNuocId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_E_BY_T_, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_E_BY_T_, args,
				danhGiaVanHanh);

			args = new Object[] {
					danhGiaVanHanh.getTramCapNuocId(), danhGiaVanHanh.getThang(),
					danhGiaVanHanh.getNam()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_T_T_N, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_T_N, args,
				danhGiaVanHanh);
		}
		else {
			DanhGiaVanHanhModelImpl danhGiaVanHanhModelImpl = (DanhGiaVanHanhModelImpl)danhGiaVanHanh;

			if ((danhGiaVanHanhModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_E_BY_T_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { danhGiaVanHanh.getTramCapNuocId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_E_BY_T_, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_E_BY_T_, args,
					danhGiaVanHanh);
			}

			if ((danhGiaVanHanhModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_T_T_N.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhGiaVanHanh.getTramCapNuocId(),
						danhGiaVanHanh.getThang(), danhGiaVanHanh.getNam()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_T_T_N, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_T_N, args,
					danhGiaVanHanh);
			}
		}
	}

	protected void clearUniqueFindersCache(DanhGiaVanHanh danhGiaVanHanh) {
		DanhGiaVanHanhModelImpl danhGiaVanHanhModelImpl = (DanhGiaVanHanhModelImpl)danhGiaVanHanh;

		Object[] args = new Object[] { danhGiaVanHanh.getTramCapNuocId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_E_BY_T_, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_E_BY_T_, args);

		if ((danhGiaVanHanhModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_E_BY_T_.getColumnBitmask()) != 0) {
			args = new Object[] {
					danhGiaVanHanhModelImpl.getOriginalTramCapNuocId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_E_BY_T_, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_E_BY_T_, args);
		}

		args = new Object[] {
				danhGiaVanHanh.getTramCapNuocId(), danhGiaVanHanh.getThang(),
				danhGiaVanHanh.getNam()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_T_N, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_T_T_N, args);

		if ((danhGiaVanHanhModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_T_T_N.getColumnBitmask()) != 0) {
			args = new Object[] {
					danhGiaVanHanhModelImpl.getOriginalTramCapNuocId(),
					danhGiaVanHanhModelImpl.getOriginalThang(),
					danhGiaVanHanhModelImpl.getOriginalNam()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_T_N, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_T_T_N, args);
		}
	}

	/**
	 * Creates a new danh gia van hanh with the primary key. Does not add the danh gia van hanh to the database.
	 *
	 * @param id the primary key for the new danh gia van hanh
	 * @return the new danh gia van hanh
	 */
	@Override
	public DanhGiaVanHanh create(long id) {
		DanhGiaVanHanh danhGiaVanHanh = new DanhGiaVanHanhImpl();

		danhGiaVanHanh.setNew(true);
		danhGiaVanHanh.setPrimaryKey(id);

		return danhGiaVanHanh;
	}

	/**
	 * Removes the danh gia van hanh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the danh gia van hanh
	 * @return the danh gia van hanh that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a danh gia van hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh remove(long id)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the danh gia van hanh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the danh gia van hanh
	 * @return the danh gia van hanh that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a danh gia van hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh remove(Serializable primaryKey)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DanhGiaVanHanh danhGiaVanHanh = (DanhGiaVanHanh)session.get(DanhGiaVanHanhImpl.class,
					primaryKey);

			if (danhGiaVanHanh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDanhGiaVanHanhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(danhGiaVanHanh);
		}
		catch (NoSuchDanhGiaVanHanhException nsee) {
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
	protected DanhGiaVanHanh removeImpl(DanhGiaVanHanh danhGiaVanHanh)
		throws SystemException {
		danhGiaVanHanh = toUnwrappedModel(danhGiaVanHanh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(danhGiaVanHanh)) {
				danhGiaVanHanh = (DanhGiaVanHanh)session.get(DanhGiaVanHanhImpl.class,
						danhGiaVanHanh.getPrimaryKeyObj());
			}

			if (danhGiaVanHanh != null) {
				session.delete(danhGiaVanHanh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (danhGiaVanHanh != null) {
			clearCache(danhGiaVanHanh);
		}

		return danhGiaVanHanh;
	}

	@Override
	public DanhGiaVanHanh updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh danhGiaVanHanh)
		throws SystemException {
		danhGiaVanHanh = toUnwrappedModel(danhGiaVanHanh);

		boolean isNew = danhGiaVanHanh.isNew();

		DanhGiaVanHanhModelImpl danhGiaVanHanhModelImpl = (DanhGiaVanHanhModelImpl)danhGiaVanHanh;

		Session session = null;

		try {
			session = openSession();

			if (danhGiaVanHanh.isNew()) {
				session.save(danhGiaVanHanh);

				danhGiaVanHanh.setNew(false);
			}
			else {
				session.merge(danhGiaVanHanh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DanhGiaVanHanhModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((danhGiaVanHanhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_N_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhGiaVanHanhModelImpl.getOriginalNam()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_N_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_N_,
					args);

				args = new Object[] { danhGiaVanHanhModelImpl.getNam() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_N_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_N_,
					args);
			}

			if ((danhGiaVanHanhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhGiaVanHanhModelImpl.getOriginalTramCapNuocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_,
					args);

				args = new Object[] { danhGiaVanHanhModelImpl.getTramCapNuocId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_,
					args);
			}

			if ((danhGiaVanHanhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_N.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhGiaVanHanhModelImpl.getOriginalTramCapNuocId(),
						danhGiaVanHanhModelImpl.getOriginalNam()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_N, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_N,
					args);

				args = new Object[] {
						danhGiaVanHanhModelImpl.getTramCapNuocId(),
						danhGiaVanHanhModelImpl.getNam()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_N, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_N,
					args);
			}
		}

		EntityCacheUtil.putResult(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVanHanhImpl.class, danhGiaVanHanh.getPrimaryKey(),
			danhGiaVanHanh);

		clearUniqueFindersCache(danhGiaVanHanh);
		cacheUniqueFindersCache(danhGiaVanHanh);

		return danhGiaVanHanh;
	}

	protected DanhGiaVanHanh toUnwrappedModel(DanhGiaVanHanh danhGiaVanHanh) {
		if (danhGiaVanHanh instanceof DanhGiaVanHanhImpl) {
			return danhGiaVanHanh;
		}

		DanhGiaVanHanhImpl danhGiaVanHanhImpl = new DanhGiaVanHanhImpl();

		danhGiaVanHanhImpl.setNew(danhGiaVanHanh.isNew());
		danhGiaVanHanhImpl.setPrimaryKey(danhGiaVanHanh.getPrimaryKey());

		danhGiaVanHanhImpl.setId(danhGiaVanHanh.getId());
		danhGiaVanHanhImpl.setTramCapNuocId(danhGiaVanHanh.getTramCapNuocId());
		danhGiaVanHanhImpl.setThang(danhGiaVanHanh.getThang());
		danhGiaVanHanhImpl.setNam(danhGiaVanHanh.getNam());
		danhGiaVanHanhImpl.setCongXuatThucTe(danhGiaVanHanh.getCongXuatThucTe());
		danhGiaVanHanhImpl.setNuocThatThoat(danhGiaVanHanh.getNuocThatThoat());
		danhGiaVanHanhImpl.setNuocDatTieuChuan(danhGiaVanHanh.getNuocDatTieuChuan());
		danhGiaVanHanhImpl.setNuocCoAsen(danhGiaVanHanh.getNuocCoAsen());
		danhGiaVanHanhImpl.setTrangThaiCapNuoc(danhGiaVanHanh.getTrangThaiCapNuoc());
		danhGiaVanHanhImpl.setChiPhiHoaChat(danhGiaVanHanh.getChiPhiHoaChat());
		danhGiaVanHanhImpl.setChiPhiDien(danhGiaVanHanh.getChiPhiDien());
		danhGiaVanHanhImpl.setLuongNhanVien(danhGiaVanHanh.getLuongNhanVien());
		danhGiaVanHanhImpl.setChiPhiSuaChua(danhGiaVanHanh.getChiPhiSuaChua());
		danhGiaVanHanhImpl.setDoanhThu(danhGiaVanHanh.getDoanhThu());
		danhGiaVanHanhImpl.setNgayTao(danhGiaVanHanh.getNgayTao());
		danhGiaVanHanhImpl.setIdNguoiTao(danhGiaVanHanh.getIdNguoiTao());
		danhGiaVanHanhImpl.setGhiChu(danhGiaVanHanh.getGhiChu());
		danhGiaVanHanhImpl.setSanLuongSanXuat(danhGiaVanHanh.getSanLuongSanXuat());
		danhGiaVanHanhImpl.setSanLuongTieuHao(danhGiaVanHanh.getSanLuongTieuHao());

		return danhGiaVanHanhImpl;
	}

	/**
	 * Returns the danh gia van hanh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the danh gia van hanh
	 * @return the danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a danh gia van hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		DanhGiaVanHanh danhGiaVanHanh = fetchByPrimaryKey(primaryKey);

		if (danhGiaVanHanh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDanhGiaVanHanhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return danhGiaVanHanh;
	}

	/**
	 * Returns the danh gia van hanh with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException} if it could not be found.
	 *
	 * @param id the primary key of the danh gia van hanh
	 * @return the danh gia van hanh
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchDanhGiaVanHanhException if a danh gia van hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh findByPrimaryKey(long id)
		throws NoSuchDanhGiaVanHanhException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the danh gia van hanh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the danh gia van hanh
	 * @return the danh gia van hanh, or <code>null</code> if a danh gia van hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DanhGiaVanHanh danhGiaVanHanh = (DanhGiaVanHanh)EntityCacheUtil.getResult(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
				DanhGiaVanHanhImpl.class, primaryKey);

		if (danhGiaVanHanh == _nullDanhGiaVanHanh) {
			return null;
		}

		if (danhGiaVanHanh == null) {
			Session session = null;

			try {
				session = openSession();

				danhGiaVanHanh = (DanhGiaVanHanh)session.get(DanhGiaVanHanhImpl.class,
						primaryKey);

				if (danhGiaVanHanh != null) {
					cacheResult(danhGiaVanHanh);
				}
				else {
					EntityCacheUtil.putResult(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
						DanhGiaVanHanhImpl.class, primaryKey,
						_nullDanhGiaVanHanh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DanhGiaVanHanhModelImpl.ENTITY_CACHE_ENABLED,
					DanhGiaVanHanhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return danhGiaVanHanh;
	}

	/**
	 * Returns the danh gia van hanh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the danh gia van hanh
	 * @return the danh gia van hanh, or <code>null</code> if a danh gia van hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVanHanh fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the danh gia van hanhs.
	 *
	 * @return the danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVanHanh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh gia van hanhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of danh gia van hanhs
	 * @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	 * @return the range of danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVanHanh> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia van hanhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.DanhGiaVanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of danh gia van hanhs
	 * @param end the upper bound of the range of danh gia van hanhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of danh gia van hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVanHanh> findAll(int start, int end,
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

		List<DanhGiaVanHanh> list = (List<DanhGiaVanHanh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DANHGIAVANHANH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DANHGIAVANHANH;

				if (pagination) {
					sql = sql.concat(DanhGiaVanHanhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DanhGiaVanHanh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaVanHanh>(list);
				}
				else {
					list = (List<DanhGiaVanHanh>)QueryUtil.list(q,
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
	 * Removes all the danh gia van hanhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DanhGiaVanHanh danhGiaVanHanh : findAll()) {
			remove(danhGiaVanHanh);
		}
	}

	/**
	 * Returns the number of danh gia van hanhs.
	 *
	 * @return the number of danh gia van hanhs
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

				Query q = session.createQuery(_SQL_COUNT_DANHGIAVANHANH);

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
	 * Initializes the danh gia van hanh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.tramcap.dao.model.DanhGiaVanHanh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DanhGiaVanHanh>> listenersList = new ArrayList<ModelListener<DanhGiaVanHanh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DanhGiaVanHanh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DanhGiaVanHanhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DANHGIAVANHANH = "SELECT danhGiaVanHanh FROM DanhGiaVanHanh danhGiaVanHanh";
	private static final String _SQL_SELECT_DANHGIAVANHANH_WHERE = "SELECT danhGiaVanHanh FROM DanhGiaVanHanh danhGiaVanHanh WHERE ";
	private static final String _SQL_COUNT_DANHGIAVANHANH = "SELECT COUNT(danhGiaVanHanh) FROM DanhGiaVanHanh danhGiaVanHanh";
	private static final String _SQL_COUNT_DANHGIAVANHANH_WHERE = "SELECT COUNT(danhGiaVanHanh) FROM DanhGiaVanHanh danhGiaVanHanh WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "danhGiaVanHanh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DanhGiaVanHanh exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DanhGiaVanHanh exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DanhGiaVanHanhPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "tramCapNuocId", "thang", "nam", "congXuatThucTe",
				"nuocThatThoat", "nuocDatTieuChuan", "nuocCoAsen",
				"trangThaiCapNuoc", "chiPhiHoaChat", "chiPhiDien",
				"luongNhanVien", "chiPhiSuaChua", "doanhThu", "ngayTao",
				"ghiChu", "sanLuongSanXuat", "sanLuongTieuHao"
			});
	private static DanhGiaVanHanh _nullDanhGiaVanHanh = new DanhGiaVanHanhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DanhGiaVanHanh> toCacheModel() {
				return _nullDanhGiaVanHanhCacheModel;
			}
		};

	private static CacheModel<DanhGiaVanHanh> _nullDanhGiaVanHanhCacheModel = new CacheModel<DanhGiaVanHanh>() {
			@Override
			public DanhGiaVanHanh toEntityModel() {
				return _nullDanhGiaVanHanh;
			}
		};
}