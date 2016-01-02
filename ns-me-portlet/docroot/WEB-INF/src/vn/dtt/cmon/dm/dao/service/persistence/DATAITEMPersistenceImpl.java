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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.cmon.dm.dao.NoSuchDATAITEMException;
import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.model.impl.DATAITEMImpl;
import vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the d a t a i t e m service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoa.vu
 * @see DATAITEMPersistence
 * @see DATAITEMUtil
 * @generated
 */
public class DATAITEMPersistenceImpl extends BasePersistenceImpl<DATAITEM>
	implements DATAITEMPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DATAITEMUtil} to access the d a t a i t e m persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DATAITEMImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_G = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_G",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_G",
			new String[] { Long.class.getName() },
			DATAITEMModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DATAITEMModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_G = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_G",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the d a t a i t e ms where dataGroupId = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @return the matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByD_G(long dataGroupId) throws SystemException {
		return findByD_G(dataGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the d a t a i t e ms where dataGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataGroupId the data group ID
	 * @param start the lower bound of the range of d a t a i t e ms
	 * @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	 * @return the range of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByD_G(long dataGroupId, int start, int end)
		throws SystemException {
		return findByD_G(dataGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the d a t a i t e ms where dataGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataGroupId the data group ID
	 * @param start the lower bound of the range of d a t a i t e ms
	 * @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByD_G(long dataGroupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G;
			finderArgs = new Object[] { dataGroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_G;
			finderArgs = new Object[] { dataGroupId, start, end, orderByComparator };
		}

		List<DATAITEM> list = (List<DATAITEM>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DATAITEM dataitem : list) {
				if ((dataGroupId != dataitem.getDataGroupId())) {
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

			query.append(_SQL_SELECT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_D_G_DATAGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DATAITEMModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (!pagination) {
					list = (List<DATAITEM>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DATAITEM>(list);
				}
				else {
					list = (List<DATAITEM>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first d a t a i t e m in the ordered set where dataGroupId = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByD_G_First(long dataGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByD_G_First(dataGroupId, orderByComparator);

		if (dataitem != null) {
			return dataitem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDATAITEMException(msg.toString());
	}

	/**
	 * Returns the first d a t a i t e m in the ordered set where dataGroupId = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByD_G_First(long dataGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DATAITEM> list = findByD_G(dataGroupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last d a t a i t e m in the ordered set where dataGroupId = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByD_G_Last(long dataGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByD_G_Last(dataGroupId, orderByComparator);

		if (dataitem != null) {
			return dataitem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDATAITEMException(msg.toString());
	}

	/**
	 * Returns the last d a t a i t e m in the ordered set where dataGroupId = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByD_G_Last(long dataGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_G(dataGroupId);

		if (count == 0) {
			return null;
		}

		List<DATAITEM> list = findByD_G(dataGroupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the d a t a i t e ms before and after the current d a t a i t e m in the ordered set where dataGroupId = &#63;.
	 *
	 * @param id the primary key of the current d a t a i t e m
	 * @param dataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a d a t a i t e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM[] findByD_G_PrevAndNext(long id, long dataGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DATAITEM[] array = new DATAITEMImpl[3];

			array[0] = getByD_G_PrevAndNext(session, dataitem, dataGroupId,
					orderByComparator, true);

			array[1] = dataitem;

			array[2] = getByD_G_PrevAndNext(session, dataitem, dataGroupId,
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

	protected DATAITEM getByD_G_PrevAndNext(Session session, DATAITEM dataitem,
		long dataGroupId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DATAITEM_WHERE);

		query.append(_FINDER_COLUMN_D_G_DATAGROUPID_2);

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
			query.append(DATAITEMModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dataGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dataitem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DATAITEM> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the d a t a i t e ms where dataGroupId = &#63; from the database.
	 *
	 * @param dataGroupId the data group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_G(long dataGroupId) throws SystemException {
		for (DATAITEM dataitem : findByD_G(dataGroupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dataitem);
		}
	}

	/**
	 * Returns the number of d a t a i t e ms where dataGroupId = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @return the number of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_G(long dataGroupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_G;

		Object[] finderArgs = new Object[] { dataGroupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_D_G_DATAGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

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

	private static final String _FINDER_COLUMN_D_G_DATAGROUPID_2 = "dataitem.dataGroupId = ? AND dataitem.status = 1";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_G_L_1 = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_G_L_1",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_1 =
		new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_G_L_1",
			new String[] { Long.class.getName() },
			DATAITEMModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DATAITEMModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_G_L_1 = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_G_L_1",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the d a t a i t e ms where dataGroupId = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @return the matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByD_G_L_1(long dataGroupId)
		throws SystemException {
		return findByD_G_L_1(dataGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the d a t a i t e ms where dataGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataGroupId the data group ID
	 * @param start the lower bound of the range of d a t a i t e ms
	 * @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	 * @return the range of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByD_G_L_1(long dataGroupId, int start, int end)
		throws SystemException {
		return findByD_G_L_1(dataGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the d a t a i t e ms where dataGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataGroupId the data group ID
	 * @param start the lower bound of the range of d a t a i t e ms
	 * @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByD_G_L_1(long dataGroupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_1;
			finderArgs = new Object[] { dataGroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_G_L_1;
			finderArgs = new Object[] { dataGroupId, start, end, orderByComparator };
		}

		List<DATAITEM> list = (List<DATAITEM>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DATAITEM dataitem : list) {
				if ((dataGroupId != dataitem.getDataGroupId())) {
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

			query.append(_SQL_SELECT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_D_G_L_1_DATAGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DATAITEMModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (!pagination) {
					list = (List<DATAITEM>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DATAITEM>(list);
				}
				else {
					list = (List<DATAITEM>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first d a t a i t e m in the ordered set where dataGroupId = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByD_G_L_1_First(long dataGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByD_G_L_1_First(dataGroupId, orderByComparator);

		if (dataitem != null) {
			return dataitem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDATAITEMException(msg.toString());
	}

	/**
	 * Returns the first d a t a i t e m in the ordered set where dataGroupId = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByD_G_L_1_First(long dataGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DATAITEM> list = findByD_G_L_1(dataGroupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last d a t a i t e m in the ordered set where dataGroupId = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByD_G_L_1_Last(long dataGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByD_G_L_1_Last(dataGroupId, orderByComparator);

		if (dataitem != null) {
			return dataitem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDATAITEMException(msg.toString());
	}

	/**
	 * Returns the last d a t a i t e m in the ordered set where dataGroupId = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByD_G_L_1_Last(long dataGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_G_L_1(dataGroupId);

		if (count == 0) {
			return null;
		}

		List<DATAITEM> list = findByD_G_L_1(dataGroupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the d a t a i t e ms before and after the current d a t a i t e m in the ordered set where dataGroupId = &#63;.
	 *
	 * @param id the primary key of the current d a t a i t e m
	 * @param dataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a d a t a i t e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM[] findByD_G_L_1_PrevAndNext(long id, long dataGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DATAITEM[] array = new DATAITEMImpl[3];

			array[0] = getByD_G_L_1_PrevAndNext(session, dataitem, dataGroupId,
					orderByComparator, true);

			array[1] = dataitem;

			array[2] = getByD_G_L_1_PrevAndNext(session, dataitem, dataGroupId,
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

	protected DATAITEM getByD_G_L_1_PrevAndNext(Session session,
		DATAITEM dataitem, long dataGroupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DATAITEM_WHERE);

		query.append(_FINDER_COLUMN_D_G_L_1_DATAGROUPID_2);

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
			query.append(DATAITEMModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dataGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dataitem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DATAITEM> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the d a t a i t e ms where dataGroupId = &#63; from the database.
	 *
	 * @param dataGroupId the data group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_G_L_1(long dataGroupId) throws SystemException {
		for (DATAITEM dataitem : findByD_G_L_1(dataGroupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dataitem);
		}
	}

	/**
	 * Returns the number of d a t a i t e ms where dataGroupId = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @return the number of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_G_L_1(long dataGroupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_G_L_1;

		Object[] finderArgs = new Object[] { dataGroupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_D_G_L_1_DATAGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

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

	private static final String _FINDER_COLUMN_D_G_L_1_DATAGROUPID_2 = "dataitem.dataGroupId = ? AND dataitem.status = 1 AND dataitem.level = 1";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_G_L_2 = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_G_L_2",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_2 =
		new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_G_L_2",
			new String[] { Long.class.getName(), String.class.getName() },
			DATAITEMModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DATAITEMModelImpl.NODE1_COLUMN_BITMASK |
			DATAITEMModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_G_L_2 = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_G_L_2",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the d a t a i t e ms where dataGroupId = &#63; and node1 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @return the matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByD_G_L_2(long dataGroupId, String node1)
		throws SystemException {
		return findByD_G_L_2(dataGroupId, node1, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the d a t a i t e ms where dataGroupId = &#63; and node1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param start the lower bound of the range of d a t a i t e ms
	 * @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	 * @return the range of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByD_G_L_2(long dataGroupId, String node1,
		int start, int end) throws SystemException {
		return findByD_G_L_2(dataGroupId, node1, start, end, null);
	}

	/**
	 * Returns an ordered range of all the d a t a i t e ms where dataGroupId = &#63; and node1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param start the lower bound of the range of d a t a i t e ms
	 * @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByD_G_L_2(long dataGroupId, String node1,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_2;
			finderArgs = new Object[] { dataGroupId, node1 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_G_L_2;
			finderArgs = new Object[] {
					dataGroupId, node1,
					
					start, end, orderByComparator
				};
		}

		List<DATAITEM> list = (List<DATAITEM>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DATAITEM dataitem : list) {
				if ((dataGroupId != dataitem.getDataGroupId()) ||
						!Validator.equals(node1, dataitem.getNode1())) {
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

			query.append(_SQL_SELECT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_D_G_L_2_DATAGROUPID_2);

			boolean bindNode1 = false;

			if (node1 == null) {
				query.append(_FINDER_COLUMN_D_G_L_2_NODE1_1);
			}
			else if (node1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_G_L_2_NODE1_3);
			}
			else {
				bindNode1 = true;

				query.append(_FINDER_COLUMN_D_G_L_2_NODE1_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DATAITEMModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindNode1) {
					qPos.add(node1);
				}

				if (!pagination) {
					list = (List<DATAITEM>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DATAITEM>(list);
				}
				else {
					list = (List<DATAITEM>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first d a t a i t e m in the ordered set where dataGroupId = &#63; and node1 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByD_G_L_2_First(long dataGroupId, String node1,
		OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByD_G_L_2_First(dataGroupId, node1,
				orderByComparator);

		if (dataitem != null) {
			return dataitem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(", node1=");
		msg.append(node1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDATAITEMException(msg.toString());
	}

	/**
	 * Returns the first d a t a i t e m in the ordered set where dataGroupId = &#63; and node1 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByD_G_L_2_First(long dataGroupId, String node1,
		OrderByComparator orderByComparator) throws SystemException {
		List<DATAITEM> list = findByD_G_L_2(dataGroupId, node1, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last d a t a i t e m in the ordered set where dataGroupId = &#63; and node1 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByD_G_L_2_Last(long dataGroupId, String node1,
		OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByD_G_L_2_Last(dataGroupId, node1,
				orderByComparator);

		if (dataitem != null) {
			return dataitem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(", node1=");
		msg.append(node1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDATAITEMException(msg.toString());
	}

	/**
	 * Returns the last d a t a i t e m in the ordered set where dataGroupId = &#63; and node1 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByD_G_L_2_Last(long dataGroupId, String node1,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_G_L_2(dataGroupId, node1);

		if (count == 0) {
			return null;
		}

		List<DATAITEM> list = findByD_G_L_2(dataGroupId, node1, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the d a t a i t e ms before and after the current d a t a i t e m in the ordered set where dataGroupId = &#63; and node1 = &#63;.
	 *
	 * @param id the primary key of the current d a t a i t e m
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a d a t a i t e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM[] findByD_G_L_2_PrevAndNext(long id, long dataGroupId,
		String node1, OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DATAITEM[] array = new DATAITEMImpl[3];

			array[0] = getByD_G_L_2_PrevAndNext(session, dataitem, dataGroupId,
					node1, orderByComparator, true);

			array[1] = dataitem;

			array[2] = getByD_G_L_2_PrevAndNext(session, dataitem, dataGroupId,
					node1, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DATAITEM getByD_G_L_2_PrevAndNext(Session session,
		DATAITEM dataitem, long dataGroupId, String node1,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DATAITEM_WHERE);

		query.append(_FINDER_COLUMN_D_G_L_2_DATAGROUPID_2);

		boolean bindNode1 = false;

		if (node1 == null) {
			query.append(_FINDER_COLUMN_D_G_L_2_NODE1_1);
		}
		else if (node1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_D_G_L_2_NODE1_3);
		}
		else {
			bindNode1 = true;

			query.append(_FINDER_COLUMN_D_G_L_2_NODE1_2);
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
			query.append(DATAITEMModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dataGroupId);

		if (bindNode1) {
			qPos.add(node1);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dataitem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DATAITEM> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the d a t a i t e ms where dataGroupId = &#63; and node1 = &#63; from the database.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_G_L_2(long dataGroupId, String node1)
		throws SystemException {
		for (DATAITEM dataitem : findByD_G_L_2(dataGroupId, node1,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dataitem);
		}
	}

	/**
	 * Returns the number of d a t a i t e ms where dataGroupId = &#63; and node1 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @return the number of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_G_L_2(long dataGroupId, String node1)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_G_L_2;

		Object[] finderArgs = new Object[] { dataGroupId, node1 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_D_G_L_2_DATAGROUPID_2);

			boolean bindNode1 = false;

			if (node1 == null) {
				query.append(_FINDER_COLUMN_D_G_L_2_NODE1_1);
			}
			else if (node1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_G_L_2_NODE1_3);
			}
			else {
				bindNode1 = true;

				query.append(_FINDER_COLUMN_D_G_L_2_NODE1_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindNode1) {
					qPos.add(node1);
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

	private static final String _FINDER_COLUMN_D_G_L_2_DATAGROUPID_2 = "dataitem.dataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_D_G_L_2_NODE1_1 = "dataitem.node1 IS NULL AND dataitem.status = 1 AND dataitem.level = 2";
	private static final String _FINDER_COLUMN_D_G_L_2_NODE1_2 = "dataitem.node1 = ? AND dataitem.status = 1 AND dataitem.level = 2";
	private static final String _FINDER_COLUMN_D_G_L_2_NODE1_3 = "(dataitem.node1 IS NULL OR dataitem.node1 = '') AND dataitem.status = 1 AND dataitem.level = 2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_G_L_3 = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_G_L_3",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_3 =
		new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_G_L_3",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			DATAITEMModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DATAITEMModelImpl.NODE1_COLUMN_BITMASK |
			DATAITEMModelImpl.NODE2_COLUMN_BITMASK |
			DATAITEMModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_G_L_3 = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_G_L_3",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the d a t a i t e ms where dataGroupId = &#63; and node1 = &#63; and node2 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @return the matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByD_G_L_3(long dataGroupId, String node1,
		String node2) throws SystemException {
		return findByD_G_L_3(dataGroupId, node1, node2, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the d a t a i t e ms where dataGroupId = &#63; and node1 = &#63; and node2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @param start the lower bound of the range of d a t a i t e ms
	 * @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	 * @return the range of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByD_G_L_3(long dataGroupId, String node1,
		String node2, int start, int end) throws SystemException {
		return findByD_G_L_3(dataGroupId, node1, node2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the d a t a i t e ms where dataGroupId = &#63; and node1 = &#63; and node2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @param start the lower bound of the range of d a t a i t e ms
	 * @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByD_G_L_3(long dataGroupId, String node1,
		String node2, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_3;
			finderArgs = new Object[] { dataGroupId, node1, node2 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_G_L_3;
			finderArgs = new Object[] {
					dataGroupId, node1, node2,
					
					start, end, orderByComparator
				};
		}

		List<DATAITEM> list = (List<DATAITEM>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DATAITEM dataitem : list) {
				if ((dataGroupId != dataitem.getDataGroupId()) ||
						!Validator.equals(node1, dataitem.getNode1()) ||
						!Validator.equals(node2, dataitem.getNode2())) {
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

			query.append(_SQL_SELECT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_D_G_L_3_DATAGROUPID_2);

			boolean bindNode1 = false;

			if (node1 == null) {
				query.append(_FINDER_COLUMN_D_G_L_3_NODE1_1);
			}
			else if (node1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_G_L_3_NODE1_3);
			}
			else {
				bindNode1 = true;

				query.append(_FINDER_COLUMN_D_G_L_3_NODE1_2);
			}

			boolean bindNode2 = false;

			if (node2 == null) {
				query.append(_FINDER_COLUMN_D_G_L_3_NODE2_1);
			}
			else if (node2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_G_L_3_NODE2_3);
			}
			else {
				bindNode2 = true;

				query.append(_FINDER_COLUMN_D_G_L_3_NODE2_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DATAITEMModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindNode1) {
					qPos.add(node1);
				}

				if (bindNode2) {
					qPos.add(node2);
				}

				if (!pagination) {
					list = (List<DATAITEM>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DATAITEM>(list);
				}
				else {
					list = (List<DATAITEM>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first d a t a i t e m in the ordered set where dataGroupId = &#63; and node1 = &#63; and node2 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByD_G_L_3_First(long dataGroupId, String node1,
		String node2, OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByD_G_L_3_First(dataGroupId, node1, node2,
				orderByComparator);

		if (dataitem != null) {
			return dataitem;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(", node1=");
		msg.append(node1);

		msg.append(", node2=");
		msg.append(node2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDATAITEMException(msg.toString());
	}

	/**
	 * Returns the first d a t a i t e m in the ordered set where dataGroupId = &#63; and node1 = &#63; and node2 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByD_G_L_3_First(long dataGroupId, String node1,
		String node2, OrderByComparator orderByComparator)
		throws SystemException {
		List<DATAITEM> list = findByD_G_L_3(dataGroupId, node1, node2, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last d a t a i t e m in the ordered set where dataGroupId = &#63; and node1 = &#63; and node2 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByD_G_L_3_Last(long dataGroupId, String node1,
		String node2, OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByD_G_L_3_Last(dataGroupId, node1, node2,
				orderByComparator);

		if (dataitem != null) {
			return dataitem;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(", node1=");
		msg.append(node1);

		msg.append(", node2=");
		msg.append(node2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDATAITEMException(msg.toString());
	}

	/**
	 * Returns the last d a t a i t e m in the ordered set where dataGroupId = &#63; and node1 = &#63; and node2 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByD_G_L_3_Last(long dataGroupId, String node1,
		String node2, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByD_G_L_3(dataGroupId, node1, node2);

		if (count == 0) {
			return null;
		}

		List<DATAITEM> list = findByD_G_L_3(dataGroupId, node1, node2,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the d a t a i t e ms before and after the current d a t a i t e m in the ordered set where dataGroupId = &#63; and node1 = &#63; and node2 = &#63;.
	 *
	 * @param id the primary key of the current d a t a i t e m
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a d a t a i t e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM[] findByD_G_L_3_PrevAndNext(long id, long dataGroupId,
		String node1, String node2, OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DATAITEM[] array = new DATAITEMImpl[3];

			array[0] = getByD_G_L_3_PrevAndNext(session, dataitem, dataGroupId,
					node1, node2, orderByComparator, true);

			array[1] = dataitem;

			array[2] = getByD_G_L_3_PrevAndNext(session, dataitem, dataGroupId,
					node1, node2, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DATAITEM getByD_G_L_3_PrevAndNext(Session session,
		DATAITEM dataitem, long dataGroupId, String node1, String node2,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DATAITEM_WHERE);

		query.append(_FINDER_COLUMN_D_G_L_3_DATAGROUPID_2);

		boolean bindNode1 = false;

		if (node1 == null) {
			query.append(_FINDER_COLUMN_D_G_L_3_NODE1_1);
		}
		else if (node1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_D_G_L_3_NODE1_3);
		}
		else {
			bindNode1 = true;

			query.append(_FINDER_COLUMN_D_G_L_3_NODE1_2);
		}

		boolean bindNode2 = false;

		if (node2 == null) {
			query.append(_FINDER_COLUMN_D_G_L_3_NODE2_1);
		}
		else if (node2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_D_G_L_3_NODE2_3);
		}
		else {
			bindNode2 = true;

			query.append(_FINDER_COLUMN_D_G_L_3_NODE2_2);
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
			query.append(DATAITEMModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dataGroupId);

		if (bindNode1) {
			qPos.add(node1);
		}

		if (bindNode2) {
			qPos.add(node2);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dataitem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DATAITEM> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the d a t a i t e ms where dataGroupId = &#63; and node1 = &#63; and node2 = &#63; from the database.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_G_L_3(long dataGroupId, String node1, String node2)
		throws SystemException {
		for (DATAITEM dataitem : findByD_G_L_3(dataGroupId, node1, node2,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dataitem);
		}
	}

	/**
	 * Returns the number of d a t a i t e ms where dataGroupId = &#63; and node1 = &#63; and node2 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @return the number of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_G_L_3(long dataGroupId, String node1, String node2)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_G_L_3;

		Object[] finderArgs = new Object[] { dataGroupId, node1, node2 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_D_G_L_3_DATAGROUPID_2);

			boolean bindNode1 = false;

			if (node1 == null) {
				query.append(_FINDER_COLUMN_D_G_L_3_NODE1_1);
			}
			else if (node1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_G_L_3_NODE1_3);
			}
			else {
				bindNode1 = true;

				query.append(_FINDER_COLUMN_D_G_L_3_NODE1_2);
			}

			boolean bindNode2 = false;

			if (node2 == null) {
				query.append(_FINDER_COLUMN_D_G_L_3_NODE2_1);
			}
			else if (node2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_G_L_3_NODE2_3);
			}
			else {
				bindNode2 = true;

				query.append(_FINDER_COLUMN_D_G_L_3_NODE2_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindNode1) {
					qPos.add(node1);
				}

				if (bindNode2) {
					qPos.add(node2);
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

	private static final String _FINDER_COLUMN_D_G_L_3_DATAGROUPID_2 = "dataitem.dataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_D_G_L_3_NODE1_1 = "dataitem.node1 IS NULL AND ";
	private static final String _FINDER_COLUMN_D_G_L_3_NODE1_2 = "dataitem.node1 = ? AND ";
	private static final String _FINDER_COLUMN_D_G_L_3_NODE1_3 = "(dataitem.node1 IS NULL OR dataitem.node1 = '') AND ";
	private static final String _FINDER_COLUMN_D_G_L_3_NODE2_1 = "dataitem.node2 IS NULL AND dataitem.status = 1 AND dataitem.level = 3";
	private static final String _FINDER_COLUMN_D_G_L_3_NODE2_2 = "dataitem.node2 = ? AND dataitem.status = 1 AND dataitem.level = 3";
	private static final String _FINDER_COLUMN_D_G_L_3_NODE2_3 = "(dataitem.node2 IS NULL OR dataitem.node2 = '') AND dataitem.status = 1 AND dataitem.level = 3";
	public static final FinderPath FINDER_PATH_FETCH_BY_ENTRY_NODE_1 = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByENTRY_NODE_1",
			new String[] { Long.class.getName(), String.class.getName() },
			DATAITEMModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DATAITEMModelImpl.NODE1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ENTRY_NODE_1 = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByENTRY_NODE_1",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the d a t a i t e m where dataGroupId = &#63; and node1 = &#63; or throws a {@link vn.dtt.cmon.dm.dao.NoSuchDATAITEMException} if it could not be found.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @return the matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByENTRY_NODE_1(long dataGroupId, String node1)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByENTRY_NODE_1(dataGroupId, node1);

		if (dataitem == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dataGroupId=");
			msg.append(dataGroupId);

			msg.append(", node1=");
			msg.append(node1);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDATAITEMException(msg.toString());
		}

		return dataitem;
	}

	/**
	 * Returns the d a t a i t e m where dataGroupId = &#63; and node1 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @return the matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByENTRY_NODE_1(long dataGroupId, String node1)
		throws SystemException {
		return fetchByENTRY_NODE_1(dataGroupId, node1, true);
	}

	/**
	 * Returns the d a t a i t e m where dataGroupId = &#63; and node1 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByENTRY_NODE_1(long dataGroupId, String node1,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { dataGroupId, node1 };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_1,
					finderArgs, this);
		}

		if (result instanceof DATAITEM) {
			DATAITEM dataitem = (DATAITEM)result;

			if ((dataGroupId != dataitem.getDataGroupId()) ||
					!Validator.equals(node1, dataitem.getNode1())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_ENTRY_NODE_1_DATAGROUPID_2);

			boolean bindNode1 = false;

			if (node1 == null) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_1_NODE1_1);
			}
			else if (node1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_1_NODE1_3);
			}
			else {
				bindNode1 = true;

				query.append(_FINDER_COLUMN_ENTRY_NODE_1_NODE1_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindNode1) {
					qPos.add(node1);
				}

				List<DATAITEM> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_1,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DATAITEMPersistenceImpl.fetchByENTRY_NODE_1(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DATAITEM dataitem = list.get(0);

					result = dataitem;

					cacheResult(dataitem);

					if ((dataitem.getDataGroupId() != dataGroupId) ||
							(dataitem.getNode1() == null) ||
							!dataitem.getNode1().equals(node1)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_1,
							finderArgs, dataitem);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_1,
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
			return (DATAITEM)result;
		}
	}

	/**
	 * Removes the d a t a i t e m where dataGroupId = &#63; and node1 = &#63; from the database.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @return the d a t a i t e m that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM removeByENTRY_NODE_1(long dataGroupId, String node1)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = findByENTRY_NODE_1(dataGroupId, node1);

		return remove(dataitem);
	}

	/**
	 * Returns the number of d a t a i t e ms where dataGroupId = &#63; and node1 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @return the number of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByENTRY_NODE_1(long dataGroupId, String node1)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ENTRY_NODE_1;

		Object[] finderArgs = new Object[] { dataGroupId, node1 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_ENTRY_NODE_1_DATAGROUPID_2);

			boolean bindNode1 = false;

			if (node1 == null) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_1_NODE1_1);
			}
			else if (node1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_1_NODE1_3);
			}
			else {
				bindNode1 = true;

				query.append(_FINDER_COLUMN_ENTRY_NODE_1_NODE1_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindNode1) {
					qPos.add(node1);
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

	private static final String _FINDER_COLUMN_ENTRY_NODE_1_DATAGROUPID_2 = "dataitem.dataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_ENTRY_NODE_1_NODE1_1 = "dataitem.node1 IS NULL AND dataitem.status = 1 AND dataitem.level = 1";
	private static final String _FINDER_COLUMN_ENTRY_NODE_1_NODE1_2 = "dataitem.node1 = ? AND dataitem.status = 1 AND dataitem.level = 1";
	private static final String _FINDER_COLUMN_ENTRY_NODE_1_NODE1_3 = "(dataitem.node1 IS NULL OR dataitem.node1 = '') AND dataitem.status = 1 AND dataitem.level = 1";
	public static final FinderPath FINDER_PATH_FETCH_BY_ENTRY_NODE_2 = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByENTRY_NODE_2",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			DATAITEMModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DATAITEMModelImpl.NODE1_COLUMN_BITMASK |
			DATAITEMModelImpl.NODE2_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ENTRY_NODE_2 = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByENTRY_NODE_2",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns the d a t a i t e m where dataGroupId = &#63; and node1 = &#63; and node2 = &#63; or throws a {@link vn.dtt.cmon.dm.dao.NoSuchDATAITEMException} if it could not be found.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @return the matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByENTRY_NODE_2(long dataGroupId, String node1,
		String node2) throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByENTRY_NODE_2(dataGroupId, node1, node2);

		if (dataitem == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dataGroupId=");
			msg.append(dataGroupId);

			msg.append(", node1=");
			msg.append(node1);

			msg.append(", node2=");
			msg.append(node2);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDATAITEMException(msg.toString());
		}

		return dataitem;
	}

	/**
	 * Returns the d a t a i t e m where dataGroupId = &#63; and node1 = &#63; and node2 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @return the matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByENTRY_NODE_2(long dataGroupId, String node1,
		String node2) throws SystemException {
		return fetchByENTRY_NODE_2(dataGroupId, node1, node2, true);
	}

	/**
	 * Returns the d a t a i t e m where dataGroupId = &#63; and node1 = &#63; and node2 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByENTRY_NODE_2(long dataGroupId, String node1,
		String node2, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { dataGroupId, node1, node2 };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_2,
					finderArgs, this);
		}

		if (result instanceof DATAITEM) {
			DATAITEM dataitem = (DATAITEM)result;

			if ((dataGroupId != dataitem.getDataGroupId()) ||
					!Validator.equals(node1, dataitem.getNode1()) ||
					!Validator.equals(node2, dataitem.getNode2())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_ENTRY_NODE_2_DATAGROUPID_2);

			boolean bindNode1 = false;

			if (node1 == null) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_2_NODE1_1);
			}
			else if (node1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_2_NODE1_3);
			}
			else {
				bindNode1 = true;

				query.append(_FINDER_COLUMN_ENTRY_NODE_2_NODE1_2);
			}

			boolean bindNode2 = false;

			if (node2 == null) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_2_NODE2_1);
			}
			else if (node2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_2_NODE2_3);
			}
			else {
				bindNode2 = true;

				query.append(_FINDER_COLUMN_ENTRY_NODE_2_NODE2_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindNode1) {
					qPos.add(node1);
				}

				if (bindNode2) {
					qPos.add(node2);
				}

				List<DATAITEM> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_2,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DATAITEMPersistenceImpl.fetchByENTRY_NODE_2(long, String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DATAITEM dataitem = list.get(0);

					result = dataitem;

					cacheResult(dataitem);

					if ((dataitem.getDataGroupId() != dataGroupId) ||
							(dataitem.getNode1() == null) ||
							!dataitem.getNode1().equals(node1) ||
							(dataitem.getNode2() == null) ||
							!dataitem.getNode2().equals(node2)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_2,
							finderArgs, dataitem);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_2,
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
			return (DATAITEM)result;
		}
	}

	/**
	 * Removes the d a t a i t e m where dataGroupId = &#63; and node1 = &#63; and node2 = &#63; from the database.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @return the d a t a i t e m that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM removeByENTRY_NODE_2(long dataGroupId, String node1,
		String node2) throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = findByENTRY_NODE_2(dataGroupId, node1, node2);

		return remove(dataitem);
	}

	/**
	 * Returns the number of d a t a i t e ms where dataGroupId = &#63; and node1 = &#63; and node2 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node1 the node1
	 * @param node2 the node2
	 * @return the number of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByENTRY_NODE_2(long dataGroupId, String node1, String node2)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ENTRY_NODE_2;

		Object[] finderArgs = new Object[] { dataGroupId, node1, node2 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_ENTRY_NODE_2_DATAGROUPID_2);

			boolean bindNode1 = false;

			if (node1 == null) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_2_NODE1_1);
			}
			else if (node1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_2_NODE1_3);
			}
			else {
				bindNode1 = true;

				query.append(_FINDER_COLUMN_ENTRY_NODE_2_NODE1_2);
			}

			boolean bindNode2 = false;

			if (node2 == null) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_2_NODE2_1);
			}
			else if (node2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_2_NODE2_3);
			}
			else {
				bindNode2 = true;

				query.append(_FINDER_COLUMN_ENTRY_NODE_2_NODE2_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindNode1) {
					qPos.add(node1);
				}

				if (bindNode2) {
					qPos.add(node2);
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

	private static final String _FINDER_COLUMN_ENTRY_NODE_2_DATAGROUPID_2 = "dataitem.dataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_ENTRY_NODE_2_NODE1_1 = "dataitem.node1 IS NULL AND ";
	private static final String _FINDER_COLUMN_ENTRY_NODE_2_NODE1_2 = "dataitem.node1 = ? AND ";
	private static final String _FINDER_COLUMN_ENTRY_NODE_2_NODE1_3 = "(dataitem.node1 IS NULL OR dataitem.node1 = '') AND ";
	private static final String _FINDER_COLUMN_ENTRY_NODE_2_NODE2_1 = "dataitem.node2 IS NULL AND dataitem.status = 1 AND dataitem.level = 2";
	private static final String _FINDER_COLUMN_ENTRY_NODE_2_NODE2_2 = "dataitem.node2 = ? AND dataitem.status = 1 AND dataitem.level = 2";
	private static final String _FINDER_COLUMN_ENTRY_NODE_2_NODE2_3 = "(dataitem.node2 IS NULL OR dataitem.node2 = '') AND dataitem.status = 1 AND dataitem.level = 2";
	public static final FinderPath FINDER_PATH_FETCH_BY_ENTRY_NODE_3 = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByENTRY_NODE_3",
			new String[] { Long.class.getName(), String.class.getName() },
			DATAITEMModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DATAITEMModelImpl.NODE3_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ENTRY_NODE_3 = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByENTRY_NODE_3",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the d a t a i t e m where dataGroupId = &#63; and node3 = &#63; or throws a {@link vn.dtt.cmon.dm.dao.NoSuchDATAITEMException} if it could not be found.
	 *
	 * @param dataGroupId the data group ID
	 * @param node3 the node3
	 * @return the matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByENTRY_NODE_3(long dataGroupId, String node3)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByENTRY_NODE_3(dataGroupId, node3);

		if (dataitem == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dataGroupId=");
			msg.append(dataGroupId);

			msg.append(", node3=");
			msg.append(node3);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDATAITEMException(msg.toString());
		}

		return dataitem;
	}

	/**
	 * Returns the d a t a i t e m where dataGroupId = &#63; and node3 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dataGroupId the data group ID
	 * @param node3 the node3
	 * @return the matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByENTRY_NODE_3(long dataGroupId, String node3)
		throws SystemException {
		return fetchByENTRY_NODE_3(dataGroupId, node3, true);
	}

	/**
	 * Returns the d a t a i t e m where dataGroupId = &#63; and node3 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dataGroupId the data group ID
	 * @param node3 the node3
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByENTRY_NODE_3(long dataGroupId, String node3,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { dataGroupId, node3 };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_3,
					finderArgs, this);
		}

		if (result instanceof DATAITEM) {
			DATAITEM dataitem = (DATAITEM)result;

			if ((dataGroupId != dataitem.getDataGroupId()) ||
					!Validator.equals(node3, dataitem.getNode3())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_ENTRY_NODE_3_DATAGROUPID_2);

			boolean bindNode3 = false;

			if (node3 == null) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_3_NODE3_1);
			}
			else if (node3.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_3_NODE3_3);
			}
			else {
				bindNode3 = true;

				query.append(_FINDER_COLUMN_ENTRY_NODE_3_NODE3_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindNode3) {
					qPos.add(node3);
				}

				List<DATAITEM> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_3,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DATAITEMPersistenceImpl.fetchByENTRY_NODE_3(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DATAITEM dataitem = list.get(0);

					result = dataitem;

					cacheResult(dataitem);

					if ((dataitem.getDataGroupId() != dataGroupId) ||
							(dataitem.getNode3() == null) ||
							!dataitem.getNode3().equals(node3)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_3,
							finderArgs, dataitem);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_3,
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
			return (DATAITEM)result;
		}
	}

	/**
	 * Removes the d a t a i t e m where dataGroupId = &#63; and node3 = &#63; from the database.
	 *
	 * @param dataGroupId the data group ID
	 * @param node3 the node3
	 * @return the d a t a i t e m that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM removeByENTRY_NODE_3(long dataGroupId, String node3)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = findByENTRY_NODE_3(dataGroupId, node3);

		return remove(dataitem);
	}

	/**
	 * Returns the number of d a t a i t e ms where dataGroupId = &#63; and node3 = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param node3 the node3
	 * @return the number of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByENTRY_NODE_3(long dataGroupId, String node3)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ENTRY_NODE_3;

		Object[] finderArgs = new Object[] { dataGroupId, node3 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DATAITEM_WHERE);

			query.append(_FINDER_COLUMN_ENTRY_NODE_3_DATAGROUPID_2);

			boolean bindNode3 = false;

			if (node3 == null) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_3_NODE3_1);
			}
			else if (node3.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_NODE_3_NODE3_3);
			}
			else {
				bindNode3 = true;

				query.append(_FINDER_COLUMN_ENTRY_NODE_3_NODE3_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindNode3) {
					qPos.add(node3);
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

	private static final String _FINDER_COLUMN_ENTRY_NODE_3_DATAGROUPID_2 = "dataitem.dataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_ENTRY_NODE_3_NODE3_1 = "dataitem.node3 IS NULL AND dataitem.status = 1 AND dataitem.level = 3";
	private static final String _FINDER_COLUMN_ENTRY_NODE_3_NODE3_2 = "dataitem.node3 = ? AND dataitem.status = 1 AND dataitem.level = 3";
	private static final String _FINDER_COLUMN_ENTRY_NODE_3_NODE3_3 = "(dataitem.node3 IS NULL OR dataitem.node3 = '') AND dataitem.status = 1 AND dataitem.level = 3";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ENTRY_NAME =
		new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByENTRY_NAME",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTRY_NAME =
		new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, DATAITEMImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByENTRY_NAME",
			new String[] { String.class.getName() },
			DATAITEMModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ENTRY_NAME = new FinderPath(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByENTRY_NAME",
			new String[] { String.class.getName() });

	/**
	 * Returns all the d a t a i t e ms where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByENTRY_NAME(String name)
		throws SystemException {
		return findByENTRY_NAME(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the d a t a i t e ms where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of d a t a i t e ms
	 * @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	 * @return the range of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByENTRY_NAME(String name, int start, int end)
		throws SystemException {
		return findByENTRY_NAME(name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the d a t a i t e ms where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of d a t a i t e ms
	 * @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findByENTRY_NAME(String name, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTRY_NAME;
			finderArgs = new Object[] { name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ENTRY_NAME;
			finderArgs = new Object[] { name, start, end, orderByComparator };
		}

		List<DATAITEM> list = (List<DATAITEM>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DATAITEM dataitem : list) {
				if (!Validator.equals(name, dataitem.getName())) {
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

			query.append(_SQL_SELECT_DATAITEM_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_ENTRY_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_ENTRY_NAME_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DATAITEMModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				if (!pagination) {
					list = (List<DATAITEM>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DATAITEM>(list);
				}
				else {
					list = (List<DATAITEM>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first d a t a i t e m in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByENTRY_NAME_First(String name,
		OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByENTRY_NAME_First(name, orderByComparator);

		if (dataitem != null) {
			return dataitem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDATAITEMException(msg.toString());
	}

	/**
	 * Returns the first d a t a i t e m in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByENTRY_NAME_First(String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<DATAITEM> list = findByENTRY_NAME(name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last d a t a i t e m in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByENTRY_NAME_Last(String name,
		OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByENTRY_NAME_Last(name, orderByComparator);

		if (dataitem != null) {
			return dataitem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDATAITEMException(msg.toString());
	}

	/**
	 * Returns the last d a t a i t e m in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching d a t a i t e m, or <code>null</code> if a matching d a t a i t e m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByENTRY_NAME_Last(String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByENTRY_NAME(name);

		if (count == 0) {
			return null;
		}

		List<DATAITEM> list = findByENTRY_NAME(name, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the d a t a i t e ms before and after the current d a t a i t e m in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current d a t a i t e m
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a d a t a i t e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM[] findByENTRY_NAME_PrevAndNext(long id, String name,
		OrderByComparator orderByComparator)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DATAITEM[] array = new DATAITEMImpl[3];

			array[0] = getByENTRY_NAME_PrevAndNext(session, dataitem, name,
					orderByComparator, true);

			array[1] = dataitem;

			array[2] = getByENTRY_NAME_PrevAndNext(session, dataitem, name,
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

	protected DATAITEM getByENTRY_NAME_PrevAndNext(Session session,
		DATAITEM dataitem, String name, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DATAITEM_WHERE);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_ENTRY_NAME_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ENTRY_NAME_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_ENTRY_NAME_NAME_2);
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
			query.append(DATAITEMModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dataitem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DATAITEM> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the d a t a i t e ms where name = &#63; from the database.
	 *
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByENTRY_NAME(String name) throws SystemException {
		for (DATAITEM dataitem : findByENTRY_NAME(name, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dataitem);
		}
	}

	/**
	 * Returns the number of d a t a i t e ms where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByENTRY_NAME(String name) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ENTRY_NAME;

		Object[] finderArgs = new Object[] { name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DATAITEM_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_ENTRY_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_ENTRY_NAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_ENTRY_NAME_NAME_1 = "dataitem.name IS NULL";
	private static final String _FINDER_COLUMN_ENTRY_NAME_NAME_2 = "dataitem.name = ?";
	private static final String _FINDER_COLUMN_ENTRY_NAME_NAME_3 = "(dataitem.name IS NULL OR dataitem.name = '')";

	public DATAITEMPersistenceImpl() {
		setModelClass(DATAITEM.class);
	}

	/**
	 * Caches the d a t a i t e m in the entity cache if it is enabled.
	 *
	 * @param dataitem the d a t a i t e m
	 */
	@Override
	public void cacheResult(DATAITEM dataitem) {
		EntityCacheUtil.putResult(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMImpl.class, dataitem.getPrimaryKey(), dataitem);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_1,
			new Object[] { dataitem.getDataGroupId(), dataitem.getNode1() },
			dataitem);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_2,
			new Object[] {
				dataitem.getDataGroupId(), dataitem.getNode1(),
				dataitem.getNode2()
			}, dataitem);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_3,
			new Object[] { dataitem.getDataGroupId(), dataitem.getNode3() },
			dataitem);

		dataitem.resetOriginalValues();
	}

	/**
	 * Caches the d a t a i t e ms in the entity cache if it is enabled.
	 *
	 * @param dataitems the d a t a i t e ms
	 */
	@Override
	public void cacheResult(List<DATAITEM> dataitems) {
		for (DATAITEM dataitem : dataitems) {
			if (EntityCacheUtil.getResult(
						DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
						DATAITEMImpl.class, dataitem.getPrimaryKey()) == null) {
				cacheResult(dataitem);
			}
			else {
				dataitem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all d a t a i t e ms.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DATAITEMImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DATAITEMImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the d a t a i t e m.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DATAITEM dataitem) {
		EntityCacheUtil.removeResult(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMImpl.class, dataitem.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dataitem);
	}

	@Override
	public void clearCache(List<DATAITEM> dataitems) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DATAITEM dataitem : dataitems) {
			EntityCacheUtil.removeResult(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
				DATAITEMImpl.class, dataitem.getPrimaryKey());

			clearUniqueFindersCache(dataitem);
		}
	}

	protected void cacheUniqueFindersCache(DATAITEM dataitem) {
		if (dataitem.isNew()) {
			Object[] args = new Object[] {
					dataitem.getDataGroupId(), dataitem.getNode1()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ENTRY_NODE_1, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_1, args,
				dataitem);

			args = new Object[] {
					dataitem.getDataGroupId(), dataitem.getNode1(),
					dataitem.getNode2()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ENTRY_NODE_2, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_2, args,
				dataitem);

			args = new Object[] { dataitem.getDataGroupId(), dataitem.getNode3() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ENTRY_NODE_3, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_3, args,
				dataitem);
		}
		else {
			DATAITEMModelImpl dataitemModelImpl = (DATAITEMModelImpl)dataitem;

			if ((dataitemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ENTRY_NODE_1.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dataitem.getDataGroupId(), dataitem.getNode1()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ENTRY_NODE_1,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_1,
					args, dataitem);
			}

			if ((dataitemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ENTRY_NODE_2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dataitem.getDataGroupId(), dataitem.getNode1(),
						dataitem.getNode2()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ENTRY_NODE_2,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_2,
					args, dataitem);
			}

			if ((dataitemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ENTRY_NODE_3.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dataitem.getDataGroupId(), dataitem.getNode3()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ENTRY_NODE_3,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_3,
					args, dataitem);
			}
		}
	}

	protected void clearUniqueFindersCache(DATAITEM dataitem) {
		DATAITEMModelImpl dataitemModelImpl = (DATAITEMModelImpl)dataitem;

		Object[] args = new Object[] {
				dataitem.getDataGroupId(), dataitem.getNode1()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTRY_NODE_1, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_1, args);

		if ((dataitemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ENTRY_NODE_1.getColumnBitmask()) != 0) {
			args = new Object[] {
					dataitemModelImpl.getOriginalDataGroupId(),
					dataitemModelImpl.getOriginalNode1()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTRY_NODE_1, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_1, args);
		}

		args = new Object[] {
				dataitem.getDataGroupId(), dataitem.getNode1(),
				dataitem.getNode2()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTRY_NODE_2, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_2, args);

		if ((dataitemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ENTRY_NODE_2.getColumnBitmask()) != 0) {
			args = new Object[] {
					dataitemModelImpl.getOriginalDataGroupId(),
					dataitemModelImpl.getOriginalNode1(),
					dataitemModelImpl.getOriginalNode2()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTRY_NODE_2, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_2, args);
		}

		args = new Object[] { dataitem.getDataGroupId(), dataitem.getNode3() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTRY_NODE_3, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_3, args);

		if ((dataitemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ENTRY_NODE_3.getColumnBitmask()) != 0) {
			args = new Object[] {
					dataitemModelImpl.getOriginalDataGroupId(),
					dataitemModelImpl.getOriginalNode3()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTRY_NODE_3, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ENTRY_NODE_3, args);
		}
	}

	/**
	 * Creates a new d a t a i t e m with the primary key. Does not add the d a t a i t e m to the database.
	 *
	 * @param id the primary key for the new d a t a i t e m
	 * @return the new d a t a i t e m
	 */
	@Override
	public DATAITEM create(long id) {
		DATAITEM dataitem = new DATAITEMImpl();

		dataitem.setNew(true);
		dataitem.setPrimaryKey(id);

		return dataitem;
	}

	/**
	 * Removes the d a t a i t e m with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the d a t a i t e m
	 * @return the d a t a i t e m that was removed
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a d a t a i t e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM remove(long id)
		throws NoSuchDATAITEMException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the d a t a i t e m with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the d a t a i t e m
	 * @return the d a t a i t e m that was removed
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a d a t a i t e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM remove(Serializable primaryKey)
		throws NoSuchDATAITEMException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DATAITEM dataitem = (DATAITEM)session.get(DATAITEMImpl.class,
					primaryKey);

			if (dataitem == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDATAITEMException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dataitem);
		}
		catch (NoSuchDATAITEMException nsee) {
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
	protected DATAITEM removeImpl(DATAITEM dataitem) throws SystemException {
		dataitem = toUnwrappedModel(dataitem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dataitem)) {
				dataitem = (DATAITEM)session.get(DATAITEMImpl.class,
						dataitem.getPrimaryKeyObj());
			}

			if (dataitem != null) {
				session.delete(dataitem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dataitem != null) {
			clearCache(dataitem);
		}

		return dataitem;
	}

	@Override
	public DATAITEM updateImpl(vn.dtt.cmon.dm.dao.model.DATAITEM dataitem)
		throws SystemException {
		dataitem = toUnwrappedModel(dataitem);

		boolean isNew = dataitem.isNew();

		DATAITEMModelImpl dataitemModelImpl = (DATAITEMModelImpl)dataitem;

		Session session = null;

		try {
			session = openSession();

			if (dataitem.isNew()) {
				session.save(dataitem);

				dataitem.setNew(false);
			}
			else {
				session.merge(dataitem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DATAITEMModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dataitemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dataitemModelImpl.getOriginalDataGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G,
					args);

				args = new Object[] { dataitemModelImpl.getDataGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G,
					args);
			}

			if ((dataitemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_1.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dataitemModelImpl.getOriginalDataGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_G_L_1, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_1,
					args);

				args = new Object[] { dataitemModelImpl.getDataGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_G_L_1, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_1,
					args);
			}

			if ((dataitemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dataitemModelImpl.getOriginalDataGroupId(),
						dataitemModelImpl.getOriginalNode1()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_G_L_2, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_2,
					args);

				args = new Object[] {
						dataitemModelImpl.getDataGroupId(),
						dataitemModelImpl.getNode1()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_G_L_2, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_2,
					args);
			}

			if ((dataitemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_3.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dataitemModelImpl.getOriginalDataGroupId(),
						dataitemModelImpl.getOriginalNode1(),
						dataitemModelImpl.getOriginalNode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_G_L_3, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_3,
					args);

				args = new Object[] {
						dataitemModelImpl.getDataGroupId(),
						dataitemModelImpl.getNode1(),
						dataitemModelImpl.getNode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_G_L_3, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_G_L_3,
					args);
			}

			if ((dataitemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTRY_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dataitemModelImpl.getOriginalName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTRY_NAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTRY_NAME,
					args);

				args = new Object[] { dataitemModelImpl.getName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ENTRY_NAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTRY_NAME,
					args);
			}
		}

		EntityCacheUtil.putResult(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
			DATAITEMImpl.class, dataitem.getPrimaryKey(), dataitem);

		clearUniqueFindersCache(dataitem);
		cacheUniqueFindersCache(dataitem);

		return dataitem;
	}

	protected DATAITEM toUnwrappedModel(DATAITEM dataitem) {
		if (dataitem instanceof DATAITEMImpl) {
			return dataitem;
		}

		DATAITEMImpl dataitemImpl = new DATAITEMImpl();

		dataitemImpl.setNew(dataitem.isNew());
		dataitemImpl.setPrimaryKey(dataitem.getPrimaryKey());

		dataitemImpl.setId(dataitem.getId());
		dataitemImpl.setDataGroupId(dataitem.getDataGroupId());
		dataitemImpl.setCode(dataitem.getCode());
		dataitemImpl.setNode1(dataitem.getNode1());
		dataitemImpl.setNode2(dataitem.getNode2());
		dataitemImpl.setNode3(dataitem.getNode3());
		dataitemImpl.setNode4(dataitem.getNode4());
		dataitemImpl.setLevel(dataitem.getLevel());
		dataitemImpl.setName(dataitem.getName());
		dataitemImpl.setDescription(dataitem.getDescription());
		dataitemImpl.setStatus(dataitem.getStatus());
		dataitemImpl.setValidatedFrom(dataitem.getValidatedFrom());
		dataitemImpl.setValidatedTo(dataitem.getValidatedTo());

		return dataitemImpl;
	}

	/**
	 * Returns the d a t a i t e m with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the d a t a i t e m
	 * @return the d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a d a t a i t e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDATAITEMException, SystemException {
		DATAITEM dataitem = fetchByPrimaryKey(primaryKey);

		if (dataitem == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDATAITEMException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dataitem;
	}

	/**
	 * Returns the d a t a i t e m with the primary key or throws a {@link vn.dtt.cmon.dm.dao.NoSuchDATAITEMException} if it could not be found.
	 *
	 * @param id the primary key of the d a t a i t e m
	 * @return the d a t a i t e m
	 * @throws vn.dtt.cmon.dm.dao.NoSuchDATAITEMException if a d a t a i t e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM findByPrimaryKey(long id)
		throws NoSuchDATAITEMException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the d a t a i t e m with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the d a t a i t e m
	 * @return the d a t a i t e m, or <code>null</code> if a d a t a i t e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DATAITEM dataitem = (DATAITEM)EntityCacheUtil.getResult(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
				DATAITEMImpl.class, primaryKey);

		if (dataitem == _nullDATAITEM) {
			return null;
		}

		if (dataitem == null) {
			Session session = null;

			try {
				session = openSession();

				dataitem = (DATAITEM)session.get(DATAITEMImpl.class, primaryKey);

				if (dataitem != null) {
					cacheResult(dataitem);
				}
				else {
					EntityCacheUtil.putResult(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
						DATAITEMImpl.class, primaryKey, _nullDATAITEM);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DATAITEMModelImpl.ENTITY_CACHE_ENABLED,
					DATAITEMImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dataitem;
	}

	/**
	 * Returns the d a t a i t e m with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the d a t a i t e m
	 * @return the d a t a i t e m, or <code>null</code> if a d a t a i t e m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DATAITEM fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the d a t a i t e ms.
	 *
	 * @return the d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the d a t a i t e ms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of d a t a i t e ms
	 * @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	 * @return the range of d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the d a t a i t e ms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.dm.dao.model.impl.DATAITEMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of d a t a i t e ms
	 * @param end the upper bound of the range of d a t a i t e ms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of d a t a i t e ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DATAITEM> findAll(int start, int end,
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

		List<DATAITEM> list = (List<DATAITEM>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DATAITEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DATAITEM;

				if (pagination) {
					sql = sql.concat(DATAITEMModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DATAITEM>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DATAITEM>(list);
				}
				else {
					list = (List<DATAITEM>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the d a t a i t e ms from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DATAITEM dataitem : findAll()) {
			remove(dataitem);
		}
	}

	/**
	 * Returns the number of d a t a i t e ms.
	 *
	 * @return the number of d a t a i t e ms
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

				Query q = session.createQuery(_SQL_COUNT_DATAITEM);

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
	 * Initializes the d a t a i t e m persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.cmon.dm.dao.model.DATAITEM")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DATAITEM>> listenersList = new ArrayList<ModelListener<DATAITEM>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DATAITEM>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DATAITEMImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DATAITEM = "SELECT dataitem FROM DATAITEM dataitem";
	private static final String _SQL_SELECT_DATAITEM_WHERE = "SELECT dataitem FROM DATAITEM dataitem WHERE ";
	private static final String _SQL_COUNT_DATAITEM = "SELECT COUNT(dataitem) FROM DATAITEM dataitem";
	private static final String _SQL_COUNT_DATAITEM_WHERE = "SELECT COUNT(dataitem) FROM DATAITEM dataitem WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dataitem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DATAITEM exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DATAITEM exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DATAITEMPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "dataGroupId", "code", "node1", "node2", "node3", "node4",
				"level", "name", "description", "status", "validatedFrom",
				"validatedTo"
			});
	private static DATAITEM _nullDATAITEM = new DATAITEMImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DATAITEM> toCacheModel() {
				return _nullDATAITEMCacheModel;
			}
		};

	private static CacheModel<DATAITEM> _nullDATAITEMCacheModel = new CacheModel<DATAITEM>() {
			@Override
			public DATAITEM toEntityModel() {
				return _nullDATAITEM;
			}
		};
}