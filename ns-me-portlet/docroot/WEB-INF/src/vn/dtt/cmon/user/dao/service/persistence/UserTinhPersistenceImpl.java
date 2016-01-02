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

import vn.dtt.cmon.user.dao.NoSuchUserTinhException;
import vn.dtt.cmon.user.dao.model.UserTinh;
import vn.dtt.cmon.user.dao.model.impl.UserTinhImpl;
import vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the user tinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see UserTinhPersistence
 * @see UserTinhUtil
 * @generated
 */
public class UserTinhPersistenceImpl extends BasePersistenceImpl<UserTinh>
	implements UserTinhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserTinhUtil} to access the user tinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserTinhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhModelImpl.FINDER_CACHE_ENABLED, UserTinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhModelImpl.FINDER_CACHE_ENABLED, UserTinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_MH = new FinderPath(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhModelImpl.FINDER_CACHE_ENABLED, UserTinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUID_MH",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH =
		new FinderPath(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhModelImpl.FINDER_CACHE_ENABLED, UserTinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUID_MH",
			new String[] { Long.class.getName(), String.class.getName() },
			UserTinhModelImpl.USERID_COLUMN_BITMASK |
			UserTinhModelImpl.MAHUYEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UID_MH = new FinderPath(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUID_MH",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the user tinhs where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @return the matching user tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTinh> findByUID_MH(long userId, String maHuyen)
		throws SystemException {
		return findByUID_MH(userId, maHuyen, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user tinhs where userId = &#63; and maHuyen = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param start the lower bound of the range of user tinhs
	 * @param end the upper bound of the range of user tinhs (not inclusive)
	 * @return the range of matching user tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTinh> findByUID_MH(long userId, String maHuyen, int start,
		int end) throws SystemException {
		return findByUID_MH(userId, maHuyen, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user tinhs where userId = &#63; and maHuyen = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param start the lower bound of the range of user tinhs
	 * @param end the upper bound of the range of user tinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTinh> findByUID_MH(long userId, String maHuyen, int start,
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

		List<UserTinh> list = (List<UserTinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserTinh userTinh : list) {
				if ((userId != userTinh.getUserId()) ||
						!Validator.equals(maHuyen, userTinh.getMaHuyen())) {
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

			query.append(_SQL_SELECT_USERTINH_WHERE);

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
				query.append(UserTinhModelImpl.ORDER_BY_JPQL);
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
					list = (List<UserTinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserTinh>(list);
				}
				else {
					list = (List<UserTinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user tinh in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user tinh
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a matching user tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh findByUID_MH_First(long userId, String maHuyen,
		OrderByComparator orderByComparator)
		throws NoSuchUserTinhException, SystemException {
		UserTinh userTinh = fetchByUID_MH_First(userId, maHuyen,
				orderByComparator);

		if (userTinh != null) {
			return userTinh;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserTinhException(msg.toString());
	}

	/**
	 * Returns the first user tinh in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user tinh, or <code>null</code> if a matching user tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh fetchByUID_MH_First(long userId, String maHuyen,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserTinh> list = findByUID_MH(userId, maHuyen, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user tinh in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user tinh
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a matching user tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh findByUID_MH_Last(long userId, String maHuyen,
		OrderByComparator orderByComparator)
		throws NoSuchUserTinhException, SystemException {
		UserTinh userTinh = fetchByUID_MH_Last(userId, maHuyen,
				orderByComparator);

		if (userTinh != null) {
			return userTinh;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserTinhException(msg.toString());
	}

	/**
	 * Returns the last user tinh in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user tinh, or <code>null</code> if a matching user tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh fetchByUID_MH_Last(long userId, String maHuyen,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUID_MH(userId, maHuyen);

		if (count == 0) {
			return null;
		}

		List<UserTinh> list = findByUID_MH(userId, maHuyen, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user tinhs before and after the current user tinh in the ordered set where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param id the primary key of the current user tinh
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user tinh
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a user tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh[] findByUID_MH_PrevAndNext(long id, long userId,
		String maHuyen, OrderByComparator orderByComparator)
		throws NoSuchUserTinhException, SystemException {
		UserTinh userTinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserTinh[] array = new UserTinhImpl[3];

			array[0] = getByUID_MH_PrevAndNext(session, userTinh, userId,
					maHuyen, orderByComparator, true);

			array[1] = userTinh;

			array[2] = getByUID_MH_PrevAndNext(session, userTinh, userId,
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

	protected UserTinh getByUID_MH_PrevAndNext(Session session,
		UserTinh userTinh, long userId, String maHuyen,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERTINH_WHERE);

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
			query.append(UserTinhModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(userTinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserTinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user tinhs where userId = &#63; and maHuyen = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUID_MH(long userId, String maHuyen)
		throws SystemException {
		for (UserTinh userTinh : findByUID_MH(userId, maHuyen,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userTinh);
		}
	}

	/**
	 * Returns the number of user tinhs where userId = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maHuyen the ma huyen
	 * @return the number of matching user tinhs
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

			query.append(_SQL_COUNT_USERTINH_WHERE);

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

	private static final String _FINDER_COLUMN_UID_MH_USERID_2 = "userTinh.userId = ? AND ";
	private static final String _FINDER_COLUMN_UID_MH_MAHUYEN_1 = "userTinh.maHuyen IS NULL";
	private static final String _FINDER_COLUMN_UID_MH_MAHUYEN_2 = "userTinh.maHuyen = ?";
	private static final String _FINDER_COLUMN_UID_MH_MAHUYEN_3 = "(userTinh.maHuyen IS NULL OR userTinh.maHuyen = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_ = new FinderPath(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhModelImpl.FINDER_CACHE_ENABLED, UserTinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUID_",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_ = new FinderPath(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhModelImpl.FINDER_CACHE_ENABLED, UserTinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUID_",
			new String[] { Long.class.getName() },
			UserTinhModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UID_ = new FinderPath(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUID_",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the user tinhs where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching user tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTinh> findByUID_(long userId) throws SystemException {
		return findByUID_(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user tinhs where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user tinhs
	 * @param end the upper bound of the range of user tinhs (not inclusive)
	 * @return the range of matching user tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTinh> findByUID_(long userId, int start, int end)
		throws SystemException {
		return findByUID_(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user tinhs where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user tinhs
	 * @param end the upper bound of the range of user tinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTinh> findByUID_(long userId, int start, int end,
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

		List<UserTinh> list = (List<UserTinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserTinh userTinh : list) {
				if ((userId != userTinh.getUserId())) {
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

			query.append(_SQL_SELECT_USERTINH_WHERE);

			query.append(_FINDER_COLUMN_UID__USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserTinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<UserTinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserTinh>(list);
				}
				else {
					list = (List<UserTinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user tinh in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user tinh
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a matching user tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh findByUID__First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserTinhException, SystemException {
		UserTinh userTinh = fetchByUID__First(userId, orderByComparator);

		if (userTinh != null) {
			return userTinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserTinhException(msg.toString());
	}

	/**
	 * Returns the first user tinh in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user tinh, or <code>null</code> if a matching user tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh fetchByUID__First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserTinh> list = findByUID_(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user tinh in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user tinh
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a matching user tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh findByUID__Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserTinhException, SystemException {
		UserTinh userTinh = fetchByUID__Last(userId, orderByComparator);

		if (userTinh != null) {
			return userTinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserTinhException(msg.toString());
	}

	/**
	 * Returns the last user tinh in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user tinh, or <code>null</code> if a matching user tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh fetchByUID__Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUID_(userId);

		if (count == 0) {
			return null;
		}

		List<UserTinh> list = findByUID_(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user tinhs before and after the current user tinh in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current user tinh
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user tinh
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a user tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh[] findByUID__PrevAndNext(long id, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserTinhException, SystemException {
		UserTinh userTinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserTinh[] array = new UserTinhImpl[3];

			array[0] = getByUID__PrevAndNext(session, userTinh, userId,
					orderByComparator, true);

			array[1] = userTinh;

			array[2] = getByUID__PrevAndNext(session, userTinh, userId,
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

	protected UserTinh getByUID__PrevAndNext(Session session,
		UserTinh userTinh, long userId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERTINH_WHERE);

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
			query.append(UserTinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userTinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserTinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user tinhs where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUID_(long userId) throws SystemException {
		for (UserTinh userTinh : findByUID_(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(userTinh);
		}
	}

	/**
	 * Returns the number of user tinhs where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user tinhs
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

			query.append(_SQL_COUNT_USERTINH_WHERE);

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

	private static final String _FINDER_COLUMN_UID__USERID_2 = "userTinh.userId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_T_H_UID = new FinderPath(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhModelImpl.FINDER_CACHE_ENABLED, UserTinhImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByT_H_UID",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			UserTinhModelImpl.USERID_COLUMN_BITMASK |
			UserTinhModelImpl.MATINH_COLUMN_BITMASK |
			UserTinhModelImpl.MAHUYEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_H_UID = new FinderPath(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_H_UID",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns the user tinh where userId = &#63; and maTinh = &#63; and maHuyen = &#63; or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTinhException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @return the matching user tinh
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a matching user tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh findByT_H_UID(long userId, String maTinh, String maHuyen)
		throws NoSuchUserTinhException, SystemException {
		UserTinh userTinh = fetchByT_H_UID(userId, maTinh, maHuyen);

		if (userTinh == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(", maTinh=");
			msg.append(maTinh);

			msg.append(", maHuyen=");
			msg.append(maHuyen);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchUserTinhException(msg.toString());
		}

		return userTinh;
	}

	/**
	 * Returns the user tinh where userId = &#63; and maTinh = &#63; and maHuyen = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @return the matching user tinh, or <code>null</code> if a matching user tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh fetchByT_H_UID(long userId, String maTinh, String maHuyen)
		throws SystemException {
		return fetchByT_H_UID(userId, maTinh, maHuyen, true);
	}

	/**
	 * Returns the user tinh where userId = &#63; and maTinh = &#63; and maHuyen = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching user tinh, or <code>null</code> if a matching user tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh fetchByT_H_UID(long userId, String maTinh, String maHuyen,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { userId, maTinh, maHuyen };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_T_H_UID,
					finderArgs, this);
		}

		if (result instanceof UserTinh) {
			UserTinh userTinh = (UserTinh)result;

			if ((userId != userTinh.getUserId()) ||
					!Validator.equals(maTinh, userTinh.getMaTinh()) ||
					!Validator.equals(maHuyen, userTinh.getMaHuyen())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_USERTINH_WHERE);

			query.append(_FINDER_COLUMN_T_H_UID_USERID_2);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_H_UID_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_UID_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_H_UID_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_T_H_UID_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_UID_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_T_H_UID_MAHUYEN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				List<UserTinh> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_H_UID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"UserTinhPersistenceImpl.fetchByT_H_UID(long, String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					UserTinh userTinh = list.get(0);

					result = userTinh;

					cacheResult(userTinh);

					if ((userTinh.getUserId() != userId) ||
							(userTinh.getMaTinh() == null) ||
							!userTinh.getMaTinh().equals(maTinh) ||
							(userTinh.getMaHuyen() == null) ||
							!userTinh.getMaHuyen().equals(maHuyen)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_H_UID,
							finderArgs, userTinh);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_T_H_UID,
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
			return (UserTinh)result;
		}
	}

	/**
	 * Removes the user tinh where userId = &#63; and maTinh = &#63; and maHuyen = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @return the user tinh that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh removeByT_H_UID(long userId, String maTinh, String maHuyen)
		throws NoSuchUserTinhException, SystemException {
		UserTinh userTinh = findByT_H_UID(userId, maTinh, maHuyen);

		return remove(userTinh);
	}

	/**
	 * Returns the number of user tinhs where userId = &#63; and maTinh = &#63; and maHuyen = &#63;.
	 *
	 * @param userId the user ID
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @return the number of matching user tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_H_UID(long userId, String maTinh, String maHuyen)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_H_UID;

		Object[] finderArgs = new Object[] { userId, maTinh, maHuyen };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_USERTINH_WHERE);

			query.append(_FINDER_COLUMN_T_H_UID_USERID_2);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_H_UID_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_UID_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_H_UID_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_T_H_UID_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_H_UID_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_T_H_UID_MAHUYEN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

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

	private static final String _FINDER_COLUMN_T_H_UID_USERID_2 = "userTinh.userId = ? AND ";
	private static final String _FINDER_COLUMN_T_H_UID_MATINH_1 = "userTinh.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_T_H_UID_MATINH_2 = "userTinh.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_T_H_UID_MATINH_3 = "(userTinh.maTinh IS NULL OR userTinh.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_T_H_UID_MAHUYEN_1 = "userTinh.maHuyen IS NULL";
	private static final String _FINDER_COLUMN_T_H_UID_MAHUYEN_2 = "userTinh.maHuyen = ?";
	private static final String _FINDER_COLUMN_T_H_UID_MAHUYEN_3 = "(userTinh.maHuyen IS NULL OR userTinh.maHuyen = '')";

	public UserTinhPersistenceImpl() {
		setModelClass(UserTinh.class);
	}

	/**
	 * Caches the user tinh in the entity cache if it is enabled.
	 *
	 * @param userTinh the user tinh
	 */
	@Override
	public void cacheResult(UserTinh userTinh) {
		EntityCacheUtil.putResult(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhImpl.class, userTinh.getPrimaryKey(), userTinh);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_H_UID,
			new Object[] {
				userTinh.getUserId(), userTinh.getMaTinh(),
				userTinh.getMaHuyen()
			}, userTinh);

		userTinh.resetOriginalValues();
	}

	/**
	 * Caches the user tinhs in the entity cache if it is enabled.
	 *
	 * @param userTinhs the user tinhs
	 */
	@Override
	public void cacheResult(List<UserTinh> userTinhs) {
		for (UserTinh userTinh : userTinhs) {
			if (EntityCacheUtil.getResult(
						UserTinhModelImpl.ENTITY_CACHE_ENABLED,
						UserTinhImpl.class, userTinh.getPrimaryKey()) == null) {
				cacheResult(userTinh);
			}
			else {
				userTinh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user tinhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserTinhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserTinhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user tinh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserTinh userTinh) {
		EntityCacheUtil.removeResult(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhImpl.class, userTinh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(userTinh);
	}

	@Override
	public void clearCache(List<UserTinh> userTinhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserTinh userTinh : userTinhs) {
			EntityCacheUtil.removeResult(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
				UserTinhImpl.class, userTinh.getPrimaryKey());

			clearUniqueFindersCache(userTinh);
		}
	}

	protected void cacheUniqueFindersCache(UserTinh userTinh) {
		if (userTinh.isNew()) {
			Object[] args = new Object[] {
					userTinh.getUserId(), userTinh.getMaTinh(),
					userTinh.getMaHuyen()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_T_H_UID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_H_UID, args,
				userTinh);
		}
		else {
			UserTinhModelImpl userTinhModelImpl = (UserTinhModelImpl)userTinh;

			if ((userTinhModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_T_H_UID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userTinh.getUserId(), userTinh.getMaTinh(),
						userTinh.getMaHuyen()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_T_H_UID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_H_UID, args,
					userTinh);
			}
		}
	}

	protected void clearUniqueFindersCache(UserTinh userTinh) {
		UserTinhModelImpl userTinhModelImpl = (UserTinhModelImpl)userTinh;

		Object[] args = new Object[] {
				userTinh.getUserId(), userTinh.getMaTinh(),
				userTinh.getMaHuyen()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_H_UID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_T_H_UID, args);

		if ((userTinhModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_T_H_UID.getColumnBitmask()) != 0) {
			args = new Object[] {
					userTinhModelImpl.getOriginalUserId(),
					userTinhModelImpl.getOriginalMaTinh(),
					userTinhModelImpl.getOriginalMaHuyen()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_H_UID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_T_H_UID, args);
		}
	}

	/**
	 * Creates a new user tinh with the primary key. Does not add the user tinh to the database.
	 *
	 * @param id the primary key for the new user tinh
	 * @return the new user tinh
	 */
	@Override
	public UserTinh create(long id) {
		UserTinh userTinh = new UserTinhImpl();

		userTinh.setNew(true);
		userTinh.setPrimaryKey(id);

		return userTinh;
	}

	/**
	 * Removes the user tinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the user tinh
	 * @return the user tinh that was removed
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a user tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh remove(long id)
		throws NoSuchUserTinhException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the user tinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user tinh
	 * @return the user tinh that was removed
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a user tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh remove(Serializable primaryKey)
		throws NoSuchUserTinhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserTinh userTinh = (UserTinh)session.get(UserTinhImpl.class,
					primaryKey);

			if (userTinh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserTinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userTinh);
		}
		catch (NoSuchUserTinhException nsee) {
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
	protected UserTinh removeImpl(UserTinh userTinh) throws SystemException {
		userTinh = toUnwrappedModel(userTinh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userTinh)) {
				userTinh = (UserTinh)session.get(UserTinhImpl.class,
						userTinh.getPrimaryKeyObj());
			}

			if (userTinh != null) {
				session.delete(userTinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userTinh != null) {
			clearCache(userTinh);
		}

		return userTinh;
	}

	@Override
	public UserTinh updateImpl(vn.dtt.cmon.user.dao.model.UserTinh userTinh)
		throws SystemException {
		userTinh = toUnwrappedModel(userTinh);

		boolean isNew = userTinh.isNew();

		UserTinhModelImpl userTinhModelImpl = (UserTinhModelImpl)userTinh;

		Session session = null;

		try {
			session = openSession();

			if (userTinh.isNew()) {
				session.save(userTinh);

				userTinh.setNew(false);
			}
			else {
				session.merge(userTinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserTinhModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userTinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userTinhModelImpl.getOriginalUserId(),
						userTinhModelImpl.getOriginalMaHuyen()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_MH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH,
					args);

				args = new Object[] {
						userTinhModelImpl.getUserId(),
						userTinhModelImpl.getMaHuyen()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_MH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_MH,
					args);
			}

			if ((userTinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userTinhModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_,
					args);

				args = new Object[] { userTinhModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_,
					args);
			}
		}

		EntityCacheUtil.putResult(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
			UserTinhImpl.class, userTinh.getPrimaryKey(), userTinh);

		clearUniqueFindersCache(userTinh);
		cacheUniqueFindersCache(userTinh);

		return userTinh;
	}

	protected UserTinh toUnwrappedModel(UserTinh userTinh) {
		if (userTinh instanceof UserTinhImpl) {
			return userTinh;
		}

		UserTinhImpl userTinhImpl = new UserTinhImpl();

		userTinhImpl.setNew(userTinh.isNew());
		userTinhImpl.setPrimaryKey(userTinh.getPrimaryKey());

		userTinhImpl.setId(userTinh.getId());
		userTinhImpl.setMaTinh(userTinh.getMaTinh());
		userTinhImpl.setMaHuyen(userTinh.getMaHuyen());
		userTinhImpl.setName(userTinh.getName());
		userTinhImpl.setUserId(userTinh.getUserId());

		return userTinhImpl;
	}

	/**
	 * Returns the user tinh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user tinh
	 * @return the user tinh
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a user tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserTinhException, SystemException {
		UserTinh userTinh = fetchByPrimaryKey(primaryKey);

		if (userTinh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserTinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userTinh;
	}

	/**
	 * Returns the user tinh with the primary key or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserTinhException} if it could not be found.
	 *
	 * @param id the primary key of the user tinh
	 * @return the user tinh
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserTinhException if a user tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh findByPrimaryKey(long id)
		throws NoSuchUserTinhException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the user tinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user tinh
	 * @return the user tinh, or <code>null</code> if a user tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserTinh userTinh = (UserTinh)EntityCacheUtil.getResult(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
				UserTinhImpl.class, primaryKey);

		if (userTinh == _nullUserTinh) {
			return null;
		}

		if (userTinh == null) {
			Session session = null;

			try {
				session = openSession();

				userTinh = (UserTinh)session.get(UserTinhImpl.class, primaryKey);

				if (userTinh != null) {
					cacheResult(userTinh);
				}
				else {
					EntityCacheUtil.putResult(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
						UserTinhImpl.class, primaryKey, _nullUserTinh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserTinhModelImpl.ENTITY_CACHE_ENABLED,
					UserTinhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userTinh;
	}

	/**
	 * Returns the user tinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the user tinh
	 * @return the user tinh, or <code>null</code> if a user tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserTinh fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the user tinhs.
	 *
	 * @return the user tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTinh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user tinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user tinhs
	 * @param end the upper bound of the range of user tinhs (not inclusive)
	 * @return the range of user tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTinh> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user tinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user tinhs
	 * @param end the upper bound of the range of user tinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserTinh> findAll(int start, int end,
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

		List<UserTinh> list = (List<UserTinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERTINH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERTINH;

				if (pagination) {
					sql = sql.concat(UserTinhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserTinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserTinh>(list);
				}
				else {
					list = (List<UserTinh>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user tinhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserTinh userTinh : findAll()) {
			remove(userTinh);
		}
	}

	/**
	 * Returns the number of user tinhs.
	 *
	 * @return the number of user tinhs
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

				Query q = session.createQuery(_SQL_COUNT_USERTINH);

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
	 * Initializes the user tinh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.cmon.user.dao.model.UserTinh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserTinh>> listenersList = new ArrayList<ModelListener<UserTinh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserTinh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserTinhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERTINH = "SELECT userTinh FROM UserTinh userTinh";
	private static final String _SQL_SELECT_USERTINH_WHERE = "SELECT userTinh FROM UserTinh userTinh WHERE ";
	private static final String _SQL_COUNT_USERTINH = "SELECT COUNT(userTinh) FROM UserTinh userTinh";
	private static final String _SQL_COUNT_USERTINH_WHERE = "SELECT COUNT(userTinh) FROM UserTinh userTinh WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userTinh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserTinh exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserTinh exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserTinhPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maTinh", "maHuyen", "name", "userId"
			});
	private static UserTinh _nullUserTinh = new UserTinhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserTinh> toCacheModel() {
				return _nullUserTinhCacheModel;
			}
		};

	private static CacheModel<UserTinh> _nullUserTinhCacheModel = new CacheModel<UserTinh>() {
			@Override
			public UserTinh toEntityModel() {
				return _nullUserTinh;
			}
		};
}