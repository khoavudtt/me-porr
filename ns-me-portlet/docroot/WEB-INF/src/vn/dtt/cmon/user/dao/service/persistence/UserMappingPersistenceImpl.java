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

import vn.dtt.cmon.user.dao.NoSuchUserMappingException;
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.cmon.user.dao.model.impl.UserMappingImpl;
import vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the user mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see UserMappingPersistence
 * @see UserMappingUtil
 * @generated
 */
public class UserMappingPersistenceImpl extends BasePersistenceImpl<UserMapping>
	implements UserMappingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserMappingUtil} to access the user mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserMappingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_O_C_1 = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByO_C_1",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1 = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByO_C_1",
			new String[] { String.class.getName() },
			UserMappingModelImpl.ORGCODE1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_O_C_1 = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByO_C_1",
			new String[] { String.class.getName() });

	/**
	 * Returns all the user mappings where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @return the matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByO_C_1(String orgCode1)
		throws SystemException {
		return findByO_C_1(orgCode1, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user mappings where orgCode1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode1 the org code1
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByO_C_1(String orgCode1, int start, int end)
		throws SystemException {
		return findByO_C_1(orgCode1, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user mappings where orgCode1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode1 the org code1
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByO_C_1(String orgCode1, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1;
			finderArgs = new Object[] { orgCode1 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_O_C_1;
			finderArgs = new Object[] { orgCode1, start, end, orderByComparator };
		}

		List<UserMapping> list = (List<UserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserMapping userMapping : list) {
				if (!Validator.equals(orgCode1, userMapping.getOrgCode1())) {
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

			query.append(_SQL_SELECT_USERMAPPING_WHERE);

			boolean bindOrgCode1 = false;

			if (orgCode1 == null) {
				query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_1);
			}
			else if (orgCode1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_3);
			}
			else {
				bindOrgCode1 = true;

				query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrgCode1) {
					qPos.add(orgCode1);
				}

				if (!pagination) {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserMapping>(list);
				}
				else {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user mapping in the ordered set where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByO_C_1_First(String orgCode1,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByO_C_1_First(orgCode1, orderByComparator);

		if (userMapping != null) {
			return userMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgCode1=");
		msg.append(orgCode1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMappingException(msg.toString());
	}

	/**
	 * Returns the first user mapping in the ordered set where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByO_C_1_First(String orgCode1,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserMapping> list = findByO_C_1(orgCode1, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user mapping in the ordered set where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByO_C_1_Last(String orgCode1,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByO_C_1_Last(orgCode1, orderByComparator);

		if (userMapping != null) {
			return userMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgCode1=");
		msg.append(orgCode1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMappingException(msg.toString());
	}

	/**
	 * Returns the last user mapping in the ordered set where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByO_C_1_Last(String orgCode1,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByO_C_1(orgCode1);

		if (count == 0) {
			return null;
		}

		List<UserMapping> list = findByO_C_1(orgCode1, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user mappings before and after the current user mapping in the ordered set where orgCode1 = &#63;.
	 *
	 * @param id the primary key of the current user mapping
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping[] findByO_C_1_PrevAndNext(long id, String orgCode1,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserMapping[] array = new UserMappingImpl[3];

			array[0] = getByO_C_1_PrevAndNext(session, userMapping, orgCode1,
					orderByComparator, true);

			array[1] = userMapping;

			array[2] = getByO_C_1_PrevAndNext(session, userMapping, orgCode1,
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

	protected UserMapping getByO_C_1_PrevAndNext(Session session,
		UserMapping userMapping, String orgCode1,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERMAPPING_WHERE);

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_1);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_3);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_2);
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
			query.append(UserMappingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindOrgCode1) {
			qPos.add(orgCode1);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the user mappings that the user has permission to view where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @return the matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByO_C_1(String orgCode1)
		throws SystemException {
		return filterFindByO_C_1(orgCode1, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user mappings that the user has permission to view where orgCode1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode1 the org code1
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByO_C_1(String orgCode1, int start,
		int end) throws SystemException {
		return filterFindByO_C_1(orgCode1, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user mappings that the user has permissions to view where orgCode1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode1 the org code1
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByO_C_1(String orgCode1, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByO_C_1(orgCode1, start, end, orderByComparator);
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
			query.append(_FILTER_SQL_SELECT_USERMAPPING_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_1_SQL);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_3_SQL);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(UserMappingModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, UserMappingImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, UserMappingImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindOrgCode1) {
				qPos.add(orgCode1);
			}

			return (List<UserMapping>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where orgCode1 = &#63;.
	 *
	 * @param id the primary key of the current user mapping
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping[] filterFindByO_C_1_PrevAndNext(long id,
		String orgCode1, OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByO_C_1_PrevAndNext(id, orgCode1, orderByComparator);
		}

		UserMapping userMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserMapping[] array = new UserMappingImpl[3];

			array[0] = filterGetByO_C_1_PrevAndNext(session, userMapping,
					orgCode1, orderByComparator, true);

			array[1] = userMapping;

			array[2] = filterGetByO_C_1_PrevAndNext(session, userMapping,
					orgCode1, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserMapping filterGetByO_C_1_PrevAndNext(Session session,
		UserMapping userMapping, String orgCode1,
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
			query.append(_FILTER_SQL_SELECT_USERMAPPING_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_1_SQL);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_3_SQL);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(UserMappingModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, UserMappingImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, UserMappingImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindOrgCode1) {
			qPos.add(orgCode1);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user mappings where orgCode1 = &#63; from the database.
	 *
	 * @param orgCode1 the org code1
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByO_C_1(String orgCode1) throws SystemException {
		for (UserMapping userMapping : findByO_C_1(orgCode1, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(userMapping);
		}
	}

	/**
	 * Returns the number of user mappings where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @return the number of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByO_C_1(String orgCode1) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_O_C_1;

		Object[] finderArgs = new Object[] { orgCode1 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERMAPPING_WHERE);

			boolean bindOrgCode1 = false;

			if (orgCode1 == null) {
				query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_1);
			}
			else if (orgCode1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_3);
			}
			else {
				bindOrgCode1 = true;

				query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrgCode1) {
					qPos.add(orgCode1);
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
	 * Returns the number of user mappings that the user has permission to view where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @return the number of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByO_C_1(String orgCode1) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByO_C_1(orgCode1);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_USERMAPPING_WHERE);

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_1_SQL);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_3_SQL);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_O_C_1_ORGCODE1_2_SQL);
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindOrgCode1) {
				qPos.add(orgCode1);
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

	private static final String _FINDER_COLUMN_O_C_1_ORGCODE1_1 = "userMapping.orgCode1 IS NULL";
	private static final String _FINDER_COLUMN_O_C_1_ORGCODE1_2 = "userMapping.orgCode1 = ?";
	private static final String _FINDER_COLUMN_O_C_1_ORGCODE1_3 = "(userMapping.orgCode1 IS NULL OR userMapping.orgCode1 = '')";
	private static final String _FINDER_COLUMN_O_C_1_ORGCODE1_1_SQL = "userMapping.ORGCODE1 IS NULL";
	private static final String _FINDER_COLUMN_O_C_1_ORGCODE1_2_SQL = "userMapping.ORGCODE1 = ?";
	private static final String _FINDER_COLUMN_O_C_1_ORGCODE1_3_SQL = "(userMapping.ORGCODE1 IS NULL OR userMapping.ORGCODE1 = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_O_C_1_O_C_2 =
		new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByO_C_1_O_C_2",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1_O_C_2 =
		new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByO_C_1_O_C_2",
			new String[] { String.class.getName(), String.class.getName() },
			UserMappingModelImpl.ORGCODE1_COLUMN_BITMASK |
			UserMappingModelImpl.ORGCODE2_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_O_C_1_O_C_2 = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByO_C_1_O_C_2",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the user mappings where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @return the matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByO_C_1_O_C_2(String orgCode1, String orgCode2)
		throws SystemException {
		return findByO_C_1_O_C_2(orgCode1, orgCode2, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user mappings where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByO_C_1_O_C_2(String orgCode1,
		String orgCode2, int start, int end) throws SystemException {
		return findByO_C_1_O_C_2(orgCode1, orgCode2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user mappings where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByO_C_1_O_C_2(String orgCode1,
		String orgCode2, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1_O_C_2;
			finderArgs = new Object[] { orgCode1, orgCode2 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_O_C_1_O_C_2;
			finderArgs = new Object[] {
					orgCode1, orgCode2,
					
					start, end, orderByComparator
				};
		}

		List<UserMapping> list = (List<UserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserMapping userMapping : list) {
				if (!Validator.equals(orgCode1, userMapping.getOrgCode1()) ||
						!Validator.equals(orgCode2, userMapping.getOrgCode2())) {
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

			query.append(_SQL_SELECT_USERMAPPING_WHERE);

			boolean bindOrgCode1 = false;

			if (orgCode1 == null) {
				query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_1);
			}
			else if (orgCode1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_3);
			}
			else {
				bindOrgCode1 = true;

				query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_2);
			}

			boolean bindOrgCode2 = false;

			if (orgCode2 == null) {
				query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_1);
			}
			else if (orgCode2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_3);
			}
			else {
				bindOrgCode2 = true;

				query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrgCode1) {
					qPos.add(orgCode1);
				}

				if (bindOrgCode2) {
					qPos.add(orgCode2);
				}

				if (!pagination) {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserMapping>(list);
				}
				else {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByO_C_1_O_C_2_First(String orgCode1,
		String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByO_C_1_O_C_2_First(orgCode1, orgCode2,
				orderByComparator);

		if (userMapping != null) {
			return userMapping;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgCode1=");
		msg.append(orgCode1);

		msg.append(", orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMappingException(msg.toString());
	}

	/**
	 * Returns the first user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByO_C_1_O_C_2_First(String orgCode1,
		String orgCode2, OrderByComparator orderByComparator)
		throws SystemException {
		List<UserMapping> list = findByO_C_1_O_C_2(orgCode1, orgCode2, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByO_C_1_O_C_2_Last(String orgCode1, String orgCode2,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByO_C_1_O_C_2_Last(orgCode1, orgCode2,
				orderByComparator);

		if (userMapping != null) {
			return userMapping;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgCode1=");
		msg.append(orgCode1);

		msg.append(", orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMappingException(msg.toString());
	}

	/**
	 * Returns the last user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByO_C_1_O_C_2_Last(String orgCode1,
		String orgCode2, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByO_C_1_O_C_2(orgCode1, orgCode2);

		if (count == 0) {
			return null;
		}

		List<UserMapping> list = findByO_C_1_O_C_2(orgCode1, orgCode2,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user mappings before and after the current user mapping in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param id the primary key of the current user mapping
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping[] findByO_C_1_O_C_2_PrevAndNext(long id,
		String orgCode1, String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserMapping[] array = new UserMappingImpl[3];

			array[0] = getByO_C_1_O_C_2_PrevAndNext(session, userMapping,
					orgCode1, orgCode2, orderByComparator, true);

			array[1] = userMapping;

			array[2] = getByO_C_1_O_C_2_PrevAndNext(session, userMapping,
					orgCode1, orgCode2, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserMapping getByO_C_1_O_C_2_PrevAndNext(Session session,
		UserMapping userMapping, String orgCode1, String orgCode2,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERMAPPING_WHERE);

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_1);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_3);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_2);
		}

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_1);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_3);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_2);
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
			query.append(UserMappingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindOrgCode1) {
			qPos.add(orgCode1);
		}

		if (bindOrgCode2) {
			qPos.add(orgCode2);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the user mappings that the user has permission to view where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @return the matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByO_C_1_O_C_2(String orgCode1,
		String orgCode2) throws SystemException {
		return filterFindByO_C_1_O_C_2(orgCode1, orgCode2, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user mappings that the user has permission to view where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByO_C_1_O_C_2(String orgCode1,
		String orgCode2, int start, int end) throws SystemException {
		return filterFindByO_C_1_O_C_2(orgCode1, orgCode2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user mappings that the user has permissions to view where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByO_C_1_O_C_2(String orgCode1,
		String orgCode2, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByO_C_1_O_C_2(orgCode1, orgCode2, start, end,
				orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_1_SQL);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_3_SQL);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_2_SQL);
		}

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_1_SQL);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_3_SQL);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(UserMappingModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, UserMappingImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, UserMappingImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindOrgCode1) {
				qPos.add(orgCode1);
			}

			if (bindOrgCode2) {
				qPos.add(orgCode2);
			}

			return (List<UserMapping>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param id the primary key of the current user mapping
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping[] filterFindByO_C_1_O_C_2_PrevAndNext(long id,
		String orgCode1, String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByO_C_1_O_C_2_PrevAndNext(id, orgCode1, orgCode2,
				orderByComparator);
		}

		UserMapping userMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserMapping[] array = new UserMappingImpl[3];

			array[0] = filterGetByO_C_1_O_C_2_PrevAndNext(session, userMapping,
					orgCode1, orgCode2, orderByComparator, true);

			array[1] = userMapping;

			array[2] = filterGetByO_C_1_O_C_2_PrevAndNext(session, userMapping,
					orgCode1, orgCode2, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserMapping filterGetByO_C_1_O_C_2_PrevAndNext(Session session,
		UserMapping userMapping, String orgCode1, String orgCode2,
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
			query.append(_FILTER_SQL_SELECT_USERMAPPING_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_1_SQL);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_3_SQL);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_2_SQL);
		}

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_1_SQL);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_3_SQL);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(UserMappingModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, UserMappingImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, UserMappingImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindOrgCode1) {
			qPos.add(orgCode1);
		}

		if (bindOrgCode2) {
			qPos.add(orgCode2);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user mappings where orgCode1 = &#63; and orgCode2 = &#63; from the database.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByO_C_1_O_C_2(String orgCode1, String orgCode2)
		throws SystemException {
		for (UserMapping userMapping : findByO_C_1_O_C_2(orgCode1, orgCode2,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userMapping);
		}
	}

	/**
	 * Returns the number of user mappings where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @return the number of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByO_C_1_O_C_2(String orgCode1, String orgCode2)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_O_C_1_O_C_2;

		Object[] finderArgs = new Object[] { orgCode1, orgCode2 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USERMAPPING_WHERE);

			boolean bindOrgCode1 = false;

			if (orgCode1 == null) {
				query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_1);
			}
			else if (orgCode1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_3);
			}
			else {
				bindOrgCode1 = true;

				query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_2);
			}

			boolean bindOrgCode2 = false;

			if (orgCode2 == null) {
				query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_1);
			}
			else if (orgCode2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_3);
			}
			else {
				bindOrgCode2 = true;

				query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrgCode1) {
					qPos.add(orgCode1);
				}

				if (bindOrgCode2) {
					qPos.add(orgCode2);
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
	 * Returns the number of user mappings that the user has permission to view where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @return the number of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByO_C_1_O_C_2(String orgCode1, String orgCode2)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByO_C_1_O_C_2(orgCode1, orgCode2);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_USERMAPPING_WHERE);

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_1_SQL);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_3_SQL);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_2_SQL);
		}

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_1_SQL);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_3_SQL);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_2_SQL);
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindOrgCode1) {
				qPos.add(orgCode1);
			}

			if (bindOrgCode2) {
				qPos.add(orgCode2);
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

	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_1 = "userMapping.orgCode1 IS NULL AND ";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_2 = "userMapping.orgCode1 = ? AND ";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_3 = "(userMapping.orgCode1 IS NULL OR userMapping.orgCode1 = '') AND ";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_1_SQL = "userMapping.ORGCODE1 IS NULL AND ";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_2_SQL = "userMapping.ORGCODE1 = ? AND ";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_3_SQL = "(userMapping.ORGCODE1 IS NULL OR userMapping.ORGCODE1 = '') AND ";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_1 = "userMapping.orgCode2 IS NULL";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_2 = "userMapping.orgCode2 = ?";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_3 = "(userMapping.orgCode2 IS NULL OR userMapping.orgCode2 = '')";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_1_SQL = "userMapping.ORGCODE2 IS NULL";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_2_SQL = "userMapping.ORGCODE2 = ?";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_3_SQL = "(userMapping.ORGCODE2 IS NULL OR userMapping.ORGCODE2 = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_O_C_2 = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByO_C_2",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_2 = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByO_C_2",
			new String[] { String.class.getName() },
			UserMappingModelImpl.ORGCODE2_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_O_C_2 = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByO_C_2",
			new String[] { String.class.getName() });

	/**
	 * Returns all the user mappings where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @return the matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByO_C_2(String orgCode2)
		throws SystemException {
		return findByO_C_2(orgCode2, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user mappings where orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByO_C_2(String orgCode2, int start, int end)
		throws SystemException {
		return findByO_C_2(orgCode2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user mappings where orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByO_C_2(String orgCode2, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_2;
			finderArgs = new Object[] { orgCode2 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_O_C_2;
			finderArgs = new Object[] { orgCode2, start, end, orderByComparator };
		}

		List<UserMapping> list = (List<UserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserMapping userMapping : list) {
				if (!Validator.equals(orgCode2, userMapping.getOrgCode2())) {
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

			query.append(_SQL_SELECT_USERMAPPING_WHERE);

			boolean bindOrgCode2 = false;

			if (orgCode2 == null) {
				query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_1);
			}
			else if (orgCode2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_3);
			}
			else {
				bindOrgCode2 = true;

				query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrgCode2) {
					qPos.add(orgCode2);
				}

				if (!pagination) {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserMapping>(list);
				}
				else {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user mapping in the ordered set where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByO_C_2_First(String orgCode2,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByO_C_2_First(orgCode2, orderByComparator);

		if (userMapping != null) {
			return userMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMappingException(msg.toString());
	}

	/**
	 * Returns the first user mapping in the ordered set where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByO_C_2_First(String orgCode2,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserMapping> list = findByO_C_2(orgCode2, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user mapping in the ordered set where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByO_C_2_Last(String orgCode2,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByO_C_2_Last(orgCode2, orderByComparator);

		if (userMapping != null) {
			return userMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMappingException(msg.toString());
	}

	/**
	 * Returns the last user mapping in the ordered set where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByO_C_2_Last(String orgCode2,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByO_C_2(orgCode2);

		if (count == 0) {
			return null;
		}

		List<UserMapping> list = findByO_C_2(orgCode2, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user mappings before and after the current user mapping in the ordered set where orgCode2 = &#63;.
	 *
	 * @param id the primary key of the current user mapping
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping[] findByO_C_2_PrevAndNext(long id, String orgCode2,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserMapping[] array = new UserMappingImpl[3];

			array[0] = getByO_C_2_PrevAndNext(session, userMapping, orgCode2,
					orderByComparator, true);

			array[1] = userMapping;

			array[2] = getByO_C_2_PrevAndNext(session, userMapping, orgCode2,
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

	protected UserMapping getByO_C_2_PrevAndNext(Session session,
		UserMapping userMapping, String orgCode2,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERMAPPING_WHERE);

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_1);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_3);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_2);
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
			query.append(UserMappingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindOrgCode2) {
			qPos.add(orgCode2);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the user mappings that the user has permission to view where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @return the matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByO_C_2(String orgCode2)
		throws SystemException {
		return filterFindByO_C_2(orgCode2, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user mappings that the user has permission to view where orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByO_C_2(String orgCode2, int start,
		int end) throws SystemException {
		return filterFindByO_C_2(orgCode2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user mappings that the user has permissions to view where orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByO_C_2(String orgCode2, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByO_C_2(orgCode2, start, end, orderByComparator);
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
			query.append(_FILTER_SQL_SELECT_USERMAPPING_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_1_SQL);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_3_SQL);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(UserMappingModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, UserMappingImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, UserMappingImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindOrgCode2) {
				qPos.add(orgCode2);
			}

			return (List<UserMapping>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where orgCode2 = &#63;.
	 *
	 * @param id the primary key of the current user mapping
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping[] filterFindByO_C_2_PrevAndNext(long id,
		String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByO_C_2_PrevAndNext(id, orgCode2, orderByComparator);
		}

		UserMapping userMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserMapping[] array = new UserMappingImpl[3];

			array[0] = filterGetByO_C_2_PrevAndNext(session, userMapping,
					orgCode2, orderByComparator, true);

			array[1] = userMapping;

			array[2] = filterGetByO_C_2_PrevAndNext(session, userMapping,
					orgCode2, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserMapping filterGetByO_C_2_PrevAndNext(Session session,
		UserMapping userMapping, String orgCode2,
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
			query.append(_FILTER_SQL_SELECT_USERMAPPING_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_1_SQL);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_3_SQL);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(UserMappingModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, UserMappingImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, UserMappingImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindOrgCode2) {
			qPos.add(orgCode2);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user mappings where orgCode2 = &#63; from the database.
	 *
	 * @param orgCode2 the org code2
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByO_C_2(String orgCode2) throws SystemException {
		for (UserMapping userMapping : findByO_C_2(orgCode2, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(userMapping);
		}
	}

	/**
	 * Returns the number of user mappings where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @return the number of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByO_C_2(String orgCode2) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_O_C_2;

		Object[] finderArgs = new Object[] { orgCode2 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERMAPPING_WHERE);

			boolean bindOrgCode2 = false;

			if (orgCode2 == null) {
				query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_1);
			}
			else if (orgCode2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_3);
			}
			else {
				bindOrgCode2 = true;

				query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrgCode2) {
					qPos.add(orgCode2);
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
	 * Returns the number of user mappings that the user has permission to view where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @return the number of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByO_C_2(String orgCode2) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByO_C_2(orgCode2);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_USERMAPPING_WHERE);

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_1_SQL);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_3_SQL);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_O_C_2_ORGCODE2_2_SQL);
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindOrgCode2) {
				qPos.add(orgCode2);
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

	private static final String _FINDER_COLUMN_O_C_2_ORGCODE2_1 = "userMapping.orgCode2 IS NULL";
	private static final String _FINDER_COLUMN_O_C_2_ORGCODE2_2 = "userMapping.orgCode2 = ?";
	private static final String _FINDER_COLUMN_O_C_2_ORGCODE2_3 = "(userMapping.orgCode2 IS NULL OR userMapping.orgCode2 = '')";
	private static final String _FINDER_COLUMN_O_C_2_ORGCODE2_1_SQL = "userMapping.ORGCODE2 IS NULL";
	private static final String _FINDER_COLUMN_O_C_2_ORGCODE2_2_SQL = "userMapping.ORGCODE2 = ?";
	private static final String _FINDER_COLUMN_O_C_2_ORGCODE2_3_SQL = "(userMapping.ORGCODE2 IS NULL OR userMapping.ORGCODE2 = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_O_C_1 = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByT_O_C_1",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_O_C_1 =
		new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_O_C_1",
			new String[] { Integer.class.getName(), String.class.getName() },
			UserMappingModelImpl.USERTYPE_COLUMN_BITMASK |
			UserMappingModelImpl.ORGCODE1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_O_C_1 = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_O_C_1",
			new String[] { Integer.class.getName(), String.class.getName() });

	/**
	 * Returns all the user mappings where userType = &#63; and orgCode1 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @return the matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByT_O_C_1(int userType, String orgCode1)
		throws SystemException {
		return findByT_O_C_1(userType, orgCode1, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user mappings where userType = &#63; and orgCode1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByT_O_C_1(int userType, String orgCode1,
		int start, int end) throws SystemException {
		return findByT_O_C_1(userType, orgCode1, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user mappings where userType = &#63; and orgCode1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByT_O_C_1(int userType, String orgCode1,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_O_C_1;
			finderArgs = new Object[] { userType, orgCode1 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_O_C_1;
			finderArgs = new Object[] {
					userType, orgCode1,
					
					start, end, orderByComparator
				};
		}

		List<UserMapping> list = (List<UserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserMapping userMapping : list) {
				if ((userType != userMapping.getUserType()) ||
						!Validator.equals(orgCode1, userMapping.getOrgCode1())) {
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

			query.append(_SQL_SELECT_USERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_T_O_C_1_USERTYPE_2);

			boolean bindOrgCode1 = false;

			if (orgCode1 == null) {
				query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_1);
			}
			else if (orgCode1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_3);
			}
			else {
				bindOrgCode1 = true;

				query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userType);

				if (bindOrgCode1) {
					qPos.add(orgCode1);
				}

				if (!pagination) {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserMapping>(list);
				}
				else {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByT_O_C_1_First(int userType, String orgCode1,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByT_O_C_1_First(userType, orgCode1,
				orderByComparator);

		if (userMapping != null) {
			return userMapping;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userType=");
		msg.append(userType);

		msg.append(", orgCode1=");
		msg.append(orgCode1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMappingException(msg.toString());
	}

	/**
	 * Returns the first user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByT_O_C_1_First(int userType, String orgCode1,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserMapping> list = findByT_O_C_1(userType, orgCode1, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByT_O_C_1_Last(int userType, String orgCode1,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByT_O_C_1_Last(userType, orgCode1,
				orderByComparator);

		if (userMapping != null) {
			return userMapping;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userType=");
		msg.append(userType);

		msg.append(", orgCode1=");
		msg.append(orgCode1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMappingException(msg.toString());
	}

	/**
	 * Returns the last user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByT_O_C_1_Last(int userType, String orgCode1,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByT_O_C_1(userType, orgCode1);

		if (count == 0) {
			return null;
		}

		List<UserMapping> list = findByT_O_C_1(userType, orgCode1, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user mappings before and after the current user mapping in the ordered set where userType = &#63; and orgCode1 = &#63;.
	 *
	 * @param id the primary key of the current user mapping
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping[] findByT_O_C_1_PrevAndNext(long id, int userType,
		String orgCode1, OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserMapping[] array = new UserMappingImpl[3];

			array[0] = getByT_O_C_1_PrevAndNext(session, userMapping, userType,
					orgCode1, orderByComparator, true);

			array[1] = userMapping;

			array[2] = getByT_O_C_1_PrevAndNext(session, userMapping, userType,
					orgCode1, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserMapping getByT_O_C_1_PrevAndNext(Session session,
		UserMapping userMapping, int userType, String orgCode1,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_T_O_C_1_USERTYPE_2);

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_1);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_3);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_2);
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
			query.append(UserMappingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userType);

		if (bindOrgCode1) {
			qPos.add(orgCode1);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @return the matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByT_O_C_1(int userType, String orgCode1)
		throws SystemException {
		return filterFindByT_O_C_1(userType, orgCode1, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByT_O_C_1(int userType, String orgCode1,
		int start, int end) throws SystemException {
		return filterFindByT_O_C_1(userType, orgCode1, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user mappings that the user has permissions to view where userType = &#63; and orgCode1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByT_O_C_1(int userType, String orgCode1,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByT_O_C_1(userType, orgCode1, start, end,
				orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_T_O_C_1_USERTYPE_2_SQL);

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_1_SQL);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_3_SQL);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(UserMappingModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, UserMappingImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, UserMappingImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userType);

			if (bindOrgCode1) {
				qPos.add(orgCode1);
			}

			return (List<UserMapping>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63;.
	 *
	 * @param id the primary key of the current user mapping
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping[] filterFindByT_O_C_1_PrevAndNext(long id, int userType,
		String orgCode1, OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByT_O_C_1_PrevAndNext(id, userType, orgCode1,
				orderByComparator);
		}

		UserMapping userMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserMapping[] array = new UserMappingImpl[3];

			array[0] = filterGetByT_O_C_1_PrevAndNext(session, userMapping,
					userType, orgCode1, orderByComparator, true);

			array[1] = userMapping;

			array[2] = filterGetByT_O_C_1_PrevAndNext(session, userMapping,
					userType, orgCode1, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserMapping filterGetByT_O_C_1_PrevAndNext(Session session,
		UserMapping userMapping, int userType, String orgCode1,
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
			query.append(_FILTER_SQL_SELECT_USERMAPPING_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_T_O_C_1_USERTYPE_2_SQL);

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_1_SQL);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_3_SQL);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(UserMappingModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, UserMappingImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, UserMappingImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userType);

		if (bindOrgCode1) {
			qPos.add(orgCode1);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user mappings where userType = &#63; and orgCode1 = &#63; from the database.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_O_C_1(int userType, String orgCode1)
		throws SystemException {
		for (UserMapping userMapping : findByT_O_C_1(userType, orgCode1,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userMapping);
		}
	}

	/**
	 * Returns the number of user mappings where userType = &#63; and orgCode1 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @return the number of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_O_C_1(int userType, String orgCode1)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_O_C_1;

		Object[] finderArgs = new Object[] { userType, orgCode1 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_T_O_C_1_USERTYPE_2);

			boolean bindOrgCode1 = false;

			if (orgCode1 == null) {
				query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_1);
			}
			else if (orgCode1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_3);
			}
			else {
				bindOrgCode1 = true;

				query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userType);

				if (bindOrgCode1) {
					qPos.add(orgCode1);
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
	 * Returns the number of user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @return the number of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByT_O_C_1(int userType, String orgCode1)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByT_O_C_1(userType, orgCode1);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_USERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_T_O_C_1_USERTYPE_2_SQL);

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_1_SQL);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_3_SQL);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_T_O_C_1_ORGCODE1_2_SQL);
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userType);

			if (bindOrgCode1) {
				qPos.add(orgCode1);
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

	private static final String _FINDER_COLUMN_T_O_C_1_USERTYPE_2 = "userMapping.userType = ? AND ";
	private static final String _FINDER_COLUMN_T_O_C_1_USERTYPE_2_SQL = "userMapping.USERTYPE = ? AND ";
	private static final String _FINDER_COLUMN_T_O_C_1_ORGCODE1_1 = "userMapping.orgCode1 IS NULL";
	private static final String _FINDER_COLUMN_T_O_C_1_ORGCODE1_2 = "userMapping.orgCode1 = ?";
	private static final String _FINDER_COLUMN_T_O_C_1_ORGCODE1_3 = "(userMapping.orgCode1 IS NULL OR userMapping.orgCode1 = '')";
	private static final String _FINDER_COLUMN_T_O_C_1_ORGCODE1_1_SQL = "userMapping.ORGCODE1 IS NULL";
	private static final String _FINDER_COLUMN_T_O_C_1_ORGCODE1_2_SQL = "userMapping.ORGCODE1 = ?";
	private static final String _FINDER_COLUMN_T_O_C_1_ORGCODE1_3_SQL = "(userMapping.ORGCODE1 IS NULL OR userMapping.ORGCODE1 = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_O_C_2 = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByT_O_C_2",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_O_C_2 =
		new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_O_C_2",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				String.class.getName()
			},
			UserMappingModelImpl.USERTYPE_COLUMN_BITMASK |
			UserMappingModelImpl.ORGCODE1_COLUMN_BITMASK |
			UserMappingModelImpl.ORGCODE2_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_O_C_2 = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_O_C_2",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @return the matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByT_O_C_2(int userType, String orgCode1,
		String orgCode2) throws SystemException {
		return findByT_O_C_2(userType, orgCode1, orgCode2, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByT_O_C_2(int userType, String orgCode1,
		String orgCode2, int start, int end) throws SystemException {
		return findByT_O_C_2(userType, orgCode1, orgCode2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByT_O_C_2(int userType, String orgCode1,
		String orgCode2, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_O_C_2;
			finderArgs = new Object[] { userType, orgCode1, orgCode2 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_O_C_2;
			finderArgs = new Object[] {
					userType, orgCode1, orgCode2,
					
					start, end, orderByComparator
				};
		}

		List<UserMapping> list = (List<UserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserMapping userMapping : list) {
				if ((userType != userMapping.getUserType()) ||
						!Validator.equals(orgCode1, userMapping.getOrgCode1()) ||
						!Validator.equals(orgCode2, userMapping.getOrgCode2())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_USERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_T_O_C_2_USERTYPE_2);

			boolean bindOrgCode1 = false;

			if (orgCode1 == null) {
				query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_1);
			}
			else if (orgCode1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_3);
			}
			else {
				bindOrgCode1 = true;

				query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_2);
			}

			boolean bindOrgCode2 = false;

			if (orgCode2 == null) {
				query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_1);
			}
			else if (orgCode2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_3);
			}
			else {
				bindOrgCode2 = true;

				query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userType);

				if (bindOrgCode1) {
					qPos.add(orgCode1);
				}

				if (bindOrgCode2) {
					qPos.add(orgCode2);
				}

				if (!pagination) {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserMapping>(list);
				}
				else {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByT_O_C_2_First(int userType, String orgCode1,
		String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByT_O_C_2_First(userType, orgCode1,
				orgCode2, orderByComparator);

		if (userMapping != null) {
			return userMapping;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userType=");
		msg.append(userType);

		msg.append(", orgCode1=");
		msg.append(orgCode1);

		msg.append(", orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMappingException(msg.toString());
	}

	/**
	 * Returns the first user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByT_O_C_2_First(int userType, String orgCode1,
		String orgCode2, OrderByComparator orderByComparator)
		throws SystemException {
		List<UserMapping> list = findByT_O_C_2(userType, orgCode1, orgCode2, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByT_O_C_2_Last(int userType, String orgCode1,
		String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByT_O_C_2_Last(userType, orgCode1,
				orgCode2, orderByComparator);

		if (userMapping != null) {
			return userMapping;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userType=");
		msg.append(userType);

		msg.append(", orgCode1=");
		msg.append(orgCode1);

		msg.append(", orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMappingException(msg.toString());
	}

	/**
	 * Returns the last user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByT_O_C_2_Last(int userType, String orgCode1,
		String orgCode2, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByT_O_C_2(userType, orgCode1, orgCode2);

		if (count == 0) {
			return null;
		}

		List<UserMapping> list = findByT_O_C_2(userType, orgCode1, orgCode2,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user mappings before and after the current user mapping in the ordered set where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param id the primary key of the current user mapping
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping[] findByT_O_C_2_PrevAndNext(long id, int userType,
		String orgCode1, String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserMapping[] array = new UserMappingImpl[3];

			array[0] = getByT_O_C_2_PrevAndNext(session, userMapping, userType,
					orgCode1, orgCode2, orderByComparator, true);

			array[1] = userMapping;

			array[2] = getByT_O_C_2_PrevAndNext(session, userMapping, userType,
					orgCode1, orgCode2, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserMapping getByT_O_C_2_PrevAndNext(Session session,
		UserMapping userMapping, int userType, String orgCode1,
		String orgCode2, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_T_O_C_2_USERTYPE_2);

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_1);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_3);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_2);
		}

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_1);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_3);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_2);
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
			query.append(UserMappingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userType);

		if (bindOrgCode1) {
			qPos.add(orgCode1);
		}

		if (bindOrgCode2) {
			qPos.add(orgCode2);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @return the matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByT_O_C_2(int userType, String orgCode1,
		String orgCode2) throws SystemException {
		return filterFindByT_O_C_2(userType, orgCode1, orgCode2,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByT_O_C_2(int userType, String orgCode1,
		String orgCode2, int start, int end) throws SystemException {
		return filterFindByT_O_C_2(userType, orgCode1, orgCode2, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the user mappings that the user has permissions to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByT_O_C_2(int userType, String orgCode1,
		String orgCode2, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByT_O_C_2(userType, orgCode1, orgCode2, start, end,
				orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_T_O_C_2_USERTYPE_2_SQL);

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_1_SQL);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_3_SQL);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_2_SQL);
		}

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_1_SQL);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_3_SQL);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(UserMappingModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, UserMappingImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, UserMappingImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userType);

			if (bindOrgCode1) {
				qPos.add(orgCode1);
			}

			if (bindOrgCode2) {
				qPos.add(orgCode2);
			}

			return (List<UserMapping>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param id the primary key of the current user mapping
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping[] filterFindByT_O_C_2_PrevAndNext(long id, int userType,
		String orgCode1, String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByT_O_C_2_PrevAndNext(id, userType, orgCode1, orgCode2,
				orderByComparator);
		}

		UserMapping userMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserMapping[] array = new UserMappingImpl[3];

			array[0] = filterGetByT_O_C_2_PrevAndNext(session, userMapping,
					userType, orgCode1, orgCode2, orderByComparator, true);

			array[1] = userMapping;

			array[2] = filterGetByT_O_C_2_PrevAndNext(session, userMapping,
					userType, orgCode1, orgCode2, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserMapping filterGetByT_O_C_2_PrevAndNext(Session session,
		UserMapping userMapping, int userType, String orgCode1,
		String orgCode2, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_T_O_C_2_USERTYPE_2_SQL);

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_1_SQL);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_3_SQL);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_2_SQL);
		}

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_1_SQL);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_3_SQL);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(UserMappingModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, UserMappingImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, UserMappingImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userType);

		if (bindOrgCode1) {
			qPos.add(orgCode1);
		}

		if (bindOrgCode2) {
			qPos.add(orgCode2);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63; from the database.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_O_C_2(int userType, String orgCode1, String orgCode2)
		throws SystemException {
		for (UserMapping userMapping : findByT_O_C_2(userType, orgCode1,
				orgCode2, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userMapping);
		}
	}

	/**
	 * Returns the number of user mappings where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @return the number of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_O_C_2(int userType, String orgCode1, String orgCode2)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_O_C_2;

		Object[] finderArgs = new Object[] { userType, orgCode1, orgCode2 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_USERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_T_O_C_2_USERTYPE_2);

			boolean bindOrgCode1 = false;

			if (orgCode1 == null) {
				query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_1);
			}
			else if (orgCode1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_3);
			}
			else {
				bindOrgCode1 = true;

				query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_2);
			}

			boolean bindOrgCode2 = false;

			if (orgCode2 == null) {
				query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_1);
			}
			else if (orgCode2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_3);
			}
			else {
				bindOrgCode2 = true;

				query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userType);

				if (bindOrgCode1) {
					qPos.add(orgCode1);
				}

				if (bindOrgCode2) {
					qPos.add(orgCode2);
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
	 * Returns the number of user mappings that the user has permission to view where userType = &#63; and orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param userType the user type
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @return the number of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByT_O_C_2(int userType, String orgCode1,
		String orgCode2) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByT_O_C_2(userType, orgCode1, orgCode2);
		}

		StringBundler query = new StringBundler(4);

		query.append(_FILTER_SQL_COUNT_USERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_T_O_C_2_USERTYPE_2_SQL);

		boolean bindOrgCode1 = false;

		if (orgCode1 == null) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_1_SQL);
		}
		else if (orgCode1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_3_SQL);
		}
		else {
			bindOrgCode1 = true;

			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE1_2_SQL);
		}

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_1_SQL);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_3_SQL);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_T_O_C_2_ORGCODE2_2_SQL);
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userType);

			if (bindOrgCode1) {
				qPos.add(orgCode1);
			}

			if (bindOrgCode2) {
				qPos.add(orgCode2);
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

	private static final String _FINDER_COLUMN_T_O_C_2_USERTYPE_2 = "userMapping.userType = ? AND ";
	private static final String _FINDER_COLUMN_T_O_C_2_USERTYPE_2_SQL = "userMapping.USERTYPE = ? AND ";
	private static final String _FINDER_COLUMN_T_O_C_2_ORGCODE1_1 = "userMapping.orgCode1 IS NULL AND ";
	private static final String _FINDER_COLUMN_T_O_C_2_ORGCODE1_2 = "userMapping.orgCode1 = ? AND ";
	private static final String _FINDER_COLUMN_T_O_C_2_ORGCODE1_3 = "(userMapping.orgCode1 IS NULL OR userMapping.orgCode1 = '') AND ";
	private static final String _FINDER_COLUMN_T_O_C_2_ORGCODE1_1_SQL = "userMapping.ORGCODE1 IS NULL AND ";
	private static final String _FINDER_COLUMN_T_O_C_2_ORGCODE1_2_SQL = "userMapping.ORGCODE1 = ? AND ";
	private static final String _FINDER_COLUMN_T_O_C_2_ORGCODE1_3_SQL = "(userMapping.ORGCODE1 IS NULL OR userMapping.ORGCODE1 = '') AND ";
	private static final String _FINDER_COLUMN_T_O_C_2_ORGCODE2_1 = "userMapping.orgCode2 IS NULL";
	private static final String _FINDER_COLUMN_T_O_C_2_ORGCODE2_2 = "userMapping.orgCode2 = ?";
	private static final String _FINDER_COLUMN_T_O_C_2_ORGCODE2_3 = "(userMapping.orgCode2 IS NULL OR userMapping.orgCode2 = '')";
	private static final String _FINDER_COLUMN_T_O_C_2_ORGCODE2_1_SQL = "userMapping.ORGCODE2 IS NULL";
	private static final String _FINDER_COLUMN_T_O_C_2_ORGCODE2_2_SQL = "userMapping.ORGCODE2 = ?";
	private static final String _FINDER_COLUMN_T_O_C_2_ORGCODE2_3_SQL = "(userMapping.ORGCODE2 IS NULL OR userMapping.ORGCODE2 = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U_T = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByU_T",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_T = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU_T",
			new String[] { Integer.class.getName() },
			UserMappingModelImpl.USERTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_T = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_T",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the user mappings where userType = &#63;.
	 *
	 * @param userType the user type
	 * @return the matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByU_T(int userType) throws SystemException {
		return findByU_T(userType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user mappings where userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userType the user type
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByU_T(int userType, int start, int end)
		throws SystemException {
		return findByU_T(userType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user mappings where userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userType the user type
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findByU_T(int userType, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_T;
			finderArgs = new Object[] { userType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U_T;
			finderArgs = new Object[] { userType, start, end, orderByComparator };
		}

		List<UserMapping> list = (List<UserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserMapping userMapping : list) {
				if ((userType != userMapping.getUserType())) {
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

			query.append(_SQL_SELECT_USERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_U_T_USERTYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userType);

				if (!pagination) {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserMapping>(list);
				}
				else {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user mapping in the ordered set where userType = &#63;.
	 *
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByU_T_First(int userType,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByU_T_First(userType, orderByComparator);

		if (userMapping != null) {
			return userMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userType=");
		msg.append(userType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMappingException(msg.toString());
	}

	/**
	 * Returns the first user mapping in the ordered set where userType = &#63;.
	 *
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByU_T_First(int userType,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserMapping> list = findByU_T(userType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user mapping in the ordered set where userType = &#63;.
	 *
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByU_T_Last(int userType,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByU_T_Last(userType, orderByComparator);

		if (userMapping != null) {
			return userMapping;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userType=");
		msg.append(userType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMappingException(msg.toString());
	}

	/**
	 * Returns the last user mapping in the ordered set where userType = &#63;.
	 *
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByU_T_Last(int userType,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByU_T(userType);

		if (count == 0) {
			return null;
		}

		List<UserMapping> list = findByU_T(userType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user mappings before and after the current user mapping in the ordered set where userType = &#63;.
	 *
	 * @param id the primary key of the current user mapping
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping[] findByU_T_PrevAndNext(long id, int userType,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserMapping[] array = new UserMappingImpl[3];

			array[0] = getByU_T_PrevAndNext(session, userMapping, userType,
					orderByComparator, true);

			array[1] = userMapping;

			array[2] = getByU_T_PrevAndNext(session, userMapping, userType,
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

	protected UserMapping getByU_T_PrevAndNext(Session session,
		UserMapping userMapping, int userType,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_U_T_USERTYPE_2);

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
			query.append(UserMappingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userType);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the user mappings that the user has permission to view where userType = &#63;.
	 *
	 * @param userType the user type
	 * @return the matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByU_T(int userType)
		throws SystemException {
		return filterFindByU_T(userType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the user mappings that the user has permission to view where userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userType the user type
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByU_T(int userType, int start, int end)
		throws SystemException {
		return filterFindByU_T(userType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user mappings that the user has permissions to view where userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userType the user type
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> filterFindByU_T(int userType, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByU_T(userType, start, end, orderByComparator);
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
			query.append(_FILTER_SQL_SELECT_USERMAPPING_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_U_T_USERTYPE_2_SQL);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(UserMappingModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, UserMappingImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, UserMappingImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userType);

			return (List<UserMapping>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the user mappings before and after the current user mapping in the ordered set of user mappings that the user has permission to view where userType = &#63;.
	 *
	 * @param id the primary key of the current user mapping
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping[] filterFindByU_T_PrevAndNext(long id, int userType,
		OrderByComparator orderByComparator)
		throws NoSuchUserMappingException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByU_T_PrevAndNext(id, userType, orderByComparator);
		}

		UserMapping userMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserMapping[] array = new UserMappingImpl[3];

			array[0] = filterGetByU_T_PrevAndNext(session, userMapping,
					userType, orderByComparator, true);

			array[1] = userMapping;

			array[2] = filterGetByU_T_PrevAndNext(session, userMapping,
					userType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserMapping filterGetByU_T_PrevAndNext(Session session,
		UserMapping userMapping, int userType,
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
			query.append(_FILTER_SQL_SELECT_USERMAPPING_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_U_T_USERTYPE_2_SQL);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(UserMappingModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(UserMappingModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, UserMappingImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, UserMappingImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userType);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMapping);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMapping> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user mappings where userType = &#63; from the database.
	 *
	 * @param userType the user type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByU_T(int userType) throws SystemException {
		for (UserMapping userMapping : findByU_T(userType, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(userMapping);
		}
	}

	/**
	 * Returns the number of user mappings where userType = &#63;.
	 *
	 * @param userType the user type
	 * @return the number of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByU_T(int userType) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_T;

		Object[] finderArgs = new Object[] { userType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_U_T_USERTYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userType);

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
	 * Returns the number of user mappings that the user has permission to view where userType = &#63;.
	 *
	 * @param userType the user type
	 * @return the number of matching user mappings that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByU_T(int userType) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByU_T(userType);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_USERMAPPING_WHERE);

		query.append(_FINDER_COLUMN_U_T_USERTYPE_2_SQL);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				UserMapping.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(userType);

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

	private static final String _FINDER_COLUMN_U_T_USERTYPE_2 = "userMapping.userType = ?";
	private static final String _FINDER_COLUMN_U_T_USERTYPE_2_SQL = "userMapping.USERTYPE = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_U_M = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, UserMappingImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByU_M",
			new String[] { Long.class.getName() },
			UserMappingModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_M = new FinderPath(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_M",
			new String[] { Long.class.getName() });

	/**
	 * Returns the user mapping where userId = &#63; or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserMappingException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByU_M(long userId)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByU_M(userId);

		if (userMapping == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchUserMappingException(msg.toString());
		}

		return userMapping;
	}

	/**
	 * Returns the user mapping where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByU_M(long userId) throws SystemException {
		return fetchByU_M(userId, true);
	}

	/**
	 * Returns the user mapping where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching user mapping, or <code>null</code> if a matching user mapping could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByU_M(long userId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_U_M,
					finderArgs, this);
		}

		if (result instanceof UserMapping) {
			UserMapping userMapping = (UserMapping)result;

			if ((userId != userMapping.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_USERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_U_M_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<UserMapping> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_M,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"UserMappingPersistenceImpl.fetchByU_M(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					UserMapping userMapping = list.get(0);

					result = userMapping;

					cacheResult(userMapping);

					if ((userMapping.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_M,
							finderArgs, userMapping);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_U_M,
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
			return (UserMapping)result;
		}
	}

	/**
	 * Removes the user mapping where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the user mapping that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping removeByU_M(long userId)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = findByU_M(userId);

		return remove(userMapping);
	}

	/**
	 * Returns the number of user mappings where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByU_M(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_M;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERMAPPING_WHERE);

			query.append(_FINDER_COLUMN_U_M_USERID_2);

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

	private static final String _FINDER_COLUMN_U_M_USERID_2 = "userMapping.userId = ?";

	public UserMappingPersistenceImpl() {
		setModelClass(UserMapping.class);
	}

	/**
	 * Caches the user mapping in the entity cache if it is enabled.
	 *
	 * @param userMapping the user mapping
	 */
	@Override
	public void cacheResult(UserMapping userMapping) {
		EntityCacheUtil.putResult(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingImpl.class, userMapping.getPrimaryKey(), userMapping);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_M,
			new Object[] { userMapping.getUserId() }, userMapping);

		userMapping.resetOriginalValues();
	}

	/**
	 * Caches the user mappings in the entity cache if it is enabled.
	 *
	 * @param userMappings the user mappings
	 */
	@Override
	public void cacheResult(List<UserMapping> userMappings) {
		for (UserMapping userMapping : userMappings) {
			if (EntityCacheUtil.getResult(
						UserMappingModelImpl.ENTITY_CACHE_ENABLED,
						UserMappingImpl.class, userMapping.getPrimaryKey()) == null) {
				cacheResult(userMapping);
			}
			else {
				userMapping.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user mappings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserMappingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserMappingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user mapping.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserMapping userMapping) {
		EntityCacheUtil.removeResult(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingImpl.class, userMapping.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(userMapping);
	}

	@Override
	public void clearCache(List<UserMapping> userMappings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserMapping userMapping : userMappings) {
			EntityCacheUtil.removeResult(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
				UserMappingImpl.class, userMapping.getPrimaryKey());

			clearUniqueFindersCache(userMapping);
		}
	}

	protected void cacheUniqueFindersCache(UserMapping userMapping) {
		if (userMapping.isNew()) {
			Object[] args = new Object[] { userMapping.getUserId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_M, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_M, args,
				userMapping);
		}
		else {
			UserMappingModelImpl userMappingModelImpl = (UserMappingModelImpl)userMapping;

			if ((userMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_U_M.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { userMapping.getUserId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_M, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_U_M, args,
					userMapping);
			}
		}
	}

	protected void clearUniqueFindersCache(UserMapping userMapping) {
		UserMappingModelImpl userMappingModelImpl = (UserMappingModelImpl)userMapping;

		Object[] args = new Object[] { userMapping.getUserId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U_M, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_U_M, args);

		if ((userMappingModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_U_M.getColumnBitmask()) != 0) {
			args = new Object[] { userMappingModelImpl.getOriginalUserId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U_M, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_U_M, args);
		}
	}

	/**
	 * Creates a new user mapping with the primary key. Does not add the user mapping to the database.
	 *
	 * @param id the primary key for the new user mapping
	 * @return the new user mapping
	 */
	@Override
	public UserMapping create(long id) {
		UserMapping userMapping = new UserMappingImpl();

		userMapping.setNew(true);
		userMapping.setPrimaryKey(id);

		return userMapping;
	}

	/**
	 * Removes the user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the user mapping
	 * @return the user mapping that was removed
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping remove(long id)
		throws NoSuchUserMappingException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the user mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user mapping
	 * @return the user mapping that was removed
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping remove(Serializable primaryKey)
		throws NoSuchUserMappingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserMapping userMapping = (UserMapping)session.get(UserMappingImpl.class,
					primaryKey);

			if (userMapping == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserMappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userMapping);
		}
		catch (NoSuchUserMappingException nsee) {
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
	protected UserMapping removeImpl(UserMapping userMapping)
		throws SystemException {
		userMapping = toUnwrappedModel(userMapping);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userMapping)) {
				userMapping = (UserMapping)session.get(UserMappingImpl.class,
						userMapping.getPrimaryKeyObj());
			}

			if (userMapping != null) {
				session.delete(userMapping);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userMapping != null) {
			clearCache(userMapping);
		}

		return userMapping;
	}

	@Override
	public UserMapping updateImpl(
		vn.dtt.cmon.user.dao.model.UserMapping userMapping)
		throws SystemException {
		userMapping = toUnwrappedModel(userMapping);

		boolean isNew = userMapping.isNew();

		UserMappingModelImpl userMappingModelImpl = (UserMappingModelImpl)userMapping;

		Session session = null;

		try {
			session = openSession();

			if (userMapping.isNew()) {
				session.save(userMapping);

				userMapping.setNew(false);
			}
			else {
				session.merge(userMapping);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserMappingModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userMappingModelImpl.getOriginalOrgCode1()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_C_1, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1,
					args);

				args = new Object[] { userMappingModelImpl.getOrgCode1() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_C_1, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1,
					args);
			}

			if ((userMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1_O_C_2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userMappingModelImpl.getOriginalOrgCode1(),
						userMappingModelImpl.getOriginalOrgCode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_C_1_O_C_2,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1_O_C_2,
					args);

				args = new Object[] {
						userMappingModelImpl.getOrgCode1(),
						userMappingModelImpl.getOrgCode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_C_1_O_C_2,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1_O_C_2,
					args);
			}

			if ((userMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userMappingModelImpl.getOriginalOrgCode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_C_2, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_2,
					args);

				args = new Object[] { userMappingModelImpl.getOrgCode2() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_C_2, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_2,
					args);
			}

			if ((userMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_O_C_1.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userMappingModelImpl.getOriginalUserType(),
						userMappingModelImpl.getOriginalOrgCode1()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_O_C_1, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_O_C_1,
					args);

				args = new Object[] {
						userMappingModelImpl.getUserType(),
						userMappingModelImpl.getOrgCode1()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_O_C_1, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_O_C_1,
					args);
			}

			if ((userMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_O_C_2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userMappingModelImpl.getOriginalUserType(),
						userMappingModelImpl.getOriginalOrgCode1(),
						userMappingModelImpl.getOriginalOrgCode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_O_C_2, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_O_C_2,
					args);

				args = new Object[] {
						userMappingModelImpl.getUserType(),
						userMappingModelImpl.getOrgCode1(),
						userMappingModelImpl.getOrgCode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_O_C_2, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_O_C_2,
					args);
			}

			if ((userMappingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userMappingModelImpl.getOriginalUserType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_T,
					args);

				args = new Object[] { userMappingModelImpl.getUserType() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_U_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_T,
					args);
			}
		}

		EntityCacheUtil.putResult(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
			UserMappingImpl.class, userMapping.getPrimaryKey(), userMapping);

		clearUniqueFindersCache(userMapping);
		cacheUniqueFindersCache(userMapping);

		return userMapping;
	}

	protected UserMapping toUnwrappedModel(UserMapping userMapping) {
		if (userMapping instanceof UserMappingImpl) {
			return userMapping;
		}

		UserMappingImpl userMappingImpl = new UserMappingImpl();

		userMappingImpl.setNew(userMapping.isNew());
		userMappingImpl.setPrimaryKey(userMapping.getPrimaryKey());

		userMappingImpl.setId(userMapping.getId());
		userMappingImpl.setName(userMapping.getName());
		userMappingImpl.setUserId(userMapping.getUserId());
		userMappingImpl.setUserType(userMapping.getUserType());
		userMappingImpl.setOrgCode1(userMapping.getOrgCode1());
		userMappingImpl.setOrgCode2(userMapping.getOrgCode2());

		return userMappingImpl;
	}

	/**
	 * Returns the user mapping with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user mapping
	 * @return the user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserMappingException, SystemException {
		UserMapping userMapping = fetchByPrimaryKey(primaryKey);

		if (userMapping == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserMappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userMapping;
	}

	/**
	 * Returns the user mapping with the primary key or throws a {@link vn.dtt.cmon.user.dao.NoSuchUserMappingException} if it could not be found.
	 *
	 * @param id the primary key of the user mapping
	 * @return the user mapping
	 * @throws vn.dtt.cmon.user.dao.NoSuchUserMappingException if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping findByPrimaryKey(long id)
		throws NoSuchUserMappingException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the user mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user mapping
	 * @return the user mapping, or <code>null</code> if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserMapping userMapping = (UserMapping)EntityCacheUtil.getResult(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
				UserMappingImpl.class, primaryKey);

		if (userMapping == _nullUserMapping) {
			return null;
		}

		if (userMapping == null) {
			Session session = null;

			try {
				session = openSession();

				userMapping = (UserMapping)session.get(UserMappingImpl.class,
						primaryKey);

				if (userMapping != null) {
					cacheResult(userMapping);
				}
				else {
					EntityCacheUtil.putResult(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
						UserMappingImpl.class, primaryKey, _nullUserMapping);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserMappingModelImpl.ENTITY_CACHE_ENABLED,
					UserMappingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userMapping;
	}

	/**
	 * Returns the user mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the user mapping
	 * @return the user mapping, or <code>null</code> if a user mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserMapping fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the user mappings.
	 *
	 * @return the user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @return the range of user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.user.dao.model.impl.UserMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user mappings
	 * @param end the upper bound of the range of user mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserMapping> findAll(int start, int end,
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

		List<UserMapping> list = (List<UserMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERMAPPING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERMAPPING;

				if (pagination) {
					sql = sql.concat(UserMappingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserMapping>(list);
				}
				else {
					list = (List<UserMapping>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user mappings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserMapping userMapping : findAll()) {
			remove(userMapping);
		}
	}

	/**
	 * Returns the number of user mappings.
	 *
	 * @return the number of user mappings
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

				Query q = session.createQuery(_SQL_COUNT_USERMAPPING);

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
	 * Initializes the user mapping persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.cmon.user.dao.model.UserMapping")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserMapping>> listenersList = new ArrayList<ModelListener<UserMapping>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserMapping>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserMappingImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERMAPPING = "SELECT userMapping FROM UserMapping userMapping";
	private static final String _SQL_SELECT_USERMAPPING_WHERE = "SELECT userMapping FROM UserMapping userMapping WHERE ";
	private static final String _SQL_COUNT_USERMAPPING = "SELECT COUNT(userMapping) FROM UserMapping userMapping";
	private static final String _SQL_COUNT_USERMAPPING_WHERE = "SELECT COUNT(userMapping) FROM UserMapping userMapping WHERE ";
	private static final String _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN = "userMapping.ID";
	private static final String _FILTER_SQL_SELECT_USERMAPPING_WHERE = "SELECT DISTINCT {userMapping.*} FROM DM_USERMAPPING userMapping WHERE ";
	private static final String _FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {DM_USERMAPPING.*} FROM (SELECT DISTINCT userMapping.ID FROM DM_USERMAPPING userMapping WHERE ";
	private static final String _FILTER_SQL_SELECT_USERMAPPING_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN DM_USERMAPPING ON TEMP_TABLE.ID = DM_USERMAPPING.ID";
	private static final String _FILTER_SQL_COUNT_USERMAPPING_WHERE = "SELECT COUNT(DISTINCT userMapping.ID) AS COUNT_VALUE FROM DM_USERMAPPING userMapping WHERE ";
	private static final String _FILTER_ENTITY_ALIAS = "userMapping";
	private static final String _FILTER_ENTITY_TABLE = "DM_USERMAPPING";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userMapping.";
	private static final String _ORDER_BY_ENTITY_TABLE = "DM_USERMAPPING.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserMapping exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserMapping exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserMappingPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "name", "userId", "userType", "orgCode1", "orgCode2"
			});
	private static UserMapping _nullUserMapping = new UserMappingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserMapping> toCacheModel() {
				return _nullUserMappingCacheModel;
			}
		};

	private static CacheModel<UserMapping> _nullUserMappingCacheModel = new CacheModel<UserMapping>() {
			@Override
			public UserMapping toEntityModel() {
				return _nullUserMapping;
			}
		};
}