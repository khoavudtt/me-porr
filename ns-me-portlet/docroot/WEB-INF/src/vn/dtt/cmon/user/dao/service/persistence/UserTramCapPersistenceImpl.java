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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.cmon.user.dao.NoSuchUserTramCapException;
import vn.dtt.cmon.user.dao.model.UserTramCap;
import vn.dtt.cmon.user.dao.model.impl.UserTramCapImpl;
import vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the user tram cap service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see UserTramCapPersistence
 * @see UserTramCapUtil
 * @generated
 */
public class UserTramCapPersistenceImpl extends BasePersistenceImpl<UserTramCap>
	implements UserTramCapPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserTramCapUtil} to access the user tram cap persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserTramCapImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, UserTramCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, UserTramCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_ = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, UserTramCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUID_",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_ = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, UserTramCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUID_",
			new String[] { Long.class.getName() },
			UserTramCapModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UID_ = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUID_",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the user tram caps where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTramCap> findByUID_(long userId) throws SystemException {
		return findByUID_(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user tram caps where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user tram caps
	 * @param end the upper bound of the range of user tram caps (not inclusive)
	 * @return the range of matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTramCap> findByUID_(long userId, int start, int end)
		throws SystemException {
		return findByUID_(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user tram caps where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user tram caps
	 * @param end the upper bound of the range of user tram caps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTramCap> findByUID_(long userId, int start, int end,
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

		List<UserTramCap> list = (List<UserTramCap>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserTramCap userTramCap : list) {
				if ((userId != userTramCap.getUserId())) {
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

			query.append(_SQL_SELECT_USERTRAMCAP_WHERE);

			query.append(_FINDER_COLUMN_UID__USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserTramCapModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<UserTramCap>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserTramCap>(list);
				}
				else {
					list = (List<UserTramCap>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user tram cap in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap findByUID__First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = fetchByUID__First(userId, orderByComparator);

		if (userTramCap != null) {
			return userTramCap;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserTramCapException(msg.toString());
	}

	/**
	 * Returns the first user tram cap in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap fetchByUID__First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserTramCap> list = findByUID_(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user tram cap in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap findByUID__Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = fetchByUID__Last(userId, orderByComparator);

		if (userTramCap != null) {
			return userTramCap;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserTramCapException(msg.toString());
	}

	/**
	 * Returns the last user tram cap in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap fetchByUID__Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUID_(userId);

		if (count == 0) {
			return null;
		}

		List<UserTramCap> list = findByUID_(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user tram caps before and after the current user tram cap in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current user tram cap
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a user tram cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap[] findByUID__PrevAndNext(long id, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserTramCap[] array = new UserTramCapImpl[3];

			array[0] = getByUID__PrevAndNext(session, userTramCap, userId,
					orderByComparator, true);

			array[1] = userTramCap;

			array[2] = getByUID__PrevAndNext(session, userTramCap, userId,
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

	protected UserTramCap getByUID__PrevAndNext(Session session,
		UserTramCap userTramCap, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERTRAMCAP_WHERE);

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
			query.append(UserTramCapModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userTramCap);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserTramCap> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user tram caps where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUID_(long userId) throws SystemException {
		for (UserTramCap userTramCap : findByUID_(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(userTramCap);
		}
	}

	/**
	 * Returns the number of user tram caps where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user tram caps
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

			query.append(_SQL_COUNT_USERTRAMCAP_WHERE);

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

	private static final String _FINDER_COLUMN_UID__USERID_2 = "userTramCap.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_TC = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, UserTramCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUID_TC",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_TC =
		new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, UserTramCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUID_TC",
			new String[] { Long.class.getName(), Long.class.getName() },
			UserTramCapModelImpl.USERID_COLUMN_BITMASK |
			UserTramCapModelImpl.MATRAMCAP_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UID_TC = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUID_TC",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the user tram caps where userId = &#63; and maTramCap = &#63;.
	 *
	 * @param userId the user ID
	 * @param maTramCap the ma tram cap
	 * @return the matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTramCap> findByUID_TC(long userId, long maTramCap)
		throws SystemException {
		return findByUID_TC(userId, maTramCap, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user tram caps where userId = &#63; and maTramCap = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param maTramCap the ma tram cap
	 * @param start the lower bound of the range of user tram caps
	 * @param end the upper bound of the range of user tram caps (not inclusive)
	 * @return the range of matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTramCap> findByUID_TC(long userId, long maTramCap,
		int start, int end) throws SystemException {
		return findByUID_TC(userId, maTramCap, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user tram caps where userId = &#63; and maTramCap = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param maTramCap the ma tram cap
	 * @param start the lower bound of the range of user tram caps
	 * @param end the upper bound of the range of user tram caps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTramCap> findByUID_TC(long userId, long maTramCap,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_TC;
			finderArgs = new Object[] { userId, maTramCap };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_TC;
			finderArgs = new Object[] {
					userId, maTramCap,
					
					start, end, orderByComparator
				};
		}

		List<UserTramCap> list = (List<UserTramCap>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserTramCap userTramCap : list) {
				if ((userId != userTramCap.getUserId()) ||
						(maTramCap != userTramCap.getMaTramCap())) {
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

			query.append(_SQL_SELECT_USERTRAMCAP_WHERE);

			query.append(_FINDER_COLUMN_UID_TC_USERID_2);

			query.append(_FINDER_COLUMN_UID_TC_MATRAMCAP_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserTramCapModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(maTramCap);

				if (!pagination) {
					list = (List<UserTramCap>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserTramCap>(list);
				}
				else {
					list = (List<UserTramCap>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user tram cap in the ordered set where userId = &#63; and maTramCap = &#63;.
	 *
	 * @param userId the user ID
	 * @param maTramCap the ma tram cap
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap findByUID_TC_First(long userId, long maTramCap,
		OrderByComparator orderByComparator)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = fetchByUID_TC_First(userId, maTramCap,
				orderByComparator);

		if (userTramCap != null) {
			return userTramCap;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", maTramCap=");
		msg.append(maTramCap);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserTramCapException(msg.toString());
	}

	/**
	 * Returns the first user tram cap in the ordered set where userId = &#63; and maTramCap = &#63;.
	 *
	 * @param userId the user ID
	 * @param maTramCap the ma tram cap
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap fetchByUID_TC_First(long userId, long maTramCap,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserTramCap> list = findByUID_TC(userId, maTramCap, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user tram cap in the ordered set where userId = &#63; and maTramCap = &#63;.
	 *
	 * @param userId the user ID
	 * @param maTramCap the ma tram cap
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap findByUID_TC_Last(long userId, long maTramCap,
		OrderByComparator orderByComparator)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = fetchByUID_TC_Last(userId, maTramCap,
				orderByComparator);

		if (userTramCap != null) {
			return userTramCap;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", maTramCap=");
		msg.append(maTramCap);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserTramCapException(msg.toString());
	}

	/**
	 * Returns the last user tram cap in the ordered set where userId = &#63; and maTramCap = &#63;.
	 *
	 * @param userId the user ID
	 * @param maTramCap the ma tram cap
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap fetchByUID_TC_Last(long userId, long maTramCap,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUID_TC(userId, maTramCap);

		if (count == 0) {
			return null;
		}

		List<UserTramCap> list = findByUID_TC(userId, maTramCap, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user tram caps before and after the current user tram cap in the ordered set where userId = &#63; and maTramCap = &#63;.
	 *
	 * @param id the primary key of the current user tram cap
	 * @param userId the user ID
	 * @param maTramCap the ma tram cap
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a user tram cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap[] findByUID_TC_PrevAndNext(long id, long userId,
		long maTramCap, OrderByComparator orderByComparator)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserTramCap[] array = new UserTramCapImpl[3];

			array[0] = getByUID_TC_PrevAndNext(session, userTramCap, userId,
					maTramCap, orderByComparator, true);

			array[1] = userTramCap;

			array[2] = getByUID_TC_PrevAndNext(session, userTramCap, userId,
					maTramCap, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserTramCap getByUID_TC_PrevAndNext(Session session,
		UserTramCap userTramCap, long userId, long maTramCap,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERTRAMCAP_WHERE);

		query.append(_FINDER_COLUMN_UID_TC_USERID_2);

		query.append(_FINDER_COLUMN_UID_TC_MATRAMCAP_2);

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
			query.append(UserTramCapModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		qPos.add(maTramCap);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userTramCap);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserTramCap> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user tram caps where userId = &#63; and maTramCap = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param maTramCap the ma tram cap
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUID_TC(long userId, long maTramCap)
		throws SystemException {
		for (UserTramCap userTramCap : findByUID_TC(userId, maTramCap,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userTramCap);
		}
	}

	/**
	 * Returns the number of user tram caps where userId = &#63; and maTramCap = &#63;.
	 *
	 * @param userId the user ID
	 * @param maTramCap the ma tram cap
	 * @return the number of matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUID_TC(long userId, long maTramCap)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UID_TC;

		Object[] finderArgs = new Object[] { userId, maTramCap };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USERTRAMCAP_WHERE);

			query.append(_FINDER_COLUMN_UID_TC_USERID_2);

			query.append(_FINDER_COLUMN_UID_TC_MATRAMCAP_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(maTramCap);

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

	private static final String _FINDER_COLUMN_UID_TC_USERID_2 = "userTramCap.userId = ? AND ";
	private static final String _FINDER_COLUMN_UID_TC_MATRAMCAP_2 = "userTramCap.maTramCap = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_MH = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, UserTramCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUID_MH",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH =
		new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, UserTramCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUID_MH",
			new String[] { Long.class.getName(), String.class.getName() },
			UserTramCapModelImpl.USERID_COLUMN_BITMASK |
			UserTramCapModelImpl.MAHUYEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UID_MH = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUID_MH",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the user tram caps where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @return the matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTramCap> findByUID_MH(long userId, String maHuyen)
		throws SystemException {
		return findByUID_MH(userId, maHuyen, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user tram caps where userId = &#63; and maHuyen = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param start the lower bound of the range of user tram caps
	 * @param end the upper bound of the range of user tram caps (not inclusive)
	 * @return the range of matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTramCap> findByUID_MH(long userId, String maHuyen,
		int start, int end) throws SystemException {
		return findByUID_MH(userId, maHuyen, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user tram caps where userId = &#63; and maHuyen = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param start the lower bound of the range of user tram caps
	 * @param end the upper bound of the range of user tram caps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTramCap> findByUID_MH(long userId, String maHuyen,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH;
			finderArgs = new Object[] { userId, maHuyen };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_MH;
			finderArgs = new Object[] {
					userId, maHuyen,
					
					start, end, orderByComparator
				};
		}

		List<UserTramCap> list = (List<UserTramCap>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserTramCap userTramCap : list) {
				if ((userId != userTramCap.getUserId()) ||
						!Validator.equals(maHuyen, userTramCap.getMaHuyen())) {
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

			query.append(_SQL_SELECT_USERTRAMCAP_WHERE);

			query.append(_FINDER_COLUMN_UID_MH_USERID_2);

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_UID_MH_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UID_MH_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_UID_MH_MAHUYEN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserTramCapModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (!pagination) {
					list = (List<UserTramCap>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserTramCap>(list);
				}
				else {
					list = (List<UserTramCap>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user tram cap in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap findByUID_MH_First(long userId, String maHuyen,
		OrderByComparator orderByComparator)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = fetchByUID_MH_First(userId, maHuyen,
				orderByComparator);

		if (userTramCap != null) {
			return userTramCap;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserTramCapException(msg.toString());
	}

	/**
	 * Returns the first user tram cap in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap fetchByUID_MH_First(long userId, String maHuyen,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserTramCap> list = findByUID_MH(userId, maHuyen, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user tram cap in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap findByUID_MH_Last(long userId, String maHuyen,
		OrderByComparator orderByComparator)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = fetchByUID_MH_Last(userId, maHuyen,
				orderByComparator);

		if (userTramCap != null) {
			return userTramCap;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserTramCapException(msg.toString());
	}

	/**
	 * Returns the last user tram cap in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap fetchByUID_MH_Last(long userId, String maHuyen,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUID_MH(userId, maHuyen);

		if (count == 0) {
			return null;
		}

		List<UserTramCap> list = findByUID_MH(userId, maHuyen, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user tram caps before and after the current user tram cap in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param id the primary key of the current user tram cap
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a user tram cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap[] findByUID_MH_PrevAndNext(long id, long userId,
		String maHuyen, OrderByComparator orderByComparator)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserTramCap[] array = new UserTramCapImpl[3];

			array[0] = getByUID_MH_PrevAndNext(session, userTramCap, userId,
					maHuyen, orderByComparator, true);

			array[1] = userTramCap;

			array[2] = getByUID_MH_PrevAndNext(session, userTramCap, userId,
					maHuyen, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserTramCap getByUID_MH_PrevAndNext(Session session,
		UserTramCap userTramCap, long userId, String maHuyen,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERTRAMCAP_WHERE);

		query.append(_FINDER_COLUMN_UID_MH_USERID_2);

		boolean bindMaHuyen = false;

		if (maHuyen == null) {
			query.append(_FINDER_COLUMN_UID_MH_MAHUYEN_1);
		}
		else if (maHuyen.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UID_MH_MAHUYEN_3);
		}
		else {
			bindMaHuyen = true;

			query.append(_FINDER_COLUMN_UID_MH_MAHUYEN_2);
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
			query.append(UserTramCapModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (bindMaHuyen) {
			qPos.add(maHuyen);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userTramCap);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserTramCap> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user tram caps where userId = &#63; and maHuyen = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUID_MH(long userId, String maHuyen)
		throws SystemException {
		for (UserTramCap userTramCap : findByUID_MH(userId, maHuyen,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userTramCap);
		}
	}

	/**
	 * Returns the number of user tram caps where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @return the number of matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUID_MH(long userId, String maHuyen)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UID_MH;

		Object[] finderArgs = new Object[] { userId, maHuyen };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USERTRAMCAP_WHERE);

			query.append(_FINDER_COLUMN_UID_MH_USERID_2);

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_UID_MH_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UID_MH_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_UID_MH_MAHUYEN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_UID_MH_USERID_2 = "userTramCap.userId = ? AND ";
	private static final String _FINDER_COLUMN_UID_MH_MAHUYEN_1 = "userTramCap.maHuyen IS NULL";
	private static final String _FINDER_COLUMN_UID_MH_MAHUYEN_2 = "userTramCap.maHuyen = ?";
	private static final String _FINDER_COLUMN_UID_MH_MAHUYEN_3 = "(userTramCap.maHuyen IS NULL OR userTramCap.maHuyen = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UTC_T_H_X_TC_UID = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, UserTramCapImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUTC_T_H_X_TC_UID",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				Long.class.getName()
			},
			UserTramCapModelImpl.USERID_COLUMN_BITMASK |
			UserTramCapModelImpl.MAHUYEN_COLUMN_BITMASK |
			UserTramCapModelImpl.MAXA_COLUMN_BITMASK |
			UserTramCapModelImpl.MATINH_COLUMN_BITMASK |
			UserTramCapModelImpl.MATRAMCAP_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UTC_T_H_X_TC_UID = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByUTC_T_H_X_TC_UID",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns the user tram cap where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTramCapException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @param maTramCap the ma tram cap
	 * @return the matching user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap findByUTC_T_H_X_TC_UID(long userId, String maHuyen,
		String maXa, String maTinh, long maTramCap)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = fetchByUTC_T_H_X_TC_UID(userId, maHuyen,
				maXa, maTinh, maTramCap);

		if (userTramCap == null) {
			StringBundler msg = new StringBundler(12);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(", maHuyen=");
			msg.append(maHuyen);

			msg.append(", maXa=");
			msg.append(maXa);

			msg.append(", maTinh=");
			msg.append(maTinh);

			msg.append(", maTramCap=");
			msg.append(maTramCap);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchUserTramCapException(msg.toString());
		}

		return userTramCap;
	}

	/**
	 * Returns the user tram cap where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @param maTramCap the ma tram cap
	 * @return the matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap fetchByUTC_T_H_X_TC_UID(long userId, String maHuyen,
		String maXa, String maTinh, long maTramCap) throws SystemException {
		return fetchByUTC_T_H_X_TC_UID(userId, maHuyen, maXa, maTinh,
			maTramCap, true);
	}

	/**
	 * Returns the user tram cap where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @param maTramCap the ma tram cap
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap fetchByUTC_T_H_X_TC_UID(long userId, String maHuyen,
		String maXa, String maTinh, long maTramCap, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				userId, maHuyen, maXa, maTinh, maTramCap
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC_UID,
					finderArgs, this);
		}

		if (result instanceof UserTramCap) {
			UserTramCap userTramCap = (UserTramCap)result;

			if ((userId != userTramCap.getUserId()) ||
					!Validator.equals(maHuyen, userTramCap.getMaHuyen()) ||
					!Validator.equals(maXa, userTramCap.getMaXa()) ||
					!Validator.equals(maTinh, userTramCap.getMaTinh()) ||
					(maTramCap != userTramCap.getMaTramCap())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(7);

			query.append(_SQL_SELECT_USERTRAMCAP_WHERE);

			query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_USERID_2);

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MAXA_2);
			}

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MATINH_2);
			}

			query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MATRAMCAP_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				qPos.add(maTramCap);

				List<UserTramCap> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC_UID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"UserTramCapPersistenceImpl.fetchByUTC_T_H_X_TC_UID(long, String, String, String, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					UserTramCap userTramCap = list.get(0);

					result = userTramCap;

					cacheResult(userTramCap);

					if ((userTramCap.getUserId() != userId) ||
							(userTramCap.getMaHuyen() == null) ||
							!userTramCap.getMaHuyen().equals(maHuyen) ||
							(userTramCap.getMaXa() == null) ||
							!userTramCap.getMaXa().equals(maXa) ||
							(userTramCap.getMaTinh() == null) ||
							!userTramCap.getMaTinh().equals(maTinh) ||
							(userTramCap.getMaTramCap() != maTramCap)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC_UID,
							finderArgs, userTramCap);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC_UID,
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
			return (UserTramCap)result;
		}
	}

	/**
	 * Removes the user tram cap where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @param maTramCap the ma tram cap
	 * @return the user tram cap that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap removeByUTC_T_H_X_TC_UID(long userId, String maHuyen,
		String maXa, String maTinh, long maTramCap)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = findByUTC_T_H_X_TC_UID(userId, maHuyen, maXa,
				maTinh, maTramCap);

		return remove(userTramCap);
	}

	/**
	 * Returns the number of user tram caps where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @param maTramCap the ma tram cap
	 * @return the number of matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUTC_T_H_X_TC_UID(long userId, String maHuyen,
		String maXa, String maTinh, long maTramCap) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UTC_T_H_X_TC_UID;

		Object[] finderArgs = new Object[] {
				userId, maHuyen, maXa, maTinh, maTramCap
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_USERTRAMCAP_WHERE);

			query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_USERID_2);

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MAXA_2);
			}

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MATINH_2);
			}

			query.append(_FINDER_COLUMN_UTC_T_H_X_TC_UID_MATRAMCAP_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				qPos.add(maTramCap);

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

	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_UID_USERID_2 = "userTramCap.userId = ? AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_UID_MAHUYEN_1 = "userTramCap.maHuyen IS NULL AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_UID_MAHUYEN_2 = "userTramCap.maHuyen = ? AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_UID_MAHUYEN_3 = "(userTramCap.maHuyen IS NULL OR userTramCap.maHuyen = '') AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_UID_MAXA_1 = "userTramCap.maXa IS NULL AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_UID_MAXA_2 = "userTramCap.maXa = ? AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_UID_MAXA_3 = "(userTramCap.maXa IS NULL OR userTramCap.maXa = '') AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_UID_MATINH_1 = "userTramCap.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_UID_MATINH_2 = "userTramCap.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_UID_MATINH_3 = "(userTramCap.maTinh IS NULL OR userTramCap.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_UID_MATRAMCAP_2 = "userTramCap.maTramCap = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_UTC_T_H_X_TC = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, UserTramCapImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUTC_T_H_X_TC",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName()
			},
			UserTramCapModelImpl.MAHUYEN_COLUMN_BITMASK |
			UserTramCapModelImpl.MAXA_COLUMN_BITMASK |
			UserTramCapModelImpl.MATINH_COLUMN_BITMASK |
			UserTramCapModelImpl.MATRAMCAP_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UTC_T_H_X_TC = new FinderPath(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUTC_T_H_X_TC",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the user tram cap where maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTramCapException} if it could not be found.
	 *
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @param maTramCap the ma tram cap
	 * @return the matching user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap findByUTC_T_H_X_TC(String maHuyen, String maXa,
		String maTinh, long maTramCap)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = fetchByUTC_T_H_X_TC(maHuyen, maXa, maTinh,
				maTramCap);

		if (userTramCap == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maHuyen=");
			msg.append(maHuyen);

			msg.append(", maXa=");
			msg.append(maXa);

			msg.append(", maTinh=");
			msg.append(maTinh);

			msg.append(", maTramCap=");
			msg.append(maTramCap);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchUserTramCapException(msg.toString());
		}

		return userTramCap;
	}

	/**
	 * Returns the user tram cap where maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @param maTramCap the ma tram cap
	 * @return the matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap fetchByUTC_T_H_X_TC(String maHuyen, String maXa,
		String maTinh, long maTramCap) throws SystemException {
		return fetchByUTC_T_H_X_TC(maHuyen, maXa, maTinh, maTramCap, true);
	}

	/**
	 * Returns the user tram cap where maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @param maTramCap the ma tram cap
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching user tram cap, or <code>null</code> if a matching user tram cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap fetchByUTC_T_H_X_TC(String maHuyen, String maXa,
		String maTinh, long maTramCap, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { maHuyen, maXa, maTinh, maTramCap };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC,
					finderArgs, this);
		}

		if (result instanceof UserTramCap) {
			UserTramCap userTramCap = (UserTramCap)result;

			if (!Validator.equals(maHuyen, userTramCap.getMaHuyen()) ||
					!Validator.equals(maXa, userTramCap.getMaXa()) ||
					!Validator.equals(maTinh, userTramCap.getMaTinh()) ||
					(maTramCap != userTramCap.getMaTramCap())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_USERTRAMCAP_WHERE);

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MAXA_2);
			}

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MATINH_2);
			}

			query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MATRAMCAP_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				qPos.add(maTramCap);

				List<UserTramCap> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"UserTramCapPersistenceImpl.fetchByUTC_T_H_X_TC(String, String, String, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					UserTramCap userTramCap = list.get(0);

					result = userTramCap;

					cacheResult(userTramCap);

					if ((userTramCap.getMaHuyen() == null) ||
							!userTramCap.getMaHuyen().equals(maHuyen) ||
							(userTramCap.getMaXa() == null) ||
							!userTramCap.getMaXa().equals(maXa) ||
							(userTramCap.getMaTinh() == null) ||
							!userTramCap.getMaTinh().equals(maTinh) ||
							(userTramCap.getMaTramCap() != maTramCap)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC,
							finderArgs, userTramCap);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC,
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
			return (UserTramCap)result;
		}
	}

	/**
	 * Removes the user tram cap where maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63; from the database.
	 *
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @param maTramCap the ma tram cap
	 * @return the user tram cap that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap removeByUTC_T_H_X_TC(String maHuyen, String maXa,
		String maTinh, long maTramCap)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = findByUTC_T_H_X_TC(maHuyen, maXa, maTinh,
				maTramCap);

		return remove(userTramCap);
	}

	/**
	 * Returns the number of user tram caps where maHuyen = &#63; and maXa = &#63; and maTinh = &#63; and maTramCap = &#63;.
	 *
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @param maTramCap the ma tram cap
	 * @return the number of matching user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUTC_T_H_X_TC(String maHuyen, String maXa, String maTinh,
		long maTramCap) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UTC_T_H_X_TC;

		Object[] finderArgs = new Object[] { maHuyen, maXa, maTinh, maTramCap };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_USERTRAMCAP_WHERE);

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MAXA_2);
			}

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MATINH_2);
			}

			query.append(_FINDER_COLUMN_UTC_T_H_X_TC_MATRAMCAP_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				if (bindMaXa) {
					qPos.add(maXa);
				}

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				qPos.add(maTramCap);

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

	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_MAHUYEN_1 = "userTramCap.maHuyen IS NULL AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_MAHUYEN_2 = "userTramCap.maHuyen = ? AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_MAHUYEN_3 = "(userTramCap.maHuyen IS NULL OR userTramCap.maHuyen = '') AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_MAXA_1 = "userTramCap.maXa IS NULL AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_MAXA_2 = "userTramCap.maXa = ? AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_MAXA_3 = "(userTramCap.maXa IS NULL OR userTramCap.maXa = '') AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_MATINH_1 = "userTramCap.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_MATINH_2 = "userTramCap.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_MATINH_3 = "(userTramCap.maTinh IS NULL OR userTramCap.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_UTC_T_H_X_TC_MATRAMCAP_2 = "userTramCap.maTramCap = ?";

	public UserTramCapPersistenceImpl() {
		setModelClass(UserTramCap.class);
	}

	/**
	 * Caches the user tram cap in the entity cache if it is enabled.
	 *
	 * @param userTramCap the user tram cap
	 */
	@Override
	public void cacheResult(UserTramCap userTramCap) {
		EntityCacheUtil.putResult(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapImpl.class, userTramCap.getPrimaryKey(), userTramCap);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC_UID,
			new Object[] {
				userTramCap.getUserId(), userTramCap.getMaHuyen(),
				userTramCap.getMaXa(), userTramCap.getMaTinh(),
				userTramCap.getMaTramCap()
			}, userTramCap);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC,
			new Object[] {
				userTramCap.getMaHuyen(), userTramCap.getMaXa(),
				userTramCap.getMaTinh(), userTramCap.getMaTramCap()
			}, userTramCap);

		userTramCap.resetOriginalValues();
	}

	/**
	 * Caches the user tram caps in the entity cache if it is enabled.
	 *
	 * @param userTramCaps the user tram caps
	 */
	@Override
	public void cacheResult(List<UserTramCap> userTramCaps) {
		for (UserTramCap userTramCap : userTramCaps) {
			if (EntityCacheUtil.getResult(
						UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
						UserTramCapImpl.class, userTramCap.getPrimaryKey()) == null) {
				cacheResult(userTramCap);
			}
			else {
				userTramCap.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user tram caps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserTramCapImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserTramCapImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user tram cap.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserTramCap userTramCap) {
		EntityCacheUtil.removeResult(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapImpl.class, userTramCap.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(userTramCap);
	}

	@Override
	public void clearCache(List<UserTramCap> userTramCaps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserTramCap userTramCap : userTramCaps) {
			EntityCacheUtil.removeResult(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
				UserTramCapImpl.class, userTramCap.getPrimaryKey());

			clearUniqueFindersCache(userTramCap);
		}
	}

	protected void cacheUniqueFindersCache(UserTramCap userTramCap) {
		if (userTramCap.isNew()) {
			Object[] args = new Object[] {
					userTramCap.getUserId(), userTramCap.getMaHuyen(),
					userTramCap.getMaXa(), userTramCap.getMaTinh(),
					userTramCap.getMaTramCap()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UTC_T_H_X_TC_UID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC_UID,
				args, userTramCap);

			args = new Object[] {
					userTramCap.getMaHuyen(), userTramCap.getMaXa(),
					userTramCap.getMaTinh(), userTramCap.getMaTramCap()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UTC_T_H_X_TC, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC, args,
				userTramCap);
		}
		else {
			UserTramCapModelImpl userTramCapModelImpl = (UserTramCapModelImpl)userTramCap;

			if ((userTramCapModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UTC_T_H_X_TC_UID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userTramCap.getUserId(), userTramCap.getMaHuyen(),
						userTramCap.getMaXa(), userTramCap.getMaTinh(),
						userTramCap.getMaTramCap()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UTC_T_H_X_TC_UID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC_UID,
					args, userTramCap);
			}

			if ((userTramCapModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UTC_T_H_X_TC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userTramCap.getMaHuyen(), userTramCap.getMaXa(),
						userTramCap.getMaTinh(), userTramCap.getMaTramCap()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UTC_T_H_X_TC,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC,
					args, userTramCap);
			}
		}
	}

	protected void clearUniqueFindersCache(UserTramCap userTramCap) {
		UserTramCapModelImpl userTramCapModelImpl = (UserTramCapModelImpl)userTramCap;

		Object[] args = new Object[] {
				userTramCap.getUserId(), userTramCap.getMaHuyen(),
				userTramCap.getMaXa(), userTramCap.getMaTinh(),
				userTramCap.getMaTramCap()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UTC_T_H_X_TC_UID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC_UID, args);

		if ((userTramCapModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UTC_T_H_X_TC_UID.getColumnBitmask()) != 0) {
			args = new Object[] {
					userTramCapModelImpl.getOriginalUserId(),
					userTramCapModelImpl.getOriginalMaHuyen(),
					userTramCapModelImpl.getOriginalMaXa(),
					userTramCapModelImpl.getOriginalMaTinh(),
					userTramCapModelImpl.getOriginalMaTramCap()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UTC_T_H_X_TC_UID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC_UID,
				args);
		}

		args = new Object[] {
				userTramCap.getMaHuyen(), userTramCap.getMaXa(),
				userTramCap.getMaTinh(), userTramCap.getMaTramCap()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UTC_T_H_X_TC, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC, args);

		if ((userTramCapModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UTC_T_H_X_TC.getColumnBitmask()) != 0) {
			args = new Object[] {
					userTramCapModelImpl.getOriginalMaHuyen(),
					userTramCapModelImpl.getOriginalMaXa(),
					userTramCapModelImpl.getOriginalMaTinh(),
					userTramCapModelImpl.getOriginalMaTramCap()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UTC_T_H_X_TC, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UTC_T_H_X_TC, args);
		}
	}

	/**
	 * Creates a new user tram cap with the primary key. Does not add the user tram cap to the database.
	 *
	 * @param id the primary key for the new user tram cap
	 * @return the new user tram cap
	 */
	@Override
	public UserTramCap create(long id) {
		UserTramCap userTramCap = new UserTramCapImpl();

		userTramCap.setNew(true);
		userTramCap.setPrimaryKey(id);

		return userTramCap;
	}

	/**
	 * Removes the user tram cap with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the user tram cap
	 * @return the user tram cap that was removed
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a user tram cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap remove(long id)
		throws NoSuchUserTramCapException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the user tram cap with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user tram cap
	 * @return the user tram cap that was removed
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a user tram cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap remove(Serializable primaryKey)
		throws NoSuchUserTramCapException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserTramCap userTramCap = (UserTramCap)session.get(UserTramCapImpl.class,
					primaryKey);

			if (userTramCap == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserTramCapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userTramCap);
		}
		catch (NoSuchUserTramCapException nsee) {
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
	protected UserTramCap removeImpl(UserTramCap userTramCap)
		throws SystemException {
		userTramCap = toUnwrappedModel(userTramCap);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userTramCap)) {
				userTramCap = (UserTramCap)session.get(UserTramCapImpl.class,
						userTramCap.getPrimaryKeyObj());
			}

			if (userTramCap != null) {
				session.delete(userTramCap);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userTramCap != null) {
			clearCache(userTramCap);
		}

		return userTramCap;
	}

	@Override
	public UserTramCap updateImpl(
		vn.dtt.cmon.user.dao.model.UserTramCap userTramCap)
		throws SystemException {
		userTramCap = toUnwrappedModel(userTramCap);

		boolean isNew = userTramCap.isNew();

		UserTramCapModelImpl userTramCapModelImpl = (UserTramCapModelImpl)userTramCap;

		Session session = null;

		try {
			session = openSession();

			if (userTramCap.isNew()) {
				session.save(userTramCap);

				userTramCap.setNew(false);
			}
			else {
				session.merge(userTramCap);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserTramCapModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userTramCapModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userTramCapModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_,
					args);

				args = new Object[] { userTramCapModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_,
					args);
			}

			if ((userTramCapModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_TC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userTramCapModelImpl.getOriginalUserId(),
						userTramCapModelImpl.getOriginalMaTramCap()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_TC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_TC,
					args);

				args = new Object[] {
						userTramCapModelImpl.getUserId(),
						userTramCapModelImpl.getMaTramCap()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_TC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_TC,
					args);
			}

			if ((userTramCapModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userTramCapModelImpl.getOriginalUserId(),
						userTramCapModelImpl.getOriginalMaHuyen()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_MH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH,
					args);

				args = new Object[] {
						userTramCapModelImpl.getUserId(),
						userTramCapModelImpl.getMaHuyen()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_MH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH,
					args);
			}
		}

		EntityCacheUtil.putResult(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
			UserTramCapImpl.class, userTramCap.getPrimaryKey(), userTramCap);

		clearUniqueFindersCache(userTramCap);
		cacheUniqueFindersCache(userTramCap);

		return userTramCap;
	}

	protected UserTramCap toUnwrappedModel(UserTramCap userTramCap) {
		if (userTramCap instanceof UserTramCapImpl) {
			return userTramCap;
		}

		UserTramCapImpl userTramCapImpl = new UserTramCapImpl();

		userTramCapImpl.setNew(userTramCap.isNew());
		userTramCapImpl.setPrimaryKey(userTramCap.getPrimaryKey());

		userTramCapImpl.setId(userTramCap.getId());
		userTramCapImpl.setMaTinh(userTramCap.getMaTinh());
		userTramCapImpl.setMaHuyen(userTramCap.getMaHuyen());
		userTramCapImpl.setMaXa(userTramCap.getMaXa());
		userTramCapImpl.setName(userTramCap.getName());
		userTramCapImpl.setMaTramCap(userTramCap.getMaTramCap());
		userTramCapImpl.setUserId(userTramCap.getUserId());

		return userTramCapImpl;
	}

	/**
	 * Returns the user tram cap with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user tram cap
	 * @return the user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a user tram cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserTramCapException, SystemException {
		UserTramCap userTramCap = fetchByPrimaryKey(primaryKey);

		if (userTramCap == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserTramCapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userTramCap;
	}

	/**
	 * Returns the user tram cap with the primary key or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTramCapException} if it could not be found.
	 *
	 * @param id the primary key of the user tram cap
	 * @return the user tram cap
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTramCapException if a user tram cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap findByPrimaryKey(long id)
		throws NoSuchUserTramCapException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the user tram cap with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user tram cap
	 * @return the user tram cap, or <code>null</code> if a user tram cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserTramCap userTramCap = (UserTramCap)EntityCacheUtil.getResult(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
				UserTramCapImpl.class, primaryKey);

		if (userTramCap == _nullUserTramCap) {
			return null;
		}

		if (userTramCap == null) {
			Session session = null;

			try {
				session = openSession();

				userTramCap = (UserTramCap)session.get(UserTramCapImpl.class,
						primaryKey);

				if (userTramCap != null) {
					cacheResult(userTramCap);
				}
				else {
					EntityCacheUtil.putResult(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
						UserTramCapImpl.class, primaryKey, _nullUserTramCap);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserTramCapModelImpl.ENTITY_CACHE_ENABLED,
					UserTramCapImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userTramCap;
	}

	/**
	 * Returns the user tram cap with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the user tram cap
	 * @return the user tram cap, or <code>null</code> if a user tram cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTramCap fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the user tram caps.
	 *
	 * @return the user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTramCap> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user tram caps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user tram caps
	 * @param end the upper bound of the range of user tram caps (not inclusive)
	 * @return the range of user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTramCap> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user tram caps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTramCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user tram caps
	 * @param end the upper bound of the range of user tram caps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user tram caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTramCap> findAll(int start, int end,
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

		List<UserTramCap> list = (List<UserTramCap>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERTRAMCAP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERTRAMCAP;

				if (pagination) {
					sql = sql.concat(UserTramCapModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserTramCap>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserTramCap>(list);
				}
				else {
					list = (List<UserTramCap>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user tram caps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserTramCap userTramCap : findAll()) {
			remove(userTramCap);
		}
	}

	/**
	 * Returns the number of user tram caps.
	 *
	 * @return the number of user tram caps
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

				Query q = session.createQuery(_SQL_COUNT_USERTRAMCAP);

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
	 * Initializes the user tram cap persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.cmon.user.dao.model.UserTramCap")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserTramCap>> listenersList = new ArrayList<ModelListener<UserTramCap>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserTramCap>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserTramCapImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERTRAMCAP = "SELECT userTramCap FROM UserTramCap userTramCap";
	private static final String _SQL_SELECT_USERTRAMCAP_WHERE = "SELECT userTramCap FROM UserTramCap userTramCap WHERE ";
	private static final String _SQL_COUNT_USERTRAMCAP = "SELECT COUNT(userTramCap) FROM UserTramCap userTramCap";
	private static final String _SQL_COUNT_USERTRAMCAP_WHERE = "SELECT COUNT(userTramCap) FROM UserTramCap userTramCap WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userTramCap.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserTramCap exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserTramCap exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserTramCapPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maTinh", "maHuyen", "maXa", "name", "maTramCap", "userId"
			});
	private static UserTramCap _nullUserTramCap = new UserTramCapImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserTramCap> toCacheModel() {
				return _nullUserTramCapCacheModel;
			}
		};

	private static CacheModel<UserTramCap> _nullUserTramCapCacheModel = new CacheModel<UserTramCap>() {
			@Override
			public UserTramCap toEntityModel() {
				return _nullUserTramCap;
			}
		};
}