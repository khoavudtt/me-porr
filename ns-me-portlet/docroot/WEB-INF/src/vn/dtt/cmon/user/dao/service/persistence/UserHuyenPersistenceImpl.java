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

import vn.dtt.cmon.user.dao.NoSuchUserHuyenException;
import vn.dtt.cmon.user.dao.model.UserHuyen;
import vn.dtt.cmon.user.dao.model.impl.UserHuyenImpl;
import vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the user huyen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see UserHuyenPersistence
 * @see UserHuyenUtil
 * @generated
 */
public class UserHuyenPersistenceImpl extends BasePersistenceImpl<UserHuyen>
	implements UserHuyenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserHuyenUtil} to access the user huyen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserHuyenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenModelImpl.FINDER_CACHE_ENABLED, UserHuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenModelImpl.FINDER_CACHE_ENABLED, UserHuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_ = new FinderPath(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenModelImpl.FINDER_CACHE_ENABLED, UserHuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUID_",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_ = new FinderPath(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenModelImpl.FINDER_CACHE_ENABLED, UserHuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUID_",
			new String[] { Long.class.getName() },
			UserHuyenModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UID_ = new FinderPath(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUID_",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the user huyens where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching user huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserHuyen> findByUID_(long userId) throws SystemException {
		return findByUID_(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user huyens where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user huyens
	 * @param end the upper bound of the range of user huyens (not inclusive)
	 * @return the range of matching user huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserHuyen> findByUID_(long userId, int start, int end)
		throws SystemException {
		return findByUID_(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user huyens where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user huyens
	 * @param end the upper bound of the range of user huyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserHuyen> findByUID_(long userId, int start, int end,
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

		List<UserHuyen> list = (List<UserHuyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserHuyen userHuyen : list) {
				if ((userId != userHuyen.getUserId())) {
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

			query.append(_SQL_SELECT_USERHUYEN_WHERE);

			query.append(_FINDER_COLUMN_UID__USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserHuyenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<UserHuyen>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserHuyen>(list);
				}
				else {
					list = (List<UserHuyen>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user huyen in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user huyen
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a matching user huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen findByUID__First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserHuyenException, SystemException {
		UserHuyen userHuyen = fetchByUID__First(userId, orderByComparator);

		if (userHuyen != null) {
			return userHuyen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserHuyenException(msg.toString());
	}

	/**
	 * Returns the first user huyen in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user huyen, or <code>null</code> if a matching user huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen fetchByUID__First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserHuyen> list = findByUID_(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user huyen in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user huyen
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a matching user huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen findByUID__Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserHuyenException, SystemException {
		UserHuyen userHuyen = fetchByUID__Last(userId, orderByComparator);

		if (userHuyen != null) {
			return userHuyen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserHuyenException(msg.toString());
	}

	/**
	 * Returns the last user huyen in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user huyen, or <code>null</code> if a matching user huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen fetchByUID__Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUID_(userId);

		if (count == 0) {
			return null;
		}

		List<UserHuyen> list = findByUID_(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user huyens before and after the current user huyen in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current user huyen
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user huyen
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a user huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen[] findByUID__PrevAndNext(long id, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserHuyenException, SystemException {
		UserHuyen userHuyen = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserHuyen[] array = new UserHuyenImpl[3];

			array[0] = getByUID__PrevAndNext(session, userHuyen, userId,
					orderByComparator, true);

			array[1] = userHuyen;

			array[2] = getByUID__PrevAndNext(session, userHuyen, userId,
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

	protected UserHuyen getByUID__PrevAndNext(Session session,
		UserHuyen userHuyen, long userId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERHUYEN_WHERE);

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
			query.append(UserHuyenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userHuyen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserHuyen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user huyens where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUID_(long userId) throws SystemException {
		for (UserHuyen userHuyen : findByUID_(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(userHuyen);
		}
	}

	/**
	 * Returns the number of user huyens where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user huyens
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

			query.append(_SQL_COUNT_USERHUYEN_WHERE);

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

	private static final String _FINDER_COLUMN_UID__USERID_2 = "userHuyen.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_MH = new FinderPath(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenModelImpl.FINDER_CACHE_ENABLED, UserHuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUID_MH",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH =
		new FinderPath(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenModelImpl.FINDER_CACHE_ENABLED, UserHuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUID_MH",
			new String[] { Long.class.getName(), String.class.getName() },
			UserHuyenModelImpl.USERID_COLUMN_BITMASK |
			UserHuyenModelImpl.MAHUYEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UID_MH = new FinderPath(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUID_MH",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the user huyens where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @return the matching user huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserHuyen> findByUID_MH(long userId, String maHuyen)
		throws SystemException {
		return findByUID_MH(userId, maHuyen, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user huyens where userId = &#63; and maHuyen = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param start the lower bound of the range of user huyens
	 * @param end the upper bound of the range of user huyens (not inclusive)
	 * @return the range of matching user huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserHuyen> findByUID_MH(long userId, String maHuyen, int start,
		int end) throws SystemException {
		return findByUID_MH(userId, maHuyen, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user huyens where userId = &#63; and maHuyen = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param start the lower bound of the range of user huyens
	 * @param end the upper bound of the range of user huyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserHuyen> findByUID_MH(long userId, String maHuyen, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<UserHuyen> list = (List<UserHuyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserHuyen userHuyen : list) {
				if ((userId != userHuyen.getUserId()) ||
						!Validator.equals(maHuyen, userHuyen.getMaHuyen())) {
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

			query.append(_SQL_SELECT_USERHUYEN_WHERE);

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
				query.append(UserHuyenModelImpl.ORDER_BY_JPQL);
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
					list = (List<UserHuyen>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserHuyen>(list);
				}
				else {
					list = (List<UserHuyen>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user huyen in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user huyen
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a matching user huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen findByUID_MH_First(long userId, String maHuyen,
		OrderByComparator orderByComparator)
		throws NoSuchUserHuyenException, SystemException {
		UserHuyen userHuyen = fetchByUID_MH_First(userId, maHuyen,
				orderByComparator);

		if (userHuyen != null) {
			return userHuyen;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserHuyenException(msg.toString());
	}

	/**
	 * Returns the first user huyen in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user huyen, or <code>null</code> if a matching user huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen fetchByUID_MH_First(long userId, String maHuyen,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserHuyen> list = findByUID_MH(userId, maHuyen, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user huyen in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user huyen
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a matching user huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen findByUID_MH_Last(long userId, String maHuyen,
		OrderByComparator orderByComparator)
		throws NoSuchUserHuyenException, SystemException {
		UserHuyen userHuyen = fetchByUID_MH_Last(userId, maHuyen,
				orderByComparator);

		if (userHuyen != null) {
			return userHuyen;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserHuyenException(msg.toString());
	}

	/**
	 * Returns the last user huyen in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user huyen, or <code>null</code> if a matching user huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen fetchByUID_MH_Last(long userId, String maHuyen,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUID_MH(userId, maHuyen);

		if (count == 0) {
			return null;
		}

		List<UserHuyen> list = findByUID_MH(userId, maHuyen, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user huyens before and after the current user huyen in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param id the primary key of the current user huyen
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user huyen
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a user huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen[] findByUID_MH_PrevAndNext(long id, long userId,
		String maHuyen, OrderByComparator orderByComparator)
		throws NoSuchUserHuyenException, SystemException {
		UserHuyen userHuyen = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserHuyen[] array = new UserHuyenImpl[3];

			array[0] = getByUID_MH_PrevAndNext(session, userHuyen, userId,
					maHuyen, orderByComparator, true);

			array[1] = userHuyen;

			array[2] = getByUID_MH_PrevAndNext(session, userHuyen, userId,
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

	protected UserHuyen getByUID_MH_PrevAndNext(Session session,
		UserHuyen userHuyen, long userId, String maHuyen,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERHUYEN_WHERE);

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
			query.append(UserHuyenModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(userHuyen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserHuyen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user huyens where userId = &#63; and maHuyen = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUID_MH(long userId, String maHuyen)
		throws SystemException {
		for (UserHuyen userHuyen : findByUID_MH(userId, maHuyen,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userHuyen);
		}
	}

	/**
	 * Returns the number of user huyens where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @return the number of matching user huyens
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

			query.append(_SQL_COUNT_USERHUYEN_WHERE);

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

	private static final String _FINDER_COLUMN_UID_MH_USERID_2 = "userHuyen.userId = ? AND ";
	private static final String _FINDER_COLUMN_UID_MH_MAHUYEN_1 = "userHuyen.maHuyen IS NULL";
	private static final String _FINDER_COLUMN_UID_MH_MAHUYEN_2 = "userHuyen.maHuyen = ?";
	private static final String _FINDER_COLUMN_UID_MH_MAHUYEN_3 = "(userHuyen.maHuyen IS NULL OR userHuyen.maHuyen = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UH_T_H_X_UID = new FinderPath(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenModelImpl.FINDER_CACHE_ENABLED, UserHuyenImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUH_T_H_X_UID",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			UserHuyenModelImpl.USERID_COLUMN_BITMASK |
			UserHuyenModelImpl.MAHUYEN_COLUMN_BITMASK |
			UserHuyenModelImpl.MAXA_COLUMN_BITMASK |
			UserHuyenModelImpl.MATINH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UH_T_H_X_UID = new FinderPath(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUH_T_H_X_UID",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns the user huyen where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserHuyenException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @return the matching user huyen
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a matching user huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen findByUH_T_H_X_UID(long userId, String maHuyen,
		String maXa, String maTinh)
		throws NoSuchUserHuyenException, SystemException {
		UserHuyen userHuyen = fetchByUH_T_H_X_UID(userId, maHuyen, maXa, maTinh);

		if (userHuyen == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(", maHuyen=");
			msg.append(maHuyen);

			msg.append(", maXa=");
			msg.append(maXa);

			msg.append(", maTinh=");
			msg.append(maTinh);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchUserHuyenException(msg.toString());
		}

		return userHuyen;
	}

	/**
	 * Returns the user huyen where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @return the matching user huyen, or <code>null</code> if a matching user huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen fetchByUH_T_H_X_UID(long userId, String maHuyen,
		String maXa, String maTinh) throws SystemException {
		return fetchByUH_T_H_X_UID(userId, maHuyen, maXa, maTinh, true);
	}

	/**
	 * Returns the user huyen where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching user huyen, or <code>null</code> if a matching user huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen fetchByUH_T_H_X_UID(long userId, String maHuyen,
		String maXa, String maTinh, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId, maHuyen, maXa, maTinh };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UH_T_H_X_UID,
					finderArgs, this);
		}

		if (result instanceof UserHuyen) {
			UserHuyen userHuyen = (UserHuyen)result;

			if ((userId != userHuyen.getUserId()) ||
					!Validator.equals(maHuyen, userHuyen.getMaHuyen()) ||
					!Validator.equals(maXa, userHuyen.getMaXa()) ||
					!Validator.equals(maTinh, userHuyen.getMaTinh())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_USERHUYEN_WHERE);

			query.append(_FINDER_COLUMN_UH_T_H_X_UID_USERID_2);

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MAXA_2);
			}

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MATINH_2);
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

				if (bindMaXa) {
					qPos.add(maXa);
				}

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				List<UserHuyen> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UH_T_H_X_UID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"UserHuyenPersistenceImpl.fetchByUH_T_H_X_UID(long, String, String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					UserHuyen userHuyen = list.get(0);

					result = userHuyen;

					cacheResult(userHuyen);

					if ((userHuyen.getUserId() != userId) ||
							(userHuyen.getMaHuyen() == null) ||
							!userHuyen.getMaHuyen().equals(maHuyen) ||
							(userHuyen.getMaXa() == null) ||
							!userHuyen.getMaXa().equals(maXa) ||
							(userHuyen.getMaTinh() == null) ||
							!userHuyen.getMaTinh().equals(maTinh)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UH_T_H_X_UID,
							finderArgs, userHuyen);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UH_T_H_X_UID,
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
			return (UserHuyen)result;
		}
	}

	/**
	 * Removes the user huyen where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @return the user huyen that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen removeByUH_T_H_X_UID(long userId, String maHuyen,
		String maXa, String maTinh)
		throws NoSuchUserHuyenException, SystemException {
		UserHuyen userHuyen = findByUH_T_H_X_UID(userId, maHuyen, maXa, maTinh);

		return remove(userHuyen);
	}

	/**
	 * Returns the number of user huyens where userId = &#63; and maHuyen = &#63; and maXa = &#63; and maTinh = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param maXa the ma xa
	 * @param maTinh the ma tinh
	 * @return the number of matching user huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUH_T_H_X_UID(long userId, String maHuyen, String maXa,
		String maTinh) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UH_T_H_X_UID;

		Object[] finderArgs = new Object[] { userId, maHuyen, maXa, maTinh };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_USERHUYEN_WHERE);

			query.append(_FINDER_COLUMN_UH_T_H_X_UID_USERID_2);

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MAHUYEN_2);
			}

			boolean bindMaXa = false;

			if (maXa == null) {
				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MAXA_1);
			}
			else if (maXa.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MAXA_3);
			}
			else {
				bindMaXa = true;

				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MAXA_2);
			}

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_UH_T_H_X_UID_MATINH_2);
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

				if (bindMaXa) {
					qPos.add(maXa);
				}

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

	private static final String _FINDER_COLUMN_UH_T_H_X_UID_USERID_2 = "userHuyen.userId = ? AND ";
	private static final String _FINDER_COLUMN_UH_T_H_X_UID_MAHUYEN_1 = "userHuyen.maHuyen IS NULL AND ";
	private static final String _FINDER_COLUMN_UH_T_H_X_UID_MAHUYEN_2 = "userHuyen.maHuyen = ? AND ";
	private static final String _FINDER_COLUMN_UH_T_H_X_UID_MAHUYEN_3 = "(userHuyen.maHuyen IS NULL OR userHuyen.maHuyen = '') AND ";
	private static final String _FINDER_COLUMN_UH_T_H_X_UID_MAXA_1 = "userHuyen.maXa IS NULL AND ";
	private static final String _FINDER_COLUMN_UH_T_H_X_UID_MAXA_2 = "userHuyen.maXa = ? AND ";
	private static final String _FINDER_COLUMN_UH_T_H_X_UID_MAXA_3 = "(userHuyen.maXa IS NULL OR userHuyen.maXa = '') AND ";
	private static final String _FINDER_COLUMN_UH_T_H_X_UID_MATINH_1 = "userHuyen.maTinh IS NULL";
	private static final String _FINDER_COLUMN_UH_T_H_X_UID_MATINH_2 = "userHuyen.maTinh = ?";
	private static final String _FINDER_COLUMN_UH_T_H_X_UID_MATINH_3 = "(userHuyen.maTinh IS NULL OR userHuyen.maTinh = '')";

	public UserHuyenPersistenceImpl() {
		setModelClass(UserHuyen.class);
	}

	/**
	 * Caches the user huyen in the entity cache if it is enabled.
	 *
	 * @param userHuyen the user huyen
	 */
	@Override
	public void cacheResult(UserHuyen userHuyen) {
		EntityCacheUtil.putResult(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenImpl.class, userHuyen.getPrimaryKey(), userHuyen);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UH_T_H_X_UID,
			new Object[] {
				userHuyen.getUserId(), userHuyen.getMaHuyen(),
				userHuyen.getMaXa(), userHuyen.getMaTinh()
			}, userHuyen);

		userHuyen.resetOriginalValues();
	}

	/**
	 * Caches the user huyens in the entity cache if it is enabled.
	 *
	 * @param userHuyens the user huyens
	 */
	@Override
	public void cacheResult(List<UserHuyen> userHuyens) {
		for (UserHuyen userHuyen : userHuyens) {
			if (EntityCacheUtil.getResult(
						UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
						UserHuyenImpl.class, userHuyen.getPrimaryKey()) == null) {
				cacheResult(userHuyen);
			}
			else {
				userHuyen.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user huyens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserHuyenImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserHuyenImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user huyen.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserHuyen userHuyen) {
		EntityCacheUtil.removeResult(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenImpl.class, userHuyen.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(userHuyen);
	}

	@Override
	public void clearCache(List<UserHuyen> userHuyens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserHuyen userHuyen : userHuyens) {
			EntityCacheUtil.removeResult(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
				UserHuyenImpl.class, userHuyen.getPrimaryKey());

			clearUniqueFindersCache(userHuyen);
		}
	}

	protected void cacheUniqueFindersCache(UserHuyen userHuyen) {
		if (userHuyen.isNew()) {
			Object[] args = new Object[] {
					userHuyen.getUserId(), userHuyen.getMaHuyen(),
					userHuyen.getMaXa(), userHuyen.getMaTinh()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UH_T_H_X_UID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UH_T_H_X_UID, args,
				userHuyen);
		}
		else {
			UserHuyenModelImpl userHuyenModelImpl = (UserHuyenModelImpl)userHuyen;

			if ((userHuyenModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UH_T_H_X_UID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userHuyen.getUserId(), userHuyen.getMaHuyen(),
						userHuyen.getMaXa(), userHuyen.getMaTinh()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UH_T_H_X_UID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UH_T_H_X_UID,
					args, userHuyen);
			}
		}
	}

	protected void clearUniqueFindersCache(UserHuyen userHuyen) {
		UserHuyenModelImpl userHuyenModelImpl = (UserHuyenModelImpl)userHuyen;

		Object[] args = new Object[] {
				userHuyen.getUserId(), userHuyen.getMaHuyen(),
				userHuyen.getMaXa(), userHuyen.getMaTinh()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UH_T_H_X_UID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UH_T_H_X_UID, args);

		if ((userHuyenModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UH_T_H_X_UID.getColumnBitmask()) != 0) {
			args = new Object[] {
					userHuyenModelImpl.getOriginalUserId(),
					userHuyenModelImpl.getOriginalMaHuyen(),
					userHuyenModelImpl.getOriginalMaXa(),
					userHuyenModelImpl.getOriginalMaTinh()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UH_T_H_X_UID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UH_T_H_X_UID, args);
		}
	}

	/**
	 * Creates a new user huyen with the primary key. Does not add the user huyen to the database.
	 *
	 * @param id the primary key for the new user huyen
	 * @return the new user huyen
	 */
	@Override
	public UserHuyen create(long id) {
		UserHuyen userHuyen = new UserHuyenImpl();

		userHuyen.setNew(true);
		userHuyen.setPrimaryKey(id);

		return userHuyen;
	}

	/**
	 * Removes the user huyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the user huyen
	 * @return the user huyen that was removed
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a user huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen remove(long id)
		throws NoSuchUserHuyenException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the user huyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user huyen
	 * @return the user huyen that was removed
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a user huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen remove(Serializable primaryKey)
		throws NoSuchUserHuyenException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserHuyen userHuyen = (UserHuyen)session.get(UserHuyenImpl.class,
					primaryKey);

			if (userHuyen == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserHuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userHuyen);
		}
		catch (NoSuchUserHuyenException nsee) {
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
	protected UserHuyen removeImpl(UserHuyen userHuyen)
		throws SystemException {
		userHuyen = toUnwrappedModel(userHuyen);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userHuyen)) {
				userHuyen = (UserHuyen)session.get(UserHuyenImpl.class,
						userHuyen.getPrimaryKeyObj());
			}

			if (userHuyen != null) {
				session.delete(userHuyen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userHuyen != null) {
			clearCache(userHuyen);
		}

		return userHuyen;
	}

	@Override
	public UserHuyen updateImpl(vn.dtt.cmon.user.dao.model.UserHuyen userHuyen)
		throws SystemException {
		userHuyen = toUnwrappedModel(userHuyen);

		boolean isNew = userHuyen.isNew();

		UserHuyenModelImpl userHuyenModelImpl = (UserHuyenModelImpl)userHuyen;

		Session session = null;

		try {
			session = openSession();

			if (userHuyen.isNew()) {
				session.save(userHuyen);

				userHuyen.setNew(false);
			}
			else {
				session.merge(userHuyen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserHuyenModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userHuyenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userHuyenModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_,
					args);

				args = new Object[] { userHuyenModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_,
					args);
			}

			if ((userHuyenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userHuyenModelImpl.getOriginalUserId(),
						userHuyenModelImpl.getOriginalMaHuyen()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_MH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH,
					args);

				args = new Object[] {
						userHuyenModelImpl.getUserId(),
						userHuyenModelImpl.getMaHuyen()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_MH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH,
					args);
			}
		}

		EntityCacheUtil.putResult(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
			UserHuyenImpl.class, userHuyen.getPrimaryKey(), userHuyen);

		clearUniqueFindersCache(userHuyen);
		cacheUniqueFindersCache(userHuyen);

		return userHuyen;
	}

	protected UserHuyen toUnwrappedModel(UserHuyen userHuyen) {
		if (userHuyen instanceof UserHuyenImpl) {
			return userHuyen;
		}

		UserHuyenImpl userHuyenImpl = new UserHuyenImpl();

		userHuyenImpl.setNew(userHuyen.isNew());
		userHuyenImpl.setPrimaryKey(userHuyen.getPrimaryKey());

		userHuyenImpl.setId(userHuyen.getId());
		userHuyenImpl.setMaTinh(userHuyen.getMaTinh());
		userHuyenImpl.setMaHuyen(userHuyen.getMaHuyen());
		userHuyenImpl.setMaXa(userHuyen.getMaXa());
		userHuyenImpl.setName(userHuyen.getName());
		userHuyenImpl.setUserId(userHuyen.getUserId());

		return userHuyenImpl;
	}

	/**
	 * Returns the user huyen with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user huyen
	 * @return the user huyen
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a user huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserHuyenException, SystemException {
		UserHuyen userHuyen = fetchByPrimaryKey(primaryKey);

		if (userHuyen == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserHuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userHuyen;
	}

	/**
	 * Returns the user huyen with the primary key or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserHuyenException} if it could not be found.
	 *
	 * @param id the primary key of the user huyen
	 * @return the user huyen
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserHuyenException if a user huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen findByPrimaryKey(long id)
		throws NoSuchUserHuyenException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the user huyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user huyen
	 * @return the user huyen, or <code>null</code> if a user huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserHuyen userHuyen = (UserHuyen)EntityCacheUtil.getResult(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
				UserHuyenImpl.class, primaryKey);

		if (userHuyen == _nullUserHuyen) {
			return null;
		}

		if (userHuyen == null) {
			Session session = null;

			try {
				session = openSession();

				userHuyen = (UserHuyen)session.get(UserHuyenImpl.class,
						primaryKey);

				if (userHuyen != null) {
					cacheResult(userHuyen);
				}
				else {
					EntityCacheUtil.putResult(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
						UserHuyenImpl.class, primaryKey, _nullUserHuyen);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserHuyenModelImpl.ENTITY_CACHE_ENABLED,
					UserHuyenImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userHuyen;
	}

	/**
	 * Returns the user huyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the user huyen
	 * @return the user huyen, or <code>null</code> if a user huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserHuyen fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the user huyens.
	 *
	 * @return the user huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserHuyen> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user huyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user huyens
	 * @param end the upper bound of the range of user huyens (not inclusive)
	 * @return the range of user huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserHuyen> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user huyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user huyens
	 * @param end the upper bound of the range of user huyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserHuyen> findAll(int start, int end,
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

		List<UserHuyen> list = (List<UserHuyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERHUYEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERHUYEN;

				if (pagination) {
					sql = sql.concat(UserHuyenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserHuyen>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserHuyen>(list);
				}
				else {
					list = (List<UserHuyen>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user huyens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserHuyen userHuyen : findAll()) {
			remove(userHuyen);
		}
	}

	/**
	 * Returns the number of user huyens.
	 *
	 * @return the number of user huyens
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

				Query q = session.createQuery(_SQL_COUNT_USERHUYEN);

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
	 * Initializes the user huyen persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.cmon.user.dao.model.UserHuyen")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserHuyen>> listenersList = new ArrayList<ModelListener<UserHuyen>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserHuyen>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserHuyenImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERHUYEN = "SELECT userHuyen FROM UserHuyen userHuyen";
	private static final String _SQL_SELECT_USERHUYEN_WHERE = "SELECT userHuyen FROM UserHuyen userHuyen WHERE ";
	private static final String _SQL_COUNT_USERHUYEN = "SELECT COUNT(userHuyen) FROM UserHuyen userHuyen";
	private static final String _SQL_COUNT_USERHUYEN_WHERE = "SELECT COUNT(userHuyen) FROM UserHuyen userHuyen WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userHuyen.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserHuyen exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserHuyen exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserHuyenPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maTinh", "maHuyen", "maXa", "name", "userId"
			});
	private static UserHuyen _nullUserHuyen = new UserHuyenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserHuyen> toCacheModel() {
				return _nullUserHuyenCacheModel;
			}
		};

	private static CacheModel<UserHuyen> _nullUserHuyenCacheModel = new CacheModel<UserHuyen>() {
			@Override
			public UserHuyen toEntityModel() {
				return _nullUserHuyen;
			}
		};
}