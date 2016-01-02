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

import vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocImpl;
import vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tram cap nuoc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see TramCapNuocPersistence
 * @see TramCapNuocUtil
 * @generated
 */
public class TramCapNuocPersistenceImpl extends BasePersistenceImpl<TramCapNuoc>
	implements TramCapNuocPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TramCapNuocUtil} to access the tram cap nuoc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TramCapNuocImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocModelImpl.FINDER_CACHE_ENABLED, TramCapNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocModelImpl.FINDER_CACHE_ENABLED, TramCapNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_ = new FinderPath(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocModelImpl.FINDER_CACHE_ENABLED, TramCapNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByT_",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_ = new FinderPath(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocModelImpl.FINDER_CACHE_ENABLED, TramCapNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_",
			new String[] { String.class.getName() },
			TramCapNuocModelImpl.MATINH_COLUMN_BITMASK |
			TramCapNuocModelImpl.TENTRAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_ = new FinderPath(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_",
			new String[] { String.class.getName() });

	/**
	 * Returns all the tram cap nuocs where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the matching tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> findByT_(String maTinh) throws SystemException {
		return findByT_(maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tram cap nuocs where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @return the range of matching tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> findByT_(String maTinh, int start, int end)
		throws SystemException {
		return findByT_(maTinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tram cap nuocs where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> findByT_(String maTinh, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_;
			finderArgs = new Object[] { maTinh };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_;
			finderArgs = new Object[] { maTinh, start, end, orderByComparator };
		}

		List<TramCapNuoc> list = (List<TramCapNuoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TramCapNuoc tramCapNuoc : list) {
				if (!Validator.equals(maTinh, tramCapNuoc.getMaTinh())) {
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

			query.append(_SQL_SELECT_TRAMCAPNUOC_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T__MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T__MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T__MATINH_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TramCapNuocModelImpl.ORDER_BY_JPQL);
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
					list = (List<TramCapNuoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TramCapNuoc>(list);
				}
				else {
					list = (List<TramCapNuoc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tram cap nuoc in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a matching tram cap nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc findByT__First(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchTramCapNuocException, SystemException {
		TramCapNuoc tramCapNuoc = fetchByT__First(maTinh, orderByComparator);

		if (tramCapNuoc != null) {
			return tramCapNuoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTramCapNuocException(msg.toString());
	}

	/**
	 * Returns the first tram cap nuoc in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tram cap nuoc, or <code>null</code> if a matching tram cap nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc fetchByT__First(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		List<TramCapNuoc> list = findByT_(maTinh, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tram cap nuoc in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a matching tram cap nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc findByT__Last(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchTramCapNuocException, SystemException {
		TramCapNuoc tramCapNuoc = fetchByT__Last(maTinh, orderByComparator);

		if (tramCapNuoc != null) {
			return tramCapNuoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTramCapNuocException(msg.toString());
	}

	/**
	 * Returns the last tram cap nuoc in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tram cap nuoc, or <code>null</code> if a matching tram cap nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc fetchByT__Last(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByT_(maTinh);

		if (count == 0) {
			return null;
		}

		List<TramCapNuoc> list = findByT_(maTinh, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tram cap nuocs before and after the current tram cap nuoc in the ordered set where maTinh = &#63;.
	 *
	 * @param id the primary key of the current tram cap nuoc
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc[] findByT__PrevAndNext(long id, String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchTramCapNuocException, SystemException {
		TramCapNuoc tramCapNuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TramCapNuoc[] array = new TramCapNuocImpl[3];

			array[0] = getByT__PrevAndNext(session, tramCapNuoc, maTinh,
					orderByComparator, true);

			array[1] = tramCapNuoc;

			array[2] = getByT__PrevAndNext(session, tramCapNuoc, maTinh,
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

	protected TramCapNuoc getByT__PrevAndNext(Session session,
		TramCapNuoc tramCapNuoc, String maTinh,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TRAMCAPNUOC_WHERE);

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T__MATINH_1);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T__MATINH_3);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T__MATINH_2);
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
			query.append(TramCapNuocModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tramCapNuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TramCapNuoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the tram cap nuocs that the user has permission to view where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the matching tram cap nuocs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> filterFindByT_(String maTinh)
		throws SystemException {
		return filterFindByT_(maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tram cap nuocs that the user has permission to view where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @return the range of matching tram cap nuocs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> filterFindByT_(String maTinh, int start, int end)
		throws SystemException {
		return filterFindByT_(maTinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tram cap nuocs that the user has permissions to view where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tram cap nuocs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> filterFindByT_(String maTinh, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByT_(maTinh, start, end, orderByComparator);
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
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T__MATINH_1_SQL);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T__MATINH_3_SQL);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T__MATINH_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TramCapNuocModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TramCapNuocModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TramCapNuoc.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TramCapNuocImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TramCapNuocImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindMaTinh) {
				qPos.add(maTinh);
			}

			return (List<TramCapNuoc>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the tram cap nuocs before and after the current tram cap nuoc in the ordered set of tram cap nuocs that the user has permission to view where maTinh = &#63;.
	 *
	 * @param id the primary key of the current tram cap nuoc
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc[] filterFindByT__PrevAndNext(long id, String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchTramCapNuocException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByT__PrevAndNext(id, maTinh, orderByComparator);
		}

		TramCapNuoc tramCapNuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TramCapNuoc[] array = new TramCapNuocImpl[3];

			array[0] = filterGetByT__PrevAndNext(session, tramCapNuoc, maTinh,
					orderByComparator, true);

			array[1] = tramCapNuoc;

			array[2] = filterGetByT__PrevAndNext(session, tramCapNuoc, maTinh,
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

	protected TramCapNuoc filterGetByT__PrevAndNext(Session session,
		TramCapNuoc tramCapNuoc, String maTinh,
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
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T__MATINH_1_SQL);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T__MATINH_3_SQL);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T__MATINH_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TramCapNuocModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TramCapNuocModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TramCapNuoc.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, TramCapNuocImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, TramCapNuocImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaTinh) {
			qPos.add(maTinh);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tramCapNuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TramCapNuoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tram cap nuocs where maTinh = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_(String maTinh) throws SystemException {
		for (TramCapNuoc tramCapNuoc : findByT_(maTinh, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tramCapNuoc);
		}
	}

	/**
	 * Returns the number of tram cap nuocs where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the number of matching tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_(String maTinh) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_;

		Object[] finderArgs = new Object[] { maTinh };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRAMCAPNUOC_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T__MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T__MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T__MATINH_2);
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

	/**
	 * Returns the number of tram cap nuocs that the user has permission to view where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the number of matching tram cap nuocs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByT_(String maTinh) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByT_(maTinh);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_TRAMCAPNUOC_WHERE);

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T__MATINH_1_SQL);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T__MATINH_3_SQL);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T__MATINH_2_SQL);
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TramCapNuoc.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindMaTinh) {
				qPos.add(maTinh);
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

	private static final String _FINDER_COLUMN_T__MATINH_1 = "tramCapNuoc.maTinh IS NULL";
	private static final String _FINDER_COLUMN_T__MATINH_2 = "tramCapNuoc.maTinh = ?";
	private static final String _FINDER_COLUMN_T__MATINH_3 = "(tramCapNuoc.maTinh IS NULL OR tramCapNuoc.maTinh = '')";
	private static final String _FINDER_COLUMN_T__MATINH_1_SQL = "tramCapNuoc.MATINH IS NULL";
	private static final String _FINDER_COLUMN_T__MATINH_2_SQL = "tramCapNuoc.MATINH = ?";
	private static final String _FINDER_COLUMN_T__MATINH_3_SQL = "(tramCapNuoc.MATINH IS NULL OR tramCapNuoc.MATINH = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_TENTRAM =
		new FinderPath(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocModelImpl.FINDER_CACHE_ENABLED, TramCapNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByT_TENTRAM",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TENTRAM =
		new FinderPath(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocModelImpl.FINDER_CACHE_ENABLED, TramCapNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_TENTRAM",
			new String[] { String.class.getName() },
			TramCapNuocModelImpl.TENTRAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_TENTRAM = new FinderPath(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_TENTRAM",
			new String[] { String.class.getName() });

	/**
	 * Returns all the tram cap nuocs where tenTram = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @return the matching tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> findByT_TENTRAM(String tenTram)
		throws SystemException {
		return findByT_TENTRAM(tenTram, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the tram cap nuocs where tenTram = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenTram the ten tram
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @return the range of matching tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> findByT_TENTRAM(String tenTram, int start, int end)
		throws SystemException {
		return findByT_TENTRAM(tenTram, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tram cap nuocs where tenTram = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenTram the ten tram
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> findByT_TENTRAM(String tenTram, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TENTRAM;
			finderArgs = new Object[] { tenTram };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_TENTRAM;
			finderArgs = new Object[] { tenTram, start, end, orderByComparator };
		}

		List<TramCapNuoc> list = (List<TramCapNuoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TramCapNuoc tramCapNuoc : list) {
				if (!Validator.equals(tenTram, tramCapNuoc.getTenTram())) {
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

			query.append(_SQL_SELECT_TRAMCAPNUOC_WHERE);

			boolean bindTenTram = false;

			if (tenTram == null) {
				query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_1);
			}
			else if (tenTram.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_3);
			}
			else {
				bindTenTram = true;

				query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TramCapNuocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTenTram) {
					qPos.add(tenTram);
				}

				if (!pagination) {
					list = (List<TramCapNuoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TramCapNuoc>(list);
				}
				else {
					list = (List<TramCapNuoc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tram cap nuoc in the ordered set where tenTram = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a matching tram cap nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc findByT_TENTRAM_First(String tenTram,
		OrderByComparator orderByComparator)
		throws NoSuchTramCapNuocException, SystemException {
		TramCapNuoc tramCapNuoc = fetchByT_TENTRAM_First(tenTram,
				orderByComparator);

		if (tramCapNuoc != null) {
			return tramCapNuoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenTram=");
		msg.append(tenTram);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTramCapNuocException(msg.toString());
	}

	/**
	 * Returns the first tram cap nuoc in the ordered set where tenTram = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tram cap nuoc, or <code>null</code> if a matching tram cap nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc fetchByT_TENTRAM_First(String tenTram,
		OrderByComparator orderByComparator) throws SystemException {
		List<TramCapNuoc> list = findByT_TENTRAM(tenTram, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tram cap nuoc in the ordered set where tenTram = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a matching tram cap nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc findByT_TENTRAM_Last(String tenTram,
		OrderByComparator orderByComparator)
		throws NoSuchTramCapNuocException, SystemException {
		TramCapNuoc tramCapNuoc = fetchByT_TENTRAM_Last(tenTram,
				orderByComparator);

		if (tramCapNuoc != null) {
			return tramCapNuoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenTram=");
		msg.append(tenTram);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTramCapNuocException(msg.toString());
	}

	/**
	 * Returns the last tram cap nuoc in the ordered set where tenTram = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tram cap nuoc, or <code>null</code> if a matching tram cap nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc fetchByT_TENTRAM_Last(String tenTram,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByT_TENTRAM(tenTram);

		if (count == 0) {
			return null;
		}

		List<TramCapNuoc> list = findByT_TENTRAM(tenTram, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tram cap nuocs before and after the current tram cap nuoc in the ordered set where tenTram = &#63;.
	 *
	 * @param id the primary key of the current tram cap nuoc
	 * @param tenTram the ten tram
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc[] findByT_TENTRAM_PrevAndNext(long id, String tenTram,
		OrderByComparator orderByComparator)
		throws NoSuchTramCapNuocException, SystemException {
		TramCapNuoc tramCapNuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TramCapNuoc[] array = new TramCapNuocImpl[3];

			array[0] = getByT_TENTRAM_PrevAndNext(session, tramCapNuoc,
					tenTram, orderByComparator, true);

			array[1] = tramCapNuoc;

			array[2] = getByT_TENTRAM_PrevAndNext(session, tramCapNuoc,
					tenTram, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TramCapNuoc getByT_TENTRAM_PrevAndNext(Session session,
		TramCapNuoc tramCapNuoc, String tenTram,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TRAMCAPNUOC_WHERE);

		boolean bindTenTram = false;

		if (tenTram == null) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_1);
		}
		else if (tenTram.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_3);
		}
		else {
			bindTenTram = true;

			query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_2);
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
			query.append(TramCapNuocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTenTram) {
			qPos.add(tenTram);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tramCapNuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TramCapNuoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the tram cap nuocs that the user has permission to view where tenTram = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @return the matching tram cap nuocs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> filterFindByT_TENTRAM(String tenTram)
		throws SystemException {
		return filterFindByT_TENTRAM(tenTram, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tram cap nuocs that the user has permission to view where tenTram = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenTram the ten tram
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @return the range of matching tram cap nuocs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> filterFindByT_TENTRAM(String tenTram, int start,
		int end) throws SystemException {
		return filterFindByT_TENTRAM(tenTram, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tram cap nuocs that the user has permissions to view where tenTram = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenTram the ten tram
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tram cap nuocs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> filterFindByT_TENTRAM(String tenTram, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByT_TENTRAM(tenTram, start, end, orderByComparator);
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
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindTenTram = false;

		if (tenTram == null) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_1_SQL);
		}
		else if (tenTram.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_3_SQL);
		}
		else {
			bindTenTram = true;

			query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TramCapNuocModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TramCapNuocModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TramCapNuoc.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TramCapNuocImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TramCapNuocImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindTenTram) {
				qPos.add(tenTram);
			}

			return (List<TramCapNuoc>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the tram cap nuocs before and after the current tram cap nuoc in the ordered set of tram cap nuocs that the user has permission to view where tenTram = &#63;.
	 *
	 * @param id the primary key of the current tram cap nuoc
	 * @param tenTram the ten tram
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc[] filterFindByT_TENTRAM_PrevAndNext(long id,
		String tenTram, OrderByComparator orderByComparator)
		throws NoSuchTramCapNuocException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByT_TENTRAM_PrevAndNext(id, tenTram, orderByComparator);
		}

		TramCapNuoc tramCapNuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TramCapNuoc[] array = new TramCapNuocImpl[3];

			array[0] = filterGetByT_TENTRAM_PrevAndNext(session, tramCapNuoc,
					tenTram, orderByComparator, true);

			array[1] = tramCapNuoc;

			array[2] = filterGetByT_TENTRAM_PrevAndNext(session, tramCapNuoc,
					tenTram, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TramCapNuoc filterGetByT_TENTRAM_PrevAndNext(Session session,
		TramCapNuoc tramCapNuoc, String tenTram,
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
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindTenTram = false;

		if (tenTram == null) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_1_SQL);
		}
		else if (tenTram.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_3_SQL);
		}
		else {
			bindTenTram = true;

			query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TramCapNuocModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TramCapNuocModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TramCapNuoc.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, TramCapNuocImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, TramCapNuocImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTenTram) {
			qPos.add(tenTram);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tramCapNuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TramCapNuoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tram cap nuocs where tenTram = &#63; from the database.
	 *
	 * @param tenTram the ten tram
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_TENTRAM(String tenTram) throws SystemException {
		for (TramCapNuoc tramCapNuoc : findByT_TENTRAM(tenTram,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tramCapNuoc);
		}
	}

	/**
	 * Returns the number of tram cap nuocs where tenTram = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @return the number of matching tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_TENTRAM(String tenTram) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_TENTRAM;

		Object[] finderArgs = new Object[] { tenTram };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRAMCAPNUOC_WHERE);

			boolean bindTenTram = false;

			if (tenTram == null) {
				query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_1);
			}
			else if (tenTram.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_3);
			}
			else {
				bindTenTram = true;

				query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTenTram) {
					qPos.add(tenTram);
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
	 * Returns the number of tram cap nuocs that the user has permission to view where tenTram = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @return the number of matching tram cap nuocs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByT_TENTRAM(String tenTram) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByT_TENTRAM(tenTram);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_TRAMCAPNUOC_WHERE);

		boolean bindTenTram = false;

		if (tenTram == null) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_1_SQL);
		}
		else if (tenTram.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_3_SQL);
		}
		else {
			bindTenTram = true;

			query.append(_FINDER_COLUMN_T_TENTRAM_TENTRAM_2_SQL);
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TramCapNuoc.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindTenTram) {
				qPos.add(tenTram);
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

	private static final String _FINDER_COLUMN_T_TENTRAM_TENTRAM_1 = "tramCapNuoc.tenTram IS NULL";
	private static final String _FINDER_COLUMN_T_TENTRAM_TENTRAM_2 = "tramCapNuoc.tenTram = ?";
	private static final String _FINDER_COLUMN_T_TENTRAM_TENTRAM_3 = "(tramCapNuoc.tenTram IS NULL OR tramCapNuoc.tenTram = '')";
	private static final String _FINDER_COLUMN_T_TENTRAM_TENTRAM_1_SQL = "tramCapNuoc.TENTRAM IS NULL";
	private static final String _FINDER_COLUMN_T_TENTRAM_TENTRAM_2_SQL = "tramCapNuoc.TENTRAM = ?";
	private static final String _FINDER_COLUMN_T_TENTRAM_TENTRAM_3_SQL = "(tramCapNuoc.TENTRAM IS NULL OR tramCapNuoc.TENTRAM = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_TENTRAM_TINH =
		new FinderPath(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocModelImpl.FINDER_CACHE_ENABLED, TramCapNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByT_TENTRAM_TINH",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TENTRAM_TINH =
		new FinderPath(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocModelImpl.FINDER_CACHE_ENABLED, TramCapNuocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_TENTRAM_TINH",
			new String[] { String.class.getName(), String.class.getName() },
			TramCapNuocModelImpl.TENTRAM_COLUMN_BITMASK |
			TramCapNuocModelImpl.MATINH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_TENTRAM_TINH = new FinderPath(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_TENTRAM_TINH",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the tram cap nuocs where tenTram = &#63; and maTinh = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @return the matching tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> findByT_TENTRAM_TINH(String tenTram, String maTinh)
		throws SystemException {
		return findByT_TENTRAM_TINH(tenTram, maTinh, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tram cap nuocs where tenTram = &#63; and maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @return the range of matching tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> findByT_TENTRAM_TINH(String tenTram,
		String maTinh, int start, int end) throws SystemException {
		return findByT_TENTRAM_TINH(tenTram, maTinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tram cap nuocs where tenTram = &#63; and maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> findByT_TENTRAM_TINH(String tenTram,
		String maTinh, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TENTRAM_TINH;
			finderArgs = new Object[] { tenTram, maTinh };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_TENTRAM_TINH;
			finderArgs = new Object[] {
					tenTram, maTinh,
					
					start, end, orderByComparator
				};
		}

		List<TramCapNuoc> list = (List<TramCapNuoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TramCapNuoc tramCapNuoc : list) {
				if (!Validator.equals(tenTram, tramCapNuoc.getTenTram()) ||
						!Validator.equals(maTinh, tramCapNuoc.getMaTinh())) {
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

			query.append(_SQL_SELECT_TRAMCAPNUOC_WHERE);

			boolean bindTenTram = false;

			if (tenTram == null) {
				query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_1);
			}
			else if (tenTram.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_3);
			}
			else {
				bindTenTram = true;

				query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_2);
			}

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TramCapNuocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTenTram) {
					qPos.add(tenTram);
				}

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				if (!pagination) {
					list = (List<TramCapNuoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TramCapNuoc>(list);
				}
				else {
					list = (List<TramCapNuoc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tram cap nuoc in the ordered set where tenTram = &#63; and maTinh = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a matching tram cap nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc findByT_TENTRAM_TINH_First(String tenTram,
		String maTinh, OrderByComparator orderByComparator)
		throws NoSuchTramCapNuocException, SystemException {
		TramCapNuoc tramCapNuoc = fetchByT_TENTRAM_TINH_First(tenTram, maTinh,
				orderByComparator);

		if (tramCapNuoc != null) {
			return tramCapNuoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenTram=");
		msg.append(tenTram);

		msg.append(", maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTramCapNuocException(msg.toString());
	}

	/**
	 * Returns the first tram cap nuoc in the ordered set where tenTram = &#63; and maTinh = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tram cap nuoc, or <code>null</code> if a matching tram cap nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc fetchByT_TENTRAM_TINH_First(String tenTram,
		String maTinh, OrderByComparator orderByComparator)
		throws SystemException {
		List<TramCapNuoc> list = findByT_TENTRAM_TINH(tenTram, maTinh, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tram cap nuoc in the ordered set where tenTram = &#63; and maTinh = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a matching tram cap nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc findByT_TENTRAM_TINH_Last(String tenTram, String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchTramCapNuocException, SystemException {
		TramCapNuoc tramCapNuoc = fetchByT_TENTRAM_TINH_Last(tenTram, maTinh,
				orderByComparator);

		if (tramCapNuoc != null) {
			return tramCapNuoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenTram=");
		msg.append(tenTram);

		msg.append(", maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTramCapNuocException(msg.toString());
	}

	/**
	 * Returns the last tram cap nuoc in the ordered set where tenTram = &#63; and maTinh = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tram cap nuoc, or <code>null</code> if a matching tram cap nuoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc fetchByT_TENTRAM_TINH_Last(String tenTram,
		String maTinh, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByT_TENTRAM_TINH(tenTram, maTinh);

		if (count == 0) {
			return null;
		}

		List<TramCapNuoc> list = findByT_TENTRAM_TINH(tenTram, maTinh,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tram cap nuocs before and after the current tram cap nuoc in the ordered set where tenTram = &#63; and maTinh = &#63;.
	 *
	 * @param id the primary key of the current tram cap nuoc
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc[] findByT_TENTRAM_TINH_PrevAndNext(long id,
		String tenTram, String maTinh, OrderByComparator orderByComparator)
		throws NoSuchTramCapNuocException, SystemException {
		TramCapNuoc tramCapNuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TramCapNuoc[] array = new TramCapNuocImpl[3];

			array[0] = getByT_TENTRAM_TINH_PrevAndNext(session, tramCapNuoc,
					tenTram, maTinh, orderByComparator, true);

			array[1] = tramCapNuoc;

			array[2] = getByT_TENTRAM_TINH_PrevAndNext(session, tramCapNuoc,
					tenTram, maTinh, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TramCapNuoc getByT_TENTRAM_TINH_PrevAndNext(Session session,
		TramCapNuoc tramCapNuoc, String tenTram, String maTinh,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TRAMCAPNUOC_WHERE);

		boolean bindTenTram = false;

		if (tenTram == null) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_1);
		}
		else if (tenTram.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_3);
		}
		else {
			bindTenTram = true;

			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_2);
		}

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_1);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_3);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_2);
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
			query.append(TramCapNuocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTenTram) {
			qPos.add(tenTram);
		}

		if (bindMaTinh) {
			qPos.add(maTinh);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tramCapNuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TramCapNuoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the tram cap nuocs that the user has permission to view where tenTram = &#63; and maTinh = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @return the matching tram cap nuocs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> filterFindByT_TENTRAM_TINH(String tenTram,
		String maTinh) throws SystemException {
		return filterFindByT_TENTRAM_TINH(tenTram, maTinh, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tram cap nuocs that the user has permission to view where tenTram = &#63; and maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @return the range of matching tram cap nuocs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> filterFindByT_TENTRAM_TINH(String tenTram,
		String maTinh, int start, int end) throws SystemException {
		return filterFindByT_TENTRAM_TINH(tenTram, maTinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tram cap nuocs that the user has permissions to view where tenTram = &#63; and maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tram cap nuocs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> filterFindByT_TENTRAM_TINH(String tenTram,
		String maTinh, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByT_TENTRAM_TINH(tenTram, maTinh, start, end,
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
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindTenTram = false;

		if (tenTram == null) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_1_SQL);
		}
		else if (tenTram.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_3_SQL);
		}
		else {
			bindTenTram = true;

			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_2_SQL);
		}

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_1_SQL);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_3_SQL);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TramCapNuocModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TramCapNuocModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TramCapNuoc.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TramCapNuocImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TramCapNuocImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindTenTram) {
				qPos.add(tenTram);
			}

			if (bindMaTinh) {
				qPos.add(maTinh);
			}

			return (List<TramCapNuoc>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the tram cap nuocs before and after the current tram cap nuoc in the ordered set of tram cap nuocs that the user has permission to view where tenTram = &#63; and maTinh = &#63;.
	 *
	 * @param id the primary key of the current tram cap nuoc
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc[] filterFindByT_TENTRAM_TINH_PrevAndNext(long id,
		String tenTram, String maTinh, OrderByComparator orderByComparator)
		throws NoSuchTramCapNuocException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByT_TENTRAM_TINH_PrevAndNext(id, tenTram, maTinh,
				orderByComparator);
		}

		TramCapNuoc tramCapNuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TramCapNuoc[] array = new TramCapNuocImpl[3];

			array[0] = filterGetByT_TENTRAM_TINH_PrevAndNext(session,
					tramCapNuoc, tenTram, maTinh, orderByComparator, true);

			array[1] = tramCapNuoc;

			array[2] = filterGetByT_TENTRAM_TINH_PrevAndNext(session,
					tramCapNuoc, tenTram, maTinh, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TramCapNuoc filterGetByT_TENTRAM_TINH_PrevAndNext(
		Session session, TramCapNuoc tramCapNuoc, String tenTram,
		String maTinh, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindTenTram = false;

		if (tenTram == null) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_1_SQL);
		}
		else if (tenTram.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_3_SQL);
		}
		else {
			bindTenTram = true;

			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_2_SQL);
		}

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_1_SQL);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_3_SQL);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_2_SQL);
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TramCapNuocModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TramCapNuocModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TramCapNuoc.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, TramCapNuocImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, TramCapNuocImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTenTram) {
			qPos.add(tenTram);
		}

		if (bindMaTinh) {
			qPos.add(maTinh);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tramCapNuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TramCapNuoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tram cap nuocs where tenTram = &#63; and maTinh = &#63; from the database.
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_TENTRAM_TINH(String tenTram, String maTinh)
		throws SystemException {
		for (TramCapNuoc tramCapNuoc : findByT_TENTRAM_TINH(tenTram, maTinh,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tramCapNuoc);
		}
	}

	/**
	 * Returns the number of tram cap nuocs where tenTram = &#63; and maTinh = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @return the number of matching tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_TENTRAM_TINH(String tenTram, String maTinh)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_TENTRAM_TINH;

		Object[] finderArgs = new Object[] { tenTram, maTinh };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TRAMCAPNUOC_WHERE);

			boolean bindTenTram = false;

			if (tenTram == null) {
				query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_1);
			}
			else if (tenTram.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_3);
			}
			else {
				bindTenTram = true;

				query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_2);
			}

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTenTram) {
					qPos.add(tenTram);
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

	/**
	 * Returns the number of tram cap nuocs that the user has permission to view where tenTram = &#63; and maTinh = &#63;.
	 *
	 * @param tenTram the ten tram
	 * @param maTinh the ma tinh
	 * @return the number of matching tram cap nuocs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByT_TENTRAM_TINH(String tenTram, String maTinh)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByT_TENTRAM_TINH(tenTram, maTinh);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_TRAMCAPNUOC_WHERE);

		boolean bindTenTram = false;

		if (tenTram == null) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_1_SQL);
		}
		else if (tenTram.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_3_SQL);
		}
		else {
			bindTenTram = true;

			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_2_SQL);
		}

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_1_SQL);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_3_SQL);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_T_TENTRAM_TINH_MATINH_2_SQL);
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TramCapNuoc.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindTenTram) {
				qPos.add(tenTram);
			}

			if (bindMaTinh) {
				qPos.add(maTinh);
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

	private static final String _FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_1 = "tramCapNuoc.tenTram IS NULL AND ";
	private static final String _FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_2 = "tramCapNuoc.tenTram = ? AND ";
	private static final String _FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_3 = "(tramCapNuoc.tenTram IS NULL OR tramCapNuoc.tenTram = '') AND ";
	private static final String _FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_1_SQL = "tramCapNuoc.TENTRAM IS NULL AND ";
	private static final String _FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_2_SQL = "tramCapNuoc.TENTRAM = ? AND ";
	private static final String _FINDER_COLUMN_T_TENTRAM_TINH_TENTRAM_3_SQL = "(tramCapNuoc.TENTRAM IS NULL OR tramCapNuoc.TENTRAM = '') AND ";
	private static final String _FINDER_COLUMN_T_TENTRAM_TINH_MATINH_1 = "tramCapNuoc.maTinh IS NULL";
	private static final String _FINDER_COLUMN_T_TENTRAM_TINH_MATINH_2 = "tramCapNuoc.maTinh = ?";
	private static final String _FINDER_COLUMN_T_TENTRAM_TINH_MATINH_3 = "(tramCapNuoc.maTinh IS NULL OR tramCapNuoc.maTinh = '')";
	private static final String _FINDER_COLUMN_T_TENTRAM_TINH_MATINH_1_SQL = "tramCapNuoc.MATINH IS NULL";
	private static final String _FINDER_COLUMN_T_TENTRAM_TINH_MATINH_2_SQL = "tramCapNuoc.MATINH = ?";
	private static final String _FINDER_COLUMN_T_TENTRAM_TINH_MATINH_3_SQL = "(tramCapNuoc.MATINH IS NULL OR tramCapNuoc.MATINH = '')";

	public TramCapNuocPersistenceImpl() {
		setModelClass(TramCapNuoc.class);
	}

	/**
	 * Caches the tram cap nuoc in the entity cache if it is enabled.
	 *
	 * @param tramCapNuoc the tram cap nuoc
	 */
	@Override
	public void cacheResult(TramCapNuoc tramCapNuoc) {
		EntityCacheUtil.putResult(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocImpl.class, tramCapNuoc.getPrimaryKey(), tramCapNuoc);

		tramCapNuoc.resetOriginalValues();
	}

	/**
	 * Caches the tram cap nuocs in the entity cache if it is enabled.
	 *
	 * @param tramCapNuocs the tram cap nuocs
	 */
	@Override
	public void cacheResult(List<TramCapNuoc> tramCapNuocs) {
		for (TramCapNuoc tramCapNuoc : tramCapNuocs) {
			if (EntityCacheUtil.getResult(
						TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
						TramCapNuocImpl.class, tramCapNuoc.getPrimaryKey()) == null) {
				cacheResult(tramCapNuoc);
			}
			else {
				tramCapNuoc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tram cap nuocs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TramCapNuocImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TramCapNuocImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tram cap nuoc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TramCapNuoc tramCapNuoc) {
		EntityCacheUtil.removeResult(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocImpl.class, tramCapNuoc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TramCapNuoc> tramCapNuocs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TramCapNuoc tramCapNuoc : tramCapNuocs) {
			EntityCacheUtil.removeResult(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
				TramCapNuocImpl.class, tramCapNuoc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tram cap nuoc with the primary key. Does not add the tram cap nuoc to the database.
	 *
	 * @param id the primary key for the new tram cap nuoc
	 * @return the new tram cap nuoc
	 */
	@Override
	public TramCapNuoc create(long id) {
		TramCapNuoc tramCapNuoc = new TramCapNuocImpl();

		tramCapNuoc.setNew(true);
		tramCapNuoc.setPrimaryKey(id);

		return tramCapNuoc;
	}

	/**
	 * Removes the tram cap nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tram cap nuoc
	 * @return the tram cap nuoc that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc remove(long id)
		throws NoSuchTramCapNuocException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tram cap nuoc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tram cap nuoc
	 * @return the tram cap nuoc that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc remove(Serializable primaryKey)
		throws NoSuchTramCapNuocException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TramCapNuoc tramCapNuoc = (TramCapNuoc)session.get(TramCapNuocImpl.class,
					primaryKey);

			if (tramCapNuoc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTramCapNuocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tramCapNuoc);
		}
		catch (NoSuchTramCapNuocException nsee) {
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
	protected TramCapNuoc removeImpl(TramCapNuoc tramCapNuoc)
		throws SystemException {
		tramCapNuoc = toUnwrappedModel(tramCapNuoc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tramCapNuoc)) {
				tramCapNuoc = (TramCapNuoc)session.get(TramCapNuocImpl.class,
						tramCapNuoc.getPrimaryKeyObj());
			}

			if (tramCapNuoc != null) {
				session.delete(tramCapNuoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tramCapNuoc != null) {
			clearCache(tramCapNuoc);
		}

		return tramCapNuoc;
	}

	@Override
	public TramCapNuoc updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc tramCapNuoc)
		throws SystemException {
		tramCapNuoc = toUnwrappedModel(tramCapNuoc);

		boolean isNew = tramCapNuoc.isNew();

		TramCapNuocModelImpl tramCapNuocModelImpl = (TramCapNuocModelImpl)tramCapNuoc;

		Session session = null;

		try {
			session = openSession();

			if (tramCapNuoc.isNew()) {
				session.save(tramCapNuoc);

				tramCapNuoc.setNew(false);
			}
			else {
				session.merge(tramCapNuoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TramCapNuocModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tramCapNuocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tramCapNuocModelImpl.getOriginalMaTinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_,
					args);

				args = new Object[] { tramCapNuocModelImpl.getMaTinh() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_,
					args);
			}

			if ((tramCapNuocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TENTRAM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tramCapNuocModelImpl.getOriginalTenTram()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_TENTRAM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TENTRAM,
					args);

				args = new Object[] { tramCapNuocModelImpl.getTenTram() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_TENTRAM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TENTRAM,
					args);
			}

			if ((tramCapNuocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TENTRAM_TINH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tramCapNuocModelImpl.getOriginalTenTram(),
						tramCapNuocModelImpl.getOriginalMaTinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_TENTRAM_TINH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TENTRAM_TINH,
					args);

				args = new Object[] {
						tramCapNuocModelImpl.getTenTram(),
						tramCapNuocModelImpl.getMaTinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_TENTRAM_TINH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_TENTRAM_TINH,
					args);
			}
		}

		EntityCacheUtil.putResult(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
			TramCapNuocImpl.class, tramCapNuoc.getPrimaryKey(), tramCapNuoc);

		return tramCapNuoc;
	}

	protected TramCapNuoc toUnwrappedModel(TramCapNuoc tramCapNuoc) {
		if (tramCapNuoc instanceof TramCapNuocImpl) {
			return tramCapNuoc;
		}

		TramCapNuocImpl tramCapNuocImpl = new TramCapNuocImpl();

		tramCapNuocImpl.setNew(tramCapNuoc.isNew());
		tramCapNuocImpl.setPrimaryKey(tramCapNuoc.getPrimaryKey());

		tramCapNuocImpl.setId(tramCapNuoc.getId());
		tramCapNuocImpl.setMaTram(tramCapNuoc.getMaTram());
		tramCapNuocImpl.setTenTram(tramCapNuoc.getTenTram());
		tramCapNuocImpl.setMaTinh(tramCapNuoc.getMaTinh());
		tramCapNuocImpl.setTenTinh(tramCapNuoc.getTenTinh());
		tramCapNuocImpl.setMaHuyen(tramCapNuoc.getMaHuyen());
		tramCapNuocImpl.setTenHuyen(tramCapNuoc.getTenHuyen());
		tramCapNuocImpl.setMaXa(tramCapNuoc.getMaXa());
		tramCapNuocImpl.setTenXa(tramCapNuoc.getTenXa());
		tramCapNuocImpl.setDiaChi(tramCapNuoc.getDiaChi());
		tramCapNuocImpl.setKinhDo(tramCapNuoc.getKinhDo());
		tramCapNuocImpl.setViDo(tramCapNuoc.getViDo());
		tramCapNuocImpl.setLoaiHinh(tramCapNuoc.getLoaiHinh());
		tramCapNuocImpl.setMaMoHinh(tramCapNuoc.getMaMoHinh());
		tramCapNuocImpl.setTenMoHinh(tramCapNuoc.getTenMoHinh());
		tramCapNuocImpl.setCongXuatThietKe(tramCapNuoc.getCongXuatThietKe());
		tramCapNuocImpl.setTongDauNoiThietKe(tramCapNuoc.getTongDauNoiThietKe());
		tramCapNuocImpl.setSoNguoiCapThietKe(tramCapNuoc.getSoNguoiCapThietKe());
		tramCapNuocImpl.setTinhTrangDuAn(tramCapNuoc.getTinhTrangDuAn());
		tramCapNuocImpl.setTienDoXayDung(tramCapNuoc.getTienDoXayDung());
		tramCapNuocImpl.setNamXayDung(tramCapNuoc.getNamXayDung());
		tramCapNuocImpl.setNamHoanThanh(tramCapNuoc.getNamHoanThanh());
		tramCapNuocImpl.setNgayVanHanh(tramCapNuoc.getNgayVanHanh());
		tramCapNuocImpl.setBoMayVanHanh(tramCapNuoc.getBoMayVanHanh());
		tramCapNuocImpl.setGhiChu(tramCapNuoc.getGhiChu());
		tramCapNuocImpl.setNgayTao(tramCapNuoc.getNgayTao());
		tramCapNuocImpl.setIdNguoiTao(tramCapNuoc.getIdNguoiTao());
		tramCapNuocImpl.setIdNguoiDanhGia(tramCapNuoc.getIdNguoiDanhGia());
		tramCapNuocImpl.setNgayDanhGia(tramCapNuoc.getNgayDanhGia());
		tramCapNuocImpl.setTrangThaiCapNuoc(tramCapNuoc.getTrangThaiCapNuoc());
		tramCapNuocImpl.setCongXuatThucTe(tramCapNuoc.getCongXuatThucTe());
		tramCapNuocImpl.setTongDauNoiThucTe(tramCapNuoc.getTongDauNoiThucTe());
		tramCapNuocImpl.setSoNguoiCapThucTe(tramCapNuoc.getSoNguoiCapThucTe());
		tramCapNuocImpl.setTongChiPhi(tramCapNuoc.getTongChiPhi());
		tramCapNuocImpl.setTongDoanhThu(tramCapNuoc.getTongDoanhThu());
		tramCapNuocImpl.setNuocDatTieuChuan(tramCapNuoc.getNuocDatTieuChuan());
		tramCapNuocImpl.setNuocCoAsen(tramCapNuoc.getNuocCoAsen());
		tramCapNuocImpl.setNuocThatThoat(tramCapNuoc.getNuocThatThoat());
		tramCapNuocImpl.setTrangThaiDanhGia(tramCapNuoc.getTrangThaiDanhGia());

		return tramCapNuocImpl;
	}

	/**
	 * Returns the tram cap nuoc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tram cap nuoc
	 * @return the tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTramCapNuocException, SystemException {
		TramCapNuoc tramCapNuoc = fetchByPrimaryKey(primaryKey);

		if (tramCapNuoc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTramCapNuocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tramCapNuoc;
	}

	/**
	 * Returns the tram cap nuoc with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException} if it could not be found.
	 *
	 * @param id the primary key of the tram cap nuoc
	 * @return the tram cap nuoc
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTramCapNuocException if a tram cap nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc findByPrimaryKey(long id)
		throws NoSuchTramCapNuocException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tram cap nuoc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tram cap nuoc
	 * @return the tram cap nuoc, or <code>null</code> if a tram cap nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TramCapNuoc tramCapNuoc = (TramCapNuoc)EntityCacheUtil.getResult(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
				TramCapNuocImpl.class, primaryKey);

		if (tramCapNuoc == _nullTramCapNuoc) {
			return null;
		}

		if (tramCapNuoc == null) {
			Session session = null;

			try {
				session = openSession();

				tramCapNuoc = (TramCapNuoc)session.get(TramCapNuocImpl.class,
						primaryKey);

				if (tramCapNuoc != null) {
					cacheResult(tramCapNuoc);
				}
				else {
					EntityCacheUtil.putResult(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
						TramCapNuocImpl.class, primaryKey, _nullTramCapNuoc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TramCapNuocModelImpl.ENTITY_CACHE_ENABLED,
					TramCapNuocImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tramCapNuoc;
	}

	/**
	 * Returns the tram cap nuoc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tram cap nuoc
	 * @return the tram cap nuoc, or <code>null</code> if a tram cap nuoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TramCapNuoc fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tram cap nuocs.
	 *
	 * @return the tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tram cap nuocs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @return the range of tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tram cap nuocs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.TramCapNuocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tram cap nuocs
	 * @param end the upper bound of the range of tram cap nuocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tram cap nuocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TramCapNuoc> findAll(int start, int end,
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

		List<TramCapNuoc> list = (List<TramCapNuoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TRAMCAPNUOC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRAMCAPNUOC;

				if (pagination) {
					sql = sql.concat(TramCapNuocModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TramCapNuoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TramCapNuoc>(list);
				}
				else {
					list = (List<TramCapNuoc>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the tram cap nuocs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TramCapNuoc tramCapNuoc : findAll()) {
			remove(tramCapNuoc);
		}
	}

	/**
	 * Returns the number of tram cap nuocs.
	 *
	 * @return the number of tram cap nuocs
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

				Query q = session.createQuery(_SQL_COUNT_TRAMCAPNUOC);

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
	 * Initializes the tram cap nuoc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TramCapNuoc>> listenersList = new ArrayList<ModelListener<TramCapNuoc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TramCapNuoc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TramCapNuocImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TRAMCAPNUOC = "SELECT tramCapNuoc FROM TramCapNuoc tramCapNuoc";
	private static final String _SQL_SELECT_TRAMCAPNUOC_WHERE = "SELECT tramCapNuoc FROM TramCapNuoc tramCapNuoc WHERE ";
	private static final String _SQL_COUNT_TRAMCAPNUOC = "SELECT COUNT(tramCapNuoc) FROM TramCapNuoc tramCapNuoc";
	private static final String _SQL_COUNT_TRAMCAPNUOC_WHERE = "SELECT COUNT(tramCapNuoc) FROM TramCapNuoc tramCapNuoc WHERE ";
	private static final String _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN = "tramCapNuoc.ID";
	private static final String _FILTER_SQL_SELECT_TRAMCAPNUOC_WHERE = "SELECT DISTINCT {tramCapNuoc.*} FROM ME_TRAMCAPNUOC tramCapNuoc WHERE ";
	private static final String _FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {ME_TRAMCAPNUOC.*} FROM (SELECT DISTINCT tramCapNuoc.ID FROM ME_TRAMCAPNUOC tramCapNuoc WHERE ";
	private static final String _FILTER_SQL_SELECT_TRAMCAPNUOC_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN ME_TRAMCAPNUOC ON TEMP_TABLE.ID = ME_TRAMCAPNUOC.ID";
	private static final String _FILTER_SQL_COUNT_TRAMCAPNUOC_WHERE = "SELECT COUNT(DISTINCT tramCapNuoc.ID) AS COUNT_VALUE FROM ME_TRAMCAPNUOC tramCapNuoc WHERE ";
	private static final String _FILTER_ENTITY_ALIAS = "tramCapNuoc";
	private static final String _FILTER_ENTITY_TABLE = "ME_TRAMCAPNUOC";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tramCapNuoc.";
	private static final String _ORDER_BY_ENTITY_TABLE = "ME_TRAMCAPNUOC.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TramCapNuoc exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TramCapNuoc exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TramCapNuocPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maTram", "tenTram", "maTinh", "tenTinh", "maHuyen",
				"tenHuyen", "maXa", "tenXa", "diaChi", "kinhDo", "viDo",
				"loaiHinh", "maMoHinh", "tenMoHinh", "congXuatThietKe",
				"tongDauNoiThietKe", "soNguoiCapThietKe", "tinhTrangDuAn",
				"tienDoXayDung", "namXayDung", "namHoanThanh", "ngayVanHanh",
				"boMayVanHanh", "ghiChu", "ngayTao", "idNguoiTao",
				"idNguoiDanhGia", "ngayDanhGia", "trangThaiCapNuoc",
				"congXuatThucTe", "tongDauNoiThucTe", "soNguoiCapThucTe",
				"tongChiPhi", "tongDoanhThu", "nuocDatTieuChuan", "nuocCoAsen",
				"nuocThatThoat", "trangThaiDanhGia"
			});
	private static TramCapNuoc _nullTramCapNuoc = new TramCapNuocImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TramCapNuoc> toCacheModel() {
				return _nullTramCapNuocCacheModel;
			}
		};

	private static CacheModel<TramCapNuoc> _nullTramCapNuocCacheModel = new CacheModel<TramCapNuoc>() {
			@Override
			public TramCapNuoc toEntityModel() {
				return _nullTramCapNuoc;
			}
		};
}