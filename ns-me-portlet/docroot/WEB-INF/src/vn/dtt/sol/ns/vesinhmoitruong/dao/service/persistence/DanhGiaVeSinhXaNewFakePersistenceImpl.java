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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewFakeImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewFakeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the danh gia ve sinh xa new fake service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see DanhGiaVeSinhXaNewFakePersistence
 * @see DanhGiaVeSinhXaNewFakeUtil
 * @generated
 */
public class DanhGiaVeSinhXaNewFakePersistenceImpl extends BasePersistenceImpl<DanhGiaVeSinhXaNewFake>
	implements DanhGiaVeSinhXaNewFakePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DanhGiaVeSinhXaNewFakeUtil} to access the danh gia ve sinh xa new fake persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DanhGiaVeSinhXaNewFakeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_MATINH = new FinderPath(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_MATINH",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_MATINH =
		new FinderPath(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_MATINH",
			new String[] { String.class.getName() },
			DanhGiaVeSinhXaNewFakeModelImpl.MATINH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_MATINH = new FinderPath(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_MATINH",
			new String[] { String.class.getName() });

	/**
	 * Returns all the danh gia ve sinh xa new fakes where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the matching danh gia ve sinh xa new fakes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNewFake> findByF_MATINH(String maTinh)
		throws SystemException {
		return findByF_MATINH(maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh gia ve sinh xa new fakes where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewFakeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of danh gia ve sinh xa new fakes
	 * @param end the upper bound of the range of danh gia ve sinh xa new fakes (not inclusive)
	 * @return the range of matching danh gia ve sinh xa new fakes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNewFake> findByF_MATINH(String maTinh,
		int start, int end) throws SystemException {
		return findByF_MATINH(maTinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia ve sinh xa new fakes where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewFakeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of danh gia ve sinh xa new fakes
	 * @param end the upper bound of the range of danh gia ve sinh xa new fakes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching danh gia ve sinh xa new fakes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNewFake> findByF_MATINH(String maTinh,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_MATINH;
			finderArgs = new Object[] { maTinh };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_MATINH;
			finderArgs = new Object[] { maTinh, start, end, orderByComparator };
		}

		List<DanhGiaVeSinhXaNewFake> list = (List<DanhGiaVeSinhXaNewFake>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake : list) {
				if (!Validator.equals(maTinh, danhGiaVeSinhXaNewFake.getMaTinh())) {
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

			query.append(_SQL_SELECT_DANHGIAVESINHXANEWFAKE_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_F_MATINH_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_MATINH_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_F_MATINH_MATINH_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DanhGiaVeSinhXaNewFakeModelImpl.ORDER_BY_JPQL);
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
					list = (List<DanhGiaVeSinhXaNewFake>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaVeSinhXaNewFake>(list);
				}
				else {
					list = (List<DanhGiaVeSinhXaNewFake>)QueryUtil.list(q,
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
	 * Returns the first danh gia ve sinh xa new fake in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia ve sinh xa new fake
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException if a matching danh gia ve sinh xa new fake could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNewFake findByF_MATINH_First(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVeSinhXaNewFakeException, SystemException {
		DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake = fetchByF_MATINH_First(maTinh,
				orderByComparator);

		if (danhGiaVeSinhXaNewFake != null) {
			return danhGiaVeSinhXaNewFake;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaVeSinhXaNewFakeException(msg.toString());
	}

	/**
	 * Returns the first danh gia ve sinh xa new fake in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia ve sinh xa new fake, or <code>null</code> if a matching danh gia ve sinh xa new fake could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNewFake fetchByF_MATINH_First(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		List<DanhGiaVeSinhXaNewFake> list = findByF_MATINH(maTinh, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last danh gia ve sinh xa new fake in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia ve sinh xa new fake
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException if a matching danh gia ve sinh xa new fake could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNewFake findByF_MATINH_Last(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVeSinhXaNewFakeException, SystemException {
		DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake = fetchByF_MATINH_Last(maTinh,
				orderByComparator);

		if (danhGiaVeSinhXaNewFake != null) {
			return danhGiaVeSinhXaNewFake;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaVeSinhXaNewFakeException(msg.toString());
	}

	/**
	 * Returns the last danh gia ve sinh xa new fake in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia ve sinh xa new fake, or <code>null</code> if a matching danh gia ve sinh xa new fake could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNewFake fetchByF_MATINH_Last(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByF_MATINH(maTinh);

		if (count == 0) {
			return null;
		}

		List<DanhGiaVeSinhXaNewFake> list = findByF_MATINH(maTinh, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the danh gia ve sinh xa new fakes before and after the current danh gia ve sinh xa new fake in the ordered set where maTinh = &#63;.
	 *
	 * @param id the primary key of the current danh gia ve sinh xa new fake
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next danh gia ve sinh xa new fake
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException if a danh gia ve sinh xa new fake with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNewFake[] findByF_MATINH_PrevAndNext(int id,
		String maTinh, OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVeSinhXaNewFakeException, SystemException {
		DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DanhGiaVeSinhXaNewFake[] array = new DanhGiaVeSinhXaNewFakeImpl[3];

			array[0] = getByF_MATINH_PrevAndNext(session,
					danhGiaVeSinhXaNewFake, maTinh, orderByComparator, true);

			array[1] = danhGiaVeSinhXaNewFake;

			array[2] = getByF_MATINH_PrevAndNext(session,
					danhGiaVeSinhXaNewFake, maTinh, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DanhGiaVeSinhXaNewFake getByF_MATINH_PrevAndNext(
		Session session, DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake,
		String maTinh, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DANHGIAVESINHXANEWFAKE_WHERE);

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_F_MATINH_MATINH_1);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_MATINH_MATINH_3);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_F_MATINH_MATINH_2);
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
			query.append(DanhGiaVeSinhXaNewFakeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(danhGiaVeSinhXaNewFake);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DanhGiaVeSinhXaNewFake> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the danh gia ve sinh xa new fakes where maTinh = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_MATINH(String maTinh) throws SystemException {
		for (DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake : findByF_MATINH(
				maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(danhGiaVeSinhXaNewFake);
		}
	}

	/**
	 * Returns the number of danh gia ve sinh xa new fakes where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the number of matching danh gia ve sinh xa new fakes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_MATINH(String maTinh) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_MATINH;

		Object[] finderArgs = new Object[] { maTinh };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DANHGIAVESINHXANEWFAKE_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_F_MATINH_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_MATINH_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_F_MATINH_MATINH_2);
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

	private static final String _FINDER_COLUMN_F_MATINH_MATINH_1 = "danhGiaVeSinhXaNewFake.maTinh IS NULL";
	private static final String _FINDER_COLUMN_F_MATINH_MATINH_2 = "danhGiaVeSinhXaNewFake.maTinh = ?";
	private static final String _FINDER_COLUMN_F_MATINH_MATINH_3 = "(danhGiaVeSinhXaNewFake.maTinh IS NULL OR danhGiaVeSinhXaNewFake.maTinh = '')";

	public DanhGiaVeSinhXaNewFakePersistenceImpl() {
		setModelClass(DanhGiaVeSinhXaNewFake.class);
	}

	/**
	 * Caches the danh gia ve sinh xa new fake in the entity cache if it is enabled.
	 *
	 * @param danhGiaVeSinhXaNewFake the danh gia ve sinh xa new fake
	 */
	@Override
	public void cacheResult(DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake) {
		EntityCacheUtil.putResult(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeImpl.class,
			danhGiaVeSinhXaNewFake.getPrimaryKey(), danhGiaVeSinhXaNewFake);

		danhGiaVeSinhXaNewFake.resetOriginalValues();
	}

	/**
	 * Caches the danh gia ve sinh xa new fakes in the entity cache if it is enabled.
	 *
	 * @param danhGiaVeSinhXaNewFakes the danh gia ve sinh xa new fakes
	 */
	@Override
	public void cacheResult(
		List<DanhGiaVeSinhXaNewFake> danhGiaVeSinhXaNewFakes) {
		for (DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake : danhGiaVeSinhXaNewFakes) {
			if (EntityCacheUtil.getResult(
						DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
						DanhGiaVeSinhXaNewFakeImpl.class,
						danhGiaVeSinhXaNewFake.getPrimaryKey()) == null) {
				cacheResult(danhGiaVeSinhXaNewFake);
			}
			else {
				danhGiaVeSinhXaNewFake.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all danh gia ve sinh xa new fakes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DanhGiaVeSinhXaNewFakeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DanhGiaVeSinhXaNewFakeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the danh gia ve sinh xa new fake.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake) {
		EntityCacheUtil.removeResult(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeImpl.class,
			danhGiaVeSinhXaNewFake.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DanhGiaVeSinhXaNewFake> danhGiaVeSinhXaNewFakes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake : danhGiaVeSinhXaNewFakes) {
			EntityCacheUtil.removeResult(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
				DanhGiaVeSinhXaNewFakeImpl.class,
				danhGiaVeSinhXaNewFake.getPrimaryKey());
		}
	}

	/**
	 * Creates a new danh gia ve sinh xa new fake with the primary key. Does not add the danh gia ve sinh xa new fake to the database.
	 *
	 * @param id the primary key for the new danh gia ve sinh xa new fake
	 * @return the new danh gia ve sinh xa new fake
	 */
	@Override
	public DanhGiaVeSinhXaNewFake create(int id) {
		DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake = new DanhGiaVeSinhXaNewFakeImpl();

		danhGiaVeSinhXaNewFake.setNew(true);
		danhGiaVeSinhXaNewFake.setPrimaryKey(id);

		return danhGiaVeSinhXaNewFake;
	}

	/**
	 * Removes the danh gia ve sinh xa new fake with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the danh gia ve sinh xa new fake
	 * @return the danh gia ve sinh xa new fake that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException if a danh gia ve sinh xa new fake with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNewFake remove(int id)
		throws NoSuchDanhGiaVeSinhXaNewFakeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the danh gia ve sinh xa new fake with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the danh gia ve sinh xa new fake
	 * @return the danh gia ve sinh xa new fake that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException if a danh gia ve sinh xa new fake with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNewFake remove(Serializable primaryKey)
		throws NoSuchDanhGiaVeSinhXaNewFakeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake = (DanhGiaVeSinhXaNewFake)session.get(DanhGiaVeSinhXaNewFakeImpl.class,
					primaryKey);

			if (danhGiaVeSinhXaNewFake == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDanhGiaVeSinhXaNewFakeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(danhGiaVeSinhXaNewFake);
		}
		catch (NoSuchDanhGiaVeSinhXaNewFakeException nsee) {
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
	protected DanhGiaVeSinhXaNewFake removeImpl(
		DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake)
		throws SystemException {
		danhGiaVeSinhXaNewFake = toUnwrappedModel(danhGiaVeSinhXaNewFake);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(danhGiaVeSinhXaNewFake)) {
				danhGiaVeSinhXaNewFake = (DanhGiaVeSinhXaNewFake)session.get(DanhGiaVeSinhXaNewFakeImpl.class,
						danhGiaVeSinhXaNewFake.getPrimaryKeyObj());
			}

			if (danhGiaVeSinhXaNewFake != null) {
				session.delete(danhGiaVeSinhXaNewFake);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (danhGiaVeSinhXaNewFake != null) {
			clearCache(danhGiaVeSinhXaNewFake);
		}

		return danhGiaVeSinhXaNewFake;
	}

	@Override
	public DanhGiaVeSinhXaNewFake updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake)
		throws SystemException {
		danhGiaVeSinhXaNewFake = toUnwrappedModel(danhGiaVeSinhXaNewFake);

		boolean isNew = danhGiaVeSinhXaNewFake.isNew();

		DanhGiaVeSinhXaNewFakeModelImpl danhGiaVeSinhXaNewFakeModelImpl = (DanhGiaVeSinhXaNewFakeModelImpl)danhGiaVeSinhXaNewFake;

		Session session = null;

		try {
			session = openSession();

			if (danhGiaVeSinhXaNewFake.isNew()) {
				session.save(danhGiaVeSinhXaNewFake);

				danhGiaVeSinhXaNewFake.setNew(false);
			}
			else {
				session.merge(danhGiaVeSinhXaNewFake);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DanhGiaVeSinhXaNewFakeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((danhGiaVeSinhXaNewFakeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_MATINH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhGiaVeSinhXaNewFakeModelImpl.getOriginalMaTinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_MATINH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_MATINH,
					args);

				args = new Object[] { danhGiaVeSinhXaNewFakeModelImpl.getMaTinh() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_MATINH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_MATINH,
					args);
			}
		}

		EntityCacheUtil.putResult(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewFakeImpl.class,
			danhGiaVeSinhXaNewFake.getPrimaryKey(), danhGiaVeSinhXaNewFake);

		return danhGiaVeSinhXaNewFake;
	}

	protected DanhGiaVeSinhXaNewFake toUnwrappedModel(
		DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake) {
		if (danhGiaVeSinhXaNewFake instanceof DanhGiaVeSinhXaNewFakeImpl) {
			return danhGiaVeSinhXaNewFake;
		}

		DanhGiaVeSinhXaNewFakeImpl danhGiaVeSinhXaNewFakeImpl = new DanhGiaVeSinhXaNewFakeImpl();

		danhGiaVeSinhXaNewFakeImpl.setNew(danhGiaVeSinhXaNewFake.isNew());
		danhGiaVeSinhXaNewFakeImpl.setPrimaryKey(danhGiaVeSinhXaNewFake.getPrimaryKey());

		danhGiaVeSinhXaNewFakeImpl.setId(danhGiaVeSinhXaNewFake.getId());
		danhGiaVeSinhXaNewFakeImpl.setMaTinh(danhGiaVeSinhXaNewFake.getMaTinh());
		danhGiaVeSinhXaNewFakeImpl.setMaHuyen(danhGiaVeSinhXaNewFake.getMaHuyen());
		danhGiaVeSinhXaNewFakeImpl.setMaXa(danhGiaVeSinhXaNewFake.getMaXa());
		danhGiaVeSinhXaNewFakeImpl.setMaTinhStr(danhGiaVeSinhXaNewFake.getMaTinhStr());
		danhGiaVeSinhXaNewFakeImpl.setMaHuyenStr(danhGiaVeSinhXaNewFake.getMaHuyenStr());
		danhGiaVeSinhXaNewFakeImpl.setMaXaStr(danhGiaVeSinhXaNewFake.getMaXaStr());
		danhGiaVeSinhXaNewFakeImpl.setNam(danhGiaVeSinhXaNewFake.getNam());
		danhGiaVeSinhXaNewFakeImpl.setSoDan(danhGiaVeSinhXaNewFake.getSoDan());
		danhGiaVeSinhXaNewFakeImpl.setTongSoHGD(danhGiaVeSinhXaNewFake.getTongSoHGD());
		danhGiaVeSinhXaNewFakeImpl.setSoHGDCoNhaTieu(danhGiaVeSinhXaNewFake.getSoHGDCoNhaTieu());
		danhGiaVeSinhXaNewFakeImpl.setSoHGDCoNhaTieuHVS(danhGiaVeSinhXaNewFake.getSoHGDCoNhaTieuHVS());
		danhGiaVeSinhXaNewFakeImpl.setSoNhaTieuHVSXayMoi(danhGiaVeSinhXaNewFake.getSoNhaTieuHVSXayMoi());
		danhGiaVeSinhXaNewFakeImpl.setTiLeHGDCoNhaTieu(danhGiaVeSinhXaNewFake.getTiLeHGDCoNhaTieu());
		danhGiaVeSinhXaNewFakeImpl.setTiLeHGDCoNhaTieuHVS(danhGiaVeSinhXaNewFake.getTiLeHGDCoNhaTieuHVS());
		danhGiaVeSinhXaNewFakeImpl.setTongSoTruongHoc(danhGiaVeSinhXaNewFake.getTongSoTruongHoc());
		danhGiaVeSinhXaNewFakeImpl.setSoTruongHocHVS(danhGiaVeSinhXaNewFake.getSoTruongHocHVS());
		danhGiaVeSinhXaNewFakeImpl.setTongSoTramYTe(danhGiaVeSinhXaNewFake.getTongSoTramYTe());
		danhGiaVeSinhXaNewFakeImpl.setSoTramYTeHVS(danhGiaVeSinhXaNewFake.getSoTramYTeHVS());
		danhGiaVeSinhXaNewFakeImpl.setTiLeTruongHocHVS(danhGiaVeSinhXaNewFake.getTiLeTruongHocHVS());
		danhGiaVeSinhXaNewFakeImpl.setTiLeTramYTeHVS(danhGiaVeSinhXaNewFake.getTiLeTramYTeHVS());
		danhGiaVeSinhXaNewFakeImpl.setKetLuanVSTX(danhGiaVeSinhXaNewFake.getKetLuanVSTX());
		danhGiaVeSinhXaNewFakeImpl.setGhiChu(danhGiaVeSinhXaNewFake.getGhiChu());
		danhGiaVeSinhXaNewFakeImpl.setBaoCaoDLI(danhGiaVeSinhXaNewFake.getBaoCaoDLI());
		danhGiaVeSinhXaNewFakeImpl.setNgayTao(danhGiaVeSinhXaNewFake.getNgayTao());
		danhGiaVeSinhXaNewFakeImpl.setIdNguoiTao(danhGiaVeSinhXaNewFake.getIdNguoiTao());
		danhGiaVeSinhXaNewFakeImpl.setDangKyVSTX(danhGiaVeSinhXaNewFake.getDangKyVSTX());
		danhGiaVeSinhXaNewFakeImpl.setSoNhaTieuHVSMoi(danhGiaVeSinhXaNewFake.getSoNhaTieuHVSMoi());

		return danhGiaVeSinhXaNewFakeImpl;
	}

	/**
	 * Returns the danh gia ve sinh xa new fake with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the danh gia ve sinh xa new fake
	 * @return the danh gia ve sinh xa new fake
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException if a danh gia ve sinh xa new fake with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNewFake findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDanhGiaVeSinhXaNewFakeException, SystemException {
		DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake = fetchByPrimaryKey(primaryKey);

		if (danhGiaVeSinhXaNewFake == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDanhGiaVeSinhXaNewFakeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return danhGiaVeSinhXaNewFake;
	}

	/**
	 * Returns the danh gia ve sinh xa new fake with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException} if it could not be found.
	 *
	 * @param id the primary key of the danh gia ve sinh xa new fake
	 * @return the danh gia ve sinh xa new fake
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewFakeException if a danh gia ve sinh xa new fake with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNewFake findByPrimaryKey(int id)
		throws NoSuchDanhGiaVeSinhXaNewFakeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the danh gia ve sinh xa new fake with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the danh gia ve sinh xa new fake
	 * @return the danh gia ve sinh xa new fake, or <code>null</code> if a danh gia ve sinh xa new fake with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNewFake fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake = (DanhGiaVeSinhXaNewFake)EntityCacheUtil.getResult(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
				DanhGiaVeSinhXaNewFakeImpl.class, primaryKey);

		if (danhGiaVeSinhXaNewFake == _nullDanhGiaVeSinhXaNewFake) {
			return null;
		}

		if (danhGiaVeSinhXaNewFake == null) {
			Session session = null;

			try {
				session = openSession();

				danhGiaVeSinhXaNewFake = (DanhGiaVeSinhXaNewFake)session.get(DanhGiaVeSinhXaNewFakeImpl.class,
						primaryKey);

				if (danhGiaVeSinhXaNewFake != null) {
					cacheResult(danhGiaVeSinhXaNewFake);
				}
				else {
					EntityCacheUtil.putResult(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
						DanhGiaVeSinhXaNewFakeImpl.class, primaryKey,
						_nullDanhGiaVeSinhXaNewFake);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DanhGiaVeSinhXaNewFakeModelImpl.ENTITY_CACHE_ENABLED,
					DanhGiaVeSinhXaNewFakeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return danhGiaVeSinhXaNewFake;
	}

	/**
	 * Returns the danh gia ve sinh xa new fake with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the danh gia ve sinh xa new fake
	 * @return the danh gia ve sinh xa new fake, or <code>null</code> if a danh gia ve sinh xa new fake with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNewFake fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the danh gia ve sinh xa new fakes.
	 *
	 * @return the danh gia ve sinh xa new fakes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNewFake> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh gia ve sinh xa new fakes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewFakeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of danh gia ve sinh xa new fakes
	 * @param end the upper bound of the range of danh gia ve sinh xa new fakes (not inclusive)
	 * @return the range of danh gia ve sinh xa new fakes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNewFake> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia ve sinh xa new fakes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewFakeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of danh gia ve sinh xa new fakes
	 * @param end the upper bound of the range of danh gia ve sinh xa new fakes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of danh gia ve sinh xa new fakes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNewFake> findAll(int start, int end,
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

		List<DanhGiaVeSinhXaNewFake> list = (List<DanhGiaVeSinhXaNewFake>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DANHGIAVESINHXANEWFAKE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DANHGIAVESINHXANEWFAKE;

				if (pagination) {
					sql = sql.concat(DanhGiaVeSinhXaNewFakeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DanhGiaVeSinhXaNewFake>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaVeSinhXaNewFake>(list);
				}
				else {
					list = (List<DanhGiaVeSinhXaNewFake>)QueryUtil.list(q,
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
	 * Removes all the danh gia ve sinh xa new fakes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake : findAll()) {
			remove(danhGiaVeSinhXaNewFake);
		}
	}

	/**
	 * Returns the number of danh gia ve sinh xa new fakes.
	 *
	 * @return the number of danh gia ve sinh xa new fakes
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

				Query q = session.createQuery(_SQL_COUNT_DANHGIAVESINHXANEWFAKE);

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
	 * Initializes the danh gia ve sinh xa new fake persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNewFake")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DanhGiaVeSinhXaNewFake>> listenersList = new ArrayList<ModelListener<DanhGiaVeSinhXaNewFake>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DanhGiaVeSinhXaNewFake>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DanhGiaVeSinhXaNewFakeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DANHGIAVESINHXANEWFAKE = "SELECT danhGiaVeSinhXaNewFake FROM DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake";
	private static final String _SQL_SELECT_DANHGIAVESINHXANEWFAKE_WHERE = "SELECT danhGiaVeSinhXaNewFake FROM DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake WHERE ";
	private static final String _SQL_COUNT_DANHGIAVESINHXANEWFAKE = "SELECT COUNT(danhGiaVeSinhXaNewFake) FROM DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake";
	private static final String _SQL_COUNT_DANHGIAVESINHXANEWFAKE_WHERE = "SELECT COUNT(danhGiaVeSinhXaNewFake) FROM DanhGiaVeSinhXaNewFake danhGiaVeSinhXaNewFake WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "danhGiaVeSinhXaNewFake.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DanhGiaVeSinhXaNewFake exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DanhGiaVeSinhXaNewFake exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DanhGiaVeSinhXaNewFakePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static DanhGiaVeSinhXaNewFake _nullDanhGiaVeSinhXaNewFake = new DanhGiaVeSinhXaNewFakeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DanhGiaVeSinhXaNewFake> toCacheModel() {
				return _nullDanhGiaVeSinhXaNewFakeCacheModel;
			}
		};

	private static CacheModel<DanhGiaVeSinhXaNewFake> _nullDanhGiaVeSinhXaNewFakeCacheModel =
		new CacheModel<DanhGiaVeSinhXaNewFake>() {
			@Override
			public DanhGiaVeSinhXaNewFake toEntityModel() {
				return _nullDanhGiaVeSinhXaNewFake;
			}
		};
}