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

import vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the danh gia ve sinh xa new service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author BinhTH
 * @see DanhGiaVeSinhXaNewPersistence
 * @see DanhGiaVeSinhXaNewUtil
 * @generated
 */
public class DanhGiaVeSinhXaNewPersistenceImpl extends BasePersistenceImpl<DanhGiaVeSinhXaNew>
	implements DanhGiaVeSinhXaNewPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DanhGiaVeSinhXaNewUtil} to access the danh gia ve sinh xa new persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DanhGiaVeSinhXaNewImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVeSinhXaNewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVeSinhXaNewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_MATINH = new FinderPath(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVeSinhXaNewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_MATINH",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_MATINH =
		new FinderPath(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVeSinhXaNewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_MATINH",
			new String[] { String.class.getName() },
			DanhGiaVeSinhXaNewModelImpl.MATINH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_MATINH = new FinderPath(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_MATINH",
			new String[] { String.class.getName() });

	/**
	 * Returns all the danh gia ve sinh xa news where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the matching danh gia ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNew> findByF_MATINH(String maTinh)
		throws SystemException {
		return findByF_MATINH(maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh gia ve sinh xa news where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of danh gia ve sinh xa news
	 * @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	 * @return the range of matching danh gia ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNew> findByF_MATINH(String maTinh, int start,
		int end) throws SystemException {
		return findByF_MATINH(maTinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia ve sinh xa news where maTinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param start the lower bound of the range of danh gia ve sinh xa news
	 * @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching danh gia ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNew> findByF_MATINH(String maTinh, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<DanhGiaVeSinhXaNew> list = (List<DanhGiaVeSinhXaNew>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DanhGiaVeSinhXaNew danhGiaVeSinhXaNew : list) {
				if (!Validator.equals(maTinh, danhGiaVeSinhXaNew.getMaTinh())) {
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

			query.append(_SQL_SELECT_DANHGIAVESINHXANEW_WHERE);

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
				query.append(DanhGiaVeSinhXaNewModelImpl.ORDER_BY_JPQL);
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
					list = (List<DanhGiaVeSinhXaNew>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaVeSinhXaNew>(list);
				}
				else {
					list = (List<DanhGiaVeSinhXaNew>)QueryUtil.list(q,
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
	 * Returns the first danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia ve sinh xa new
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a matching danh gia ve sinh xa new could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew findByF_MATINH_First(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVeSinhXaNewException, SystemException {
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = fetchByF_MATINH_First(maTinh,
				orderByComparator);

		if (danhGiaVeSinhXaNew != null) {
			return danhGiaVeSinhXaNew;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaVeSinhXaNewException(msg.toString());
	}

	/**
	 * Returns the first danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia ve sinh xa new, or <code>null</code> if a matching danh gia ve sinh xa new could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew fetchByF_MATINH_First(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		List<DanhGiaVeSinhXaNew> list = findByF_MATINH(maTinh, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia ve sinh xa new
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a matching danh gia ve sinh xa new could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew findByF_MATINH_Last(String maTinh,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVeSinhXaNewException, SystemException {
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = fetchByF_MATINH_Last(maTinh,
				orderByComparator);

		if (danhGiaVeSinhXaNew != null) {
			return danhGiaVeSinhXaNew;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaVeSinhXaNewException(msg.toString());
	}

	/**
	 * Returns the last danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia ve sinh xa new, or <code>null</code> if a matching danh gia ve sinh xa new could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew fetchByF_MATINH_Last(String maTinh,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByF_MATINH(maTinh);

		if (count == 0) {
			return null;
		}

		List<DanhGiaVeSinhXaNew> list = findByF_MATINH(maTinh, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the danh gia ve sinh xa news before and after the current danh gia ve sinh xa new in the ordered set where maTinh = &#63;.
	 *
	 * @param id the primary key of the current danh gia ve sinh xa new
	 * @param maTinh the ma tinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next danh gia ve sinh xa new
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a danh gia ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew[] findByF_MATINH_PrevAndNext(int id,
		String maTinh, OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVeSinhXaNewException, SystemException {
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DanhGiaVeSinhXaNew[] array = new DanhGiaVeSinhXaNewImpl[3];

			array[0] = getByF_MATINH_PrevAndNext(session, danhGiaVeSinhXaNew,
					maTinh, orderByComparator, true);

			array[1] = danhGiaVeSinhXaNew;

			array[2] = getByF_MATINH_PrevAndNext(session, danhGiaVeSinhXaNew,
					maTinh, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DanhGiaVeSinhXaNew getByF_MATINH_PrevAndNext(Session session,
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew, String maTinh,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DANHGIAVESINHXANEW_WHERE);

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
			query.append(DanhGiaVeSinhXaNewModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(danhGiaVeSinhXaNew);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DanhGiaVeSinhXaNew> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the danh gia ve sinh xa news where maTinh = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_MATINH(String maTinh) throws SystemException {
		for (DanhGiaVeSinhXaNew danhGiaVeSinhXaNew : findByF_MATINH(maTinh,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(danhGiaVeSinhXaNew);
		}
	}

	/**
	 * Returns the number of danh gia ve sinh xa news where maTinh = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @return the number of matching danh gia ve sinh xa news
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

			query.append(_SQL_COUNT_DANHGIAVESINHXANEW_WHERE);

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

	private static final String _FINDER_COLUMN_F_MATINH_MATINH_1 = "danhGiaVeSinhXaNew.maTinh IS NULL";
	private static final String _FINDER_COLUMN_F_MATINH_MATINH_2 = "danhGiaVeSinhXaNew.maTinh = ?";
	private static final String _FINDER_COLUMN_F_MATINH_MATINH_3 = "(danhGiaVeSinhXaNew.maTinh IS NULL OR danhGiaVeSinhXaNew.maTinh = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_T_H_N = new FinderPath(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVeSinhXaNewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_T_H_N",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_T_H_N =
		new FinderPath(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewModelImpl.FINDER_CACHE_ENABLED,
			DanhGiaVeSinhXaNewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_T_H_N",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			DanhGiaVeSinhXaNewModelImpl.MATINH_COLUMN_BITMASK |
			DanhGiaVeSinhXaNewModelImpl.MAHUYEN_COLUMN_BITMASK |
			DanhGiaVeSinhXaNewModelImpl.NAM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_T_H_N = new FinderPath(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_T_H_N",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param nam the nam
	 * @return the matching danh gia ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNew> findByF_T_H_N(String maTinh,
		String maHuyen, int nam) throws SystemException {
		return findByF_T_H_N(maTinh, maHuyen, nam, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param nam the nam
	 * @param start the lower bound of the range of danh gia ve sinh xa news
	 * @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	 * @return the range of matching danh gia ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNew> findByF_T_H_N(String maTinh,
		String maHuyen, int nam, int start, int end) throws SystemException {
		return findByF_T_H_N(maTinh, maHuyen, nam, start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param nam the nam
	 * @param start the lower bound of the range of danh gia ve sinh xa news
	 * @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching danh gia ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNew> findByF_T_H_N(String maTinh,
		String maHuyen, int nam, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_T_H_N;
			finderArgs = new Object[] { maTinh, maHuyen, nam };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_T_H_N;
			finderArgs = new Object[] {
					maTinh, maHuyen, nam,
					
					start, end, orderByComparator
				};
		}

		List<DanhGiaVeSinhXaNew> list = (List<DanhGiaVeSinhXaNew>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DanhGiaVeSinhXaNew danhGiaVeSinhXaNew : list) {
				if (!Validator.equals(maTinh, danhGiaVeSinhXaNew.getMaTinh()) ||
						!Validator.equals(maHuyen,
							danhGiaVeSinhXaNew.getMaHuyen()) ||
						(nam != danhGiaVeSinhXaNew.getNam())) {
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

			query.append(_SQL_SELECT_DANHGIAVESINHXANEW_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_F_T_H_N_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_T_H_N_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_F_T_H_N_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_F_T_H_N_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_T_H_N_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_F_T_H_N_MAHUYEN_2);
			}

			query.append(_FINDER_COLUMN_F_T_H_N_NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DanhGiaVeSinhXaNewModelImpl.ORDER_BY_JPQL);
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

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				qPos.add(nam);

				if (!pagination) {
					list = (List<DanhGiaVeSinhXaNew>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaVeSinhXaNew>(list);
				}
				else {
					list = (List<DanhGiaVeSinhXaNew>)QueryUtil.list(q,
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
	 * Returns the first danh gia ve sinh xa new in the ordered set where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia ve sinh xa new
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a matching danh gia ve sinh xa new could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew findByF_T_H_N_First(String maTinh,
		String maHuyen, int nam, OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVeSinhXaNewException, SystemException {
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = fetchByF_T_H_N_First(maTinh,
				maHuyen, nam, orderByComparator);

		if (danhGiaVeSinhXaNew != null) {
			return danhGiaVeSinhXaNew;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(", nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaVeSinhXaNewException(msg.toString());
	}

	/**
	 * Returns the first danh gia ve sinh xa new in the ordered set where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh gia ve sinh xa new, or <code>null</code> if a matching danh gia ve sinh xa new could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew fetchByF_T_H_N_First(String maTinh,
		String maHuyen, int nam, OrderByComparator orderByComparator)
		throws SystemException {
		List<DanhGiaVeSinhXaNew> list = findByF_T_H_N(maTinh, maHuyen, nam, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last danh gia ve sinh xa new in the ordered set where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia ve sinh xa new
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a matching danh gia ve sinh xa new could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew findByF_T_H_N_Last(String maTinh, String maHuyen,
		int nam, OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVeSinhXaNewException, SystemException {
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = fetchByF_T_H_N_Last(maTinh,
				maHuyen, nam, orderByComparator);

		if (danhGiaVeSinhXaNew != null) {
			return danhGiaVeSinhXaNew;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTinh=");
		msg.append(maTinh);

		msg.append(", maHuyen=");
		msg.append(maHuyen);

		msg.append(", nam=");
		msg.append(nam);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDanhGiaVeSinhXaNewException(msg.toString());
	}

	/**
	 * Returns the last danh gia ve sinh xa new in the ordered set where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh gia ve sinh xa new, or <code>null</code> if a matching danh gia ve sinh xa new could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew fetchByF_T_H_N_Last(String maTinh,
		String maHuyen, int nam, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByF_T_H_N(maTinh, maHuyen, nam);

		if (count == 0) {
			return null;
		}

		List<DanhGiaVeSinhXaNew> list = findByF_T_H_N(maTinh, maHuyen, nam,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the danh gia ve sinh xa news before and after the current danh gia ve sinh xa new in the ordered set where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current danh gia ve sinh xa new
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next danh gia ve sinh xa new
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a danh gia ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew[] findByF_T_H_N_PrevAndNext(int id,
		String maTinh, String maHuyen, int nam,
		OrderByComparator orderByComparator)
		throws NoSuchDanhGiaVeSinhXaNewException, SystemException {
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DanhGiaVeSinhXaNew[] array = new DanhGiaVeSinhXaNewImpl[3];

			array[0] = getByF_T_H_N_PrevAndNext(session, danhGiaVeSinhXaNew,
					maTinh, maHuyen, nam, orderByComparator, true);

			array[1] = danhGiaVeSinhXaNew;

			array[2] = getByF_T_H_N_PrevAndNext(session, danhGiaVeSinhXaNew,
					maTinh, maHuyen, nam, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DanhGiaVeSinhXaNew getByF_T_H_N_PrevAndNext(Session session,
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew, String maTinh, String maHuyen,
		int nam, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DANHGIAVESINHXANEW_WHERE);

		boolean bindMaTinh = false;

		if (maTinh == null) {
			query.append(_FINDER_COLUMN_F_T_H_N_MATINH_1);
		}
		else if (maTinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_T_H_N_MATINH_3);
		}
		else {
			bindMaTinh = true;

			query.append(_FINDER_COLUMN_F_T_H_N_MATINH_2);
		}

		boolean bindMaHuyen = false;

		if (maHuyen == null) {
			query.append(_FINDER_COLUMN_F_T_H_N_MAHUYEN_1);
		}
		else if (maHuyen.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_T_H_N_MAHUYEN_3);
		}
		else {
			bindMaHuyen = true;

			query.append(_FINDER_COLUMN_F_T_H_N_MAHUYEN_2);
		}

		query.append(_FINDER_COLUMN_F_T_H_N_NAM_2);

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
			query.append(DanhGiaVeSinhXaNewModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaTinh) {
			qPos.add(maTinh);
		}

		if (bindMaHuyen) {
			qPos.add(maHuyen);
		}

		qPos.add(nam);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(danhGiaVeSinhXaNew);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DanhGiaVeSinhXaNew> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63; from the database.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param nam the nam
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_T_H_N(String maTinh, String maHuyen, int nam)
		throws SystemException {
		for (DanhGiaVeSinhXaNew danhGiaVeSinhXaNew : findByF_T_H_N(maTinh,
				maHuyen, nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(danhGiaVeSinhXaNew);
		}
	}

	/**
	 * Returns the number of danh gia ve sinh xa news where maTinh = &#63; and maHuyen = &#63; and nam = &#63;.
	 *
	 * @param maTinh the ma tinh
	 * @param maHuyen the ma huyen
	 * @param nam the nam
	 * @return the number of matching danh gia ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_T_H_N(String maTinh, String maHuyen, int nam)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_T_H_N;

		Object[] finderArgs = new Object[] { maTinh, maHuyen, nam };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DANHGIAVESINHXANEW_WHERE);

			boolean bindMaTinh = false;

			if (maTinh == null) {
				query.append(_FINDER_COLUMN_F_T_H_N_MATINH_1);
			}
			else if (maTinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_T_H_N_MATINH_3);
			}
			else {
				bindMaTinh = true;

				query.append(_FINDER_COLUMN_F_T_H_N_MATINH_2);
			}

			boolean bindMaHuyen = false;

			if (maHuyen == null) {
				query.append(_FINDER_COLUMN_F_T_H_N_MAHUYEN_1);
			}
			else if (maHuyen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_T_H_N_MAHUYEN_3);
			}
			else {
				bindMaHuyen = true;

				query.append(_FINDER_COLUMN_F_T_H_N_MAHUYEN_2);
			}

			query.append(_FINDER_COLUMN_F_T_H_N_NAM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTinh) {
					qPos.add(maTinh);
				}

				if (bindMaHuyen) {
					qPos.add(maHuyen);
				}

				qPos.add(nam);

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

	private static final String _FINDER_COLUMN_F_T_H_N_MATINH_1 = "danhGiaVeSinhXaNew.maTinh IS NULL AND ";
	private static final String _FINDER_COLUMN_F_T_H_N_MATINH_2 = "danhGiaVeSinhXaNew.maTinh = ? AND ";
	private static final String _FINDER_COLUMN_F_T_H_N_MATINH_3 = "(danhGiaVeSinhXaNew.maTinh IS NULL OR danhGiaVeSinhXaNew.maTinh = '') AND ";
	private static final String _FINDER_COLUMN_F_T_H_N_MAHUYEN_1 = "danhGiaVeSinhXaNew.maHuyen IS NULL AND ";
	private static final String _FINDER_COLUMN_F_T_H_N_MAHUYEN_2 = "danhGiaVeSinhXaNew.maHuyen = ? AND ";
	private static final String _FINDER_COLUMN_F_T_H_N_MAHUYEN_3 = "(danhGiaVeSinhXaNew.maHuyen IS NULL OR danhGiaVeSinhXaNew.maHuyen = '') AND ";
	private static final String _FINDER_COLUMN_F_T_H_N_NAM_2 = "danhGiaVeSinhXaNew.nam = ?";

	public DanhGiaVeSinhXaNewPersistenceImpl() {
		setModelClass(DanhGiaVeSinhXaNew.class);
	}

	/**
	 * Caches the danh gia ve sinh xa new in the entity cache if it is enabled.
	 *
	 * @param danhGiaVeSinhXaNew the danh gia ve sinh xa new
	 */
	@Override
	public void cacheResult(DanhGiaVeSinhXaNew danhGiaVeSinhXaNew) {
		EntityCacheUtil.putResult(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewImpl.class, danhGiaVeSinhXaNew.getPrimaryKey(),
			danhGiaVeSinhXaNew);

		danhGiaVeSinhXaNew.resetOriginalValues();
	}

	/**
	 * Caches the danh gia ve sinh xa news in the entity cache if it is enabled.
	 *
	 * @param danhGiaVeSinhXaNews the danh gia ve sinh xa news
	 */
	@Override
	public void cacheResult(List<DanhGiaVeSinhXaNew> danhGiaVeSinhXaNews) {
		for (DanhGiaVeSinhXaNew danhGiaVeSinhXaNew : danhGiaVeSinhXaNews) {
			if (EntityCacheUtil.getResult(
						DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
						DanhGiaVeSinhXaNewImpl.class,
						danhGiaVeSinhXaNew.getPrimaryKey()) == null) {
				cacheResult(danhGiaVeSinhXaNew);
			}
			else {
				danhGiaVeSinhXaNew.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all danh gia ve sinh xa news.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DanhGiaVeSinhXaNewImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DanhGiaVeSinhXaNewImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the danh gia ve sinh xa new.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DanhGiaVeSinhXaNew danhGiaVeSinhXaNew) {
		EntityCacheUtil.removeResult(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewImpl.class, danhGiaVeSinhXaNew.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DanhGiaVeSinhXaNew> danhGiaVeSinhXaNews) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DanhGiaVeSinhXaNew danhGiaVeSinhXaNew : danhGiaVeSinhXaNews) {
			EntityCacheUtil.removeResult(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
				DanhGiaVeSinhXaNewImpl.class, danhGiaVeSinhXaNew.getPrimaryKey());
		}
	}

	/**
	 * Creates a new danh gia ve sinh xa new with the primary key. Does not add the danh gia ve sinh xa new to the database.
	 *
	 * @param id the primary key for the new danh gia ve sinh xa new
	 * @return the new danh gia ve sinh xa new
	 */
	@Override
	public DanhGiaVeSinhXaNew create(int id) {
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = new DanhGiaVeSinhXaNewImpl();

		danhGiaVeSinhXaNew.setNew(true);
		danhGiaVeSinhXaNew.setPrimaryKey(id);

		return danhGiaVeSinhXaNew;
	}

	/**
	 * Removes the danh gia ve sinh xa new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the danh gia ve sinh xa new
	 * @return the danh gia ve sinh xa new that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a danh gia ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew remove(int id)
		throws NoSuchDanhGiaVeSinhXaNewException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the danh gia ve sinh xa new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the danh gia ve sinh xa new
	 * @return the danh gia ve sinh xa new that was removed
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a danh gia ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew remove(Serializable primaryKey)
		throws NoSuchDanhGiaVeSinhXaNewException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = (DanhGiaVeSinhXaNew)session.get(DanhGiaVeSinhXaNewImpl.class,
					primaryKey);

			if (danhGiaVeSinhXaNew == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDanhGiaVeSinhXaNewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(danhGiaVeSinhXaNew);
		}
		catch (NoSuchDanhGiaVeSinhXaNewException nsee) {
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
	protected DanhGiaVeSinhXaNew removeImpl(
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew) throws SystemException {
		danhGiaVeSinhXaNew = toUnwrappedModel(danhGiaVeSinhXaNew);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(danhGiaVeSinhXaNew)) {
				danhGiaVeSinhXaNew = (DanhGiaVeSinhXaNew)session.get(DanhGiaVeSinhXaNewImpl.class,
						danhGiaVeSinhXaNew.getPrimaryKeyObj());
			}

			if (danhGiaVeSinhXaNew != null) {
				session.delete(danhGiaVeSinhXaNew);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (danhGiaVeSinhXaNew != null) {
			clearCache(danhGiaVeSinhXaNew);
		}

		return danhGiaVeSinhXaNew;
	}

	@Override
	public DanhGiaVeSinhXaNew updateImpl(
		vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew danhGiaVeSinhXaNew)
		throws SystemException {
		danhGiaVeSinhXaNew = toUnwrappedModel(danhGiaVeSinhXaNew);

		boolean isNew = danhGiaVeSinhXaNew.isNew();

		DanhGiaVeSinhXaNewModelImpl danhGiaVeSinhXaNewModelImpl = (DanhGiaVeSinhXaNewModelImpl)danhGiaVeSinhXaNew;

		Session session = null;

		try {
			session = openSession();

			if (danhGiaVeSinhXaNew.isNew()) {
				session.save(danhGiaVeSinhXaNew);

				danhGiaVeSinhXaNew.setNew(false);
			}
			else {
				session.merge(danhGiaVeSinhXaNew);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DanhGiaVeSinhXaNewModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((danhGiaVeSinhXaNewModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_MATINH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhGiaVeSinhXaNewModelImpl.getOriginalMaTinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_MATINH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_MATINH,
					args);

				args = new Object[] { danhGiaVeSinhXaNewModelImpl.getMaTinh() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_MATINH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_MATINH,
					args);
			}

			if ((danhGiaVeSinhXaNewModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_T_H_N.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhGiaVeSinhXaNewModelImpl.getOriginalMaTinh(),
						danhGiaVeSinhXaNewModelImpl.getOriginalMaHuyen(),
						danhGiaVeSinhXaNewModelImpl.getOriginalNam()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_T_H_N, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_T_H_N,
					args);

				args = new Object[] {
						danhGiaVeSinhXaNewModelImpl.getMaTinh(),
						danhGiaVeSinhXaNewModelImpl.getMaHuyen(),
						danhGiaVeSinhXaNewModelImpl.getNam()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_T_H_N, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_T_H_N,
					args);
			}
		}

		EntityCacheUtil.putResult(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
			DanhGiaVeSinhXaNewImpl.class, danhGiaVeSinhXaNew.getPrimaryKey(),
			danhGiaVeSinhXaNew);

		return danhGiaVeSinhXaNew;
	}

	protected DanhGiaVeSinhXaNew toUnwrappedModel(
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew) {
		if (danhGiaVeSinhXaNew instanceof DanhGiaVeSinhXaNewImpl) {
			return danhGiaVeSinhXaNew;
		}

		DanhGiaVeSinhXaNewImpl danhGiaVeSinhXaNewImpl = new DanhGiaVeSinhXaNewImpl();

		danhGiaVeSinhXaNewImpl.setNew(danhGiaVeSinhXaNew.isNew());
		danhGiaVeSinhXaNewImpl.setPrimaryKey(danhGiaVeSinhXaNew.getPrimaryKey());

		danhGiaVeSinhXaNewImpl.setId(danhGiaVeSinhXaNew.getId());
		danhGiaVeSinhXaNewImpl.setMaTinh(danhGiaVeSinhXaNew.getMaTinh());
		danhGiaVeSinhXaNewImpl.setMaHuyen(danhGiaVeSinhXaNew.getMaHuyen());
		danhGiaVeSinhXaNewImpl.setMaXa(danhGiaVeSinhXaNew.getMaXa());
		danhGiaVeSinhXaNewImpl.setNam(danhGiaVeSinhXaNew.getNam());
		danhGiaVeSinhXaNewImpl.setSoDan(danhGiaVeSinhXaNew.getSoDan());
		danhGiaVeSinhXaNewImpl.setTongSoHGD(danhGiaVeSinhXaNew.getTongSoHGD());
		danhGiaVeSinhXaNewImpl.setSoHGDCoNhaTieu(danhGiaVeSinhXaNew.getSoHGDCoNhaTieu());
		danhGiaVeSinhXaNewImpl.setSoHGDCoNhaTieuHVS(danhGiaVeSinhXaNew.getSoHGDCoNhaTieuHVS());
		danhGiaVeSinhXaNewImpl.setSoNhaTieuHVSXayMoi(danhGiaVeSinhXaNew.getSoNhaTieuHVSXayMoi());
		danhGiaVeSinhXaNewImpl.setTiLeHGDCoNhaTieu(danhGiaVeSinhXaNew.getTiLeHGDCoNhaTieu());
		danhGiaVeSinhXaNewImpl.setTiLeHGDCoNhaTieuHVS(danhGiaVeSinhXaNew.getTiLeHGDCoNhaTieuHVS());
		danhGiaVeSinhXaNewImpl.setTongSoTruongHoc(danhGiaVeSinhXaNew.getTongSoTruongHoc());
		danhGiaVeSinhXaNewImpl.setSoTruongHocHVS(danhGiaVeSinhXaNew.getSoTruongHocHVS());
		danhGiaVeSinhXaNewImpl.setTongSoTramYTe(danhGiaVeSinhXaNew.getTongSoTramYTe());
		danhGiaVeSinhXaNewImpl.setSoTramYTeHVS(danhGiaVeSinhXaNew.getSoTramYTeHVS());
		danhGiaVeSinhXaNewImpl.setTiLeTruongHocHVS(danhGiaVeSinhXaNew.getTiLeTruongHocHVS());
		danhGiaVeSinhXaNewImpl.setTiLeTramYTeHVS(danhGiaVeSinhXaNew.getTiLeTramYTeHVS());
		danhGiaVeSinhXaNewImpl.setKetLuanVSTX(danhGiaVeSinhXaNew.getKetLuanVSTX());
		danhGiaVeSinhXaNewImpl.setGhiChu(danhGiaVeSinhXaNew.getGhiChu());
		danhGiaVeSinhXaNewImpl.setBaoCaoDLI(danhGiaVeSinhXaNew.getBaoCaoDLI());
		danhGiaVeSinhXaNewImpl.setNgayTao(danhGiaVeSinhXaNew.getNgayTao());
		danhGiaVeSinhXaNewImpl.setIdNguoiTao(danhGiaVeSinhXaNew.getIdNguoiTao());

		return danhGiaVeSinhXaNewImpl;
	}

	/**
	 * Returns the danh gia ve sinh xa new with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the danh gia ve sinh xa new
	 * @return the danh gia ve sinh xa new
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a danh gia ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDanhGiaVeSinhXaNewException, SystemException {
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = fetchByPrimaryKey(primaryKey);

		if (danhGiaVeSinhXaNew == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDanhGiaVeSinhXaNewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return danhGiaVeSinhXaNew;
	}

	/**
	 * Returns the danh gia ve sinh xa new with the primary key or throws a {@link vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException} if it could not be found.
	 *
	 * @param id the primary key of the danh gia ve sinh xa new
	 * @return the danh gia ve sinh xa new
	 * @throws vn.dtt.sol.ns.vesinhmoitruong.dao.NoSuchDanhGiaVeSinhXaNewException if a danh gia ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew findByPrimaryKey(int id)
		throws NoSuchDanhGiaVeSinhXaNewException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the danh gia ve sinh xa new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the danh gia ve sinh xa new
	 * @return the danh gia ve sinh xa new, or <code>null</code> if a danh gia ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DanhGiaVeSinhXaNew danhGiaVeSinhXaNew = (DanhGiaVeSinhXaNew)EntityCacheUtil.getResult(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
				DanhGiaVeSinhXaNewImpl.class, primaryKey);

		if (danhGiaVeSinhXaNew == _nullDanhGiaVeSinhXaNew) {
			return null;
		}

		if (danhGiaVeSinhXaNew == null) {
			Session session = null;

			try {
				session = openSession();

				danhGiaVeSinhXaNew = (DanhGiaVeSinhXaNew)session.get(DanhGiaVeSinhXaNewImpl.class,
						primaryKey);

				if (danhGiaVeSinhXaNew != null) {
					cacheResult(danhGiaVeSinhXaNew);
				}
				else {
					EntityCacheUtil.putResult(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
						DanhGiaVeSinhXaNewImpl.class, primaryKey,
						_nullDanhGiaVeSinhXaNew);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DanhGiaVeSinhXaNewModelImpl.ENTITY_CACHE_ENABLED,
					DanhGiaVeSinhXaNewImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return danhGiaVeSinhXaNew;
	}

	/**
	 * Returns the danh gia ve sinh xa new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the danh gia ve sinh xa new
	 * @return the danh gia ve sinh xa new, or <code>null</code> if a danh gia ve sinh xa new with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhGiaVeSinhXaNew fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the danh gia ve sinh xa news.
	 *
	 * @return the danh gia ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNew> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh gia ve sinh xa news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of danh gia ve sinh xa news
	 * @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	 * @return the range of danh gia ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNew> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh gia ve sinh xa news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.DanhGiaVeSinhXaNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of danh gia ve sinh xa news
	 * @param end the upper bound of the range of danh gia ve sinh xa news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of danh gia ve sinh xa news
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DanhGiaVeSinhXaNew> findAll(int start, int end,
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

		List<DanhGiaVeSinhXaNew> list = (List<DanhGiaVeSinhXaNew>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DANHGIAVESINHXANEW);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DANHGIAVESINHXANEW;

				if (pagination) {
					sql = sql.concat(DanhGiaVeSinhXaNewModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DanhGiaVeSinhXaNew>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DanhGiaVeSinhXaNew>(list);
				}
				else {
					list = (List<DanhGiaVeSinhXaNew>)QueryUtil.list(q,
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
	 * Removes all the danh gia ve sinh xa news from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DanhGiaVeSinhXaNew danhGiaVeSinhXaNew : findAll()) {
			remove(danhGiaVeSinhXaNew);
		}
	}

	/**
	 * Returns the number of danh gia ve sinh xa news.
	 *
	 * @return the number of danh gia ve sinh xa news
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

				Query q = session.createQuery(_SQL_COUNT_DANHGIAVESINHXANEW);

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
	 * Initializes the danh gia ve sinh xa new persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.sol.ns.vesinhmoitruong.dao.model.DanhGiaVeSinhXaNew")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DanhGiaVeSinhXaNew>> listenersList = new ArrayList<ModelListener<DanhGiaVeSinhXaNew>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DanhGiaVeSinhXaNew>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DanhGiaVeSinhXaNewImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DANHGIAVESINHXANEW = "SELECT danhGiaVeSinhXaNew FROM DanhGiaVeSinhXaNew danhGiaVeSinhXaNew";
	private static final String _SQL_SELECT_DANHGIAVESINHXANEW_WHERE = "SELECT danhGiaVeSinhXaNew FROM DanhGiaVeSinhXaNew danhGiaVeSinhXaNew WHERE ";
	private static final String _SQL_COUNT_DANHGIAVESINHXANEW = "SELECT COUNT(danhGiaVeSinhXaNew) FROM DanhGiaVeSinhXaNew danhGiaVeSinhXaNew";
	private static final String _SQL_COUNT_DANHGIAVESINHXANEW_WHERE = "SELECT COUNT(danhGiaVeSinhXaNew) FROM DanhGiaVeSinhXaNew danhGiaVeSinhXaNew WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "danhGiaVeSinhXaNew.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DanhGiaVeSinhXaNew exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DanhGiaVeSinhXaNew exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DanhGiaVeSinhXaNewPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maTinh", "maHuyen", "maXa", "nam", "soDan", "tongSoHGD",
				"soHGDCoNhaTieu", "soHGDCoNhaTieuHVS", "soNhaTieuHVSXayMoi",
				"tiLeHGDCoNhaTieu", "tiLeHGDCoNhaTieuHVS", "tongSoTruongHoc",
				"soTruongHocHVS", "tongSoTramYTe", "soTramYTeHVS",
				"tiLeTruongHocHVS", "tiLeTramYTeHVS", "ketLuanVSTX", "ghiChu",
				"baoCaoDLI", "ngayTao", "idNguoiTao"
			});
	private static DanhGiaVeSinhXaNew _nullDanhGiaVeSinhXaNew = new DanhGiaVeSinhXaNewImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DanhGiaVeSinhXaNew> toCacheModel() {
				return _nullDanhGiaVeSinhXaNewCacheModel;
			}
		};

	private static CacheModel<DanhGiaVeSinhXaNew> _nullDanhGiaVeSinhXaNewCacheModel =
		new CacheModel<DanhGiaVeSinhXaNew>() {
			@Override
			public DanhGiaVeSinhXaNew toEntityModel() {
				return _nullDanhGiaVeSinhXaNew;
			}
		};
}