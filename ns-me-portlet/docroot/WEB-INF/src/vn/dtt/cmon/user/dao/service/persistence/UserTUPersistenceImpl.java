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

import vn.dtt.cmon.user.dao.NoSuchUserTUException;
import vn.dtt.cmon.user.dao.model.UserTU;
import vn.dtt.cmon.user.dao.model.impl.UserTUImpl;
import vn.dtt.cmon.user.dao.model.impl.UserTUModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the user t u service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see UserTUPersistence
 * @see UserTUUtil
 * @generated
 */
public class UserTUPersistenceImpl extends BasePersistenceImpl<UserTU>
	implements UserTUPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserTUUtil} to access the user t u persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserTUImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserTUModelImpl.ENTITY_CACHE_ENABLED,
			UserTUModelImpl.FINDER_CACHE_ENABLED, UserTUImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserTUModelImpl.ENTITY_CACHE_ENABLED,
			UserTUModelImpl.FINDER_CACHE_ENABLED, UserTUImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserTUModelImpl.ENTITY_CACHE_ENABLED,
			UserTUModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_ = new FinderPath(UserTUModelImpl.ENTITY_CACHE_ENABLED,
			UserTUModelImpl.FINDER_CACHE_ENABLED, UserTUImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUID_",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_ = new FinderPath(UserTUModelImpl.ENTITY_CACHE_ENABLED,
			UserTUModelImpl.FINDER_CACHE_ENABLED, UserTUImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUID_",
			new String[] { Long.class.getName() },
			UserTUModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UID_ = new FinderPath(UserTUModelImpl.ENTITY_CACHE_ENABLED,
			UserTUModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUID_",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the user t us where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching user t us
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTU> findByUID_(long userId) throws SystemException {
		return findByUID_(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user t us where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user t us
	 * @param end the upper bound of the range of user t us (not inclusive)
	 * @return the range of matching user t us
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTU> findByUID_(long userId, int start, int end)
		throws SystemException {
		return findByUID_(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user t us where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user t us
	 * @param end the upper bound of the range of user t us (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user t us
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTU> findByUID_(long userId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<UserTU> list = (List<UserTU>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserTU userTU : list) {
				if ((userId != userTU.getUserId())) {
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

			query.append(_SQL_SELECT_USERTU_WHERE);

			query.append(_FINDER_COLUMN_UID__USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserTUModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<UserTU>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserTU>(list);
				}
				else {
					list = (List<UserTU>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first user t u in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user t u
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a matching user t u could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTU findByUID__First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserTUException, SystemException {
		UserTU userTU = fetchByUID__First(userId, orderByComparator);

		if (userTU != null) {
			return userTU;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserTUException(msg.toString());
	}

	/**
	 * Returns the first user t u in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user t u, or <code>null</code> if a matching user t u could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTU fetchByUID__First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserTU> list = findByUID_(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user t u in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user t u
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a matching user t u could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTU findByUID__Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserTUException, SystemException {
		UserTU userTU = fetchByUID__Last(userId, orderByComparator);

		if (userTU != null) {
			return userTU;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserTUException(msg.toString());
	}

	/**
	 * Returns the last user t u in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user t u, or <code>null</code> if a matching user t u could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTU fetchByUID__Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUID_(userId);

		if (count == 0) {
			return null;
		}

		List<UserTU> list = findByUID_(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user t us before and after the current user t u in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current user t u
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user t u
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a user t u with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTU[] findByUID__PrevAndNext(long id, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserTUException, SystemException {
		UserTU userTU = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserTU[] array = new UserTUImpl[3];

			array[0] = getByUID__PrevAndNext(session, userTU, userId,
					orderByComparator, true);

			array[1] = userTU;

			array[2] = getByUID__PrevAndNext(session, userTU, userId,
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

	protected UserTU getByUID__PrevAndNext(Session session, UserTU userTU,
		long userId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERTU_WHERE);

		query.append(_FINDER_COLUMN_UID__USERID_2);

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
			query.append(UserTUModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userTU);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserTU> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user t us where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUID_(long userId) throws SystemException {
		for (UserTU userTU : findByUID_(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(userTU);
		}
	}

	/**
	 * Returns the number of user t us where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user t us
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUID_(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UID_;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERTU_WHERE);

			query.append(_FINDER_COLUMN_UID__USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_UID__USERID_2 = "userTU.userId = ?";

	public UserTUPersistenceImpl() {
		setModelClass(UserTU.class);
	}

	/**
	 * Caches the user t u in the entity cache if it is enabled.
	 *
	 * @param userTU the user t u
	 */
	@Override
	public void cacheResult(UserTU userTU) {
		EntityCacheUtil.putResult(UserTUModelImpl.ENTITY_CACHE_ENABLED,
			UserTUImpl.class, userTU.getPrimaryKey(), userTU);

		userTU.resetOriginalValues();
	}

	/**
	 * Caches the user t us in the entity cache if it is enabled.
	 *
	 * @param userTUs the user t us
	 */
	@Override
	public void cacheResult(List<UserTU> userTUs) {
		for (UserTU userTU : userTUs) {
			if (EntityCacheUtil.getResult(
						UserTUModelImpl.ENTITY_CACHE_ENABLED, UserTUImpl.class,
						userTU.getPrimaryKey()) == null) {
				cacheResult(userTU);
			}
			else {
				userTU.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user t us.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserTUImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserTUImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user t u.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserTU userTU) {
		EntityCacheUtil.removeResult(UserTUModelImpl.ENTITY_CACHE_ENABLED,
			UserTUImpl.class, userTU.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserTU> userTUs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserTU userTU : userTUs) {
			EntityCacheUtil.removeResult(UserTUModelImpl.ENTITY_CACHE_ENABLED,
				UserTUImpl.class, userTU.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user t u with the primary key. Does not add the user t u to the database.
	 *
	 * @param id the primary key for the new user t u
	 * @return the new user t u
	 */
	@Override
	public UserTU create(long id) {
		UserTU userTU = new UserTUImpl();

		userTU.setNew(true);
		userTU.setPrimaryKey(id);

		return userTU;
	}

	/**
	 * Removes the user t u with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the user t u
	 * @return the user t u that was removed
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a user t u with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTU remove(long id) throws NoSuchUserTUException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the user t u with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user t u
	 * @return the user t u that was removed
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a user t u with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTU remove(Serializable primaryKey)
		throws NoSuchUserTUException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserTU userTU = (UserTU)session.get(UserTUImpl.class, primaryKey);

			if (userTU == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserTUException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userTU);
		}
		catch (NoSuchUserTUException nsee) {
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
	protected UserTU removeImpl(UserTU userTU) throws SystemException {
		userTU = toUnwrappedModel(userTU);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userTU)) {
				userTU = (UserTU)session.get(UserTUImpl.class,
						userTU.getPrimaryKeyObj());
			}

			if (userTU != null) {
				session.delete(userTU);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userTU != null) {
			clearCache(userTU);
		}

		return userTU;
	}

	@Override
	public UserTU updateImpl(vn.dtt.cmon.user.dao.model.UserTU userTU)
		throws SystemException {
		userTU = toUnwrappedModel(userTU);

		boolean isNew = userTU.isNew();

		UserTUModelImpl userTUModelImpl = (UserTUModelImpl)userTU;

		Session session = null;

		try {
			session = openSession();

			if (userTU.isNew()) {
				session.save(userTU);

				userTU.setNew(false);
			}
			else {
				session.merge(userTU);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserTUModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userTUModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { userTUModelImpl.getOriginalUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_,
					args);

				args = new Object[] { userTUModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_,
					args);
			}
		}

		EntityCacheUtil.putResult(UserTUModelImpl.ENTITY_CACHE_ENABLED,
			UserTUImpl.class, userTU.getPrimaryKey(), userTU);

		return userTU;
	}

	protected UserTU toUnwrappedModel(UserTU userTU) {
		if (userTU instanceof UserTUImpl) {
			return userTU;
		}

		UserTUImpl userTUImpl = new UserTUImpl();

		userTUImpl.setNew(userTU.isNew());
		userTUImpl.setPrimaryKey(userTU.getPrimaryKey());

		userTUImpl.setId(userTU.getId());
		userTUImpl.setMaTinh(userTU.getMaTinh());
		userTUImpl.setName(userTU.getName());
		userTUImpl.setUserId(userTU.getUserId());

		return userTUImpl;
	}

	/**
	 * Returns the user t u with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user t u
	 * @return the user t u
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a user t u with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTU findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserTUException, SystemException {
		UserTU userTU = fetchByPrimaryKey(primaryKey);

		if (userTU == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserTUException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userTU;
	}

	/**
	 * Returns the user t u with the primary key or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTUException} if it could not be found.
	 *
	 * @param id the primary key of the user t u
	 * @return the user t u
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTUException if a user t u with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTU findByPrimaryKey(long id)
		throws NoSuchUserTUException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the user t u with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user t u
	 * @return the user t u, or <code>null</code> if a user t u with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTU fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserTU userTU = (UserTU)EntityCacheUtil.getResult(UserTUModelImpl.ENTITY_CACHE_ENABLED,
				UserTUImpl.class, primaryKey);

		if (userTU == _nullUserTU) {
			return null;
		}

		if (userTU == null) {
			Session session = null;

			try {
				session = openSession();

				userTU = (UserTU)session.get(UserTUImpl.class, primaryKey);

				if (userTU != null) {
					cacheResult(userTU);
				}
				else {
					EntityCacheUtil.putResult(UserTUModelImpl.ENTITY_CACHE_ENABLED,
						UserTUImpl.class, primaryKey, _nullUserTU);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserTUModelImpl.ENTITY_CACHE_ENABLED,
					UserTUImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userTU;
	}

	/**
	 * Returns the user t u with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the user t u
	 * @return the user t u, or <code>null</code> if a user t u with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTU fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the user t us.
	 *
	 * @return the user t us
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTU> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user t us.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user t us
	 * @param end the upper bound of the range of user t us (not inclusive)
	 * @return the range of user t us
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTU> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user t us.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user t us
	 * @param end the upper bound of the range of user t us (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user t us
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTU> findAll(int start, int end,
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

		List<UserTU> list = (List<UserTU>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERTU);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERTU;

				if (pagination) {
					sql = sql.concat(UserTUModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserTU>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserTU>(list);
				}
				else {
					list = (List<UserTU>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the user t us from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserTU userTU : findAll()) {
			remove(userTU);
		}
	}

	/**
	 * Returns the number of user t us.
	 *
	 * @return the number of user t us
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

				Query q = session.createQuery(_SQL_COUNT_USERTU);

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
	 * Initializes the user t u persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.cmon.user.dao.model.UserTU")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserTU>> listenersList = new ArrayList<ModelListener<UserTU>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserTU>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserTUImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERTU = "SELECT userTU FROM UserTU userTU";
	private static final String _SQL_SELECT_USERTU_WHERE = "SELECT userTU FROM UserTU userTU WHERE ";
	private static final String _SQL_COUNT_USERTU = "SELECT COUNT(userTU) FROM UserTU userTU";
	private static final String _SQL_COUNT_USERTU_WHERE = "SELECT COUNT(userTU) FROM UserTU userTU WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userTU.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserTU exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserTU exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserTUPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maTinh", "name", "userId"
			});
	private static UserTU _nullUserTU = new UserTUImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserTU> toCacheModel() {
				return _nullUserTUCacheModel;
			}
		};

	private static CacheModel<UserTU> _nullUserTUCacheModel = new CacheModel<UserTU>() {
			@Override
			public UserTU toEntityModel() {
				return _nullUserTU;
			}
		};
}