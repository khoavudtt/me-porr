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

import vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException;
import vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach;
import vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachImpl;
import vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the ke hoach nuoc sach service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see KeHoachNuocSachPersistence
 * @see KeHoachNuocSachUtil
 * @generated
 */
public class KeHoachNuocSachPersistenceImpl extends BasePersistenceImpl<KeHoachNuocSach>
	implements KeHoachNuocSachPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KeHoachNuocSachUtil} to access the ke hoach nuoc sach persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KeHoachNuocSachImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachNuocSachModelImpl.FINDER_CACHE_ENABLED,
			KeHoachNuocSachImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachNuocSachModelImpl.FINDER_CACHE_ENABLED,
			KeHoachNuocSachImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachNuocSachModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_ = new FinderPath(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachNuocSachModelImpl.FINDER_CACHE_ENABLED,
			KeHoachNuocSachImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByT_",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_ = new FinderPath(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachNuocSachModelImpl.FINDER_CACHE_ENABLED,
			KeHoachNuocSachImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_",
			new String[] { Integer.class.getName() },
			KeHoachNuocSachModelImpl.TRAMCAPNUOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_ = new FinderPath(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachNuocSachModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the ke hoach nuoc sachs where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the matching ke hoach nuoc sachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachNuocSach> findByT_(int tramCapNuocId)
		throws SystemException {
		return findByT_(tramCapNuocId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the ke hoach nuoc sachs where tramCapNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param start the lower bound of the range of ke hoach nuoc sachs
	 * @param end the upper bound of the range of ke hoach nuoc sachs (not inclusive)
	 * @return the range of matching ke hoach nuoc sachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachNuocSach> findByT_(int tramCapNuocId, int start, int end)
		throws SystemException {
		return findByT_(tramCapNuocId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach nuoc sachs where tramCapNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param start the lower bound of the range of ke hoach nuoc sachs
	 * @param end the upper bound of the range of ke hoach nuoc sachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ke hoach nuoc sachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachNuocSach> findByT_(int tramCapNuocId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<KeHoachNuocSach> list = (List<KeHoachNuocSach>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KeHoachNuocSach keHoachNuocSach : list) {
				if ((tramCapNuocId != keHoachNuocSach.getTramCapNuocId())) {
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

			query.append(_SQL_SELECT_KEHOACHNUOCSACH_WHERE);

			query.append(_FINDER_COLUMN_T__TRAMCAPNUOCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KeHoachNuocSachModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tramCapNuocId);

				if (!pagination) {
					list = (List<KeHoachNuocSach>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachNuocSach>(list);
				}
				else {
					list = (List<KeHoachNuocSach>)QueryUtil.list(q,
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
	 * Returns the first ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach nuoc sach
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a matching ke hoach nuoc sach could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachNuocSach findByT__First(int tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachNuocSachException, SystemException {
		KeHoachNuocSach keHoachNuocSach = fetchByT__First(tramCapNuocId,
				orderByComparator);

		if (keHoachNuocSach != null) {
			return keHoachNuocSach;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachNuocSachException(msg.toString());
	}

	/**
	 * Returns the first ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ke hoach nuoc sach, or <code>null</code> if a matching ke hoach nuoc sach could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachNuocSach fetchByT__First(int tramCapNuocId,
		OrderByComparator orderByComparator) throws SystemException {
		List<KeHoachNuocSach> list = findByT_(tramCapNuocId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach nuoc sach
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a matching ke hoach nuoc sach could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachNuocSach findByT__Last(int tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachNuocSachException, SystemException {
		KeHoachNuocSach keHoachNuocSach = fetchByT__Last(tramCapNuocId,
				orderByComparator);

		if (keHoachNuocSach != null) {
			return keHoachNuocSach;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tramCapNuocId=");
		msg.append(tramCapNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKeHoachNuocSachException(msg.toString());
	}

	/**
	 * Returns the last ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ke hoach nuoc sach, or <code>null</code> if a matching ke hoach nuoc sach could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachNuocSach fetchByT__Last(int tramCapNuocId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByT_(tramCapNuocId);

		if (count == 0) {
			return null;
		}

		List<KeHoachNuocSach> list = findByT_(tramCapNuocId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ke hoach nuoc sachs before and after the current ke hoach nuoc sach in the ordered set where tramCapNuocId = &#63;.
	 *
	 * @param id the primary key of the current ke hoach nuoc sach
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ke hoach nuoc sach
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a ke hoach nuoc sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachNuocSach[] findByT__PrevAndNext(long id, int tramCapNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchKeHoachNuocSachException, SystemException {
		KeHoachNuocSach keHoachNuocSach = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KeHoachNuocSach[] array = new KeHoachNuocSachImpl[3];

			array[0] = getByT__PrevAndNext(session, keHoachNuocSach,
					tramCapNuocId, orderByComparator, true);

			array[1] = keHoachNuocSach;

			array[2] = getByT__PrevAndNext(session, keHoachNuocSach,
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

	protected KeHoachNuocSach getByT__PrevAndNext(Session session,
		KeHoachNuocSach keHoachNuocSach, int tramCapNuocId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEHOACHNUOCSACH_WHERE);

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
			query.append(KeHoachNuocSachModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tramCapNuocId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(keHoachNuocSach);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KeHoachNuocSach> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ke hoach nuoc sachs where tramCapNuocId = &#63; from the database.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_(int tramCapNuocId) throws SystemException {
		for (KeHoachNuocSach keHoachNuocSach : findByT_(tramCapNuocId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(keHoachNuocSach);
		}
	}

	/**
	 * Returns the number of ke hoach nuoc sachs where tramCapNuocId = &#63;.
	 *
	 * @param tramCapNuocId the tram cap nuoc ID
	 * @return the number of matching ke hoach nuoc sachs
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

			query.append(_SQL_COUNT_KEHOACHNUOCSACH_WHERE);

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

	private static final String _FINDER_COLUMN_T__TRAMCAPNUOCID_2 = "keHoachNuocSach.tramCapNuocId = ?";

	public KeHoachNuocSachPersistenceImpl() {
		setModelClass(KeHoachNuocSach.class);
	}

	/**
	 * Caches the ke hoach nuoc sach in the entity cache if it is enabled.
	 *
	 * @param keHoachNuocSach the ke hoach nuoc sach
	 */
	@Override
	public void cacheResult(KeHoachNuocSach keHoachNuocSach) {
		EntityCacheUtil.putResult(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachNuocSachImpl.class, keHoachNuocSach.getPrimaryKey(),
			keHoachNuocSach);

		keHoachNuocSach.resetOriginalValues();
	}

	/**
	 * Caches the ke hoach nuoc sachs in the entity cache if it is enabled.
	 *
	 * @param keHoachNuocSachs the ke hoach nuoc sachs
	 */
	@Override
	public void cacheResult(List<KeHoachNuocSach> keHoachNuocSachs) {
		for (KeHoachNuocSach keHoachNuocSach : keHoachNuocSachs) {
			if (EntityCacheUtil.getResult(
						KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
						KeHoachNuocSachImpl.class,
						keHoachNuocSach.getPrimaryKey()) == null) {
				cacheResult(keHoachNuocSach);
			}
			else {
				keHoachNuocSach.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ke hoach nuoc sachs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KeHoachNuocSachImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KeHoachNuocSachImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ke hoach nuoc sach.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KeHoachNuocSach keHoachNuocSach) {
		EntityCacheUtil.removeResult(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachNuocSachImpl.class, keHoachNuocSach.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<KeHoachNuocSach> keHoachNuocSachs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KeHoachNuocSach keHoachNuocSach : keHoachNuocSachs) {
			EntityCacheUtil.removeResult(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
				KeHoachNuocSachImpl.class, keHoachNuocSach.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ke hoach nuoc sach with the primary key. Does not add the ke hoach nuoc sach to the database.
	 *
	 * @param id the primary key for the new ke hoach nuoc sach
	 * @return the new ke hoach nuoc sach
	 */
	@Override
	public KeHoachNuocSach create(long id) {
		KeHoachNuocSach keHoachNuocSach = new KeHoachNuocSachImpl();

		keHoachNuocSach.setNew(true);
		keHoachNuocSach.setPrimaryKey(id);

		return keHoachNuocSach;
	}

	/**
	 * Removes the ke hoach nuoc sach with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ke hoach nuoc sach
	 * @return the ke hoach nuoc sach that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a ke hoach nuoc sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachNuocSach remove(long id)
		throws NoSuchKeHoachNuocSachException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the ke hoach nuoc sach with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ke hoach nuoc sach
	 * @return the ke hoach nuoc sach that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a ke hoach nuoc sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachNuocSach remove(Serializable primaryKey)
		throws NoSuchKeHoachNuocSachException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KeHoachNuocSach keHoachNuocSach = (KeHoachNuocSach)session.get(KeHoachNuocSachImpl.class,
					primaryKey);

			if (keHoachNuocSach == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKeHoachNuocSachException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(keHoachNuocSach);
		}
		catch (NoSuchKeHoachNuocSachException nsee) {
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
	protected KeHoachNuocSach removeImpl(KeHoachNuocSach keHoachNuocSach)
		throws SystemException {
		keHoachNuocSach = toUnwrappedModel(keHoachNuocSach);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(keHoachNuocSach)) {
				keHoachNuocSach = (KeHoachNuocSach)session.get(KeHoachNuocSachImpl.class,
						keHoachNuocSach.getPrimaryKeyObj());
			}

			if (keHoachNuocSach != null) {
				session.delete(keHoachNuocSach);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (keHoachNuocSach != null) {
			clearCache(keHoachNuocSach);
		}

		return keHoachNuocSach;
	}

	@Override
	public KeHoachNuocSach updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach keHoachNuocSach)
		throws SystemException {
		keHoachNuocSach = toUnwrappedModel(keHoachNuocSach);

		boolean isNew = keHoachNuocSach.isNew();

		KeHoachNuocSachModelImpl keHoachNuocSachModelImpl = (KeHoachNuocSachModelImpl)keHoachNuocSach;

		Session session = null;

		try {
			session = openSession();

			if (keHoachNuocSach.isNew()) {
				session.save(keHoachNuocSach);

				keHoachNuocSach.setNew(false);
			}
			else {
				session.merge(keHoachNuocSach);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !KeHoachNuocSachModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((keHoachNuocSachModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						keHoachNuocSachModelImpl.getOriginalTramCapNuocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_,
					args);

				args = new Object[] { keHoachNuocSachModelImpl.getTramCapNuocId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_,
					args);
			}
		}

		EntityCacheUtil.putResult(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
			KeHoachNuocSachImpl.class, keHoachNuocSach.getPrimaryKey(),
			keHoachNuocSach);

		return keHoachNuocSach;
	}

	protected KeHoachNuocSach toUnwrappedModel(KeHoachNuocSach keHoachNuocSach) {
		if (keHoachNuocSach instanceof KeHoachNuocSachImpl) {
			return keHoachNuocSach;
		}

		KeHoachNuocSachImpl keHoachNuocSachImpl = new KeHoachNuocSachImpl();

		keHoachNuocSachImpl.setNew(keHoachNuocSach.isNew());
		keHoachNuocSachImpl.setPrimaryKey(keHoachNuocSach.getPrimaryKey());

		keHoachNuocSachImpl.setId(keHoachNuocSach.getId());
		keHoachNuocSachImpl.setTramCapNuocId(keHoachNuocSach.getTramCapNuocId());
		keHoachNuocSachImpl.setNam(keHoachNuocSach.getNam());
		keHoachNuocSachImpl.setSoDauNoiMoi(keHoachNuocSach.getSoDauNoiMoi());
		keHoachNuocSachImpl.setSoNguoiHuongLoi(keHoachNuocSach.getSoNguoiHuongLoi());
		keHoachNuocSachImpl.setGhiChu(keHoachNuocSach.getGhiChu());

		return keHoachNuocSachImpl;
	}

	/**
	 * Returns the ke hoach nuoc sach with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ke hoach nuoc sach
	 * @return the ke hoach nuoc sach
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a ke hoach nuoc sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachNuocSach findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKeHoachNuocSachException, SystemException {
		KeHoachNuocSach keHoachNuocSach = fetchByPrimaryKey(primaryKey);

		if (keHoachNuocSach == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKeHoachNuocSachException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return keHoachNuocSach;
	}

	/**
	 * Returns the ke hoach nuoc sach with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException} if it could not be found.
	 *
	 * @param id the primary key of the ke hoach nuoc sach
	 * @return the ke hoach nuoc sach
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchKeHoachNuocSachException if a ke hoach nuoc sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachNuocSach findByPrimaryKey(long id)
		throws NoSuchKeHoachNuocSachException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the ke hoach nuoc sach with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ke hoach nuoc sach
	 * @return the ke hoach nuoc sach, or <code>null</code> if a ke hoach nuoc sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachNuocSach fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KeHoachNuocSach keHoachNuocSach = (KeHoachNuocSach)EntityCacheUtil.getResult(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
				KeHoachNuocSachImpl.class, primaryKey);

		if (keHoachNuocSach == _nullKeHoachNuocSach) {
			return null;
		}

		if (keHoachNuocSach == null) {
			Session session = null;

			try {
				session = openSession();

				keHoachNuocSach = (KeHoachNuocSach)session.get(KeHoachNuocSachImpl.class,
						primaryKey);

				if (keHoachNuocSach != null) {
					cacheResult(keHoachNuocSach);
				}
				else {
					EntityCacheUtil.putResult(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
						KeHoachNuocSachImpl.class, primaryKey,
						_nullKeHoachNuocSach);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KeHoachNuocSachModelImpl.ENTITY_CACHE_ENABLED,
					KeHoachNuocSachImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return keHoachNuocSach;
	}

	/**
	 * Returns the ke hoach nuoc sach with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ke hoach nuoc sach
	 * @return the ke hoach nuoc sach, or <code>null</code> if a ke hoach nuoc sach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KeHoachNuocSach fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the ke hoach nuoc sachs.
	 *
	 * @return the ke hoach nuoc sachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachNuocSach> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ke hoach nuoc sachs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ke hoach nuoc sachs
	 * @param end the upper bound of the range of ke hoach nuoc sachs (not inclusive)
	 * @return the range of ke hoach nuoc sachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachNuocSach> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ke hoach nuoc sachs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachNuocSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ke hoach nuoc sachs
	 * @param end the upper bound of the range of ke hoach nuoc sachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ke hoach nuoc sachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KeHoachNuocSach> findAll(int start, int end,
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

		List<KeHoachNuocSach> list = (List<KeHoachNuocSach>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KEHOACHNUOCSACH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KEHOACHNUOCSACH;

				if (pagination) {
					sql = sql.concat(KeHoachNuocSachModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KeHoachNuocSach>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KeHoachNuocSach>(list);
				}
				else {
					list = (List<KeHoachNuocSach>)QueryUtil.list(q,
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
	 * Removes all the ke hoach nuoc sachs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KeHoachNuocSach keHoachNuocSach : findAll()) {
			remove(keHoachNuocSach);
		}
	}

	/**
	 * Returns the number of ke hoach nuoc sachs.
	 *
	 * @return the number of ke hoach nuoc sachs
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

				Query q = session.createQuery(_SQL_COUNT_KEHOACHNUOCSACH);

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
	 * Initializes the ke hoach nuoc sach persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.tramcap.dao.model.KeHoachNuocSach")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KeHoachNuocSach>> listenersList = new ArrayList<ModelListener<KeHoachNuocSach>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KeHoachNuocSach>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(KeHoachNuocSachImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KEHOACHNUOCSACH = "SELECT keHoachNuocSach FROM KeHoachNuocSach keHoachNuocSach";
	private static final String _SQL_SELECT_KEHOACHNUOCSACH_WHERE = "SELECT keHoachNuocSach FROM KeHoachNuocSach keHoachNuocSach WHERE ";
	private static final String _SQL_COUNT_KEHOACHNUOCSACH = "SELECT COUNT(keHoachNuocSach) FROM KeHoachNuocSach keHoachNuocSach";
	private static final String _SQL_COUNT_KEHOACHNUOCSACH_WHERE = "SELECT COUNT(keHoachNuocSach) FROM KeHoachNuocSach keHoachNuocSach WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "keHoachNuocSach.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KeHoachNuocSach exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No KeHoachNuocSach exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KeHoachNuocSachPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "tramCapNuocId", "nam", "soDauNoiMoi", "soNguoiHuongLoi",
				"ghiChu"
			});
	private static KeHoachNuocSach _nullKeHoachNuocSach = new KeHoachNuocSachImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KeHoachNuocSach> toCacheModel() {
				return _nullKeHoachNuocSachCacheModel;
			}
		};

	private static CacheModel<KeHoachNuocSach> _nullKeHoachNuocSachCacheModel = new CacheModel<KeHoachNuocSach>() {
			@Override
			public KeHoachNuocSach toEntityModel() {
				return _nullKeHoachNuocSach;
			}
		};
}