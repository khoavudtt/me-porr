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

import vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException;
import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;
import vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCImpl;
import vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the t h o n g t i n k i e m d e m n u o c service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see THONGTINKIEMDEMNUOCPersistence
 * @see THONGTINKIEMDEMNUOCUtil
 * @generated
 */
public class THONGTINKIEMDEMNUOCPersistenceImpl extends BasePersistenceImpl<THONGTINKIEMDEMNUOC>
	implements THONGTINKIEMDEMNUOCPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link THONGTINKIEMDEMNUOCUtil} to access the t h o n g t i n k i e m d e m n u o c persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = THONGTINKIEMDEMNUOCImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_DAUNOINUOCID =
		new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_dauNoiNuocId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DAUNOINUOCID =
		new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_dauNoiNuocId",
			new String[] { Long.class.getName() },
			THONGTINKIEMDEMNUOCModelImpl.DAUNOINUOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_DAUNOINUOCID = new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_dauNoiNuocId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63;.
	 *
	 * @param dauNoiNuocId the dau noi nuoc ID
	 * @return the matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findByD_dauNoiNuocId(long dauNoiNuocId)
		throws SystemException {
		return findByD_dauNoiNuocId(dauNoiNuocId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dauNoiNuocId the dau noi nuoc ID
	 * @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	 * @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	 * @return the range of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findByD_dauNoiNuocId(long dauNoiNuocId,
		int start, int end) throws SystemException {
		return findByD_dauNoiNuocId(dauNoiNuocId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dauNoiNuocId the dau noi nuoc ID
	 * @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	 * @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findByD_dauNoiNuocId(long dauNoiNuocId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DAUNOINUOCID;
			finderArgs = new Object[] { dauNoiNuocId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_DAUNOINUOCID;
			finderArgs = new Object[] {
					dauNoiNuocId,
					
					start, end, orderByComparator
				};
		}

		List<THONGTINKIEMDEMNUOC> list = (List<THONGTINKIEMDEMNUOC>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : list) {
				if ((dauNoiNuocId != thongtinkiemdemnuoc.getDauNoiNuocId())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMNUOC_WHERE);

			query.append(_FINDER_COLUMN_D_DAUNOINUOCID_DAUNOINUOCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGTINKIEMDEMNUOCModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dauNoiNuocId);

				if (!pagination) {
					list = (List<THONGTINKIEMDEMNUOC>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGTINKIEMDEMNUOC>(list);
				}
				else {
					list = (List<THONGTINKIEMDEMNUOC>)QueryUtil.list(q,
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
	 * Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	 *
	 * @param dauNoiNuocId the dau noi nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC findByD_dauNoiNuocId_First(long dauNoiNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = fetchByD_dauNoiNuocId_First(dauNoiNuocId,
				orderByComparator);

		if (thongtinkiemdemnuoc != null) {
			return thongtinkiemdemnuoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dauNoiNuocId=");
		msg.append(dauNoiNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGTINKIEMDEMNUOCException(msg.toString());
	}

	/**
	 * Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	 *
	 * @param dauNoiNuocId the dau noi nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC fetchByD_dauNoiNuocId_First(long dauNoiNuocId,
		OrderByComparator orderByComparator) throws SystemException {
		List<THONGTINKIEMDEMNUOC> list = findByD_dauNoiNuocId(dauNoiNuocId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	 *
	 * @param dauNoiNuocId the dau noi nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC findByD_dauNoiNuocId_Last(long dauNoiNuocId,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = fetchByD_dauNoiNuocId_Last(dauNoiNuocId,
				orderByComparator);

		if (thongtinkiemdemnuoc != null) {
			return thongtinkiemdemnuoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dauNoiNuocId=");
		msg.append(dauNoiNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGTINKIEMDEMNUOCException(msg.toString());
	}

	/**
	 * Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	 *
	 * @param dauNoiNuocId the dau noi nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC fetchByD_dauNoiNuocId_Last(long dauNoiNuocId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_dauNoiNuocId(dauNoiNuocId);

		if (count == 0) {
			return null;
		}

		List<THONGTINKIEMDEMNUOC> list = findByD_dauNoiNuocId(dauNoiNuocId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where dauNoiNuocId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	 * @param dauNoiNuocId the dau noi nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC[] findByD_dauNoiNuocId_PrevAndNext(long id,
		long dauNoiNuocId, OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGTINKIEMDEMNUOC[] array = new THONGTINKIEMDEMNUOCImpl[3];

			array[0] = getByD_dauNoiNuocId_PrevAndNext(session,
					thongtinkiemdemnuoc, dauNoiNuocId, orderByComparator, true);

			array[1] = thongtinkiemdemnuoc;

			array[2] = getByD_dauNoiNuocId_PrevAndNext(session,
					thongtinkiemdemnuoc, dauNoiNuocId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected THONGTINKIEMDEMNUOC getByD_dauNoiNuocId_PrevAndNext(
		Session session, THONGTINKIEMDEMNUOC thongtinkiemdemnuoc,
		long dauNoiNuocId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMNUOC_WHERE);

		query.append(_FINDER_COLUMN_D_DAUNOINUOCID_DAUNOINUOCID_2);

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
			query.append(THONGTINKIEMDEMNUOCModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dauNoiNuocId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongtinkiemdemnuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGTINKIEMDEMNUOC> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63; from the database.
	 *
	 * @param dauNoiNuocId the dau noi nuoc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_dauNoiNuocId(long dauNoiNuocId)
		throws SystemException {
		for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : findByD_dauNoiNuocId(
				dauNoiNuocId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongtinkiemdemnuoc);
		}
	}

	/**
	 * Returns the number of t h o n g t i n k i e m d e m n u o cs where dauNoiNuocId = &#63;.
	 *
	 * @param dauNoiNuocId the dau noi nuoc ID
	 * @return the number of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_dauNoiNuocId(long dauNoiNuocId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_DAUNOINUOCID;

		Object[] finderArgs = new Object[] { dauNoiNuocId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGTINKIEMDEMNUOC_WHERE);

			query.append(_FINDER_COLUMN_D_DAUNOINUOCID_DAUNOINUOCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dauNoiNuocId);

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

	private static final String _FINDER_COLUMN_D_DAUNOINUOCID_DAUNOINUOCID_2 = "thongtinkiemdemnuoc.dauNoiNuocId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID =
		new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByD_keHoachKiemDemNuocId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID =
		new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByD_keHoachKiemDemNuocId",
			new String[] { Integer.class.getName() },
			THONGTINKIEMDEMNUOCModelImpl.KEHOACHKIEMDEMNUOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_KEHOACHKIEMDEMNUOCID = new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByD_keHoachKiemDemNuocId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @return the matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId(
		int keHoachKiemDemNuocId) throws SystemException {
		return findByD_keHoachKiemDemNuocId(keHoachKiemDemNuocId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	 * @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	 * @return the range of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId(
		int keHoachKiemDemNuocId, int start, int end) throws SystemException {
		return findByD_keHoachKiemDemNuocId(keHoachKiemDemNuocId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	 * @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId(
		int keHoachKiemDemNuocId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID;
			finderArgs = new Object[] { keHoachKiemDemNuocId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID;
			finderArgs = new Object[] {
					keHoachKiemDemNuocId,
					
					start, end, orderByComparator
				};
		}

		List<THONGTINKIEMDEMNUOC> list = (List<THONGTINKIEMDEMNUOC>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : list) {
				if ((keHoachKiemDemNuocId != thongtinkiemdemnuoc.getKeHoachKiemDemNuocId())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMNUOC_WHERE);

			query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_KEHOACHKIEMDEMNUOCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGTINKIEMDEMNUOCModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemNuocId);

				if (!pagination) {
					list = (List<THONGTINKIEMDEMNUOC>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGTINKIEMDEMNUOC>(list);
				}
				else {
					list = (List<THONGTINKIEMDEMNUOC>)QueryUtil.list(q,
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
	 * Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_First(
		int keHoachKiemDemNuocId, OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = fetchByD_keHoachKiemDemNuocId_First(keHoachKiemDemNuocId,
				orderByComparator);

		if (thongtinkiemdemnuoc != null) {
			return thongtinkiemdemnuoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemNuocId=");
		msg.append(keHoachKiemDemNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGTINKIEMDEMNUOCException(msg.toString());
	}

	/**
	 * Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_First(
		int keHoachKiemDemNuocId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGTINKIEMDEMNUOC> list = findByD_keHoachKiemDemNuocId(keHoachKiemDemNuocId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_Last(
		int keHoachKiemDemNuocId, OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = fetchByD_keHoachKiemDemNuocId_Last(keHoachKiemDemNuocId,
				orderByComparator);

		if (thongtinkiemdemnuoc != null) {
			return thongtinkiemdemnuoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemNuocId=");
		msg.append(keHoachKiemDemNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGTINKIEMDEMNUOCException(msg.toString());
	}

	/**
	 * Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_Last(
		int keHoachKiemDemNuocId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByD_keHoachKiemDemNuocId(keHoachKiemDemNuocId);

		if (count == 0) {
			return null;
		}

		List<THONGTINKIEMDEMNUOC> list = findByD_keHoachKiemDemNuocId(keHoachKiemDemNuocId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC[] findByD_keHoachKiemDemNuocId_PrevAndNext(
		long id, int keHoachKiemDemNuocId, OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGTINKIEMDEMNUOC[] array = new THONGTINKIEMDEMNUOCImpl[3];

			array[0] = getByD_keHoachKiemDemNuocId_PrevAndNext(session,
					thongtinkiemdemnuoc, keHoachKiemDemNuocId,
					orderByComparator, true);

			array[1] = thongtinkiemdemnuoc;

			array[2] = getByD_keHoachKiemDemNuocId_PrevAndNext(session,
					thongtinkiemdemnuoc, keHoachKiemDemNuocId,
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

	protected THONGTINKIEMDEMNUOC getByD_keHoachKiemDemNuocId_PrevAndNext(
		Session session, THONGTINKIEMDEMNUOC thongtinkiemdemnuoc,
		int keHoachKiemDemNuocId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMNUOC_WHERE);

		query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_KEHOACHKIEMDEMNUOCID_2);

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
			query.append(THONGTINKIEMDEMNUOCModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemNuocId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongtinkiemdemnuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGTINKIEMDEMNUOC> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; from the database.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_keHoachKiemDemNuocId(int keHoachKiemDemNuocId)
		throws SystemException {
		for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : findByD_keHoachKiemDemNuocId(
				keHoachKiemDemNuocId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongtinkiemdemnuoc);
		}
	}

	/**
	 * Returns the number of t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @return the number of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_keHoachKiemDemNuocId(int keHoachKiemDemNuocId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_KEHOACHKIEMDEMNUOCID;

		Object[] finderArgs = new Object[] { keHoachKiemDemNuocId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGTINKIEMDEMNUOC_WHERE);

			query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_KEHOACHKIEMDEMNUOCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemNuocId);

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

	private static final String _FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_KEHOACHKIEMDEMNUOCID_2 =
		"thongtinkiemdemnuoc.keHoachKiemDemNuocId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA =
		new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByD_keHoachKiemDemNuocId_daKetThucDieuTra",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA =
		new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByD_keHoachKiemDemNuocId_daKetThucDieuTra",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			THONGTINKIEMDEMNUOCModelImpl.KEHOACHKIEMDEMNUOCID_COLUMN_BITMASK |
			THONGTINKIEMDEMNUOCModelImpl.DAKETTHUCDIEUTRA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA =
		new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByD_keHoachKiemDemNuocId_daKetThucDieuTra",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @return the matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra)
		throws SystemException {
		return findByD_keHoachKiemDemNuocId_daKetThucDieuTra(keHoachKiemDemNuocId,
			daKetThucDieuTra, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	 * @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	 * @return the range of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra, int start, int end)
		throws SystemException {
		return findByD_keHoachKiemDemNuocId_daKetThucDieuTra(keHoachKiemDemNuocId,
			daKetThucDieuTra, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	 * @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA;
			finderArgs = new Object[] { keHoachKiemDemNuocId, daKetThucDieuTra };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA;
			finderArgs = new Object[] {
					keHoachKiemDemNuocId, daKetThucDieuTra,
					
					start, end, orderByComparator
				};
		}

		List<THONGTINKIEMDEMNUOC> list = (List<THONGTINKIEMDEMNUOC>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : list) {
				if ((keHoachKiemDemNuocId != thongtinkiemdemnuoc.getKeHoachKiemDemNuocId()) ||
						(daKetThucDieuTra != thongtinkiemdemnuoc.getDaKetThucDieuTra())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMNUOC_WHERE);

			query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA_KEHOACHKIEMDEMNUOCID_2);

			query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA_DAKETTHUCDIEUTRA_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGTINKIEMDEMNUOCModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemNuocId);

				qPos.add(daKetThucDieuTra);

				if (!pagination) {
					list = (List<THONGTINKIEMDEMNUOC>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGTINKIEMDEMNUOC>(list);
				}
				else {
					list = (List<THONGTINKIEMDEMNUOC>)QueryUtil.list(q,
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
	 * Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_daKetThucDieuTra_First(
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = fetchByD_keHoachKiemDemNuocId_daKetThucDieuTra_First(keHoachKiemDemNuocId,
				daKetThucDieuTra, orderByComparator);

		if (thongtinkiemdemnuoc != null) {
			return thongtinkiemdemnuoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemNuocId=");
		msg.append(keHoachKiemDemNuocId);

		msg.append(", daKetThucDieuTra=");
		msg.append(daKetThucDieuTra);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGTINKIEMDEMNUOCException(msg.toString());
	}

	/**
	 * Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_daKetThucDieuTra_First(
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		OrderByComparator orderByComparator) throws SystemException {
		List<THONGTINKIEMDEMNUOC> list = findByD_keHoachKiemDemNuocId_daKetThucDieuTra(keHoachKiemDemNuocId,
				daKetThucDieuTra, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_daKetThucDieuTra_Last(
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = fetchByD_keHoachKiemDemNuocId_daKetThucDieuTra_Last(keHoachKiemDemNuocId,
				daKetThucDieuTra, orderByComparator);

		if (thongtinkiemdemnuoc != null) {
			return thongtinkiemdemnuoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemNuocId=");
		msg.append(keHoachKiemDemNuocId);

		msg.append(", daKetThucDieuTra=");
		msg.append(daKetThucDieuTra);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGTINKIEMDEMNUOCException(msg.toString());
	}

	/**
	 * Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_daKetThucDieuTra_Last(
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_keHoachKiemDemNuocId_daKetThucDieuTra(keHoachKiemDemNuocId,
				daKetThucDieuTra);

		if (count == 0) {
			return null;
		}

		List<THONGTINKIEMDEMNUOC> list = findByD_keHoachKiemDemNuocId_daKetThucDieuTra(keHoachKiemDemNuocId,
				daKetThucDieuTra, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC[] findByD_keHoachKiemDemNuocId_daKetThucDieuTra_PrevAndNext(
		long id, int keHoachKiemDemNuocId, int daKetThucDieuTra,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGTINKIEMDEMNUOC[] array = new THONGTINKIEMDEMNUOCImpl[3];

			array[0] = getByD_keHoachKiemDemNuocId_daKetThucDieuTra_PrevAndNext(session,
					thongtinkiemdemnuoc, keHoachKiemDemNuocId,
					daKetThucDieuTra, orderByComparator, true);

			array[1] = thongtinkiemdemnuoc;

			array[2] = getByD_keHoachKiemDemNuocId_daKetThucDieuTra_PrevAndNext(session,
					thongtinkiemdemnuoc, keHoachKiemDemNuocId,
					daKetThucDieuTra, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected THONGTINKIEMDEMNUOC getByD_keHoachKiemDemNuocId_daKetThucDieuTra_PrevAndNext(
		Session session, THONGTINKIEMDEMNUOC thongtinkiemdemnuoc,
		int keHoachKiemDemNuocId, int daKetThucDieuTra,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMNUOC_WHERE);

		query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA_KEHOACHKIEMDEMNUOCID_2);

		query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA_DAKETTHUCDIEUTRA_2);

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
			query.append(THONGTINKIEMDEMNUOCModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemNuocId);

		qPos.add(daKetThucDieuTra);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongtinkiemdemnuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGTINKIEMDEMNUOC> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63; from the database.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra)
		throws SystemException {
		for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : findByD_keHoachKiemDemNuocId_daKetThucDieuTra(
				keHoachKiemDemNuocId, daKetThucDieuTra, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(thongtinkiemdemnuoc);
		}
	}

	/**
	 * Returns the number of t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @return the number of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_keHoachKiemDemNuocId_daKetThucDieuTra(
		int keHoachKiemDemNuocId, int daKetThucDieuTra)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA;

		Object[] finderArgs = new Object[] {
				keHoachKiemDemNuocId, daKetThucDieuTra
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_THONGTINKIEMDEMNUOC_WHERE);

			query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA_KEHOACHKIEMDEMNUOCID_2);

			query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA_DAKETTHUCDIEUTRA_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemNuocId);

				qPos.add(daKetThucDieuTra);

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

	private static final String _FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA_KEHOACHKIEMDEMNUOCID_2 =
		"thongtinkiemdemnuoc.keHoachKiemDemNuocId = ? AND ";
	private static final String _FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA_DAKETTHUCDIEUTRA_2 =
		"thongtinkiemdemnuoc.daKetThucDieuTra = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM =
		new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByD_keHoachKiemDemNuocId_danhGiaKiemDem",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM =
		new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByD_keHoachKiemDemNuocId_danhGiaKiemDem",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			THONGTINKIEMDEMNUOCModelImpl.KEHOACHKIEMDEMNUOCID_COLUMN_BITMASK |
			THONGTINKIEMDEMNUOCModelImpl.DANHGIAKIEMDEM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM =
		new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByD_keHoachKiemDemNuocId_danhGiaKiemDem",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @return the matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem) throws SystemException {
		return findByD_keHoachKiemDemNuocId_danhGiaKiemDem(keHoachKiemDemNuocId,
			danhGiaKiemDem, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	 * @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	 * @return the range of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem, int start, int end)
		throws SystemException {
		return findByD_keHoachKiemDemNuocId_danhGiaKiemDem(keHoachKiemDemNuocId,
			danhGiaKiemDem, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	 * @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM;
			finderArgs = new Object[] { keHoachKiemDemNuocId, danhGiaKiemDem };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM;
			finderArgs = new Object[] {
					keHoachKiemDemNuocId, danhGiaKiemDem,
					
					start, end, orderByComparator
				};
		}

		List<THONGTINKIEMDEMNUOC> list = (List<THONGTINKIEMDEMNUOC>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : list) {
				if ((keHoachKiemDemNuocId != thongtinkiemdemnuoc.getKeHoachKiemDemNuocId()) ||
						(danhGiaKiemDem != thongtinkiemdemnuoc.getDanhGiaKiemDem())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMNUOC_WHERE);

			query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM_KEHOACHKIEMDEMNUOCID_2);

			query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM_DANHGIAKIEMDEM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGTINKIEMDEMNUOCModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemNuocId);

				qPos.add(danhGiaKiemDem);

				if (!pagination) {
					list = (List<THONGTINKIEMDEMNUOC>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGTINKIEMDEMNUOC>(list);
				}
				else {
					list = (List<THONGTINKIEMDEMNUOC>)QueryUtil.list(q,
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
	 * Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_danhGiaKiemDem_First(
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = fetchByD_keHoachKiemDemNuocId_danhGiaKiemDem_First(keHoachKiemDemNuocId,
				danhGiaKiemDem, orderByComparator);

		if (thongtinkiemdemnuoc != null) {
			return thongtinkiemdemnuoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemNuocId=");
		msg.append(keHoachKiemDemNuocId);

		msg.append(", danhGiaKiemDem=");
		msg.append(danhGiaKiemDem);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGTINKIEMDEMNUOCException(msg.toString());
	}

	/**
	 * Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_danhGiaKiemDem_First(
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		OrderByComparator orderByComparator) throws SystemException {
		List<THONGTINKIEMDEMNUOC> list = findByD_keHoachKiemDemNuocId_danhGiaKiemDem(keHoachKiemDemNuocId,
				danhGiaKiemDem, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC findByD_keHoachKiemDemNuocId_danhGiaKiemDem_Last(
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = fetchByD_keHoachKiemDemNuocId_danhGiaKiemDem_Last(keHoachKiemDemNuocId,
				danhGiaKiemDem, orderByComparator);

		if (thongtinkiemdemnuoc != null) {
			return thongtinkiemdemnuoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemNuocId=");
		msg.append(keHoachKiemDemNuocId);

		msg.append(", danhGiaKiemDem=");
		msg.append(danhGiaKiemDem);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGTINKIEMDEMNUOCException(msg.toString());
	}

	/**
	 * Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC fetchByD_keHoachKiemDemNuocId_danhGiaKiemDem_Last(
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_keHoachKiemDemNuocId_danhGiaKiemDem(keHoachKiemDemNuocId,
				danhGiaKiemDem);

		if (count == 0) {
			return null;
		}

		List<THONGTINKIEMDEMNUOC> list = findByD_keHoachKiemDemNuocId_danhGiaKiemDem(keHoachKiemDemNuocId,
				danhGiaKiemDem, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC[] findByD_keHoachKiemDemNuocId_danhGiaKiemDem_PrevAndNext(
		long id, int keHoachKiemDemNuocId, int danhGiaKiemDem,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGTINKIEMDEMNUOC[] array = new THONGTINKIEMDEMNUOCImpl[3];

			array[0] = getByD_keHoachKiemDemNuocId_danhGiaKiemDem_PrevAndNext(session,
					thongtinkiemdemnuoc, keHoachKiemDemNuocId, danhGiaKiemDem,
					orderByComparator, true);

			array[1] = thongtinkiemdemnuoc;

			array[2] = getByD_keHoachKiemDemNuocId_danhGiaKiemDem_PrevAndNext(session,
					thongtinkiemdemnuoc, keHoachKiemDemNuocId, danhGiaKiemDem,
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

	protected THONGTINKIEMDEMNUOC getByD_keHoachKiemDemNuocId_danhGiaKiemDem_PrevAndNext(
		Session session, THONGTINKIEMDEMNUOC thongtinkiemdemnuoc,
		int keHoachKiemDemNuocId, int danhGiaKiemDem,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMNUOC_WHERE);

		query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM_KEHOACHKIEMDEMNUOCID_2);

		query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM_DANHGIAKIEMDEM_2);

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
			query.append(THONGTINKIEMDEMNUOCModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemNuocId);

		qPos.add(danhGiaKiemDem);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongtinkiemdemnuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGTINKIEMDEMNUOC> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63; from the database.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem) throws SystemException {
		for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : findByD_keHoachKiemDemNuocId_danhGiaKiemDem(
				keHoachKiemDemNuocId, danhGiaKiemDem, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(thongtinkiemdemnuoc);
		}
	}

	/**
	 * Returns the number of t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @return the number of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_keHoachKiemDemNuocId_danhGiaKiemDem(
		int keHoachKiemDemNuocId, int danhGiaKiemDem) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM;

		Object[] finderArgs = new Object[] { keHoachKiemDemNuocId, danhGiaKiemDem };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_THONGTINKIEMDEMNUOC_WHERE);

			query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM_KEHOACHKIEMDEMNUOCID_2);

			query.append(_FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM_DANHGIAKIEMDEM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemNuocId);

				qPos.add(danhGiaKiemDem);

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

	private static final String _FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM_KEHOACHKIEMDEMNUOCID_2 =
		"thongtinkiemdemnuoc.keHoachKiemDemNuocId = ? AND ";
	private static final String _FINDER_COLUMN_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM_DANHGIAKIEMDEM_2 =
		"thongtinkiemdemnuoc.danhGiaKiemDem = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__COUNTDAUNOIBYKEHOACH =
		new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_CountDauNoiByKeHoach",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTDAUNOIBYKEHOACH =
		new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_CountDauNoiByKeHoach",
			new String[] { Integer.class.getName() },
			THONGTINKIEMDEMNUOCModelImpl.KEHOACHKIEMDEMNUOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__COUNTDAUNOIBYKEHOACH = new FinderPath(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBy_CountDauNoiByKeHoach",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @return the matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findBy_CountDauNoiByKeHoach(
		int keHoachKiemDemNuocId) throws SystemException {
		return findBy_CountDauNoiByKeHoach(keHoachKiemDemNuocId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	 * @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	 * @return the range of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findBy_CountDauNoiByKeHoach(
		int keHoachKiemDemNuocId, int start, int end) throws SystemException {
		return findBy_CountDauNoiByKeHoach(keHoachKiemDemNuocId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	 * @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findBy_CountDauNoiByKeHoach(
		int keHoachKiemDemNuocId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTDAUNOIBYKEHOACH;
			finderArgs = new Object[] { keHoachKiemDemNuocId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__COUNTDAUNOIBYKEHOACH;
			finderArgs = new Object[] {
					keHoachKiemDemNuocId,
					
					start, end, orderByComparator
				};
		}

		List<THONGTINKIEMDEMNUOC> list = (List<THONGTINKIEMDEMNUOC>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : list) {
				if ((keHoachKiemDemNuocId != thongtinkiemdemnuoc.getKeHoachKiemDemNuocId())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMNUOC_WHERE);

			query.append(_FINDER_COLUMN__COUNTDAUNOIBYKEHOACH_KEHOACHKIEMDEMNUOCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGTINKIEMDEMNUOCModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemNuocId);

				if (!pagination) {
					list = (List<THONGTINKIEMDEMNUOC>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGTINKIEMDEMNUOC>(list);
				}
				else {
					list = (List<THONGTINKIEMDEMNUOC>)QueryUtil.list(q,
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
	 * Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC findBy_CountDauNoiByKeHoach_First(
		int keHoachKiemDemNuocId, OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = fetchBy_CountDauNoiByKeHoach_First(keHoachKiemDemNuocId,
				orderByComparator);

		if (thongtinkiemdemnuoc != null) {
			return thongtinkiemdemnuoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemNuocId=");
		msg.append(keHoachKiemDemNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGTINKIEMDEMNUOCException(msg.toString());
	}

	/**
	 * Returns the first t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC fetchBy_CountDauNoiByKeHoach_First(
		int keHoachKiemDemNuocId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGTINKIEMDEMNUOC> list = findBy_CountDauNoiByKeHoach(keHoachKiemDemNuocId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC findBy_CountDauNoiByKeHoach_Last(
		int keHoachKiemDemNuocId, OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = fetchBy_CountDauNoiByKeHoach_Last(keHoachKiemDemNuocId,
				orderByComparator);

		if (thongtinkiemdemnuoc != null) {
			return thongtinkiemdemnuoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemNuocId=");
		msg.append(keHoachKiemDemNuocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGTINKIEMDEMNUOCException(msg.toString());
	}

	/**
	 * Returns the last t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a matching t h o n g t i n k i e m d e m n u o c could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC fetchBy_CountDauNoiByKeHoach_Last(
		int keHoachKiemDemNuocId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBy_CountDauNoiByKeHoach(keHoachKiemDemNuocId);

		if (count == 0) {
			return null;
		}

		List<THONGTINKIEMDEMNUOC> list = findBy_CountDauNoiByKeHoach(keHoachKiemDemNuocId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g t i n k i e m d e m n u o cs before and after the current t h o n g t i n k i e m d e m n u o c in the ordered set where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g t i n k i e m d e m n u o c
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC[] findBy_CountDauNoiByKeHoach_PrevAndNext(
		long id, int keHoachKiemDemNuocId, OrderByComparator orderByComparator)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGTINKIEMDEMNUOC[] array = new THONGTINKIEMDEMNUOCImpl[3];

			array[0] = getBy_CountDauNoiByKeHoach_PrevAndNext(session,
					thongtinkiemdemnuoc, keHoachKiemDemNuocId,
					orderByComparator, true);

			array[1] = thongtinkiemdemnuoc;

			array[2] = getBy_CountDauNoiByKeHoach_PrevAndNext(session,
					thongtinkiemdemnuoc, keHoachKiemDemNuocId,
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

	protected THONGTINKIEMDEMNUOC getBy_CountDauNoiByKeHoach_PrevAndNext(
		Session session, THONGTINKIEMDEMNUOC thongtinkiemdemnuoc,
		int keHoachKiemDemNuocId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMNUOC_WHERE);

		query.append(_FINDER_COLUMN__COUNTDAUNOIBYKEHOACH_KEHOACHKIEMDEMNUOCID_2);

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
			query.append(THONGTINKIEMDEMNUOCModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemNuocId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongtinkiemdemnuoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGTINKIEMDEMNUOC> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63; from the database.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_CountDauNoiByKeHoach(int keHoachKiemDemNuocId)
		throws SystemException {
		for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : findBy_CountDauNoiByKeHoach(
				keHoachKiemDemNuocId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongtinkiemdemnuoc);
		}
	}

	/**
	 * Returns the number of t h o n g t i n k i e m d e m n u o cs where keHoachKiemDemNuocId = &#63;.
	 *
	 * @param keHoachKiemDemNuocId the ke hoach kiem dem nuoc ID
	 * @return the number of matching t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_CountDauNoiByKeHoach(int keHoachKiemDemNuocId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__COUNTDAUNOIBYKEHOACH;

		Object[] finderArgs = new Object[] { keHoachKiemDemNuocId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGTINKIEMDEMNUOC_WHERE);

			query.append(_FINDER_COLUMN__COUNTDAUNOIBYKEHOACH_KEHOACHKIEMDEMNUOCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemNuocId);

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

	private static final String _FINDER_COLUMN__COUNTDAUNOIBYKEHOACH_KEHOACHKIEMDEMNUOCID_2 =
		"thongtinkiemdemnuoc.keHoachKiemDemNuocId = ? AND  ( thongtinkiemdemnuoc.daKetThucDieuTra = 0 OR thongtinkiemdemnuoc.daKetThucDieuTra = 1 OR thongtinkiemdemnuoc.daKetThucDieuTra = 2 ) ";

	public THONGTINKIEMDEMNUOCPersistenceImpl() {
		setModelClass(THONGTINKIEMDEMNUOC.class);
	}

	/**
	 * Caches the t h o n g t i n k i e m d e m n u o c in the entity cache if it is enabled.
	 *
	 * @param thongtinkiemdemnuoc the t h o n g t i n k i e m d e m n u o c
	 */
	@Override
	public void cacheResult(THONGTINKIEMDEMNUOC thongtinkiemdemnuoc) {
		EntityCacheUtil.putResult(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class, thongtinkiemdemnuoc.getPrimaryKey(),
			thongtinkiemdemnuoc);

		thongtinkiemdemnuoc.resetOriginalValues();
	}

	/**
	 * Caches the t h o n g t i n k i e m d e m n u o cs in the entity cache if it is enabled.
	 *
	 * @param thongtinkiemdemnuocs the t h o n g t i n k i e m d e m n u o cs
	 */
	@Override
	public void cacheResult(List<THONGTINKIEMDEMNUOC> thongtinkiemdemnuocs) {
		for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : thongtinkiemdemnuocs) {
			if (EntityCacheUtil.getResult(
						THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
						THONGTINKIEMDEMNUOCImpl.class,
						thongtinkiemdemnuoc.getPrimaryKey()) == null) {
				cacheResult(thongtinkiemdemnuoc);
			}
			else {
				thongtinkiemdemnuoc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t h o n g t i n k i e m d e m n u o cs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(THONGTINKIEMDEMNUOCImpl.class.getName());
		}

		EntityCacheUtil.clearCache(THONGTINKIEMDEMNUOCImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t h o n g t i n k i e m d e m n u o c.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(THONGTINKIEMDEMNUOC thongtinkiemdemnuoc) {
		EntityCacheUtil.removeResult(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class, thongtinkiemdemnuoc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<THONGTINKIEMDEMNUOC> thongtinkiemdemnuocs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : thongtinkiemdemnuocs) {
			EntityCacheUtil.removeResult(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
				THONGTINKIEMDEMNUOCImpl.class,
				thongtinkiemdemnuoc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t h o n g t i n k i e m d e m n u o c with the primary key. Does not add the t h o n g t i n k i e m d e m n u o c to the database.
	 *
	 * @param id the primary key for the new t h o n g t i n k i e m d e m n u o c
	 * @return the new t h o n g t i n k i e m d e m n u o c
	 */
	@Override
	public THONGTINKIEMDEMNUOC create(long id) {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = new THONGTINKIEMDEMNUOCImpl();

		thongtinkiemdemnuoc.setNew(true);
		thongtinkiemdemnuoc.setPrimaryKey(id);

		return thongtinkiemdemnuoc;
	}

	/**
	 * Removes the t h o n g t i n k i e m d e m n u o c with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the t h o n g t i n k i e m d e m n u o c
	 * @return the t h o n g t i n k i e m d e m n u o c that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC remove(long id)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the t h o n g t i n k i e m d e m n u o c with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t h o n g t i n k i e m d e m n u o c
	 * @return the t h o n g t i n k i e m d e m n u o c that was removed
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC remove(Serializable primaryKey)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		Session session = null;

		try {
			session = openSession();

			THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = (THONGTINKIEMDEMNUOC)session.get(THONGTINKIEMDEMNUOCImpl.class,
					primaryKey);

			if (thongtinkiemdemnuoc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTHONGTINKIEMDEMNUOCException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thongtinkiemdemnuoc);
		}
		catch (NoSuchTHONGTINKIEMDEMNUOCException nsee) {
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
	protected THONGTINKIEMDEMNUOC removeImpl(
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc) throws SystemException {
		thongtinkiemdemnuoc = toUnwrappedModel(thongtinkiemdemnuoc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thongtinkiemdemnuoc)) {
				thongtinkiemdemnuoc = (THONGTINKIEMDEMNUOC)session.get(THONGTINKIEMDEMNUOCImpl.class,
						thongtinkiemdemnuoc.getPrimaryKeyObj());
			}

			if (thongtinkiemdemnuoc != null) {
				session.delete(thongtinkiemdemnuoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thongtinkiemdemnuoc != null) {
			clearCache(thongtinkiemdemnuoc);
		}

		return thongtinkiemdemnuoc;
	}

	@Override
	public THONGTINKIEMDEMNUOC updateImpl(
		vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC thongtinkiemdemnuoc)
		throws SystemException {
		thongtinkiemdemnuoc = toUnwrappedModel(thongtinkiemdemnuoc);

		boolean isNew = thongtinkiemdemnuoc.isNew();

		THONGTINKIEMDEMNUOCModelImpl thongtinkiemdemnuocModelImpl = (THONGTINKIEMDEMNUOCModelImpl)thongtinkiemdemnuoc;

		Session session = null;

		try {
			session = openSession();

			if (thongtinkiemdemnuoc.isNew()) {
				session.save(thongtinkiemdemnuoc);

				thongtinkiemdemnuoc.setNew(false);
			}
			else {
				session.merge(thongtinkiemdemnuoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !THONGTINKIEMDEMNUOCModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((thongtinkiemdemnuocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DAUNOINUOCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongtinkiemdemnuocModelImpl.getOriginalDauNoiNuocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_DAUNOINUOCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DAUNOINUOCID,
					args);

				args = new Object[] {
						thongtinkiemdemnuocModelImpl.getDauNoiNuocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_DAUNOINUOCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DAUNOINUOCID,
					args);
			}

			if ((thongtinkiemdemnuocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongtinkiemdemnuocModelImpl.getOriginalKeHoachKiemDemNuocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_KEHOACHKIEMDEMNUOCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID,
					args);

				args = new Object[] {
						thongtinkiemdemnuocModelImpl.getKeHoachKiemDemNuocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_KEHOACHKIEMDEMNUOCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID,
					args);
			}

			if ((thongtinkiemdemnuocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongtinkiemdemnuocModelImpl.getOriginalKeHoachKiemDemNuocId(),
						thongtinkiemdemnuocModelImpl.getOriginalDaKetThucDieuTra()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA,
					args);

				args = new Object[] {
						thongtinkiemdemnuocModelImpl.getKeHoachKiemDemNuocId(),
						thongtinkiemdemnuocModelImpl.getDaKetThucDieuTra()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DAKETTHUCDIEUTRA,
					args);
			}

			if ((thongtinkiemdemnuocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongtinkiemdemnuocModelImpl.getOriginalKeHoachKiemDemNuocId(),
						thongtinkiemdemnuocModelImpl.getOriginalDanhGiaKiemDem()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM,
					args);

				args = new Object[] {
						thongtinkiemdemnuocModelImpl.getKeHoachKiemDemNuocId(),
						thongtinkiemdemnuocModelImpl.getDanhGiaKiemDem()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_KEHOACHKIEMDEMNUOCID_DANHGIAKIEMDEM,
					args);
			}

			if ((thongtinkiemdemnuocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTDAUNOIBYKEHOACH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongtinkiemdemnuocModelImpl.getOriginalKeHoachKiemDemNuocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__COUNTDAUNOIBYKEHOACH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTDAUNOIBYKEHOACH,
					args);

				args = new Object[] {
						thongtinkiemdemnuocModelImpl.getKeHoachKiemDemNuocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__COUNTDAUNOIBYKEHOACH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTDAUNOIBYKEHOACH,
					args);
			}
		}

		EntityCacheUtil.putResult(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
			THONGTINKIEMDEMNUOCImpl.class, thongtinkiemdemnuoc.getPrimaryKey(),
			thongtinkiemdemnuoc);

		return thongtinkiemdemnuoc;
	}

	protected THONGTINKIEMDEMNUOC toUnwrappedModel(
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc) {
		if (thongtinkiemdemnuoc instanceof THONGTINKIEMDEMNUOCImpl) {
			return thongtinkiemdemnuoc;
		}

		THONGTINKIEMDEMNUOCImpl thongtinkiemdemnuocImpl = new THONGTINKIEMDEMNUOCImpl();

		thongtinkiemdemnuocImpl.setNew(thongtinkiemdemnuoc.isNew());
		thongtinkiemdemnuocImpl.setPrimaryKey(thongtinkiemdemnuoc.getPrimaryKey());

		thongtinkiemdemnuocImpl.setId(thongtinkiemdemnuoc.getId());
		thongtinkiemdemnuocImpl.setDauNoiNuocId(thongtinkiemdemnuoc.getDauNoiNuocId());
		thongtinkiemdemnuocImpl.setKeHoachKiemDemNuocId(thongtinkiemdemnuoc.getKeHoachKiemDemNuocId());
		thongtinkiemdemnuocImpl.setMaTinh(thongtinkiemdemnuoc.getMaTinh());
		thongtinkiemdemnuocImpl.setMaHuyen(thongtinkiemdemnuoc.getMaHuyen());
		thongtinkiemdemnuocImpl.setMaXa(thongtinkiemdemnuoc.getMaXa());
		thongtinkiemdemnuocImpl.setThonXom(thongtinkiemdemnuoc.getThonXom());
		thongtinkiemdemnuocImpl.setTenChuHo(thongtinkiemdemnuoc.getTenChuHo());
		thongtinkiemdemnuocImpl.setGioiTinhChuHo(thongtinkiemdemnuoc.getGioiTinhChuHo());
		thongtinkiemdemnuocImpl.setNgayKiemDem(thongtinkiemdemnuoc.getNgayKiemDem());
		thongtinkiemdemnuocImpl.setTimThayNha(thongtinkiemdemnuoc.getTimThayNha());
		thongtinkiemdemnuocImpl.setCoNguoiONha(thongtinkiemdemnuoc.getCoNguoiONha());
		thongtinkiemdemnuocImpl.setHoTenNguoiTraLoi(thongtinkiemdemnuoc.getHoTenNguoiTraLoi());
		thongtinkiemdemnuocImpl.setLaChuHoKhong(thongtinkiemdemnuoc.getLaChuHoKhong());
		thongtinkiemdemnuocImpl.setGioiTinhNguoiTraLoi(thongtinkiemdemnuoc.getGioiTinhNguoiTraLoi());
		thongtinkiemdemnuocImpl.setTenDanToc(thongtinkiemdemnuoc.getTenDanToc());
		thongtinkiemdemnuocImpl.setKinhDo(thongtinkiemdemnuoc.getKinhDo());
		thongtinkiemdemnuocImpl.setViDo(thongtinkiemdemnuoc.getViDo());
		thongtinkiemdemnuocImpl.setSoNguoiTrongHo(thongtinkiemdemnuoc.getSoNguoiTrongHo());
		thongtinkiemdemnuocImpl.setThanhPhanHoGd(thongtinkiemdemnuoc.getThanhPhanHoGd());
		thongtinkiemdemnuocImpl.setChuHoDungDs(thongtinkiemdemnuoc.getChuHoDungDs());
		thongtinkiemdemnuocImpl.setLyDoKhongDungDs(thongtinkiemdemnuoc.getLyDoKhongDungDs());
		thongtinkiemdemnuocImpl.setTenChuHoHienTai(thongtinkiemdemnuoc.getTenChuHoHienTai());
		thongtinkiemdemnuocImpl.setGioiTinhChuHoHienTai(thongtinkiemdemnuoc.getGioiTinhChuHoHienTai());
		thongtinkiemdemnuocImpl.setDauNoiChua(thongtinkiemdemnuoc.getDauNoiChua());
		thongtinkiemdemnuocImpl.setAnhDauNoi(thongtinkiemdemnuoc.getAnhDauNoi());
		thongtinkiemdemnuocImpl.setThoiGianDauHopDong(thongtinkiemdemnuoc.getThoiGianDauHopDong());
		thongtinkiemdemnuocImpl.setThoiGianDauNoiThucTe(thongtinkiemdemnuoc.getThoiGianDauNoiThucTe());
		thongtinkiemdemnuocImpl.setVoiNuocChayKhong(thongtinkiemdemnuoc.getVoiNuocChayKhong());
		thongtinkiemdemnuocImpl.setNuocTrongKhong(thongtinkiemdemnuoc.getNuocTrongKhong());
		thongtinkiemdemnuocImpl.setMauNuoc(thongtinkiemdemnuoc.getMauNuoc());
		thongtinkiemdemnuocImpl.setMuiNuoc(thongtinkiemdemnuoc.getMuiNuoc());
		thongtinkiemdemnuocImpl.setViNuoc(thongtinkiemdemnuoc.getViNuoc());
		thongtinkiemdemnuocImpl.setLoaiKhac(thongtinkiemdemnuoc.getLoaiKhac());
		thongtinkiemdemnuocImpl.setDaTungDucKhong(thongtinkiemdemnuoc.getDaTungDucKhong());
		thongtinkiemdemnuocImpl.setMauNuocTungCo(thongtinkiemdemnuoc.getMauNuocTungCo());
		thongtinkiemdemnuocImpl.setMuiNuocTungCo(thongtinkiemdemnuoc.getMuiNuocTungCo());
		thongtinkiemdemnuocImpl.setViNuocTungCo(thongtinkiemdemnuoc.getViNuocTungCo());
		thongtinkiemdemnuocImpl.setLoaiKhacTungCo(thongtinkiemdemnuoc.getLoaiKhacTungCo());
		thongtinkiemdemnuocImpl.setCoBeChuaNuoc(thongtinkiemdemnuoc.getCoBeChuaNuoc());
		thongtinkiemdemnuocImpl.setTinhTrangBe(thongtinkiemdemnuoc.getTinhTrangBe());
		thongtinkiemdemnuocImpl.setAnhBeChua(thongtinkiemdemnuoc.getAnhBeChua());
		thongtinkiemdemnuocImpl.setBiMatNuoc(thongtinkiemdemnuoc.getBiMatNuoc());
		thongtinkiemdemnuocImpl.setSoLanMatNuoc(thongtinkiemdemnuoc.getSoLanMatNuoc());
		thongtinkiemdemnuocImpl.setSoGioTrungBinh(thongtinkiemdemnuoc.getSoGioTrungBinh());
		thongtinkiemdemnuocImpl.setSoSeRyDongHo(thongtinkiemdemnuoc.getSoSeRyDongHo());
		thongtinkiemdemnuocImpl.setChiSoDongHo(thongtinkiemdemnuoc.getChiSoDongHo());
		thongtinkiemdemnuocImpl.setAnhDongHo(thongtinkiemdemnuoc.getAnhDongHo());
		thongtinkiemdemnuocImpl.setGhiChu(thongtinkiemdemnuoc.getGhiChu());
		thongtinkiemdemnuocImpl.setDaKetThucDieuTra(thongtinkiemdemnuoc.getDaKetThucDieuTra());
		thongtinkiemdemnuocImpl.setLyDoKhongHoanThanh(thongtinkiemdemnuoc.getLyDoKhongHoanThanh());
		thongtinkiemdemnuocImpl.setIMei(thongtinkiemdemnuoc.getIMei());
		thongtinkiemdemnuocImpl.setTaiKhoan(thongtinkiemdemnuoc.getTaiKhoan());
		thongtinkiemdemnuocImpl.setDanhGiaKiemDem(thongtinkiemdemnuoc.getDanhGiaKiemDem());

		return thongtinkiemdemnuocImpl;
	}

	/**
	 * Returns the t h o n g t i n k i e m d e m n u o c with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g t i n k i e m d e m n u o c
	 * @return the t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = fetchByPrimaryKey(primaryKey);

		if (thongtinkiemdemnuoc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTHONGTINKIEMDEMNUOCException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thongtinkiemdemnuoc;
	}

	/**
	 * Returns the t h o n g t i n k i e m d e m n u o c with the primary key or throws a {@link vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException} if it could not be found.
	 *
	 * @param id the primary key of the t h o n g t i n k i e m d e m n u o c
	 * @return the t h o n g t i n k i e m d e m n u o c
	 * @throws vn.dtt.sol.ns.tramcap.dao.NoSuchTHONGTINKIEMDEMNUOCException if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC findByPrimaryKey(long id)
		throws NoSuchTHONGTINKIEMDEMNUOCException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the t h o n g t i n k i e m d e m n u o c with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g t i n k i e m d e m n u o c
	 * @return the t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		THONGTINKIEMDEMNUOC thongtinkiemdemnuoc = (THONGTINKIEMDEMNUOC)EntityCacheUtil.getResult(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
				THONGTINKIEMDEMNUOCImpl.class, primaryKey);

		if (thongtinkiemdemnuoc == _nullTHONGTINKIEMDEMNUOC) {
			return null;
		}

		if (thongtinkiemdemnuoc == null) {
			Session session = null;

			try {
				session = openSession();

				thongtinkiemdemnuoc = (THONGTINKIEMDEMNUOC)session.get(THONGTINKIEMDEMNUOCImpl.class,
						primaryKey);

				if (thongtinkiemdemnuoc != null) {
					cacheResult(thongtinkiemdemnuoc);
				}
				else {
					EntityCacheUtil.putResult(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
						THONGTINKIEMDEMNUOCImpl.class, primaryKey,
						_nullTHONGTINKIEMDEMNUOC);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(THONGTINKIEMDEMNUOCModelImpl.ENTITY_CACHE_ENABLED,
					THONGTINKIEMDEMNUOCImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thongtinkiemdemnuoc;
	}

	/**
	 * Returns the t h o n g t i n k i e m d e m n u o c with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the t h o n g t i n k i e m d e m n u o c
	 * @return the t h o n g t i n k i e m d e m n u o c, or <code>null</code> if a t h o n g t i n k i e m d e m n u o c with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGTINKIEMDEMNUOC fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the t h o n g t i n k i e m d e m n u o cs.
	 *
	 * @return the t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g t i n k i e m d e m n u o cs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	 * @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	 * @return the range of t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g t i n k i e m d e m n u o cs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.tramcap.dao.model.impl.THONGTINKIEMDEMNUOCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g t i n k i e m d e m n u o cs
	 * @param end the upper bound of the range of t h o n g t i n k i e m d e m n u o cs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t h o n g t i n k i e m d e m n u o cs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGTINKIEMDEMNUOC> findAll(int start, int end,
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

		List<THONGTINKIEMDEMNUOC> list = (List<THONGTINKIEMDEMNUOC>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THONGTINKIEMDEMNUOC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THONGTINKIEMDEMNUOC;

				if (pagination) {
					sql = sql.concat(THONGTINKIEMDEMNUOCModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<THONGTINKIEMDEMNUOC>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGTINKIEMDEMNUOC>(list);
				}
				else {
					list = (List<THONGTINKIEMDEMNUOC>)QueryUtil.list(q,
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
	 * Removes all the t h o n g t i n k i e m d e m n u o cs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : findAll()) {
			remove(thongtinkiemdemnuoc);
		}
	}

	/**
	 * Returns the number of t h o n g t i n k i e m d e m n u o cs.
	 *
	 * @return the number of t h o n g t i n k i e m d e m n u o cs
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

				Query q = session.createQuery(_SQL_COUNT_THONGTINKIEMDEMNUOC);

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
	 * Initializes the t h o n g t i n k i e m d e m n u o c persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<THONGTINKIEMDEMNUOC>> listenersList = new ArrayList<ModelListener<THONGTINKIEMDEMNUOC>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<THONGTINKIEMDEMNUOC>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(THONGTINKIEMDEMNUOCImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THONGTINKIEMDEMNUOC = "SELECT thongtinkiemdemnuoc FROM THONGTINKIEMDEMNUOC thongtinkiemdemnuoc";
	private static final String _SQL_SELECT_THONGTINKIEMDEMNUOC_WHERE = "SELECT thongtinkiemdemnuoc FROM THONGTINKIEMDEMNUOC thongtinkiemdemnuoc WHERE ";
	private static final String _SQL_COUNT_THONGTINKIEMDEMNUOC = "SELECT COUNT(thongtinkiemdemnuoc) FROM THONGTINKIEMDEMNUOC thongtinkiemdemnuoc";
	private static final String _SQL_COUNT_THONGTINKIEMDEMNUOC_WHERE = "SELECT COUNT(thongtinkiemdemnuoc) FROM THONGTINKIEMDEMNUOC thongtinkiemdemnuoc WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thongtinkiemdemnuoc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No THONGTINKIEMDEMNUOC exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No THONGTINKIEMDEMNUOC exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(THONGTINKIEMDEMNUOCPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"dauNoiNuocId", "keHoachKiemDemNuocId", "maTinh", "maHuyen",
				"maXa", "thonXom", "tenChuHo", "gioiTinhChuHo", "ngayKiemDem",
				"timThayNha", "coNguoiONha", "hoTenNguoiTraLoi", "laChuHoKhong",
				"gioiTinhNguoiTraLoi", "tenDanToc", "kinhDo", "viDo",
				"soNguoiTrongHo", "thanhPhanHoGd", "chuHoDungDs",
				"lyDoKhongDungDs", "tenChuHoHienTai", "gioiTinhChuHoHienTai",
				"dauNoiChua", "anhDauNoi", "thoiGianDauHopDong",
				"thoiGianDauNoiThucTe", "voiNuocChayKhong", "nuocTrongKhong",
				"mauNuoc", "muiNuoc", "viNuoc", "loaiKhac", "daTungDucKhong",
				"mauNuocTungCo", "muiNuocTungCo", "viNuocTungCo",
				"loaiKhacTungCo", "coBeChuaNuoc", "tinhTrangBe", "anhBeChua",
				"biMatNuoc", "soLanMatNuoc", "soGioTrungBinh", "soSeRyDongHo",
				"chiSoDongHo", "anhDongHo", "ghiChu", "daKetThucDieuTra",
				"lyDoKhongHoanThanh", "iMei", "taiKhoan", "danhGiaKiemDem"
			});
	private static THONGTINKIEMDEMNUOC _nullTHONGTINKIEMDEMNUOC = new THONGTINKIEMDEMNUOCImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<THONGTINKIEMDEMNUOC> toCacheModel() {
				return _nullTHONGTINKIEMDEMNUOCCacheModel;
			}
		};

	private static CacheModel<THONGTINKIEMDEMNUOC> _nullTHONGTINKIEMDEMNUOCCacheModel =
		new CacheModel<THONGTINKIEMDEMNUOC>() {
			@Override
			public THONGTINKIEMDEMNUOC toEntityModel() {
				return _nullTHONGTINKIEMDEMNUOC;
			}
		};
}