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

package vn.dtt.cmon.kiemdemvien.dao.service.persistence;

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

import vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException;
import vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien;
import vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienImpl;
import vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the kiem dem vien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HANT
 * @see KiemDemVienPersistence
 * @see KiemDemVienUtil
 * @generated
 */
public class KiemDemVienPersistenceImpl extends BasePersistenceImpl<KiemDemVien>
	implements KiemDemVienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KiemDemVienUtil} to access the kiem dem vien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KiemDemVienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_ID = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByID",
			new String[] { Long.class.getName() },
			KiemDemVienModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByID",
			new String[] { Long.class.getName() });

	/**
	 * Returns the kiem dem vien where id = &#63; or throws a {@link vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException} if it could not be found.
	 *
	 * @param id the ID
	 * @return the matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByID(long id)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByID(id);

		if (kiemDemVien == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id=");
			msg.append(id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchKiemDemVienException(msg.toString());
		}

		return kiemDemVien;
	}

	/**
	 * Returns the kiem dem vien where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id the ID
	 * @return the matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByID(long id) throws SystemException {
		return fetchByID(id, true);
	}

	/**
	 * Returns the kiem dem vien where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id the ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByID(long id, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { id };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ID,
					finderArgs, this);
		}

		if (result instanceof KiemDemVien) {
			KiemDemVien kiemDemVien = (KiemDemVien)result;

			if ((id != kiemDemVien.getId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				List<KiemDemVien> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"KiemDemVienPersistenceImpl.fetchByID(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					KiemDemVien kiemDemVien = list.get(0);

					result = kiemDemVien;

					cacheResult(kiemDemVien);

					if ((kiemDemVien.getId() != id)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
							finderArgs, kiemDemVien);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, finderArgs);

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
			return (KiemDemVien)result;
		}
	}

	/**
	 * Removes the kiem dem vien where id = &#63; from the database.
	 *
	 * @param id the ID
	 * @return the kiem dem vien that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien removeByID(long id)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = findByID(id);

		return remove(kiemDemVien);
	}

	/**
	 * Returns the number of kiem dem viens where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByID(long id) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KIEMDEMVIEN_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "kiemDemVien.id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HT = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHT",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HT = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHT",
			new String[] { String.class.getName() },
			KiemDemVienModelImpl.HOVATEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HT = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHT",
			new String[] { String.class.getName() });

	/**
	 * Returns all the kiem dem viens where hoVaTen = &#63;.
	 *
	 * @param hoVaTen the ho va ten
	 * @return the matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByHT(String hoVaTen) throws SystemException {
		return findByHT(hoVaTen, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kiem dem viens where hoVaTen = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoVaTen the ho va ten
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @return the range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByHT(String hoVaTen, int start, int end)
		throws SystemException {
		return findByHT(hoVaTen, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kiem dem viens where hoVaTen = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoVaTen the ho va ten
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByHT(String hoVaTen, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HT;
			finderArgs = new Object[] { hoVaTen };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HT;
			finderArgs = new Object[] { hoVaTen, start, end, orderByComparator };
		}

		List<KiemDemVien> list = (List<KiemDemVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KiemDemVien kiemDemVien : list) {
				if (!Validator.equals(hoVaTen, kiemDemVien.getHoVaTen())) {
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

			query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

			boolean bindHoVaTen = false;

			if (hoVaTen == null) {
				query.append(_FINDER_COLUMN_HT_HOVATEN_1);
			}
			else if (hoVaTen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_HT_HOVATEN_3);
			}
			else {
				bindHoVaTen = true;

				query.append(_FINDER_COLUMN_HT_HOVATEN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindHoVaTen) {
					qPos.add(hoVaTen);
				}

				if (!pagination) {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KiemDemVien>(list);
				}
				else {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kiem dem vien in the ordered set where hoVaTen = &#63;.
	 *
	 * @param hoVaTen the ho va ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByHT_First(String hoVaTen,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByHT_First(hoVaTen, orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoVaTen=");
		msg.append(hoVaTen);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the first kiem dem vien in the ordered set where hoVaTen = &#63;.
	 *
	 * @param hoVaTen the ho va ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByHT_First(String hoVaTen,
		OrderByComparator orderByComparator) throws SystemException {
		List<KiemDemVien> list = findByHT(hoVaTen, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where hoVaTen = &#63;.
	 *
	 * @param hoVaTen the ho va ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByHT_Last(String hoVaTen,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByHT_Last(hoVaTen, orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoVaTen=");
		msg.append(hoVaTen);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where hoVaTen = &#63;.
	 *
	 * @param hoVaTen the ho va ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByHT_Last(String hoVaTen,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHT(hoVaTen);

		if (count == 0) {
			return null;
		}

		List<KiemDemVien> list = findByHT(hoVaTen, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where hoVaTen = &#63;.
	 *
	 * @param id the primary key of the current kiem dem vien
	 * @param hoVaTen the ho va ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien[] findByHT_PrevAndNext(long id, String hoVaTen,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KiemDemVien[] array = new KiemDemVienImpl[3];

			array[0] = getByHT_PrevAndNext(session, kiemDemVien, hoVaTen,
					orderByComparator, true);

			array[1] = kiemDemVien;

			array[2] = getByHT_PrevAndNext(session, kiemDemVien, hoVaTen,
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

	protected KiemDemVien getByHT_PrevAndNext(Session session,
		KiemDemVien kiemDemVien, String hoVaTen,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

		boolean bindHoVaTen = false;

		if (hoVaTen == null) {
			query.append(_FINDER_COLUMN_HT_HOVATEN_1);
		}
		else if (hoVaTen.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_HT_HOVATEN_3);
		}
		else {
			bindHoVaTen = true;

			query.append(_FINDER_COLUMN_HT_HOVATEN_2);
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
			query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindHoVaTen) {
			qPos.add(hoVaTen);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kiemDemVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KiemDemVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kiem dem viens where hoVaTen = &#63; from the database.
	 *
	 * @param hoVaTen the ho va ten
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHT(String hoVaTen) throws SystemException {
		for (KiemDemVien kiemDemVien : findByHT(hoVaTen, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(kiemDemVien);
		}
	}

	/**
	 * Returns the number of kiem dem viens where hoVaTen = &#63;.
	 *
	 * @param hoVaTen the ho va ten
	 * @return the number of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHT(String hoVaTen) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HT;

		Object[] finderArgs = new Object[] { hoVaTen };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KIEMDEMVIEN_WHERE);

			boolean bindHoVaTen = false;

			if (hoVaTen == null) {
				query.append(_FINDER_COLUMN_HT_HOVATEN_1);
			}
			else if (hoVaTen.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_HT_HOVATEN_3);
			}
			else {
				bindHoVaTen = true;

				query.append(_FINDER_COLUMN_HT_HOVATEN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindHoVaTen) {
					qPos.add(hoVaTen);
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

	private static final String _FINDER_COLUMN_HT_HOVATEN_1 = "kiemDemVien.hoVaTen IS NULL";
	private static final String _FINDER_COLUMN_HT_HOVATEN_2 = "kiemDemVien.hoVaTen = ?";
	private static final String _FINDER_COLUMN_HT_HOVATEN_3 = "(kiemDemVien.hoVaTen IS NULL OR kiemDemVien.hoVaTen = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_TK = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByTK",
			new String[] { String.class.getName() },
			KiemDemVienModelImpl.TAIKHOAN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TK = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTK",
			new String[] { String.class.getName() });

	/**
	 * Returns the kiem dem vien where taiKhoan = &#63; or throws a {@link vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException} if it could not be found.
	 *
	 * @param taiKhoan the tai khoan
	 * @return the matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByTK(String taiKhoan)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByTK(taiKhoan);

		if (kiemDemVien == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("taiKhoan=");
			msg.append(taiKhoan);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchKiemDemVienException(msg.toString());
		}

		return kiemDemVien;
	}

	/**
	 * Returns the kiem dem vien where taiKhoan = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param taiKhoan the tai khoan
	 * @return the matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByTK(String taiKhoan) throws SystemException {
		return fetchByTK(taiKhoan, true);
	}

	/**
	 * Returns the kiem dem vien where taiKhoan = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param taiKhoan the tai khoan
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByTK(String taiKhoan, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { taiKhoan };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TK,
					finderArgs, this);
		}

		if (result instanceof KiemDemVien) {
			KiemDemVien kiemDemVien = (KiemDemVien)result;

			if (!Validator.equals(taiKhoan, kiemDemVien.getTaiKhoan())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

			boolean bindTaiKhoan = false;

			if (taiKhoan == null) {
				query.append(_FINDER_COLUMN_TK_TAIKHOAN_1);
			}
			else if (taiKhoan.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TK_TAIKHOAN_3);
			}
			else {
				bindTaiKhoan = true;

				query.append(_FINDER_COLUMN_TK_TAIKHOAN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTaiKhoan) {
					qPos.add(taiKhoan);
				}

				List<KiemDemVien> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TK,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"KiemDemVienPersistenceImpl.fetchByTK(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					KiemDemVien kiemDemVien = list.get(0);

					result = kiemDemVien;

					cacheResult(kiemDemVien);

					if ((kiemDemVien.getTaiKhoan() == null) ||
							!kiemDemVien.getTaiKhoan().equals(taiKhoan)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TK,
							finderArgs, kiemDemVien);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TK, finderArgs);

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
			return (KiemDemVien)result;
		}
	}

	/**
	 * Removes the kiem dem vien where taiKhoan = &#63; from the database.
	 *
	 * @param taiKhoan the tai khoan
	 * @return the kiem dem vien that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien removeByTK(String taiKhoan)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = findByTK(taiKhoan);

		return remove(kiemDemVien);
	}

	/**
	 * Returns the number of kiem dem viens where taiKhoan = &#63;.
	 *
	 * @param taiKhoan the tai khoan
	 * @return the number of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTK(String taiKhoan) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TK;

		Object[] finderArgs = new Object[] { taiKhoan };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KIEMDEMVIEN_WHERE);

			boolean bindTaiKhoan = false;

			if (taiKhoan == null) {
				query.append(_FINDER_COLUMN_TK_TAIKHOAN_1);
			}
			else if (taiKhoan.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TK_TAIKHOAN_3);
			}
			else {
				bindTaiKhoan = true;

				query.append(_FINDER_COLUMN_TK_TAIKHOAN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTaiKhoan) {
					qPos.add(taiKhoan);
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

	private static final String _FINDER_COLUMN_TK_TAIKHOAN_1 = "kiemDemVien.taiKhoan IS NULL";
	private static final String _FINDER_COLUMN_TK_TAIKHOAN_2 = "kiemDemVien.taiKhoan = ?";
	private static final String _FINDER_COLUMN_TK_TAIKHOAN_3 = "(kiemDemVien.taiKhoan IS NULL OR kiemDemVien.taiKhoan = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_O_C_1 = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByO_C_1",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1 = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByO_C_1",
			new String[] { String.class.getName() },
			KiemDemVienModelImpl.ORGCODE1_COLUMN_BITMASK |
			KiemDemVienModelImpl.HOVATEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_O_C_1 = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByO_C_1",
			new String[] { String.class.getName() });

	/**
	 * Returns all the kiem dem viens where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @return the matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByO_C_1(String orgCode1)
		throws SystemException {
		return findByO_C_1(orgCode1, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kiem dem viens where orgCode1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode1 the org code1
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @return the range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByO_C_1(String orgCode1, int start, int end)
		throws SystemException {
		return findByO_C_1(orgCode1, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kiem dem viens where orgCode1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode1 the org code1
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByO_C_1(String orgCode1, int start, int end,
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

		List<KiemDemVien> list = (List<KiemDemVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KiemDemVien kiemDemVien : list) {
				if (!Validator.equals(orgCode1, kiemDemVien.getOrgCode1())) {
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

			query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

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
				query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
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
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KiemDemVien>(list);
				}
				else {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kiem dem vien in the ordered set where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByO_C_1_First(String orgCode1,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByO_C_1_First(orgCode1, orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgCode1=");
		msg.append(orgCode1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the first kiem dem vien in the ordered set where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByO_C_1_First(String orgCode1,
		OrderByComparator orderByComparator) throws SystemException {
		List<KiemDemVien> list = findByO_C_1(orgCode1, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByO_C_1_Last(String orgCode1,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByO_C_1_Last(orgCode1, orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgCode1=");
		msg.append(orgCode1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByO_C_1_Last(String orgCode1,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByO_C_1(orgCode1);

		if (count == 0) {
			return null;
		}

		List<KiemDemVien> list = findByO_C_1(orgCode1, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where orgCode1 = &#63;.
	 *
	 * @param id the primary key of the current kiem dem vien
	 * @param orgCode1 the org code1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien[] findByO_C_1_PrevAndNext(long id, String orgCode1,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KiemDemVien[] array = new KiemDemVienImpl[3];

			array[0] = getByO_C_1_PrevAndNext(session, kiemDemVien, orgCode1,
					orderByComparator, true);

			array[1] = kiemDemVien;

			array[2] = getByO_C_1_PrevAndNext(session, kiemDemVien, orgCode1,
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

	protected KiemDemVien getByO_C_1_PrevAndNext(Session session,
		KiemDemVien kiemDemVien, String orgCode1,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

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
			query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(kiemDemVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KiemDemVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kiem dem viens where orgCode1 = &#63; from the database.
	 *
	 * @param orgCode1 the org code1
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByO_C_1(String orgCode1) throws SystemException {
		for (KiemDemVien kiemDemVien : findByO_C_1(orgCode1, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(kiemDemVien);
		}
	}

	/**
	 * Returns the number of kiem dem viens where orgCode1 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @return the number of matching kiem dem viens
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

			query.append(_SQL_COUNT_KIEMDEMVIEN_WHERE);

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

	private static final String _FINDER_COLUMN_O_C_1_ORGCODE1_1 = "kiemDemVien.orgCode1 IS NULL";
	private static final String _FINDER_COLUMN_O_C_1_ORGCODE1_2 = "kiemDemVien.orgCode1 = ?";
	private static final String _FINDER_COLUMN_O_C_1_ORGCODE1_3 = "(kiemDemVien.orgCode1 IS NULL OR kiemDemVien.orgCode1 = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_O_C_1_O_C_2 =
		new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByO_C_1_O_C_2",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1_O_C_2 =
		new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByO_C_1_O_C_2",
			new String[] { String.class.getName(), String.class.getName() },
			KiemDemVienModelImpl.ORGCODE1_COLUMN_BITMASK |
			KiemDemVienModelImpl.ORGCODE2_COLUMN_BITMASK |
			KiemDemVienModelImpl.HOVATEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_O_C_1_O_C_2 = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByO_C_1_O_C_2",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @return the matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByO_C_1_O_C_2(String orgCode1, String orgCode2)
		throws SystemException {
		return findByO_C_1_O_C_2(orgCode1, orgCode2, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @return the range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByO_C_1_O_C_2(String orgCode1,
		String orgCode2, int start, int end) throws SystemException {
		return findByO_C_1_O_C_2(orgCode1, orgCode2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByO_C_1_O_C_2(String orgCode1,
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

		List<KiemDemVien> list = (List<KiemDemVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KiemDemVien kiemDemVien : list) {
				if (!Validator.equals(orgCode1, kiemDemVien.getOrgCode1()) ||
						!Validator.equals(orgCode2, kiemDemVien.getOrgCode2())) {
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

			query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

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
				query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
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
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KiemDemVien>(list);
				}
				else {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kiem dem vien in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByO_C_1_O_C_2_First(String orgCode1,
		String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByO_C_1_O_C_2_First(orgCode1, orgCode2,
				orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgCode1=");
		msg.append(orgCode1);

		msg.append(", orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the first kiem dem vien in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByO_C_1_O_C_2_First(String orgCode1,
		String orgCode2, OrderByComparator orderByComparator)
		throws SystemException {
		List<KiemDemVien> list = findByO_C_1_O_C_2(orgCode1, orgCode2, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByO_C_1_O_C_2_Last(String orgCode1, String orgCode2,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByO_C_1_O_C_2_Last(orgCode1, orgCode2,
				orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgCode1=");
		msg.append(orgCode1);

		msg.append(", orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByO_C_1_O_C_2_Last(String orgCode1,
		String orgCode2, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByO_C_1_O_C_2(orgCode1, orgCode2);

		if (count == 0) {
			return null;
		}

		List<KiemDemVien> list = findByO_C_1_O_C_2(orgCode1, orgCode2,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param id the primary key of the current kiem dem vien
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien[] findByO_C_1_O_C_2_PrevAndNext(long id,
		String orgCode1, String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KiemDemVien[] array = new KiemDemVienImpl[3];

			array[0] = getByO_C_1_O_C_2_PrevAndNext(session, kiemDemVien,
					orgCode1, orgCode2, orderByComparator, true);

			array[1] = kiemDemVien;

			array[2] = getByO_C_1_O_C_2_PrevAndNext(session, kiemDemVien,
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

	protected KiemDemVien getByO_C_1_O_C_2_PrevAndNext(Session session,
		KiemDemVien kiemDemVien, String orgCode1, String orgCode2,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

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
			query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(kiemDemVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KiemDemVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63; from the database.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByO_C_1_O_C_2(String orgCode1, String orgCode2)
		throws SystemException {
		for (KiemDemVien kiemDemVien : findByO_C_1_O_C_2(orgCode1, orgCode2,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(kiemDemVien);
		}
	}

	/**
	 * Returns the number of kiem dem viens where orgCode1 = &#63; and orgCode2 = &#63;.
	 *
	 * @param orgCode1 the org code1
	 * @param orgCode2 the org code2
	 * @return the number of matching kiem dem viens
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

			query.append(_SQL_COUNT_KIEMDEMVIEN_WHERE);

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

	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_1 = "kiemDemVien.orgCode1 IS NULL AND ";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_2 = "kiemDemVien.orgCode1 = ? AND ";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE1_3 = "(kiemDemVien.orgCode1 IS NULL OR kiemDemVien.orgCode1 = '') AND ";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_1 = "kiemDemVien.orgCode2 IS NULL";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_2 = "kiemDemVien.orgCode2 = ?";
	private static final String _FINDER_COLUMN_O_C_1_O_C_2_ORGCODE2_3 = "(kiemDemVien.orgCode2 IS NULL OR kiemDemVien.orgCode2 = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_H_D_O_C_2 =
		new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_H_D_O_C_2",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_H_D_O_C_2 =
		new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_H_D_O_C_2",
			new String[] { Long.class.getName(), String.class.getName() },
			KiemDemVienModelImpl.CAPHOATDONG_COLUMN_BITMASK |
			KiemDemVienModelImpl.ORGCODE2_COLUMN_BITMASK |
			KiemDemVienModelImpl.HOVATEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_H_D_O_C_2 = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_H_D_O_C_2",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @return the matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByC_H_D_O_C_2(long capHoatDong, String orgCode2)
		throws SystemException {
		return findByC_H_D_O_C_2(capHoatDong, orgCode2, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @return the range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByC_H_D_O_C_2(long capHoatDong,
		String orgCode2, int start, int end) throws SystemException {
		return findByC_H_D_O_C_2(capHoatDong, orgCode2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByC_H_D_O_C_2(long capHoatDong,
		String orgCode2, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_H_D_O_C_2;
			finderArgs = new Object[] { capHoatDong, orgCode2 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_H_D_O_C_2;
			finderArgs = new Object[] {
					capHoatDong, orgCode2,
					
					start, end, orderByComparator
				};
		}

		List<KiemDemVien> list = (List<KiemDemVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KiemDemVien kiemDemVien : list) {
				if ((capHoatDong != kiemDemVien.getCapHoatDong()) ||
						!Validator.equals(orgCode2, kiemDemVien.getOrgCode2())) {
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

			query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

			query.append(_FINDER_COLUMN_C_H_D_O_C_2_CAPHOATDONG_2);

			boolean bindOrgCode2 = false;

			if (orgCode2 == null) {
				query.append(_FINDER_COLUMN_C_H_D_O_C_2_ORGCODE2_1);
			}
			else if (orgCode2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_H_D_O_C_2_ORGCODE2_3);
			}
			else {
				bindOrgCode2 = true;

				query.append(_FINDER_COLUMN_C_H_D_O_C_2_ORGCODE2_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capHoatDong);

				if (bindOrgCode2) {
					qPos.add(orgCode2);
				}

				if (!pagination) {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KiemDemVien>(list);
				}
				else {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByC_H_D_O_C_2_First(long capHoatDong,
		String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByC_H_D_O_C_2_First(capHoatDong,
				orgCode2, orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capHoatDong=");
		msg.append(capHoatDong);

		msg.append(", orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the first kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByC_H_D_O_C_2_First(long capHoatDong,
		String orgCode2, OrderByComparator orderByComparator)
		throws SystemException {
		List<KiemDemVien> list = findByC_H_D_O_C_2(capHoatDong, orgCode2, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByC_H_D_O_C_2_Last(long capHoatDong,
		String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByC_H_D_O_C_2_Last(capHoatDong,
				orgCode2, orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capHoatDong=");
		msg.append(capHoatDong);

		msg.append(", orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByC_H_D_O_C_2_Last(long capHoatDong,
		String orgCode2, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_H_D_O_C_2(capHoatDong, orgCode2);

		if (count == 0) {
			return null;
		}

		List<KiemDemVien> list = findByC_H_D_O_C_2(capHoatDong, orgCode2,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param id the primary key of the current kiem dem vien
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien[] findByC_H_D_O_C_2_PrevAndNext(long id,
		long capHoatDong, String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KiemDemVien[] array = new KiemDemVienImpl[3];

			array[0] = getByC_H_D_O_C_2_PrevAndNext(session, kiemDemVien,
					capHoatDong, orgCode2, orderByComparator, true);

			array[1] = kiemDemVien;

			array[2] = getByC_H_D_O_C_2_PrevAndNext(session, kiemDemVien,
					capHoatDong, orgCode2, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected KiemDemVien getByC_H_D_O_C_2_PrevAndNext(Session session,
		KiemDemVien kiemDemVien, long capHoatDong, String orgCode2,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

		query.append(_FINDER_COLUMN_C_H_D_O_C_2_CAPHOATDONG_2);

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_C_H_D_O_C_2_ORGCODE2_1);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_H_D_O_C_2_ORGCODE2_3);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_C_H_D_O_C_2_ORGCODE2_2);
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
			query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(capHoatDong);

		if (bindOrgCode2) {
			qPos.add(orgCode2);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kiemDemVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KiemDemVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63; from the database.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_H_D_O_C_2(long capHoatDong, String orgCode2)
		throws SystemException {
		for (KiemDemVien kiemDemVien : findByC_H_D_O_C_2(capHoatDong, orgCode2,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(kiemDemVien);
		}
	}

	/**
	 * Returns the number of kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @return the number of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_H_D_O_C_2(long capHoatDong, String orgCode2)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_H_D_O_C_2;

		Object[] finderArgs = new Object[] { capHoatDong, orgCode2 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_KIEMDEMVIEN_WHERE);

			query.append(_FINDER_COLUMN_C_H_D_O_C_2_CAPHOATDONG_2);

			boolean bindOrgCode2 = false;

			if (orgCode2 == null) {
				query.append(_FINDER_COLUMN_C_H_D_O_C_2_ORGCODE2_1);
			}
			else if (orgCode2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_H_D_O_C_2_ORGCODE2_3);
			}
			else {
				bindOrgCode2 = true;

				query.append(_FINDER_COLUMN_C_H_D_O_C_2_ORGCODE2_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capHoatDong);

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

	private static final String _FINDER_COLUMN_C_H_D_O_C_2_CAPHOATDONG_2 = "kiemDemVien.capHoatDong = ? AND ";
	private static final String _FINDER_COLUMN_C_H_D_O_C_2_ORGCODE2_1 = "kiemDemVien.orgCode2 IS NULL";
	private static final String _FINDER_COLUMN_C_H_D_O_C_2_ORGCODE2_2 = "kiemDemVien.orgCode2 = ?";
	private static final String _FINDER_COLUMN_C_H_D_O_C_2_ORGCODE2_3 = "(kiemDemVien.orgCode2 IS NULL OR kiemDemVien.orgCode2 = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_O_C_2 = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByO_C_2",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_2 = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByO_C_2",
			new String[] { String.class.getName() },
			KiemDemVienModelImpl.ORGCODE2_COLUMN_BITMASK |
			KiemDemVienModelImpl.HOVATEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_O_C_2 = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByO_C_2",
			new String[] { String.class.getName() });

	/**
	 * Returns all the kiem dem viens where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @return the matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByO_C_2(String orgCode2)
		throws SystemException {
		return findByO_C_2(orgCode2, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kiem dem viens where orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @return the range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByO_C_2(String orgCode2, int start, int end)
		throws SystemException {
		return findByO_C_2(orgCode2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kiem dem viens where orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByO_C_2(String orgCode2, int start, int end,
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

		List<KiemDemVien> list = (List<KiemDemVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KiemDemVien kiemDemVien : list) {
				if (!Validator.equals(orgCode2, kiemDemVien.getOrgCode2())) {
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

			query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

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
				query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
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
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KiemDemVien>(list);
				}
				else {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kiem dem vien in the ordered set where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByO_C_2_First(String orgCode2,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByO_C_2_First(orgCode2, orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the first kiem dem vien in the ordered set where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByO_C_2_First(String orgCode2,
		OrderByComparator orderByComparator) throws SystemException {
		List<KiemDemVien> list = findByO_C_2(orgCode2, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByO_C_2_Last(String orgCode2,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByO_C_2_Last(orgCode2, orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByO_C_2_Last(String orgCode2,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByO_C_2(orgCode2);

		if (count == 0) {
			return null;
		}

		List<KiemDemVien> list = findByO_C_2(orgCode2, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where orgCode2 = &#63;.
	 *
	 * @param id the primary key of the current kiem dem vien
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien[] findByO_C_2_PrevAndNext(long id, String orgCode2,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KiemDemVien[] array = new KiemDemVienImpl[3];

			array[0] = getByO_C_2_PrevAndNext(session, kiemDemVien, orgCode2,
					orderByComparator, true);

			array[1] = kiemDemVien;

			array[2] = getByO_C_2_PrevAndNext(session, kiemDemVien, orgCode2,
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

	protected KiemDemVien getByO_C_2_PrevAndNext(Session session,
		KiemDemVien kiemDemVien, String orgCode2,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

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
			query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(kiemDemVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KiemDemVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kiem dem viens where orgCode2 = &#63; from the database.
	 *
	 * @param orgCode2 the org code2
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByO_C_2(String orgCode2) throws SystemException {
		for (KiemDemVien kiemDemVien : findByO_C_2(orgCode2, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(kiemDemVien);
		}
	}

	/**
	 * Returns the number of kiem dem viens where orgCode2 = &#63;.
	 *
	 * @param orgCode2 the org code2
	 * @return the number of matching kiem dem viens
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

			query.append(_SQL_COUNT_KIEMDEMVIEN_WHERE);

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

	private static final String _FINDER_COLUMN_O_C_2_ORGCODE2_1 = "kiemDemVien.orgCode2 IS NULL";
	private static final String _FINDER_COLUMN_O_C_2_ORGCODE2_2 = "kiemDemVien.orgCode2 = ?";
	private static final String _FINDER_COLUMN_O_C_2_ORGCODE2_3 = "(kiemDemVien.orgCode2 IS NULL OR kiemDemVien.orgCode2 = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_T = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByT_T",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_T = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_T",
			new String[] { Long.class.getName() },
			KiemDemVienModelImpl.TRANGTHAI_COLUMN_BITMASK |
			KiemDemVienModelImpl.HOVATEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_T = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_T",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the kiem dem viens where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @return the matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByT_T(long trangThai)
		throws SystemException {
		return findByT_T(trangThai, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kiem dem viens where trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @return the range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByT_T(long trangThai, int start, int end)
		throws SystemException {
		return findByT_T(trangThai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kiem dem viens where trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByT_T(long trangThai, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_T;
			finderArgs = new Object[] { trangThai };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_T;
			finderArgs = new Object[] { trangThai, start, end, orderByComparator };
		}

		List<KiemDemVien> list = (List<KiemDemVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KiemDemVien kiemDemVien : list) {
				if ((trangThai != kiemDemVien.getTrangThai())) {
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

			query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

			query.append(_FINDER_COLUMN_T_T_TRANGTHAI_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThai);

				if (!pagination) {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KiemDemVien>(list);
				}
				else {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kiem dem vien in the ordered set where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByT_T_First(long trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByT_T_First(trangThai, orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the first kiem dem vien in the ordered set where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByT_T_First(long trangThai,
		OrderByComparator orderByComparator) throws SystemException {
		List<KiemDemVien> list = findByT_T(trangThai, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByT_T_Last(long trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByT_T_Last(trangThai, orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByT_T_Last(long trangThai,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByT_T(trangThai);

		if (count == 0) {
			return null;
		}

		List<KiemDemVien> list = findByT_T(trangThai, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where trangThai = &#63;.
	 *
	 * @param id the primary key of the current kiem dem vien
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien[] findByT_T_PrevAndNext(long id, long trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KiemDemVien[] array = new KiemDemVienImpl[3];

			array[0] = getByT_T_PrevAndNext(session, kiemDemVien, trangThai,
					orderByComparator, true);

			array[1] = kiemDemVien;

			array[2] = getByT_T_PrevAndNext(session, kiemDemVien, trangThai,
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

	protected KiemDemVien getByT_T_PrevAndNext(Session session,
		KiemDemVien kiemDemVien, long trangThai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

		query.append(_FINDER_COLUMN_T_T_TRANGTHAI_2);

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
			query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(trangThai);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kiemDemVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KiemDemVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kiem dem viens where trangThai = &#63; from the database.
	 *
	 * @param trangThai the trang thai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByT_T(long trangThai) throws SystemException {
		for (KiemDemVien kiemDemVien : findByT_T(trangThai, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(kiemDemVien);
		}
	}

	/**
	 * Returns the number of kiem dem viens where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @return the number of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_T(long trangThai) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_T;

		Object[] finderArgs = new Object[] { trangThai };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KIEMDEMVIEN_WHERE);

			query.append(_FINDER_COLUMN_T_T_TRANGTHAI_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThai);

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

	private static final String _FINDER_COLUMN_T_T_TRANGTHAI_2 = "kiemDemVien.trangThai = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID_N_T = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByID_N_T",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID_N_T =
		new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByID_N_T",
			new String[] { Long.class.getName() },
			KiemDemVienModelImpl.IDNGUOITAO_COLUMN_BITMASK |
			KiemDemVienModelImpl.HOVATEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID_N_T = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByID_N_T",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the kiem dem viens where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @return the matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByID_N_T(long idNguoiTao)
		throws SystemException {
		return findByID_N_T(idNguoiTao, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the kiem dem viens where idNguoiTao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @return the range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByID_N_T(long idNguoiTao, int start, int end)
		throws SystemException {
		return findByID_N_T(idNguoiTao, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kiem dem viens where idNguoiTao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByID_N_T(long idNguoiTao, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID_N_T;
			finderArgs = new Object[] { idNguoiTao };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ID_N_T;
			finderArgs = new Object[] { idNguoiTao, start, end, orderByComparator };
		}

		List<KiemDemVien> list = (List<KiemDemVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KiemDemVien kiemDemVien : list) {
				if ((idNguoiTao != kiemDemVien.getIdNguoiTao())) {
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

			query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

			query.append(_FINDER_COLUMN_ID_N_T_IDNGUOITAO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idNguoiTao);

				if (!pagination) {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KiemDemVien>(list);
				}
				else {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kiem dem vien in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByID_N_T_First(long idNguoiTao,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByID_N_T_First(idNguoiTao,
				orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("idNguoiTao=");
		msg.append(idNguoiTao);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the first kiem dem vien in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByID_N_T_First(long idNguoiTao,
		OrderByComparator orderByComparator) throws SystemException {
		List<KiemDemVien> list = findByID_N_T(idNguoiTao, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByID_N_T_Last(long idNguoiTao,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByID_N_T_Last(idNguoiTao,
				orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("idNguoiTao=");
		msg.append(idNguoiTao);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByID_N_T_Last(long idNguoiTao,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByID_N_T(idNguoiTao);

		if (count == 0) {
			return null;
		}

		List<KiemDemVien> list = findByID_N_T(idNguoiTao, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where idNguoiTao = &#63;.
	 *
	 * @param id the primary key of the current kiem dem vien
	 * @param idNguoiTao the id nguoi tao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien[] findByID_N_T_PrevAndNext(long id, long idNguoiTao,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KiemDemVien[] array = new KiemDemVienImpl[3];

			array[0] = getByID_N_T_PrevAndNext(session, kiemDemVien,
					idNguoiTao, orderByComparator, true);

			array[1] = kiemDemVien;

			array[2] = getByID_N_T_PrevAndNext(session, kiemDemVien,
					idNguoiTao, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected KiemDemVien getByID_N_T_PrevAndNext(Session session,
		KiemDemVien kiemDemVien, long idNguoiTao,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

		query.append(_FINDER_COLUMN_ID_N_T_IDNGUOITAO_2);

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
			query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(idNguoiTao);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kiemDemVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KiemDemVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kiem dem viens where idNguoiTao = &#63; from the database.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByID_N_T(long idNguoiTao) throws SystemException {
		for (KiemDemVien kiemDemVien : findByID_N_T(idNguoiTao,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(kiemDemVien);
		}
	}

	/**
	 * Returns the number of kiem dem viens where idNguoiTao = &#63;.
	 *
	 * @param idNguoiTao the id nguoi tao
	 * @return the number of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByID_N_T(long idNguoiTao) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID_N_T;

		Object[] finderArgs = new Object[] { idNguoiTao };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KIEMDEMVIEN_WHERE);

			query.append(_FINDER_COLUMN_ID_N_T_IDNGUOITAO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idNguoiTao);

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

	private static final String _FINDER_COLUMN_ID_N_T_IDNGUOITAO_2 = "kiemDemVien.idNguoiTao = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID_Q_L = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByID_Q_L",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID_Q_L =
		new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByID_Q_L",
			new String[] { Long.class.getName() },
			KiemDemVienModelImpl.IDQUANLY_COLUMN_BITMASK |
			KiemDemVienModelImpl.HOVATEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID_Q_L = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByID_Q_L",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the kiem dem viens where idQuanLy = &#63;.
	 *
	 * @param idQuanLy the id quan ly
	 * @return the matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByID_Q_L(long idQuanLy)
		throws SystemException {
		return findByID_Q_L(idQuanLy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kiem dem viens where idQuanLy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param idQuanLy the id quan ly
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @return the range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByID_Q_L(long idQuanLy, int start, int end)
		throws SystemException {
		return findByID_Q_L(idQuanLy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kiem dem viens where idQuanLy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param idQuanLy the id quan ly
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByID_Q_L(long idQuanLy, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID_Q_L;
			finderArgs = new Object[] { idQuanLy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ID_Q_L;
			finderArgs = new Object[] { idQuanLy, start, end, orderByComparator };
		}

		List<KiemDemVien> list = (List<KiemDemVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KiemDemVien kiemDemVien : list) {
				if ((idQuanLy != kiemDemVien.getIdQuanLy())) {
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

			query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

			query.append(_FINDER_COLUMN_ID_Q_L_IDQUANLY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idQuanLy);

				if (!pagination) {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KiemDemVien>(list);
				}
				else {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kiem dem vien in the ordered set where idQuanLy = &#63;.
	 *
	 * @param idQuanLy the id quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByID_Q_L_First(long idQuanLy,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByID_Q_L_First(idQuanLy,
				orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("idQuanLy=");
		msg.append(idQuanLy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the first kiem dem vien in the ordered set where idQuanLy = &#63;.
	 *
	 * @param idQuanLy the id quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByID_Q_L_First(long idQuanLy,
		OrderByComparator orderByComparator) throws SystemException {
		List<KiemDemVien> list = findByID_Q_L(idQuanLy, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where idQuanLy = &#63;.
	 *
	 * @param idQuanLy the id quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByID_Q_L_Last(long idQuanLy,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByID_Q_L_Last(idQuanLy, orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("idQuanLy=");
		msg.append(idQuanLy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where idQuanLy = &#63;.
	 *
	 * @param idQuanLy the id quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByID_Q_L_Last(long idQuanLy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByID_Q_L(idQuanLy);

		if (count == 0) {
			return null;
		}

		List<KiemDemVien> list = findByID_Q_L(idQuanLy, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where idQuanLy = &#63;.
	 *
	 * @param id the primary key of the current kiem dem vien
	 * @param idQuanLy the id quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien[] findByID_Q_L_PrevAndNext(long id, long idQuanLy,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KiemDemVien[] array = new KiemDemVienImpl[3];

			array[0] = getByID_Q_L_PrevAndNext(session, kiemDemVien, idQuanLy,
					orderByComparator, true);

			array[1] = kiemDemVien;

			array[2] = getByID_Q_L_PrevAndNext(session, kiemDemVien, idQuanLy,
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

	protected KiemDemVien getByID_Q_L_PrevAndNext(Session session,
		KiemDemVien kiemDemVien, long idQuanLy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

		query.append(_FINDER_COLUMN_ID_Q_L_IDQUANLY_2);

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
			query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(idQuanLy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kiemDemVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KiemDemVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kiem dem viens where idQuanLy = &#63; from the database.
	 *
	 * @param idQuanLy the id quan ly
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByID_Q_L(long idQuanLy) throws SystemException {
		for (KiemDemVien kiemDemVien : findByID_Q_L(idQuanLy,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(kiemDemVien);
		}
	}

	/**
	 * Returns the number of kiem dem viens where idQuanLy = &#63;.
	 *
	 * @param idQuanLy the id quan ly
	 * @return the number of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByID_Q_L(long idQuanLy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID_Q_L;

		Object[] finderArgs = new Object[] { idQuanLy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KIEMDEMVIEN_WHERE);

			query.append(_FINDER_COLUMN_ID_Q_L_IDQUANLY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idQuanLy);

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

	private static final String _FINDER_COLUMN_ID_Q_L_IDQUANLY_2 = "kiemDemVien.idQuanLy = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORG_CHD = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByORG_CHD",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG_CHD =
		new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, KiemDemVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByORG_CHD",
			new String[] { Long.class.getName(), String.class.getName() },
			KiemDemVienModelImpl.CAPHOATDONG_COLUMN_BITMASK |
			KiemDemVienModelImpl.ORGCODE2_COLUMN_BITMASK |
			KiemDemVienModelImpl.HOVATEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORG_CHD = new FinderPath(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByORG_CHD",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @return the matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByORG_CHD(long capHoatDong, String orgCode2)
		throws SystemException {
		return findByORG_CHD(capHoatDong, orgCode2, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @return the range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByORG_CHD(long capHoatDong, String orgCode2,
		int start, int end) throws SystemException {
		return findByORG_CHD(capHoatDong, orgCode2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findByORG_CHD(long capHoatDong, String orgCode2,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG_CHD;
			finderArgs = new Object[] { capHoatDong, orgCode2 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORG_CHD;
			finderArgs = new Object[] {
					capHoatDong, orgCode2,
					
					start, end, orderByComparator
				};
		}

		List<KiemDemVien> list = (List<KiemDemVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KiemDemVien kiemDemVien : list) {
				if ((capHoatDong != kiemDemVien.getCapHoatDong()) ||
						!Validator.equals(orgCode2, kiemDemVien.getOrgCode2())) {
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

			query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

			query.append(_FINDER_COLUMN_ORG_CHD_CAPHOATDONG_2);

			boolean bindOrgCode2 = false;

			if (orgCode2 == null) {
				query.append(_FINDER_COLUMN_ORG_CHD_ORGCODE2_1);
			}
			else if (orgCode2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORG_CHD_ORGCODE2_3);
			}
			else {
				bindOrgCode2 = true;

				query.append(_FINDER_COLUMN_ORG_CHD_ORGCODE2_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capHoatDong);

				if (bindOrgCode2) {
					qPos.add(orgCode2);
				}

				if (!pagination) {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KiemDemVien>(list);
				}
				else {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByORG_CHD_First(long capHoatDong, String orgCode2,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByORG_CHD_First(capHoatDong, orgCode2,
				orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capHoatDong=");
		msg.append(capHoatDong);

		msg.append(", orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the first kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByORG_CHD_First(long capHoatDong, String orgCode2,
		OrderByComparator orderByComparator) throws SystemException {
		List<KiemDemVien> list = findByORG_CHD(capHoatDong, orgCode2, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByORG_CHD_Last(long capHoatDong, String orgCode2,
		OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByORG_CHD_Last(capHoatDong, orgCode2,
				orderByComparator);

		if (kiemDemVien != null) {
			return kiemDemVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capHoatDong=");
		msg.append(capHoatDong);

		msg.append(", orgCode2=");
		msg.append(orgCode2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKiemDemVienException(msg.toString());
	}

	/**
	 * Returns the last kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kiem dem vien, or <code>null</code> if a matching kiem dem vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByORG_CHD_Last(long capHoatDong, String orgCode2,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByORG_CHD(capHoatDong, orgCode2);

		if (count == 0) {
			return null;
		}

		List<KiemDemVien> list = findByORG_CHD(capHoatDong, orgCode2,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kiem dem viens before and after the current kiem dem vien in the ordered set where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param id the primary key of the current kiem dem vien
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien[] findByORG_CHD_PrevAndNext(long id, long capHoatDong,
		String orgCode2, OrderByComparator orderByComparator)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			KiemDemVien[] array = new KiemDemVienImpl[3];

			array[0] = getByORG_CHD_PrevAndNext(session, kiemDemVien,
					capHoatDong, orgCode2, orderByComparator, true);

			array[1] = kiemDemVien;

			array[2] = getByORG_CHD_PrevAndNext(session, kiemDemVien,
					capHoatDong, orgCode2, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected KiemDemVien getByORG_CHD_PrevAndNext(Session session,
		KiemDemVien kiemDemVien, long capHoatDong, String orgCode2,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KIEMDEMVIEN_WHERE);

		query.append(_FINDER_COLUMN_ORG_CHD_CAPHOATDONG_2);

		boolean bindOrgCode2 = false;

		if (orgCode2 == null) {
			query.append(_FINDER_COLUMN_ORG_CHD_ORGCODE2_1);
		}
		else if (orgCode2.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ORG_CHD_ORGCODE2_3);
		}
		else {
			bindOrgCode2 = true;

			query.append(_FINDER_COLUMN_ORG_CHD_ORGCODE2_2);
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
			query.append(KiemDemVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(capHoatDong);

		if (bindOrgCode2) {
			qPos.add(orgCode2);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kiemDemVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KiemDemVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63; from the database.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByORG_CHD(long capHoatDong, String orgCode2)
		throws SystemException {
		for (KiemDemVien kiemDemVien : findByORG_CHD(capHoatDong, orgCode2,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(kiemDemVien);
		}
	}

	/**
	 * Returns the number of kiem dem viens where capHoatDong = &#63; and orgCode2 = &#63;.
	 *
	 * @param capHoatDong the cap hoat dong
	 * @param orgCode2 the org code2
	 * @return the number of matching kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByORG_CHD(long capHoatDong, String orgCode2)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORG_CHD;

		Object[] finderArgs = new Object[] { capHoatDong, orgCode2 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_KIEMDEMVIEN_WHERE);

			query.append(_FINDER_COLUMN_ORG_CHD_CAPHOATDONG_2);

			boolean bindOrgCode2 = false;

			if (orgCode2 == null) {
				query.append(_FINDER_COLUMN_ORG_CHD_ORGCODE2_1);
			}
			else if (orgCode2.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORG_CHD_ORGCODE2_3);
			}
			else {
				bindOrgCode2 = true;

				query.append(_FINDER_COLUMN_ORG_CHD_ORGCODE2_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capHoatDong);

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

	private static final String _FINDER_COLUMN_ORG_CHD_CAPHOATDONG_2 = "kiemDemVien.capHoatDong = ? AND ";
	private static final String _FINDER_COLUMN_ORG_CHD_ORGCODE2_1 = "kiemDemVien.orgCode2 IS NULL";
	private static final String _FINDER_COLUMN_ORG_CHD_ORGCODE2_2 = "kiemDemVien.orgCode2 = ?";
	private static final String _FINDER_COLUMN_ORG_CHD_ORGCODE2_3 = "(kiemDemVien.orgCode2 IS NULL OR kiemDemVien.orgCode2 = '')";

	public KiemDemVienPersistenceImpl() {
		setModelClass(KiemDemVien.class);
	}

	/**
	 * Caches the kiem dem vien in the entity cache if it is enabled.
	 *
	 * @param kiemDemVien the kiem dem vien
	 */
	@Override
	public void cacheResult(KiemDemVien kiemDemVien) {
		EntityCacheUtil.putResult(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienImpl.class, kiemDemVien.getPrimaryKey(), kiemDemVien);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
			new Object[] { kiemDemVien.getId() }, kiemDemVien);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TK,
			new Object[] { kiemDemVien.getTaiKhoan() }, kiemDemVien);

		kiemDemVien.resetOriginalValues();
	}

	/**
	 * Caches the kiem dem viens in the entity cache if it is enabled.
	 *
	 * @param kiemDemViens the kiem dem viens
	 */
	@Override
	public void cacheResult(List<KiemDemVien> kiemDemViens) {
		for (KiemDemVien kiemDemVien : kiemDemViens) {
			if (EntityCacheUtil.getResult(
						KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
						KiemDemVienImpl.class, kiemDemVien.getPrimaryKey()) == null) {
				cacheResult(kiemDemVien);
			}
			else {
				kiemDemVien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all kiem dem viens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KiemDemVienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KiemDemVienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the kiem dem vien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KiemDemVien kiemDemVien) {
		EntityCacheUtil.removeResult(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienImpl.class, kiemDemVien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(kiemDemVien);
	}

	@Override
	public void clearCache(List<KiemDemVien> kiemDemViens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KiemDemVien kiemDemVien : kiemDemViens) {
			EntityCacheUtil.removeResult(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
				KiemDemVienImpl.class, kiemDemVien.getPrimaryKey());

			clearUniqueFindersCache(kiemDemVien);
		}
	}

	protected void cacheUniqueFindersCache(KiemDemVien kiemDemVien) {
		if (kiemDemVien.isNew()) {
			Object[] args = new Object[] { kiemDemVien.getId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID, args, kiemDemVien);

			args = new Object[] { kiemDemVien.getTaiKhoan() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TK, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TK, args, kiemDemVien);
		}
		else {
			KiemDemVienModelImpl kiemDemVienModelImpl = (KiemDemVienModelImpl)kiemDemVien;

			if ((kiemDemVienModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { kiemDemVien.getId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID, args,
					kiemDemVien);
			}

			if ((kiemDemVienModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TK.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { kiemDemVien.getTaiKhoan() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TK, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TK, args,
					kiemDemVien);
			}
		}
	}

	protected void clearUniqueFindersCache(KiemDemVien kiemDemVien) {
		KiemDemVienModelImpl kiemDemVienModelImpl = (KiemDemVienModelImpl)kiemDemVien;

		Object[] args = new Object[] { kiemDemVien.getId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, args);

		if ((kiemDemVienModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ID.getColumnBitmask()) != 0) {
			args = new Object[] { kiemDemVienModelImpl.getOriginalId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID, args);
		}

		args = new Object[] { kiemDemVien.getTaiKhoan() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TK, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TK, args);

		if ((kiemDemVienModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TK.getColumnBitmask()) != 0) {
			args = new Object[] { kiemDemVienModelImpl.getOriginalTaiKhoan() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TK, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TK, args);
		}
	}

	/**
	 * Creates a new kiem dem vien with the primary key. Does not add the kiem dem vien to the database.
	 *
	 * @param id the primary key for the new kiem dem vien
	 * @return the new kiem dem vien
	 */
	@Override
	public KiemDemVien create(long id) {
		KiemDemVien kiemDemVien = new KiemDemVienImpl();

		kiemDemVien.setNew(true);
		kiemDemVien.setPrimaryKey(id);

		return kiemDemVien;
	}

	/**
	 * Removes the kiem dem vien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the kiem dem vien
	 * @return the kiem dem vien that was removed
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien remove(long id)
		throws NoSuchKiemDemVienException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the kiem dem vien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the kiem dem vien
	 * @return the kiem dem vien that was removed
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien remove(Serializable primaryKey)
		throws NoSuchKiemDemVienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KiemDemVien kiemDemVien = (KiemDemVien)session.get(KiemDemVienImpl.class,
					primaryKey);

			if (kiemDemVien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKiemDemVienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(kiemDemVien);
		}
		catch (NoSuchKiemDemVienException nsee) {
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
	protected KiemDemVien removeImpl(KiemDemVien kiemDemVien)
		throws SystemException {
		kiemDemVien = toUnwrappedModel(kiemDemVien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(kiemDemVien)) {
				kiemDemVien = (KiemDemVien)session.get(KiemDemVienImpl.class,
						kiemDemVien.getPrimaryKeyObj());
			}

			if (kiemDemVien != null) {
				session.delete(kiemDemVien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (kiemDemVien != null) {
			clearCache(kiemDemVien);
		}

		return kiemDemVien;
	}

	@Override
	public KiemDemVien updateImpl(
		vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien kiemDemVien)
		throws SystemException {
		kiemDemVien = toUnwrappedModel(kiemDemVien);

		boolean isNew = kiemDemVien.isNew();

		KiemDemVienModelImpl kiemDemVienModelImpl = (KiemDemVienModelImpl)kiemDemVien;

		Session session = null;

		try {
			session = openSession();

			if (kiemDemVien.isNew()) {
				session.save(kiemDemVien);

				kiemDemVien.setNew(false);
			}
			else {
				session.merge(kiemDemVien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !KiemDemVienModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((kiemDemVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kiemDemVienModelImpl.getOriginalHoVaTen()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HT,
					args);

				args = new Object[] { kiemDemVienModelImpl.getHoVaTen() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HT,
					args);
			}

			if ((kiemDemVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kiemDemVienModelImpl.getOriginalOrgCode1()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_C_1, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1,
					args);

				args = new Object[] { kiemDemVienModelImpl.getOrgCode1() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_C_1, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1,
					args);
			}

			if ((kiemDemVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1_O_C_2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kiemDemVienModelImpl.getOriginalOrgCode1(),
						kiemDemVienModelImpl.getOriginalOrgCode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_C_1_O_C_2,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1_O_C_2,
					args);

				args = new Object[] {
						kiemDemVienModelImpl.getOrgCode1(),
						kiemDemVienModelImpl.getOrgCode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_C_1_O_C_2,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_1_O_C_2,
					args);
			}

			if ((kiemDemVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_H_D_O_C_2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kiemDemVienModelImpl.getOriginalCapHoatDong(),
						kiemDemVienModelImpl.getOriginalOrgCode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_H_D_O_C_2,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_H_D_O_C_2,
					args);

				args = new Object[] {
						kiemDemVienModelImpl.getCapHoatDong(),
						kiemDemVienModelImpl.getOrgCode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_H_D_O_C_2,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_H_D_O_C_2,
					args);
			}

			if ((kiemDemVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kiemDemVienModelImpl.getOriginalOrgCode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_C_2, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_2,
					args);

				args = new Object[] { kiemDemVienModelImpl.getOrgCode2() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_C_2, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_C_2,
					args);
			}

			if ((kiemDemVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kiemDemVienModelImpl.getOriginalTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_T,
					args);

				args = new Object[] { kiemDemVienModelImpl.getTrangThai() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_T,
					args);
			}

			if ((kiemDemVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID_N_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kiemDemVienModelImpl.getOriginalIdNguoiTao()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID_N_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID_N_T,
					args);

				args = new Object[] { kiemDemVienModelImpl.getIdNguoiTao() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID_N_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID_N_T,
					args);
			}

			if ((kiemDemVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID_Q_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kiemDemVienModelImpl.getOriginalIdQuanLy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID_Q_L, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID_Q_L,
					args);

				args = new Object[] { kiemDemVienModelImpl.getIdQuanLy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID_Q_L, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID_Q_L,
					args);
			}

			if ((kiemDemVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG_CHD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kiemDemVienModelImpl.getOriginalCapHoatDong(),
						kiemDemVienModelImpl.getOriginalOrgCode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORG_CHD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG_CHD,
					args);

				args = new Object[] {
						kiemDemVienModelImpl.getCapHoatDong(),
						kiemDemVienModelImpl.getOrgCode2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORG_CHD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG_CHD,
					args);
			}
		}

		EntityCacheUtil.putResult(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
			KiemDemVienImpl.class, kiemDemVien.getPrimaryKey(), kiemDemVien);

		clearUniqueFindersCache(kiemDemVien);
		cacheUniqueFindersCache(kiemDemVien);

		return kiemDemVien;
	}

	protected KiemDemVien toUnwrappedModel(KiemDemVien kiemDemVien) {
		if (kiemDemVien instanceof KiemDemVienImpl) {
			return kiemDemVien;
		}

		KiemDemVienImpl kiemDemVienImpl = new KiemDemVienImpl();

		kiemDemVienImpl.setNew(kiemDemVien.isNew());
		kiemDemVienImpl.setPrimaryKey(kiemDemVien.getPrimaryKey());

		kiemDemVienImpl.setId(kiemDemVien.getId());
		kiemDemVienImpl.setHoVaTen(kiemDemVien.getHoVaTen());
		kiemDemVienImpl.setTaiKhoan(kiemDemVien.getTaiKhoan());
		kiemDemVienImpl.setMatKhau(kiemDemVien.getMatKhau());
		kiemDemVienImpl.setCapHoatDong(kiemDemVien.getCapHoatDong());
		kiemDemVienImpl.setOrgCode1(kiemDemVien.getOrgCode1());
		kiemDemVienImpl.setOrgCode2(kiemDemVien.getOrgCode2());
		kiemDemVienImpl.setDiaChi(kiemDemVien.getDiaChi());
		kiemDemVienImpl.setChungMinhThu(kiemDemVien.getChungMinhThu());
		kiemDemVienImpl.setDienThoai(kiemDemVien.getDienThoai());
		kiemDemVienImpl.setImei(kiemDemVien.getImei());
		kiemDemVienImpl.setTrangThai(kiemDemVien.getTrangThai());
		kiemDemVienImpl.setNgayTao(kiemDemVien.getNgayTao());
		kiemDemVienImpl.setIdNguoiTao(kiemDemVien.getIdNguoiTao());
		kiemDemVienImpl.setIdQuanLy(kiemDemVien.getIdQuanLy());
		kiemDemVienImpl.setNameQuanLy(kiemDemVien.getNameQuanLy());

		return kiemDemVienImpl;
	}

	/**
	 * Returns the kiem dem vien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the kiem dem vien
	 * @return the kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKiemDemVienException, SystemException {
		KiemDemVien kiemDemVien = fetchByPrimaryKey(primaryKey);

		if (kiemDemVien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKiemDemVienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return kiemDemVien;
	}

	/**
	 * Returns the kiem dem vien with the primary key or throws a {@link vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException} if it could not be found.
	 *
	 * @param id the primary key of the kiem dem vien
	 * @return the kiem dem vien
	 * @throws vn.dtt.cmon.kiemdemvien.dao.NoSuchKiemDemVienException if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien findByPrimaryKey(long id)
		throws NoSuchKiemDemVienException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the kiem dem vien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the kiem dem vien
	 * @return the kiem dem vien, or <code>null</code> if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KiemDemVien kiemDemVien = (KiemDemVien)EntityCacheUtil.getResult(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
				KiemDemVienImpl.class, primaryKey);

		if (kiemDemVien == _nullKiemDemVien) {
			return null;
		}

		if (kiemDemVien == null) {
			Session session = null;

			try {
				session = openSession();

				kiemDemVien = (KiemDemVien)session.get(KiemDemVienImpl.class,
						primaryKey);

				if (kiemDemVien != null) {
					cacheResult(kiemDemVien);
				}
				else {
					EntityCacheUtil.putResult(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
						KiemDemVienImpl.class, primaryKey, _nullKiemDemVien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KiemDemVienModelImpl.ENTITY_CACHE_ENABLED,
					KiemDemVienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return kiemDemVien;
	}

	/**
	 * Returns the kiem dem vien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the kiem dem vien
	 * @return the kiem dem vien, or <code>null</code> if a kiem dem vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KiemDemVien fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the kiem dem viens.
	 *
	 * @return the kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kiem dem viens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @return the range of kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the kiem dem viens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.cmon.kiemdemvien.dao.model.impl.KiemDemVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of kiem dem viens
	 * @param end the upper bound of the range of kiem dem viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of kiem dem viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KiemDemVien> findAll(int start, int end,
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

		List<KiemDemVien> list = (List<KiemDemVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KIEMDEMVIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KIEMDEMVIEN;

				if (pagination) {
					sql = sql.concat(KiemDemVienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KiemDemVien>(list);
				}
				else {
					list = (List<KiemDemVien>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the kiem dem viens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KiemDemVien kiemDemVien : findAll()) {
			remove(kiemDemVien);
		}
	}

	/**
	 * Returns the number of kiem dem viens.
	 *
	 * @return the number of kiem dem viens
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

				Query q = session.createQuery(_SQL_COUNT_KIEMDEMVIEN);

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
	 * Initializes the kiem dem vien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KiemDemVien>> listenersList = new ArrayList<ModelListener<KiemDemVien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KiemDemVien>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(KiemDemVienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KIEMDEMVIEN = "SELECT kiemDemVien FROM KiemDemVien kiemDemVien";
	private static final String _SQL_SELECT_KIEMDEMVIEN_WHERE = "SELECT kiemDemVien FROM KiemDemVien kiemDemVien WHERE ";
	private static final String _SQL_COUNT_KIEMDEMVIEN = "SELECT COUNT(kiemDemVien) FROM KiemDemVien kiemDemVien";
	private static final String _SQL_COUNT_KIEMDEMVIEN_WHERE = "SELECT COUNT(kiemDemVien) FROM KiemDemVien kiemDemVien WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "kiemDemVien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KiemDemVien exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No KiemDemVien exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KiemDemVienPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "hoVaTen", "taiKhoan", "matKhau", "capHoatDong",
				"orgCode1", "orgCode2", "diaChi", "chungMinhThu", "dienThoai",
				"imei", "trangThai", "ngayTao", "idNguoiTao", "idQuanLy",
				"nameQuanLy"
			});
	private static KiemDemVien _nullKiemDemVien = new KiemDemVienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KiemDemVien> toCacheModel() {
				return _nullKiemDemVienCacheModel;
			}
		};

	private static CacheModel<KiemDemVien> _nullKiemDemVienCacheModel = new CacheModel<KiemDemVien>() {
			@Override
			public KiemDemVien toEntityModel() {
				return _nullKiemDemVien;
			}
		};
}