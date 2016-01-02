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

package vn.dtt.sol.ns.vesinhmoitruong.dao.service.persistence;

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

import vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the thong tin kiem dem ho g d service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see ThongTinKiemDemHoGDPersistence
 * @see ThongTinKiemDemHoGDUtil
 * @generated
 */
public class ThongTinKiemDemHoGDPersistenceImpl extends BasePersistenceImpl<ThongTinKiemDemHoGD>
	implements ThongTinKiemDemHoGDPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ThongTinKiemDemHoGDUtil} to access the thong tin kiem dem ho g d persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ThongTinKiemDemHoGDImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__VESINHGIADINHID =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_veSinhGiaDinhId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__VESINHGIADINHID =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_veSinhGiaDinhId", new String[] { Integer.class.getName() },
			ThongTinKiemDemHoGDModelImpl.VESINHGIADINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__VESINHGIADINHID = new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBy_veSinhGiaDinhId", new String[] { Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem ho g ds where veSinhGiaDinhId = &#63;.
	 *
	 * @param veSinhGiaDinhId the ve sinh gia dinh ID
	 * @return the matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_veSinhGiaDinhId(int veSinhGiaDinhId)
		throws SystemException {
		return findBy_veSinhGiaDinhId(veSinhGiaDinhId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem ho g ds where veSinhGiaDinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param veSinhGiaDinhId the ve sinh gia dinh ID
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @return the range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_veSinhGiaDinhId(
		int veSinhGiaDinhId, int start, int end) throws SystemException {
		return findBy_veSinhGiaDinhId(veSinhGiaDinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem ho g ds where veSinhGiaDinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param veSinhGiaDinhId the ve sinh gia dinh ID
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_veSinhGiaDinhId(
		int veSinhGiaDinhId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__VESINHGIADINHID;
			finderArgs = new Object[] { veSinhGiaDinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__VESINHGIADINHID;
			finderArgs = new Object[] {
					veSinhGiaDinhId,
					
					start, end, orderByComparator
				};
		}

		List<ThongTinKiemDemHoGD> list = (List<ThongTinKiemDemHoGD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : list) {
				if ((veSinhGiaDinhId != thongTinKiemDemHoGD.getVeSinhGiaDinhId())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__VESINHGIADINHID_VESINHGIADINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(veSinhGiaDinhId);

				if (!pagination) {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemHoGD>(list);
				}
				else {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem ho g d in the ordered set where veSinhGiaDinhId = &#63;.
	 *
	 * @param veSinhGiaDinhId the ve sinh gia dinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_veSinhGiaDinhId_First(
		int veSinhGiaDinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_veSinhGiaDinhId_First(veSinhGiaDinhId,
				orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("veSinhGiaDinhId=");
		msg.append(veSinhGiaDinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem ho g d in the ordered set where veSinhGiaDinhId = &#63;.
	 *
	 * @param veSinhGiaDinhId the ve sinh gia dinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_veSinhGiaDinhId_First(
		int veSinhGiaDinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ThongTinKiemDemHoGD> list = findBy_veSinhGiaDinhId(veSinhGiaDinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where veSinhGiaDinhId = &#63;.
	 *
	 * @param veSinhGiaDinhId the ve sinh gia dinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_veSinhGiaDinhId_Last(
		int veSinhGiaDinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_veSinhGiaDinhId_Last(veSinhGiaDinhId,
				orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("veSinhGiaDinhId=");
		msg.append(veSinhGiaDinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where veSinhGiaDinhId = &#63;.
	 *
	 * @param veSinhGiaDinhId the ve sinh gia dinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_veSinhGiaDinhId_Last(
		int veSinhGiaDinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBy_veSinhGiaDinhId(veSinhGiaDinhId);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemHoGD> list = findBy_veSinhGiaDinhId(veSinhGiaDinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where veSinhGiaDinhId = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem ho g d
	 * @param veSinhGiaDinhId the ve sinh gia dinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD[] findBy_veSinhGiaDinhId_PrevAndNext(int id,
		int veSinhGiaDinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemHoGD[] array = new ThongTinKiemDemHoGDImpl[3];

			array[0] = getBy_veSinhGiaDinhId_PrevAndNext(session,
					thongTinKiemDemHoGD, veSinhGiaDinhId, orderByComparator,
					true);

			array[1] = thongTinKiemDemHoGD;

			array[2] = getBy_veSinhGiaDinhId_PrevAndNext(session,
					thongTinKiemDemHoGD, veSinhGiaDinhId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ThongTinKiemDemHoGD getBy_veSinhGiaDinhId_PrevAndNext(
		Session session, ThongTinKiemDemHoGD thongTinKiemDemHoGD,
		int veSinhGiaDinhId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

		query.append(_FINDER_COLUMN__VESINHGIADINHID_VESINHGIADINHID_2);

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
			query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(veSinhGiaDinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemHoGD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemHoGD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem ho g ds where veSinhGiaDinhId = &#63; from the database.
	 *
	 * @param veSinhGiaDinhId the ve sinh gia dinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_veSinhGiaDinhId(int veSinhGiaDinhId)
		throws SystemException {
		for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : findBy_veSinhGiaDinhId(
				veSinhGiaDinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongTinKiemDemHoGD);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem ho g ds where veSinhGiaDinhId = &#63;.
	 *
	 * @param veSinhGiaDinhId the ve sinh gia dinh ID
	 * @return the number of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_veSinhGiaDinhId(int veSinhGiaDinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__VESINHGIADINHID;

		Object[] finderArgs = new Object[] { veSinhGiaDinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__VESINHGIADINHID_VESINHGIADINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(veSinhGiaDinhId);

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

	private static final String _FINDER_COLUMN__VESINHGIADINHID_VESINHGIADINHID_2 =
		"thongTinKiemDemHoGD.veSinhGiaDinhId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_keHoachKiemDemVeSinhId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_keHoachKiemDemVeSinhId",
			new String[] { Integer.class.getName() },
			ThongTinKiemDemHoGDModelImpl.KEHOACHKIEMDEMVESINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID = new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBy_keHoachKiemDemVeSinhId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId) throws SystemException {
		return findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @return the range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws SystemException {
		return findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID;
			finderArgs = new Object[] { keHoachKiemDemVeSinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID;
			finderArgs = new Object[] {
					keHoachKiemDemVeSinhId,
					
					start, end, orderByComparator
				};
		}

		List<ThongTinKiemDemHoGD> list = (List<ThongTinKiemDemHoGD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : list) {
				if ((keHoachKiemDemVeSinhId != thongTinKiemDemHoGD.getKeHoachKiemDemVeSinhId())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_KEHOACHKIEMDEMVESINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

				if (!pagination) {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemHoGD>(list);
				}
				else {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_keHoachKiemDemVeSinhId_First(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_keHoachKiemDemVeSinhId_First(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_keHoachKiemDemVeSinhId_First(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ThongTinKiemDemHoGD> list = findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_keHoachKiemDemVeSinhId_Last(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_keHoachKiemDemVeSinhId_Last(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_keHoachKiemDemVeSinhId_Last(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemHoGD> list = findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem ho g d
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD[] findBy_keHoachKiemDemVeSinhId_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemHoGD[] array = new ThongTinKiemDemHoGDImpl[3];

			array[0] = getBy_keHoachKiemDemVeSinhId_PrevAndNext(session,
					thongTinKiemDemHoGD, keHoachKiemDemVeSinhId,
					orderByComparator, true);

			array[1] = thongTinKiemDemHoGD;

			array[2] = getBy_keHoachKiemDemVeSinhId_PrevAndNext(session,
					thongTinKiemDemHoGD, keHoachKiemDemVeSinhId,
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

	protected ThongTinKiemDemHoGD getBy_keHoachKiemDemVeSinhId_PrevAndNext(
		Session session, ThongTinKiemDemHoGD thongTinKiemDemHoGD,
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

		query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_KEHOACHKIEMDEMVESINHID_2);

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
			query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemVeSinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemHoGD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemHoGD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; from the database.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_keHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId)
		throws SystemException {
		for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : findBy_keHoachKiemDemVeSinhId(
				keHoachKiemDemVeSinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(thongTinKiemDemHoGD);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the number of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_keHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID;

		Object[] finderArgs = new Object[] { keHoachKiemDemVeSinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_KEHOACHKIEMDEMVESINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

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

	private static final String _FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_KEHOACHKIEMDEMVESINHID_2 =
		"thongTinKiemDemHoGD.keHoachKiemDemVeSinhId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			ThongTinKiemDemHoGDModelImpl.KEHOACHKIEMDEMVESINHID_COLUMN_BITMASK |
			ThongTinKiemDemHoGDModelImpl.DAKETTHUCDIEUTRA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBy_keHoachKiemDemVeSinhId_daKetThucDieuTra",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @return the matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws SystemException {
		return findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
			daKetThucDieuTra, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @return the range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra, int start, int end)
		throws SystemException {
		return findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
			daKetThucDieuTra, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA;
			finderArgs = new Object[] { keHoachKiemDemVeSinhId, daKetThucDieuTra };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA;
			finderArgs = new Object[] {
					keHoachKiemDemVeSinhId, daKetThucDieuTra,
					
					start, end, orderByComparator
				};
		}

		List<ThongTinKiemDemHoGD> list = (List<ThongTinKiemDemHoGD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : list) {
				if ((keHoachKiemDemVeSinhId != thongTinKiemDemHoGD.getKeHoachKiemDemVeSinhId()) ||
						(daKetThucDieuTra != thongTinKiemDemHoGD.getDaKetThucDieuTra())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA_KEHOACHKIEMDEMVESINHID_2);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA_DAKETTHUCDIEUTRA_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

				qPos.add(daKetThucDieuTra);

				if (!pagination) {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemHoGD>(list);
				}
				else {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(keHoachKiemDemVeSinhId,
				daKetThucDieuTra, orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(", daKetThucDieuTra=");
		msg.append(daKetThucDieuTra);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		OrderByComparator orderByComparator) throws SystemException {
		List<ThongTinKiemDemHoGD> list = findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
				daKetThucDieuTra, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(keHoachKiemDemVeSinhId,
				daKetThucDieuTra, orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(", daKetThucDieuTra=");
		msg.append(daKetThucDieuTra);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
				daKetThucDieuTra);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemHoGD> list = findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
				daKetThucDieuTra, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem ho g d
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD[] findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemHoGD[] array = new ThongTinKiemDemHoGDImpl[3];

			array[0] = getBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_PrevAndNext(session,
					thongTinKiemDemHoGD, keHoachKiemDemVeSinhId,
					daKetThucDieuTra, orderByComparator, true);

			array[1] = thongTinKiemDemHoGD;

			array[2] = getBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_PrevAndNext(session,
					thongTinKiemDemHoGD, keHoachKiemDemVeSinhId,
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

	protected ThongTinKiemDemHoGD getBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_PrevAndNext(
		Session session, ThongTinKiemDemHoGD thongTinKiemDemHoGD,
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

		query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA_KEHOACHKIEMDEMVESINHID_2);

		query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA_DAKETTHUCDIEUTRA_2);

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
			query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemVeSinhId);

		qPos.add(daKetThucDieuTra);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemHoGD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemHoGD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63; from the database.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws SystemException {
		for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
				keHoachKiemDemVeSinhId, daKetThucDieuTra, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(thongTinKiemDemHoGD);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @return the number of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA;

		Object[] finderArgs = new Object[] {
				keHoachKiemDemVeSinhId, daKetThucDieuTra
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA_KEHOACHKIEMDEMVESINHID_2);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA_DAKETTHUCDIEUTRA_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

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

	private static final String _FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA_KEHOACHKIEMDEMVESINHID_2 =
		"thongTinKiemDemHoGD.keHoachKiemDemVeSinhId = ? AND ";
	private static final String _FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA_DAKETTHUCDIEUTRA_2 =
		"thongTinKiemDemHoGD.daKetThucDieuTra = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			ThongTinKiemDemHoGDModelImpl.KEHOACHKIEMDEMVESINHID_COLUMN_BITMASK |
			ThongTinKiemDemHoGDModelImpl.DANHGIAKIEMDEM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBy_keHoachKiemDemVeSinhId_danhGiaKiemDem",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @return the matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws SystemException {
		return findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @return the range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem, int start, int end)
		throws SystemException {
		return findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM;
			finderArgs = new Object[] { keHoachKiemDemVeSinhId, danhGiaKiemDem };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM;
			finderArgs = new Object[] {
					keHoachKiemDemVeSinhId, danhGiaKiemDem,
					
					start, end, orderByComparator
				};
		}

		List<ThongTinKiemDemHoGD> list = (List<ThongTinKiemDemHoGD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : list) {
				if ((keHoachKiemDemVeSinhId != thongTinKiemDemHoGD.getKeHoachKiemDemVeSinhId()) ||
						(danhGiaKiemDem != thongTinKiemDemHoGD.getDanhGiaKiemDem())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM_KEHOACHKIEMDEMVESINHID_2);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM_DANHGIAKIEMDEM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

				qPos.add(danhGiaKiemDem);

				if (!pagination) {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemHoGD>(list);
				}
				else {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(keHoachKiemDemVeSinhId,
				danhGiaKiemDem, orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(", danhGiaKiemDem=");
		msg.append(danhGiaKiemDem);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		OrderByComparator orderByComparator) throws SystemException {
		List<ThongTinKiemDemHoGD> list = findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
				danhGiaKiemDem, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(keHoachKiemDemVeSinhId,
				danhGiaKiemDem, orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(", danhGiaKiemDem=");
		msg.append(danhGiaKiemDem);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
				danhGiaKiemDem);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemHoGD> list = findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
				danhGiaKiemDem, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem ho g d
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD[] findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemHoGD[] array = new ThongTinKiemDemHoGDImpl[3];

			array[0] = getBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_PrevAndNext(session,
					thongTinKiemDemHoGD, keHoachKiemDemVeSinhId,
					danhGiaKiemDem, orderByComparator, true);

			array[1] = thongTinKiemDemHoGD;

			array[2] = getBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_PrevAndNext(session,
					thongTinKiemDemHoGD, keHoachKiemDemVeSinhId,
					danhGiaKiemDem, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ThongTinKiemDemHoGD getBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_PrevAndNext(
		Session session, ThongTinKiemDemHoGD thongTinKiemDemHoGD,
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

		query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM_KEHOACHKIEMDEMVESINHID_2);

		query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM_DANHGIAKIEMDEM_2);

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
			query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemVeSinhId);

		qPos.add(danhGiaKiemDem);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemHoGD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemHoGD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63; from the database.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws SystemException {
		for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
				keHoachKiemDemVeSinhId, danhGiaKiemDem, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(thongTinKiemDemHoGD);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @return the number of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM;

		Object[] finderArgs = new Object[] {
				keHoachKiemDemVeSinhId, danhGiaKiemDem
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM_KEHOACHKIEMDEMVESINHID_2);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM_DANHGIAKIEMDEM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

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

	private static final String _FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM_KEHOACHKIEMDEMVESINHID_2 =
		"thongTinKiemDemHoGD.keHoachKiemDemVeSinhId = ? AND ";
	private static final String _FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM_DANHGIAKIEMDEM_2 =
		"thongTinKiemDemHoGD.danhGiaKiemDem = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__CONHAVESINH =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_coNhaVeSinh",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__CONHAVESINH =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_coNhaVeSinh",
			new String[] { Integer.class.getName() },
			ThongTinKiemDemHoGDModelImpl.KEHOACHKIEMDEMVESINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__CONHAVESINH = new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_coNhaVeSinh",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_coNhaVeSinh(
		int keHoachKiemDemVeSinhId) throws SystemException {
		return findBy_coNhaVeSinh(keHoachKiemDemVeSinhId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @return the range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_coNhaVeSinh(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws SystemException {
		return findBy_coNhaVeSinh(keHoachKiemDemVeSinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_coNhaVeSinh(
		int keHoachKiemDemVeSinhId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__CONHAVESINH;
			finderArgs = new Object[] { keHoachKiemDemVeSinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__CONHAVESINH;
			finderArgs = new Object[] {
					keHoachKiemDemVeSinhId,
					
					start, end, orderByComparator
				};
		}

		List<ThongTinKiemDemHoGD> list = (List<ThongTinKiemDemHoGD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : list) {
				if ((keHoachKiemDemVeSinhId != thongTinKiemDemHoGD.getKeHoachKiemDemVeSinhId())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__CONHAVESINH_KEHOACHKIEMDEMVESINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

				if (!pagination) {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemHoGD>(list);
				}
				else {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_coNhaVeSinh_First(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_coNhaVeSinh_First(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_coNhaVeSinh_First(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ThongTinKiemDemHoGD> list = findBy_coNhaVeSinh(keHoachKiemDemVeSinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_coNhaVeSinh_Last(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_coNhaVeSinh_Last(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_coNhaVeSinh_Last(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBy_coNhaVeSinh(keHoachKiemDemVeSinhId);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemHoGD> list = findBy_coNhaVeSinh(keHoachKiemDemVeSinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem ho g d
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD[] findBy_coNhaVeSinh_PrevAndNext(int id,
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemHoGD[] array = new ThongTinKiemDemHoGDImpl[3];

			array[0] = getBy_coNhaVeSinh_PrevAndNext(session,
					thongTinKiemDemHoGD, keHoachKiemDemVeSinhId,
					orderByComparator, true);

			array[1] = thongTinKiemDemHoGD;

			array[2] = getBy_coNhaVeSinh_PrevAndNext(session,
					thongTinKiemDemHoGD, keHoachKiemDemVeSinhId,
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

	protected ThongTinKiemDemHoGD getBy_coNhaVeSinh_PrevAndNext(
		Session session, ThongTinKiemDemHoGD thongTinKiemDemHoGD,
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

		query.append(_FINDER_COLUMN__CONHAVESINH_KEHOACHKIEMDEMVESINHID_2);

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
			query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemVeSinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemHoGD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemHoGD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; from the database.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_coNhaVeSinh(int keHoachKiemDemVeSinhId)
		throws SystemException {
		for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : findBy_coNhaVeSinh(
				keHoachKiemDemVeSinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(thongTinKiemDemHoGD);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the number of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_coNhaVeSinh(int keHoachKiemDemVeSinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__CONHAVESINH;

		Object[] finderArgs = new Object[] { keHoachKiemDemVeSinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__CONHAVESINH_KEHOACHKIEMDEMVESINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

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

	private static final String _FINDER_COLUMN__CONHAVESINH_KEHOACHKIEMDEMVESINHID_2 =
		"thongTinKiemDemHoGD.keHoachKiemDemVeSinhId = ? AND  ( thongTinKiemDemHoGD.danhGiaKiemDem = 1 OR thongTinKiemDemHoGD.danhGiaKiemDem = 2 OR thongTinKiemDemHoGD.danhGiaKiemDem = 3 ) ";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__COHVS = new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_coHVS",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COHVS =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_coHVS",
			new String[] { Integer.class.getName() },
			ThongTinKiemDemHoGDModelImpl.KEHOACHKIEMDEMVESINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__COHVS = new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_coHVS",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_coHVS(int keHoachKiemDemVeSinhId)
		throws SystemException {
		return findBy_coHVS(keHoachKiemDemVeSinhId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @return the range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_coHVS(int keHoachKiemDemVeSinhId,
		int start, int end) throws SystemException {
		return findBy_coHVS(keHoachKiemDemVeSinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_coHVS(int keHoachKiemDemVeSinhId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COHVS;
			finderArgs = new Object[] { keHoachKiemDemVeSinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__COHVS;
			finderArgs = new Object[] {
					keHoachKiemDemVeSinhId,
					
					start, end, orderByComparator
				};
		}

		List<ThongTinKiemDemHoGD> list = (List<ThongTinKiemDemHoGD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : list) {
				if ((keHoachKiemDemVeSinhId != thongTinKiemDemHoGD.getKeHoachKiemDemVeSinhId())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__COHVS_KEHOACHKIEMDEMVESINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

				if (!pagination) {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemHoGD>(list);
				}
				else {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_coHVS_First(int keHoachKiemDemVeSinhId,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_coHVS_First(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_coHVS_First(int keHoachKiemDemVeSinhId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ThongTinKiemDemHoGD> list = findBy_coHVS(keHoachKiemDemVeSinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_coHVS_Last(int keHoachKiemDemVeSinhId,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_coHVS_Last(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_coHVS_Last(int keHoachKiemDemVeSinhId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_coHVS(keHoachKiemDemVeSinhId);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemHoGD> list = findBy_coHVS(keHoachKiemDemVeSinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem ho g d
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD[] findBy_coHVS_PrevAndNext(int id,
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemHoGD[] array = new ThongTinKiemDemHoGDImpl[3];

			array[0] = getBy_coHVS_PrevAndNext(session, thongTinKiemDemHoGD,
					keHoachKiemDemVeSinhId, orderByComparator, true);

			array[1] = thongTinKiemDemHoGD;

			array[2] = getBy_coHVS_PrevAndNext(session, thongTinKiemDemHoGD,
					keHoachKiemDemVeSinhId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ThongTinKiemDemHoGD getBy_coHVS_PrevAndNext(Session session,
		ThongTinKiemDemHoGD thongTinKiemDemHoGD, int keHoachKiemDemVeSinhId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

		query.append(_FINDER_COLUMN__COHVS_KEHOACHKIEMDEMVESINHID_2);

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
			query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemVeSinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemHoGD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemHoGD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; from the database.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_coHVS(int keHoachKiemDemVeSinhId)
		throws SystemException {
		for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : findBy_coHVS(
				keHoachKiemDemVeSinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(thongTinKiemDemHoGD);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the number of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_coHVS(int keHoachKiemDemVeSinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__COHVS;

		Object[] finderArgs = new Object[] { keHoachKiemDemVeSinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__COHVS_KEHOACHKIEMDEMVESINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

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

	private static final String _FINDER_COLUMN__COHVS_KEHOACHKIEMDEMVESINHID_2 = "thongTinKiemDemHoGD.keHoachKiemDemVeSinhId = ? AND  ( thongTinKiemDemHoGD.danhGiaKiemDem = 1 OR thongTinKiemDemHoGD.danhGiaKiemDem = 2 ) ";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__COHVSXAYMOI =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_coHVSXayMoi",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COHVSXAYMOI =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_coHVSXayMoi",
			new String[] { Integer.class.getName() },
			ThongTinKiemDemHoGDModelImpl.KEHOACHKIEMDEMVESINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__COHVSXAYMOI = new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_coHVSXayMoi",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_coHVSXayMoi(
		int keHoachKiemDemVeSinhId) throws SystemException {
		return findBy_coHVSXayMoi(keHoachKiemDemVeSinhId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @return the range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_coHVSXayMoi(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws SystemException {
		return findBy_coHVSXayMoi(keHoachKiemDemVeSinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_coHVSXayMoi(
		int keHoachKiemDemVeSinhId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COHVSXAYMOI;
			finderArgs = new Object[] { keHoachKiemDemVeSinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__COHVSXAYMOI;
			finderArgs = new Object[] {
					keHoachKiemDemVeSinhId,
					
					start, end, orderByComparator
				};
		}

		List<ThongTinKiemDemHoGD> list = (List<ThongTinKiemDemHoGD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : list) {
				if ((keHoachKiemDemVeSinhId != thongTinKiemDemHoGD.getKeHoachKiemDemVeSinhId())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__COHVSXAYMOI_KEHOACHKIEMDEMVESINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

				if (!pagination) {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemHoGD>(list);
				}
				else {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_coHVSXayMoi_First(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_coHVSXayMoi_First(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_coHVSXayMoi_First(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ThongTinKiemDemHoGD> list = findBy_coHVSXayMoi(keHoachKiemDemVeSinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_coHVSXayMoi_Last(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_coHVSXayMoi_Last(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_coHVSXayMoi_Last(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBy_coHVSXayMoi(keHoachKiemDemVeSinhId);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemHoGD> list = findBy_coHVSXayMoi(keHoachKiemDemVeSinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem ho g d
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD[] findBy_coHVSXayMoi_PrevAndNext(int id,
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemHoGD[] array = new ThongTinKiemDemHoGDImpl[3];

			array[0] = getBy_coHVSXayMoi_PrevAndNext(session,
					thongTinKiemDemHoGD, keHoachKiemDemVeSinhId,
					orderByComparator, true);

			array[1] = thongTinKiemDemHoGD;

			array[2] = getBy_coHVSXayMoi_PrevAndNext(session,
					thongTinKiemDemHoGD, keHoachKiemDemVeSinhId,
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

	protected ThongTinKiemDemHoGD getBy_coHVSXayMoi_PrevAndNext(
		Session session, ThongTinKiemDemHoGD thongTinKiemDemHoGD,
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

		query.append(_FINDER_COLUMN__COHVSXAYMOI_KEHOACHKIEMDEMVESINHID_2);

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
			query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemVeSinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemHoGD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemHoGD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; from the database.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_coHVSXayMoi(int keHoachKiemDemVeSinhId)
		throws SystemException {
		for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : findBy_coHVSXayMoi(
				keHoachKiemDemVeSinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(thongTinKiemDemHoGD);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the number of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_coHVSXayMoi(int keHoachKiemDemVeSinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__COHVSXAYMOI;

		Object[] finderArgs = new Object[] { keHoachKiemDemVeSinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__COHVSXAYMOI_KEHOACHKIEMDEMVESINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

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

	private static final String _FINDER_COLUMN__COHVSXAYMOI_KEHOACHKIEMDEMVESINHID_2 =
		"thongTinKiemDemHoGD.keHoachKiemDemVeSinhId = ? AND  thongTinKiemDemHoGD.danhGiaKiemDem = 1 ";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__COUNTHGDBYKEHOACH =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_CountHGDByKeHoach",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTHGDBYKEHOACH =
		new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_CountHGDByKeHoach",
			new String[] { Integer.class.getName() },
			ThongTinKiemDemHoGDModelImpl.KEHOACHKIEMDEMVESINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__COUNTHGDBYKEHOACH = new FinderPath(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBy_CountHGDByKeHoach",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_CountHGDByKeHoach(
		int keHoachKiemDemVeSinhId) throws SystemException {
		return findBy_CountHGDByKeHoach(keHoachKiemDemVeSinhId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @return the range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_CountHGDByKeHoach(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws SystemException {
		return findBy_CountHGDByKeHoach(keHoachKiemDemVeSinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findBy_CountHGDByKeHoach(
		int keHoachKiemDemVeSinhId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTHGDBYKEHOACH;
			finderArgs = new Object[] { keHoachKiemDemVeSinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__COUNTHGDBYKEHOACH;
			finderArgs = new Object[] {
					keHoachKiemDemVeSinhId,
					
					start, end, orderByComparator
				};
		}

		List<ThongTinKiemDemHoGD> list = (List<ThongTinKiemDemHoGD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : list) {
				if ((keHoachKiemDemVeSinhId != thongTinKiemDemHoGD.getKeHoachKiemDemVeSinhId())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__COUNTHGDBYKEHOACH_KEHOACHKIEMDEMVESINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

				if (!pagination) {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemHoGD>(list);
				}
				else {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_CountHGDByKeHoach_First(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_CountHGDByKeHoach_First(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_CountHGDByKeHoach_First(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ThongTinKiemDemHoGD> list = findBy_CountHGDByKeHoach(keHoachKiemDemVeSinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findBy_CountHGDByKeHoach_Last(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchBy_CountHGDByKeHoach_Last(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemHoGD != null) {
			return thongTinKiemDemHoGD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemHoGDException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem ho g d, or <code>null</code> if a matching thong tin kiem dem ho g d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchBy_CountHGDByKeHoach_Last(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBy_CountHGDByKeHoach(keHoachKiemDemVeSinhId);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemHoGD> list = findBy_CountHGDByKeHoach(keHoachKiemDemVeSinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem ho g ds before and after the current thong tin kiem dem ho g d in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem ho g d
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD[] findBy_CountHGDByKeHoach_PrevAndNext(int id,
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemHoGD[] array = new ThongTinKiemDemHoGDImpl[3];

			array[0] = getBy_CountHGDByKeHoach_PrevAndNext(session,
					thongTinKiemDemHoGD, keHoachKiemDemVeSinhId,
					orderByComparator, true);

			array[1] = thongTinKiemDemHoGD;

			array[2] = getBy_CountHGDByKeHoach_PrevAndNext(session,
					thongTinKiemDemHoGD, keHoachKiemDemVeSinhId,
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

	protected ThongTinKiemDemHoGD getBy_CountHGDByKeHoach_PrevAndNext(
		Session session, ThongTinKiemDemHoGD thongTinKiemDemHoGD,
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE);

		query.append(_FINDER_COLUMN__COUNTHGDBYKEHOACH_KEHOACHKIEMDEMVESINHID_2);

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
			query.append(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemVeSinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemHoGD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemHoGD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63; from the database.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_CountHGDByKeHoach(int keHoachKiemDemVeSinhId)
		throws SystemException {
		for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : findBy_CountHGDByKeHoach(
				keHoachKiemDemVeSinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(thongTinKiemDemHoGD);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem ho g ds where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the number of matching thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_CountHGDByKeHoach(int keHoachKiemDemVeSinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__COUNTHGDBYKEHOACH;

		Object[] finderArgs = new Object[] { keHoachKiemDemVeSinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGTINKIEMDEMHOGD_WHERE);

			query.append(_FINDER_COLUMN__COUNTHGDBYKEHOACH_KEHOACHKIEMDEMVESINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

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

	private static final String _FINDER_COLUMN__COUNTHGDBYKEHOACH_KEHOACHKIEMDEMVESINHID_2 =
		"thongTinKiemDemHoGD.keHoachKiemDemVeSinhId = ? AND  ( thongTinKiemDemHoGD.daKetThucDieuTra = 0 OR thongTinKiemDemHoGD.daKetThucDieuTra = 1 OR thongTinKiemDemHoGD.daKetThucDieuTra = 2 ) ";

	public ThongTinKiemDemHoGDPersistenceImpl() {
		setModelClass(ThongTinKiemDemHoGD.class);
	}

	/**
	 * Caches the thong tin kiem dem ho g d in the entity cache if it is enabled.
	 *
	 * @param thongTinKiemDemHoGD the thong tin kiem dem ho g d
	 */
	@Override
	public void cacheResult(ThongTinKiemDemHoGD thongTinKiemDemHoGD) {
		EntityCacheUtil.putResult(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class, thongTinKiemDemHoGD.getPrimaryKey(),
			thongTinKiemDemHoGD);

		thongTinKiemDemHoGD.resetOriginalValues();
	}

	/**
	 * Caches the thong tin kiem dem ho g ds in the entity cache if it is enabled.
	 *
	 * @param thongTinKiemDemHoGDs the thong tin kiem dem ho g ds
	 */
	@Override
	public void cacheResult(List<ThongTinKiemDemHoGD> thongTinKiemDemHoGDs) {
		for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : thongTinKiemDemHoGDs) {
			if (EntityCacheUtil.getResult(
						ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
						ThongTinKiemDemHoGDImpl.class,
						thongTinKiemDemHoGD.getPrimaryKey()) == null) {
				cacheResult(thongTinKiemDemHoGD);
			}
			else {
				thongTinKiemDemHoGD.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all thong tin kiem dem ho g ds.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ThongTinKiemDemHoGDImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ThongTinKiemDemHoGDImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the thong tin kiem dem ho g d.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ThongTinKiemDemHoGD thongTinKiemDemHoGD) {
		EntityCacheUtil.removeResult(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class, thongTinKiemDemHoGD.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ThongTinKiemDemHoGD> thongTinKiemDemHoGDs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : thongTinKiemDemHoGDs) {
			EntityCacheUtil.removeResult(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
				ThongTinKiemDemHoGDImpl.class,
				thongTinKiemDemHoGD.getPrimaryKey());
		}
	}

	/**
	 * Creates a new thong tin kiem dem ho g d with the primary key. Does not add the thong tin kiem dem ho g d to the database.
	 *
	 * @param id the primary key for the new thong tin kiem dem ho g d
	 * @return the new thong tin kiem dem ho g d
	 */
	@Override
	public ThongTinKiemDemHoGD create(int id) {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = new ThongTinKiemDemHoGDImpl();

		thongTinKiemDemHoGD.setNew(true);
		thongTinKiemDemHoGD.setPrimaryKey(id);

		return thongTinKiemDemHoGD;
	}

	/**
	 * Removes the thong tin kiem dem ho g d with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the thong tin kiem dem ho g d
	 * @return the thong tin kiem dem ho g d that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD remove(int id)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the thong tin kiem dem ho g d with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the thong tin kiem dem ho g d
	 * @return the thong tin kiem dem ho g d that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD remove(Serializable primaryKey)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemHoGD thongTinKiemDemHoGD = (ThongTinKiemDemHoGD)session.get(ThongTinKiemDemHoGDImpl.class,
					primaryKey);

			if (thongTinKiemDemHoGD == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchThongTinKiemDemHoGDException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thongTinKiemDemHoGD);
		}
		catch (NoSuchThongTinKiemDemHoGDException nsee) {
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
	protected ThongTinKiemDemHoGD removeImpl(
		ThongTinKiemDemHoGD thongTinKiemDemHoGD) throws SystemException {
		thongTinKiemDemHoGD = toUnwrappedModel(thongTinKiemDemHoGD);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thongTinKiemDemHoGD)) {
				thongTinKiemDemHoGD = (ThongTinKiemDemHoGD)session.get(ThongTinKiemDemHoGDImpl.class,
						thongTinKiemDemHoGD.getPrimaryKeyObj());
			}

			if (thongTinKiemDemHoGD != null) {
				session.delete(thongTinKiemDemHoGD);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thongTinKiemDemHoGD != null) {
			clearCache(thongTinKiemDemHoGD);
		}

		return thongTinKiemDemHoGD;
	}

	@Override
	public ThongTinKiemDemHoGD updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD thongTinKiemDemHoGD)
		throws SystemException {
		thongTinKiemDemHoGD = toUnwrappedModel(thongTinKiemDemHoGD);

		boolean isNew = thongTinKiemDemHoGD.isNew();

		ThongTinKiemDemHoGDModelImpl thongTinKiemDemHoGDModelImpl = (ThongTinKiemDemHoGDModelImpl)thongTinKiemDemHoGD;

		Session session = null;

		try {
			session = openSession();

			if (thongTinKiemDemHoGD.isNew()) {
				session.save(thongTinKiemDemHoGD);

				thongTinKiemDemHoGD.setNew(false);
			}
			else {
				session.merge(thongTinKiemDemHoGD);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ThongTinKiemDemHoGDModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((thongTinKiemDemHoGDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__VESINHGIADINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getOriginalVeSinhGiaDinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__VESINHGIADINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__VESINHGIADINHID,
					args);

				args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getVeSinhGiaDinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__VESINHGIADINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__VESINHGIADINHID,
					args);
			}

			if ((thongTinKiemDemHoGDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getOriginalKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID,
					args);

				args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID,
					args);
			}

			if ((thongTinKiemDemHoGDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getOriginalKeHoachKiemDemVeSinhId(),
						thongTinKiemDemHoGDModelImpl.getOriginalDaKetThucDieuTra()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA,
					args);

				args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getKeHoachKiemDemVeSinhId(),
						thongTinKiemDemHoGDModelImpl.getDaKetThucDieuTra()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA,
					args);
			}

			if ((thongTinKiemDemHoGDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getOriginalKeHoachKiemDemVeSinhId(),
						thongTinKiemDemHoGDModelImpl.getOriginalDanhGiaKiemDem()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM,
					args);

				args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getKeHoachKiemDemVeSinhId(),
						thongTinKiemDemHoGDModelImpl.getDanhGiaKiemDem()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM,
					args);
			}

			if ((thongTinKiemDemHoGDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__CONHAVESINH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getOriginalKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__CONHAVESINH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__CONHAVESINH,
					args);

				args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__CONHAVESINH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__CONHAVESINH,
					args);
			}

			if ((thongTinKiemDemHoGDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COHVS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getOriginalKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__COHVS, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COHVS,
					args);

				args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__COHVS, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COHVS,
					args);
			}

			if ((thongTinKiemDemHoGDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COHVSXAYMOI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getOriginalKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__COHVSXAYMOI,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COHVSXAYMOI,
					args);

				args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__COHVSXAYMOI,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COHVSXAYMOI,
					args);
			}

			if ((thongTinKiemDemHoGDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTHGDBYKEHOACH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getOriginalKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__COUNTHGDBYKEHOACH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTHGDBYKEHOACH,
					args);

				args = new Object[] {
						thongTinKiemDemHoGDModelImpl.getKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__COUNTHGDBYKEHOACH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTHGDBYKEHOACH,
					args);
			}
		}

		EntityCacheUtil.putResult(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemHoGDImpl.class, thongTinKiemDemHoGD.getPrimaryKey(),
			thongTinKiemDemHoGD);

		return thongTinKiemDemHoGD;
	}

	protected ThongTinKiemDemHoGD toUnwrappedModel(
		ThongTinKiemDemHoGD thongTinKiemDemHoGD) {
		if (thongTinKiemDemHoGD instanceof ThongTinKiemDemHoGDImpl) {
			return thongTinKiemDemHoGD;
		}

		ThongTinKiemDemHoGDImpl thongTinKiemDemHoGDImpl = new ThongTinKiemDemHoGDImpl();

		thongTinKiemDemHoGDImpl.setNew(thongTinKiemDemHoGD.isNew());
		thongTinKiemDemHoGDImpl.setPrimaryKey(thongTinKiemDemHoGD.getPrimaryKey());

		thongTinKiemDemHoGDImpl.setId(thongTinKiemDemHoGD.getId());
		thongTinKiemDemHoGDImpl.setVeSinhGiaDinhId(thongTinKiemDemHoGD.getVeSinhGiaDinhId());
		thongTinKiemDemHoGDImpl.setKeHoachKiemDemVeSinhId(thongTinKiemDemHoGD.getKeHoachKiemDemVeSinhId());
		thongTinKiemDemHoGDImpl.setMaTinh(thongTinKiemDemHoGD.getMaTinh());
		thongTinKiemDemHoGDImpl.setMaHuyen(thongTinKiemDemHoGD.getMaHuyen());
		thongTinKiemDemHoGDImpl.setMaXa(thongTinKiemDemHoGD.getMaXa());
		thongTinKiemDemHoGDImpl.setThonXom(thongTinKiemDemHoGD.getThonXom());
		thongTinKiemDemHoGDImpl.setTenChuHo(thongTinKiemDemHoGD.getTenChuHo());
		thongTinKiemDemHoGDImpl.setGioiTinhChuHo(thongTinKiemDemHoGD.getGioiTinhChuHo());
		thongTinKiemDemHoGDImpl.setNgayKiemDem(thongTinKiemDemHoGD.getNgayKiemDem());
		thongTinKiemDemHoGDImpl.setTimThayNha(thongTinKiemDemHoGD.getTimThayNha());
		thongTinKiemDemHoGDImpl.setCoNguoiONha(thongTinKiemDemHoGD.getCoNguoiONha());
		thongTinKiemDemHoGDImpl.setSoNguoiTrongHo(thongTinKiemDemHoGD.getSoNguoiTrongHo());
		thongTinKiemDemHoGDImpl.setHoTenNguoiTraLoi(thongTinKiemDemHoGD.getHoTenNguoiTraLoi());
		thongTinKiemDemHoGDImpl.setLaChuHoKhong(thongTinKiemDemHoGD.getLaChuHoKhong());
		thongTinKiemDemHoGDImpl.setGioiTinhNguoiTraLoi(thongTinKiemDemHoGD.getGioiTinhNguoiTraLoi());
		thongTinKiemDemHoGDImpl.setTenDanToc(thongTinKiemDemHoGD.getTenDanToc());
		thongTinKiemDemHoGDImpl.setKinhDo(thongTinKiemDemHoGD.getKinhDo());
		thongTinKiemDemHoGDImpl.setViDo(thongTinKiemDemHoGD.getViDo());
		thongTinKiemDemHoGDImpl.setThanhPhanHoGD(thongTinKiemDemHoGD.getThanhPhanHoGD());
		thongTinKiemDemHoGDImpl.setChuHoDungDS(thongTinKiemDemHoGD.getChuHoDungDS());
		thongTinKiemDemHoGDImpl.setLyDoKhongDungDS(thongTinKiemDemHoGD.getLyDoKhongDungDS());
		thongTinKiemDemHoGDImpl.setTenChuHoHienTai(thongTinKiemDemHoGD.getTenChuHoHienTai());
		thongTinKiemDemHoGDImpl.setGioiTinhChuHoHienTai(thongTinKiemDemHoGD.getGioiTinhChuHoHienTai());
		thongTinKiemDemHoGDImpl.setCoNhaTieu(thongTinKiemDemHoGD.getCoNhaTieu());
		thongTinKiemDemHoGDImpl.setLoaiNguonNuoc(thongTinKiemDemHoGD.getLoaiNguonNuoc());
		thongTinKiemDemHoGDImpl.setLoaiNhaTieu(thongTinKiemDemHoGD.getLoaiNhaTieu());
		thongTinKiemDemHoGDImpl.setAnhToanCanh(thongTinKiemDemHoGD.getAnhToanCanh());
		thongTinKiemDemHoGDImpl.setAnhTrongNhaTieu(thongTinKiemDemHoGD.getAnhTrongNhaTieu());
		thongTinKiemDemHoGDImpl.setThangXayDung(thongTinKiemDemHoGD.getThangXayDung());
		thongTinKiemDemHoGDImpl.setNamXayDung(thongTinKiemDemHoGD.getNamXayDung());
		thongTinKiemDemHoGDImpl.setNguonVon(thongTinKiemDemHoGD.getNguonVon());
		thongTinKiemDemHoGDImpl.setChiTietVonVay(thongTinKiemDemHoGD.getChiTietVonVay());
		thongTinKiemDemHoGDImpl.setDuocCaiTao(thongTinKiemDemHoGD.getDuocCaiTao());
		thongTinKiemDemHoGDImpl.setLoaiNhaTieuCu(thongTinKiemDemHoGD.getLoaiNhaTieuCu());
		thongTinKiemDemHoGDImpl.setAnhBeChua(thongTinKiemDemHoGD.getAnhBeChua());
		thongTinKiemDemHoGDImpl.setVeSinhSachSe(thongTinKiemDemHoGD.getVeSinhSachSe());
		thongTinKiemDemHoGDImpl.setDeLamVeSinh(thongTinKiemDemHoGD.getDeLamVeSinh());
		thongTinKiemDemHoGDImpl.setMuiVeSinh(thongTinKiemDemHoGD.getMuiVeSinh());
		thongTinKiemDemHoGDImpl.setPhiaTrenKinDao(thongTinKiemDemHoGD.getPhiaTrenKinDao());
		thongTinKiemDemHoGDImpl.setDuCheMuaGio(thongTinKiemDemHoGD.getDuCheMuaGio());
		thongTinKiemDemHoGDImpl.setSanCaoTrenToiThieu(thongTinKiemDemHoGD.getSanCaoTrenToiThieu());
		thongTinKiemDemHoGDImpl.setNapBeConTot(thongTinKiemDemHoGD.getNapBeConTot());
		thongTinKiemDemHoGDImpl.setCuaPhanBitKin(thongTinKiemDemHoGD.getCuaPhanBitKin());
		thongTinKiemDemHoGDImpl.setTranRaNgoai(thongTinKiemDemHoGD.getTranRaNgoai());
		thongTinKiemDemHoGDImpl.setNuocThaiDiDau(thongTinKiemDemHoGD.getNuocThaiDiDau());
		thongTinKiemDemHoGDImpl.setKhoangCachNguonNuoc(thongTinKiemDemHoGD.getKhoangCachNguonNuoc());
		thongTinKiemDemHoGDImpl.setNgapKhiMuaLon(thongTinKiemDemHoGD.getNgapKhiMuaLon());
		thongTinKiemDemHoGDImpl.setGhiChu(thongTinKiemDemHoGD.getGhiChu());
		thongTinKiemDemHoGDImpl.setDaKetThucDieuTra(thongTinKiemDemHoGD.getDaKetThucDieuTra());
		thongTinKiemDemHoGDImpl.setLyDoKhongHoanThanh(thongTinKiemDemHoGD.getLyDoKhongHoanThanh());
		thongTinKiemDemHoGDImpl.setImei(thongTinKiemDemHoGD.getImei());
		thongTinKiemDemHoGDImpl.setTaiKhoan(thongTinKiemDemHoGD.getTaiKhoan());
		thongTinKiemDemHoGDImpl.setDanhGiaKiemDem(thongTinKiemDemHoGD.getDanhGiaKiemDem());
		thongTinKiemDemHoGDImpl.setSavePoint(thongTinKiemDemHoGD.getSavePoint());

		return thongTinKiemDemHoGDImpl;
	}

	/**
	 * Returns the thong tin kiem dem ho g d with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the thong tin kiem dem ho g d
	 * @return the thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findByPrimaryKey(Serializable primaryKey)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = fetchByPrimaryKey(primaryKey);

		if (thongTinKiemDemHoGD == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchThongTinKiemDemHoGDException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thongTinKiemDemHoGD;
	}

	/**
	 * Returns the thong tin kiem dem ho g d with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException} if it could not be found.
	 *
	 * @param id the primary key of the thong tin kiem dem ho g d
	 * @return the thong tin kiem dem ho g d
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemHoGDException if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD findByPrimaryKey(int id)
		throws NoSuchThongTinKiemDemHoGDException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the thong tin kiem dem ho g d with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the thong tin kiem dem ho g d
	 * @return the thong tin kiem dem ho g d, or <code>null</code> if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ThongTinKiemDemHoGD thongTinKiemDemHoGD = (ThongTinKiemDemHoGD)EntityCacheUtil.getResult(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
				ThongTinKiemDemHoGDImpl.class, primaryKey);

		if (thongTinKiemDemHoGD == _nullThongTinKiemDemHoGD) {
			return null;
		}

		if (thongTinKiemDemHoGD == null) {
			Session session = null;

			try {
				session = openSession();

				thongTinKiemDemHoGD = (ThongTinKiemDemHoGD)session.get(ThongTinKiemDemHoGDImpl.class,
						primaryKey);

				if (thongTinKiemDemHoGD != null) {
					cacheResult(thongTinKiemDemHoGD);
				}
				else {
					EntityCacheUtil.putResult(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
						ThongTinKiemDemHoGDImpl.class, primaryKey,
						_nullThongTinKiemDemHoGD);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ThongTinKiemDemHoGDModelImpl.ENTITY_CACHE_ENABLED,
					ThongTinKiemDemHoGDImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thongTinKiemDemHoGD;
	}

	/**
	 * Returns the thong tin kiem dem ho g d with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the thong tin kiem dem ho g d
	 * @return the thong tin kiem dem ho g d, or <code>null</code> if a thong tin kiem dem ho g d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemHoGD fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the thong tin kiem dem ho g ds.
	 *
	 * @return the thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem ho g ds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @return the range of thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem ho g ds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemHoGDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong tin kiem dem ho g ds
	 * @param end the upper bound of the range of thong tin kiem dem ho g ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of thong tin kiem dem ho g ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemHoGD> findAll(int start, int end,
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

		List<ThongTinKiemDemHoGD> list = (List<ThongTinKiemDemHoGD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THONGTINKIEMDEMHOGD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THONGTINKIEMDEMHOGD;

				if (pagination) {
					sql = sql.concat(ThongTinKiemDemHoGDModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemHoGD>(list);
				}
				else {
					list = (List<ThongTinKiemDemHoGD>)QueryUtil.list(q,
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
	 * Removes all the thong tin kiem dem ho g ds from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : findAll()) {
			remove(thongTinKiemDemHoGD);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem ho g ds.
	 *
	 * @return the number of thong tin kiem dem ho g ds
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

				Query q = session.createQuery(_SQL_COUNT_THONGTINKIEMDEMHOGD);

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
	 * Initializes the thong tin kiem dem ho g d persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ThongTinKiemDemHoGD>> listenersList = new ArrayList<ModelListener<ThongTinKiemDemHoGD>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ThongTinKiemDemHoGD>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ThongTinKiemDemHoGDImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THONGTINKIEMDEMHOGD = "SELECT thongTinKiemDemHoGD FROM ThongTinKiemDemHoGD thongTinKiemDemHoGD";
	private static final String _SQL_SELECT_THONGTINKIEMDEMHOGD_WHERE = "SELECT thongTinKiemDemHoGD FROM ThongTinKiemDemHoGD thongTinKiemDemHoGD WHERE ";
	private static final String _SQL_COUNT_THONGTINKIEMDEMHOGD = "SELECT COUNT(thongTinKiemDemHoGD) FROM ThongTinKiemDemHoGD thongTinKiemDemHoGD";
	private static final String _SQL_COUNT_THONGTINKIEMDEMHOGD_WHERE = "SELECT COUNT(thongTinKiemDemHoGD) FROM ThongTinKiemDemHoGD thongTinKiemDemHoGD WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thongTinKiemDemHoGD.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ThongTinKiemDemHoGD exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ThongTinKiemDemHoGD exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ThongTinKiemDemHoGDPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "veSinhGiaDinhId", "keHoachKiemDemVeSinhId", "maTinh",
				"maHuyen", "maXa", "thonXom", "tenChuHo", "gioiTinhChuHo",
				"ngayKiemDem", "timThayNha", "coNguoiONha", "soNguoiTrongHo",
				"hoTenNguoiTraLoi", "laChuHoKhong", "gioiTinhNguoiTraLoi",
				"tenDanToc", "kinhDo", "viDo", "thanhPhanHoGD", "chuHoDungDS",
				"lyDoKhongDungDS", "tenChuHoHienTai", "gioiTinhChuHoHienTai",
				"coNhaTieu", "loaiNguonNuoc", "loaiNhaTieu", "anhToanCanh",
				"anhTrongNhaTieu", "thangXayDung", "namXayDung", "nguonVon",
				"chiTietVonVay", "duocCaiTao", "loaiNhaTieuCu", "anhBeChua",
				"veSinhSachSe", "deLamVeSinh", "muiVeSinh", "phiaTrenKinDao",
				"duCheMuaGio", "sanCaoTrenToiThieu", "napBeConTot",
				"cuaPhanBitKin", "tranRaNgoai", "nuocThaiDiDau",
				"khoangCachNguonNuoc", "ngapKhiMuaLon", "ghiChu",
				"daKetThucDieuTra", "lyDoKhongHoanThanh", "imei", "taiKhoan",
				"danhGiaKiemDem", "savePoint"
			});
	private static ThongTinKiemDemHoGD _nullThongTinKiemDemHoGD = new ThongTinKiemDemHoGDImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ThongTinKiemDemHoGD> toCacheModel() {
				return _nullThongTinKiemDemHoGDCacheModel;
			}
		};

	private static CacheModel<ThongTinKiemDemHoGD> _nullThongTinKiemDemHoGDCacheModel =
		new CacheModel<ThongTinKiemDemHoGD>() {
			@Override
			public ThongTinKiemDemHoGD toEntityModel() {
				return _nullThongTinKiemDemHoGD;
			}
		};
}