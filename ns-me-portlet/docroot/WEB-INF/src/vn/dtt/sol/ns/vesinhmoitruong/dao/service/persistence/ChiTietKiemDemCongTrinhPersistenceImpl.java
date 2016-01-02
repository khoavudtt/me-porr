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

import vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ChiTietKiemDemCongTrinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ChiTietKiemDemCongTrinhModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the chi tiet kiem dem cong trinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see ChiTietKiemDemCongTrinhPersistence
 * @see ChiTietKiemDemCongTrinhUtil
 * @generated
 */
public class ChiTietKiemDemCongTrinhPersistenceImpl extends BasePersistenceImpl<ChiTietKiemDemCongTrinh>
	implements ChiTietKiemDemCongTrinhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ChiTietKiemDemCongTrinhUtil} to access the chi tiet kiem dem cong trinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ChiTietKiemDemCongTrinhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__THONGTINKIEMDEMCONGTRINHID =
		new FinderPath(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBy_thongTinKiemDemCongTrinhId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__THONGTINKIEMDEMCONGTRINHID =
		new FinderPath(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBy_thongTinKiemDemCongTrinhId",
			new String[] { Integer.class.getName() },
			ChiTietKiemDemCongTrinhModelImpl.THONGTINKIEMDEMCONGTRINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__THONGTINKIEMDEMCONGTRINHID =
		new FinderPath(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBy_thongTinKiemDemCongTrinhId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63;.
	 *
	 * @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	 * @return the matching chi tiet kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ChiTietKiemDemCongTrinh> findBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId) throws SystemException {
		return findBy_thongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ChiTietKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	 * @param start the lower bound of the range of chi tiet kiem dem cong trinhs
	 * @param end the upper bound of the range of chi tiet kiem dem cong trinhs (not inclusive)
	 * @return the range of matching chi tiet kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ChiTietKiemDemCongTrinh> findBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId, int start, int end)
		throws SystemException {
		return findBy_thongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ChiTietKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	 * @param start the lower bound of the range of chi tiet kiem dem cong trinhs
	 * @param end the upper bound of the range of chi tiet kiem dem cong trinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching chi tiet kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ChiTietKiemDemCongTrinh> findBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__THONGTINKIEMDEMCONGTRINHID;
			finderArgs = new Object[] { thongTinKiemDemCongTrinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__THONGTINKIEMDEMCONGTRINHID;
			finderArgs = new Object[] {
					thongTinKiemDemCongTrinhId,
					
					start, end, orderByComparator
				};
		}

		List<ChiTietKiemDemCongTrinh> list = (List<ChiTietKiemDemCongTrinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh : list) {
				if ((thongTinKiemDemCongTrinhId != chiTietKiemDemCongTrinh.getThongTinKiemDemCongTrinhId())) {
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

			query.append(_SQL_SELECT_CHITIETKIEMDEMCONGTRINH_WHERE);

			query.append(_FINDER_COLUMN__THONGTINKIEMDEMCONGTRINHID_THONGTINKIEMDEMCONGTRINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ChiTietKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinKiemDemCongTrinhId);

				if (!pagination) {
					list = (List<ChiTietKiemDemCongTrinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ChiTietKiemDemCongTrinh>(list);
				}
				else {
					list = (List<ChiTietKiemDemCongTrinh>)QueryUtil.list(q,
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
	 * Returns the first chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	 *
	 * @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching chi tiet kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a matching chi tiet kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChiTietKiemDemCongTrinh findBy_thongTinKiemDemCongTrinhId_First(
		int thongTinKiemDemCongTrinhId, OrderByComparator orderByComparator)
		throws NoSuchChiTietKiemDemCongTrinhException, SystemException {
		ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh = fetchBy_thongTinKiemDemCongTrinhId_First(thongTinKiemDemCongTrinhId,
				orderByComparator);

		if (chiTietKiemDemCongTrinh != null) {
			return chiTietKiemDemCongTrinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thongTinKiemDemCongTrinhId=");
		msg.append(thongTinKiemDemCongTrinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchChiTietKiemDemCongTrinhException(msg.toString());
	}

	/**
	 * Returns the first chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	 *
	 * @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching chi tiet kiem dem cong trinh, or <code>null</code> if a matching chi tiet kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChiTietKiemDemCongTrinh fetchBy_thongTinKiemDemCongTrinhId_First(
		int thongTinKiemDemCongTrinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ChiTietKiemDemCongTrinh> list = findBy_thongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	 *
	 * @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching chi tiet kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a matching chi tiet kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChiTietKiemDemCongTrinh findBy_thongTinKiemDemCongTrinhId_Last(
		int thongTinKiemDemCongTrinhId, OrderByComparator orderByComparator)
		throws NoSuchChiTietKiemDemCongTrinhException, SystemException {
		ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh = fetchBy_thongTinKiemDemCongTrinhId_Last(thongTinKiemDemCongTrinhId,
				orderByComparator);

		if (chiTietKiemDemCongTrinh != null) {
			return chiTietKiemDemCongTrinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thongTinKiemDemCongTrinhId=");
		msg.append(thongTinKiemDemCongTrinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchChiTietKiemDemCongTrinhException(msg.toString());
	}

	/**
	 * Returns the last chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	 *
	 * @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching chi tiet kiem dem cong trinh, or <code>null</code> if a matching chi tiet kiem dem cong trinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChiTietKiemDemCongTrinh fetchBy_thongTinKiemDemCongTrinhId_Last(
		int thongTinKiemDemCongTrinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBy_thongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId);

		if (count == 0) {
			return null;
		}

		List<ChiTietKiemDemCongTrinh> list = findBy_thongTinKiemDemCongTrinhId(thongTinKiemDemCongTrinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the chi tiet kiem dem cong trinhs before and after the current chi tiet kiem dem cong trinh in the ordered set where thongTinKiemDemCongTrinhId = &#63;.
	 *
	 * @param id the primary key of the current chi tiet kiem dem cong trinh
	 * @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next chi tiet kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a chi tiet kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChiTietKiemDemCongTrinh[] findBy_thongTinKiemDemCongTrinhId_PrevAndNext(
		int id, int thongTinKiemDemCongTrinhId,
		OrderByComparator orderByComparator)
		throws NoSuchChiTietKiemDemCongTrinhException, SystemException {
		ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ChiTietKiemDemCongTrinh[] array = new ChiTietKiemDemCongTrinhImpl[3];

			array[0] = getBy_thongTinKiemDemCongTrinhId_PrevAndNext(session,
					chiTietKiemDemCongTrinh, thongTinKiemDemCongTrinhId,
					orderByComparator, true);

			array[1] = chiTietKiemDemCongTrinh;

			array[2] = getBy_thongTinKiemDemCongTrinhId_PrevAndNext(session,
					chiTietKiemDemCongTrinh, thongTinKiemDemCongTrinhId,
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

	protected ChiTietKiemDemCongTrinh getBy_thongTinKiemDemCongTrinhId_PrevAndNext(
		Session session, ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh,
		int thongTinKiemDemCongTrinhId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CHITIETKIEMDEMCONGTRINH_WHERE);

		query.append(_FINDER_COLUMN__THONGTINKIEMDEMCONGTRINHID_THONGTINKIEMDEMCONGTRINHID_2);

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
			query.append(ChiTietKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(thongTinKiemDemCongTrinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(chiTietKiemDemCongTrinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ChiTietKiemDemCongTrinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63; from the database.
	 *
	 * @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId) throws SystemException {
		for (ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh : findBy_thongTinKiemDemCongTrinhId(
				thongTinKiemDemCongTrinhId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(chiTietKiemDemCongTrinh);
		}
	}

	/**
	 * Returns the number of chi tiet kiem dem cong trinhs where thongTinKiemDemCongTrinhId = &#63;.
	 *
	 * @param thongTinKiemDemCongTrinhId the thong tin kiem dem cong trinh ID
	 * @return the number of matching chi tiet kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBy_thongTinKiemDemCongTrinhId(
		int thongTinKiemDemCongTrinhId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__THONGTINKIEMDEMCONGTRINHID;

		Object[] finderArgs = new Object[] { thongTinKiemDemCongTrinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CHITIETKIEMDEMCONGTRINH_WHERE);

			query.append(_FINDER_COLUMN__THONGTINKIEMDEMCONGTRINHID_THONGTINKIEMDEMCONGTRINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinKiemDemCongTrinhId);

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

	private static final String _FINDER_COLUMN__THONGTINKIEMDEMCONGTRINHID_THONGTINKIEMDEMCONGTRINHID_2 =
		"chiTietKiemDemCongTrinh.thongTinKiemDemCongTrinhId = ?";

	public ChiTietKiemDemCongTrinhPersistenceImpl() {
		setModelClass(ChiTietKiemDemCongTrinh.class);
	}

	/**
	 * Caches the chi tiet kiem dem cong trinh in the entity cache if it is enabled.
	 *
	 * @param chiTietKiemDemCongTrinh the chi tiet kiem dem cong trinh
	 */
	@Override
	public void cacheResult(ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh) {
		EntityCacheUtil.putResult(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhImpl.class,
			chiTietKiemDemCongTrinh.getPrimaryKey(), chiTietKiemDemCongTrinh);

		chiTietKiemDemCongTrinh.resetOriginalValues();
	}

	/**
	 * Caches the chi tiet kiem dem cong trinhs in the entity cache if it is enabled.
	 *
	 * @param chiTietKiemDemCongTrinhs the chi tiet kiem dem cong trinhs
	 */
	@Override
	public void cacheResult(
		List<ChiTietKiemDemCongTrinh> chiTietKiemDemCongTrinhs) {
		for (ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh : chiTietKiemDemCongTrinhs) {
			if (EntityCacheUtil.getResult(
						ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
						ChiTietKiemDemCongTrinhImpl.class,
						chiTietKiemDemCongTrinh.getPrimaryKey()) == null) {
				cacheResult(chiTietKiemDemCongTrinh);
			}
			else {
				chiTietKiemDemCongTrinh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all chi tiet kiem dem cong trinhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ChiTietKiemDemCongTrinhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ChiTietKiemDemCongTrinhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the chi tiet kiem dem cong trinh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh) {
		EntityCacheUtil.removeResult(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhImpl.class,
			chiTietKiemDemCongTrinh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<ChiTietKiemDemCongTrinh> chiTietKiemDemCongTrinhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh : chiTietKiemDemCongTrinhs) {
			EntityCacheUtil.removeResult(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
				ChiTietKiemDemCongTrinhImpl.class,
				chiTietKiemDemCongTrinh.getPrimaryKey());
		}
	}

	/**
	 * Creates a new chi tiet kiem dem cong trinh with the primary key. Does not add the chi tiet kiem dem cong trinh to the database.
	 *
	 * @param id the primary key for the new chi tiet kiem dem cong trinh
	 * @return the new chi tiet kiem dem cong trinh
	 */
	@Override
	public ChiTietKiemDemCongTrinh create(int id) {
		ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh = new ChiTietKiemDemCongTrinhImpl();

		chiTietKiemDemCongTrinh.setNew(true);
		chiTietKiemDemCongTrinh.setPrimaryKey(id);

		return chiTietKiemDemCongTrinh;
	}

	/**
	 * Removes the chi tiet kiem dem cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the chi tiet kiem dem cong trinh
	 * @return the chi tiet kiem dem cong trinh that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a chi tiet kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChiTietKiemDemCongTrinh remove(int id)
		throws NoSuchChiTietKiemDemCongTrinhException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the chi tiet kiem dem cong trinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the chi tiet kiem dem cong trinh
	 * @return the chi tiet kiem dem cong trinh that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a chi tiet kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChiTietKiemDemCongTrinh remove(Serializable primaryKey)
		throws NoSuchChiTietKiemDemCongTrinhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh = (ChiTietKiemDemCongTrinh)session.get(ChiTietKiemDemCongTrinhImpl.class,
					primaryKey);

			if (chiTietKiemDemCongTrinh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchChiTietKiemDemCongTrinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(chiTietKiemDemCongTrinh);
		}
		catch (NoSuchChiTietKiemDemCongTrinhException nsee) {
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
	protected ChiTietKiemDemCongTrinh removeImpl(
		ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh)
		throws SystemException {
		chiTietKiemDemCongTrinh = toUnwrappedModel(chiTietKiemDemCongTrinh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(chiTietKiemDemCongTrinh)) {
				chiTietKiemDemCongTrinh = (ChiTietKiemDemCongTrinh)session.get(ChiTietKiemDemCongTrinhImpl.class,
						chiTietKiemDemCongTrinh.getPrimaryKeyObj());
			}

			if (chiTietKiemDemCongTrinh != null) {
				session.delete(chiTietKiemDemCongTrinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (chiTietKiemDemCongTrinh != null) {
			clearCache(chiTietKiemDemCongTrinh);
		}

		return chiTietKiemDemCongTrinh;
	}

	@Override
	public ChiTietKiemDemCongTrinh updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh)
		throws SystemException {
		chiTietKiemDemCongTrinh = toUnwrappedModel(chiTietKiemDemCongTrinh);

		boolean isNew = chiTietKiemDemCongTrinh.isNew();

		ChiTietKiemDemCongTrinhModelImpl chiTietKiemDemCongTrinhModelImpl = (ChiTietKiemDemCongTrinhModelImpl)chiTietKiemDemCongTrinh;

		Session session = null;

		try {
			session = openSession();

			if (chiTietKiemDemCongTrinh.isNew()) {
				session.save(chiTietKiemDemCongTrinh);

				chiTietKiemDemCongTrinh.setNew(false);
			}
			else {
				session.merge(chiTietKiemDemCongTrinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ChiTietKiemDemCongTrinhModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((chiTietKiemDemCongTrinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__THONGTINKIEMDEMCONGTRINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						chiTietKiemDemCongTrinhModelImpl.getOriginalThongTinKiemDemCongTrinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__THONGTINKIEMDEMCONGTRINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__THONGTINKIEMDEMCONGTRINHID,
					args);

				args = new Object[] {
						chiTietKiemDemCongTrinhModelImpl.getThongTinKiemDemCongTrinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY__THONGTINKIEMDEMCONGTRINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__THONGTINKIEMDEMCONGTRINHID,
					args);
			}
		}

		EntityCacheUtil.putResult(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
			ChiTietKiemDemCongTrinhImpl.class,
			chiTietKiemDemCongTrinh.getPrimaryKey(), chiTietKiemDemCongTrinh);

		return chiTietKiemDemCongTrinh;
	}

	protected ChiTietKiemDemCongTrinh toUnwrappedModel(
		ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh) {
		if (chiTietKiemDemCongTrinh instanceof ChiTietKiemDemCongTrinhImpl) {
			return chiTietKiemDemCongTrinh;
		}

		ChiTietKiemDemCongTrinhImpl chiTietKiemDemCongTrinhImpl = new ChiTietKiemDemCongTrinhImpl();

		chiTietKiemDemCongTrinhImpl.setNew(chiTietKiemDemCongTrinh.isNew());
		chiTietKiemDemCongTrinhImpl.setPrimaryKey(chiTietKiemDemCongTrinh.getPrimaryKey());

		chiTietKiemDemCongTrinhImpl.setId(chiTietKiemDemCongTrinh.getId());
		chiTietKiemDemCongTrinhImpl.setThongTinKiemDemCongTrinhId(chiTietKiemDemCongTrinh.getThongTinKiemDemCongTrinhId());
		chiTietKiemDemCongTrinhImpl.setSoHoTieu(chiTietKiemDemCongTrinh.getSoHoTieu());
		chiTietKiemDemCongTrinhImpl.setLoaiNhaTieu(chiTietKiemDemCongTrinh.getLoaiNhaTieu());
		chiTietKiemDemCongTrinhImpl.setAnhToanCanh(chiTietKiemDemCongTrinh.getAnhToanCanh());
		chiTietKiemDemCongTrinhImpl.setAnhTrongNhaTieu(chiTietKiemDemCongTrinh.getAnhTrongNhaTieu());
		chiTietKiemDemCongTrinhImpl.setVeSinhSachSe(chiTietKiemDemCongTrinh.getVeSinhSachSe());
		chiTietKiemDemCongTrinhImpl.setDeLamVeSinh(chiTietKiemDemCongTrinh.getDeLamVeSinh());
		chiTietKiemDemCongTrinhImpl.setMuiVeSinh(chiTietKiemDemCongTrinh.getMuiVeSinh());
		chiTietKiemDemCongTrinhImpl.setPhiaTrenKinDao(chiTietKiemDemCongTrinh.getPhiaTrenKinDao());
		chiTietKiemDemCongTrinhImpl.setDuCheMuaGio(chiTietKiemDemCongTrinh.getDuCheMuaGio());
		chiTietKiemDemCongTrinhImpl.setSanCaoTrenToiThieu(chiTietKiemDemCongTrinh.getSanCaoTrenToiThieu());
		chiTietKiemDemCongTrinhImpl.setCoCongTrinhRuaTay(chiTietKiemDemCongTrinh.getCoCongTrinhRuaTay());
		chiTietKiemDemCongTrinhImpl.setChiTietCongTrinhRuaTay(chiTietKiemDemCongTrinh.getChiTietCongTrinhRuaTay());
		chiTietKiemDemCongTrinhImpl.setAnhBeChua(chiTietKiemDemCongTrinh.getAnhBeChua());
		chiTietKiemDemCongTrinhImpl.setNapBeConTot(chiTietKiemDemCongTrinh.getNapBeConTot());
		chiTietKiemDemCongTrinhImpl.setCuaPhanBitKin(chiTietKiemDemCongTrinh.getCuaPhanBitKin());
		chiTietKiemDemCongTrinhImpl.setTranRaNgoai(chiTietKiemDemCongTrinh.getTranRaNgoai());
		chiTietKiemDemCongTrinhImpl.setNuocThaiDiDau(chiTietKiemDemCongTrinh.getNuocThaiDiDau());
		chiTietKiemDemCongTrinhImpl.setKhoangCachNguonNuoc(chiTietKiemDemCongTrinh.getKhoangCachNguonNuoc());
		chiTietKiemDemCongTrinhImpl.setNgapKhiMuaLon(chiTietKiemDemCongTrinh.getNgapKhiMuaLon());
		chiTietKiemDemCongTrinhImpl.setTenCongTrinh(chiTietKiemDemCongTrinh.getTenCongTrinh());

		return chiTietKiemDemCongTrinhImpl;
	}

	/**
	 * Returns the chi tiet kiem dem cong trinh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the chi tiet kiem dem cong trinh
	 * @return the chi tiet kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a chi tiet kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChiTietKiemDemCongTrinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchChiTietKiemDemCongTrinhException, SystemException {
		ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh = fetchByPrimaryKey(primaryKey);

		if (chiTietKiemDemCongTrinh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchChiTietKiemDemCongTrinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return chiTietKiemDemCongTrinh;
	}

	/**
	 * Returns the chi tiet kiem dem cong trinh with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException} if it could not be found.
	 *
	 * @param id the primary key of the chi tiet kiem dem cong trinh
	 * @return the chi tiet kiem dem cong trinh
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchChiTietKiemDemCongTrinhException if a chi tiet kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChiTietKiemDemCongTrinh findByPrimaryKey(int id)
		throws NoSuchChiTietKiemDemCongTrinhException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the chi tiet kiem dem cong trinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the chi tiet kiem dem cong trinh
	 * @return the chi tiet kiem dem cong trinh, or <code>null</code> if a chi tiet kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChiTietKiemDemCongTrinh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh = (ChiTietKiemDemCongTrinh)EntityCacheUtil.getResult(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
				ChiTietKiemDemCongTrinhImpl.class, primaryKey);

		if (chiTietKiemDemCongTrinh == _nullChiTietKiemDemCongTrinh) {
			return null;
		}

		if (chiTietKiemDemCongTrinh == null) {
			Session session = null;

			try {
				session = openSession();

				chiTietKiemDemCongTrinh = (ChiTietKiemDemCongTrinh)session.get(ChiTietKiemDemCongTrinhImpl.class,
						primaryKey);

				if (chiTietKiemDemCongTrinh != null) {
					cacheResult(chiTietKiemDemCongTrinh);
				}
				else {
					EntityCacheUtil.putResult(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
						ChiTietKiemDemCongTrinhImpl.class, primaryKey,
						_nullChiTietKiemDemCongTrinh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ChiTietKiemDemCongTrinhModelImpl.ENTITY_CACHE_ENABLED,
					ChiTietKiemDemCongTrinhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return chiTietKiemDemCongTrinh;
	}

	/**
	 * Returns the chi tiet kiem dem cong trinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the chi tiet kiem dem cong trinh
	 * @return the chi tiet kiem dem cong trinh, or <code>null</code> if a chi tiet kiem dem cong trinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ChiTietKiemDemCongTrinh fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the chi tiet kiem dem cong trinhs.
	 *
	 * @return the chi tiet kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ChiTietKiemDemCongTrinh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the chi tiet kiem dem cong trinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ChiTietKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of chi tiet kiem dem cong trinhs
	 * @param end the upper bound of the range of chi tiet kiem dem cong trinhs (not inclusive)
	 * @return the range of chi tiet kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ChiTietKiemDemCongTrinh> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the chi tiet kiem dem cong trinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.ChiTietKiemDemCongTrinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of chi tiet kiem dem cong trinhs
	 * @param end the upper bound of the range of chi tiet kiem dem cong trinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of chi tiet kiem dem cong trinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ChiTietKiemDemCongTrinh> findAll(int start, int end,
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

		List<ChiTietKiemDemCongTrinh> list = (List<ChiTietKiemDemCongTrinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CHITIETKIEMDEMCONGTRINH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CHITIETKIEMDEMCONGTRINH;

				if (pagination) {
					sql = sql.concat(ChiTietKiemDemCongTrinhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ChiTietKiemDemCongTrinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ChiTietKiemDemCongTrinh>(list);
				}
				else {
					list = (List<ChiTietKiemDemCongTrinh>)QueryUtil.list(q,
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
	 * Removes all the chi tiet kiem dem cong trinhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh : findAll()) {
			remove(chiTietKiemDemCongTrinh);
		}
	}

	/**
	 * Returns the number of chi tiet kiem dem cong trinhs.
	 *
	 * @return the number of chi tiet kiem dem cong trinhs
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

				Query q = session.createQuery(_SQL_COUNT_CHITIETKIEMDEMCONGTRINH);

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
	 * Initializes the chi tiet kiem dem cong trinh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ChiTietKiemDemCongTrinh>> listenersList = new ArrayList<ModelListener<ChiTietKiemDemCongTrinh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ChiTietKiemDemCongTrinh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ChiTietKiemDemCongTrinhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CHITIETKIEMDEMCONGTRINH = "SELECT chiTietKiemDemCongTrinh FROM ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh";
	private static final String _SQL_SELECT_CHITIETKIEMDEMCONGTRINH_WHERE = "SELECT chiTietKiemDemCongTrinh FROM ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh WHERE ";
	private static final String _SQL_COUNT_CHITIETKIEMDEMCONGTRINH = "SELECT COUNT(chiTietKiemDemCongTrinh) FROM ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh";
	private static final String _SQL_COUNT_CHITIETKIEMDEMCONGTRINH_WHERE = "SELECT COUNT(chiTietKiemDemCongTrinh) FROM ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "chiTietKiemDemCongTrinh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ChiTietKiemDemCongTrinh exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ChiTietKiemDemCongTrinh exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ChiTietKiemDemCongTrinhPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "thongTinKiemDemCongTrinhId", "soHoTieu", "loaiNhaTieu",
				"anhToanCanh", "anhTrongNhaTieu", "veSinhSachSe", "deLamVeSinh",
				"muiVeSinh", "phiaTrenKinDao", "duCheMuaGio",
				"sanCaoTrenToiThieu", "coCongTrinhRuaTay",
				"chiTietCongTrinhRuaTay", "anhBeChua", "napBeConTot",
				"cuaPhanBitKin", "tranRaNgoai", "nuocThaiDiDau",
				"khoangCachNguonNuoc", "ngapKhiMuaLon", "tenCongTrinh"
			});
	private static ChiTietKiemDemCongTrinh _nullChiTietKiemDemCongTrinh = new ChiTietKiemDemCongTrinhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ChiTietKiemDemCongTrinh> toCacheModel() {
				return _nullChiTietKiemDemCongTrinhCacheModel;
			}
		};

	private static CacheModel<ChiTietKiemDemCongTrinh> _nullChiTietKiemDemCongTrinhCacheModel =
		new CacheModel<ChiTietKiemDemCongTrinh>() {
			@Override
			public ChiTietKiemDemCongTrinh toEntityModel() {
				return _nullChiTietKiemDemCongTrinh;
			}
		};
}