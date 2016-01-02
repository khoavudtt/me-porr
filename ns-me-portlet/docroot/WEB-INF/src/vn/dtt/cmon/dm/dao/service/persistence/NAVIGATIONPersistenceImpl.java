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

package vn.dtt.cmon.dm.dao.service.persistence;

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

import vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException;
import vn.dtt.cmon.dm.dao.model.NAVIGATION;
import vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONImpl;
import vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the n a v i g a t i o n service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see NAVIGATIONPersistence
 * @see NAVIGATIONUtil
 * @generated
 */
public class NAVIGATIONPersistenceImpl extends BasePersistenceImpl<NAVIGATION>
	implements NAVIGATIONPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NAVIGATIONUtil} to access the n a v i g a t i o n persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NAVIGATIONImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
			NAVIGATIONModelImpl.FINDER_CACHE_ENABLED, NAVIGATIONImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
			NAVIGATIONModelImpl.FINDER_CACHE_ENABLED, NAVIGATIONImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
			NAVIGATIONModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PARENTID = new FinderPath(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
			NAVIGATIONModelImpl.FINDER_CACHE_ENABLED, NAVIGATIONImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPARENTID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID =
		new FinderPath(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
			NAVIGATIONModelImpl.FINDER_CACHE_ENABLED, NAVIGATIONImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPARENTID",
			new String[] { Long.class.getName(), Long.class.getName() },
			NAVIGATIONModelImpl.PARENTID_COLUMN_BITMASK |
			NAVIGATIONModelImpl.HIDDEN_COLUMN_BITMASK |
			NAVIGATIONModelImpl.ORDER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PARENTID = new FinderPath(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
			NAVIGATIONModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPARENTID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the n a v i g a t i o ns where parentId = &#63; and hidden = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param hidden the hidden
	 * @return the matching n a v i g a t i o ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NAVIGATION> findByPARENTID(long parentId, long hidden)
		throws SystemException {
		return findByPARENTID(parentId, hidden, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the n a v i g a t i o ns where parentId = &#63; and hidden = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentId the parent ID
	 * @param hidden the hidden
	 * @param start the lower bound of the range of n a v i g a t i o ns
	 * @param end the upper bound of the range of n a v i g a t i o ns (not inclusive)
	 * @return the range of matching n a v i g a t i o ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NAVIGATION> findByPARENTID(long parentId, long hidden,
		int start, int end) throws SystemException {
		return findByPARENTID(parentId, hidden, start, end, null);
	}

	/**
	 * Returns an ordered range of all the n a v i g a t i o ns where parentId = &#63; and hidden = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentId the parent ID
	 * @param hidden the hidden
	 * @param start the lower bound of the range of n a v i g a t i o ns
	 * @param end the upper bound of the range of n a v i g a t i o ns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching n a v i g a t i o ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NAVIGATION> findByPARENTID(long parentId, long hidden,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID;
			finderArgs = new Object[] { parentId, hidden };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PARENTID;
			finderArgs = new Object[] {
					parentId, hidden,
					
					start, end, orderByComparator
				};
		}

		List<NAVIGATION> list = (List<NAVIGATION>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NAVIGATION navigation : list) {
				if ((parentId != navigation.getParentId()) ||
						(hidden != navigation.getHidden())) {
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

			query.append(_SQL_SELECT_NAVIGATION_WHERE);

			query.append(_FINDER_COLUMN_PARENTID_PARENTID_2);

			query.append(_FINDER_COLUMN_PARENTID_HIDDEN_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NAVIGATIONModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parentId);

				qPos.add(hidden);

				if (!pagination) {
					list = (List<NAVIGATION>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NAVIGATION>(list);
				}
				else {
					list = (List<NAVIGATION>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first n a v i g a t i o n in the ordered set where parentId = &#63; and hidden = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param hidden the hidden
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n a v i g a t i o n
	 * @throws vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException if a matching n a v i g a t i o n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NAVIGATION findByPARENTID_First(long parentId, long hidden,
		OrderByComparator orderByComparator)
		throws NoSuchNAVIGATIONException, SystemException {
		NAVIGATION navigation = fetchByPARENTID_First(parentId, hidden,
				orderByComparator);

		if (navigation != null) {
			return navigation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parentId=");
		msg.append(parentId);

		msg.append(", hidden=");
		msg.append(hidden);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNAVIGATIONException(msg.toString());
	}

	/**
	 * Returns the first n a v i g a t i o n in the ordered set where parentId = &#63; and hidden = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param hidden the hidden
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching n a v i g a t i o n, or <code>null</code> if a matching n a v i g a t i o n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NAVIGATION fetchByPARENTID_First(long parentId, long hidden,
		OrderByComparator orderByComparator) throws SystemException {
		List<NAVIGATION> list = findByPARENTID(parentId, hidden, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last n a v i g a t i o n in the ordered set where parentId = &#63; and hidden = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param hidden the hidden
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n a v i g a t i o n
	 * @throws vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException if a matching n a v i g a t i o n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NAVIGATION findByPARENTID_Last(long parentId, long hidden,
		OrderByComparator orderByComparator)
		throws NoSuchNAVIGATIONException, SystemException {
		NAVIGATION navigation = fetchByPARENTID_Last(parentId, hidden,
				orderByComparator);

		if (navigation != null) {
			return navigation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parentId=");
		msg.append(parentId);

		msg.append(", hidden=");
		msg.append(hidden);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNAVIGATIONException(msg.toString());
	}

	/**
	 * Returns the last n a v i g a t i o n in the ordered set where parentId = &#63; and hidden = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param hidden the hidden
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching n a v i g a t i o n, or <code>null</code> if a matching n a v i g a t i o n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NAVIGATION fetchByPARENTID_Last(long parentId, long hidden,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPARENTID(parentId, hidden);

		if (count == 0) {
			return null;
		}

		List<NAVIGATION> list = findByPARENTID(parentId, hidden, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the n a v i g a t i o ns before and after the current n a v i g a t i o n in the ordered set where parentId = &#63; and hidden = &#63;.
	 *
	 * @param id the primary key of the current n a v i g a t i o n
	 * @param parentId the parent ID
	 * @param hidden the hidden
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next n a v i g a t i o n
	 * @throws vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException if a n a v i g a t i o n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NAVIGATION[] findByPARENTID_PrevAndNext(long id, long parentId,
		long hidden, OrderByComparator orderByComparator)
		throws NoSuchNAVIGATIONException, SystemException {
		NAVIGATION navigation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			NAVIGATION[] array = new NAVIGATIONImpl[3];

			array[0] = getByPARENTID_PrevAndNext(session, navigation, parentId,
					hidden, orderByComparator, true);

			array[1] = navigation;

			array[2] = getByPARENTID_PrevAndNext(session, navigation, parentId,
					hidden, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NAVIGATION getByPARENTID_PrevAndNext(Session session,
		NAVIGATION navigation, long parentId, long hidden,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NAVIGATION_WHERE);

		query.append(_FINDER_COLUMN_PARENTID_PARENTID_2);

		query.append(_FINDER_COLUMN_PARENTID_HIDDEN_2);

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
			query.append(NAVIGATIONModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(parentId);

		qPos.add(hidden);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(navigation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NAVIGATION> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the n a v i g a t i o ns where parentId = &#63; and hidden = &#63; from the database.
	 *
	 * @param parentId the parent ID
	 * @param hidden the hidden
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPARENTID(long parentId, long hidden)
		throws SystemException {
		for (NAVIGATION navigation : findByPARENTID(parentId, hidden,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(navigation);
		}
	}

	/**
	 * Returns the number of n a v i g a t i o ns where parentId = &#63; and hidden = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param hidden the hidden
	 * @return the number of matching n a v i g a t i o ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPARENTID(long parentId, long hidden)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PARENTID;

		Object[] finderArgs = new Object[] { parentId, hidden };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_NAVIGATION_WHERE);

			query.append(_FINDER_COLUMN_PARENTID_PARENTID_2);

			query.append(_FINDER_COLUMN_PARENTID_HIDDEN_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parentId);

				qPos.add(hidden);

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

	private static final String _FINDER_COLUMN_PARENTID_PARENTID_2 = "navigation.parentId = ? AND ";
	private static final String _FINDER_COLUMN_PARENTID_HIDDEN_2 = "navigation.hidden = ?";

	public NAVIGATIONPersistenceImpl() {
		setModelClass(NAVIGATION.class);
	}

	/**
	 * Caches the n a v i g a t i o n in the entity cache if it is enabled.
	 *
	 * @param navigation the n a v i g a t i o n
	 */
	@Override
	public void cacheResult(NAVIGATION navigation) {
		EntityCacheUtil.putResult(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
			NAVIGATIONImpl.class, navigation.getPrimaryKey(), navigation);

		navigation.resetOriginalValues();
	}

	/**
	 * Caches the n a v i g a t i o ns in the entity cache if it is enabled.
	 *
	 * @param navigations the n a v i g a t i o ns
	 */
	@Override
	public void cacheResult(List<NAVIGATION> navigations) {
		for (NAVIGATION navigation : navigations) {
			if (EntityCacheUtil.getResult(
						NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
						NAVIGATIONImpl.class, navigation.getPrimaryKey()) == null) {
				cacheResult(navigation);
			}
			else {
				navigation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all n a v i g a t i o ns.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NAVIGATIONImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NAVIGATIONImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the n a v i g a t i o n.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NAVIGATION navigation) {
		EntityCacheUtil.removeResult(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
			NAVIGATIONImpl.class, navigation.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NAVIGATION> navigations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NAVIGATION navigation : navigations) {
			EntityCacheUtil.removeResult(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
				NAVIGATIONImpl.class, navigation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new n a v i g a t i o n with the primary key. Does not add the n a v i g a t i o n to the database.
	 *
	 * @param id the primary key for the new n a v i g a t i o n
	 * @return the new n a v i g a t i o n
	 */
	@Override
	public NAVIGATION create(long id) {
		NAVIGATION navigation = new NAVIGATIONImpl();

		navigation.setNew(true);
		navigation.setPrimaryKey(id);

		return navigation;
	}

	/**
	 * Removes the n a v i g a t i o n with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the n a v i g a t i o n
	 * @return the n a v i g a t i o n that was removed
	 * @throws vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException if a n a v i g a t i o n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NAVIGATION remove(long id)
		throws NoSuchNAVIGATIONException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the n a v i g a t i o n with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the n a v i g a t i o n
	 * @return the n a v i g a t i o n that was removed
	 * @throws vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException if a n a v i g a t i o n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NAVIGATION remove(Serializable primaryKey)
		throws NoSuchNAVIGATIONException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NAVIGATION navigation = (NAVIGATION)session.get(NAVIGATIONImpl.class,
					primaryKey);

			if (navigation == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNAVIGATIONException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(navigation);
		}
		catch (NoSuchNAVIGATIONException nsee) {
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
	protected NAVIGATION removeImpl(NAVIGATION navigation)
		throws SystemException {
		navigation = toUnwrappedModel(navigation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(navigation)) {
				navigation = (NAVIGATION)session.get(NAVIGATIONImpl.class,
						navigation.getPrimaryKeyObj());
			}

			if (navigation != null) {
				session.delete(navigation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (navigation != null) {
			clearCache(navigation);
		}

		return navigation;
	}

	@Override
	public NAVIGATION updateImpl(vn.dtt.cmon.dm.dao.model.NAVIGATION navigation)
		throws SystemException {
		navigation = toUnwrappedModel(navigation);

		boolean isNew = navigation.isNew();

		NAVIGATIONModelImpl navigationModelImpl = (NAVIGATIONModelImpl)navigation;

		Session session = null;

		try {
			session = openSession();

			if (navigation.isNew()) {
				session.save(navigation);

				navigation.setNew(false);
			}
			else {
				session.merge(navigation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !NAVIGATIONModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((navigationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						navigationModelImpl.getOriginalParentId(),
						navigationModelImpl.getOriginalHidden()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARENTID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID,
					args);

				args = new Object[] {
						navigationModelImpl.getParentId(),
						navigationModelImpl.getHidden()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARENTID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID,
					args);
			}
		}

		EntityCacheUtil.putResult(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
			NAVIGATIONImpl.class, navigation.getPrimaryKey(), navigation);

		return navigation;
	}

	protected NAVIGATION toUnwrappedModel(NAVIGATION navigation) {
		if (navigation instanceof NAVIGATIONImpl) {
			return navigation;
		}

		NAVIGATIONImpl navigationImpl = new NAVIGATIONImpl();

		navigationImpl.setNew(navigation.isNew());
		navigationImpl.setPrimaryKey(navigation.getPrimaryKey());

		navigationImpl.setId(navigation.getId());
		navigationImpl.setName(navigation.getName());
		navigationImpl.setNavSub(navigation.getNavSub());
		navigationImpl.setNavSubOwner(navigation.getNavSubOwner());
		navigationImpl.setRoleOwner(navigation.getRoleOwner());
		navigationImpl.setPermissionOwner(navigation.getPermissionOwner());
		navigationImpl.setParentId(navigation.getParentId());
		navigationImpl.setHidden(navigation.getHidden());
		navigationImpl.setOrder(navigation.getOrder());
		navigationImpl.setThongKe(navigation.getThongKe());

		return navigationImpl;
	}

	/**
	 * Returns the n a v i g a t i o n with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the n a v i g a t i o n
	 * @return the n a v i g a t i o n
	 * @throws vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException if a n a v i g a t i o n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NAVIGATION findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNAVIGATIONException, SystemException {
		NAVIGATION navigation = fetchByPrimaryKey(primaryKey);

		if (navigation == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNAVIGATIONException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return navigation;
	}

	/**
	 * Returns the n a v i g a t i o n with the primary key or throws a {@link vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException} if it could not be found.
	 *
	 * @param id the primary key of the n a v i g a t i o n
	 * @return the n a v i g a t i o n
	 * @throws vn.dtt.cmon.dm.dao.NoSuchNAVIGATIONException if a n a v i g a t i o n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NAVIGATION findByPrimaryKey(long id)
		throws NoSuchNAVIGATIONException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the n a v i g a t i o n with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the n a v i g a t i o n
	 * @return the n a v i g a t i o n, or <code>null</code> if a n a v i g a t i o n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NAVIGATION fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		NAVIGATION navigation = (NAVIGATION)EntityCacheUtil.getResult(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
				NAVIGATIONImpl.class, primaryKey);

		if (navigation == _nullNAVIGATION) {
			return null;
		}

		if (navigation == null) {
			Session session = null;

			try {
				session = openSession();

				navigation = (NAVIGATION)session.get(NAVIGATIONImpl.class,
						primaryKey);

				if (navigation != null) {
					cacheResult(navigation);
				}
				else {
					EntityCacheUtil.putResult(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
						NAVIGATIONImpl.class, primaryKey, _nullNAVIGATION);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(NAVIGATIONModelImpl.ENTITY_CACHE_ENABLED,
					NAVIGATIONImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return navigation;
	}

	/**
	 * Returns the n a v i g a t i o n with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the n a v i g a t i o n
	 * @return the n a v i g a t i o n, or <code>null</code> if a n a v i g a t i o n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NAVIGATION fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the n a v i g a t i o ns.
	 *
	 * @return the n a v i g a t i o ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NAVIGATION> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the n a v i g a t i o ns.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of n a v i g a t i o ns
	 * @param end the upper bound of the range of n a v i g a t i o ns (not inclusive)
	 * @return the range of n a v i g a t i o ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NAVIGATION> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the n a v i g a t i o ns.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.NAVIGATIONModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of n a v i g a t i o ns
	 * @param end the upper bound of the range of n a v i g a t i o ns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of n a v i g a t i o ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NAVIGATION> findAll(int start, int end,
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

		List<NAVIGATION> list = (List<NAVIGATION>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NAVIGATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NAVIGATION;

				if (pagination) {
					sql = sql.concat(NAVIGATIONModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NAVIGATION>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NAVIGATION>(list);
				}
				else {
					list = (List<NAVIGATION>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the n a v i g a t i o ns from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (NAVIGATION navigation : findAll()) {
			remove(navigation);
		}
	}

	/**
	 * Returns the number of n a v i g a t i o ns.
	 *
	 * @return the number of n a v i g a t i o ns
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

				Query q = session.createQuery(_SQL_COUNT_NAVIGATION);

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
	 * Initializes the n a v i g a t i o n persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.cmon.dm.dao.model.NAVIGATION")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NAVIGATION>> listenersList = new ArrayList<ModelListener<NAVIGATION>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NAVIGATION>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(NAVIGATIONImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NAVIGATION = "SELECT navigation FROM NAVIGATION navigation";
	private static final String _SQL_SELECT_NAVIGATION_WHERE = "SELECT navigation FROM NAVIGATION navigation WHERE ";
	private static final String _SQL_COUNT_NAVIGATION = "SELECT COUNT(navigation) FROM NAVIGATION navigation";
	private static final String _SQL_COUNT_NAVIGATION_WHERE = "SELECT COUNT(navigation) FROM NAVIGATION navigation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "navigation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NAVIGATION exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NAVIGATION exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NAVIGATIONPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "name", "navSub", "navSubOwner", "roleOwner",
				"permissionOwner", "parentId", "hidden", "order", "thongKe"
			});
	private static NAVIGATION _nullNAVIGATION = new NAVIGATIONImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NAVIGATION> toCacheModel() {
				return _nullNAVIGATIONCacheModel;
			}
		};

	private static CacheModel<NAVIGATION> _nullNAVIGATIONCacheModel = new CacheModel<NAVIGATION>() {
			@Override
			public NAVIGATION toEntityModel() {
				return _nullNAVIGATION;
			}
		};
}