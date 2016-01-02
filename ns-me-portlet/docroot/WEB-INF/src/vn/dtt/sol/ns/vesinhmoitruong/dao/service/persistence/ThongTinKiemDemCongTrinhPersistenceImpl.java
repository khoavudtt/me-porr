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

import vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the thong tin kiem dem cong trinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see ThongTinKiemDemCongTrinhPersistence
 * @see ThongTinKiemDemCongTrinhUtil
 * @generated
 */
public class ThongTinKiemDemCongTrinhPersistenceImpl extends BasePersistenceImpl<ThongTinKiemDemCongTrinh>
	implements ThongTinKiemDemCongTrinhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ThongTinKiemDemCongTrinhUtil} to access the thong tin kiem dem cong trinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ThongTinKiemDemCongTrinhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__VESINHCONTRINHID =
		new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_veSinhConTrinhId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__VESINHCONTRINHID =
		new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_veSinhConTrinhId",
			new String[] { Integer.class.getName() },
			ThongTinKiemDemCongTrinhModelImpl.VESINHCONTRINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__VESINHCONTRINHID = new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBy_veSinhConTrinhId", new String[] { Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63;.
	 *
	 * @param veSinhConTrinhId the ve sinh con trinh ID
	 * @return the matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_veSinhConTrinhId(
		int veSinhConTrinhId) throws SystemException {
		return findBy_veSinhConTrinhId(veSinhConTrinhId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param veSinhConTrinhId the ve sinh con trinh ID
	 * @param start the lower bound of the range of thong tin kiem dem cong trinhs
	 * @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	 * @return the range of matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_veSinhConTrinhId(
		int veSinhConTrinhId, int start, int end) throws SystemException {
		return findBy_veSinhConTrinhId(veSinhConTrinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param veSinhConTrinhId the ve sinh con trinh ID
	 * @param start the lower bound of the range of thong tin kiem dem cong trinhs
	 * @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_veSinhConTrinhId(
		int veSinhConTrinhId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__VESINHCONTRINHID;
			finderArgs = new Object[] { veSinhConTrinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__VESINHCONTRINHID;
			finderArgs = new Object[] {
					veSinhConTrinhId,
					
					start, end, orderByComparator
				};
		}

		List<ThongTinKiemDemCongTrinh> list = (List<ThongTinKiemDemCongTrinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : list) {
				if ((veSinhConTrinhId != thongTinKiemDemCongTrinh.getVeSinhConTrinhId())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMCONGTRINH_WHERE);

			query.append(_FINDER_COLUMN__VESINHCONTRINHID_VESINHCONTRINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(veSinhConTrinhId);

				if (!pagination) {
					list = (List<ThongTinKiemDemCongTrinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemCongTrinh>(list);
				}
				else {
					list = (List<ThongTinKiemDemCongTrinh>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	 *
	 * @param veSinhConTrinhId the ve sinh con trinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh findBy_veSinhConTrinhId_First(
		int veSinhConTrinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = fetchBy_veSinhConTrinhId_First(veSinhConTrinhId,
				orderByComparator);

		if (thongTinKiemDemCongTrinh != null) {
			return thongTinKiemDemCongTrinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("veSinhConTrinhId=");
		msg.append(veSinhConTrinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemCongTrinhException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	 *
	 * @param veSinhConTrinhId the ve sinh con trinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh fetchBy_veSinhConTrinhId_First(
		int veSinhConTrinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ThongTinKiemDemCongTrinh> list = findBy_veSinhConTrinhId(veSinhConTrinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	 *
	 * @param veSinhConTrinhId the ve sinh con trinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh findBy_veSinhConTrinhId_Last(
		int veSinhConTrinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = fetchBy_veSinhConTrinhId_Last(veSinhConTrinhId,
				orderByComparator);

		if (thongTinKiemDemCongTrinh != null) {
			return thongTinKiemDemCongTrinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("veSinhConTrinhId=");
		msg.append(veSinhConTrinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemCongTrinhException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	 *
	 * @param veSinhConTrinhId the ve sinh con trinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh fetchBy_veSinhConTrinhId_Last(
		int veSinhConTrinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBy_veSinhConTrinhId(veSinhConTrinhId);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemCongTrinh> list = findBy_veSinhConTrinhId(veSinhConTrinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem cong trinhs before and after the current thong tin kiem dem cong trinh in the ordered set where veSinhConTrinhId = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem cong trinh
	 * @param veSinhConTrinhId the ve sinh con trinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh[] findBy_veSinhConTrinhId_PrevAndNext(
		int id, int veSinhConTrinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemCongTrinh[] array = new ThongTinKiemDemCongTrinhImpl[3];

			array[0] = getBy_veSinhConTrinhId_PrevAndNext(session,
					thongTinKiemDemCongTrinh, veSinhConTrinhId,
					orderByComparator, true);

			array[1] = thongTinKiemDemCongTrinh;

			array[2] = getBy_veSinhConTrinhId_PrevAndNext(session,
					thongTinKiemDemCongTrinh, veSinhConTrinhId,
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

	protected ThongTinKiemDemCongTrinh getBy_veSinhConTrinhId_PrevAndNext(
		Session session, ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh,
		int veSinhConTrinhId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGTINKIEMDEMCONGTRINH_WHERE);

		query.append(_FINDER_COLUMN__VESINHCONTRINHID_VESINHCONTRINHID_2);

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
			query.append(ThongTinKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(veSinhConTrinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemCongTrinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemCongTrinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63; from the database.
	 *
	 * @param veSinhConTrinhId the ve sinh con trinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_veSinhConTrinhId(int veSinhConTrinhId)
		throws SystemException {
		for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : findBy_veSinhConTrinhId(
				veSinhConTrinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongTinKiemDemCongTrinh);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem cong trinhs where veSinhConTrinhId = &#63;.
	 *
	 * @param veSinhConTrinhId the ve sinh con trinh ID
	 * @return the number of matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_veSinhConTrinhId(int veSinhConTrinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__VESINHCONTRINHID;

		Object[] finderArgs = new Object[] { veSinhConTrinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGTINKIEMDEMCONGTRINH_WHERE);

			query.append(_FINDER_COLUMN__VESINHCONTRINHID_VESINHCONTRINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(veSinhConTrinhId);

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

	private static final String _FINDER_COLUMN__VESINHCONTRINHID_VESINHCONTRINHID_2 =
		"thongTinKiemDemCongTrinh.veSinhConTrinhId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID =
		new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_keHoachKiemDemVeSinhId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID =
		new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_keHoachKiemDemVeSinhId",
			new String[] { Integer.class.getName() },
			ThongTinKiemDemCongTrinhModelImpl.KEHOACHKIEMDEMVESINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID = new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBy_keHoachKiemDemVeSinhId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId) throws SystemException {
		return findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem cong trinhs
	 * @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	 * @return the range of matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws SystemException {
		return findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem cong trinhs
	 * @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId(
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

		List<ThongTinKiemDemCongTrinh> list = (List<ThongTinKiemDemCongTrinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : list) {
				if ((keHoachKiemDemVeSinhId != thongTinKiemDemCongTrinh.getKeHoachKiemDemVeSinhId())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMCONGTRINH_WHERE);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_KEHOACHKIEMDEMVESINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

				if (!pagination) {
					list = (List<ThongTinKiemDemCongTrinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemCongTrinh>(list);
				}
				else {
					list = (List<ThongTinKiemDemCongTrinh>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_First(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = fetchBy_keHoachKiemDemVeSinhId_First(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemCongTrinh != null) {
			return thongTinKiemDemCongTrinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemCongTrinhException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_First(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ThongTinKiemDemCongTrinh> list = findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_Last(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = fetchBy_keHoachKiemDemVeSinhId_Last(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemCongTrinh != null) {
			return thongTinKiemDemCongTrinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemCongTrinhException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_Last(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemCongTrinh> list = findBy_keHoachKiemDemVeSinhId(keHoachKiemDemVeSinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem cong trinhs before and after the current thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem cong trinh
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh[] findBy_keHoachKiemDemVeSinhId_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemCongTrinh[] array = new ThongTinKiemDemCongTrinhImpl[3];

			array[0] = getBy_keHoachKiemDemVeSinhId_PrevAndNext(session,
					thongTinKiemDemCongTrinh, keHoachKiemDemVeSinhId,
					orderByComparator, true);

			array[1] = thongTinKiemDemCongTrinh;

			array[2] = getBy_keHoachKiemDemVeSinhId_PrevAndNext(session,
					thongTinKiemDemCongTrinh, keHoachKiemDemVeSinhId,
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

	protected ThongTinKiemDemCongTrinh getBy_keHoachKiemDemVeSinhId_PrevAndNext(
		Session session, ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh,
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

		query.append(_SQL_SELECT_THONGTINKIEMDEMCONGTRINH_WHERE);

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
			query.append(ThongTinKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemVeSinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemCongTrinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemCongTrinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; from the database.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_keHoachKiemDemVeSinhId(int keHoachKiemDemVeSinhId)
		throws SystemException {
		for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : findBy_keHoachKiemDemVeSinhId(
				keHoachKiemDemVeSinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(thongTinKiemDemCongTrinh);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the number of matching thong tin kiem dem cong trinhs
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

			query.append(_SQL_COUNT_THONGTINKIEMDEMCONGTRINH_WHERE);

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
		"thongTinKiemDemCongTrinh.keHoachKiemDemVeSinhId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA =
		new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA =
		new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			ThongTinKiemDemCongTrinhModelImpl.KEHOACHKIEMDEMVESINHID_COLUMN_BITMASK |
			ThongTinKiemDemCongTrinhModelImpl.DAKETTHUCDIEUTRA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA =
		new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBy_keHoachKiemDemVeSinhId_daKetThucDieuTra",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @return the matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws SystemException {
		return findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
			daKetThucDieuTra, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param start the lower bound of the range of thong tin kiem dem cong trinhs
	 * @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	 * @return the range of matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra, int start, int end)
		throws SystemException {
		return findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
			daKetThucDieuTra, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param start the lower bound of the range of thong tin kiem dem cong trinhs
	 * @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
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

		List<ThongTinKiemDemCongTrinh> list = (List<ThongTinKiemDemCongTrinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : list) {
				if ((keHoachKiemDemVeSinhId != thongTinKiemDemCongTrinh.getKeHoachKiemDemVeSinhId()) ||
						(daKetThucDieuTra != thongTinKiemDemCongTrinh.getDaKetThucDieuTra())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMCONGTRINH_WHERE);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA_KEHOACHKIEMDEMVESINHID_2);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA_DAKETTHUCDIEUTRA_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
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
					list = (List<ThongTinKiemDemCongTrinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemCongTrinh>(list);
				}
				else {
					list = (List<ThongTinKiemDemCongTrinh>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(keHoachKiemDemVeSinhId,
				daKetThucDieuTra, orderByComparator);

		if (thongTinKiemDemCongTrinh != null) {
			return thongTinKiemDemCongTrinh;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(", daKetThucDieuTra=");
		msg.append(daKetThucDieuTra);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemCongTrinhException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_First(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		OrderByComparator orderByComparator) throws SystemException {
		List<ThongTinKiemDemCongTrinh> list = findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
				daKetThucDieuTra, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(keHoachKiemDemVeSinhId,
				daKetThucDieuTra, orderByComparator);

		if (thongTinKiemDemCongTrinh != null) {
			return thongTinKiemDemCongTrinh;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(", daKetThucDieuTra=");
		msg.append(daKetThucDieuTra);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemCongTrinhException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_Last(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
				daKetThucDieuTra);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemCongTrinh> list = findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(keHoachKiemDemVeSinhId,
				daKetThucDieuTra, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem cong trinhs before and after the current thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem cong trinh
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh[] findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, int daKetThucDieuTra,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemCongTrinh[] array = new ThongTinKiemDemCongTrinhImpl[3];

			array[0] = getBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_PrevAndNext(session,
					thongTinKiemDemCongTrinh, keHoachKiemDemVeSinhId,
					daKetThucDieuTra, orderByComparator, true);

			array[1] = thongTinKiemDemCongTrinh;

			array[2] = getBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_PrevAndNext(session,
					thongTinKiemDemCongTrinh, keHoachKiemDemVeSinhId,
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

	protected ThongTinKiemDemCongTrinh getBy_keHoachKiemDemVeSinhId_daKetThucDieuTra_PrevAndNext(
		Session session, ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh,
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

		query.append(_SQL_SELECT_THONGTINKIEMDEMCONGTRINH_WHERE);

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
			query.append(ThongTinKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemVeSinhId);

		qPos.add(daKetThucDieuTra);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemCongTrinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemCongTrinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63; from the database.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
		int keHoachKiemDemVeSinhId, int daKetThucDieuTra)
		throws SystemException {
		for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : findBy_keHoachKiemDemVeSinhId_daKetThucDieuTra(
				keHoachKiemDemVeSinhId, daKetThucDieuTra, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(thongTinKiemDemCongTrinh);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and daKetThucDieuTra = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param daKetThucDieuTra the da ket thuc dieu tra
	 * @return the number of matching thong tin kiem dem cong trinhs
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

			query.append(_SQL_COUNT_THONGTINKIEMDEMCONGTRINH_WHERE);

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
		"thongTinKiemDemCongTrinh.keHoachKiemDemVeSinhId = ? AND ";
	private static final String _FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA_DAKETTHUCDIEUTRA_2 =
		"thongTinKiemDemCongTrinh.daKetThucDieuTra = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM =
		new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM =
		new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			ThongTinKiemDemCongTrinhModelImpl.KEHOACHKIEMDEMVESINHID_COLUMN_BITMASK |
			ThongTinKiemDemCongTrinhModelImpl.DANHGIAKIEMDEM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM =
		new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBy_keHoachKiemDemVeSinhId_danhGiaKiemDem",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @return the matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws SystemException {
		return findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param start the lower bound of the range of thong tin kiem dem cong trinhs
	 * @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	 * @return the range of matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem, int start, int end)
		throws SystemException {
		return findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
			danhGiaKiemDem, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param start the lower bound of the range of thong tin kiem dem cong trinhs
	 * @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
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

		List<ThongTinKiemDemCongTrinh> list = (List<ThongTinKiemDemCongTrinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : list) {
				if ((keHoachKiemDemVeSinhId != thongTinKiemDemCongTrinh.getKeHoachKiemDemVeSinhId()) ||
						(danhGiaKiemDem != thongTinKiemDemCongTrinh.getDanhGiaKiemDem())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMCONGTRINH_WHERE);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM_KEHOACHKIEMDEMVESINHID_2);

			query.append(_FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM_DANHGIAKIEMDEM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
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
					list = (List<ThongTinKiemDemCongTrinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemCongTrinh>(list);
				}
				else {
					list = (List<ThongTinKiemDemCongTrinh>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(keHoachKiemDemVeSinhId,
				danhGiaKiemDem, orderByComparator);

		if (thongTinKiemDemCongTrinh != null) {
			return thongTinKiemDemCongTrinh;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(", danhGiaKiemDem=");
		msg.append(danhGiaKiemDem);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemCongTrinhException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_First(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		OrderByComparator orderByComparator) throws SystemException {
		List<ThongTinKiemDemCongTrinh> list = findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
				danhGiaKiemDem, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(keHoachKiemDemVeSinhId,
				danhGiaKiemDem, orderByComparator);

		if (thongTinKiemDemCongTrinh != null) {
			return thongTinKiemDemCongTrinh;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(", danhGiaKiemDem=");
		msg.append(danhGiaKiemDem);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemCongTrinhException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh fetchBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_Last(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
				danhGiaKiemDem);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemCongTrinh> list = findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(keHoachKiemDemVeSinhId,
				danhGiaKiemDem, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem cong trinhs before and after the current thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem cong trinh
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh[] findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, int danhGiaKiemDem,
		OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemCongTrinh[] array = new ThongTinKiemDemCongTrinhImpl[3];

			array[0] = getBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_PrevAndNext(session,
					thongTinKiemDemCongTrinh, keHoachKiemDemVeSinhId,
					danhGiaKiemDem, orderByComparator, true);

			array[1] = thongTinKiemDemCongTrinh;

			array[2] = getBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_PrevAndNext(session,
					thongTinKiemDemCongTrinh, keHoachKiemDemVeSinhId,
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

	protected ThongTinKiemDemCongTrinh getBy_keHoachKiemDemVeSinhId_danhGiaKiemDem_PrevAndNext(
		Session session, ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh,
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

		query.append(_SQL_SELECT_THONGTINKIEMDEMCONGTRINH_WHERE);

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
			query.append(ThongTinKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemVeSinhId);

		qPos.add(danhGiaKiemDem);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemCongTrinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemCongTrinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63; from the database.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
		int keHoachKiemDemVeSinhId, int danhGiaKiemDem)
		throws SystemException {
		for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : findBy_keHoachKiemDemVeSinhId_danhGiaKiemDem(
				keHoachKiemDemVeSinhId, danhGiaKiemDem, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(thongTinKiemDemCongTrinh);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; and danhGiaKiemDem = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param danhGiaKiemDem the danh gia kiem dem
	 * @return the number of matching thong tin kiem dem cong trinhs
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

			query.append(_SQL_COUNT_THONGTINKIEMDEMCONGTRINH_WHERE);

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
		"thongTinKiemDemCongTrinh.keHoachKiemDemVeSinhId = ? AND ";
	private static final String _FINDER_COLUMN__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM_DANHGIAKIEMDEM_2 =
		"thongTinKiemDemCongTrinh.danhGiaKiemDem = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__COUNTCTBYKEHOACH =
		new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_CountCTByKeHoach",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTCTBYKEHOACH =
		new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_CountCTByKeHoach",
			new String[] { Integer.class.getName() },
			ThongTinKiemDemCongTrinhModelImpl.KEHOACHKIEMDEMVESINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__COUNTCTBYKEHOACH = new FinderPath(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBy_CountCTByKeHoach", new String[] { Integer.class.getName() });

	/**
	 * Returns all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_CountCTByKeHoach(
		int keHoachKiemDemVeSinhId) throws SystemException {
		return findBy_CountCTByKeHoach(keHoachKiemDemVeSinhId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem cong trinhs
	 * @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	 * @return the range of matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_CountCTByKeHoach(
		int keHoachKiemDemVeSinhId, int start, int end)
		throws SystemException {
		return findBy_CountCTByKeHoach(keHoachKiemDemVeSinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param start the lower bound of the range of thong tin kiem dem cong trinhs
	 * @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findBy_CountCTByKeHoach(
		int keHoachKiemDemVeSinhId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTCTBYKEHOACH;
			finderArgs = new Object[] { keHoachKiemDemVeSinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__COUNTCTBYKEHOACH;
			finderArgs = new Object[] {
					keHoachKiemDemVeSinhId,
					
					start, end, orderByComparator
				};
		}

		List<ThongTinKiemDemCongTrinh> list = (List<ThongTinKiemDemCongTrinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : list) {
				if ((keHoachKiemDemVeSinhId != thongTinKiemDemCongTrinh.getKeHoachKiemDemVeSinhId())) {
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

			query.append(_SQL_SELECT_THONGTINKIEMDEMCONGTRINH_WHERE);

			query.append(_FINDER_COLUMN__COUNTCTBYKEHOACH_KEHOACHKIEMDEMVESINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThongTinKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keHoachKiemDemVeSinhId);

				if (!pagination) {
					list = (List<ThongTinKiemDemCongTrinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemCongTrinh>(list);
				}
				else {
					list = (List<ThongTinKiemDemCongTrinh>)QueryUtil.list(q,
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
	 * Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh findBy_CountCTByKeHoach_First(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = fetchBy_CountCTByKeHoach_First(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemCongTrinh != null) {
			return thongTinKiemDemCongTrinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemCongTrinhException(msg.toString());
	}

	/**
	 * Returns the first thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh fetchBy_CountCTByKeHoach_First(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ThongTinKiemDemCongTrinh> list = findBy_CountCTByKeHoach(keHoachKiemDemVeSinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh findBy_CountCTByKeHoach_Last(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = fetchBy_CountCTByKeHoach_Last(keHoachKiemDemVeSinhId,
				orderByComparator);

		if (thongTinKiemDemCongTrinh != null) {
			return thongTinKiemDemCongTrinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("keHoachKiemDemVeSinhId=");
		msg.append(keHoachKiemDemVeSinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThongTinKiemDemCongTrinhException(msg.toString());
	}

	/**
	 * Returns the last thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong tin kiem dem cong trinh, or <code>null</code> if a matching thong tin kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh fetchBy_CountCTByKeHoach_Last(
		int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBy_CountCTByKeHoach(keHoachKiemDemVeSinhId);

		if (count == 0) {
			return null;
		}

		List<ThongTinKiemDemCongTrinh> list = findBy_CountCTByKeHoach(keHoachKiemDemVeSinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong tin kiem dem cong trinhs before and after the current thong tin kiem dem cong trinh in the ordered set where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param id the primary key of the current thong tin kiem dem cong trinh
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh[] findBy_CountCTByKeHoach_PrevAndNext(
		int id, int keHoachKiemDemVeSinhId, OrderByComparator orderByComparator)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemCongTrinh[] array = new ThongTinKiemDemCongTrinhImpl[3];

			array[0] = getBy_CountCTByKeHoach_PrevAndNext(session,
					thongTinKiemDemCongTrinh, keHoachKiemDemVeSinhId,
					orderByComparator, true);

			array[1] = thongTinKiemDemCongTrinh;

			array[2] = getBy_CountCTByKeHoach_PrevAndNext(session,
					thongTinKiemDemCongTrinh, keHoachKiemDemVeSinhId,
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

	protected ThongTinKiemDemCongTrinh getBy_CountCTByKeHoach_PrevAndNext(
		Session session, ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh,
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

		query.append(_SQL_SELECT_THONGTINKIEMDEMCONGTRINH_WHERE);

		query.append(_FINDER_COLUMN__COUNTCTBYKEHOACH_KEHOACHKIEMDEMVESINHID_2);

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
			query.append(ThongTinKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(keHoachKiemDemVeSinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongTinKiemDemCongTrinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThongTinKiemDemCongTrinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63; from the database.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_CountCTByKeHoach(int keHoachKiemDemVeSinhId)
		throws SystemException {
		for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : findBy_CountCTByKeHoach(
				keHoachKiemDemVeSinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(thongTinKiemDemCongTrinh);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem cong trinhs where keHoachKiemDemVeSinhId = &#63;.
	 *
	 * @param keHoachKiemDemVeSinhId the ke hoach kiem dem ve sinh ID
	 * @return the number of matching thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_CountCTByKeHoach(int keHoachKiemDemVeSinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__COUNTCTBYKEHOACH;

		Object[] finderArgs = new Object[] { keHoachKiemDemVeSinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGTINKIEMDEMCONGTRINH_WHERE);

			query.append(_FINDER_COLUMN__COUNTCTBYKEHOACH_KEHOACHKIEMDEMVESINHID_2);

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

	private static final String _FINDER_COLUMN__COUNTCTBYKEHOACH_KEHOACHKIEMDEMVESINHID_2 =
		"thongTinKiemDemCongTrinh.keHoachKiemDemVeSinhId = ? AND  ( thongTinKiemDemCongTrinh.daKetThucDieuTra = 0 OR thongTinKiemDemCongTrinh.daKetThucDieuTra = 1 OR thongTinKiemDemCongTrinh.daKetThucDieuTra = 2 ) ";

	public ThongTinKiemDemCongTrinhPersistenceImpl() {
		setModelClass(ThongTinKiemDemCongTrinh.class);
	}

	/**
	 * Caches the thong tin kiem dem cong trinh in the entity cache if it is enabled.
	 *
	 * @param thongTinKiemDemCongTrinh the thong tin kiem dem cong trinh
	 */
	@Override
	public void cacheResult(ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh) {
		EntityCacheUtil.putResult(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			thongTinKiemDemCongTrinh.getPrimaryKey(), thongTinKiemDemCongTrinh);

		thongTinKiemDemCongTrinh.resetOriginalValues();
	}

	/**
	 * Caches the thong tin kiem dem cong trinhs in the entity cache if it is enabled.
	 *
	 * @param thongTinKiemDemCongTrinhs the thong tin kiem dem cong trinhs
	 */
	@Override
	public void cacheResult(
		List<ThongTinKiemDemCongTrinh> thongTinKiemDemCongTrinhs) {
		for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : thongTinKiemDemCongTrinhs) {
			if (EntityCacheUtil.getResult(
						ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
						ThongTinKiemDemCongTrinhImpl.class,
						thongTinKiemDemCongTrinh.getPrimaryKey()) == null) {
				cacheResult(thongTinKiemDemCongTrinh);
			}
			else {
				thongTinKiemDemCongTrinh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all thong tin kiem dem cong trinhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ThongTinKiemDemCongTrinhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ThongTinKiemDemCongTrinhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the thong tin kiem dem cong trinh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh) {
		EntityCacheUtil.removeResult(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			thongTinKiemDemCongTrinh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<ThongTinKiemDemCongTrinh> thongTinKiemDemCongTrinhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : thongTinKiemDemCongTrinhs) {
			EntityCacheUtil.removeResult(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
				ThongTinKiemDemCongTrinhImpl.class,
				thongTinKiemDemCongTrinh.getPrimaryKey());
		}
	}

	/**
	 * Creates a new thong tin kiem dem cong trinh with the primary key. Does not add the thong tin kiem dem cong trinh to the database.
	 *
	 * @param id the primary key for the new thong tin kiem dem cong trinh
	 * @return the new thong tin kiem dem cong trinh
	 */
	@Override
	public ThongTinKiemDemCongTrinh create(int id) {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = new ThongTinKiemDemCongTrinhImpl();

		thongTinKiemDemCongTrinh.setNew(true);
		thongTinKiemDemCongTrinh.setPrimaryKey(id);

		return thongTinKiemDemCongTrinh;
	}

	/**
	 * Removes the thong tin kiem dem cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the thong tin kiem dem cong trinh
	 * @return the thong tin kiem dem cong trinh that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh remove(int id)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the thong tin kiem dem cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the thong tin kiem dem cong trinh
	 * @return the thong tin kiem dem cong trinh that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh remove(Serializable primaryKey)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = (ThongTinKiemDemCongTrinh)session.get(ThongTinKiemDemCongTrinhImpl.class,
					primaryKey);

			if (thongTinKiemDemCongTrinh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchThongTinKiemDemCongTrinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thongTinKiemDemCongTrinh);
		}
		catch (NoSuchThongTinKiemDemCongTrinhException nsee) {
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
	protected ThongTinKiemDemCongTrinh removeImpl(
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh)
		throws SystemException {
		thongTinKiemDemCongTrinh = toUnwrappedModel(thongTinKiemDemCongTrinh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thongTinKiemDemCongTrinh)) {
				thongTinKiemDemCongTrinh = (ThongTinKiemDemCongTrinh)session.get(ThongTinKiemDemCongTrinhImpl.class,
						thongTinKiemDemCongTrinh.getPrimaryKeyObj());
			}

			if (thongTinKiemDemCongTrinh != null) {
				session.delete(thongTinKiemDemCongTrinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thongTinKiemDemCongTrinh != null) {
			clearCache(thongTinKiemDemCongTrinh);
		}

		return thongTinKiemDemCongTrinh;
	}

	@Override
	public ThongTinKiemDemCongTrinh updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh)
		throws SystemException {
		thongTinKiemDemCongTrinh = toUnwrappedModel(thongTinKiemDemCongTrinh);

		boolean isNew = thongTinKiemDemCongTrinh.isNew();

		ThongTinKiemDemCongTrinhModelImpl thongTinKiemDemCongTrinhModelImpl = (ThongTinKiemDemCongTrinhModelImpl)thongTinKiemDemCongTrinh;

		Session session = null;

		try {
			session = openSession();

			if (thongTinKiemDemCongTrinh.isNew()) {
				session.save(thongTinKiemDemCongTrinh);

				thongTinKiemDemCongTrinh.setNew(false);
			}
			else {
				session.merge(thongTinKiemDemCongTrinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ThongTinKiemDemCongTrinhModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((thongTinKiemDemCongTrinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__VESINHCONTRINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemCongTrinhModelImpl.getOriginalVeSinhConTrinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__VESINHCONTRINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__VESINHCONTRINHID,
					args);

				args = new Object[] {
						thongTinKiemDemCongTrinhModelImpl.getVeSinhConTrinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__VESINHCONTRINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__VESINHCONTRINHID,
					args);
			}

			if ((thongTinKiemDemCongTrinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemCongTrinhModelImpl.getOriginalKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID,
					args);

				args = new Object[] {
						thongTinKiemDemCongTrinhModelImpl.getKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID,
					args);
			}

			if ((thongTinKiemDemCongTrinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemCongTrinhModelImpl.getOriginalKeHoachKiemDemVeSinhId(),
						thongTinKiemDemCongTrinhModelImpl.getOriginalDaKetThucDieuTra()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA,
					args);

				args = new Object[] {
						thongTinKiemDemCongTrinhModelImpl.getKeHoachKiemDemVeSinhId(),
						thongTinKiemDemCongTrinhModelImpl.getDaKetThucDieuTra()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DAKETTHUCDIEUTRA,
					args);
			}

			if ((thongTinKiemDemCongTrinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemCongTrinhModelImpl.getOriginalKeHoachKiemDemVeSinhId(),
						thongTinKiemDemCongTrinhModelImpl.getOriginalDanhGiaKiemDem()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM,
					args);

				args = new Object[] {
						thongTinKiemDemCongTrinhModelImpl.getKeHoachKiemDemVeSinhId(),
						thongTinKiemDemCongTrinhModelImpl.getDanhGiaKiemDem()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__KEHOACHKIEMDEMVESINHID_DANHGIAKIEMDEM,
					args);
			}

			if ((thongTinKiemDemCongTrinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTCTBYKEHOACH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongTinKiemDemCongTrinhModelImpl.getOriginalKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__COUNTCTBYKEHOACH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTCTBYKEHOACH,
					args);

				args = new Object[] {
						thongTinKiemDemCongTrinhModelImpl.getKeHoachKiemDemVeSinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__COUNTCTBYKEHOACH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__COUNTCTBYKEHOACH,
					args);
			}
		}

		EntityCacheUtil.putResult(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ThongTinKiemDemCongTrinhImpl.class,
			thongTinKiemDemCongTrinh.getPrimaryKey(), thongTinKiemDemCongTrinh);

		return thongTinKiemDemCongTrinh;
	}

	protected ThongTinKiemDemCongTrinh toUnwrappedModel(
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh) {
		if (thongTinKiemDemCongTrinh instanceof ThongTinKiemDemCongTrinhImpl) {
			return thongTinKiemDemCongTrinh;
		}

		ThongTinKiemDemCongTrinhImpl thongTinKiemDemCongTrinhImpl = new ThongTinKiemDemCongTrinhImpl();

		thongTinKiemDemCongTrinhImpl.setNew(thongTinKiemDemCongTrinh.isNew());
		thongTinKiemDemCongTrinhImpl.setPrimaryKey(thongTinKiemDemCongTrinh.getPrimaryKey());

		thongTinKiemDemCongTrinhImpl.setId(thongTinKiemDemCongTrinh.getId());
		thongTinKiemDemCongTrinhImpl.setVeSinhConTrinhId(thongTinKiemDemCongTrinh.getVeSinhConTrinhId());
		thongTinKiemDemCongTrinhImpl.setKeHoachKiemDemVeSinhId(thongTinKiemDemCongTrinh.getKeHoachKiemDemVeSinhId());
		thongTinKiemDemCongTrinhImpl.setTenCongTrinh(thongTinKiemDemCongTrinh.getTenCongTrinh());
		thongTinKiemDemCongTrinhImpl.setLoaiCongTrinh(thongTinKiemDemCongTrinh.getLoaiCongTrinh());
		thongTinKiemDemCongTrinhImpl.setMaTinh(thongTinKiemDemCongTrinh.getMaTinh());
		thongTinKiemDemCongTrinhImpl.setMaHuyen(thongTinKiemDemCongTrinh.getMaHuyen());
		thongTinKiemDemCongTrinhImpl.setMaXa(thongTinKiemDemCongTrinh.getMaXa());
		thongTinKiemDemCongTrinhImpl.setDiaChi(thongTinKiemDemCongTrinh.getDiaChi());
		thongTinKiemDemCongTrinhImpl.setNgayKiemDem(thongTinKiemDemCongTrinh.getNgayKiemDem());
		thongTinKiemDemCongTrinhImpl.setHoTenNguoiTraLoi(thongTinKiemDemCongTrinh.getHoTenNguoiTraLoi());
		thongTinKiemDemCongTrinhImpl.setSoDienThoai(thongTinKiemDemCongTrinh.getSoDienThoai());
		thongTinKiemDemCongTrinhImpl.setGioiTinhNguoiTraLoi(thongTinKiemDemCongTrinh.getGioiTinhNguoiTraLoi());
		thongTinKiemDemCongTrinhImpl.setVaiTroChucDanh(thongTinKiemDemCongTrinh.getVaiTroChucDanh());
		thongTinKiemDemCongTrinhImpl.setSoCa(thongTinKiemDemCongTrinh.getSoCa());
		thongTinKiemDemCongTrinhImpl.setSoNguoiTrongCa(thongTinKiemDemCongTrinh.getSoNguoiTrongCa());
		thongTinKiemDemCongTrinhImpl.setKinhDo(thongTinKiemDemCongTrinh.getKinhDo());
		thongTinKiemDemCongTrinhImpl.setViDo(thongTinKiemDemCongTrinh.getViDo());
		thongTinKiemDemCongTrinhImpl.setLoaiNguonNuoc(thongTinKiemDemCongTrinh.getLoaiNguonNuoc());
		thongTinKiemDemCongTrinhImpl.setDaTQCVN(thongTinKiemDemCongTrinh.getDaTQCVN());
		thongTinKiemDemCongTrinhImpl.setDatTieuChuanHVS(thongTinKiemDemCongTrinh.getDatTieuChuanHVS());
		thongTinKiemDemCongTrinhImpl.setAnhChupChungNhan(thongTinKiemDemCongTrinh.getAnhChupChungNhan());
		thongTinKiemDemCongTrinhImpl.setSoNhaTieu(thongTinKiemDemCongTrinh.getSoNhaTieu());
		thongTinKiemDemCongTrinhImpl.setGhiChu(thongTinKiemDemCongTrinh.getGhiChu());
		thongTinKiemDemCongTrinhImpl.setDaKetThucDieuTra(thongTinKiemDemCongTrinh.getDaKetThucDieuTra());
		thongTinKiemDemCongTrinhImpl.setLyDoKhongHoanThanh(thongTinKiemDemCongTrinh.getLyDoKhongHoanThanh());
		thongTinKiemDemCongTrinhImpl.setImei(thongTinKiemDemCongTrinh.getImei());
		thongTinKiemDemCongTrinhImpl.setTaiKhoan(thongTinKiemDemCongTrinh.getTaiKhoan());
		thongTinKiemDemCongTrinhImpl.setDanhGiaKiemDem(thongTinKiemDemCongTrinh.getDanhGiaKiemDem());
		thongTinKiemDemCongTrinhImpl.setSavePoint(thongTinKiemDemCongTrinh.getSavePoint());

		return thongTinKiemDemCongTrinhImpl;
	}

	/**
	 * Returns the thong tin kiem dem cong trinh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the thong tin kiem dem cong trinh
	 * @return the thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = fetchByPrimaryKey(primaryKey);

		if (thongTinKiemDemCongTrinh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchThongTinKiemDemCongTrinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thongTinKiemDemCongTrinh;
	}

	/**
	 * Returns the thong tin kiem dem cong trinh with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException} if it could not be found.
	 *
	 * @param id the primary key of the thong tin kiem dem cong trinh
	 * @return the thong tin kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchThongTinKiemDemCongTrinhException if a thong tin kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh findByPrimaryKey(int id)
		throws NoSuchThongTinKiemDemCongTrinhException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the thong tin kiem dem cong trinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the thong tin kiem dem cong trinh
	 * @return the thong tin kiem dem cong trinh, or <code>null</code> if a thong tin kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh = (ThongTinKiemDemCongTrinh)EntityCacheUtil.getResult(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
				ThongTinKiemDemCongTrinhImpl.class, primaryKey);

		if (thongTinKiemDemCongTrinh == _nullThongTinKiemDemCongTrinh) {
			return null;
		}

		if (thongTinKiemDemCongTrinh == null) {
			Session session = null;

			try {
				session = openSession();

				thongTinKiemDemCongTrinh = (ThongTinKiemDemCongTrinh)session.get(ThongTinKiemDemCongTrinhImpl.class,
						primaryKey);

				if (thongTinKiemDemCongTrinh != null) {
					cacheResult(thongTinKiemDemCongTrinh);
				}
				else {
					EntityCacheUtil.putResult(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
						ThongTinKiemDemCongTrinhImpl.class, primaryKey,
						_nullThongTinKiemDemCongTrinh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ThongTinKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
					ThongTinKiemDemCongTrinhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thongTinKiemDemCongTrinh;
	}

	/**
	 * Returns the thong tin kiem dem cong trinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the thong tin kiem dem cong trinh
	 * @return the thong tin kiem dem cong trinh, or <code>null</code> if a thong tin kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThongTinKiemDemCongTrinh fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the thong tin kiem dem cong trinhs.
	 *
	 * @return the thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong tin kiem dem cong trinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong tin kiem dem cong trinhs
	 * @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	 * @return the range of thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong tin kiem dem cong trinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ThongTinKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong tin kiem dem cong trinhs
	 * @param end the upper bound of the range of thong tin kiem dem cong trinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of thong tin kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThongTinKiemDemCongTrinh> findAll(int start, int end,
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

		List<ThongTinKiemDemCongTrinh> list = (List<ThongTinKiemDemCongTrinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THONGTINKIEMDEMCONGTRINH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THONGTINKIEMDEMCONGTRINH;

				if (pagination) {
					sql = sql.concat(ThongTinKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ThongTinKiemDemCongTrinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThongTinKiemDemCongTrinh>(list);
				}
				else {
					list = (List<ThongTinKiemDemCongTrinh>)QueryUtil.list(q,
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
	 * Removes all the thong tin kiem dem cong trinhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh : findAll()) {
			remove(thongTinKiemDemCongTrinh);
		}
	}

	/**
	 * Returns the number of thong tin kiem dem cong trinhs.
	 *
	 * @return the number of thong tin kiem dem cong trinhs
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

				Query q = session.createQuery(_SQL_COUNT_THONGTINKIEMDEMCONGTRINH);

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
	 * Initializes the thong tin kiem dem cong trinh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ThongTinKiemDemCongTrinh>> listenersList = new ArrayList<ModelListener<ThongTinKiemDemCongTrinh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ThongTinKiemDemCongTrinh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ThongTinKiemDemCongTrinhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THONGTINKIEMDEMCONGTRINH = "SELECT thongTinKiemDemCongTrinh FROM ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh";
	private static final String _SQL_SELECT_THONGTINKIEMDEMCONGTRINH_WHERE = "SELECT thongTinKiemDemCongTrinh FROM ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh WHERE ";
	private static final String _SQL_COUNT_THONGTINKIEMDEMCONGTRINH = "SELECT COUNT(thongTinKiemDemCongTrinh) FROM ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh";
	private static final String _SQL_COUNT_THONGTINKIEMDEMCONGTRINH_WHERE = "SELECT COUNT(thongTinKiemDemCongTrinh) FROM ThongTinKiemDemCongTrinh thongTinKiemDemCongTrinh WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thongTinKiemDemCongTrinh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ThongTinKiemDemCongTrinh exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ThongTinKiemDemCongTrinh exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ThongTinKiemDemCongTrinhPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "veSinhConTrinhId", "keHoachKiemDemVeSinhId",
				"tenCongTrinh", "loaiCongTrinh", "maTinh", "maHuyen", "maXa",
				"diaChi", "ngayKiemDem", "hoTenNguoiTraLoi", "soDienThoai",
				"gioiTinhNguoiTraLoi", "vaiTroChucDanh", "soCa",
				"soNguoiTrongCa", "kinhDo", "viDo", "loaiNguonNuoc", "daTQCVN",
				"datTieuChuanHVS", "anhChupChungNhan", "soNhaTieu", "ghiChu",
				"daKetThucDieuTra", "lyDoKhongHoanThanh", "imei", "taiKhoan",
				"danhGiaKiemDem", "savePoint"
			});
	private static ThongTinKiemDemCongTrinh _nullThongTinKiemDemCongTrinh = new ThongTinKiemDemCongTrinhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ThongTinKiemDemCongTrinh> toCacheModel() {
				return _nullThongTinKiemDemCongTrinhCacheModel;
			}
		};

	private static CacheModel<ThongTinKiemDemCongTrinh> _nullThongTinKiemDemCongTrinhCacheModel =
		new CacheModel<ThongTinKiemDemCongTrinh>() {
			@Override
			public ThongTinKiemDemCongTrinh toEntityModel() {
				return _nullThongTinKiemDemCongTrinh;
			}
		};
}